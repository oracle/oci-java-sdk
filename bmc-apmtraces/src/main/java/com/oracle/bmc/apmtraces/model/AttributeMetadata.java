/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Definition of the attribute metadata. <br>
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
        builder = AttributeMetadata.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AttributeMetadata
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"attributeType", "attributeUnit"})
    public AttributeMetadata(AttributeType attributeType, AttributeUnit attributeUnit) {
        super();
        this.attributeType = attributeType;
        this.attributeUnit = attributeUnit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Type associated with the attribute key. */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeType")
        private AttributeType attributeType;

        /**
         * Type associated with the attribute key.
         *
         * @param attributeType the value to set
         * @return this builder
         */
        public Builder attributeType(AttributeType attributeType) {
            this.attributeType = attributeType;
            this.__explicitlySet__.add("attributeType");
            return this;
        }
        /**
         * Unit associated with the attribute key. If unit is not specified, it defaults to NONE.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("attributeUnit")
        private AttributeUnit attributeUnit;

        /**
         * Unit associated with the attribute key. If unit is not specified, it defaults to NONE.
         *
         * @param attributeUnit the value to set
         * @return this builder
         */
        public Builder attributeUnit(AttributeUnit attributeUnit) {
            this.attributeUnit = attributeUnit;
            this.__explicitlySet__.add("attributeUnit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AttributeMetadata build() {
            AttributeMetadata model = new AttributeMetadata(this.attributeType, this.attributeUnit);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AttributeMetadata model) {
            if (model.wasPropertyExplicitlySet("attributeType")) {
                this.attributeType(model.getAttributeType());
            }
            if (model.wasPropertyExplicitlySet("attributeUnit")) {
                this.attributeUnit(model.getAttributeUnit());
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

    /** Type associated with the attribute key. */
    public enum AttributeType implements com.oracle.bmc.http.internal.BmcEnum {
        String("STRING"),
        Numeric("NUMERIC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AttributeType.class);

        private final String value;
        private static java.util.Map<String, AttributeType> map;

        static {
            map = new java.util.HashMap<>();
            for (AttributeType v : AttributeType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'AttributeType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Type associated with the attribute key. */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeType")
    private final AttributeType attributeType;

    /**
     * Type associated with the attribute key.
     *
     * @return the value
     */
    public AttributeType getAttributeType() {
        return attributeType;
    }

    /** Unit associated with the attribute key. If unit is not specified, it defaults to NONE. */
    public enum AttributeUnit implements com.oracle.bmc.http.internal.BmcEnum {
        EpochTimeMs("EPOCH_TIME_MS"),
        Bytes("BYTES"),
        Count("COUNT"),
        DurationMs("DURATION_MS"),
        Percentage("PERCENTAGE"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AttributeUnit.class);

        private final String value;
        private static java.util.Map<String, AttributeUnit> map;

        static {
            map = new java.util.HashMap<>();
            for (AttributeUnit v : AttributeUnit.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AttributeUnit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AttributeUnit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AttributeUnit', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Unit associated with the attribute key. If unit is not specified, it defaults to NONE. */
    @com.fasterxml.jackson.annotation.JsonProperty("attributeUnit")
    private final AttributeUnit attributeUnit;

    /**
     * Unit associated with the attribute key. If unit is not specified, it defaults to NONE.
     *
     * @return the value
     */
    public AttributeUnit getAttributeUnit() {
        return attributeUnit;
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
        sb.append("AttributeMetadata(");
        sb.append("super=").append(super.toString());
        sb.append("attributeType=").append(String.valueOf(this.attributeType));
        sb.append(", attributeUnit=").append(String.valueOf(this.attributeUnit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AttributeMetadata)) {
            return false;
        }

        AttributeMetadata other = (AttributeMetadata) o;
        return java.util.Objects.equals(this.attributeType, other.attributeType)
                && java.util.Objects.equals(this.attributeUnit, other.attributeUnit)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.attributeType == null ? 43 : this.attributeType.hashCode());
        result =
                (result * PRIME)
                        + (this.attributeUnit == null ? 43 : this.attributeUnit.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
