/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/GetAutonomousContainerDatabaseDataguardAssociationExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetAutonomousContainerDatabaseDataguardAssociationRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class GetAutonomousContainerDatabaseDataguardAssociationRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String autonomousContainerDatabaseId;

    /**
     * The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getAutonomousContainerDatabaseId() {
        return autonomousContainerDatabaseId;
    }
    /**
     * The Autonomous Container Database-Autonomous Data Guard association [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String autonomousContainerDatabaseDataguardAssociationId;

    /**
     * The Autonomous Container Database-Autonomous Data Guard association [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getAutonomousContainerDatabaseDataguardAssociationId() {
        return autonomousContainerDatabaseDataguardAssociationId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetAutonomousContainerDatabaseDataguardAssociationRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String autonomousContainerDatabaseId = null;

        /**
         * The Autonomous Container Database [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param autonomousContainerDatabaseId the value to set
         * @return this builder instance
         */
        public Builder autonomousContainerDatabaseId(String autonomousContainerDatabaseId) {
            this.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
            return this;
        }

        /**
         * The Autonomous Container Database-Autonomous Data Guard association [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String autonomousContainerDatabaseDataguardAssociationId = null;

        /**
         * The Autonomous Container Database-Autonomous Data Guard association [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param autonomousContainerDatabaseDataguardAssociationId the value to set
         * @return this builder instance
         */
        public Builder autonomousContainerDatabaseDataguardAssociationId(
                String autonomousContainerDatabaseDataguardAssociationId) {
            this.autonomousContainerDatabaseDataguardAssociationId =
                    autonomousContainerDatabaseDataguardAssociationId;
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
        public Builder copy(GetAutonomousContainerDatabaseDataguardAssociationRequest o) {
            autonomousContainerDatabaseId(o.getAutonomousContainerDatabaseId());
            autonomousContainerDatabaseDataguardAssociationId(
                    o.getAutonomousContainerDatabaseDataguardAssociationId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetAutonomousContainerDatabaseDataguardAssociationRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetAutonomousContainerDatabaseDataguardAssociationRequest
         */
        public GetAutonomousContainerDatabaseDataguardAssociationRequest build() {
            GetAutonomousContainerDatabaseDataguardAssociationRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetAutonomousContainerDatabaseDataguardAssociationRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetAutonomousContainerDatabaseDataguardAssociationRequest
         */
        public GetAutonomousContainerDatabaseDataguardAssociationRequest
                buildWithoutInvocationCallback() {
            GetAutonomousContainerDatabaseDataguardAssociationRequest request =
                    new GetAutonomousContainerDatabaseDataguardAssociationRequest();
            request.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
            request.autonomousContainerDatabaseDataguardAssociationId =
                    autonomousContainerDatabaseDataguardAssociationId;
            return request;
            // new GetAutonomousContainerDatabaseDataguardAssociationRequest(autonomousContainerDatabaseId, autonomousContainerDatabaseDataguardAssociationId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .autonomousContainerDatabaseId(autonomousContainerDatabaseId)
                .autonomousContainerDatabaseDataguardAssociationId(
                        autonomousContainerDatabaseDataguardAssociationId);
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
        sb.append(",autonomousContainerDatabaseId=")
                .append(String.valueOf(this.autonomousContainerDatabaseId));
        sb.append(",autonomousContainerDatabaseDataguardAssociationId=")
                .append(String.valueOf(this.autonomousContainerDatabaseDataguardAssociationId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetAutonomousContainerDatabaseDataguardAssociationRequest)) {
            return false;
        }

        GetAutonomousContainerDatabaseDataguardAssociationRequest other =
                (GetAutonomousContainerDatabaseDataguardAssociationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.autonomousContainerDatabaseId, other.autonomousContainerDatabaseId)
                && java.util.Objects.equals(
                        this.autonomousContainerDatabaseDataguardAssociationId,
                        other.autonomousContainerDatabaseDataguardAssociationId);
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
                        + (this.autonomousContainerDatabaseDataguardAssociationId == null
                                ? 43
                                : this.autonomousContainerDatabaseDataguardAssociationId
                                        .hashCode());
        return result;
    }
}
