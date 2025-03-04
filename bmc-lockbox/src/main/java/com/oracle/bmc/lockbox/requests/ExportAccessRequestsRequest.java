/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lockbox.requests;

import com.oracle.bmc.lockbox.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/lockbox/ExportAccessRequestsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ExportAccessRequestsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220126")
public class ExportAccessRequestsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.lockbox.model.ExportAccessRequestsDetails> {

    /** Exports the list of access requests for given date range in text format */
    private com.oracle.bmc.lockbox.model.ExportAccessRequestsDetails exportAccessRequestsDetails;

    /** Exports the list of access requests for given date range in text format */
    public com.oracle.bmc.lockbox.model.ExportAccessRequestsDetails
            getExportAccessRequestsDetails() {
        return exportAccessRequestsDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A generic Id query param used to filter lockbox, access request and approval template by Id.
     */
    private String id;

    /**
     * A generic Id query param used to filter lockbox, access request and approval template by Id.
     */
    public String getId() {
        return id;
    }
    /** A filter to return only resources that match the entire display name given. */
    private String displayName;

    /** A filter to return only resources that match the entire display name given. */
    public String getDisplayName() {
        return displayName;
    }
    /** A filter to return only resources their lifecycleState matches the given lifecycleState. */
    private com.oracle.bmc.lockbox.model.AccessRequest.LifecycleState lifecycleState;

    /** A filter to return only resources their lifecycleState matches the given lifecycleState. */
    public com.oracle.bmc.lockbox.model.AccessRequest.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /** The name of the lockbox partner. */
    private com.oracle.bmc.lockbox.model.LockboxPartner lockboxPartner;

    /** The name of the lockbox partner. */
    public com.oracle.bmc.lockbox.model.LockboxPartner getLockboxPartner() {
        return lockboxPartner;
    }
    /** The ID of the partner. */
    private String partnerId;

    /** The ID of the partner. */
    public String getPartnerId() {
        return partnerId;
    }
    /** The unique identifier (OCID) of the requestor in which to list resources. */
    private String requestorId;

    /** The unique identifier (OCID) of the requestor in which to list resources. */
    public String getRequestorId() {
        return requestorId;
    }
    /** The maximum number of items to return. */
    private Integer limit;

    /** The maximum number of items to return. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from
     * the {@code opc-next-page} header field of a previous response.
     */
    public String getPage() {
        return page;
    }
    /** The sort order to use, either 'ASC' or 'DESC'. */
    private com.oracle.bmc.lockbox.model.SortOrder sortOrder;

    /** The sort order to use, either 'ASC' or 'DESC'. */
    public com.oracle.bmc.lockbox.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending.
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order may be provided. Default order for timeCreated is
     * descending. Default order for displayName is ascending.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        TimeCreated("timeCreated"),
        DisplayName("displayName"),
        Id("id"),
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
     * descending. Default order for displayName is ascending.
     */
    public SortBy getSortBy() {
        return sortBy;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.lockbox.model.ExportAccessRequestsDetails getBody$() {
        return exportAccessRequestsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ExportAccessRequestsRequest,
                    com.oracle.bmc.lockbox.model.ExportAccessRequestsDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Exports the list of access requests for given date range in text format */
        private com.oracle.bmc.lockbox.model.ExportAccessRequestsDetails
                exportAccessRequestsDetails = null;

        /**
         * Exports the list of access requests for given date range in text format
         *
         * @param exportAccessRequestsDetails the value to set
         * @return this builder instance
         */
        public Builder exportAccessRequestsDetails(
                com.oracle.bmc.lockbox.model.ExportAccessRequestsDetails
                        exportAccessRequestsDetails) {
            this.exportAccessRequestsDetails = exportAccessRequestsDetails;
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
         * A generic Id query param used to filter lockbox, access request and approval template by
         * Id.
         */
        private String id = null;

        /**
         * A generic Id query param used to filter lockbox, access request and approval template by
         * Id.
         *
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /** A filter to return only resources that match the entire display name given. */
        private String displayName = null;

        /**
         * A filter to return only resources that match the entire display name given.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * A filter to return only resources their lifecycleState matches the given lifecycleState.
         */
        private com.oracle.bmc.lockbox.model.AccessRequest.LifecycleState lifecycleState = null;

        /**
         * A filter to return only resources their lifecycleState matches the given lifecycleState.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.lockbox.model.AccessRequest.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /** The name of the lockbox partner. */
        private com.oracle.bmc.lockbox.model.LockboxPartner lockboxPartner = null;

        /**
         * The name of the lockbox partner.
         *
         * @param lockboxPartner the value to set
         * @return this builder instance
         */
        public Builder lockboxPartner(com.oracle.bmc.lockbox.model.LockboxPartner lockboxPartner) {
            this.lockboxPartner = lockboxPartner;
            return this;
        }

        /** The ID of the partner. */
        private String partnerId = null;

        /**
         * The ID of the partner.
         *
         * @param partnerId the value to set
         * @return this builder instance
         */
        public Builder partnerId(String partnerId) {
            this.partnerId = partnerId;
            return this;
        }

        /** The unique identifier (OCID) of the requestor in which to list resources. */
        private String requestorId = null;

        /**
         * The unique identifier (OCID) of the requestor in which to list resources.
         *
         * @param requestorId the value to set
         * @return this builder instance
         */
        public Builder requestorId(String requestorId) {
            this.requestorId = requestorId;
            return this;
        }

        /** The maximum number of items to return. */
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
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come
         * from the {@code opc-next-page} header field of a previous response.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The sort order to use, either 'ASC' or 'DESC'. */
        private com.oracle.bmc.lockbox.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.lockbox.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending.
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order may be provided. Default order for timeCreated
         * is descending. Default order for displayName is ascending.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
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
        public Builder copy(ExportAccessRequestsRequest o) {
            exportAccessRequestsDetails(o.getExportAccessRequestsDetails());
            opcRequestId(o.getOpcRequestId());
            id(o.getId());
            displayName(o.getDisplayName());
            lifecycleState(o.getLifecycleState());
            lockboxPartner(o.getLockboxPartner());
            partnerId(o.getPartnerId());
            requestorId(o.getRequestorId());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ExportAccessRequestsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ExportAccessRequestsRequest
         */
        public ExportAccessRequestsRequest build() {
            ExportAccessRequestsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(com.oracle.bmc.lockbox.model.ExportAccessRequestsDetails body) {
            exportAccessRequestsDetails(body);
            return this;
        }

        /**
         * Build the instance of ExportAccessRequestsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ExportAccessRequestsRequest
         */
        public ExportAccessRequestsRequest buildWithoutInvocationCallback() {
            ExportAccessRequestsRequest request = new ExportAccessRequestsRequest();
            request.exportAccessRequestsDetails = exportAccessRequestsDetails;
            request.opcRequestId = opcRequestId;
            request.id = id;
            request.displayName = displayName;
            request.lifecycleState = lifecycleState;
            request.lockboxPartner = lockboxPartner;
            request.partnerId = partnerId;
            request.requestorId = requestorId;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            return request;
            // new ExportAccessRequestsRequest(exportAccessRequestsDetails, opcRequestId, id,
            // displayName, lifecycleState, lockboxPartner, partnerId, requestorId, limit, page,
            // sortOrder, sortBy);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .exportAccessRequestsDetails(exportAccessRequestsDetails)
                .opcRequestId(opcRequestId)
                .id(id)
                .displayName(displayName)
                .lifecycleState(lifecycleState)
                .lockboxPartner(lockboxPartner)
                .partnerId(partnerId)
                .requestorId(requestorId)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy);
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
        sb.append(",exportAccessRequestsDetails=")
                .append(String.valueOf(this.exportAccessRequestsDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",lockboxPartner=").append(String.valueOf(this.lockboxPartner));
        sb.append(",partnerId=").append(String.valueOf(this.partnerId));
        sb.append(",requestorId=").append(String.valueOf(this.requestorId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportAccessRequestsRequest)) {
            return false;
        }

        ExportAccessRequestsRequest other = (ExportAccessRequestsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.exportAccessRequestsDetails, other.exportAccessRequestsDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lockboxPartner, other.lockboxPartner)
                && java.util.Objects.equals(this.partnerId, other.partnerId)
                && java.util.Objects.equals(this.requestorId, other.requestorId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.exportAccessRequestsDetails == null
                                ? 43
                                : this.exportAccessRequestsDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lockboxPartner == null ? 43 : this.lockboxPartner.hashCode());
        result = (result * PRIME) + (this.partnerId == null ? 43 : this.partnerId.hashCode());
        result = (result * PRIME) + (this.requestorId == null ? 43 : this.requestorId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        return result;
    }
}
