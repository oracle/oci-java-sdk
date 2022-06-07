/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.requests;

import com.oracle.bmc.waas.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/waas/ChangeHttpRedirectCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeHttpRedirectCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
public class ChangeHttpRedirectCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.waas.model.ChangeHttpRedirectCompartmentDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the HTTP Redirect.
     */
    private String httpRedirectId;

    public String getHttpRedirectId() {
        return httpRedirectId;
    }
    /**
     *
     */
    private com.oracle.bmc.waas.model.ChangeHttpRedirectCompartmentDetails
            changeHttpRedirectCompartmentDetails;

    public com.oracle.bmc.waas.model.ChangeHttpRedirectCompartmentDetails
            getChangeHttpRedirectCompartmentDetails() {
        return changeHttpRedirectCompartmentDetails;
    }
    /**
     * For optimistic concurrency control. In the {@code PUT} or {@code DELETE} call for a resource, set the {@code if-match} parameter to the value of the etag from a previous {@code GET} or {@code POST} response for that resource. The resource will be updated or deleted only if the etag provided matches the resource's current etag value.
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of executing that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations
     * *Example:* If a resource has been deleted and purged from the system, then a retry of the original delete request may be rejected.
     */
    private String opcRetryToken;

    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.waas.model.ChangeHttpRedirectCompartmentDetails getBody$() {
        return changeHttpRedirectCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeHttpRedirectCompartmentRequest,
                    com.oracle.bmc.waas.model.ChangeHttpRedirectCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String httpRedirectId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the HTTP Redirect.
         * @return this builder instance
         */
        public Builder httpRedirectId(String httpRedirectId) {
            this.httpRedirectId = httpRedirectId;
            return this;
        }

        private com.oracle.bmc.waas.model.ChangeHttpRedirectCompartmentDetails
                changeHttpRedirectCompartmentDetails = null;

        /**
         *
         * @return this builder instance
         */
        public Builder changeHttpRedirectCompartmentDetails(
                com.oracle.bmc.waas.model.ChangeHttpRedirectCompartmentDetails
                        changeHttpRedirectCompartmentDetails) {
            this.changeHttpRedirectCompartmentDetails = changeHttpRedirectCompartmentDetails;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the {@code PUT} or {@code DELETE} call for a resource, set the {@code if-match} parameter to the value of the etag from a previous {@code GET} or {@code POST} response for that resource. The resource will be updated or deleted only if the etag provided matches the resource's current etag value.
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        private String opcRequestId = null;

        /**
         * The unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of executing that same action again. Retry tokens expire after 24 hours, but can be invalidated before then due to conflicting operations
         * *Example:* If a resource has been deleted and purged from the system, then a retry of the original delete request may be rejected.
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
        public Builder copy(ChangeHttpRedirectCompartmentRequest o) {
            httpRedirectId(o.getHttpRedirectId());
            changeHttpRedirectCompartmentDetails(o.getChangeHttpRedirectCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeHttpRedirectCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeHttpRedirectCompartmentRequest
         */
        public ChangeHttpRedirectCompartmentRequest build() {
            ChangeHttpRedirectCompartmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.waas.model.ChangeHttpRedirectCompartmentDetails body) {
            changeHttpRedirectCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeHttpRedirectCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeHttpRedirectCompartmentRequest
         */
        public ChangeHttpRedirectCompartmentRequest buildWithoutInvocationCallback() {
            ChangeHttpRedirectCompartmentRequest request =
                    new ChangeHttpRedirectCompartmentRequest();
            request.httpRedirectId = httpRedirectId;
            request.changeHttpRedirectCompartmentDetails = changeHttpRedirectCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeHttpRedirectCompartmentRequest(httpRedirectId, changeHttpRedirectCompartmentDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .httpRedirectId(httpRedirectId)
                .changeHttpRedirectCompartmentDetails(changeHttpRedirectCompartmentDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",httpRedirectId=").append(String.valueOf(this.httpRedirectId));
        sb.append(",changeHttpRedirectCompartmentDetails=")
                .append(String.valueOf(this.changeHttpRedirectCompartmentDetails));
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
        if (!(o instanceof ChangeHttpRedirectCompartmentRequest)) {
            return false;
        }

        ChangeHttpRedirectCompartmentRequest other = (ChangeHttpRedirectCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.httpRedirectId, other.httpRedirectId)
                && java.util.Objects.equals(
                        this.changeHttpRedirectCompartmentDetails,
                        other.changeHttpRedirectCompartmentDetails)
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
                        + (this.httpRedirectId == null ? 43 : this.httpRedirectId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeHttpRedirectCompartmentDetails == null
                                ? 43
                                : this.changeHttpRedirectCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
