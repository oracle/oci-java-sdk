/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.http.client;

import java.security.KeyStore;
import java.util.Objects;

public final class KeyStoreWithPassword {
    private final KeyStore keyStore;
    private final String password;

    public KeyStoreWithPassword(KeyStore keyStore, String password) {
        this.keyStore = Objects.requireNonNull(keyStore, "keyStore");
        this.password = Objects.requireNonNull(password, "password");
    }

    public KeyStore getKeyStore() {
        return keyStore;
    }

    public String getPassword() {
        return password;
    }
}
