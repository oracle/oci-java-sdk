/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.okeworkloadidentity.internal;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyPair;
import java.security.interfaces.RSAPublicKey;
import java.time.Duration;
import java.util.Base64;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.oracle.bmc.auth.ServiceAccountTokenSupplier;
import com.oracle.bmc.auth.SessionKeySupplier;
import com.oracle.bmc.auth.internal.AbstractFederationClient;
import com.oracle.bmc.auth.internal.AuthUtils;
import com.oracle.bmc.auth.internal.SecurityTokenAdapter;
import com.oracle.bmc.auth.internal.X509FederationClient;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.Priorities;
import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.HttpClientBuilder;
import com.oracle.bmc.http.client.HttpProvider;
import com.oracle.bmc.http.client.Method;
import com.oracle.bmc.http.client.Serializer;
import com.oracle.bmc.http.internal.AuthnClientFilter;
import com.oracle.bmc.http.internal.ClientCall;
import com.oracle.bmc.http.internal.ClientIdFilter;
import com.oracle.bmc.http.internal.LogHeadersFilter;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.requests.BmcRequest;
import com.oracle.bmc.util.internal.StringUtils;
import org.slf4j.Logger;

/**
 * This class gets a security token from the auth service by signing the request with the provided
 * private key.
 */
public class OkeWorkloadIdentityResourcePrincipalsFederationClient
        extends AbstractFederationClient {
    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(
                    OkeWorkloadIdentityResourcePrincipalsFederationClient.class);
    private static final String KUBERNETES_SERVICE_ACCOUNT_TOKEN_PATH =
            "/var/run/secrets/kubernetes.io/serviceaccount/token";
    private static final String AUTHORIZATION_HEADER = "Authorization";
    private final String OPC_REQUEST_ID_HEADER = "opc-request-id";
    private static final String JWT_FORMAT = "Bearer %s";
    private static final String KUBERNETES_SERVICE_HOST = "KUBERNETES_SERVICE_HOST";
    private static final int PROXYMUX_SERVER_PORT = 12250;
    private final ServiceAccountTokenSupplier serviceAccountTokenSupplier;

    /** The authentication provider to sign the internal requests. */
    private final OkeTenancyOnlyAuthenticationDetailsProvider provider;

    /**
     * Constructor of OkeWorkloadIdentityResourcePrincipalsFederationClient.
     *
     * @param sessionKeySupplier the session key supplier.
     * @param okeTenancyOnlyAuthenticationDetailsProvider the key pair authentication details
     *     provider.
     * @param clientConfigurator the reset client configurator.
     */
    public OkeWorkloadIdentityResourcePrincipalsFederationClient(
            SessionKeySupplier sessionKeySupplier,
            ServiceAccountTokenSupplier serviceAccountTokenSupplier,
            OkeTenancyOnlyAuthenticationDetailsProvider okeTenancyOnlyAuthenticationDetailsProvider,
            ClientConfigurator clientConfigurator,
            CircuitBreakerConfiguration circuitBreakerConfiguration,
            List<ClientConfigurator> additionalClientConfigurators) {

        // we don't use a federationEndpoint, therefore blank
        super(
                getRptEndpoint(),
                "",
                sessionKeySupplier,
                okeTenancyOnlyAuthenticationDetailsProvider,
                clientConfigurator,
                circuitBreakerConfiguration,
                additionalClientConfigurators);

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

    private static String getRptEndpoint() {
        // Read proxymux ip address from environment variable.
        String host = System.getenv().get(KUBERNETES_SERVICE_HOST);
        if (host == null) {
            throw new IllegalArgumentException(
                    "Invalid environment variable KUBERNETES_SERVICE_HOST, please contact OKE Foundation team for help.");
        }

        // Set proxymux resourcePrincipalSessionTokens endpoint for requesting rpst token
        return "https://" + host + ":" + PROXYMUX_SERVER_PORT;
    }

    @Override
    protected HttpClient makeClient(String endpoint, RequestSigner requestSigner) {
        if (StringUtils.isBlank(endpoint)) {
            // this is the case for the federation client, which isn't used in OKE workload identity
            return null;
        }
        HttpClientBuilder rptBuilder =
                HttpProvider.getDefault()
                        .newBuilder()
                        .baseUri(URI.create(endpoint))
                        .registerRequestInterceptor(
                                Priorities.AUTHENTICATION,
                                new AuthnClientFilter(requestSigner, Collections.emptyMap()))
                        .registerRequestInterceptor(
                                Priorities.HEADER_DECORATOR, new ClientIdFilter())
                        .registerRequestInterceptor(Priorities.USER, new LogHeadersFilter());
        if (clientConfigurator != null) {
            clientConfigurator.customizeClient(rptBuilder);
        }
        for (ClientConfigurator additionalConfigurator : additionalClientConfigurator) {
            additionalConfigurator.customizeClient(rptBuilder);
        }
        return rptBuilder.build();
    }

    /**
     * Gets a security token from the proxymux server
     *
     * @return the security token, which is basically a JWT token string
     */
    @Override
    protected SecurityTokenAdapter getSecurityTokenFromServer() {
        LOG.info("Getting security token from the proxymux server");
        // Get service account token.
        String token = serviceAccountTokenSupplier.getServiceAccountToken();

        // Generate private/public key pair.
        KeyPair keyPair = sessionKeySupplier.getKeyPair();
        if (keyPair == null) {
            throw new IllegalStateException("Key pair for session was not provided");
        }
        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
        if (publicKey == null) {
            throw new IllegalArgumentException("Public key is not present");
        }
        // generating a full 3 part opc-request-id for rpst call
        String opcRequestId = ClientCall.generateRequestId();
        LOG.debug("Request id for resourcePrincipalSessionTokens request: '{}'", opcRequestId);

        GetOkeResourcePrincipalSessionTokenDetails getOkeResourcePrincipalSessionTokenDetails =
                GetOkeResourcePrincipalSessionTokenDetails.builder()
                        .podKey(AuthUtils.base64EncodeNoChunking(publicKey))
                        .build();

        GetOkeResourcePrincipalSessionTokenRequest getOkeResourcePrincipalSessionTokenRequest =
                GetOkeResourcePrincipalSessionTokenRequest.builder()
                        .getOkeResourcePrincipalSessionTokenDetails(
                                getOkeResourcePrincipalSessionTokenDetails)
                        .build();

        OkeResourcePrincipalSessionToken okeResourcePrincipalSessionToken =
                ClientCall.builder(
                                resourcePrincipalTokenClient,
                                getOkeResourcePrincipalSessionTokenRequest,
                                GetOkeResourcePrincipalSessionTokenResponse.Builder::new)
                        .logger(LOG, "OkeWorkloadIdentityResourcePrincipalsTokenClient")
                        .serviceDetails(
                                "OkeWorkloadIdentity",
                                "resourcePrincipalSessionTokens",
                                "Unknown API reference link")
                        .method(Method.POST)
                        .requestBuilder(GetOkeResourcePrincipalSessionTokenRequest::builder)
                        .appendPathPart("resourcePrincipalSessionTokens")
                        .accept("application/json")
                        .appendHeader(AUTHORIZATION_HEADER, String.format(JWT_FORMAT, token))
                        .appendHeader(OPC_REQUEST_ID_HEADER, opcRequestId)
                        .hasBody()
                        .handleBody(
                                OkeResourcePrincipalSessionToken.class,
                                GetOkeResourcePrincipalSessionTokenResponse.Builder::body)
                        .clientConfigurator(clientConfigurator)
                        .circuitBreaker(circuitBreaker)
                        .callSync()
                        .body;

        try {
            // Decode the response and get rpst token.
            String payload = okeResourcePrincipalSessionToken.getToken();
            String jsonString = new String(Base64.getDecoder().decode(payload), "UTF-8");

            Serializer serializer = Serializer.getDefault();
            OkeResourcePrincipalSessionToken decoded =
                    serializer.readValue(jsonString, OkeResourcePrincipalSessionToken.class);

            // Remove duplicated "ST$" for the token.
            String jwtToken = decoded.getToken().substring(3);

            return new SecurityTokenAdapter(jwtToken, sessionKeySupplier);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(
                    "RPST cannot be decoded correctly. Please contact OKE Foundation team for help.",
                    e);
        } catch (IOException e) {
            throw new IllegalArgumentException(
                    "RPST cannot be parsed correctly. Please contact OKE Foundation team for help.",
                    e);
        }
    }
}
