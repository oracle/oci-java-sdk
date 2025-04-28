/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/CreateAutonomousContainerDatabaseDataguardAssociationExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * CreateAutonomousContainerDatabaseDataguardAssociationRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class CreateAutonomousContainerDatabaseDataguardAssociationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model
                        .CreateAutonomousContainerDatabaseDataguardAssociationDetails> {

    /**
     * The Autonomous Container Database
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String autonomousContainerDatabaseId;

    /**
     * The Autonomous Container Database
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getAutonomousContainerDatabaseId() {
        return autonomousContainerDatabaseId;
    }
    /** A request to create an Autonomous Data Guard association. */
    private com.oracle.bmc.database.model
                    .CreateAutonomousContainerDatabaseDataguardAssociationDetails
            createAutonomousContainerDatabaseDataguardAssociationDetails;

    /** A request to create an Autonomous Data Guard association. */
    public com.oracle.bmc.database.model
                    .CreateAutonomousContainerDatabaseDataguardAssociationDetails
            getCreateAutonomousContainerDatabaseDataguardAssociationDetails() {
        return createAutonomousContainerDatabaseDataguardAssociationDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
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
    public com.oracle.bmc.database.model
                    .CreateAutonomousContainerDatabaseDataguardAssociationDetails
            getBody$() {
        return createAutonomousContainerDatabaseDataguardAssociationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    CreateAutonomousContainerDatabaseDataguardAssociationRequest,
                    com.oracle.bmc.database.model
                            .CreateAutonomousContainerDatabaseDataguardAssociationDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Autonomous Container Database
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String autonomousContainerDatabaseId = null;

        /**
         * The Autonomous Container Database
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
         * @param autonomousContainerDatabaseId the value to set
         * @return this builder instance
         */
        public Builder autonomousContainerDatabaseId(String autonomousContainerDatabaseId) {
            this.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
            return this;
        }

        /** A request to create an Autonomous Data Guard association. */
        private com.oracle.bmc.database.model
                        .CreateAutonomousContainerDatabaseDataguardAssociationDetails
                createAutonomousContainerDatabaseDataguardAssociationDetails = null;

        /**
         * A request to create an Autonomous Data Guard association.
         *
         * @param createAutonomousContainerDatabaseDataguardAssociationDetails the value to set
         * @return this builder instance
         */
        public Builder createAutonomousContainerDatabaseDataguardAssociationDetails(
                com.oracle.bmc.database.model
                                .CreateAutonomousContainerDatabaseDataguardAssociationDetails
                        createAutonomousContainerDatabaseDataguardAssociationDetails) {
            this.createAutonomousContainerDatabaseDataguardAssociationDetails =
                    createAutonomousContainerDatabaseDataguardAssociationDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request may be rejected).
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations (for example,
         * if a resource has been deleted and purged from the system, then a retry of the original
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
        public Builder copy(CreateAutonomousContainerDatabaseDataguardAssociationRequest o) {
            autonomousContainerDatabaseId(o.getAutonomousContainerDatabaseId());
            createAutonomousContainerDatabaseDataguardAssociationDetails(
                    o.getCreateAutonomousContainerDatabaseDataguardAssociationDetails());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of CreateAutonomousContainerDatabaseDataguardAssociationRequest as
         * configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of CreateAutonomousContainerDatabaseDataguardAssociationRequest
         */
        public CreateAutonomousContainerDatabaseDataguardAssociationRequest build() {
            CreateAutonomousContainerDatabaseDataguardAssociationRequest request =
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
                com.oracle.bmc.database.model
                                .CreateAutonomousContainerDatabaseDataguardAssociationDetails
                        body) {
            createAutonomousContainerDatabaseDataguardAssociationDetails(body);
            return this;
        }

        /**
         * Build the instance of CreateAutonomousContainerDatabaseDataguardAssociationRequest as
         * configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of CreateAutonomousContainerDatabaseDataguardAssociationRequest
         */
        public CreateAutonomousContainerDatabaseDataguardAssociationRequest
                buildWithoutInvocationCallback() {
            CreateAutonomousContainerDatabaseDataguardAssociationRequest request =
                    new CreateAutonomousContainerDatabaseDataguardAssociationRequest();
            request.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
            request.createAutonomousContainerDatabaseDataguardAssociationDetails =
                    createAutonomousContainerDatabaseDataguardAssociationDetails;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new
            // CreateAutonomousContainerDatabaseDataguardAssociationRequest(autonomousContainerDatabaseId, createAutonomousContainerDatabaseDataguardAssociationDetails, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .autonomousContainerDatabaseId(autonomousContainerDatabaseId)
                .createAutonomousContainerDatabaseDataguardAssociationDetails(
                        createAutonomousContainerDatabaseDataguardAssociationDetails)
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
        sb.append(",autonomousContainerDatabaseId=")
                .append(String.valueOf(this.autonomousContainerDatabaseId));
        sb.append(",createAutonomousContainerDatabaseDataguardAssociationDetails=")
                .append(
                        String.valueOf(
                                this.createAutonomousContainerDatabaseDataguardAssociationDetails));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAutonomousContainerDatabaseDataguardAssociationRequest)) {
            return false;
        }

        CreateAutonomousContainerDatabaseDataguardAssociationRequest other =
                (CreateAutonomousContainerDatabaseDataguardAssociationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.autonomousContainerDatabaseId, other.autonomousContainerDatabaseId)
                && java.util.Objects.equals(
                        this.createAutonomousContainerDatabaseDataguardAssociationDetails,
                        other.createAutonomousContainerDatabaseDataguardAssociationDetails)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
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
                        + (this.createAutonomousContainerDatabaseDataguardAssociationDetails == null
                                ? 43
                                : this.createAutonomousContainerDatabaseDataguardAssociationDetails
                                        .hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
