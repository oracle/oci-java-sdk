/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.okeworkloadidentity.internal;

import com.oracle.bmc.auth.SessionKeySupplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.KeyPair;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

/**
 * SessionKeySupplier that allows explicit setting of the key pair, used in OKE Workload Identity flows with server-provided session keys when token caching is enabled.
 */
public class SettableSessionKeySupplier implements SessionKeySupplier {
    private static final Logger LOG = LoggerFactory.getLogger(SettableSessionKeySupplier.class);
    private volatile KeyPair keyPair;

    @Override
    public KeyPair getKeyPair() {
        return keyPair;
    }

    @Override
    public RSAPublicKey getPublicKey() {
        return (RSAPublicKey) keyPair.getPublic();
    }

    @Override
    public RSAPrivateKey getPrivateKey() {
        return (RSAPrivateKey) keyPair.getPrivate();
    }

    @Override
    public void refreshKeys() {
        // This implementation does not support automatic key refreshing.
        LOG.info("refreshKeys called, but this is a no-op for this implementation");
    }

    public void setKeyPair(KeyPair keyPair) {
        this.keyPair = keyPair;
        LOG.info("Key pair set.");
    }
}
