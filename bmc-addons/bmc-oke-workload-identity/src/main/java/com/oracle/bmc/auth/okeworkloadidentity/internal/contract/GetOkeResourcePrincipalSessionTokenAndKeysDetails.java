/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.auth.okeworkloadidentity.internal.contract;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel;

/** @Immutable */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetOkeResourcePrincipalSessionTokenAndKeysDetails extends ExplicitlySetBmcModel {
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof GetOkeResourcePrincipalSessionTokenAndKeysDetails)) {
            return false;
        }
        final GetOkeResourcePrincipalSessionTokenAndKeysDetails other =
                (GetOkeResourcePrincipalSessionTokenAndKeysDetails) o;
        if (!other.canEqual(this)) {
            return false;
        }
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof GetOkeResourcePrincipalSessionTokenAndKeysDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GetOkeResourcePrincipalSessionTokenAndKeysDetails build() {
            GetOkeResourcePrincipalSessionTokenAndKeysDetails model =
                    new GetOkeResourcePrincipalSessionTokenAndKeysDetails();
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GetOkeResourcePrincipalSessionTokenAndKeysDetails model) {
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
