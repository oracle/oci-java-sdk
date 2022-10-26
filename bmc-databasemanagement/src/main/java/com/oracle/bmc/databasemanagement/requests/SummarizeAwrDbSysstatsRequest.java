/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/SummarizeAwrDbSysstatsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * SummarizeAwrDbSysstatsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class SummarizeAwrDbSysstatsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Managed Database.
     */
    private String managedDatabaseId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Managed Database.
     */
    public String getManagedDatabaseId() {
        return managedDatabaseId;
    }
    /**
     * The parameter to filter the database by internal ID. Note that the internal ID of the
     * database can be retrieved from the following endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbs
     */
    private String awrDbId;

    /**
     * The parameter to filter the database by internal ID. Note that the internal ID of the
     * database can be retrieved from the following endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbs
     */
    public String getAwrDbId() {
        return awrDbId;
    }
    /** The required multiple value query parameter to filter the entity name. */
    private java.util.List<String> name;

    /** The required multiple value query parameter to filter the entity name. */
    public java.util.List<String> getName() {
        return name;
    }
    /** The optional single value query parameter to filter the database instance number. */
    private String instNum;

    /** The optional single value query parameter to filter the database instance number. */
    public String getInstNum() {
        return instNum;
    }
    /** The optional greater than or equal to filter on the snapshot ID. */
    private Integer beginSnIdGreaterThanOrEqualTo;

    /** The optional greater than or equal to filter on the snapshot ID. */
    public Integer getBeginSnIdGreaterThanOrEqualTo() {
        return beginSnIdGreaterThanOrEqualTo;
    }
    /** The optional less than or equal to query parameter to filter the snapshot ID. */
    private Integer endSnIdLessThanOrEqualTo;

    /** The optional less than or equal to query parameter to filter the snapshot ID. */
    public Integer getEndSnIdLessThanOrEqualTo() {
        return endSnIdLessThanOrEqualTo;
    }
    /** The optional greater than or equal to query parameter to filter the timestamp. */
    private java.util.Date timeGreaterThanOrEqualTo;

    /** The optional greater than or equal to query parameter to filter the timestamp. */
    public java.util.Date getTimeGreaterThanOrEqualTo() {
        return timeGreaterThanOrEqualTo;
    }
    /** The optional less than or equal to query parameter to filter the timestamp. */
    private java.util.Date timeLessThanOrEqualTo;

    /** The optional less than or equal to query parameter to filter the timestamp. */
    public java.util.Date getTimeLessThanOrEqualTo() {
        return timeLessThanOrEqualTo;
    }
    /**
     * The optional query parameter to filter the database container by an exact ID value. Note that
     * the database container ID can be retrieved from the following endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbSnapshotRanges
     */
    private Integer containerId;

    /**
     * The optional query parameter to filter the database container by an exact ID value. Note that
     * the database container ID can be retrieved from the following endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbSnapshotRanges
     */
    public Integer getContainerId() {
        return containerId;
    }
    /**
     * The page token representing the page from where the next set of paginated results are
     * retrieved. This is usually retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page from where the next set of paginated results are
     * retrieved. This is usually retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /** The maximum number of records returned in large paginated response. */
    private Integer limit;

    /** The maximum number of records returned in large paginated response. */
    public Integer getLimit() {
        return limit;
    }
    /** The option to sort the data within a time period. */
    private SortBy sortBy;

    /** The option to sort the data within a time period. */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeBegin("TIME_BEGIN"),
        Name("NAME"),
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

    /** The option to sort the data within a time period. */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The option to sort information in ascending (\u2018ASC\u2019) or descending
     * (\u2018DESC\u2019) order. Descending order is the default order.
     */
    private com.oracle.bmc.databasemanagement.model.SortOrders sortOrder;

    /**
     * The option to sort information in ascending (\u2018ASC\u2019) or descending
     * (\u2018DESC\u2019) order. Descending order is the default order.
     */
    public com.oracle.bmc.databasemanagement.model.SortOrders getSortOrder() {
        return sortOrder;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SummarizeAwrDbSysstatsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Managed Database.
         */
        private String managedDatabaseId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Managed Database.
         *
         * @param managedDatabaseId the value to set
         * @return this builder instance
         */
        public Builder managedDatabaseId(String managedDatabaseId) {
            this.managedDatabaseId = managedDatabaseId;
            return this;
        }

        /**
         * The parameter to filter the database by internal ID. Note that the internal ID of the
         * database can be retrieved from the following endpoint:
         * /managedDatabases/{managedDatabaseId}/awrDbs
         */
        private String awrDbId = null;

        /**
         * The parameter to filter the database by internal ID. Note that the internal ID of the
         * database can be retrieved from the following endpoint:
         * /managedDatabases/{managedDatabaseId}/awrDbs
         *
         * @param awrDbId the value to set
         * @return this builder instance
         */
        public Builder awrDbId(String awrDbId) {
            this.awrDbId = awrDbId;
            return this;
        }

        /** The required multiple value query parameter to filter the entity name. */
        private java.util.List<String> name = null;

        /**
         * The required multiple value query parameter to filter the entity name.
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(java.util.List<String> name) {
            this.name = name;
            return this;
        }

        /**
         * Singular setter. The required multiple value query parameter to filter the entity name.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder name(String singularValue) {
            return this.name(java.util.Arrays.asList(singularValue));
        }

        /** The optional single value query parameter to filter the database instance number. */
        private String instNum = null;

        /**
         * The optional single value query parameter to filter the database instance number.
         *
         * @param instNum the value to set
         * @return this builder instance
         */
        public Builder instNum(String instNum) {
            this.instNum = instNum;
            return this;
        }

        /** The optional greater than or equal to filter on the snapshot ID. */
        private Integer beginSnIdGreaterThanOrEqualTo = null;

        /**
         * The optional greater than or equal to filter on the snapshot ID.
         *
         * @param beginSnIdGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder beginSnIdGreaterThanOrEqualTo(Integer beginSnIdGreaterThanOrEqualTo) {
            this.beginSnIdGreaterThanOrEqualTo = beginSnIdGreaterThanOrEqualTo;
            return this;
        }

        /** The optional less than or equal to query parameter to filter the snapshot ID. */
        private Integer endSnIdLessThanOrEqualTo = null;

        /**
         * The optional less than or equal to query parameter to filter the snapshot ID.
         *
         * @param endSnIdLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder endSnIdLessThanOrEqualTo(Integer endSnIdLessThanOrEqualTo) {
            this.endSnIdLessThanOrEqualTo = endSnIdLessThanOrEqualTo;
            return this;
        }

        /** The optional greater than or equal to query parameter to filter the timestamp. */
        private java.util.Date timeGreaterThanOrEqualTo = null;

        /**
         * The optional greater than or equal to query parameter to filter the timestamp.
         *
         * @param timeGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeGreaterThanOrEqualTo(java.util.Date timeGreaterThanOrEqualTo) {
            this.timeGreaterThanOrEqualTo = timeGreaterThanOrEqualTo;
            return this;
        }

        /** The optional less than or equal to query parameter to filter the timestamp. */
        private java.util.Date timeLessThanOrEqualTo = null;

        /**
         * The optional less than or equal to query parameter to filter the timestamp.
         *
         * @param timeLessThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeLessThanOrEqualTo(java.util.Date timeLessThanOrEqualTo) {
            this.timeLessThanOrEqualTo = timeLessThanOrEqualTo;
            return this;
        }

        /**
         * The optional query parameter to filter the database container by an exact ID value. Note
         * that the database container ID can be retrieved from the following endpoint:
         * /managedDatabases/{managedDatabaseId}/awrDbSnapshotRanges
         */
        private Integer containerId = null;

        /**
         * The optional query parameter to filter the database container by an exact ID value. Note
         * that the database container ID can be retrieved from the following endpoint:
         * /managedDatabases/{managedDatabaseId}/awrDbSnapshotRanges
         *
         * @param containerId the value to set
         * @return this builder instance
         */
        public Builder containerId(Integer containerId) {
            this.containerId = containerId;
            return this;
        }

        /**
         * The page token representing the page from where the next set of paginated results are
         * retrieved. This is usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page from where the next set of paginated results are
         * retrieved. This is usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The maximum number of records returned in large paginated response. */
        private Integer limit = null;

        /**
         * The maximum number of records returned in large paginated response.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /** The option to sort the data within a time period. */
        private SortBy sortBy = null;

        /**
         * The option to sort the data within a time period.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The option to sort information in ascending (\u2018ASC\u2019) or descending
         * (\u2018DESC\u2019) order. Descending order is the default order.
         */
        private com.oracle.bmc.databasemanagement.model.SortOrders sortOrder = null;

        /**
         * The option to sort information in ascending (\u2018ASC\u2019) or descending
         * (\u2018DESC\u2019) order. Descending order is the default order.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.databasemanagement.model.SortOrders sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(SummarizeAwrDbSysstatsRequest o) {
            managedDatabaseId(o.getManagedDatabaseId());
            awrDbId(o.getAwrDbId());
            name(o.getName());
            instNum(o.getInstNum());
            beginSnIdGreaterThanOrEqualTo(o.getBeginSnIdGreaterThanOrEqualTo());
            endSnIdLessThanOrEqualTo(o.getEndSnIdLessThanOrEqualTo());
            timeGreaterThanOrEqualTo(o.getTimeGreaterThanOrEqualTo());
            timeLessThanOrEqualTo(o.getTimeLessThanOrEqualTo());
            containerId(o.getContainerId());
            page(o.getPage());
            limit(o.getLimit());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SummarizeAwrDbSysstatsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of SummarizeAwrDbSysstatsRequest
         */
        public SummarizeAwrDbSysstatsRequest build() {
            SummarizeAwrDbSysstatsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of SummarizeAwrDbSysstatsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SummarizeAwrDbSysstatsRequest
         */
        public SummarizeAwrDbSysstatsRequest buildWithoutInvocationCallback() {
            SummarizeAwrDbSysstatsRequest request = new SummarizeAwrDbSysstatsRequest();
            request.managedDatabaseId = managedDatabaseId;
            request.awrDbId = awrDbId;
            request.name = name;
            request.instNum = instNum;
            request.beginSnIdGreaterThanOrEqualTo = beginSnIdGreaterThanOrEqualTo;
            request.endSnIdLessThanOrEqualTo = endSnIdLessThanOrEqualTo;
            request.timeGreaterThanOrEqualTo = timeGreaterThanOrEqualTo;
            request.timeLessThanOrEqualTo = timeLessThanOrEqualTo;
            request.containerId = containerId;
            request.page = page;
            request.limit = limit;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new SummarizeAwrDbSysstatsRequest(managedDatabaseId, awrDbId, name, instNum,
            // beginSnIdGreaterThanOrEqualTo, endSnIdLessThanOrEqualTo, timeGreaterThanOrEqualTo,
            // timeLessThanOrEqualTo, containerId, page, limit, sortBy, sortOrder, opcRequestId,
            // opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedDatabaseId(managedDatabaseId)
                .awrDbId(awrDbId)
                .name(name)
                .instNum(instNum)
                .beginSnIdGreaterThanOrEqualTo(beginSnIdGreaterThanOrEqualTo)
                .endSnIdLessThanOrEqualTo(endSnIdLessThanOrEqualTo)
                .timeGreaterThanOrEqualTo(timeGreaterThanOrEqualTo)
                .timeLessThanOrEqualTo(timeLessThanOrEqualTo)
                .containerId(containerId)
                .page(page)
                .limit(limit)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",managedDatabaseId=").append(String.valueOf(this.managedDatabaseId));
        sb.append(",awrDbId=").append(String.valueOf(this.awrDbId));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",instNum=").append(String.valueOf(this.instNum));
        sb.append(",beginSnIdGreaterThanOrEqualTo=")
                .append(String.valueOf(this.beginSnIdGreaterThanOrEqualTo));
        sb.append(",endSnIdLessThanOrEqualTo=")
                .append(String.valueOf(this.endSnIdLessThanOrEqualTo));
        sb.append(",timeGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeGreaterThanOrEqualTo));
        sb.append(",timeLessThanOrEqualTo=").append(String.valueOf(this.timeLessThanOrEqualTo));
        sb.append(",containerId=").append(String.valueOf(this.containerId));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeAwrDbSysstatsRequest)) {
            return false;
        }

        SummarizeAwrDbSysstatsRequest other = (SummarizeAwrDbSysstatsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedDatabaseId, other.managedDatabaseId)
                && java.util.Objects.equals(this.awrDbId, other.awrDbId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.instNum, other.instNum)
                && java.util.Objects.equals(
                        this.beginSnIdGreaterThanOrEqualTo, other.beginSnIdGreaterThanOrEqualTo)
                && java.util.Objects.equals(
                        this.endSnIdLessThanOrEqualTo, other.endSnIdLessThanOrEqualTo)
                && java.util.Objects.equals(
                        this.timeGreaterThanOrEqualTo, other.timeGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeLessThanOrEqualTo, other.timeLessThanOrEqualTo)
                && java.util.Objects.equals(this.containerId, other.containerId)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedDatabaseId == null ? 43 : this.managedDatabaseId.hashCode());
        result = (result * PRIME) + (this.awrDbId == null ? 43 : this.awrDbId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.instNum == null ? 43 : this.instNum.hashCode());
        result =
                (result * PRIME)
                        + (this.beginSnIdGreaterThanOrEqualTo == null
                                ? 43
                                : this.beginSnIdGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.endSnIdLessThanOrEqualTo == null
                                ? 43
                                : this.endSnIdLessThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLessThanOrEqualTo == null
                                ? 43
                                : this.timeLessThanOrEqualTo.hashCode());
        result = (result * PRIME) + (this.containerId == null ? 43 : this.containerId.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
