/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.requests;

import com.oracle.bmc.databasetools.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetools/ChangeDatabaseToolsPrivateEndpointCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeDatabaseToolsPrivateEndpointCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
public class ChangeDatabaseToolsPrivateEndpointCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasetools.model
                        .ChangeDatabaseToolsPrivateEndpointCompartmentDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a Database Tools private endpoint.
     */
    private String databaseToolsPrivateEndpointId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a Database Tools private endpoint.
     */
    public String getDatabaseToolsPrivateEndpointId() {
        return databaseToolsPrivateEndpointId;
    }
    /**
     * Request to change the compartment of the DatabaseToolsPrivateEndpoint.
     */
    private com.oracle.bmc.databasetools.model.ChangeDatabaseToolsPrivateEndpointCompartmentDetails
            changeDatabaseToolsPrivateEndpointCompartmentDetails;

    /**
     * Request to change the compartment of the DatabaseToolsPrivateEndpoint.
     */
    public com.oracle.bmc.databasetools.model.ChangeDatabaseToolsPrivateEndpointCompartmentDetails
            getChangeDatabaseToolsPrivateEndpointCompartmentDetails() {
        return changeDatabaseToolsPrivateEndpointCompartmentDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Whether to override locks (if any exist).
     */
    private Boolean isLockOverride;

    /**
     * Whether to override locks (if any exist).
     */
    public Boolean getIsLockOverride() {
        return isLockOverride;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.databasetools.model.ChangeDatabaseToolsPrivateEndpointCompartmentDetails
            getBody$() {
        return changeDatabaseToolsPrivateEndpointCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeDatabaseToolsPrivateEndpointCompartmentRequest,
                    com.oracle.bmc.databasetools.model
                            .ChangeDatabaseToolsPrivateEndpointCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a Database Tools private endpoint.
         */
        private String databaseToolsPrivateEndpointId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of a Database Tools private endpoint.
         * @param databaseToolsPrivateEndpointId the value to set
         * @return this builder instance
         */
        public Builder databaseToolsPrivateEndpointId(String databaseToolsPrivateEndpointId) {
            this.databaseToolsPrivateEndpointId = databaseToolsPrivateEndpointId;
            return this;
        }

        /**
         * Request to change the compartment of the DatabaseToolsPrivateEndpoint.
         */
        private com.oracle.bmc.databasetools.model
                        .ChangeDatabaseToolsPrivateEndpointCompartmentDetails
                changeDatabaseToolsPrivateEndpointCompartmentDetails = null;

        /**
         * Request to change the compartment of the DatabaseToolsPrivateEndpoint.
         * @param changeDatabaseToolsPrivateEndpointCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeDatabaseToolsPrivateEndpointCompartmentDetails(
                com.oracle.bmc.databasetools.model
                                .ChangeDatabaseToolsPrivateEndpointCompartmentDetails
                        changeDatabaseToolsPrivateEndpointCompartmentDetails) {
            this.changeDatabaseToolsPrivateEndpointCompartmentDetails =
                    changeDatabaseToolsPrivateEndpointCompartmentDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Whether to override locks (if any exist).
         */
        private Boolean isLockOverride = null;

        /**
         * Whether to override locks (if any exist).
         * @param isLockOverride the value to set
         * @return this builder instance
         */
        public Builder isLockOverride(Boolean isLockOverride) {
            this.isLockOverride = isLockOverride;
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
        public Builder copy(ChangeDatabaseToolsPrivateEndpointCompartmentRequest o) {
            databaseToolsPrivateEndpointId(o.getDatabaseToolsPrivateEndpointId());
            changeDatabaseToolsPrivateEndpointCompartmentDetails(
                    o.getChangeDatabaseToolsPrivateEndpointCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            isLockOverride(o.getIsLockOverride());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeDatabaseToolsPrivateEndpointCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeDatabaseToolsPrivateEndpointCompartmentRequest
         */
        public ChangeDatabaseToolsPrivateEndpointCompartmentRequest build() {
            ChangeDatabaseToolsPrivateEndpointCompartmentRequest request =
                    buildWithoutInvocationCallback();
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
                com.oracle.bmc.databasetools.model
                                .ChangeDatabaseToolsPrivateEndpointCompartmentDetails
                        body) {
            changeDatabaseToolsPrivateEndpointCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeDatabaseToolsPrivateEndpointCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeDatabaseToolsPrivateEndpointCompartmentRequest
         */
        public ChangeDatabaseToolsPrivateEndpointCompartmentRequest
                buildWithoutInvocationCallback() {
            ChangeDatabaseToolsPrivateEndpointCompartmentRequest request =
                    new ChangeDatabaseToolsPrivateEndpointCompartmentRequest();
            request.databaseToolsPrivateEndpointId = databaseToolsPrivateEndpointId;
            request.changeDatabaseToolsPrivateEndpointCompartmentDetails =
                    changeDatabaseToolsPrivateEndpointCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.isLockOverride = isLockOverride;
            return request;
            // new ChangeDatabaseToolsPrivateEndpointCompartmentRequest(databaseToolsPrivateEndpointId, changeDatabaseToolsPrivateEndpointCompartmentDetails, ifMatch, opcRequestId, isLockOverride);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .databaseToolsPrivateEndpointId(databaseToolsPrivateEndpointId)
                .changeDatabaseToolsPrivateEndpointCompartmentDetails(
                        changeDatabaseToolsPrivateEndpointCompartmentDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .isLockOverride(isLockOverride);
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
        sb.append(",databaseToolsPrivateEndpointId=")
                .append(String.valueOf(this.databaseToolsPrivateEndpointId));
        sb.append(",changeDatabaseToolsPrivateEndpointCompartmentDetails=")
                .append(String.valueOf(this.changeDatabaseToolsPrivateEndpointCompartmentDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",isLockOverride=").append(String.valueOf(this.isLockOverride));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeDatabaseToolsPrivateEndpointCompartmentRequest)) {
            return false;
        }

        ChangeDatabaseToolsPrivateEndpointCompartmentRequest other =
                (ChangeDatabaseToolsPrivateEndpointCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.databaseToolsPrivateEndpointId, other.databaseToolsPrivateEndpointId)
                && java.util.Objects.equals(
                        this.changeDatabaseToolsPrivateEndpointCompartmentDetails,
                        other.changeDatabaseToolsPrivateEndpointCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.isLockOverride, other.isLockOverride);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.databaseToolsPrivateEndpointId == null
                                ? 43
                                : this.databaseToolsPrivateEndpointId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeDatabaseToolsPrivateEndpointCompartmentDetails == null
                                ? 43
                                : this.changeDatabaseToolsPrivateEndpointCompartmentDetails
                                        .hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.isLockOverride == null ? 43 : this.isLockOverride.hashCode());
        return result;
    }
}
