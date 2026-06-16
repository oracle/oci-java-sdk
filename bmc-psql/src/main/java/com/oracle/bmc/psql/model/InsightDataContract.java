/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Describes the response data format returned for an insight type. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InsightDataContract.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InsightDataContract
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"kind", "unit"})
    public InsightDataContract(Kind kind, String unit) {
        super();
        this.kind = kind;
        this.unit = unit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Indicates the structure of the insight data payload. */
        @com.fasterxml.jackson.annotation.JsonProperty("kind")
        private Kind kind;

        /**
         * Indicates the structure of the insight data payload.
         *
         * @param kind the value to set
         * @return this builder
         */
        public Builder kind(Kind kind) {
            this.kind = kind;
            this.__explicitlySet__.add("kind");
            return this;
        }
        /** Optional unit associated with numeric values. */
        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private String unit;

        /**
         * Optional unit associated with numeric values.
         *
         * @param unit the value to set
         * @return this builder
         */
        public Builder unit(String unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InsightDataContract build() {
            InsightDataContract model = new InsightDataContract(this.kind, this.unit);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InsightDataContract model) {
            if (model.wasPropertyExplicitlySet("kind")) {
                this.kind(model.getKind());
            }
            if (model.wasPropertyExplicitlySet("unit")) {
                this.unit(model.getUnit());
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

    /** Indicates the structure of the insight data payload. */
    public enum Kind implements com.oracle.bmc.http.internal.BmcEnum {
        TimeSeries("TIME_SERIES"),
        Table("TABLE"),
        Summary("SUMMARY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Kind.class);

        private final String value;
        private static java.util.Map<String, Kind> map;

        static {
            map = new java.util.HashMap<>();
            for (Kind v : Kind.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Kind(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Kind create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Kind', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** Indicates the structure of the insight data payload. */
    @com.fasterxml.jackson.annotation.JsonProperty("kind")
    private final Kind kind;

    /**
     * Indicates the structure of the insight data payload.
     *
     * @return the value
     */
    public Kind getKind() {
        return kind;
    }

    /** Optional unit associated with numeric values. */
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    private final String unit;

    /**
     * Optional unit associated with numeric values.
     *
     * @return the value
     */
    public String getUnit() {
        return unit;
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
        sb.append("InsightDataContract(");
        sb.append("super=").append(super.toString());
        sb.append("kind=").append(String.valueOf(this.kind));
        sb.append(", unit=").append(String.valueOf(this.unit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InsightDataContract)) {
            return false;
        }

        InsightDataContract other = (InsightDataContract) o;
        return java.util.Objects.equals(this.kind, other.kind)
                && java.util.Objects.equals(this.unit, other.unit)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.kind == null ? 43 : this.kind.hashCode());
        result = (result * PRIME) + (this.unit == null ? 43 : this.unit.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
