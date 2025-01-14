/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListMaskingColumnsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListMaskingColumnsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListMaskingColumnsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the masking policy. */
    private String maskingPolicyId;

    /** The OCID of the masking policy. */
    public String getMaskingPolicyId() {
        return maskingPolicyId;
    }
    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List"
     * call. For details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List"
     * call. For details about how pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The page token representing the page at which to start retrieving
     * results. It is usually retrieved from a previous "List" call. For details about how
     * pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The page token representing the page at which to start retrieving
     * results. It is usually retrieved from a previous "List" call. For details about how
     * pagination works, see [List
     * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /** The sort order to use, either ascending (ASC) or descending (DESC). */
    private SortOrder sortOrder;

    /** The sort order to use, either ascending (ASC) or descending (DESC). */
    public enum SortOrder implements com.oracle.bmc.http.internal.BmcEnum {
        Asc("ASC"),
        Desc("DESC"),
        ;

        private final String value;
        private static java.util.Map<String, SortOrder> map;

        static {
            map = new java.util.HashMap<>();
            for (SortOrder v : SortOrder.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortOrder(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortOrder create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortOrder: " + key);
        }
    };

    /** The sort order to use, either ascending (ASC) or descending (DESC). */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. You can specify only one sorting parameter (sortOrder). The default
     * order for timeCreated is descending. The default order for other fields is ascending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can specify only one sorting parameter (sortOrder). The default
     * order for timeCreated is descending. The default order for other fields is ascending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        SchemaName("schemaName"),
        ObjectName("objectName"),
        DataType("dataType"),
        ;

        private final String value;
        private static java.util.Map<String, SortBy> map;

        static {
            map = new java.util.HashMap<>();
            for (SortBy v : SortBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        SortBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SortBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SortBy: " + key);
        }
    };

    /**
     * The field to sort by. You can specify only one sorting parameter (sortOrder). The default
     * order for timeCreated is descending. The default order for other fields is ascending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** A filter to return only the resources that match the specified lifecycle states. */
    private com.oracle.bmc.datasafe.model.MaskingColumnLifecycleState maskingColumnLifecycleState;

    /** A filter to return only the resources that match the specified lifecycle states. */
    public com.oracle.bmc.datasafe.model.MaskingColumnLifecycleState
            getMaskingColumnLifecycleState() {
        return maskingColumnLifecycleState;
    }
    /** A filter to return only resources that match the specified data types. */
    private java.util.List<DataType> dataType;

    /** A filter to return only resources that match the specified data types. */
    public enum DataType implements com.oracle.bmc.http.internal.BmcEnum {
        Character("CHARACTER"),
        Date("DATE"),
        Lob("LOB"),
        Numeric("NUMERIC"),
        ;

        private final String value;
        private static java.util.Map<String, DataType> map;

        static {
            map = new java.util.HashMap<>();
            for (DataType v : DataType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid DataType: " + key);
        }
    };

    /** A filter to return only resources that match the specified data types. */
    public java.util.List<DataType> getDataType() {
        return dataType;
    }
    /** A filter to return only items related to specific schema name. */
    private java.util.List<String> schemaName;

    /** A filter to return only items related to specific schema name. */
    public java.util.List<String> getSchemaName() {
        return schemaName;
    }
    /** A filter to return only items related to a specific object name. */
    private java.util.List<String> objectName;

    /** A filter to return only items related to a specific object name. */
    public java.util.List<String> getObjectName() {
        return objectName;
    }
    /** A filter to return only a specific column based on column name. */
    private java.util.List<String> columnName;

    /** A filter to return only a specific column based on column name. */
    public java.util.List<String> getColumnName() {
        return columnName;
    }
    /** A filter to return only items related to a specific object type. */
    private java.util.List<ObjectType> objectType;

    /** A filter to return only items related to a specific object type. */
    public enum ObjectType implements com.oracle.bmc.http.internal.BmcEnum {
        All("ALL"),
        Table("TABLE"),
        EditioningView("EDITIONING_VIEW"),
        ;

        private final String value;
        private static java.util.Map<String, ObjectType> map;

        static {
            map = new java.util.HashMap<>();
            for (ObjectType v : ObjectType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid ObjectType: " + key);
        }
    };

    /** A filter to return only items related to a specific object type. */
    public java.util.List<ObjectType> getObjectType() {
        return objectType;
    }
    /** A filter to return only the resources that match the specified masking column group. */
    private java.util.List<String> maskingColumnGroup;

    /** A filter to return only the resources that match the specified masking column group. */
    public java.util.List<String> getMaskingColumnGroup() {
        return maskingColumnGroup;
    }
    /** A filter to return only items related to a specific sensitive type OCID. */
    private String sensitiveTypeId;

    /** A filter to return only items related to a specific sensitive type OCID. */
    public String getSensitiveTypeId() {
        return sensitiveTypeId;
    }
    /**
     * A filter to return the masking column resources based on the value of their isMaskingEnabled
     * attribute. A value of true returns only those columns for which masking is enabled. A value
     * of false returns only those columns for which masking is disabled. Omitting this parameter
     * returns all the masking columns in a masking policy.
     */
    private Boolean isMaskingEnabled;

    /**
     * A filter to return the masking column resources based on the value of their isMaskingEnabled
     * attribute. A value of true returns only those columns for which masking is enabled. A value
     * of false returns only those columns for which masking is disabled. Omitting this parameter
     * returns all the masking columns in a masking policy.
     */
    public Boolean getIsMaskingEnabled() {
        return isMaskingEnabled;
    }
    /**
     * A filter to return masking columns based on whether the assigned masking formats need a seed
     * value for masking. A value of true returns those masking columns that are using Deterministic
     * Encryption or Deterministic Substitution masking format.
     */
    private Boolean isSeedRequired;

    /**
     * A filter to return masking columns based on whether the assigned masking formats need a seed
     * value for masking. A value of true returns those masking columns that are using Deterministic
     * Encryption or Deterministic Substitution masking format.
     */
    public Boolean getIsSeedRequired() {
        return isSeedRequired;
    }
    /**
     * A filter to return only the resources that were created after the specified date and time, as
     * defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Using
     * TimeCreatedGreaterThanOrEqualToQueryParam parameter retrieves all resources created after
     * that date.
     *
     * <p>*Example:** 2016-12-19T16:39:57.600Z
     */
    private java.util.Date timeCreatedGreaterThanOrEqualTo;

    /**
     * A filter to return only the resources that were created after the specified date and time, as
     * defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Using
     * TimeCreatedGreaterThanOrEqualToQueryParam parameter retrieves all resources created after
     * that date.
     *
     * <p>*Example:** 2016-12-19T16:39:57.600Z
     */
    public java.util.Date getTimeCreatedGreaterThanOrEqualTo() {
        return timeCreatedGreaterThanOrEqualTo;
    }
    /**
     * Search for resources that were created before a specific date. Specifying this parameter
     * corresponding {@code timeCreatedLessThan} parameter will retrieve all resources created
     * before the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined
     * by RFC 3339.
     *
     * <p>*Example:** 2016-12-19T16:39:57.600Z
     */
    private java.util.Date timeCreatedLessThan;

    /**
     * Search for resources that were created before a specific date. Specifying this parameter
     * corresponding {@code timeCreatedLessThan} parameter will retrieve all resources created
     * before the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined
     * by RFC 3339.
     *
     * <p>*Example:** 2016-12-19T16:39:57.600Z
     */
    public java.util.Date getTimeCreatedLessThan() {
        return timeCreatedLessThan;
    }
    /**
     * Search for resources that were updated after a specific date. Specifying this parameter
     * corresponding {@code timeUpdatedGreaterThanOrEqualTo} parameter will retrieve all resources
     * updated after the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as
     * defined by RFC 3339.
     */
    private java.util.Date timeUpdatedGreaterThanOrEqualTo;

    /**
     * Search for resources that were updated after a specific date. Specifying this parameter
     * corresponding {@code timeUpdatedGreaterThanOrEqualTo} parameter will retrieve all resources
     * updated after the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as
     * defined by RFC 3339.
     */
    public java.util.Date getTimeUpdatedGreaterThanOrEqualTo() {
        return timeUpdatedGreaterThanOrEqualTo;
    }
    /**
     * Search for resources that were updated before a specific date. Specifying this parameter
     * corresponding {@code timeUpdatedLessThan} parameter will retrieve all resources updated
     * before the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined
     * by RFC 3339.
     */
    private java.util.Date timeUpdatedLessThan;

    /**
     * Search for resources that were updated before a specific date. Specifying this parameter
     * corresponding {@code timeUpdatedLessThan} parameter will retrieve all resources updated
     * before the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as defined
     * by RFC 3339.
     */
    public java.util.Date getTimeUpdatedLessThan() {
        return timeUpdatedLessThan;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListMaskingColumnsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the masking policy. */
        private String maskingPolicyId = null;

        /**
         * The OCID of the masking policy.
         *
         * @param maskingPolicyId the value to set
         * @return this builder instance
         */
        public Builder maskingPolicyId(String maskingPolicyId) {
            this.maskingPolicyId = maskingPolicyId;
            return this;
        }

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List"
         * call. For details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * For list pagination. The maximum number of items to return per page in a paginated "List"
         * call. For details about how pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The page token representing the page at which to start retrieving
         * results. It is usually retrieved from a previous "List" call. For details about how
         * pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The page token representing the page at which to start retrieving
         * results. It is usually retrieved from a previous "List" call. For details about how
         * pagination works, see [List
         * Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order to use, either ascending (ASC) or descending (DESC). */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, either ascending (ASC) or descending (DESC).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. You can specify only one sorting parameter (sortOrder). The default
         * order for timeCreated is descending. The default order for other fields is ascending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can specify only one sorting parameter (sortOrder). The default
         * order for timeCreated is descending. The default order for other fields is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** A filter to return only the resources that match the specified lifecycle states. */
        private com.oracle.bmc.datasafe.model.MaskingColumnLifecycleState
                maskingColumnLifecycleState = null;

        /**
         * A filter to return only the resources that match the specified lifecycle states.
         *
         * @param maskingColumnLifecycleState the value to set
         * @return this builder instance
         */
        public Builder maskingColumnLifecycleState(
                com.oracle.bmc.datasafe.model.MaskingColumnLifecycleState
                        maskingColumnLifecycleState) {
            this.maskingColumnLifecycleState = maskingColumnLifecycleState;
            return this;
        }

        /** A filter to return only resources that match the specified data types. */
        private java.util.List<DataType> dataType = null;

        /**
         * A filter to return only resources that match the specified data types.
         *
         * @param dataType the value to set
         * @return this builder instance
         */
        public Builder dataType(java.util.List<DataType> dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources that match the specified data types.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder dataType(DataType singularValue) {
            return this.dataType(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return only items related to specific schema name. */
        private java.util.List<String> schemaName = null;

        /**
         * A filter to return only items related to specific schema name.
         *
         * @param schemaName the value to set
         * @return this builder instance
         */
        public Builder schemaName(java.util.List<String> schemaName) {
            this.schemaName = schemaName;
            return this;
        }

        /**
         * Singular setter. A filter to return only items related to specific schema name.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder schemaName(String singularValue) {
            return this.schemaName(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return only items related to a specific object name. */
        private java.util.List<String> objectName = null;

        /**
         * A filter to return only items related to a specific object name.
         *
         * @param objectName the value to set
         * @return this builder instance
         */
        public Builder objectName(java.util.List<String> objectName) {
            this.objectName = objectName;
            return this;
        }

        /**
         * Singular setter. A filter to return only items related to a specific object name.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder objectName(String singularValue) {
            return this.objectName(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return only a specific column based on column name. */
        private java.util.List<String> columnName = null;

        /**
         * A filter to return only a specific column based on column name.
         *
         * @param columnName the value to set
         * @return this builder instance
         */
        public Builder columnName(java.util.List<String> columnName) {
            this.columnName = columnName;
            return this;
        }

        /**
         * Singular setter. A filter to return only a specific column based on column name.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder columnName(String singularValue) {
            return this.columnName(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return only items related to a specific object type. */
        private java.util.List<ObjectType> objectType = null;

        /**
         * A filter to return only items related to a specific object type.
         *
         * @param objectType the value to set
         * @return this builder instance
         */
        public Builder objectType(java.util.List<ObjectType> objectType) {
            this.objectType = objectType;
            return this;
        }

        /**
         * Singular setter. A filter to return only items related to a specific object type.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder objectType(ObjectType singularValue) {
            return this.objectType(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return only the resources that match the specified masking column group. */
        private java.util.List<String> maskingColumnGroup = null;

        /**
         * A filter to return only the resources that match the specified masking column group.
         *
         * @param maskingColumnGroup the value to set
         * @return this builder instance
         */
        public Builder maskingColumnGroup(java.util.List<String> maskingColumnGroup) {
            this.maskingColumnGroup = maskingColumnGroup;
            return this;
        }

        /**
         * Singular setter. A filter to return only the resources that match the specified masking
         * column group.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder maskingColumnGroup(String singularValue) {
            return this.maskingColumnGroup(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return only items related to a specific sensitive type OCID. */
        private String sensitiveTypeId = null;

        /**
         * A filter to return only items related to a specific sensitive type OCID.
         *
         * @param sensitiveTypeId the value to set
         * @return this builder instance
         */
        public Builder sensitiveTypeId(String sensitiveTypeId) {
            this.sensitiveTypeId = sensitiveTypeId;
            return this;
        }

        /**
         * A filter to return the masking column resources based on the value of their
         * isMaskingEnabled attribute. A value of true returns only those columns for which masking
         * is enabled. A value of false returns only those columns for which masking is disabled.
         * Omitting this parameter returns all the masking columns in a masking policy.
         */
        private Boolean isMaskingEnabled = null;

        /**
         * A filter to return the masking column resources based on the value of their
         * isMaskingEnabled attribute. A value of true returns only those columns for which masking
         * is enabled. A value of false returns only those columns for which masking is disabled.
         * Omitting this parameter returns all the masking columns in a masking policy.
         *
         * @param isMaskingEnabled the value to set
         * @return this builder instance
         */
        public Builder isMaskingEnabled(Boolean isMaskingEnabled) {
            this.isMaskingEnabled = isMaskingEnabled;
            return this;
        }

        /**
         * A filter to return masking columns based on whether the assigned masking formats need a
         * seed value for masking. A value of true returns those masking columns that are using
         * Deterministic Encryption or Deterministic Substitution masking format.
         */
        private Boolean isSeedRequired = null;

        /**
         * A filter to return masking columns based on whether the assigned masking formats need a
         * seed value for masking. A value of true returns those masking columns that are using
         * Deterministic Encryption or Deterministic Substitution masking format.
         *
         * @param isSeedRequired the value to set
         * @return this builder instance
         */
        public Builder isSeedRequired(Boolean isSeedRequired) {
            this.isSeedRequired = isSeedRequired;
            return this;
        }

        /**
         * A filter to return only the resources that were created after the specified date and
         * time, as defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Using
         * TimeCreatedGreaterThanOrEqualToQueryParam parameter retrieves all resources created after
         * that date.
         *
         * <p>*Example:** 2016-12-19T16:39:57.600Z
         */
        private java.util.Date timeCreatedGreaterThanOrEqualTo = null;

        /**
         * A filter to return only the resources that were created after the specified date and
         * time, as defined by [RFC3339](https://tools.ietf.org/html/rfc3339). Using
         * TimeCreatedGreaterThanOrEqualToQueryParam parameter retrieves all resources created after
         * that date.
         *
         * <p>*Example:** 2016-12-19T16:39:57.600Z
         *
         * @param timeCreatedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeCreatedGreaterThanOrEqualTo(
                java.util.Date timeCreatedGreaterThanOrEqualTo) {
            this.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            return this;
        }

        /**
         * Search for resources that were created before a specific date. Specifying this parameter
         * corresponding {@code timeCreatedLessThan} parameter will retrieve all resources created
         * before the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as
         * defined by RFC 3339.
         *
         * <p>*Example:** 2016-12-19T16:39:57.600Z
         */
        private java.util.Date timeCreatedLessThan = null;

        /**
         * Search for resources that were created before a specific date. Specifying this parameter
         * corresponding {@code timeCreatedLessThan} parameter will retrieve all resources created
         * before the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as
         * defined by RFC 3339.
         *
         * <p>*Example:** 2016-12-19T16:39:57.600Z
         *
         * @param timeCreatedLessThan the value to set
         * @return this builder instance
         */
        public Builder timeCreatedLessThan(java.util.Date timeCreatedLessThan) {
            this.timeCreatedLessThan = timeCreatedLessThan;
            return this;
        }

        /**
         * Search for resources that were updated after a specific date. Specifying this parameter
         * corresponding {@code timeUpdatedGreaterThanOrEqualTo} parameter will retrieve all
         * resources updated after the specified created date, in "YYYY-MM-ddThh:mmZ" format with a
         * Z offset, as defined by RFC 3339.
         */
        private java.util.Date timeUpdatedGreaterThanOrEqualTo = null;

        /**
         * Search for resources that were updated after a specific date. Specifying this parameter
         * corresponding {@code timeUpdatedGreaterThanOrEqualTo} parameter will retrieve all
         * resources updated after the specified created date, in "YYYY-MM-ddThh:mmZ" format with a
         * Z offset, as defined by RFC 3339.
         *
         * @param timeUpdatedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeUpdatedGreaterThanOrEqualTo(
                java.util.Date timeUpdatedGreaterThanOrEqualTo) {
            this.timeUpdatedGreaterThanOrEqualTo = timeUpdatedGreaterThanOrEqualTo;
            return this;
        }

        /**
         * Search for resources that were updated before a specific date. Specifying this parameter
         * corresponding {@code timeUpdatedLessThan} parameter will retrieve all resources updated
         * before the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as
         * defined by RFC 3339.
         */
        private java.util.Date timeUpdatedLessThan = null;

        /**
         * Search for resources that were updated before a specific date. Specifying this parameter
         * corresponding {@code timeUpdatedLessThan} parameter will retrieve all resources updated
         * before the specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as
         * defined by RFC 3339.
         *
         * @param timeUpdatedLessThan the value to set
         * @return this builder instance
         */
        public Builder timeUpdatedLessThan(java.util.Date timeUpdatedLessThan) {
            this.timeUpdatedLessThan = timeUpdatedLessThan;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        public Builder copy(ListMaskingColumnsRequest o) {
            maskingPolicyId(o.getMaskingPolicyId());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            maskingColumnLifecycleState(o.getMaskingColumnLifecycleState());
            dataType(o.getDataType());
            schemaName(o.getSchemaName());
            objectName(o.getObjectName());
            columnName(o.getColumnName());
            objectType(o.getObjectType());
            maskingColumnGroup(o.getMaskingColumnGroup());
            sensitiveTypeId(o.getSensitiveTypeId());
            isMaskingEnabled(o.getIsMaskingEnabled());
            isSeedRequired(o.getIsSeedRequired());
            timeCreatedGreaterThanOrEqualTo(o.getTimeCreatedGreaterThanOrEqualTo());
            timeCreatedLessThan(o.getTimeCreatedLessThan());
            timeUpdatedGreaterThanOrEqualTo(o.getTimeUpdatedGreaterThanOrEqualTo());
            timeUpdatedLessThan(o.getTimeUpdatedLessThan());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListMaskingColumnsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListMaskingColumnsRequest
         */
        public ListMaskingColumnsRequest build() {
            ListMaskingColumnsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListMaskingColumnsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListMaskingColumnsRequest
         */
        public ListMaskingColumnsRequest buildWithoutInvocationCallback() {
            ListMaskingColumnsRequest request = new ListMaskingColumnsRequest();
            request.maskingPolicyId = maskingPolicyId;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.maskingColumnLifecycleState = maskingColumnLifecycleState;
            request.dataType = dataType;
            request.schemaName = schemaName;
            request.objectName = objectName;
            request.columnName = columnName;
            request.objectType = objectType;
            request.maskingColumnGroup = maskingColumnGroup;
            request.sensitiveTypeId = sensitiveTypeId;
            request.isMaskingEnabled = isMaskingEnabled;
            request.isSeedRequired = isSeedRequired;
            request.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            request.timeCreatedLessThan = timeCreatedLessThan;
            request.timeUpdatedGreaterThanOrEqualTo = timeUpdatedGreaterThanOrEqualTo;
            request.timeUpdatedLessThan = timeUpdatedLessThan;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListMaskingColumnsRequest(maskingPolicyId, limit, page, sortOrder, sortBy,
            // maskingColumnLifecycleState, dataType, schemaName, objectName, columnName,
            // objectType, maskingColumnGroup, sensitiveTypeId, isMaskingEnabled, isSeedRequired,
            // timeCreatedGreaterThanOrEqualTo, timeCreatedLessThan,
            // timeUpdatedGreaterThanOrEqualTo, timeUpdatedLessThan, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .maskingPolicyId(maskingPolicyId)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .maskingColumnLifecycleState(maskingColumnLifecycleState)
                .dataType(dataType)
                .schemaName(schemaName)
                .objectName(objectName)
                .columnName(columnName)
                .objectType(objectType)
                .maskingColumnGroup(maskingColumnGroup)
                .sensitiveTypeId(sensitiveTypeId)
                .isMaskingEnabled(isMaskingEnabled)
                .isSeedRequired(isSeedRequired)
                .timeCreatedGreaterThanOrEqualTo(timeCreatedGreaterThanOrEqualTo)
                .timeCreatedLessThan(timeCreatedLessThan)
                .timeUpdatedGreaterThanOrEqualTo(timeUpdatedGreaterThanOrEqualTo)
                .timeUpdatedLessThan(timeUpdatedLessThan)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
     *
     * @return builder for the request object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",maskingPolicyId=").append(String.valueOf(this.maskingPolicyId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",maskingColumnLifecycleState=")
                .append(String.valueOf(this.maskingColumnLifecycleState));
        sb.append(",dataType=").append(String.valueOf(this.dataType));
        sb.append(",schemaName=").append(String.valueOf(this.schemaName));
        sb.append(",objectName=").append(String.valueOf(this.objectName));
        sb.append(",columnName=").append(String.valueOf(this.columnName));
        sb.append(",objectType=").append(String.valueOf(this.objectType));
        sb.append(",maskingColumnGroup=").append(String.valueOf(this.maskingColumnGroup));
        sb.append(",sensitiveTypeId=").append(String.valueOf(this.sensitiveTypeId));
        sb.append(",isMaskingEnabled=").append(String.valueOf(this.isMaskingEnabled));
        sb.append(",isSeedRequired=").append(String.valueOf(this.isSeedRequired));
        sb.append(",timeCreatedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeCreatedGreaterThanOrEqualTo));
        sb.append(",timeCreatedLessThan=").append(String.valueOf(this.timeCreatedLessThan));
        sb.append(",timeUpdatedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeUpdatedGreaterThanOrEqualTo));
        sb.append(",timeUpdatedLessThan=").append(String.valueOf(this.timeUpdatedLessThan));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListMaskingColumnsRequest)) {
            return false;
        }

        ListMaskingColumnsRequest other = (ListMaskingColumnsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.maskingPolicyId, other.maskingPolicyId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(
                        this.maskingColumnLifecycleState, other.maskingColumnLifecycleState)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.columnName, other.columnName)
                && java.util.Objects.equals(this.objectType, other.objectType)
                && java.util.Objects.equals(this.maskingColumnGroup, other.maskingColumnGroup)
                && java.util.Objects.equals(this.sensitiveTypeId, other.sensitiveTypeId)
                && java.util.Objects.equals(this.isMaskingEnabled, other.isMaskingEnabled)
                && java.util.Objects.equals(this.isSeedRequired, other.isSeedRequired)
                && java.util.Objects.equals(
                        this.timeCreatedGreaterThanOrEqualTo, other.timeCreatedGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeCreatedLessThan, other.timeCreatedLessThan)
                && java.util.Objects.equals(
                        this.timeUpdatedGreaterThanOrEqualTo, other.timeUpdatedGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeUpdatedLessThan, other.timeUpdatedLessThan)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.maskingPolicyId == null ? 43 : this.maskingPolicyId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result =
                (result * PRIME)
                        + (this.maskingColumnLifecycleState == null
                                ? 43
                                : this.maskingColumnLifecycleState.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.columnName == null ? 43 : this.columnName.hashCode());
        result = (result * PRIME) + (this.objectType == null ? 43 : this.objectType.hashCode());
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
        result =
                (result * PRIME)
                        + (this.isSeedRequired == null ? 43 : this.isSeedRequired.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeCreatedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedLessThan == null
                                ? 43
                                : this.timeCreatedLessThan.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUpdatedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeUpdatedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeUpdatedLessThan == null
                                ? 43
                                : this.timeUpdatedLessThan.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
