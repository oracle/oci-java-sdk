/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.clusterplacementgroups.model;

/**
 * Additional details about the COMPUTE capability.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AdditionalComputeCapabilityDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "serviceType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AdditionalComputeCapabilityDetails extends AdditionalCapabilityDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The amount of memory (in GBs) needed in the instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
        private Float memoryInGBs;

        /**
         * The amount of memory (in GBs) needed in the instance.
         * @param memoryInGBs the value to set
         * @return this builder
         **/
        public Builder memoryInGBs(Float memoryInGBs) {
            this.memoryInGBs = memoryInGBs;
            this.__explicitlySet__.add("memoryInGBs");
            return this;
        }
        /**
         * The number of OCPUs needed in the instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
        private Float ocpus;

        /**
         * The number of OCPUs needed in the instance.
         * @param ocpus the value to set
         * @return this builder
         **/
        public Builder ocpus(Float ocpus) {
            this.ocpus = ocpus;
            this.__explicitlySet__.add("ocpus");
            return this;
        }
        /**
         * The number of NVMe drives to use for storage.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nvmes")
        private Integer nvmes;

        /**
         * The number of NVMe drives to use for storage.
         *
         * @param nvmes the value to set
         * @return this builder
         **/
        public Builder nvmes(Integer nvmes) {
            this.nvmes = nvmes;
            this.__explicitlySet__.add("nvmes");
            return this;
        }
        /**
         * The number of instances or size of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("count")
        private Integer count;

        /**
         * The number of instances or size of the resource.
         * @param count the value to set
         * @return this builder
         **/
        public Builder count(Integer count) {
            this.count = count;
            this.__explicitlySet__.add("count");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdditionalComputeCapabilityDetails build() {
            AdditionalComputeCapabilityDetails model =
                    new AdditionalComputeCapabilityDetails(
                            this.memoryInGBs, this.ocpus, this.nvmes, this.count);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdditionalComputeCapabilityDetails model) {
            if (model.wasPropertyExplicitlySet("memoryInGBs")) {
                this.memoryInGBs(model.getMemoryInGBs());
            }
            if (model.wasPropertyExplicitlySet("ocpus")) {
                this.ocpus(model.getOcpus());
            }
            if (model.wasPropertyExplicitlySet("nvmes")) {
                this.nvmes(model.getNvmes());
            }
            if (model.wasPropertyExplicitlySet("count")) {
                this.count(model.getCount());
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

    @Deprecated
    public AdditionalComputeCapabilityDetails(
            Float memoryInGBs, Float ocpus, Integer nvmes, Integer count) {
        super();
        this.memoryInGBs = memoryInGBs;
        this.ocpus = ocpus;
        this.nvmes = nvmes;
        this.count = count;
    }

    /**
     * The amount of memory (in GBs) needed in the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
    private final Float memoryInGBs;

    /**
     * The amount of memory (in GBs) needed in the instance.
     * @return the value
     **/
    public Float getMemoryInGBs() {
        return memoryInGBs;
    }

    /**
     * The number of OCPUs needed in the instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
    private final Float ocpus;

    /**
     * The number of OCPUs needed in the instance.
     * @return the value
     **/
    public Float getOcpus() {
        return ocpus;
    }

    /**
     * The number of NVMe drives to use for storage.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nvmes")
    private final Integer nvmes;

    /**
     * The number of NVMe drives to use for storage.
     *
     * @return the value
     **/
    public Integer getNvmes() {
        return nvmes;
    }

    /**
     * The number of instances or size of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("count")
    private final Integer count;

    /**
     * The number of instances or size of the resource.
     * @return the value
     **/
    public Integer getCount() {
        return count;
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
        sb.append("AdditionalComputeCapabilityDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", memoryInGBs=").append(String.valueOf(this.memoryInGBs));
        sb.append(", ocpus=").append(String.valueOf(this.ocpus));
        sb.append(", nvmes=").append(String.valueOf(this.nvmes));
        sb.append(", count=").append(String.valueOf(this.count));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdditionalComputeCapabilityDetails)) {
            return false;
        }

        AdditionalComputeCapabilityDetails other = (AdditionalComputeCapabilityDetails) o;
        return java.util.Objects.equals(this.memoryInGBs, other.memoryInGBs)
                && java.util.Objects.equals(this.ocpus, other.ocpus)
                && java.util.Objects.equals(this.nvmes, other.nvmes)
                && java.util.Objects.equals(this.count, other.count)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.memoryInGBs == null ? 43 : this.memoryInGBs.hashCode());
        result = (result * PRIME) + (this.ocpus == null ? 43 : this.ocpus.hashCode());
        result = (result * PRIME) + (this.nvmes == null ? 43 : this.nvmes.hashCode());
        result = (result * PRIME) + (this.count == null ? 43 : this.count.hashCode());
        return result;
    }
}
