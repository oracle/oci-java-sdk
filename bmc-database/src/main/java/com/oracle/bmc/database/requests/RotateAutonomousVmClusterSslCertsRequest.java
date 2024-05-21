/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.requests;

import com.oracle.bmc.database.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/database/RotateAutonomousVmClusterSslCertsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use RotateAutonomousVmClusterSslCertsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class RotateAutonomousVmClusterSslCertsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.database.model.RotateAutonomousVmClusterSslCertsDetails> {

    /**
     * Request to rotate the SSL certificates on Autonomous Exadata VM cluster.
     */
    private com.oracle.bmc.database.model.RotateAutonomousVmClusterSslCertsDetails
            rotateAutonomousVmClusterSslCertsDetails;

    /**
     * Request to rotate the SSL certificates on Autonomous Exadata VM cluster.
     */
    public com.oracle.bmc.database.model.RotateAutonomousVmClusterSslCertsDetails
            getRotateAutonomousVmClusterSslCertsDetails() {
        return rotateAutonomousVmClusterSslCertsDetails;
    }
    /**
     * The autonomous VM cluster [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    private String autonomousVmClusterId;

    /**
     * The autonomous VM cluster [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
     */
    public String getAutonomousVmClusterId() {
        return autonomousVmClusterId;
    }
    /**
     * Unique identifier for the request.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * may be rejected).
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.database.model.RotateAutonomousVmClusterSslCertsDetails getBody$() {
        return rotateAutonomousVmClusterSslCertsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RotateAutonomousVmClusterSslCertsRequest,
                    com.oracle.bmc.database.model.RotateAutonomousVmClusterSslCertsDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Request to rotate the SSL certificates on Autonomous Exadata VM cluster.
         */
        private com.oracle.bmc.database.model.RotateAutonomousVmClusterSslCertsDetails
                rotateAutonomousVmClusterSslCertsDetails = null;

        /**
         * Request to rotate the SSL certificates on Autonomous Exadata VM cluster.
         * @param rotateAutonomousVmClusterSslCertsDetails the value to set
         * @return this builder instance
         */
        public Builder rotateAutonomousVmClusterSslCertsDetails(
                com.oracle.bmc.database.model.RotateAutonomousVmClusterSslCertsDetails
                        rotateAutonomousVmClusterSslCertsDetails) {
            this.rotateAutonomousVmClusterSslCertsDetails =
                    rotateAutonomousVmClusterSslCertsDetails;
            return this;
        }

        /**
         * The autonomous VM cluster [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         */
        private String autonomousVmClusterId = null;

        /**
         * The autonomous VM cluster [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm).
         * @param autonomousVmClusterId the value to set
         * @return this builder instance
         */
        public Builder autonomousVmClusterId(String autonomousVmClusterId) {
            this.autonomousVmClusterId = autonomousVmClusterId;
            return this;
        }

        /**
         * Unique identifier for the request.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * may be rejected).
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations (for example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * may be rejected).
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource.  The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
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
        public Builder copy(RotateAutonomousVmClusterSslCertsRequest o) {
            rotateAutonomousVmClusterSslCertsDetails(
                    o.getRotateAutonomousVmClusterSslCertsDetails());
            autonomousVmClusterId(o.getAutonomousVmClusterId());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RotateAutonomousVmClusterSslCertsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of RotateAutonomousVmClusterSslCertsRequest
         */
        public RotateAutonomousVmClusterSslCertsRequest build() {
            RotateAutonomousVmClusterSslCertsRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.database.model.RotateAutonomousVmClusterSslCertsDetails body) {
            rotateAutonomousVmClusterSslCertsDetails(body);
            return this;
        }

        /**
         * Build the instance of RotateAutonomousVmClusterSslCertsRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RotateAutonomousVmClusterSslCertsRequest
         */
        public RotateAutonomousVmClusterSslCertsRequest buildWithoutInvocationCallback() {
            RotateAutonomousVmClusterSslCertsRequest request =
                    new RotateAutonomousVmClusterSslCertsRequest();
            request.rotateAutonomousVmClusterSslCertsDetails =
                    rotateAutonomousVmClusterSslCertsDetails;
            request.autonomousVmClusterId = autonomousVmClusterId;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            return request;
            // new RotateAutonomousVmClusterSslCertsRequest(rotateAutonomousVmClusterSslCertsDetails, autonomousVmClusterId, opcRequestId, opcRetryToken, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .rotateAutonomousVmClusterSslCertsDetails(rotateAutonomousVmClusterSslCertsDetails)
                .autonomousVmClusterId(autonomousVmClusterId)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
                .ifMatch(ifMatch);
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
        sb.append(",rotateAutonomousVmClusterSslCertsDetails=")
                .append(String.valueOf(this.rotateAutonomousVmClusterSslCertsDetails));
        sb.append(",autonomousVmClusterId=").append(String.valueOf(this.autonomousVmClusterId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RotateAutonomousVmClusterSslCertsRequest)) {
            return false;
        }

        RotateAutonomousVmClusterSslCertsRequest other =
                (RotateAutonomousVmClusterSslCertsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.rotateAutonomousVmClusterSslCertsDetails,
                        other.rotateAutonomousVmClusterSslCertsDetails)
                && java.util.Objects.equals(this.autonomousVmClusterId, other.autonomousVmClusterId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.rotateAutonomousVmClusterSslCertsDetails == null
                                ? 43
                                : this.rotateAutonomousVmClusterSslCertsDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.autonomousVmClusterId == null
                                ? 43
                                : this.autonomousVmClusterId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
