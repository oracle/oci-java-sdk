/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetResourcePrincipalTokenResponse {
    @JsonProperty("resourcePrincipalToken")
    private String resourcePrincipalToken;

    @JsonProperty("servicePrincipalSessionToken")
    private String servicePrincipalSessionToken;

    public String getResourcePrincipalToken() {
        return this.resourcePrincipalToken;
    }

    public String getServicePrincipalSessionToken() {
        return this.servicePrincipalSessionToken;
    }

    @JsonProperty("resourcePrincipalToken")
    public void setResourcePrincipalToken(String resourcePrincipalToken) {
        this.resourcePrincipalToken = resourcePrincipalToken;
    }

    @JsonProperty("servicePrincipalSessionToken")
    public void setServicePrincipalSessionToken(String servicePrincipalSessionToken) {
        this.servicePrincipalSessionToken = servicePrincipalSessionToken;
    }
}
