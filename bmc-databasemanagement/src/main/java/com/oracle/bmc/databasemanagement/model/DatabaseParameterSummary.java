/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A summary of the database parameter.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DatabaseParameterSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DatabaseParameterSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayValue")
        private String displayValue;

        public Builder displayValue(String displayValue) {
            this.displayValue = displayValue;
            this.__explicitlySet__.add("displayValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("number")
        private java.math.BigDecimal number;

        public Builder number(java.math.BigDecimal number) {
            this.number = number;
            this.__explicitlySet__.add("number");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSessionModifiable")
        private Boolean isSessionModifiable;

        public Builder isSessionModifiable(Boolean isSessionModifiable) {
            this.isSessionModifiable = isSessionModifiable;
            this.__explicitlySet__.add("isSessionModifiable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSystemModifiable")
        private IsSystemModifiable isSystemModifiable;

        public Builder isSystemModifiable(IsSystemModifiable isSystemModifiable) {
            this.isSystemModifiable = isSystemModifiable;
            this.__explicitlySet__.add("isSystemModifiable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPdbModifiable")
        private Boolean isPdbModifiable;

        public Builder isPdbModifiable(Boolean isPdbModifiable) {
            this.isPdbModifiable = isPdbModifiable;
            this.__explicitlySet__.add("isPdbModifiable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isInstanceModifiable")
        private Boolean isInstanceModifiable;

        public Builder isInstanceModifiable(Boolean isInstanceModifiable) {
            this.isInstanceModifiable = isInstanceModifiable;
            this.__explicitlySet__.add("isInstanceModifiable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isModified")
        private IsModified isModified;

        public Builder isModified(IsModified isModified) {
            this.isModified = isModified;
            this.__explicitlySet__.add("isModified");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAdjusted")
        private Boolean isAdjusted;

        public Builder isAdjusted(Boolean isAdjusted) {
            this.isAdjusted = isAdjusted;
            this.__explicitlySet__.add("isAdjusted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDeprecated")
        private Boolean isDeprecated;

        public Builder isDeprecated(Boolean isDeprecated) {
            this.isDeprecated = isDeprecated;
            this.__explicitlySet__.add("isDeprecated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isBasic")
        private Boolean isBasic;

        public Builder isBasic(Boolean isBasic) {
            this.isBasic = isBasic;
            this.__explicitlySet__.add("isBasic");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ordinal")
        private java.math.BigDecimal ordinal;

        public Builder ordinal(java.math.BigDecimal ordinal) {
            this.ordinal = ordinal;
            this.__explicitlySet__.add("ordinal");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updateComment")
        private String updateComment;

        public Builder updateComment(String updateComment) {
            this.updateComment = updateComment;
            this.__explicitlySet__.add("updateComment");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("containerId")
        private java.math.BigDecimal containerId;

        public Builder containerId(java.math.BigDecimal containerId) {
            this.containerId = containerId;
            this.__explicitlySet__.add("containerId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("constraint")
        private Constraint constraint;

        public Builder constraint(Constraint constraint) {
            this.constraint = constraint;
            this.__explicitlySet__.add("constraint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sid")
        private String sid;

        public Builder sid(String sid) {
            this.sid = sid;
            this.__explicitlySet__.add("sid");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSpecified")
        private Boolean isSpecified;

        public Builder isSpecified(Boolean isSpecified) {
            this.isSpecified = isSpecified;
            this.__explicitlySet__.add("isSpecified");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
        private java.util.List<AllowedParameterValue> allowedValues;

        public Builder allowedValues(java.util.List<AllowedParameterValue> allowedValues) {
            this.allowedValues = allowedValues;
            this.__explicitlySet__.add("allowedValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseParameterSummary build() {
            DatabaseParameterSummary __instance__ =
                    new DatabaseParameterSummary(
                            name,
                            type,
                            value,
                            displayValue,
                            number,
                            isDefault,
                            isSessionModifiable,
                            isSystemModifiable,
                            isPdbModifiable,
                            isInstanceModifiable,
                            isModified,
                            isAdjusted,
                            isDeprecated,
                            isBasic,
                            description,
                            ordinal,
                            updateComment,
                            containerId,
                            category,
                            constraint,
                            sid,
                            isSpecified,
                            allowedValues);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseParameterSummary o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .type(o.getType())
                            .value(o.getValue())
                            .displayValue(o.getDisplayValue())
                            .number(o.getNumber())
                            .isDefault(o.getIsDefault())
                            .isSessionModifiable(o.getIsSessionModifiable())
                            .isSystemModifiable(o.getIsSystemModifiable())
                            .isPdbModifiable(o.getIsPdbModifiable())
                            .isInstanceModifiable(o.getIsInstanceModifiable())
                            .isModified(o.getIsModified())
                            .isAdjusted(o.getIsAdjusted())
                            .isDeprecated(o.getIsDeprecated())
                            .isBasic(o.getIsBasic())
                            .description(o.getDescription())
                            .ordinal(o.getOrdinal())
                            .updateComment(o.getUpdateComment())
                            .containerId(o.getContainerId())
                            .category(o.getCategory())
                            .constraint(o.getConstraint())
                            .sid(o.getSid())
                            .isSpecified(o.getIsSpecified())
                            .allowedValues(o.getAllowedValues());

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

    /**
     * The parameter name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;
    /**
     * The parameter type.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Type {
        Boolean("BOOLEAN"),
        String("STRING"),
        Integer("INTEGER"),
        Filename("FILENAME"),
        BigInteger("BIG_INTEGER"),
        Reserved("RESERVED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The parameter type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    Type type;

    /**
     * The parameter value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    String value;

    /**
     * The parameter value in a user-friendly format. For example, if the `value` property shows the value 262144 for a big integer parameter, then the `displayValue` property will show the value 256K.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayValue")
    String displayValue;

    /**
     * The parameter number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("number")
    java.math.BigDecimal number;

    /**
     * Indicates whether the parameter is set to the default value (`TRUE`) or the parameter value was specified in the parameter file (`FALSE`).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    Boolean isDefault;

    /**
     * Indicates whether the parameter can be changed with `ALTER SESSION` (`TRUE`) or not (`FALSE`)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSessionModifiable")
    Boolean isSessionModifiable;
    /**
     * Indicates whether the parameter can be changed with `ALTER SYSTEM` and when the change takes effect:
     * - IMMEDIATE: Parameter can be changed with `ALTER SYSTEM` regardless of the type of parameter file used to start the instance. The change takes effect immediately.
     * - DEFERRED: Parameter can be changed with `ALTER SYSTEM` regardless of the type of parameter file used to start the instance. The change takes effect in subsequent sessions.
     * - FALSE: Parameter cannot be changed with `ALTER SYSTEM` unless a server parameter file was used to start the instance. The change takes effect in subsequent instances.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum IsSystemModifiable {
        Immediate("IMMEDIATE"),
        Deferred("DEFERRED"),
        False("FALSE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, IsSystemModifiable> map;

        static {
            map = new java.util.HashMap<>();
            for (IsSystemModifiable v : IsSystemModifiable.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IsSystemModifiable(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IsSystemModifiable create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IsSystemModifiable', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates whether the parameter can be changed with `ALTER SYSTEM` and when the change takes effect:
     * - IMMEDIATE: Parameter can be changed with `ALTER SYSTEM` regardless of the type of parameter file used to start the instance. The change takes effect immediately.
     * - DEFERRED: Parameter can be changed with `ALTER SYSTEM` regardless of the type of parameter file used to start the instance. The change takes effect in subsequent sessions.
     * - FALSE: Parameter cannot be changed with `ALTER SYSTEM` unless a server parameter file was used to start the instance. The change takes effect in subsequent instances.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSystemModifiable")
    IsSystemModifiable isSystemModifiable;

    /**
     * Indicates whether the parameter can be modified on a per-PDB basis (`TRUE`) or not (`FALSE`). In a non-CDB, the value of this property is `null`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPdbModifiable")
    Boolean isPdbModifiable;

    /**
     * For parameters that can be changed with `ALTER SYSTEM`, indicates whether the value of the parameter can be different for every instance (`TRUE`) or whether the parameter must have the same value for all Real Application Clusters instances (`FALSE`). For other parameters, this is always `FALSE`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isInstanceModifiable")
    Boolean isInstanceModifiable;
    /**
     * Indicates how the parameter was modified. If an `ALTER SYSTEM` was performed, the value will be `MODIFIED`.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum IsModified {
        Modified("MODIFIED"),
        False("FALSE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, IsModified> map;

        static {
            map = new java.util.HashMap<>();
            for (IsModified v : IsModified.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        IsModified(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static IsModified create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'IsModified', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates how the parameter was modified. If an `ALTER SYSTEM` was performed, the value will be `MODIFIED`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isModified")
    IsModified isModified;

    /**
     * Indicates whether Oracle adjusted the input value to a more suitable value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAdjusted")
    Boolean isAdjusted;

    /**
     * Indicates whether the parameter has been deprecated (`TRUE`) or not (`FALSE`).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDeprecated")
    Boolean isDeprecated;

    /**
     * Indicates whether the parameter is a basic parameter (`TRUE`) or not (`FALSE`).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBasic")
    Boolean isBasic;

    /**
     * The description of the parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The position (ordinal number) of the parameter value. Useful only for parameters whose values are lists of strings.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ordinal")
    java.math.BigDecimal ordinal;

    /**
     * The comments associated with the most recent update.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updateComment")
    String updateComment;

    /**
     * The ID of the database container to which the data pertains.
     * Possible values include:
     * - `0`: This value is used for data that pertain to the entire CDB. This value is also used for data in non-CDBs.
     * - `1`: This value is used for data that pertain to only the root container.
     * - `n`: Where n is the applicable container ID for the data.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("containerId")
    java.math.BigDecimal containerId;

    /**
     * The parameter category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    String category;
    /**
     * Applicable in case of Oracle Real Application Clusters (Oracle RAC) databases.
     * A `UNIQUE` parameter is one which is unique to each Oracle Real Application
     * Clusters (Oracle RAC) instance. For example, the parameter `INSTANCE_NUMBER`
     * must have different values in each instance. An `IDENTICAL` parameter must
     * have the same value for every instance. For example, the parameter
     * `DB_BLOCK_SIZE` must have the same value in all instances.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Constraint {
        Unique("UNIQUE"),
        Identical("IDENTICAL"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Constraint> map;

        static {
            map = new java.util.HashMap<>();
            for (Constraint v : Constraint.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Constraint(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Constraint create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Constraint', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Applicable in case of Oracle Real Application Clusters (Oracle RAC) databases.
     * A `UNIQUE` parameter is one which is unique to each Oracle Real Application
     * Clusters (Oracle RAC) instance. For example, the parameter `INSTANCE_NUMBER`
     * must have different values in each instance. An `IDENTICAL` parameter must
     * have the same value for every instance. For example, the parameter
     * `DB_BLOCK_SIZE` must have the same value in all instances.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("constraint")
    Constraint constraint;

    /**
     * The database instance SID for which the parameter is defined.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sid")
    String sid;

    /**
     * Indicates whether the parameter was specified in the server parameter file (`TRUE`) or not (`FALSE`). Applicable only when the parameter source is `SPFILE`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSpecified")
    Boolean isSpecified;

    /**
     * A list of allowed values for this parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
    java.util.List<AllowedParameterValue> allowedValues;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
