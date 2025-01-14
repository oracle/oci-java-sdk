/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetInfrastructureTargetVersionsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetInfrastructureTargetVersionsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetInfrastructureTargetVersionsRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The compartment
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String compartmentId;

    /**
     * The compartment
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** The target resource ID. */
    private String targetResourceId;

    /** The target resource ID. */
    public String getTargetResourceId() {
        return targetResourceId;
    }
    /** The type of the target resource. */
    private com.oracle.bmc.database.model.MaintenanceRunSummary.TargetResourceType
            targetResourceType;

    /** The type of the target resource. */
    public com.oracle.bmc.database.model.MaintenanceRunSummary.TargetResourceType
            getTargetResourceType() {
        return targetResourceType;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetInfrastructureTargetVersionsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The compartment
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String compartmentId = null;

        /**
         * The compartment
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** The target resource ID. */
        private String targetResourceId = null;

        /**
         * The target resource ID.
         *
         * @param targetResourceId the value to set
         * @return this builder instance
         */
        public Builder targetResourceId(String targetResourceId) {
            this.targetResourceId = targetResourceId;
            return this;
        }

        /** The type of the target resource. */
        private com.oracle.bmc.database.model.MaintenanceRunSummary.TargetResourceType
                targetResourceType = null;

        /**
         * The type of the target resource.
         *
         * @param targetResourceType the value to set
         * @return this builder instance
         */
        public Builder targetResourceType(
                com.oracle.bmc.database.model.MaintenanceRunSummary.TargetResourceType
                        targetResourceType) {
            this.targetResourceType = targetResourceType;
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
        public Builder copy(GetInfrastructureTargetVersionsRequest o) {
            compartmentId(o.getCompartmentId());
            targetResourceId(o.getTargetResourceId());
            targetResourceType(o.getTargetResourceType());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetInfrastructureTargetVersionsRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetInfrastructureTargetVersionsRequest
         */
        public GetInfrastructureTargetVersionsRequest build() {
            GetInfrastructureTargetVersionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetInfrastructureTargetVersionsRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetInfrastructureTargetVersionsRequest
         */
        public GetInfrastructureTargetVersionsRequest buildWithoutInvocationCallback() {
            GetInfrastructureTargetVersionsRequest request =
                    new GetInfrastructureTargetVersionsRequest();
            request.compartmentId = compartmentId;
            request.targetResourceId = targetResourceId;
            request.targetResourceType = targetResourceType;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetInfrastructureTargetVersionsRequest(compartmentId, targetResourceId,
            // targetResourceType, opcRequestId);
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
                .targetResourceId(targetResourceId)
                .targetResourceType(targetResourceType)
                .opcRequestId(opcRequestId);
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
        sb.append(",targetResourceId=").append(String.valueOf(this.targetResourceId));
        sb.append(",targetResourceType=").append(String.valueOf(this.targetResourceType));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetInfrastructureTargetVersionsRequest)) {
            return false;
        }

        GetInfrastructureTargetVersionsRequest other = (GetInfrastructureTargetVersionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.targetResourceId, other.targetResourceId)
                && java.util.Objects.equals(this.targetResourceType, other.targetResourceType)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
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
                        + (this.targetResourceId == null ? 43 : this.targetResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.targetResourceType == null
                                ? 43
                                : this.targetResourceType.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
