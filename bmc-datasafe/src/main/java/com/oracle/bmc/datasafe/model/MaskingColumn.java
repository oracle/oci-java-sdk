/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A masking column is a resource corresponding to a database column that you want to
 * mask. It's a subresource of masking policy resource and is always associated with
 * a masking policy. Note that only parent columns are managed as masking columns.
 * The child columns are automatically managed using the childColumns attribute.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MaskingColumn.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MaskingColumn {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "maskingPolicyId",
        "lifecycleState",
        "lifecycleDetails",
        "timeCreated",
        "timeUpdated",
        "schemaName",
        "objectName",
        "objectType",
        "columnName",
        "childColumns",
        "maskingColumnGroup",
        "sensitiveTypeId",
        "isMaskingEnabled",
        "dataType",
        "maskingFormats"
    })
    public MaskingColumn(
            String key,
            String maskingPolicyId,
            MaskingColumnLifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            String schemaName,
            String objectName,
            ObjectType objectType,
            String columnName,
            java.util.List<String> childColumns,
            String maskingColumnGroup,
            String sensitiveTypeId,
            Boolean isMaskingEnabled,
            String dataType,
            java.util.List<MaskingFormat> maskingFormats) {
        super();
        this.key = key;
        this.maskingPolicyId = maskingPolicyId;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.schemaName = schemaName;
        this.objectName = objectName;
        this.objectType = objectType;
        this.columnName = columnName;
        this.childColumns = childColumns;
        this.maskingColumnGroup = maskingColumnGroup;
        this.sensitiveTypeId = sensitiveTypeId;
        this.isMaskingEnabled = isMaskingEnabled;
        this.dataType = dataType;
        this.maskingFormats = maskingFormats;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique key that identifies the masking column. It's numeric and unique within a masking policy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The unique key that identifies the masking column. It's numeric and unique within a masking policy.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The OCID of the masking policy that contains the masking column.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maskingPolicyId")
        private String maskingPolicyId;

        /**
         * The OCID of the masking policy that contains the masking column.
         * @param maskingPolicyId the value to set
         * @return this builder
         **/
        public Builder maskingPolicyId(String maskingPolicyId) {
            this.maskingPolicyId = maskingPolicyId;
            this.__explicitlySet__.add("maskingPolicyId");
            return this;
        }
        /**
         * The current state of the masking column.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private MaskingColumnLifecycleState lifecycleState;

        /**
         * The current state of the masking column.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(MaskingColumnLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Details about the current state of the masking column.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Details about the current state of the masking column.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The date and time the masking column was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the masking column was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the masking column was last updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the masking column was last updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /**
         * The name of the schema that contains the database column.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        /**
         * The name of the schema that contains the database column.
         * @param schemaName the value to set
         * @return this builder
         **/
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }
        /**
         * The name of the object (table or editioning view) that contains the database column.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * The name of the object (table or editioning view) that contains the database column.
         * @param objectName the value to set
         * @return this builder
         **/
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /**
         * The type of the object that contains the database column.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("objectType")
        private ObjectType objectType;

        /**
         * The type of the object that contains the database column.
         * @param objectType the value to set
         * @return this builder
         **/
        public Builder objectType(ObjectType objectType) {
            this.objectType = objectType;
            this.__explicitlySet__.add("objectType");
            return this;
        }
        /**
         * The name of the database column. Note that the same name is used for the masking column.
         * There is no separate displayName attribute for the masking column.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("columnName")
        private String columnName;

        /**
         * The name of the database column. Note that the same name is used for the masking column.
         * There is no separate displayName attribute for the masking column.
         *
         * @param columnName the value to set
         * @return this builder
         **/
        public Builder columnName(String columnName) {
            this.columnName = columnName;
            this.__explicitlySet__.add("columnName");
            return this;
        }
        /**
         * An array of child columns that are in referential relationship with the masking column.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("childColumns")
        private java.util.List<String> childColumns;

        /**
         * An array of child columns that are in referential relationship with the masking column.
         * @param childColumns the value to set
         * @return this builder
         **/
        public Builder childColumns(java.util.List<String> childColumns) {
            this.childColumns = childColumns;
            this.__explicitlySet__.add("childColumns");
            return this;
        }
        /**
         * The group of the masking column. All the columns in a group are masked together to ensure
         * that the masked data across these columns continue to retain the same logical relationship.
         * For more details, check <a href=https://docs.oracle.com/en/cloud/paas/data-safe/udscs/group-masking1.html#GUID-755056B9-9540-48C0-9491-262A44A85037>Group Masking in the Data Safe documentation.</a>
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maskingColumnGroup")
        private String maskingColumnGroup;

        /**
         * The group of the masking column. All the columns in a group are masked together to ensure
         * that the masked data across these columns continue to retain the same logical relationship.
         * For more details, check <a href=https://docs.oracle.com/en/cloud/paas/data-safe/udscs/group-masking1.html#GUID-755056B9-9540-48C0-9491-262A44A85037>Group Masking in the Data Safe documentation.</a>
         *
         * @param maskingColumnGroup the value to set
         * @return this builder
         **/
        public Builder maskingColumnGroup(String maskingColumnGroup) {
            this.maskingColumnGroup = maskingColumnGroup;
            this.__explicitlySet__.add("maskingColumnGroup");
            return this;
        }
        /**
         * The OCID of the sensitive type associated with the masking column.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeId")
        private String sensitiveTypeId;

        /**
         * The OCID of the sensitive type associated with the masking column.
         * @param sensitiveTypeId the value to set
         * @return this builder
         **/
        public Builder sensitiveTypeId(String sensitiveTypeId) {
            this.sensitiveTypeId = sensitiveTypeId;
            this.__explicitlySet__.add("sensitiveTypeId");
            return this;
        }
        /**
         * Indicates if data masking is enabled for the masking column.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isMaskingEnabled")
        private Boolean isMaskingEnabled;

        /**
         * Indicates if data masking is enabled for the masking column.
         * @param isMaskingEnabled the value to set
         * @return this builder
         **/
        public Builder isMaskingEnabled(Boolean isMaskingEnabled) {
            this.isMaskingEnabled = isMaskingEnabled;
            this.__explicitlySet__.add("isMaskingEnabled");
            return this;
        }
        /**
         * The data type of the masking column.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private String dataType;

        /**
         * The data type of the masking column.
         * @param dataType the value to set
         * @return this builder
         **/
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }
        /**
         * An array of masking formats assigned to the masking column.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maskingFormats")
        private java.util.List<MaskingFormat> maskingFormats;

        /**
         * An array of masking formats assigned to the masking column.
         * @param maskingFormats the value to set
         * @return this builder
         **/
        public Builder maskingFormats(java.util.List<MaskingFormat> maskingFormats) {
            this.maskingFormats = maskingFormats;
            this.__explicitlySet__.add("maskingFormats");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaskingColumn build() {
            MaskingColumn __instance__ =
                    new MaskingColumn(
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
        public Builder copy(MaskingColumn o) {
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The unique key that identifies the masking column. It's numeric and unique within a masking policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The unique key that identifies the masking column. It's numeric and unique within a masking policy.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * The OCID of the masking policy that contains the masking column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maskingPolicyId")
    private final String maskingPolicyId;

    /**
     * The OCID of the masking policy that contains the masking column.
     * @return the value
     **/
    public String getMaskingPolicyId() {
        return maskingPolicyId;
    }

    /**
     * The current state of the masking column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final MaskingColumnLifecycleState lifecycleState;

    /**
     * The current state of the masking column.
     * @return the value
     **/
    public MaskingColumnLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Details about the current state of the masking column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Details about the current state of the masking column.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The date and time the masking column was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the masking column was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the masking column was last updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the masking column was last updated, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /**
     * The name of the schema that contains the database column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    private final String schemaName;

    /**
     * The name of the schema that contains the database column.
     * @return the value
     **/
    public String getSchemaName() {
        return schemaName;
    }

    /**
     * The name of the object (table or editioning view) that contains the database column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * The name of the object (table or editioning view) that contains the database column.
     * @return the value
     **/
    public String getObjectName() {
        return objectName;
    }

    /**
     * The type of the object that contains the database column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectType")
    private final ObjectType objectType;

    /**
     * The type of the object that contains the database column.
     * @return the value
     **/
    public ObjectType getObjectType() {
        return objectType;
    }

    /**
     * The name of the database column. Note that the same name is used for the masking column.
     * There is no separate displayName attribute for the masking column.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("columnName")
    private final String columnName;

    /**
     * The name of the database column. Note that the same name is used for the masking column.
     * There is no separate displayName attribute for the masking column.
     *
     * @return the value
     **/
    public String getColumnName() {
        return columnName;
    }

    /**
     * An array of child columns that are in referential relationship with the masking column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("childColumns")
    private final java.util.List<String> childColumns;

    /**
     * An array of child columns that are in referential relationship with the masking column.
     * @return the value
     **/
    public java.util.List<String> getChildColumns() {
        return childColumns;
    }

    /**
     * The group of the masking column. All the columns in a group are masked together to ensure
     * that the masked data across these columns continue to retain the same logical relationship.
     * For more details, check <a href=https://docs.oracle.com/en/cloud/paas/data-safe/udscs/group-masking1.html#GUID-755056B9-9540-48C0-9491-262A44A85037>Group Masking in the Data Safe documentation.</a>
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maskingColumnGroup")
    private final String maskingColumnGroup;

    /**
     * The group of the masking column. All the columns in a group are masked together to ensure
     * that the masked data across these columns continue to retain the same logical relationship.
     * For more details, check <a href=https://docs.oracle.com/en/cloud/paas/data-safe/udscs/group-masking1.html#GUID-755056B9-9540-48C0-9491-262A44A85037>Group Masking in the Data Safe documentation.</a>
     *
     * @return the value
     **/
    public String getMaskingColumnGroup() {
        return maskingColumnGroup;
    }

    /**
     * The OCID of the sensitive type associated with the masking column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeId")
    private final String sensitiveTypeId;

    /**
     * The OCID of the sensitive type associated with the masking column.
     * @return the value
     **/
    public String getSensitiveTypeId() {
        return sensitiveTypeId;
    }

    /**
     * Indicates if data masking is enabled for the masking column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMaskingEnabled")
    private final Boolean isMaskingEnabled;

    /**
     * Indicates if data masking is enabled for the masking column.
     * @return the value
     **/
    public Boolean getIsMaskingEnabled() {
        return isMaskingEnabled;
    }

    /**
     * The data type of the masking column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final String dataType;

    /**
     * The data type of the masking column.
     * @return the value
     **/
    public String getDataType() {
        return dataType;
    }

    /**
     * An array of masking formats assigned to the masking column.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maskingFormats")
    private final java.util.List<MaskingFormat> maskingFormats;

    /**
     * An array of masking formats assigned to the masking column.
     * @return the value
     **/
    public java.util.List<MaskingFormat> getMaskingFormats() {
        return maskingFormats;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("MaskingColumn(");
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", maskingPolicyId=").append(String.valueOf(this.maskingPolicyId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", schemaName=").append(String.valueOf(this.schemaName));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", objectType=").append(String.valueOf(this.objectType));
        sb.append(", columnName=").append(String.valueOf(this.columnName));
        sb.append(", childColumns=").append(String.valueOf(this.childColumns));
        sb.append(", maskingColumnGroup=").append(String.valueOf(this.maskingColumnGroup));
        sb.append(", sensitiveTypeId=").append(String.valueOf(this.sensitiveTypeId));
        sb.append(", isMaskingEnabled=").append(String.valueOf(this.isMaskingEnabled));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", maskingFormats=").append(String.valueOf(this.maskingFormats));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MaskingColumn)) {
            return false;
        }

        MaskingColumn other = (MaskingColumn) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.maskingPolicyId, other.maskingPolicyId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.objectType, other.objectType)
                && java.util.Objects.equals(this.columnName, other.columnName)
                && java.util.Objects.equals(this.childColumns, other.childColumns)
                && java.util.Objects.equals(this.maskingColumnGroup, other.maskingColumnGroup)
                && java.util.Objects.equals(this.sensitiveTypeId, other.sensitiveTypeId)
                && java.util.Objects.equals(this.isMaskingEnabled, other.isMaskingEnabled)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.maskingFormats, other.maskingFormats)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.maskingPolicyId == null ? 43 : this.maskingPolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.objectType == null ? 43 : this.objectType.hashCode());
        result = (result * PRIME) + (this.columnName == null ? 43 : this.columnName.hashCode());
        result = (result * PRIME) + (this.childColumns == null ? 43 : this.childColumns.hashCode());
        result =
                (result * PRIME)
                        + (this.maskingColumnGroup == null
                                ? 43
                                : this.maskingColumnGroup.hashCode());
        result =
                (result * PRIME)
                        + (this.sensitiveTypeId == null ? 43 : this.sensitiveTypeId.hashCode());
        result =
                (result * PRIME)
                        + (this.isMaskingEnabled == null ? 43 : this.isMaskingEnabled.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result =
                (result * PRIME)
                        + (this.maskingFormats == null ? 43 : this.maskingFormats.hashCode());
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
