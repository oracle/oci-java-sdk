/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/ChangeExadbVmClusterCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeExadbVmClusterCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ChangeExadbVmClusterCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.ChangeExadbVmClusterCompartmentDetails> {

    /** Request to move Exadata VM cluster on Exascale Infrastructure to a different compartment */
    private com.oracle.bmc.database.model.ChangeExadbVmClusterCompartmentDetails
            changeExadbVmClusterCompartmentDetails;

    /** Request to move Exadata VM cluster on Exascale Infrastructure to a different compartment */
    public com.oracle.bmc.database.model.ChangeExadbVmClusterCompartmentDetails
            getChangeExadbVmClusterCompartmentDetails() {
        return changeExadbVmClusterCompartmentDetails;
    }
    /**
     * The Exadata VM cluster
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) on Exascale
     * Infrastructure.
     */
    private String exadbVmClusterId;

    /**
     * The Exadata VM cluster
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) on Exascale
     * Infrastructure.
     */
    public String getExadbVmClusterId() {
        return exadbVmClusterId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
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

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.database.model.ChangeExadbVmClusterCompartmentDetails getBody$() {
        return changeExadbVmClusterCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeExadbVmClusterCompartmentRequest,
                    com.oracle.bmc.database.model.ChangeExadbVmClusterCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Request to move Exadata VM cluster on Exascale Infrastructure to a different compartment
         */
        private com.oracle.bmc.database.model.ChangeExadbVmClusterCompartmentDetails
                changeExadbVmClusterCompartmentDetails = null;

        /**
         * Request to move Exadata VM cluster on Exascale Infrastructure to a different compartment
         *
         * @param changeExadbVmClusterCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeExadbVmClusterCompartmentDetails(
                com.oracle.bmc.database.model.ChangeExadbVmClusterCompartmentDetails
                        changeExadbVmClusterCompartmentDetails) {
            this.changeExadbVmClusterCompartmentDetails = changeExadbVmClusterCompartmentDetails;
            return this;
        }

        /**
         * The Exadata VM cluster
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) on Exascale
         * Infrastructure.
         */
        private String exadbVmClusterId = null;

        /**
         * The Exadata VM cluster
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) on Exascale
         * Infrastructure.
         *
         * @param exadbVmClusterId the value to set
         * @return this builder instance
         */
        public Builder exadbVmClusterId(String exadbVmClusterId) {
            this.exadbVmClusterId = exadbVmClusterId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(ChangeExadbVmClusterCompartmentRequest o) {
            changeExadbVmClusterCompartmentDetails(o.getChangeExadbVmClusterCompartmentDetails());
            exadbVmClusterId(o.getExadbVmClusterId());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeExadbVmClusterCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeExadbVmClusterCompartmentRequest
         */
        public ChangeExadbVmClusterCompartmentRequest build() {
            ChangeExadbVmClusterCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.database.model.ChangeExadbVmClusterCompartmentDetails body) {
            changeExadbVmClusterCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeExadbVmClusterCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeExadbVmClusterCompartmentRequest
         */
        public ChangeExadbVmClusterCompartmentRequest buildWithoutInvocationCallback() {
            ChangeExadbVmClusterCompartmentRequest request =
                    new ChangeExadbVmClusterCompartmentRequest();
            request.changeExadbVmClusterCompartmentDetails = changeExadbVmClusterCompartmentDetails;
            request.exadbVmClusterId = exadbVmClusterId;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new ChangeExadbVmClusterCompartmentRequest(changeExadbVmClusterCompartmentDetails,
            // exadbVmClusterId, opcRetryToken, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .changeExadbVmClusterCompartmentDetails(changeExadbVmClusterCompartmentDetails)
                .exadbVmClusterId(exadbVmClusterId)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
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
        sb.append(",changeExadbVmClusterCompartmentDetails=")
                .append(String.valueOf(this.changeExadbVmClusterCompartmentDetails));
        sb.append(",exadbVmClusterId=").append(String.valueOf(this.exadbVmClusterId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeExadbVmClusterCompartmentRequest)) {
            return false;
        }

        ChangeExadbVmClusterCompartmentRequest other = (ChangeExadbVmClusterCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.changeExadbVmClusterCompartmentDetails,
                        other.changeExadbVmClusterCompartmentDetails)
                && java.util.Objects.equals(this.exadbVmClusterId, other.exadbVmClusterId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.changeExadbVmClusterCompartmentDetails == null
                                ? 43
                                : this.changeExadbVmClusterCompartmentDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.exadbVmClusterId == null ? 43 : this.exadbVmClusterId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
