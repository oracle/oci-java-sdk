/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.requests;

import com.oracle.bmc.opsi.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/opsi/ChangePeComanagedDatabaseInsightExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangePeComanagedDatabaseInsightRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
public class ChangePeComanagedDatabaseInsightRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.opsi.model.ChangePeComanagedDatabaseInsightDetails> {

    /**
     * Unique database insight identifier
     */
    private String databaseInsightId;

    public String getDatabaseInsightId() {
        return databaseInsightId;
    }
    /**
     * The information to be updated.
     */
    private com.oracle.bmc.opsi.model.ChangePeComanagedDatabaseInsightDetails
            changePeComanagedDatabaseInsightDetails;

    public com.oracle.bmc.opsi.model.ChangePeComanagedDatabaseInsightDetails
            getChangePeComanagedDatabaseInsightDetails() {
        return changePeComanagedDatabaseInsightDetails;
    }
    /**
     * Used for optimistic concurrency control. In the update or delete call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous get, create, or update response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact
     * Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request that can be retried in case of a timeout or
     * server error without risk of executing the same action again. Retry tokens expire after 24
     * hours.
     * <p>
     *Note:* Retry tokens can be invalidated before the 24 hour time limit due to conflicting
     * operations, such as a resource being deleted or purged from the system.
     *
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
    public com.oracle.bmc.opsi.model.ChangePeComanagedDatabaseInsightDetails getBody$() {
        return changePeComanagedDatabaseInsightDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangePeComanagedDatabaseInsightRequest,
                    com.oracle.bmc.opsi.model.ChangePeComanagedDatabaseInsightDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String databaseInsightId = null;

        /**
         * Unique database insight identifier
         * @return this builder instance
         */
        public Builder databaseInsightId(String databaseInsightId) {
            this.databaseInsightId = databaseInsightId;
            return this;
        }

        private com.oracle.bmc.opsi.model.ChangePeComanagedDatabaseInsightDetails
                changePeComanagedDatabaseInsightDetails = null;

        /**
         * The information to be updated.
         * @return this builder instance
         */
        public Builder changePeComanagedDatabaseInsightDetails(
                com.oracle.bmc.opsi.model.ChangePeComanagedDatabaseInsightDetails
                        changePeComanagedDatabaseInsightDetails) {
            this.changePeComanagedDatabaseInsightDetails = changePeComanagedDatabaseInsightDetails;
            return this;
        }

        private String ifMatch = null;

        /**
         * Used for optimistic concurrency control. In the update or delete call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous get, create, or update response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact
         * Oracle about a particular request, please provide the request ID.
         *
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request that can be retried in case of a timeout or
         * server error without risk of executing the same action again. Retry tokens expire after 24
         * hours.
         * <p>
         *Note:* Retry tokens can be invalidated before the 24 hour time limit due to conflicting
         * operations, such as a resource being deleted or purged from the system.
         *
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
        public Builder copy(ChangePeComanagedDatabaseInsightRequest o) {
            databaseInsightId(o.getDatabaseInsightId());
            changePeComanagedDatabaseInsightDetails(o.getChangePeComanagedDatabaseInsightDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangePeComanagedDatabaseInsightRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangePeComanagedDatabaseInsightRequest
         */
        public ChangePeComanagedDatabaseInsightRequest build() {
            ChangePeComanagedDatabaseInsightRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.opsi.model.ChangePeComanagedDatabaseInsightDetails body) {
            changePeComanagedDatabaseInsightDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangePeComanagedDatabaseInsightRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangePeComanagedDatabaseInsightRequest
         */
        public ChangePeComanagedDatabaseInsightRequest buildWithoutInvocationCallback() {
            ChangePeComanagedDatabaseInsightRequest request =
                    new ChangePeComanagedDatabaseInsightRequest();
            request.databaseInsightId = databaseInsightId;
            request.changePeComanagedDatabaseInsightDetails =
                    changePeComanagedDatabaseInsightDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangePeComanagedDatabaseInsightRequest(databaseInsightId, changePeComanagedDatabaseInsightDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .databaseInsightId(databaseInsightId)
                .changePeComanagedDatabaseInsightDetails(changePeComanagedDatabaseInsightDetails)
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
        sb.append(",databaseInsightId=").append(String.valueOf(this.databaseInsightId));
        sb.append(",changePeComanagedDatabaseInsightDetails=")
                .append(String.valueOf(this.changePeComanagedDatabaseInsightDetails));
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
        if (!(o instanceof ChangePeComanagedDatabaseInsightRequest)) {
            return false;
        }

        ChangePeComanagedDatabaseInsightRequest other = (ChangePeComanagedDatabaseInsightRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.databaseInsightId, other.databaseInsightId)
                && java.util.Objects.equals(
                        this.changePeComanagedDatabaseInsightDetails,
                        other.changePeComanagedDatabaseInsightDetails)
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
                        + (this.databaseInsightId == null ? 43 : this.databaseInsightId.hashCode());
        result =
                (result * PRIME)
                        + (this.changePeComanagedDatabaseInsightDetails == null
                                ? 43
                                : this.changePeComanagedDatabaseInsightDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
