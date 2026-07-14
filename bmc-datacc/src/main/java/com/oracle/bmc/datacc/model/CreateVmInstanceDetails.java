/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.model;

/**
 * Create VM instance details. <br>
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
        builder = CreateVmInstanceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateVmInstanceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "description",
        "infrastructureId",
        "cpusEnabled",
        "memorySizeInGBs",
        "bootStorageSizeInGBs",
        "dataStorageSizeInGBs",
        "imageId",
        "serverId",
        "sshPublicKeys",
        "domainName",
        "timeZone",
        "dnsServers",
        "ntpServers",
        "hostname",
        "ipAddress",
        "netmask",
        "gateway",
        "vlanId",
        "userdata",
        "metadata",
        "vmNetworkId",
        "definedTags",
        "freeformTags",
        "systemTags"
    })
    public CreateVmInstanceDetails(
            String compartmentId,
            String displayName,
            String description,
            String infrastructureId,
            Integer cpusEnabled,
            Double memorySizeInGBs,
            Double bootStorageSizeInGBs,
            Double dataStorageSizeInGBs,
            String imageId,
            String serverId,
            java.util.List<String> sshPublicKeys,
            String domainName,
            String timeZone,
            java.util.List<String> dnsServers,
            java.util.List<String> ntpServers,
            String hostname,
            String ipAddress,
            String netmask,
            String gateway,
            String vlanId,
            String userdata,
            java.util.Map<String, String> metadata,
            String vmNetworkId,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.infrastructureId = infrastructureId;
        this.cpusEnabled = cpusEnabled;
        this.memorySizeInGBs = memorySizeInGBs;
        this.bootStorageSizeInGBs = bootStorageSizeInGBs;
        this.dataStorageSizeInGBs = dataStorageSizeInGBs;
        this.imageId = imageId;
        this.serverId = serverId;
        this.sshPublicKeys = sshPublicKeys;
        this.domainName = domainName;
        this.timeZone = timeZone;
        this.dnsServers = dnsServers;
        this.ntpServers = ntpServers;
        this.hostname = hostname;
        this.ipAddress = ipAddress;
        this.netmask = netmask;
        this.gateway = gateway;
        this.vlanId = vlanId;
        this.userdata = userdata;
        this.metadata = metadata;
        this.vmNetworkId = vmNetworkId;
        this.definedTags = definedTags;
        this.freeformTags = freeformTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the VM instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing the VM instance.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** VM instance display name. This name does not have to be unique, and is changeable. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * VM instance display name. This name does not have to be unique, and is changeable.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** VM instance description. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * VM instance description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
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
        /** The number of CPU cores enabled for each VM instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("cpusEnabled")
        private Integer cpusEnabled;

        /**
         * The number of CPU cores enabled for each VM instance.
         *
         * @param cpusEnabled the value to set
         * @return this builder
         */
        public Builder cpusEnabled(Integer cpusEnabled) {
            this.cpusEnabled = cpusEnabled;
            this.__explicitlySet__.add("cpusEnabled");
            return this;
        }
        /** The memory to be allocated in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
        private Double memorySizeInGBs;

        /**
         * The memory to be allocated in GBs.
         *
         * @param memorySizeInGBs the value to set
         * @return this builder
         */
        public Builder memorySizeInGBs(Double memorySizeInGBs) {
            this.memorySizeInGBs = memorySizeInGBs;
            this.__explicitlySet__.add("memorySizeInGBs");
            return this;
        }
        /** Boot storage memory to be allocated in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("bootStorageSizeInGBs")
        private Double bootStorageSizeInGBs;

        /**
         * Boot storage memory to be allocated in GBs.
         *
         * @param bootStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder bootStorageSizeInGBs(Double bootStorageSizeInGBs) {
            this.bootStorageSizeInGBs = bootStorageSizeInGBs;
            this.__explicitlySet__.add("bootStorageSizeInGBs");
            return this;
        }
        /** Data storage to be allocated in GBs. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
        private Double dataStorageSizeInGBs;

        /**
         * Data storage to be allocated in GBs.
         *
         * @param dataStorageSizeInGBs the value to set
         * @return this builder
         */
        public Builder dataStorageSizeInGBs(Double dataStorageSizeInGBs) {
            this.dataStorageSizeInGBs = dataStorageSizeInGBs;
            this.__explicitlySet__.add("dataStorageSizeInGBs");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VM custom instance uploaded.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("imageId")
        private String imageId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VM custom instance uploaded.
         *
         * @param imageId the value to set
         * @return this builder
         */
        public Builder imageId(String imageId) {
            this.imageId = imageId;
            this.__explicitlySet__.add("imageId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute node on which VM instance should be launched.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("serverId")
        private String serverId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compute node on which VM instance should be launched.
         *
         * @param serverId the value to set
         * @return this builder
         */
        public Builder serverId(String serverId) {
            this.serverId = serverId;
            this.__explicitlySet__.add("serverId");
            return this;
        }
        /** List of public key used for SSH access to the VM instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
        private java.util.List<String> sshPublicKeys;

        /**
         * List of public key used for SSH access to the VM instance.
         *
         * @param sshPublicKeys the value to set
         * @return this builder
         */
        public Builder sshPublicKeys(java.util.List<String> sshPublicKeys) {
            this.sshPublicKeys = sshPublicKeys;
            this.__explicitlySet__.add("sshPublicKeys");
            return this;
        }
        /** The domain name of the VM instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("domainName")
        private String domainName;

        /**
         * The domain name of the VM instance.
         *
         * @param domainName the value to set
         * @return this builder
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            this.__explicitlySet__.add("domainName");
            return this;
        }
        /** The time zone to use for the VM instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
        private String timeZone;

        /**
         * The time zone to use for the VM instance.
         *
         * @param timeZone the value to set
         * @return this builder
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            this.__explicitlySet__.add("timeZone");
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
        /** The host name of the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * The host name of the instance.
         *
         * @param hostname the value to set
         * @return this builder
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }
        /** The IP address of the instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * The IP address of the instance.
         *
         * @param ipAddress the value to set
         * @return this builder
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /** The netmask of the VM instance network. */
        @com.fasterxml.jackson.annotation.JsonProperty("netmask")
        private String netmask;

        /**
         * The netmask of the VM instance network.
         *
         * @param netmask the value to set
         * @return this builder
         */
        public Builder netmask(String netmask) {
            this.netmask = netmask;
            this.__explicitlySet__.add("netmask");
            return this;
        }
        /** The gateway IP address of the VM instance network */
        @com.fasterxml.jackson.annotation.JsonProperty("gateway")
        private String gateway;

        /**
         * The gateway IP address of the VM instance network
         *
         * @param gateway the value to set
         * @return this builder
         */
        public Builder gateway(String gateway) {
            this.gateway = gateway;
            this.__explicitlySet__.add("gateway");
            return this;
        }
        /** The network VLAN ID. */
        @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
        private String vlanId;

        /**
         * The network VLAN ID.
         *
         * @param vlanId the value to set
         * @return this builder
         */
        public Builder vlanId(String vlanId) {
            this.vlanId = vlanId;
            this.__explicitlySet__.add("vlanId");
            return this;
        }
        /**
         * Base64-encoded data to be used by Cloud-Init to run custom scripts or provide custom
         * Cloud-Init configuration. For information about how to take advantage of user data, see
         * the [Cloud-Init
         * Documentation](http://cloudinit.readthedocs.org/en/latest/topics/format.html).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userdata")
        private String userdata;

        /**
         * Base64-encoded data to be used by Cloud-Init to run custom scripts or provide custom
         * Cloud-Init configuration. For information about how to take advantage of user data, see
         * the [Cloud-Init
         * Documentation](http://cloudinit.readthedocs.org/en/latest/topics/format.html).
         *
         * @param userdata the value to set
         * @return this builder
         */
        public Builder userdata(String userdata) {
            this.userdata = userdata;
            this.__explicitlySet__.add("userdata");
            return this;
        }
        /**
         * Custom metadata key/value pairs which can be used to: - Provide information to
         * [Cloud-Init](https://cloudinit.readthedocs.org/en/latest/) to be used for various system
         * initialization tasks. - Provide additional information which is exposed inside the
         * instance context and can be queried or referenced by user-data scripts for dynamic
         * configuration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        /**
         * Custom metadata key/value pairs which can be used to: - Provide information to
         * [Cloud-Init](https://cloudinit.readthedocs.org/en/latest/) to be used for various system
         * initialization tasks. - Provide additional information which is exposed inside the
         * instance context and can be queried or referenced by user-data scripts for dynamic
         * configuration.
         *
         * @param metadata the value to set
         * @return this builder
         */
        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VM Network.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vmNetworkId")
        private String vmNetworkId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VM Network.
         *
         * @param vmNetworkId the value to set
         * @return this builder
         */
        public Builder vmNetworkId(String vmNetworkId) {
            this.vmNetworkId = vmNetworkId;
            this.__explicitlySet__.add("vmNetworkId");
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
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * { "orcl-cloud": { "free-tier-retained": "true" } }}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * { "orcl-cloud": { "free-tier-retained": "true" } }}
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

        public CreateVmInstanceDetails build() {
            CreateVmInstanceDetails model =
                    new CreateVmInstanceDetails(
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.infrastructureId,
                            this.cpusEnabled,
                            this.memorySizeInGBs,
                            this.bootStorageSizeInGBs,
                            this.dataStorageSizeInGBs,
                            this.imageId,
                            this.serverId,
                            this.sshPublicKeys,
                            this.domainName,
                            this.timeZone,
                            this.dnsServers,
                            this.ntpServers,
                            this.hostname,
                            this.ipAddress,
                            this.netmask,
                            this.gateway,
                            this.vlanId,
                            this.userdata,
                            this.metadata,
                            this.vmNetworkId,
                            this.definedTags,
                            this.freeformTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateVmInstanceDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("infrastructureId")) {
                this.infrastructureId(model.getInfrastructureId());
            }
            if (model.wasPropertyExplicitlySet("cpusEnabled")) {
                this.cpusEnabled(model.getCpusEnabled());
            }
            if (model.wasPropertyExplicitlySet("memorySizeInGBs")) {
                this.memorySizeInGBs(model.getMemorySizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("bootStorageSizeInGBs")) {
                this.bootStorageSizeInGBs(model.getBootStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("dataStorageSizeInGBs")) {
                this.dataStorageSizeInGBs(model.getDataStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("imageId")) {
                this.imageId(model.getImageId());
            }
            if (model.wasPropertyExplicitlySet("serverId")) {
                this.serverId(model.getServerId());
            }
            if (model.wasPropertyExplicitlySet("sshPublicKeys")) {
                this.sshPublicKeys(model.getSshPublicKeys());
            }
            if (model.wasPropertyExplicitlySet("domainName")) {
                this.domainName(model.getDomainName());
            }
            if (model.wasPropertyExplicitlySet("timeZone")) {
                this.timeZone(model.getTimeZone());
            }
            if (model.wasPropertyExplicitlySet("dnsServers")) {
                this.dnsServers(model.getDnsServers());
            }
            if (model.wasPropertyExplicitlySet("ntpServers")) {
                this.ntpServers(model.getNtpServers());
            }
            if (model.wasPropertyExplicitlySet("hostname")) {
                this.hostname(model.getHostname());
            }
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("netmask")) {
                this.netmask(model.getNetmask());
            }
            if (model.wasPropertyExplicitlySet("gateway")) {
                this.gateway(model.getGateway());
            }
            if (model.wasPropertyExplicitlySet("vlanId")) {
                this.vlanId(model.getVlanId());
            }
            if (model.wasPropertyExplicitlySet("userdata")) {
                this.userdata(model.getUserdata());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("vmNetworkId")) {
                this.vmNetworkId(model.getVmNetworkId());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the VM instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing the VM instance.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** VM instance display name. This name does not have to be unique, and is changeable. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * VM instance display name. This name does not have to be unique, and is changeable.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** VM instance description. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * VM instance description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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

    /** The number of CPU cores enabled for each VM instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("cpusEnabled")
    private final Integer cpusEnabled;

    /**
     * The number of CPU cores enabled for each VM instance.
     *
     * @return the value
     */
    public Integer getCpusEnabled() {
        return cpusEnabled;
    }

    /** The memory to be allocated in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("memorySizeInGBs")
    private final Double memorySizeInGBs;

    /**
     * The memory to be allocated in GBs.
     *
     * @return the value
     */
    public Double getMemorySizeInGBs() {
        return memorySizeInGBs;
    }

    /** Boot storage memory to be allocated in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("bootStorageSizeInGBs")
    private final Double bootStorageSizeInGBs;

    /**
     * Boot storage memory to be allocated in GBs.
     *
     * @return the value
     */
    public Double getBootStorageSizeInGBs() {
        return bootStorageSizeInGBs;
    }

    /** Data storage to be allocated in GBs. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataStorageSizeInGBs")
    private final Double dataStorageSizeInGBs;

    /**
     * Data storage to be allocated in GBs.
     *
     * @return the value
     */
    public Double getDataStorageSizeInGBs() {
        return dataStorageSizeInGBs;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM
     * custom instance uploaded.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("imageId")
    private final String imageId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM
     * custom instance uploaded.
     *
     * @return the value
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute node on which VM instance should be launched.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serverId")
    private final String serverId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compute node on which VM instance should be launched.
     *
     * @return the value
     */
    public String getServerId() {
        return serverId;
    }

    /** List of public key used for SSH access to the VM instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("sshPublicKeys")
    private final java.util.List<String> sshPublicKeys;

    /**
     * List of public key used for SSH access to the VM instance.
     *
     * @return the value
     */
    public java.util.List<String> getSshPublicKeys() {
        return sshPublicKeys;
    }

    /** The domain name of the VM instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("domainName")
    private final String domainName;

    /**
     * The domain name of the VM instance.
     *
     * @return the value
     */
    public String getDomainName() {
        return domainName;
    }

    /** The time zone to use for the VM instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeZone")
    private final String timeZone;

    /**
     * The time zone to use for the VM instance.
     *
     * @return the value
     */
    public String getTimeZone() {
        return timeZone;
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

    /** The host name of the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * The host name of the instance.
     *
     * @return the value
     */
    public String getHostname() {
        return hostname;
    }

    /** The IP address of the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * The IP address of the instance.
     *
     * @return the value
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /** The netmask of the VM instance network. */
    @com.fasterxml.jackson.annotation.JsonProperty("netmask")
    private final String netmask;

    /**
     * The netmask of the VM instance network.
     *
     * @return the value
     */
    public String getNetmask() {
        return netmask;
    }

    /** The gateway IP address of the VM instance network */
    @com.fasterxml.jackson.annotation.JsonProperty("gateway")
    private final String gateway;

    /**
     * The gateway IP address of the VM instance network
     *
     * @return the value
     */
    public String getGateway() {
        return gateway;
    }

    /** The network VLAN ID. */
    @com.fasterxml.jackson.annotation.JsonProperty("vlanId")
    private final String vlanId;

    /**
     * The network VLAN ID.
     *
     * @return the value
     */
    public String getVlanId() {
        return vlanId;
    }

    /**
     * Base64-encoded data to be used by Cloud-Init to run custom scripts or provide custom
     * Cloud-Init configuration. For information about how to take advantage of user data, see the
     * [Cloud-Init Documentation](http://cloudinit.readthedocs.org/en/latest/topics/format.html).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userdata")
    private final String userdata;

    /**
     * Base64-encoded data to be used by Cloud-Init to run custom scripts or provide custom
     * Cloud-Init configuration. For information about how to take advantage of user data, see the
     * [Cloud-Init Documentation](http://cloudinit.readthedocs.org/en/latest/topics/format.html).
     *
     * @return the value
     */
    public String getUserdata() {
        return userdata;
    }

    /**
     * Custom metadata key/value pairs which can be used to: - Provide information to
     * [Cloud-Init](https://cloudinit.readthedocs.org/en/latest/) to be used for various system
     * initialization tasks. - Provide additional information which is exposed inside the instance
     * context and can be queried or referenced by user-data scripts for dynamic configuration.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, String> metadata;

    /**
     * Custom metadata key/value pairs which can be used to: - Provide information to
     * [Cloud-Init](https://cloudinit.readthedocs.org/en/latest/) to be used for various system
     * initialization tasks. - Provide additional information which is exposed inside the instance
     * context and can be queried or referenced by user-data scripts for dynamic configuration.
     *
     * @return the value
     */
    public java.util.Map<String, String> getMetadata() {
        return metadata;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM
     * Network.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vmNetworkId")
    private final String vmNetworkId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VM
     * Network.
     *
     * @return the value
     */
    public String getVmNetworkId() {
        return vmNetworkId;
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
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code {
     * "orcl-cloud": { "free-tier-retained": "true" } }}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code {
     * "orcl-cloud": { "free-tier-retained": "true" } }}
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
        sb.append("CreateVmInstanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", infrastructureId=").append(String.valueOf(this.infrastructureId));
        sb.append(", cpusEnabled=").append(String.valueOf(this.cpusEnabled));
        sb.append(", memorySizeInGBs=").append(String.valueOf(this.memorySizeInGBs));
        sb.append(", bootStorageSizeInGBs=").append(String.valueOf(this.bootStorageSizeInGBs));
        sb.append(", dataStorageSizeInGBs=").append(String.valueOf(this.dataStorageSizeInGBs));
        sb.append(", imageId=").append(String.valueOf(this.imageId));
        sb.append(", serverId=").append(String.valueOf(this.serverId));
        sb.append(", sshPublicKeys=").append(String.valueOf(this.sshPublicKeys));
        sb.append(", domainName=").append(String.valueOf(this.domainName));
        sb.append(", timeZone=").append(String.valueOf(this.timeZone));
        sb.append(", dnsServers=").append(String.valueOf(this.dnsServers));
        sb.append(", ntpServers=").append(String.valueOf(this.ntpServers));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", netmask=").append(String.valueOf(this.netmask));
        sb.append(", gateway=").append(String.valueOf(this.gateway));
        sb.append(", vlanId=").append(String.valueOf(this.vlanId));
        sb.append(", userdata=").append(String.valueOf(this.userdata));
        sb.append(", metadata=").append(String.valueOf(this.metadata));
        sb.append(", vmNetworkId=").append(String.valueOf(this.vmNetworkId));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateVmInstanceDetails)) {
            return false;
        }

        CreateVmInstanceDetails other = (CreateVmInstanceDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.infrastructureId, other.infrastructureId)
                && java.util.Objects.equals(this.cpusEnabled, other.cpusEnabled)
                && java.util.Objects.equals(this.memorySizeInGBs, other.memorySizeInGBs)
                && java.util.Objects.equals(this.bootStorageSizeInGBs, other.bootStorageSizeInGBs)
                && java.util.Objects.equals(this.dataStorageSizeInGBs, other.dataStorageSizeInGBs)
                && java.util.Objects.equals(this.imageId, other.imageId)
                && java.util.Objects.equals(this.serverId, other.serverId)
                && java.util.Objects.equals(this.sshPublicKeys, other.sshPublicKeys)
                && java.util.Objects.equals(this.domainName, other.domainName)
                && java.util.Objects.equals(this.timeZone, other.timeZone)
                && java.util.Objects.equals(this.dnsServers, other.dnsServers)
                && java.util.Objects.equals(this.ntpServers, other.ntpServers)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.netmask, other.netmask)
                && java.util.Objects.equals(this.gateway, other.gateway)
                && java.util.Objects.equals(this.vlanId, other.vlanId)
                && java.util.Objects.equals(this.userdata, other.userdata)
                && java.util.Objects.equals(this.metadata, other.metadata)
                && java.util.Objects.equals(this.vmNetworkId, other.vmNetworkId)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.infrastructureId == null ? 43 : this.infrastructureId.hashCode());
        result = (result * PRIME) + (this.cpusEnabled == null ? 43 : this.cpusEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.memorySizeInGBs == null ? 43 : this.memorySizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.bootStorageSizeInGBs == null
                                ? 43
                                : this.bootStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.dataStorageSizeInGBs == null
                                ? 43
                                : this.dataStorageSizeInGBs.hashCode());
        result = (result * PRIME) + (this.imageId == null ? 43 : this.imageId.hashCode());
        result = (result * PRIME) + (this.serverId == null ? 43 : this.serverId.hashCode());
        result =
                (result * PRIME)
                        + (this.sshPublicKeys == null ? 43 : this.sshPublicKeys.hashCode());
        result = (result * PRIME) + (this.domainName == null ? 43 : this.domainName.hashCode());
        result = (result * PRIME) + (this.timeZone == null ? 43 : this.timeZone.hashCode());
        result = (result * PRIME) + (this.dnsServers == null ? 43 : this.dnsServers.hashCode());
        result = (result * PRIME) + (this.ntpServers == null ? 43 : this.ntpServers.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.netmask == null ? 43 : this.netmask.hashCode());
        result = (result * PRIME) + (this.gateway == null ? 43 : this.gateway.hashCode());
        result = (result * PRIME) + (this.vlanId == null ? 43 : this.vlanId.hashCode());
        result = (result * PRIME) + (this.userdata == null ? 43 : this.userdata.hashCode());
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + (this.vmNetworkId == null ? 43 : this.vmNetworkId.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
