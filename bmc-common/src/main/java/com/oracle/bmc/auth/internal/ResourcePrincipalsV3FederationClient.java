/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.oracle.bmc.auth.ResourcePrincipalAuthenticationDetailsProvider;
import com.oracle.bmc.auth.SessionKeySupplier;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.http.internal.RestClient;
import com.oracle.bmc.http.internal.RestClientFactory;
import com.oracle.bmc.http.internal.RestClientFactoryBuilder;
import com.oracle.bmc.http.signing.DefaultRequestSigner;
import com.oracle.bmc.http.signing.RequestSigner;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.util.internal.StringUtils;
import org.slf4j.Logger;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.security.KeyPair;
import java.security.interfaces.RSAPublicKey;
import java.time.Duration;
import java.util.Collections;
import java.util.Optional;

/**
 * This class gets a security token from the auth service by fetching the RPST1 and then
 * passing along the RPST1 to get RPT2 and further get security token RPST2 from the auth service,
 * this nested fetching of security token continues for 10 levels or when the opc-parent-url header
 * in the rpt response is the same as the rpt endpoint
 */
public class ResourcePrincipalsV3FederationClient extends AbstractFederationClient {
    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ResourcePrincipalsV3FederationClient.class);
    private final ClientConfigurator clientConfigurator;
    private final ResourcePrincipalAuthenticationDetailsProvider leafAuthDetailsProvider;
    private volatile SecurityTokenAdapter securityTokenAdapter = null;
    private final String OPC_PARENT_RPT_URL_HEADER = "opc-parent-rpt-url";

    /**
     * Constructor of ResourcePrincipalsFederationClient.
     *
     * @param resourcePrincipalTokenUrl the direct url that can provide the resource principal token.
     * @param resourcePrincipalSessionTokenEndpoint the endpoint that can provide the resource principal session token.
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
                circuitBreakerConfiguration);

        this.leafAuthDetailsProvider = leafAuthDetailsProvider;
        this.clientConfigurator = clientConfigurator;
    }

    /**
     * Gets a security token from the federation endpoint. May use a cached token if
     * it judged to still be valid.
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
     * Gets a security token from the federation endpoint if the security token expires within the provided duration
     * and allows to enable/disable refresh of keys. This will always retrieve a new token from the federation endpoint
     * and does not use a cached token.
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
     * Gets a security token from the federation endpoint if the security token expires within the provided duration.
     * This will always retrieve a new token from the federation endpoint and does not use a cached token.
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

        try {
            if (StringUtils.isBlank(resourcePrincipalTokenUrl)) {
                throw new IllegalArgumentException("resourcePrincipalTokenUrl cannot be null");
            }

            SecurityTokenAdapter finalSecurityTokenAdapter =
                    getSecurityTokenFromServerInner(
                            publicKey, 1, resourcePrincipalTokenUrl, this.restClient);

            return finalSecurityTokenAdapter;

        } catch (BmcException ex) {
            throw ex;
        }
    }

    protected SecurityTokenAdapter getSecurityTokenFromServerInner(
            RSAPublicKey publicKey,
            int depth,
            String lastResourcePrincipalTokenUrl,
            RestClient restClient) {

        restClient.setEndpoint(lastResourcePrincipalTokenUrl);
        WebTarget target = restClient.getBaseTarget();
        Invocation.Builder ib = target.request();
        URI requestUri = target.getUri();

        LOG.info(
                (String.format(
                        "Getting RPT(%s) from the url : %s",
                        String.valueOf(depth),
                        requestUri.toString())));

        Response rptResponse = makeCall(ib, requestUri);

        String opcParentUrlHeader =
                rptResponse.getStringHeaders().get(OPC_PARENT_RPT_URL_HEADER) != null
                        ? rptResponse.getStringHeaders().get(OPC_PARENT_RPT_URL_HEADER).get(0)
                        : null;

        ResponseHelper.throwIfNotSuccessful(rptResponse);

        GetResourcePrincipalTokenResponse getResourcePrincipalTokenResponse =
                ResponseHelper.readEntity(rptResponse, GetResourcePrincipalTokenResponse.class);

        String servicePrincipalSessionToken =
                getResourcePrincipalTokenResponse.getServicePrincipalSessionToken();
        String resourcePrincipalToken =
                getResourcePrincipalTokenResponse.getResourcePrincipalToken();

        // Get resource principal session token with Identity
        restClient.setEndpoint(federationEndpoint);
        GetResourcePrincipalSessionTokenRequest getResourcePrincipalSessionTokenRequest =
                new GetResourcePrincipalSessionTokenRequest(
                        resourcePrincipalToken,
                        servicePrincipalSessionToken,
                        AuthUtils.base64EncodeNoChunking(publicKey));

        target = restClient.getBaseTarget().path("v1").path("resourcePrincipalSessionToken");
        ib = target.request();
        requestUri = target.getUri();

        // Make a call and get back the security token
        LOG.info(String.format("Getting RPST(%s) from %s", String.valueOf(depth), requestUri));

        Response rpstResponse = makeCall(ib, requestUri, getResourcePrincipalSessionTokenRequest);

        ResponseHelper.throwIfNotSuccessful(rpstResponse);

        X509FederationClient.SecurityToken securityToken =
                SECURITY_TOKEN_FN.apply(rpstResponse).getItem();

        SecurityTokenAdapter securityTokenAdapter =
                new SecurityTokenAdapter(securityToken.getToken(), sessionKeySupplier);

        // if depth is more than 10, return the security token obtained last
        if (depth > 9) return securityTokenAdapter;

        // get the opc-parent-rpt-url header and check if matches the last one
        // if the opcParentUrlHeader matches the last rpt url, return the security token last obtained
        if (StringUtils.isBlank(opcParentUrlHeader)
                || (!StringUtils.isBlank(opcParentUrlHeader)
                        && opcParentUrlHeader.equalsIgnoreCase(lastResourcePrincipalTokenUrl))) {
            return securityTokenAdapter;
        }

        RestClient restClientForNextCall = getRestClientForNestedCall(securityToken);

        // else recurse with the new value of the rpt url
        SecurityTokenAdapter innerSecurityTokenAdapter =
                getSecurityTokenFromServerInner(
                        publicKey, depth + 1, opcParentUrlHeader, restClientForNextCall);

        return innerSecurityTokenAdapter;
    }

    private RestClient getRestClientForNestedCall(
            X509FederationClient.SecurityToken securityToken) {
        ResourcePrincipalAuthenticationDetailsProvider tempAuthProvider =
                new ResourcePrincipalAuthenticationDetailsProvider(
                        new FixedContentResourcePrincipalFederationClient(
                                securityToken.getToken(), sessionKeySupplier),
                        sessionKeySupplier,
                        leafAuthDetailsProvider.getRegion());

        RequestSigner requestSigner = DefaultRequestSigner.createRequestSigner(tempAuthProvider);

        RestClientFactory restClientFactory =
                RestClientFactoryBuilder.builder().clientConfigurator(clientConfigurator).build();

        return restClientFactory.create(requestSigner, Collections.emptyMap(), clientConfiguration);
    }

    protected String refreshAndGetSecurityTokenInner(
            final boolean doFinalTokenValidityCheck, Optional<Duration> time, boolean refreshKeys) {

        // Since this client will be used in a multi-threaded environment (from within a service API),
        // this needs to be synchronized to make sure multiple calls are not updating the security token at the same time.
        // This should not be a blocking/dead-locked call. The worst I can see at this point is that the auth service does
        // not respond and this call times out, throwing exception
        synchronized (this) {
            // Check again to see if the JWT is still invalid, unless we want to skip that check
            if (!doFinalTokenValidityCheck
                    || (time.isPresent()
                            ? (!securityTokenAdapter.isValid(time))
                            : (!securityTokenAdapter.isValid()))) {

                securityTokenAdapter = getSecurityTokenFromServer();
                return securityTokenAdapter.getSecurityToken();
            }

            return securityTokenAdapter.getSecurityToken();
        }
    }
}
