/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.model;

/**
 * Details for an VM cluster network. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateVmClusterNetworkDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateVmClusterNetworkDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "infrastructureId",
        "displayName",
        "nodeCount",
        "scans",
        "listenerPort",
        "listenerPortSsl",
        "dnsServers",
        "ntpServers",
        "vmNetworks",
        "consumerType",
        "freeformTags",
        "definedTags"
    })
    public CreateVmClusterNetworkDetails(
            String compartmentId,
            String infrastructureId,
            String displayName,
            Integer nodeCount,
            java.util.List<ScanDetails> scans,
            Integer listenerPort,
            Integer listenerPortSsl,
            java.util.List<String> dnsServers,
            java.util.List<String> ntpServers,
            java.util.List<VmNetworkDetails> vmNetworks,
            VmNetworkConsumerType consumerType,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.infrastructureId = infrastructureId;
        this.displayName = displayName;
        this.nodeCount = nodeCount;
        this.scans = scans;
        this.listenerPort = listenerPort;
        this.listenerPortSsl = listenerPortSsl;
        this.dnsServers = dnsServers;
        this.ntpServers = ntpServers;
        this.vmNetworks = vmNetworks;
        this.consumerType = consumerType;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the VM cluster network.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the VM cluster network.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Database Infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("infrastructureId")
        private String infrastructureId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Database Infrastructure.
         *
         * @param infrastructureId the value to set
         * @return this builder
         */
        public Builder infrastructureId(String infrastructureId) {
            this.infrastructureId = infrastructureId;
            this.__explicitlySet__.add("infrastructureId");
            return this;
        }
        /**
         * The user-friendly name for the VM cluster network. The name does not need to be unique.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the VM cluster network. The name does not need to be unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Count of virtual machines in this VM cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
        private Integer nodeCount;

        /**
         * Count of virtual machines in this VM cluster.
         *
         * @param nodeCount the value to set
         * @return this builder
         */
        public Builder nodeCount(Integer nodeCount) {
            this.nodeCount = nodeCount;
            this.__explicitlySet__.add("nodeCount");
            return this;
        }
        /** The SCAN details. */
        @com.fasterxml.jackson.annotation.JsonProperty("scans")
        private java.util.List<ScanDetails> scans;

        /**
         * The SCAN details.
         *
         * @param scans the value to set
         * @return this builder
         */
        public Builder scans(java.util.List<ScanDetails> scans) {
            this.scans = scans;
            this.__explicitlySet__.add("scans");
            return this;
        }
        /** The listener TCP/IP port. */
        @com.fasterxml.jackson.annotation.JsonProperty("listenerPort")
        private Integer listenerPort;

        /**
         * The listener TCP/IP port.
         *
         * @param listenerPort the value to set
         * @return this builder
         */
        public Builder listenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            this.__explicitlySet__.add("listenerPort");
            return this;
        }
        /** The listener TCP/IP SSL port. Default is 2484. */
        @com.fasterxml.jackson.annotation.JsonProperty("listenerPortSsl")
        private Integer listenerPortSsl;

        /**
         * The listener TCP/IP SSL port. Default is 2484.
         *
         * @param listenerPortSsl the value to set
         * @return this builder
         */
        public Builder listenerPortSsl(Integer listenerPortSsl) {
            this.listenerPortSsl = listenerPortSsl;
            this.__explicitlySet__.add("listenerPortSsl");
            return this;
        }
        /** The list of DNS server IP addresses. Maximum of 3 allowed. */
        @com.fasterxml.jackson.annotation.JsonProperty("dnsServers")
        private java.util.List<String> dnsServers;

        /**
         * The list of DNS server IP addresses. Maximum of 3 allowed.
         *
         * @param dnsServers the value to set
         * @return this builder
         */
        public Builder dnsServers(java.util.List<String> dnsServers) {
            this.dnsServers = dnsServers;
            this.__explicitlySet__.add("dnsServers");
            return this;
        }
        /** The list of NTP server IP addresses. Maximum of 3 allowed. */
        @com.fasterxml.jackson.annotation.JsonProperty("ntpServers")
        private java.util.List<String> ntpServers;

        /**
         * The list of NTP server IP addresses. Maximum of 3 allowed.
         *
         * @param ntpServers the value to set
         * @return this builder
         */
        public Builder ntpServers(java.util.List<String> ntpServers) {
            this.ntpServers = ntpServers;
            this.__explicitlySet__.add("ntpServers");
            return this;
        }
        /** Details of the client and backup networks. */
        @com.fasterxml.jackson.annotation.JsonProperty("vmNetworks")
        private java.util.List<VmNetworkDetails> vmNetworks;

        /**
         * Details of the client and backup networks.
         *
         * @param vmNetworks the value to set
         * @return this builder
         */
        public Builder vmNetworks(java.util.List<VmNetworkDetails> vmNetworks) {
            this.vmNetworks = vmNetworks;
            this.__explicitlySet__.add("vmNetworks");
            return this;
        }
        /** Consumer type for the VM cluster network. */
        @com.fasterxml.jackson.annotation.JsonProperty("consumerType")
        private VmNetworkConsumerType consumerType;

        /**
         * Consumer type for the VM cluster network.
         *
         * @param consumerType the value to set
         * @return this builder
         */
        public Builder consumerType(VmNetworkConsumerType consumerType) {
            this.consumerType = consumerType;
            this.__explicitlySet__.add("consumerType");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. This
         * tag option exists for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. This
         * tag option exists for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateVmClusterNetworkDetails build() {
            CreateVmClusterNetworkDetails model =
                    new CreateVmClusterNetworkDetails(
                            this.compartmentId,
                            this.infrastructureId,
                            this.displayName,
                            this.nodeCount,
                            this.scans,
                            this.listenerPort,
                            this.listenerPortSsl,
                            this.dnsServers,
                            this.ntpServers,
                            this.vmNetworks,
                            this.consumerType,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVmClusterNetworkDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("infrastructureId")) {
                this.infrastructureId(model.getInfrastructureId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("nodeCount")) {
                this.nodeCount(model.getNodeCount());
            }
            if (model.wasPropertyExplicitlySet("scans")) {
                this.scans(model.getScans());
            }
            if (model.wasPropertyExplicitlySet("listenerPort")) {
                this.listenerPort(model.getListenerPort());
            }
            if (model.wasPropertyExplicitlySet("listenerPortSsl")) {
                this.listenerPortSsl(model.getListenerPortSsl());
            }
            if (model.wasPropertyExplicitlySet("dnsServers")) {
                this.dnsServers(model.getDnsServers());
            }
            if (model.wasPropertyExplicitlySet("ntpServers")) {
                this.ntpServers(model.getNtpServers());
            }
            if (model.wasPropertyExplicitlySet("vmNetworks")) {
                this.vmNetworks(model.getVmNetworks());
            }
            if (model.wasPropertyExplicitlySet("consumerType")) {
                this.consumerType(model.getConsumerType());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the VM cluster network.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the VM cluster network.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Database Infrastructure.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("infrastructureId")
    private final String infrastructureId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Database Infrastructure.
     *
     * @return the value
     */
    public String getInfrastructureId() {
        return infrastructureId;
    }

    /** The user-friendly name for the VM cluster network. The name does not need to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the VM cluster network. The name does not need to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Count of virtual machines in this VM cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeCount")
    private final Integer nodeCount;

    /**
     * Count of virtual machines in this VM cluster.
     *
     * @return the value
     */
    public Integer getNodeCount() {
        return nodeCount;
    }

    /** The SCAN details. */
    @com.fasterxml.jackson.annotation.JsonProperty("scans")
    private final java.util.List<ScanDetails> scans;

    /**
     * The SCAN details.
     *
     * @return the value
     */
    public java.util.List<ScanDetails> getScans() {
        return scans;
    }

    /** The listener TCP/IP port. */
    @com.fasterxml.jackson.annotation.JsonProperty("listenerPort")
    private final Integer listenerPort;

    /**
     * The listener TCP/IP port.
     *
     * @return the value
     */
    public Integer getListenerPort() {
        return listenerPort;
    }

    /** The listener TCP/IP SSL port. Default is 2484. */
    @com.fasterxml.jackson.annotation.JsonProperty("listenerPortSsl")
    private final Integer listenerPortSsl;

    /**
     * The listener TCP/IP SSL port. Default is 2484.
     *
     * @return the value
     */
    public Integer getListenerPortSsl() {
        return listenerPortSsl;
    }

    /** The list of DNS server IP addresses. Maximum of 3 allowed. */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsServers")
    private final java.util.List<String> dnsServers;

    /**
     * The list of DNS server IP addresses. Maximum of 3 allowed.
     *
     * @return the value
     */
    public java.util.List<String> getDnsServers() {
        return dnsServers;
    }

    /** The list of NTP server IP addresses. Maximum of 3 allowed. */
    @com.fasterxml.jackson.annotation.JsonProperty("ntpServers")
    private final java.util.List<String> ntpServers;

    /**
     * The list of NTP server IP addresses. Maximum of 3 allowed.
     *
     * @return the value
     */
    public java.util.List<String> getNtpServers() {
        return ntpServers;
    }

    /** Details of the client and backup networks. */
    @com.fasterxml.jackson.annotation.JsonProperty("vmNetworks")
    private final java.util.List<VmNetworkDetails> vmNetworks;

    /**
     * Details of the client and backup networks.
     *
     * @return the value
     */
    public java.util.List<VmNetworkDetails> getVmNetworks() {
        return vmNetworks;
    }

    /** Consumer type for the VM cluster network. */
    @com.fasterxml.jackson.annotation.JsonProperty("consumerType")
    private final VmNetworkConsumerType consumerType;

    /**
     * Consumer type for the VM cluster network.
     *
     * @return the value
     */
    public VmNetworkConsumerType getConsumerType() {
        return consumerType;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. This tag
     * option exists for cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. This tag
     * option exists for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
        sb.append("CreateVmClusterNetworkDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", infrastructureId=").append(String.valueOf(this.infrastructureId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", nodeCount=").append(String.valueOf(this.nodeCount));
        sb.append(", scans=").append(String.valueOf(this.scans));
        sb.append(", listenerPort=").append(String.valueOf(this.listenerPort));
        sb.append(", listenerPortSsl=").append(String.valueOf(this.listenerPortSsl));
        sb.append(", dnsServers=").append(String.valueOf(this.dnsServers));
        sb.append(", ntpServers=").append(String.valueOf(this.ntpServers));
        sb.append(", vmNetworks=").append(String.valueOf(this.vmNetworks));
        sb.append(", consumerType=").append(String.valueOf(this.consumerType));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateVmClusterNetworkDetails)) {
            return false;
        }

        CreateVmClusterNetworkDetails other = (CreateVmClusterNetworkDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.infrastructureId, other.infrastructureId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.nodeCount, other.nodeCount)
                && java.util.Objects.equals(this.scans, other.scans)
                && java.util.Objects.equals(this.listenerPort, other.listenerPort)
                && java.util.Objects.equals(this.listenerPortSsl, other.listenerPortSsl)
                && java.util.Objects.equals(this.dnsServers, other.dnsServers)
                && java.util.Objects.equals(this.ntpServers, other.ntpServers)
                && java.util.Objects.equals(this.vmNetworks, other.vmNetworks)
                && java.util.Objects.equals(this.consumerType, other.consumerType)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.infrastructureId == null ? 43 : this.infrastructureId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.nodeCount == null ? 43 : this.nodeCount.hashCode());
        result = (result * PRIME) + (this.scans == null ? 43 : this.scans.hashCode());
        result = (result * PRIME) + (this.listenerPort == null ? 43 : this.listenerPort.hashCode());
        result =
                (result * PRIME)
                        + (this.listenerPortSsl == null ? 43 : this.listenerPortSsl.hashCode());
        result = (result * PRIME) + (this.dnsServers == null ? 43 : this.dnsServers.hashCode());
        result = (result * PRIME) + (this.ntpServers == null ? 43 : this.ntpServers.hashCode());
        result = (result * PRIME) + (this.vmNetworks == null ? 43 : this.vmNetworks.hashCode());
        result = (result * PRIME) + (this.consumerType == null ? 43 : this.consumerType.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
