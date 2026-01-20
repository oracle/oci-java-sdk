/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.requests;

import com.oracle.bmc.dbmulticloud.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dbmulticloud/ChangeMultiCloudResourceDiscoveryCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeMultiCloudResourceDiscoveryCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
public class ChangeMultiCloudResourceDiscoveryCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dbmulticloud.model
                        .ChangeMultiCloudResourceDiscoveryCompartmentDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Multicloud Discovery Resource.
     */
    private String multiCloudResourceDiscoveryId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Multicloud Discovery Resource.
     */
    public String getMultiCloudResourceDiscoveryId() {
        return multiCloudResourceDiscoveryId;
    }
    /** Moves the Multi Cloud Discovered resource to a different compartment. */
    private com.oracle.bmc.dbmulticloud.model.ChangeMultiCloudResourceDiscoveryCompartmentDetails
            changeMultiCloudResourceDiscoveryCompartmentDetails;

    /** Moves the Multi Cloud Discovered resource to a different compartment. */
    public com.oracle.bmc.dbmulticloud.model.ChangeMultiCloudResourceDiscoveryCompartmentDetails
            getChangeMultiCloudResourceDiscoveryCompartmentDetails() {
        return changeMultiCloudResourceDiscoveryCompartmentDetails;
    }
    /**
     * A token that uniquely identifies a request, allowing it to be safely retried in the event of
     * a timeout or server error without the risk of the action being executed more than once.
     *
     * <p>Retry tokens expire after 24 hours but can be invalidated sooner if conflicting operations
     * occur.
     *
     * <p>For example, if a resource has been deleted and permanently purged from the system, a
     * retry of the original creation request may be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request, allowing it to be safely retried in the event of
     * a timeout or server error without the risk of the action being executed more than once.
     *
     * <p>Retry tokens expire after 24 hours but can be invalidated sooner if conflicting operations
     * occur.
     *
     * <p>For example, if a resource has been deleted and permanently purged from the system, a
     * retry of the original creation request may be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dbmulticloud.model.ChangeMultiCloudResourceDiscoveryCompartmentDetails
            getBody$() {
        return changeMultiCloudResourceDiscoveryCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeMultiCloudResourceDiscoveryCompartmentRequest,
                    com.oracle.bmc.dbmulticloud.model
                            .ChangeMultiCloudResourceDiscoveryCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Multicloud Discovery Resource.
         */
        private String multiCloudResourceDiscoveryId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Multicloud Discovery Resource.
         *
         * @param multiCloudResourceDiscoveryId the value to set
         * @return this builder instance
         */
        public Builder multiCloudResourceDiscoveryId(String multiCloudResourceDiscoveryId) {
            this.multiCloudResourceDiscoveryId = multiCloudResourceDiscoveryId;
            return this;
        }

        /** Moves the Multi Cloud Discovered resource to a different compartment. */
        private com.oracle.bmc.dbmulticloud.model
                        .ChangeMultiCloudResourceDiscoveryCompartmentDetails
                changeMultiCloudResourceDiscoveryCompartmentDetails = null;

        /**
         * Moves the Multi Cloud Discovered resource to a different compartment.
         *
         * @param changeMultiCloudResourceDiscoveryCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeMultiCloudResourceDiscoveryCompartmentDetails(
                com.oracle.bmc.dbmulticloud.model
                                .ChangeMultiCloudResourceDiscoveryCompartmentDetails
                        changeMultiCloudResourceDiscoveryCompartmentDetails) {
            this.changeMultiCloudResourceDiscoveryCompartmentDetails =
                    changeMultiCloudResourceDiscoveryCompartmentDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request, allowing it to be safely retried in the event
         * of a timeout or server error without the risk of the action being executed more than
         * once.
         *
         * <p>Retry tokens expire after 24 hours but can be invalidated sooner if conflicting
         * operations occur.
         *
         * <p>For example, if a resource has been deleted and permanently purged from the system, a
         * retry of the original creation request may be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request, allowing it to be safely retried in the event
         * of a timeout or server error without the risk of the action being executed more than
         * once.
         *
         * <p>Retry tokens expire after 24 hours but can be invalidated sooner if conflicting
         * operations occur.
         *
         * <p>For example, if a resource has been deleted and permanently purged from the system, a
         * retry of the original creation request may be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(ChangeMultiCloudResourceDiscoveryCompartmentRequest o) {
            multiCloudResourceDiscoveryId(o.getMultiCloudResourceDiscoveryId());
            changeMultiCloudResourceDiscoveryCompartmentDetails(
                    o.getChangeMultiCloudResourceDiscoveryCompartmentDetails());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeMultiCloudResourceDiscoveryCompartmentRequest as configured
         * by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeMultiCloudResourceDiscoveryCompartmentRequest
         */
        public ChangeMultiCloudResourceDiscoveryCompartmentRequest build() {
            ChangeMultiCloudResourceDiscoveryCompartmentRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Alternative setter for the body parameter.
         *
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.dbmulticloud.model
                                .ChangeMultiCloudResourceDiscoveryCompartmentDetails
                        body) {
            changeMultiCloudResourceDiscoveryCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeMultiCloudResourceDiscoveryCompartmentRequest as configured
         * by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeMultiCloudResourceDiscoveryCompartmentRequest
         */
        public ChangeMultiCloudResourceDiscoveryCompartmentRequest
                buildWithoutInvocationCallback() {
            ChangeMultiCloudResourceDiscoveryCompartmentRequest request =
                    new ChangeMultiCloudResourceDiscoveryCompartmentRequest();
            request.multiCloudResourceDiscoveryId = multiCloudResourceDiscoveryId;
            request.changeMultiCloudResourceDiscoveryCompartmentDetails =
                    changeMultiCloudResourceDiscoveryCompartmentDetails;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new
            // ChangeMultiCloudResourceDiscoveryCompartmentRequest(multiCloudResourceDiscoveryId,
            // changeMultiCloudResourceDiscoveryCompartmentDetails, opcRetryToken, ifMatch,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .multiCloudResourceDiscoveryId(multiCloudResourceDiscoveryId)
                .changeMultiCloudResourceDiscoveryCompartmentDetails(
                        changeMultiCloudResourceDiscoveryCompartmentDetails)
                .opcRetryToken(opcRetryToken)
                .ifMatch(ifMatch)
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
        sb.append(",multiCloudResourceDiscoveryId=")
                .append(String.valueOf(this.multiCloudResourceDiscoveryId));
        sb.append(",changeMultiCloudResourceDiscoveryCompartmentDetails=")
                .append(String.valueOf(this.changeMultiCloudResourceDiscoveryCompartmentDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeMultiCloudResourceDiscoveryCompartmentRequest)) {
            return false;
        }

        ChangeMultiCloudResourceDiscoveryCompartmentRequest other =
                (ChangeMultiCloudResourceDiscoveryCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.multiCloudResourceDiscoveryId, other.multiCloudResourceDiscoveryId)
                && java.util.Objects.equals(
                        this.changeMultiCloudResourceDiscoveryCompartmentDetails,
                        other.changeMultiCloudResourceDiscoveryCompartmentDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.multiCloudResourceDiscoveryId == null
                                ? 43
                                : this.multiCloudResourceDiscoveryId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeMultiCloudResourceDiscoveryCompartmentDetails == null
                                ? 43
                                : this.changeMultiCloudResourceDiscoveryCompartmentDetails
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
