/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DatabaseParameterSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseParameterSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "type",
        "value",
        "displayValue",
        "number",
        "isDefault",
        "isSessionModifiable",
        "isSystemModifiable",
        "isPdbModifiable",
        "isInstanceModifiable",
        "isModified",
        "isAdjusted",
        "isDeprecated",
        "isBasic",
        "description",
        "ordinal",
        "updateComment",
        "containerId",
        "category",
        "constraint",
        "sid",
        "isSpecified",
        "allowedValues"
    })
    public DatabaseParameterSummary(
            String name,
            Type type,
            String value,
            String displayValue,
            java.math.BigDecimal number,
            Boolean isDefault,
            Boolean isSessionModifiable,
            IsSystemModifiable isSystemModifiable,
            Boolean isPdbModifiable,
            Boolean isInstanceModifiable,
            IsModified isModified,
            Boolean isAdjusted,
            Boolean isDeprecated,
            Boolean isBasic,
            String description,
            java.math.BigDecimal ordinal,
            String updateComment,
            java.math.BigDecimal containerId,
            String category,
            Constraint constraint,
            String sid,
            Boolean isSpecified,
            java.util.List<AllowedParameterValue> allowedValues) {
        super();
        this.name = name;
        this.type = type;
        this.value = value;
        this.displayValue = displayValue;
        this.number = number;
        this.isDefault = isDefault;
        this.isSessionModifiable = isSessionModifiable;
        this.isSystemModifiable = isSystemModifiable;
        this.isPdbModifiable = isPdbModifiable;
        this.isInstanceModifiable = isInstanceModifiable;
        this.isModified = isModified;
        this.isAdjusted = isAdjusted;
        this.isDeprecated = isDeprecated;
        this.isBasic = isBasic;
        this.description = description;
        this.ordinal = ordinal;
        this.updateComment = updateComment;
        this.containerId = containerId;
        this.category = category;
        this.constraint = constraint;
        this.sid = sid;
        this.isSpecified = isSpecified;
        this.allowedValues = allowedValues;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The parameter name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The parameter name.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The parameter type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The parameter type.
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The parameter value.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The parameter value.
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * The parameter value in a user-friendly format. For example, if the {@code value} property shows the value 262144 for a big integer parameter, then the {@code displayValue} property will show the value 256K.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayValue")
        private String displayValue;

        /**
         * The parameter value in a user-friendly format. For example, if the {@code value} property shows the value 262144 for a big integer parameter, then the {@code displayValue} property will show the value 256K.
         *
         * @param displayValue the value to set
         * @return this builder
         **/
        public Builder displayValue(String displayValue) {
            this.displayValue = displayValue;
            this.__explicitlySet__.add("displayValue");
            return this;
        }
        /**
         * The parameter number.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("number")
        private java.math.BigDecimal number;

        /**
         * The parameter number.
         * @param number the value to set
         * @return this builder
         **/
        public Builder number(java.math.BigDecimal number) {
            this.number = number;
            this.__explicitlySet__.add("number");
            return this;
        }
        /**
         * Indicates whether the parameter is set to the default value ({@code TRUE}) or the parameter value was specified in the parameter file ({@code FALSE}).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
        private Boolean isDefault;

        /**
         * Indicates whether the parameter is set to the default value ({@code TRUE}) or the parameter value was specified in the parameter file ({@code FALSE}).
         *
         * @param isDefault the value to set
         * @return this builder
         **/
        public Builder isDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            this.__explicitlySet__.add("isDefault");
            return this;
        }
        /**
         * Indicates whether the parameter can be changed with {@code ALTER SESSION} ({@code TRUE}) or not ({@code FALSE})
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSessionModifiable")
        private Boolean isSessionModifiable;

        /**
         * Indicates whether the parameter can be changed with {@code ALTER SESSION} ({@code TRUE}) or not ({@code FALSE})
         *
         * @param isSessionModifiable the value to set
         * @return this builder
         **/
        public Builder isSessionModifiable(Boolean isSessionModifiable) {
            this.isSessionModifiable = isSessionModifiable;
            this.__explicitlySet__.add("isSessionModifiable");
            return this;
        }
        /**
         * Indicates whether the parameter can be changed with {@code ALTER SYSTEM} and when the change takes effect:
         * - IMMEDIATE: Parameter can be changed with {@code ALTER SYSTEM} regardless of the type of parameter file used to start the instance. The change takes effect immediately.
         * - DEFERRED: Parameter can be changed with {@code ALTER SYSTEM} regardless of the type of parameter file used to start the instance. The change takes effect in subsequent sessions.
         * - FALSE: Parameter cannot be changed with {@code ALTER SYSTEM} unless a server parameter file was used to start the instance. The change takes effect in subsequent instances.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSystemModifiable")
        private IsSystemModifiable isSystemModifiable;

        /**
         * Indicates whether the parameter can be changed with {@code ALTER SYSTEM} and when the change takes effect:
         * - IMMEDIATE: Parameter can be changed with {@code ALTER SYSTEM} regardless of the type of parameter file used to start the instance. The change takes effect immediately.
         * - DEFERRED: Parameter can be changed with {@code ALTER SYSTEM} regardless of the type of parameter file used to start the instance. The change takes effect in subsequent sessions.
         * - FALSE: Parameter cannot be changed with {@code ALTER SYSTEM} unless a server parameter file was used to start the instance. The change takes effect in subsequent instances.
         *
         * @param isSystemModifiable the value to set
         * @return this builder
         **/
        public Builder isSystemModifiable(IsSystemModifiable isSystemModifiable) {
            this.isSystemModifiable = isSystemModifiable;
            this.__explicitlySet__.add("isSystemModifiable");
            return this;
        }
        /**
         * Indicates whether the parameter can be modified on a per-PDB basis ({@code TRUE}) or not ({@code FALSE}). In a non-CDB, the value of this property is {@code null}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPdbModifiable")
        private Boolean isPdbModifiable;

        /**
         * Indicates whether the parameter can be modified on a per-PDB basis ({@code TRUE}) or not ({@code FALSE}). In a non-CDB, the value of this property is {@code null}.
         *
         * @param isPdbModifiable the value to set
         * @return this builder
         **/
        public Builder isPdbModifiable(Boolean isPdbModifiable) {
            this.isPdbModifiable = isPdbModifiable;
            this.__explicitlySet__.add("isPdbModifiable");
            return this;
        }
        /**
         * For parameters that can be changed with {@code ALTER SYSTEM}, indicates whether the value of the parameter can be different for every instance ({@code TRUE}) or whether the parameter must have the same value for all Real Application Clusters instances ({@code FALSE}). For other parameters, this is always {@code FALSE}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isInstanceModifiable")
        private Boolean isInstanceModifiable;

        /**
         * For parameters that can be changed with {@code ALTER SYSTEM}, indicates whether the value of the parameter can be different for every instance ({@code TRUE}) or whether the parameter must have the same value for all Real Application Clusters instances ({@code FALSE}). For other parameters, this is always {@code FALSE}.
         *
         * @param isInstanceModifiable the value to set
         * @return this builder
         **/
        public Builder isInstanceModifiable(Boolean isInstanceModifiable) {
            this.isInstanceModifiable = isInstanceModifiable;
            this.__explicitlySet__.add("isInstanceModifiable");
            return this;
        }
        /**
         * Indicates how the parameter was modified. If an {@code ALTER SYSTEM} was performed, the value will be {@code MODIFIED}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isModified")
        private IsModified isModified;

        /**
         * Indicates how the parameter was modified. If an {@code ALTER SYSTEM} was performed, the value will be {@code MODIFIED}.
         *
         * @param isModified the value to set
         * @return this builder
         **/
        public Builder isModified(IsModified isModified) {
            this.isModified = isModified;
            this.__explicitlySet__.add("isModified");
            return this;
        }
        /**
         * Indicates whether Oracle adjusted the input value to a more suitable value.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAdjusted")
        private Boolean isAdjusted;

        /**
         * Indicates whether Oracle adjusted the input value to a more suitable value.
         * @param isAdjusted the value to set
         * @return this builder
         **/
        public Builder isAdjusted(Boolean isAdjusted) {
            this.isAdjusted = isAdjusted;
            this.__explicitlySet__.add("isAdjusted");
            return this;
        }
        /**
         * Indicates whether the parameter has been deprecated ({@code TRUE}) or not ({@code FALSE}).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDeprecated")
        private Boolean isDeprecated;

        /**
         * Indicates whether the parameter has been deprecated ({@code TRUE}) or not ({@code FALSE}).
         * @param isDeprecated the value to set
         * @return this builder
         **/
        public Builder isDeprecated(Boolean isDeprecated) {
            this.isDeprecated = isDeprecated;
            this.__explicitlySet__.add("isDeprecated");
            return this;
        }
        /**
         * Indicates whether the parameter is a basic parameter ({@code TRUE}) or not ({@code FALSE}).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isBasic")
        private Boolean isBasic;

        /**
         * Indicates whether the parameter is a basic parameter ({@code TRUE}) or not ({@code FALSE}).
         * @param isBasic the value to set
         * @return this builder
         **/
        public Builder isBasic(Boolean isBasic) {
            this.isBasic = isBasic;
            this.__explicitlySet__.add("isBasic");
            return this;
        }
        /**
         * The description of the parameter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the parameter.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The position (ordinal number) of the parameter value. Useful only for parameters whose values are lists of strings.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ordinal")
        private java.math.BigDecimal ordinal;

        /**
         * The position (ordinal number) of the parameter value. Useful only for parameters whose values are lists of strings.
         *
         * @param ordinal the value to set
         * @return this builder
         **/
        public Builder ordinal(java.math.BigDecimal ordinal) {
            this.ordinal = ordinal;
            this.__explicitlySet__.add("ordinal");
            return this;
        }
        /**
         * The comments associated with the most recent update.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("updateComment")
        private String updateComment;

        /**
         * The comments associated with the most recent update.
         * @param updateComment the value to set
         * @return this builder
         **/
        public Builder updateComment(String updateComment) {
            this.updateComment = updateComment;
            this.__explicitlySet__.add("updateComment");
            return this;
        }
        /**
         * The ID of the database container to which the data pertains.
         * Possible values include:
         * - {@code 0}: This value is used for data that pertain to the entire CDB. This value is also used for data in non-CDBs.
         * - {@code 1}: This value is used for data that pertain to only the root container.
         * - {@code n}: Where n is the applicable container ID for the data.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("containerId")
        private java.math.BigDecimal containerId;

        /**
         * The ID of the database container to which the data pertains.
         * Possible values include:
         * - {@code 0}: This value is used for data that pertain to the entire CDB. This value is also used for data in non-CDBs.
         * - {@code 1}: This value is used for data that pertain to only the root container.
         * - {@code n}: Where n is the applicable container ID for the data.
         *
         * @param containerId the value to set
         * @return this builder
         **/
        public Builder containerId(java.math.BigDecimal containerId) {
            this.containerId = containerId;
            this.__explicitlySet__.add("containerId");
            return this;
        }
        /**
         * The parameter category.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("category")
        private String category;

        /**
         * The parameter category.
         * @param category the value to set
         * @return this builder
         **/
        public Builder category(String category) {
            this.category = category;
            this.__explicitlySet__.add("category");
            return this;
        }
        /**
         * Applicable in case of Oracle Real Application Clusters (Oracle RAC) databases.
         * A {@code UNIQUE} parameter is one which is unique to each Oracle Real Application
         * Clusters (Oracle RAC) instance. For example, the parameter {@code INSTANCE_NUMBER}
         * must have different values in each instance. An {@code IDENTICAL} parameter must
         * have the same value for every instance. For example, the parameter
         * {@code DB_BLOCK_SIZE} must have the same value in all instances.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("constraint")
        private Constraint constraint;

        /**
         * Applicable in case of Oracle Real Application Clusters (Oracle RAC) databases.
         * A {@code UNIQUE} parameter is one which is unique to each Oracle Real Application
         * Clusters (Oracle RAC) instance. For example, the parameter {@code INSTANCE_NUMBER}
         * must have different values in each instance. An {@code IDENTICAL} parameter must
         * have the same value for every instance. For example, the parameter
         * {@code DB_BLOCK_SIZE} must have the same value in all instances.
         *
         * @param constraint the value to set
         * @return this builder
         **/
        public Builder constraint(Constraint constraint) {
            this.constraint = constraint;
            this.__explicitlySet__.add("constraint");
            return this;
        }
        /**
         * The database instance SID for which the parameter is defined.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sid")
        private String sid;

        /**
         * The database instance SID for which the parameter is defined.
         * @param sid the value to set
         * @return this builder
         **/
        public Builder sid(String sid) {
            this.sid = sid;
            this.__explicitlySet__.add("sid");
            return this;
        }
        /**
         * Indicates whether the parameter was specified in the server parameter file ({@code TRUE}) or not ({@code FALSE}). Applicable only when the parameter source is {@code SPFILE}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSpecified")
        private Boolean isSpecified;

        /**
         * Indicates whether the parameter was specified in the server parameter file ({@code TRUE}) or not ({@code FALSE}). Applicable only when the parameter source is {@code SPFILE}.
         *
         * @param isSpecified the value to set
         * @return this builder
         **/
        public Builder isSpecified(Boolean isSpecified) {
            this.isSpecified = isSpecified;
            this.__explicitlySet__.add("isSpecified");
            return this;
        }
        /**
         * A list of allowed values for this parameter.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
        private java.util.List<AllowedParameterValue> allowedValues;

        /**
         * A list of allowed values for this parameter.
         * @param allowedValues the value to set
         * @return this builder
         **/
        public Builder allowedValues(java.util.List<AllowedParameterValue> allowedValues) {
            this.allowedValues = allowedValues;
            this.__explicitlySet__.add("allowedValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseParameterSummary build() {
            DatabaseParameterSummary model =
                    new DatabaseParameterSummary(
                            this.name,
                            this.type,
                            this.value,
                            this.displayValue,
                            this.number,
                            this.isDefault,
                            this.isSessionModifiable,
                            this.isSystemModifiable,
                            this.isPdbModifiable,
                            this.isInstanceModifiable,
                            this.isModified,
                            this.isAdjusted,
                            this.isDeprecated,
                            this.isBasic,
                            this.description,
                            this.ordinal,
                            this.updateComment,
                            this.containerId,
                            this.category,
                            this.constraint,
                            this.sid,
                            this.isSpecified,
                            this.allowedValues);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseParameterSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("displayValue")) {
                this.displayValue(model.getDisplayValue());
            }
            if (model.wasPropertyExplicitlySet("number")) {
                this.number(model.getNumber());
            }
            if (model.wasPropertyExplicitlySet("isDefault")) {
                this.isDefault(model.getIsDefault());
            }
            if (model.wasPropertyExplicitlySet("isSessionModifiable")) {
                this.isSessionModifiable(model.getIsSessionModifiable());
            }
            if (model.wasPropertyExplicitlySet("isSystemModifiable")) {
                this.isSystemModifiable(model.getIsSystemModifiable());
            }
            if (model.wasPropertyExplicitlySet("isPdbModifiable")) {
                this.isPdbModifiable(model.getIsPdbModifiable());
            }
            if (model.wasPropertyExplicitlySet("isInstanceModifiable")) {
                this.isInstanceModifiable(model.getIsInstanceModifiable());
            }
            if (model.wasPropertyExplicitlySet("isModified")) {
                this.isModified(model.getIsModified());
            }
            if (model.wasPropertyExplicitlySet("isAdjusted")) {
                this.isAdjusted(model.getIsAdjusted());
            }
            if (model.wasPropertyExplicitlySet("isDeprecated")) {
                this.isDeprecated(model.getIsDeprecated());
            }
            if (model.wasPropertyExplicitlySet("isBasic")) {
                this.isBasic(model.getIsBasic());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("ordinal")) {
                this.ordinal(model.getOrdinal());
            }
            if (model.wasPropertyExplicitlySet("updateComment")) {
                this.updateComment(model.getUpdateComment());
            }
            if (model.wasPropertyExplicitlySet("containerId")) {
                this.containerId(model.getContainerId());
            }
            if (model.wasPropertyExplicitlySet("category")) {
                this.category(model.getCategory());
            }
            if (model.wasPropertyExplicitlySet("constraint")) {
                this.constraint(model.getConstraint());
            }
            if (model.wasPropertyExplicitlySet("sid")) {
                this.sid(model.getSid());
            }
            if (model.wasPropertyExplicitlySet("isSpecified")) {
                this.isSpecified(model.getIsSpecified());
            }
            if (model.wasPropertyExplicitlySet("allowedValues")) {
                this.allowedValues(model.getAllowedValues());
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
     * The parameter name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The parameter name.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The parameter type.
     **/
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
     * The parameter type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The parameter type.
     * @return the value
     **/
    public Type getType() {
        return type;
    }

    /**
     * The parameter value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The parameter value.
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * The parameter value in a user-friendly format. For example, if the {@code value} property shows the value 262144 for a big integer parameter, then the {@code displayValue} property will show the value 256K.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayValue")
    private final String displayValue;

    /**
     * The parameter value in a user-friendly format. For example, if the {@code value} property shows the value 262144 for a big integer parameter, then the {@code displayValue} property will show the value 256K.
     *
     * @return the value
     **/
    public String getDisplayValue() {
        return displayValue;
    }

    /**
     * The parameter number.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("number")
    private final java.math.BigDecimal number;

    /**
     * The parameter number.
     * @return the value
     **/
    public java.math.BigDecimal getNumber() {
        return number;
    }

    /**
     * Indicates whether the parameter is set to the default value ({@code TRUE}) or the parameter value was specified in the parameter file ({@code FALSE}).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDefault")
    private final Boolean isDefault;

    /**
     * Indicates whether the parameter is set to the default value ({@code TRUE}) or the parameter value was specified in the parameter file ({@code FALSE}).
     *
     * @return the value
     **/
    public Boolean getIsDefault() {
        return isDefault;
    }

    /**
     * Indicates whether the parameter can be changed with {@code ALTER SESSION} ({@code TRUE}) or not ({@code FALSE})
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSessionModifiable")
    private final Boolean isSessionModifiable;

    /**
     * Indicates whether the parameter can be changed with {@code ALTER SESSION} ({@code TRUE}) or not ({@code FALSE})
     *
     * @return the value
     **/
    public Boolean getIsSessionModifiable() {
        return isSessionModifiable;
    }

    /**
     * Indicates whether the parameter can be changed with {@code ALTER SYSTEM} and when the change takes effect:
     * - IMMEDIATE: Parameter can be changed with {@code ALTER SYSTEM} regardless of the type of parameter file used to start the instance. The change takes effect immediately.
     * - DEFERRED: Parameter can be changed with {@code ALTER SYSTEM} regardless of the type of parameter file used to start the instance. The change takes effect in subsequent sessions.
     * - FALSE: Parameter cannot be changed with {@code ALTER SYSTEM} unless a server parameter file was used to start the instance. The change takes effect in subsequent instances.
     *
     **/
    public enum IsSystemModifiable {
        Immediate("IMMEDIATE"),
        Deferred("DEFERRED"),
        False("FALSE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IsSystemModifiable.class);

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
     * Indicates whether the parameter can be changed with {@code ALTER SYSTEM} and when the change takes effect:
     * - IMMEDIATE: Parameter can be changed with {@code ALTER SYSTEM} regardless of the type of parameter file used to start the instance. The change takes effect immediately.
     * - DEFERRED: Parameter can be changed with {@code ALTER SYSTEM} regardless of the type of parameter file used to start the instance. The change takes effect in subsequent sessions.
     * - FALSE: Parameter cannot be changed with {@code ALTER SYSTEM} unless a server parameter file was used to start the instance. The change takes effect in subsequent instances.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSystemModifiable")
    private final IsSystemModifiable isSystemModifiable;

    /**
     * Indicates whether the parameter can be changed with {@code ALTER SYSTEM} and when the change takes effect:
     * - IMMEDIATE: Parameter can be changed with {@code ALTER SYSTEM} regardless of the type of parameter file used to start the instance. The change takes effect immediately.
     * - DEFERRED: Parameter can be changed with {@code ALTER SYSTEM} regardless of the type of parameter file used to start the instance. The change takes effect in subsequent sessions.
     * - FALSE: Parameter cannot be changed with {@code ALTER SYSTEM} unless a server parameter file was used to start the instance. The change takes effect in subsequent instances.
     *
     * @return the value
     **/
    public IsSystemModifiable getIsSystemModifiable() {
        return isSystemModifiable;
    }

    /**
     * Indicates whether the parameter can be modified on a per-PDB basis ({@code TRUE}) or not ({@code FALSE}). In a non-CDB, the value of this property is {@code null}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPdbModifiable")
    private final Boolean isPdbModifiable;

    /**
     * Indicates whether the parameter can be modified on a per-PDB basis ({@code TRUE}) or not ({@code FALSE}). In a non-CDB, the value of this property is {@code null}.
     *
     * @return the value
     **/
    public Boolean getIsPdbModifiable() {
        return isPdbModifiable;
    }

    /**
     * For parameters that can be changed with {@code ALTER SYSTEM}, indicates whether the value of the parameter can be different for every instance ({@code TRUE}) or whether the parameter must have the same value for all Real Application Clusters instances ({@code FALSE}). For other parameters, this is always {@code FALSE}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isInstanceModifiable")
    private final Boolean isInstanceModifiable;

    /**
     * For parameters that can be changed with {@code ALTER SYSTEM}, indicates whether the value of the parameter can be different for every instance ({@code TRUE}) or whether the parameter must have the same value for all Real Application Clusters instances ({@code FALSE}). For other parameters, this is always {@code FALSE}.
     *
     * @return the value
     **/
    public Boolean getIsInstanceModifiable() {
        return isInstanceModifiable;
    }

    /**
     * Indicates how the parameter was modified. If an {@code ALTER SYSTEM} was performed, the value will be {@code MODIFIED}.
     *
     **/
    public enum IsModified {
        Modified("MODIFIED"),
        False("FALSE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(IsModified.class);

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
     * Indicates how the parameter was modified. If an {@code ALTER SYSTEM} was performed, the value will be {@code MODIFIED}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isModified")
    private final IsModified isModified;

    /**
     * Indicates how the parameter was modified. If an {@code ALTER SYSTEM} was performed, the value will be {@code MODIFIED}.
     *
     * @return the value
     **/
    public IsModified getIsModified() {
        return isModified;
    }

    /**
     * Indicates whether Oracle adjusted the input value to a more suitable value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAdjusted")
    private final Boolean isAdjusted;

    /**
     * Indicates whether Oracle adjusted the input value to a more suitable value.
     * @return the value
     **/
    public Boolean getIsAdjusted() {
        return isAdjusted;
    }

    /**
     * Indicates whether the parameter has been deprecated ({@code TRUE}) or not ({@code FALSE}).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDeprecated")
    private final Boolean isDeprecated;

    /**
     * Indicates whether the parameter has been deprecated ({@code TRUE}) or not ({@code FALSE}).
     * @return the value
     **/
    public Boolean getIsDeprecated() {
        return isDeprecated;
    }

    /**
     * Indicates whether the parameter is a basic parameter ({@code TRUE}) or not ({@code FALSE}).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isBasic")
    private final Boolean isBasic;

    /**
     * Indicates whether the parameter is a basic parameter ({@code TRUE}) or not ({@code FALSE}).
     * @return the value
     **/
    public Boolean getIsBasic() {
        return isBasic;
    }

    /**
     * The description of the parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the parameter.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The position (ordinal number) of the parameter value. Useful only for parameters whose values are lists of strings.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ordinal")
    private final java.math.BigDecimal ordinal;

    /**
     * The position (ordinal number) of the parameter value. Useful only for parameters whose values are lists of strings.
     *
     * @return the value
     **/
    public java.math.BigDecimal getOrdinal() {
        return ordinal;
    }

    /**
     * The comments associated with the most recent update.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("updateComment")
    private final String updateComment;

    /**
     * The comments associated with the most recent update.
     * @return the value
     **/
    public String getUpdateComment() {
        return updateComment;
    }

    /**
     * The ID of the database container to which the data pertains.
     * Possible values include:
     * - {@code 0}: This value is used for data that pertain to the entire CDB. This value is also used for data in non-CDBs.
     * - {@code 1}: This value is used for data that pertain to only the root container.
     * - {@code n}: Where n is the applicable container ID for the data.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("containerId")
    private final java.math.BigDecimal containerId;

    /**
     * The ID of the database container to which the data pertains.
     * Possible values include:
     * - {@code 0}: This value is used for data that pertain to the entire CDB. This value is also used for data in non-CDBs.
     * - {@code 1}: This value is used for data that pertain to only the root container.
     * - {@code n}: Where n is the applicable container ID for the data.
     *
     * @return the value
     **/
    public java.math.BigDecimal getContainerId() {
        return containerId;
    }

    /**
     * The parameter category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    private final String category;

    /**
     * The parameter category.
     * @return the value
     **/
    public String getCategory() {
        return category;
    }

    /**
     * Applicable in case of Oracle Real Application Clusters (Oracle RAC) databases.
     * A {@code UNIQUE} parameter is one which is unique to each Oracle Real Application
     * Clusters (Oracle RAC) instance. For example, the parameter {@code INSTANCE_NUMBER}
     * must have different values in each instance. An {@code IDENTICAL} parameter must
     * have the same value for every instance. For example, the parameter
     * {@code DB_BLOCK_SIZE} must have the same value in all instances.
     *
     **/
    public enum Constraint {
        Unique("UNIQUE"),
        Identical("IDENTICAL"),
        None("NONE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Constraint.class);

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
     * A {@code UNIQUE} parameter is one which is unique to each Oracle Real Application
     * Clusters (Oracle RAC) instance. For example, the parameter {@code INSTANCE_NUMBER}
     * must have different values in each instance. An {@code IDENTICAL} parameter must
     * have the same value for every instance. For example, the parameter
     * {@code DB_BLOCK_SIZE} must have the same value in all instances.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("constraint")
    private final Constraint constraint;

    /**
     * Applicable in case of Oracle Real Application Clusters (Oracle RAC) databases.
     * A {@code UNIQUE} parameter is one which is unique to each Oracle Real Application
     * Clusters (Oracle RAC) instance. For example, the parameter {@code INSTANCE_NUMBER}
     * must have different values in each instance. An {@code IDENTICAL} parameter must
     * have the same value for every instance. For example, the parameter
     * {@code DB_BLOCK_SIZE} must have the same value in all instances.
     *
     * @return the value
     **/
    public Constraint getConstraint() {
        return constraint;
    }

    /**
     * The database instance SID for which the parameter is defined.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sid")
    private final String sid;

    /**
     * The database instance SID for which the parameter is defined.
     * @return the value
     **/
    public String getSid() {
        return sid;
    }

    /**
     * Indicates whether the parameter was specified in the server parameter file ({@code TRUE}) or not ({@code FALSE}). Applicable only when the parameter source is {@code SPFILE}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSpecified")
    private final Boolean isSpecified;

    /**
     * Indicates whether the parameter was specified in the server parameter file ({@code TRUE}) or not ({@code FALSE}). Applicable only when the parameter source is {@code SPFILE}.
     *
     * @return the value
     **/
    public Boolean getIsSpecified() {
        return isSpecified;
    }

    /**
     * A list of allowed values for this parameter.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedValues")
    private final java.util.List<AllowedParameterValue> allowedValues;

    /**
     * A list of allowed values for this parameter.
     * @return the value
     **/
    public java.util.List<AllowedParameterValue> getAllowedValues() {
        return allowedValues;
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
        sb.append("DatabaseParameterSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", displayValue=").append(String.valueOf(this.displayValue));
        sb.append(", number=").append(String.valueOf(this.number));
        sb.append(", isDefault=").append(String.valueOf(this.isDefault));
        sb.append(", isSessionModifiable=").append(String.valueOf(this.isSessionModifiable));
        sb.append(", isSystemModifiable=").append(String.valueOf(this.isSystemModifiable));
        sb.append(", isPdbModifiable=").append(String.valueOf(this.isPdbModifiable));
        sb.append(", isInstanceModifiable=").append(String.valueOf(this.isInstanceModifiable));
        sb.append(", isModified=").append(String.valueOf(this.isModified));
        sb.append(", isAdjusted=").append(String.valueOf(this.isAdjusted));
        sb.append(", isDeprecated=").append(String.valueOf(this.isDeprecated));
        sb.append(", isBasic=").append(String.valueOf(this.isBasic));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", ordinal=").append(String.valueOf(this.ordinal));
        sb.append(", updateComment=").append(String.valueOf(this.updateComment));
        sb.append(", containerId=").append(String.valueOf(this.containerId));
        sb.append(", category=").append(String.valueOf(this.category));
        sb.append(", constraint=").append(String.valueOf(this.constraint));
        sb.append(", sid=").append(String.valueOf(this.sid));
        sb.append(", isSpecified=").append(String.valueOf(this.isSpecified));
        sb.append(", allowedValues=").append(String.valueOf(this.allowedValues));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseParameterSummary)) {
            return false;
        }

        DatabaseParameterSummary other = (DatabaseParameterSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.displayValue, other.displayValue)
                && java.util.Objects.equals(this.number, other.number)
                && java.util.Objects.equals(this.isDefault, other.isDefault)
                && java.util.Objects.equals(this.isSessionModifiable, other.isSessionModifiable)
                && java.util.Objects.equals(this.isSystemModifiable, other.isSystemModifiable)
                && java.util.Objects.equals(this.isPdbModifiable, other.isPdbModifiable)
                && java.util.Objects.equals(this.isInstanceModifiable, other.isInstanceModifiable)
                && java.util.Objects.equals(this.isModified, other.isModified)
                && java.util.Objects.equals(this.isAdjusted, other.isAdjusted)
                && java.util.Objects.equals(this.isDeprecated, other.isDeprecated)
                && java.util.Objects.equals(this.isBasic, other.isBasic)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.ordinal, other.ordinal)
                && java.util.Objects.equals(this.updateComment, other.updateComment)
                && java.util.Objects.equals(this.containerId, other.containerId)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.constraint, other.constraint)
                && java.util.Objects.equals(this.sid, other.sid)
                && java.util.Objects.equals(this.isSpecified, other.isSpecified)
                && java.util.Objects.equals(this.allowedValues, other.allowedValues)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.displayValue == null ? 43 : this.displayValue.hashCode());
        result = (result * PRIME) + (this.number == null ? 43 : this.number.hashCode());
        result = (result * PRIME) + (this.isDefault == null ? 43 : this.isDefault.hashCode());
        result =
                (result * PRIME)
                        + (this.isSessionModifiable == null
                                ? 43
                                : this.isSessionModifiable.hashCode());
        result =
                (result * PRIME)
                        + (this.isSystemModifiable == null
                                ? 43
                                : this.isSystemModifiable.hashCode());
        result =
                (result * PRIME)
                        + (this.isPdbModifiable == null ? 43 : this.isPdbModifiable.hashCode());
        result =
                (result * PRIME)
                        + (this.isInstanceModifiable == null
                                ? 43
                                : this.isInstanceModifiable.hashCode());
        result = (result * PRIME) + (this.isModified == null ? 43 : this.isModified.hashCode());
        result = (result * PRIME) + (this.isAdjusted == null ? 43 : this.isAdjusted.hashCode());
        result = (result * PRIME) + (this.isDeprecated == null ? 43 : this.isDeprecated.hashCode());
        result = (result * PRIME) + (this.isBasic == null ? 43 : this.isBasic.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.ordinal == null ? 43 : this.ordinal.hashCode());
        result =
                (result * PRIME)
                        + (this.updateComment == null ? 43 : this.updateComment.hashCode());
        result = (result * PRIME) + (this.containerId == null ? 43 : this.containerId.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.constraint == null ? 43 : this.constraint.hashCode());
        result = (result * PRIME) + (this.sid == null ? 43 : this.sid.hashCode());
        result = (result * PRIME) + (this.isSpecified == null ? 43 : this.isSpecified.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedValues == null ? 43 : this.allowedValues.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
