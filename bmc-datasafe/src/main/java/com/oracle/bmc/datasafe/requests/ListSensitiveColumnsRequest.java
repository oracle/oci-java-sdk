/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListSensitiveColumnsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSensitiveColumnsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ListSensitiveColumnsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the sensitive data model. */
    private String sensitiveDataModelId;

    /** The OCID of the sensitive data model. */
    public String getSensitiveDataModelId() {
        return sensitiveDataModelId;
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
    /** Filters the sensitive column resources with the given lifecycle state values. */
    private com.oracle.bmc.datasafe.model.SensitiveColumnLifecycleState
            sensitiveColumnLifecycleState;

    /** Filters the sensitive column resources with the given lifecycle state values. */
    public com.oracle.bmc.datasafe.model.SensitiveColumnLifecycleState
            getSensitiveColumnLifecycleState() {
        return sensitiveColumnLifecycleState;
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
    /** A filter to return only the resources that match the specified data types. */
    private java.util.List<String> dataType;

    /** A filter to return only the resources that match the specified data types. */
    public java.util.List<String> getDataType() {
        return dataType;
    }
    /** A filter to return only the sensitive columns that match the specified status. */
    private java.util.List<Status> status;

    /** A filter to return only the sensitive columns that match the specified status. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Valid("VALID"),
        Invalid("INVALID"),
        ;

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Status: " + key);
        }
    };

    /** A filter to return only the sensitive columns that match the specified status. */
    public java.util.List<Status> getStatus() {
        return status;
    }
    /**
     * A filter to return only the sensitive columns that are associated with one of the sensitive
     * types identified by the specified OCIDs.
     */
    private java.util.List<String> sensitiveTypeId;

    /**
     * A filter to return only the sensitive columns that are associated with one of the sensitive
     * types identified by the specified OCIDs.
     */
    public java.util.List<String> getSensitiveTypeId() {
        return sensitiveTypeId;
    }
    /**
     * A filter to return only the sensitive columns that are children of one of the columns
     * identified by the specified keys.
     */
    private java.util.List<String> parentColumnKey;

    /**
     * A filter to return only the sensitive columns that are children of one of the columns
     * identified by the specified keys.
     */
    public java.util.List<String> getParentColumnKey() {
        return parentColumnKey;
    }
    /**
     * A filter to return sensitive columns based on their relationship with their parent columns.
     * If set to NONE, it returns the sensitive columns that do not have any parent. The response
     * includes the parent columns as well as the independent columns that are not in any
     * relationship. If set to APP_DEFINED, it returns all the child columns that have
     * application-level (non-dictionary) relationship with their parents. If set to DB_DEFINED, it
     * returns all the child columns that have database-level (dictionary-defined) relationship with
     * their parents.
     */
    private java.util.List<RelationType> relationType;

    /**
     * A filter to return sensitive columns based on their relationship with their parent columns.
     * If set to NONE, it returns the sensitive columns that do not have any parent. The response
     * includes the parent columns as well as the independent columns that are not in any
     * relationship. If set to APP_DEFINED, it returns all the child columns that have
     * application-level (non-dictionary) relationship with their parents. If set to DB_DEFINED, it
     * returns all the child columns that have database-level (dictionary-defined) relationship with
     * their parents.
     */
    public enum RelationType implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        AppDefined("APP_DEFINED"),
        DbDefined("DB_DEFINED"),
        ;

        private final String value;
        private static java.util.Map<String, RelationType> map;

        static {
            map = new java.util.HashMap<>();
            for (RelationType v : RelationType.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid RelationType: " + key);
        }
    };

    /**
     * A filter to return sensitive columns based on their relationship with their parent columns.
     * If set to NONE, it returns the sensitive columns that do not have any parent. The response
     * includes the parent columns as well as the independent columns that are not in any
     * relationship. If set to APP_DEFINED, it returns all the child columns that have
     * application-level (non-dictionary) relationship with their parents. If set to DB_DEFINED, it
     * returns all the child columns that have database-level (dictionary-defined) relationship with
     * their parents.
     */
    public java.util.List<RelationType> getRelationType() {
        return relationType;
    }
    /** A filter to return only the sensitive columns that belong to the specified column group. */
    private String columnGroup;

    /** A filter to return only the sensitive columns that belong to the specified column group. */
    public String getColumnGroup() {
        return columnGroup;
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
     * The field to sort by. You can specify only one sort order (sortOrder). The default order for
     * timeCreated is descending. The default order for schemaName, objectName, and columnName is
     * ascending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can specify only one sort order (sortOrder). The default order for
     * timeCreated is descending. The default order for schemaName, objectName, and columnName is
     * ascending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        SchemaName("schemaName"),
        ObjectName("objectName"),
        ColumnName("columnName"),
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
     * The field to sort by. You can specify only one sort order (sortOrder). The default order for
     * timeCreated is descending. The default order for schemaName, objectName, and columnName is
     * ascending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSensitiveColumnsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the sensitive data model. */
        private String sensitiveDataModelId = null;

        /**
         * The OCID of the sensitive data model.
         *
         * @param sensitiveDataModelId the value to set
         * @return this builder instance
         */
        public Builder sensitiveDataModelId(String sensitiveDataModelId) {
            this.sensitiveDataModelId = sensitiveDataModelId;
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

        /** Filters the sensitive column resources with the given lifecycle state values. */
        private com.oracle.bmc.datasafe.model.SensitiveColumnLifecycleState
                sensitiveColumnLifecycleState = null;

        /**
         * Filters the sensitive column resources with the given lifecycle state values.
         *
         * @param sensitiveColumnLifecycleState the value to set
         * @return this builder instance
         */
        public Builder sensitiveColumnLifecycleState(
                com.oracle.bmc.datasafe.model.SensitiveColumnLifecycleState
                        sensitiveColumnLifecycleState) {
            this.sensitiveColumnLifecycleState = sensitiveColumnLifecycleState;
            return this;
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

        /** A filter to return only the resources that match the specified data types. */
        private java.util.List<String> dataType = null;

        /**
         * A filter to return only the resources that match the specified data types.
         *
         * @param dataType the value to set
         * @return this builder instance
         */
        public Builder dataType(java.util.List<String> dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * Singular setter. A filter to return only the resources that match the specified data
         * types.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder dataType(String singularValue) {
            return this.dataType(java.util.Arrays.asList(singularValue));
        }

        /** A filter to return only the sensitive columns that match the specified status. */
        private java.util.List<Status> status = null;

        /**
         * A filter to return only the sensitive columns that match the specified status.
         *
         * @param status the value to set
         * @return this builder instance
         */
        public Builder status(java.util.List<Status> status) {
            this.status = status;
            return this;
        }

        /**
         * Singular setter. A filter to return only the sensitive columns that match the specified
         * status.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder status(Status singularValue) {
            return this.status(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return only the sensitive columns that are associated with one of the
         * sensitive types identified by the specified OCIDs.
         */
        private java.util.List<String> sensitiveTypeId = null;

        /**
         * A filter to return only the sensitive columns that are associated with one of the
         * sensitive types identified by the specified OCIDs.
         *
         * @param sensitiveTypeId the value to set
         * @return this builder instance
         */
        public Builder sensitiveTypeId(java.util.List<String> sensitiveTypeId) {
            this.sensitiveTypeId = sensitiveTypeId;
            return this;
        }

        /**
         * Singular setter. A filter to return only the sensitive columns that are associated with
         * one of the sensitive types identified by the specified OCIDs.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder sensitiveTypeId(String singularValue) {
            return this.sensitiveTypeId(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return only the sensitive columns that are children of one of the columns
         * identified by the specified keys.
         */
        private java.util.List<String> parentColumnKey = null;

        /**
         * A filter to return only the sensitive columns that are children of one of the columns
         * identified by the specified keys.
         *
         * @param parentColumnKey the value to set
         * @return this builder instance
         */
        public Builder parentColumnKey(java.util.List<String> parentColumnKey) {
            this.parentColumnKey = parentColumnKey;
            return this;
        }

        /**
         * Singular setter. A filter to return only the sensitive columns that are children of one
         * of the columns identified by the specified keys.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder parentColumnKey(String singularValue) {
            return this.parentColumnKey(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return sensitive columns based on their relationship with their parent
         * columns. If set to NONE, it returns the sensitive columns that do not have any parent.
         * The response includes the parent columns as well as the independent columns that are not
         * in any relationship. If set to APP_DEFINED, it returns all the child columns that have
         * application-level (non-dictionary) relationship with their parents. If set to DB_DEFINED,
         * it returns all the child columns that have database-level (dictionary-defined)
         * relationship with their parents.
         */
        private java.util.List<RelationType> relationType = null;

        /**
         * A filter to return sensitive columns based on their relationship with their parent
         * columns. If set to NONE, it returns the sensitive columns that do not have any parent.
         * The response includes the parent columns as well as the independent columns that are not
         * in any relationship. If set to APP_DEFINED, it returns all the child columns that have
         * application-level (non-dictionary) relationship with their parents. If set to DB_DEFINED,
         * it returns all the child columns that have database-level (dictionary-defined)
         * relationship with their parents.
         *
         * @param relationType the value to set
         * @return this builder instance
         */
        public Builder relationType(java.util.List<RelationType> relationType) {
            this.relationType = relationType;
            return this;
        }

        /**
         * Singular setter. A filter to return sensitive columns based on their relationship with
         * their parent columns. If set to NONE, it returns the sensitive columns that do not have
         * any parent. The response includes the parent columns as well as the independent columns
         * that are not in any relationship. If set to APP_DEFINED, it returns all the child columns
         * that have application-level (non-dictionary) relationship with their parents. If set to
         * DB_DEFINED, it returns all the child columns that have database-level
         * (dictionary-defined) relationship with their parents.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder relationType(RelationType singularValue) {
            return this.relationType(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter to return only the sensitive columns that belong to the specified column group.
         */
        private String columnGroup = null;

        /**
         * A filter to return only the sensitive columns that belong to the specified column group.
         *
         * @param columnGroup the value to set
         * @return this builder instance
         */
        public Builder columnGroup(String columnGroup) {
            this.columnGroup = columnGroup;
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
         * The field to sort by. You can specify only one sort order (sortOrder). The default order
         * for timeCreated is descending. The default order for schemaName, objectName, and
         * columnName is ascending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. You can specify only one sort order (sortOrder). The default order
         * for timeCreated is descending. The default order for schemaName, objectName, and
         * columnName is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListSensitiveColumnsRequest o) {
            sensitiveDataModelId(o.getSensitiveDataModelId());
            timeCreatedGreaterThanOrEqualTo(o.getTimeCreatedGreaterThanOrEqualTo());
            timeCreatedLessThan(o.getTimeCreatedLessThan());
            timeUpdatedGreaterThanOrEqualTo(o.getTimeUpdatedGreaterThanOrEqualTo());
            timeUpdatedLessThan(o.getTimeUpdatedLessThan());
            sensitiveColumnLifecycleState(o.getSensitiveColumnLifecycleState());
            schemaName(o.getSchemaName());
            objectName(o.getObjectName());
            columnName(o.getColumnName());
            objectType(o.getObjectType());
            dataType(o.getDataType());
            status(o.getStatus());
            sensitiveTypeId(o.getSensitiveTypeId());
            parentColumnKey(o.getParentColumnKey());
            relationType(o.getRelationType());
            columnGroup(o.getColumnGroup());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSensitiveColumnsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListSensitiveColumnsRequest
         */
        public ListSensitiveColumnsRequest build() {
            ListSensitiveColumnsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSensitiveColumnsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSensitiveColumnsRequest
         */
        public ListSensitiveColumnsRequest buildWithoutInvocationCallback() {
            ListSensitiveColumnsRequest request = new ListSensitiveColumnsRequest();
            request.sensitiveDataModelId = sensitiveDataModelId;
            request.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            request.timeCreatedLessThan = timeCreatedLessThan;
            request.timeUpdatedGreaterThanOrEqualTo = timeUpdatedGreaterThanOrEqualTo;
            request.timeUpdatedLessThan = timeUpdatedLessThan;
            request.sensitiveColumnLifecycleState = sensitiveColumnLifecycleState;
            request.schemaName = schemaName;
            request.objectName = objectName;
            request.columnName = columnName;
            request.objectType = objectType;
            request.dataType = dataType;
            request.status = status;
            request.sensitiveTypeId = sensitiveTypeId;
            request.parentColumnKey = parentColumnKey;
            request.relationType = relationType;
            request.columnGroup = columnGroup;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListSensitiveColumnsRequest(sensitiveDataModelId,
            // timeCreatedGreaterThanOrEqualTo, timeCreatedLessThan,
            // timeUpdatedGreaterThanOrEqualTo, timeUpdatedLessThan, sensitiveColumnLifecycleState,
            // schemaName, objectName, columnName, objectType, dataType, status, sensitiveTypeId,
            // parentColumnKey, relationType, columnGroup, limit, page, sortOrder, sortBy,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .sensitiveDataModelId(sensitiveDataModelId)
                .timeCreatedGreaterThanOrEqualTo(timeCreatedGreaterThanOrEqualTo)
                .timeCreatedLessThan(timeCreatedLessThan)
                .timeUpdatedGreaterThanOrEqualTo(timeUpdatedGreaterThanOrEqualTo)
                .timeUpdatedLessThan(timeUpdatedLessThan)
                .sensitiveColumnLifecycleState(sensitiveColumnLifecycleState)
                .schemaName(schemaName)
                .objectName(objectName)
                .columnName(columnName)
                .objectType(objectType)
                .dataType(dataType)
                .status(status)
                .sensitiveTypeId(sensitiveTypeId)
                .parentColumnKey(parentColumnKey)
                .relationType(relationType)
                .columnGroup(columnGroup)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
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
        sb.append(",sensitiveDataModelId=").append(String.valueOf(this.sensitiveDataModelId));
        sb.append(",timeCreatedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeCreatedGreaterThanOrEqualTo));
        sb.append(",timeCreatedLessThan=").append(String.valueOf(this.timeCreatedLessThan));
        sb.append(",timeUpdatedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeUpdatedGreaterThanOrEqualTo));
        sb.append(",timeUpdatedLessThan=").append(String.valueOf(this.timeUpdatedLessThan));
        sb.append(",sensitiveColumnLifecycleState=")
                .append(String.valueOf(this.sensitiveColumnLifecycleState));
        sb.append(",schemaName=").append(String.valueOf(this.schemaName));
        sb.append(",objectName=").append(String.valueOf(this.objectName));
        sb.append(",columnName=").append(String.valueOf(this.columnName));
        sb.append(",objectType=").append(String.valueOf(this.objectType));
        sb.append(",dataType=").append(String.valueOf(this.dataType));
        sb.append(",status=").append(String.valueOf(this.status));
        sb.append(",sensitiveTypeId=").append(String.valueOf(this.sensitiveTypeId));
        sb.append(",parentColumnKey=").append(String.valueOf(this.parentColumnKey));
        sb.append(",relationType=").append(String.valueOf(this.relationType));
        sb.append(",columnGroup=").append(String.valueOf(this.columnGroup));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListSensitiveColumnsRequest)) {
            return false;
        }

        ListSensitiveColumnsRequest other = (ListSensitiveColumnsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.sensitiveDataModelId, other.sensitiveDataModelId)
                && java.util.Objects.equals(
                        this.timeCreatedGreaterThanOrEqualTo, other.timeCreatedGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeCreatedLessThan, other.timeCreatedLessThan)
                && java.util.Objects.equals(
                        this.timeUpdatedGreaterThanOrEqualTo, other.timeUpdatedGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeUpdatedLessThan, other.timeUpdatedLessThan)
                && java.util.Objects.equals(
                        this.sensitiveColumnLifecycleState, other.sensitiveColumnLifecycleState)
                && java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.columnName, other.columnName)
                && java.util.Objects.equals(this.objectType, other.objectType)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.sensitiveTypeId, other.sensitiveTypeId)
                && java.util.Objects.equals(this.parentColumnKey, other.parentColumnKey)
                && java.util.Objects.equals(this.relationType, other.relationType)
                && java.util.Objects.equals(this.columnGroup, other.columnGroup)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.sensitiveDataModelId == null
                                ? 43
                                : this.sensitiveDataModelId.hashCode());
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
        result =
                (result * PRIME)
                        + (this.sensitiveColumnLifecycleState == null
                                ? 43
                                : this.sensitiveColumnLifecycleState.hashCode());
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.columnName == null ? 43 : this.columnName.hashCode());
        result = (result * PRIME) + (this.objectType == null ? 43 : this.objectType.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.sensitiveTypeId == null ? 43 : this.sensitiveTypeId.hashCode());
        result =
                (result * PRIME)
                        + (this.parentColumnKey == null ? 43 : this.parentColumnKey.hashCode());
        result = (result * PRIME) + (this.relationType == null ? 43 : this.relationType.hashCode());
        result = (result * PRIME) + (this.columnGroup == null ? 43 : this.columnGroup.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
