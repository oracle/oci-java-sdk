/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.okeworkloadidentity.internal.contract;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Response from the proxymux endpoint containing a resource principal token and ephemeral key pair.
 */
public class GetOkeResourcePrincipalSessionTokenAndKeysResponse {
    @JsonProperty("token")
    private String token;

    @JsonProperty(value = "privateKey")
    private String privateKey;

    @JsonProperty(value = "publicKey")
    private String publicKey;

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
