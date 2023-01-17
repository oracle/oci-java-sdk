/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateAutonomousDatabaseWalletExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateAutonomousDatabaseWalletRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateAutonomousDatabaseWalletRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.UpdateAutonomousDatabaseWalletDetails> {

    /**
     * The database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String autonomousDatabaseId;

    /**
     * The database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getAutonomousDatabaseId() {
        return autonomousDatabaseId;
    }
    /**
     * Request to update the properties of an Autonomous Database wallet.
     */
    private com.oracle.bmc.database.model.UpdateAutonomousDatabaseWalletDetails
            updateAutonomousDatabaseWalletDetails;

    /**
     * Request to update the properties of an Autonomous Database wallet.
     */
    public com.oracle.bmc.database.model.UpdateAutonomousDatabaseWalletDetails
            getUpdateAutonomousDatabaseWalletDetails() {
        return updateAutonomousDatabaseWalletDetails;
    }
    /**
     * Unique identifier for the request.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.database.model.UpdateAutonomousDatabaseWalletDetails getBody$() {
        return updateAutonomousDatabaseWalletDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateAutonomousDatabaseWalletRequest,
                    com.oracle.bmc.database.model.UpdateAutonomousDatabaseWalletDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String autonomousDatabaseId = null;

        /**
         * The database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param autonomousDatabaseId the value to set
         * @return this builder instance
         */
        public Builder autonomousDatabaseId(String autonomousDatabaseId) {
            this.autonomousDatabaseId = autonomousDatabaseId;
            return this;
        }

        /**
         * Request to update the properties of an Autonomous Database wallet.
         */
        private com.oracle.bmc.database.model.UpdateAutonomousDatabaseWalletDetails
                updateAutonomousDatabaseWalletDetails = null;

        /**
         * Request to update the properties of an Autonomous Database wallet.
         * @param updateAutonomousDatabaseWalletDetails the value to set
         * @return this builder instance
         */
        public Builder updateAutonomousDatabaseWalletDetails(
                com.oracle.bmc.database.model.UpdateAutonomousDatabaseWalletDetails
                        updateAutonomousDatabaseWalletDetails) {
            this.updateAutonomousDatabaseWalletDetails = updateAutonomousDatabaseWalletDetails;
            return this;
        }

        /**
         * Unique identifier for the request.
         *
         */
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
        public Builder copy(UpdateAutonomousDatabaseWalletRequest o) {
            autonomousDatabaseId(o.getAutonomousDatabaseId());
            updateAutonomousDatabaseWalletDetails(o.getUpdateAutonomousDatabaseWalletDetails());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateAutonomousDatabaseWalletRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateAutonomousDatabaseWalletRequest
         */
        public UpdateAutonomousDatabaseWalletRequest build() {
            UpdateAutonomousDatabaseWalletRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.database.model.UpdateAutonomousDatabaseWalletDetails body) {
            updateAutonomousDatabaseWalletDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateAutonomousDatabaseWalletRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateAutonomousDatabaseWalletRequest
         */
        public UpdateAutonomousDatabaseWalletRequest buildWithoutInvocationCallback() {
            UpdateAutonomousDatabaseWalletRequest request =
                    new UpdateAutonomousDatabaseWalletRequest();
            request.autonomousDatabaseId = autonomousDatabaseId;
            request.updateAutonomousDatabaseWalletDetails = updateAutonomousDatabaseWalletDetails;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateAutonomousDatabaseWalletRequest(autonomousDatabaseId, updateAutonomousDatabaseWalletDetails, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .autonomousDatabaseId(autonomousDatabaseId)
                .updateAutonomousDatabaseWalletDetails(updateAutonomousDatabaseWalletDetails)
                .opcRequestId(opcRequestId);
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
        sb.append(",autonomousDatabaseId=").append(String.valueOf(this.autonomousDatabaseId));
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
        if (!(o instanceof UpdateAutonomousDatabaseWalletRequest)) {
            return false;
        }

        UpdateAutonomousDatabaseWalletRequest other = (UpdateAutonomousDatabaseWalletRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.autonomousDatabaseId, other.autonomousDatabaseId)
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
                        + (this.autonomousDatabaseId == null
                                ? 43
                                : this.autonomousDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateAutonomousDatabaseWalletDetails == null
                                ? 43
                                : this.updateAutonomousDatabaseWalletDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
