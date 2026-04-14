/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.demandsignal.model;

/**
 * Configuration for COMPUTE <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ComputeResourceConfiguration.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "resource")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ComputeResourceConfiguration extends BaseResourceConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The shape of the compute instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * The shape of the compute instance.
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** The hardware generation of the compute resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("computeHwGeneration")
        private String computeHwGeneration;

        /**
         * The hardware generation of the compute resource.
         *
         * @param computeHwGeneration the value to set
         * @return this builder
         */
        public Builder computeHwGeneration(String computeHwGeneration) {
            this.computeHwGeneration = computeHwGeneration;
            this.__explicitlySet__.add("computeHwGeneration");
            return this;
        }
        /** The type of usage for the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("usageType")
        private String usageType;

        /**
         * The type of usage for the resource.
         *
         * @param usageType the value to set
         * @return this builder
         */
        public Builder usageType(String usageType) {
            this.usageType = usageType;
            this.__explicitlySet__.add("usageType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ComputeResourceConfiguration build() {
            ComputeResourceConfiguration model =
                    new ComputeResourceConfiguration(
                            this.shape, this.computeHwGeneration, this.usageType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ComputeResourceConfiguration model) {
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("computeHwGeneration")) {
                this.computeHwGeneration(model.getComputeHwGeneration());
            }
            if (model.wasPropertyExplicitlySet("usageType")) {
                this.usageType(model.getUsageType());
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

    @Deprecated
    public ComputeResourceConfiguration(
            String shape, String computeHwGeneration, String usageType) {
        super();
        this.shape = shape;
        this.computeHwGeneration = computeHwGeneration;
        this.usageType = usageType;
    }

    /** The shape of the compute instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * The shape of the compute instance.
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /** The hardware generation of the compute resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("computeHwGeneration")
    private final String computeHwGeneration;

    /**
     * The hardware generation of the compute resource.
     *
     * @return the value
     */
    public String getComputeHwGeneration() {
        return computeHwGeneration;
    }

    /** The type of usage for the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("usageType")
    private final String usageType;

    /**
     * The type of usage for the resource.
     *
     * @return the value
     */
    public String getUsageType() {
        return usageType;
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
        sb.append("ComputeResourceConfiguration(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", computeHwGeneration=").append(String.valueOf(this.computeHwGeneration));
        sb.append(", usageType=").append(String.valueOf(this.usageType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ComputeResourceConfiguration)) {
            return false;
        }

        ComputeResourceConfiguration other = (ComputeResourceConfiguration) o;
        return java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.computeHwGeneration, other.computeHwGeneration)
                && java.util.Objects.equals(this.usageType, other.usageType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.computeHwGeneration == null
                                ? 43
                                : this.computeHwGeneration.hashCode());
        result = (result * PRIME) + (this.usageType == null ? 43 : this.usageType.hashCode());
        return result;
    }
}
