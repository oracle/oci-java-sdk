/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot.model;

/**
 * Defines how inbound device payloads should be routed and mapped within a digital twin context.
 * Routes are evaluated in the order they are defined, and only the first matching condition is
 * processed. A final default route (with a condition that always evaluates to true) is recommended
 * for fallback handling. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DigitalTwinAdapterInboundRoute.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DigitalTwinAdapterInboundRoute
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "condition",
        "referencePayload",
        "payloadMapping",
        "description"
    })
    public DigitalTwinAdapterInboundRoute(
            String condition,
            DigitalTwinAdapterPayload referencePayload,
            java.util.Map<String, String> payloadMapping,
            String description) {
        super();
        this.condition = condition;
        this.referencePayload = referencePayload;
        this.payloadMapping = payloadMapping;
        this.description = description;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A boolean expression used to determine whether the following transformation should be
         * processed for the incoming payload. This expression is typically based on fields defined
         * at the inbound Envelope and is evaluated before applying the {@code payloadMapping}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("condition")
        private String condition;

        /**
         * A boolean expression used to determine whether the following transformation should be
         * processed for the incoming payload. This expression is typically based on fields defined
         * at the inbound Envelope and is evaluated before applying the {@code payloadMapping}.
         *
         * @param condition the value to set
         * @return this builder
         */
        public Builder condition(String condition) {
            this.condition = condition;
            this.__explicitlySet__.add("condition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referencePayload")
        private DigitalTwinAdapterPayload referencePayload;

        public Builder referencePayload(DigitalTwinAdapterPayload referencePayload) {
            this.referencePayload = referencePayload;
            this.__explicitlySet__.add("referencePayload");
            return this;
        }
        /**
         * A set of key-value JQ expressions used to transform the incoming payload into a shape
         * compatible with the digital twin model's context or schema.
         *
         * <p>The keys are target fields (in the digital twin model), and values are JQ expressions
         * pointing to data in the reference payload.
         *
         * <p>Example: Given payload: { "time": "<timestamp>", "temp": 65, "hum": 55 } And mapping:
         * { "temperature": "$.temp", "humidity": "$.hum", "timeObserved": "$.time" } The output
         * will be: { "temperature": 65, "humidity": 55, "timeObserved": "<timestamp>" }
         */
        @com.fasterxml.jackson.annotation.JsonProperty("payloadMapping")
        private java.util.Map<String, String> payloadMapping;

        /**
         * A set of key-value JQ expressions used to transform the incoming payload into a shape
         * compatible with the digital twin model's context or schema.
         *
         * <p>The keys are target fields (in the digital twin model), and values are JQ expressions
         * pointing to data in the reference payload.
         *
         * <p>Example: Given payload: { "time": "<timestamp>", "temp": 65, "hum": 55 } And mapping:
         * { "temperature": "$.temp", "humidity": "$.hum", "timeObserved": "$.time" } The output
         * will be: { "temperature": 65, "humidity": 55, "timeObserved": "<timestamp>" }
         *
         * @param payloadMapping the value to set
         * @return this builder
         */
        public Builder payloadMapping(java.util.Map<String, String> payloadMapping) {
            this.payloadMapping = payloadMapping;
            this.__explicitlySet__.add("payloadMapping");
            return this;
        }
        /** Meaningful write up about the inbound route. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Meaningful write up about the inbound route.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DigitalTwinAdapterInboundRoute build() {
            DigitalTwinAdapterInboundRoute model =
                    new DigitalTwinAdapterInboundRoute(
                            this.condition,
                            this.referencePayload,
                            this.payloadMapping,
                            this.description);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DigitalTwinAdapterInboundRoute model) {
            if (model.wasPropertyExplicitlySet("condition")) {
                this.condition(model.getCondition());
            }
            if (model.wasPropertyExplicitlySet("referencePayload")) {
                this.referencePayload(model.getReferencePayload());
            }
            if (model.wasPropertyExplicitlySet("payloadMapping")) {
                this.payloadMapping(model.getPayloadMapping());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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
     * A boolean expression used to determine whether the following transformation should be
     * processed for the incoming payload. This expression is typically based on fields defined at
     * the inbound Envelope and is evaluated before applying the {@code payloadMapping}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    private final String condition;

    /**
     * A boolean expression used to determine whether the following transformation should be
     * processed for the incoming payload. This expression is typically based on fields defined at
     * the inbound Envelope and is evaluated before applying the {@code payloadMapping}.
     *
     * @return the value
     */
    public String getCondition() {
        return condition;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("referencePayload")
    private final DigitalTwinAdapterPayload referencePayload;

    public DigitalTwinAdapterPayload getReferencePayload() {
        return referencePayload;
    }

    /**
     * A set of key-value JQ expressions used to transform the incoming payload into a shape
     * compatible with the digital twin model's context or schema.
     *
     * <p>The keys are target fields (in the digital twin model), and values are JQ expressions
     * pointing to data in the reference payload.
     *
     * <p>Example: Given payload: { "time": "<timestamp>", "temp": 65, "hum": 55 } And mapping: {
     * "temperature": "$.temp", "humidity": "$.hum", "timeObserved": "$.time" } The output will be:
     * { "temperature": 65, "humidity": 55, "timeObserved": "<timestamp>" }
     */
    @com.fasterxml.jackson.annotation.JsonProperty("payloadMapping")
    private final java.util.Map<String, String> payloadMapping;

    /**
     * A set of key-value JQ expressions used to transform the incoming payload into a shape
     * compatible with the digital twin model's context or schema.
     *
     * <p>The keys are target fields (in the digital twin model), and values are JQ expressions
     * pointing to data in the reference payload.
     *
     * <p>Example: Given payload: { "time": "<timestamp>", "temp": 65, "hum": 55 } And mapping: {
     * "temperature": "$.temp", "humidity": "$.hum", "timeObserved": "$.time" } The output will be:
     * { "temperature": 65, "humidity": 55, "timeObserved": "<timestamp>" }
     *
     * @return the value
     */
    public java.util.Map<String, String> getPayloadMapping() {
        return payloadMapping;
    }

    /** Meaningful write up about the inbound route. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Meaningful write up about the inbound route.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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
        sb.append("DigitalTwinAdapterInboundRoute(");
        sb.append("super=").append(super.toString());
        sb.append("condition=").append(String.valueOf(this.condition));
        sb.append(", referencePayload=").append(String.valueOf(this.referencePayload));
        sb.append(", payloadMapping=").append(String.valueOf(this.payloadMapping));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DigitalTwinAdapterInboundRoute)) {
            return false;
        }

        DigitalTwinAdapterInboundRoute other = (DigitalTwinAdapterInboundRoute) o;
        return java.util.Objects.equals(this.condition, other.condition)
                && java.util.Objects.equals(this.referencePayload, other.referencePayload)
                && java.util.Objects.equals(this.payloadMapping, other.payloadMapping)
                && java.util.Objects.equals(this.description, other.description)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.condition == null ? 43 : this.condition.hashCode());
        result =
                (result * PRIME)
                        + (this.referencePayload == null ? 43 : this.referencePayload.hashCode());
        result =
                (result * PRIME)
                        + (this.payloadMapping == null ? 43 : this.payloadMapping.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
