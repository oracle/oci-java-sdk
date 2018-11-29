/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.http.signing.internal;

import lombok.extern.slf4j.Slf4j;

import java.security.Provider;
import java.security.Security;

@Slf4j
class BouncyCastleHelper {
    private final boolean isProviderInstalled;
    private final Provider bouncyCastleProvider;

    private BouncyCastleHelper() {
        isProviderInstalled =
                Security.getProvider("BC") != null || Security.getProvider("BCFIPS") != null;
        try {
            final Class<?> bouncyCastleProviderClass = getBouncyCastleProviderClass();
            bouncyCastleProvider = (Provider) bouncyCastleProviderClass.newInstance();
            LOG.info("Instantiated provider: " + bouncyCastleProviderClass.getName());
        } catch (InstantiationException | IllegalAccessException ex) {
            LOG.error("Failed to instantiate any BouncyCastle provider", ex);
            throw new BouncyCastleHelperException(ex);
        }
    }

    private static class Holder {
        private static final BouncyCastleHelper INSTANCE = new BouncyCastleHelper();
    }

    static BouncyCastleHelper getInstance() {
        return Holder.INSTANCE;
    }

    boolean isProviderInstalled() {
        return isProviderInstalled;
    }

    Provider getBouncyCastleProvider() {
        return bouncyCastleProvider;
    }

    private static Class<?> getBouncyCastleProviderClass() {
        LOG.debug("Trying to get BouncyCastleProvider");
        try {
            return Class.forName("org.bouncycastle.jce.provider.BouncyCastleProvider");
        } catch (ClassNotFoundException e) {
            LOG.info("Did not find BouncyCastleProvider");
        }

        LOG.debug("Trying to get BouncyCastleFipsProvider");
        try {
            return Class.forName("org.bouncycastle.jcajce.provider.BouncyCastleFipsProvider");
        } catch (ClassNotFoundException e) {
            LOG.info("Did not find BouncyCastleFipsProvider");
        }

        throw new IllegalStateException("No matching BouncyCastle provider found.");
    }

    /**
     * An exception in the {@link BouncyCastleHelper}.
     */
    public static class BouncyCastleHelperException extends RuntimeException {
        public BouncyCastleHelperException(String message, Throwable cause) {
            super(message, cause);
        }

        public BouncyCastleHelperException(Throwable cause) {
            super(cause);
        }
    }
}
