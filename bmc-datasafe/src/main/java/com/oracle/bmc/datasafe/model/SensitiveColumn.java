/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A sensitive column is a resource corresponding to a database column that is considered sensitive.
 * It's a subresource of sensitive data model resource and is always associated with a sensitive data model.
 * Note that referential relationships are also managed as part of sensitive columns.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SensitiveColumn.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SensitiveColumn {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveDataModelId")
        private String sensitiveDataModelId;

        public Builder sensitiveDataModelId(String sensitiveDataModelId) {
            this.sensitiveDataModelId = sensitiveDataModelId;
            this.__explicitlySet__.add("sensitiveDataModelId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private SensitiveColumnLifecycleState lifecycleState;

        public Builder lifecycleState(SensitiveColumnLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("appName")
        private String appName;

        public Builder appName(String appName) {
            this.appName = appName;
            this.__explicitlySet__.add("appName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("columnName")
        private String columnName;

        public Builder columnName(String columnName) {
            this.columnName = columnName;
            this.__explicitlySet__.add("columnName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private ObjectType objectType;

        public Builder objectType(ObjectType objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private String dataType;

        public Builder dataType(String dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeId")
        private String sensitiveTypeId;

        public Builder sensitiveTypeId(String sensitiveTypeId) {
            this.sensitiveTypeId = sensitiveTypeId;
            this.__explicitlySet__.add("sensitiveTypeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("source")
        private Source source;

        public Builder source(Source source) {
            this.source = source;
            this.__explicitlySet__.add("source");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentColumnKeys")
        private java.util.List<String> parentColumnKeys;

        public Builder parentColumnKeys(java.util.List<String> parentColumnKeys) {
            this.parentColumnKeys = parentColumnKeys;
            this.__explicitlySet__.add("parentColumnKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("relationType")
        private RelationType relationType;

        public Builder relationType(RelationType relationType) {
            this.relationType = relationType;
            this.__explicitlySet__.add("relationType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("estimatedDataValueCount")
        private Long estimatedDataValueCount;

        public Builder estimatedDataValueCount(Long estimatedDataValueCount) {
            this.estimatedDataValueCount = estimatedDataValueCount;
            this.__explicitlySet__.add("estimatedDataValueCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sampleDataValues")
        private java.util.List<String> sampleDataValues;

        public Builder sampleDataValues(java.util.List<String> sampleDataValues) {
            this.sampleDataValues = sampleDataValues;
            this.__explicitlySet__.add("sampleDataValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("appDefinedChildColumnKeys")
        private java.util.List<String> appDefinedChildColumnKeys;

        public Builder appDefinedChildColumnKeys(java.util.List<String> appDefinedChildColumnKeys) {
            this.appDefinedChildColumnKeys = appDefinedChildColumnKeys;
            this.__explicitlySet__.add("appDefinedChildColumnKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbDefinedChildColumnKeys")
        private java.util.List<String> dbDefinedChildColumnKeys;

        public Builder dbDefinedChildColumnKeys(java.util.List<String> dbDefinedChildColumnKeys) {
            this.dbDefinedChildColumnKeys = dbDefinedChildColumnKeys;
            this.__explicitlySet__.add("dbDefinedChildColumnKeys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("columnGroups")
        private java.util.List<String> columnGroups;

        public Builder columnGroups(java.util.List<String> columnGroups) {
            this.columnGroups = columnGroups;
            this.__explicitlySet__.add("columnGroups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SensitiveColumn build() {
            SensitiveColumn __instance__ =
                    new SensitiveColumn(
                            key,
                            sensitiveDataModelId,
                            timeCreated,
                            timeUpdated,
                            lifecycleState,
                            lifecycleDetails,
                            appName,
                            schemaName,
                            objectName,
                            columnName,
                            objectType,
                            dataType,
                            status,
                            sensitiveTypeId,
                            source,
                            parentColumnKeys,
                            relationType,
                            estimatedDataValueCount,
                            sampleDataValues,
                            appDefinedChildColumnKeys,
                            dbDefinedChildColumnKeys,
                            columnGroups);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SensitiveColumn o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .sensitiveDataModelId(o.getSensitiveDataModelId())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .appName(o.getAppName())
                            .schemaName(o.getSchemaName())
                            .objectName(o.getObjectName())
                            .columnName(o.getColumnName())
                            .objectType(o.getObjectType())
                            .dataType(o.getDataType())
                            .status(o.getStatus())
                            .sensitiveTypeId(o.getSensitiveTypeId())
                            .source(o.getSource())
                            .parentColumnKeys(o.getParentColumnKeys())
                            .relationType(o.getRelationType())
                            .estimatedDataValueCount(o.getEstimatedDataValueCount())
                            .sampleDataValues(o.getSampleDataValues())
                            .appDefinedChildColumnKeys(o.getAppDefinedChildColumnKeys())
                            .dbDefinedChildColumnKeys(o.getDbDefinedChildColumnKeys())
                            .columnGroups(o.getColumnGroups());

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
     * The unique key that identifies the sensitive column. It's numeric and unique within a sensitive data model.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The OCID of the sensitive data model that contains the sensitive column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveDataModelId")
    String sensitiveDataModelId;

    /**
     * The date and time, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339),
     * the sensitive column was created in the sensitive data model.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339),
     * the sensitive column was last updated in the sensitive data model.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The current state of the sensitive column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    SensitiveColumnLifecycleState lifecycleState;

    /**
     * Details about the current state of the sensitive column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * The name of the application associated with the sensitive column. It's useful when the application name is
     * different from the schema name. Otherwise, it can be ignored.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("appName")
    String appName;

    /**
     * The database schema that contains the sensitive column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    String schemaName;

    /**
     * The database object that contains the sensitive column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    String objectName;

    /**
     * The name of the sensitive column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnName")
    String columnName;
    /**
     * The type of the database object that contains the sensitive column.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ObjectType {
        Table("TABLE"),
        EditioningView("EDITIONING_VIEW"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ObjectType> map;

        static {
            map = new java.util.HashMap<>();
            for (ObjectType v : ObjectType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ObjectType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ObjectType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ObjectType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the database object that contains the sensitive column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    ObjectType objectType;

    /**
     * The data type of the sensitive column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    String dataType;
    /**
     * The status of the sensitive column. VALID means the column is considered sensitive. INVALID means the column
     * is not considered sensitive. Tracking invalid columns in a sensitive data model helps ensure that an
     * incremental data discovery job does not identify these columns as sensitive again.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Status {
        Valid("VALID"),
        Invalid("INVALID"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The status of the sensitive column. VALID means the column is considered sensitive. INVALID means the column
     * is not considered sensitive. Tracking invalid columns in a sensitive data model helps ensure that an
     * incremental data discovery job does not identify these columns as sensitive again.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;

    /**
     * The OCID of the sensitive type associated with the sensitive column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeId")
    String sensitiveTypeId;
    /**
     * The source of the sensitive column. DISCOVERY indicates that the column was added to the sensitive data model
     * using a data discovery job. MANUAL indicates that the column was added manually.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Source {
        Manual("MANUAL"),
        Discovery("DISCOVERY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
    /**
     * The source of the sensitive column. DISCOVERY indicates that the column was added to the sensitive data model
     * using a data discovery job. MANUAL indicates that the column was added manually.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("source")
    Source source;

    /**
     * Unique keys identifying the columns that are parents of the sensitive column. At present, it tracks a single parent only.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentColumnKeys")
    java.util.List<String> parentColumnKeys;
    /**
     * The type of referential relationship the sensitive column has with its parent. NONE indicates that the
     * sensitive column does not have a parent. DB_DEFINED indicates that the relationship is defined in the database
     * dictionary. APP_DEFINED indicates that the relationship is defined at the application level and not in the database dictionary.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum RelationType {
        None("NONE"),
        AppDefined("APP_DEFINED"),
        DbDefined("DB_DEFINED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, RelationType> map;

        static {
            map = new java.util.HashMap<>();
            for (RelationType v : RelationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RelationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RelationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RelationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of referential relationship the sensitive column has with its parent. NONE indicates that the
     * sensitive column does not have a parent. DB_DEFINED indicates that the relationship is defined in the database
     * dictionary. APP_DEFINED indicates that the relationship is defined at the application level and not in the database dictionary.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relationType")
    RelationType relationType;

    /**
     * The estimated number of data values the column has in the associated database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("estimatedDataValueCount")
    Long estimatedDataValueCount;

    /**
     * Original data values collected for the sensitive column from the associated database. Sample data helps review
     * the column and ensure that it actually contains sensitive data. Note that sample data is retrieved by a data
     * discovery job only if the isSampleDataCollectionEnabled attribute is set to true. At present, only one data
     * value is collected per sensitive column.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sampleDataValues")
    java.util.List<String> sampleDataValues;

    /**
     * Unique keys identifying the columns that are application-level (non-dictionary) children of the sensitive column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("appDefinedChildColumnKeys")
    java.util.List<String> appDefinedChildColumnKeys;

    /**
     * Unique keys identifying the columns that are database-level (dictionary-defined) children of the sensitive column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbDefinedChildColumnKeys")
    java.util.List<String> dbDefinedChildColumnKeys;

    /**
     * The composite key groups to which the sensitive column belongs. If the column is part of a composite key,
     * it's assigned a column group. It helps identify and manage referential relationships that involve composite keys.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnGroups")
    java.util.List<String> columnGroups;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
