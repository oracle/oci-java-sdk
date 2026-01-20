/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.batch.model;

/**
 * For a flexible shape, the number of OCPUs available for container instances that use this shape.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ShapeOcpuOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ShapeOcpuOptions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"maxOcpus", "minOcpus"})
    public ShapeOcpuOptions(Float maxOcpus, Float minOcpus) {
        super();
        this.maxOcpus = maxOcpus;
        this.minOcpus = minOcpus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The maximum number of OCPUs. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxOcpus")
        private Float maxOcpus;

        /**
         * The maximum number of OCPUs.
         *
         * @param maxOcpus the value to set
         * @return this builder
         */
        public Builder maxOcpus(Float maxOcpus) {
            this.maxOcpus = maxOcpus;
            this.__explicitlySet__.add("maxOcpus");
            return this;
        }
        /** The minimum number of OCPUs. */
        @com.fasterxml.jackson.annotation.JsonProperty("minOcpus")
        private Float minOcpus;

        /**
         * The minimum number of OCPUs.
         *
         * @param minOcpus the value to set
         * @return this builder
         */
        public Builder minOcpus(Float minOcpus) {
            this.minOcpus = minOcpus;
            this.__explicitlySet__.add("minOcpus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShapeOcpuOptions build() {
            ShapeOcpuOptions model = new ShapeOcpuOptions(this.maxOcpus, this.minOcpus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShapeOcpuOptions model) {
            if (model.wasPropertyExplicitlySet("maxOcpus")) {
                this.maxOcpus(model.getMaxOcpus());
            }
            if (model.wasPropertyExplicitlySet("minOcpus")) {
                this.minOcpus(model.getMinOcpus());
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

    /** The maximum number of OCPUs. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxOcpus")
    private final Float maxOcpus;

    /**
     * The maximum number of OCPUs.
     *
     * @return the value
     */
    public Float getMaxOcpus() {
        return maxOcpus;
    }

    /** The minimum number of OCPUs. */
    @com.fasterxml.jackson.annotation.JsonProperty("minOcpus")
    private final Float minOcpus;

    /**
     * The minimum number of OCPUs.
     *
     * @return the value
     */
    public Float getMinOcpus() {
        return minOcpus;
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
        sb.append("ShapeOcpuOptions(");
        sb.append("super=").append(super.toString());
        sb.append("maxOcpus=").append(String.valueOf(this.maxOcpus));
        sb.append(", minOcpus=").append(String.valueOf(this.minOcpus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ShapeOcpuOptions)) {
            return false;
        }

        ShapeOcpuOptions other = (ShapeOcpuOptions) o;
        return java.util.Objects.equals(this.maxOcpus, other.maxOcpus)
                && java.util.Objects.equals(this.minOcpus, other.minOcpus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.maxOcpus == null ? 43 : this.maxOcpus.hashCode());
        result = (result * PRIME) + (this.minOcpus == null ? 43 : this.minOcpus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
