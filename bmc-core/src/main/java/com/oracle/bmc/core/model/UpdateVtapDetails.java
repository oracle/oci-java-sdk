/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * These details can be included in a request to update a virtual test access point (VTAP). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateVtapDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateVtapDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "definedTags",
        "displayName",
        "freeformTags",
        "sourceId",
        "targetId",
        "targetIp",
        "captureFilterId",
        "encapsulationProtocol",
        "vxlanNetworkIdentifier",
        "isVtapEnabled",
        "trafficMode",
        "maxPacketSize",
        "sourcePrivateEndpointIp",
        "sourcePrivateEndpointSubnetId",
        "targetType",
        "sourceType"
    })
    public UpdateVtapDetails(
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String displayName,
            java.util.Map<String, String> freeformTags,
            String sourceId,
            String targetId,
            String targetIp,
            String captureFilterId,
            EncapsulationProtocol encapsulationProtocol,
            Long vxlanNetworkIdentifier,
            Boolean isVtapEnabled,
            TrafficMode trafficMode,
            Integer maxPacketSize,
            String sourcePrivateEndpointIp,
            String sourcePrivateEndpointSubnetId,
            TargetType targetType,
            SourceType sourceType) {
        super();
        this.definedTags = definedTags;
        this.displayName = displayName;
        this.freeformTags = freeformTags;
        this.sourceId = sourceId;
        this.targetId = targetId;
        this.targetIp = targetIp;
        this.captureFilterId = captureFilterId;
        this.encapsulationProtocol = encapsulationProtocol;
        this.vxlanNetworkIdentifier = vxlanNetworkIdentifier;
        this.isVtapEnabled = isVtapEnabled;
        this.trafficMode = trafficMode;
        this.maxPacketSize = maxPacketSize;
        this.sourcePrivateEndpointIp = sourcePrivateEndpointIp;
        this.sourcePrivateEndpointSubnetId = sourcePrivateEndpointSubnetId;
        this.targetType = targetType;
        this.sourceType = sourceType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
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
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the source point where packets are captured.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private String sourceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the source point where packets are captured.
         *
         * @param sourceId the value to set
         * @return this builder
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the destination resource where mirrored packets are sent.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the destination resource where mirrored packets are sent.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** The IP address of the destination resource where mirrored packets are sent. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetIp")
        private String targetIp;

        /**
         * The IP address of the destination resource where mirrored packets are sent.
         *
         * @param targetIp the value to set
         * @return this builder
         */
        public Builder targetIp(String targetIp) {
            this.targetIp = targetIp;
            this.__explicitlySet__.add("targetIp");
            return this;
        }
        /**
         * The capture filter's Oracle ID
         * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("captureFilterId")
        private String captureFilterId;

        /**
         * The capture filter's Oracle ID
         * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
         *
         * @param captureFilterId the value to set
         * @return this builder
         */
        public Builder captureFilterId(String captureFilterId) {
            this.captureFilterId = captureFilterId;
            this.__explicitlySet__.add("captureFilterId");
            return this;
        }
        /** Defines an encapsulation header type for the VTAP's mirrored traffic. */
        @com.fasterxml.jackson.annotation.JsonProperty("encapsulationProtocol")
        private EncapsulationProtocol encapsulationProtocol;

        /**
         * Defines an encapsulation header type for the VTAP's mirrored traffic.
         *
         * @param encapsulationProtocol the value to set
         * @return this builder
         */
        public Builder encapsulationProtocol(EncapsulationProtocol encapsulationProtocol) {
            this.encapsulationProtocol = encapsulationProtocol;
            this.__explicitlySet__.add("encapsulationProtocol");
            return this;
        }
        /**
         * The virtual extensible LAN (VXLAN) network identifier (or VXLAN segment ID) that uniquely
         * identifies the VXLAN.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("vxlanNetworkIdentifier")
        private Long vxlanNetworkIdentifier;

        /**
         * The virtual extensible LAN (VXLAN) network identifier (or VXLAN segment ID) that uniquely
         * identifies the VXLAN.
         *
         * @param vxlanNetworkIdentifier the value to set
         * @return this builder
         */
        public Builder vxlanNetworkIdentifier(Long vxlanNetworkIdentifier) {
            this.vxlanNetworkIdentifier = vxlanNetworkIdentifier;
            this.__explicitlySet__.add("vxlanNetworkIdentifier");
            return this;
        }
        /**
         * Used to start or stop a {@code Vtap} resource.
         *
         * <p>{@code TRUE} directs the VTAP to start mirroring traffic. * {@code FALSE} (Default)
         * directs the VTAP to stop mirroring traffic.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isVtapEnabled")
        private Boolean isVtapEnabled;

        /**
         * Used to start or stop a {@code Vtap} resource.
         *
         * <p>{@code TRUE} directs the VTAP to start mirroring traffic. * {@code FALSE} (Default)
         * directs the VTAP to stop mirroring traffic.
         *
         * @param isVtapEnabled the value to set
         * @return this builder
         */
        public Builder isVtapEnabled(Boolean isVtapEnabled) {
            this.isVtapEnabled = isVtapEnabled;
            this.__explicitlySet__.add("isVtapEnabled");
            return this;
        }
        /**
         * Used to control the priority of traffic. It is an optional field. If it not passed, the
         * value is DEFAULT
         */
        @com.fasterxml.jackson.annotation.JsonProperty("trafficMode")
        private TrafficMode trafficMode;

        /**
         * Used to control the priority of traffic. It is an optional field. If it not passed, the
         * value is DEFAULT
         *
         * @param trafficMode the value to set
         * @return this builder
         */
        public Builder trafficMode(TrafficMode trafficMode) {
            this.trafficMode = trafficMode;
            this.__explicitlySet__.add("trafficMode");
            return this;
        }
        /** The maximum size of the packets to be included in the filter. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxPacketSize")
        private Integer maxPacketSize;

        /**
         * The maximum size of the packets to be included in the filter.
         *
         * @param maxPacketSize the value to set
         * @return this builder
         */
        public Builder maxPacketSize(Integer maxPacketSize) {
            this.maxPacketSize = maxPacketSize;
            this.__explicitlySet__.add("maxPacketSize");
            return this;
        }
        /** The IP Address of the source private endpoint. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourcePrivateEndpointIp")
        private String sourcePrivateEndpointIp;

        /**
         * The IP Address of the source private endpoint.
         *
         * @param sourcePrivateEndpointIp the value to set
         * @return this builder
         */
        public Builder sourcePrivateEndpointIp(String sourcePrivateEndpointIp) {
            this.sourcePrivateEndpointIp = sourcePrivateEndpointIp;
            this.__explicitlySet__.add("sourcePrivateEndpointIp");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the subnet that source private endpoint belongs to.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sourcePrivateEndpointSubnetId")
        private String sourcePrivateEndpointSubnetId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the subnet that source private endpoint belongs to.
         *
         * @param sourcePrivateEndpointSubnetId the value to set
         * @return this builder
         */
        public Builder sourcePrivateEndpointSubnetId(String sourcePrivateEndpointSubnetId) {
            this.sourcePrivateEndpointSubnetId = sourcePrivateEndpointSubnetId;
            this.__explicitlySet__.add("sourcePrivateEndpointSubnetId");
            return this;
        }
        /** The target type for the VTAP. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetType")
        private TargetType targetType;

        /**
         * The target type for the VTAP.
         *
         * @param targetType the value to set
         * @return this builder
         */
        public Builder targetType(TargetType targetType) {
            this.targetType = targetType;
            this.__explicitlySet__.add("targetType");
            return this;
        }
        /** The source type for the VTAP. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
        private SourceType sourceType;

        /**
         * The source type for the VTAP.
         *
         * @param sourceType the value to set
         * @return this builder
         */
        public Builder sourceType(SourceType sourceType) {
            this.sourceType = sourceType;
            this.__explicitlySet__.add("sourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateVtapDetails build() {
            UpdateVtapDetails model =
                    new UpdateVtapDetails(
                            this.definedTags,
                            this.displayName,
                            this.freeformTags,
                            this.sourceId,
                            this.targetId,
                            this.targetIp,
                            this.captureFilterId,
                            this.encapsulationProtocol,
                            this.vxlanNetworkIdentifier,
                            this.isVtapEnabled,
                            this.trafficMode,
                            this.maxPacketSize,
                            this.sourcePrivateEndpointIp,
                            this.sourcePrivateEndpointSubnetId,
                            this.targetType,
                            this.sourceType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateVtapDetails model) {
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("sourceId")) {
                this.sourceId(model.getSourceId());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("targetIp")) {
                this.targetIp(model.getTargetIp());
            }
            if (model.wasPropertyExplicitlySet("captureFilterId")) {
                this.captureFilterId(model.getCaptureFilterId());
            }
            if (model.wasPropertyExplicitlySet("encapsulationProtocol")) {
                this.encapsulationProtocol(model.getEncapsulationProtocol());
            }
            if (model.wasPropertyExplicitlySet("vxlanNetworkIdentifier")) {
                this.vxlanNetworkIdentifier(model.getVxlanNetworkIdentifier());
            }
            if (model.wasPropertyExplicitlySet("isVtapEnabled")) {
                this.isVtapEnabled(model.getIsVtapEnabled());
            }
            if (model.wasPropertyExplicitlySet("trafficMode")) {
                this.trafficMode(model.getTrafficMode());
            }
            if (model.wasPropertyExplicitlySet("maxPacketSize")) {
                this.maxPacketSize(model.getMaxPacketSize());
            }
            if (model.wasPropertyExplicitlySet("sourcePrivateEndpointIp")) {
                this.sourcePrivateEndpointIp(model.getSourcePrivateEndpointIp());
            }
            if (model.wasPropertyExplicitlySet("sourcePrivateEndpointSubnetId")) {
                this.sourcePrivateEndpointSubnetId(model.getSourcePrivateEndpointSubnetId());
            }
            if (model.wasPropertyExplicitlySet("targetType")) {
                this.targetType(model.getTargetType());
            }
            if (model.wasPropertyExplicitlySet("sourceType")) {
                this.sourceType(model.getSourceType());
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
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the source point where packets are captured.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    private final String sourceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the source point where packets are captured.
     *
     * @return the value
     */
    public String getSourceId() {
        return sourceId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the destination resource where mirrored packets are sent.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the destination resource where mirrored packets are sent.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /** The IP address of the destination resource where mirrored packets are sent. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetIp")
    private final String targetIp;

    /**
     * The IP address of the destination resource where mirrored packets are sent.
     *
     * @return the value
     */
    public String getTargetIp() {
        return targetIp;
    }

    /**
     * The capture filter's Oracle ID
     * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("captureFilterId")
    private final String captureFilterId;

    /**
     * The capture filter's Oracle ID
     * ([OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)).
     *
     * @return the value
     */
    public String getCaptureFilterId() {
        return captureFilterId;
    }

    /** Defines an encapsulation header type for the VTAP's mirrored traffic. */
    public enum EncapsulationProtocol implements com.oracle.bmc.http.internal.BmcEnum {
        Vxlan("VXLAN"),
        ;

        private final String value;
        private static java.util.Map<String, EncapsulationProtocol> map;

        static {
            map = new java.util.HashMap<>();
            for (EncapsulationProtocol v : EncapsulationProtocol.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid EncapsulationProtocol: " + key);
        }
    };
    /** Defines an encapsulation header type for the VTAP's mirrored traffic. */
    @com.fasterxml.jackson.annotation.JsonProperty("encapsulationProtocol")
    private final EncapsulationProtocol encapsulationProtocol;

    /**
     * Defines an encapsulation header type for the VTAP's mirrored traffic.
     *
     * @return the value
     */
    public EncapsulationProtocol getEncapsulationProtocol() {
        return encapsulationProtocol;
    }

    /**
     * The virtual extensible LAN (VXLAN) network identifier (or VXLAN segment ID) that uniquely
     * identifies the VXLAN.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("vxlanNetworkIdentifier")
    private final Long vxlanNetworkIdentifier;

    /**
     * The virtual extensible LAN (VXLAN) network identifier (or VXLAN segment ID) that uniquely
     * identifies the VXLAN.
     *
     * @return the value
     */
    public Long getVxlanNetworkIdentifier() {
        return vxlanNetworkIdentifier;
    }

    /**
     * Used to start or stop a {@code Vtap} resource.
     *
     * <p>{@code TRUE} directs the VTAP to start mirroring traffic. * {@code FALSE} (Default)
     * directs the VTAP to stop mirroring traffic.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isVtapEnabled")
    private final Boolean isVtapEnabled;

    /**
     * Used to start or stop a {@code Vtap} resource.
     *
     * <p>{@code TRUE} directs the VTAP to start mirroring traffic. * {@code FALSE} (Default)
     * directs the VTAP to stop mirroring traffic.
     *
     * @return the value
     */
    public Boolean getIsVtapEnabled() {
        return isVtapEnabled;
    }

    /**
     * Used to control the priority of traffic. It is an optional field. If it not passed, the value
     * is DEFAULT
     */
    public enum TrafficMode implements com.oracle.bmc.http.internal.BmcEnum {
        Default("DEFAULT"),
        Priority("PRIORITY"),
        ;

        private final String value;
        private static java.util.Map<String, TrafficMode> map;

        static {
            map = new java.util.HashMap<>();
            for (TrafficMode v : TrafficMode.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid TrafficMode: " + key);
        }
    };
    /**
     * Used to control the priority of traffic. It is an optional field. If it not passed, the value
     * is DEFAULT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trafficMode")
    private final TrafficMode trafficMode;

    /**
     * Used to control the priority of traffic. It is an optional field. If it not passed, the value
     * is DEFAULT
     *
     * @return the value
     */
    public TrafficMode getTrafficMode() {
        return trafficMode;
    }

    /** The maximum size of the packets to be included in the filter. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxPacketSize")
    private final Integer maxPacketSize;

    /**
     * The maximum size of the packets to be included in the filter.
     *
     * @return the value
     */
    public Integer getMaxPacketSize() {
        return maxPacketSize;
    }

    /** The IP Address of the source private endpoint. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourcePrivateEndpointIp")
    private final String sourcePrivateEndpointIp;

    /**
     * The IP Address of the source private endpoint.
     *
     * @return the value
     */
    public String getSourcePrivateEndpointIp() {
        return sourcePrivateEndpointIp;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the subnet that source private endpoint belongs to.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourcePrivateEndpointSubnetId")
    private final String sourcePrivateEndpointSubnetId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the subnet that source private endpoint belongs to.
     *
     * @return the value
     */
    public String getSourcePrivateEndpointSubnetId() {
        return sourcePrivateEndpointSubnetId;
    }

    /** The target type for the VTAP. */
    public enum TargetType implements com.oracle.bmc.http.internal.BmcEnum {
        Vnic("VNIC"),
        NetworkLoadBalancer("NETWORK_LOAD_BALANCER"),
        IpAddress("IP_ADDRESS"),
        ;

        private final String value;
        private static java.util.Map<String, TargetType> map;

        static {
            map = new java.util.HashMap<>();
            for (TargetType v : TargetType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid TargetType: " + key);
        }
    };
    /** The target type for the VTAP. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetType")
    private final TargetType targetType;

    /**
     * The target type for the VTAP.
     *
     * @return the value
     */
    public TargetType getTargetType() {
        return targetType;
    }

    /** The source type for the VTAP. */
    public enum SourceType implements com.oracle.bmc.http.internal.BmcEnum {
        Vnic("VNIC"),
        Subnet("SUBNET"),
        LoadBalancer("LOAD_BALANCER"),
        DbSystem("DB_SYSTEM"),
        ExadataVmCluster("EXADATA_VM_CLUSTER"),
        AutonomousDataWarehouse("AUTONOMOUS_DATA_WAREHOUSE"),
        ;

        private final String value;
        private static java.util.Map<String, SourceType> map;

        static {
            map = new java.util.HashMap<>();
            for (SourceType v : SourceType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid SourceType: " + key);
        }
    };
    /** The source type for the VTAP. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
    private final SourceType sourceType;

    /**
     * The source type for the VTAP.
     *
     * @return the value
     */
    public SourceType getSourceType() {
        return sourceType;
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
        sb.append("UpdateVtapDetails(");
        sb.append("super=").append(super.toString());
        sb.append("definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", sourceId=").append(String.valueOf(this.sourceId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", targetIp=").append(String.valueOf(this.targetIp));
        sb.append(", captureFilterId=").append(String.valueOf(this.captureFilterId));
        sb.append(", encapsulationProtocol=").append(String.valueOf(this.encapsulationProtocol));
        sb.append(", vxlanNetworkIdentifier=").append(String.valueOf(this.vxlanNetworkIdentifier));
        sb.append(", isVtapEnabled=").append(String.valueOf(this.isVtapEnabled));
        sb.append(", trafficMode=").append(String.valueOf(this.trafficMode));
        sb.append(", maxPacketSize=").append(String.valueOf(this.maxPacketSize));
        sb.append(", sourcePrivateEndpointIp=")
                .append(String.valueOf(this.sourcePrivateEndpointIp));
        sb.append(", sourcePrivateEndpointSubnetId=")
                .append(String.valueOf(this.sourcePrivateEndpointSubnetId));
        sb.append(", targetType=").append(String.valueOf(this.targetType));
        sb.append(", sourceType=").append(String.valueOf(this.sourceType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateVtapDetails)) {
            return false;
        }

        UpdateVtapDetails other = (UpdateVtapDetails) o;
        return java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.sourceId, other.sourceId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.targetIp, other.targetIp)
                && java.util.Objects.equals(this.captureFilterId, other.captureFilterId)
                && java.util.Objects.equals(this.encapsulationProtocol, other.encapsulationProtocol)
                && java.util.Objects.equals(
                        this.vxlanNetworkIdentifier, other.vxlanNetworkIdentifier)
                && java.util.Objects.equals(this.isVtapEnabled, other.isVtapEnabled)
                && java.util.Objects.equals(this.trafficMode, other.trafficMode)
                && java.util.Objects.equals(this.maxPacketSize, other.maxPacketSize)
                && java.util.Objects.equals(
                        this.sourcePrivateEndpointIp, other.sourcePrivateEndpointIp)
                && java.util.Objects.equals(
                        this.sourcePrivateEndpointSubnetId, other.sourcePrivateEndpointSubnetId)
                && java.util.Objects.equals(this.targetType, other.targetType)
                && java.util.Objects.equals(this.sourceType, other.sourceType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.sourceId == null ? 43 : this.sourceId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.targetIp == null ? 43 : this.targetIp.hashCode());
        result =
                (result * PRIME)
                        + (this.captureFilterId == null ? 43 : this.captureFilterId.hashCode());
        result =
                (result * PRIME)
                        + (this.encapsulationProtocol == null
                                ? 43
                                : this.encapsulationProtocol.hashCode());
        result =
                (result * PRIME)
                        + (this.vxlanNetworkIdentifier == null
                                ? 43
                                : this.vxlanNetworkIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.isVtapEnabled == null ? 43 : this.isVtapEnabled.hashCode());
        result = (result * PRIME) + (this.trafficMode == null ? 43 : this.trafficMode.hashCode());
        result =
                (result * PRIME)
                        + (this.maxPacketSize == null ? 43 : this.maxPacketSize.hashCode());
        result =
                (result * PRIME)
                        + (this.sourcePrivateEndpointIp == null
                                ? 43
                                : this.sourcePrivateEndpointIp.hashCode());
        result =
                (result * PRIME)
                        + (this.sourcePrivateEndpointSubnetId == null
                                ? 43
                                : this.sourcePrivateEndpointSubnetId.hashCode());
        result = (result * PRIME) + (this.targetType == null ? 43 : this.targetType.hashCode());
        result = (result * PRIME) + (this.sourceType == null ? 43 : this.sourceType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
