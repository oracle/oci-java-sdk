/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osubusage.requests;

import com.oracle.bmc.osubusage.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osubusage/ListComputedUsageAggregatedsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ListComputedUsageAggregatedsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210501")
public class ListComputedUsageAggregatedsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the root compartment. */
    private String compartmentId;

    /** The OCID of the root compartment. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Subscription Id is an identifier associated to the service used for filter the Computed Usage
     * in SPM.
     */
    private String subscriptionId;

    /**
     * Subscription Id is an identifier associated to the service used for filter the Computed Usage
     * in SPM.
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }
    /**
     * Initial date to filter Computed Usage data in SPM. In the case of non aggregated data the
     * time period between of fromDate and toDate , expressed in RFC 3339 timestamp format.
     */
    private java.util.Date timeFrom;

    /**
     * Initial date to filter Computed Usage data in SPM. In the case of non aggregated data the
     * time period between of fromDate and toDate , expressed in RFC 3339 timestamp format.
     */
    public java.util.Date getTimeFrom() {
        return timeFrom;
    }
    /** Final date to filter Computed Usage data in SPM, expressed in RFC 3339 timestamp format. */
    private java.util.Date timeTo;

    /** Final date to filter Computed Usage data in SPM, expressed in RFC 3339 timestamp format. */
    public java.util.Date getTimeTo() {
        return timeTo;
    }
    /** Product part number for subscribed service line, called parent product. */
    private String parentProduct;

    /** Product part number for subscribed service line, called parent product. */
    public String getParentProduct() {
        return parentProduct;
    }
    /**
     * Grouping criteria to use for aggregate the computed Usage, either hourly ({@code HOURLY}),
     * daily ({@code DAILY}), monthly({@code MONTHLY}) or none ({@code NONE}) to not follow a
     * grouping criteria by date.
     */
    private Grouping grouping;

    /**
     * Grouping criteria to use for aggregate the computed Usage, either hourly ({@code HOURLY}),
     * daily ({@code DAILY}), monthly({@code MONTHLY}) or none ({@code NONE}) to not follow a
     * grouping criteria by date.
     */
    public enum Grouping implements com.oracle.bmc.http.internal.BmcEnum {
        Hourly("HOURLY"),
        Daily("DAILY"),
        Monthly("MONTHLY"),
        None("NONE"),
        ;

        private final String value;
        private static java.util.Map<String, Grouping> map;

        static {
            map = new java.util.HashMap<>();
            for (Grouping v : Grouping.values()) {
                map.put(v.getValue(), v);
            }
        }

        Grouping(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Grouping create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Grouping: " + key);
        }
    };

    /**
     * Grouping criteria to use for aggregate the computed Usage, either hourly ({@code HOURLY}),
     * daily ({@code DAILY}), monthly({@code MONTHLY}) or none ({@code NONE}) to not follow a
     * grouping criteria by date.
     */
    public Grouping getGrouping() {
        return grouping;
    }
    /**
     * The maximum number aggregatedComputedUsages of items to return within the Subscription "List"
     * call, this counts the overall count across all items Example: {@code 500}
     */
    private Integer limit;

    /**
     * The maximum number aggregatedComputedUsages of items to return within the Subscription "List"
     * call, this counts the overall count across all items Example: {@code 500}
     */
    public Integer getLimit() {
        return limit;
    }
    /** The value of the {@code opc-next-page} response header from the previous "List" call. */
    private String page;

    /** The value of the {@code opc-next-page} response header from the previous "List" call. */
    public String getPage() {
        return page;
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
     * The OCI home region name in case home region is not us-ashburn-1 (IAD), e.g. ap-mumbai-1,
     * us-phoenix-1 etc.
     */
    private String xOneOriginRegion;

    /**
     * The OCI home region name in case home region is not us-ashburn-1 (IAD), e.g. ap-mumbai-1,
     * us-phoenix-1 etc.
     */
    public String getXOneOriginRegion() {
        return xOneOriginRegion;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListComputedUsageAggregatedsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the root compartment. */
        private String compartmentId = null;

        /**
         * The OCID of the root compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Subscription Id is an identifier associated to the service used for filter the Computed
         * Usage in SPM.
         */
        private String subscriptionId = null;

        /**
         * Subscription Id is an identifier associated to the service used for filter the Computed
         * Usage in SPM.
         *
         * @param subscriptionId the value to set
         * @return this builder instance
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Initial date to filter Computed Usage data in SPM. In the case of non aggregated data the
         * time period between of fromDate and toDate , expressed in RFC 3339 timestamp format.
         */
        private java.util.Date timeFrom = null;

        /**
         * Initial date to filter Computed Usage data in SPM. In the case of non aggregated data the
         * time period between of fromDate and toDate , expressed in RFC 3339 timestamp format.
         *
         * @param timeFrom the value to set
         * @return this builder instance
         */
        public Builder timeFrom(java.util.Date timeFrom) {
            this.timeFrom = timeFrom;
            return this;
        }

        /**
         * Final date to filter Computed Usage data in SPM, expressed in RFC 3339 timestamp format.
         */
        private java.util.Date timeTo = null;

        /**
         * Final date to filter Computed Usage data in SPM, expressed in RFC 3339 timestamp format.
         *
         * @param timeTo the value to set
         * @return this builder instance
         */
        public Builder timeTo(java.util.Date timeTo) {
            this.timeTo = timeTo;
            return this;
        }

        /** Product part number for subscribed service line, called parent product. */
        private String parentProduct = null;

        /**
         * Product part number for subscribed service line, called parent product.
         *
         * @param parentProduct the value to set
         * @return this builder instance
         */
        public Builder parentProduct(String parentProduct) {
            this.parentProduct = parentProduct;
            return this;
        }

        /**
         * Grouping criteria to use for aggregate the computed Usage, either hourly ({@code
         * HOURLY}), daily ({@code DAILY}), monthly({@code MONTHLY}) or none ({@code NONE}) to not
         * follow a grouping criteria by date.
         */
        private Grouping grouping = null;

        /**
         * Grouping criteria to use for aggregate the computed Usage, either hourly ({@code
         * HOURLY}), daily ({@code DAILY}), monthly({@code MONTHLY}) or none ({@code NONE}) to not
         * follow a grouping criteria by date.
         *
         * @param grouping the value to set
         * @return this builder instance
         */
        public Builder grouping(Grouping grouping) {
            this.grouping = grouping;
            return this;
        }

        /**
         * The maximum number aggregatedComputedUsages of items to return within the Subscription
         * "List" call, this counts the overall count across all items Example: {@code 500}
         */
        private Integer limit = null;

        /**
         * The maximum number aggregatedComputedUsages of items to return within the Subscription
         * "List" call, this counts the overall count across all items Example: {@code 500}
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
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
         * The OCI home region name in case home region is not us-ashburn-1 (IAD), e.g. ap-mumbai-1,
         * us-phoenix-1 etc.
         */
        private String xOneOriginRegion = null;

        /**
         * The OCI home region name in case home region is not us-ashburn-1 (IAD), e.g. ap-mumbai-1,
         * us-phoenix-1 etc.
         *
         * @param xOneOriginRegion the value to set
         * @return this builder instance
         */
        public Builder xOneOriginRegion(String xOneOriginRegion) {
            this.xOneOriginRegion = xOneOriginRegion;
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
        public Builder copy(ListComputedUsageAggregatedsRequest o) {
            compartmentId(o.getCompartmentId());
            subscriptionId(o.getSubscriptionId());
            timeFrom(o.getTimeFrom());
            timeTo(o.getTimeTo());
            parentProduct(o.getParentProduct());
            grouping(o.getGrouping());
            limit(o.getLimit());
            page(o.getPage());
            opcRequestId(o.getOpcRequestId());
            xOneOriginRegion(o.getXOneOriginRegion());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListComputedUsageAggregatedsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ListComputedUsageAggregatedsRequest
         */
        public ListComputedUsageAggregatedsRequest build() {
            ListComputedUsageAggregatedsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListComputedUsageAggregatedsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListComputedUsageAggregatedsRequest
         */
        public ListComputedUsageAggregatedsRequest buildWithoutInvocationCallback() {
            ListComputedUsageAggregatedsRequest request = new ListComputedUsageAggregatedsRequest();
            request.compartmentId = compartmentId;
            request.subscriptionId = subscriptionId;
            request.timeFrom = timeFrom;
            request.timeTo = timeTo;
            request.parentProduct = parentProduct;
            request.grouping = grouping;
            request.limit = limit;
            request.page = page;
            request.opcRequestId = opcRequestId;
            request.xOneOriginRegion = xOneOriginRegion;
            return request;
            // new ListComputedUsageAggregatedsRequest(compartmentId, subscriptionId, timeFrom,
            // timeTo, parentProduct, grouping, limit, page, opcRequestId, xOneOriginRegion);
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
                .subscriptionId(subscriptionId)
                .timeFrom(timeFrom)
                .timeTo(timeTo)
                .parentProduct(parentProduct)
                .grouping(grouping)
                .limit(limit)
                .page(page)
                .opcRequestId(opcRequestId)
                .xOneOriginRegion(xOneOriginRegion);
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
        sb.append(",subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(",timeFrom=").append(String.valueOf(this.timeFrom));
        sb.append(",timeTo=").append(String.valueOf(this.timeTo));
        sb.append(",parentProduct=").append(String.valueOf(this.parentProduct));
        sb.append(",grouping=").append(String.valueOf(this.grouping));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",xOneOriginRegion=").append(String.valueOf(this.xOneOriginRegion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListComputedUsageAggregatedsRequest)) {
            return false;
        }

        ListComputedUsageAggregatedsRequest other = (ListComputedUsageAggregatedsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.timeFrom, other.timeFrom)
                && java.util.Objects.equals(this.timeTo, other.timeTo)
                && java.util.Objects.equals(this.parentProduct, other.parentProduct)
                && java.util.Objects.equals(this.grouping, other.grouping)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.xOneOriginRegion, other.xOneOriginRegion);
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
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result = (result * PRIME) + (this.timeFrom == null ? 43 : this.timeFrom.hashCode());
        result = (result * PRIME) + (this.timeTo == null ? 43 : this.timeTo.hashCode());
        result =
                (result * PRIME)
                        + (this.parentProduct == null ? 43 : this.parentProduct.hashCode());
        result = (result * PRIME) + (this.grouping == null ? 43 : this.grouping.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.xOneOriginRegion == null ? 43 : this.xOneOriginRegion.hashCode());
        return result;
    }
}
