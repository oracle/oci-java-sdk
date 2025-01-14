/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.requests;

import com.oracle.bmc.dataintegration.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/ListCopyObjectRequestsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListCopyObjectRequestsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
public class ListCopyObjectRequestsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The workspace ID. */
    private String workspaceId;

    /** The workspace ID. */
    public String getWorkspaceId() {
        return workspaceId;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Sets the maximum number of results per page, or items to return in a paginated {@code List}
     * call. See [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private Integer limit;

    /**
     * Sets the maximum number of results per page, or items to return in a paginated {@code List}
     * call. See [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * For list pagination. The value for this parameter is the {@code opc-next-page} or the {@code
     * opc-prev-page} response header from the previous {@code List} call. See [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    private String page;

    /**
     * For list pagination. The value for this parameter is the {@code opc-next-page} or the {@code
     * opc-prev-page} response header from the previous {@code List} call. See [List
     * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
     */
    public String getPage() {
        return page;
    }
    /** Used to filter by the name of the object. */
    private String name;

    /** Used to filter by the name of the object. */
    public String getName() {
        return name;
    }
    /** Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending). */
    private SortOrder sortOrder;

    /** Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending). */
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

    /** Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending). */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * Specifies the field to sort by. Accepts only one field. By default, when you sort by time
     * fields, results are shown in descending order. All other fields default to ascending order.
     * Sorting related parameters are ignored when parameter {@code query} is present (search
     * operation and sorting order is by relevance score in descending order).
     */
    private SortBy sortBy;

    /**
     * Specifies the field to sort by. Accepts only one field. By default, when you sort by time
     * fields, results are shown in descending order. All other fields default to ascending order.
     * Sorting related parameters are ignored when parameter {@code query} is present (search
     * operation and sorting order is by relevance score in descending order).
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("TIME_CREATED"),
        DisplayName("DISPLAY_NAME"),
        TimeUpdated("TIME_UPDATED"),
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
     * Specifies the field to sort by. Accepts only one field. By default, when you sort by time
     * fields, results are shown in descending order. All other fields default to ascending order.
     * Sorting related parameters are ignored when parameter {@code query} is present (search
     * operation and sorting order is by relevance score in descending order).
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** Specifies copy status to use, either - ALL, SUCCESSFUL, IN_PROGRESS, QUEUED, FAILED . */
    private CopyStatus copyStatus;

    /** Specifies copy status to use, either - ALL, SUCCESSFUL, IN_PROGRESS, QUEUED, FAILED . */
    public enum CopyStatus implements com.oracle.bmc.http.internal.BmcEnum {
        InProgress("IN_PROGRESS"),
        Successful("SUCCESSFUL"),
        Queued("QUEUED"),
        Terminating("TERMINATING"),
        Terminated("TERMINATED"),
        Failed("FAILED"),
        All("ALL"),
        ;

        private final String value;
        private static java.util.Map<String, CopyStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (CopyStatus v : CopyStatus.values()) {
                map.put(v.getValue(), v);
            }
        }

        CopyStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CopyStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid CopyStatus: " + key);
        }
    };

    /** Specifies copy status to use, either - ALL, SUCCESSFUL, IN_PROGRESS, QUEUED, FAILED . */
    public CopyStatus getCopyStatus() {
        return copyStatus;
    }
    /**
     * This parameter allows users to specify which view of the copy object response to return.
     * SUMMARY - Summary of the copy object response will be returned. This is the default option
     * when no value is specified. DETAILS - Details of copy object response will be returned. This
     * will include details of all the objects to be copied.
     */
    private Projection projection;

    /**
     * This parameter allows users to specify which view of the copy object response to return.
     * SUMMARY - Summary of the copy object response will be returned. This is the default option
     * when no value is specified. DETAILS - Details of copy object response will be returned. This
     * will include details of all the objects to be copied.
     */
    public enum Projection implements com.oracle.bmc.http.internal.BmcEnum {
        Summary("SUMMARY"),
        Details("DETAILS"),
        ;

        private final String value;
        private static java.util.Map<String, Projection> map;

        static {
            map = new java.util.HashMap<>();
            for (Projection v : Projection.values()) {
                map.put(v.getValue(), v);
            }
        }

        Projection(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Projection create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Projection: " + key);
        }
    };

    /**
     * This parameter allows users to specify which view of the copy object response to return.
     * SUMMARY - Summary of the copy object response will be returned. This is the default option
     * when no value is specified. DETAILS - Details of copy object response will be returned. This
     * will include details of all the objects to be copied.
     */
    public Projection getProjection() {
        return projection;
    }
    /** Specifies start time of a copy object request. */
    private Long timeStartedInMillis;

    /** Specifies start time of a copy object request. */
    public Long getTimeStartedInMillis() {
        return timeStartedInMillis;
    }
    /** Specifies end time of a copy object request. */
    private Long timeEndedInMillis;

    /** Specifies end time of a copy object request. */
    public Long getTimeEndedInMillis() {
        return timeEndedInMillis;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListCopyObjectRequestsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The workspace ID. */
        private String workspaceId = null;

        /**
         * The workspace ID.
         *
         * @param workspaceId the value to set
         * @return this builder instance
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
         * Sets the maximum number of results per page, or items to return in a paginated {@code
         * List} call. See [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private Integer limit = null;

        /**
         * Sets the maximum number of results per page, or items to return in a paginated {@code
         * List} call. See [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * For list pagination. The value for this parameter is the {@code opc-next-page} or the
         * {@code opc-prev-page} response header from the previous {@code List} call. See [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         */
        private String page = null;

        /**
         * For list pagination. The value for this parameter is the {@code opc-next-page} or the
         * {@code opc-prev-page} response header from the previous {@code List} call. See [List
         * Pagination](https://docs.cloud.oracle.com/iaas/Content/API/Concepts/usingapi.htm#nine).
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** Used to filter by the name of the object. */
        private String name = null;

        /**
         * Used to filter by the name of the object.
         *
         * @param name the value to set
         * @return this builder instance
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending).
         */
        private SortOrder sortOrder = null;

        /**
         * Specifies sort order to use, either {@code ASC} (ascending) or {@code DESC} (descending).
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Specifies the field to sort by. Accepts only one field. By default, when you sort by time
         * fields, results are shown in descending order. All other fields default to ascending
         * order. Sorting related parameters are ignored when parameter {@code query} is present
         * (search operation and sorting order is by relevance score in descending order).
         */
        private SortBy sortBy = null;

        /**
         * Specifies the field to sort by. Accepts only one field. By default, when you sort by time
         * fields, results are shown in descending order. All other fields default to ascending
         * order. Sorting related parameters are ignored when parameter {@code query} is present
         * (search operation and sorting order is by relevance score in descending order).
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** Specifies copy status to use, either - ALL, SUCCESSFUL, IN_PROGRESS, QUEUED, FAILED . */
        private CopyStatus copyStatus = null;

        /**
         * Specifies copy status to use, either - ALL, SUCCESSFUL, IN_PROGRESS, QUEUED, FAILED .
         *
         * @param copyStatus the value to set
         * @return this builder instance
         */
        public Builder copyStatus(CopyStatus copyStatus) {
            this.copyStatus = copyStatus;
            return this;
        }

        /**
         * This parameter allows users to specify which view of the copy object response to return.
         * SUMMARY - Summary of the copy object response will be returned. This is the default
         * option when no value is specified. DETAILS - Details of copy object response will be
         * returned. This will include details of all the objects to be copied.
         */
        private Projection projection = null;

        /**
         * This parameter allows users to specify which view of the copy object response to return.
         * SUMMARY - Summary of the copy object response will be returned. This is the default
         * option when no value is specified. DETAILS - Details of copy object response will be
         * returned. This will include details of all the objects to be copied.
         *
         * @param projection the value to set
         * @return this builder instance
         */
        public Builder projection(Projection projection) {
            this.projection = projection;
            return this;
        }

        /** Specifies start time of a copy object request. */
        private Long timeStartedInMillis = null;

        /**
         * Specifies start time of a copy object request.
         *
         * @param timeStartedInMillis the value to set
         * @return this builder instance
         */
        public Builder timeStartedInMillis(Long timeStartedInMillis) {
            this.timeStartedInMillis = timeStartedInMillis;
            return this;
        }

        /** Specifies end time of a copy object request. */
        private Long timeEndedInMillis = null;

        /**
         * Specifies end time of a copy object request.
         *
         * @param timeEndedInMillis the value to set
         * @return this builder instance
         */
        public Builder timeEndedInMillis(Long timeEndedInMillis) {
            this.timeEndedInMillis = timeEndedInMillis;
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
        public Builder copy(ListCopyObjectRequestsRequest o) {
            workspaceId(o.getWorkspaceId());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            name(o.getName());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            copyStatus(o.getCopyStatus());
            projection(o.getProjection());
            timeStartedInMillis(o.getTimeStartedInMillis());
            timeEndedInMillis(o.getTimeEndedInMillis());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListCopyObjectRequestsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListCopyObjectRequestsRequest
         */
        public ListCopyObjectRequestsRequest build() {
            ListCopyObjectRequestsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListCopyObjectRequestsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListCopyObjectRequestsRequest
         */
        public ListCopyObjectRequestsRequest buildWithoutInvocationCallback() {
            ListCopyObjectRequestsRequest request = new ListCopyObjectRequestsRequest();
            request.workspaceId = workspaceId;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.name = name;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.copyStatus = copyStatus;
            request.projection = projection;
            request.timeStartedInMillis = timeStartedInMillis;
            request.timeEndedInMillis = timeEndedInMillis;
            return request;
            // new ListCopyObjectRequestsRequest(workspaceId, opcRequestId, limit, page, name,
            // sortOrder, sortBy, copyStatus, projection, timeStartedInMillis, timeEndedInMillis);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .workspaceId(workspaceId)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .name(name)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .copyStatus(copyStatus)
                .projection(projection)
                .timeStartedInMillis(timeStartedInMillis)
                .timeEndedInMillis(timeEndedInMillis);
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
        sb.append(",workspaceId=").append(String.valueOf(this.workspaceId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",name=").append(String.valueOf(this.name));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",copyStatus=").append(String.valueOf(this.copyStatus));
        sb.append(",projection=").append(String.valueOf(this.projection));
        sb.append(",timeStartedInMillis=").append(String.valueOf(this.timeStartedInMillis));
        sb.append(",timeEndedInMillis=").append(String.valueOf(this.timeEndedInMillis));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListCopyObjectRequestsRequest)) {
            return false;
        }

        ListCopyObjectRequestsRequest other = (ListCopyObjectRequestsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.workspaceId, other.workspaceId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.copyStatus, other.copyStatus)
                && java.util.Objects.equals(this.projection, other.projection)
                && java.util.Objects.equals(this.timeStartedInMillis, other.timeStartedInMillis)
                && java.util.Objects.equals(this.timeEndedInMillis, other.timeEndedInMillis);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.workspaceId == null ? 43 : this.workspaceId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.copyStatus == null ? 43 : this.copyStatus.hashCode());
        result = (result * PRIME) + (this.projection == null ? 43 : this.projection.hashCode());
        result =
                (result * PRIME)
                        + (this.timeStartedInMillis == null
                                ? 43
                                : this.timeStartedInMillis.hashCode());
        result =
                (result * PRIME)
                        + (this.timeEndedInMillis == null ? 43 : this.timeEndedInMillis.hashCode());
        return result;
    }
}
