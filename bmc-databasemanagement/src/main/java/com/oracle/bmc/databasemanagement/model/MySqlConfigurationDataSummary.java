/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The configuration variables for a MySQL Database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MySqlConfigurationDataSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MySqlConfigurationDataSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "value",
        "source",
        "minValue",
        "maxValue",
        "type",
        "defaultValue",
        "timeSet",
        "hostSet",
        "userSet",
        "isDynamic",
        "isInit",
        "isConfigurable",
        "path",
        "description",
        "possibleValues",
        "supportedVersions"
    })
    public MySqlConfigurationDataSummary(
            String name,
            String value,
            Source source,
            java.math.BigDecimal minValue,
            java.math.BigDecimal maxValue,
            String type,
            String defaultValue,
            java.util.Date timeSet,
            String hostSet,
            String userSet,
            Boolean isDynamic,
            Boolean isInit,
            Boolean isConfigurable,
            String path,
            String description,
            String possibleValues,
            String supportedVersions) {
        super();
        this.name = name;
        this.value = value;
        this.source = source;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.type = type;
        this.defaultValue = defaultValue;
        this.timeSet = timeSet;
        this.hostSet = hostSet;
        this.userSet = userSet;
        this.isDynamic = isDynamic;
        this.isInit = isInit;
        this.isConfigurable = isConfigurable;
        this.path = path;
        this.description = description;
        this.possibleValues = possibleValues;
        this.supportedVersions = supportedVersions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the configuration variable */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the configuration variable
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The value of the variable. */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The value of the variable.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /** The source from which the variable was most recently set. */
        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private Source source;

        /**
         * The source from which the variable was most recently set.
         *
         * @param source the value to set
         * @return this builder
         */
        public Builder source(Source source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }
        /** The minimum value of the variable. */
        @com.fasterxml.jackson.annotation.JsonProperty("minValue")
        private java.math.BigDecimal minValue;

        /**
         * The minimum value of the variable.
         *
         * @param minValue the value to set
         * @return this builder
         */
        public Builder minValue(java.math.BigDecimal minValue) {
            this.minValue = minValue;
            this.__explicitlySet__.add("minValue");
            return this;
        }
        /** The maximum value of the variable. */
        @com.fasterxml.jackson.annotation.JsonProperty("maxValue")
        private java.math.BigDecimal maxValue;

        /**
         * The maximum value of the variable.
         *
         * @param maxValue the value to set
         * @return this builder
         */
        public Builder maxValue(java.math.BigDecimal maxValue) {
            this.maxValue = maxValue;
            this.__explicitlySet__.add("maxValue");
            return this;
        }
        /** The type of variable. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * The type of variable.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** The default value of the variable. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private String defaultValue;

        /**
         * The default value of the variable.
         *
         * @param defaultValue the value to set
         * @return this builder
         */
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }
        /** The time when the value of the variable was set. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeSet")
        private java.util.Date timeSet;

        /**
         * The time when the value of the variable was set.
         *
         * @param timeSet the value to set
         * @return this builder
         */
        public Builder timeSet(java.util.Date timeSet) {
            this.timeSet = timeSet;
            this.__explicitlySet__.add("timeSet");
            return this;
        }
        /**
         * The host from where the value of the variable was set. This is empty for a MySQL Database
         * System.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("hostSet")
        private String hostSet;

        /**
         * The host from where the value of the variable was set. This is empty for a MySQL Database
         * System.
         *
         * @param hostSet the value to set
         * @return this builder
         */
        public Builder hostSet(String hostSet) {
            this.hostSet = hostSet;
            this.__explicitlySet__.add("hostSet");
            return this;
        }
        /**
         * The user who sets the value of the variable. This is empty for a MySQL Database System.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userSet")
        private String userSet;

        /**
         * The user who sets the value of the variable. This is empty for a MySQL Database System.
         *
         * @param userSet the value to set
         * @return this builder
         */
        public Builder userSet(String userSet) {
            this.userSet = userSet;
            this.__explicitlySet__.add("userSet");
            return this;
        }
        /** Indicates whether the variable can be set dynamically or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDynamic")
        private Boolean isDynamic;

        /**
         * Indicates whether the variable can be set dynamically or not.
         *
         * @param isDynamic the value to set
         * @return this builder
         */
        public Builder isDynamic(Boolean isDynamic) {
            this.isDynamic = isDynamic;
            this.__explicitlySet__.add("isDynamic");
            return this;
        }
        /** Indicates whether the variable is set at server startup. */
        @com.fasterxml.jackson.annotation.JsonProperty("isInit")
        private Boolean isInit;

        /**
         * Indicates whether the variable is set at server startup.
         *
         * @param isInit the value to set
         * @return this builder
         */
        public Builder isInit(Boolean isInit) {
            this.isInit = isInit;
            this.__explicitlySet__.add("isInit");
            return this;
        }
        /** Indicates whether the variable is configurable. */
        @com.fasterxml.jackson.annotation.JsonProperty("isConfigurable")
        private Boolean isConfigurable;

        /**
         * Indicates whether the variable is configurable.
         *
         * @param isConfigurable the value to set
         * @return this builder
         */
        public Builder isConfigurable(Boolean isConfigurable) {
            this.isConfigurable = isConfigurable;
            this.__explicitlySet__.add("isConfigurable");
            return this;
        }
        /**
         * The path name of the option file (VARIABLE_PATH), if the variable was set in an option
         * file. If the variable was not set in an
         */
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * The path name of the option file (VARIABLE_PATH), if the variable was set in an option
         * file. If the variable was not set in an
         *
         * @param path the value to set
         * @return this builder
         */
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /** The description of the variable. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the variable.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The comma-separated list of possible values for the variable in value:valueDescription
         * format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("possibleValues")
        private String possibleValues;

        /**
         * The comma-separated list of possible values for the variable in value:valueDescription
         * format.
         *
         * @param possibleValues the value to set
         * @return this builder
         */
        public Builder possibleValues(String possibleValues) {
            this.possibleValues = possibleValues;
            this.__explicitlySet__.add("possibleValues");
            return this;
        }
        /** The comma-separated list of MySQL versions that support the variable. */
        @com.fasterxml.jackson.annotation.JsonProperty("supportedVersions")
        private String supportedVersions;

        /**
         * The comma-separated list of MySQL versions that support the variable.
         *
         * @param supportedVersions the value to set
         * @return this builder
         */
        public Builder supportedVersions(String supportedVersions) {
            this.supportedVersions = supportedVersions;
            this.__explicitlySet__.add("supportedVersions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MySqlConfigurationDataSummary build() {
            MySqlConfigurationDataSummary model =
                    new MySqlConfigurationDataSummary(
                            this.name,
                            this.value,
                            this.source,
                            this.minValue,
                            this.maxValue,
                            this.type,
                            this.defaultValue,
                            this.timeSet,
                            this.hostSet,
                            this.userSet,
                            this.isDynamic,
                            this.isInit,
                            this.isConfigurable,
                            this.path,
                            this.description,
                            this.possibleValues,
                            this.supportedVersions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MySqlConfigurationDataSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("source")) {
                this.source(model.getSource());
            }
            if (model.wasPropertyExplicitlySet("minValue")) {
                this.minValue(model.getMinValue());
            }
            if (model.wasPropertyExplicitlySet("maxValue")) {
                this.maxValue(model.getMaxValue());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("defaultValue")) {
                this.defaultValue(model.getDefaultValue());
            }
            if (model.wasPropertyExplicitlySet("timeSet")) {
                this.timeSet(model.getTimeSet());
            }
            if (model.wasPropertyExplicitlySet("hostSet")) {
                this.hostSet(model.getHostSet());
            }
            if (model.wasPropertyExplicitlySet("userSet")) {
                this.userSet(model.getUserSet());
            }
            if (model.wasPropertyExplicitlySet("isDynamic")) {
                this.isDynamic(model.getIsDynamic());
            }
            if (model.wasPropertyExplicitlySet("isInit")) {
                this.isInit(model.getIsInit());
            }
            if (model.wasPropertyExplicitlySet("isConfigurable")) {
                this.isConfigurable(model.getIsConfigurable());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("possibleValues")) {
                this.possibleValues(model.getPossibleValues());
            }
            if (model.wasPropertyExplicitlySet("supportedVersions")) {
                this.supportedVersions(model.getSupportedVersions());
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

    /** The name of the configuration variable */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the configuration variable
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The value of the variable. */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The value of the variable.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /** The source from which the variable was most recently set. */
    public enum Source implements com.oracle.bmc.http.internal.BmcEnum {
        Compiled("COMPILED"),
        Global("GLOBAL"),
        Server("SERVER"),
        Explicit("EXPLICIT"),
        Extra("EXTRA"),
        User("USER"),
        Login("LOGIN"),
        CommandLine("COMMAND_LINE"),
        Persisted("PERSISTED"),
        Dynamic("DYNAMIC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Source.class);

        private final String value;
        private static java.util.Map<String, Source> map;

        static {
            map = new java.util.HashMap<>();
            for (Source v : Source.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Source(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Source create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Source', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The source from which the variable was most recently set. */
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    private final Source source;

    /**
     * The source from which the variable was most recently set.
     *
     * @return the value
     */
    public Source getSource() {
        return source;
    }

    /** The minimum value of the variable. */
    @com.fasterxml.jackson.annotation.JsonProperty("minValue")
    private final java.math.BigDecimal minValue;

    /**
     * The minimum value of the variable.
     *
     * @return the value
     */
    public java.math.BigDecimal getMinValue() {
        return minValue;
    }

    /** The maximum value of the variable. */
    @com.fasterxml.jackson.annotation.JsonProperty("maxValue")
    private final java.math.BigDecimal maxValue;

    /**
     * The maximum value of the variable.
     *
     * @return the value
     */
    public java.math.BigDecimal getMaxValue() {
        return maxValue;
    }

    /** The type of variable. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * The type of variable.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /** The default value of the variable. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final String defaultValue;

    /**
     * The default value of the variable.
     *
     * @return the value
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /** The time when the value of the variable was set. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeSet")
    private final java.util.Date timeSet;

    /**
     * The time when the value of the variable was set.
     *
     * @return the value
     */
    public java.util.Date getTimeSet() {
        return timeSet;
    }

    /**
     * The host from where the value of the variable was set. This is empty for a MySQL Database
     * System.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("hostSet")
    private final String hostSet;

    /**
     * The host from where the value of the variable was set. This is empty for a MySQL Database
     * System.
     *
     * @return the value
     */
    public String getHostSet() {
        return hostSet;
    }

    /** The user who sets the value of the variable. This is empty for a MySQL Database System. */
    @com.fasterxml.jackson.annotation.JsonProperty("userSet")
    private final String userSet;

    /**
     * The user who sets the value of the variable. This is empty for a MySQL Database System.
     *
     * @return the value
     */
    public String getUserSet() {
        return userSet;
    }

    /** Indicates whether the variable can be set dynamically or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDynamic")
    private final Boolean isDynamic;

    /**
     * Indicates whether the variable can be set dynamically or not.
     *
     * @return the value
     */
    public Boolean getIsDynamic() {
        return isDynamic;
    }

    /** Indicates whether the variable is set at server startup. */
    @com.fasterxml.jackson.annotation.JsonProperty("isInit")
    private final Boolean isInit;

    /**
     * Indicates whether the variable is set at server startup.
     *
     * @return the value
     */
    public Boolean getIsInit() {
        return isInit;
    }

    /** Indicates whether the variable is configurable. */
    @com.fasterxml.jackson.annotation.JsonProperty("isConfigurable")
    private final Boolean isConfigurable;

    /**
     * Indicates whether the variable is configurable.
     *
     * @return the value
     */
    public Boolean getIsConfigurable() {
        return isConfigurable;
    }

    /**
     * The path name of the option file (VARIABLE_PATH), if the variable was set in an option file.
     * If the variable was not set in an
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * The path name of the option file (VARIABLE_PATH), if the variable was set in an option file.
     * If the variable was not set in an
     *
     * @return the value
     */
    public String getPath() {
        return path;
    }

    /** The description of the variable. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the variable.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The comma-separated list of possible values for the variable in value:valueDescription
     * format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("possibleValues")
    private final String possibleValues;

    /**
     * The comma-separated list of possible values for the variable in value:valueDescription
     * format.
     *
     * @return the value
     */
    public String getPossibleValues() {
        return possibleValues;
    }

    /** The comma-separated list of MySQL versions that support the variable. */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedVersions")
    private final String supportedVersions;

    /**
     * The comma-separated list of MySQL versions that support the variable.
     *
     * @return the value
     */
    public String getSupportedVersions() {
        return supportedVersions;
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
        sb.append("MySqlConfigurationDataSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", source=").append(String.valueOf(this.source));
        sb.append(", minValue=").append(String.valueOf(this.minValue));
        sb.append(", maxValue=").append(String.valueOf(this.maxValue));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(", timeSet=").append(String.valueOf(this.timeSet));
        sb.append(", hostSet=").append(String.valueOf(this.hostSet));
        sb.append(", userSet=").append(String.valueOf(this.userSet));
        sb.append(", isDynamic=").append(String.valueOf(this.isDynamic));
        sb.append(", isInit=").append(String.valueOf(this.isInit));
        sb.append(", isConfigurable=").append(String.valueOf(this.isConfigurable));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", possibleValues=").append(String.valueOf(this.possibleValues));
        sb.append(", supportedVersions=").append(String.valueOf(this.supportedVersions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MySqlConfigurationDataSummary)) {
            return false;
        }

        MySqlConfigurationDataSummary other = (MySqlConfigurationDataSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.source, other.source)
                && java.util.Objects.equals(this.minValue, other.minValue)
                && java.util.Objects.equals(this.maxValue, other.maxValue)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.defaultValue, other.defaultValue)
                && java.util.Objects.equals(this.timeSet, other.timeSet)
                && java.util.Objects.equals(this.hostSet, other.hostSet)
                && java.util.Objects.equals(this.userSet, other.userSet)
                && java.util.Objects.equals(this.isDynamic, other.isDynamic)
                && java.util.Objects.equals(this.isInit, other.isInit)
                && java.util.Objects.equals(this.isConfigurable, other.isConfigurable)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.possibleValues, other.possibleValues)
                && java.util.Objects.equals(this.supportedVersions, other.supportedVersions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.source == null ? 43 : this.source.hashCode());
        result = (result * PRIME) + (this.minValue == null ? 43 : this.minValue.hashCode());
        result = (result * PRIME) + (this.maxValue == null ? 43 : this.maxValue.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        result = (result * PRIME) + (this.timeSet == null ? 43 : this.timeSet.hashCode());
        result = (result * PRIME) + (this.hostSet == null ? 43 : this.hostSet.hashCode());
        result = (result * PRIME) + (this.userSet == null ? 43 : this.userSet.hashCode());
        result = (result * PRIME) + (this.isDynamic == null ? 43 : this.isDynamic.hashCode());
        result = (result * PRIME) + (this.isInit == null ? 43 : this.isInit.hashCode());
        result =
                (result * PRIME)
                        + (this.isConfigurable == null ? 43 : this.isConfigurable.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.possibleValues == null ? 43 : this.possibleValues.hashCode());
        result =
                (result * PRIME)
                        + (this.supportedVersions == null ? 43 : this.supportedVersions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
