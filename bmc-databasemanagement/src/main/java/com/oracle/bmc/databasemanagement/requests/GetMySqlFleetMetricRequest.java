/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/GetMySqlFleetMetricExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetMySqlFleetMetricRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class GetMySqlFleetMetricRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
     * The start time of the time range to retrieve the health metrics of a Managed Database
     * in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     *
     */
    private String startTime;

    /**
     * The start time of the time range to retrieve the health metrics of a Managed Database
     * in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     *
     */
    public String getStartTime() {
        return startTime;
    }
    /**
     * The end time of the time range to retrieve the health metrics of a Managed Database
     * in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     *
     */
    private String endTime;

    /**
     * The end time of the time range to retrieve the health metrics of a Managed Database
     * in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
     *
     */
    public String getEndTime() {
        return endTime;
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
     * The filter used to retrieve a specific set of metrics by passing the desired metric names with a comma separator. Note that, by default, the service returns all supported metrics.
     */
    private String filterByMetricNames;

    /**
     * The filter used to retrieve a specific set of metrics by passing the desired metric names with a comma separator. Note that, by default, the service returns all supported metrics.
     */
    public String getFilterByMetricNames() {
        return filterByMetricNames;
    }
    /**
     * The parameter to filter by MySQL deployment type.
     */
    private com.oracle.bmc.databasemanagement.model.MySqlDeploymentType
            filterByMySqlDeploymentTypeParam;

    /**
     * The parameter to filter by MySQL deployment type.
     */
    public com.oracle.bmc.databasemanagement.model.MySqlDeploymentType
            getFilterByMySqlDeploymentTypeParam() {
        return filterByMySqlDeploymentTypeParam;
    }
    /**
     * The parameter to filter by MySQL Database System type.
     */
    private com.oracle.bmc.databasemanagement.model.MdsType filterByMdsDeploymentType;

    /**
     * The parameter to filter by MySQL Database System type.
     */
    public com.oracle.bmc.databasemanagement.model.MdsType getFilterByMdsDeploymentType() {
        return filterByMdsDeploymentType;
    }
    /**
     * The parameter to filter by MySQL database type. Allowed values are EXTERNAL or MDS.
     */
    private com.oracle.bmc.databasemanagement.model.MySqlType filterByMySqlDatabaseTypeParam;

    /**
     * The parameter to filter by MySQL database type. Allowed values are EXTERNAL or MDS.
     */
    public com.oracle.bmc.databasemanagement.model.MySqlType getFilterByMySqlDatabaseTypeParam() {
        return filterByMySqlDatabaseTypeParam;
    }
    /**
     * The parameter to filter by MySQL Database status.
     */
    private com.oracle.bmc.databasemanagement.model.DatabaseStatus filterByMySqlStatus;

    /**
     * The parameter to filter by MySQL Database status.
     */
    public com.oracle.bmc.databasemanagement.model.DatabaseStatus getFilterByMySqlStatus() {
        return filterByMySqlStatus;
    }
    /**
     * The parameter to filter by MySQL database version.
     */
    private String filterByMySqlDatabaseVersion;

    /**
     * The parameter to filter by MySQL database version.
     */
    public String getFilterByMySqlDatabaseVersion() {
        return filterByMySqlDatabaseVersion;
    }
    /**
     * The parameter to filter based on whether HeatWave is enabled for the database.
     */
    private Boolean isHeatWaveEnabled;

    /**
     * The parameter to filter based on whether HeatWave is enabled for the database.
     */
    public Boolean getIsHeatWaveEnabled() {
        return isHeatWaveEnabled;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetMySqlFleetMetricRequest, java.lang.Void> {
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
         * The start time of the time range to retrieve the health metrics of a Managed Database
         * in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         *
         */
        private String startTime = null;

        /**
         * The start time of the time range to retrieve the health metrics of a Managed Database
         * in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         *
         * @param startTime the value to set
         * @return this builder instance
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * The end time of the time range to retrieve the health metrics of a Managed Database
         * in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         *
         */
        private String endTime = null;

        /**
         * The end time of the time range to retrieve the health metrics of a Managed Database
         * in UTC in ISO-8601 format, which is "yyyy-MM-dd'T'hh:mm:ss.sss'Z'".
         *
         * @param endTime the value to set
         * @return this builder instance
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
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
         * The filter used to retrieve a specific set of metrics by passing the desired metric names with a comma separator. Note that, by default, the service returns all supported metrics.
         */
        private String filterByMetricNames = null;

        /**
         * The filter used to retrieve a specific set of metrics by passing the desired metric names with a comma separator. Note that, by default, the service returns all supported metrics.
         * @param filterByMetricNames the value to set
         * @return this builder instance
         */
        public Builder filterByMetricNames(String filterByMetricNames) {
            this.filterByMetricNames = filterByMetricNames;
            return this;
        }

        /**
         * The parameter to filter by MySQL deployment type.
         */
        private com.oracle.bmc.databasemanagement.model.MySqlDeploymentType
                filterByMySqlDeploymentTypeParam = null;

        /**
         * The parameter to filter by MySQL deployment type.
         * @param filterByMySqlDeploymentTypeParam the value to set
         * @return this builder instance
         */
        public Builder filterByMySqlDeploymentTypeParam(
                com.oracle.bmc.databasemanagement.model.MySqlDeploymentType
                        filterByMySqlDeploymentTypeParam) {
            this.filterByMySqlDeploymentTypeParam = filterByMySqlDeploymentTypeParam;
            return this;
        }

        /**
         * The parameter to filter by MySQL Database System type.
         */
        private com.oracle.bmc.databasemanagement.model.MdsType filterByMdsDeploymentType = null;

        /**
         * The parameter to filter by MySQL Database System type.
         * @param filterByMdsDeploymentType the value to set
         * @return this builder instance
         */
        public Builder filterByMdsDeploymentType(
                com.oracle.bmc.databasemanagement.model.MdsType filterByMdsDeploymentType) {
            this.filterByMdsDeploymentType = filterByMdsDeploymentType;
            return this;
        }

        /**
         * The parameter to filter by MySQL database type. Allowed values are EXTERNAL or MDS.
         */
        private com.oracle.bmc.databasemanagement.model.MySqlType filterByMySqlDatabaseTypeParam =
                null;

        /**
         * The parameter to filter by MySQL database type. Allowed values are EXTERNAL or MDS.
         * @param filterByMySqlDatabaseTypeParam the value to set
         * @return this builder instance
         */
        public Builder filterByMySqlDatabaseTypeParam(
                com.oracle.bmc.databasemanagement.model.MySqlType filterByMySqlDatabaseTypeParam) {
            this.filterByMySqlDatabaseTypeParam = filterByMySqlDatabaseTypeParam;
            return this;
        }

        /**
         * The parameter to filter by MySQL Database status.
         */
        private com.oracle.bmc.databasemanagement.model.DatabaseStatus filterByMySqlStatus = null;

        /**
         * The parameter to filter by MySQL Database status.
         * @param filterByMySqlStatus the value to set
         * @return this builder instance
         */
        public Builder filterByMySqlStatus(
                com.oracle.bmc.databasemanagement.model.DatabaseStatus filterByMySqlStatus) {
            this.filterByMySqlStatus = filterByMySqlStatus;
            return this;
        }

        /**
         * The parameter to filter by MySQL database version.
         */
        private String filterByMySqlDatabaseVersion = null;

        /**
         * The parameter to filter by MySQL database version.
         * @param filterByMySqlDatabaseVersion the value to set
         * @return this builder instance
         */
        public Builder filterByMySqlDatabaseVersion(String filterByMySqlDatabaseVersion) {
            this.filterByMySqlDatabaseVersion = filterByMySqlDatabaseVersion;
            return this;
        }

        /**
         * The parameter to filter based on whether HeatWave is enabled for the database.
         */
        private Boolean isHeatWaveEnabled = null;

        /**
         * The parameter to filter based on whether HeatWave is enabled for the database.
         * @param isHeatWaveEnabled the value to set
         * @return this builder instance
         */
        public Builder isHeatWaveEnabled(Boolean isHeatWaveEnabled) {
            this.isHeatWaveEnabled = isHeatWaveEnabled;
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
        public Builder copy(GetMySqlFleetMetricRequest o) {
            compartmentId(o.getCompartmentId());
            startTime(o.getStartTime());
            endTime(o.getEndTime());
            opcRequestId(o.getOpcRequestId());
            filterByMetricNames(o.getFilterByMetricNames());
            filterByMySqlDeploymentTypeParam(o.getFilterByMySqlDeploymentTypeParam());
            filterByMdsDeploymentType(o.getFilterByMdsDeploymentType());
            filterByMySqlDatabaseTypeParam(o.getFilterByMySqlDatabaseTypeParam());
            filterByMySqlStatus(o.getFilterByMySqlStatus());
            filterByMySqlDatabaseVersion(o.getFilterByMySqlDatabaseVersion());
            isHeatWaveEnabled(o.getIsHeatWaveEnabled());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetMySqlFleetMetricRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetMySqlFleetMetricRequest
         */
        public GetMySqlFleetMetricRequest build() {
            GetMySqlFleetMetricRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetMySqlFleetMetricRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetMySqlFleetMetricRequest
         */
        public GetMySqlFleetMetricRequest buildWithoutInvocationCallback() {
            GetMySqlFleetMetricRequest request = new GetMySqlFleetMetricRequest();
            request.compartmentId = compartmentId;
            request.startTime = startTime;
            request.endTime = endTime;
            request.opcRequestId = opcRequestId;
            request.filterByMetricNames = filterByMetricNames;
            request.filterByMySqlDeploymentTypeParam = filterByMySqlDeploymentTypeParam;
            request.filterByMdsDeploymentType = filterByMdsDeploymentType;
            request.filterByMySqlDatabaseTypeParam = filterByMySqlDatabaseTypeParam;
            request.filterByMySqlStatus = filterByMySqlStatus;
            request.filterByMySqlDatabaseVersion = filterByMySqlDatabaseVersion;
            request.isHeatWaveEnabled = isHeatWaveEnabled;
            return request;
            // new GetMySqlFleetMetricRequest(compartmentId, startTime, endTime, opcRequestId, filterByMetricNames, filterByMySqlDeploymentTypeParam, filterByMdsDeploymentType, filterByMySqlDatabaseTypeParam, filterByMySqlStatus, filterByMySqlDatabaseVersion, isHeatWaveEnabled);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .compartmentId(compartmentId)
                .startTime(startTime)
                .endTime(endTime)
                .opcRequestId(opcRequestId)
                .filterByMetricNames(filterByMetricNames)
                .filterByMySqlDeploymentTypeParam(filterByMySqlDeploymentTypeParam)
                .filterByMdsDeploymentType(filterByMdsDeploymentType)
                .filterByMySqlDatabaseTypeParam(filterByMySqlDatabaseTypeParam)
                .filterByMySqlStatus(filterByMySqlStatus)
                .filterByMySqlDatabaseVersion(filterByMySqlDatabaseVersion)
                .isHeatWaveEnabled(isHeatWaveEnabled);
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
        sb.append(",startTime=").append(String.valueOf(this.startTime));
        sb.append(",endTime=").append(String.valueOf(this.endTime));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",filterByMetricNames=").append(String.valueOf(this.filterByMetricNames));
        sb.append(",filterByMySqlDeploymentTypeParam=")
                .append(String.valueOf(this.filterByMySqlDeploymentTypeParam));
        sb.append(",filterByMdsDeploymentType=")
                .append(String.valueOf(this.filterByMdsDeploymentType));
        sb.append(",filterByMySqlDatabaseTypeParam=")
                .append(String.valueOf(this.filterByMySqlDatabaseTypeParam));
        sb.append(",filterByMySqlStatus=").append(String.valueOf(this.filterByMySqlStatus));
        sb.append(",filterByMySqlDatabaseVersion=")
                .append(String.valueOf(this.filterByMySqlDatabaseVersion));
        sb.append(",isHeatWaveEnabled=").append(String.valueOf(this.isHeatWaveEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetMySqlFleetMetricRequest)) {
            return false;
        }

        GetMySqlFleetMetricRequest other = (GetMySqlFleetMetricRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.startTime, other.startTime)
                && java.util.Objects.equals(this.endTime, other.endTime)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.filterByMetricNames, other.filterByMetricNames)
                && java.util.Objects.equals(
                        this.filterByMySqlDeploymentTypeParam,
                        other.filterByMySqlDeploymentTypeParam)
                && java.util.Objects.equals(
                        this.filterByMdsDeploymentType, other.filterByMdsDeploymentType)
                && java.util.Objects.equals(
                        this.filterByMySqlDatabaseTypeParam, other.filterByMySqlDatabaseTypeParam)
                && java.util.Objects.equals(this.filterByMySqlStatus, other.filterByMySqlStatus)
                && java.util.Objects.equals(
                        this.filterByMySqlDatabaseVersion, other.filterByMySqlDatabaseVersion)
                && java.util.Objects.equals(this.isHeatWaveEnabled, other.isHeatWaveEnabled);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.filterByMetricNames == null
                                ? 43
                                : this.filterByMetricNames.hashCode());
        result =
                (result * PRIME)
                        + (this.filterByMySqlDeploymentTypeParam == null
                                ? 43
                                : this.filterByMySqlDeploymentTypeParam.hashCode());
        result =
                (result * PRIME)
                        + (this.filterByMdsDeploymentType == null
                                ? 43
                                : this.filterByMdsDeploymentType.hashCode());
        result =
                (result * PRIME)
                        + (this.filterByMySqlDatabaseTypeParam == null
                                ? 43
                                : this.filterByMySqlDatabaseTypeParam.hashCode());
        result =
                (result * PRIME)
                        + (this.filterByMySqlStatus == null
                                ? 43
                                : this.filterByMySqlStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.filterByMySqlDatabaseVersion == null
                                ? 43
                                : this.filterByMySqlDatabaseVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.isHeatWaveEnabled == null ? 43 : this.isHeatWaveEnabled.hashCode());
        return result;
    }
}
