/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.requests;

import com.oracle.bmc.ailanguage.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ailanguage/DetectLanguageEntitiesExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use DetectLanguageEntitiesRequest.
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
public class DetectLanguageEntitiesRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.ailanguage.model.DetectLanguageEntitiesDetails> {

    /**
     * The details to make a Entity detect call.
     *
     */
    private com.oracle.bmc.ailanguage.model.DetectLanguageEntitiesDetails
            detectLanguageEntitiesDetails;

    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * Named Entity Recognition model versions. By default user will get output from V2.1 implementation.
     */
    private com.oracle.bmc.ailanguage.model.NerModelVersion modelVersion;

    /**
     * If this parameter is set to true, you only get PII (Personally identifiable information) entities
     * like PhoneNumber, Email, Person, and so on. Default value is false.
     *
     */
    private Boolean isPii;

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.ailanguage.model.DetectLanguageEntitiesDetails getBody$() {
        return detectLanguageEntitiesDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DetectLanguageEntitiesRequest,
                    com.oracle.bmc.ailanguage.model.DetectLanguageEntitiesDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

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
        public Builder copy(DetectLanguageEntitiesRequest o) {
            detectLanguageEntitiesDetails(o.getDetectLanguageEntitiesDetails());
            opcRequestId(o.getOpcRequestId());
            modelVersion(o.getModelVersion());
            isPii(o.getIsPii());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DetectLanguageEntitiesRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of DetectLanguageEntitiesRequest
         */
        public DetectLanguageEntitiesRequest build() {
            DetectLanguageEntitiesRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.ailanguage.model.DetectLanguageEntitiesDetails body) {
            detectLanguageEntitiesDetails(body);
            return this;
        }
    }
}
