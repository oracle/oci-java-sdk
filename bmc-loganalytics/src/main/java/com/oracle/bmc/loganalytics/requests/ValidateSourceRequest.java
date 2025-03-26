/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/ValidateSourceExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use ValidateSourceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class ValidateSourceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.loganalytics.model.UpsertLogAnalyticsSourceDetails> {

    /**
     * The Logging Analytics namespace used for the request.
     *
     */
    private String namespaceName;

    /**
     * The Logging Analytics namespace used for the request.
     *
     */
    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * Details for the new LoganSourceDetails.
     */
    private com.oracle.bmc.loganalytics.model.UpsertLogAnalyticsSourceDetails
            upsertLogAnalyticsSourceDetails;

    /**
     * Details for the new LoganSourceDetails.
     */
    public com.oracle.bmc.loganalytics.model.UpsertLogAnalyticsSourceDetails
            getUpsertLogAnalyticsSourceDetails() {
        return upsertLogAnalyticsSourceDetails;
    }
    /**
     * The unique identifier of the source to use as the reference for a create like
     * operation.
     *
     */
    private Integer createLikeSourceId;

    /**
     * The unique identifier of the source to use as the reference for a create like
     * operation.
     *
     */
    public Integer getCreateLikeSourceId() {
        return createLikeSourceId;
    }
    /**
     * A flag indicating whether or not the update of a source is incremental or not.  If incremental,
     * the name of the source must be specified.
     *
     */
    private Boolean isIncremental;

    /**
     * A flag indicating whether or not the update of a source is incremental or not.  If incremental,
     * the name of the source must be specified.
     *
     */
    public Boolean getIsIncremental() {
        return isIncremental;
    }
    /**
     * is ignore warning
     */
    private Boolean isIgnoreWarning;

    /**
     * is ignore warning
     */
    public Boolean getIsIgnoreWarning() {
        return isIgnoreWarning;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
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
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.loganalytics.model.UpsertLogAnalyticsSourceDetails getBody$() {
        return upsertLogAnalyticsSourceDetails;
    }

    @Override
    public boolean supportsExpect100Continue() {
        return true;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ValidateSourceRequest,
                    com.oracle.bmc.loganalytics.model.UpsertLogAnalyticsSourceDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Logging Analytics namespace used for the request.
         *
         */
        private String namespaceName = null;

        /**
         * The Logging Analytics namespace used for the request.
         *
         * @param namespaceName the value to set
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * Details for the new LoganSourceDetails.
         */
        private com.oracle.bmc.loganalytics.model.UpsertLogAnalyticsSourceDetails
                upsertLogAnalyticsSourceDetails = null;

        /**
         * Details for the new LoganSourceDetails.
         * @param upsertLogAnalyticsSourceDetails the value to set
         * @return this builder instance
         */
        public Builder upsertLogAnalyticsSourceDetails(
                com.oracle.bmc.loganalytics.model.UpsertLogAnalyticsSourceDetails
                        upsertLogAnalyticsSourceDetails) {
            this.upsertLogAnalyticsSourceDetails = upsertLogAnalyticsSourceDetails;
            return this;
        }

        /**
         * The unique identifier of the source to use as the reference for a create like
         * operation.
         *
         */
        private Integer createLikeSourceId = null;

        /**
         * The unique identifier of the source to use as the reference for a create like
         * operation.
         *
         * @param createLikeSourceId the value to set
         * @return this builder instance
         */
        public Builder createLikeSourceId(Integer createLikeSourceId) {
            this.createLikeSourceId = createLikeSourceId;
            return this;
        }

        /**
         * A flag indicating whether or not the update of a source is incremental or not.  If incremental,
         * the name of the source must be specified.
         *
         */
        private Boolean isIncremental = null;

        /**
         * A flag indicating whether or not the update of a source is incremental or not.  If incremental,
         * the name of the source must be specified.
         *
         * @param isIncremental the value to set
         * @return this builder instance
         */
        public Builder isIncremental(Boolean isIncremental) {
            this.isIncremental = isIncremental;
            return this;
        }

        /**
         * is ignore warning
         */
        private Boolean isIgnoreWarning = null;

        /**
         * is ignore warning
         * @param isIgnoreWarning the value to set
         * @return this builder instance
         */
        public Builder isIgnoreWarning(Boolean isIgnoreWarning) {
            this.isIgnoreWarning = isIgnoreWarning;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
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
        public Builder copy(ValidateSourceRequest o) {
            namespaceName(o.getNamespaceName());
            upsertLogAnalyticsSourceDetails(o.getUpsertLogAnalyticsSourceDetails());
            createLikeSourceId(o.getCreateLikeSourceId());
            isIncremental(o.getIsIncremental());
            isIgnoreWarning(o.getIsIgnoreWarning());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ValidateSourceRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ValidateSourceRequest
         */
        public ValidateSourceRequest build() {
            ValidateSourceRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.loganalytics.model.UpsertLogAnalyticsSourceDetails body) {
            upsertLogAnalyticsSourceDetails(body);
            return this;
        }

        /**
         * Build the instance of ValidateSourceRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ValidateSourceRequest
         */
        public ValidateSourceRequest buildWithoutInvocationCallback() {
            ValidateSourceRequest request = new ValidateSourceRequest();
            request.namespaceName = namespaceName;
            request.upsertLogAnalyticsSourceDetails = upsertLogAnalyticsSourceDetails;
            request.createLikeSourceId = createLikeSourceId;
            request.isIncremental = isIncremental;
            request.isIgnoreWarning = isIgnoreWarning;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new ValidateSourceRequest(namespaceName, upsertLogAnalyticsSourceDetails, createLikeSourceId, isIncremental, isIgnoreWarning, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .upsertLogAnalyticsSourceDetails(upsertLogAnalyticsSourceDetails)
                .createLikeSourceId(createLikeSourceId)
                .isIncremental(isIncremental)
                .isIgnoreWarning(isIgnoreWarning)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId);
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
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",upsertLogAnalyticsSourceDetails=")
                .append(String.valueOf(this.upsertLogAnalyticsSourceDetails));
        sb.append(",createLikeSourceId=").append(String.valueOf(this.createLikeSourceId));
        sb.append(",isIncremental=").append(String.valueOf(this.isIncremental));
        sb.append(",isIgnoreWarning=").append(String.valueOf(this.isIgnoreWarning));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ValidateSourceRequest)) {
            return false;
        }

        ValidateSourceRequest other = (ValidateSourceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(
                        this.upsertLogAnalyticsSourceDetails, other.upsertLogAnalyticsSourceDetails)
                && java.util.Objects.equals(this.createLikeSourceId, other.createLikeSourceId)
                && java.util.Objects.equals(this.isIncremental, other.isIncremental)
                && java.util.Objects.equals(this.isIgnoreWarning, other.isIgnoreWarning)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.upsertLogAnalyticsSourceDetails == null
                                ? 43
                                : this.upsertLogAnalyticsSourceDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.createLikeSourceId == null
                                ? 43
                                : this.createLikeSourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.isIncremental == null ? 43 : this.isIncremental.hashCode());
        result =
                (result * PRIME)
                        + (this.isIgnoreWarning == null ? 43 : this.isIgnoreWarning.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
