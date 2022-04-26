/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * A virtual test access point (VTAP) provides a way to mirror all traffic from a designated source to a selected target in order to facilitate troubleshooting, security analysis, and data monitoring.
 * A VTAP is functionally similar to a test access point (TAP) you might deploy in your on-premises network.
 * <p>
 * A *{@link CaptureFilter}* contains a set of *{@link #captureFilterRuleDetails(CaptureFilterRuleDetailsRequest) captureFilterRuleDetails}* governing what traffic a VTAP mirrors.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Vtap.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Vtap {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
        private String vcnId;

        public Builder vcnId(String vcnId) {
            this.vcnId = vcnId;
            this.__explicitlySet__.add("vcnId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
        private LifecycleStateDetails lifecycleStateDetails;

        public Builder lifecycleStateDetails(LifecycleStateDetails lifecycleStateDetails) {
            this.lifecycleStateDetails = lifecycleStateDetails;
            this.__explicitlySet__.add("lifecycleStateDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private String sourceId;

        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetIp")
        private String targetIp;

        public Builder targetIp(String targetIp) {
            this.targetIp = targetIp;
            this.__explicitlySet__.add("targetIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("captureFilterId")
        private String captureFilterId;

        public Builder captureFilterId(String captureFilterId) {
            this.captureFilterId = captureFilterId;
            this.__explicitlySet__.add("captureFilterId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encapsulationProtocol")
        private EncapsulationProtocol encapsulationProtocol;

        public Builder encapsulationProtocol(EncapsulationProtocol encapsulationProtocol) {
            this.encapsulationProtocol = encapsulationProtocol;
            this.__explicitlySet__.add("encapsulationProtocol");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vxlanNetworkIdentifier")
        private Long vxlanNetworkIdentifier;

        public Builder vxlanNetworkIdentifier(Long vxlanNetworkIdentifier) {
            this.vxlanNetworkIdentifier = vxlanNetworkIdentifier;
            this.__explicitlySet__.add("vxlanNetworkIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isVtapEnabled")
        private Boolean isVtapEnabled;

        public Builder isVtapEnabled(Boolean isVtapEnabled) {
            this.isVtapEnabled = isVtapEnabled;
            this.__explicitlySet__.add("isVtapEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
        private SourceType sourceType;

        public Builder sourceType(SourceType sourceType) {
            this.sourceType = sourceType;
            this.__explicitlySet__.add("sourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("trafficMode")
        private TrafficMode trafficMode;

        public Builder trafficMode(TrafficMode trafficMode) {
            this.trafficMode = trafficMode;
            this.__explicitlySet__.add("trafficMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxPacketSize")
        private Integer maxPacketSize;

        public Builder maxPacketSize(Integer maxPacketSize) {
            this.maxPacketSize = maxPacketSize;
            this.__explicitlySet__.add("maxPacketSize");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetType")
        private TargetType targetType;

        public Builder targetType(TargetType targetType) {
            this.targetType = targetType;
            this.__explicitlySet__.add("targetType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourcePrivateEndpointIp")
        private String sourcePrivateEndpointIp;

        public Builder sourcePrivateEndpointIp(String sourcePrivateEndpointIp) {
            this.sourcePrivateEndpointIp = sourcePrivateEndpointIp;
            this.__explicitlySet__.add("sourcePrivateEndpointIp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourcePrivateEndpointSubnetId")
        private String sourcePrivateEndpointSubnetId;

        public Builder sourcePrivateEndpointSubnetId(String sourcePrivateEndpointSubnetId) {
            this.sourcePrivateEndpointSubnetId = sourcePrivateEndpointSubnetId;
            this.__explicitlySet__.add("sourcePrivateEndpointSubnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Vtap build() {
            Vtap __instance__ =
                    new Vtap(
                            compartmentId,
                            vcnId,
                            definedTags,
                            displayName,
                            freeformTags,
                            id,
                            lifecycleState,
                            lifecycleStateDetails,
                            timeCreated,
                            sourceId,
                            targetId,
                            targetIp,
                            captureFilterId,
                            encapsulationProtocol,
                            vxlanNetworkIdentifier,
                            isVtapEnabled,
                            sourceType,
                            trafficMode,
                            maxPacketSize,
                            targetType,
                            sourcePrivateEndpointIp,
                            sourcePrivateEndpointSubnetId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Vtap o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .vcnId(o.getVcnId())
                            .definedTags(o.getDefinedTags())
                            .displayName(o.getDisplayName())
                            .freeformTags(o.getFreeformTags())
                            .id(o.getId())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleStateDetails(o.getLifecycleStateDetails())
                            .timeCreated(o.getTimeCreated())
                            .sourceId(o.getSourceId())
                            .targetId(o.getTargetId())
                            .targetIp(o.getTargetIp())
                            .captureFilterId(o.getCaptureFilterId())
                            .encapsulationProtocol(o.getEncapsulationProtocol())
                            .vxlanNetworkIdentifier(o.getVxlanNetworkIdentifier())
                            .isVtapEnabled(o.getIsVtapEnabled())
                            .sourceType(o.getSourceType())
                            .trafficMode(o.getTrafficMode())
                            .maxPacketSize(o.getMaxPacketSize())
                            .targetType(o.getTargetType())
                            .sourcePrivateEndpointIp(o.getSourcePrivateEndpointIp())
                            .sourcePrivateEndpointSubnetId(o.getSourcePrivateEndpointSubnetId());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment containing the {@code Vtap} resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the VCN containing the {@code Vtap} resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnId")
    String vcnId;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a
     * namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no
     * predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * The VTAP's Oracle ID ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;
    /**
     * The VTAP's administrative lifecycle state.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Provisioning("PROVISIONING"),
        Available("AVAILABLE"),
        Updating("UPDATING"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * The VTAP's administrative lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;
    /**
     * The VTAP's current running state.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleStateDetails {
        Running("RUNNING"),
        Stopped("STOPPED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleStateDetails> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleStateDetails v : LifecycleStateDetails.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleStateDetails(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleStateDetails create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleStateDetails', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The VTAP's current running state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleStateDetails")
    LifecycleStateDetails lifecycleStateDetails;

    /**
     * The date and time the VTAP was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * <p>
     * Example: {@code 2020-08-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the source point where packets are captured.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    String sourceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the destination resource where mirrored packets are sent.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    String targetId;

    /**
     * The IP address of the destination resource where mirrored packets are sent.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetIp")
    String targetIp;

    /**
     * The capture filter's Oracle ID ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("captureFilterId")
    String captureFilterId;
    /**
     * Defines an encapsulation header type for the VTAP's mirrored traffic.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum EncapsulationProtocol {
        Vxlan("VXLAN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, EncapsulationProtocol> map;

        static {
            map = new java.util.HashMap<>();
            for (EncapsulationProtocol v : EncapsulationProtocol.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EncapsulationProtocol(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EncapsulationProtocol create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EncapsulationProtocol', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Defines an encapsulation header type for the VTAP's mirrored traffic.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encapsulationProtocol")
    EncapsulationProtocol encapsulationProtocol;

    /**
     * The virtual extensible LAN (VXLAN) network identifier (or VXLAN segment ID) that uniquely identifies the VXLAN.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vxlanNetworkIdentifier")
    Long vxlanNetworkIdentifier;

    /**
     * Used to start or stop a {@code Vtap} resource.
     * <p>
     * {@code TRUE} directs the VTAP to start mirroring traffic.
     * * {@code FALSE} (Default) directs the VTAP to stop mirroring traffic.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isVtapEnabled")
    Boolean isVtapEnabled;
    /**
     * The source type for the VTAP.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum SourceType {
        Vnic("VNIC"),
        Subnet("SUBNET"),
        LoadBalancer("LOAD_BALANCER"),
        DbSystem("DB_SYSTEM"),
        ExadataVmCluster("EXADATA_VM_CLUSTER"),
        AutonomousDataWarehouse("AUTONOMOUS_DATA_WAREHOUSE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, SourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (SourceType v : SourceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SourceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SourceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SourceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The source type for the VTAP.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
    SourceType sourceType;
    /**
     * Used to control the priority of traffic. It is an optional field. If it not passed, the value is DEFAULT
     **/
    @lombok.extern.slf4j.Slf4j
    public enum TrafficMode {
        Default("DEFAULT"),
        Priority("PRIORITY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, TrafficMode> map;

        static {
            map = new java.util.HashMap<>();
            for (TrafficMode v : TrafficMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TrafficMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TrafficMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TrafficMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Used to control the priority of traffic. It is an optional field. If it not passed, the value is DEFAULT
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trafficMode")
    TrafficMode trafficMode;

    /**
     * The maximum size of the packets to be included in the filter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxPacketSize")
    Integer maxPacketSize;
    /**
     * The target type for the VTAP.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum TargetType {
        Vnic("VNIC"),
        NetworkLoadBalancer("NETWORK_LOAD_BALANCER"),
        IpAddress("IP_ADDRESS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, TargetType> map;

        static {
            map = new java.util.HashMap<>();
            for (TargetType v : TargetType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        TargetType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TargetType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'TargetType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The target type for the VTAP.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetType")
    TargetType targetType;

    /**
     * The IP Address of the source private endpoint.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourcePrivateEndpointIp")
    String sourcePrivateEndpointIp;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the subnet that source private endpoint belongs to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourcePrivateEndpointSubnetId")
    String sourcePrivateEndpointSubnetId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
