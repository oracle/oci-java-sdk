/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot.requests;

import com.oracle.bmc.iot.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/iot/ChangeIotDomainDataRetentionPeriodExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * ChangeIotDomainDataRetentionPeriodRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250531")
public class ChangeIotDomainDataRetentionPeriodRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.iot.model.ChangeIotDomainDataRetentionPeriodDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IoT
     * domain.
     */
    private String iotDomainId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the IoT
     * domain.
     */
    public String getIotDomainId() {
        return iotDomainId;
    }
    /** Details for changing data retention period of IoT domain data. */
    private com.oracle.bmc.iot.model.ChangeIotDomainDataRetentionPeriodDetails
            changeIotDomainDataRetentionPeriodDetails;

    /** Details for changing data retention period of IoT domain data. */
    public com.oracle.bmc.iot.model.ChangeIotDomainDataRetentionPeriodDetails
            getChangeIotDomainDataRetentionPeriodDetails() {
        return changeIotDomainDataRetentionPeriodDetails;
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
     * particular request, provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, provide the request ID.
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
    public com.oracle.bmc.iot.model.ChangeIotDomainDataRetentionPeriodDetails getBody$() {
        return changeIotDomainDataRetentionPeriodDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeIotDomainDataRetentionPeriodRequest,
                    com.oracle.bmc.iot.model.ChangeIotDomainDataRetentionPeriodDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * IoT domain.
         */
        private String iotDomainId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * IoT domain.
         *
         * @param iotDomainId the value to set
         * @return this builder instance
         */
        public Builder iotDomainId(String iotDomainId) {
            this.iotDomainId = iotDomainId;
            return this;
        }

        /** Details for changing data retention period of IoT domain data. */
        private com.oracle.bmc.iot.model.ChangeIotDomainDataRetentionPeriodDetails
                changeIotDomainDataRetentionPeriodDetails = null;

        /**
         * Details for changing data retention period of IoT domain data.
         *
         * @param changeIotDomainDataRetentionPeriodDetails the value to set
         * @return this builder instance
         */
        public Builder changeIotDomainDataRetentionPeriodDetails(
                com.oracle.bmc.iot.model.ChangeIotDomainDataRetentionPeriodDetails
                        changeIotDomainDataRetentionPeriodDetails) {
            this.changeIotDomainDataRetentionPeriodDetails =
                    changeIotDomainDataRetentionPeriodDetails;
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
         * particular request, provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, provide the request ID.
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
        public Builder copy(ChangeIotDomainDataRetentionPeriodRequest o) {
            iotDomainId(o.getIotDomainId());
            changeIotDomainDataRetentionPeriodDetails(
                    o.getChangeIotDomainDataRetentionPeriodDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeIotDomainDataRetentionPeriodRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of ChangeIotDomainDataRetentionPeriodRequest
         */
        public ChangeIotDomainDataRetentionPeriodRequest build() {
            ChangeIotDomainDataRetentionPeriodRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.iot.model.ChangeIotDomainDataRetentionPeriodDetails body) {
            changeIotDomainDataRetentionPeriodDetails(body);
            return this;
        }

        /**
         * Build the instance of ChangeIotDomainDataRetentionPeriodRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of ChangeIotDomainDataRetentionPeriodRequest
         */
        public ChangeIotDomainDataRetentionPeriodRequest buildWithoutInvocationCallback() {
            ChangeIotDomainDataRetentionPeriodRequest request =
                    new ChangeIotDomainDataRetentionPeriodRequest();
            request.iotDomainId = iotDomainId;
            request.changeIotDomainDataRetentionPeriodDetails =
                    changeIotDomainDataRetentionPeriodDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcRetryToken = opcRetryToken;
            return request;
            // new ChangeIotDomainDataRetentionPeriodRequest(iotDomainId,
            // changeIotDomainDataRetentionPeriodDetails, ifMatch, opcRequestId, opcRetryToken);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .iotDomainId(iotDomainId)
                .changeIotDomainDataRetentionPeriodDetails(
                        changeIotDomainDataRetentionPeriodDetails)
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
        sb.append(",iotDomainId=").append(String.valueOf(this.iotDomainId));
        sb.append(",changeIotDomainDataRetentionPeriodDetails=")
                .append(String.valueOf(this.changeIotDomainDataRetentionPeriodDetails));
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
        if (!(o instanceof ChangeIotDomainDataRetentionPeriodRequest)) {
            return false;
        }

        ChangeIotDomainDataRetentionPeriodRequest other =
                (ChangeIotDomainDataRetentionPeriodRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.iotDomainId, other.iotDomainId)
                && java.util.Objects.equals(
                        this.changeIotDomainDataRetentionPeriodDetails,
                        other.changeIotDomainDataRetentionPeriodDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.iotDomainId == null ? 43 : this.iotDomainId.hashCode());
        result =
                (result * PRIME)
                        + (this.changeIotDomainDataRetentionPeriodDetails == null
                                ? 43
                                : this.changeIotDomainDataRetentionPeriodDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        return result;
    }
}
