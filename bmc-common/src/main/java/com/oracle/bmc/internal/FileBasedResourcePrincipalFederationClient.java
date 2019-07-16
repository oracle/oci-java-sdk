/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth.internal;

import com.google.common.base.Preconditions;
import com.oracle.bmc.auth.SessionKeySupplier;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.KeyPair;

/**
 * This class gets a security token from file.
 */
@Slf4j
public class FileBasedResourcePrincipalFederationClient implements FederationClient {

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
        this.sessionKeySupplier = Preconditions.checkNotNull(sessionKeySupplier);
        this.securityTokenAdapter = new SecurityTokenAdapter(null, sessionKeySupplier);
        this.resourcePrincipalSessionTokenPath = resourcePrincipalSessionTokenPath;
    }

    @Override
    public String getSecurityToken() {
        if (securityTokenAdapter.isValid()) {
            return securityTokenAdapter.getSecurityToken();
        }

        return refreshAndGetSecurityTokenInner(true);
    }

    @Override
    public String getStringClaim(String key) {
        refreshAndGetSecurityToken();
        return securityTokenAdapter.getStringClaim(key);
    }

    @Override
    public String refreshAndGetSecurityToken() {
        return refreshAndGetSecurityTokenInner(false);
    }

    private String refreshAndGetSecurityTokenInner(final boolean doFinalTokenValidityCheck) {
        // Since this client will be used in a multi-threaded environment (from within a service API),
        // this needs to be synchronized to make sure multiple calls are not updating the security token at the same time.
        // This should not be a blocking/dead-locked call. The worst I can see at this point is that the auth service does
        // not respond and this call times out, throwing exception
        synchronized (this) {
            // Check again to see if the JWT is still invalid, unless we want to skip that check
            if (!doFinalTokenValidityCheck || !securityTokenAdapter.isValid()) {
                LOG.info("Refreshing session keys.");
                sessionKeySupplier.refreshKeys();

                LOG.info("Getting security token from file.");
                securityTokenAdapter = getSecurityTokenFromFile();
                return securityTokenAdapter.getSecurityToken();
            }

            return securityTokenAdapter.getSecurityToken();
        }
    }

    /**
     * Gets a security token from file
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
                    FileUtils.readFileToString(
                            new File(this.resourcePrincipalSessionTokenPath),
                            Charset.defaultCharset());
        } catch (IOException e) {
            throw new RuntimeException("cannot read token from file", e);
        }

        return new SecurityTokenAdapter(securityToken, sessionKeySupplier);
    }
}
