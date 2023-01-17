/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetDatabaseFleetHealthMetricsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetDatabaseFleetHealthMetricsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class GetDatabaseFleetHealthMetricsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The baseline time for metrics comparison. */
    private String compareBaselineTime;

    /** The baseline time for metrics comparison. */
    public String getCompareBaselineTime() {
        return compareBaselineTime;
    }
    /** The target time for metrics comparison. */
    private String compareTargetTime;

    /** The target time for metrics comparison. */
    public String getCompareTargetTime() {
        return compareTargetTime;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Managed Database Group.
     */
    private String managedDatabaseGroupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * Managed Database Group.
     */
    public String getManagedDatabaseGroupId() {
        return managedDatabaseGroupId;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    private String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The time window used for metrics comparison. */
    private com.oracle.bmc.databasemanagement.model.CompareType compareType;

    /** The time window used for metrics comparison. */
    public com.oracle.bmc.databasemanagement.model.CompareType getCompareType() {
        return compareType;
    }
    /**
     * The filter used to retrieve a specific set of metrics by passing the desired metric names
     * with a comma separator. Note that, by default, the service returns all supported metrics.
     */
    private String filterByMetricNames;

    /**
     * The filter used to retrieve a specific set of metrics by passing the desired metric names
     * with a comma separator. Note that, by default, the service returns all supported metrics.
     */
    public String getFilterByMetricNames() {
        return filterByMetricNames;
    }
    /** The filter used to filter the databases in the fleet by a specific Oracle Database type. */
    private String filterByDatabaseType;

    /** The filter used to filter the databases in the fleet by a specific Oracle Database type. */
    public String getFilterByDatabaseType() {
        return filterByDatabaseType;
    }
    /**
     * The filter used to filter the databases in the fleet by a specific Oracle Database subtype.
     */
    private String filterByDatabaseSubType;

    /**
     * The filter used to filter the databases in the fleet by a specific Oracle Database subtype.
     */
    public String getFilterByDatabaseSubType() {
        return filterByDatabaseSubType;
    }
    /**
     * The filter used to filter the databases in the fleet by a specific Oracle Database deployment
     * type.
     */
    private String filterByDatabaseDeploymentType;

    /**
     * The filter used to filter the databases in the fleet by a specific Oracle Database deployment
     * type.
     */
    public String getFilterByDatabaseDeploymentType() {
        return filterByDatabaseDeploymentType;
    }
    /**
     * The filter used to filter the databases in the fleet by a specific Oracle Database version.
     */
    private String filterByDatabaseVersion;

    /**
     * The filter used to filter the databases in the fleet by a specific Oracle Database version.
     */
    public String getFilterByDatabaseVersion() {
        return filterByDatabaseVersion;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetDatabaseFleetHealthMetricsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The baseline time for metrics comparison. */
        private String compareBaselineTime = null;

        /**
         * The baseline time for metrics comparison.
         *
         * @param compareBaselineTime the value to set
         * @return this builder instance
         */
        public Builder compareBaselineTime(String compareBaselineTime) {
            this.compareBaselineTime = compareBaselineTime;
            return this;
        }

        /** The target time for metrics comparison. */
        private String compareTargetTime = null;

        /**
         * The target time for metrics comparison.
         *
         * @param compareTargetTime the value to set
         * @return this builder instance
         */
        public Builder compareTargetTime(String compareTargetTime) {
            this.compareTargetTime = compareTargetTime;
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Managed Database Group.
         */
        private String managedDatabaseGroupId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * Managed Database Group.
         *
         * @param managedDatabaseGroupId the value to set
         * @return this builder instance
         */
        public Builder managedDatabaseGroupId(String managedDatabaseGroupId) {
            this.managedDatabaseGroupId = managedDatabaseGroupId;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        private String compartmentId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The time window used for metrics comparison. */
        private com.oracle.bmc.databasemanagement.model.CompareType compareType = null;

        /**
         * The time window used for metrics comparison.
         *
         * @param compareType the value to set
         * @return this builder instance
         */
        public Builder compareType(
                com.oracle.bmc.databasemanagement.model.CompareType compareType) {
            this.compareType = compareType;
            return this;
        }

        /**
         * The filter used to retrieve a specific set of metrics by passing the desired metric names
         * with a comma separator. Note that, by default, the service returns all supported metrics.
         */
        private String filterByMetricNames = null;

        /**
         * The filter used to retrieve a specific set of metrics by passing the desired metric names
         * with a comma separator. Note that, by default, the service returns all supported metrics.
         *
         * @param filterByMetricNames the value to set
         * @return this builder instance
         */
        public Builder filterByMetricNames(String filterByMetricNames) {
            this.filterByMetricNames = filterByMetricNames;
            return this;
        }

        /**
         * The filter used to filter the databases in the fleet by a specific Oracle Database type.
         */
        private String filterByDatabaseType = null;

        /**
         * The filter used to filter the databases in the fleet by a specific Oracle Database type.
         *
         * @param filterByDatabaseType the value to set
         * @return this builder instance
         */
        public Builder filterByDatabaseType(String filterByDatabaseType) {
            this.filterByDatabaseType = filterByDatabaseType;
            return this;
        }

        /**
         * The filter used to filter the databases in the fleet by a specific Oracle Database
         * subtype.
         */
        private String filterByDatabaseSubType = null;

        /**
         * The filter used to filter the databases in the fleet by a specific Oracle Database
         * subtype.
         *
         * @param filterByDatabaseSubType the value to set
         * @return this builder instance
         */
        public Builder filterByDatabaseSubType(String filterByDatabaseSubType) {
            this.filterByDatabaseSubType = filterByDatabaseSubType;
            return this;
        }

        /**
         * The filter used to filter the databases in the fleet by a specific Oracle Database
         * deployment type.
         */
        private String filterByDatabaseDeploymentType = null;

        /**
         * The filter used to filter the databases in the fleet by a specific Oracle Database
         * deployment type.
         *
         * @param filterByDatabaseDeploymentType the value to set
         * @return this builder instance
         */
        public Builder filterByDatabaseDeploymentType(String filterByDatabaseDeploymentType) {
            this.filterByDatabaseDeploymentType = filterByDatabaseDeploymentType;
            return this;
        }

        /**
         * The filter used to filter the databases in the fleet by a specific Oracle Database
         * version.
         */
        private String filterByDatabaseVersion = null;

        /**
         * The filter used to filter the databases in the fleet by a specific Oracle Database
         * version.
         *
         * @param filterByDatabaseVersion the value to set
         * @return this builder instance
         */
        public Builder filterByDatabaseVersion(String filterByDatabaseVersion) {
            this.filterByDatabaseVersion = filterByDatabaseVersion;
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
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetDatabaseFleetHealthMetricsRequest
         */
        public GetDatabaseFleetHealthMetricsRequest build() {
            GetDatabaseFleetHealthMetricsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetDatabaseFleetHealthMetricsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetDatabaseFleetHealthMetricsRequest
         */
        public GetDatabaseFleetHealthMetricsRequest buildWithoutInvocationCallback() {
            GetDatabaseFleetHealthMetricsRequest request =
                    new GetDatabaseFleetHealthMetricsRequest();
            request.compareBaselineTime = compareBaselineTime;
            request.compareTargetTime = compareTargetTime;
            request.opcRequestId = opcRequestId;
            request.managedDatabaseGroupId = managedDatabaseGroupId;
            request.compartmentId = compartmentId;
            request.compareType = compareType;
            request.filterByMetricNames = filterByMetricNames;
            request.filterByDatabaseType = filterByDatabaseType;
            request.filterByDatabaseSubType = filterByDatabaseSubType;
            request.filterByDatabaseDeploymentType = filterByDatabaseDeploymentType;
            request.filterByDatabaseVersion = filterByDatabaseVersion;
            return request;
            // new GetDatabaseFleetHealthMetricsRequest(compareBaselineTime, compareTargetTime,
            // opcRequestId, managedDatabaseGroupId, compartmentId, compareType,
            // filterByMetricNames, filterByDatabaseType, filterByDatabaseSubType,
            // filterByDatabaseDeploymentType, filterByDatabaseVersion);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compareBaselineTime(compareBaselineTime)
                .compareTargetTime(compareTargetTime)
                .opcRequestId(opcRequestId)
                .managedDatabaseGroupId(managedDatabaseGroupId)
                .compartmentId(compartmentId)
                .compareType(compareType)
                .filterByMetricNames(filterByMetricNames)
                .filterByDatabaseType(filterByDatabaseType)
                .filterByDatabaseSubType(filterByDatabaseSubType)
                .filterByDatabaseDeploymentType(filterByDatabaseDeploymentType)
                .filterByDatabaseVersion(filterByDatabaseVersion);
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
        sb.append(",compareBaselineTime=").append(String.valueOf(this.compareBaselineTime));
        sb.append(",compareTargetTime=").append(String.valueOf(this.compareTargetTime));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",managedDatabaseGroupId=").append(String.valueOf(this.managedDatabaseGroupId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",compareType=").append(String.valueOf(this.compareType));
        sb.append(",filterByMetricNames=").append(String.valueOf(this.filterByMetricNames));
        sb.append(",filterByDatabaseType=").append(String.valueOf(this.filterByDatabaseType));
        sb.append(",filterByDatabaseSubType=").append(String.valueOf(this.filterByDatabaseSubType));
        sb.append(",filterByDatabaseDeploymentType=")
                .append(String.valueOf(this.filterByDatabaseDeploymentType));
        sb.append(",filterByDatabaseVersion=").append(String.valueOf(this.filterByDatabaseVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDatabaseFleetHealthMetricsRequest)) {
            return false;
        }

        GetDatabaseFleetHealthMetricsRequest other = (GetDatabaseFleetHealthMetricsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compareBaselineTime, other.compareBaselineTime)
                && java.util.Objects.equals(this.compareTargetTime, other.compareTargetTime)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.managedDatabaseGroupId, other.managedDatabaseGroupId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.compareType, other.compareType)
                && java.util.Objects.equals(this.filterByMetricNames, other.filterByMetricNames)
                && java.util.Objects.equals(this.filterByDatabaseType, other.filterByDatabaseType)
                && java.util.Objects.equals(
                        this.filterByDatabaseSubType, other.filterByDatabaseSubType)
                && java.util.Objects.equals(
                        this.filterByDatabaseDeploymentType, other.filterByDatabaseDeploymentType)
                && java.util.Objects.equals(
                        this.filterByDatabaseVersion, other.filterByDatabaseVersion);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compareBaselineTime == null
                                ? 43
                                : this.compareBaselineTime.hashCode());
        result =
                (result * PRIME)
                        + (this.compareTargetTime == null ? 43 : this.compareTargetTime.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.managedDatabaseGroupId == null
                                ? 43
                                : this.managedDatabaseGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.compareType == null ? 43 : this.compareType.hashCode());
        result =
                (result * PRIME)
                        + (this.filterByMetricNames == null
                                ? 43
                                : this.filterByMetricNames.hashCode());
        result =
                (result * PRIME)
                        + (this.filterByDatabaseType == null
                                ? 43
                                : this.filterByDatabaseType.hashCode());
        result =
                (result * PRIME)
                        + (this.filterByDatabaseSubType == null
                                ? 43
                                : this.filterByDatabaseSubType.hashCode());
        result =
                (result * PRIME)
                        + (this.filterByDatabaseDeploymentType == null
                                ? 43
                                : this.filterByDatabaseDeploymentType.hashCode());
        result =
                (result * PRIME)
                        + (this.filterByDatabaseVersion == null
                                ? 43
                                : this.filterByDatabaseVersion.hashCode());
        return result;
    }
}
