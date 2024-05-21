/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.requests;

import com.oracle.bmc.keymanagement.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/keymanagement/ChangeVaultCompartmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ChangeVaultCompartmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
public class ChangeVaultCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.keymanagement.model.ChangeVaultCompartmentDetails> {

    /**
     * The OCID of the vault.
     */
    private String vaultId;

    /**
     * The OCID of the vault.
     */
    public String getVaultId() {
        return vaultId;
    }
    /**
     * ChangeVaultCompartmentDetails
     */
    private com.oracle.bmc.keymanagement.model.ChangeVaultCompartmentDetails
            changeVaultCompartmentDetails;

    /**
     * ChangeVaultCompartmentDetails
     */
    public com.oracle.bmc.keymanagement.model.ChangeVaultCompartmentDetails
            getChangeVaultCompartmentDetails() {
        return changeVaultCompartmentDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a
     * resource, set the {@code if-match} parameter to the value of the etag from a
     * previous GET or POST response for that resource. The resource will be
     * updated or deleted only if the etag you provide matches the resource's
     * current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a
     * resource, set the {@code if-match} parameter to the value of the etag from a
     * previous GET or POST response for that resource. The resource will be
     * updated or deleted only if the etag you provide matches the resource's
     * current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique identifier for the request. If provided, the returned request ID
     * will include this value. Otherwise, a random request ID will be
     * generated by the service.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request. If provided, the returned request ID
     * will include this value. Otherwise, a random request ID will be
     * generated by the service.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case
     * of a timeout or server error without risk of executing that same action
     * again. Retry tokens expire after 24 hours, but can be invalidated
     * before then due to conflicting operations (e.g., if a resource has been
     * deleted and purged from the system, then a retry of the original
     * creation request may be rejected).
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case
     * of a timeout or server error without risk of executing that same action
     * again. Retry tokens expire after 24 hours, but can be invalidated
     * before then due to conflicting operations (e.g., if a resource has been
     * deleted and purged from the system, then a retry of the original
     * creation request may be rejected).
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
    public com.oracle.bmc.keymanagement.model.ChangeVaultCompartmentDetails getBody$() {
        return changeVaultCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeVaultCompartmentRequest,
                    com.oracle.bmc.keymanagement.model.ChangeVaultCompartmentDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The OCID of the vault.
         */
        private String vaultId = null;

        /**
         * The OCID of the vault.
         * @param vaultId the value to set
         * @return this builder instance
         */
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            return this;
        }

        /**
         * ChangeVaultCompartmentDetails
         */
        private com.oracle.bmc.keymanagement.model.ChangeVaultCompartmentDetails
                changeVaultCompartmentDetails = null;

        /**
         * ChangeVaultCompartmentDetails
         * @param changeVaultCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeVaultCompartmentDetails(
                com.oracle.bmc.keymanagement.model.ChangeVaultCompartmentDetails
                        changeVaultCompartmentDetails) {
            this.changeVaultCompartmentDetails = changeVaultCompartmentDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a
         * resource, set the {@code if-match} parameter to the value of the etag from a
         * previous GET or POST response for that resource. The resource will be
         * updated or deleted only if the etag you provide matches the resource's
         * current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a
         * resource, set the {@code if-match} parameter to the value of the etag from a
         * previous GET or POST response for that resource. The resource will be
         * updated or deleted only if the etag you provide matches the resource's
         * current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique identifier for the request. If provided, the returned request ID
         * will include this value. Otherwise, a random request ID will be
         * generated by the service.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If provided, the returned request ID
         * will include this value. Otherwise, a random request ID will be
         * generated by the service.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case
         * of a timeout or server error without risk of executing that same action
         * again. Retry tokens expire after 24 hours, but can be invalidated
         * before then due to conflicting operations (e.g., if a resource has been
         * deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case
         * of a timeout or server error without risk of executing that same action
         * again. Retry tokens expire after 24 hours, but can be invalidated
         * before then due to conflicting operations (e.g., if a resource has been
         * deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
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
        public Builder copy(ChangeVaultCompartmentRequest o) {
            vaultId(o.getVaultId());
            changeVaultCompartmentDetails(o.getChangeVaultCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeVaultCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeVaultCompartmentRequest
         */
        public ChangeVaultCompartmentRequest build() {
            ChangeVaultCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.keymanagement.model.ChangeVaultCompartmentDetails body) {
            changeVaultCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeVaultCompartmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeVaultCompartmentRequest
         */
        public ChangeVaultCompartmentRequest buildWithoutInvocationCallback() {
            ChangeVaultCompartmentRequest request = new ChangeVaultCompartmentRequest();
            request.vaultId = vaultId;
            request.changeVaultCompartmentDetails = changeVaultCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeVaultCompartmentRequest(vaultId, changeVaultCompartmentDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .vaultId(vaultId)
                .changeVaultCompartmentDetails(changeVaultCompartmentDetails)
                .ifMatch(ifMatch)
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
        sb.append(",vaultId=").append(String.valueOf(this.vaultId));
        sb.append(",changeVaultCompartmentDetails=")
                .append(String.valueOf(this.changeVaultCompartmentDetails));
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
        if (!(o instanceof ChangeVaultCompartmentRequest)) {
            return false;
        }

        ChangeVaultCompartmentRequest other = (ChangeVaultCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(
                        this.changeVaultCompartmentDetails, other.changeVaultCompartmentDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeVaultCompartmentDetails == null
                                ? 43
                                : this.changeVaultCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
