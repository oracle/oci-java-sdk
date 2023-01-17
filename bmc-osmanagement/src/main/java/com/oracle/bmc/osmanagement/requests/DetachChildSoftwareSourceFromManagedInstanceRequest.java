/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.requests;

import com.oracle.bmc.osmanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagement/DetachChildSoftwareSourceFromManagedInstanceExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use DetachChildSoftwareSourceFromManagedInstanceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
public class DetachChildSoftwareSourceFromManagedInstanceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.osmanagement.model
                        .DetachChildSoftwareSourceFromManagedInstanceDetails> {

    /**
     * OCID for the managed instance
     */
    private String managedInstanceId;

    /**
     * OCID for the managed instance
     */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }
    /**
     * Details for detaching a Software Source from a Managed Instance
     */
    private com.oracle.bmc.osmanagement.model.DetachChildSoftwareSourceFromManagedInstanceDetails
            detachChildSoftwareSourceFromManagedInstanceDetails;

    /**
     * Details for detaching a Software Source from a Managed Instance
     */
    public com.oracle.bmc.osmanagement.model.DetachChildSoftwareSourceFromManagedInstanceDetails
            getDetachChildSoftwareSourceFromManagedInstanceDetails() {
        return detachChildSoftwareSourceFromManagedInstanceDetails;
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
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.osmanagement.model.DetachChildSoftwareSourceFromManagedInstanceDetails
            getBody$() {
        return detachChildSoftwareSourceFromManagedInstanceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DetachChildSoftwareSourceFromManagedInstanceRequest,
                    com.oracle.bmc.osmanagement.model
                            .DetachChildSoftwareSourceFromManagedInstanceDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * OCID for the managed instance
         */
        private String managedInstanceId = null;

        /**
         * OCID for the managed instance
         * @param managedInstanceId the value to set
         * @return this builder instance
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            return this;
        }

        /**
         * Details for detaching a Software Source from a Managed Instance
         */
        private com.oracle.bmc.osmanagement.model
                        .DetachChildSoftwareSourceFromManagedInstanceDetails
                detachChildSoftwareSourceFromManagedInstanceDetails = null;

        /**
         * Details for detaching a Software Source from a Managed Instance
         * @param detachChildSoftwareSourceFromManagedInstanceDetails the value to set
         * @return this builder instance
         */
        public Builder detachChildSoftwareSourceFromManagedInstanceDetails(
                com.oracle.bmc.osmanagement.model
                                .DetachChildSoftwareSourceFromManagedInstanceDetails
                        detachChildSoftwareSourceFromManagedInstanceDetails) {
            this.detachChildSoftwareSourceFromManagedInstanceDetails =
                    detachChildSoftwareSourceFromManagedInstanceDetails;
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(DetachChildSoftwareSourceFromManagedInstanceRequest o) {
            managedInstanceId(o.getManagedInstanceId());
            detachChildSoftwareSourceFromManagedInstanceDetails(
                    o.getDetachChildSoftwareSourceFromManagedInstanceDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DetachChildSoftwareSourceFromManagedInstanceRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of DetachChildSoftwareSourceFromManagedInstanceRequest
         */
        public DetachChildSoftwareSourceFromManagedInstanceRequest build() {
            DetachChildSoftwareSourceFromManagedInstanceRequest request =
                    buildWithoutInvocationCallback();
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
                com.oracle.bmc.osmanagement.model
                                .DetachChildSoftwareSourceFromManagedInstanceDetails
                        body) {
            detachChildSoftwareSourceFromManagedInstanceDetails(body);
            return this;
        }

        /**
         * Build the instance of DetachChildSoftwareSourceFromManagedInstanceRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DetachChildSoftwareSourceFromManagedInstanceRequest
         */
        public DetachChildSoftwareSourceFromManagedInstanceRequest
                buildWithoutInvocationCallback() {
            DetachChildSoftwareSourceFromManagedInstanceRequest request =
                    new DetachChildSoftwareSourceFromManagedInstanceRequest();
            request.managedInstanceId = managedInstanceId;
            request.detachChildSoftwareSourceFromManagedInstanceDetails =
                    detachChildSoftwareSourceFromManagedInstanceDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new DetachChildSoftwareSourceFromManagedInstanceRequest(managedInstanceId, detachChildSoftwareSourceFromManagedInstanceDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedInstanceId(managedInstanceId)
                .detachChildSoftwareSourceFromManagedInstanceDetails(
                        detachChildSoftwareSourceFromManagedInstanceDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(",detachChildSoftwareSourceFromManagedInstanceDetails=")
                .append(String.valueOf(this.detachChildSoftwareSourceFromManagedInstanceDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DetachChildSoftwareSourceFromManagedInstanceRequest)) {
            return false;
        }

        DetachChildSoftwareSourceFromManagedInstanceRequest other =
                (DetachChildSoftwareSourceFromManagedInstanceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(
                        this.detachChildSoftwareSourceFromManagedInstanceDetails,
                        other.detachChildSoftwareSourceFromManagedInstanceDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.detachChildSoftwareSourceFromManagedInstanceDetails == null
                                ? 43
                                : this.detachChildSoftwareSourceFromManagedInstanceDetails
                                        .hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
