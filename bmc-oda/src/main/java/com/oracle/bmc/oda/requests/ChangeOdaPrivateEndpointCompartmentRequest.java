/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.requests;

import com.oracle.bmc.oda.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/ChangeOdaPrivateEndpointCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeOdaPrivateEndpointCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class ChangeOdaPrivateEndpointCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.oda.model.ChangeOdaPrivateEndpointCompartmentDetails> {

    /**
     * Unique ODA Private Endpoint identifier which is the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String odaPrivateEndpointId;

    /**
     * Unique ODA Private Endpoint identifier which is the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getOdaPrivateEndpointId() {
        return odaPrivateEndpointId;
    }
    /**
     * The compartment to which the Digital Assistant instance should be moved.
     */
    private com.oracle.bmc.oda.model.ChangeOdaPrivateEndpointCompartmentDetails
            changeOdaPrivateEndpointCompartmentDetails;

    /**
     * The compartment to which the Digital Assistant instance should be moved.
     */
    public com.oracle.bmc.oda.model.ChangeOdaPrivateEndpointCompartmentDetails
            getChangeOdaPrivateEndpointCompartmentDetails() {
        return changeOdaPrivateEndpointCompartmentDetails;
    }
    /**
     * For optimistic concurrency control in a PUT or DELETE call for
     * a Digital Assistant instance, set the {@code if-match} query parameter
     * to the value of the {@code ETAG} header from a previous GET or POST
     * response for that instance. The service updates or deletes the
     * instance only if the etag that you provide matches the instance's
     * current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control in a PUT or DELETE call for
     * a Digital Assistant instance, set the {@code if-match} query parameter
     * to the value of the {@code ETAG} header from a previous GET or POST
     * response for that instance. The service updates or deletes the
     * instance only if the etag that you provide matches the instance's
     * current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The client request ID for tracing. This value is included in the opc-request-id response header.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing. This value is included in the opc-request-id response header.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so that you can retry the request if there's
     * a timeout or server error without the risk of executing that same action again.
     * <p>
     * Retry tokens expire after 24 hours, but they can become invalid before then if there are
     * conflicting operations. For example, if an instance was deleted and purged from the system,
     * then the service might reject a retry of the original creation request.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so that you can retry the request if there's
     * a timeout or server error without the risk of executing that same action again.
     * <p>
     * Retry tokens expire after 24 hours, but they can become invalid before then if there are
     * conflicting operations. For example, if an instance was deleted and purged from the system,
     * then the service might reject a retry of the original creation request.
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
    public com.oracle.bmc.oda.model.ChangeOdaPrivateEndpointCompartmentDetails getBody$() {
        return changeOdaPrivateEndpointCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeOdaPrivateEndpointCompartmentRequest,
                    com.oracle.bmc.oda.model.ChangeOdaPrivateEndpointCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique ODA Private Endpoint identifier which is the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String odaPrivateEndpointId = null;

        /**
         * Unique ODA Private Endpoint identifier which is the [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         * @param odaPrivateEndpointId the value to set
         * @return this builder instance
         */
        public Builder odaPrivateEndpointId(String odaPrivateEndpointId) {
            this.odaPrivateEndpointId = odaPrivateEndpointId;
            return this;
        }

        /**
         * The compartment to which the Digital Assistant instance should be moved.
         */
        private com.oracle.bmc.oda.model.ChangeOdaPrivateEndpointCompartmentDetails
                changeOdaPrivateEndpointCompartmentDetails = null;

        /**
         * The compartment to which the Digital Assistant instance should be moved.
         * @param changeOdaPrivateEndpointCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeOdaPrivateEndpointCompartmentDetails(
                com.oracle.bmc.oda.model.ChangeOdaPrivateEndpointCompartmentDetails
                        changeOdaPrivateEndpointCompartmentDetails) {
            this.changeOdaPrivateEndpointCompartmentDetails =
                    changeOdaPrivateEndpointCompartmentDetails;
            return this;
        }

        /**
         * For optimistic concurrency control in a PUT or DELETE call for
         * a Digital Assistant instance, set the {@code if-match} query parameter
         * to the value of the {@code ETAG} header from a previous GET or POST
         * response for that instance. The service updates or deletes the
         * instance only if the etag that you provide matches the instance's
         * current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control in a PUT or DELETE call for
         * a Digital Assistant instance, set the {@code if-match} query parameter
         * to the value of the {@code ETAG} header from a previous GET or POST
         * response for that instance. The service updates or deletes the
         * instance only if the etag that you provide matches the instance's
         * current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response header.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response header.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so that you can retry the request if there's
         * a timeout or server error without the risk of executing that same action again.
         * <p>
         * Retry tokens expire after 24 hours, but they can become invalid before then if there are
         * conflicting operations. For example, if an instance was deleted and purged from the system,
         * then the service might reject a retry of the original creation request.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so that you can retry the request if there's
         * a timeout or server error without the risk of executing that same action again.
         * <p>
         * Retry tokens expire after 24 hours, but they can become invalid before then if there are
         * conflicting operations. For example, if an instance was deleted and purged from the system,
         * then the service might reject a retry of the original creation request.
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
        public Builder copy(ChangeOdaPrivateEndpointCompartmentRequest o) {
            odaPrivateEndpointId(o.getOdaPrivateEndpointId());
            changeOdaPrivateEndpointCompartmentDetails(
                    o.getChangeOdaPrivateEndpointCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeOdaPrivateEndpointCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeOdaPrivateEndpointCompartmentRequest
         */
        public ChangeOdaPrivateEndpointCompartmentRequest build() {
            ChangeOdaPrivateEndpointCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.oda.model.ChangeOdaPrivateEndpointCompartmentDetails body) {
            changeOdaPrivateEndpointCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeOdaPrivateEndpointCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeOdaPrivateEndpointCompartmentRequest
         */
        public ChangeOdaPrivateEndpointCompartmentRequest buildWithoutInvocationCallback() {
            ChangeOdaPrivateEndpointCompartmentRequest request =
                    new ChangeOdaPrivateEndpointCompartmentRequest();
            request.odaPrivateEndpointId = odaPrivateEndpointId;
            request.changeOdaPrivateEndpointCompartmentDetails =
                    changeOdaPrivateEndpointCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeOdaPrivateEndpointCompartmentRequest(odaPrivateEndpointId, changeOdaPrivateEndpointCompartmentDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .odaPrivateEndpointId(odaPrivateEndpointId)
                .changeOdaPrivateEndpointCompartmentDetails(
                        changeOdaPrivateEndpointCompartmentDetails)
                .ifMatch(ifMatch)
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
        sb.append(",odaPrivateEndpointId=").append(String.valueOf(this.odaPrivateEndpointId));
        sb.append(",changeOdaPrivateEndpointCompartmentDetails=")
                .append(String.valueOf(this.changeOdaPrivateEndpointCompartmentDetails));
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
        if (!(o instanceof ChangeOdaPrivateEndpointCompartmentRequest)) {
            return false;
        }

        ChangeOdaPrivateEndpointCompartmentRequest other =
                (ChangeOdaPrivateEndpointCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.odaPrivateEndpointId, other.odaPrivateEndpointId)
                && java.util.Objects.equals(
                        this.changeOdaPrivateEndpointCompartmentDetails,
                        other.changeOdaPrivateEndpointCompartmentDetails)
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
                        + (this.odaPrivateEndpointId == null
                                ? 43
                                : this.odaPrivateEndpointId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeOdaPrivateEndpointCompartmentDetails == null
                                ? 43
                                : this.changeOdaPrivateEndpointCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
