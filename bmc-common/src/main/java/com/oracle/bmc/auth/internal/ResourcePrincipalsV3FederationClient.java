/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.oracle.bmc.auth.ResourcePrincipalAuthenticationDetailsProvider;
import com.oracle.bmc.auth.SessionKeySupplier;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.client.HttpClient;
import com.oracle.bmc.http.client.Method;
import com.oracle.bmc.http.internal.ClientCall;
import com.oracle.bmc.http.signing.DefaultRequestSigner;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.requests.BmcRequest;
import com.oracle.bmc.util.internal.StringUtils;
import org.slf4j.Logger;

import java.security.KeyPair;
import java.security.interfaces.RSAPublicKey;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Optional;

/**
 * This class gets a security token from the auth service by fetching the RPST1 and then passing
 * along the RPST1 to get RPT2 and further get security token RPST2 from the auth service, this
 * nested fetching of security token continues for 10 levels or when the opc-parent-url header in
 * the rpt response is the same as the rpt endpoint
 */
public class ResourcePrincipalsV3FederationClient extends AbstractFederationClient {
    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ResourcePrincipalsV3FederationClient.class);
    private final ClientConfigurator clientConfigurator;
    private final ResourcePrincipalAuthenticationDetailsProvider leafAuthDetailsProvider;
    private final String resourcePrincipalTokenUrl;
    private final String resourcePrincipalSessionTokenEndpoint;
    private volatile SecurityTokenAdapter securityTokenAdapter = null;
    private final String OPC_PARENT_RPT_URL_HEADER = "opc-parent-rpt-url";

    /**
     * Constructor of ResourcePrincipalsFederationClient.
     *
     * @param resourcePrincipalTokenUrl the direct url that can provide the resource principal
     *     token.
     * @param resourcePrincipalSessionTokenEndpoint the endpoint that can provide the resource
     *     principal session token.
     * @param sessionKeySupplier the session key supplier.
     * @param leafAuthDetailsProvider the auth provider for leaf resource
     * @param clientConfigurator the rest client configurator.
     * @param circuitBreakerConfiguration the rest client circuit breaker configuration.
     */
    public ResourcePrincipalsV3FederationClient(
            String resourcePrincipalTokenUrl,
            String resourcePrincipalSessionTokenEndpoint,
            SessionKeySupplier sessionKeySupplier,
            ResourcePrincipalAuthenticationDetailsProvider leafAuthDetailsProvider,
            ClientConfigurator clientConfigurator,
            CircuitBreakerConfiguration circuitBreakerConfiguration) {
        super(
                resourcePrincipalTokenUrl,
                null,
                resourcePrincipalSessionTokenEndpoint,
                sessionKeySupplier,
                leafAuthDetailsProvider,
                clientConfigurator,
                circuitBreakerConfiguration,
                new ArrayList<>());

        this.resourcePrincipalTokenUrl = resourcePrincipalTokenUrl;
        this.resourcePrincipalSessionTokenEndpoint = resourcePrincipalSessionTokenEndpoint;
        this.leafAuthDetailsProvider = leafAuthDetailsProvider;
        this.clientConfigurator = clientConfigurator;
    }

    /**
     * Gets a security token from the federation endpoint. May use a cached token if it judged to
     * still be valid.
     *
     * @return A security token that can be used to authenticate requests.
     */
    @Override
    public String getSecurityToken() {
        if (securityTokenAdapter != null && securityTokenAdapter.isValid()) {
            return securityTokenAdapter.getSecurityToken();
        }
        return refreshAndGetSecurityTokenInner(false, Optional.empty(), true);
    }

    /**
     * Gets a security token from the federation endpoint if the security token expires within the
     * provided duration and allows to enable/disable refresh of keys. This will always retrieve a
     * new token from the federation endpoint and does not use a cached token.
     *
     * @param time the duration to check
     * @param refreshKeys boolean value to enable/disable refresh of keys
     * @return A security token that can be used to authenticate requests.
     */
    @Override
    public String refreshAndGetSecurityTokenIfExpiringWithin(Duration time, boolean refreshKeys) {
        return refreshAndGetSecurityTokenInner(true, Optional.of(time), refreshKeys);
    }

    /**
     * Gets a security token from the federation endpoint if the security token expires within the
     * provided duration. This will always retrieve a new token from the federation endpoint and
     * does not use a cached token.
     *
     * @param time the duration to check
     * @return A security token that can be used to authenticate requests.
     */
    @Override
    public String refreshAndGetSecurityTokenIfExpiringWithin(Duration time) {
        return refreshAndGetSecurityTokenInner(true, Optional.of(time), true);
    }

    /**
     * Gets a security token from the federation server
     *
     * @return the security token, which is basically a JWT token string
     */
    @Override
    protected SecurityTokenAdapter getSecurityTokenFromServer() {

        LOG.info("Getting/Refreshing RPST leaf from the auth server");

        leafAuthDetailsProvider.refresh();

        KeyPair keyPair = sessionKeySupplier.getKeyPair();
        if (keyPair == null) {
            throw new IllegalStateException("Keypair for session was not provided");
        }

        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
        if (publicKey == null) {
            throw new IllegalArgumentException("Public key is not present");
        }

        SecurityTokenAdapter finalSecurityTokenAdapter =
                getSecurityTokenFromServerInner(
                        publicKey,
                        1,
                        this.resourcePrincipalTokenUrl,
                        this.resourcePrincipalTokenClient,
                        this.federationClient);

        return finalSecurityTokenAdapter;
    }

    protected SecurityTokenAdapter getSecurityTokenFromServerInner(
            RSAPublicKey publicKey,
            int depth,
            String lastResourcePrincipalTokenUrl,
            HttpClient resourcePrincipalTokenClient,
            HttpClient federationClient) {

        // Get the resource principal token
        GetResourcePrincipalTokenResponse.ResponseWrapper getResourcePrincipalTokenResponseWrapper =
                prepareRptCall(resourcePrincipalTokenClient)
                        .method(Method.GET)
                        .logger(LOG, "ResourcePrincipalsFederationClient")
                        .callSync();

        GetResourcePrincipalTokenResponse getResourcePrincipalTokenResponse =
                getResourcePrincipalTokenResponseWrapper.body;

        String opcParentUrlHeader =
                getResourcePrincipalTokenResponseWrapper.getHeaders().get(OPC_PARENT_RPT_URL_HEADER)
                                != null
                        ? getResourcePrincipalTokenResponseWrapper
                                .getHeaders()
                                .get(OPC_PARENT_RPT_URL_HEADER)
                                .get(0)
                        : null;

        String servicePrincipalSessionToken =
                getResourcePrincipalTokenResponse.getServicePrincipalSessionToken();
        String resourcePrincipalToken =
                getResourcePrincipalTokenResponse.getResourcePrincipalToken();

        // Get resource principal session token with Identity
        SecurityTokenAdapter securityTokenAdapter =
                requestSessionToken(
                        federationClient,
                        new GetResourcePrincipalSessionTokenRequest(
                                resourcePrincipalToken,
                                servicePrincipalSessionToken,
                                AuthUtils.base64EncodeNoChunking(publicKey)));

        // if depth is more than 10, return the security token obtained last
        if (depth > 9) return securityTokenAdapter;

        // get the opc-parent-rpt-url header and check if matches the last one
        // if the opcParentUrlHeader matches the last rpt url, return the security token last
        // obtained
        if (StringUtils.isBlank(opcParentUrlHeader)
                || (!StringUtils.isBlank(opcParentUrlHeader)
                        && opcParentUrlHeader.equalsIgnoreCase(lastResourcePrincipalTokenUrl))) {
            return securityTokenAdapter;
        }

        ResourcePrincipalAuthenticationDetailsProvider tempAuthProvider =
                new ResourcePrincipalAuthenticationDetailsProvider(
                        new FixedContentResourcePrincipalFederationClient(
                                securityTokenAdapter.getSecurityToken(), sessionKeySupplier),
                        sessionKeySupplier,
                        leafAuthDetailsProvider.getRegion());

        RequestSigner requestSigner = DefaultRequestSigner.createRequestSigner(tempAuthProvider);

        HttpClient resourcePrincipalTokenClientForNextCall =
                makeClient(opcParentUrlHeader, requestSigner);
        HttpClient federationClientForNextCall =
                makeClient(resourcePrincipalSessionTokenEndpoint, requestSigner);

        // else recurse with the new value of the rpt url
        SecurityTokenAdapter innerSecurityTokenAdapter =
                getSecurityTokenFromServerInner(
                        publicKey,
                        depth + 1,
                        opcParentUrlHeader,
                        resourcePrincipalTokenClientForNextCall,
                        federationClientForNextCall);

        return innerSecurityTokenAdapter;
    }

    protected ClientCall<?, GetResourcePrincipalTokenResponse.ResponseWrapper, ?> prepareRptCall(
            HttpClient resourcePrincipalTokenClient) {
        return ClientCall.builder(
                        resourcePrincipalTokenClient,
                        new BmcRequest<>(),
                        GetResourcePrincipalTokenResponse.ResponseWrapper.Builder::new)
                .handleBody(GetResourcePrincipalTokenResponse.class, (w, b) -> w.body = b)
                .clientConfigurator(clientConfigurator)
                .circuitBreaker(circuitBreaker);
    }

    protected SecurityTokenAdapter requestSessionToken(
            HttpClient federationClient,
            GetResourcePrincipalSessionTokenRequest getResourcePrincipalSessionTokenRequest) {
        X509FederationClient.SecurityToken securityToken =
                ClientCall.builder(
                                federationClient,
                                new BmcRequest<GetResourcePrincipalSessionTokenRequest>() {
                                    @Override
                                    public GetResourcePrincipalSessionTokenRequest getBody$() {
                                        return getResourcePrincipalSessionTokenRequest;
                                    }
                                },
                                X509FederationClient.FederationResponseWrapper.Builder::new)
                        .method(Method.POST)
                        .logger(LOG, "ResourcePrincipalsFederationClient")
                        .handleBody(X509FederationClient.SecurityToken.class, (w, t) -> w.token = t)
                        .clientConfigurator(clientConfigurator)
                        .appendPathPart("v1")
                        .appendPathPart("resourcePrincipalSessionToken")
                        .circuitBreaker(circuitBreaker)
                        .hasBody()
                        .callSync()
                        .token;

        return new SecurityTokenAdapter(securityToken.getToken(), sessionKeySupplier);
    }
}
