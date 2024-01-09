/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Unified monitoring agent operational metrics source object. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OperationalMetricsSource.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OperationalMetricsSource
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "metrics", "recordInput"})
    public OperationalMetricsSource(
            Type type, java.util.List<String> metrics, OperationalMetricsRecordInput recordInput) {
        super();
        this.type = type;
        this.metrics = metrics;
        this.recordInput = recordInput;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Type of the unified monitoring agent operational metrics source object. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Type of the unified monitoring agent operational metrics source object.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** List of unified monitoring agent operational metrics. */
        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private java.util.List<String> metrics;

        /**
         * List of unified monitoring agent operational metrics.
         *
         * @param metrics the value to set
         * @return this builder
         */
        public Builder metrics(java.util.List<String> metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recordInput")
        private OperationalMetricsRecordInput recordInput;

        public Builder recordInput(OperationalMetricsRecordInput recordInput) {
            this.recordInput = recordInput;
            this.__explicitlySet__.add("recordInput");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OperationalMetricsSource build() {
            OperationalMetricsSource model =
                    new OperationalMetricsSource(this.type, this.metrics, this.recordInput);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OperationalMetricsSource model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("metrics")) {
                this.metrics(model.getMetrics());
            }
            if (model.wasPropertyExplicitlySet("recordInput")) {
                this.recordInput(model.getRecordInput());
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

    /** Type of the unified monitoring agent operational metrics source object. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        UmaMetrics("UMA_METRICS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** Type of the unified monitoring agent operational metrics source object. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Type of the unified monitoring agent operational metrics source object.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /** List of unified monitoring agent operational metrics. */
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.List<String> metrics;

    /**
     * List of unified monitoring agent operational metrics.
     *
     * @return the value
     */
    public java.util.List<String> getMetrics() {
        return metrics;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("recordInput")
    private final OperationalMetricsRecordInput recordInput;

    public OperationalMetricsRecordInput getRecordInput() {
        return recordInput;
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
        sb.append("OperationalMetricsSource(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", metrics=").append(String.valueOf(this.metrics));
        sb.append(", recordInput=").append(String.valueOf(this.recordInput));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OperationalMetricsSource)) {
            return false;
        }

        OperationalMetricsSource other = (OperationalMetricsSource) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.metrics, other.metrics)
                && java.util.Objects.equals(this.recordInput, other.recordInput)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result = (result * PRIME) + (this.recordInput == null ? 43 : this.recordInput.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
