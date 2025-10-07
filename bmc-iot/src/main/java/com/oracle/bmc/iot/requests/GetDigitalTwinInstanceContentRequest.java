/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot.requests;

import com.oracle.bmc.iot.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/iot/GetDigitalTwinInstanceContentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetDigitalTwinInstanceContentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250531")
public class GetDigitalTwinInstanceContentRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of digital
     * twin instance.
     */
    private String digitalTwinInstanceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of digital
     * twin instance.
     */
    public String getDigitalTwinInstanceId() {
        return digitalTwinInstanceId;
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
    /** If set to true , digital twin instance metadata is included in the response. */
    private Boolean shouldIncludeMetadata;

    /** If set to true , digital twin instance metadata is included in the response. */
    public Boolean getShouldIncludeMetadata() {
        return shouldIncludeMetadata;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetDigitalTwinInstanceContentRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * digital twin instance.
         */
        private String digitalTwinInstanceId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
         * digital twin instance.
         *
         * @param digitalTwinInstanceId the value to set
         * @return this builder instance
         */
        public Builder digitalTwinInstanceId(String digitalTwinInstanceId) {
            this.digitalTwinInstanceId = digitalTwinInstanceId;
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

        /** If set to true , digital twin instance metadata is included in the response. */
        private Boolean shouldIncludeMetadata = null;

        /**
         * If set to true , digital twin instance metadata is included in the response.
         *
         * @param shouldIncludeMetadata the value to set
         * @return this builder instance
         */
        public Builder shouldIncludeMetadata(Boolean shouldIncludeMetadata) {
            this.shouldIncludeMetadata = shouldIncludeMetadata;
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
        public Builder copy(GetDigitalTwinInstanceContentRequest o) {
            digitalTwinInstanceId(o.getDigitalTwinInstanceId());
            opcRequestId(o.getOpcRequestId());
            shouldIncludeMetadata(o.getShouldIncludeMetadata());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetDigitalTwinInstanceContentRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetDigitalTwinInstanceContentRequest
         */
        public GetDigitalTwinInstanceContentRequest build() {
            GetDigitalTwinInstanceContentRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetDigitalTwinInstanceContentRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetDigitalTwinInstanceContentRequest
         */
        public GetDigitalTwinInstanceContentRequest buildWithoutInvocationCallback() {
            GetDigitalTwinInstanceContentRequest request =
                    new GetDigitalTwinInstanceContentRequest();
            request.digitalTwinInstanceId = digitalTwinInstanceId;
            request.opcRequestId = opcRequestId;
            request.shouldIncludeMetadata = shouldIncludeMetadata;
            return request;
            // new GetDigitalTwinInstanceContentRequest(digitalTwinInstanceId, opcRequestId,
            // shouldIncludeMetadata);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .digitalTwinInstanceId(digitalTwinInstanceId)
                .opcRequestId(opcRequestId)
                .shouldIncludeMetadata(shouldIncludeMetadata);
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
        sb.append(",digitalTwinInstanceId=").append(String.valueOf(this.digitalTwinInstanceId));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",shouldIncludeMetadata=").append(String.valueOf(this.shouldIncludeMetadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetDigitalTwinInstanceContentRequest)) {
            return false;
        }

        GetDigitalTwinInstanceContentRequest other = (GetDigitalTwinInstanceContentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.digitalTwinInstanceId, other.digitalTwinInstanceId)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(
                        this.shouldIncludeMetadata, other.shouldIncludeMetadata);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.digitalTwinInstanceId == null
                                ? 43
                                : this.digitalTwinInstanceId.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldIncludeMetadata == null
                                ? 43
                                : this.shouldIncludeMetadata.hashCode());
        return result;
    }
}
