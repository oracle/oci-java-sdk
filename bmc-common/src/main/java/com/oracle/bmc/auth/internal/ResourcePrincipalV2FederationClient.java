/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.oracle.bmc.auth.SessionKeySupplier;
import com.oracle.bmc.circuitbreaker.CircuitBreakerConfiguration;
import com.oracle.bmc.http.ClientConfigurator;
import com.oracle.bmc.http.internal.ResponseHelper;
import com.oracle.bmc.model.BmcException;
import com.oracle.bmc.util.internal.StringUtils;
import org.slf4j.Logger;

import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.security.KeyPair;
import java.security.interfaces.RSAPublicKey;

/**
 * This class gets a security token from the auth service by signing the request with the provided private key.
 */
public class ResourcePrincipalV2FederationClient extends AbstractFederationClient {
    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(ResourcePrincipalV2FederationClient.class);

    /**
     * The authentication provider to sign the internal requests.
     */
    private final KeyPairAuthenticationDetailProvider provider;

    /** The resource principal token path. */
    private final String resourcePrincipalTokenPath;

    /** The security context. */
    private final String securityContext;

    /**
     * Constructor of ResourcePrincipalsV2FederationClient.
     *
     * @param resourcePrincipalTokenEndpoint the endpoint that can provide the resource principal token.
     * @param federationEndpoint the endpoint that can provide the resource principal session token.
     * @param sessionKeySupplier the session key supplier.
     * @param keyPairAuthenticationDetailsProvider the key pair authentication details provider.
     * @param clientConfigurator the reset client configurator.
     * @param circuitBreakerConfiguration the rest client circuit breaker configuration.
     */
    public ResourcePrincipalV2FederationClient(
            String resourcePrincipalTokenEndpoint,
            String federationEndpoint,
            SessionKeySupplier sessionKeySupplier,
            KeyPairAuthenticationDetailProvider keyPairAuthenticationDetailsProvider,
            ClientConfigurator clientConfigurator,
            CircuitBreakerConfiguration circuitBreakerConfiguration) {
        this(
                resourcePrincipalTokenEndpoint,
                federationEndpoint,
                null,
                null,
                sessionKeySupplier,
                keyPairAuthenticationDetailsProvider,
                clientConfigurator,
                circuitBreakerConfiguration);
    }

    /**
     * Constructor of ResourcePrincipalsV2FederationClient.
     *
     * @param resourcePrincipalTokenEndpoint the endpoint that can provide the resource principal token.
     * @param federationEndpoint the endpoint that can provide the resource principal session token.
     * @param resourcePrincipalTokenPath the resource principal token path
     * @param securityContext the security context
     * @param sessionKeySupplier the session key supplier.
     * @param keyPairAuthenticationDetailsProvider the key pair authentication details provider.
     * @param clientConfigurator the reset client configurator.
     * @param circuitBreakerConfiguration the rest client circuit breaker configuration.
     */
    public ResourcePrincipalV2FederationClient(
            String resourcePrincipalTokenEndpoint,
            String federationEndpoint,
            String resourcePrincipalTokenPath,
            String securityContext,
            SessionKeySupplier sessionKeySupplier,
            KeyPairAuthenticationDetailProvider keyPairAuthenticationDetailsProvider,
            ClientConfigurator clientConfigurator,
            CircuitBreakerConfiguration circuitBreakerConfiguration) {

        super(
                resourcePrincipalTokenEndpoint,
                federationEndpoint,
                sessionKeySupplier,
                keyPairAuthenticationDetailsProvider,
                clientConfigurator,
                circuitBreakerConfiguration);

        this.provider = keyPairAuthenticationDetailsProvider;
        this.resourcePrincipalTokenPath = resourcePrincipalTokenPath;
        this.securityContext = securityContext;
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
            // Get resource principal token from service cp, like SecretsVault or DBAAS
            restClient.setEndpoint(resourcePrincipalTokenEndpoint);
            WebTarget target;
            if (StringUtils.isNotBlank(resourcePrincipalTokenPath)) {
                target =
                        restClient
                                .getBaseTarget()
                                .path(resourcePrincipalTokenPath)
                                .path(provider.refresh()); // refresh will return the resource id
            } else {
                target =
                        restClient
                                .getBaseTarget()
                                .path("20180711")
                                .path("resourcePrincipalTokenV2")
                                .path(provider.refresh()); // refresh will return the resource id
            }

            return getSecurityTokenFromServerInner(publicKey, target, securityContext);

        } catch (BmcException ex) {
            throw ex;
        }
    }
}
