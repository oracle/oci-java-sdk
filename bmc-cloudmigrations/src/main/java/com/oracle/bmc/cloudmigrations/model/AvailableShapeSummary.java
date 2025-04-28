/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Sumarized information about a shape. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AvailableShapeSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AvailableShapeSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "availabilityDomain",
        "paginationToken",
        "minTotalBaselineOcpusRequired",
        "shape",
        "processorDescription",
        "ocpus",
        "memoryInGBs",
        "networkingBandwidthInGbps",
        "maxVnicAttachments",
        "gpus",
        "gpuDescription",
        "localDisks",
        "localDisksTotalSizeInGBs",
        "localDiskDescription",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public AvailableShapeSummary(
            String availabilityDomain,
            String paginationToken,
            java.math.BigDecimal minTotalBaselineOcpusRequired,
            String shape,
            String processorDescription,
            Float ocpus,
            Float memoryInGBs,
            Float networkingBandwidthInGbps,
            Integer maxVnicAttachments,
            Integer gpus,
            String gpuDescription,
            Integer localDisks,
            Float localDisksTotalSizeInGBs,
            String localDiskDescription,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.availabilityDomain = availabilityDomain;
        this.paginationToken = paginationToken;
        this.minTotalBaselineOcpusRequired = minTotalBaselineOcpusRequired;
        this.shape = shape;
        this.processorDescription = processorDescription;
        this.ocpus = ocpus;
        this.memoryInGBs = memoryInGBs;
        this.networkingBandwidthInGbps = networkingBandwidthInGbps;
        this.maxVnicAttachments = maxVnicAttachments;
        this.gpus = gpus;
        this.gpuDescription = gpuDescription;
        this.localDisks = localDisks;
        this.localDisksTotalSizeInGBs = localDisksTotalSizeInGBs;
        this.localDiskDescription = localDiskDescription;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Availability domain of the shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * Availability domain of the shape.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /** Shape name and availability domain. Used for pagination. */
        @com.fasterxml.jackson.annotation.JsonProperty("paginationToken")
        private String paginationToken;

        /**
         * Shape name and availability domain. Used for pagination.
         *
         * @param paginationToken the value to set
         * @return this builder
         */
        public Builder paginationToken(String paginationToken) {
            this.paginationToken = paginationToken;
            this.__explicitlySet__.add("paginationToken");
            return this;
        }
        /** Minimum CPUs required. */
        @com.fasterxml.jackson.annotation.JsonProperty("minTotalBaselineOcpusRequired")
        private java.math.BigDecimal minTotalBaselineOcpusRequired;

        /**
         * Minimum CPUs required.
         *
         * @param minTotalBaselineOcpusRequired the value to set
         * @return this builder
         */
        public Builder minTotalBaselineOcpusRequired(
                java.math.BigDecimal minTotalBaselineOcpusRequired) {
            this.minTotalBaselineOcpusRequired = minTotalBaselineOcpusRequired;
            this.__explicitlySet__.add("minTotalBaselineOcpusRequired");
            return this;
        }
        /** Name of the shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * Name of the shape.
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /** Description of the processor. */
        @com.fasterxml.jackson.annotation.JsonProperty("processorDescription")
        private String processorDescription;

        /**
         * Description of the processor.
         *
         * @param processorDescription the value to set
         * @return this builder
         */
        public Builder processorDescription(String processorDescription) {
            this.processorDescription = processorDescription;
            this.__explicitlySet__.add("processorDescription");
            return this;
        }
        /** Number of CPUs. */
        @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
        private Float ocpus;

        /**
         * Number of CPUs.
         *
         * @param ocpus the value to set
         * @return this builder
         */
        public Builder ocpus(Float ocpus) {
            this.ocpus = ocpus;
            this.__explicitlySet__.add("ocpus");
            return this;
        }
        /** Amount of memory for the shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
        private Float memoryInGBs;

        /**
         * Amount of memory for the shape.
         *
         * @param memoryInGBs the value to set
         * @return this builder
         */
        public Builder memoryInGBs(Float memoryInGBs) {
            this.memoryInGBs = memoryInGBs;
            this.__explicitlySet__.add("memoryInGBs");
            return this;
        }
        /** Shape bandwidth. */
        @com.fasterxml.jackson.annotation.JsonProperty("networkingBandwidthInGbps")
        private Float networkingBandwidthInGbps;

        /**
         * Shape bandwidth.
         *
         * @param networkingBandwidthInGbps the value to set
         * @return this builder
         */
        public Builder networkingBandwidthInGbps(Float networkingBandwidthInGbps) {
            this.networkingBandwidthInGbps = networkingBandwidthInGbps;
            this.__explicitlySet__.add("networkingBandwidthInGbps");
            return this;
        }
        /** Maximum number of virtual network interfaces that can be attached. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxVnicAttachments")
        private Integer maxVnicAttachments;

        /**
         * Maximum number of virtual network interfaces that can be attached.
         *
         * @param maxVnicAttachments the value to set
         * @return this builder
         */
        public Builder maxVnicAttachments(Integer maxVnicAttachments) {
            this.maxVnicAttachments = maxVnicAttachments;
            this.__explicitlySet__.add("maxVnicAttachments");
            return this;
        }
        /** Number of GPUs. */
        @com.fasterxml.jackson.annotation.JsonProperty("gpus")
        private Integer gpus;

        /**
         * Number of GPUs.
         *
         * @param gpus the value to set
         * @return this builder
         */
        public Builder gpus(Integer gpus) {
            this.gpus = gpus;
            this.__explicitlySet__.add("gpus");
            return this;
        }
        /** Description of the GPUs. */
        @com.fasterxml.jackson.annotation.JsonProperty("gpuDescription")
        private String gpuDescription;

        /**
         * Description of the GPUs.
         *
         * @param gpuDescription the value to set
         * @return this builder
         */
        public Builder gpuDescription(String gpuDescription) {
            this.gpuDescription = gpuDescription;
            this.__explicitlySet__.add("gpuDescription");
            return this;
        }
        /** Number of local disks. */
        @com.fasterxml.jackson.annotation.JsonProperty("localDisks")
        private Integer localDisks;

        /**
         * Number of local disks.
         *
         * @param localDisks the value to set
         * @return this builder
         */
        public Builder localDisks(Integer localDisks) {
            this.localDisks = localDisks;
            this.__explicitlySet__.add("localDisks");
            return this;
        }
        /** Total size of local disks for shape. */
        @com.fasterxml.jackson.annotation.JsonProperty("localDisksTotalSizeInGBs")
        private Float localDisksTotalSizeInGBs;

        /**
         * Total size of local disks for shape.
         *
         * @param localDisksTotalSizeInGBs the value to set
         * @return this builder
         */
        public Builder localDisksTotalSizeInGBs(Float localDisksTotalSizeInGBs) {
            this.localDisksTotalSizeInGBs = localDisksTotalSizeInGBs;
            this.__explicitlySet__.add("localDisksTotalSizeInGBs");
            return this;
        }
        /** Description of local disks. */
        @com.fasterxml.jackson.annotation.JsonProperty("localDiskDescription")
        private String localDiskDescription;

        /**
         * Description of local disks.
         *
         * @param localDiskDescription the value to set
         * @return this builder
         */
        public Builder localDiskDescription(String localDiskDescription) {
            this.localDiskDescription = localDiskDescription;
            this.__explicitlySet__.add("localDiskDescription");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. It
         * exists only for cross-compatibility. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. It
         * exists only for cross-compatibility. Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AvailableShapeSummary build() {
            AvailableShapeSummary model =
                    new AvailableShapeSummary(
                            this.availabilityDomain,
                            this.paginationToken,
                            this.minTotalBaselineOcpusRequired,
                            this.shape,
                            this.processorDescription,
                            this.ocpus,
                            this.memoryInGBs,
                            this.networkingBandwidthInGbps,
                            this.maxVnicAttachments,
                            this.gpus,
                            this.gpuDescription,
                            this.localDisks,
                            this.localDisksTotalSizeInGBs,
                            this.localDiskDescription,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AvailableShapeSummary model) {
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("paginationToken")) {
                this.paginationToken(model.getPaginationToken());
            }
            if (model.wasPropertyExplicitlySet("minTotalBaselineOcpusRequired")) {
                this.minTotalBaselineOcpusRequired(model.getMinTotalBaselineOcpusRequired());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("processorDescription")) {
                this.processorDescription(model.getProcessorDescription());
            }
            if (model.wasPropertyExplicitlySet("ocpus")) {
                this.ocpus(model.getOcpus());
            }
            if (model.wasPropertyExplicitlySet("memoryInGBs")) {
                this.memoryInGBs(model.getMemoryInGBs());
            }
            if (model.wasPropertyExplicitlySet("networkingBandwidthInGbps")) {
                this.networkingBandwidthInGbps(model.getNetworkingBandwidthInGbps());
            }
            if (model.wasPropertyExplicitlySet("maxVnicAttachments")) {
                this.maxVnicAttachments(model.getMaxVnicAttachments());
            }
            if (model.wasPropertyExplicitlySet("gpus")) {
                this.gpus(model.getGpus());
            }
            if (model.wasPropertyExplicitlySet("gpuDescription")) {
                this.gpuDescription(model.getGpuDescription());
            }
            if (model.wasPropertyExplicitlySet("localDisks")) {
                this.localDisks(model.getLocalDisks());
            }
            if (model.wasPropertyExplicitlySet("localDisksTotalSizeInGBs")) {
                this.localDisksTotalSizeInGBs(model.getLocalDisksTotalSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("localDiskDescription")) {
                this.localDiskDescription(model.getLocalDiskDescription());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** Availability domain of the shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * Availability domain of the shape.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /** Shape name and availability domain. Used for pagination. */
    @com.fasterxml.jackson.annotation.JsonProperty("paginationToken")
    private final String paginationToken;

    /**
     * Shape name and availability domain. Used for pagination.
     *
     * @return the value
     */
    public String getPaginationToken() {
        return paginationToken;
    }

    /** Minimum CPUs required. */
    @com.fasterxml.jackson.annotation.JsonProperty("minTotalBaselineOcpusRequired")
    private final java.math.BigDecimal minTotalBaselineOcpusRequired;

    /**
     * Minimum CPUs required.
     *
     * @return the value
     */
    public java.math.BigDecimal getMinTotalBaselineOcpusRequired() {
        return minTotalBaselineOcpusRequired;
    }

    /** Name of the shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * Name of the shape.
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /** Description of the processor. */
    @com.fasterxml.jackson.annotation.JsonProperty("processorDescription")
    private final String processorDescription;

    /**
     * Description of the processor.
     *
     * @return the value
     */
    public String getProcessorDescription() {
        return processorDescription;
    }

    /** Number of CPUs. */
    @com.fasterxml.jackson.annotation.JsonProperty("ocpus")
    private final Float ocpus;

    /**
     * Number of CPUs.
     *
     * @return the value
     */
    public Float getOcpus() {
        return ocpus;
    }

    /** Amount of memory for the shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
    private final Float memoryInGBs;

    /**
     * Amount of memory for the shape.
     *
     * @return the value
     */
    public Float getMemoryInGBs() {
        return memoryInGBs;
    }

    /** Shape bandwidth. */
    @com.fasterxml.jackson.annotation.JsonProperty("networkingBandwidthInGbps")
    private final Float networkingBandwidthInGbps;

    /**
     * Shape bandwidth.
     *
     * @return the value
     */
    public Float getNetworkingBandwidthInGbps() {
        return networkingBandwidthInGbps;
    }

    /** Maximum number of virtual network interfaces that can be attached. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxVnicAttachments")
    private final Integer maxVnicAttachments;

    /**
     * Maximum number of virtual network interfaces that can be attached.
     *
     * @return the value
     */
    public Integer getMaxVnicAttachments() {
        return maxVnicAttachments;
    }

    /** Number of GPUs. */
    @com.fasterxml.jackson.annotation.JsonProperty("gpus")
    private final Integer gpus;

    /**
     * Number of GPUs.
     *
     * @return the value
     */
    public Integer getGpus() {
        return gpus;
    }

    /** Description of the GPUs. */
    @com.fasterxml.jackson.annotation.JsonProperty("gpuDescription")
    private final String gpuDescription;

    /**
     * Description of the GPUs.
     *
     * @return the value
     */
    public String getGpuDescription() {
        return gpuDescription;
    }

    /** Number of local disks. */
    @com.fasterxml.jackson.annotation.JsonProperty("localDisks")
    private final Integer localDisks;

    /**
     * Number of local disks.
     *
     * @return the value
     */
    public Integer getLocalDisks() {
        return localDisks;
    }

    /** Total size of local disks for shape. */
    @com.fasterxml.jackson.annotation.JsonProperty("localDisksTotalSizeInGBs")
    private final Float localDisksTotalSizeInGBs;

    /**
     * Total size of local disks for shape.
     *
     * @return the value
     */
    public Float getLocalDisksTotalSizeInGBs() {
        return localDisksTotalSizeInGBs;
    }

    /** Description of local disks. */
    @com.fasterxml.jackson.annotation.JsonProperty("localDiskDescription")
    private final String localDiskDescription;

    /**
     * Description of local disks.
     *
     * @return the value
     */
    public String getLocalDiskDescription() {
        return localDiskDescription;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. It exists
     * only for cross-compatibility. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. It exists
     * only for cross-compatibility. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("AvailableShapeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", paginationToken=").append(String.valueOf(this.paginationToken));
        sb.append(", minTotalBaselineOcpusRequired=")
                .append(String.valueOf(this.minTotalBaselineOcpusRequired));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", processorDescription=").append(String.valueOf(this.processorDescription));
        sb.append(", ocpus=").append(String.valueOf(this.ocpus));
        sb.append(", memoryInGBs=").append(String.valueOf(this.memoryInGBs));
        sb.append(", networkingBandwidthInGbps=")
                .append(String.valueOf(this.networkingBandwidthInGbps));
        sb.append(", maxVnicAttachments=").append(String.valueOf(this.maxVnicAttachments));
        sb.append(", gpus=").append(String.valueOf(this.gpus));
        sb.append(", gpuDescription=").append(String.valueOf(this.gpuDescription));
        sb.append(", localDisks=").append(String.valueOf(this.localDisks));
        sb.append(", localDisksTotalSizeInGBs=")
                .append(String.valueOf(this.localDisksTotalSizeInGBs));
        sb.append(", localDiskDescription=").append(String.valueOf(this.localDiskDescription));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AvailableShapeSummary)) {
            return false;
        }

        AvailableShapeSummary other = (AvailableShapeSummary) o;
        return java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.paginationToken, other.paginationToken)
                && java.util.Objects.equals(
                        this.minTotalBaselineOcpusRequired, other.minTotalBaselineOcpusRequired)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.processorDescription, other.processorDescription)
                && java.util.Objects.equals(this.ocpus, other.ocpus)
                && java.util.Objects.equals(this.memoryInGBs, other.memoryInGBs)
                && java.util.Objects.equals(
                        this.networkingBandwidthInGbps, other.networkingBandwidthInGbps)
                && java.util.Objects.equals(this.maxVnicAttachments, other.maxVnicAttachments)
                && java.util.Objects.equals(this.gpus, other.gpus)
                && java.util.Objects.equals(this.gpuDescription, other.gpuDescription)
                && java.util.Objects.equals(this.localDisks, other.localDisks)
                && java.util.Objects.equals(
                        this.localDisksTotalSizeInGBs, other.localDisksTotalSizeInGBs)
                && java.util.Objects.equals(this.localDiskDescription, other.localDiskDescription)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.paginationToken == null ? 43 : this.paginationToken.hashCode());
        result =
                (result * PRIME)
                        + (this.minTotalBaselineOcpusRequired == null
                                ? 43
                                : this.minTotalBaselineOcpusRequired.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.processorDescription == null
                                ? 43
                                : this.processorDescription.hashCode());
        result = (result * PRIME) + (this.ocpus == null ? 43 : this.ocpus.hashCode());
        result = (result * PRIME) + (this.memoryInGBs == null ? 43 : this.memoryInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.networkingBandwidthInGbps == null
                                ? 43
                                : this.networkingBandwidthInGbps.hashCode());
        result =
                (result * PRIME)
                        + (this.maxVnicAttachments == null
                                ? 43
                                : this.maxVnicAttachments.hashCode());
        result = (result * PRIME) + (this.gpus == null ? 43 : this.gpus.hashCode());
        result =
                (result * PRIME)
                        + (this.gpuDescription == null ? 43 : this.gpuDescription.hashCode());
        result = (result * PRIME) + (this.localDisks == null ? 43 : this.localDisks.hashCode());
        result =
                (result * PRIME)
                        + (this.localDisksTotalSizeInGBs == null
                                ? 43
                                : this.localDisksTotalSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.localDiskDescription == null
                                ? 43
                                : this.localDiskDescription.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
