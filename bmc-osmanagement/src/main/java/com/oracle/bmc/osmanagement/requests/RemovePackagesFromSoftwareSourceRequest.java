/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.requests;

import com.oracle.bmc.osmanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/RemovePackagesFromSoftwareSourceExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use RemovePackagesFromSoftwareSourceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public class RemovePackagesFromSoftwareSourceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.osmanagement.model.RemovePackagesFromSoftwareSourceDetails> {

    /**
     * The OCID of the software source.
     */
    private String softwareSourceId;

    /**
     * The OCID of the software source.
     */
    public String getSoftwareSourceId() {
        return softwareSourceId;
    }
    /**
     * A list of package identifiers
     */
    private com.oracle.bmc.osmanagement.model.RemovePackagesFromSoftwareSourceDetails
            removePackagesFromSoftwareSourceDetails;

    /**
     * A list of package identifiers
     */
    public com.oracle.bmc.osmanagement.model.RemovePackagesFromSoftwareSourceDetails
            getRemovePackagesFromSoftwareSourceDetails() {
        return removePackagesFromSoftwareSourceDetails;
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
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.osmanagement.model.RemovePackagesFromSoftwareSourceDetails getBody$() {
        return removePackagesFromSoftwareSourceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RemovePackagesFromSoftwareSourceRequest,
                    com.oracle.bmc.osmanagement.model.RemovePackagesFromSoftwareSourceDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the software source.
         */
        private String softwareSourceId = null;

        /**
         * The OCID of the software source.
         * @param softwareSourceId the value to set
         * @return this builder instance
         */
        public Builder softwareSourceId(String softwareSourceId) {
            this.softwareSourceId = softwareSourceId;
            return this;
        }

        /**
         * A list of package identifiers
         */
        private com.oracle.bmc.osmanagement.model.RemovePackagesFromSoftwareSourceDetails
                removePackagesFromSoftwareSourceDetails = null;

        /**
         * A list of package identifiers
         * @param removePackagesFromSoftwareSourceDetails the value to set
         * @return this builder instance
         */
        public Builder removePackagesFromSoftwareSourceDetails(
                com.oracle.bmc.osmanagement.model.RemovePackagesFromSoftwareSourceDetails
                        removePackagesFromSoftwareSourceDetails) {
            this.removePackagesFromSoftwareSourceDetails = removePackagesFromSoftwareSourceDetails;
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
        public Builder copy(RemovePackagesFromSoftwareSourceRequest o) {
            softwareSourceId(o.getSoftwareSourceId());
            removePackagesFromSoftwareSourceDetails(o.getRemovePackagesFromSoftwareSourceDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RemovePackagesFromSoftwareSourceRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of RemovePackagesFromSoftwareSourceRequest
         */
        public RemovePackagesFromSoftwareSourceRequest build() {
            RemovePackagesFromSoftwareSourceRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.osmanagement.model.RemovePackagesFromSoftwareSourceDetails body) {
            removePackagesFromSoftwareSourceDetails(body);
            return this;
        }

        /**
         * Build the instance of RemovePackagesFromSoftwareSourceRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RemovePackagesFromSoftwareSourceRequest
         */
        public RemovePackagesFromSoftwareSourceRequest buildWithoutInvocationCallback() {
            RemovePackagesFromSoftwareSourceRequest request =
                    new RemovePackagesFromSoftwareSourceRequest();
            request.softwareSourceId = softwareSourceId;
            request.removePackagesFromSoftwareSourceDetails =
                    removePackagesFromSoftwareSourceDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new RemovePackagesFromSoftwareSourceRequest(softwareSourceId, removePackagesFromSoftwareSourceDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .softwareSourceId(softwareSourceId)
                .removePackagesFromSoftwareSourceDetails(removePackagesFromSoftwareSourceDetails)
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
        sb.append(",softwareSourceId=").append(String.valueOf(this.softwareSourceId));
        sb.append(",removePackagesFromSoftwareSourceDetails=")
                .append(String.valueOf(this.removePackagesFromSoftwareSourceDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemovePackagesFromSoftwareSourceRequest)) {
            return false;
        }

        RemovePackagesFromSoftwareSourceRequest other = (RemovePackagesFromSoftwareSourceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.softwareSourceId, other.softwareSourceId)
                && java.util.Objects.equals(
                        this.removePackagesFromSoftwareSourceDetails,
                        other.removePackagesFromSoftwareSourceDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.softwareSourceId == null ? 43 : this.softwareSourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.removePackagesFromSoftwareSourceDetails == null
                                ? 43
                                : this.removePackagesFromSoftwareSourceDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
