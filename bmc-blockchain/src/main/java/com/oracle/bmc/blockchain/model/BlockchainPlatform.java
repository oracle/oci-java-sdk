/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * Blockchain Platform Instance Description. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BlockchainPlatform.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BlockchainPlatform
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compartmentId",
        "description",
        "isByol",
        "timeCreated",
        "timeUpdated",
        "platformVersion",
        "serviceVersion",
        "platformRole",
        "computeShape",
        "platformShapeType",
        "loadBalancerShape",
        "serviceEndpoint",
        "lifecycleState",
        "lifecycleDetails",
        "storageSizeInTBs",
        "storageUsedInTBs",
        "isMultiAD",
        "totalOcpuCapacity",
        "componentDetails",
        "replicas",
        "hostOcpuUtilizationInfo",
        "freeformTags",
        "definedTags"
    })
    public BlockchainPlatform(
            String id,
            String displayName,
            String compartmentId,
            String description,
            Boolean isByol,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String platformVersion,
            String serviceVersion,
            PlatformRole platformRole,
            ComputeShape computeShape,
            PlatformShapeType platformShapeType,
            LoadBalancerShape loadBalancerShape,
            String serviceEndpoint,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            Double storageSizeInTBs,
            Double storageUsedInTBs,
            Boolean isMultiAD,
            Integer totalOcpuCapacity,
            BlockchainPlatformComponentDetails componentDetails,
            ReplicaDetails replicas,
            java.util.List<OcpuUtilizationInfo> hostOcpuUtilizationInfo,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.description = description;
        this.isByol = isByol;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.platformVersion = platformVersion;
        this.serviceVersion = serviceVersion;
        this.platformRole = platformRole;
        this.computeShape = computeShape;
        this.platformShapeType = platformShapeType;
        this.loadBalancerShape = loadBalancerShape;
        this.serviceEndpoint = serviceEndpoint;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.storageSizeInTBs = storageSizeInTBs;
        this.storageUsedInTBs = storageUsedInTBs;
        this.isMultiAD = isMultiAD;
        this.totalOcpuCapacity = totalOcpuCapacity;
        this.componentDetails = componentDetails;
        this.replicas = replicas;
        this.hostOcpuUtilizationInfo = hostOcpuUtilizationInfo;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** unique identifier that is immutable on creation */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * unique identifier that is immutable on creation
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Platform Instance Display name, can be renamed */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Platform Instance Display name, can be renamed
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Compartment Identifier */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Platform Instance Description */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Platform Instance Description
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Bring your own license */
        @com.fasterxml.jackson.annotation.JsonProperty("isByol")
        private Boolean isByol;

        /**
         * Bring your own license
         *
         * @param isByol the value to set
         * @return this builder
         */
        public Builder isByol(Boolean isByol) {
            this.isByol = isByol;
            this.__explicitlySet__.add("isByol");
            return this;
        }
        /** The time the the Platform Instance was created. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the the Platform Instance was created. An RFC3339 formatted datetime string
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The time the Platform Instance was updated. An RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the Platform Instance was updated. An RFC3339 formatted datetime string
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** Platform Version */
        @com.fasterxml.jackson.annotation.JsonProperty("platformVersion")
        private String platformVersion;

        /**
         * Platform Version
         *
         * @param platformVersion the value to set
         * @return this builder
         */
        public Builder platformVersion(String platformVersion) {
            this.platformVersion = platformVersion;
            this.__explicitlySet__.add("platformVersion");
            return this;
        }
        /** The version of the Platform Instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceVersion")
        private String serviceVersion;

        /**
         * The version of the Platform Instance.
         *
         * @param serviceVersion the value to set
         * @return this builder
         */
        public Builder serviceVersion(String serviceVersion) {
            this.serviceVersion = serviceVersion;
            this.__explicitlySet__.add("serviceVersion");
            return this;
        }
        /** Role of platform - FOUNDER or PARTICIPANT */
        @com.fasterxml.jackson.annotation.JsonProperty("platformRole")
        private PlatformRole platformRole;

        /**
         * Role of platform - FOUNDER or PARTICIPANT
         *
         * @param platformRole the value to set
         * @return this builder
         */
        public Builder platformRole(PlatformRole platformRole) {
            this.platformRole = platformRole;
            this.__explicitlySet__.add("platformRole");
            return this;
        }
        /**
         * Compute shape - STANDARD or ENTERPRISE_SMALL or ENTERPRISE_MEDIUM or ENTERPRISE_LARGE or
         * ENTERPRISE_EXTRA_LARGE or ENTERPRISE_CUSTOM
         */
        @com.fasterxml.jackson.annotation.JsonProperty("computeShape")
        private ComputeShape computeShape;

        /**
         * Compute shape - STANDARD or ENTERPRISE_SMALL or ENTERPRISE_MEDIUM or ENTERPRISE_LARGE or
         * ENTERPRISE_EXTRA_LARGE or ENTERPRISE_CUSTOM
         *
         * @param computeShape the value to set
         * @return this builder
         */
        public Builder computeShape(ComputeShape computeShape) {
            this.computeShape = computeShape;
            this.__explicitlySet__.add("computeShape");
            return this;
        }
        /** Type of Platform shape - DEFAULT or CUSTOM */
        @com.fasterxml.jackson.annotation.JsonProperty("platformShapeType")
        private PlatformShapeType platformShapeType;

        /**
         * Type of Platform shape - DEFAULT or CUSTOM
         *
         * @param platformShapeType the value to set
         * @return this builder
         */
        public Builder platformShapeType(PlatformShapeType platformShapeType) {
            this.platformShapeType = platformShapeType;
            this.__explicitlySet__.add("platformShapeType");
            return this;
        }
        /** Type of Load Balancer shape - LB_100_MBPS or LB_400_MBPS. Default is LB_100_MBPS. */
        @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerShape")
        private LoadBalancerShape loadBalancerShape;

        /**
         * Type of Load Balancer shape - LB_100_MBPS or LB_400_MBPS. Default is LB_100_MBPS.
         *
         * @param loadBalancerShape the value to set
         * @return this builder
         */
        public Builder loadBalancerShape(LoadBalancerShape loadBalancerShape) {
            this.loadBalancerShape = loadBalancerShape;
            this.__explicitlySet__.add("loadBalancerShape");
            return this;
        }
        /** Service endpoint URL, valid post-provisioning */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceEndpoint")
        private String serviceEndpoint;

        /**
         * Service endpoint URL, valid post-provisioning
         *
         * @param serviceEndpoint the value to set
         * @return this builder
         */
        public Builder serviceEndpoint(String serviceEndpoint) {
            this.serviceEndpoint = serviceEndpoint;
            this.__explicitlySet__.add("serviceEndpoint");
            return this;
        }
        /** The current state of the Platform Instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the Platform Instance.
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
         * An message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * An message describing the current state in more detail. For example, can be used to
         * provide actionable information for a resource in Failed state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /** Storage size in TBs */
        @com.fasterxml.jackson.annotation.JsonProperty("storageSizeInTBs")
        private Double storageSizeInTBs;

        /**
         * Storage size in TBs
         *
         * @param storageSizeInTBs the value to set
         * @return this builder
         */
        public Builder storageSizeInTBs(Double storageSizeInTBs) {
            this.storageSizeInTBs = storageSizeInTBs;
            this.__explicitlySet__.add("storageSizeInTBs");
            return this;
        }
        /** Storage used in TBs */
        @com.fasterxml.jackson.annotation.JsonProperty("storageUsedInTBs")
        private Double storageUsedInTBs;

        /**
         * Storage used in TBs
         *
         * @param storageUsedInTBs the value to set
         * @return this builder
         */
        public Builder storageUsedInTBs(Double storageUsedInTBs) {
            this.storageUsedInTBs = storageUsedInTBs;
            this.__explicitlySet__.add("storageUsedInTBs");
            return this;
        }
        /** True for multi-AD blockchain plaforms, false for single-AD */
        @com.fasterxml.jackson.annotation.JsonProperty("isMultiAD")
        private Boolean isMultiAD;

        /**
         * True for multi-AD blockchain plaforms, false for single-AD
         *
         * @param isMultiAD the value to set
         * @return this builder
         */
        public Builder isMultiAD(Boolean isMultiAD) {
            this.isMultiAD = isMultiAD;
            this.__explicitlySet__.add("isMultiAD");
            return this;
        }
        /** Number of total OCPUs allocated to the platform cluster */
        @com.fasterxml.jackson.annotation.JsonProperty("totalOcpuCapacity")
        private Integer totalOcpuCapacity;

        /**
         * Number of total OCPUs allocated to the platform cluster
         *
         * @param totalOcpuCapacity the value to set
         * @return this builder
         */
        public Builder totalOcpuCapacity(Integer totalOcpuCapacity) {
            this.totalOcpuCapacity = totalOcpuCapacity;
            this.__explicitlySet__.add("totalOcpuCapacity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("componentDetails")
        private BlockchainPlatformComponentDetails componentDetails;

        public Builder componentDetails(BlockchainPlatformComponentDetails componentDetails) {
            this.componentDetails = componentDetails;
            this.__explicitlySet__.add("componentDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("replicas")
        private ReplicaDetails replicas;

        public Builder replicas(ReplicaDetails replicas) {
            this.replicas = replicas;
            this.__explicitlySet__.add("replicas");
            return this;
        }
        /** List of OcpuUtilization for all hosts */
        @com.fasterxml.jackson.annotation.JsonProperty("hostOcpuUtilizationInfo")
        private java.util.List<OcpuUtilizationInfo> hostOcpuUtilizationInfo;

        /**
         * List of OcpuUtilization for all hosts
         *
         * @param hostOcpuUtilizationInfo the value to set
         * @return this builder
         */
        public Builder hostOcpuUtilizationInfo(
                java.util.List<OcpuUtilizationInfo> hostOcpuUtilizationInfo) {
            this.hostOcpuUtilizationInfo = hostOcpuUtilizationInfo;
            this.__explicitlySet__.add("hostOcpuUtilizationInfo");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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

        public BlockchainPlatform build() {
            BlockchainPlatform model =
                    new BlockchainPlatform(
                            this.id,
                            this.displayName,
                            this.compartmentId,
                            this.description,
                            this.isByol,
                            this.timeCreated,
                            this.timeUpdated,
                            this.platformVersion,
                            this.serviceVersion,
                            this.platformRole,
                            this.computeShape,
                            this.platformShapeType,
                            this.loadBalancerShape,
                            this.serviceEndpoint,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.storageSizeInTBs,
                            this.storageUsedInTBs,
                            this.isMultiAD,
                            this.totalOcpuCapacity,
                            this.componentDetails,
                            this.replicas,
                            this.hostOcpuUtilizationInfo,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BlockchainPlatform model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isByol")) {
                this.isByol(model.getIsByol());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("platformVersion")) {
                this.platformVersion(model.getPlatformVersion());
            }
            if (model.wasPropertyExplicitlySet("serviceVersion")) {
                this.serviceVersion(model.getServiceVersion());
            }
            if (model.wasPropertyExplicitlySet("platformRole")) {
                this.platformRole(model.getPlatformRole());
            }
            if (model.wasPropertyExplicitlySet("computeShape")) {
                this.computeShape(model.getComputeShape());
            }
            if (model.wasPropertyExplicitlySet("platformShapeType")) {
                this.platformShapeType(model.getPlatformShapeType());
            }
            if (model.wasPropertyExplicitlySet("loadBalancerShape")) {
                this.loadBalancerShape(model.getLoadBalancerShape());
            }
            if (model.wasPropertyExplicitlySet("serviceEndpoint")) {
                this.serviceEndpoint(model.getServiceEndpoint());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("storageSizeInTBs")) {
                this.storageSizeInTBs(model.getStorageSizeInTBs());
            }
            if (model.wasPropertyExplicitlySet("storageUsedInTBs")) {
                this.storageUsedInTBs(model.getStorageUsedInTBs());
            }
            if (model.wasPropertyExplicitlySet("isMultiAD")) {
                this.isMultiAD(model.getIsMultiAD());
            }
            if (model.wasPropertyExplicitlySet("totalOcpuCapacity")) {
                this.totalOcpuCapacity(model.getTotalOcpuCapacity());
            }
            if (model.wasPropertyExplicitlySet("componentDetails")) {
                this.componentDetails(model.getComponentDetails());
            }
            if (model.wasPropertyExplicitlySet("replicas")) {
                this.replicas(model.getReplicas());
            }
            if (model.wasPropertyExplicitlySet("hostOcpuUtilizationInfo")) {
                this.hostOcpuUtilizationInfo(model.getHostOcpuUtilizationInfo());
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

    /** unique identifier that is immutable on creation */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * unique identifier that is immutable on creation
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Platform Instance Display name, can be renamed */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Platform Instance Display name, can be renamed
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Compartment Identifier */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Platform Instance Description */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Platform Instance Description
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Bring your own license */
    @com.fasterxml.jackson.annotation.JsonProperty("isByol")
    private final Boolean isByol;

    /**
     * Bring your own license
     *
     * @return the value
     */
    public Boolean getIsByol() {
        return isByol;
    }

    /** The time the the Platform Instance was created. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the the Platform Instance was created. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The time the Platform Instance was updated. An RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the Platform Instance was updated. An RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** Platform Version */
    @com.fasterxml.jackson.annotation.JsonProperty("platformVersion")
    private final String platformVersion;

    /**
     * Platform Version
     *
     * @return the value
     */
    public String getPlatformVersion() {
        return platformVersion;
    }

    /** The version of the Platform Instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceVersion")
    private final String serviceVersion;

    /**
     * The version of the Platform Instance.
     *
     * @return the value
     */
    public String getServiceVersion() {
        return serviceVersion;
    }

    /** Role of platform - FOUNDER or PARTICIPANT */
    public enum PlatformRole implements com.oracle.bmc.http.internal.BmcEnum {
        Founder("FOUNDER"),
        Participant("PARTICIPANT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PlatformRole.class);

        private final String value;
        private static java.util.Map<String, PlatformRole> map;

        static {
            map = new java.util.HashMap<>();
            for (PlatformRole v : PlatformRole.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PlatformRole(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PlatformRole create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PlatformRole', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Role of platform - FOUNDER or PARTICIPANT */
    @com.fasterxml.jackson.annotation.JsonProperty("platformRole")
    private final PlatformRole platformRole;

    /**
     * Role of platform - FOUNDER or PARTICIPANT
     *
     * @return the value
     */
    public PlatformRole getPlatformRole() {
        return platformRole;
    }

    /**
     * Compute shape - STANDARD or ENTERPRISE_SMALL or ENTERPRISE_MEDIUM or ENTERPRISE_LARGE or
     * ENTERPRISE_EXTRA_LARGE or ENTERPRISE_CUSTOM
     */
    public enum ComputeShape implements com.oracle.bmc.http.internal.BmcEnum {
        Standard("STANDARD"),
        EnterpriseSmall("ENTERPRISE_SMALL"),
        EnterpriseMedium("ENTERPRISE_MEDIUM"),
        EnterpriseLarge("ENTERPRISE_LARGE"),
        EnterpriseExtraLarge("ENTERPRISE_EXTRA_LARGE"),
        EnterpriseCustom("ENTERPRISE_CUSTOM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ComputeShape.class);

        private final String value;
        private static java.util.Map<String, ComputeShape> map;

        static {
            map = new java.util.HashMap<>();
            for (ComputeShape v : ComputeShape.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ComputeShape(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ComputeShape create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ComputeShape', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Compute shape - STANDARD or ENTERPRISE_SMALL or ENTERPRISE_MEDIUM or ENTERPRISE_LARGE or
     * ENTERPRISE_EXTRA_LARGE or ENTERPRISE_CUSTOM
     */
    @com.fasterxml.jackson.annotation.JsonProperty("computeShape")
    private final ComputeShape computeShape;

    /**
     * Compute shape - STANDARD or ENTERPRISE_SMALL or ENTERPRISE_MEDIUM or ENTERPRISE_LARGE or
     * ENTERPRISE_EXTRA_LARGE or ENTERPRISE_CUSTOM
     *
     * @return the value
     */
    public ComputeShape getComputeShape() {
        return computeShape;
    }

    /** Type of Platform shape - DEFAULT or CUSTOM */
    public enum PlatformShapeType implements com.oracle.bmc.http.internal.BmcEnum {
        Default("DEFAULT"),
        Custom("CUSTOM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PlatformShapeType.class);

        private final String value;
        private static java.util.Map<String, PlatformShapeType> map;

        static {
            map = new java.util.HashMap<>();
            for (PlatformShapeType v : PlatformShapeType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PlatformShapeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PlatformShapeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PlatformShapeType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Type of Platform shape - DEFAULT or CUSTOM */
    @com.fasterxml.jackson.annotation.JsonProperty("platformShapeType")
    private final PlatformShapeType platformShapeType;

    /**
     * Type of Platform shape - DEFAULT or CUSTOM
     *
     * @return the value
     */
    public PlatformShapeType getPlatformShapeType() {
        return platformShapeType;
    }

    /** Type of Load Balancer shape - LB_100_MBPS or LB_400_MBPS. Default is LB_100_MBPS. */
    public enum LoadBalancerShape implements com.oracle.bmc.http.internal.BmcEnum {
        Lb100Mbps("LB_100_MBPS"),
        Lb400Mbps("LB_400_MBPS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LoadBalancerShape.class);

        private final String value;
        private static java.util.Map<String, LoadBalancerShape> map;

        static {
            map = new java.util.HashMap<>();
            for (LoadBalancerShape v : LoadBalancerShape.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LoadBalancerShape(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LoadBalancerShape create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LoadBalancerShape', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Type of Load Balancer shape - LB_100_MBPS or LB_400_MBPS. Default is LB_100_MBPS. */
    @com.fasterxml.jackson.annotation.JsonProperty("loadBalancerShape")
    private final LoadBalancerShape loadBalancerShape;

    /**
     * Type of Load Balancer shape - LB_100_MBPS or LB_400_MBPS. Default is LB_100_MBPS.
     *
     * @return the value
     */
    public LoadBalancerShape getLoadBalancerShape() {
        return loadBalancerShape;
    }

    /** Service endpoint URL, valid post-provisioning */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceEndpoint")
    private final String serviceEndpoint;

    /**
     * Service endpoint URL, valid post-provisioning
     *
     * @return the value
     */
    public String getServiceEndpoint() {
        return serviceEndpoint;
    }

    /** The current state of the Platform Instance. */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Updating("UPDATING"),
        Active("ACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Scaling("SCALING"),
        Inactive("INACTIVE"),
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
    /** The current state of the Platform Instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the Platform Instance.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * An message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * An message describing the current state in more detail. For example, can be used to provide
     * actionable information for a resource in Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /** Storage size in TBs */
    @com.fasterxml.jackson.annotation.JsonProperty("storageSizeInTBs")
    private final Double storageSizeInTBs;

    /**
     * Storage size in TBs
     *
     * @return the value
     */
    public Double getStorageSizeInTBs() {
        return storageSizeInTBs;
    }

    /** Storage used in TBs */
    @com.fasterxml.jackson.annotation.JsonProperty("storageUsedInTBs")
    private final Double storageUsedInTBs;

    /**
     * Storage used in TBs
     *
     * @return the value
     */
    public Double getStorageUsedInTBs() {
        return storageUsedInTBs;
    }

    /** True for multi-AD blockchain plaforms, false for single-AD */
    @com.fasterxml.jackson.annotation.JsonProperty("isMultiAD")
    private final Boolean isMultiAD;

    /**
     * True for multi-AD blockchain plaforms, false for single-AD
     *
     * @return the value
     */
    public Boolean getIsMultiAD() {
        return isMultiAD;
    }

    /** Number of total OCPUs allocated to the platform cluster */
    @com.fasterxml.jackson.annotation.JsonProperty("totalOcpuCapacity")
    private final Integer totalOcpuCapacity;

    /**
     * Number of total OCPUs allocated to the platform cluster
     *
     * @return the value
     */
    public Integer getTotalOcpuCapacity() {
        return totalOcpuCapacity;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("componentDetails")
    private final BlockchainPlatformComponentDetails componentDetails;

    public BlockchainPlatformComponentDetails getComponentDetails() {
        return componentDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("replicas")
    private final ReplicaDetails replicas;

    public ReplicaDetails getReplicas() {
        return replicas;
    }

    /** List of OcpuUtilization for all hosts */
    @com.fasterxml.jackson.annotation.JsonProperty("hostOcpuUtilizationInfo")
    private final java.util.List<OcpuUtilizationInfo> hostOcpuUtilizationInfo;

    /**
     * List of OcpuUtilization for all hosts
     *
     * @return the value
     */
    public java.util.List<OcpuUtilizationInfo> getHostOcpuUtilizationInfo() {
        return hostOcpuUtilizationInfo;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
        sb.append("BlockchainPlatform(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isByol=").append(String.valueOf(this.isByol));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", platformVersion=").append(String.valueOf(this.platformVersion));
        sb.append(", serviceVersion=").append(String.valueOf(this.serviceVersion));
        sb.append(", platformRole=").append(String.valueOf(this.platformRole));
        sb.append(", computeShape=").append(String.valueOf(this.computeShape));
        sb.append(", platformShapeType=").append(String.valueOf(this.platformShapeType));
        sb.append(", loadBalancerShape=").append(String.valueOf(this.loadBalancerShape));
        sb.append(", serviceEndpoint=").append(String.valueOf(this.serviceEndpoint));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", storageSizeInTBs=").append(String.valueOf(this.storageSizeInTBs));
        sb.append(", storageUsedInTBs=").append(String.valueOf(this.storageUsedInTBs));
        sb.append(", isMultiAD=").append(String.valueOf(this.isMultiAD));
        sb.append(", totalOcpuCapacity=").append(String.valueOf(this.totalOcpuCapacity));
        sb.append(", componentDetails=").append(String.valueOf(this.componentDetails));
        sb.append(", replicas=").append(String.valueOf(this.replicas));
        sb.append(", hostOcpuUtilizationInfo=")
                .append(String.valueOf(this.hostOcpuUtilizationInfo));
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
        if (!(o instanceof BlockchainPlatform)) {
            return false;
        }

        BlockchainPlatform other = (BlockchainPlatform) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isByol, other.isByol)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.platformVersion, other.platformVersion)
                && java.util.Objects.equals(this.serviceVersion, other.serviceVersion)
                && java.util.Objects.equals(this.platformRole, other.platformRole)
                && java.util.Objects.equals(this.computeShape, other.computeShape)
                && java.util.Objects.equals(this.platformShapeType, other.platformShapeType)
                && java.util.Objects.equals(this.loadBalancerShape, other.loadBalancerShape)
                && java.util.Objects.equals(this.serviceEndpoint, other.serviceEndpoint)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.storageSizeInTBs, other.storageSizeInTBs)
                && java.util.Objects.equals(this.storageUsedInTBs, other.storageUsedInTBs)
                && java.util.Objects.equals(this.isMultiAD, other.isMultiAD)
                && java.util.Objects.equals(this.totalOcpuCapacity, other.totalOcpuCapacity)
                && java.util.Objects.equals(this.componentDetails, other.componentDetails)
                && java.util.Objects.equals(this.replicas, other.replicas)
                && java.util.Objects.equals(
                        this.hostOcpuUtilizationInfo, other.hostOcpuUtilizationInfo)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.isByol == null ? 43 : this.isByol.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.platformVersion == null ? 43 : this.platformVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceVersion == null ? 43 : this.serviceVersion.hashCode());
        result = (result * PRIME) + (this.platformRole == null ? 43 : this.platformRole.hashCode());
        result = (result * PRIME) + (this.computeShape == null ? 43 : this.computeShape.hashCode());
        result =
                (result * PRIME)
                        + (this.platformShapeType == null ? 43 : this.platformShapeType.hashCode());
        result =
                (result * PRIME)
                        + (this.loadBalancerShape == null ? 43 : this.loadBalancerShape.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceEndpoint == null ? 43 : this.serviceEndpoint.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.storageSizeInTBs == null ? 43 : this.storageSizeInTBs.hashCode());
        result =
                (result * PRIME)
                        + (this.storageUsedInTBs == null ? 43 : this.storageUsedInTBs.hashCode());
        result = (result * PRIME) + (this.isMultiAD == null ? 43 : this.isMultiAD.hashCode());
        result =
                (result * PRIME)
                        + (this.totalOcpuCapacity == null ? 43 : this.totalOcpuCapacity.hashCode());
        result =
                (result * PRIME)
                        + (this.componentDetails == null ? 43 : this.componentDetails.hashCode());
        result = (result * PRIME) + (this.replicas == null ? 43 : this.replicas.hashCode());
        result =
                (result * PRIME)
                        + (this.hostOcpuUtilizationInfo == null
                                ? 43
                                : this.hostOcpuUtilizationInfo.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
