/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The exascale config request details for the Exadata Cloud@Customer infrastructure. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ConfigureExascaleExadataInfrastructureDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ConfigureExascaleExadataInfrastructureDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"totalStorageInGBs"})
    public ConfigureExascaleExadataInfrastructureDetails(Integer totalStorageInGBs) {
        super();
        this.totalStorageInGBs = totalStorageInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Storage size needed for Exascale in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalStorageInGBs")
        private Integer totalStorageInGBs;

        /**
         * Storage size needed for Exascale in GBs.
         *
         * @param totalStorageInGBs the value to set
         * @return this builder
         */
        public Builder totalStorageInGBs(Integer totalStorageInGBs) {
            this.totalStorageInGBs = totalStorageInGBs;
            this.__explicitlySet__.add("totalStorageInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfigureExascaleExadataInfrastructureDetails build() {
            ConfigureExascaleExadataInfrastructureDetails model =
                    new ConfigureExascaleExadataInfrastructureDetails(this.totalStorageInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigureExascaleExadataInfrastructureDetails model) {
            if (model.wasPropertyExplicitlySet("totalStorageInGBs")) {
                this.totalStorageInGBs(model.getTotalStorageInGBs());
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

    /** Storage size needed for Exascale in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalStorageInGBs")
    private final Integer totalStorageInGBs;

    /**
     * Storage size needed for Exascale in GBs.
     *
     * @return the value
     */
    public Integer getTotalStorageInGBs() {
        return totalStorageInGBs;
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
        sb.append("ConfigureExascaleExadataInfrastructureDetails(");
        sb.append("super=").append(super.toString());
        sb.append("totalStorageInGBs=").append(String.valueOf(this.totalStorageInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfigureExascaleExadataInfrastructureDetails)) {
            return false;
        }

        ConfigureExascaleExadataInfrastructureDetails other =
                (ConfigureExascaleExadataInfrastructureDetails) o;
        return java.util.Objects.equals(this.totalStorageInGBs, other.totalStorageInGBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.totalStorageInGBs == null ? 43 : this.totalStorageInGBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
