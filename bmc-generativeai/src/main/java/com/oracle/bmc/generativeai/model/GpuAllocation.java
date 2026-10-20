/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * GPU allocation details for an underlying capacity allocation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = GpuAllocation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GpuAllocation extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"usedGpus", "availableGpus"})
    public GpuAllocation(Integer usedGpus, Integer availableGpus) {
        super();
        this.usedGpus = usedGpus;
        this.availableGpus = availableGpus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The number of used GPUs in this allocation. */
        @com.fasterxml.jackson.annotation.JsonProperty("usedGpus")
        private Integer usedGpus;

        /**
         * The number of used GPUs in this allocation.
         *
         * @param usedGpus the value to set
         * @return this builder
         */
        public Builder usedGpus(Integer usedGpus) {
            this.usedGpus = usedGpus;
            this.__explicitlySet__.add("usedGpus");
            return this;
        }
        /** The number of available GPUs in this allocation. */
        @com.fasterxml.jackson.annotation.JsonProperty("availableGpus")
        private Integer availableGpus;

        /**
         * The number of available GPUs in this allocation.
         *
         * @param availableGpus the value to set
         * @return this builder
         */
        public Builder availableGpus(Integer availableGpus) {
            this.availableGpus = availableGpus;
            this.__explicitlySet__.add("availableGpus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GpuAllocation build() {
            GpuAllocation model = new GpuAllocation(this.usedGpus, this.availableGpus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GpuAllocation model) {
            if (model.wasPropertyExplicitlySet("usedGpus")) {
                this.usedGpus(model.getUsedGpus());
            }
            if (model.wasPropertyExplicitlySet("availableGpus")) {
                this.availableGpus(model.getAvailableGpus());
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

    /** The number of used GPUs in this allocation. */
    @com.fasterxml.jackson.annotation.JsonProperty("usedGpus")
    private final Integer usedGpus;

    /**
     * The number of used GPUs in this allocation.
     *
     * @return the value
     */
    public Integer getUsedGpus() {
        return usedGpus;
    }

    /** The number of available GPUs in this allocation. */
    @com.fasterxml.jackson.annotation.JsonProperty("availableGpus")
    private final Integer availableGpus;

    /**
     * The number of available GPUs in this allocation.
     *
     * @return the value
     */
    public Integer getAvailableGpus() {
        return availableGpus;
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
        sb.append("GpuAllocation(");
        sb.append("super=").append(super.toString());
        sb.append("usedGpus=").append(String.valueOf(this.usedGpus));
        sb.append(", availableGpus=").append(String.valueOf(this.availableGpus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GpuAllocation)) {
            return false;
        }

        GpuAllocation other = (GpuAllocation) o;
        return java.util.Objects.equals(this.usedGpus, other.usedGpus)
                && java.util.Objects.equals(this.availableGpus, other.availableGpus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.usedGpus == null ? 43 : this.usedGpus.hashCode());
        result =
                (result * PRIME)
                        + (this.availableGpus == null ? 43 : this.availableGpus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
