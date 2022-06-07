/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateAutonomousContainerDatabaseExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateAutonomousContainerDatabaseRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateAutonomousContainerDatabaseRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.UpdateAutonomousContainerDatabaseDetails> {

    /**
     * The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String autonomousContainerDatabaseId;

    public String getAutonomousContainerDatabaseId() {
        return autonomousContainerDatabaseId;
    }
    /**
     * Request to update the properties of an Autonomous Container Database.
     */
    private com.oracle.bmc.database.model.UpdateAutonomousContainerDatabaseDetails
            updateAutonomousContainerDatabaseDetails;

    public com.oracle.bmc.database.model.UpdateAutonomousContainerDatabaseDetails
            getUpdateAutonomousContainerDatabaseDetails() {
        return updateAutonomousContainerDatabaseDetails;
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
    public com.oracle.bmc.database.model.UpdateAutonomousContainerDatabaseDetails getBody$() {
        return updateAutonomousContainerDatabaseDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateAutonomousContainerDatabaseRequest,
                    com.oracle.bmc.database.model.UpdateAutonomousContainerDatabaseDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String autonomousContainerDatabaseId = null;

        /**
         * The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @return this builder instance
         */
        public Builder autonomousContainerDatabaseId(String autonomousContainerDatabaseId) {
            this.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
            return this;
        }

        private com.oracle.bmc.database.model.UpdateAutonomousContainerDatabaseDetails
                updateAutonomousContainerDatabaseDetails = null;

        /**
         * Request to update the properties of an Autonomous Container Database.
         * @return this builder instance
         */
        public Builder updateAutonomousContainerDatabaseDetails(
                com.oracle.bmc.database.model.UpdateAutonomousContainerDatabaseDetails
                        updateAutonomousContainerDatabaseDetails) {
            this.updateAutonomousContainerDatabaseDetails =
                    updateAutonomousContainerDatabaseDetails;
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
        public Builder copy(UpdateAutonomousContainerDatabaseRequest o) {
            autonomousContainerDatabaseId(o.getAutonomousContainerDatabaseId());
            updateAutonomousContainerDatabaseDetails(
                    o.getUpdateAutonomousContainerDatabaseDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateAutonomousContainerDatabaseRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateAutonomousContainerDatabaseRequest
         */
        public UpdateAutonomousContainerDatabaseRequest build() {
            UpdateAutonomousContainerDatabaseRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.database.model.UpdateAutonomousContainerDatabaseDetails body) {
            updateAutonomousContainerDatabaseDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateAutonomousContainerDatabaseRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateAutonomousContainerDatabaseRequest
         */
        public UpdateAutonomousContainerDatabaseRequest buildWithoutInvocationCallback() {
            UpdateAutonomousContainerDatabaseRequest request =
                    new UpdateAutonomousContainerDatabaseRequest();
            request.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
            request.updateAutonomousContainerDatabaseDetails =
                    updateAutonomousContainerDatabaseDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateAutonomousContainerDatabaseRequest(autonomousContainerDatabaseId, updateAutonomousContainerDatabaseDetails, ifMatch);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .autonomousContainerDatabaseId(autonomousContainerDatabaseId)
                .updateAutonomousContainerDatabaseDetails(updateAutonomousContainerDatabaseDetails)
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
        sb.append(",autonomousContainerDatabaseId=")
                .append(String.valueOf(this.autonomousContainerDatabaseId));
        sb.append(",updateAutonomousContainerDatabaseDetails=")
                .append(String.valueOf(this.updateAutonomousContainerDatabaseDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAutonomousContainerDatabaseRequest)) {
            return false;
        }

        UpdateAutonomousContainerDatabaseRequest other =
                (UpdateAutonomousContainerDatabaseRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.autonomousContainerDatabaseId, other.autonomousContainerDatabaseId)
                && java.util.Objects.equals(
                        this.updateAutonomousContainerDatabaseDetails,
                        other.updateAutonomousContainerDatabaseDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.autonomousContainerDatabaseId == null
                                ? 43
                                : this.autonomousContainerDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateAutonomousContainerDatabaseDetails == null
                                ? 43
                                : this.updateAutonomousContainerDatabaseDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
