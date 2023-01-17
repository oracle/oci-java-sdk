/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/UpdateAutonomousExadataInfrastructureExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * UpdateAutonomousExadataInfrastructureRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateAutonomousExadataInfrastructureRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.UpdateAutonomousExadataInfrastructureDetails> {

    /**
     * The Autonomous Exadata Infrastructure
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String autonomousExadataInfrastructureId;

    /**
     * The Autonomous Exadata Infrastructure
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getAutonomousExadataInfrastructureId() {
        return autonomousExadataInfrastructureId;
    }
    /** Request to update the properties of a Autonomous Exadata Infrastructure. */
    private com.oracle.bmc.database.model.UpdateAutonomousExadataInfrastructureDetails
            updateAutonomousExadataInfrastructuresDetails;

    /** Request to update the properties of a Autonomous Exadata Infrastructure. */
    public com.oracle.bmc.database.model.UpdateAutonomousExadataInfrastructureDetails
            getUpdateAutonomousExadataInfrastructuresDetails() {
        return updateAutonomousExadataInfrastructuresDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.database.model.UpdateAutonomousExadataInfrastructureDetails getBody$() {
        return updateAutonomousExadataInfrastructuresDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateAutonomousExadataInfrastructureRequest,
                    com.oracle.bmc.database.model.UpdateAutonomousExadataInfrastructureDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Autonomous Exadata Infrastructure
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String autonomousExadataInfrastructureId = null;

        /**
         * The Autonomous Exadata Infrastructure
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         *
         * @param autonomousExadataInfrastructureId the value to set
         * @return this builder instance
         */
        public Builder autonomousExadataInfrastructureId(String autonomousExadataInfrastructureId) {
            this.autonomousExadataInfrastructureId = autonomousExadataInfrastructureId;
            return this;
        }

        /** Request to update the properties of a Autonomous Exadata Infrastructure. */
        private com.oracle.bmc.database.model.UpdateAutonomousExadataInfrastructureDetails
                updateAutonomousExadataInfrastructuresDetails = null;

        /**
         * Request to update the properties of a Autonomous Exadata Infrastructure.
         *
         * @param updateAutonomousExadataInfrastructuresDetails the value to set
         * @return this builder instance
         */
        public Builder updateAutonomousExadataInfrastructuresDetails(
                com.oracle.bmc.database.model.UpdateAutonomousExadataInfrastructureDetails
                        updateAutonomousExadataInfrastructuresDetails) {
            this.updateAutonomousExadataInfrastructuresDetails =
                    updateAutonomousExadataInfrastructuresDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(UpdateAutonomousExadataInfrastructureRequest o) {
            autonomousExadataInfrastructureId(o.getAutonomousExadataInfrastructureId());
            updateAutonomousExadataInfrastructuresDetails(
                    o.getUpdateAutonomousExadataInfrastructuresDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateAutonomousExadataInfrastructureRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of UpdateAutonomousExadataInfrastructureRequest
         */
        public UpdateAutonomousExadataInfrastructureRequest build() {
            UpdateAutonomousExadataInfrastructureRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.database.model.UpdateAutonomousExadataInfrastructureDetails body) {
            updateAutonomousExadataInfrastructuresDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateAutonomousExadataInfrastructureRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateAutonomousExadataInfrastructureRequest
         */
        public UpdateAutonomousExadataInfrastructureRequest buildWithoutInvocationCallback() {
            UpdateAutonomousExadataInfrastructureRequest request =
                    new UpdateAutonomousExadataInfrastructureRequest();
            request.autonomousExadataInfrastructureId = autonomousExadataInfrastructureId;
            request.updateAutonomousExadataInfrastructuresDetails =
                    updateAutonomousExadataInfrastructuresDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateAutonomousExadataInfrastructureRequest(autonomousExadataInfrastructureId,
            // updateAutonomousExadataInfrastructuresDetails, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .autonomousExadataInfrastructureId(autonomousExadataInfrastructureId)
                .updateAutonomousExadataInfrastructuresDetails(
                        updateAutonomousExadataInfrastructuresDetails)
                .ifMatch(ifMatch);
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
        sb.append(",autonomousExadataInfrastructureId=")
                .append(String.valueOf(this.autonomousExadataInfrastructureId));
        sb.append(",updateAutonomousExadataInfrastructuresDetails=")
                .append(String.valueOf(this.updateAutonomousExadataInfrastructuresDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAutonomousExadataInfrastructureRequest)) {
            return false;
        }

        UpdateAutonomousExadataInfrastructureRequest other =
                (UpdateAutonomousExadataInfrastructureRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.autonomousExadataInfrastructureId,
                        other.autonomousExadataInfrastructureId)
                && java.util.Objects.equals(
                        this.updateAutonomousExadataInfrastructuresDetails,
                        other.updateAutonomousExadataInfrastructuresDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.autonomousExadataInfrastructureId == null
                                ? 43
                                : this.autonomousExadataInfrastructureId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateAutonomousExadataInfrastructuresDetails == null
                                ? 43
                                : this.updateAutonomousExadataInfrastructuresDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
