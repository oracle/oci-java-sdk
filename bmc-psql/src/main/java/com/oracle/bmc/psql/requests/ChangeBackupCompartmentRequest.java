/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.requests;

import com.oracle.bmc.psql.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/psql/ChangeBackupCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeBackupCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
public class ChangeBackupCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.psql.model.ChangeBackupCompartmentDetails> {

    /** unique Backup identifier */
    private String backupId;

    /** unique Backup identifier */
    public String getBackupId() {
        return backupId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.psql.model.ChangeBackupCompartmentDetails changeBackupCompartmentDetails;

    /** The information to be updated. */
    public com.oracle.bmc.psql.model.ChangeBackupCompartmentDetails
            getChangeBackupCompartmentDetails() {
        return changeBackupCompartmentDetails;
    }
    /** For optimistic concurrency control. In the PUT or DELETE call */
    private String ifMatch;

    /** For optimistic concurrency control. In the PUT or DELETE call */
    public String getIfMatch() {
        return ifMatch;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /** A token that uniquely identifies a request so it can be retried in case of a timeout or */
    private String opcRetryToken;

    /** A token that uniquely identifies a request so it can be retried in case of a timeout or */
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
    public com.oracle.bmc.psql.model.ChangeBackupCompartmentDetails getBody$() {
        return changeBackupCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeBackupCompartmentRequest,
                    com.oracle.bmc.psql.model.ChangeBackupCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** unique Backup identifier */
        private String backupId = null;

        /**
         * unique Backup identifier
         *
         * @param backupId the value to set
         * @return this builder instance
         */
        public Builder backupId(String backupId) {
            this.backupId = backupId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.psql.model.ChangeBackupCompartmentDetails
                changeBackupCompartmentDetails = null;

        /**
         * The information to be updated.
         *
         * @param changeBackupCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeBackupCompartmentDetails(
                com.oracle.bmc.psql.model.ChangeBackupCompartmentDetails
                        changeBackupCompartmentDetails) {
            this.changeBackupCompartmentDetails = changeBackupCompartmentDetails;
            return this;
        }

        /** For optimistic concurrency control. In the PUT or DELETE call */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
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
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
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
        public Builder copy(ChangeBackupCompartmentRequest o) {
            backupId(o.getBackupId());
            changeBackupCompartmentDetails(o.getChangeBackupCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeBackupCompartmentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeBackupCompartmentRequest
         */
        public ChangeBackupCompartmentRequest build() {
            ChangeBackupCompartmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.psql.model.ChangeBackupCompartmentDetails body) {
            changeBackupCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeBackupCompartmentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeBackupCompartmentRequest
         */
        public ChangeBackupCompartmentRequest buildWithoutInvocationCallback() {
            ChangeBackupCompartmentRequest request = new ChangeBackupCompartmentRequest();
            request.backupId = backupId;
            request.changeBackupCompartmentDetails = changeBackupCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeBackupCompartmentRequest(backupId, changeBackupCompartmentDetails, ifMatch,
            // opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .backupId(backupId)
                .changeBackupCompartmentDetails(changeBackupCompartmentDetails)
                .ifMatch(ifMatch)
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
        sb.append(",backupId=").append(String.valueOf(this.backupId));
        sb.append(",changeBackupCompartmentDetails=")
                .append(String.valueOf(this.changeBackupCompartmentDetails));
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
        if (!(o instanceof ChangeBackupCompartmentRequest)) {
            return false;
        }

        ChangeBackupCompartmentRequest other = (ChangeBackupCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.backupId, other.backupId)
                && java.util.Objects.equals(
                        this.changeBackupCompartmentDetails, other.changeBackupCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.backupId == null ? 43 : this.backupId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeBackupCompartmentDetails == null
                                ? 43
                                : this.changeBackupCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
