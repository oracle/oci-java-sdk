/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.requests;

import com.oracle.bmc.datacatalog.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datacatalog/RecommendationsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use RecommendationsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
public class RecommendationsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** Unique catalog identifier. */
    private String catalogId;

    /** Unique catalog identifier. */
    public String getCatalogId() {
        return catalogId;
    }
    /** A filter used to return only recommendations of the specified type. */
    private java.util.List<com.oracle.bmc.datacatalog.model.RecommendationType> recommendationType;

    /** A filter used to return only recommendations of the specified type. */
    public java.util.List<com.oracle.bmc.datacatalog.model.RecommendationType>
            getRecommendationType() {
        return recommendationType;
    }
    /**
     * A filter used to provide the unique identifier of the source object, for which a list of
     * recommendations will be returned for review.
     */
    private String sourceObjectKey;

    /**
     * A filter used to provide the unique identifier of the source object, for which a list of
     * recommendations will be returned for review.
     */
    public String getSourceObjectKey() {
        return sourceObjectKey;
    }
    /**
     * A filter used to provide the type of the source object, for which a list of recommendations
     * will be returned for review.
     */
    private com.oracle.bmc.datacatalog.model.RecommendationResourceType sourceObjectType;

    /**
     * A filter used to provide the type of the source object, for which a list of recommendations
     * will be returned for review.
     */
    public com.oracle.bmc.datacatalog.model.RecommendationResourceType getSourceObjectType() {
        return sourceObjectType;
    }
    /** A filter used to return only recommendations having the requested status. */
    private com.oracle.bmc.datacatalog.model.RecommendationStatus recommendationStatus;

    /** A filter used to return only recommendations having the requested status. */
    public com.oracle.bmc.datacatalog.model.RecommendationStatus getRecommendationStatus() {
        return recommendationStatus;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RecommendationsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** Unique catalog identifier. */
        private String catalogId = null;

        /**
         * Unique catalog identifier.
         *
         * @param catalogId the value to set
         * @return this builder instance
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /** A filter used to return only recommendations of the specified type. */
        private java.util.List<com.oracle.bmc.datacatalog.model.RecommendationType>
                recommendationType = null;

        /**
         * A filter used to return only recommendations of the specified type.
         *
         * @param recommendationType the value to set
         * @return this builder instance
         */
        public Builder recommendationType(
                java.util.List<com.oracle.bmc.datacatalog.model.RecommendationType>
                        recommendationType) {
            this.recommendationType = recommendationType;
            return this;
        }

        /**
         * Singular setter. A filter used to return only recommendations of the specified type.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder recommendationType(RecommendationType singularValue) {
            return this.recommendationType(java.util.Arrays.asList(singularValue));
        }

        /**
         * A filter used to provide the unique identifier of the source object, for which a list of
         * recommendations will be returned for review.
         */
        private String sourceObjectKey = null;

        /**
         * A filter used to provide the unique identifier of the source object, for which a list of
         * recommendations will be returned for review.
         *
         * @param sourceObjectKey the value to set
         * @return this builder instance
         */
        public Builder sourceObjectKey(String sourceObjectKey) {
            this.sourceObjectKey = sourceObjectKey;
            return this;
        }

        /**
         * A filter used to provide the type of the source object, for which a list of
         * recommendations will be returned for review.
         */
        private com.oracle.bmc.datacatalog.model.RecommendationResourceType sourceObjectType = null;

        /**
         * A filter used to provide the type of the source object, for which a list of
         * recommendations will be returned for review.
         *
         * @param sourceObjectType the value to set
         * @return this builder instance
         */
        public Builder sourceObjectType(
                com.oracle.bmc.datacatalog.model.RecommendationResourceType sourceObjectType) {
            this.sourceObjectType = sourceObjectType;
            return this;
        }

        /** A filter used to return only recommendations having the requested status. */
        private com.oracle.bmc.datacatalog.model.RecommendationStatus recommendationStatus = null;

        /**
         * A filter used to return only recommendations having the requested status.
         *
         * @param recommendationStatus the value to set
         * @return this builder instance
         */
        public Builder recommendationStatus(
                com.oracle.bmc.datacatalog.model.RecommendationStatus recommendationStatus) {
            this.recommendationStatus = recommendationStatus;
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
        public Builder copy(RecommendationsRequest o) {
            catalogId(o.getCatalogId());
            recommendationType(o.getRecommendationType());
            sourceObjectKey(o.getSourceObjectKey());
            sourceObjectType(o.getSourceObjectType());
            recommendationStatus(o.getRecommendationStatus());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RecommendationsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of RecommendationsRequest
         */
        public RecommendationsRequest build() {
            RecommendationsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of RecommendationsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of RecommendationsRequest
         */
        public RecommendationsRequest buildWithoutInvocationCallback() {
            RecommendationsRequest request = new RecommendationsRequest();
            request.catalogId = catalogId;
            request.recommendationType = recommendationType;
            request.sourceObjectKey = sourceObjectKey;
            request.sourceObjectType = sourceObjectType;
            request.recommendationStatus = recommendationStatus;
            request.opcRequestId = opcRequestId;
            return request;
            // new RecommendationsRequest(catalogId, recommendationType, sourceObjectKey,
            // sourceObjectType, recommendationStatus, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .catalogId(catalogId)
                .recommendationType(recommendationType)
                .sourceObjectKey(sourceObjectKey)
                .sourceObjectType(sourceObjectType)
                .recommendationStatus(recommendationStatus)
                .opcRequestId(opcRequestId);
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
        sb.append(",catalogId=").append(String.valueOf(this.catalogId));
        sb.append(",recommendationType=").append(String.valueOf(this.recommendationType));
        sb.append(",sourceObjectKey=").append(String.valueOf(this.sourceObjectKey));
        sb.append(",sourceObjectType=").append(String.valueOf(this.sourceObjectType));
        sb.append(",recommendationStatus=").append(String.valueOf(this.recommendationStatus));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecommendationsRequest)) {
            return false;
        }

        RecommendationsRequest other = (RecommendationsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.catalogId, other.catalogId)
                && java.util.Objects.equals(this.recommendationType, other.recommendationType)
                && java.util.Objects.equals(this.sourceObjectKey, other.sourceObjectKey)
                && java.util.Objects.equals(this.sourceObjectType, other.sourceObjectType)
                && java.util.Objects.equals(this.recommendationStatus, other.recommendationStatus)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.catalogId == null ? 43 : this.catalogId.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendationType == null
                                ? 43
                                : this.recommendationType.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceObjectKey == null ? 43 : this.sourceObjectKey.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceObjectType == null ? 43 : this.sourceObjectType.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendationStatus == null
                                ? 43
                                : this.recommendationStatus.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
