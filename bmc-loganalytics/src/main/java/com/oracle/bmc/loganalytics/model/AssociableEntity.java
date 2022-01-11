/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Entity details including whether or not it is eligible for association with the source.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AssociableEntity.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AssociableEntity {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("entityId")
        private String entityId;

        public Builder entityId(String entityId) {
            this.entityId = entityId;
            this.__explicitlySet__.add("entityId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityName")
        private String entityName;

        public Builder entityName(String entityName) {
            this.entityName = entityName;
            this.__explicitlySet__.add("entityName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityTypeName")
        private String entityTypeName;

        public Builder entityTypeName(String entityTypeName) {
            this.entityTypeName = entityTypeName;
            this.__explicitlySet__.add("entityTypeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("entityTypeDisplayName")
        private String entityTypeDisplayName;

        public Builder entityTypeDisplayName(String entityTypeDisplayName) {
            this.entityTypeDisplayName = entityTypeDisplayName;
            this.__explicitlySet__.add("entityTypeDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("agentId")
        private String agentId;

        public Builder agentId(String agentId) {
            this.agentId = agentId;
            this.__explicitlySet__.add("agentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("eligibilityStatus")
        private EligibilityStatus eligibilityStatus;

        public Builder eligibilityStatus(EligibilityStatus eligibilityStatus) {
            this.eligibilityStatus = eligibilityStatus;
            this.__explicitlySet__.add("eligibilityStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ineligibilityDetails")
        private String ineligibilityDetails;

        public Builder ineligibilityDetails(String ineligibilityDetails) {
            this.ineligibilityDetails = ineligibilityDetails;
            this.__explicitlySet__.add("ineligibilityDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssociableEntity build() {
            AssociableEntity __instance__ =
                    new AssociableEntity(
                            entityId,
                            entityName,
                            entityTypeName,
                            entityTypeDisplayName,
                            host,
                            agentId,
                            eligibilityStatus,
                            ineligibilityDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssociableEntity o) {
            Builder copiedBuilder =
                    entityId(o.getEntityId())
                            .entityName(o.getEntityName())
                            .entityTypeName(o.getEntityTypeName())
                            .entityTypeDisplayName(o.getEntityTypeDisplayName())
                            .host(o.getHost())
                            .agentId(o.getAgentId())
                            .eligibilityStatus(o.getEligibilityStatus())
                            .ineligibilityDetails(o.getIneligibilityDetails());

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
     * The entity OCID.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityId")
    String entityId;

    /**
     * The name of the entity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityName")
    String entityName;

    /**
     * The type name of the entity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityTypeName")
    String entityTypeName;

    /**
     * The display name of the entity type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityTypeDisplayName")
    String entityTypeDisplayName;

    /**
     * The entity host.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    String host;

    /**
     * The OCID of the Management Agent.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("agentId")
    String agentId;
    /**
     * This field indicates whether the entity is (in)eligible to be associated with this source.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum EligibilityStatus {
        Eligible("ELIGIBLE"),
        Ineligible("INELIGIBLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, EligibilityStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (EligibilityStatus v : EligibilityStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EligibilityStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EligibilityStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EligibilityStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * This field indicates whether the entity is (in)eligible to be associated with this source.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("eligibilityStatus")
    EligibilityStatus eligibilityStatus;

    /**
     * The reason the entity is not eligible for association.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ineligibilityDetails")
    String ineligibilityDetails;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
