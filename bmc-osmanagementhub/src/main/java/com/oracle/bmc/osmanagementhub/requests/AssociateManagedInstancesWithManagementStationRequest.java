/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.requests;

import com.oracle.bmc.osmanagementhub.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/AssociateManagedInstancesWithManagementStationExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * AssociateManagedInstancesWithManagementStationRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class AssociateManagedInstancesWithManagementStationRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.osmanagementhub.model
                        .AssociateManagedInstancesWithManagementStationDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * management station.
     */
    private String managementStationId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * management station.
     */
    public String getManagementStationId() {
        return managementStationId;
    }
    /**
     * The managed instances
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to associate
     * to the management station.
     */
    private com.oracle.bmc.osmanagementhub.model
                    .AssociateManagedInstancesWithManagementStationDetails
            associateManagedInstancesWithManagementStationDetails;

    /**
     * The managed instances
     * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to associate
     * to the management station.
     */
    public com.oracle.bmc.osmanagementhub.model
                    .AssociateManagedInstancesWithManagementStationDetails
            getAssociateManagedInstancesWithManagementStationDetails() {
        return associateManagedInstancesWithManagementStationDetails;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
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

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.osmanagementhub.model
                    .AssociateManagedInstancesWithManagementStationDetails
            getBody$() {
        return associateManagedInstancesWithManagementStationDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    AssociateManagedInstancesWithManagementStationRequest,
                    com.oracle.bmc.osmanagementhub.model
                            .AssociateManagedInstancesWithManagementStationDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * management station.
         */
        private String managementStationId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * management station.
         *
         * @param managementStationId the value to set
         * @return this builder instance
         */
        public Builder managementStationId(String managementStationId) {
            this.managementStationId = managementStationId;
            return this;
        }

        /**
         * The managed instances
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to
         * associate to the management station.
         */
        private com.oracle.bmc.osmanagementhub.model
                        .AssociateManagedInstancesWithManagementStationDetails
                associateManagedInstancesWithManagementStationDetails = null;

        /**
         * The managed instances
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) to
         * associate to the management station.
         *
         * @param associateManagedInstancesWithManagementStationDetails the value to set
         * @return this builder instance
         */
        public Builder associateManagedInstancesWithManagementStationDetails(
                com.oracle.bmc.osmanagementhub.model
                                .AssociateManagedInstancesWithManagementStationDetails
                        associateManagedInstancesWithManagementStationDetails) {
            this.associateManagedInstancesWithManagementStationDetails =
                    associateManagedInstancesWithManagementStationDetails;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
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
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after
         * 24 hours, but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
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
        public Builder copy(AssociateManagedInstancesWithManagementStationRequest o) {
            managementStationId(o.getManagementStationId());
            associateManagedInstancesWithManagementStationDetails(
                    o.getAssociateManagedInstancesWithManagementStationDetails());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of AssociateManagedInstancesWithManagementStationRequest as configured
         * by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of AssociateManagedInstancesWithManagementStationRequest
         */
        public AssociateManagedInstancesWithManagementStationRequest build() {
            AssociateManagedInstancesWithManagementStationRequest request =
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
                com.oracle.bmc.osmanagementhub.model
                                .AssociateManagedInstancesWithManagementStationDetails
                        body) {
            associateManagedInstancesWithManagementStationDetails(body);
            return this;
        }

        /**
         * Build the instance of AssociateManagedInstancesWithManagementStationRequest as configured
         * by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of AssociateManagedInstancesWithManagementStationRequest
         */
        public AssociateManagedInstancesWithManagementStationRequest
                buildWithoutInvocationCallback() {
            AssociateManagedInstancesWithManagementStationRequest request =
                    new AssociateManagedInstancesWithManagementStationRequest();
            request.managementStationId = managementStationId;
            request.associateManagedInstancesWithManagementStationDetails =
                    associateManagedInstancesWithManagementStationDetails;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            request.ifMatch = ifMatch;
            return request;
            // new AssociateManagedInstancesWithManagementStationRequest(managementStationId,
            // associateManagedInstancesWithManagementStationDetails, opcRequestId, opcRetryToken,
            // ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .managementStationId(managementStationId)
                .associateManagedInstancesWithManagementStationDetails(
                        associateManagedInstancesWithManagementStationDetails)
                .opcRequestId(opcRequestId)
                .opcRetryToken(opcRetryToken)
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
        sb.append(",managementStationId=").append(String.valueOf(this.managementStationId));
        sb.append(",associateManagedInstancesWithManagementStationDetails=")
                .append(String.valueOf(this.associateManagedInstancesWithManagementStationDetails));
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
        if (!(o instanceof AssociateManagedInstancesWithManagementStationRequest)) {
            return false;
        }

        AssociateManagedInstancesWithManagementStationRequest other =
                (AssociateManagedInstancesWithManagementStationRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.managementStationId, other.managementStationId)
                && java.util.Objects.equals(
                        this.associateManagedInstancesWithManagementStationDetails,
                        other.associateManagedInstancesWithManagementStationDetails)
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
                        + (this.managementStationId == null
                                ? 43
                                : this.managementStationId.hashCode());
        result =
                (result * PRIME)
                        + (this.associateManagedInstancesWithManagementStationDetails == null
                                ? 43
                                : this.associateManagedInstancesWithManagementStationDetails
                                        .hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
