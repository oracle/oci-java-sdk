/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The preferences for the flatten operation.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FlattenProjectionPreferences.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FlattenProjectionPreferences {
    @Deprecated
    @java.beans.ConstructorProperties({
        "createArrayIndex",
        "retainAllAttributes",
        "ignoreNullValues",
        "retainParentNameLineage"
    })
    public FlattenProjectionPreferences(
            CreateArrayIndex createArrayIndex,
            RetainAllAttributes retainAllAttributes,
            IgnoreNullValues ignoreNullValues,
            RetainParentNameLineage retainParentNameLineage) {
        super();
        this.createArrayIndex = createArrayIndex;
        this.retainAllAttributes = retainAllAttributes;
        this.ignoreNullValues = ignoreNullValues;
        this.retainParentNameLineage = retainParentNameLineage;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("createArrayIndex")
        private CreateArrayIndex createArrayIndex;

        public Builder createArrayIndex(CreateArrayIndex createArrayIndex) {
            this.createArrayIndex = createArrayIndex;
            this.__explicitlySet__.add("createArrayIndex");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("retainAllAttributes")
        private RetainAllAttributes retainAllAttributes;

        public Builder retainAllAttributes(RetainAllAttributes retainAllAttributes) {
            this.retainAllAttributes = retainAllAttributes;
            this.__explicitlySet__.add("retainAllAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ignoreNullValues")
        private IgnoreNullValues ignoreNullValues;

        public Builder ignoreNullValues(IgnoreNullValues ignoreNullValues) {
            this.ignoreNullValues = ignoreNullValues;
            this.__explicitlySet__.add("ignoreNullValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("retainParentNameLineage")
        private RetainParentNameLineage retainParentNameLineage;

        public Builder retainParentNameLineage(RetainParentNameLineage retainParentNameLineage) {
            this.retainParentNameLineage = retainParentNameLineage;
            this.__explicitlySet__.add("retainParentNameLineage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FlattenProjectionPreferences build() {
            FlattenProjectionPreferences __instance__ =
                    new FlattenProjectionPreferences(
                            createArrayIndex,
                            retainAllAttributes,
                            ignoreNullValues,
                            retainParentNameLineage);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FlattenProjectionPreferences o) {
            Builder copiedBuilder =
                    createArrayIndex(o.getCreateArrayIndex())
                            .retainAllAttributes(o.getRetainAllAttributes())
                            .ignoreNullValues(o.getIgnoreNullValues())
                            .retainParentNameLineage(o.getRetainParentNameLineage());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Property defining whether to create array indexes in flattened result.
     **/
    public enum CreateArrayIndex {
        Allow("ALLOW"),
        DoNotAllow("DO_NOT_ALLOW"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CreateArrayIndex.class);

        private final String value;
        private static java.util.Map<String, CreateArrayIndex> map;

        static {
            map = new java.util.HashMap<>();
            for (CreateArrayIndex v : CreateArrayIndex.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CreateArrayIndex(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CreateArrayIndex create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CreateArrayIndex', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Property defining whether to create array indexes in flattened result.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("createArrayIndex")
    private final CreateArrayIndex createArrayIndex;

    public CreateArrayIndex getCreateArrayIndex() {
        return createArrayIndex;
    }

    /**
     * Property defining whether to retain all attributes in flattened result.
     **/
    public enum RetainAllAttributes {
        Allow("ALLOW"),
        DoNotAllow("DO_NOT_ALLOW"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RetainAllAttributes.class);

        private final String value;
        private static java.util.Map<String, RetainAllAttributes> map;

        static {
            map = new java.util.HashMap<>();
            for (RetainAllAttributes v : RetainAllAttributes.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RetainAllAttributes(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RetainAllAttributes create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RetainAllAttributes', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Property defining whether to retain all attributes in flattened result.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retainAllAttributes")
    private final RetainAllAttributes retainAllAttributes;

    public RetainAllAttributes getRetainAllAttributes() {
        return retainAllAttributes;
    }

    /**
     * Property defining whether to ignore null values in flattened result.
     **/
    public enum IgnoreNullValues {
        Allow("ALLOW"),
        DoNotAllow("DO_NOT_ALLOW"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IgnoreNullValues.class);

        private final String value;
        private static java.util.Map<String, IgnoreNullValues> map;

        static {
            map = new java.util.HashMap<>();
            for (IgnoreNullValues v : IgnoreNullValues.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IgnoreNullValues(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IgnoreNullValues create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IgnoreNullValues', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Property defining whether to ignore null values in flattened result.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ignoreNullValues")
    private final IgnoreNullValues ignoreNullValues;

    public IgnoreNullValues getIgnoreNullValues() {
        return ignoreNullValues;
    }

    /**
     * Property defining whether to retain parent name lineage.
     **/
    public enum RetainParentNameLineage {
        Allow("ALLOW"),
        DoNotAllow("DO_NOT_ALLOW"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RetainParentNameLineage.class);

        private final String value;
        private static java.util.Map<String, RetainParentNameLineage> map;

        static {
            map = new java.util.HashMap<>();
            for (RetainParentNameLineage v : RetainParentNameLineage.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RetainParentNameLineage(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RetainParentNameLineage create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RetainParentNameLineage', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Property defining whether to retain parent name lineage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("retainParentNameLineage")
    private final RetainParentNameLineage retainParentNameLineage;

    public RetainParentNameLineage getRetainParentNameLineage() {
        return retainParentNameLineage;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("FlattenProjectionPreferences(");
        sb.append("createArrayIndex=").append(String.valueOf(this.createArrayIndex));
        sb.append(", retainAllAttributes=").append(String.valueOf(this.retainAllAttributes));
        sb.append(", ignoreNullValues=").append(String.valueOf(this.ignoreNullValues));
        sb.append(", retainParentNameLineage=")
                .append(String.valueOf(this.retainParentNameLineage));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FlattenProjectionPreferences)) {
            return false;
        }

        FlattenProjectionPreferences other = (FlattenProjectionPreferences) o;
        return java.util.Objects.equals(this.createArrayIndex, other.createArrayIndex)
                && java.util.Objects.equals(this.retainAllAttributes, other.retainAllAttributes)
                && java.util.Objects.equals(this.ignoreNullValues, other.ignoreNullValues)
                && java.util.Objects.equals(
                        this.retainParentNameLineage, other.retainParentNameLineage)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.createArrayIndex == null ? 43 : this.createArrayIndex.hashCode());
        result =
                (result * PRIME)
                        + (this.retainAllAttributes == null
                                ? 43
                                : this.retainAllAttributes.hashCode());
        result =
                (result * PRIME)
                        + (this.ignoreNullValues == null ? 43 : this.ignoreNullValues.hashCode());
        result =
                (result * PRIME)
                        + (this.retainParentNameLineage == null
                                ? 43
                                : this.retainParentNameLineage.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
