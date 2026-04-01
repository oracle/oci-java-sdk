/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
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
import com.oracle.bmc.auth.okeworkloadidentity.internal.contract.GetOkeResourcePrincipalSessionTokenAndKeysRequest;
import com.oracle.bmc.auth.okeworkloadidentity.internal.contract.GetOkeResourcePrincipalSessionTokenAndKeysResponse;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.http.internal.RestClientFactory;
import com.oracle.bmc.http.internal.WrappedInvocationBuilder;
import com.oracle.bmc.http.signing.pki.Pem;
import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.interfaces.RSAPublicKey;
import java.time.Duration;
import com.oracle.bmc.util.internal.StringUtils;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

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
                    // Calculate the half of the token's total valid duration
                    Duration halfDuration =
                            securityTokenAdapter.getTokenValidDuration().dividedBy(2);
                    // Generate Jitter Factor: a random value between 0.95 and 1.05 (i.e., ±5%)
                    double jitterFactor = 1.0 + (Math.random() * 0.1 - 0.05);
                    // Apply the jitter factor
                    time = halfDuration.multipliedBy((long) (jitterFactor * 1000)).dividedBy(1000);
                }
            }
            String token = refreshAndGetSecurityTokenIfExpiringWithin(time);
            logTokenInfo(token);
            return token;
        } catch (Exception e) {
            LOG.info("Refresh RPST token failed, use cached RPST token.", e);
            return securityTokenAdapter.getSecurityToken();
        }
    }

    private void logTokenInfo(String token) {
        try {
            if (StringUtils.isBlank(token) || token.split("\\.").length < 3) {
                LOG.warn("Invalid token: null, empty, or incorrect format");
                return;
            }
            String[] parts = token.split("\\.");
            String payloadJson =
                    new String(
                            java.util.Base64.getUrlDecoder().decode(parts[1]),
                            StandardCharsets.UTF_8);
            Map<String, Object> payload = new ObjectMapper().readValue(payloadJson, Map.class);
            Map<String, Object> logData = new HashMap<>();
            logData.put("sub", payload.getOrDefault("sub", ""));
            logData.put("res_id", payload.getOrDefault("res_id", ""));
            logData.put("res_type", payload.getOrDefault("res_type", ""));
            logData.put("ttype", payload.getOrDefault("ttype", ""));
            logData.put("var_service_account", payload.getOrDefault("var_service_account", ""));
            logData.put("var_namespace", payload.getOrDefault("var_namespace", ""));
            logData.put("iat", payload.getOrDefault("iat", ""));
            logData.put("exp", payload.getOrDefault("exp", ""));
            LOG.info("RPST token details: {}", logData);
        } catch (Exception e) {
            LOG.warn("Failed to parse and log token", e);
        }
    }

    /**
     * Make a call to get rpst token.
     * @param ib the invocation builder.
     * @param requestUri the uri for the getRpst request
     * @param request the getRpst request.
     * @return the response for rpst token
     */
    protected <T> Response makeCallToOke(Invocation.Builder ib, URI requestUri, T request) {
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
        String serviceAccountToken = serviceAccountTokenSupplier.getServiceAccountToken();

        //generating a full 3 part opc-request-id for rpst call
        String opcRequestId = generateRequestId();
        LOG.debug("Request id for resourcePrincipalSessionTokens request: '{}'", opcRequestId);

        /* If the SettableSessionKeySupplier is configured as sessionKeySupplier then prefer new ServiceAccount
         * level token caching which involves calling new caching enabled endpoint of proxymux else
         * fallback to old endpoint
         */

        if (sessionKeySupplier instanceof SettableSessionKeySupplier) {
            LOG.info(
                    "Since the sessionKeySupplier implements SettableSessionKeySupplier, the client is configured for ServiceAccount level caching (i.e. isTokenCachingEnabled == true)");
            return getSecurityTokenFromServerV2(serviceAccountToken, opcRequestId);
        } else {
            LOG.info(
                    "Since the sessionKeySupplier does not implement SettableSessionKeySupplier, the client is not configured for ServiceAccount level caching which is default behaviour");
            return getSecurityTokenFromServerV1(serviceAccountToken, opcRequestId);
        }
    }

    /**
     * Gets a security token from the legacy OKE proxymux endpoint using the provided service account token and session key pair.
     *
     * @param token      The service account JWT used for authentication in the Authorization header.
     * @param opcRequestId Unique request identifier for tracing/logging.
     * @return A new SecurityTokenAdapter with the refreshed resource principal session token.
     * @throws IllegalStateException   If the session key pair is missing.
     * @throws IllegalArgumentException If the service account public key is missing or the returned token cannot be parsed.
     */
    private SecurityTokenAdapter getSecurityTokenFromServerV1(String token, String opcRequestId) {

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
            setProxymuxEndPoint();
            GetOkeResourcePrincipalSessionTokenRequest getOkeResourcePrincipalSessionTokenRequest =
                    new GetOkeResourcePrincipalSessionTokenRequest(
                            AuthUtils.base64EncodeNoChunking(publicKey));
            WebTarget target = restClient.getBaseTarget().path("resourcePrincipalSessionTokens");
            Invocation.Builder ib = target.request();

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
            String jsonString = new String(Base64.decodeBase64(payload), StandardCharsets.UTF_8);
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
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException(
                    "Workload Identity token can not be parsed correctly. Please contact OKE team for help.",
                    e);
        }
    }

    /**
     * Gets a security token and ephemeral key pair from the caching-enabled OKE proxymux endpoint using the provided service account token.
     *
     * @param token The service account JWT used for authentication in the Authorization header.
     * @param opcRequestId Unique request identifier for tracing/logging.
     * @return A SecurityTokenAdapter containing the fresh resource principal session token,
     *         with the session key supplier updated to use the new key pair if applicable.
     * @throws IllegalArgumentException If the returned token or key data cannot be parsed.
     */
    private SecurityTokenAdapter getSecurityTokenFromServerV2(String token, String opcRequestId) {
        try {
            setProxymuxEndPoint();

            GetOkeResourcePrincipalSessionTokenAndKeysRequest getTokenRequest =
                    new GetOkeResourcePrincipalSessionTokenAndKeysRequest();

            WebTarget target =
                    restClient.getBaseTarget().path("resourcePrincipalSessionTokensWithCaching");
            Invocation.Builder ib = target.request();

            //Signing the request with service account token.
            ib.header(AUTHORIZATION_HEADER, String.format(JWT_FORMAT, token));
            ib.header(OPC_REQUEST_ID_HEADER, opcRequestId);
            URI requestUri = target.getUri();

            // Make a call and get back the security token
            Response response = makeCallToOke(ib, requestUri, getTokenRequest);
            ResponseHelper.throwIfNotSuccessful(response);

            // Decode the response and get rpst token.
            String payload = response.readEntity(String.class);
            String jsonString = new String(Base64.decodeBase64(payload), StandardCharsets.UTF_8);
            ObjectMapper mapper = RestClientFactory.getObjectMapper();
            GetOkeResourcePrincipalSessionTokenAndKeysResponse
                    getOkeResourcePrincipalSessionTokenAndKeysResponse =
                            mapper.readValue(
                                    jsonString,
                                    GetOkeResourcePrincipalSessionTokenAndKeysResponse.class);

            // Remove duplicated "ST$" for the token.
            String jwtToken =
                    getOkeResourcePrincipalSessionTokenAndKeysResponse.getToken().substring(3);
            // Create security token based on the response.
            X509FederationClient.SecurityToken securityToken =
                    new X509FederationClient.SecurityToken(jwtToken);

            String publicKeyPem =
                    new String(
                            Base64.decodeBase64(
                                    getOkeResourcePrincipalSessionTokenAndKeysResponse
                                            .getPublicKey()),
                            StandardCharsets.UTF_8);
            // Decode a public key from the PEM encoded public key
            final PublicKey publicKey = Pem.decoder().decodePublicKey(publicKeyPem);

            // Decode a private key from the PEM encoded private key as UTF-8 encoded bytes
            final PrivateKey privateKey =
                    Pem.decoder()
                            .decodePrivateKey(
                                    Base64.decodeBase64(
                                            getOkeResourcePrincipalSessionTokenAndKeysResponse
                                                    .getPrivateKey()));

            if (this.sessionKeySupplier instanceof SettableSessionKeySupplier) {
                SettableSessionKeySupplier sessionKeySupplier =
                        (SettableSessionKeySupplier) this.sessionKeySupplier;
                sessionKeySupplier.setKeyPair(new KeyPair(publicKey, privateKey));
            }
            return new SecurityTokenAdapter(securityToken.getToken(), sessionKeySupplier);
        } catch (JsonProcessingException e) {
            throw new IllegalArgumentException(
                    "Workload Identity token can not be parsed correctly. Please contact OKE team for help.",
                    e);
        }
    }

    /**
     * Sets the proxymux server endpoint for session token requests based on the Kubernetes service host environment variable.
     *
     * @throws IllegalArgumentException If the KUBERNETES_SERVICE_HOST environment variable is not set.
     */
    private void setProxymuxEndPoint() {
        // Read proxymux ip address from environment variable.
        String host = System.getenv().get(KUBERNETES_SERVICE_HOST);
        if (host == null) {
            throw new IllegalArgumentException(
                    "Invalid environment variable KUBERNETES_SERVICE_HOST, please contact OKE team for help.");
        }

        // Set proxymux endpoint for requesting rpst token
        restClient.setEndpoint("https://" + host + ":" + PROXYMUX_SERVER_PORT);
    }
}
