/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * Storage size.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TablespaceStorageSize.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TablespaceStorageSize
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"size", "unit"})
    public TablespaceStorageSize(java.math.BigDecimal size, Unit unit) {
        super();
        this.size = size;
        this.unit = unit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Storage size number in bytes, kilobytes, megabytes, gigabytes, or terabytes.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("size")
        private java.math.BigDecimal size;

        /**
         * Storage size number in bytes, kilobytes, megabytes, gigabytes, or terabytes.
         *
         * @param size the value to set
         * @return this builder
         **/
        public Builder size(java.math.BigDecimal size) {
            this.size = size;
            this.__explicitlySet__.add("size");
            return this;
        }
        /**
         * Storage size unit: bytes, kilobytes, megabytes, gigabytes, or terabytes.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private Unit unit;

        /**
         * Storage size unit: bytes, kilobytes, megabytes, gigabytes, or terabytes.
         *
         * @param unit the value to set
         * @return this builder
         **/
        public Builder unit(Unit unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TablespaceStorageSize build() {
            TablespaceStorageSize model = new TablespaceStorageSize(this.size, this.unit);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TablespaceStorageSize model) {
            if (model.wasPropertyExplicitlySet("size")) {
                this.size(model.getSize());
            }
            if (model.wasPropertyExplicitlySet("unit")) {
                this.unit(model.getUnit());
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
     * Storage size number in bytes, kilobytes, megabytes, gigabytes, or terabytes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("size")
    private final java.math.BigDecimal size;

    /**
     * Storage size number in bytes, kilobytes, megabytes, gigabytes, or terabytes.
     *
     * @return the value
     **/
    public java.math.BigDecimal getSize() {
        return size;
    }

    /**
     * Storage size unit: bytes, kilobytes, megabytes, gigabytes, or terabytes.
     *
     **/
    public enum Unit {
        Bytes("BYTES"),
        Kilobytes("KILOBYTES"),
        Megabytes("MEGABYTES"),
        Gigabytes("GIGABYTES"),
        Terabytes("TERABYTES"),
        ;

        private final String value;
        private static java.util.Map<String, Unit> map;

        static {
            map = new java.util.HashMap<>();
            for (Unit v : Unit.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Unit: " + key);
        }
    };
    /**
     * Storage size unit: bytes, kilobytes, megabytes, gigabytes, or terabytes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    private final Unit unit;

    /**
     * Storage size unit: bytes, kilobytes, megabytes, gigabytes, or terabytes.
     *
     * @return the value
     **/
    public Unit getUnit() {
        return unit;
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
        sb.append("TablespaceStorageSize(");
        sb.append("super=").append(super.toString());
        sb.append("size=").append(String.valueOf(this.size));
        sb.append(", unit=").append(String.valueOf(this.unit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TablespaceStorageSize)) {
            return false;
        }

        TablespaceStorageSize other = (TablespaceStorageSize) o;
        return java.util.Objects.equals(this.size, other.size)
                && java.util.Objects.equals(this.unit, other.unit)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.size == null ? 43 : this.size.hashCode());
        result = (result * PRIME) + (this.unit == null ? 43 : this.unit.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
