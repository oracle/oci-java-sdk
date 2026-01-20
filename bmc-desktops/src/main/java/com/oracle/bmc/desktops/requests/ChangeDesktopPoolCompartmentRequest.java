/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.desktops.requests;

import com.oracle.bmc.desktops.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/desktops/ChangeDesktopPoolCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeDesktopPoolCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220618")
public class ChangeDesktopPoolCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.desktops.model.ChangeDesktopPoolCompartmentDetails> {

    /** The OCID of the desktop pool. */
    private String desktopPoolId;

    /** The OCID of the desktop pool. */
    public String getDesktopPoolId() {
        return desktopPoolId;
    }
    /** The details of the new compartment of the desktop pool. */
    private com.oracle.bmc.desktops.model.ChangeDesktopPoolCompartmentDetails
            changeDesktopPoolCompartmentDetails;

    /** The details of the new compartment of the desktop pool. */
    public com.oracle.bmc.desktops.model.ChangeDesktopPoolCompartmentDetails
            getChangeDesktopPoolCompartmentDetails() {
        return changeDesktopPoolCompartmentDetails;
    }
    /** The unique identifier of the request. */
    private String opcRequestId;

    /** The unique identifier of the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** For optimistic concurrency control. */
    private String ifMatch;

    /** For optimistic concurrency control. */
    public String getIfMatch() {
        return ifMatch;
    }
    /** A token that uniquely identifies a request. */
    private String opcRetryToken;

    /** A token that uniquely identifies a request. */
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
    public com.oracle.bmc.desktops.model.ChangeDesktopPoolCompartmentDetails getBody$() {
        return changeDesktopPoolCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeDesktopPoolCompartmentRequest,
                    com.oracle.bmc.desktops.model.ChangeDesktopPoolCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the desktop pool. */
        private String desktopPoolId = null;

        /**
         * The OCID of the desktop pool.
         *
         * @param desktopPoolId the value to set
         * @return this builder instance
         */
        public Builder desktopPoolId(String desktopPoolId) {
            this.desktopPoolId = desktopPoolId;
            return this;
        }

        /** The details of the new compartment of the desktop pool. */
        private com.oracle.bmc.desktops.model.ChangeDesktopPoolCompartmentDetails
                changeDesktopPoolCompartmentDetails = null;

        /**
         * The details of the new compartment of the desktop pool.
         *
         * @param changeDesktopPoolCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeDesktopPoolCompartmentDetails(
                com.oracle.bmc.desktops.model.ChangeDesktopPoolCompartmentDetails
                        changeDesktopPoolCompartmentDetails) {
            this.changeDesktopPoolCompartmentDetails = changeDesktopPoolCompartmentDetails;
            return this;
        }

        /** The unique identifier of the request. */
        private String opcRequestId = null;

        /**
         * The unique identifier of the request.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /** For optimistic concurrency control. */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /** A token that uniquely identifies a request. */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request.
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
        public Builder copy(ChangeDesktopPoolCompartmentRequest o) {
            desktopPoolId(o.getDesktopPoolId());
            changeDesktopPoolCompartmentDetails(o.getChangeDesktopPoolCompartmentDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeDesktopPoolCompartmentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeDesktopPoolCompartmentRequest
         */
        public ChangeDesktopPoolCompartmentRequest build() {
            ChangeDesktopPoolCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.desktops.model.ChangeDesktopPoolCompartmentDetails body) {
            changeDesktopPoolCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeDesktopPoolCompartmentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeDesktopPoolCompartmentRequest
         */
        public ChangeDesktopPoolCompartmentRequest buildWithoutInvocationCallback() {
            ChangeDesktopPoolCompartmentRequest request = new ChangeDesktopPoolCompartmentRequest();
            request.desktopPoolId = desktopPoolId;
            request.changeDesktopPoolCompartmentDetails = changeDesktopPoolCompartmentDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeDesktopPoolCompartmentRequest(desktopPoolId,
            // changeDesktopPoolCompartmentDetails, opcRequestId, ifMatch, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .desktopPoolId(desktopPoolId)
                .changeDesktopPoolCompartmentDetails(changeDesktopPoolCompartmentDetails)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch)
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
        sb.append(",desktopPoolId=").append(String.valueOf(this.desktopPoolId));
        sb.append(",changeDesktopPoolCompartmentDetails=")
                .append(String.valueOf(this.changeDesktopPoolCompartmentDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeDesktopPoolCompartmentRequest)) {
            return false;
        }

        ChangeDesktopPoolCompartmentRequest other = (ChangeDesktopPoolCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.desktopPoolId, other.desktopPoolId)
                && java.util.Objects.equals(
                        this.changeDesktopPoolCompartmentDetails,
                        other.changeDesktopPoolCompartmentDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.desktopPoolId == null ? 43 : this.desktopPoolId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeDesktopPoolCompartmentDetails == null
                                ? 43
                                : this.changeDesktopPoolCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
