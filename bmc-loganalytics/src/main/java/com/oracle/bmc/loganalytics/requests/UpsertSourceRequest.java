/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.requests;

import com.oracle.bmc.loganalytics.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/loganalytics/UpsertSourceExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpsertSourceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
public class UpsertSourceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.loganalytics.model.UpsertLogAnalyticsSourceDetails> {

    /**
     * The Logging Analytics namespace used for the request.
     *
     */
    private String namespaceName;

    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * Details for the new LoganSourceDetails.
     */
    private com.oracle.bmc.loganalytics.model.UpsertLogAnalyticsSourceDetails
            upsertLogAnalyticsSourceDetails;

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

    public Integer getCreateLikeSourceId() {
        return createLikeSourceId;
    }
    /**
     * A flag indicating whether or not the update of a source is incremental or not.  If incremental,
     * the name of the source must be specified.
     *
     */
    private Boolean isIncremental;

    public Boolean getIsIncremental() {
        return isIncremental;
    }
    /**
     * is ignore warning
     */
    private Boolean isIgnoreWarning;

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

    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
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
                    UpsertSourceRequest,
                    com.oracle.bmc.loganalytics.model.UpsertLogAnalyticsSourceDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String namespaceName = null;

        /**
         * The Logging Analytics namespace used for the request.
         *
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        private com.oracle.bmc.loganalytics.model.UpsertLogAnalyticsSourceDetails
                upsertLogAnalyticsSourceDetails = null;

        /**
         * Details for the new LoganSourceDetails.
         * @return this builder instance
         */
        public Builder upsertLogAnalyticsSourceDetails(
                com.oracle.bmc.loganalytics.model.UpsertLogAnalyticsSourceDetails
                        upsertLogAnalyticsSourceDetails) {
            this.upsertLogAnalyticsSourceDetails = upsertLogAnalyticsSourceDetails;
            return this;
        }

        private Integer createLikeSourceId = null;

        /**
         * The unique identifier of the source to use as the reference for a create like
         * operation.
         *
         * @return this builder instance
         */
        public Builder createLikeSourceId(Integer createLikeSourceId) {
            this.createLikeSourceId = createLikeSourceId;
            return this;
        }

        private Boolean isIncremental = null;

        /**
         * A flag indicating whether or not the update of a source is incremental or not.  If incremental,
         * the name of the source must be specified.
         *
         * @return this builder instance
         */
        public Builder isIncremental(Boolean isIncremental) {
            this.isIncremental = isIncremental;
            return this;
        }

        private Boolean isIgnoreWarning = null;

        /**
         * is ignore warning
         * @return this builder instance
         */
        public Builder isIgnoreWarning(Boolean isIgnoreWarning) {
            this.isIgnoreWarning = isIgnoreWarning;
            return this;
        }

        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
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
        public Builder copy(UpsertSourceRequest o) {
            namespaceName(o.getNamespaceName());
            upsertLogAnalyticsSourceDetails(o.getUpsertLogAnalyticsSourceDetails());
            createLikeSourceId(o.getCreateLikeSourceId());
            isIncremental(o.getIsIncremental());
            isIgnoreWarning(o.getIsIgnoreWarning());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpsertSourceRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpsertSourceRequest
         */
        public UpsertSourceRequest build() {
            UpsertSourceRequest request = buildWithoutInvocationCallback();
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
         * Build the instance of UpsertSourceRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpsertSourceRequest
         */
        public UpsertSourceRequest buildWithoutInvocationCallback() {
            UpsertSourceRequest request = new UpsertSourceRequest();
            request.namespaceName = namespaceName;
            request.upsertLogAnalyticsSourceDetails = upsertLogAnalyticsSourceDetails;
            request.createLikeSourceId = createLikeSourceId;
            request.isIncremental = isIncremental;
            request.isIgnoreWarning = isIgnoreWarning;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new UpsertSourceRequest(namespaceName, upsertLogAnalyticsSourceDetails, createLikeSourceId, isIncremental, isIgnoreWarning, opcRetryToken, opcRequestId, ifMatch);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .upsertLogAnalyticsSourceDetails(upsertLogAnalyticsSourceDetails)
                .createLikeSourceId(createLikeSourceId)
                .isIncremental(isIncremental)
                .isIgnoreWarning(isIgnoreWarning)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId)
                .ifMatch(ifMatch);
    }

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
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpsertSourceRequest)) {
            return false;
        }

        UpsertSourceRequest other = (UpsertSourceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(
                        this.upsertLogAnalyticsSourceDetails, other.upsertLogAnalyticsSourceDetails)
                && java.util.Objects.equals(this.createLikeSourceId, other.createLikeSourceId)
                && java.util.Objects.equals(this.isIncremental, other.isIncremental)
                && java.util.Objects.equals(this.isIgnoreWarning, other.isIgnoreWarning)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
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
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
