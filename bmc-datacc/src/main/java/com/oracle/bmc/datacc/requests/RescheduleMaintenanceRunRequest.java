/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacc.requests;

import com.oracle.bmc.datacc.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacc/RescheduleMaintenanceRunExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * RescheduleMaintenanceRunRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251101")
public class RescheduleMaintenanceRunRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datacc.model.RescheduleMaintenanceRunDetails> {

    /** The maintenance run OCID. */
    private String maintenanceRunId;

    /** The maintenance run OCID. */
    public String getMaintenanceRunId() {
        return maintenanceRunId;
    }
    /** The new scheduled time for the maintenance run. */
    private com.oracle.bmc.datacc.model.RescheduleMaintenanceRunDetails
            rescheduleMaintenanceRunDetails;

    /** The new scheduled time for the maintenance run. */
    public com.oracle.bmc.datacc.model.RescheduleMaintenanceRunDetails
            getRescheduleMaintenanceRunDetails() {
        return rescheduleMaintenanceRunDetails;
    }
    /**
     * For Optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * 'if-match' parameter to the value of the Etag from a previous GET or POST response for that
     * resource. The resource is updated or deleted only if the Etag that you provide matches the
     * current Etag value for the resource.
     */
    private String ifMatch;

    /**
     * For Optimistic concurrency control. In the PUT or DELETE call for a resource, set the
     * 'if-match' parameter to the value of the Etag from a previous GET or POST response for that
     * resource. The resource is updated or deleted only if the Etag that you provide matches the
     * current Etag value for the resource.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /** The client request identifier. */
    private String opcRequestId;

    /** The client request identifier. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * A token that uniquely identifies a request, so the request can be retried without risk of
     * processing that same action again, in the event of a timeout or server error. Retry tokens
     * expire after 24 hours, but can be invalidated before then due to conflicting operations. For
     * example, if a resource was deleted and purged from the system, then a retry of the original
     * creation request can be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request, so the request can be retried without risk of
     * processing that same action again, in the event of a timeout or server error. Retry tokens
     * expire after 24 hours, but can be invalidated before then due to conflicting operations. For
     * example, if a resource was deleted and purged from the system, then a retry of the original
     * creation request can be rejected.
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
    public com.oracle.bmc.datacc.model.RescheduleMaintenanceRunDetails getBody$() {
        return rescheduleMaintenanceRunDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RescheduleMaintenanceRunRequest,
                    com.oracle.bmc.datacc.model.RescheduleMaintenanceRunDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The maintenance run OCID. */
        private String maintenanceRunId = null;

        /**
         * The maintenance run OCID.
         *
         * @param maintenanceRunId the value to set
         * @return this builder instance
         */
        public Builder maintenanceRunId(String maintenanceRunId) {
            this.maintenanceRunId = maintenanceRunId;
            return this;
        }

        /** The new scheduled time for the maintenance run. */
        private com.oracle.bmc.datacc.model.RescheduleMaintenanceRunDetails
                rescheduleMaintenanceRunDetails = null;

        /**
         * The new scheduled time for the maintenance run.
         *
         * @param rescheduleMaintenanceRunDetails the value to set
         * @return this builder instance
         */
        public Builder rescheduleMaintenanceRunDetails(
                com.oracle.bmc.datacc.model.RescheduleMaintenanceRunDetails
                        rescheduleMaintenanceRunDetails) {
            this.rescheduleMaintenanceRunDetails = rescheduleMaintenanceRunDetails;
            return this;
        }

        /**
         * For Optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * 'if-match' parameter to the value of the Etag from a previous GET or POST response for
         * that resource. The resource is updated or deleted only if the Etag that you provide
         * matches the current Etag value for the resource.
         */
        private String ifMatch = null;

        /**
         * For Optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * 'if-match' parameter to the value of the Etag from a previous GET or POST response for
         * that resource. The resource is updated or deleted only if the Etag that you provide
         * matches the current Etag value for the resource.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /** The client request identifier. */
        private String opcRequestId = null;

        /**
         * The client request identifier.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * A token that uniquely identifies a request, so the request can be retried without risk of
         * processing that same action again, in the event of a timeout or server error. Retry
         * tokens expire after 24 hours, but can be invalidated before then due to conflicting
         * operations. For example, if a resource was deleted and purged from the system, then a
         * retry of the original creation request can be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request, so the request can be retried without risk of
         * processing that same action again, in the event of a timeout or server error. Retry
         * tokens expire after 24 hours, but can be invalidated before then due to conflicting
         * operations. For example, if a resource was deleted and purged from the system, then a
         * retry of the original creation request can be rejected.
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
        public Builder copy(RescheduleMaintenanceRunRequest o) {
            maintenanceRunId(o.getMaintenanceRunId());
            rescheduleMaintenanceRunDetails(o.getRescheduleMaintenanceRunDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RescheduleMaintenanceRunRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of RescheduleMaintenanceRunRequest
         */
        public RescheduleMaintenanceRunRequest build() {
            RescheduleMaintenanceRunRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.datacc.model.RescheduleMaintenanceRunDetails body) {
            rescheduleMaintenanceRunDetails(body);
            return this;
        }

        /**
         * Build the instance of RescheduleMaintenanceRunRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RescheduleMaintenanceRunRequest
         */
        public RescheduleMaintenanceRunRequest buildWithoutInvocationCallback() {
            RescheduleMaintenanceRunRequest request = new RescheduleMaintenanceRunRequest();
            request.maintenanceRunId = maintenanceRunId;
            request.rescheduleMaintenanceRunDetails = rescheduleMaintenanceRunDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new RescheduleMaintenanceRunRequest(maintenanceRunId,
            // rescheduleMaintenanceRunDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .maintenanceRunId(maintenanceRunId)
                .rescheduleMaintenanceRunDetails(rescheduleMaintenanceRunDetails)
                .ifMatch(ifMatch)
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
        sb.append(",maintenanceRunId=").append(String.valueOf(this.maintenanceRunId));
        sb.append(",rescheduleMaintenanceRunDetails=")
                .append(String.valueOf(this.rescheduleMaintenanceRunDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
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
        if (!(o instanceof RescheduleMaintenanceRunRequest)) {
            return false;
        }

        RescheduleMaintenanceRunRequest other = (RescheduleMaintenanceRunRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.maintenanceRunId, other.maintenanceRunId)
                && java.util.Objects.equals(
                        this.rescheduleMaintenanceRunDetails, other.rescheduleMaintenanceRunDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.maintenanceRunId == null ? 43 : this.maintenanceRunId.hashCode());
        result =
                (result * PRIME)
                        + (this.rescheduleMaintenanceRunDetails == null
                                ? 43
                                : this.rescheduleMaintenanceRunDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
