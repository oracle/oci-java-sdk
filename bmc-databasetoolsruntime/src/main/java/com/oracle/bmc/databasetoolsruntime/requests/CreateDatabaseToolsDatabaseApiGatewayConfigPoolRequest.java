/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.requests;

import com.oracle.bmc.databasetoolsruntime.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/databasetoolsruntime/CreateDatabaseToolsDatabaseApiGatewayConfigPoolExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
public class CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.databasetoolsruntime.model
                        .CreateDatabaseToolsDatabaseApiGatewayConfigPoolDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
     * Database Tools database API gateway config.
     */
    private String databaseToolsDatabaseApiGatewayConfigId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
     * Database Tools database API gateway config.
     */
    public String getDatabaseToolsDatabaseApiGatewayConfigId() {
        return databaseToolsDatabaseApiGatewayConfigId;
    }
    /** Details for the new Database Tools database API gateway config pool resource. */
    private com.oracle.bmc.databasetoolsruntime.model
                    .CreateDatabaseToolsDatabaseApiGatewayConfigPoolDetails
            createDatabaseToolsDatabaseApiGatewayConfigPoolDetails;

    /** Details for the new Database Tools database API gateway config pool resource. */
    public com.oracle.bmc.databasetoolsruntime.model
                    .CreateDatabaseToolsDatabaseApiGatewayConfigPoolDetails
            getCreateDatabaseToolsDatabaseApiGatewayConfigPoolDetails() {
        return createDatabaseToolsDatabaseApiGatewayConfigPoolDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     *
     * <p>Accepted characters: ASCII alphanumerics plus underscore (U+005F LOW LINE "_") and dash
     * (U+002D HYPHEN-MINUS "-")
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     *
     * <p>Accepted characters: ASCII alphanumerics plus underscore (U+005F LOW LINE "_") and dash
     * (U+002D HYPHEN-MINUS "-")
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.databasetoolsruntime.model
                    .CreateDatabaseToolsDatabaseApiGatewayConfigPoolDetails
            getBody$() {
        return createDatabaseToolsDatabaseApiGatewayConfigPoolDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest,
                    com.oracle.bmc.databasetoolsruntime.model
                            .CreateDatabaseToolsDatabaseApiGatewayConfigPoolDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
         * Database Tools database API gateway config.
         */
        private String databaseToolsDatabaseApiGatewayConfigId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of a
         * Database Tools database API gateway config.
         *
         * @param databaseToolsDatabaseApiGatewayConfigId the value to set
         * @return this builder instance
         */
        public Builder databaseToolsDatabaseApiGatewayConfigId(
                String databaseToolsDatabaseApiGatewayConfigId) {
            this.databaseToolsDatabaseApiGatewayConfigId = databaseToolsDatabaseApiGatewayConfigId;
            return this;
        }

        /** Details for the new Database Tools database API gateway config pool resource. */
        private com.oracle.bmc.databasetoolsruntime.model
                        .CreateDatabaseToolsDatabaseApiGatewayConfigPoolDetails
                createDatabaseToolsDatabaseApiGatewayConfigPoolDetails = null;

        /**
         * Details for the new Database Tools database API gateway config pool resource.
         *
         * @param createDatabaseToolsDatabaseApiGatewayConfigPoolDetails the value to set
         * @return this builder instance
         */
        public Builder createDatabaseToolsDatabaseApiGatewayConfigPoolDetails(
                com.oracle.bmc.databasetoolsruntime.model
                                .CreateDatabaseToolsDatabaseApiGatewayConfigPoolDetails
                        createDatabaseToolsDatabaseApiGatewayConfigPoolDetails) {
            this.createDatabaseToolsDatabaseApiGatewayConfigPoolDetails =
                    createDatabaseToolsDatabaseApiGatewayConfigPoolDetails;
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
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * <p>Accepted characters: ASCII alphanumerics plus underscore (U+005F LOW LINE "_") and
         * dash (U+002D HYPHEN-MINUS "-")
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         *
         * <p>Accepted characters: ASCII alphanumerics plus underscore (U+005F LOW LINE "_") and
         * dash (U+002D HYPHEN-MINUS "-")
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
        public Builder copy(CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest o) {
            databaseToolsDatabaseApiGatewayConfigId(o.getDatabaseToolsDatabaseApiGatewayConfigId());
            createDatabaseToolsDatabaseApiGatewayConfigPoolDetails(
                    o.getCreateDatabaseToolsDatabaseApiGatewayConfigPoolDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest as
         * configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest
         */
        public CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest build() {
            CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest request =
                    buildWithoutInvocationCallback();
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
                com.oracle.bmc.databasetoolsruntime.model
                                .CreateDatabaseToolsDatabaseApiGatewayConfigPoolDetails
                        body) {
            createDatabaseToolsDatabaseApiGatewayConfigPoolDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest as
         * configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest
         */
        public CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest
                buildWithoutInvocationCallback() {
            CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest request =
                    new CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest();
            request.databaseToolsDatabaseApiGatewayConfigId =
                    databaseToolsDatabaseApiGatewayConfigId;
            request.createDatabaseToolsDatabaseApiGatewayConfigPoolDetails =
                    createDatabaseToolsDatabaseApiGatewayConfigPoolDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new
            // CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest(databaseToolsDatabaseApiGatewayConfigId, createDatabaseToolsDatabaseApiGatewayConfigPoolDetails, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .databaseToolsDatabaseApiGatewayConfigId(databaseToolsDatabaseApiGatewayConfigId)
                .createDatabaseToolsDatabaseApiGatewayConfigPoolDetails(
                        createDatabaseToolsDatabaseApiGatewayConfigPoolDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken);
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
        sb.append(",databaseToolsDatabaseApiGatewayConfigId=")
                .append(String.valueOf(this.databaseToolsDatabaseApiGatewayConfigId));
        sb.append(",createDatabaseToolsDatabaseApiGatewayConfigPoolDetails=")
                .append(
                        String.valueOf(
                                this.createDatabaseToolsDatabaseApiGatewayConfigPoolDetails));
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
        if (!(o instanceof CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest)) {
            return false;
        }

        CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest other =
                (CreateDatabaseToolsDatabaseApiGatewayConfigPoolRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.databaseToolsDatabaseApiGatewayConfigId,
                        other.databaseToolsDatabaseApiGatewayConfigId)
                && java.util.Objects.equals(
                        this.createDatabaseToolsDatabaseApiGatewayConfigPoolDetails,
                        other.createDatabaseToolsDatabaseApiGatewayConfigPoolDetails)
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
        result =
                (result * PRIME)
                        + (this.createDatabaseToolsDatabaseApiGatewayConfigPoolDetails == null
                                ? 43
                                : this.createDatabaseToolsDatabaseApiGatewayConfigPoolDetails
                                        .hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
