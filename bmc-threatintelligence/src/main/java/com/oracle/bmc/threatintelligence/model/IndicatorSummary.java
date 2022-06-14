/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.threatintelligence.model;

/**
 * Summary of a data signature observed on a network or host that indicates a potential security threat.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IndicatorSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IndicatorSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "type",
        "value",
        "confidence",
        "compartmentId",
        "threatTypes",
        "lifecycleState",
        "timeCreated",
        "timeUpdated"
    })
    public IndicatorSummary(
            String id,
            IndicatorType type,
            String value,
            Integer confidence,
            String compartmentId,
            java.util.List<ThreatType> threatTypes,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.id = id;
        this.type = type;
        this.value = value;
        this.confidence = confidence;
        this.compartmentId = compartmentId;
        this.threatTypes = threatTypes;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the indicator.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the indicator.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Type of indicator
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private IndicatorType type;

        /**
         * Type of indicator
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(IndicatorType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The value of indicator.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The value of indicator.
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * Confidence is an integer from 0 to 100 that provides a measure of our certainty in the maliciousness of the indicator.  This confidence value is aggregated from the confidence in the threat types, attributes, and relationships to create an overall value for the indicator.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("confidence")
        private Integer confidence;

        /**
         * Confidence is an integer from 0 to 100 that provides a measure of our certainty in the maliciousness of the indicator.  This confidence value is aggregated from the confidence in the threat types, attributes, and relationships to create an overall value for the indicator.
         * @param confidence the value to set
         * @return this builder
         **/
        public Builder confidence(Integer confidence) {
            this.confidence = confidence;
            this.__explicitlySet__.add("confidence");
            return this;
        }
        /**
         * Compartment Identifier
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Compartment Identifier
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Characteristics of the threat indicator based on previous observations or behavior. May include related tactics, techniques, and procedures.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("threatTypes")
        private java.util.List<ThreatType> threatTypes;

        /**
         * Characteristics of the threat indicator based on previous observations or behavior. May include related tactics, techniques, and procedures.
         * @param threatTypes the value to set
         * @return this builder
         **/
        public Builder threatTypes(java.util.List<ThreatType> threatTypes) {
            this.threatTypes = threatTypes;
            this.__explicitlySet__.add("threatTypes");
            return this;
        }
        /**
         * The state of the indicator.  It will always be ACTIVE.  This field is added for consistency.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The state of the indicator.  It will always be ACTIVE.  This field is added for consistency.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The time the data was first seen for this indicator. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time the data was first seen for this indicator. An RFC3339 formatted datetime string
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The last time this indicator was updated. It starts with the same value as timeCreated and is never empty. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The last time this indicator was updated. It starts with the same value as timeCreated and is never empty. An RFC3339 formatted datetime string
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IndicatorSummary build() {
            IndicatorSummary __instance__ =
                    new IndicatorSummary(
                            id,
                            type,
                            value,
                            confidence,
                            compartmentId,
                            threatTypes,
                            lifecycleState,
                            timeCreated,
                            timeUpdated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IndicatorSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .type(o.getType())
                            .value(o.getValue())
                            .confidence(o.getConfidence())
                            .compartmentId(o.getCompartmentId())
                            .threatTypes(o.getThreatTypes())
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The OCID of the indicator.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the indicator.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Type of indicator
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final IndicatorType type;

    /**
     * Type of indicator
     * @return the value
     **/
    public IndicatorType getType() {
        return type;
    }

    /**
     * The value of indicator.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The value of indicator.
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * Confidence is an integer from 0 to 100 that provides a measure of our certainty in the maliciousness of the indicator.  This confidence value is aggregated from the confidence in the threat types, attributes, and relationships to create an overall value for the indicator.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("confidence")
    private final Integer confidence;

    /**
     * Confidence is an integer from 0 to 100 that provides a measure of our certainty in the maliciousness of the indicator.  This confidence value is aggregated from the confidence in the threat types, attributes, and relationships to create an overall value for the indicator.
     * @return the value
     **/
    public Integer getConfidence() {
        return confidence;
    }

    /**
     * Compartment Identifier
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Compartment Identifier
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Characteristics of the threat indicator based on previous observations or behavior. May include related tactics, techniques, and procedures.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("threatTypes")
    private final java.util.List<ThreatType> threatTypes;

    /**
     * Characteristics of the threat indicator based on previous observations or behavior. May include related tactics, techniques, and procedures.
     * @return the value
     **/
    public java.util.List<ThreatType> getThreatTypes() {
        return threatTypes;
    }

    /**
     * The state of the indicator.  It will always be ACTIVE.  This field is added for consistency.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The state of the indicator.  It will always be ACTIVE.  This field is added for consistency.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The time the data was first seen for this indicator. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time the data was first seen for this indicator. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The last time this indicator was updated. It starts with the same value as timeCreated and is never empty. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The last time this indicator was updated. It starts with the same value as timeCreated and is never empty. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("IndicatorSummary(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", confidence=").append(String.valueOf(this.confidence));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", threatTypes=").append(String.valueOf(this.threatTypes));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IndicatorSummary)) {
            return false;
        }

        IndicatorSummary other = (IndicatorSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.confidence, other.confidence)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.threatTypes, other.threatTypes)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.confidence == null ? 43 : this.confidence.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.threatTypes == null ? 43 : this.threatTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
