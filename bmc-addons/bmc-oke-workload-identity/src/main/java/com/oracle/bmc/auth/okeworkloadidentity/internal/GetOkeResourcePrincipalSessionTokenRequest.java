/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.okeworkloadidentity.internal;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Objects;
import javax.annotation.concurrent.Immutable;

@Immutable
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetOkeResourcePrincipalSessionTokenRequest {
    private final String podKey;

    @java.beans.ConstructorProperties({"podKey"})
    public GetOkeResourcePrincipalSessionTokenRequest(String podKey) {
        this.podKey = podKey;
    }

    public String getPodKey() {
        return this.podKey;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof GetOkeResourcePrincipalSessionTokenRequest)) {
            return false;
        }
        final GetOkeResourcePrincipalSessionTokenRequest other =
                (GetOkeResourcePrincipalSessionTokenRequest) o;
        if (!other.canEqual((Object) this)) {
            return false;
        }
        final Object this$podKey = this.getPodKey();
        final Object other$podKey = other.getPodKey();
        if (!Objects.equals(this$podKey, other$podKey)) {
            return false;
        }
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GetOkeResourcePrincipalSessionTokenRequest;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $podKey = this.getPodKey();
        result = result * PRIME + ($podKey == null ? 43 : $podKey.hashCode());
        return result;
    }
}
