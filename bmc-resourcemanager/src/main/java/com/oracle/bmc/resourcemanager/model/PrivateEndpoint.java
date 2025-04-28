/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * A private endpoint allowing Resource Manager to access nonpublic cloud resources. For more
 * information about private endpoints, see [Private Endpoint
 * Management](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/private-endpoints.htm).
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PrivateEndpoint.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PrivateEndpoint
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "description",
        "vcnId",
        "subnetId",
        "sourceIps",
        "nsgIdList",
        "isUsedWithConfigurationSourceProvider",
        "dnsZones",
        "timeCreated",
        "lifecycleState",
        "freeformTags",
        "definedTags"
    })
    public PrivateEndpoint(
            String id,
            String compartmentId,
            String displayName,
            String description,
            String vcnId,
            String subnetId,
            java.util.List<String> sourceIps,
            java.util.List<String> nsgIdList,
            Boolean isUsedWithConfigurationSourceProvider,
            java.util.List<String> dnsZones,
            java.util.Date timeCreated,
            LifecycleState lifecycleState,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.vcnId = vcnId;
        this.subnetId = subnetId;
        this.sourceIps = sourceIps;
        this.nsgIdList = nsgIdList;
        this.isUsedWithConfigurationSourceProvider = isUsedWithConfigurationSourceProvider;
        this.dnsZones = dnsZones;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * private endpoint.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * private endpoint.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing this private endpoint.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment containing this private endpoint.
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
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Description of the private endpoint. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the private endpoint. Avoid entering confidential information.
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
         * VCN for the private endpoint.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * VCN for the private endpoint.
         *
         * @param vcnId the value to set
         * @return this builder
         */
        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet within the VCN for the private endpoint.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet within the VCN for the private endpoint.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The source IP addresses that Resource Manager uses to connect to your network.
         * Automatically assigned by Resource Manager.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceIps")
        private java.util.List<String> sourceIps;

        /**
         * The source IP addresses that Resource Manager uses to connect to your network.
         * Automatically assigned by Resource Manager.
         *
         * @param sourceIps the value to set
         * @return this builder
         */
        public Builder sourceIps(java.util.List<String> sourceIps) {
            this.sourceIps = sourceIps;
            this.__explicitlySet__.add("sourceIps");
            return this;
        }
        /**
         * The [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * [network security groups
         * (NSGs)](https://docs.oracle.com/iaas/Content/Network/Concepts/networksecuritygroups.htm)
         * for the private endpoint. Order does not matter.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("nsgIdList")
        private java.util.List<String> nsgIdList;

        /**
         * The [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * [network security groups
         * (NSGs)](https://docs.oracle.com/iaas/Content/Network/Concepts/networksecuritygroups.htm)
         * for the private endpoint. Order does not matter.
         *
         * @param nsgIdList the value to set
         * @return this builder
         */
        public Builder nsgIdList(java.util.List<String> nsgIdList) {
            this.nsgIdList = nsgIdList;
            this.__explicitlySet__.add("nsgIdList");
            return this;
        }
        /**
         * When {@code true}, allows the private endpoint to be used with a configuration source
         * provider.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isUsedWithConfigurationSourceProvider")
        private Boolean isUsedWithConfigurationSourceProvider;

        /**
         * When {@code true}, allows the private endpoint to be used with a configuration source
         * provider.
         *
         * @param isUsedWithConfigurationSourceProvider the value to set
         * @return this builder
         */
        public Builder isUsedWithConfigurationSourceProvider(
                Boolean isUsedWithConfigurationSourceProvider) {
            this.isUsedWithConfigurationSourceProvider = isUsedWithConfigurationSourceProvider;
            this.__explicitlySet__.add("isUsedWithConfigurationSourceProvider");
            return this;
        }
        /**
         * DNS zones to use for accessing private Git servers. For private Git server instructions,
         * see [Private Git
         * Server](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/private-endpoints.htm#private-git).
         * Specify DNS fully qualified domain names (FQDNs); DNS Proxy forwards related DNS FQDN
         * queries to the consumer DNS resolver. For DNS FQDNs not specified, queries go to service
         * provider VCN resolver. Example: {@code abc.oraclevcn.com}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dnsZones")
        private java.util.List<String> dnsZones;

        /**
         * DNS zones to use for accessing private Git servers. For private Git server instructions,
         * see [Private Git
         * Server](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/private-endpoints.htm#private-git).
         * Specify DNS fully qualified domain names (FQDNs); DNS Proxy forwards related DNS FQDN
         * queries to the consumer DNS resolver. For DNS FQDNs not specified, queries go to service
         * provider VCN resolver. Example: {@code abc.oraclevcn.com}
         *
         * @param dnsZones the value to set
         * @return this builder
         */
        public Builder dnsZones(java.util.List<String> dnsZones) {
            this.dnsZones = dnsZones;
            this.__explicitlySet__.add("dnsZones");
            return this;
        }
        /**
         * The date and time at which the private endpoint was created. Format is defined by
         * RFC3339. Example: {@code 2020-11-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time at which the private endpoint was created. Format is defined by
         * RFC3339. Example: {@code 2020-11-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The current lifecycle state of the private endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current lifecycle state of the private endpoint.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Free-form tags associated with the resource. Each tag is a key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags associated with the resource. Each tag is a key-value pair with no
         * predefined name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
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

        public PrivateEndpoint build() {
            PrivateEndpoint model =
                    new PrivateEndpoint(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.vcnId,
                            this.subnetId,
                            this.sourceIps,
                            this.nsgIdList,
                            this.isUsedWithConfigurationSourceProvider,
                            this.dnsZones,
                            this.timeCreated,
                            this.lifecycleState,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PrivateEndpoint model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("vcnId")) {
                this.vcnId(model.getVcnId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("sourceIps")) {
                this.sourceIps(model.getSourceIps());
            }
            if (model.wasPropertyExplicitlySet("nsgIdList")) {
                this.nsgIdList(model.getNsgIdList());
            }
            if (model.wasPropertyExplicitlySet("isUsedWithConfigurationSourceProvider")) {
                this.isUsedWithConfigurationSourceProvider(
                        model.getIsUsedWithConfigurationSourceProvider());
            }
            if (model.wasPropertyExplicitlySet("dnsZones")) {
                this.dnsZones(model.getDnsZones());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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
     * private endpoint.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * private endpoint.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing this private endpoint.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment containing this private endpoint.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Description of the private endpoint. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the private endpoint. Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN
     * for the private endpoint.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    private final String vcnId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VCN
     * for the private endpoint.
     *
     * @return the value
     */
    public String getVcnId() {
        return vcnId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet within the VCN for the private endpoint.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet within the VCN for the private endpoint.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The source IP addresses that Resource Manager uses to connect to your network. Automatically
     * assigned by Resource Manager.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceIps")
    private final java.util.List<String> sourceIps;

    /**
     * The source IP addresses that Resource Manager uses to connect to your network. Automatically
     * assigned by Resource Manager.
     *
     * @return the value
     */
    public java.util.List<String> getSourceIps() {
        return sourceIps;
    }

    /**
     * The [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * [network security groups
     * (NSGs)](https://docs.oracle.com/iaas/Content/Network/Concepts/networksecuritygroups.htm) for
     * the private endpoint. Order does not matter.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nsgIdList")
    private final java.util.List<String> nsgIdList;

    /**
     * The [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * [network security groups
     * (NSGs)](https://docs.oracle.com/iaas/Content/Network/Concepts/networksecuritygroups.htm) for
     * the private endpoint. Order does not matter.
     *
     * @return the value
     */
    public java.util.List<String> getNsgIdList() {
        return nsgIdList;
    }

    /**
     * When {@code true}, allows the private endpoint to be used with a configuration source
     * provider.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isUsedWithConfigurationSourceProvider")
    private final Boolean isUsedWithConfigurationSourceProvider;

    /**
     * When {@code true}, allows the private endpoint to be used with a configuration source
     * provider.
     *
     * @return the value
     */
    public Boolean getIsUsedWithConfigurationSourceProvider() {
        return isUsedWithConfigurationSourceProvider;
    }

    /**
     * DNS zones to use for accessing private Git servers. For private Git server instructions, see
     * [Private Git
     * Server](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/private-endpoints.htm#private-git).
     * Specify DNS fully qualified domain names (FQDNs); DNS Proxy forwards related DNS FQDN queries
     * to the consumer DNS resolver. For DNS FQDNs not specified, queries go to service provider VCN
     * resolver. Example: {@code abc.oraclevcn.com}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dnsZones")
    private final java.util.List<String> dnsZones;

    /**
     * DNS zones to use for accessing private Git servers. For private Git server instructions, see
     * [Private Git
     * Server](https://docs.oracle.com/iaas/Content/ResourceManager/Tasks/private-endpoints.htm#private-git).
     * Specify DNS fully qualified domain names (FQDNs); DNS Proxy forwards related DNS FQDN queries
     * to the consumer DNS resolver. For DNS FQDNs not specified, queries go to service provider VCN
     * resolver. Example: {@code abc.oraclevcn.com}
     *
     * @return the value
     */
    public java.util.List<String> getDnsZones() {
        return dnsZones;
    }

    /**
     * The date and time at which the private endpoint was created. Format is defined by RFC3339.
     * Example: {@code 2020-11-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time at which the private endpoint was created. Format is defined by RFC3339.
     * Example: {@code 2020-11-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The current lifecycle state of the private endpoint. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Active("ACTIVE"),
        Creating("CREATING"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current lifecycle state of the private endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current lifecycle state of the private endpoint.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Free-form tags associated with the resource. Each tag is a key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags associated with the resource. Each tag is a key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
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
        sb.append("PrivateEndpoint(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", vcnId=").append(String.valueOf(this.vcnId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", sourceIps=").append(String.valueOf(this.sourceIps));
        sb.append(", nsgIdList=").append(String.valueOf(this.nsgIdList));
        sb.append(", isUsedWithConfigurationSourceProvider=")
                .append(String.valueOf(this.isUsedWithConfigurationSourceProvider));
        sb.append(", dnsZones=").append(String.valueOf(this.dnsZones));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
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
        if (!(o instanceof PrivateEndpoint)) {
            return false;
        }

        PrivateEndpoint other = (PrivateEndpoint) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.vcnId, other.vcnId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.sourceIps, other.sourceIps)
                && java.util.Objects.equals(this.nsgIdList, other.nsgIdList)
                && java.util.Objects.equals(
                        this.isUsedWithConfigurationSourceProvider,
                        other.isUsedWithConfigurationSourceProvider)
                && java.util.Objects.equals(this.dnsZones, other.dnsZones)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.vcnId == null ? 43 : this.vcnId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.sourceIps == null ? 43 : this.sourceIps.hashCode());
        result = (result * PRIME) + (this.nsgIdList == null ? 43 : this.nsgIdList.hashCode());
        result =
                (result * PRIME)
                        + (this.isUsedWithConfigurationSourceProvider == null
                                ? 43
                                : this.isUsedWithConfigurationSourceProvider.hashCode());
        result = (result * PRIME) + (this.dnsZones == null ? 43 : this.dnsZones.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
