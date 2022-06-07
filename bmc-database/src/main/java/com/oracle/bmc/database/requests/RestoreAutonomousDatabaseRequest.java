/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RestoreAutonomousDatabaseExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use RestoreAutonomousDatabaseRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class RestoreAutonomousDatabaseRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.RestoreAutonomousDatabaseDetails> {

    /**
     * The database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String autonomousDatabaseId;

    public String getAutonomousDatabaseId() {
        return autonomousDatabaseId;
    }
    /**
     * Request to perform an Autonomous Database restore.
     */
    private com.oracle.bmc.database.model.RestoreAutonomousDatabaseDetails
            restoreAutonomousDatabaseDetails;

    public com.oracle.bmc.database.model.RestoreAutonomousDatabaseDetails
            getRestoreAutonomousDatabaseDetails() {
        return restoreAutonomousDatabaseDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.database.model.RestoreAutonomousDatabaseDetails getBody$() {
        return restoreAutonomousDatabaseDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RestoreAutonomousDatabaseRequest,
                    com.oracle.bmc.database.model.RestoreAutonomousDatabaseDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String autonomousDatabaseId = null;

        /**
         * The database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @return this builder instance
         */
        public Builder autonomousDatabaseId(String autonomousDatabaseId) {
            this.autonomousDatabaseId = autonomousDatabaseId;
            return this;
        }

        private com.oracle.bmc.database.model.RestoreAutonomousDatabaseDetails
                restoreAutonomousDatabaseDetails = null;

        /**
         * Request to perform an Autonomous Database restore.
         * @return this builder instance
         */
        public Builder restoreAutonomousDatabaseDetails(
                com.oracle.bmc.database.model.RestoreAutonomousDatabaseDetails
                        restoreAutonomousDatabaseDetails) {
            this.restoreAutonomousDatabaseDetails = restoreAutonomousDatabaseDetails;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(RestoreAutonomousDatabaseRequest o) {
            autonomousDatabaseId(o.getAutonomousDatabaseId());
            restoreAutonomousDatabaseDetails(o.getRestoreAutonomousDatabaseDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RestoreAutonomousDatabaseRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of RestoreAutonomousDatabaseRequest
         */
        public RestoreAutonomousDatabaseRequest build() {
            RestoreAutonomousDatabaseRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.database.model.RestoreAutonomousDatabaseDetails body) {
            restoreAutonomousDatabaseDetails(body);
            return this;
        }

        /**
         * Build the instance of RestoreAutonomousDatabaseRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RestoreAutonomousDatabaseRequest
         */
        public RestoreAutonomousDatabaseRequest buildWithoutInvocationCallback() {
            RestoreAutonomousDatabaseRequest request = new RestoreAutonomousDatabaseRequest();
            request.autonomousDatabaseId = autonomousDatabaseId;
            request.restoreAutonomousDatabaseDetails = restoreAutonomousDatabaseDetails;
            request.ifMatch = ifMatch;
            return request;
            // new RestoreAutonomousDatabaseRequest(autonomousDatabaseId, restoreAutonomousDatabaseDetails, ifMatch);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .autonomousDatabaseId(autonomousDatabaseId)
                .restoreAutonomousDatabaseDetails(restoreAutonomousDatabaseDetails)
                .ifMatch(ifMatch);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",autonomousDatabaseId=").append(String.valueOf(this.autonomousDatabaseId));
        sb.append(",restoreAutonomousDatabaseDetails=")
                .append(String.valueOf(this.restoreAutonomousDatabaseDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RestoreAutonomousDatabaseRequest)) {
            return false;
        }

        RestoreAutonomousDatabaseRequest other = (RestoreAutonomousDatabaseRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.autonomousDatabaseId, other.autonomousDatabaseId)
                && java.util.Objects.equals(
                        this.restoreAutonomousDatabaseDetails,
                        other.restoreAutonomousDatabaseDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
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
                        + (this.restoreAutonomousDatabaseDetails == null
                                ? 43
                                : this.restoreAutonomousDatabaseDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
