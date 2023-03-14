/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * Pod shape. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PodShapeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class PodShapeSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "processorDescription",
        "ocpuOptions",
        "memoryOptions",
        "networkBandwidthOptions"
    })
    public PodShapeSummary(
            String name,
            String processorDescription,
            java.util.List<ShapeOcpuOptions> ocpuOptions,
            java.util.List<ShapeMemoryOptions> memoryOptions,
            java.util.List<ShapeNetworkBandwidthOptions> networkBandwidthOptions) {
        super();
        this.name = name;
        this.processorDescription = processorDescription;
        this.ocpuOptions = ocpuOptions;
        this.memoryOptions = memoryOptions;
        this.networkBandwidthOptions = networkBandwidthOptions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the identifying shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the identifying shape.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** A short description of the VM's processor (CPU). */
        @com.fasterxml.jackson.annotation.JsonProperty("processorDescription")
        private String processorDescription;

        /**
         * A short description of the VM's processor (CPU).
         *
         * @param processorDescription the value to set
         * @return this builder
         */
        public Builder processorDescription(String processorDescription) {
            this.processorDescription = processorDescription;
            this.__explicitlySet__.add("processorDescription");
            return this;
        }
        /** Options for OCPU shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpuOptions")
        private java.util.List<ShapeOcpuOptions> ocpuOptions;

        /**
         * Options for OCPU shape.
         *
         * @param ocpuOptions the value to set
         * @return this builder
         */
        public Builder ocpuOptions(java.util.List<ShapeOcpuOptions> ocpuOptions) {
            this.ocpuOptions = ocpuOptions;
            this.__explicitlySet__.add("ocpuOptions");
            return this;
        }
        /** ShapeMemoryOptions. */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryOptions")
        private java.util.List<ShapeMemoryOptions> memoryOptions;

        /**
         * ShapeMemoryOptions.
         *
         * @param memoryOptions the value to set
         * @return this builder
         */
        public Builder memoryOptions(java.util.List<ShapeMemoryOptions> memoryOptions) {
            this.memoryOptions = memoryOptions;
            this.__explicitlySet__.add("memoryOptions");
            return this;
        }
        /** ShapeNetworkBandwidthOptions. */
        @com.fasterxml.jackson.annotation.JsonProperty("networkBandwidthOptions")
        private java.util.List<ShapeNetworkBandwidthOptions> networkBandwidthOptions;

        /**
         * ShapeNetworkBandwidthOptions.
         *
         * @param networkBandwidthOptions the value to set
         * @return this builder
         */
        public Builder networkBandwidthOptions(
                java.util.List<ShapeNetworkBandwidthOptions> networkBandwidthOptions) {
            this.networkBandwidthOptions = networkBandwidthOptions;
            this.__explicitlySet__.add("networkBandwidthOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PodShapeSummary build() {
            PodShapeSummary model =
                    new PodShapeSummary(
                            this.name,
                            this.processorDescription,
                            this.ocpuOptions,
                            this.memoryOptions,
                            this.networkBandwidthOptions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PodShapeSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("processorDescription")) {
                this.processorDescription(model.getProcessorDescription());
            }
            if (model.wasPropertyExplicitlySet("ocpuOptions")) {
                this.ocpuOptions(model.getOcpuOptions());
            }
            if (model.wasPropertyExplicitlySet("memoryOptions")) {
                this.memoryOptions(model.getMemoryOptions());
            }
            if (model.wasPropertyExplicitlySet("networkBandwidthOptions")) {
                this.networkBandwidthOptions(model.getNetworkBandwidthOptions());
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

    /** The name of the identifying shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the identifying shape.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** A short description of the VM's processor (CPU). */
    @com.fasterxml.jackson.annotation.JsonProperty("processorDescription")
    private final String processorDescription;

    /**
     * A short description of the VM's processor (CPU).
     *
     * @return the value
     */
    public String getProcessorDescription() {
        return processorDescription;
    }

    /** Options for OCPU shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpuOptions")
    private final java.util.List<ShapeOcpuOptions> ocpuOptions;

    /**
     * Options for OCPU shape.
     *
     * @return the value
     */
    public java.util.List<ShapeOcpuOptions> getOcpuOptions() {
        return ocpuOptions;
    }

    /** ShapeMemoryOptions. */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryOptions")
    private final java.util.List<ShapeMemoryOptions> memoryOptions;

    /**
     * ShapeMemoryOptions.
     *
     * @return the value
     */
    public java.util.List<ShapeMemoryOptions> getMemoryOptions() {
        return memoryOptions;
    }

    /** ShapeNetworkBandwidthOptions. */
    @com.fasterxml.jackson.annotation.JsonProperty("networkBandwidthOptions")
    private final java.util.List<ShapeNetworkBandwidthOptions> networkBandwidthOptions;

    /**
     * ShapeNetworkBandwidthOptions.
     *
     * @return the value
     */
    public java.util.List<ShapeNetworkBandwidthOptions> getNetworkBandwidthOptions() {
        return networkBandwidthOptions;
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
        sb.append("PodShapeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", processorDescription=").append(String.valueOf(this.processorDescription));
        sb.append(", ocpuOptions=").append(String.valueOf(this.ocpuOptions));
        sb.append(", memoryOptions=").append(String.valueOf(this.memoryOptions));
        sb.append(", networkBandwidthOptions=")
                .append(String.valueOf(this.networkBandwidthOptions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PodShapeSummary)) {
            return false;
        }

        PodShapeSummary other = (PodShapeSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.processorDescription, other.processorDescription)
                && java.util.Objects.equals(this.ocpuOptions, other.ocpuOptions)
                && java.util.Objects.equals(this.memoryOptions, other.memoryOptions)
                && java.util.Objects.equals(
                        this.networkBandwidthOptions, other.networkBandwidthOptions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.processorDescription == null
                                ? 43
                                : this.processorDescription.hashCode());
        result = (result * PRIME) + (this.ocpuOptions == null ? 43 : this.ocpuOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryOptions == null ? 43 : this.memoryOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.networkBandwidthOptions == null
                                ? 43
                                : this.networkBandwidthOptions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
