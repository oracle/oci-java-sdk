/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.oracle.bmc.auth.InstancePrincipalsAuthenticationDetailsProvider;
import com.oracle.bmc.auth.SessionKeySupplier;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.model.BmcException;
import org.slf4j.Logger;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.security.KeyPair;
import java.security.interfaces.RSAPublicKey;

/**
 * This class gets a security token from the auth service by signing the request with a PKI issued leaf certificate,
 * passing along a temporary public key that is bounded to the the security token, and the leaf certificate.
 */
public class ResourcePrincipalsFederationClient extends AbstractFederationClient {
    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ResourcePrincipalsFederationClient.class);
    private final InstancePrincipalsAuthenticationDetailsProvider provider;
    private final RptPathProvider resourcePrincipalTokenPathProvider;

    /**
     * Constructor of ResourcePrincipalsFederationClient.
     *
     * @param resourcePrincipalTokenEndpoint the endpoint that can provide the resource principal token.
     * @param resourcePrincipalTokenPathProvider the path provider for the resource principal token
     * @param resourcePrincipalSessionTokenEndpoint the endpoint that can provide the resource principal session token.
     * @param sessionKeySupplier the session key supplier.
     * @param instancePrincipalsAuthenticationDetailsProvider the instance principals authentication details provider.
     * @param clientConfigurator the reset client configurator.
     */
    public ResourcePrincipalsFederationClient(
            String resourcePrincipalTokenEndpoint,
            RptPathProvider resourcePrincipalTokenPathProvider,
            String resourcePrincipalSessionTokenEndpoint,
            SessionKeySupplier sessionKeySupplier,
            InstancePrincipalsAuthenticationDetailsProvider
                    instancePrincipalsAuthenticationDetailsProvider,
            ClientConfigurator clientConfigurator,
            CircuitBreakerConfiguration circuitBreakerConfiguration) {
        super(
                resourcePrincipalTokenEndpoint,
                resourcePrincipalSessionTokenEndpoint,
                sessionKeySupplier,
                instancePrincipalsAuthenticationDetailsProvider,
                clientConfigurator,
                circuitBreakerConfiguration);

        this.provider = instancePrincipalsAuthenticationDetailsProvider;
        this.resourcePrincipalTokenPathProvider = resourcePrincipalTokenPathProvider;
    }

    /**
     * Gets a security token from the federation server
     * @return the security token, which is basically a JWT token string
     */
    @Override
    protected SecurityTokenAdapter getSecurityTokenFromServer() {
        LOG.info("Getting security token from the auth server");

        KeyPair keyPair = sessionKeySupplier.getKeyPair();
        if (keyPair == null) {
            throw new IllegalStateException("Keypair for session was not provided");
        }

        RSAPublicKey publicKey = (RSAPublicKey) keyPair.getPublic();
        if (publicKey == null) {
            throw new IllegalArgumentException("Public key is not present");
        }

        try {
            // Get instance principal token with Identity
            provider.refresh();

            // Get resource principal token from the path provided by the path provider
            restClient.setEndpoint(resourcePrincipalTokenEndpoint);
            WebTarget target =
                    restClient.getBaseTarget().path(resourcePrincipalTokenPathProvider.getPath());
            Invocation.Builder ib = target.request();
            URI requestUri = target.getUri();

            Response response = makeCall(ib, requestUri);
            ResponseHelper.throwIfNotSuccessful(response);

            GetResourcePrincipalTokenResponse getResourcePrincipalTokenResponse =
                    ResponseHelper.readEntity(response, GetResourcePrincipalTokenResponse.class);

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
            response = makeCall(ib, requestUri, getResourcePrincipalSessionTokenRequest);
            ResponseHelper.throwIfNotSuccessful(response);

            X509FederationClient.SecurityToken securityToken =
                    SECURITY_TOKEN_FN.apply(response).getItem();
            return new SecurityTokenAdapter(securityToken.getToken(), sessionKeySupplier);

        } catch (BmcException ex) {
            throw ex;
        }
    }
}
