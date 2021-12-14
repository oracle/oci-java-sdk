/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Summary of an EM-managed external host insight resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = EmManagedExternalHostInsightSummary.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "entitySource"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class EmManagedExternalHostInsightSummary extends HostInsightSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
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

        @com.fasterxml.jackson.annotation.JsonProperty("hostDisplayName")
        private String hostDisplayName;

        public Builder hostDisplayName(String hostDisplayName) {
            this.hostDisplayName = hostDisplayName;
            this.__explicitlySet__.add("hostDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hostType")
        private String hostType;

        public Builder hostType(String hostType) {
            this.hostType = hostType;
            this.__explicitlySet__.add("hostType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("processorCount")
        private Integer processorCount;

        public Builder processorCount(Integer processorCount) {
            this.processorCount = processorCount;
            this.__explicitlySet__.add("processorCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
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

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private ResourceStatus status;

        public Builder status(ResourceStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerIdentifier")
        private String enterpriseManagerIdentifier;

        public Builder enterpriseManagerIdentifier(String enterpriseManagerIdentifier) {
            this.enterpriseManagerIdentifier = enterpriseManagerIdentifier;
            this.__explicitlySet__.add("enterpriseManagerIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityName")
        private String enterpriseManagerEntityName;

        public Builder enterpriseManagerEntityName(String enterpriseManagerEntityName) {
            this.enterpriseManagerEntityName = enterpriseManagerEntityName;
            this.__explicitlySet__.add("enterpriseManagerEntityName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityType")
        private String enterpriseManagerEntityType;

        public Builder enterpriseManagerEntityType(String enterpriseManagerEntityType) {
            this.enterpriseManagerEntityType = enterpriseManagerEntityType;
            this.__explicitlySet__.add("enterpriseManagerEntityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityIdentifier")
        private String enterpriseManagerEntityIdentifier;

        public Builder enterpriseManagerEntityIdentifier(String enterpriseManagerEntityIdentifier) {
            this.enterpriseManagerEntityIdentifier = enterpriseManagerEntityIdentifier;
            this.__explicitlySet__.add("enterpriseManagerEntityIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityDisplayName")
        private String enterpriseManagerEntityDisplayName;

        public Builder enterpriseManagerEntityDisplayName(
                String enterpriseManagerEntityDisplayName) {
            this.enterpriseManagerEntityDisplayName = enterpriseManagerEntityDisplayName;
            this.__explicitlySet__.add("enterpriseManagerEntityDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerBridgeId")
        private String enterpriseManagerBridgeId;

        public Builder enterpriseManagerBridgeId(String enterpriseManagerBridgeId) {
            this.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
            this.__explicitlySet__.add("enterpriseManagerBridgeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("platformType")
        private PlatformType platformType;

        public Builder platformType(PlatformType platformType) {
            this.platformType = platformType;
            this.__explicitlySet__.add("platformType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exadataInsightId")
        private String exadataInsightId;

        public Builder exadataInsightId(String exadataInsightId) {
            this.exadataInsightId = exadataInsightId;
            this.__explicitlySet__.add("exadataInsightId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EmManagedExternalHostInsightSummary build() {
            EmManagedExternalHostInsightSummary __instance__ =
                    new EmManagedExternalHostInsightSummary(
                            id,
                            compartmentId,
                            hostName,
                            hostDisplayName,
                            hostType,
                            processorCount,
                            freeformTags,
                            definedTags,
                            systemTags,
                            status,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            lifecycleDetails,
                            enterpriseManagerIdentifier,
                            enterpriseManagerEntityName,
                            enterpriseManagerEntityType,
                            enterpriseManagerEntityIdentifier,
                            enterpriseManagerEntityDisplayName,
                            enterpriseManagerBridgeId,
                            platformType,
                            exadataInsightId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EmManagedExternalHostInsightSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .hostName(o.getHostName())
                            .hostDisplayName(o.getHostDisplayName())
                            .hostType(o.getHostType())
                            .processorCount(o.getProcessorCount())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags())
                            .status(o.getStatus())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .enterpriseManagerIdentifier(o.getEnterpriseManagerIdentifier())
                            .enterpriseManagerEntityName(o.getEnterpriseManagerEntityName())
                            .enterpriseManagerEntityType(o.getEnterpriseManagerEntityType())
                            .enterpriseManagerEntityIdentifier(
                                    o.getEnterpriseManagerEntityIdentifier())
                            .enterpriseManagerEntityDisplayName(
                                    o.getEnterpriseManagerEntityDisplayName())
                            .enterpriseManagerBridgeId(o.getEnterpriseManagerBridgeId())
                            .platformType(o.getPlatformType())
                            .exadataInsightId(o.getExadataInsightId());

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

    @Deprecated
    public EmManagedExternalHostInsightSummary(
            String id,
            String compartmentId,
            String hostName,
            String hostDisplayName,
            String hostType,
            Integer processorCount,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags,
            ResourceStatus status,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            LifecycleState lifecycleState,
            String lifecycleDetails,
            String enterpriseManagerIdentifier,
            String enterpriseManagerEntityName,
            String enterpriseManagerEntityType,
            String enterpriseManagerEntityIdentifier,
            String enterpriseManagerEntityDisplayName,
            String enterpriseManagerBridgeId,
            PlatformType platformType,
            String exadataInsightId) {
        super(
                id,
                compartmentId,
                hostName,
                hostDisplayName,
                hostType,
                processorCount,
                freeformTags,
                definedTags,
                systemTags,
                status,
                timeCreated,
                timeUpdated,
                lifecycleState,
                lifecycleDetails);
        this.enterpriseManagerIdentifier = enterpriseManagerIdentifier;
        this.enterpriseManagerEntityName = enterpriseManagerEntityName;
        this.enterpriseManagerEntityType = enterpriseManagerEntityType;
        this.enterpriseManagerEntityIdentifier = enterpriseManagerEntityIdentifier;
        this.enterpriseManagerEntityDisplayName = enterpriseManagerEntityDisplayName;
        this.enterpriseManagerBridgeId = enterpriseManagerBridgeId;
        this.platformType = platformType;
        this.exadataInsightId = exadataInsightId;
    }

    /**
     * Enterprise Manager Unique Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerIdentifier")
    String enterpriseManagerIdentifier;

    /**
     * Enterprise Manager Entity Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityName")
    String enterpriseManagerEntityName;

    /**
     * Enterprise Manager Entity Type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityType")
    String enterpriseManagerEntityType;

    /**
     * Enterprise Manager Entity Unique Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityIdentifier")
    String enterpriseManagerEntityIdentifier;

    /**
     * Enterprise Manager Entity Display Name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerEntityDisplayName")
    String enterpriseManagerEntityDisplayName;

    /**
     * OPSI Enterprise Manager Bridge OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enterpriseManagerBridgeId")
    String enterpriseManagerBridgeId;
    /**
     * Platform type.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PlatformType {
        Linux("LINUX"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, PlatformType> map;

        static {
            map = new java.util.HashMap<>();
            for (PlatformType v : PlatformType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PlatformType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PlatformType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PlatformType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Platform type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformType")
    PlatformType platformType;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exadataInsightId")
    String exadataInsightId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
