/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.requests;

import com.oracle.bmc.databasemigration.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemigration/ListDataVerificationObjectTypeCountsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListDataVerificationObjectTypeCountsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
public class ListDataVerificationObjectTypeCountsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the migration
     *
     */
    private String migrationId;

    /**
     * The OCID of the migration
     *
     */
    public String getMigrationId() {
        return migrationId;
    }
    /**
     * The ID of the compartment in which to list resources.
     *
     */
    private String compartmentId;

    /**
     * The ID of the compartment in which to list resources.
     *
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * A filter to return only results for a specific schema/owner.
     *
     */
    private String schemaName;

    /**
     * A filter to return only results for a specific schema/owner.
     *
     */
    public String getSchemaName() {
        return schemaName;
    }
    /**
     * A filter to return only results for a specific object type.
     * <p>
     * The allowed values depend on the migration's {@code databaseCombination}:
     * - Oracle migrations: {@code OracleDatabaseObjectTypes}
     * - MySQL migrations: {@code MySqlDatabaseObjectTypes}
     *
     */
    private String objectType;

    /**
     * A filter to return only results for a specific object type.
     * <p>
     * The allowed values depend on the migration's {@code databaseCombination}:
     * - Oracle migrations: {@code OracleDatabaseObjectTypes}
     * - MySQL migrations: {@code MySqlDatabaseObjectTypes}
     *
     */
    public String getObjectType() {
        return objectType;
    }
    /**
     * Free-text filter applied by the service to relevant fields for the report.
     *
     */
    private String filter;

    /**
     * Free-text filter applied by the service to relevant fields for the report.
     *
     */
    public String getFilter() {
        return filter;
    }
    /**
     * Minimum absolute deltaPercent threshold (magnitude) to return.
     * The service filters results where {@code abs(deltaPercent) >= minAbsDeltaPercent}.
     * Must be non-negative.
     * <p>
     * Note: This filter applies to the object type counts report, which uses {@code deltaPercent}.
     * Table row count reports use {@code variancePercent} instead.
     *
     */
    private Double minAbsDeltaPercent;

    /**
     * Minimum absolute deltaPercent threshold (magnitude) to return.
     * The service filters results where {@code abs(deltaPercent) >= minAbsDeltaPercent}.
     * Must be non-negative.
     * <p>
     * Note: This filter applies to the object type counts report, which uses {@code deltaPercent}.
     * Table row count reports use {@code variancePercent} instead.
     *
     */
    public Double getMinAbsDeltaPercent() {
        return minAbsDeltaPercent;
    }
    /**
     * The maximum number of items to return.
     *
     */
    private Integer limit;

    /**
     * The maximum number of items to return.
     *
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     *
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The field to sort by. Only one sort order may be provided.
     * Default order for deltaPercent is descending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided.
     * Default order for deltaPercent is descending.
     *
     **/
    public enum SortBy {
        DeltaPercent("deltaPercent"),
        SchemaName("schemaName"),
        ObjectType("objectType"),
        SourceObjectCount("sourceObjectCount"),
        TargetObjectCount("targetObjectCount"),
        SourceInvalidCount("sourceInvalidCount"),
        TargetInvalidCount("targetInvalidCount"),
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
     * The field to sort by. Only one sort order may be provided.
     * Default order for deltaPercent is descending.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The sort order to use, either 'asc' or 'desc'.
     *
     */
    private com.oracle.bmc.databasemigration.model.SortOrders sortOrder;

    /**
     * The sort order to use, either 'asc' or 'desc'.
     *
     */
    public com.oracle.bmc.databasemigration.model.SortOrders getSortOrder() {
        return sortOrder;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListDataVerificationObjectTypeCountsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the migration
         *
         */
        private String migrationId = null;

        /**
         * The OCID of the migration
         *
         * @param migrationId the value to set
         * @return this builder instance
         */
        public Builder migrationId(String migrationId) {
            this.migrationId = migrationId;
            return this;
        }

        /**
         * The ID of the compartment in which to list resources.
         *
         */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * A filter to return only results for a specific schema/owner.
         *
         */
        private String schemaName = null;

        /**
         * A filter to return only results for a specific schema/owner.
         *
         * @param schemaName the value to set
         * @return this builder instance
         */
        public Builder schemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }

        /**
         * A filter to return only results for a specific object type.
         * <p>
         * The allowed values depend on the migration's {@code databaseCombination}:
         * - Oracle migrations: {@code OracleDatabaseObjectTypes}
         * - MySQL migrations: {@code MySqlDatabaseObjectTypes}
         *
         */
        private String objectType = null;

        /**
         * A filter to return only results for a specific object type.
         * <p>
         * The allowed values depend on the migration's {@code databaseCombination}:
         * - Oracle migrations: {@code OracleDatabaseObjectTypes}
         * - MySQL migrations: {@code MySqlDatabaseObjectTypes}
         *
         * @param objectType the value to set
         * @return this builder instance
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            return this;
        }

        /**
         * Free-text filter applied by the service to relevant fields for the report.
         *
         */
        private String filter = null;

        /**
         * Free-text filter applied by the service to relevant fields for the report.
         *
         * @param filter the value to set
         * @return this builder instance
         */
        public Builder filter(String filter) {
            this.filter = filter;
            return this;
        }

        /**
         * Minimum absolute deltaPercent threshold (magnitude) to return.
         * The service filters results where {@code abs(deltaPercent) >= minAbsDeltaPercent}.
         * Must be non-negative.
         * <p>
         * Note: This filter applies to the object type counts report, which uses {@code deltaPercent}.
         * Table row count reports use {@code variancePercent} instead.
         *
         */
        private Double minAbsDeltaPercent = null;

        /**
         * Minimum absolute deltaPercent threshold (magnitude) to return.
         * The service filters results where {@code abs(deltaPercent) >= minAbsDeltaPercent}.
         * Must be non-negative.
         * <p>
         * Note: This filter applies to the object type counts report, which uses {@code deltaPercent}.
         * Table row count reports use {@code variancePercent} instead.
         *
         * @param minAbsDeltaPercent the value to set
         * @return this builder instance
         */
        public Builder minAbsDeltaPercent(Double minAbsDeltaPercent) {
            this.minAbsDeltaPercent = minAbsDeltaPercent;
            return this;
        }

        /**
         * The maximum number of items to return.
         *
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         *
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided.
         * Default order for deltaPercent is descending.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided.
         * Default order for deltaPercent is descending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The sort order to use, either 'asc' or 'desc'.
         *
         */
        private com.oracle.bmc.databasemigration.model.SortOrders sortOrder = null;

        /**
         * The sort order to use, either 'asc' or 'desc'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.databasemigration.model.SortOrders sortOrder) {
            this.sortOrder = sortOrder;
            return this;
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
        public Builder copy(ListDataVerificationObjectTypeCountsRequest o) {
            migrationId(o.getMigrationId());
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            schemaName(o.getSchemaName());
            objectType(o.getObjectType());
            filter(o.getFilter());
            minAbsDeltaPercent(o.getMinAbsDeltaPercent());
            limit(o.getLimit());
            page(o.getPage());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListDataVerificationObjectTypeCountsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListDataVerificationObjectTypeCountsRequest
         */
        public ListDataVerificationObjectTypeCountsRequest build() {
            ListDataVerificationObjectTypeCountsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListDataVerificationObjectTypeCountsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListDataVerificationObjectTypeCountsRequest
         */
        public ListDataVerificationObjectTypeCountsRequest buildWithoutInvocationCallback() {
            ListDataVerificationObjectTypeCountsRequest request =
                    new ListDataVerificationObjectTypeCountsRequest();
            request.migrationId = migrationId;
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            request.schemaName = schemaName;
            request.objectType = objectType;
            request.filter = filter;
            request.minAbsDeltaPercent = minAbsDeltaPercent;
            request.limit = limit;
            request.page = page;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            return request;
            // new ListDataVerificationObjectTypeCountsRequest(migrationId, compartmentId, opcRequestId, ifMatch, schemaName, objectType, filter, minAbsDeltaPercent, limit, page, sortBy, sortOrder);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .migrationId(migrationId)
                .compartmentId(compartmentId)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch)
                .schemaName(schemaName)
                .objectType(objectType)
                .filter(filter)
                .minAbsDeltaPercent(minAbsDeltaPercent)
                .limit(limit)
                .page(page)
                .sortBy(sortBy)
                .sortOrder(sortOrder);
    }

    /**
     * Return a new builder for this request object.
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
        sb.append(",migrationId=").append(String.valueOf(this.migrationId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",schemaName=").append(String.valueOf(this.schemaName));
        sb.append(",objectType=").append(String.valueOf(this.objectType));
        sb.append(",filter=").append(String.valueOf(this.filter));
        sb.append(",minAbsDeltaPercent=").append(String.valueOf(this.minAbsDeltaPercent));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListDataVerificationObjectTypeCountsRequest)) {
            return false;
        }

        ListDataVerificationObjectTypeCountsRequest other =
                (ListDataVerificationObjectTypeCountsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.migrationId, other.migrationId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.schemaName, other.schemaName)
                && java.util.Objects.equals(this.objectType, other.objectType)
                && java.util.Objects.equals(this.filter, other.filter)
                && java.util.Objects.equals(this.minAbsDeltaPercent, other.minAbsDeltaPercent)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.migrationId == null ? 43 : this.migrationId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.schemaName == null ? 43 : this.schemaName.hashCode());
        result = (result * PRIME) + (this.objectType == null ? 43 : this.objectType.hashCode());
        result = (result * PRIME) + (this.filter == null ? 43 : this.filter.hashCode());
        result =
                (result * PRIME)
                        + (this.minAbsDeltaPercent == null
                                ? 43
                                : this.minAbsDeltaPercent.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        return result;
    }
}
