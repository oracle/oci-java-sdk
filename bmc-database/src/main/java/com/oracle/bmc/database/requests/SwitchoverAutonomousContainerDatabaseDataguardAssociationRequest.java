/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/SwitchoverAutonomousContainerDatabaseDataguardAssociationExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

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
    /**
     * The Autonomous Container Database-Autonomous Data Guard association
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    private String autonomousContainerDatabaseDataguardAssociationId;

    /**
     * The Autonomous Container Database-Autonomous Data Guard association
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
     */
    public String getAutonomousContainerDatabaseDataguardAssociationId() {
        return autonomousContainerDatabaseDataguardAssociationId;
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

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest,
                    java.lang.Void> {
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

        /**
         * The Autonomous Container Database-Autonomous Data Guard association
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         */
        private String autonomousContainerDatabaseDataguardAssociationId = null;

        /**
         * The Autonomous Container Database-Autonomous Data Guard association
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm).
         *
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
        public Builder copy(SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest o) {
            autonomousContainerDatabaseId(o.getAutonomousContainerDatabaseId());
            autonomousContainerDatabaseDataguardAssociationId(
                    o.getAutonomousContainerDatabaseDataguardAssociationId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest as
         * configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest
         */
        public SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest build() {
            SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest as
         * configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest
         */
        public SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest
                buildWithoutInvocationCallback() {
            SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest request =
                    new SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest();
            request.autonomousContainerDatabaseId = autonomousContainerDatabaseId;
            request.autonomousContainerDatabaseDataguardAssociationId =
                    autonomousContainerDatabaseDataguardAssociationId;
            request.ifMatch = ifMatch;
            return request;
            // new
            // SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest(autonomousContainerDatabaseId, autonomousContainerDatabaseDataguardAssociationId, ifMatch);
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
                .autonomousContainerDatabaseDataguardAssociationId(
                        autonomousContainerDatabaseDataguardAssociationId)
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
        sb.append(",autonomousContainerDatabaseId=")
                .append(String.valueOf(this.autonomousContainerDatabaseId));
        sb.append(",autonomousContainerDatabaseDataguardAssociationId=")
                .append(String.valueOf(this.autonomousContainerDatabaseDataguardAssociationId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest)) {
            return false;
        }

        SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest other =
                (SwitchoverAutonomousContainerDatabaseDataguardAssociationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.autonomousContainerDatabaseId, other.autonomousContainerDatabaseId)
                && java.util.Objects.equals(
                        this.autonomousContainerDatabaseDataguardAssociationId,
                        other.autonomousContainerDatabaseDataguardAssociationId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
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
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
