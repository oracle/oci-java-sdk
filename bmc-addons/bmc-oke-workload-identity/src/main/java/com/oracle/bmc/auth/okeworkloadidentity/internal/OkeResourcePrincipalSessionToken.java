/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.okeworkloadidentity.internal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.oracle.bmc.responses.BmcResponse;

import java.util.List;
import java.util.Map;

public class OkeResourcePrincipalSessionToken {
    @JsonProperty("token")
    private String token;

    public OkeResourcePrincipalSessionToken() {
        // no-argument constructor for deserialization
    }

    public OkeResourcePrincipalSessionToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return this.token;
    }
}
