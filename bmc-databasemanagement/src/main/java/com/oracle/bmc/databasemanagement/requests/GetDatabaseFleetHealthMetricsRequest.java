/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetDatabaseFleetHealthMetricsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetDatabaseFleetHealthMetricsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GetDatabaseFleetHealthMetricsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The baseline time for metrics comparison.
     */
    private String compareBaselineTime;

    /**
     * The target time for metrics comparison.
     */
    private String compareTargetTime;

    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Managed Database Group.
     */
    private String managedDatabaseGroupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment.
     */
    private String compartmentId;

    /**
     * The time window used for metrics comparison.
     */
    private com.oracle.bmc.databasemanagement.model.CompareType compareType;

    /**
     * The filter used to retrieve a specific set of metrics by passing the desired metric names with a comma separator. Note that, by default, the service returns all supported metrics.
     */
    private String filterByMetricNames;

    /**
     * The filter used to filter the databases in the fleet by a specific Oracle Database type.
     */
    private String filterByDatabaseType;

    /**
     * The filter used to filter the databases in the fleet by a specific Oracle Database subtype.
     */
    private String filterByDatabaseSubType;

    /**
     * The filter used to filter the databases in the fleet by a specific Oracle Database deployment type.
     */
    private String filterByDatabaseDeploymentType;

    /**
     * The filter used to filter the databases in the fleet by a specific Oracle Database version.
     */
    private String filterByDatabaseVersion;

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetDatabaseFleetHealthMetricsRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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
        public Builder copy(GetDatabaseFleetHealthMetricsRequest o) {
            compareBaselineTime(o.getCompareBaselineTime());
            compareTargetTime(o.getCompareTargetTime());
            opcRequestId(o.getOpcRequestId());
            managedDatabaseGroupId(o.getManagedDatabaseGroupId());
            compartmentId(o.getCompartmentId());
            compareType(o.getCompareType());
            filterByMetricNames(o.getFilterByMetricNames());
            filterByDatabaseType(o.getFilterByDatabaseType());
            filterByDatabaseSubType(o.getFilterByDatabaseSubType());
            filterByDatabaseDeploymentType(o.getFilterByDatabaseDeploymentType());
            filterByDatabaseVersion(o.getFilterByDatabaseVersion());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetDatabaseFleetHealthMetricsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetDatabaseFleetHealthMetricsRequest
         */
        public GetDatabaseFleetHealthMetricsRequest build() {
            GetDatabaseFleetHealthMetricsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
