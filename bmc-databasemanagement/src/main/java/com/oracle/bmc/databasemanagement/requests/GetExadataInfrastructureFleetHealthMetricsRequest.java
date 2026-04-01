/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetExadataInfrastructureFleetHealthMetricsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetExadataInfrastructureFleetHealthMetricsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class GetExadataInfrastructureFleetHealthMetricsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /**
     * The baseline time for metrics comparison.
     */
    private String compareBaselineTime;

    /**
     * The baseline time for metrics comparison.
     */
    public String getCompareBaselineTime() {
        return compareBaselineTime;
    }
    /**
     * The target time for metrics comparison.
     */
    private String compareTargetTime;

    /**
     * The target time for metrics comparison.
     */
    public String getCompareTargetTime() {
        return compareTargetTime;
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
     * The time window used for metrics comparison.
     */
    private com.oracle.bmc.databasemanagement.model.CompareType compareType;

    /**
     * The time window used for metrics comparison.
     */
    public com.oracle.bmc.databasemanagement.model.CompareType getCompareType() {
        return compareType;
    }
    /**
     * The filter used to filter the Exadata infrastructures in the fleet by a specific deployment type.
     */
    private com.oracle.bmc.databasemanagement.model.ExadataInfrastructureDeploymentType
            filterByExadataInfrastructureDeploymentType;

    /**
     * The filter used to filter the Exadata infrastructures in the fleet by a specific deployment type.
     */
    public com.oracle.bmc.databasemanagement.model.ExadataInfrastructureDeploymentType
            getFilterByExadataInfrastructureDeploymentType() {
        return filterByExadataInfrastructureDeploymentType;
    }
    /**
     * The filter used to filter the Exadata infrastructure in the fleet by its lifecycle state.
     * If the parameter is not provided, Exdata infrastructures in any state are returned.
     *
     */
    private com.oracle.bmc.databasemanagement.model.ExadataInfrastructureLifecycleStateValues.State
            filterByExadataInfrastructureLifecycleState;

    /**
     * The filter used to filter the Exadata infrastructure in the fleet by its lifecycle state.
     * If the parameter is not provided, Exdata infrastructures in any state are returned.
     *
     */
    public com.oracle.bmc.databasemanagement.model.ExadataInfrastructureLifecycleStateValues.State
            getFilterByExadataInfrastructureLifecycleState() {
        return filterByExadataInfrastructureLifecycleState;
    }
    /**
     * The field to sort information by. Only one sortOrder can be used. The default sort order
     * for \u2018TIMECREATED\u2019 is descending and the default sort order for \u2018NAME\u2019 is ascending.
     * The \u2018NAME\u2019 sort order is case-sensitive.
     *
     */
    private SortBy sortBy;

    /**
     * The field to sort information by. Only one sortOrder can be used. The default sort order
     * for \u2018TIMECREATED\u2019 is descending and the default sort order for \u2018NAME\u2019 is ascending.
     * The \u2018NAME\u2019 sort order is case-sensitive.
     *
     **/
    public enum SortBy {
        Timecreated("TIMECREATED"),
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

    /**
     * The field to sort information by. Only one sortOrder can be used. The default sort order
     * for \u2018TIMECREATED\u2019 is descending and the default sort order for \u2018NAME\u2019 is ascending.
     * The \u2018NAME\u2019 sort order is case-sensitive.
     *
     */
    public SortBy getSortBy() {
        return sortBy;
    }
    /**
     * The option to sort information in ascending (\u2018ASC\u2019) or descending (\u2018DESC\u2019) order. Ascending order is the default order.
     */
    private com.oracle.bmc.databasemanagement.model.SortOrders sortOrder;

    /**
     * The option to sort information in ascending (\u2018ASC\u2019) or descending (\u2018DESC\u2019) order. Ascending order is the default order.
     */
    public com.oracle.bmc.databasemanagement.model.SortOrders getSortOrder() {
        return sortOrder;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetExadataInfrastructureFleetHealthMetricsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the compartment.
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /**
         * The baseline time for metrics comparison.
         */
        private String compareBaselineTime = null;

        /**
         * The baseline time for metrics comparison.
         * @param compareBaselineTime the value to set
         * @return this builder instance
         */
        public Builder compareBaselineTime(String compareBaselineTime) {
            this.compareBaselineTime = compareBaselineTime;
            return this;
        }

        /**
         * The target time for metrics comparison.
         */
        private String compareTargetTime = null;

        /**
         * The target time for metrics comparison.
         * @param compareTargetTime the value to set
         * @return this builder instance
         */
        public Builder compareTargetTime(String compareTargetTime) {
            this.compareTargetTime = compareTargetTime;
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
         * The time window used for metrics comparison.
         */
        private com.oracle.bmc.databasemanagement.model.CompareType compareType = null;

        /**
         * The time window used for metrics comparison.
         * @param compareType the value to set
         * @return this builder instance
         */
        public Builder compareType(
                com.oracle.bmc.databasemanagement.model.CompareType compareType) {
            this.compareType = compareType;
            return this;
        }

        /**
         * The filter used to filter the Exadata infrastructures in the fleet by a specific deployment type.
         */
        private com.oracle.bmc.databasemanagement.model.ExadataInfrastructureDeploymentType
                filterByExadataInfrastructureDeploymentType = null;

        /**
         * The filter used to filter the Exadata infrastructures in the fleet by a specific deployment type.
         * @param filterByExadataInfrastructureDeploymentType the value to set
         * @return this builder instance
         */
        public Builder filterByExadataInfrastructureDeploymentType(
                com.oracle.bmc.databasemanagement.model.ExadataInfrastructureDeploymentType
                        filterByExadataInfrastructureDeploymentType) {
            this.filterByExadataInfrastructureDeploymentType =
                    filterByExadataInfrastructureDeploymentType;
            return this;
        }

        /**
         * The filter used to filter the Exadata infrastructure in the fleet by its lifecycle state.
         * If the parameter is not provided, Exdata infrastructures in any state are returned.
         *
         */
        private com.oracle.bmc.databasemanagement.model.ExadataInfrastructureLifecycleStateValues
                        .State
                filterByExadataInfrastructureLifecycleState = null;

        /**
         * The filter used to filter the Exadata infrastructure in the fleet by its lifecycle state.
         * If the parameter is not provided, Exdata infrastructures in any state are returned.
         *
         * @param filterByExadataInfrastructureLifecycleState the value to set
         * @return this builder instance
         */
        public Builder filterByExadataInfrastructureLifecycleState(
                com.oracle.bmc.databasemanagement.model.ExadataInfrastructureLifecycleStateValues
                                .State
                        filterByExadataInfrastructureLifecycleState) {
            this.filterByExadataInfrastructureLifecycleState =
                    filterByExadataInfrastructureLifecycleState;
            return this;
        }

        /**
         * The field to sort information by. Only one sortOrder can be used. The default sort order
         * for \u2018TIMECREATED\u2019 is descending and the default sort order for \u2018NAME\u2019 is ascending.
         * The \u2018NAME\u2019 sort order is case-sensitive.
         *
         */
        private SortBy sortBy = null;

        /**
         * The field to sort information by. Only one sortOrder can be used. The default sort order
         * for \u2018TIMECREATED\u2019 is descending and the default sort order for \u2018NAME\u2019 is ascending.
         * The \u2018NAME\u2019 sort order is case-sensitive.
         *
         * @param sortBy the value to set
         * @return this builder instance
         */
        public Builder sortBy(SortBy sortBy) {
            this.sortBy = sortBy;
            return this;
        }

        /**
         * The option to sort information in ascending (\u2018ASC\u2019) or descending (\u2018DESC\u2019) order. Ascending order is the default order.
         */
        private com.oracle.bmc.databasemanagement.model.SortOrders sortOrder = null;

        /**
         * The option to sort information in ascending (\u2018ASC\u2019) or descending (\u2018DESC\u2019) order. Ascending order is the default order.
         * @param sortOrder the value to set
         * @return this builder instance
         */
        public Builder sortOrder(com.oracle.bmc.databasemanagement.model.SortOrders sortOrder) {
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
        public Builder copy(GetExadataInfrastructureFleetHealthMetricsRequest o) {
            compartmentId(o.getCompartmentId());
            compareBaselineTime(o.getCompareBaselineTime());
            compareTargetTime(o.getCompareTargetTime());
            opcRequestId(o.getOpcRequestId());
            compareType(o.getCompareType());
            filterByExadataInfrastructureDeploymentType(
                    o.getFilterByExadataInfrastructureDeploymentType());
            filterByExadataInfrastructureLifecycleState(
                    o.getFilterByExadataInfrastructureLifecycleState());
            sortBy(o.getSortBy());
            sortOrder(o.getSortOrder());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetExadataInfrastructureFleetHealthMetricsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetExadataInfrastructureFleetHealthMetricsRequest
         */
        public GetExadataInfrastructureFleetHealthMetricsRequest build() {
            GetExadataInfrastructureFleetHealthMetricsRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetExadataInfrastructureFleetHealthMetricsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetExadataInfrastructureFleetHealthMetricsRequest
         */
        public GetExadataInfrastructureFleetHealthMetricsRequest buildWithoutInvocationCallback() {
            GetExadataInfrastructureFleetHealthMetricsRequest request =
                    new GetExadataInfrastructureFleetHealthMetricsRequest();
            request.compartmentId = compartmentId;
            request.compareBaselineTime = compareBaselineTime;
            request.compareTargetTime = compareTargetTime;
            request.opcRequestId = opcRequestId;
            request.compareType = compareType;
            request.filterByExadataInfrastructureDeploymentType =
                    filterByExadataInfrastructureDeploymentType;
            request.filterByExadataInfrastructureLifecycleState =
                    filterByExadataInfrastructureLifecycleState;
            request.sortBy = sortBy;
            request.sortOrder = sortOrder;
            return request;
            // new GetExadataInfrastructureFleetHealthMetricsRequest(compartmentId, compareBaselineTime, compareTargetTime, opcRequestId, compareType, filterByExadataInfrastructureDeploymentType, filterByExadataInfrastructureLifecycleState, sortBy, sortOrder);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .compareBaselineTime(compareBaselineTime)
                .compareTargetTime(compareTargetTime)
                .opcRequestId(opcRequestId)
                .compareType(compareType)
                .filterByExadataInfrastructureDeploymentType(
                        filterByExadataInfrastructureDeploymentType)
                .filterByExadataInfrastructureLifecycleState(
                        filterByExadataInfrastructureLifecycleState)
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
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",compareBaselineTime=").append(String.valueOf(this.compareBaselineTime));
        sb.append(",compareTargetTime=").append(String.valueOf(this.compareTargetTime));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",compareType=").append(String.valueOf(this.compareType));
        sb.append(",filterByExadataInfrastructureDeploymentType=")
                .append(String.valueOf(this.filterByExadataInfrastructureDeploymentType));
        sb.append(",filterByExadataInfrastructureLifecycleState=")
                .append(String.valueOf(this.filterByExadataInfrastructureLifecycleState));
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
        if (!(o instanceof GetExadataInfrastructureFleetHealthMetricsRequest)) {
            return false;
        }

        GetExadataInfrastructureFleetHealthMetricsRequest other =
                (GetExadataInfrastructureFleetHealthMetricsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.compareBaselineTime, other.compareBaselineTime)
                && java.util.Objects.equals(this.compareTargetTime, other.compareTargetTime)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.compareType, other.compareType)
                && java.util.Objects.equals(
                        this.filterByExadataInfrastructureDeploymentType,
                        other.filterByExadataInfrastructureDeploymentType)
                && java.util.Objects.equals(
                        this.filterByExadataInfrastructureLifecycleState,
                        other.filterByExadataInfrastructureLifecycleState)
                && java.util.Objects.equals(this.sortBy, other.sortBy)
                && java.util.Objects.equals(this.sortOrder, other.sortOrder);
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
                        + (this.compareBaselineTime == null
                                ? 43
                                : this.compareBaselineTime.hashCode());
        result =
                (result * PRIME)
                        + (this.compareTargetTime == null ? 43 : this.compareTargetTime.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.compareType == null ? 43 : this.compareType.hashCode());
        result =
                (result * PRIME)
                        + (this.filterByExadataInfrastructureDeploymentType == null
                                ? 43
                                : this.filterByExadataInfrastructureDeploymentType.hashCode());
        result =
                (result * PRIME)
                        + (this.filterByExadataInfrastructureLifecycleState == null
                                ? 43
                                : this.filterByExadataInfrastructureLifecycleState.hashCode());
        result = (result * PRIME) + (this.sortBy == null ? 43 : this.sortBy.hashCode());
        result = (result * PRIME) + (this.sortOrder == null ? 43 : this.sortOrder.hashCode());
        return result;
    }
}
