/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.requests;

import com.oracle.bmc.dataintegration.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/CreateExternalPublicationValidationExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateExternalPublicationValidationRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
public class CreateExternalPublicationValidationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dataintegration.model.CreateExternalPublicationValidationDetails> {

    /** The workspace ID. */
    private String workspaceId;

    /** The workspace ID. */
    public String getWorkspaceId() {
        return workspaceId;
    }
    /** The task key. */
    private String taskKey;

    /** The task key. */
    public String getTaskKey() {
        return taskKey;
    }
    /** The information needed to create a task validation. */
    private com.oracle.bmc.dataintegration.model.CreateExternalPublicationValidationDetails
            createExternalPublicationValidationDetails;

    /** The information needed to create a task validation. */
    public com.oracle.bmc.dataintegration.model.CreateExternalPublicationValidationDetails
            getCreateExternalPublicationValidationDetails() {
        return createExternalPublicationValidationDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again.
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
    public com.oracle.bmc.dataintegration.model.CreateExternalPublicationValidationDetails
            getBody$() {
        return createExternalPublicationValidationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateExternalPublicationValidationRequest,
                    com.oracle.bmc.dataintegration.model
                            .CreateExternalPublicationValidationDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The workspace ID. */
        private String workspaceId = null;

        /**
         * The workspace ID.
         *
         * @param workspaceId the value to set
         * @return this builder instance
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        /** The task key. */
        private String taskKey = null;

        /**
         * The task key.
         *
         * @param taskKey the value to set
         * @return this builder instance
         */
        public Builder taskKey(String taskKey) {
            this.taskKey = taskKey;
            return this;
        }

        /** The information needed to create a task validation. */
        private com.oracle.bmc.dataintegration.model.CreateExternalPublicationValidationDetails
                createExternalPublicationValidationDetails = null;

        /**
         * The information needed to create a task validation.
         *
         * @param createExternalPublicationValidationDetails the value to set
         * @return this builder instance
         */
        public Builder createExternalPublicationValidationDetails(
                com.oracle.bmc.dataintegration.model.CreateExternalPublicationValidationDetails
                        createExternalPublicationValidationDetails) {
            this.createExternalPublicationValidationDetails =
                    createExternalPublicationValidationDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
         * server error without risk of executing that same action again.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again.
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
        public Builder copy(CreateExternalPublicationValidationRequest o) {
            workspaceId(o.getWorkspaceId());
            taskKey(o.getTaskKey());
            createExternalPublicationValidationDetails(
                    o.getCreateExternalPublicationValidationDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateExternalPublicationValidationRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateExternalPublicationValidationRequest
         */
        public CreateExternalPublicationValidationRequest build() {
            CreateExternalPublicationValidationRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.dataintegration.model.CreateExternalPublicationValidationDetails
                        body) {
            createExternalPublicationValidationDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateExternalPublicationValidationRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateExternalPublicationValidationRequest
         */
        public CreateExternalPublicationValidationRequest buildWithoutInvocationCallback() {
            CreateExternalPublicationValidationRequest request =
                    new CreateExternalPublicationValidationRequest();
            request.workspaceId = workspaceId;
            request.taskKey = taskKey;
            request.createExternalPublicationValidationDetails =
                    createExternalPublicationValidationDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CreateExternalPublicationValidationRequest(workspaceId, taskKey,
            // createExternalPublicationValidationDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .workspaceId(workspaceId)
                .taskKey(taskKey)
                .createExternalPublicationValidationDetails(
                        createExternalPublicationValidationDetails)
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
        sb.append(",workspaceId=").append(String.valueOf(this.workspaceId));
        sb.append(",taskKey=").append(String.valueOf(this.taskKey));
        sb.append(",createExternalPublicationValidationDetails=")
                .append(String.valueOf(this.createExternalPublicationValidationDetails));
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
        if (!(o instanceof CreateExternalPublicationValidationRequest)) {
            return false;
        }

        CreateExternalPublicationValidationRequest other =
                (CreateExternalPublicationValidationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.workspaceId, other.workspaceId)
                && java.util.Objects.equals(this.taskKey, other.taskKey)
                && java.util.Objects.equals(
                        this.createExternalPublicationValidationDetails,
                        other.createExternalPublicationValidationDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.workspaceId == null ? 43 : this.workspaceId.hashCode());
        result = (result * PRIME) + (this.taskKey == null ? 43 : this.taskKey.hashCode());
        result =
                (result * PRIME)
                        + (this.createExternalPublicationValidationDetails == null
                                ? 43
                                : this.createExternalPublicationValidationDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
