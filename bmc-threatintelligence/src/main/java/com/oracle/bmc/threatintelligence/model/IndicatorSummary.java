/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.threatintelligence.model;

/**
 * Summary of a data signature observed on a network or host that indicates a potential security
 * threat. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IndicatorSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class IndicatorSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "type",
        "value",
        "confidence",
        "compartmentId",
        "threatTypes",
        "attributes",
        "lifecycleState",
        "timeCreated",
        "timeUpdated",
        "timeLastSeen",
        "geodata"
    })
    public IndicatorSummary(
            String id,
            IndicatorType type,
            String value,
            Integer confidence,
            String compartmentId,
            java.util.List<String> threatTypes,
            java.util.List<IndicatorAttributeSummary> attributes,
            LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            java.util.Date timeLastSeen,
            GeodataDetails geodata) {
        super();
        this.id = id;
        this.type = type;
        this.value = value;
        this.confidence = confidence;
        this.compartmentId = compartmentId;
        this.threatTypes = threatTypes;
        this.attributes = attributes;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.timeLastSeen = timeLastSeen;
        this.geodata = geodata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the indicator. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the indicator.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The type of indicator. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private IndicatorType type;

        /**
         * The type of indicator.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(IndicatorType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The indicator data value. */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The indicator data value.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * An integer from 0 to 100 that represents how certain we are that the indicator is
         * malicious and a potential threat if it is detected communicating with your cloud
         * resources. This confidence value is aggregated from the confidence in the threat types,
         * attributes, and relationships to create an overall value for the indicator.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("confidence")
        private Integer confidence;

        /**
         * An integer from 0 to 100 that represents how certain we are that the indicator is
         * malicious and a potential threat if it is detected communicating with your cloud
         * resources. This confidence value is aggregated from the confidence in the threat types,
         * attributes, and relationships to create an overall value for the indicator.
         *
         * @param confidence the value to set
         * @return this builder
         */
        public Builder confidence(Integer confidence) {
            this.confidence = confidence;
            this.__explicitlySet__.add("confidence");
            return this;
        }
        /** The OCID of the compartment that contains this indicator. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment that contains this indicator.
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
         * Characteristics of the threat indicator based on previous observations or behavior. May
         * include related tactics, techniques, and procedures.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("threatTypes")
        private java.util.List<String> threatTypes;

        /**
         * Characteristics of the threat indicator based on previous observations or behavior. May
         * include related tactics, techniques, and procedures.
         *
         * @param threatTypes the value to set
         * @return this builder
         */
        public Builder threatTypes(java.util.List<String> threatTypes) {
            this.threatTypes = threatTypes;
            this.__explicitlySet__.add("threatTypes");
            return this;
        }
        /**
         * A map of attributes with additional information about the indicator. Each attribute has a
         * name (string), value (string), and attribution (supporting data).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attributes")
        private java.util.List<IndicatorAttributeSummary> attributes;

        /**
         * A map of attributes with additional information about the indicator. Each attribute has a
         * name (string), value (string), and attribution (supporting data).
         *
         * @param attributes the value to set
         * @return this builder
         */
        public Builder attributes(java.util.List<IndicatorAttributeSummary> attributes) {
            this.attributes = attributes;
            this.__explicitlySet__.add("attributes");
            return this;
        }
        /** The state of the indicator. It will always be {@code ACTIVE}. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The state of the indicator. It will always be {@code ACTIVE}.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The date and time that the indicator was first detected. An RFC3339 formatted string. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time that the indicator was first detected. An RFC3339 formatted string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time that this indicator was last updated by the system. Updates can include
         * new reports or regular updates in confidence. The value is the same as {@code
         * timeCreated} for a new indicator. An RFC3339 formatted string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time that this indicator was last updated by the system. Updates can include
         * new reports or regular updates in confidence. The value is the same as {@code
         * timeCreated} for a new indicator. An RFC3339 formatted string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The date and time that this indicator was last seen. The value is the same as {@code
         * timeCreated} for a new indicator. An RFC3339 formatted string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSeen")
        private java.util.Date timeLastSeen;

        /**
         * The date and time that this indicator was last seen. The value is the same as {@code
         * timeCreated} for a new indicator. An RFC3339 formatted string.
         *
         * @param timeLastSeen the value to set
         * @return this builder
         */
        public Builder timeLastSeen(java.util.Date timeLastSeen) {
            this.timeLastSeen = timeLastSeen;
            this.__explicitlySet__.add("timeLastSeen");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("geodata")
        private GeodataDetails geodata;

        public Builder geodata(GeodataDetails geodata) {
            this.geodata = geodata;
            this.__explicitlySet__.add("geodata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IndicatorSummary build() {
            IndicatorSummary model =
                    new IndicatorSummary(
                            this.id,
                            this.type,
                            this.value,
                            this.confidence,
                            this.compartmentId,
                            this.threatTypes,
                            this.attributes,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated,
                            this.timeLastSeen,
                            this.geodata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IndicatorSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("confidence")) {
                this.confidence(model.getConfidence());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("threatTypes")) {
                this.threatTypes(model.getThreatTypes());
            }
            if (model.wasPropertyExplicitlySet("attributes")) {
                this.attributes(model.getAttributes());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("timeLastSeen")) {
                this.timeLastSeen(model.getTimeLastSeen());
            }
            if (model.wasPropertyExplicitlySet("geodata")) {
                this.geodata(model.getGeodata());
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

    /** The OCID of the indicator. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the indicator.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The type of indicator. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final IndicatorType type;

    /**
     * The type of indicator.
     *
     * @return the value
     */
    public IndicatorType getType() {
        return type;
    }

    /** The indicator data value. */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The indicator data value.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * An integer from 0 to 100 that represents how certain we are that the indicator is malicious
     * and a potential threat if it is detected communicating with your cloud resources. This
     * confidence value is aggregated from the confidence in the threat types, attributes, and
     * relationships to create an overall value for the indicator.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("confidence")
    private final Integer confidence;

    /**
     * An integer from 0 to 100 that represents how certain we are that the indicator is malicious
     * and a potential threat if it is detected communicating with your cloud resources. This
     * confidence value is aggregated from the confidence in the threat types, attributes, and
     * relationships to create an overall value for the indicator.
     *
     * @return the value
     */
    public Integer getConfidence() {
        return confidence;
    }

    /** The OCID of the compartment that contains this indicator. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment that contains this indicator.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Characteristics of the threat indicator based on previous observations or behavior. May
     * include related tactics, techniques, and procedures.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("threatTypes")
    private final java.util.List<String> threatTypes;

    /**
     * Characteristics of the threat indicator based on previous observations or behavior. May
     * include related tactics, techniques, and procedures.
     *
     * @return the value
     */
    public java.util.List<String> getThreatTypes() {
        return threatTypes;
    }

    /**
     * A map of attributes with additional information about the indicator. Each attribute has a
     * name (string), value (string), and attribution (supporting data).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attributes")
    private final java.util.List<IndicatorAttributeSummary> attributes;

    /**
     * A map of attributes with additional information about the indicator. Each attribute has a
     * name (string), value (string), and attribution (supporting data).
     *
     * @return the value
     */
    public java.util.List<IndicatorAttributeSummary> getAttributes() {
        return attributes;
    }

    /** The state of the indicator. It will always be {@code ACTIVE}. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The state of the indicator. It will always be {@code ACTIVE}.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The date and time that the indicator was first detected. An RFC3339 formatted string. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time that the indicator was first detected. An RFC3339 formatted string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time that this indicator was last updated by the system. Updates can include new
     * reports or regular updates in confidence. The value is the same as {@code timeCreated} for a
     * new indicator. An RFC3339 formatted string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time that this indicator was last updated by the system. Updates can include new
     * reports or regular updates in confidence. The value is the same as {@code timeCreated} for a
     * new indicator. An RFC3339 formatted string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The date and time that this indicator was last seen. The value is the same as {@code
     * timeCreated} for a new indicator. An RFC3339 formatted string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSeen")
    private final java.util.Date timeLastSeen;

    /**
     * The date and time that this indicator was last seen. The value is the same as {@code
     * timeCreated} for a new indicator. An RFC3339 formatted string.
     *
     * @return the value
     */
    public java.util.Date getTimeLastSeen() {
        return timeLastSeen;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("geodata")
    private final GeodataDetails geodata;

    public GeodataDetails getGeodata() {
        return geodata;
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
        sb.append("IndicatorSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", confidence=").append(String.valueOf(this.confidence));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", threatTypes=").append(String.valueOf(this.threatTypes));
        sb.append(", attributes=").append(String.valueOf(this.attributes));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", timeLastSeen=").append(String.valueOf(this.timeLastSeen));
        sb.append(", geodata=").append(String.valueOf(this.geodata));
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
                && java.util.Objects.equals(this.attributes, other.attributes)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.timeLastSeen, other.timeLastSeen)
                && java.util.Objects.equals(this.geodata, other.geodata)
                && super.equals(other);
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
        result = (result * PRIME) + (this.attributes == null ? 43 : this.attributes.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.timeLastSeen == null ? 43 : this.timeLastSeen.hashCode());
        result = (result * PRIME) + (this.geodata == null ? 43 : this.geodata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
