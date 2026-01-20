/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.requests;

import com.oracle.bmc.ailanguage.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ailanguage/BatchDetectLanguageSentimentsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use
 * BatchDetectLanguageSentimentsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
public class BatchDetectLanguageSentimentsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.ailanguage.model.BatchDetectLanguageSentimentsDetails> {

    /** The details to make sentiment detect call. */
    private com.oracle.bmc.ailanguage.model.BatchDetectLanguageSentimentsDetails
            batchDetectLanguageSentimentsDetails;

    /** The details to make sentiment detect call. */
    public com.oracle.bmc.ailanguage.model.BatchDetectLanguageSentimentsDetails
            getBatchDetectLanguageSentimentsDetails() {
        return batchDetectLanguageSentimentsDetails;
    }
    /** The client request ID for tracing. */
    private String opcRequestId;

    /** The client request ID for tracing. */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Set this parameter for sentence and aspect level sentiment analysis. Allowed values are: -
     * ASPECT - SENTENCE
     */
    private java.util.List<Level> level;

    /**
     * Set this parameter for sentence and aspect level sentiment analysis. Allowed values are: -
     * ASPECT - SENTENCE
     */
    public enum Level implements com.oracle.bmc.http.internal.BmcEnum {
        Aspect("ASPECT"),
        Sentence("SENTENCE"),
        ;

        private final String value;
        private static java.util.Map<String, Level> map;

        static {
            map = new java.util.HashMap<>();
            for (Level v : Level.values()) {
                map.put(v.getValue(), v);
            }
        }

        Level(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Level create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Level: " + key);
        }
    };

    /**
     * Set this parameter for sentence and aspect level sentiment analysis. Allowed values are: -
     * ASPECT - SENTENCE
     */
    public java.util.List<Level> getLevel() {
        return level;
    }

    /**
     * Alternative accessor for the body parameter.
     *
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.ailanguage.model.BatchDetectLanguageSentimentsDetails getBody$() {
        return batchDetectLanguageSentimentsDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    BatchDetectLanguageSentimentsRequest,
                    com.oracle.bmc.ailanguage.model.BatchDetectLanguageSentimentsDetails> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The details to make sentiment detect call. */
        private com.oracle.bmc.ailanguage.model.BatchDetectLanguageSentimentsDetails
                batchDetectLanguageSentimentsDetails = null;

        /**
         * The details to make sentiment detect call.
         *
         * @param batchDetectLanguageSentimentsDetails the value to set
         * @return this builder instance
         */
        public Builder batchDetectLanguageSentimentsDetails(
                com.oracle.bmc.ailanguage.model.BatchDetectLanguageSentimentsDetails
                        batchDetectLanguageSentimentsDetails) {
            this.batchDetectLanguageSentimentsDetails = batchDetectLanguageSentimentsDetails;
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
         * Set this parameter for sentence and aspect level sentiment analysis. Allowed values are:
         * - ASPECT - SENTENCE
         */
        private java.util.List<Level> level = null;

        /**
         * Set this parameter for sentence and aspect level sentiment analysis. Allowed values are:
         * - ASPECT - SENTENCE
         *
         * @param level the value to set
         * @return this builder instance
         */
        public Builder level(java.util.List<Level> level) {
            this.level = level;
            return this;
        }

        /**
         * Singular setter. Set this parameter for sentence and aspect level sentiment analysis.
         * Allowed values are: - ASPECT - SENTENCE
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder level(Level singularValue) {
            return this.level(java.util.Arrays.asList(singularValue));
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
        public Builder copy(BatchDetectLanguageSentimentsRequest o) {
            batchDetectLanguageSentimentsDetails(o.getBatchDetectLanguageSentimentsDetails());
            opcRequestId(o.getOpcRequestId());
            level(o.getLevel());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of BatchDetectLanguageSentimentsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of BatchDetectLanguageSentimentsRequest
         */
        public BatchDetectLanguageSentimentsRequest build() {
            BatchDetectLanguageSentimentsRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.ailanguage.model.BatchDetectLanguageSentimentsDetails body) {
            batchDetectLanguageSentimentsDetails(body);
            return this;
        }

        /**
         * Build the instance of BatchDetectLanguageSentimentsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of BatchDetectLanguageSentimentsRequest
         */
        public BatchDetectLanguageSentimentsRequest buildWithoutInvocationCallback() {
            BatchDetectLanguageSentimentsRequest request =
                    new BatchDetectLanguageSentimentsRequest();
            request.batchDetectLanguageSentimentsDetails = batchDetectLanguageSentimentsDetails;
            request.opcRequestId = opcRequestId;
            request.level = level;
            return request;
            // new BatchDetectLanguageSentimentsRequest(batchDetectLanguageSentimentsDetails,
            // opcRequestId, level);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .batchDetectLanguageSentimentsDetails(batchDetectLanguageSentimentsDetails)
                .opcRequestId(opcRequestId)
                .level(level);
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
        sb.append(",batchDetectLanguageSentimentsDetails=")
                .append(String.valueOf(this.batchDetectLanguageSentimentsDetails));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",level=").append(String.valueOf(this.level));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BatchDetectLanguageSentimentsRequest)) {
            return false;
        }

        BatchDetectLanguageSentimentsRequest other = (BatchDetectLanguageSentimentsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(
                        this.batchDetectLanguageSentimentsDetails,
                        other.batchDetectLanguageSentimentsDetails)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.level, other.level);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.batchDetectLanguageSentimentsDetails == null
                                ? 43
                                : this.batchDetectLanguageSentimentsDetails.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.level == null ? 43 : this.level.hashCode());
        return result;
    }
}
