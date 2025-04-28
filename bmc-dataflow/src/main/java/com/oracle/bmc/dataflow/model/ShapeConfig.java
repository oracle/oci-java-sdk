/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.model;

/**
 * This is used to configure the shape of the driver or executor if a flexible shape is used. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ShapeConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ShapeConfig extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ocpus", "memoryInGBs"})
    public ShapeConfig(java.math.BigDecimal ocpus, java.math.BigDecimal memoryInGBs) {
        super();
        this.ocpus = ocpus;
        this.memoryInGBs = memoryInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The total number of OCPUs used for the driver or executors. See
         * [here](https://docs.oracle.com/iaas/en-us/iaas/api/#/en/iaas/20160918/Shape/) for
         * details.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
        private java.math.BigDecimal ocpus;

        /**
         * The total number of OCPUs used for the driver or executors. See
         * [here](https://docs.oracle.com/iaas/en-us/iaas/api/#/en/iaas/20160918/Shape/) for
         * details.
         *
         * @param ocpus the value to set
         * @return this builder
         */
        public Builder ocpus(java.math.BigDecimal ocpus) {
            this.ocpus = ocpus;
            this.__explicitlySet__.add("ocpus");
            return this;
        }
        /** The amount of memory used for the driver or executors. */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
        private java.math.BigDecimal memoryInGBs;

        /**
         * The amount of memory used for the driver or executors.
         *
         * @param memoryInGBs the value to set
         * @return this builder
         */
        public Builder memoryInGBs(java.math.BigDecimal memoryInGBs) {
            this.memoryInGBs = memoryInGBs;
            this.__explicitlySet__.add("memoryInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShapeConfig build() {
            ShapeConfig model = new ShapeConfig(this.ocpus, this.memoryInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShapeConfig model) {
            if (model.wasPropertyExplicitlySet("ocpus")) {
                this.ocpus(model.getOcpus());
            }
            if (model.wasPropertyExplicitlySet("memoryInGBs")) {
                this.memoryInGBs(model.getMemoryInGBs());
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
     * The total number of OCPUs used for the driver or executors. See
     * [here](https://docs.oracle.com/iaas/en-us/iaas/api/#/en/iaas/20160918/Shape/) for details.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
    private final java.math.BigDecimal ocpus;

    /**
     * The total number of OCPUs used for the driver or executors. See
     * [here](https://docs.oracle.com/iaas/en-us/iaas/api/#/en/iaas/20160918/Shape/) for details.
     *
     * @return the value
     */
    public java.math.BigDecimal getOcpus() {
        return ocpus;
    }

    /** The amount of memory used for the driver or executors. */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
    private final java.math.BigDecimal memoryInGBs;

    /**
     * The amount of memory used for the driver or executors.
     *
     * @return the value
     */
    public java.math.BigDecimal getMemoryInGBs() {
        return memoryInGBs;
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
        sb.append("ShapeConfig(");
        sb.append("super=").append(super.toString());
        sb.append("ocpus=").append(String.valueOf(this.ocpus));
        sb.append(", memoryInGBs=").append(String.valueOf(this.memoryInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ShapeConfig)) {
            return false;
        }

        ShapeConfig other = (ShapeConfig) o;
        return java.util.Objects.equals(this.ocpus, other.ocpus)
                && java.util.Objects.equals(this.memoryInGBs, other.memoryInGBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ocpus == null ? 43 : this.ocpus.hashCode());
        result = (result * PRIME) + (this.memoryInGBs == null ? 43 : this.memoryInGBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
