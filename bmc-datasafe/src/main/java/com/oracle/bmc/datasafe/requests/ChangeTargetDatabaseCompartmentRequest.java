/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeTargetDatabaseCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeTargetDatabaseCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ChangeTargetDatabaseCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.ChangeTargetDatabaseCompartmentDetails> {

    /** The OCID of the Data Safe target database. */
    private String targetDatabaseId;

    /** The OCID of the Data Safe target database. */
    public String getTargetDatabaseId() {
        return targetDatabaseId;
    }
    /** Details of the move compartment request. */
    private com.oracle.bmc.datasafe.model.ChangeTargetDatabaseCompartmentDetails
            changeTargetDatabaseCompartmentDetails;

    /** Details of the move compartment request. */
    public com.oracle.bmc.datasafe.model.ChangeTargetDatabaseCompartmentDetails
            getChangeTargetDatabaseCompartmentDetails() {
        return changeTargetDatabaseCompartmentDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * if-match parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * if-match parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.datasafe.model.ChangeTargetDatabaseCompartmentDetails getBody$() {
        return changeTargetDatabaseCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeTargetDatabaseCompartmentRequest,
                    com.oracle.bmc.datasafe.model.ChangeTargetDatabaseCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the Data Safe target database. */
        private String targetDatabaseId = null;

        /**
         * The OCID of the Data Safe target database.
         *
         * @param targetDatabaseId the value to set
         * @return this builder instance
         */
        public Builder targetDatabaseId(String targetDatabaseId) {
            this.targetDatabaseId = targetDatabaseId;
            return this;
        }

        /** Details of the move compartment request. */
        private com.oracle.bmc.datasafe.model.ChangeTargetDatabaseCompartmentDetails
                changeTargetDatabaseCompartmentDetails = null;

        /**
         * Details of the move compartment request.
         *
         * @param changeTargetDatabaseCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeTargetDatabaseCompartmentDetails(
                com.oracle.bmc.datasafe.model.ChangeTargetDatabaseCompartmentDetails
                        changeTargetDatabaseCompartmentDetails) {
            this.changeTargetDatabaseCompartmentDetails = changeTargetDatabaseCompartmentDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * if-match parameter to the value of the etag from a previous GET or POST response for that
         * resource. The resource will be updated or deleted only if the etag you provide matches
         * the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * if-match parameter to the value of the etag from a previous GET or POST response for that
         * resource. The resource will be updated or deleted only if the etag you provide matches
         * the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
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
        public Builder copy(ChangeTargetDatabaseCompartmentRequest o) {
            targetDatabaseId(o.getTargetDatabaseId());
            changeTargetDatabaseCompartmentDetails(o.getChangeTargetDatabaseCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeTargetDatabaseCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeTargetDatabaseCompartmentRequest
         */
        public ChangeTargetDatabaseCompartmentRequest build() {
            ChangeTargetDatabaseCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.datasafe.model.ChangeTargetDatabaseCompartmentDetails body) {
            changeTargetDatabaseCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeTargetDatabaseCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeTargetDatabaseCompartmentRequest
         */
        public ChangeTargetDatabaseCompartmentRequest buildWithoutInvocationCallback() {
            ChangeTargetDatabaseCompartmentRequest request =
                    new ChangeTargetDatabaseCompartmentRequest();
            request.targetDatabaseId = targetDatabaseId;
            request.changeTargetDatabaseCompartmentDetails = changeTargetDatabaseCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeTargetDatabaseCompartmentRequest(targetDatabaseId,
            // changeTargetDatabaseCompartmentDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .targetDatabaseId(targetDatabaseId)
                .changeTargetDatabaseCompartmentDetails(changeTargetDatabaseCompartmentDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",targetDatabaseId=").append(String.valueOf(this.targetDatabaseId));
        sb.append(",changeTargetDatabaseCompartmentDetails=")
                .append(String.valueOf(this.changeTargetDatabaseCompartmentDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
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
        if (!(o instanceof ChangeTargetDatabaseCompartmentRequest)) {
            return false;
        }

        ChangeTargetDatabaseCompartmentRequest other = (ChangeTargetDatabaseCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.targetDatabaseId, other.targetDatabaseId)
                && java.util.Objects.equals(
                        this.changeTargetDatabaseCompartmentDetails,
                        other.changeTargetDatabaseCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.targetDatabaseId == null ? 43 : this.targetDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeTargetDatabaseCompartmentDetails == null
                                ? 43
                                : this.changeTargetDatabaseCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
