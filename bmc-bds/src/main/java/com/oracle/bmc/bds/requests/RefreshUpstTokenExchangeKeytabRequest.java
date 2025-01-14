/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.requests;

import com.oracle.bmc.bds.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/bds/RefreshUpstTokenExchangeKeytabExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * RefreshUpstTokenExchangeKeytabRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
public class RefreshUpstTokenExchangeKeytabRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.bds.model.RefreshUpstTokenExchangeKeytabDetails> {

    /** The OCID of the cluster. */
    private String bdsInstanceId;

    /** The OCID of the cluster. */
    public String getBdsInstanceId() {
        return bdsInstanceId;
    }
    /** The OCID of the identity configuration */
    private String identityConfigurationId;

    /** The OCID of the identity configuration */
    public String getIdentityConfigurationId() {
        return identityConfigurationId;
    }
    /** Details for refreshing User Principal Session (UPST) token exchange keytab */
    private com.oracle.bmc.bds.model.RefreshUpstTokenExchangeKeytabDetails
            refreshUpstTokenExchangeKeytabDetails;

    /** Details for refreshing User Principal Session (UPST) token exchange keytab */
    public com.oracle.bmc.bds.model.RefreshUpstTokenExchangeKeytabDetails
            getRefreshUpstTokenExchangeKeytabDetails() {
        return refreshUpstTokenExchangeKeytabDetails;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error, without risk of executing that same action again. Retry tokens expire after 24
     * hours but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error, without risk of executing that same action again. Retry tokens expire after 24
     * hours but can be invalidated before then due to conflicting operations. For example, if a
     * resource has been deleted and purged from the system, then a retry of the original creation
     * request might be rejected.
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
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
    public com.oracle.bmc.bds.model.RefreshUpstTokenExchangeKeytabDetails getBody$() {
        return refreshUpstTokenExchangeKeytabDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RefreshUpstTokenExchangeKeytabRequest,
                    com.oracle.bmc.bds.model.RefreshUpstTokenExchangeKeytabDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the cluster. */
        private String bdsInstanceId = null;

        /**
         * The OCID of the cluster.
         *
         * @param bdsInstanceId the value to set
         * @return this builder instance
         */
        public Builder bdsInstanceId(String bdsInstanceId) {
            this.bdsInstanceId = bdsInstanceId;
            return this;
        }

        /** The OCID of the identity configuration */
        private String identityConfigurationId = null;

        /**
         * The OCID of the identity configuration
         *
         * @param identityConfigurationId the value to set
         * @return this builder instance
         */
        public Builder identityConfigurationId(String identityConfigurationId) {
            this.identityConfigurationId = identityConfigurationId;
            return this;
        }

        /** Details for refreshing User Principal Session (UPST) token exchange keytab */
        private com.oracle.bmc.bds.model.RefreshUpstTokenExchangeKeytabDetails
                refreshUpstTokenExchangeKeytabDetails = null;

        /**
         * Details for refreshing User Principal Session (UPST) token exchange keytab
         *
         * @param refreshUpstTokenExchangeKeytabDetails the value to set
         * @return this builder instance
         */
        public Builder refreshUpstTokenExchangeKeytabDetails(
                com.oracle.bmc.bds.model.RefreshUpstTokenExchangeKeytabDetails
                        refreshUpstTokenExchangeKeytabDetails) {
            this.refreshUpstTokenExchangeKeytabDetails = refreshUpstTokenExchangeKeytabDetails;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error, without risk of executing that same action again. Retry tokens expire after
         * 24 hours but can be invalidated before then due to conflicting operations. For example,
         * if a resource has been deleted and purged from the system, then a retry of the original
         * creation request might be rejected.
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error, without risk of executing that same action again. Retry tokens expire after
         * 24 hours but can be invalidated before then due to conflicting operations. For example,
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

        /** The client request ID for tracing. */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(RefreshUpstTokenExchangeKeytabRequest o) {
            bdsInstanceId(o.getBdsInstanceId());
            identityConfigurationId(o.getIdentityConfigurationId());
            refreshUpstTokenExchangeKeytabDetails(o.getRefreshUpstTokenExchangeKeytabDetails());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RefreshUpstTokenExchangeKeytabRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of RefreshUpstTokenExchangeKeytabRequest
         */
        public RefreshUpstTokenExchangeKeytabRequest build() {
            RefreshUpstTokenExchangeKeytabRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.bds.model.RefreshUpstTokenExchangeKeytabDetails body) {
            refreshUpstTokenExchangeKeytabDetails(body);
            return this;
        }

        /**
         * Build the instance of RefreshUpstTokenExchangeKeytabRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RefreshUpstTokenExchangeKeytabRequest
         */
        public RefreshUpstTokenExchangeKeytabRequest buildWithoutInvocationCallback() {
            RefreshUpstTokenExchangeKeytabRequest request =
                    new RefreshUpstTokenExchangeKeytabRequest();
            request.bdsInstanceId = bdsInstanceId;
            request.identityConfigurationId = identityConfigurationId;
            request.refreshUpstTokenExchangeKeytabDetails = refreshUpstTokenExchangeKeytabDetails;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            request.ifMatch = ifMatch;
            return request;
            // new RefreshUpstTokenExchangeKeytabRequest(bdsInstanceId, identityConfigurationId,
            // refreshUpstTokenExchangeKeytabDetails, opcRetryToken, opcRequestId, ifMatch);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .bdsInstanceId(bdsInstanceId)
                .identityConfigurationId(identityConfigurationId)
                .refreshUpstTokenExchangeKeytabDetails(refreshUpstTokenExchangeKeytabDetails)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId)
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
        sb.append(",bdsInstanceId=").append(String.valueOf(this.bdsInstanceId));
        sb.append(",identityConfigurationId=").append(String.valueOf(this.identityConfigurationId));
        sb.append(",refreshUpstTokenExchangeKeytabDetails=")
                .append(String.valueOf(this.refreshUpstTokenExchangeKeytabDetails));
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
        if (!(o instanceof RefreshUpstTokenExchangeKeytabRequest)) {
            return false;
        }

        RefreshUpstTokenExchangeKeytabRequest other = (RefreshUpstTokenExchangeKeytabRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.bdsInstanceId, other.bdsInstanceId)
                && java.util.Objects.equals(
                        this.identityConfigurationId, other.identityConfigurationId)
                && java.util.Objects.equals(
                        this.refreshUpstTokenExchangeKeytabDetails,
                        other.refreshUpstTokenExchangeKeytabDetails)
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
                        + (this.bdsInstanceId == null ? 43 : this.bdsInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.identityConfigurationId == null
                                ? 43
                                : this.identityConfigurationId.hashCode());
        result =
                (result * PRIME)
                        + (this.refreshUpstTokenExchangeKeytabDetails == null
                                ? 43
                                : this.refreshUpstTokenExchangeKeytabDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
