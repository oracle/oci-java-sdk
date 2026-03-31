/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The exascale config response details for the Exadata Cloud@Customer infrastructure or cloud Exadata infrastructure . Applies to both Exadata Cloud@Customer instances and Exadata Cloud Service instances.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExascaleConfigDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExascaleConfigDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "totalStorageInGBs",
        "availableStorageInGBs",
        "totalVmStorageInGBs",
        "availableVmStorageInGBs"
    })
    public ExascaleConfigDetails(
            Integer totalStorageInGBs,
            Integer availableStorageInGBs,
            Integer totalVmStorageInGBs,
            Integer availableVmStorageInGBs) {
        super();
        this.totalStorageInGBs = totalStorageInGBs;
        this.availableStorageInGBs = availableStorageInGBs;
        this.totalVmStorageInGBs = totalVmStorageInGBs;
        this.availableVmStorageInGBs = availableVmStorageInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Storage size needed for Exascale in GBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalStorageInGBs")
        private Integer totalStorageInGBs;

        /**
         * Storage size needed for Exascale in GBs.
         * @param totalStorageInGBs the value to set
         * @return this builder
         **/
        public Builder totalStorageInGBs(Integer totalStorageInGBs) {
            this.totalStorageInGBs = totalStorageInGBs;
            this.__explicitlySet__.add("totalStorageInGBs");
            return this;
        }
        /**
         * Available storage size for Exascale in GBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availableStorageInGBs")
        private Integer availableStorageInGBs;

        /**
         * Available storage size for Exascale in GBs.
         * @param availableStorageInGBs the value to set
         * @return this builder
         **/
        public Builder availableStorageInGBs(Integer availableStorageInGBs) {
            this.availableStorageInGBs = availableStorageInGBs;
            this.__explicitlySet__.add("availableStorageInGBs");
            return this;
        }
        /**
         * Storage size needed for VM storage on Exascale in GBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalVmStorageInGBs")
        private Integer totalVmStorageInGBs;

        /**
         * Storage size needed for VM storage on Exascale in GBs.
         * @param totalVmStorageInGBs the value to set
         * @return this builder
         **/
        public Builder totalVmStorageInGBs(Integer totalVmStorageInGBs) {
            this.totalVmStorageInGBs = totalVmStorageInGBs;
            this.__explicitlySet__.add("totalVmStorageInGBs");
            return this;
        }
        /**
         * Available storage size for VM storage on Exascale in GBs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availableVmStorageInGBs")
        private Integer availableVmStorageInGBs;

        /**
         * Available storage size for VM storage on Exascale in GBs.
         * @param availableVmStorageInGBs the value to set
         * @return this builder
         **/
        public Builder availableVmStorageInGBs(Integer availableVmStorageInGBs) {
            this.availableVmStorageInGBs = availableVmStorageInGBs;
            this.__explicitlySet__.add("availableVmStorageInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExascaleConfigDetails build() {
            ExascaleConfigDetails model =
                    new ExascaleConfigDetails(
                            this.totalStorageInGBs,
                            this.availableStorageInGBs,
                            this.totalVmStorageInGBs,
                            this.availableVmStorageInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExascaleConfigDetails model) {
            if (model.wasPropertyExplicitlySet("totalStorageInGBs")) {
                this.totalStorageInGBs(model.getTotalStorageInGBs());
            }
            if (model.wasPropertyExplicitlySet("availableStorageInGBs")) {
                this.availableStorageInGBs(model.getAvailableStorageInGBs());
            }
            if (model.wasPropertyExplicitlySet("totalVmStorageInGBs")) {
                this.totalVmStorageInGBs(model.getTotalVmStorageInGBs());
            }
            if (model.wasPropertyExplicitlySet("availableVmStorageInGBs")) {
                this.availableVmStorageInGBs(model.getAvailableVmStorageInGBs());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Storage size needed for Exascale in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalStorageInGBs")
    private final Integer totalStorageInGBs;

    /**
     * Storage size needed for Exascale in GBs.
     * @return the value
     **/
    public Integer getTotalStorageInGBs() {
        return totalStorageInGBs;
    }

    /**
     * Available storage size for Exascale in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableStorageInGBs")
    private final Integer availableStorageInGBs;

    /**
     * Available storage size for Exascale in GBs.
     * @return the value
     **/
    public Integer getAvailableStorageInGBs() {
        return availableStorageInGBs;
    }

    /**
     * Storage size needed for VM storage on Exascale in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalVmStorageInGBs")
    private final Integer totalVmStorageInGBs;

    /**
     * Storage size needed for VM storage on Exascale in GBs.
     * @return the value
     **/
    public Integer getTotalVmStorageInGBs() {
        return totalVmStorageInGBs;
    }

    /**
     * Available storage size for VM storage on Exascale in GBs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availableVmStorageInGBs")
    private final Integer availableVmStorageInGBs;

    /**
     * Available storage size for VM storage on Exascale in GBs.
     * @return the value
     **/
    public Integer getAvailableVmStorageInGBs() {
        return availableVmStorageInGBs;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExascaleConfigDetails(");
        sb.append("super=").append(super.toString());
        sb.append("totalStorageInGBs=").append(String.valueOf(this.totalStorageInGBs));
        sb.append(", availableStorageInGBs=").append(String.valueOf(this.availableStorageInGBs));
        sb.append(", totalVmStorageInGBs=").append(String.valueOf(this.totalVmStorageInGBs));
        sb.append(", availableVmStorageInGBs=")
                .append(String.valueOf(this.availableVmStorageInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExascaleConfigDetails)) {
            return false;
        }

        ExascaleConfigDetails other = (ExascaleConfigDetails) o;
        return java.util.Objects.equals(this.totalStorageInGBs, other.totalStorageInGBs)
                && java.util.Objects.equals(this.availableStorageInGBs, other.availableStorageInGBs)
                && java.util.Objects.equals(this.totalVmStorageInGBs, other.totalVmStorageInGBs)
                && java.util.Objects.equals(
                        this.availableVmStorageInGBs, other.availableVmStorageInGBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.totalStorageInGBs == null ? 43 : this.totalStorageInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.availableStorageInGBs == null
                                ? 43
                                : this.availableStorageInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.totalVmStorageInGBs == null
                                ? 43
                                : this.totalVmStorageInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.availableVmStorageInGBs == null
                                ? 43
                                : this.availableVmStorageInGBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
