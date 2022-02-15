/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A data discovery job. It helps track job's metadata as well as result statistics.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DiscoveryJob.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DiscoveryJob {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("discoveryType")
        private DiscoveryType discoveryType;

        public Builder discoveryType(DiscoveryType discoveryType) {
            this.discoveryType = discoveryType;
            this.__explicitlySet__.add("discoveryType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private DiscoveryLifecycleState lifecycleState;

        public Builder lifecycleState(DiscoveryLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveDataModelId")
        private String sensitiveDataModelId;

        public Builder sensitiveDataModelId(String sensitiveDataModelId) {
            this.sensitiveDataModelId = sensitiveDataModelId;
            this.__explicitlySet__.add("sensitiveDataModelId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("schemasForDiscovery")
        private java.util.List<String> schemasForDiscovery;

        public Builder schemasForDiscovery(java.util.List<String> schemasForDiscovery) {
            this.schemasForDiscovery = schemasForDiscovery;
            this.__explicitlySet__.add("schemasForDiscovery");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeIdsForDiscovery")
        private java.util.List<String> sensitiveTypeIdsForDiscovery;

        public Builder sensitiveTypeIdsForDiscovery(
                java.util.List<String> sensitiveTypeIdsForDiscovery) {
            this.sensitiveTypeIdsForDiscovery = sensitiveTypeIdsForDiscovery;
            this.__explicitlySet__.add("sensitiveTypeIdsForDiscovery");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSampleDataCollectionEnabled")
        private Boolean isSampleDataCollectionEnabled;

        public Builder isSampleDataCollectionEnabled(Boolean isSampleDataCollectionEnabled) {
            this.isSampleDataCollectionEnabled = isSampleDataCollectionEnabled;
            this.__explicitlySet__.add("isSampleDataCollectionEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isAppDefinedRelationDiscoveryEnabled")
        private Boolean isAppDefinedRelationDiscoveryEnabled;

        public Builder isAppDefinedRelationDiscoveryEnabled(
                Boolean isAppDefinedRelationDiscoveryEnabled) {
            this.isAppDefinedRelationDiscoveryEnabled = isAppDefinedRelationDiscoveryEnabled;
            this.__explicitlySet__.add("isAppDefinedRelationDiscoveryEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSchemas")
        private Boolean isIncludeAllSchemas;

        public Builder isIncludeAllSchemas(Boolean isIncludeAllSchemas) {
            this.isIncludeAllSchemas = isIncludeAllSchemas;
            this.__explicitlySet__.add("isIncludeAllSchemas");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSensitiveTypes")
        private Boolean isIncludeAllSensitiveTypes;

        public Builder isIncludeAllSensitiveTypes(Boolean isIncludeAllSensitiveTypes) {
            this.isIncludeAllSensitiveTypes = isIncludeAllSensitiveTypes;
            this.__explicitlySet__.add("isIncludeAllSensitiveTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalSchemasScanned")
        private Long totalSchemasScanned;

        public Builder totalSchemasScanned(Long totalSchemasScanned) {
            this.totalSchemasScanned = totalSchemasScanned;
            this.__explicitlySet__.add("totalSchemasScanned");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalObjectsScanned")
        private Long totalObjectsScanned;

        public Builder totalObjectsScanned(Long totalObjectsScanned) {
            this.totalObjectsScanned = totalObjectsScanned;
            this.__explicitlySet__.add("totalObjectsScanned");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalColumnsScanned")
        private Long totalColumnsScanned;

        public Builder totalColumnsScanned(Long totalColumnsScanned) {
            this.totalColumnsScanned = totalColumnsScanned;
            this.__explicitlySet__.add("totalColumnsScanned");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalNewSensitiveColumns")
        private Long totalNewSensitiveColumns;

        public Builder totalNewSensitiveColumns(Long totalNewSensitiveColumns) {
            this.totalNewSensitiveColumns = totalNewSensitiveColumns;
            this.__explicitlySet__.add("totalNewSensitiveColumns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalModifiedSensitiveColumns")
        private Long totalModifiedSensitiveColumns;

        public Builder totalModifiedSensitiveColumns(Long totalModifiedSensitiveColumns) {
            this.totalModifiedSensitiveColumns = totalModifiedSensitiveColumns;
            this.__explicitlySet__.add("totalModifiedSensitiveColumns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalDeletedSensitiveColumns")
        private Long totalDeletedSensitiveColumns;

        public Builder totalDeletedSensitiveColumns(Long totalDeletedSensitiveColumns) {
            this.totalDeletedSensitiveColumns = totalDeletedSensitiveColumns;
            this.__explicitlySet__.add("totalDeletedSensitiveColumns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiscoveryJob build() {
            DiscoveryJob __instance__ =
                    new DiscoveryJob(
                            id,
                            discoveryType,
                            displayName,
                            compartmentId,
                            timeStarted,
                            timeFinished,
                            lifecycleState,
                            sensitiveDataModelId,
                            targetId,
                            schemasForDiscovery,
                            sensitiveTypeIdsForDiscovery,
                            isSampleDataCollectionEnabled,
                            isAppDefinedRelationDiscoveryEnabled,
                            isIncludeAllSchemas,
                            isIncludeAllSensitiveTypes,
                            totalSchemasScanned,
                            totalObjectsScanned,
                            totalColumnsScanned,
                            totalNewSensitiveColumns,
                            totalModifiedSensitiveColumns,
                            totalDeletedSensitiveColumns,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiscoveryJob o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .discoveryType(o.getDiscoveryType())
                            .displayName(o.getDisplayName())
                            .compartmentId(o.getCompartmentId())
                            .timeStarted(o.getTimeStarted())
                            .timeFinished(o.getTimeFinished())
                            .lifecycleState(o.getLifecycleState())
                            .sensitiveDataModelId(o.getSensitiveDataModelId())
                            .targetId(o.getTargetId())
                            .schemasForDiscovery(o.getSchemasForDiscovery())
                            .sensitiveTypeIdsForDiscovery(o.getSensitiveTypeIdsForDiscovery())
                            .isSampleDataCollectionEnabled(o.getIsSampleDataCollectionEnabled())
                            .isAppDefinedRelationDiscoveryEnabled(
                                    o.getIsAppDefinedRelationDiscoveryEnabled())
                            .isIncludeAllSchemas(o.getIsIncludeAllSchemas())
                            .isIncludeAllSensitiveTypes(o.getIsIncludeAllSensitiveTypes())
                            .totalSchemasScanned(o.getTotalSchemasScanned())
                            .totalObjectsScanned(o.getTotalObjectsScanned())
                            .totalColumnsScanned(o.getTotalColumnsScanned())
                            .totalNewSensitiveColumns(o.getTotalNewSensitiveColumns())
                            .totalModifiedSensitiveColumns(o.getTotalModifiedSensitiveColumns())
                            .totalDeletedSensitiveColumns(o.getTotalDeletedSensitiveColumns())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags());

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
     * The OCID of the discovery job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;
    /**
     * The type of the discovery job. It defines the job's scope.
     * NEW identifies new sensitive columns in the target database that are not in the sensitive data model.
     * DELETED identifies columns that are present in the sensitive data model but have been deleted from the target database.
     * MODIFIED identifies columns that are present in the target database as well as the sensitive data model but some of their attributes have been modified.
     * ALL covers all the above three scenarios and reports new, deleted and modified columns.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum DiscoveryType {
        All("ALL"),
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
     * The type of the discovery job. It defines the job's scope.
     * NEW identifies new sensitive columns in the target database that are not in the sensitive data model.
     * DELETED identifies columns that are present in the sensitive data model but have been deleted from the target database.
     * MODIFIED identifies columns that are present in the target database as well as the sensitive data model but some of their attributes have been modified.
     * ALL covers all the above three scenarios and reports new, deleted and modified columns.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryType")
    DiscoveryType discoveryType;

    /**
     * The display name of the discovery job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The OCID of the compartment that contains the discovery job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The date and time the discovery job started, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    java.util.Date timeStarted;

    /**
     * The date and time the discovery job finished, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339)..
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    java.util.Date timeFinished;

    /**
     * The current state of the discovery job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    DiscoveryLifecycleState lifecycleState;

    /**
     * The OCID of the sensitive data model associated with the discovery job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveDataModelId")
    String sensitiveDataModelId;

    /**
     * The OCID of the target database associated with the discovery job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    String targetId;

    /**
     * The schemas used for data discovery.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemasForDiscovery")
    java.util.List<String> schemasForDiscovery;

    /**
     * The OCIDs of the sensitive types used for data discovery.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeIdsForDiscovery")
    java.util.List<String> sensitiveTypeIdsForDiscovery;

    /**
     * Indicates if the discovery job should collect and store sample data values for the discovered columns.
     * Sample data helps review the discovered columns and ensure that they actually contain sensitive data.
     * As it collects original data from the target database, it's disabled by default and should be used only
     * if it's acceptable to store sample data in Data Safe's repository in Oracle Cloud. Note that sample data
     * values are not collected for columns with the following data types: LONG, LOB, RAW, XMLTYPE and BFILE.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSampleDataCollectionEnabled")
    Boolean isSampleDataCollectionEnabled;

    /**
     * Indicates if the discovery job should identify potential application-level (non-dictionary) referential
     * relationships between columns. Note that data discovery automatically identifies and adds database-level (dictionary-defined)
     * relationships. This option helps identify application-level relationships that are not defined in the database dictionary,
     * which in turn, helps identify additional sensitive columns and preserve referential integrity during data masking.
     * It's disabled by default and should be used only if there is a need to identify application-level relationships.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAppDefinedRelationDiscoveryEnabled")
    Boolean isAppDefinedRelationDiscoveryEnabled;

    /**
     * Indicates if all the schemas in the associated target database are used for data discovery.
     * If it's set to true, the schemasForDiscovery attribute is ignored and all schemas are used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSchemas")
    Boolean isIncludeAllSchemas;

    /**
     * Indicates if all the existing sensitive types are used for data discovery. If it's set to true, the
     * sensitiveTypeIdsForDiscovery attribute is ignored and all sensitive types are used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIncludeAllSensitiveTypes")
    Boolean isIncludeAllSensitiveTypes;

    /**
     * The total number of schemas scanned by the discovery job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalSchemasScanned")
    Long totalSchemasScanned;

    /**
     * The total number of objects (tables and editioning views) scanned by the discovery job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalObjectsScanned")
    Long totalObjectsScanned;

    /**
     * The total number of columns scanned by the discovery job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalColumnsScanned")
    Long totalColumnsScanned;

    /**
     * The total number of new sensitive columns identified by the discovery job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalNewSensitiveColumns")
    Long totalNewSensitiveColumns;

    /**
     * The total number of modified sensitive columns identified by the discovery job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalModifiedSensitiveColumns")
    Long totalModifiedSensitiveColumns;

    /**
     * The total number of deleted sensitive columns identified by the discovery job.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalDeletedSensitiveColumns")
    Long totalDeletedSensitiveColumns;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see Resource Tags.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    java.util.Map<String, java.util.Map<String, Object>> systemTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
