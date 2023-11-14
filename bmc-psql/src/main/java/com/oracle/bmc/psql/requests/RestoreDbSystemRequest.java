/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.psql.requests;

import com.oracle.bmc.psql.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/psql/RestoreDbSystemExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use RestoreDbSystemRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220915")
public class RestoreDbSystemRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.psql.model.RestoreDbSystemDetails> {

    /** unique DbSystem identifier */
    private String dbSystemId;

    /** unique DbSystem identifier */
    public String getDbSystemId() {
        return dbSystemId;
    }
    /** DB System restore parameters. */
    private com.oracle.bmc.psql.model.RestoreDbSystemDetails restoreDbSystemDetails;

    /** DB System restore parameters. */
    public com.oracle.bmc.psql.model.RestoreDbSystemDetails getRestoreDbSystemDetails() {
        return restoreDbSystemDetails;
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
    public com.oracle.bmc.psql.model.RestoreDbSystemDetails getBody$() {
        return restoreDbSystemDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RestoreDbSystemRequest, com.oracle.bmc.psql.model.RestoreDbSystemDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** unique DbSystem identifier */
        private String dbSystemId = null;

        /**
         * unique DbSystem identifier
         *
         * @param dbSystemId the value to set
         * @return this builder instance
         */
        public Builder dbSystemId(String dbSystemId) {
            this.dbSystemId = dbSystemId;
            return this;
        }

        /** DB System restore parameters. */
        private com.oracle.bmc.psql.model.RestoreDbSystemDetails restoreDbSystemDetails = null;

        /**
         * DB System restore parameters.
         *
         * @param restoreDbSystemDetails the value to set
         * @return this builder instance
         */
        public Builder restoreDbSystemDetails(
                com.oracle.bmc.psql.model.RestoreDbSystemDetails restoreDbSystemDetails) {
            this.restoreDbSystemDetails = restoreDbSystemDetails;
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
        public Builder copy(RestoreDbSystemRequest o) {
            dbSystemId(o.getDbSystemId());
            restoreDbSystemDetails(o.getRestoreDbSystemDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RestoreDbSystemRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of RestoreDbSystemRequest
         */
        public RestoreDbSystemRequest build() {
            RestoreDbSystemRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.psql.model.RestoreDbSystemDetails body) {
            restoreDbSystemDetails(body);
            return this;
        }

        /**
         * Build the instance of RestoreDbSystemRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RestoreDbSystemRequest
         */
        public RestoreDbSystemRequest buildWithoutInvocationCallback() {
            RestoreDbSystemRequest request = new RestoreDbSystemRequest();
            request.dbSystemId = dbSystemId;
            request.restoreDbSystemDetails = restoreDbSystemDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new RestoreDbSystemRequest(dbSystemId, restoreDbSystemDetails, ifMatch, opcRequestId,
            // opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .dbSystemId(dbSystemId)
                .restoreDbSystemDetails(restoreDbSystemDetails)
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
        sb.append(",dbSystemId=").append(String.valueOf(this.dbSystemId));
        sb.append(",restoreDbSystemDetails=").append(String.valueOf(this.restoreDbSystemDetails));
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
        if (!(o instanceof RestoreDbSystemRequest)) {
            return false;
        }

        RestoreDbSystemRequest other = (RestoreDbSystemRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.dbSystemId, other.dbSystemId)
                && java.util.Objects.equals(
                        this.restoreDbSystemDetails, other.restoreDbSystemDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dbSystemId == null ? 43 : this.dbSystemId.hashCode());
        result =
                (result * PRIME)
                        + (this.restoreDbSystemDetails == null
                                ? 43
                                : this.restoreDbSystemDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
