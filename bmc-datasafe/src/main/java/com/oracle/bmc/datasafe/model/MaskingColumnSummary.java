/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of a masking column.
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
    builder = MaskingColumnSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MaskingColumnSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("maskingPolicyId")
        private String maskingPolicyId;

        public Builder maskingPolicyId(String maskingPolicyId) {
            this.maskingPolicyId = maskingPolicyId;
            this.__explicitlySet__.add("maskingPolicyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private MaskingColumnLifecycleState lifecycleState;

        public Builder lifecycleState(MaskingColumnLifecycleState lifecycleState) {
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

        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private ObjectType objectType;

        public Builder objectType(ObjectType objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("columnName")
        private String columnName;

        public Builder columnName(String columnName) {
            this.columnName = columnName;
            this.__explicitlySet__.add("columnName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("childColumns")
        private java.util.List<String> childColumns;

        public Builder childColumns(java.util.List<String> childColumns) {
            this.childColumns = childColumns;
            this.__explicitlySet__.add("childColumns");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maskingColumnGroup")
        private String maskingColumnGroup;

        public Builder maskingColumnGroup(String maskingColumnGroup) {
            this.maskingColumnGroup = maskingColumnGroup;
            this.__explicitlySet__.add("maskingColumnGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeId")
        private String sensitiveTypeId;

        public Builder sensitiveTypeId(String sensitiveTypeId) {
            this.sensitiveTypeId = sensitiveTypeId;
            this.__explicitlySet__.add("sensitiveTypeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMaskingEnabled")
        private Boolean isMaskingEnabled;

        public Builder isMaskingEnabled(Boolean isMaskingEnabled) {
            this.isMaskingEnabled = isMaskingEnabled;
            this.__explicitlySet__.add("isMaskingEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private String dataType;

        public Builder dataType(String dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maskingFormats")
        private java.util.List<MaskingFormat> maskingFormats;

        public Builder maskingFormats(java.util.List<MaskingFormat> maskingFormats) {
            this.maskingFormats = maskingFormats;
            this.__explicitlySet__.add("maskingFormats");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaskingColumnSummary build() {
            MaskingColumnSummary __instance__ =
                    new MaskingColumnSummary(
                            key,
                            maskingPolicyId,
                            lifecycleState,
                            lifecycleDetails,
                            timeCreated,
                            timeUpdated,
                            schemaName,
                            objectName,
                            objectType,
                            columnName,
                            childColumns,
                            maskingColumnGroup,
                            sensitiveTypeId,
                            isMaskingEnabled,
                            dataType,
                            maskingFormats);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaskingColumnSummary o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .maskingPolicyId(o.getMaskingPolicyId())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .timeCreated(o.getTimeCreated())
                            .timeUpdated(o.getTimeUpdated())
                            .schemaName(o.getSchemaName())
                            .objectName(o.getObjectName())
                            .objectType(o.getObjectType())
                            .columnName(o.getColumnName())
                            .childColumns(o.getChildColumns())
                            .maskingColumnGroup(o.getMaskingColumnGroup())
                            .sensitiveTypeId(o.getSensitiveTypeId())
                            .isMaskingEnabled(o.getIsMaskingEnabled())
                            .dataType(o.getDataType())
                            .maskingFormats(o.getMaskingFormats());

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
     * The unique key that identifies a masking column. The key is numeric and unique within a masking policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The OCID of the masking policy that contains the masking column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maskingPolicyId")
    String maskingPolicyId;

    /**
     * The current state of the masking column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    MaskingColumnLifecycleState lifecycleState;

    /**
     * Details about the current state of the masking column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    String lifecycleDetails;

    /**
     * The date and time the masking column was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * The date and time the masking column was last updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    java.util.Date timeUpdated;

    /**
     * The name of the schema that contains the database column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    String schemaName;

    /**
     * The name of the object (table or editioning view) that contains the database column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    String objectName;

    /**
     * The type of the object that contains the database column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    ObjectType objectType;

    /**
     * The name of the database column. Note that the same name is used for the masking column.
     * There is no separate displayName attribute for the masking column.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnName")
    String columnName;

    /**
     * An array of child columns that are in referential relationship with the masking column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("childColumns")
    java.util.List<String> childColumns;

    /**
     * The group of the masking column. All the columns in a group are masked together to ensure
     * that the masked data across these columns continue
     * to retain the same logical relationship. For more details, check <a href=https://docs.oracle.com/en/cloud/paas/data-safe/udscs/group-masking1.html#GUID-755056B9-9540-48C0-9491-262A44A85037>Group Masking in the Data Safe documentation.</a>
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maskingColumnGroup")
    String maskingColumnGroup;

    /**
     * The OCID of the sensitive type associated with the masking column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeId")
    String sensitiveTypeId;

    /**
     * Indicates if data masking is enabled for the masking column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMaskingEnabled")
    Boolean isMaskingEnabled;

    /**
     * The data type of the masking column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    String dataType;

    /**
     * An array of masking formats assigned to the masking column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maskingFormats")
    java.util.List<MaskingFormat> maskingFormats;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
