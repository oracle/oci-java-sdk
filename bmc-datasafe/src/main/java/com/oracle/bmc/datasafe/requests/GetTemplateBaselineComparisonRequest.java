/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.requests;

import com.oracle.bmc.datasafe.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/datasafe/GetTemplateBaselineComparisonExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * GetTemplateBaselineComparisonRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
public class GetTemplateBaselineComparisonRequest
        extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the security assessment. */
    private String securityAssessmentId;

    /** The OCID of the security assessment. */
    public String getSecurityAssessmentId() {
        return securityAssessmentId;
    }
    /** The OCID of the security assessment baseline. */
    private String comparisonSecurityAssessmentId;

    /** The OCID of the security assessment baseline. */
    public String getComparisonSecurityAssessmentId() {
        return comparisonSecurityAssessmentId;
    }
    /** A filter to return only items related to a specific target OCID. */
    private String targetId;

    /** A filter to return only items related to a specific target OCID. */
    public String getTargetId() {
        return targetId;
    }
    /** The category of the finding. */
    private String category;

    /** The category of the finding. */
    public String getCategory() {
        return category;
    }
    /**
     * The unique key that identifies the finding. It is a string and unique within a security
     * assessment.
     */
    private String findingKey;

    /**
     * The unique key that identifies the finding. It is a string and unique within a security
     * assessment.
     */
    public String getFindingKey() {
        return findingKey;
    }
    /** Unique identifier for the request. */
    private String opcRequestId;

    /** Unique identifier for the request. */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetTemplateBaselineComparisonRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the security assessment. */
        private String securityAssessmentId = null;

        /**
         * The OCID of the security assessment.
         *
         * @param securityAssessmentId the value to set
         * @return this builder instance
         */
        public Builder securityAssessmentId(String securityAssessmentId) {
            this.securityAssessmentId = securityAssessmentId;
            return this;
        }

        /** The OCID of the security assessment baseline. */
        private String comparisonSecurityAssessmentId = null;

        /**
         * The OCID of the security assessment baseline.
         *
         * @param comparisonSecurityAssessmentId the value to set
         * @return this builder instance
         */
        public Builder comparisonSecurityAssessmentId(String comparisonSecurityAssessmentId) {
            this.comparisonSecurityAssessmentId = comparisonSecurityAssessmentId;
            return this;
        }

        /** A filter to return only items related to a specific target OCID. */
        private String targetId = null;

        /**
         * A filter to return only items related to a specific target OCID.
         *
         * @param targetId the value to set
         * @return this builder instance
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            return this;
        }

        /** The category of the finding. */
        private String category = null;

        /**
         * The category of the finding.
         *
         * @param category the value to set
         * @return this builder instance
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * The unique key that identifies the finding. It is a string and unique within a security
         * assessment.
         */
        private String findingKey = null;

        /**
         * The unique key that identifies the finding. It is a string and unique within a security
         * assessment.
         *
         * @param findingKey the value to set
         * @return this builder instance
         */
        public Builder findingKey(String findingKey) {
            this.findingKey = findingKey;
            return this;
        }

        /** Unique identifier for the request. */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
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
        public Builder copy(GetTemplateBaselineComparisonRequest o) {
            securityAssessmentId(o.getSecurityAssessmentId());
            comparisonSecurityAssessmentId(o.getComparisonSecurityAssessmentId());
            targetId(o.getTargetId());
            category(o.getCategory());
            findingKey(o.getFindingKey());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetTemplateBaselineComparisonRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetTemplateBaselineComparisonRequest
         */
        public GetTemplateBaselineComparisonRequest build() {
            GetTemplateBaselineComparisonRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetTemplateBaselineComparisonRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetTemplateBaselineComparisonRequest
         */
        public GetTemplateBaselineComparisonRequest buildWithoutInvocationCallback() {
            GetTemplateBaselineComparisonRequest request =
                    new GetTemplateBaselineComparisonRequest();
            request.securityAssessmentId = securityAssessmentId;
            request.comparisonSecurityAssessmentId = comparisonSecurityAssessmentId;
            request.targetId = targetId;
            request.category = category;
            request.findingKey = findingKey;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetTemplateBaselineComparisonRequest(securityAssessmentId,
            // comparisonSecurityAssessmentId, targetId, category, findingKey, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .securityAssessmentId(securityAssessmentId)
                .comparisonSecurityAssessmentId(comparisonSecurityAssessmentId)
                .targetId(targetId)
                .category(category)
                .findingKey(findingKey)
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
        sb.append(",securityAssessmentId=").append(String.valueOf(this.securityAssessmentId));
        sb.append(",comparisonSecurityAssessmentId=")
                .append(String.valueOf(this.comparisonSecurityAssessmentId));
        sb.append(",targetId=").append(String.valueOf(this.targetId));
        sb.append(",category=").append(String.valueOf(this.category));
        sb.append(",findingKey=").append(String.valueOf(this.findingKey));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetTemplateBaselineComparisonRequest)) {
            return false;
        }

        GetTemplateBaselineComparisonRequest other = (GetTemplateBaselineComparisonRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.securityAssessmentId, other.securityAssessmentId)
                && java.util.Objects.equals(
                        this.comparisonSecurityAssessmentId, other.comparisonSecurityAssessmentId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.category, other.category)
                && java.util.Objects.equals(this.findingKey, other.findingKey)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.securityAssessmentId == null
                                ? 43
                                : this.securityAssessmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.comparisonSecurityAssessmentId == null
                                ? 43
                                : this.comparisonSecurityAssessmentId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.category == null ? 43 : this.category.hashCode());
        result = (result * PRIME) + (this.findingKey == null ? 43 : this.findingKey.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
