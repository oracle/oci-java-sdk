/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * LogAnalyticsAssociationParameter
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LogAnalyticsAssociationParameter.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LogAnalyticsAssociationParameter {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("agentId")
        private String agentId;

        public Builder agentId(String agentId) {
            this.agentId = agentId;
            this.__explicitlySet__.add("agentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityId")
        private String entityId;

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            this.__explicitlySet__.add("entityId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
        private String sourceId;

        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            this.__explicitlySet__.add("sourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceDisplayName")
        private String sourceDisplayName;

        public Builder sourceDisplayName(String sourceDisplayName) {
            this.sourceDisplayName = sourceDisplayName;
            this.__explicitlySet__.add("sourceDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
        private String sourceType;

        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            this.__explicitlySet__.add("sourceType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("missingProperties")
        private java.util.List<String> missingProperties;

        public Builder missingProperties(java.util.List<String> missingProperties) {
            this.missingProperties = missingProperties;
            this.__explicitlySet__.add("missingProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requiredProperties")
        private java.util.List<String> requiredProperties;

        public Builder requiredProperties(java.util.List<String> requiredProperties) {
            this.requiredProperties = requiredProperties;
            this.__explicitlySet__.add("requiredProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LogAnalyticsAssociationParameter build() {
            LogAnalyticsAssociationParameter __instance__ =
                    new LogAnalyticsAssociationParameter(
                            agentId,
                            entityType,
                            entityId,
                            sourceId,
                            sourceDisplayName,
                            sourceType,
                            status,
                            missingProperties,
                            requiredProperties);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LogAnalyticsAssociationParameter o) {
            Builder copiedBuilder =
                    agentId(o.getAgentId())
                            .entityType(o.getEntityType())
                            .entityId(o.getEntityId())
                            .sourceId(o.getSourceId())
                            .sourceDisplayName(o.getSourceDisplayName())
                            .sourceType(o.getSourceType())
                            .status(o.getStatus())
                            .missingProperties(o.getMissingProperties())
                            .requiredProperties(o.getRequiredProperties());

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
     * agent guid
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agentId")
    String agentId;

    /**
     * entity type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    String entityType;

    /**
     * entity guid
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityId")
    String entityId;

    /**
     * source name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    String sourceId;

    /**
     * source display name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceDisplayName")
    String sourceDisplayName;

    /**
     * source type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceType")
    String sourceType;
    /**
     * status
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Status {
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * status
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;

    /**
     * missingProperties
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("missingProperties")
    java.util.List<String> missingProperties;

    /**
     * requiredProperties
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requiredProperties")
    java.util.List<String> requiredProperties;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
