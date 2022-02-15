/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListSensitiveColumnsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSensitiveColumnsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class ListSensitiveColumnsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the sensitive data model.
     */
    private String sensitiveDataModelId;

    /**
     * A filter to return only the resources that were created after the specified date and time, as defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Using TimeCreatedGreaterThanOrEqualToQueryParam parameter retrieves all resources created after that date.
     * <p>
     **Example:** 2016-12-19T16:39:57.600Z
     *
     */
    private java.util.Date timeCreatedGreaterThanOrEqualTo;

    /**
     * Search for resources that were created before a specific date.
     * Specifying this parameter corresponding {@code timeCreatedLessThan}
     * parameter will retrieve all resources created before the
     * specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as
     * defined by RFC 3339.
     * <p>
     **Example:** 2016-12-19T16:39:57.600Z
     *
     */
    private java.util.Date timeCreatedLessThan;

    /**
     * Search for resources that were updated after a specific date.
     * Specifying this parameter corresponding {@code timeUpdatedGreaterThanOrEqualTo}
     * parameter will retrieve all resources updated after the
     * specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as
     * defined by RFC 3339.
     *
     */
    private java.util.Date timeUpdatedGreaterThanOrEqualTo;

    /**
     * Search for resources that were updated before a specific date.
     * Specifying this parameter corresponding {@code timeUpdatedLessThan}
     * parameter will retrieve all resources updated before the
     * specified created date, in "YYYY-MM-ddThh:mmZ" format with a Z offset, as
     * defined by RFC 3339.
     *
     */
    private java.util.Date timeUpdatedLessThan;

    /**
     * Filters the sensitive column resources with the given lifecycle state values.
     */
    private com.oracle.bmc.datasafe.model.SensitiveColumnLifecycleState
            sensitiveColumnLifecycleState;

    /**
     * A filter to return only items related to specific schema name.
     */
    private java.util.List<String> schemaName;

    /**
     * A filter to return only items related to a specific object name.
     */
    private java.util.List<String> objectName;

    /**
     * A filter to return only a specific column based on column name.
     */
    private java.util.List<String> columnName;

    /**
     * A filter to return only items related to a specific object type.
     */
    private java.util.List<ObjectType> objectType;

    /**
     * A filter to return only items related to a specific object type.
     **/
    public enum ObjectType {
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
    /**
     * A filter to return only the resources that match the specified data types.
     */
    private java.util.List<String> dataType;

    /**
     * A filter to return only the sensitive columns that match the specified status.
     */
    private java.util.List<Status> status;

    /**
     * A filter to return only the sensitive columns that match the specified status.
     **/
    public enum Status {
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
    /**
     * A filter to return only the sensitive columns that are associated with one of the sensitive types identified by the specified OCIDs.
     */
    private java.util.List<String> sensitiveTypeId;

    /**
     * A filter to return only the sensitive columns that are children of one of the columns identified by the specified keys.
     */
    private java.util.List<String> parentColumnKey;

    /**
     * A filter to return sensitive columns based on their relationship with their parent columns. If set to NONE,
     * it returns the sensitive columns that do not have any parent. The response includes the parent columns as
     * well as the independent columns that are not in any relationship. If set to APP_DEFINED, it returns all the
     * child columns that have application-level (non-dictionary) relationship with their parents. If set to DB_DEFINED,
     * it returns all the child columns that have database-level (dictionary-defined) relationship with their parents.
     *
     */
    private java.util.List<RelationType> relationType;

    /**
     * A filter to return sensitive columns based on their relationship with their parent columns. If set to NONE,
     * it returns the sensitive columns that do not have any parent. The response includes the parent columns as
     * well as the independent columns that are not in any relationship. If set to APP_DEFINED, it returns all the
     * child columns that have application-level (non-dictionary) relationship with their parents. If set to DB_DEFINED,
     * it returns all the child columns that have database-level (dictionary-defined) relationship with their parents.
     *
     **/
    public enum RelationType {
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
     * A filter to return only the sensitive columns that belong to the specified column group.
     */
    private String columnGroup;

    /**
     * For list pagination. The maximum number of items to return per page in a paginated "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * For list pagination. The page token representing the page at which to start retrieving results. It is usually retrieved from a previous "List" call. For details about how pagination works, see [List Pagination](https://docs.cloud.oracle.com/en-us/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * The sort order to use, either ascending (ASC) or descending (DESC).
     */
    private SortOrder sortOrder;

    /**
     * The sort order to use, either ascending (ASC) or descending (DESC).
     **/
    public enum SortOrder {
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
    /**
     * The field to sort by. You can specify only one sort order (sortOrder). The default order for timeCreated is descending.
     * The default order for schemaName, objectName, and columnName is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can specify only one sort order (sortOrder). The default order for timeCreated is descending.
     * The default order for schemaName, objectName, and columnName is ascending.
     *
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
        SchemaName("schemaName"),
        ObjectName("objectName"),
        ColumnName("columnName"),
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
     * Unique identifier for the request.
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSensitiveColumnsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<String> schemaName = null;

        /**
         * A filter to return only items related to specific schema name.
         * @return this builder instance
         */
        public Builder schemaName(java.util.List<String> schemaName) {
            this.schemaName = schemaName;
            return this;
        }

        /**
         * Singular setter. A filter to return only items related to specific schema name.
         * @return this builder instance
         */
        public Builder schemaName(String singularValue) {
            return this.schemaName(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> objectName = null;

        /**
         * A filter to return only items related to a specific object name.
         * @return this builder instance
         */
        public Builder objectName(java.util.List<String> objectName) {
            this.objectName = objectName;
            return this;
        }

        /**
         * Singular setter. A filter to return only items related to a specific object name.
         * @return this builder instance
         */
        public Builder objectName(String singularValue) {
            return this.objectName(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> columnName = null;

        /**
         * A filter to return only a specific column based on column name.
         * @return this builder instance
         */
        public Builder columnName(java.util.List<String> columnName) {
            this.columnName = columnName;
            return this;
        }

        /**
         * Singular setter. A filter to return only a specific column based on column name.
         * @return this builder instance
         */
        public Builder columnName(String singularValue) {
            return this.columnName(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<ObjectType> objectType = null;

        /**
         * A filter to return only items related to a specific object type.
         * @return this builder instance
         */
        public Builder objectType(java.util.List<ObjectType> objectType) {
            this.objectType = objectType;
            return this;
        }

        /**
         * Singular setter. A filter to return only items related to a specific object type.
         * @return this builder instance
         */
        public Builder objectType(ObjectType singularValue) {
            return this.objectType(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> dataType = null;

        /**
         * A filter to return only the resources that match the specified data types.
         * @return this builder instance
         */
        public Builder dataType(java.util.List<String> dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * Singular setter. A filter to return only the resources that match the specified data types.
         * @return this builder instance
         */
        public Builder dataType(String singularValue) {
            return this.dataType(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<Status> status = null;

        /**
         * A filter to return only the sensitive columns that match the specified status.
         * @return this builder instance
         */
        public Builder status(java.util.List<Status> status) {
            this.status = status;
            return this;
        }

        /**
         * Singular setter. A filter to return only the sensitive columns that match the specified status.
         * @return this builder instance
         */
        public Builder status(Status singularValue) {
            return this.status(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> sensitiveTypeId = null;

        /**
         * A filter to return only the sensitive columns that are associated with one of the sensitive types identified by the specified OCIDs.
         * @return this builder instance
         */
        public Builder sensitiveTypeId(java.util.List<String> sensitiveTypeId) {
            this.sensitiveTypeId = sensitiveTypeId;
            return this;
        }

        /**
         * Singular setter. A filter to return only the sensitive columns that are associated with one of the sensitive types identified by the specified OCIDs.
         * @return this builder instance
         */
        public Builder sensitiveTypeId(String singularValue) {
            return this.sensitiveTypeId(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<String> parentColumnKey = null;

        /**
         * A filter to return only the sensitive columns that are children of one of the columns identified by the specified keys.
         * @return this builder instance
         */
        public Builder parentColumnKey(java.util.List<String> parentColumnKey) {
            this.parentColumnKey = parentColumnKey;
            return this;
        }

        /**
         * Singular setter. A filter to return only the sensitive columns that are children of one of the columns identified by the specified keys.
         * @return this builder instance
         */
        public Builder parentColumnKey(String singularValue) {
            return this.parentColumnKey(java.util.Arrays.asList(singularValue));
        }

        private java.util.List<RelationType> relationType = null;

        /**
         * A filter to return sensitive columns based on their relationship with their parent columns. If set to NONE,
         * it returns the sensitive columns that do not have any parent. The response includes the parent columns as
         * well as the independent columns that are not in any relationship. If set to APP_DEFINED, it returns all the
         * child columns that have application-level (non-dictionary) relationship with their parents. If set to DB_DEFINED,
         * it returns all the child columns that have database-level (dictionary-defined) relationship with their parents.
         *
         * @return this builder instance
         */
        public Builder relationType(java.util.List<RelationType> relationType) {
            this.relationType = relationType;
            return this;
        }

        /**
         * Singular setter. A filter to return sensitive columns based on their relationship with their parent columns. If set to NONE,
         * it returns the sensitive columns that do not have any parent. The response includes the parent columns as
         * well as the independent columns that are not in any relationship. If set to APP_DEFINED, it returns all the
         * child columns that have application-level (non-dictionary) relationship with their parents. If set to DB_DEFINED,
         * it returns all the child columns that have database-level (dictionary-defined) relationship with their parents.
         *
         * @return this builder instance
         */
        public Builder relationType(RelationType singularValue) {
            return this.relationType(java.util.Arrays.asList(singularValue));
        }

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
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
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListSensitiveColumnsRequest
         */
        public ListSensitiveColumnsRequest build() {
            ListSensitiveColumnsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
