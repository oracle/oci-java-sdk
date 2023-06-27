/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.okeworkloadidentity.internal;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.bmc.auth.ServiceAccountTokenSupplier;
import com.oracle.bmc.auth.SessionKeySupplier;
import com.oracle.bmc.auth.internal.AbstractFederationClient;
import com.oracle.bmc.auth.internal.AuthUtils;
import com.oracle.bmc.auth.internal.SecurityTokenAdapter;
import com.oracle.bmc.auth.internal.X509FederationClient;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.http.internal.RestClientFactory;
import com.oracle.bmc.http.internal.WrappedInvocationBuilder;
import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyPair;
import java.security.interfaces.RSAPublicKey;
import java.time.Duration;

import static com.oracle.bmc.http.internal.RestClient.generateRequestId;

/**
 * This class gets a security token from the auth service by signing the request with the provided private key.
 */
public class OkeWorkloadIdentityResourcePrincipalsFederationClient
        extends AbstractFederationClient {
    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(
                    OkeWorkloadIdentityResourcePrincipalsFederationClient.class);
    private final String AUTHORIZATION_HEADER = "Authorization";
    private final String OPC_REQUEST_ID_HEADER = "opc-request-id";
    private static final String JWT_FORMAT = "Bearer %s";
    private final String KUBERNETES_SERVICE_HOST = "KUBERNETES_SERVICE_HOST";
    private final int PROXYMUX_SERVER_PORT = 12250;
    private final ServiceAccountTokenSupplier serviceAccountTokenSupplier;

    /**
     * The authentication provider to sign the internal requests.
     */
    private final OkeTenancyOnlyAuthenticationDetailsProvider provider;

    /**
     * Constructor of OkeWorkloadIdentityResourcePrincipalsFederationClient.
     * @param federationEndpoint
     * @param sessionKeySupplier the session key supplier.
     * @param okeTenancyOnlyAuthenticationDetailsProvider the key pair authentication details provider.
     * @param clientConfigurator the reset client configurator.
     */
    public OkeWorkloadIdentityResourcePrincipalsFederationClient(
            String federationEndpoint,
            SessionKeySupplier sessionKeySupplier,
            ServiceAccountTokenSupplier serviceAccountTokenSupplier,
            OkeTenancyOnlyAuthenticationDetailsProvider okeTenancyOnlyAuthenticationDetailsProvider,
            ClientConfigurator clientConfigurator,
            CircuitBreakerConfiguration circuitBreakerConfiguration) {

        // we don't use a resourcePrincipalTokenEndpoint, therefore blank
        super(
                "",
                federationEndpoint,
                sessionKeySupplier,
                okeTenancyOnlyAuthenticationDetailsProvider,
                clientConfigurator,
                circuitBreakerConfiguration);
        this.serviceAccountTokenSupplier = serviceAccountTokenSupplier;
        this.provider = okeTenancyOnlyAuthenticationDetailsProvider;
    }

    /**
     * Gets a security token from the federation endpoint. Refresh the security token when the half
     * of the token duration is left. If the request failed, use cached security token.
     *
     * @return A security token that can be used to authenticate requests.
     */
    @Override
    public String getSecurityToken() {
        SecurityTokenAdapter securityTokenAdapter = getSecurityTokenAdapter();
        try {
            Duration time = Duration.ZERO;
            if (securityTokenAdapter.isValid()) {
                if (securityTokenAdapter.getTokenValidDuration() != null) {
                    time = securityTokenAdapter.getTokenValidDuration().dividedBy(2);
                }
            }
            return refreshAndGetSecurityTokenIfExpiringWithin(time);
        } catch (Exception e) {
            LOG.info("Refresh RPST token failed, use cached RPST token.", e);
            return securityTokenAdapter.getSecurityToken();
        }
    }

    /**
     * Make a call to get rpst token.
     * @param ib the invocation builder.
     * @param requestUri the uri for the getRpst request
     * @param request the getRpst request.
     * @return the response for rpst token
     */
    protected Response makeCallToOke(
            Invocation.Builder ib,
            URI requestUri,
            GetOkeResourcePrincipalSessionTokenRequest request) {
        final WrappedInvocationBuilder wrappedIb = new WrappedInvocationBuilder(ib, requestUri);
        return makeCallInner(wrappedIb, request);
    }

    /**
     * Gets a security token from the proxymux server
     * @return the security token, which is basically a JWT token string
     */
    @Override
    protected SecurityTokenAdapter getSecurityTokenFromServer() {
        LOG.info("Getting security token from the proxymux server");
        //Get service account token.
        String token = serviceAccountTokenSupplier.getServiceAccountToken();

        //Generate private/public key pair.
        KeyPair keyPair = sessionKeySupplier.getKeyPair();
        if (keyPair == null) {
            throw new IllegalStateException("Keypair for session was not provided");
        }
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
        if (publicKey == null) {
            throw new IllegalArgumentException("Public key is not present");
        }

        try {
            // Read proxymux ip address from environment variable.
            String host = System.getenv().get(KUBERNETES_SERVICE_HOST);
            if (host == null) {
                throw new IllegalArgumentException(
                        "Invalid environment variable KUBERNETES_SERVICE_HOST, please contact OKE Foundation team for help.");
            }

            // Set proxymux resourcePrincipalSessionTokens endpoint for requesting rpst token
            restClient.setEndpoint("https://" + host + ":" + PROXYMUX_SERVER_PORT);
            GetOkeResourcePrincipalSessionTokenRequest getOkeResourcePrincipalSessionTokenRequest =
                    new GetOkeResourcePrincipalSessionTokenRequest(
                            AuthUtils.base64EncodeNoChunking(publicKey));
            WebTarget target = restClient.getBaseTarget().path("resourcePrincipalSessionTokens");
            Invocation.Builder ib = target.request();

            //generating a full 3 part opc-request-id for rpst call
            String opcRequestId = generateRequestId();
            //Signing the request with service account token.
            ib.header(AUTHORIZATION_HEADER, String.format(JWT_FORMAT, token));
            ib.header(OPC_REQUEST_ID_HEADER, opcRequestId);
            URI requestUri = target.getUri();

            // Make a call and get back the security token
            Response response =
                    makeCallToOke(ib, requestUri, getOkeResourcePrincipalSessionTokenRequest);
            ResponseHelper.throwIfNotSuccessful(response);

            // Decode the response and get rpst token.
            String payload = response.readEntity(String.class);
            String jsonString = new String(Base64.decodeBase64(payload), "UTF-8");
            ObjectMapper mapper = RestClientFactory.getObjectMapper();
            GetOkeResourcePrincipalSessionTokenResponse
                    getOkeResourcePrincipalSessionTokenResponse =
                            mapper.readValue(
                                    jsonString, GetOkeResourcePrincipalSessionTokenResponse.class);

            // Remove duplicated "ST$" for the token.
            String jwtToken = getOkeResourcePrincipalSessionTokenResponse.getToken().substring(3);

            // Create security token based on the response.
            X509FederationClient.SecurityToken securityToken =
                    new X509FederationClient.SecurityToken(jwtToken);
            return new SecurityTokenAdapter(securityToken.getToken(), sessionKeySupplier);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(
                    "Rpst token can not be decoded correctly. Please contact OKE Foundation team for help.",
                    e);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException(
                    "Rpst token can not be parsed correctly. Please contact OKE Foundation team for help.",
                    e);
        }
    }
}
