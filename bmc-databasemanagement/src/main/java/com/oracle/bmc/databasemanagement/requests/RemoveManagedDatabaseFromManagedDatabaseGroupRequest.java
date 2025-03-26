/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.requests;

import com.oracle.bmc.databasemanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasemanagement/RemoveManagedDatabaseFromManagedDatabaseGroupExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use RemoveManagedDatabaseFromManagedDatabaseGroupRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
public class RemoveManagedDatabaseFromManagedDatabaseGroupRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasemanagement.model
                        .RemoveManagedDatabaseFromManagedDatabaseGroupDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database Group.
     */
    private String managedDatabaseGroupId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database Group.
     */
    public String getManagedDatabaseGroupId() {
        return managedDatabaseGroupId;
    }
    /**
     * The Managed Database details required to remove the Managed Database from a Managed Database Group.
     */
    private com.oracle.bmc.databasemanagement.model
                    .RemoveManagedDatabaseFromManagedDatabaseGroupDetails
            removeManagedDatabaseFromManagedDatabaseGroupDetails;

    /**
     * The Managed Database details required to remove the Managed Database from a Managed Database Group.
     */
    public com.oracle.bmc.databasemanagement.model
                    .RemoveManagedDatabaseFromManagedDatabaseGroupDetails
            getRemoveManagedDatabaseFromManagedDatabaseGroupDetails() {
        return removeManagedDatabaseFromManagedDatabaseGroupDetails;
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
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
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
    public com.oracle.bmc.databasemanagement.model
                    .RemoveManagedDatabaseFromManagedDatabaseGroupDetails
            getBody$() {
        return removeManagedDatabaseFromManagedDatabaseGroupDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RemoveManagedDatabaseFromManagedDatabaseGroupRequest,
                    com.oracle.bmc.databasemanagement.model
                            .RemoveManagedDatabaseFromManagedDatabaseGroupDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database Group.
         */
        private String managedDatabaseGroupId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Managed Database Group.
         * @param managedDatabaseGroupId the value to set
         * @return this builder instance
         */
        public Builder managedDatabaseGroupId(String managedDatabaseGroupId) {
            this.managedDatabaseGroupId = managedDatabaseGroupId;
            return this;
        }

        /**
         * The Managed Database details required to remove the Managed Database from a Managed Database Group.
         */
        private com.oracle.bmc.databasemanagement.model
                        .RemoveManagedDatabaseFromManagedDatabaseGroupDetails
                removeManagedDatabaseFromManagedDatabaseGroupDetails = null;

        /**
         * The Managed Database details required to remove the Managed Database from a Managed Database Group.
         * @param removeManagedDatabaseFromManagedDatabaseGroupDetails the value to set
         * @return this builder instance
         */
        public Builder removeManagedDatabaseFromManagedDatabaseGroupDetails(
                com.oracle.bmc.databasemanagement.model
                                .RemoveManagedDatabaseFromManagedDatabaseGroupDetails
                        removeManagedDatabaseFromManagedDatabaseGroupDetails) {
            this.removeManagedDatabaseFromManagedDatabaseGroupDetails =
                    removeManagedDatabaseFromManagedDatabaseGroupDetails;
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
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
        public Builder copy(RemoveManagedDatabaseFromManagedDatabaseGroupRequest o) {
            managedDatabaseGroupId(o.getManagedDatabaseGroupId());
            removeManagedDatabaseFromManagedDatabaseGroupDetails(
                    o.getRemoveManagedDatabaseFromManagedDatabaseGroupDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RemoveManagedDatabaseFromManagedDatabaseGroupRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of RemoveManagedDatabaseFromManagedDatabaseGroupRequest
         */
        public RemoveManagedDatabaseFromManagedDatabaseGroupRequest build() {
            RemoveManagedDatabaseFromManagedDatabaseGroupRequest request =
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
                com.oracle.bmc.databasemanagement.model
                                .RemoveManagedDatabaseFromManagedDatabaseGroupDetails
                        body) {
            removeManagedDatabaseFromManagedDatabaseGroupDetails(body);
            return this;
        }

        /**
         * Build the instance of RemoveManagedDatabaseFromManagedDatabaseGroupRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RemoveManagedDatabaseFromManagedDatabaseGroupRequest
         */
        public RemoveManagedDatabaseFromManagedDatabaseGroupRequest
                buildWithoutInvocationCallback() {
            RemoveManagedDatabaseFromManagedDatabaseGroupRequest request =
                    new RemoveManagedDatabaseFromManagedDatabaseGroupRequest();
            request.managedDatabaseGroupId = managedDatabaseGroupId;
            request.removeManagedDatabaseFromManagedDatabaseGroupDetails =
                    removeManagedDatabaseFromManagedDatabaseGroupDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new RemoveManagedDatabaseFromManagedDatabaseGroupRequest(managedDatabaseGroupId, removeManagedDatabaseFromManagedDatabaseGroupDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managedDatabaseGroupId(managedDatabaseGroupId)
                .removeManagedDatabaseFromManagedDatabaseGroupDetails(
                        removeManagedDatabaseFromManagedDatabaseGroupDetails)
                .opcRequestId(opcRequestId)
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
        sb.append(",managedDatabaseGroupId=").append(String.valueOf(this.managedDatabaseGroupId));
        sb.append(",removeManagedDatabaseFromManagedDatabaseGroupDetails=")
                .append(String.valueOf(this.removeManagedDatabaseFromManagedDatabaseGroupDetails));
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
        if (!(o instanceof RemoveManagedDatabaseFromManagedDatabaseGroupRequest)) {
            return false;
        }

        RemoveManagedDatabaseFromManagedDatabaseGroupRequest other =
                (RemoveManagedDatabaseFromManagedDatabaseGroupRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.managedDatabaseGroupId, other.managedDatabaseGroupId)
                && java.util.Objects.equals(
                        this.removeManagedDatabaseFromManagedDatabaseGroupDetails,
                        other.removeManagedDatabaseFromManagedDatabaseGroupDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.managedDatabaseGroupId == null
                                ? 43
                                : this.managedDatabaseGroupId.hashCode());
        result =
                (result * PRIME)
                        + (this.removeManagedDatabaseFromManagedDatabaseGroupDetails == null
                                ? 43
                                : this.removeManagedDatabaseFromManagedDatabaseGroupDetails
                                        .hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
