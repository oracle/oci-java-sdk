/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * Details about a shape for a container Instance. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ContainerInstanceShapeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ContainerInstanceShapeSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "processorDescription",
        "ocpuOptions",
        "memoryOptions",
        "networkingBandwidthOptions"
    })
    public ContainerInstanceShapeSummary(
            String name,
            String processorDescription,
            ShapeOcpuOptions ocpuOptions,
            ShapeMemoryOptions memoryOptions,
            ShapeNetworkingBandwidthOptions networkingBandwidthOptions) {
        super();
        this.name = name;
        this.processorDescription = processorDescription;
        this.ocpuOptions = ocpuOptions;
        this.memoryOptions = memoryOptions;
        this.networkingBandwidthOptions = networkingBandwidthOptions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name identifying the shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name identifying the shape.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** A short description of the Instance's processor (CPU). */
        @com.fasterxml.jackson.annotation.JsonProperty("processorDescription")
        private String processorDescription;

        /**
         * A short description of the Instance's processor (CPU).
         *
         * @param processorDescription the value to set
         * @return this builder
         */
        public Builder processorDescription(String processorDescription) {
            this.processorDescription = processorDescription;
            this.__explicitlySet__.add("processorDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ocpuOptions")
        private ShapeOcpuOptions ocpuOptions;

        public Builder ocpuOptions(ShapeOcpuOptions ocpuOptions) {
            this.ocpuOptions = ocpuOptions;
            this.__explicitlySet__.add("ocpuOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("memoryOptions")
        private ShapeMemoryOptions memoryOptions;

        public Builder memoryOptions(ShapeMemoryOptions memoryOptions) {
            this.memoryOptions = memoryOptions;
            this.__explicitlySet__.add("memoryOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkingBandwidthOptions")
        private ShapeNetworkingBandwidthOptions networkingBandwidthOptions;

        public Builder networkingBandwidthOptions(
                ShapeNetworkingBandwidthOptions networkingBandwidthOptions) {
            this.networkingBandwidthOptions = networkingBandwidthOptions;
            this.__explicitlySet__.add("networkingBandwidthOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerInstanceShapeSummary build() {
            ContainerInstanceShapeSummary model =
                    new ContainerInstanceShapeSummary(
                            this.name,
                            this.processorDescription,
                            this.ocpuOptions,
                            this.memoryOptions,
                            this.networkingBandwidthOptions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerInstanceShapeSummary model) {
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
            if (model.wasPropertyExplicitlySet("networkingBandwidthOptions")) {
                this.networkingBandwidthOptions(model.getNetworkingBandwidthOptions());
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

    /** The name identifying the shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name identifying the shape.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** A short description of the Instance's processor (CPU). */
    @com.fasterxml.jackson.annotation.JsonProperty("processorDescription")
    private final String processorDescription;

    /**
     * A short description of the Instance's processor (CPU).
     *
     * @return the value
     */
    public String getProcessorDescription() {
        return processorDescription;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ocpuOptions")
    private final ShapeOcpuOptions ocpuOptions;

    public ShapeOcpuOptions getOcpuOptions() {
        return ocpuOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("memoryOptions")
    private final ShapeMemoryOptions memoryOptions;

    public ShapeMemoryOptions getMemoryOptions() {
        return memoryOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkingBandwidthOptions")
    private final ShapeNetworkingBandwidthOptions networkingBandwidthOptions;

    public ShapeNetworkingBandwidthOptions getNetworkingBandwidthOptions() {
        return networkingBandwidthOptions;
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
        sb.append("ContainerInstanceShapeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", processorDescription=").append(String.valueOf(this.processorDescription));
        sb.append(", ocpuOptions=").append(String.valueOf(this.ocpuOptions));
        sb.append(", memoryOptions=").append(String.valueOf(this.memoryOptions));
        sb.append(", networkingBandwidthOptions=")
                .append(String.valueOf(this.networkingBandwidthOptions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContainerInstanceShapeSummary)) {
            return false;
        }

        ContainerInstanceShapeSummary other = (ContainerInstanceShapeSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.processorDescription, other.processorDescription)
                && java.util.Objects.equals(this.ocpuOptions, other.ocpuOptions)
                && java.util.Objects.equals(this.memoryOptions, other.memoryOptions)
                && java.util.Objects.equals(
                        this.networkingBandwidthOptions, other.networkingBandwidthOptions)
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
                        + (this.networkingBandwidthOptions == null
                                ? 43
                                : this.networkingBandwidthOptions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
