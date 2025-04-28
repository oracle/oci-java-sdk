/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.oracle.bmc.auth.ProvidesConfigurableRefresh;
import com.oracle.bmc.auth.SessionKeySupplier;
import com.oracle.bmc.util.StreamUtils;
import com.oracle.bmc.util.internal.Validate;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.KeyPair;
import java.time.Duration;
import java.util.Optional;
import org.slf4j.Logger;

/** This class gets a security token from file. */
public class FileBasedResourcePrincipalFederationClient
        implements FederationClient, ProvidesConfigurableRefresh {

    private static final Logger LOG =
            org.slf4j.LoggerFactory.getLogger(FileBasedResourcePrincipalFederationClient.class);
    private final SessionKeySupplier sessionKeySupplier;
    private volatile SecurityTokenAdapter securityTokenAdapter;
    private final String resourcePrincipalSessionTokenPath;

    /**
     * Constructor of FileBasedResourcePrincipalFederationClient.
     *
     * @param sessionKeySupplier the session key supplier.
     * @param resourcePrincipalSessionTokenPath the path to load the RPST from
     */
    public FileBasedResourcePrincipalFederationClient(
            SessionKeySupplier sessionKeySupplier, String resourcePrincipalSessionTokenPath) {
        this.sessionKeySupplier =
                Validate.notNull(sessionKeySupplier, "sessionKeySupplier must not be null");
        this.securityTokenAdapter = new SecurityTokenAdapter(null, sessionKeySupplier);
        this.resourcePrincipalSessionTokenPath = resourcePrincipalSessionTokenPath;
    }

    @Override
    public String getSecurityToken() {
        if (securityTokenAdapter.isValid()) {
            return securityTokenAdapter.getSecurityToken();
        }

        return refreshAndGetSecurityTokenInner(true, Optional.empty(), true);
    }

    @Override
    public String getStringClaim(String key) {
        refreshAndGetSecurityToken();
        return securityTokenAdapter.getStringClaim(key);
    }

    @Override
    public String refreshAndGetSecurityToken() {
        return refreshAndGetSecurityTokenInner(false, Optional.empty(), true);
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
                if (refreshKeys) {
                    LOG.info("Refreshing session keys.");
                    sessionKeySupplier.refreshKeys();
                }

                LOG.info("Getting security token from file.");
                securityTokenAdapter = getSecurityTokenFromFile();
                return securityTokenAdapter.getSecurityToken();
            }

            return securityTokenAdapter.getSecurityToken();
        }
    }

    /**
     * Gets a security token from file
     *
     * @return the security token, which is basically a JWT token string
     */
    protected SecurityTokenAdapter getSecurityTokenFromFile() {
        KeyPair keyPair = sessionKeySupplier.getKeyPair();
        if (keyPair == null) {
            throw new IllegalArgumentException("Keypair for session was not provided");
        }

        String securityToken = "";
        try {
            securityToken =
                    new String(
                            StreamUtils.toByteArray(
                                    new FileInputStream(
                                            new File(this.resourcePrincipalSessionTokenPath))),
                            Charset.defaultCharset());
        } catch (IOException e) {
            throw new RuntimeException("cannot read token from file", e);
        }

        return new SecurityTokenAdapter(securityToken, sessionKeySupplier);
    }

    @Override
    public String refreshAndGetSecurityTokenIfExpiringWithin(Duration time, boolean refreshKeys) {
        return refreshAndGetSecurityTokenInner(true, Optional.of(time), refreshKeys);
    }

    @Override
    public String refreshAndGetSecurityTokenIfExpiringWithin(Duration time) {
        return refreshAndGetSecurityTokenInner(true, Optional.of(time), true);
    }
}
