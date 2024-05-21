/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.requests;

import com.oracle.bmc.oda.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/GetOdaInstanceAttachmentExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetOdaInstanceAttachmentRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class GetOdaInstanceAttachmentRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * Unique Digital Assistant instance identifier.
     */
    private String odaInstanceId;

    /**
     * Unique Digital Assistant instance identifier.
     */
    public String getOdaInstanceId() {
        return odaInstanceId;
    }
    /**
     * Unique Digital Assistant instance attachment identifier.
     */
    private String attachmentId;

    /**
     * Unique Digital Assistant instance attachment identifier.
     */
    public String getAttachmentId() {
        return attachmentId;
    }
    /**
     * Whether to send attachment owner info during get/list call.
     */
    private Boolean includeOwnerMetadata;

    /**
     * Whether to send attachment owner info during get/list call.
     */
    public Boolean getIncludeOwnerMetadata() {
        return includeOwnerMetadata;
    }
    /**
     * The client request ID for tracing. This value is included in the opc-request-id response header.
     */
    private String opcRequestId;

    /**
     * The client request ID for tracing. This value is included in the opc-request-id response header.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetOdaInstanceAttachmentRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Unique Digital Assistant instance identifier.
         */
        private String odaInstanceId = null;

        /**
         * Unique Digital Assistant instance identifier.
         * @param odaInstanceId the value to set
         * @return this builder instance
         */
        public Builder odaInstanceId(String odaInstanceId) {
            this.odaInstanceId = odaInstanceId;
            return this;
        }

        /**
         * Unique Digital Assistant instance attachment identifier.
         */
        private String attachmentId = null;

        /**
         * Unique Digital Assistant instance attachment identifier.
         * @param attachmentId the value to set
         * @return this builder instance
         */
        public Builder attachmentId(String attachmentId) {
            this.attachmentId = attachmentId;
            return this;
        }

        /**
         * Whether to send attachment owner info during get/list call.
         */
        private Boolean includeOwnerMetadata = null;

        /**
         * Whether to send attachment owner info during get/list call.
         * @param includeOwnerMetadata the value to set
         * @return this builder instance
         */
        public Builder includeOwnerMetadata(Boolean includeOwnerMetadata) {
            this.includeOwnerMetadata = includeOwnerMetadata;
            return this;
        }

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response header.
         */
        private String opcRequestId = null;

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response header.
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
        public Builder copy(GetOdaInstanceAttachmentRequest o) {
            odaInstanceId(o.getOdaInstanceId());
            attachmentId(o.getAttachmentId());
            includeOwnerMetadata(o.getIncludeOwnerMetadata());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetOdaInstanceAttachmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetOdaInstanceAttachmentRequest
         */
        public GetOdaInstanceAttachmentRequest build() {
            GetOdaInstanceAttachmentRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetOdaInstanceAttachmentRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetOdaInstanceAttachmentRequest
         */
        public GetOdaInstanceAttachmentRequest buildWithoutInvocationCallback() {
            GetOdaInstanceAttachmentRequest request = new GetOdaInstanceAttachmentRequest();
            request.odaInstanceId = odaInstanceId;
            request.attachmentId = attachmentId;
            request.includeOwnerMetadata = includeOwnerMetadata;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetOdaInstanceAttachmentRequest(odaInstanceId, attachmentId, includeOwnerMetadata, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .odaInstanceId(odaInstanceId)
                .attachmentId(attachmentId)
                .includeOwnerMetadata(includeOwnerMetadata)
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
        sb.append(",odaInstanceId=").append(String.valueOf(this.odaInstanceId));
        sb.append(",attachmentId=").append(String.valueOf(this.attachmentId));
        sb.append(",includeOwnerMetadata=").append(String.valueOf(this.includeOwnerMetadata));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetOdaInstanceAttachmentRequest)) {
            return false;
        }

        GetOdaInstanceAttachmentRequest other = (GetOdaInstanceAttachmentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.odaInstanceId, other.odaInstanceId)
                && java.util.Objects.equals(this.attachmentId, other.attachmentId)
                && java.util.Objects.equals(this.includeOwnerMetadata, other.includeOwnerMetadata)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.odaInstanceId == null ? 43 : this.odaInstanceId.hashCode());
        result = (result * PRIME) + (this.attachmentId == null ? 43 : this.attachmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.includeOwnerMetadata == null
                                ? 43
                                : this.includeOwnerMetadata.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
