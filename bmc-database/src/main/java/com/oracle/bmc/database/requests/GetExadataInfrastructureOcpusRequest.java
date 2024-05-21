/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetExadataInfrastructureOcpusExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetExadataInfrastructureOcpusRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetExadataInfrastructureOcpusRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The Autonomous Exadata Infrastructure  [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String autonomousExadataInfrastructureId;

    /**
     * The Autonomous Exadata Infrastructure  [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getAutonomousExadataInfrastructureId() {
        return autonomousExadataInfrastructureId;
    }
    /**
     * Unique identifier for the request.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetExadataInfrastructureOcpusRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Autonomous Exadata Infrastructure  [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String autonomousExadataInfrastructureId = null;

        /**
         * The Autonomous Exadata Infrastructure  [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param autonomousExadataInfrastructureId the value to set
         * @return this builder instance
         */
        public Builder autonomousExadataInfrastructureId(String autonomousExadataInfrastructureId) {
            this.autonomousExadataInfrastructureId = autonomousExadataInfrastructureId;
            return this;
        }

        /**
         * Unique identifier for the request.
         *
         */
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
        public Builder copy(GetExadataInfrastructureOcpusRequest o) {
            autonomousExadataInfrastructureId(o.getAutonomousExadataInfrastructureId());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetExadataInfrastructureOcpusRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetExadataInfrastructureOcpusRequest
         */
        public GetExadataInfrastructureOcpusRequest build() {
            GetExadataInfrastructureOcpusRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetExadataInfrastructureOcpusRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetExadataInfrastructureOcpusRequest
         */
        public GetExadataInfrastructureOcpusRequest buildWithoutInvocationCallback() {
            GetExadataInfrastructureOcpusRequest request =
                    new GetExadataInfrastructureOcpusRequest();
            request.autonomousExadataInfrastructureId = autonomousExadataInfrastructureId;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetExadataInfrastructureOcpusRequest(autonomousExadataInfrastructureId, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .autonomousExadataInfrastructureId(autonomousExadataInfrastructureId)
                .opcRequestId(opcRequestId);
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
        sb.append(",autonomousExadataInfrastructureId=")
                .append(String.valueOf(this.autonomousExadataInfrastructureId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetExadataInfrastructureOcpusRequest)) {
            return false;
        }

        GetExadataInfrastructureOcpusRequest other = (GetExadataInfrastructureOcpusRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.autonomousExadataInfrastructureId,
                        other.autonomousExadataInfrastructureId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.autonomousExadataInfrastructureId == null
                                ? 43
                                : this.autonomousExadataInfrastructureId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
