/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.requests;

import com.oracle.bmc.databasetoolsruntime.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/ValidateDatabaseToolsIdentityCredentialExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ValidateDatabaseToolsIdentityCredentialRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
public class ValidateDatabaseToolsIdentityCredentialRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasetoolsruntime.model
                        .ValidateDatabaseToolsIdentityCredentialDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a Database Tools identity.
     */
    private String databaseToolsIdentityId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a Database Tools identity.
     */
    public String getDatabaseToolsIdentityId() {
        return databaseToolsIdentityId;
    }
    /**
     * Request to validate a Database Tools identity Credential.
     */
    private com.oracle.bmc.databasetoolsruntime.model.ValidateDatabaseToolsIdentityCredentialDetails
            validateDatabaseToolsIdentityCredentialDetails;

    /**
     * Request to validate a Database Tools identity Credential.
     */
    public com.oracle.bmc.databasetoolsruntime.model.ValidateDatabaseToolsIdentityCredentialDetails
            getValidateDatabaseToolsIdentityCredentialDetails() {
        return validateDatabaseToolsIdentityCredentialDetails;
    }
    /**
     * If-Match is most often used with state-changing methods (e.g., POST, PUT, DELETE) to prevent
     * accidental overwrites when multiple user agentss might be acting in parallel on the same
     * resource (i.e., to prevent the "lost update" problem). In general, it can be used with any
     * method that involves the selection or modification of a representation to abort the request
     * if the selected representation's current entity tag is not a member within the If-Match field value.
     * When specified on an action-specific subresource, the ETag value of the resource on which the
     * action is requested should be provided.
     *
     */
    private String ifMatch;

    /**
     * If-Match is most often used with state-changing methods (e.g., POST, PUT, DELETE) to prevent
     * accidental overwrites when multiple user agentss might be acting in parallel on the same
     * resource (i.e., to prevent the "lost update" problem). In general, it can be used with any
     * method that involves the selection or modification of a representation to abort the request
     * if the selected representation's current entity tag is not a member within the If-Match field value.
     * When specified on an action-specific subresource, the ETag value of the resource on which the
     * action is requested should be provided.
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
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.databasetoolsruntime.model.ValidateDatabaseToolsIdentityCredentialDetails
            getBody$() {
        return validateDatabaseToolsIdentityCredentialDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ValidateDatabaseToolsIdentityCredentialRequest,
                    com.oracle.bmc.databasetoolsruntime.model
                            .ValidateDatabaseToolsIdentityCredentialDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a Database Tools identity.
         */
        private String databaseToolsIdentityId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a Database Tools identity.
         * @param databaseToolsIdentityId the value to set
         * @return this builder instance
         */
        public Builder databaseToolsIdentityId(String databaseToolsIdentityId) {
            this.databaseToolsIdentityId = databaseToolsIdentityId;
            return this;
        }

        /**
         * Request to validate a Database Tools identity Credential.
         */
        private com.oracle.bmc.databasetoolsruntime.model
                        .ValidateDatabaseToolsIdentityCredentialDetails
                validateDatabaseToolsIdentityCredentialDetails = null;

        /**
         * Request to validate a Database Tools identity Credential.
         * @param validateDatabaseToolsIdentityCredentialDetails the value to set
         * @return this builder instance
         */
        public Builder validateDatabaseToolsIdentityCredentialDetails(
                com.oracle.bmc.databasetoolsruntime.model
                                .ValidateDatabaseToolsIdentityCredentialDetails
                        validateDatabaseToolsIdentityCredentialDetails) {
            this.validateDatabaseToolsIdentityCredentialDetails =
                    validateDatabaseToolsIdentityCredentialDetails;
            return this;
        }

        /**
         * If-Match is most often used with state-changing methods (e.g., POST, PUT, DELETE) to prevent
         * accidental overwrites when multiple user agentss might be acting in parallel on the same
         * resource (i.e., to prevent the "lost update" problem). In general, it can be used with any
         * method that involves the selection or modification of a representation to abort the request
         * if the selected representation's current entity tag is not a member within the If-Match field value.
         * When specified on an action-specific subresource, the ETag value of the resource on which the
         * action is requested should be provided.
         *
         */
        private String ifMatch = null;

        /**
         * If-Match is most often used with state-changing methods (e.g., POST, PUT, DELETE) to prevent
         * accidental overwrites when multiple user agentss might be acting in parallel on the same
         * resource (i.e., to prevent the "lost update" problem). In general, it can be used with any
         * method that involves the selection or modification of a representation to abort the request
         * if the selected representation's current entity tag is not a member within the If-Match field value.
         * When specified on an action-specific subresource, the ETag value of the resource on which the
         * action is requested should be provided.
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
        public Builder copy(ValidateDatabaseToolsIdentityCredentialRequest o) {
            databaseToolsIdentityId(o.getDatabaseToolsIdentityId());
            validateDatabaseToolsIdentityCredentialDetails(
                    o.getValidateDatabaseToolsIdentityCredentialDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ValidateDatabaseToolsIdentityCredentialRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ValidateDatabaseToolsIdentityCredentialRequest
         */
        public ValidateDatabaseToolsIdentityCredentialRequest build() {
            ValidateDatabaseToolsIdentityCredentialRequest request =
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
                com.oracle.bmc.databasetoolsruntime.model
                                .ValidateDatabaseToolsIdentityCredentialDetails
                        body) {
            validateDatabaseToolsIdentityCredentialDetails(body);
            return this;
        }

        /**
         * Build the instance of ValidateDatabaseToolsIdentityCredentialRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ValidateDatabaseToolsIdentityCredentialRequest
         */
        public ValidateDatabaseToolsIdentityCredentialRequest buildWithoutInvocationCallback() {
            ValidateDatabaseToolsIdentityCredentialRequest request =
                    new ValidateDatabaseToolsIdentityCredentialRequest();
            request.databaseToolsIdentityId = databaseToolsIdentityId;
            request.validateDatabaseToolsIdentityCredentialDetails =
                    validateDatabaseToolsIdentityCredentialDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new ValidateDatabaseToolsIdentityCredentialRequest(databaseToolsIdentityId, validateDatabaseToolsIdentityCredentialDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .databaseToolsIdentityId(databaseToolsIdentityId)
                .validateDatabaseToolsIdentityCredentialDetails(
                        validateDatabaseToolsIdentityCredentialDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
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
        sb.append(",databaseToolsIdentityId=").append(String.valueOf(this.databaseToolsIdentityId));
        sb.append(",validateDatabaseToolsIdentityCredentialDetails=")
                .append(String.valueOf(this.validateDatabaseToolsIdentityCredentialDetails));
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
        if (!(o instanceof ValidateDatabaseToolsIdentityCredentialRequest)) {
            return false;
        }

        ValidateDatabaseToolsIdentityCredentialRequest other =
                (ValidateDatabaseToolsIdentityCredentialRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.databaseToolsIdentityId, other.databaseToolsIdentityId)
                && java.util.Objects.equals(
                        this.validateDatabaseToolsIdentityCredentialDetails,
                        other.validateDatabaseToolsIdentityCredentialDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.databaseToolsIdentityId == null
                                ? 43
                                : this.databaseToolsIdentityId.hashCode());
        result =
                (result * PRIME)
                        + (this.validateDatabaseToolsIdentityCredentialDetails == null
                                ? 43
                                : this.validateDatabaseToolsIdentityCredentialDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
