/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.requests;

import com.oracle.bmc.datascience.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datascience/GetModelCustomMetadatumArtifactContentExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetModelCustomMetadatumArtifactContentRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
public class GetModelCustomMetadatumArtifactContentRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * model.
     */
    private String modelId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * model.
     */
    public String getModelId() {
        return modelId;
    }
    /** The name of the model metadatum in the metadata. */
    private String metadatumKeyName;

    /** The name of the model metadatum in the metadata. */
    public String getMetadatumKeyName() {
        return metadatumKeyName;
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
     * Optional byte range to fetch, as described in [RFC
     * 7233](https://tools.ietf.org/html/rfc7232#section-2.1), section 2.1. Note that only a single
     * range of bytes is supported.
     */
    private com.oracle.bmc.model.Range range;

    /**
     * Optional byte range to fetch, as described in [RFC
     * 7233](https://tools.ietf.org/html/rfc7232#section-2.1), section 2.1. Note that only a single
     * range of bytes is supported.
     */
    public com.oracle.bmc.model.Range getRange() {
        return range;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetModelCustomMetadatumArtifactContentRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * model.
         */
        private String modelId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * model.
         *
         * @param modelId the value to set
         * @return this builder instance
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            return this;
        }

        /** The name of the model metadatum in the metadata. */
        private String metadatumKeyName = null;

        /**
         * The name of the model metadatum in the metadata.
         *
         * @param metadatumKeyName the value to set
         * @return this builder instance
         */
        public Builder metadatumKeyName(String metadatumKeyName) {
            this.metadatumKeyName = metadatumKeyName;
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
         * Optional byte range to fetch, as described in [RFC
         * 7233](https://tools.ietf.org/html/rfc7232#section-2.1), section 2.1. Note that only a
         * single range of bytes is supported.
         */
        private com.oracle.bmc.model.Range range = null;

        /**
         * Optional byte range to fetch, as described in [RFC
         * 7233](https://tools.ietf.org/html/rfc7232#section-2.1), section 2.1. Note that only a
         * single range of bytes is supported.
         *
         * @param range the value to set
         * @return this builder instance
         */
        public Builder range(com.oracle.bmc.model.Range range) {
            this.range = range;
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
        public Builder copy(GetModelCustomMetadatumArtifactContentRequest o) {
            modelId(o.getModelId());
            metadatumKeyName(o.getMetadatumKeyName());
            opcRequestId(o.getOpcRequestId());
            range(o.getRange());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetModelCustomMetadatumArtifactContentRequest as configured by this
         * builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetModelCustomMetadatumArtifactContentRequest
         */
        public GetModelCustomMetadatumArtifactContentRequest build() {
            GetModelCustomMetadatumArtifactContentRequest request =
                    buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetModelCustomMetadatumArtifactContentRequest as configured by this
         * builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetModelCustomMetadatumArtifactContentRequest
         */
        public GetModelCustomMetadatumArtifactContentRequest buildWithoutInvocationCallback() {
            GetModelCustomMetadatumArtifactContentRequest request =
                    new GetModelCustomMetadatumArtifactContentRequest();
            request.modelId = modelId;
            request.metadatumKeyName = metadatumKeyName;
            request.opcRequestId = opcRequestId;
            request.range = range;
            return request;
            // new GetModelCustomMetadatumArtifactContentRequest(modelId, metadatumKeyName,
            // opcRequestId, range);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .modelId(modelId)
                .metadatumKeyName(metadatumKeyName)
                .opcRequestId(opcRequestId)
                .range(range);
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
        sb.append(",modelId=").append(String.valueOf(this.modelId));
        sb.append(",metadatumKeyName=").append(String.valueOf(this.metadatumKeyName));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",range=").append(String.valueOf(this.range));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetModelCustomMetadatumArtifactContentRequest)) {
            return false;
        }

        GetModelCustomMetadatumArtifactContentRequest other =
                (GetModelCustomMetadatumArtifactContentRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.modelId, other.modelId)
                && java.util.Objects.equals(this.metadatumKeyName, other.metadatumKeyName)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.range, other.range);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        result =
                (result * PRIME)
                        + (this.metadatumKeyName == null ? 43 : this.metadatumKeyName.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.range == null ? 43 : this.range.hashCode());
        return result;
    }
}
