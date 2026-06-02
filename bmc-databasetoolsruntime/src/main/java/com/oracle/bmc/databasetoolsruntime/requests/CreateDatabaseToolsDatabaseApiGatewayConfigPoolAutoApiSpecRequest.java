/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.requests;

import com.oracle.bmc.databasetoolsruntime.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
public class CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasetoolsruntime.model
                        .CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a Database Tools database API gateway config.
     */
    private String databaseToolsDatabaseApiGatewayConfigId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a Database Tools database API gateway config.
     */
    public String getDatabaseToolsDatabaseApiGatewayConfigId() {
        return databaseToolsDatabaseApiGatewayConfigId;
    }
    /**
     * The key of the pool config.
     */
    private String poolKey;

    /**
     * The key of the pool config.
     */
    public String getPoolKey() {
        return poolKey;
    }
    /**
     * Details for the new Database Tools database API gateway config auto API spec resource.
     */
    private com.oracle.bmc.databasetoolsruntime.model
                    .CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails
            createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails;

    /**
     * Details for the new Database Tools database API gateway config auto API spec resource.
     */
    public com.oracle.bmc.databasetoolsruntime.model
                    .CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails
            getCreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails() {
        return createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails;
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
     * <p>
     * Accepted characters: ASCII alphanumerics plus underscore (U+005F LOW LINE "_") and dash (U+002D HYPHEN-MINUS "-")
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     * <p>
     * Accepted characters: ASCII alphanumerics plus underscore (U+005F LOW LINE "_") and dash (U+002D HYPHEN-MINUS "-")
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
    public com.oracle.bmc.databasetoolsruntime.model
                    .CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails
            getBody$() {
        return createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest,
                    com.oracle.bmc.databasetoolsruntime.model
                            .CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a Database Tools database API gateway config.
         */
        private String databaseToolsDatabaseApiGatewayConfigId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a Database Tools database API gateway config.
         * @param databaseToolsDatabaseApiGatewayConfigId the value to set
         * @return this builder instance
         */
        public Builder databaseToolsDatabaseApiGatewayConfigId(
                String databaseToolsDatabaseApiGatewayConfigId) {
            this.databaseToolsDatabaseApiGatewayConfigId = databaseToolsDatabaseApiGatewayConfigId;
            return this;
        }

        /**
         * The key of the pool config.
         */
        private String poolKey = null;

        /**
         * The key of the pool config.
         * @param poolKey the value to set
         * @return this builder instance
         */
        public Builder poolKey(String poolKey) {
            this.poolKey = poolKey;
            return this;
        }

        /**
         * Details for the new Database Tools database API gateway config auto API spec resource.
         */
        private com.oracle.bmc.databasetoolsruntime.model
                        .CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails
                createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails = null;

        /**
         * Details for the new Database Tools database API gateway config auto API spec resource.
         * @param createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails the value to set
         * @return this builder instance
         */
        public Builder createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails(
                com.oracle.bmc.databasetoolsruntime.model
                                .CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails
                        createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails) {
            this.createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails =
                    createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails;
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
         * <p>
         * Accepted characters: ASCII alphanumerics plus underscore (U+005F LOW LINE "_") and dash (U+002D HYPHEN-MINUS "-")
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         * <p>
         * Accepted characters: ASCII alphanumerics plus underscore (U+005F LOW LINE "_") and dash (U+002D HYPHEN-MINUS "-")
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
        public Builder copy(CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest o) {
            databaseToolsDatabaseApiGatewayConfigId(o.getDatabaseToolsDatabaseApiGatewayConfigId());
            poolKey(o.getPoolKey());
            createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails(
                    o.getCreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest
         */
        public CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest build() {
            CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request =
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
                                .CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails
                        body) {
            createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest
         */
        public CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest
                buildWithoutInvocationCallback() {
            CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest request =
                    new CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest();
            request.databaseToolsDatabaseApiGatewayConfigId =
                    databaseToolsDatabaseApiGatewayConfigId;
            request.poolKey = poolKey;
            request.createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails =
                    createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest(databaseToolsDatabaseApiGatewayConfigId, poolKey, createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .databaseToolsDatabaseApiGatewayConfigId(databaseToolsDatabaseApiGatewayConfigId)
                .poolKey(poolKey)
                .createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails(
                        createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails)
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
        sb.append(",databaseToolsDatabaseApiGatewayConfigId=")
                .append(String.valueOf(this.databaseToolsDatabaseApiGatewayConfigId));
        sb.append(",poolKey=").append(String.valueOf(this.poolKey));
        sb.append(",createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails=")
                .append(
                        String.valueOf(
                                this.createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails));
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
        if (!(o instanceof CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest)) {
            return false;
        }

        CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest other =
                (CreateDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.databaseToolsDatabaseApiGatewayConfigId,
                        other.databaseToolsDatabaseApiGatewayConfigId)
                && java.util.Objects.equals(this.poolKey, other.poolKey)
                && java.util.Objects.equals(
                        this.createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails,
                        other.createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.databaseToolsDatabaseApiGatewayConfigId == null
                                ? 43
                                : this.databaseToolsDatabaseApiGatewayConfigId.hashCode());
        result = (result * PRIME) + (this.poolKey == null ? 43 : this.poolKey.hashCode());
        result =
                (result * PRIME)
                        + (this.createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails
                                        == null
                                ? 43
                                : this
                                        .createDatabaseToolsDatabaseApiGatewayConfigPoolAutoApiSpecDetails
                                        .hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
