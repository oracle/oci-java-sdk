/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Object that contains the details about a single attribute in the bulk request to be activated.
 * The attributeNameSpace and unit are optional parameters, and the attributeNameSpace will default
 * to TRACES if it is not passed in. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BulkActivateAttributeDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BulkActivateAttributeDetail
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "attributeName",
        "attributeType",
        "attributeExpression",
        "unit",
        "attributeNameSpace"
    })
    public BulkActivateAttributeDetail(
            String attributeName,
            AttributeType attributeType,
            String attributeExpression,
            Unit unit,
            AttributeNameSpace attributeNameSpace) {
        super();
        this.attributeName = attributeName;
        this.attributeType = attributeType;
        this.attributeExpression = attributeExpression;
        this.unit = unit;
        this.attributeNameSpace = attributeNameSpace;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the attribute to be activated. */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeName")
        private String attributeName;

        /**
         * Name of the attribute to be activated.
         *
         * @param attributeName the value to set
         * @return this builder
         */
        public Builder attributeName(String attributeName) {
            this.attributeName = attributeName;
            this.__explicitlySet__.add("attributeName");
            return this;
        }
        /** Type of the attribute to be activated. */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeType")
        private AttributeType attributeType;

        /**
         * Type of the attribute to be activated.
         *
         * @param attributeType the value to set
         * @return this builder
         */
        public Builder attributeType(AttributeType attributeType) {
            this.attributeType = attributeType;
            this.__explicitlySet__.add("attributeType");
            return this;
        }
        /** Attribute expression if this attribute is an alias */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeExpression")
        private String attributeExpression;

        /**
         * Attribute expression if this attribute is an alias
         *
         * @param attributeExpression the value to set
         * @return this builder
         */
        public Builder attributeExpression(String attributeExpression) {
            this.attributeExpression = attributeExpression;
            this.__explicitlySet__.add("attributeExpression");
            return this;
        }
        /** Unit of the attribute to be updated. If unit is not specified, it defaults to NONE. */
        @com.fasterxml.jackson.annotation.JsonProperty("unit")
        private Unit unit;

        /**
         * Unit of the attribute to be updated. If unit is not specified, it defaults to NONE.
         *
         * @param unit the value to set
         * @return this builder
         */
        public Builder unit(Unit unit) {
            this.unit = unit;
            this.__explicitlySet__.add("unit");
            return this;
        }
        /**
         * Namespace of the attribute to be activated. The attributeNameSpace will default to TRACES
         * if it is not passed in.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeNameSpace")
        private AttributeNameSpace attributeNameSpace;

        /**
         * Namespace of the attribute to be activated. The attributeNameSpace will default to TRACES
         * if it is not passed in.
         *
         * @param attributeNameSpace the value to set
         * @return this builder
         */
        public Builder attributeNameSpace(AttributeNameSpace attributeNameSpace) {
            this.attributeNameSpace = attributeNameSpace;
            this.__explicitlySet__.add("attributeNameSpace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BulkActivateAttributeDetail build() {
            BulkActivateAttributeDetail model =
                    new BulkActivateAttributeDetail(
                            this.attributeName,
                            this.attributeType,
                            this.attributeExpression,
                            this.unit,
                            this.attributeNameSpace);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BulkActivateAttributeDetail model) {
            if (model.wasPropertyExplicitlySet("attributeName")) {
                this.attributeName(model.getAttributeName());
            }
            if (model.wasPropertyExplicitlySet("attributeType")) {
                this.attributeType(model.getAttributeType());
            }
            if (model.wasPropertyExplicitlySet("attributeExpression")) {
                this.attributeExpression(model.getAttributeExpression());
            }
            if (model.wasPropertyExplicitlySet("unit")) {
                this.unit(model.getUnit());
            }
            if (model.wasPropertyExplicitlySet("attributeNameSpace")) {
                this.attributeNameSpace(model.getAttributeNameSpace());
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

    /** Name of the attribute to be activated. */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeName")
    private final String attributeName;

    /**
     * Name of the attribute to be activated.
     *
     * @return the value
     */
    public String getAttributeName() {
        return attributeName;
    }

    /** Type of the attribute to be activated. */
    public enum AttributeType implements com.oracle.bmc.http.internal.BmcEnum {
        Numeric("NUMERIC"),
        String("STRING"),
        None("NONE"),
        ;

        private final String value;
        private static java.util.Map<String, AttributeType> map;

        static {
            map = new java.util.HashMap<>();
            for (AttributeType v : AttributeType.values()) {
                map.put(v.getValue(), v);
            }
        }

        AttributeType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AttributeType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AttributeType: " + key);
        }
    };
    /** Type of the attribute to be activated. */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeType")
    private final AttributeType attributeType;

    /**
     * Type of the attribute to be activated.
     *
     * @return the value
     */
    public AttributeType getAttributeType() {
        return attributeType;
    }

    /** Attribute expression if this attribute is an alias */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeExpression")
    private final String attributeExpression;

    /**
     * Attribute expression if this attribute is an alias
     *
     * @return the value
     */
    public String getAttributeExpression() {
        return attributeExpression;
    }

    /** Unit of the attribute to be updated. If unit is not specified, it defaults to NONE. */
    public enum Unit implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        EpochTimeMs("EPOCH_TIME_MS"),
        Bytes("BYTES"),
        Count("COUNT"),
        DurationMs("DURATION_MS"),
        TraceStatus("TRACE_STATUS"),
        Percentage("PERCENTAGE"),
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
    /** Unit of the attribute to be updated. If unit is not specified, it defaults to NONE. */
    @com.fasterxml.jackson.annotation.JsonProperty("unit")
    private final Unit unit;

    /**
     * Unit of the attribute to be updated. If unit is not specified, it defaults to NONE.
     *
     * @return the value
     */
    public Unit getUnit() {
        return unit;
    }

    /**
     * Namespace of the attribute to be activated. The attributeNameSpace will default to TRACES if
     * it is not passed in.
     */
    public enum AttributeNameSpace implements com.oracle.bmc.http.internal.BmcEnum {
        Traces("TRACES"),
        Synthetic("SYNTHETIC"),
        Logs("LOGS"),
        ;

        private final String value;
        private static java.util.Map<String, AttributeNameSpace> map;

        static {
            map = new java.util.HashMap<>();
            for (AttributeNameSpace v : AttributeNameSpace.values()) {
                map.put(v.getValue(), v);
            }
        }

        AttributeNameSpace(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AttributeNameSpace create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AttributeNameSpace: " + key);
        }
    };
    /**
     * Namespace of the attribute to be activated. The attributeNameSpace will default to TRACES if
     * it is not passed in.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeNameSpace")
    private final AttributeNameSpace attributeNameSpace;

    /**
     * Namespace of the attribute to be activated. The attributeNameSpace will default to TRACES if
     * it is not passed in.
     *
     * @return the value
     */
    public AttributeNameSpace getAttributeNameSpace() {
        return attributeNameSpace;
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
        sb.append("BulkActivateAttributeDetail(");
        sb.append("super=").append(super.toString());
        sb.append("attributeName=").append(String.valueOf(this.attributeName));
        sb.append(", attributeType=").append(String.valueOf(this.attributeType));
        sb.append(", attributeExpression=").append(String.valueOf(this.attributeExpression));
        sb.append(", unit=").append(String.valueOf(this.unit));
        sb.append(", attributeNameSpace=").append(String.valueOf(this.attributeNameSpace));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BulkActivateAttributeDetail)) {
            return false;
        }

        BulkActivateAttributeDetail other = (BulkActivateAttributeDetail) o;
        return java.util.Objects.equals(this.attributeName, other.attributeName)
                && java.util.Objects.equals(this.attributeType, other.attributeType)
                && java.util.Objects.equals(this.attributeExpression, other.attributeExpression)
                && java.util.Objects.equals(this.unit, other.unit)
                && java.util.Objects.equals(this.attributeNameSpace, other.attributeNameSpace)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.attributeName == null ? 43 : this.attributeName.hashCode());
        result =
                (result * PRIME)
                        + (this.attributeType == null ? 43 : this.attributeType.hashCode());
        result =
                (result * PRIME)
                        + (this.attributeExpression == null
                                ? 43
                                : this.attributeExpression.hashCode());
        result = (result * PRIME) + (this.unit == null ? 43 : this.unit.hashCode());
        result =
                (result * PRIME)
                        + (this.attributeNameSpace == null
                                ? 43
                                : this.attributeNameSpace.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
