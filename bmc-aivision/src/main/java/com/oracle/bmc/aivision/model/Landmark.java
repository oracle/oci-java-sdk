/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aivision.model;

/**
 * The landmark on the face.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Landmark.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Landmark extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "x", "y"})
    public Landmark(Type type, Float x, Float y) {
        super();
        this.type = type;
        this.x = x;
        this.y = y;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The face landmark type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The face landmark type
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The X-axis normalized coordinate.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("x")
        private Float x;

        /**
         * The X-axis normalized coordinate.
         * @param x the value to set
         * @return this builder
         **/
        public Builder x(Float x) {
            this.x = x;
            this.__explicitlySet__.add("x");
            return this;
        }
        /**
         * The Y-axis normalized coordinate.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("y")
        private Float y;

        /**
         * The Y-axis normalized coordinate.
         * @param y the value to set
         * @return this builder
         **/
        public Builder y(Float y) {
            this.y = y;
            this.__explicitlySet__.add("y");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Landmark build() {
            Landmark model = new Landmark(this.type, this.x, this.y);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Landmark model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("x")) {
                this.x(model.getX());
            }
            if (model.wasPropertyExplicitlySet("y")) {
                this.y(model.getY());
            }
            return this;
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
     * The face landmark type
     **/
    public enum Type {
        LeftEye("LEFT_EYE"),
        RightEye("RIGHT_EYE"),
        NoseTip("NOSE_TIP"),
        LeftEdgeOfMouth("LEFT_EDGE_OF_MOUTH"),
        RightEdgeOfMouth("RIGHT_EDGE_OF_MOUTH"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
    /**
     * The face landmark type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The face landmark type
     * @return the value
     **/
    public Type getType() {
        return type;
    }

    /**
     * The X-axis normalized coordinate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("x")
    private final Float x;

    /**
     * The X-axis normalized coordinate.
     * @return the value
     **/
    public Float getX() {
        return x;
    }

    /**
     * The Y-axis normalized coordinate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("y")
    private final Float y;

    /**
     * The Y-axis normalized coordinate.
     * @return the value
     **/
    public Float getY() {
        return y;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Landmark(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", x=").append(String.valueOf(this.x));
        sb.append(", y=").append(String.valueOf(this.y));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Landmark)) {
            return false;
        }

        Landmark other = (Landmark) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.x, other.x)
                && java.util.Objects.equals(this.y, other.y)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.x == null ? 43 : this.x.hashCode());
        result = (result * PRIME) + (this.y == null ? 43 : this.y.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
