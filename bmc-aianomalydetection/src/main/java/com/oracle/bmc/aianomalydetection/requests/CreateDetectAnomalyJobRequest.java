/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.requests;

import com.oracle.bmc.aianomalydetection.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/aianomalydetection/CreateDetectAnomalyJobExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateDetectAnomalyJobRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
public class CreateDetectAnomalyJobRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.aianomalydetection.model.CreateDetectAnomalyJobDetails> {

    /**
     * The input is either:
     *   - JSON object in the request. This object is defined, and the SDK generates the
     *     object for it.
     *   - Data embedded as Base64 string in format of either:
     *     - CSV
     *     - JSON
     *     If this option is used, then you must provide the content of specified
     *     CSV or JSON in Base64 encoded string. The Embedded JSON has to be
     *     in the same format as the inline request JSON.
     *
     */
    private com.oracle.bmc.aianomalydetection.model.CreateDetectAnomalyJobDetails
            createDetectAnomalyJobDetails;

    /**
     * The input is either:
     *   - JSON object in the request. This object is defined, and the SDK generates the
     *     object for it.
     *   - Data embedded as Base64 string in format of either:
     *     - CSV
     *     - JSON
     *     If this option is used, then you must provide the content of specified
     *     CSV or JSON in Base64 encoded string. The Embedded JSON has to be
     *     in the same format as the inline request JSON.
     *
     */
    public com.oracle.bmc.aianomalydetection.model.CreateDetectAnomalyJobDetails
            getCreateDetectAnomalyJobDetails() {
        return createDetectAnomalyJobDetails;
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
    public com.oracle.bmc.aianomalydetection.model.CreateDetectAnomalyJobDetails getBody$() {
        return createDetectAnomalyJobDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateDetectAnomalyJobRequest,
                    com.oracle.bmc.aianomalydetection.model.CreateDetectAnomalyJobDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The input is either:
         *   - JSON object in the request. This object is defined, and the SDK generates the
         *     object for it.
         *   - Data embedded as Base64 string in format of either:
         *     - CSV
         *     - JSON
         *     If this option is used, then you must provide the content of specified
         *     CSV or JSON in Base64 encoded string. The Embedded JSON has to be
         *     in the same format as the inline request JSON.
         *
         */
        private com.oracle.bmc.aianomalydetection.model.CreateDetectAnomalyJobDetails
                createDetectAnomalyJobDetails = null;

        /**
         * The input is either:
         *   - JSON object in the request. This object is defined, and the SDK generates the
         *     object for it.
         *   - Data embedded as Base64 string in format of either:
         *     - CSV
         *     - JSON
         *     If this option is used, then you must provide the content of specified
         *     CSV or JSON in Base64 encoded string. The Embedded JSON has to be
         *     in the same format as the inline request JSON.
         *
         * @param createDetectAnomalyJobDetails the value to set
         * @return this builder instance
         */
        public Builder createDetectAnomalyJobDetails(
                com.oracle.bmc.aianomalydetection.model.CreateDetectAnomalyJobDetails
                        createDetectAnomalyJobDetails) {
            this.createDetectAnomalyJobDetails = createDetectAnomalyJobDetails;
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
        public Builder copy(CreateDetectAnomalyJobRequest o) {
            createDetectAnomalyJobDetails(o.getCreateDetectAnomalyJobDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateDetectAnomalyJobRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateDetectAnomalyJobRequest
         */
        public CreateDetectAnomalyJobRequest build() {
            CreateDetectAnomalyJobRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.aianomalydetection.model.CreateDetectAnomalyJobDetails body) {
            createDetectAnomalyJobDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateDetectAnomalyJobRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateDetectAnomalyJobRequest
         */
        public CreateDetectAnomalyJobRequest buildWithoutInvocationCallback() {
            CreateDetectAnomalyJobRequest request = new CreateDetectAnomalyJobRequest();
            request.createDetectAnomalyJobDetails = createDetectAnomalyJobDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CreateDetectAnomalyJobRequest(createDetectAnomalyJobDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createDetectAnomalyJobDetails(createDetectAnomalyJobDetails)
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
        sb.append(",createDetectAnomalyJobDetails=")
                .append(String.valueOf(this.createDetectAnomalyJobDetails));
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
        if (!(o instanceof CreateDetectAnomalyJobRequest)) {
            return false;
        }

        CreateDetectAnomalyJobRequest other = (CreateDetectAnomalyJobRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createDetectAnomalyJobDetails, other.createDetectAnomalyJobDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createDetectAnomalyJobDetails == null
                                ? 43
                                : this.createDetectAnomalyJobDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
