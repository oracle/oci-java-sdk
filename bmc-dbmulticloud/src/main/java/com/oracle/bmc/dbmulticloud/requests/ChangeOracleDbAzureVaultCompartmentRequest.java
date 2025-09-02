/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dbmulticloud.requests;

import com.oracle.bmc.dbmulticloud.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dbmulticloud/ChangeOracleDbAzureVaultCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeOracleDbAzureVaultCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240501")
public class ChangeOracleDbAzureVaultCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dbmulticloud.model.ChangeOracleDbAzureVaultCompartmentDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle DB Azure Vault resource.
     */
    private String oracleDbAzureVaultId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Oracle DB Azure Vault resource.
     */
    public String getOracleDbAzureVaultId() {
        return oracleDbAzureVaultId;
    }
    /** Moves the DB Azure Vault resource into a different compartment. */
    private com.oracle.bmc.dbmulticloud.model.ChangeOracleDbAzureVaultCompartmentDetails
            changeOracleDbAzureVaultCompartmentDetails;

    /** Moves the DB Azure Vault resource into a different compartment. */
    public com.oracle.bmc.dbmulticloud.model.ChangeOracleDbAzureVaultCompartmentDetails
            getChangeOracleDbAzureVaultCompartmentDetails() {
        return changeOracleDbAzureVaultCompartmentDetails;
    }
    /**
     * A token that uniquely identifies a request, allowing it to be safely retried in the event of
     * a timeout or server error without the risk of the action being executed more than once.
     *
     * <p>Retry tokens expire after 24 hours but can be invalidated sooner if conflicting operations
     * occur.
     *
     * <p>For example, if a resource has been deleted and permanently purged from the system, a
     * retry of the original creation request may be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request, allowing it to be safely retried in the event of
     * a timeout or server error without the risk of the action being executed more than once.
     *
     * <p>Retry tokens expire after 24 hours but can be invalidated sooner if conflicting operations
     * occur.
     *
     * <p>For example, if a resource has been deleted and permanently purged from the system, a
     * retry of the original creation request may be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
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
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dbmulticloud.model.ChangeOracleDbAzureVaultCompartmentDetails getBody$() {
        return changeOracleDbAzureVaultCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeOracleDbAzureVaultCompartmentRequest,
                    com.oracle.bmc.dbmulticloud.model.ChangeOracleDbAzureVaultCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle DB Azure Vault resource.
         */
        private String oracleDbAzureVaultId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Oracle DB Azure Vault resource.
         *
         * @param oracleDbAzureVaultId the value to set
         * @return this builder instance
         */
        public Builder oracleDbAzureVaultId(String oracleDbAzureVaultId) {
            this.oracleDbAzureVaultId = oracleDbAzureVaultId;
            return this;
        }

        /** Moves the DB Azure Vault resource into a different compartment. */
        private com.oracle.bmc.dbmulticloud.model.ChangeOracleDbAzureVaultCompartmentDetails
                changeOracleDbAzureVaultCompartmentDetails = null;

        /**
         * Moves the DB Azure Vault resource into a different compartment.
         *
         * @param changeOracleDbAzureVaultCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeOracleDbAzureVaultCompartmentDetails(
                com.oracle.bmc.dbmulticloud.model.ChangeOracleDbAzureVaultCompartmentDetails
                        changeOracleDbAzureVaultCompartmentDetails) {
            this.changeOracleDbAzureVaultCompartmentDetails =
                    changeOracleDbAzureVaultCompartmentDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request, allowing it to be safely retried in the event
         * of a timeout or server error without the risk of the action being executed more than
         * once.
         *
         * <p>Retry tokens expire after 24 hours but can be invalidated sooner if conflicting
         * operations occur.
         *
         * <p>For example, if a resource has been deleted and permanently purged from the system, a
         * retry of the original creation request may be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request, allowing it to be safely retried in the event
         * of a timeout or server error without the risk of the action being executed more than
         * once.
         *
         * <p>Retry tokens expire after 24 hours but can be invalidated sooner if conflicting
         * operations occur.
         *
         * <p>For example, if a resource has been deleted and permanently purged from the system, a
         * retry of the original creation request may be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(ChangeOracleDbAzureVaultCompartmentRequest o) {
            oracleDbAzureVaultId(o.getOracleDbAzureVaultId());
            changeOracleDbAzureVaultCompartmentDetails(
                    o.getChangeOracleDbAzureVaultCompartmentDetails());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeOracleDbAzureVaultCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeOracleDbAzureVaultCompartmentRequest
         */
        public ChangeOracleDbAzureVaultCompartmentRequest build() {
            ChangeOracleDbAzureVaultCompartmentRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.dbmulticloud.model.ChangeOracleDbAzureVaultCompartmentDetails body) {
            changeOracleDbAzureVaultCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeOracleDbAzureVaultCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeOracleDbAzureVaultCompartmentRequest
         */
        public ChangeOracleDbAzureVaultCompartmentRequest buildWithoutInvocationCallback() {
            ChangeOracleDbAzureVaultCompartmentRequest request =
                    new ChangeOracleDbAzureVaultCompartmentRequest();
            request.oracleDbAzureVaultId = oracleDbAzureVaultId;
            request.changeOracleDbAzureVaultCompartmentDetails =
                    changeOracleDbAzureVaultCompartmentDetails;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ChangeOracleDbAzureVaultCompartmentRequest(oracleDbAzureVaultId,
            // changeOracleDbAzureVaultCompartmentDetails, opcRetryToken, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .oracleDbAzureVaultId(oracleDbAzureVaultId)
                .changeOracleDbAzureVaultCompartmentDetails(
                        changeOracleDbAzureVaultCompartmentDetails)
                .opcRetryToken(opcRetryToken)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
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
        sb.append(",oracleDbAzureVaultId=").append(String.valueOf(this.oracleDbAzureVaultId));
        sb.append(",changeOracleDbAzureVaultCompartmentDetails=")
                .append(String.valueOf(this.changeOracleDbAzureVaultCompartmentDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ChangeOracleDbAzureVaultCompartmentRequest)) {
            return false;
        }

        ChangeOracleDbAzureVaultCompartmentRequest other =
                (ChangeOracleDbAzureVaultCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.oracleDbAzureVaultId, other.oracleDbAzureVaultId)
                && java.util.Objects.equals(
                        this.changeOracleDbAzureVaultCompartmentDetails,
                        other.changeOracleDbAzureVaultCompartmentDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.oracleDbAzureVaultId == null
                                ? 43
                                : this.oracleDbAzureVaultId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeOracleDbAzureVaultCompartmentDetails == null
                                ? 43
                                : this.changeOracleDbAzureVaultCompartmentDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
