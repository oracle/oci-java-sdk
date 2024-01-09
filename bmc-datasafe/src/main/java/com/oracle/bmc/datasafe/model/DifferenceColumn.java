/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * A SDM masking policy difference column. It can be one of the following three types: NEW: A new
 * column in the sensitive data model that is not in the masking policy. DELETED: A column that is
 * present in the masking policy but has been deleted from the sensitive data model. MODIFIED: A
 * column that is present in the masking policy as well as the sensitive data model but some of its
 * attributes have been modified. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DifferenceColumn.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DifferenceColumn
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "differenceType",
        "sensitiveColumnkey",
        "maskingColumnkey",
        "schemaName",
        "objectName",
        "columnName",
        "sensitiveTypeId",
        "plannedAction",
        "syncStatus",
        "timeLastSynced"
    })
    public DifferenceColumn(
            String key,
            DifferenceType differenceType,
            String sensitiveColumnkey,
            String maskingColumnkey,
            String schemaName,
            String objectName,
            String columnName,
            String sensitiveTypeId,
            PlannedAction plannedAction,
            SyncStatus syncStatus,
            java.util.Date timeLastSynced) {
        super();
        this.key = key;
        this.differenceType = differenceType;
        this.sensitiveColumnkey = sensitiveColumnkey;
        this.maskingColumnkey = maskingColumnkey;
        this.schemaName = schemaName;
        this.objectName = objectName;
        this.columnName = columnName;
        this.sensitiveTypeId = sensitiveTypeId;
        this.plannedAction = plannedAction;
        this.syncStatus = syncStatus;
        this.timeLastSynced = timeLastSynced;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique key that identifies the SDM masking policy difference column. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The unique key that identifies the SDM masking policy difference column.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * The type of the SDM masking policy difference column. It can be one of the following
         * three types: NEW: A new sensitive column in the sensitive data model that is not in the
         * masking policy. DELETED: A column that is present in the masking policy but has been
         * deleted from the sensitive data model. MODIFIED: A column that is present in the masking
         * policy as well as the sensitive data model but some of its attributes have been modified.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("differenceType")
        private DifferenceType differenceType;

        /**
         * The type of the SDM masking policy difference column. It can be one of the following
         * three types: NEW: A new sensitive column in the sensitive data model that is not in the
         * masking policy. DELETED: A column that is present in the masking policy but has been
         * deleted from the sensitive data model. MODIFIED: A column that is present in the masking
         * policy as well as the sensitive data model but some of its attributes have been modified.
         *
         * @param differenceType the value to set
         * @return this builder
         */
        public Builder differenceType(DifferenceType differenceType) {
            this.differenceType = differenceType;
            this.__explicitlySet__.add("differenceType");
            return this;
        }
        /**
         * The unique key that identifies the sensitive column represented by the SDM masking policy
         * difference column.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveColumnkey")
        private String sensitiveColumnkey;

        /**
         * The unique key that identifies the sensitive column represented by the SDM masking policy
         * difference column.
         *
         * @param sensitiveColumnkey the value to set
         * @return this builder
         */
        public Builder sensitiveColumnkey(String sensitiveColumnkey) {
            this.sensitiveColumnkey = sensitiveColumnkey;
            this.__explicitlySet__.add("sensitiveColumnkey");
            return this;
        }
        /**
         * The unique key that identifies the masking column represented by the SDM masking policy
         * difference column.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maskingColumnkey")
        private String maskingColumnkey;

        /**
         * The unique key that identifies the masking column represented by the SDM masking policy
         * difference column.
         *
         * @param maskingColumnkey the value to set
         * @return this builder
         */
        public Builder maskingColumnkey(String maskingColumnkey) {
            this.maskingColumnkey = maskingColumnkey;
            this.__explicitlySet__.add("maskingColumnkey");
            return this;
        }
        /** The database schema that contains the difference column. */
        @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
        private String schemaName;

        /**
         * The database schema that contains the difference column.
         *
         * @param schemaName the value to set
         * @return this builder
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            this.__explicitlySet__.add("schemaName");
            return this;
        }
        /** The database object that contains the difference column. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * The database object that contains the difference column.
         *
         * @param objectName the value to set
         * @return this builder
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /** The name of the difference column. */
        @com.fasterxml.jackson.annotation.JsonProperty("columnName")
        private String columnName;

        /**
         * The name of the difference column.
         *
         * @param columnName the value to set
         * @return this builder
         */
        public Builder columnName(String columnName) {
            this.columnName = columnName;
            this.__explicitlySet__.add("columnName");
            return this;
        }
        /** The OCID of the sensitive type associated with the difference column. */
        @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeId")
        private String sensitiveTypeId;

        /**
         * The OCID of the sensitive type associated with the difference column.
         *
         * @param sensitiveTypeId the value to set
         * @return this builder
         */
        public Builder sensitiveTypeId(String sensitiveTypeId) {
            this.sensitiveTypeId = sensitiveTypeId;
            this.__explicitlySet__.add("sensitiveTypeId");
            return this;
        }
        /**
         * Specifies how to process the difference column. It's set to SYNC by default. Use the
         * PatchSdmMaskingPolicyDifferenceColumns operation to update this attribute. You can choose
         * one of the following options: SYNC: To sync the difference column and update the masking
         * policy to reflect the changes. NO_SYNC: To not sync the difference column so that it
         * doesn't change the masking policy. After specifying the planned action, you can use the
         * ApplySdmMaskingPolicyDifference operation to automatically process the difference
         * columns.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("plannedAction")
        private PlannedAction plannedAction;

        /**
         * Specifies how to process the difference column. It's set to SYNC by default. Use the
         * PatchSdmMaskingPolicyDifferenceColumns operation to update this attribute. You can choose
         * one of the following options: SYNC: To sync the difference column and update the masking
         * policy to reflect the changes. NO_SYNC: To not sync the difference column so that it
         * doesn't change the masking policy. After specifying the planned action, you can use the
         * ApplySdmMaskingPolicyDifference operation to automatically process the difference
         * columns.
         *
         * @param plannedAction the value to set
         * @return this builder
         */
        public Builder plannedAction(PlannedAction plannedAction) {
            this.plannedAction = plannedAction;
            this.__explicitlySet__.add("plannedAction");
            return this;
        }
        /**
         * Indicates if the difference column has been processed. Use GetDifferenceColumn operation
         * to track whether the difference column has already been processed and applied to the
         * masking policy.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("syncStatus")
        private SyncStatus syncStatus;

        /**
         * Indicates if the difference column has been processed. Use GetDifferenceColumn operation
         * to track whether the difference column has already been processed and applied to the
         * masking policy.
         *
         * @param syncStatus the value to set
         * @return this builder
         */
        public Builder syncStatus(SyncStatus syncStatus) {
            this.syncStatus = syncStatus;
            this.__explicitlySet__.add("syncStatus");
            return this;
        }
        /**
         * The date and time the SDM masking policy difference column was last synced, in the format
         * defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastSynced")
        private java.util.Date timeLastSynced;

        /**
         * The date and time the SDM masking policy difference column was last synced, in the format
         * defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timeLastSynced the value to set
         * @return this builder
         */
        public Builder timeLastSynced(java.util.Date timeLastSynced) {
            this.timeLastSynced = timeLastSynced;
            this.__explicitlySet__.add("timeLastSynced");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DifferenceColumn build() {
            DifferenceColumn model =
                    new DifferenceColumn(
                            this.key,
                            this.differenceType,
                            this.sensitiveColumnkey,
                            this.maskingColumnkey,
                            this.schemaName,
                            this.objectName,
                            this.columnName,
                            this.sensitiveTypeId,
                            this.plannedAction,
                            this.syncStatus,
                            this.timeLastSynced);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DifferenceColumn model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("differenceType")) {
                this.differenceType(model.getDifferenceType());
            }
            if (model.wasPropertyExplicitlySet("sensitiveColumnkey")) {
                this.sensitiveColumnkey(model.getSensitiveColumnkey());
            }
            if (model.wasPropertyExplicitlySet("maskingColumnkey")) {
                this.maskingColumnkey(model.getMaskingColumnkey());
            }
            if (model.wasPropertyExplicitlySet("schemaName")) {
                this.schemaName(model.getSchemaName());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("columnName")) {
                this.columnName(model.getColumnName());
            }
            if (model.wasPropertyExplicitlySet("sensitiveTypeId")) {
                this.sensitiveTypeId(model.getSensitiveTypeId());
            }
            if (model.wasPropertyExplicitlySet("plannedAction")) {
                this.plannedAction(model.getPlannedAction());
            }
            if (model.wasPropertyExplicitlySet("syncStatus")) {
                this.syncStatus(model.getSyncStatus());
            }
            if (model.wasPropertyExplicitlySet("timeLastSynced")) {
                this.timeLastSynced(model.getTimeLastSynced());
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

    /** The unique key that identifies the SDM masking policy difference column. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The unique key that identifies the SDM masking policy difference column.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /**
     * The type of the SDM masking policy difference column. It can be one of the following three
     * types: NEW: A new sensitive column in the sensitive data model that is not in the masking
     * policy. DELETED: A column that is present in the masking policy but has been deleted from the
     * sensitive data model. MODIFIED: A column that is present in the masking policy as well as the
     * sensitive data model but some of its attributes have been modified.
     */
    public enum DifferenceType implements com.oracle.bmc.http.internal.BmcEnum {
        New("NEW"),
        Modified("MODIFIED"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DifferenceType.class);

        private final String value;
        private static java.util.Map<String, DifferenceType> map;

        static {
            map = new java.util.HashMap<>();
            for (DifferenceType v : DifferenceType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DifferenceType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DifferenceType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DifferenceType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the SDM masking policy difference column. It can be one of the following three
     * types: NEW: A new sensitive column in the sensitive data model that is not in the masking
     * policy. DELETED: A column that is present in the masking policy but has been deleted from the
     * sensitive data model. MODIFIED: A column that is present in the masking policy as well as the
     * sensitive data model but some of its attributes have been modified.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("differenceType")
    private final DifferenceType differenceType;

    /**
     * The type of the SDM masking policy difference column. It can be one of the following three
     * types: NEW: A new sensitive column in the sensitive data model that is not in the masking
     * policy. DELETED: A column that is present in the masking policy but has been deleted from the
     * sensitive data model. MODIFIED: A column that is present in the masking policy as well as the
     * sensitive data model but some of its attributes have been modified.
     *
     * @return the value
     */
    public DifferenceType getDifferenceType() {
        return differenceType;
    }

    /**
     * The unique key that identifies the sensitive column represented by the SDM masking policy
     * difference column.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveColumnkey")
    private final String sensitiveColumnkey;

    /**
     * The unique key that identifies the sensitive column represented by the SDM masking policy
     * difference column.
     *
     * @return the value
     */
    public String getSensitiveColumnkey() {
        return sensitiveColumnkey;
    }

    /**
     * The unique key that identifies the masking column represented by the SDM masking policy
     * difference column.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maskingColumnkey")
    private final String maskingColumnkey;

    /**
     * The unique key that identifies the masking column represented by the SDM masking policy
     * difference column.
     *
     * @return the value
     */
    public String getMaskingColumnkey() {
        return maskingColumnkey;
    }

    /** The database schema that contains the difference column. */
    @com.fasterxml.jackson.annotation.JsonProperty("schemaName")
    private final String schemaName;

    /**
     * The database schema that contains the difference column.
     *
     * @return the value
     */
    public String getSchemaName() {
        return schemaName;
    }

    /** The database object that contains the difference column. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * The database object that contains the difference column.
     *
     * @return the value
     */
    public String getObjectName() {
        return objectName;
    }

    /** The name of the difference column. */
    @com.fasterxml.jackson.annotation.JsonProperty("columnName")
    private final String columnName;

    /**
     * The name of the difference column.
     *
     * @return the value
     */
    public String getColumnName() {
        return columnName;
    }

    /** The OCID of the sensitive type associated with the difference column. */
    @com.fasterxml.jackson.annotation.JsonProperty("sensitiveTypeId")
    private final String sensitiveTypeId;

    /**
     * The OCID of the sensitive type associated with the difference column.
     *
     * @return the value
     */
    public String getSensitiveTypeId() {
        return sensitiveTypeId;
    }

    /**
     * Specifies how to process the difference column. It's set to SYNC by default. Use the
     * PatchSdmMaskingPolicyDifferenceColumns operation to update this attribute. You can choose one
     * of the following options: SYNC: To sync the difference column and update the masking policy
     * to reflect the changes. NO_SYNC: To not sync the difference column so that it doesn't change
     * the masking policy. After specifying the planned action, you can use the
     * ApplySdmMaskingPolicyDifference operation to automatically process the difference columns.
     */
    public enum PlannedAction implements com.oracle.bmc.http.internal.BmcEnum {
        Sync("SYNC"),
        NoSync("NO_SYNC"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PlannedAction.class);

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
     * Specifies how to process the difference column. It's set to SYNC by default. Use the
     * PatchSdmMaskingPolicyDifferenceColumns operation to update this attribute. You can choose one
     * of the following options: SYNC: To sync the difference column and update the masking policy
     * to reflect the changes. NO_SYNC: To not sync the difference column so that it doesn't change
     * the masking policy. After specifying the planned action, you can use the
     * ApplySdmMaskingPolicyDifference operation to automatically process the difference columns.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("plannedAction")
    private final PlannedAction plannedAction;

    /**
     * Specifies how to process the difference column. It's set to SYNC by default. Use the
     * PatchSdmMaskingPolicyDifferenceColumns operation to update this attribute. You can choose one
     * of the following options: SYNC: To sync the difference column and update the masking policy
     * to reflect the changes. NO_SYNC: To not sync the difference column so that it doesn't change
     * the masking policy. After specifying the planned action, you can use the
     * ApplySdmMaskingPolicyDifference operation to automatically process the difference columns.
     *
     * @return the value
     */
    public PlannedAction getPlannedAction() {
        return plannedAction;
    }

    /**
     * Indicates if the difference column has been processed. Use GetDifferenceColumn operation to
     * track whether the difference column has already been processed and applied to the masking
     * policy.
     */
    public enum SyncStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Synced("SYNCED"),
        NotSynced("NOT_SYNCED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SyncStatus.class);

        private final String value;
        private static java.util.Map<String, SyncStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (SyncStatus v : SyncStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SyncStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SyncStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SyncStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates if the difference column has been processed. Use GetDifferenceColumn operation to
     * track whether the difference column has already been processed and applied to the masking
     * policy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("syncStatus")
    private final SyncStatus syncStatus;

    /**
     * Indicates if the difference column has been processed. Use GetDifferenceColumn operation to
     * track whether the difference column has already been processed and applied to the masking
     * policy.
     *
     * @return the value
     */
    public SyncStatus getSyncStatus() {
        return syncStatus;
    }

    /**
     * The date and time the SDM masking policy difference column was last synced, in the format
     * defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastSynced")
    private final java.util.Date timeLastSynced;

    /**
     * The date and time the SDM masking policy difference column was last synced, in the format
     * defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeLastSynced() {
        return timeLastSynced;
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
        sb.append("DifferenceColumn(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", differenceType=").append(String.valueOf(this.differenceType));
        sb.append(", sensitiveColumnkey=").append(String.valueOf(this.sensitiveColumnkey));
        sb.append(", maskingColumnkey=").append(String.valueOf(this.maskingColumnkey));
        sb.append(", schemaName=").append(String.valueOf(this.schemaName));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", columnName=").append(String.valueOf(this.columnName));
        sb.append(", sensitiveTypeId=").append(String.valueOf(this.sensitiveTypeId));
        sb.append(", plannedAction=").append(String.valueOf(this.plannedAction));
        sb.append(", syncStatus=").append(String.valueOf(this.syncStatus));
        sb.append(", timeLastSynced=").append(String.valueOf(this.timeLastSynced));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DifferenceColumn)) {
            return false;
        }

        DifferenceColumn other = (DifferenceColumn) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.differenceType, other.differenceType)
                && java.util.Objects.equals(this.sensitiveColumnkey, other.sensitiveColumnkey)
                && java.util.Objects.equals(this.maskingColumnkey, other.maskingColumnkey)
                && java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.columnName, other.columnName)
                && java.util.Objects.equals(this.sensitiveTypeId, other.sensitiveTypeId)
                && java.util.Objects.equals(this.plannedAction, other.plannedAction)
                && java.util.Objects.equals(this.syncStatus, other.syncStatus)
                && java.util.Objects.equals(this.timeLastSynced, other.timeLastSynced)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result =
                (result * PRIME)
                        + (this.differenceType == null ? 43 : this.differenceType.hashCode());
        result =
                (result * PRIME)
                        + (this.sensitiveColumnkey == null
                                ? 43
                                : this.sensitiveColumnkey.hashCode());
        result =
                (result * PRIME)
                        + (this.maskingColumnkey == null ? 43 : this.maskingColumnkey.hashCode());
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.columnName == null ? 43 : this.columnName.hashCode());
        result =
                (result * PRIME)
                        + (this.sensitiveTypeId == null ? 43 : this.sensitiveTypeId.hashCode());
        result =
                (result * PRIME)
                        + (this.plannedAction == null ? 43 : this.plannedAction.hashCode());
        result = (result * PRIME) + (this.syncStatus == null ? 43 : this.syncStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastSynced == null ? 43 : this.timeLastSynced.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
