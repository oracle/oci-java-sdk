/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aidocument.model;

/**
 * The width and height of a page. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221109")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Dimensions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Dimensions extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"width", "height", "unit"})
    public Dimensions(Double width, Double height, Unit unit) {
        super();
        this.width = width;
        this.height = height;
        this.unit = unit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** the width of a page. */
        @com.fasterxml.jackson.annotation.JsonProperty("width")
        private Double width;

        /**
         * the width of a page.
         *
         * @param width the value to set
         * @return this builder
         */
        public Builder width(Double width) {
            this.width = width;
            this.__explicitlySet__.add("width");
            return this;
        }
        /** The height of a page. */
        @com.fasterxml.jackson.annotation.JsonProperty("height")
        private Double height;

        /**
         * The height of a page.
         *
         * @param height the value to set
         * @return this builder
         */
        public Builder height(Double height) {
            this.height = height;
            this.__explicitlySet__.add("height");
            return this;
        }
        /** The unit of length. */
        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private Unit unit;

        /**
         * The unit of length.
         *
         * @param unit the value to set
         * @return this builder
         */
        public Builder unit(Unit unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Dimensions build() {
            Dimensions model = new Dimensions(this.width, this.height, this.unit);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Dimensions model) {
            if (model.wasPropertyExplicitlySet("width")) {
                this.width(model.getWidth());
            }
            if (model.wasPropertyExplicitlySet("height")) {
                this.height(model.getHeight());
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

    /** the width of a page. */
    @com.fasterxml.jackson.annotation.JsonProperty("width")
    private final Double width;

    /**
     * the width of a page.
     *
     * @return the value
     */
    public Double getWidth() {
        return width;
    }

    /** The height of a page. */
    @com.fasterxml.jackson.annotation.JsonProperty("height")
    private final Double height;

    /**
     * The height of a page.
     *
     * @return the value
     */
    public Double getHeight() {
        return height;
    }

    /** The unit of length. */
    public enum Unit implements com.oracle.bmc.http.internal.BmcEnum {
        Pixel("PIXEL"),
        Inch("INCH"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Unit.class);

        private final String value;
        private static java.util.Map<String, Unit> map;

        static {
            map = new java.util.HashMap<>();
            for (Unit v : Unit.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Unit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Unit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Unit', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /** The unit of length. */
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    private final Unit unit;

    /**
     * The unit of length.
     *
     * @return the value
     */
    public Unit getUnit() {
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
        sb.append("Dimensions(");
        sb.append("super=").append(super.toString());
        sb.append("width=").append(String.valueOf(this.width));
        sb.append(", height=").append(String.valueOf(this.height));
        sb.append(", unit=").append(String.valueOf(this.unit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Dimensions)) {
            return false;
        }

        Dimensions other = (Dimensions) o;
        return java.util.Objects.equals(this.width, other.width)
                && java.util.Objects.equals(this.height, other.height)
                && java.util.Objects.equals(this.unit, other.unit)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.width == null ? 43 : this.width.hashCode());
        result = (result * PRIME) + (this.height == null ? 43 : this.height.hashCode());
        result = (result * PRIME) + (this.unit == null ? 43 : this.unit.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
