/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth.internal;

import com.oracle.bmc.auth.SessionKeySupplier;

/**
 * This class returns a security token, supplied as a fixed value.
 */
public class FixedContentResourcePrincipalFederationClient implements FederationClient {
    private final SecurityTokenAdapter securityTokenAdapter;

    /**
     * Constructor of FixedContentResourcePrincipalFederationClient.
     *
     * @param resourcePrincipalSessionToken the constant value for the RPST
     * @param sessionKeySupplier the associated SessionKeySupplier
     */
    public FixedContentResourcePrincipalFederationClient(
            String resourcePrincipalSessionToken, SessionKeySupplier sessionKeySupplier) {
        this.securityTokenAdapter =
                new SecurityTokenAdapter(resourcePrincipalSessionToken, sessionKeySupplier);
    }

    @Override
    public String getSecurityToken() {
        return securityTokenAdapter.getSecurityToken();
    }

    @Override
    public String refreshAndGetSecurityToken() {
        return securityTokenAdapter.getSecurityToken();
    }

    @Override
    public String getStringClaim(String key) {
        return securityTokenAdapter.getStringClaim(key);
    }
}
