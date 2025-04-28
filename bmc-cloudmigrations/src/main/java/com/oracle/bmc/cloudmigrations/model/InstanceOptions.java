/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Optional mutable instance options <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = InstanceOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstanceOptions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"areLegacyImdsEndpointsDisabled"})
    public InstanceOptions(Boolean areLegacyImdsEndpointsDisabled) {
        super();
        this.areLegacyImdsEndpointsDisabled = areLegacyImdsEndpointsDisabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Whether to disable the legacy (/v1) instance metadata service endpoints. Customers who
         * have migrated to /v2 should set this to true for added security. Default is false.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("areLegacyImdsEndpointsDisabled")
        private Boolean areLegacyImdsEndpointsDisabled;

        /**
         * Whether to disable the legacy (/v1) instance metadata service endpoints. Customers who
         * have migrated to /v2 should set this to true for added security. Default is false.
         *
         * @param areLegacyImdsEndpointsDisabled the value to set
         * @return this builder
         */
        public Builder areLegacyImdsEndpointsDisabled(Boolean areLegacyImdsEndpointsDisabled) {
            this.areLegacyImdsEndpointsDisabled = areLegacyImdsEndpointsDisabled;
            this.__explicitlySet__.add("areLegacyImdsEndpointsDisabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceOptions build() {
            InstanceOptions model = new InstanceOptions(this.areLegacyImdsEndpointsDisabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceOptions model) {
            if (model.wasPropertyExplicitlySet("areLegacyImdsEndpointsDisabled")) {
                this.areLegacyImdsEndpointsDisabled(model.getAreLegacyImdsEndpointsDisabled());
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

    /**
     * Whether to disable the legacy (/v1) instance metadata service endpoints. Customers who have
     * migrated to /v2 should set this to true for added security. Default is false.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("areLegacyImdsEndpointsDisabled")
    private final Boolean areLegacyImdsEndpointsDisabled;

    /**
     * Whether to disable the legacy (/v1) instance metadata service endpoints. Customers who have
     * migrated to /v2 should set this to true for added security. Default is false.
     *
     * @return the value
     */
    public Boolean getAreLegacyImdsEndpointsDisabled() {
        return areLegacyImdsEndpointsDisabled;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("InstanceOptions(");
        sb.append("super=").append(super.toString());
        sb.append("areLegacyImdsEndpointsDisabled=")
                .append(String.valueOf(this.areLegacyImdsEndpointsDisabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstanceOptions)) {
            return false;
        }

        InstanceOptions other = (InstanceOptions) o;
        return java.util.Objects.equals(
                        this.areLegacyImdsEndpointsDisabled, other.areLegacyImdsEndpointsDisabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.areLegacyImdsEndpointsDisabled == null
                                ? 43
                                : this.areLegacyImdsEndpointsDisabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
