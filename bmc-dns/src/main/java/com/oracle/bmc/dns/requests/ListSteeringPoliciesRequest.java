/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.requests;

import com.oracle.bmc.dns.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dns/ListSteeringPoliciesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ListSteeringPoliciesRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
public class ListSteeringPoliciesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The OCID of the compartment the resource belongs to.
     */
    private String compartmentId;

    /**
     * The OCID of the compartment the resource belongs to.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need
     * to contact Oracle about a particular request, please provide
     * the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need
     * to contact Oracle about a particular request, please provide
     * the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The maximum number of items to return in a page of the collection.
     *
     */
    private Long limit;

    /**
     * The maximum number of items to return in a page of the collection.
     *
     */
    public Long getLimit() {
        return limit;
    }
    /**
     * The value of the {@code opc-next-page} response header from the previous "List" call.
     *
     */
    private String page;

    /**
     * The value of the {@code opc-next-page} response header from the previous "List" call.
     *
     */
    public String getPage() {
        return page;
    }
    /**
     * The OCID of a resource.
     */
    private String id;

    /**
     * The OCID of a resource.
     */
    public String getId() {
        return id;
    }
    /**
     * The displayName of a resource.
     */
    private String displayName;

    /**
     * The displayName of a resource.
     */
    public String getDisplayName() {
        return displayName;
    }
    /**
     * The partial displayName of a resource. Will match any resource whose name
     * (case-insensitive) contains the provided value.
     *
     */
    private String displayNameContains;

    /**
     * The partial displayName of a resource. Will match any resource whose name
     * (case-insensitive) contains the provided value.
     *
     */
    public String getDisplayNameContains() {
        return displayNameContains;
    }
    /**
     * Search by health check monitor OCID.
     * Will match any resource whose health check monitor ID matches the provided value.
     *
     */
    private String healthCheckMonitorId;

    /**
     * Search by health check monitor OCID.
     * Will match any resource whose health check monitor ID matches the provided value.
     *
     */
    public String getHealthCheckMonitorId() {
        return healthCheckMonitorId;
    }
    /**
     * An [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) timestamp that states
     * all returned resources were created on or after the indicated time.
     *
     */
    private java.util.Date timeCreatedGreaterThanOrEqualTo;

    /**
     * An [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) timestamp that states
     * all returned resources were created on or after the indicated time.
     *
     */
    public java.util.Date getTimeCreatedGreaterThanOrEqualTo() {
        return timeCreatedGreaterThanOrEqualTo;
    }
    /**
     * An [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) timestamp that states
     * all returned resources were created before the indicated time.
     *
     */
    private java.util.Date timeCreatedLessThan;

    /**
     * An [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) timestamp that states
     * all returned resources were created before the indicated time.
     *
     */
    public java.util.Date getTimeCreatedLessThan() {
        return timeCreatedLessThan;
    }
    /**
     * Search by steering template type.
     * Will match any resource whose template type matches the provided value.
     *
     */
    private String template;

    /**
     * Search by steering template type.
     * Will match any resource whose template type matches the provided value.
     *
     */
    public String getTemplate() {
        return template;
    }
    /**
     * The state of a resource.
     */
    private com.oracle.bmc.dns.model.SteeringPolicySummary.LifecycleState lifecycleState;

    /**
     * The state of a resource.
     */
    public com.oracle.bmc.dns.model.SteeringPolicySummary.LifecycleState getLifecycleState() {
        return lifecycleState;
    }
    /**
     * The field by which to sort steering policies. If unspecified, defaults to {@code timeCreated}.
     */
    private SortBy sortBy;

    /**
     * The field by which to sort steering policies. If unspecified, defaults to {@code timeCreated}.
     **/
    public enum SortBy {
        DisplayName("displayName"),
        TimeCreated("timeCreated"),
        Template("template"),
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
     * The field by which to sort steering policies. If unspecified, defaults to {@code timeCreated}.
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The order to sort the resources.
     *
     */
    private com.oracle.bmc.dns.model.SortOrder sortOrder;

    /**
     * The order to sort the resources.
     *
     */
    public com.oracle.bmc.dns.model.SortOrder getSortOrder() {
        return sortOrder;
    }
    /**
     * Specifies to operate only on resources that have a matching DNS scope.
     *
     */
    private com.oracle.bmc.dns.model.Scope scope;

    /**
     * Specifies to operate only on resources that have a matching DNS scope.
     *
     */
    public com.oracle.bmc.dns.model.Scope getScope() {
        return scope;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ListSteeringPoliciesRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the compartment the resource belongs to.
         */
        private String compartmentId = null;

        /**
         * The OCID of the compartment the resource belongs to.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need
         * to contact Oracle about a particular request, please provide
         * the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need
         * to contact Oracle about a particular request, please provide
         * the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The maximum number of items to return in a page of the collection.
         *
         */
        private Long limit = null;

        /**
         * The maximum number of items to return in a page of the collection.
         *
         * @param limit the value to set
         * @return this builder instance
         */
        public Builder limit(Long limit) {
            this.limit = limit;
            return this;
        }

        /**
         * The value of the {@code opc-next-page} response header from the previous "List" call.
         *
         */
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
         * The OCID of a resource.
         */
        private String id = null;

        /**
         * The OCID of a resource.
         * @param id the value to set
         * @return this builder instance
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * The displayName of a resource.
         */
        private String displayName = null;

        /**
         * The displayName of a resource.
         * @param displayName the value to set
         * @return this builder instance
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * The partial displayName of a resource. Will match any resource whose name
         * (case-insensitive) contains the provided value.
         *
         */
        private String displayNameContains = null;

        /**
         * The partial displayName of a resource. Will match any resource whose name
         * (case-insensitive) contains the provided value.
         *
         * @param displayNameContains the value to set
         * @return this builder instance
         */
        public Builder displayNameContains(String displayNameContains) {
            this.displayNameContains = displayNameContains;
            return this;
        }

        /**
         * Search by health check monitor OCID.
         * Will match any resource whose health check monitor ID matches the provided value.
         *
         */
        private String healthCheckMonitorId = null;

        /**
         * Search by health check monitor OCID.
         * Will match any resource whose health check monitor ID matches the provided value.
         *
         * @param healthCheckMonitorId the value to set
         * @return this builder instance
         */
        public Builder healthCheckMonitorId(String healthCheckMonitorId) {
            this.healthCheckMonitorId = healthCheckMonitorId;
            return this;
        }

        /**
         * An [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) timestamp that states
         * all returned resources were created on or after the indicated time.
         *
         */
        private java.util.Date timeCreatedGreaterThanOrEqualTo = null;

        /**
         * An [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) timestamp that states
         * all returned resources were created on or after the indicated time.
         *
         * @param timeCreatedGreaterThanOrEqualTo the value to set
         * @return this builder instance
         */
        public Builder timeCreatedGreaterThanOrEqualTo(
                java.util.Date timeCreatedGreaterThanOrEqualTo) {
            this.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            return this;
        }

        /**
         * An [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) timestamp that states
         * all returned resources were created before the indicated time.
         *
         */
        private java.util.Date timeCreatedLessThan = null;

        /**
         * An [RFC 3339](https://www.ietf.org/rfc/rfc3339.txt) timestamp that states
         * all returned resources were created before the indicated time.
         *
         * @param timeCreatedLessThan the value to set
         * @return this builder instance
         */
        public Builder timeCreatedLessThan(java.util.Date timeCreatedLessThan) {
            this.timeCreatedLessThan = timeCreatedLessThan;
            return this;
        }

        /**
         * Search by steering template type.
         * Will match any resource whose template type matches the provided value.
         *
         */
        private String template = null;

        /**
         * Search by steering template type.
         * Will match any resource whose template type matches the provided value.
         *
         * @param template the value to set
         * @return this builder instance
         */
        public Builder template(String template) {
            this.template = template;
            return this;
        }

        /**
         * The state of a resource.
         */
        private com.oracle.bmc.dns.model.SteeringPolicySummary.LifecycleState lifecycleState = null;

        /**
         * The state of a resource.
         * @param lifecycleState the value to set
         * @return this builder instance
         */
        public Builder lifecycleState(
                com.oracle.bmc.dns.model.SteeringPolicySummary.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            return this;
        }

        /**
         * The field by which to sort steering policies. If unspecified, defaults to {@code timeCreated}.
         */
        private SortBy sortBy = null;

        /**
         * The field by which to sort steering policies. If unspecified, defaults to {@code timeCreated}.
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The order to sort the resources.
         *
         */
        private com.oracle.bmc.dns.model.SortOrder sortOrder = null;

        /**
         * The order to sort the resources.
         *
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.dns.model.SortOrder sortOrder) {
            this.sortOrder = sortOrder;
            return this;
        }

        /**
         * Specifies to operate only on resources that have a matching DNS scope.
         *
         */
        private com.oracle.bmc.dns.model.Scope scope = null;

        /**
         * Specifies to operate only on resources that have a matching DNS scope.
         *
         * @param scope the value to set
         * @return this builder instance
         */
        public Builder scope(com.oracle.bmc.dns.model.Scope scope) {
            this.scope = scope;
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
        public Builder copy(ListSteeringPoliciesRequest o) {
            compartmentId(o.getCompartmentId());
            opcRequestId(o.getOpcRequestId());
            limit(o.getLimit());
            page(o.getPage());
            id(o.getId());
            displayName(o.getDisplayName());
            displayNameContains(o.getDisplayNameContains());
            healthCheckMonitorId(o.getHealthCheckMonitorId());
            timeCreatedGreaterThanOrEqualTo(o.getTimeCreatedGreaterThanOrEqualTo());
            timeCreatedLessThan(o.getTimeCreatedLessThan());
            template(o.getTemplate());
            lifecycleState(o.getLifecycleState());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            scope(o.getScope());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ListSteeringPoliciesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ListSteeringPoliciesRequest
         */
        public ListSteeringPoliciesRequest build() {
            ListSteeringPoliciesRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of ListSteeringPoliciesRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ListSteeringPoliciesRequest
         */
        public ListSteeringPoliciesRequest buildWithoutInvocationCallback() {
            ListSteeringPoliciesRequest request = new ListSteeringPoliciesRequest();
            request.compartmentId = compartmentId;
            request.opcRequestId = opcRequestId;
            request.limit = limit;
            request.page = page;
            request.id = id;
            request.displayName = displayName;
            request.displayNameContains = displayNameContains;
            request.healthCheckMonitorId = healthCheckMonitorId;
            request.timeCreatedGreaterThanOrEqualTo = timeCreatedGreaterThanOrEqualTo;
            request.timeCreatedLessThan = timeCreatedLessThan;
            request.template = template;
            request.lifecycleState = lifecycleState;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            request.scope = scope;
            return request;
            // new ListSteeringPoliciesRequest(compartmentId, opcRequestId, limit, page, id, displayName, displayNameContains, healthCheckMonitorId, timeCreatedGreaterThanOrEqualTo, timeCreatedLessThan, template, lifecycleState, sortBy, sortOrder, scope);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .opcRequestId(opcRequestId)
                .limit(limit)
                .page(page)
                .id(id)
                .displayName(displayName)
                .displayNameContains(displayNameContains)
                .healthCheckMonitorId(healthCheckMonitorId)
                .timeCreatedGreaterThanOrEqualTo(timeCreatedGreaterThanOrEqualTo)
                .timeCreatedLessThan(timeCreatedLessThan)
                .template(template)
                .lifecycleState(lifecycleState)
                .sortBy(sortBy)
                .sortOrder(sortOrder)
                .scope(scope);
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",limit=").append(String.valueOf(this.limit));
        sb.append(",page=").append(String.valueOf(this.page));
        sb.append(",id=").append(String.valueOf(this.id));
        sb.append(",displayName=").append(String.valueOf(this.displayName));
        sb.append(",displayNameContains=").append(String.valueOf(this.displayNameContains));
        sb.append(",healthCheckMonitorId=").append(String.valueOf(this.healthCheckMonitorId));
        sb.append(",timeCreatedGreaterThanOrEqualTo=")
                .append(String.valueOf(this.timeCreatedGreaterThanOrEqualTo));
        sb.append(",timeCreatedLessThan=").append(String.valueOf(this.timeCreatedLessThan));
        sb.append(",template=").append(String.valueOf(this.template));
        sb.append(",lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(",sortBy=").append(String.valueOf(this.sortBy));
        sb.append(",sortOrder=").append(String.valueOf(this.sortOrder));
        sb.append(",scope=").append(String.valueOf(this.scope));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ListSteeringPoliciesRequest)) {
            return false;
        }

        ListSteeringPoliciesRequest other = (ListSteeringPoliciesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.limit, other.limit)
                && java.util.Objects.equals(this.page, other.page)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.displayNameContains, other.displayNameContains)
                && java.util.Objects.equals(this.healthCheckMonitorId, other.healthCheckMonitorId)
                && java.util.Objects.equals(
                        this.timeCreatedGreaterThanOrEqualTo, other.timeCreatedGreaterThanOrEqualTo)
                && java.util.Objects.equals(this.timeCreatedLessThan, other.timeCreatedLessThan)
                && java.util.Objects.equals(this.template, other.template)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder)
                && java.util.Objects.equals(this.scope, other.scope);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.limit == null ? 43 : this.limit.hashCode());
        result = (result * PRIME) + (this.page == null ? 43 : this.page.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.displayNameContains == null
                                ? 43
                                : this.displayNameContains.hashCode());
        result =
                (result * PRIME)
                        + (this.healthCheckMonitorId == null
                                ? 43
                                : this.healthCheckMonitorId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedGreaterThanOrEqualTo == null
                                ? 43
                                : this.timeCreatedGreaterThanOrEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCreatedLessThan == null
                                ? 43
                                : this.timeCreatedLessThan.hashCode());
        result = (result * PRIME) + (this.template == null ? 43 : this.template.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        return result;
    }
}
