/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * Description of a database API gateway config setting to be provided as an advanced property.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DatabaseToolsDatabaseApiGatewayConfigAdvancedPropertySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseToolsDatabaseApiGatewayConfigAdvancedPropertySummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "displayName",
        "dataType",
        "configTypes",
        "categoryKey",
        "categoryDisplayName",
        "databaseToolsConnectionTypes",
        "documentationUrl",
        "description",
        "defaultValue",
        "minValue",
        "maxValue",
        "listOfValues",
        "hintText"
    })
    public DatabaseToolsDatabaseApiGatewayConfigAdvancedPropertySummary(
            String key,
            String displayName,
            DataType dataType,
            java.util.List<DatabaseApiGatewayConfigAdvancedPropertyConfigType> configTypes,
            String categoryKey,
            String categoryDisplayName,
            java.util.List<DatabaseToolsConnectionTypes> databaseToolsConnectionTypes,
            String documentationUrl,
            String description,
            String defaultValue,
            Integer minValue,
            Integer maxValue,
            java.util.List<String> listOfValues,
            String hintText) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.dataType = dataType;
        this.configTypes = configTypes;
        this.categoryKey = categoryKey;
        this.categoryDisplayName = categoryDisplayName;
        this.databaseToolsConnectionTypes = databaseToolsConnectionTypes;
        this.documentationUrl = documentationUrl;
        this.description = description;
        this.defaultValue = defaultValue;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.listOfValues = listOfValues;
        this.hintText = hintText;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A string that uniquely identifies a Database Tools database API gateway config global settings resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * A string that uniquely identifies a Database Tools database API gateway config global settings resource.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * A user-friendly name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The data type of a database API gateway config setting.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private DataType dataType;

        /**
         * The data type of a database API gateway config setting.
         * @param dataType the value to set
         * @return this builder
         **/
        public Builder dataType(DataType dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }
        /**
         * The config types that support this advanced property. The supported types are GLOBAL and POOL.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("configTypes")
        private java.util.List<DatabaseApiGatewayConfigAdvancedPropertyConfigType> configTypes;

        /**
         * The config types that support this advanced property. The supported types are GLOBAL and POOL.
         *
         * @param configTypes the value to set
         * @return this builder
         **/
        public Builder configTypes(
                java.util.List<DatabaseApiGatewayConfigAdvancedPropertyConfigType> configTypes) {
            this.configTypes = configTypes;
            this.__explicitlySet__.add("configTypes");
            return this;
        }
        /**
         * The category of the Database Tools database API gateway config global setting.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("categoryKey")
        private String categoryKey;

        /**
         * The category of the Database Tools database API gateway config global setting.
         * @param categoryKey the value to set
         * @return this builder
         **/
        public Builder categoryKey(String categoryKey) {
            this.categoryKey = categoryKey;
            this.__explicitlySet__.add("categoryKey");
            return this;
        }
        /**
         * A user-friendly name of a category.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("categoryDisplayName")
        private String categoryDisplayName;

        /**
         * A user-friendly name of a category.
         * @param categoryDisplayName the value to set
         * @return this builder
         **/
        public Builder categoryDisplayName(String categoryDisplayName) {
            this.categoryDisplayName = categoryDisplayName;
            this.__explicitlySet__.add("categoryDisplayName");
            return this;
        }
        /**
         * The type of database (as determined by a type of Database Tools connection) to which this setting applies.
         * The advancedProperty applies to all types of Database Tools connection when null. This is only applicable
         * when configTypes includes POOL.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("databaseToolsConnectionTypes")
        private java.util.List<DatabaseToolsConnectionTypes> databaseToolsConnectionTypes;

        /**
         * The type of database (as determined by a type of Database Tools connection) to which this setting applies.
         * The advancedProperty applies to all types of Database Tools connection when null. This is only applicable
         * when configTypes includes POOL.
         *
         * @param databaseToolsConnectionTypes the value to set
         * @return this builder
         **/
        public Builder databaseToolsConnectionTypes(
                java.util.List<DatabaseToolsConnectionTypes> databaseToolsConnectionTypes) {
            this.databaseToolsConnectionTypes = databaseToolsConnectionTypes;
            this.__explicitlySet__.add("databaseToolsConnectionTypes");
            return this;
        }
        /**
         * Uniform resource locator (URL) of documentation related to this setting.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("documentationUrl")
        private String documentationUrl;

        /**
         * Uniform resource locator (URL) of documentation related to this setting.
         * @param documentationUrl the value to set
         * @return this builder
         **/
        public Builder documentationUrl(String documentationUrl) {
            this.documentationUrl = documentationUrl;
            this.__explicitlySet__.add("documentationUrl");
            return this;
        }
        /**
         * A user-friendly description of a database API gateway config setting.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user-friendly description of a database API gateway config setting.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The default value (if applicable) of a database API gateway config setting.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private String defaultValue;

        /**
         * The default value (if applicable) of a database API gateway config setting.
         * @param defaultValue the value to set
         * @return this builder
         **/
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }
        /**
         * A minimum numeric value (if applicable) of a database API gateway config setting.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("minValue")
        private Integer minValue;

        /**
         * A minimum numeric value (if applicable) of a database API gateway config setting.
         * @param minValue the value to set
         * @return this builder
         **/
        public Builder minValue(Integer minValue) {
            this.minValue = minValue;
            this.__explicitlySet__.add("minValue");
            return this;
        }
        /**
         * A maximum numeric value (if applicable) of a database API gateway config setting.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxValue")
        private Integer maxValue;

        /**
         * A maximum numeric value (if applicable) of a database API gateway config setting.
         * @param maxValue the value to set
         * @return this builder
         **/
        public Builder maxValue(Integer maxValue) {
            this.maxValue = maxValue;
            this.__explicitlySet__.add("maxValue");
            return this;
        }
        /**
         * A list of string values (if applicable) supported by this database API gateway config setting.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("listOfValues")
        private java.util.List<String> listOfValues;

        /**
         * A list of string values (if applicable) supported by this database API gateway config setting.
         * @param listOfValues the value to set
         * @return this builder
         **/
        public Builder listOfValues(java.util.List<String> listOfValues) {
            this.listOfValues = listOfValues;
            this.__explicitlySet__.add("listOfValues");
            return this;
        }
        /**
         * Hint text for a database API gateway config setting.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("hintText")
        private String hintText;

        /**
         * Hint text for a database API gateway config setting.
         * @param hintText the value to set
         * @return this builder
         **/
        public Builder hintText(String hintText) {
            this.hintText = hintText;
            this.__explicitlySet__.add("hintText");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseToolsDatabaseApiGatewayConfigAdvancedPropertySummary build() {
            DatabaseToolsDatabaseApiGatewayConfigAdvancedPropertySummary model =
                    new DatabaseToolsDatabaseApiGatewayConfigAdvancedPropertySummary(
                            this.key,
                            this.displayName,
                            this.dataType,
                            this.configTypes,
                            this.categoryKey,
                            this.categoryDisplayName,
                            this.databaseToolsConnectionTypes,
                            this.documentationUrl,
                            this.description,
                            this.defaultValue,
                            this.minValue,
                            this.maxValue,
                            this.listOfValues,
                            this.hintText);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseToolsDatabaseApiGatewayConfigAdvancedPropertySummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("dataType")) {
                this.dataType(model.getDataType());
            }
            if (model.wasPropertyExplicitlySet("configTypes")) {
                this.configTypes(model.getConfigTypes());
            }
            if (model.wasPropertyExplicitlySet("categoryKey")) {
                this.categoryKey(model.getCategoryKey());
            }
            if (model.wasPropertyExplicitlySet("categoryDisplayName")) {
                this.categoryDisplayName(model.getCategoryDisplayName());
            }
            if (model.wasPropertyExplicitlySet("databaseToolsConnectionTypes")) {
                this.databaseToolsConnectionTypes(model.getDatabaseToolsConnectionTypes());
            }
            if (model.wasPropertyExplicitlySet("documentationUrl")) {
                this.documentationUrl(model.getDocumentationUrl());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("defaultValue")) {
                this.defaultValue(model.getDefaultValue());
            }
            if (model.wasPropertyExplicitlySet("minValue")) {
                this.minValue(model.getMinValue());
            }
            if (model.wasPropertyExplicitlySet("maxValue")) {
                this.maxValue(model.getMaxValue());
            }
            if (model.wasPropertyExplicitlySet("listOfValues")) {
                this.listOfValues(model.getListOfValues());
            }
            if (model.wasPropertyExplicitlySet("hintText")) {
                this.hintText(model.getHintText());
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
     * A string that uniquely identifies a Database Tools database API gateway config global settings resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * A string that uniquely identifies a Database Tools database API gateway config global settings resource.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * A user-friendly name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The data type of a database API gateway config setting.
     **/
    public enum DataType {
        String("STRING"),
        Number("NUMBER"),
        Duration("DURATION"),
        Boolean("BOOLEAN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DataType.class);

        private final String value;
        private static java.util.Map<String, DataType> map;

        static {
            map = new java.util.HashMap<>();
            for (DataType v : DataType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DataType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DataType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DataType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The data type of a database API gateway config setting.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final DataType dataType;

    /**
     * The data type of a database API gateway config setting.
     * @return the value
     **/
    public DataType getDataType() {
        return dataType;
    }

    /**
     * The config types that support this advanced property. The supported types are GLOBAL and POOL.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configTypes")
    private final java.util.List<DatabaseApiGatewayConfigAdvancedPropertyConfigType> configTypes;

    /**
     * The config types that support this advanced property. The supported types are GLOBAL and POOL.
     *
     * @return the value
     **/
    public java.util.List<DatabaseApiGatewayConfigAdvancedPropertyConfigType> getConfigTypes() {
        return configTypes;
    }

    /**
     * The category of the Database Tools database API gateway config global setting.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("categoryKey")
    private final String categoryKey;

    /**
     * The category of the Database Tools database API gateway config global setting.
     * @return the value
     **/
    public String getCategoryKey() {
        return categoryKey;
    }

    /**
     * A user-friendly name of a category.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("categoryDisplayName")
    private final String categoryDisplayName;

    /**
     * A user-friendly name of a category.
     * @return the value
     **/
    public String getCategoryDisplayName() {
        return categoryDisplayName;
    }

    /**
     **/
    public enum DatabaseToolsConnectionTypes {
        OracleDatabase("ORACLE_DATABASE"),
        Mysql("MYSQL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DatabaseToolsConnectionTypes.class);

        private final String value;
        private static java.util.Map<String, DatabaseToolsConnectionTypes> map;

        static {
            map = new java.util.HashMap<>();
            for (DatabaseToolsConnectionTypes v : DatabaseToolsConnectionTypes.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DatabaseToolsConnectionTypes(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DatabaseToolsConnectionTypes create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DatabaseToolsConnectionTypes', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of database (as determined by a type of Database Tools connection) to which this setting applies.
     * The advancedProperty applies to all types of Database Tools connection when null. This is only applicable
     * when configTypes includes POOL.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseToolsConnectionTypes")
    private final java.util.List<DatabaseToolsConnectionTypes> databaseToolsConnectionTypes;

    /**
     * The type of database (as determined by a type of Database Tools connection) to which this setting applies.
     * The advancedProperty applies to all types of Database Tools connection when null. This is only applicable
     * when configTypes includes POOL.
     *
     * @return the value
     **/
    public java.util.List<DatabaseToolsConnectionTypes> getDatabaseToolsConnectionTypes() {
        return databaseToolsConnectionTypes;
    }

    /**
     * Uniform resource locator (URL) of documentation related to this setting.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("documentationUrl")
    private final String documentationUrl;

    /**
     * Uniform resource locator (URL) of documentation related to this setting.
     * @return the value
     **/
    public String getDocumentationUrl() {
        return documentationUrl;
    }

    /**
     * A user-friendly description of a database API gateway config setting.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user-friendly description of a database API gateway config setting.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The default value (if applicable) of a database API gateway config setting.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final String defaultValue;

    /**
     * The default value (if applicable) of a database API gateway config setting.
     * @return the value
     **/
    public String getDefaultValue() {
        return defaultValue;
    }

    /**
     * A minimum numeric value (if applicable) of a database API gateway config setting.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minValue")
    private final Integer minValue;

    /**
     * A minimum numeric value (if applicable) of a database API gateway config setting.
     * @return the value
     **/
    public Integer getMinValue() {
        return minValue;
    }

    /**
     * A maximum numeric value (if applicable) of a database API gateway config setting.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxValue")
    private final Integer maxValue;

    /**
     * A maximum numeric value (if applicable) of a database API gateway config setting.
     * @return the value
     **/
    public Integer getMaxValue() {
        return maxValue;
    }

    /**
     * A list of string values (if applicable) supported by this database API gateway config setting.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("listOfValues")
    private final java.util.List<String> listOfValues;

    /**
     * A list of string values (if applicable) supported by this database API gateway config setting.
     * @return the value
     **/
    public java.util.List<String> getListOfValues() {
        return listOfValues;
    }

    /**
     * Hint text for a database API gateway config setting.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hintText")
    private final String hintText;

    /**
     * Hint text for a database API gateway config setting.
     * @return the value
     **/
    public String getHintText() {
        return hintText;
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
        sb.append("DatabaseToolsDatabaseApiGatewayConfigAdvancedPropertySummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", configTypes=").append(String.valueOf(this.configTypes));
        sb.append(", categoryKey=").append(String.valueOf(this.categoryKey));
        sb.append(", categoryDisplayName=").append(String.valueOf(this.categoryDisplayName));
        sb.append(", databaseToolsConnectionTypes=")
                .append(String.valueOf(this.databaseToolsConnectionTypes));
        sb.append(", documentationUrl=").append(String.valueOf(this.documentationUrl));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(", minValue=").append(String.valueOf(this.minValue));
        sb.append(", maxValue=").append(String.valueOf(this.maxValue));
        sb.append(", listOfValues=").append(String.valueOf(this.listOfValues));
        sb.append(", hintText=").append(String.valueOf(this.hintText));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseToolsDatabaseApiGatewayConfigAdvancedPropertySummary)) {
            return false;
        }

        DatabaseToolsDatabaseApiGatewayConfigAdvancedPropertySummary other =
                (DatabaseToolsDatabaseApiGatewayConfigAdvancedPropertySummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.configTypes, other.configTypes)
                && java.util.Objects.equals(this.categoryKey, other.categoryKey)
                && java.util.Objects.equals(this.categoryDisplayName, other.categoryDisplayName)
                && java.util.Objects.equals(
                        this.databaseToolsConnectionTypes, other.databaseToolsConnectionTypes)
                && java.util.Objects.equals(this.documentationUrl, other.documentationUrl)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.defaultValue, other.defaultValue)
                && java.util.Objects.equals(this.minValue, other.minValue)
                && java.util.Objects.equals(this.maxValue, other.maxValue)
                && java.util.Objects.equals(this.listOfValues, other.listOfValues)
                && java.util.Objects.equals(this.hintText, other.hintText)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + (this.configTypes == null ? 43 : this.configTypes.hashCode());
        result = (result * PRIME) + (this.categoryKey == null ? 43 : this.categoryKey.hashCode());
        result =
                (result * PRIME)
                        + (this.categoryDisplayName == null
                                ? 43
                                : this.categoryDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseToolsConnectionTypes == null
                                ? 43
                                : this.databaseToolsConnectionTypes.hashCode());
        result =
                (result * PRIME)
                        + (this.documentationUrl == null ? 43 : this.documentationUrl.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        result = (result * PRIME) + (this.minValue == null ? 43 : this.minValue.hashCode());
        result = (result * PRIME) + (this.maxValue == null ? 43 : this.maxValue.hashCode());
        result = (result * PRIME) + (this.listOfValues == null ? 43 : this.listOfValues.hashCode());
        result = (result * PRIME) + (this.hintText == null ? 43 : this.hintText.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
