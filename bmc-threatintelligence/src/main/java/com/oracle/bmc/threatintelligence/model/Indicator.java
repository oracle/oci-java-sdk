/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.threatintelligence.model;

/**
 * A data signature observed on a network or host that indicates a potential security threat. Indicators can be plain text or computed (hashed) values.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210831")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Indicator.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Indicator {
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

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private IndicatorType type;

        public Builder type(IndicatorType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("confidence")
        private Integer confidence;

        public Builder confidence(Integer confidence) {
            this.confidence = confidence;
            this.__explicitlySet__.add("confidence");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("threatTypes")
        private java.util.List<ThreatType> threatTypes;

        public Builder threatTypes(java.util.List<ThreatType> threatTypes) {
            this.threatTypes = threatTypes;
            this.__explicitlySet__.add("threatTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("attributes")
        private java.util.List<IndicatorAttribute> attributes;

        public Builder attributes(java.util.List<IndicatorAttribute> attributes) {
            this.attributes = attributes;
            this.__explicitlySet__.add("attributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("relationships")
        private java.util.List<IndicatorRelationship> relationships;

        public Builder relationships(java.util.List<IndicatorRelationship> relationships) {
            this.relationships = relationships;
            this.__explicitlySet__.add("relationships");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Indicator build() {
            Indicator __instance__ =
                    new Indicator(
                            id,
                            type,
                            value,
                            confidence,
                            compartmentId,
                            threatTypes,
                            attributes,
                            relationships,
                            lifecycleState,
                            timeCreated,
                            timeUpdated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Indicator o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .type(o.getType())
                            .value(o.getValue())
                            .confidence(o.getConfidence())
                            .compartmentId(o.getCompartmentId())
                            .threatTypes(o.getThreatTypes())
                            .attributes(o.getAttributes())
                            .relationships(o.getRelationships())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated());

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
     * The OCID of the indicator.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * Type of indicator
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    IndicatorType type;

    /**
     * The value for this indicator.
     * Format is dependent upon {@code type}, e.g. DOMAIN_NAME "evil.example.com", MD5_HASH "44d88612fea8a8f36de82e1278abb02f", IP_ADDRESS "2001:db8::1".
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    String value;

    /**
     * Confidence is an integer from 0 to 100 that provides a measure of our certainty in the maliciousness of the indicator.  This confidence value is aggregated from the confidence in the threat types, attributes, and relationships to create an overall value for the indicator.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("confidence")
    Integer confidence;

    /**
     * Compartment Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Characteristics of the threat indicator based on previous observations or behavior. May include related tactics, techniques, and procedures.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("threatTypes")
    java.util.List<ThreatType> threatTypes;

    /**
     * A map of attribute name (string) to IndicatorAttribute (values and supporting data).
     * This provides generic storage for additional data about an indicator.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributes")
    java.util.List<IndicatorAttribute> attributes;

    /**
     * A map of relationship name (string) to IndicatorRelationship (related entities and supporting data).
     * This provides generic storage for relationships between indicators or other entities.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relationships")
    java.util.List<IndicatorRelationship> relationships;

    /**
     * The state of the indicator.  It will always be ACTIVE.  This field is added for consistency.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The time the data was first seen for this indicator. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The last time this indicator was updated. It starts with the same value as timeCreated and is never empty. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
