/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.auth;

import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;

/**
 * A session key supplier is responsible for providing public/private key pairs that will be used to both
 * fetch federated service tokens and to sign individual requests to OCI.
 * <p>
 * The returned keys should not change unless there as been a call to {@link #refreshKeys()}.
 */
public interface SessionKeySupplier {

    /**
     * Gets the public key
     * @return the public key, not null
     */
    RSAPublicKey getPublicKey();

    /**
     * Gets the private key
     * @return the private key, not null
     */
    RSAPrivateKey getPrivateKey();

    /**
     * If the auth service-issued security token expires, the federation client will try to re-generate a new set of keys
     * by calling this method. The implementer should create a new pair of keys for security reasons.
     *
     * Refreshing keys should not be a long-running blocking call. You can refresh keys in an async thread and return from
     * this method immediately. When the async process is done refreshing the keys, the client code will automatically
     * pick up the latest set of keys and update the security token accordingly
     */
    void refreshKeys();
}
