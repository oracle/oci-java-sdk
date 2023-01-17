/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.requests;

import com.oracle.bmc.cloudmigrations.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/cloudmigrations/ListAvailableShapesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListAvailableShapesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
public class ListAvailableShapesRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique migration plan identifier
     */
    private String migrationPlanId;

    /**
     * Unique migration plan identifier
     */
    public String getMigrationPlanId() {
        return migrationPlanId;
    }
    /**
     * The ID of the compartment in which to list resources.
     */
    private String compartmentId;

    /**
     * The ID of the compartment in which to list resources.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The ID of the Dvh in which to list resources.
     */
    private String dvhHostId;

    /**
     * The ID of the Dvh in which to list resources.
     */
    public String getDvhHostId() {
        return dvhHostId;
    }
    /**
     * The availability domain in which to list resources.
     */
    private String availabilityDomain;

    /**
     * The availability domain in which to list resources.
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }
    /**
     * The reserved capacity ID for which to list resources.
     */
    private String reservedCapacityId;

    /**
     * The reserved capacity ID for which to list resources.
     */
    public String getReservedCapacityId() {
        return reservedCapacityId;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The maximum number of items to return.
     */
    private Integer limit;

    /**
     * The maximum number of items to return.
     */
    public Integer getLimit() {
        return limit;
    }
    /**
     * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of the previous response.
     */
    private String page;

    /**
     * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of the previous response.
     */
    public String getPage() {
        return page;
    }
    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    private com.oracle.bmc.cloudmigrations.model.SortOrder sortOrder;

    /**
     * The sort order to use, either 'ASC' or 'DESC'.
     */
    public com.oracle.bmc.cloudmigrations.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * The field to sort by. Only one sort order can be provided. The default order for 'timeCreated' is descending. The default order for 'displayName' is ascending.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort by. Only one sort order can be provided. The default order for 'timeCreated' is descending. The default order for 'displayName' is ascending.
     *
     **/
    public enum SortBy {
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
     * The field to sort by. Only one sort order can be provided. The default order for 'timeCreated' is descending. The default order for 'displayName' is ascending.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListAvailableShapesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique migration plan identifier
         */
        private String migrationPlanId = null;

        /**
         * Unique migration plan identifier
         * @param migrationPlanId the value to set
         * @return this builder instance
         */
        public Builder migrationPlanId(String migrationPlanId) {
            this.migrationPlanId = migrationPlanId;
            return this;
        }

        /**
         * The ID of the compartment in which to list resources.
         */
        private String compartmentId = null;

        /**
         * The ID of the compartment in which to list resources.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The ID of the Dvh in which to list resources.
         */
        private String dvhHostId = null;

        /**
         * The ID of the Dvh in which to list resources.
         * @param dvhHostId the value to set
         * @return this builder instance
         */
        public Builder dvhHostId(String dvhHostId) {
            this.dvhHostId = dvhHostId;
            return this;
        }

        /**
         * The availability domain in which to list resources.
         */
        private String availabilityDomain = null;

        /**
         * The availability domain in which to list resources.
         * @param availabilityDomain the value to set
         * @return this builder instance
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            return this;
        }

        /**
         * The reserved capacity ID for which to list resources.
         */
        private String reservedCapacityId = null;

        /**
         * The reserved capacity ID for which to list resources.
         * @param reservedCapacityId the value to set
         * @return this builder instance
         */
        public Builder reservedCapacityId(String reservedCapacityId) {
            this.reservedCapacityId = reservedCapacityId;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The maximum number of items to return.
         */
        private Integer limit = null;

        /**
         * The maximum number of items to return.
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Integer limit) {
            this.limit = limit;
            return this;
        }

        /**
         * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of the previous response.
         */
        private String page = null;

        /**
         * A token representing the position at which to start retrieving results. This must come from the {@code opc-next-page} header field of the previous response.
         * @param page the value to set
         * @return this builder instance
         */
        public Builder page(String page) {
            this.page = page;
            return this;
        }

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         */
        private com.oracle.bmc.cloudmigrations.model.SortOrder sortOrder = null;

        /**
         * The sort order to use, either 'ASC' or 'DESC'.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.cloudmigrations.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * The field to sort by. Only one sort order can be provided. The default order for 'timeCreated' is descending. The default order for 'displayName' is ascending.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort by. Only one sort order can be provided. The default order for 'timeCreated' is descending. The default order for 'displayName' is ascending.
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
        public Builder copy(ListAvailableShapesRequest o) {
            migrationPlanId(o.getMigrationPlanId());
            compartmentId(o.getCompartmentId());
            dvhHostId(o.getDvhHostId());
            availabilityDomain(o.getAvailabilityDomain());
            reservedCapacityId(o.getReservedCapacityId());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            sortOrder(o.getSortOrder());
            sortBy(o.getSortBy());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListAvailableShapesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListAvailableShapesRequest
         */
        public ListAvailableShapesRequest build() {
            ListAvailableShapesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListAvailableShapesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListAvailableShapesRequest
         */
        public ListAvailableShapesRequest buildWithoutInvocationCallback() {
            ListAvailableShapesRequest request = new ListAvailableShapesRequest();
            request.migrationPlanId = migrationPlanId;
            request.compartmentId = compartmentId;
            request.dvhHostId = dvhHostId;
            request.availabilityDomain = availabilityDomain;
            request.reservedCapacityId = reservedCapacityId;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.sortOrder = sortOrder;
            request.sortBy = sortBy;
            return request;
            // new ListAvailableShapesRequest(migrationPlanId, compartmentId, dvhHostId, availabilityDomain, reservedCapacityId, opcRequestId, limit, page, sortOrder, sortBy);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .migrationPlanId(migrationPlanId)
                .compartmentId(compartmentId)
                .dvhHostId(dvhHostId)
                .availabilityDomain(availabilityDomain)
                .reservedCapacityId(reservedCapacityId)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .sortOrder(sortOrder)
                .sortBy(sortBy);
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
        sb.append(",migrationPlanId=").append(String.valueOf(this.migrationPlanId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",dvhHostId=").append(String.valueOf(this.dvhHostId));
        sb.append(",availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(",reservedCapacityId=").append(String.valueOf(this.reservedCapacityId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
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
        if (!(o instanceof ListAvailableShapesRequest)) {
            return false;
        }

        ListAvailableShapesRequest other = (ListAvailableShapesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.migrationPlanId, other.migrationPlanId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.dvhHostId, other.dvhHostId)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.reservedCapacityId, other.reservedCapacityId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
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
                        + (this.migrationPlanId == null ? 43 : this.migrationPlanId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.dvhHostId == null ? 43 : this.dvhHostId.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.reservedCapacityId == null
                                ? 43
                                : this.reservedCapacityId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        return result;
    }
}
