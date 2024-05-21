/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/ChangeSensitiveDataModelCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeSensitiveDataModelCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class ChangeSensitiveDataModelCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datasafe.model.ChangeSensitiveDataModelCompartmentDetails> {

    /**
     * The OCID of the sensitive data model.
     */
    private String sensitiveDataModelId;

    /**
     * The OCID of the sensitive data model.
     */
    public String getSensitiveDataModelId() {
        return sensitiveDataModelId;
    }
    /**
     * Details to change the compartment of a sensitive data model.
     */
    private com.oracle.bmc.datasafe.model.ChangeSensitiveDataModelCompartmentDetails
            changeSensitiveDataModelCompartmentDetails;

    /**
     * Details to change the compartment of a sensitive data model.
     */
    public com.oracle.bmc.datasafe.model.ChangeSensitiveDataModelCompartmentDetails
            getChangeSensitiveDataModelCompartmentDetails() {
        return changeSensitiveDataModelCompartmentDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the if-match parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the if-match parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique identifier for the request.
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request might be rejected.
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
    public com.oracle.bmc.datasafe.model.ChangeSensitiveDataModelCompartmentDetails getBody$() {
        return changeSensitiveDataModelCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeSensitiveDataModelCompartmentRequest,
                    com.oracle.bmc.datasafe.model.ChangeSensitiveDataModelCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the sensitive data model.
         */
        private String sensitiveDataModelId = null;

        /**
         * The OCID of the sensitive data model.
         * @param sensitiveDataModelId the value to set
         * @return this builder instance
         */
        public Builder sensitiveDataModelId(String sensitiveDataModelId) {
            this.sensitiveDataModelId = sensitiveDataModelId;
            return this;
        }

        /**
         * Details to change the compartment of a sensitive data model.
         */
        private com.oracle.bmc.datasafe.model.ChangeSensitiveDataModelCompartmentDetails
                changeSensitiveDataModelCompartmentDetails = null;

        /**
         * Details to change the compartment of a sensitive data model.
         * @param changeSensitiveDataModelCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeSensitiveDataModelCompartmentDetails(
                com.oracle.bmc.datasafe.model.ChangeSensitiveDataModelCompartmentDetails
                        changeSensitiveDataModelCompartmentDetails) {
            this.changeSensitiveDataModelCompartmentDetails =
                    changeSensitiveDataModelCompartmentDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the if-match parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the if-match parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique identifier for the request.
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
         * has been deleted and purged from the system, then a retry of the original creation request might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request might be rejected.
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
        public Builder copy(ChangeSensitiveDataModelCompartmentRequest o) {
            sensitiveDataModelId(o.getSensitiveDataModelId());
            changeSensitiveDataModelCompartmentDetails(
                    o.getChangeSensitiveDataModelCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeSensitiveDataModelCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeSensitiveDataModelCompartmentRequest
         */
        public ChangeSensitiveDataModelCompartmentRequest build() {
            ChangeSensitiveDataModelCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.datasafe.model.ChangeSensitiveDataModelCompartmentDetails body) {
            changeSensitiveDataModelCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeSensitiveDataModelCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeSensitiveDataModelCompartmentRequest
         */
        public ChangeSensitiveDataModelCompartmentRequest buildWithoutInvocationCallback() {
            ChangeSensitiveDataModelCompartmentRequest request =
                    new ChangeSensitiveDataModelCompartmentRequest();
            request.sensitiveDataModelId = sensitiveDataModelId;
            request.changeSensitiveDataModelCompartmentDetails =
                    changeSensitiveDataModelCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeSensitiveDataModelCompartmentRequest(sensitiveDataModelId, changeSensitiveDataModelCompartmentDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .sensitiveDataModelId(sensitiveDataModelId)
                .changeSensitiveDataModelCompartmentDetails(
                        changeSensitiveDataModelCompartmentDetails)
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
        sb.append(",sensitiveDataModelId=").append(String.valueOf(this.sensitiveDataModelId));
        sb.append(",changeSensitiveDataModelCompartmentDetails=")
                .append(String.valueOf(this.changeSensitiveDataModelCompartmentDetails));
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
        if (!(o instanceof ChangeSensitiveDataModelCompartmentRequest)) {
            return false;
        }

        ChangeSensitiveDataModelCompartmentRequest other =
                (ChangeSensitiveDataModelCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.sensitiveDataModelId, other.sensitiveDataModelId)
                && java.util.Objects.equals(
                        this.changeSensitiveDataModelCompartmentDetails,
                        other.changeSensitiveDataModelCompartmentDetails)
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
                        + (this.sensitiveDataModelId == null
                                ? 43
                                : this.sensitiveDataModelId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeSensitiveDataModelCompartmentDetails == null
                                ? 43
                                : this.changeSensitiveDataModelCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
