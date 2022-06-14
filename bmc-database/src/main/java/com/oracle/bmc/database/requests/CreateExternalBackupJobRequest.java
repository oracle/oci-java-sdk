/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateExternalBackupJobExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateExternalBackupJobRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CreateExternalBackupJobRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.CreateExternalBackupJobDetails> {

    /**
     * Request to create a cloud backup resource for a database running outside the cloud.
     */
    private com.oracle.bmc.database.model.CreateExternalBackupJobDetails
            createExternalBackupJobDetails;

    /**
     * Request to create a cloud backup resource for a database running outside the cloud.
     */
    public com.oracle.bmc.database.model.CreateExternalBackupJobDetails
            getCreateExternalBackupJobDetails() {
        return createExternalBackupJobDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
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
    public com.oracle.bmc.database.model.CreateExternalBackupJobDetails getBody$() {
        return createExternalBackupJobDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateExternalBackupJobRequest,
                    com.oracle.bmc.database.model.CreateExternalBackupJobDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Request to create a cloud backup resource for a database running outside the cloud.
         */
        private com.oracle.bmc.database.model.CreateExternalBackupJobDetails
                createExternalBackupJobDetails = null;

        /**
         * Request to create a cloud backup resource for a database running outside the cloud.
         * @param createExternalBackupJobDetails the value to set
         * @return this builder instance
         */
        public Builder createExternalBackupJobDetails(
                com.oracle.bmc.database.model.CreateExternalBackupJobDetails
                        createExternalBackupJobDetails) {
            this.createExternalBackupJobDetails = createExternalBackupJobDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * may be rejected).
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * may be rejected).
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
        public Builder copy(CreateExternalBackupJobRequest o) {
            createExternalBackupJobDetails(o.getCreateExternalBackupJobDetails());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateExternalBackupJobRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateExternalBackupJobRequest
         */
        public CreateExternalBackupJobRequest build() {
            CreateExternalBackupJobRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.database.model.CreateExternalBackupJobDetails body) {
            createExternalBackupJobDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateExternalBackupJobRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateExternalBackupJobRequest
         */
        public CreateExternalBackupJobRequest buildWithoutInvocationCallback() {
            CreateExternalBackupJobRequest request = new CreateExternalBackupJobRequest();
            request.createExternalBackupJobDetails = createExternalBackupJobDetails;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CreateExternalBackupJobRequest(createExternalBackupJobDetails, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .createExternalBackupJobDetails(createExternalBackupJobDetails)
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
        sb.append(",createExternalBackupJobDetails=")
                .append(String.valueOf(this.createExternalBackupJobDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateExternalBackupJobRequest)) {
            return false;
        }

        CreateExternalBackupJobRequest other = (CreateExternalBackupJobRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.createExternalBackupJobDetails, other.createExternalBackupJobDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.createExternalBackupJobDetails == null
                                ? 43
                                : this.createExternalBackupJobDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
