/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ccdoffers.requests;

import com.oracle.bmc.ccdoffers.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ccdoffers/ListCcdOffersExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use ListCcdOffersRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240601")
public class ListCcdOffersRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The subscription ID associated with the CCD offer. */
    private String subscriptionId;

    /** The subscription ID associated with the CCD offer. */
    public String getSubscriptionId() {
        return subscriptionId;
    }
    /** The OCID of the compartment (remember that the tenancy is simply the root compartment). */
    private String compartmentId;

    /** The OCID of the compartment (remember that the tenancy is simply the root compartment). */
    public String getCompartmentId() {
        return compartmentId;
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
    /** The value of the {@code opc-next-page} response header from the previous "List" call. */
    private String page;

    /** The value of the {@code opc-next-page} response header from the previous "List" call. */
    public String getPage() {
        return page;
    }
    /** The maximum number of items to return in a paginated "List" call. */
    private Integer limit;

    /** The maximum number of items to return in a paginated "List" call. */
    public Integer getLimit() {
        return limit;
    }
    /**
     * The life cycle of a CCD offer that's being requested, which always defaults to {@code
     * Active}. If you want to filter by scheduled, current, canceled, or ended, use the {@code
     * lifecycleDetails} query parameter.
     */
    private com.oracle.bmc.ccdoffers.model.CcdOffer.LifecycleState lifecycleState;

    /**
     * The life cycle of a CCD offer that's being requested, which always defaults to {@code
     * Active}. If you want to filter by scheduled, current, canceled, or ended, use the {@code
     * lifecycleDetails} query parameter.
     */
    public com.oracle.bmc.ccdoffers.model.CcdOffer.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The life cycle details of a CCD offer that's being requested. The accepted values are
     * Scheduled, Current, Canceled, or Ended. If a null or empty value is passed, it will return
     * for all resources.
     */
    private com.oracle.bmc.ccdoffers.model.CcdOffer.LifecycleDetails lifecycleDetails;

    /**
     * The life cycle details of a CCD offer that's being requested. The accepted values are
     * Scheduled, Current, Canceled, or Ended. If a null or empty value is passed, it will return
     * for all resources.
     */
    public com.oracle.bmc.ccdoffers.model.CcdOffer.LifecycleDetails getLifecycleDetails() {
        return lifecycleDetails;
    }
    /** The CCD offer type to use when filtering results. */
    private com.oracle.bmc.ccdoffers.model.CcdOffer.TypeOfOffer typeOfOffer;

    /** The CCD offer type to use when filtering results. */
    public com.oracle.bmc.ccdoffers.model.CcdOffer.TypeOfOffer getTypeOfOffer() {
        return typeOfOffer;
    }
    /**
     * Filter CCD offers or commitments by the commercial workflow that created the associated
     * offer.
     */
    private com.oracle.bmc.ccdoffers.model.CcdOffer.SourceType sourceType;

    /**
     * Filter CCD offers or commitments by the commercial workflow that created the associated
     * offer.
     */
    public com.oracle.bmc.ccdoffers.model.CcdOffer.SourceType getSourceType() {
        return sourceType;
    }
    /** The sort order to use, whether "asc" or "desc". By default, it is ascending. */
    private SortOrder sortOrder;

    /** The sort order to use, whether "asc" or "desc". By default, it is ascending. */
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

    /** The sort order to use, whether "asc" or "desc". By default, it is ascending. */
    public SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The sort by field to use, whether "DISPLAYNAME" or "TIMECREATED". By default, it is
     * TIMECREATED.
     */
    private SortBy sortBy;

    /**
     * The sort by field to use, whether "DISPLAYNAME" or "TIMECREATED". By default, it is
     * TIMECREATED.
     */
    public enum SortBy implements com.oracle.bmc.http.internal.BmcEnum {
        Displayname("DISPLAYNAME"),
        Timecreated("TIMECREATED"),
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
     * The sort by field to use, whether "DISPLAYNAME" or "TIMECREATED". By default, it is
     * TIMECREATED.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /** Filter by the resource display name. */
    private String displayName;

    /** Filter by the resource display name. */
    public String getDisplayName() {
        return displayName;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListCcdOffersRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The subscription ID associated with the CCD offer. */
        private String subscriptionId = null;

        /**
         * The subscription ID associated with the CCD offer.
         *
         * @param subscriptionId the value to set
         * @return this builder instance
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * The OCID of the compartment (remember that the tenancy is simply the root compartment).
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment (remember that the tenancy is simply the root compartment).
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

        /** The value of the {@code opc-next-page} response header from the previous "List" call. */
        private String page = null;

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         *
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /** The maximum number of items to return in a paginated "List" call. */
        private Integer limit = null;

        /**
         * The maximum number of items to return in a paginated "List" call.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The life cycle of a CCD offer that's being requested, which always defaults to {@code
         * Active}. If you want to filter by scheduled, current, canceled, or ended, use the {@code
         * lifecycleDetails} query parameter.
         */
        private com.oracle.bmc.ccdoffers.model.CcdOffer.LifecycleState lifecycleState = null;

        /**
         * The life cycle of a CCD offer that's being requested, which always defaults to {@code
         * Active}. If you want to filter by scheduled, current, canceled, or ended, use the {@code
         * lifecycleDetails} query parameter.
         *
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.ccdoffers.model.CcdOffer.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The life cycle details of a CCD offer that's being requested. The accepted values are
         * Scheduled, Current, Canceled, or Ended. If a null or empty value is passed, it will
         * return for all resources.
         */
        private com.oracle.bmc.ccdoffers.model.CcdOffer.LifecycleDetails lifecycleDetails = null;

        /**
         * The life cycle details of a CCD offer that's being requested. The accepted values are
         * Scheduled, Current, Canceled, or Ended. If a null or empty value is passed, it will
         * return for all resources.
         *
         * @param lifecycleDetails the value to set
         * @return this builder instance
         */
        public Builder lifecycleDetails(
                com.oracle.bmc.ccdoffers.model.CcdOffer.LifecycleDetails lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            return this;
        }

        /** The CCD offer type to use when filtering results. */
        private com.oracle.bmc.ccdoffers.model.CcdOffer.TypeOfOffer typeOfOffer = null;

        /**
         * The CCD offer type to use when filtering results.
         *
         * @param typeOfOffer the value to set
         * @return this builder instance
         */
        public Builder typeOfOffer(
                com.oracle.bmc.ccdoffers.model.CcdOffer.TypeOfOffer typeOfOffer) {
            this.typeOfOffer = typeOfOffer;
            return this;
        }

        /**
         * Filter CCD offers or commitments by the commercial workflow that created the associated
         * offer.
         */
        private com.oracle.bmc.ccdoffers.model.CcdOffer.SourceType sourceType = null;

        /**
         * Filter CCD offers or commitments by the commercial workflow that created the associated
         * offer.
         *
         * @param sourceType the value to set
         * @return this builder instance
         */
        public Builder sourceType(com.oracle.bmc.ccdoffers.model.CcdOffer.SourceType sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /** The sort order to use, whether "asc" or "desc". By default, it is ascending. */
        private SortOrder sortOrder = null;

        /**
         * The sort order to use, whether "asc" or "desc". By default, it is ascending.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The sort by field to use, whether "DISPLAYNAME" or "TIMECREATED". By default, it is
         * TIMECREATED.
         */
        private SortBy sortBy = null;

        /**
         * The sort by field to use, whether "DISPLAYNAME" or "TIMECREATED". By default, it is
         * TIMECREATED.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /** Filter by the resource display name. */
        private String displayName = null;

        /**
         * Filter by the resource display name.
         *
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
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
        public Builder copy(ListCcdOffersRequest o) {
            subscriptionId(o.getSubscriptionId());
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            page(o.getPage());
            limit(o.getLimit());
            lifecycleState(o.getLifecycleState());
            lifecycleDetails(o.getLifecycleDetails());
            typeOfOffer(o.getTypeOfOffer());
            sourceType(o.getSourceType());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            displayName(o.getDisplayName());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListCcdOffersRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListCcdOffersRequest
         */
        public ListCcdOffersRequest build() {
            ListCcdOffersRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListCcdOffersRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListCcdOffersRequest
         */
        public ListCcdOffersRequest buildWithoutInvocationCallback() {
            ListCcdOffersRequest request = new ListCcdOffersRequest();
            request.subscriptionId = subscriptionId;
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            request.page = page;
            request.limit = limit;
            request.lifecycleState = lifecycleState;
            request.lifecycleDetails = lifecycleDetails;
            request.typeOfOffer = typeOfOffer;
            request.sourceType = sourceType;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            request.displayName = displayName;
            return request;
            // new ListCcdOffersRequest(subscriptionId, compartmentId, opcRequestId, page, limit,
            // lifecycleState, lifecycleDetails, typeOfOffer, sourceType, sortOrder, sortBy,
            // displayName);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .subscriptionId(subscriptionId)
                .compartmentId(compartmentId)
                .opcRequestId(opcRequestId)
                .page(page)
                .limit(limit)
                .lifecycleState(lifecycleState)
                .lifecycleDetails(lifecycleDetails)
                .typeOfOffer(typeOfOffer)
                .sourceType(sourceType)
                .sortOrder(sortOrder)
                .sortBy(sortBy)
                .displayName(displayName);
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
        sb.append(",subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(",typeOfOffer=").append(String.valueOf(this.typeOfOffer));
        sb.append(",sourceType=").append(String.valueOf(this.sourceType));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListCcdOffersRequest)) {
            return false;
        }

        ListCcdOffersRequest other = (ListCcdOffersRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.typeOfOffer, other.typeOfOffer)
                && java.util.Objects.equals(this.sourceType, other.sourceType)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.displayName, other.displayName);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.typeOfOffer == null ? 43 : this.typeOfOffer.hashCode());
        result = (result * PRIME) + (this.sourceType == null ? 43 : this.sourceType.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        return result;
    }
}
