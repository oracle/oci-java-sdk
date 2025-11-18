/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.requests;

import com.oracle.bmc.dbmulticloud.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dbmulticloud/ChangeOracleDbAwsIdentityConnectorCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeOracleDbAwsIdentityConnectorCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
public class ChangeOracleDbAwsIdentityConnectorCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dbmulticloud.model
                        .ChangeOracleDbAwsIdentityConnectorCompartmentDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle DB AWS Identity Connector resource.
     */
    private String oracleDbAwsIdentityConnectorId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle DB AWS Identity Connector resource.
     */
    public String getOracleDbAwsIdentityConnectorId() {
        return oracleDbAwsIdentityConnectorId;
    }
    /** Moves the Oracle DB AWS Identity COnnector resource into a different compartment. */
    private com.oracle.bmc.dbmulticloud.model.ChangeOracleDbAwsIdentityConnectorCompartmentDetails
            changeOracleDbAwsIdentityConnectorCompartmentDetails;

    /** Moves the Oracle DB AWS Identity COnnector resource into a different compartment. */
    public com.oracle.bmc.dbmulticloud.model.ChangeOracleDbAwsIdentityConnectorCompartmentDetails
            getChangeOracleDbAwsIdentityConnectorCompartmentDetails() {
        return changeOracleDbAwsIdentityConnectorCompartmentDetails;
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
    public com.oracle.bmc.dbmulticloud.model.ChangeOracleDbAwsIdentityConnectorCompartmentDetails
            getBody$() {
        return changeOracleDbAwsIdentityConnectorCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeOracleDbAwsIdentityConnectorCompartmentRequest,
                    com.oracle.bmc.dbmulticloud.model
                            .ChangeOracleDbAwsIdentityConnectorCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle DB AWS Identity Connector resource.
         */
        private String oracleDbAwsIdentityConnectorId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle DB AWS Identity Connector resource.
         *
         * @param oracleDbAwsIdentityConnectorId the value to set
         * @return this builder instance
         */
        public Builder oracleDbAwsIdentityConnectorId(String oracleDbAwsIdentityConnectorId) {
            this.oracleDbAwsIdentityConnectorId = oracleDbAwsIdentityConnectorId;
            return this;
        }

        /** Moves the Oracle DB AWS Identity COnnector resource into a different compartment. */
        private com.oracle.bmc.dbmulticloud.model
                        .ChangeOracleDbAwsIdentityConnectorCompartmentDetails
                changeOracleDbAwsIdentityConnectorCompartmentDetails = null;

        /**
         * Moves the Oracle DB AWS Identity COnnector resource into a different compartment.
         *
         * @param changeOracleDbAwsIdentityConnectorCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeOracleDbAwsIdentityConnectorCompartmentDetails(
                com.oracle.bmc.dbmulticloud.model
                                .ChangeOracleDbAwsIdentityConnectorCompartmentDetails
                        changeOracleDbAwsIdentityConnectorCompartmentDetails) {
            this.changeOracleDbAwsIdentityConnectorCompartmentDetails =
                    changeOracleDbAwsIdentityConnectorCompartmentDetails;
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
        public Builder copy(ChangeOracleDbAwsIdentityConnectorCompartmentRequest o) {
            oracleDbAwsIdentityConnectorId(o.getOracleDbAwsIdentityConnectorId());
            changeOracleDbAwsIdentityConnectorCompartmentDetails(
                    o.getChangeOracleDbAwsIdentityConnectorCompartmentDetails());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeOracleDbAwsIdentityConnectorCompartmentRequest as configured
         * by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeOracleDbAwsIdentityConnectorCompartmentRequest
         */
        public ChangeOracleDbAwsIdentityConnectorCompartmentRequest build() {
            ChangeOracleDbAwsIdentityConnectorCompartmentRequest request =
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
                                .ChangeOracleDbAwsIdentityConnectorCompartmentDetails
                        body) {
            changeOracleDbAwsIdentityConnectorCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeOracleDbAwsIdentityConnectorCompartmentRequest as configured
         * by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeOracleDbAwsIdentityConnectorCompartmentRequest
         */
        public ChangeOracleDbAwsIdentityConnectorCompartmentRequest
                buildWithoutInvocationCallback() {
            ChangeOracleDbAwsIdentityConnectorCompartmentRequest request =
                    new ChangeOracleDbAwsIdentityConnectorCompartmentRequest();
            request.oracleDbAwsIdentityConnectorId = oracleDbAwsIdentityConnectorId;
            request.changeOracleDbAwsIdentityConnectorCompartmentDetails =
                    changeOracleDbAwsIdentityConnectorCompartmentDetails;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new
            // ChangeOracleDbAwsIdentityConnectorCompartmentRequest(oracleDbAwsIdentityConnectorId,
            // changeOracleDbAwsIdentityConnectorCompartmentDetails, opcRetryToken, ifMatch,
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
                .oracleDbAwsIdentityConnectorId(oracleDbAwsIdentityConnectorId)
                .changeOracleDbAwsIdentityConnectorCompartmentDetails(
                        changeOracleDbAwsIdentityConnectorCompartmentDetails)
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
        sb.append(",oracleDbAwsIdentityConnectorId=")
                .append(String.valueOf(this.oracleDbAwsIdentityConnectorId));
        sb.append(",changeOracleDbAwsIdentityConnectorCompartmentDetails=")
                .append(String.valueOf(this.changeOracleDbAwsIdentityConnectorCompartmentDetails));
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
        if (!(o instanceof ChangeOracleDbAwsIdentityConnectorCompartmentRequest)) {
            return false;
        }

        ChangeOracleDbAwsIdentityConnectorCompartmentRequest other =
                (ChangeOracleDbAwsIdentityConnectorCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.oracleDbAwsIdentityConnectorId, other.oracleDbAwsIdentityConnectorId)
                && java.util.Objects.equals(
                        this.changeOracleDbAwsIdentityConnectorCompartmentDetails,
                        other.changeOracleDbAwsIdentityConnectorCompartmentDetails)
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
                        + (this.oracleDbAwsIdentityConnectorId == null
                                ? 43
                                : this.oracleDbAwsIdentityConnectorId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeOracleDbAwsIdentityConnectorCompartmentDetails == null
                                ? 43
                                : this.changeOracleDbAwsIdentityConnectorCompartmentDetails
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
