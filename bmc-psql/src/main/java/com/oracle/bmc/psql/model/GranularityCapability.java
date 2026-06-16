/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.model;

/**
 * Describes time granularity behavior for time-series Insight. <br>
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
        builder = GranularityCapability.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GranularityCapability
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "minSeconds", "maxSeconds"})
    public GranularityCapability(Type type, Integer minSeconds, Integer maxSeconds) {
        super();
        this.type = type;
        this.minSeconds = minSeconds;
        this.maxSeconds = maxSeconds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Granularity selection strategy. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Granularity selection strategy.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** Minimum supported granularity in seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("minSeconds")
        private Integer minSeconds;

        /**
         * Minimum supported granularity in seconds.
         *
         * @param minSeconds the value to set
         * @return this builder
         */
        public Builder minSeconds(Integer minSeconds) {
            this.minSeconds = minSeconds;
            this.__explicitlySet__.add("minSeconds");
            return this;
        }
        /** Maximum supported granularity in seconds. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxSeconds")
        private Integer maxSeconds;

        /**
         * Maximum supported granularity in seconds.
         *
         * @param maxSeconds the value to set
         * @return this builder
         */
        public Builder maxSeconds(Integer maxSeconds) {
            this.maxSeconds = maxSeconds;
            this.__explicitlySet__.add("maxSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GranularityCapability build() {
            GranularityCapability model =
                    new GranularityCapability(this.type, this.minSeconds, this.maxSeconds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GranularityCapability model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("minSeconds")) {
                this.minSeconds(model.getMinSeconds());
            }
            if (model.wasPropertyExplicitlySet("maxSeconds")) {
                this.maxSeconds(model.getMaxSeconds());
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

    /** Granularity selection strategy. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Fixed("FIXED"),
        ClientInput("CLIENT_INPUT"),
        BackendDetermined("BACKEND_DETERMINED"),

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
    /** Granularity selection strategy. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Granularity selection strategy.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /** Minimum supported granularity in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("minSeconds")
    private final Integer minSeconds;

    /**
     * Minimum supported granularity in seconds.
     *
     * @return the value
     */
    public Integer getMinSeconds() {
        return minSeconds;
    }

    /** Maximum supported granularity in seconds. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxSeconds")
    private final Integer maxSeconds;

    /**
     * Maximum supported granularity in seconds.
     *
     * @return the value
     */
    public Integer getMaxSeconds() {
        return maxSeconds;
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
        sb.append("GranularityCapability(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", minSeconds=").append(String.valueOf(this.minSeconds));
        sb.append(", maxSeconds=").append(String.valueOf(this.maxSeconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GranularityCapability)) {
            return false;
        }

        GranularityCapability other = (GranularityCapability) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.minSeconds, other.minSeconds)
                && java.util.Objects.equals(this.maxSeconds, other.maxSeconds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.minSeconds == null ? 43 : this.minSeconds.hashCode());
        result = (result * PRIME) + (this.maxSeconds == null ? 43 : this.maxSeconds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
