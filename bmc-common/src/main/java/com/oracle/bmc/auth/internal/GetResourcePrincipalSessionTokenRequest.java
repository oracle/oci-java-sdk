/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.internal;

import javax.annotation.concurrent.Immutable;

import com.fasterxml.jackson.annotation.JsonInclude;

@Immutable
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetResourcePrincipalSessionTokenRequest {
    private final String resourcePrincipalToken;
    private final String servicePrincipalSessionToken;
    private final String sessionPublicKey;

    @java.beans.ConstructorProperties({
        "resourcePrincipalToken",
        "servicePrincipalSessionToken",
        "sessionPublicKey"
    })
    public GetResourcePrincipalSessionTokenRequest(
            String resourcePrincipalToken,
            String servicePrincipalSessionToken,
            String sessionPublicKey) {
        this.resourcePrincipalToken = resourcePrincipalToken;
        this.servicePrincipalSessionToken = servicePrincipalSessionToken;
        this.sessionPublicKey = sessionPublicKey;
    }

    public String getResourcePrincipalToken() {
        return this.resourcePrincipalToken;
    }

    public String getServicePrincipalSessionToken() {
        return this.servicePrincipalSessionToken;
    }

    public String getSessionPublicKey() {
        return this.sessionPublicKey;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof GetResourcePrincipalSessionTokenRequest)) return false;
        final GetResourcePrincipalSessionTokenRequest other =
                (GetResourcePrincipalSessionTokenRequest) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$resourcePrincipalToken = this.getResourcePrincipalToken();
        final Object other$resourcePrincipalToken = other.getResourcePrincipalToken();
        if (this$resourcePrincipalToken == null
                ? other$resourcePrincipalToken != null
                : !this$resourcePrincipalToken.equals(other$resourcePrincipalToken)) return false;
        final Object this$servicePrincipalSessionToken = this.getServicePrincipalSessionToken();
        final Object other$servicePrincipalSessionToken = other.getServicePrincipalSessionToken();
        if (this$servicePrincipalSessionToken == null
                ? other$servicePrincipalSessionToken != null
                : !this$servicePrincipalSessionToken.equals(other$servicePrincipalSessionToken))
            return false;
        final Object this$sessionPublicKey = this.getSessionPublicKey();
        final Object other$sessionPublicKey = other.getSessionPublicKey();
        if (this$sessionPublicKey == null
                ? other$sessionPublicKey != null
                : !this$sessionPublicKey.equals(other$sessionPublicKey)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GetResourcePrincipalSessionTokenRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $resourcePrincipalToken = this.getResourcePrincipalToken();
        result =
                result * PRIME
                        + ($resourcePrincipalToken == null
                                ? 43
                                : $resourcePrincipalToken.hashCode());
        final Object $servicePrincipalSessionToken = this.getServicePrincipalSessionToken();
        result =
                result * PRIME
                        + ($servicePrincipalSessionToken == null
                                ? 43
                                : $servicePrincipalSessionToken.hashCode());
        final Object $sessionPublicKey = this.getSessionPublicKey();
        result = result * PRIME + ($sessionPublicKey == null ? 43 : $sessionPublicKey.hashCode());
        return result;
    }
}
