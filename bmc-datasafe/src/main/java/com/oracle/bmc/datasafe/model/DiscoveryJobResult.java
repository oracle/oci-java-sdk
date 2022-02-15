/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A discovery job result representing a sensitive column. It can be one of the following three types:
 * NEW: A new sensitive column in the target database that is not in the sensitive data model.
 * DELETED: A column that is present in the sensitive data model but has been deleted from the target database.
 * MODIFIED: A column that is present in the target database as well as the sensitive data model but some of its attributes have been modified.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DiscoveryJobResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DiscoveryJobResult {
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

        @com.fasterxml.jackson.annotation.JsonProperty("discoveryType")
        private DiscoveryType discoveryType;

        public Builder discoveryType(DiscoveryType discoveryType) {
            this.discoveryType = discoveryType;
            this.__explicitlySet__.add("discoveryType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveColumnkey")
        private String sensitiveColumnkey;

        public Builder sensitiveColumnkey(String sensitiveColumnkey) {
            this.sensitiveColumnkey = sensitiveColumnkey;
            this.__explicitlySet__.add("sensitiveColumnkey");
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

        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeId")
        private String sensitiveTypeId;

        public Builder sensitiveTypeId(String sensitiveTypeId) {
            this.sensitiveTypeId = sensitiveTypeId;
            this.__explicitlySet__.add("sensitiveTypeId");
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

        @com.fasterxml.jackson.annotation.JsonProperty("plannedAction")
        private PlannedAction plannedAction;

        public Builder plannedAction(PlannedAction plannedAction) {
            this.plannedAction = plannedAction;
            this.__explicitlySet__.add("plannedAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isResultApplied")
        private Boolean isResultApplied;

        public Builder isResultApplied(Boolean isResultApplied) {
            this.isResultApplied = isResultApplied;
            this.__explicitlySet__.add("isResultApplied");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modifiedAttributes")
        private ModifiedAttributes modifiedAttributes;

        public Builder modifiedAttributes(ModifiedAttributes modifiedAttributes) {
            this.modifiedAttributes = modifiedAttributes;
            this.__explicitlySet__.add("modifiedAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiscoveryJobResult build() {
            DiscoveryJobResult __instance__ =
                    new DiscoveryJobResult(
                            key,
                            discoveryType,
                            sensitiveColumnkey,
                            appName,
                            schemaName,
                            objectName,
                            columnName,
                            objectType,
                            dataType,
                            sensitiveTypeId,
                            parentColumnKeys,
                            relationType,
                            estimatedDataValueCount,
                            sampleDataValues,
                            appDefinedChildColumnKeys,
                            dbDefinedChildColumnKeys,
                            plannedAction,
                            isResultApplied,
                            modifiedAttributes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiscoveryJobResult o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .discoveryType(o.getDiscoveryType())
                            .sensitiveColumnkey(o.getSensitiveColumnkey())
                            .appName(o.getAppName())
                            .schemaName(o.getSchemaName())
                            .objectName(o.getObjectName())
                            .columnName(o.getColumnName())
                            .objectType(o.getObjectType())
                            .dataType(o.getDataType())
                            .sensitiveTypeId(o.getSensitiveTypeId())
                            .parentColumnKeys(o.getParentColumnKeys())
                            .relationType(o.getRelationType())
                            .estimatedDataValueCount(o.getEstimatedDataValueCount())
                            .sampleDataValues(o.getSampleDataValues())
                            .appDefinedChildColumnKeys(o.getAppDefinedChildColumnKeys())
                            .dbDefinedChildColumnKeys(o.getDbDefinedChildColumnKeys())
                            .plannedAction(o.getPlannedAction())
                            .isResultApplied(o.getIsResultApplied())
                            .modifiedAttributes(o.getModifiedAttributes());

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
     * The unique key that identifies the discovery result.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;
    /**
     * The type of the discovery result. It can be one of the following three types:
     * NEW: A new sensitive column in the target database that is not in the sensitive data model.
     * DELETED: A column that is present in the sensitive data model but has been deleted from the target database.
     * MODIFIED: A column that is present in the target database as well as the sensitive data model but some of its attributes have been modified.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DiscoveryType {
        New("NEW"),
        Modified("MODIFIED"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, DiscoveryType> map;

        static {
            map = new java.util.HashMap<>();
            for (DiscoveryType v : DiscoveryType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DiscoveryType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DiscoveryType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DiscoveryType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the discovery result. It can be one of the following three types:
     * NEW: A new sensitive column in the target database that is not in the sensitive data model.
     * DELETED: A column that is present in the sensitive data model but has been deleted from the target database.
     * MODIFIED: A column that is present in the target database as well as the sensitive data model but some of its attributes have been modified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryType")
    DiscoveryType discoveryType;

    /**
     * The unique key that identifies the sensitive column represented by the discovery result.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveColumnkey")
    String sensitiveColumnkey;

    /**
     * The name of the application. An application is an entity that is identified by a schema and stores sensitive information for that schema. Its value will be same as schemaName, if no value is passed.
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
     * The OCID of the sensitive type associated with the sensitive column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeId")
    String sensitiveTypeId;

    /**
     * Unique keys identifying the columns that are parents of the sensitive column. At present, it tracks a single parent only.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentColumnKeys")
    java.util.List<String> parentColumnKeys;
    /**
     * The type of referential relationship the sensitive column has with its parent. NONE indicates that the sensitive
     * column does not have a parent. DB_DEFINED indicates that the relationship is defined in the database dictionary.
     * APP_DEFINED indicates that the relationship is defined at the application level and not in the database dictionary.
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
     * The type of referential relationship the sensitive column has with its parent. NONE indicates that the sensitive
     * column does not have a parent. DB_DEFINED indicates that the relationship is defined in the database dictionary.
     * APP_DEFINED indicates that the relationship is defined at the application level and not in the database dictionary.
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
     * Specifies how to process the discovery result. It's set to NONE by default. Use the PatchDiscoveryJobResults operation to update this attribute. You can choose one of the following options:
     * ACCEPT: To accept the discovery result and update the sensitive data model to reflect the changes.
     * REJECT: To reject the discovery result so that it doesn't change the sensitive data model.
     * INVALIDATE: To invalidate a newly discovered column. It adds the column to the sensitive data model but marks it as invalid. It helps track false positives and ensure that they aren't reported by future discovery jobs.
     * After specifying the planned action, you can use the ApplyDiscoveryJobResults operation to automatically process the discovery results.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum PlannedAction {
        None("NONE"),
        Accept("ACCEPT"),
        Invalidate("INVALIDATE"),
        Reject("REJECT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, PlannedAction> map;

        static {
            map = new java.util.HashMap<>();
            for (PlannedAction v : PlannedAction.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PlannedAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PlannedAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PlannedAction', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies how to process the discovery result. It's set to NONE by default. Use the PatchDiscoveryJobResults operation to update this attribute. You can choose one of the following options:
     * ACCEPT: To accept the discovery result and update the sensitive data model to reflect the changes.
     * REJECT: To reject the discovery result so that it doesn't change the sensitive data model.
     * INVALIDATE: To invalidate a newly discovered column. It adds the column to the sensitive data model but marks it as invalid. It helps track false positives and ensure that they aren't reported by future discovery jobs.
     * After specifying the planned action, you can use the ApplyDiscoveryJobResults operation to automatically process the discovery results.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("plannedAction")
    PlannedAction plannedAction;

    /**
     * Indicates if the discovery result has been processed. You can update this attribute using the PatchDiscoveryJobResults
     * operation to track whether the discovery result has already been processed and applied to the sensitive data model.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isResultApplied")
    Boolean isResultApplied;

    @com.fasterxml.jackson.annotation.JsonProperty("modifiedAttributes")
    ModifiedAttributes modifiedAttributes;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
