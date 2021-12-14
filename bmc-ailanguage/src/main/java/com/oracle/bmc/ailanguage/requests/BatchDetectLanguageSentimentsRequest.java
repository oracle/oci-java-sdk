/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.requests;

import com.oracle.bmc.ailanguage.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ailanguage/BatchDetectLanguageSentimentsExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use BatchDetectLanguageSentimentsRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class BatchDetectLanguageSentimentsRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.ailanguage.model.BatchDetectLanguageSentimentsDetails> {

    /**
     * The details to make sentiment detect call.
     *
     */
    private com.oracle.bmc.ailanguage.model.BatchDetectLanguageSentimentsDetails
            batchDetectLanguageSentimentsDetails;

    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * Set this parameter for sentence and aspect level sentiment analysis.
     * Allowed values are:
     *    - ASPECT
     *    - SENTENCE
     *
     */
    private java.util.List<Level> level;

    /**
     * Set this parameter for sentence and aspect level sentiment analysis.
     * Allowed values are:
     * - ASPECT
     * - SENTENCE
     *
     **/
    public enum Level {
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
     * Alternative accessor for the body parameter.
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
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<Level> level = null;

        /**
         * Set this parameter for sentence and aspect level sentiment analysis.
         * Allowed values are:
         *    - ASPECT
         *    - SENTENCE
         *
         * @return this builder instance
         */
        public Builder level(java.util.List<Level> level) {
            this.level = level;
            return this;
        }

        /**
         * Singular setter. Set this parameter for sentence and aspect level sentiment analysis.
         * Allowed values are:
         *    - ASPECT
         *    - SENTENCE
         *
         * @return this builder instance
         */
        public Builder level(Level singularValue) {
            return this.level(java.util.Arrays.asList(singularValue));
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
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
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
         * @param body the body parameter
         * @return this builder instance
         */
        @com.oracle.bmc.InternalSdk
        public Builder body$(
                com.oracle.bmc.ailanguage.model.BatchDetectLanguageSentimentsDetails body) {
            batchDetectLanguageSentimentsDetails(body);
            return this;
        }
    }
}
