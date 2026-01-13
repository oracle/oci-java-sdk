/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Configuration Summary of a Macs Managed External host. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MacsManagedExternalHostConfigurationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entitySource")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MacsManagedExternalHostConfigurationSummary extends HostConfigurationSummary {
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
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Management Agent
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
        private String managementAgentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Management Agent
         *
         * @param managementAgentId the value to set
         * @return this builder
         */
        public Builder managementAgentId(String managementAgentId) {
            this.managementAgentId = managementAgentId;
            this.__explicitlySet__.add("managementAgentId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * External Database Connector
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connectorId")
        private String connectorId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * External Database Connector
         *
         * @param connectorId the value to set
         * @return this builder
         */
        public Builder connectorId(String connectorId) {
            this.connectorId = connectorId;
            this.__explicitlySet__.add("connectorId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MacsManagedExternalHostConfigurationSummary build() {
            MacsManagedExternalHostConfigurationSummary model =
                    new MacsManagedExternalHostConfigurationSummary(
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
                            this.managementAgentId,
                            this.connectorId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MacsManagedExternalHostConfigurationSummary model) {
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
            if (model.wasPropertyExplicitlySet("managementAgentId")) {
                this.managementAgentId(model.getManagementAgentId());
            }
            if (model.wasPropertyExplicitlySet("connectorId")) {
                this.connectorId(model.getConnectorId());
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
    public MacsManagedExternalHostConfigurationSummary(
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
            String managementAgentId,
            String connectorId) {
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
        this.managementAgentId = managementAgentId;
        this.connectorId = connectorId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Management Agent
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managementAgentId")
    private final String managementAgentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Management Agent
     *
     * @return the value
     */
    public String getManagementAgentId() {
        return managementAgentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of External
     * Database Connector
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectorId")
    private final String connectorId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of External
     * Database Connector
     *
     * @return the value
     */
    public String getConnectorId() {
        return connectorId;
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
        sb.append("MacsManagedExternalHostConfigurationSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", managementAgentId=").append(String.valueOf(this.managementAgentId));
        sb.append(", connectorId=").append(String.valueOf(this.connectorId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MacsManagedExternalHostConfigurationSummary)) {
            return false;
        }

        MacsManagedExternalHostConfigurationSummary other =
                (MacsManagedExternalHostConfigurationSummary) o;
        return java.util.Objects.equals(this.managementAgentId, other.managementAgentId)
                && java.util.Objects.equals(this.connectorId, other.connectorId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managementAgentId == null ? 43 : this.managementAgentId.hashCode());
        result = (result * PRIME) + (this.connectorId == null ? 43 : this.connectorId.hashCode());
        return result;
    }
}
