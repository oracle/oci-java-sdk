/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Configuration summary of a EM Managed External host. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = EmManagedExternalHostConfigurationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entitySource")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class EmManagedExternalHostConfigurationSummary extends HostConfigurationSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("hostInsightId")
        private String hostInsightId;

        public Builder hostInsightId(String hostInsightId) {
            this.hostInsightId = hostInsightId;
            this.__explicitlySet__.add("hostInsightId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostName")
        private String hostName;

        public Builder hostName(String hostName) {
            this.hostName = hostName;
            this.__explicitlySet__.add("hostName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("platformType")
        private PlatformType platformType;

        public Builder platformType(PlatformType platformType) {
            this.platformType = platformType;
            this.__explicitlySet__.add("platformType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("platformVersion")
        private String platformVersion;

        public Builder platformVersion(String platformVersion) {
            this.platformVersion = platformVersion;
            this.__explicitlySet__.add("platformVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("platformVendor")
        private String platformVendor;

        public Builder platformVendor(String platformVendor) {
            this.platformVendor = platformVendor;
            this.__explicitlySet__.add("platformVendor");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalCpus")
        private Integer totalCpus;

        public Builder totalCpus(Integer totalCpus) {
            this.totalCpus = totalCpus;
            this.__explicitlySet__.add("totalCpus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalMemoryInGBs")
        private Double totalMemoryInGBs;

        public Builder totalMemoryInGBs(Double totalMemoryInGBs) {
            this.totalMemoryInGBs = totalMemoryInGBs;
            this.__explicitlySet__.add("totalMemoryInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuArchitecture")
        private String cpuArchitecture;

        public Builder cpuArchitecture(String cpuArchitecture) {
            this.cpuArchitecture = cpuArchitecture;
            this.__explicitlySet__.add("cpuArchitecture");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuCacheInMBs")
        private Double cpuCacheInMBs;

        public Builder cpuCacheInMBs(Double cpuCacheInMBs) {
            this.cpuCacheInMBs = cpuCacheInMBs;
            this.__explicitlySet__.add("cpuCacheInMBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuVendor")
        private String cpuVendor;

        public Builder cpuVendor(String cpuVendor) {
            this.cpuVendor = cpuVendor;
            this.__explicitlySet__.add("cpuVendor");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuFrequencyInMhz")
        private Double cpuFrequencyInMhz;

        public Builder cpuFrequencyInMhz(Double cpuFrequencyInMhz) {
            this.cpuFrequencyInMhz = cpuFrequencyInMhz;
            this.__explicitlySet__.add("cpuFrequencyInMhz");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cpuImplementation")
        private String cpuImplementation;

        public Builder cpuImplementation(String cpuImplementation) {
            this.cpuImplementation = cpuImplementation;
            this.__explicitlySet__.add("cpuImplementation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("coresPerSocket")
        private Integer coresPerSocket;

        public Builder coresPerSocket(Integer coresPerSocket) {
            this.coresPerSocket = coresPerSocket;
            this.__explicitlySet__.add("coresPerSocket");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalSockets")
        private Integer totalSockets;

        public Builder totalSockets(Integer totalSockets) {
            this.totalSockets = totalSockets;
            this.__explicitlySet__.add("totalSockets");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("threadsPerSocket")
        private Integer threadsPerSocket;

        public Builder threadsPerSocket(Integer threadsPerSocket) {
            this.threadsPerSocket = threadsPerSocket;
            this.__explicitlySet__.add("threadsPerSocket");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHyperThreadingEnabled")
        private Boolean isHyperThreadingEnabled;

        public Builder isHyperThreadingEnabled(Boolean isHyperThreadingEnabled) {
            this.isHyperThreadingEnabled = isHyperThreadingEnabled;
            this.__explicitlySet__.add("isHyperThreadingEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /** Enterprise Manager Unique Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerIdentifier")
        private String enterpriseManagerIdentifier;

        /**
         * Enterprise Manager Unique Identifier
         *
         * @param enterpriseManagerIdentifier the value to set
         * @return this builder
         */
        public Builder enterpriseManagerIdentifier(String enterpriseManagerIdentifier) {
            this.enterpriseManagerIdentifier = enterpriseManagerIdentifier;
            this.__explicitlySet__.add("enterpriseManagerIdentifier");
            return this;
        }
        /** OPSI Enterprise Manager Bridge OCID */
        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerBridgeId")
        private String enterpriseManagerBridgeId;

        /**
         * OPSI Enterprise Manager Bridge OCID
         *
         * @param enterpriseManagerBridgeId the value to set
         * @return this builder
         */
        public Builder enterpriseManagerBridgeId(String enterpriseManagerBridgeId) {
            this.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
            this.__explicitlySet__.add("enterpriseManagerBridgeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exadataDetails")
        private ExadataDetails exadataDetails;

        public Builder exadataDetails(ExadataDetails exadataDetails) {
            this.exadataDetails = exadataDetails;
            this.__explicitlySet__.add("exadataDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EmManagedExternalHostConfigurationSummary build() {
            EmManagedExternalHostConfigurationSummary model =
                    new EmManagedExternalHostConfigurationSummary(
                            this.hostInsightId,
                            this.compartmentId,
                            this.hostName,
                            this.platformType,
                            this.platformVersion,
                            this.platformVendor,
                            this.totalCpus,
                            this.totalMemoryInGBs,
                            this.cpuArchitecture,
                            this.cpuCacheInMBs,
                            this.cpuVendor,
                            this.cpuFrequencyInMhz,
                            this.cpuImplementation,
                            this.coresPerSocket,
                            this.totalSockets,
                            this.threadsPerSocket,
                            this.isHyperThreadingEnabled,
                            this.definedTags,
                            this.freeformTags,
                            this.enterpriseManagerIdentifier,
                            this.enterpriseManagerBridgeId,
                            this.exadataDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EmManagedExternalHostConfigurationSummary model) {
            if (model.wasPropertyExplicitlySet("hostInsightId")) {
                this.hostInsightId(model.getHostInsightId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("hostName")) {
                this.hostName(model.getHostName());
            }
            if (model.wasPropertyExplicitlySet("platformType")) {
                this.platformType(model.getPlatformType());
            }
            if (model.wasPropertyExplicitlySet("platformVersion")) {
                this.platformVersion(model.getPlatformVersion());
            }
            if (model.wasPropertyExplicitlySet("platformVendor")) {
                this.platformVendor(model.getPlatformVendor());
            }
            if (model.wasPropertyExplicitlySet("totalCpus")) {
                this.totalCpus(model.getTotalCpus());
            }
            if (model.wasPropertyExplicitlySet("totalMemoryInGBs")) {
                this.totalMemoryInGBs(model.getTotalMemoryInGBs());
            }
            if (model.wasPropertyExplicitlySet("cpuArchitecture")) {
                this.cpuArchitecture(model.getCpuArchitecture());
            }
            if (model.wasPropertyExplicitlySet("cpuCacheInMBs")) {
                this.cpuCacheInMBs(model.getCpuCacheInMBs());
            }
            if (model.wasPropertyExplicitlySet("cpuVendor")) {
                this.cpuVendor(model.getCpuVendor());
            }
            if (model.wasPropertyExplicitlySet("cpuFrequencyInMhz")) {
                this.cpuFrequencyInMhz(model.getCpuFrequencyInMhz());
            }
            if (model.wasPropertyExplicitlySet("cpuImplementation")) {
                this.cpuImplementation(model.getCpuImplementation());
            }
            if (model.wasPropertyExplicitlySet("coresPerSocket")) {
                this.coresPerSocket(model.getCoresPerSocket());
            }
            if (model.wasPropertyExplicitlySet("totalSockets")) {
                this.totalSockets(model.getTotalSockets());
            }
            if (model.wasPropertyExplicitlySet("threadsPerSocket")) {
                this.threadsPerSocket(model.getThreadsPerSocket());
            }
            if (model.wasPropertyExplicitlySet("isHyperThreadingEnabled")) {
                this.isHyperThreadingEnabled(model.getIsHyperThreadingEnabled());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerIdentifier")) {
                this.enterpriseManagerIdentifier(model.getEnterpriseManagerIdentifier());
            }
            if (model.wasPropertyExplicitlySet("enterpriseManagerBridgeId")) {
                this.enterpriseManagerBridgeId(model.getEnterpriseManagerBridgeId());
            }
            if (model.wasPropertyExplicitlySet("exadataDetails")) {
                this.exadataDetails(model.getExadataDetails());
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
    public EmManagedExternalHostConfigurationSummary(
            String hostInsightId,
            String compartmentId,
            String hostName,
            PlatformType platformType,
            String platformVersion,
            String platformVendor,
            Integer totalCpus,
            Double totalMemoryInGBs,
            String cpuArchitecture,
            Double cpuCacheInMBs,
            String cpuVendor,
            Double cpuFrequencyInMhz,
            String cpuImplementation,
            Integer coresPerSocket,
            Integer totalSockets,
            Integer threadsPerSocket,
            Boolean isHyperThreadingEnabled,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            String enterpriseManagerIdentifier,
            String enterpriseManagerBridgeId,
            ExadataDetails exadataDetails) {
        super(
                hostInsightId,
                compartmentId,
                hostName,
                platformType,
                platformVersion,
                platformVendor,
                totalCpus,
                totalMemoryInGBs,
                cpuArchitecture,
                cpuCacheInMBs,
                cpuVendor,
                cpuFrequencyInMhz,
                cpuImplementation,
                coresPerSocket,
                totalSockets,
                threadsPerSocket,
                isHyperThreadingEnabled,
                definedTags,
                freeformTags);
        this.enterpriseManagerIdentifier = enterpriseManagerIdentifier;
        this.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
        this.exadataDetails = exadataDetails;
    }

    /** Enterprise Manager Unique Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerIdentifier")
    private final String enterpriseManagerIdentifier;

    /**
     * Enterprise Manager Unique Identifier
     *
     * @return the value
     */
    public String getEnterpriseManagerIdentifier() {
        return enterpriseManagerIdentifier;
    }

    /** OPSI Enterprise Manager Bridge OCID */
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerBridgeId")
    private final String enterpriseManagerBridgeId;

    /**
     * OPSI Enterprise Manager Bridge OCID
     *
     * @return the value
     */
    public String getEnterpriseManagerBridgeId() {
        return enterpriseManagerBridgeId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("exadataDetails")
    private final ExadataDetails exadataDetails;

    public ExadataDetails getExadataDetails() {
        return exadataDetails;
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
        sb.append("EmManagedExternalHostConfigurationSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", enterpriseManagerIdentifier=")
                .append(String.valueOf(this.enterpriseManagerIdentifier));
        sb.append(", enterpriseManagerBridgeId=")
                .append(String.valueOf(this.enterpriseManagerBridgeId));
        sb.append(", exadataDetails=").append(String.valueOf(this.exadataDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EmManagedExternalHostConfigurationSummary)) {
            return false;
        }

        EmManagedExternalHostConfigurationSummary other =
                (EmManagedExternalHostConfigurationSummary) o;
        return java.util.Objects.equals(
                        this.enterpriseManagerIdentifier, other.enterpriseManagerIdentifier)
                && java.util.Objects.equals(
                        this.enterpriseManagerBridgeId, other.enterpriseManagerBridgeId)
                && java.util.Objects.equals(this.exadataDetails, other.exadataDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.enterpriseManagerIdentifier == null
                                ? 43
                                : this.enterpriseManagerIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.enterpriseManagerBridgeId == null
                                ? 43
                                : this.enterpriseManagerBridgeId.hashCode());
        result =
                (result * PRIME)
                        + (this.exadataDetails == null ? 43 : this.exadataDetails.hashCode());
        return result;
    }
}
