/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetCloudExadataInfrastructureUnallocatedResourcesExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetCloudExadataInfrastructureUnallocatedResourcesRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetCloudExadataInfrastructureUnallocatedResourcesRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The cloud Exadata infrastructure
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String cloudExadataInfrastructureId;

    /**
     * The cloud Exadata infrastructure
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getCloudExadataInfrastructureId() {
        return cloudExadataInfrastructureId;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     * of the Db servers.
     */
    private java.util.List<String> dbServers;

    /**
     * The list of [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     * of the Db servers.
     */
    public java.util.List<String> getDbServers() {
        return dbServers;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetCloudExadataInfrastructureUnallocatedResourcesRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The cloud Exadata infrastructure
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String cloudExadataInfrastructureId = null;

        /**
         * The cloud Exadata infrastructure
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param cloudExadataInfrastructureId the value to set
         * @return this builder instance
         */
        public Builder cloudExadataInfrastructureId(String cloudExadataInfrastructureId) {
            this.cloudExadataInfrastructureId = cloudExadataInfrastructureId;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The list of
         * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Db
         * servers.
         */
        private java.util.List<String> dbServers = null;

        /**
         * The list of
         * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Db
         * servers.
         *
         * @param dbServers the value to set
         * @return this builder instance
         */
        public Builder dbServers(java.util.List<String> dbServers) {
            this.dbServers = dbServers;
            return this;
        }

        /**
         * Singular setter. The list of
         * [OCIDs](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the Db
         * servers.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder dbServers(String singularValue) {
            return this.dbServers(java.util.Arrays.asList(singularValue));
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
        public Builder copy(GetCloudExadataInfrastructureUnallocatedResourcesRequest o) {
            cloudExadataInfrastructureId(o.getCloudExadataInfrastructureId());
            opcRequestId(o.getOpcRequestId());
            dbServers(o.getDbServers());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetCloudExadataInfrastructureUnallocatedResourcesRequest as
         * configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetCloudExadataInfrastructureUnallocatedResourcesRequest
         */
        public GetCloudExadataInfrastructureUnallocatedResourcesRequest build() {
            GetCloudExadataInfrastructureUnallocatedResourcesRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetCloudExadataInfrastructureUnallocatedResourcesRequest as
         * configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetCloudExadataInfrastructureUnallocatedResourcesRequest
         */
        public GetCloudExadataInfrastructureUnallocatedResourcesRequest
                buildWithoutInvocationCallback() {
            GetCloudExadataInfrastructureUnallocatedResourcesRequest request =
                    new GetCloudExadataInfrastructureUnallocatedResourcesRequest();
            request.cloudExadataInfrastructureId = cloudExadataInfrastructureId;
            request.opcRequestId = opcRequestId;
            request.dbServers = dbServers;
            return request;
            // new
            // GetCloudExadataInfrastructureUnallocatedResourcesRequest(cloudExadataInfrastructureId, opcRequestId, dbServers);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .cloudExadataInfrastructureId(cloudExadataInfrastructureId)
                .opcRequestId(opcRequestId)
                .dbServers(dbServers);
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
        sb.append(",cloudExadataInfrastructureId=")
                .append(String.valueOf(this.cloudExadataInfrastructureId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",dbServers=").append(String.valueOf(this.dbServers));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetCloudExadataInfrastructureUnallocatedResourcesRequest)) {
            return false;
        }

        GetCloudExadataInfrastructureUnallocatedResourcesRequest other =
                (GetCloudExadataInfrastructureUnallocatedResourcesRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.cloudExadataInfrastructureId, other.cloudExadataInfrastructureId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.dbServers, other.dbServers);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.cloudExadataInfrastructureId == null
                                ? 43
                                : this.cloudExadataInfrastructureId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.dbServers == null ? 43 : this.dbServers.hashCode());
        return result;
    }
}
