/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/ChangeCrossConnectGroupCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeCrossConnectGroupCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class ChangeCrossConnectGroupCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.ChangeCrossConnectGroupCompartmentDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the cross-connect group.
     */
    private String crossConnectGroupId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the cross-connect group.
     */
    public String getCrossConnectGroupId() {
        return crossConnectGroupId;
    }
    /** Request to change the compartment of a Cross Connect Group. */
    private com.oracle.bmc.core.model.ChangeCrossConnectGroupCompartmentDetails
            changeCrossConnectGroupCompartmentDetails;

    /** Request to change the compartment of a Cross Connect Group. */
    public com.oracle.bmc.core.model.ChangeCrossConnectGroupCompartmentDetails
            getChangeCrossConnectGroupCompartmentDetails() {
        return changeCrossConnectGroupCompartmentDetails;
    }
    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular request,
     * please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
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

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.ChangeCrossConnectGroupCompartmentDetails getBody$() {
        return changeCrossConnectGroupCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeCrossConnectGroupCompartmentRequest,
                    com.oracle.bmc.core.model.ChangeCrossConnectGroupCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the cross-connect group.
         */
        private String crossConnectGroupId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the cross-connect group.
         *
         * @param crossConnectGroupId the value to set
         * @return this builder instance
         */
        public Builder crossConnectGroupId(String crossConnectGroupId) {
            this.crossConnectGroupId = crossConnectGroupId;
            return this;
        }

        /** Request to change the compartment of a Cross Connect Group. */
        private com.oracle.bmc.core.model.ChangeCrossConnectGroupCompartmentDetails
                changeCrossConnectGroupCompartmentDetails = null;

        /**
         * Request to change the compartment of a Cross Connect Group.
         *
         * @param changeCrossConnectGroupCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeCrossConnectGroupCompartmentDetails(
                com.oracle.bmc.core.model.ChangeCrossConnectGroupCompartmentDetails
                        changeCrossConnectGroupCompartmentDetails) {
            this.changeCrossConnectGroupCompartmentDetails =
                    changeCrossConnectGroupCompartmentDetails;
            return this;
        }

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
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
        public Builder copy(ChangeCrossConnectGroupCompartmentRequest o) {
            crossConnectGroupId(o.getCrossConnectGroupId());
            changeCrossConnectGroupCompartmentDetails(
                    o.getChangeCrossConnectGroupCompartmentDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeCrossConnectGroupCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeCrossConnectGroupCompartmentRequest
         */
        public ChangeCrossConnectGroupCompartmentRequest build() {
            ChangeCrossConnectGroupCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.core.model.ChangeCrossConnectGroupCompartmentDetails body) {
            changeCrossConnectGroupCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeCrossConnectGroupCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeCrossConnectGroupCompartmentRequest
         */
        public ChangeCrossConnectGroupCompartmentRequest buildWithoutInvocationCallback() {
            ChangeCrossConnectGroupCompartmentRequest request =
                    new ChangeCrossConnectGroupCompartmentRequest();
            request.crossConnectGroupId = crossConnectGroupId;
            request.changeCrossConnectGroupCompartmentDetails =
                    changeCrossConnectGroupCompartmentDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeCrossConnectGroupCompartmentRequest(crossConnectGroupId,
            // changeCrossConnectGroupCompartmentDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .crossConnectGroupId(crossConnectGroupId)
                .changeCrossConnectGroupCompartmentDetails(
                        changeCrossConnectGroupCompartmentDetails)
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
        sb.append(",crossConnectGroupId=").append(String.valueOf(this.crossConnectGroupId));
        sb.append(",changeCrossConnectGroupCompartmentDetails=")
                .append(String.valueOf(this.changeCrossConnectGroupCompartmentDetails));
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
        if (!(o instanceof ChangeCrossConnectGroupCompartmentRequest)) {
            return false;
        }

        ChangeCrossConnectGroupCompartmentRequest other =
                (ChangeCrossConnectGroupCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.crossConnectGroupId, other.crossConnectGroupId)
                && java.util.Objects.equals(
                        this.changeCrossConnectGroupCompartmentDetails,
                        other.changeCrossConnectGroupCompartmentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.crossConnectGroupId == null
                                ? 43
                                : this.crossConnectGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeCrossConnectGroupCompartmentDetails == null
                                ? 43
                                : this.changeCrossConnectGroupCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
