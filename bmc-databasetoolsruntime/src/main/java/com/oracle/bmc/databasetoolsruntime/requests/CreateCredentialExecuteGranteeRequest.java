/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.requests;

import com.oracle.bmc.databasetoolsruntime.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/CreateCredentialExecuteGranteeExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateCredentialExecuteGranteeRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
public class CreateCredentialExecuteGranteeRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasetoolsruntime.model.CreateCredentialExecuteGranteeDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
     * Database Tools connection.
     */
    private String databaseToolsConnectionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
     * Database Tools connection.
     */
    public String getDatabaseToolsConnectionId() {
        return databaseToolsConnectionId;
    }
    /** The name of the credential */
    private String credentialKey;

    /** The name of the credential */
    public String getCredentialKey() {
        return credentialKey;
    }
    /** The payload to create an execute grantee. */
    private com.oracle.bmc.databasetoolsruntime.model.CreateCredentialExecuteGranteeDetails
            createCredentialExecuteGranteeDetails;

    /** The payload to create an execute grantee. */
    public com.oracle.bmc.databasetoolsruntime.model.CreateCredentialExecuteGranteeDetails
            getCreateCredentialExecuteGranteeDetails() {
        return createCredentialExecuteGranteeDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * If-Match is most often used with state-changing methods (e.g., POST, PUT, DELETE) to prevent
     * accidental overwrites when multiple user agentss might be acting in parallel on the same
     * resource (i.e., to prevent the "lost update" problem). In general, it can be used with any
     * method that involves the selection or modification of a representation to abort the request
     * if the selected representation's current entity tag is not a member within the If-Match field
     * value. When specified on an action-specific subresource, the ETag value of the resource on
     * which the action is requested should be provided.
     */
    private String ifMatch;

    /**
     * If-Match is most often used with state-changing methods (e.g., POST, PUT, DELETE) to prevent
     * accidental overwrites when multiple user agentss might be acting in parallel on the same
     * resource (i.e., to prevent the "lost update" problem). In general, it can be used with any
     * method that involves the selection or modification of a representation to abort the request
     * if the selected representation's current entity tag is not a member within the If-Match field
     * value. When specified on an action-specific subresource, the ETag value of the resource on
     * which the action is requested should be provided.
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
    public com.oracle.bmc.databasetoolsruntime.model.CreateCredentialExecuteGranteeDetails
            getBody$() {
        return createCredentialExecuteGranteeDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateCredentialExecuteGranteeRequest,
                    com.oracle.bmc.databasetoolsruntime.model
                            .CreateCredentialExecuteGranteeDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
         * Database Tools connection.
         */
        private String databaseToolsConnectionId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
         * Database Tools connection.
         *
         * @param databaseToolsConnectionId the value to set
         * @return this builder instance
         */
        public Builder databaseToolsConnectionId(String databaseToolsConnectionId) {
            this.databaseToolsConnectionId = databaseToolsConnectionId;
            return this;
        }

        /** The name of the credential */
        private String credentialKey = null;

        /**
         * The name of the credential
         *
         * @param credentialKey the value to set
         * @return this builder instance
         */
        public Builder credentialKey(String credentialKey) {
            this.credentialKey = credentialKey;
            return this;
        }

        /** The payload to create an execute grantee. */
        private com.oracle.bmc.databasetoolsruntime.model.CreateCredentialExecuteGranteeDetails
                createCredentialExecuteGranteeDetails = null;

        /**
         * The payload to create an execute grantee.
         *
         * @param createCredentialExecuteGranteeDetails the value to set
         * @return this builder instance
         */
        public Builder createCredentialExecuteGranteeDetails(
                com.oracle.bmc.databasetoolsruntime.model.CreateCredentialExecuteGranteeDetails
                        createCredentialExecuteGranteeDetails) {
            this.createCredentialExecuteGranteeDetails = createCredentialExecuteGranteeDetails;
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
         * If-Match is most often used with state-changing methods (e.g., POST, PUT, DELETE) to
         * prevent accidental overwrites when multiple user agentss might be acting in parallel on
         * the same resource (i.e., to prevent the "lost update" problem). In general, it can be
         * used with any method that involves the selection or modification of a representation to
         * abort the request if the selected representation's current entity tag is not a member
         * within the If-Match field value. When specified on an action-specific subresource, the
         * ETag value of the resource on which the action is requested should be provided.
         */
        private String ifMatch = null;

        /**
         * If-Match is most often used with state-changing methods (e.g., POST, PUT, DELETE) to
         * prevent accidental overwrites when multiple user agentss might be acting in parallel on
         * the same resource (i.e., to prevent the "lost update" problem). In general, it can be
         * used with any method that involves the selection or modification of a representation to
         * abort the request if the selected representation's current entity tag is not a member
         * within the If-Match field value. When specified on an action-specific subresource, the
         * ETag value of the resource on which the action is requested should be provided.
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
        public Builder copy(CreateCredentialExecuteGranteeRequest o) {
            databaseToolsConnectionId(o.getDatabaseToolsConnectionId());
            credentialKey(o.getCredentialKey());
            createCredentialExecuteGranteeDetails(o.getCreateCredentialExecuteGranteeDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateCredentialExecuteGranteeRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateCredentialExecuteGranteeRequest
         */
        public CreateCredentialExecuteGranteeRequest build() {
            CreateCredentialExecuteGranteeRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.databasetoolsruntime.model.CreateCredentialExecuteGranteeDetails
                        body) {
            createCredentialExecuteGranteeDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateCredentialExecuteGranteeRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateCredentialExecuteGranteeRequest
         */
        public CreateCredentialExecuteGranteeRequest buildWithoutInvocationCallback() {
            CreateCredentialExecuteGranteeRequest request =
                    new CreateCredentialExecuteGranteeRequest();
            request.databaseToolsConnectionId = databaseToolsConnectionId;
            request.credentialKey = credentialKey;
            request.createCredentialExecuteGranteeDetails = createCredentialExecuteGranteeDetails;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new CreateCredentialExecuteGranteeRequest(databaseToolsConnectionId, credentialKey,
            // createCredentialExecuteGranteeDetails, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .databaseToolsConnectionId(databaseToolsConnectionId)
                .credentialKey(credentialKey)
                .createCredentialExecuteGranteeDetails(createCredentialExecuteGranteeDetails)
                .opcRequestId(opcRequestId)
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
        sb.append(",databaseToolsConnectionId=")
                .append(String.valueOf(this.databaseToolsConnectionId));
        sb.append(",credentialKey=").append(String.valueOf(this.credentialKey));
        sb.append(",createCredentialExecuteGranteeDetails=")
                .append(String.valueOf(this.createCredentialExecuteGranteeDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCredentialExecuteGranteeRequest)) {
            return false;
        }

        CreateCredentialExecuteGranteeRequest other = (CreateCredentialExecuteGranteeRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.databaseToolsConnectionId, other.databaseToolsConnectionId)
                && java.util.Objects.equals(this.credentialKey, other.credentialKey)
                && java.util.Objects.equals(
                        this.createCredentialExecuteGranteeDetails,
                        other.createCredentialExecuteGranteeDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.databaseToolsConnectionId == null
                                ? 43
                                : this.databaseToolsConnectionId.hashCode());
        result =
                (result * PRIME)
                        + (this.credentialKey == null ? 43 : this.credentialKey.hashCode());
        result =
                (result * PRIME)
                        + (this.createCredentialExecuteGranteeDetails == null
                                ? 43
                                : this.createCredentialExecuteGranteeDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
