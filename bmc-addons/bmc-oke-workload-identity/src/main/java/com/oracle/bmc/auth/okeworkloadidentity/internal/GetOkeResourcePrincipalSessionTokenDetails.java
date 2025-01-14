/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.okeworkloadidentity.internal;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel;

import java.util.Objects;

/** @Immutable */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetOkeResourcePrincipalSessionTokenDetails extends ExplicitlySetBmcModel {
    private final String podKey;

    @java.beans.ConstructorProperties({"podKey"})
    public GetOkeResourcePrincipalSessionTokenDetails(String podKey) {
        this.podKey = podKey;
    }

    public String getPodKey() {
        return this.podKey;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof GetOkeResourcePrincipalSessionTokenDetails)) {
            return false;
        }
        final GetOkeResourcePrincipalSessionTokenDetails other =
                (GetOkeResourcePrincipalSessionTokenDetails) o;
        if (!other.canEqual(this)) {
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
        return other instanceof GetOkeResourcePrincipalSessionTokenDetails;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $podKey = this.getPodKey();
        result = result * PRIME + ($podKey == null ? 43 : $podKey.hashCode());
        return result;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("podKey")
        private String podKey;

        public Builder podKey(String podKey) {
            this.podKey = podKey;
            this.__explicitlySet__.add("podKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GetOkeResourcePrincipalSessionTokenDetails build() {
            GetOkeResourcePrincipalSessionTokenDetails model =
                    new GetOkeResourcePrincipalSessionTokenDetails(this.podKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GetOkeResourcePrincipalSessionTokenDetails model) {
            if (model.wasPropertyExplicitlySet("podKey")) {
                this.podKey(model.getPodKey());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }
}
