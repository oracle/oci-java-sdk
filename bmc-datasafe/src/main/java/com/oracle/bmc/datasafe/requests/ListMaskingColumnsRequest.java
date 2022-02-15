/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ListMaskingColumnsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListMaskingColumnsRequest.
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
public class ListMaskingColumnsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the masking policy.
     */
    private String maskingPolicyId;

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
     * The default order for other fields is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. You can specify only one sort order (sortOrder). The default order for timeCreated is descending.
     * The default order for other fields is ascending.
     *
     **/
    public enum SortBy {
        TimeCreated("timeCreated"),
        SchemaName("schemaName"),
        ObjectName("objectName"),
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
     * A filter to return only the resources that match the specified lifecycle states.
     */
    private com.oracle.bmc.datasafe.model.MaskingColumnLifecycleState maskingColumnLifecycleState;

    /**
     * A filter to return only resources that match the specified data types.
     */
    private java.util.List<DataType> dataType;

    /**
     * A filter to return only resources that match the specified data types.
     **/
    public enum DataType {
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
     * A filter to return only the resources that match the specified masking column group.
     */
    private java.util.List<String> maskingColumnGroup;

    /**
     * A filter to return only items related to a specific sensitive type OCID.
     */
    private String sensitiveTypeId;

    /**
     * A filter to return the masking column resources based on the value of their isMaskingEnabled attribute.
     * A value of true returns only those columns for which masking is enabled. A value of false returns only those columns
     * for which masking is disabled. Omitting this parameter returns all the masking columns in a masking policy.
     *
     */
    private Boolean isMaskingEnabled;

    /**
     * A filter to return masking columns based on whether the assigned masking formats need a
     * seed value for masking. A value of true returns those masking columns that are using
     * Deterministic Encryption or Deterministic Substitution masking format.
     *
     */
    private Boolean isSeedRequired;

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
     * Unique identifier for the request.
     */
    private String opcRequestId;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListMaskingColumnsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<DataType> dataType = null;

        /**
         * A filter to return only resources that match the specified data types.
         * @return this builder instance
         */
        public Builder dataType(java.util.List<DataType> dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * Singular setter. A filter to return only resources that match the specified data types.
         * @return this builder instance
         */
        public Builder dataType(DataType singularValue) {
            return this.dataType(java.util.Arrays.asList(singularValue));
        }

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

        private java.util.List<String> maskingColumnGroup = null;

        /**
         * A filter to return only the resources that match the specified masking column group.
         * @return this builder instance
         */
        public Builder maskingColumnGroup(java.util.List<String> maskingColumnGroup) {
            this.maskingColumnGroup = maskingColumnGroup;
            return this;
        }

        /**
         * Singular setter. A filter to return only the resources that match the specified masking column group.
         * @return this builder instance
         */
        public Builder maskingColumnGroup(String singularValue) {
            return this.maskingColumnGroup(java.util.Arrays.asList(singularValue));
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
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListMaskingColumnsRequest
         */
        public ListMaskingColumnsRequest build() {
            ListMaskingColumnsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
