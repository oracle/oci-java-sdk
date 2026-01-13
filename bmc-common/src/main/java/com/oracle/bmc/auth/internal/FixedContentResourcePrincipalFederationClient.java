/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.oracle.bmc.auth.ProvidesConfigurableRefresh;
import com.oracle.bmc.auth.SessionKeySupplier;
import com.oracle.bmc.util.internal.Validate;
import org.slf4j.Logger;

import java.time.Duration;
import java.util.Optional;

/** This class returns a security token, supplied as a fixed value. */
public class FixedContentResourcePrincipalFederationClient
        implements FederationClient, ProvidesConfigurableRefresh {
    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(FixedContentResourcePrincipalFederationClient.class);
    private final SessionKeySupplier sessionKeySupplier;
    private final SecurityTokenAdapter securityTokenAdapter;

    /**
     * Constructor of FixedContentResourcePrincipalFederationClient.
     *
     * @param resourcePrincipalSessionToken the constant value for the RPST
     * @param sessionKeySupplier the associated SessionKeySupplier
     */
    public FixedContentResourcePrincipalFederationClient(
            String resourcePrincipalSessionToken, SessionKeySupplier sessionKeySupplier) {
        this.sessionKeySupplier =
                Validate.notNull(sessionKeySupplier, "sessionKeySupplier must not be null");
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

    @Override
    public String refreshAndGetSecurityTokenIfExpiringWithin(Duration time, boolean refreshKeys) {
        return refreshAndGetSecurityTokenInner(true, Optional.of(time), refreshKeys);
    }

    @Override
    public String refreshAndGetSecurityTokenIfExpiringWithin(Duration time) {
        return refreshAndGetSecurityTokenInner(true, Optional.of(time), true);
    }

    private String refreshAndGetSecurityTokenInner(
            final boolean doFinalTokenValidityCheck, Optional<Duration> time, boolean refreshKeys) {
        // Since this client will be used in a multi-threaded environment (from within a service
        // API),
        // this needs to be synchronized to make sure multiple calls are not updating the security
        // token at the same time.
        // This should not be a blocking/dead-locked call. The worst I can see at this point is that
        // the auth service does
        // not respond and this call times out, throwing exception
        synchronized (this) {
            // Check again to see if the JWT is still invalid, unless we want to skip that check
            if (!doFinalTokenValidityCheck
                    || (time.isPresent()
                            ? (!securityTokenAdapter.isValid(time))
                            : (!securityTokenAdapter.isValid()))) {
                LOG.info("Refreshing session keys.");
                if (refreshKeys) {
                    sessionKeySupplier.refreshKeys();
                }
                return securityTokenAdapter.getSecurityToken();
            }

            return securityTokenAdapter.getSecurityToken();
        }
    }
}
