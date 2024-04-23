/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.requests;

import com.oracle.bmc.cloudguard.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudguard/ListAdhocQueriesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListAdhocQueriesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
public class ListAdhocQueriesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the compartment in which to list resources. */
    private String compartmentId;

    /** The OCID of the compartment in which to list resources. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The status of the adhoc query created. Default value for state is provisioning. If no value
     * is specified state is provisioning.
     */
    private com.oracle.bmc.cloudguard.model.AdhocQueryStatus adhocQueryStatus;

    /**
     * The status of the adhoc query created. Default value for state is provisioning. If no value
     * is specified state is provisioning.
     */
    public com.oracle.bmc.cloudguard.model.AdhocQueryStatus getAdhocQueryStatus() {
        return adhocQueryStatus;
    }
    /**
     * Start time for a filter. If start time is not specified, start time will be set to current
     * time - 30 days.
     */
    private java.util.Date timeStartedFilterQueryParam;

    /**
     * Start time for a filter. If start time is not specified, start time will be set to current
     * time - 30 days.
     */
    public java.util.Date getTimeStartedFilterQueryParam() {
        return timeStartedFilterQueryParam;
    }
    /**
     * End time for a filter. If end time is not specified, end time will be set to current time.
     */
    private java.util.Date timeEndedFilterQueryParam;

    /**
     * End time for a filter. If end time is not specified, end time will be set to current time.
     */
    public java.util.Date getTimeEndedFilterQueryParam() {
        return timeEndedFilterQueryParam;
    }
    /** The maximum number of items to return */
    private Integer limit;

    /** The maximum number of items to return */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    private String page;

    /**
     * The page token representing the page at which to start retrieving results. This is usually
     * retrieved from a previous list call.
     */
    public String getPage() {
        return page;
    }
    /**
     * Default is false. When set to true, the hierarchy of compartments is traversed and all
     * compartments and subcompartments in the tenancy are returned depending on the setting of
     * {@code accessLevel}.
     */
    private Boolean compartmentIdInSubtree;

    /**
     * Default is false. When set to true, the hierarchy of compartments is traversed and all
     * compartments and subcompartments in the tenancy are returned depending on the setting of
     * {@code accessLevel}.
     */
    public Boolean getCompartmentIdInSubtree() {
        return compartmentIdInSubtree;
    }
    /**
     * Valid values are {@code RESTRICTED} and {@code ACCESSIBLE}. Default is {@code RESTRICTED}.
     * Setting this to {@code ACCESSIBLE} returns only those compartments for which the user has
     * INSPECT permissions directly or indirectly (permissions can be on a resource in a
     * subcompartment). When set to {@code RESTRICTED} permissions are checked and no partial
     * results are displayed.
     */
    private AccessLevel accessLevel;

    /**
     * Valid values are {@code RESTRICTED} and {@code ACCESSIBLE}. Default is {@code RESTRICTED}.
     * Setting this to {@code ACCESSIBLE} returns only those compartments for which the user has
     * INSPECT permissions directly or indirectly (permissions can be on a resource in a
     * subcompartment). When set to {@code RESTRICTED} permissions are checked and no partial
     * results are displayed.
     */
    public enum AccessLevel implements com.oracle.bmc.http.internal.BmcEnum {
        Restricted("RESTRICTED"),
        Accessible("ACCESSIBLE"),
        ;

        private final String value;
        private static java.util.Map<String, AccessLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (AccessLevel v : AccessLevel.values()) {
                map.put(v.getValue(), v);
            }
        }

        AccessLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AccessLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AccessLevel: " + key);
        }
    };

    /**
     * Valid values are {@code RESTRICTED} and {@code ACCESSIBLE}. Default is {@code RESTRICTED}.
     * Setting this to {@code ACCESSIBLE} returns only those compartments for which the user has
     * INSPECT permissions directly or indirectly (permissions can be on a resource in a
     * subcompartment). When set to {@code RESTRICTED} permissions are checked and no partial
     * results are displayed.
     */
    public AccessLevel getAccessLevel() {
        return accessLevel;
    }
    /** The sort order to use */
    private com.oracle.bmc.cloudguard.model.SortOrders sortOrder;

    /** The sort order to use */
    public com.oracle.bmc.cloudguard.model.SortOrders getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending. If no value is specified timeCreated
     * is default.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending. If no value is specified timeCreated
     * is default.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
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
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending. If no value is specified timeCreated
     * is default.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListAdhocQueriesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the compartment in which to list resources. */
        private String compartmentId = null;

        /**
         * The OCID of the compartment in which to list resources.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The status of the adhoc query created. Default value for state is provisioning. If no
         * value is specified state is provisioning.
         */
        private com.oracle.bmc.cloudguard.model.AdhocQueryStatus adhocQueryStatus = null;

        /**
         * The status of the adhoc query created. Default value for state is provisioning. If no
         * value is specified state is provisioning.
         *
         * @param adhocQueryStatus the value to set
         * @return this builder instance
         */
        public Builder adhocQueryStatus(
                com.oracle.bmc.cloudguard.model.AdhocQueryStatus adhocQueryStatus) {
            this.adhocQueryStatus = adhocQueryStatus;
            return this;
        }

        /**
         * Start time for a filter. If start time is not specified, start time will be set to
         * current time - 30 days.
         */
        private java.util.Date timeStartedFilterQueryParam = null;

        /**
         * Start time for a filter. If start time is not specified, start time will be set to
         * current time - 30 days.
         *
         * @param timeStartedFilterQueryParam the value to set
         * @return this builder instance
         */
        public Builder timeStartedFilterQueryParam(java.util.Date timeStartedFilterQueryParam) {
            this.timeStartedFilterQueryParam = timeStartedFilterQueryParam;
            return this;
        }

        /**
         * End time for a filter. If end time is not specified, end time will be set to current
         * time.
         */
        private java.util.Date timeEndedFilterQueryParam = null;

        /**
         * End time for a filter. If end time is not specified, end time will be set to current
         * time.
         *
         * @param timeEndedFilterQueryParam the value to set
         * @return this builder instance
         */
        public Builder timeEndedFilterQueryParam(java.util.Date timeEndedFilterQueryParam) {
            this.timeEndedFilterQueryParam = timeEndedFilterQueryParam;
            return this;
        }

        /** The maximum number of items to return */
        private Integer limit = null;

        /**
         * The maximum number of items to return
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         */
        private String page = null;

        /**
         * The page token representing the page at which to start retrieving results. This is
         * usually retrieved from a previous list call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * Default is false. When set to true, the hierarchy of compartments is traversed and all
         * compartments and subcompartments in the tenancy are returned depending on the setting of
         * {@code accessLevel}.
         */
        private Boolean compartmentIdInSubtree = null;

        /**
         * Default is false. When set to true, the hierarchy of compartments is traversed and all
         * compartments and subcompartments in the tenancy are returned depending on the setting of
         * {@code accessLevel}.
         *
         * @param compartmentIdInSubtree the value to set
         * @return this builder instance
         */
        public Builder compartmentIdInSubtree(Boolean compartmentIdInSubtree) {
            this.compartmentIdInSubtree = compartmentIdInSubtree;
            return this;
        }

        /**
         * Valid values are {@code RESTRICTED} and {@code ACCESSIBLE}. Default is {@code
         * RESTRICTED}. Setting this to {@code ACCESSIBLE} returns only those compartments for which
         * the user has INSPECT permissions directly or indirectly (permissions can be on a resource
         * in a subcompartment). When set to {@code RESTRICTED} permissions are checked and no
         * partial results are displayed.
         */
        private AccessLevel accessLevel = null;

        /**
         * Valid values are {@code RESTRICTED} and {@code ACCESSIBLE}. Default is {@code
         * RESTRICTED}. Setting this to {@code ACCESSIBLE} returns only those compartments for which
         * the user has INSPECT permissions directly or indirectly (permissions can be on a resource
         * in a subcompartment). When set to {@code RESTRICTED} permissions are checked and no
         * partial results are displayed.
         *
         * @param accessLevel the value to set
         * @return this builder instance
         */
        public Builder accessLevel(AccessLevel accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }

        /** The sort order to use */
        private com.oracle.bmc.cloudguard.model.SortOrders sortOrder = null;

        /**
         * The sort order to use
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.cloudguard.model.SortOrders sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending. If no value is specified
         * timeCreated is default.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending. If no value is specified
         * timeCreated is default.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ListAdhocQueriesRequest o) {
            compartmentId(o.getCompartmentId());
            adhocQueryStatus(o.getAdhocQueryStatus());
            timeStartedFilterQueryParam(o.getTimeStartedFilterQueryParam());
            timeEndedFilterQueryParam(o.getTimeEndedFilterQueryParam());
            limit(o.getLimit());
            page(o.getPage());
            compartmentIdInSubtree(o.getCompartmentIdInSubtree());
            accessLevel(o.getAccessLevel());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListAdhocQueriesRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListAdhocQueriesRequest
         */
        public ListAdhocQueriesRequest build() {
            ListAdhocQueriesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListAdhocQueriesRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListAdhocQueriesRequest
         */
        public ListAdhocQueriesRequest buildWithoutInvocationCallback() {
            ListAdhocQueriesRequest request = new ListAdhocQueriesRequest();
            request.compartmentId = compartmentId;
            request.adhocQueryStatus = adhocQueryStatus;
            request.timeStartedFilterQueryParam = timeStartedFilterQueryParam;
            request.timeEndedFilterQueryParam = timeEndedFilterQueryParam;
            request.limit = limit;
            request.page = page;
            request.compartmentIdInSubtree = compartmentIdInSubtree;
            request.accessLevel = accessLevel;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.opcRequestId = opcRequestId;
            return request;
            // new ListAdhocQueriesRequest(compartmentId, adhocQueryStatus,
            // timeStartedFilterQueryParam, timeEndedFilterQueryParam, limit, page,
            // compartmentIdInSubtree, accessLevel, sortOrder, sortBy, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .adhocQueryStatus(adhocQueryStatus)
                .timeStartedFilterQueryParam(timeStartedFilterQueryParam)
                .timeEndedFilterQueryParam(timeEndedFilterQueryParam)
                .limit(limit)
                .page(page)
                .compartmentIdInSubtree(compartmentIdInSubtree)
                .accessLevel(accessLevel)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",adhocQueryStatus=").append(String.valueOf(this.adhocQueryStatus));
        sb.append(",timeStartedFilterQueryParam=")
                .append(String.valueOf(this.timeStartedFilterQueryParam));
        sb.append(",timeEndedFilterQueryParam=")
                .append(String.valueOf(this.timeEndedFilterQueryParam));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",compartmentIdInSubtree=").append(String.valueOf(this.compartmentIdInSubtree));
        sb.append(",accessLevel=").append(String.valueOf(this.accessLevel));
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
        if (!(o instanceof ListAdhocQueriesRequest)) {
            return false;
        }

        ListAdhocQueriesRequest other = (ListAdhocQueriesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.adhocQueryStatus, other.adhocQueryStatus)
                && java.util.Objects.equals(
                        this.timeStartedFilterQueryParam, other.timeStartedFilterQueryParam)
                && java.util.Objects.equals(
                        this.timeEndedFilterQueryParam, other.timeEndedFilterQueryParam)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(
                        this.compartmentIdInSubtree, other.compartmentIdInSubtree)
                && java.util.Objects.equals(this.accessLevel, other.accessLevel)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.adhocQueryStatus == null ? 43 : this.adhocQueryStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.timeStartedFilterQueryParam == null
                                ? 43
                                : this.timeStartedFilterQueryParam.hashCode());
        result =
                (result * PRIME)
                        + (this.timeEndedFilterQueryParam == null
                                ? 43
                                : this.timeEndedFilterQueryParam.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentIdInSubtree == null
                                ? 43
                                : this.compartmentIdInSubtree.hashCode());
        result = (result * PRIME) + (this.accessLevel == null ? 43 : this.accessLevel.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
