/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.requests;

import com.oracle.bmc.stackmonitoring.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/stackmonitoring/ChangeMonitoredResourceTaskCompartmentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeMonitoredResourceTaskCompartmentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
public class ChangeMonitoredResourceTaskCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.stackmonitoring.model
                        .ChangeMonitoredResourceTaskCompartmentDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of stack
     * monitoring resource task.
     */
    private String monitoredResourceTaskId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of stack
     * monitoring resource task.
     */
    public String getMonitoredResourceTaskId() {
        return monitoredResourceTaskId;
    }
    /** The information to be updated. */
    private com.oracle.bmc.stackmonitoring.model.ChangeMonitoredResourceTaskCompartmentDetails
            changeMonitoredResourceTaskCompartmentDetails;

    /** The information to be updated. */
    public com.oracle.bmc.stackmonitoring.model.ChangeMonitoredResourceTaskCompartmentDetails
            getChangeMonitoredResourceTaskCompartmentDetails() {
        return changeMonitoredResourceTaskCompartmentDetails;
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
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.stackmonitoring.model.ChangeMonitoredResourceTaskCompartmentDetails
            getBody$() {
        return changeMonitoredResourceTaskCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeMonitoredResourceTaskCompartmentRequest,
                    com.oracle.bmc.stackmonitoring.model
                            .ChangeMonitoredResourceTaskCompartmentDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * stack monitoring resource task.
         */
        private String monitoredResourceTaskId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * stack monitoring resource task.
         *
         * @param monitoredResourceTaskId the value to set
         * @return this builder instance
         */
        public Builder monitoredResourceTaskId(String monitoredResourceTaskId) {
            this.monitoredResourceTaskId = monitoredResourceTaskId;
            return this;
        }

        /** The information to be updated. */
        private com.oracle.bmc.stackmonitoring.model.ChangeMonitoredResourceTaskCompartmentDetails
                changeMonitoredResourceTaskCompartmentDetails = null;

        /**
         * The information to be updated.
         *
         * @param changeMonitoredResourceTaskCompartmentDetails the value to set
         * @return this builder instance
         */
        public Builder changeMonitoredResourceTaskCompartmentDetails(
                com.oracle.bmc.stackmonitoring.model.ChangeMonitoredResourceTaskCompartmentDetails
                        changeMonitoredResourceTaskCompartmentDetails) {
            this.changeMonitoredResourceTaskCompartmentDetails =
                    changeMonitoredResourceTaskCompartmentDetails;
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
        public Builder copy(ChangeMonitoredResourceTaskCompartmentRequest o) {
            monitoredResourceTaskId(o.getMonitoredResourceTaskId());
            changeMonitoredResourceTaskCompartmentDetails(
                    o.getChangeMonitoredResourceTaskCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeMonitoredResourceTaskCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeMonitoredResourceTaskCompartmentRequest
         */
        public ChangeMonitoredResourceTaskCompartmentRequest build() {
            ChangeMonitoredResourceTaskCompartmentRequest request =
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
                com.oracle.bmc.stackmonitoring.model.ChangeMonitoredResourceTaskCompartmentDetails
                        body) {
            changeMonitoredResourceTaskCompartmentDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeMonitoredResourceTaskCompartmentRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeMonitoredResourceTaskCompartmentRequest
         */
        public ChangeMonitoredResourceTaskCompartmentRequest buildWithoutInvocationCallback() {
            ChangeMonitoredResourceTaskCompartmentRequest request =
                    new ChangeMonitoredResourceTaskCompartmentRequest();
            request.monitoredResourceTaskId = monitoredResourceTaskId;
            request.changeMonitoredResourceTaskCompartmentDetails =
                    changeMonitoredResourceTaskCompartmentDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeMonitoredResourceTaskCompartmentRequest(monitoredResourceTaskId,
            // changeMonitoredResourceTaskCompartmentDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .monitoredResourceTaskId(monitoredResourceTaskId)
                .changeMonitoredResourceTaskCompartmentDetails(
                        changeMonitoredResourceTaskCompartmentDetails)
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
        sb.append(",monitoredResourceTaskId=").append(String.valueOf(this.monitoredResourceTaskId));
        sb.append(",changeMonitoredResourceTaskCompartmentDetails=")
                .append(String.valueOf(this.changeMonitoredResourceTaskCompartmentDetails));
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
        if (!(o instanceof ChangeMonitoredResourceTaskCompartmentRequest)) {
            return false;
        }

        ChangeMonitoredResourceTaskCompartmentRequest other =
                (ChangeMonitoredResourceTaskCompartmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.monitoredResourceTaskId, other.monitoredResourceTaskId)
                && java.util.Objects.equals(
                        this.changeMonitoredResourceTaskCompartmentDetails,
                        other.changeMonitoredResourceTaskCompartmentDetails)
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
                        + (this.monitoredResourceTaskId == null
                                ? 43
                                : this.monitoredResourceTaskId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeMonitoredResourceTaskCompartmentDetails == null
                                ? 43
                                : this.changeMonitoredResourceTaskCompartmentDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
