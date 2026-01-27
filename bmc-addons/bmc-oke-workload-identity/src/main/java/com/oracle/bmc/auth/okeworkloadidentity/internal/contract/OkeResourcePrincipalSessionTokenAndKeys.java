/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.okeworkloadidentity.internal.contract;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class OkeResourcePrincipalSessionTokenAndKeys {
    @JsonProperty("token")
    private final String token;

    @JsonProperty(value = "privateKey")
    private final String privateKey;

    @JsonProperty(value = "publicKey")
    private final String publicKey;

    @JsonCreator
    public OkeResourcePrincipalSessionTokenAndKeys(
            @JsonProperty("token") String token,
            @JsonProperty("privateKey") String privateKey,
            @JsonProperty("publicKey") String publicKey) {
        this.token = token;
        this.privateKey = privateKey;
        this.publicKey = publicKey;
    }

    public String getToken() {
        return this.token;
    }

    public String getPrivateKey() {
        return this.privateKey;
    }

    public String getPublicKey() {
        return this.publicKey;
    }
}
