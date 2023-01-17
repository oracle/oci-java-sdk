/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateAutonomousDatabaseRegionalWalletExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateAutonomousDatabaseRegionalWalletRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateAutonomousDatabaseRegionalWalletRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.UpdateAutonomousDatabaseWalletDetails> {

    /** Request to update the properties of Autonomous Database regional wallet. */
    private com.oracle.bmc.database.model.UpdateAutonomousDatabaseWalletDetails
            updateAutonomousDatabaseWalletDetails;

    /** Request to update the properties of Autonomous Database regional wallet. */
    public com.oracle.bmc.database.model.UpdateAutonomousDatabaseWalletDetails
            getUpdateAutonomousDatabaseWalletDetails() {
        return updateAutonomousDatabaseWalletDetails;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
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
    public com.oracle.bmc.database.model.UpdateAutonomousDatabaseWalletDetails getBody$() {
        return updateAutonomousDatabaseWalletDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateAutonomousDatabaseRegionalWalletRequest,
                    com.oracle.bmc.database.model.UpdateAutonomousDatabaseWalletDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Request to update the properties of Autonomous Database regional wallet. */
        private com.oracle.bmc.database.model.UpdateAutonomousDatabaseWalletDetails
                updateAutonomousDatabaseWalletDetails = null;

        /**
         * Request to update the properties of Autonomous Database regional wallet.
         *
         * @param updateAutonomousDatabaseWalletDetails the value to set
         * @return this builder instance
         */
        public Builder updateAutonomousDatabaseWalletDetails(
                com.oracle.bmc.database.model.UpdateAutonomousDatabaseWalletDetails
                        updateAutonomousDatabaseWalletDetails) {
            this.updateAutonomousDatabaseWalletDetails = updateAutonomousDatabaseWalletDetails;
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
        public Builder copy(UpdateAutonomousDatabaseRegionalWalletRequest o) {
            updateAutonomousDatabaseWalletDetails(o.getUpdateAutonomousDatabaseWalletDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateAutonomousDatabaseRegionalWalletRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateAutonomousDatabaseRegionalWalletRequest
         */
        public UpdateAutonomousDatabaseRegionalWalletRequest build() {
            UpdateAutonomousDatabaseRegionalWalletRequest request =
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
                com.oracle.bmc.database.model.UpdateAutonomousDatabaseWalletDetails body) {
            updateAutonomousDatabaseWalletDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateAutonomousDatabaseRegionalWalletRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateAutonomousDatabaseRegionalWalletRequest
         */
        public UpdateAutonomousDatabaseRegionalWalletRequest buildWithoutInvocationCallback() {
            UpdateAutonomousDatabaseRegionalWalletRequest request =
                    new UpdateAutonomousDatabaseRegionalWalletRequest();
            request.updateAutonomousDatabaseWalletDetails = updateAutonomousDatabaseWalletDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new
            // UpdateAutonomousDatabaseRegionalWalletRequest(updateAutonomousDatabaseWalletDetails,
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
                .updateAutonomousDatabaseWalletDetails(updateAutonomousDatabaseWalletDetails)
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
        sb.append(",updateAutonomousDatabaseWalletDetails=")
                .append(String.valueOf(this.updateAutonomousDatabaseWalletDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAutonomousDatabaseRegionalWalletRequest)) {
            return false;
        }

        UpdateAutonomousDatabaseRegionalWalletRequest other =
                (UpdateAutonomousDatabaseRegionalWalletRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.updateAutonomousDatabaseWalletDetails,
                        other.updateAutonomousDatabaseWalletDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.updateAutonomousDatabaseWalletDetails == null
                                ? 43
                                : this.updateAutonomousDatabaseWalletDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
