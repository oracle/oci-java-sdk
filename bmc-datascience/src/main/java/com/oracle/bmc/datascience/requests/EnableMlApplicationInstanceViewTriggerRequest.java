/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.requests;

import com.oracle.bmc.datascience.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/EnableMlApplicationInstanceViewTriggerExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * EnableMlApplicationInstanceViewTriggerRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class EnableMlApplicationInstanceViewTriggerRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.datascience.model.EnableMlApplicationInstanceViewTriggerDetails> {

    /** Details for enable trigger request. */
    private com.oracle.bmc.datascience.model.EnableMlApplicationInstanceViewTriggerDetails
            enableMlApplicationInstanceViewTriggerDetails;

    /** Details for enable trigger request. */
    public com.oracle.bmc.datascience.model.EnableMlApplicationInstanceViewTriggerDetails
            getEnableMlApplicationInstanceViewTriggerDetails() {
        return enableMlApplicationInstanceViewTriggerDetails;
    }
    /** unique MlApplicationInstanceView identifier */
    private String mlApplicationInstanceViewId;

    /** unique MlApplicationInstanceView identifier */
    public String getMlApplicationInstanceViewId() {
        return mlApplicationInstanceViewId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource is updated or deleted only if the {@code etag} you provide matches the
     * resource's current {@code etag} value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource is updated or deleted only if the {@code etag} you provide matches the
     * resource's current {@code etag} value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
     * particular request, then provide the request ID.
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
    public com.oracle.bmc.datascience.model.EnableMlApplicationInstanceViewTriggerDetails
            getBody$() {
        return enableMlApplicationInstanceViewTriggerDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    EnableMlApplicationInstanceViewTriggerRequest,
                    com.oracle.bmc.datascience.model
                            .EnableMlApplicationInstanceViewTriggerDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Details for enable trigger request. */
        private com.oracle.bmc.datascience.model.EnableMlApplicationInstanceViewTriggerDetails
                enableMlApplicationInstanceViewTriggerDetails = null;

        /**
         * Details for enable trigger request.
         *
         * @param enableMlApplicationInstanceViewTriggerDetails the value to set
         * @return this builder instance
         */
        public Builder enableMlApplicationInstanceViewTriggerDetails(
                com.oracle.bmc.datascience.model.EnableMlApplicationInstanceViewTriggerDetails
                        enableMlApplicationInstanceViewTriggerDetails) {
            this.enableMlApplicationInstanceViewTriggerDetails =
                    enableMlApplicationInstanceViewTriggerDetails;
            return this;
        }

        /** unique MlApplicationInstanceView identifier */
        private String mlApplicationInstanceViewId = null;

        /**
         * unique MlApplicationInstanceView identifier
         *
         * @param mlApplicationInstanceViewId the value to set
         * @return this builder instance
         */
        public Builder mlApplicationInstanceViewId(String mlApplicationInstanceViewId) {
            this.mlApplicationInstanceViewId = mlApplicationInstanceViewId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource is updated or deleted only if the {@code etag} you
         * provide matches the resource's current {@code etag} value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource is updated or deleted only if the {@code etag} you
         * provide matches the resource's current {@code etag} value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle assigned identifier for the request. If you need to contact Oracle about a
         * particular request, then provide the request ID.
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
        public Builder copy(EnableMlApplicationInstanceViewTriggerRequest o) {
            enableMlApplicationInstanceViewTriggerDetails(
                    o.getEnableMlApplicationInstanceViewTriggerDetails());
            mlApplicationInstanceViewId(o.getMlApplicationInstanceViewId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of EnableMlApplicationInstanceViewTriggerRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of EnableMlApplicationInstanceViewTriggerRequest
         */
        public EnableMlApplicationInstanceViewTriggerRequest build() {
            EnableMlApplicationInstanceViewTriggerRequest request =
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
                com.oracle.bmc.datascience.model.EnableMlApplicationInstanceViewTriggerDetails
                        body) {
            enableMlApplicationInstanceViewTriggerDetails(body);
            return this;
        }

        /**
         * Build the instance of EnableMlApplicationInstanceViewTriggerRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of EnableMlApplicationInstanceViewTriggerRequest
         */
        public EnableMlApplicationInstanceViewTriggerRequest buildWithoutInvocationCallback() {
            EnableMlApplicationInstanceViewTriggerRequest request =
                    new EnableMlApplicationInstanceViewTriggerRequest();
            request.enableMlApplicationInstanceViewTriggerDetails =
                    enableMlApplicationInstanceViewTriggerDetails;
            request.mlApplicationInstanceViewId = mlApplicationInstanceViewId;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new
            // EnableMlApplicationInstanceViewTriggerRequest(enableMlApplicationInstanceViewTriggerDetails, mlApplicationInstanceViewId, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .enableMlApplicationInstanceViewTriggerDetails(
                        enableMlApplicationInstanceViewTriggerDetails)
                .mlApplicationInstanceViewId(mlApplicationInstanceViewId)
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
        sb.append(",enableMlApplicationInstanceViewTriggerDetails=")
                .append(String.valueOf(this.enableMlApplicationInstanceViewTriggerDetails));
        sb.append(",mlApplicationInstanceViewId=")
                .append(String.valueOf(this.mlApplicationInstanceViewId));
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
        if (!(o instanceof EnableMlApplicationInstanceViewTriggerRequest)) {
            return false;
        }

        EnableMlApplicationInstanceViewTriggerRequest other =
                (EnableMlApplicationInstanceViewTriggerRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.enableMlApplicationInstanceViewTriggerDetails,
                        other.enableMlApplicationInstanceViewTriggerDetails)
                && java.util.Objects.equals(
                        this.mlApplicationInstanceViewId, other.mlApplicationInstanceViewId)
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
                        + (this.enableMlApplicationInstanceViewTriggerDetails == null
                                ? 43
                                : this.enableMlApplicationInstanceViewTriggerDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.mlApplicationInstanceViewId == null
                                ? 43
                                : this.mlApplicationInstanceViewId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
