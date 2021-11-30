/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmcontrolplane.requests;

import com.oracle.bmc.apmcontrolplane.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmcontrolplane/GenerateDataKeysExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GenerateDataKeysRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class GenerateDataKeysRequest
        extends com.oracle.bmc.requests.BmcRequest<
                java.util.List<com.oracle.bmc.apmcontrolplane.model.GenerateDataKeyDetails>> {

    /**
     * List of new Data Keys to be generated.
     */
    private java.util.List<com.oracle.bmc.apmcontrolplane.model.GenerateDataKeyDetails>
            generateDataKeysListDetails;

    /**
     * The OCID of the APM domain
     */
    private String apmDomainId;

    /**
     * For optimistic concurrency control. Set the {@code if-match} parameter
     * to the value of the etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * The client request ID for tracing.
     */
    private String opcRequestId;

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public java.util.List<com.oracle.bmc.apmcontrolplane.model.GenerateDataKeyDetails> getBody$() {
        return generateDataKeysListDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GenerateDataKeysRequest,
                    java.util.List<com.oracle.bmc.apmcontrolplane.model.GenerateDataKeyDetails>> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<com.oracle.bmc.apmcontrolplane.model.GenerateDataKeyDetails>
                generateDataKeysListDetails = null;

        /**
         * List of new Data Keys to be generated.
         * @return this builder instance
         */
        public Builder generateDataKeysListDetails(
                java.util.List<com.oracle.bmc.apmcontrolplane.model.GenerateDataKeyDetails>
                        generateDataKeysListDetails) {
            this.generateDataKeysListDetails = generateDataKeysListDetails;
            return this;
        }

        /**
         * Singular setter. List of new Data Keys to be generated.
         * @return this builder instance
         */
        public Builder generateDataKeysListDetails(
                com.oracle.bmc.apmcontrolplane.model.GenerateDataKeyDetails singularValue) {
            return this.generateDataKeysListDetails(java.util.Arrays.asList(singularValue));
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
        public Builder copy(GenerateDataKeysRequest o) {
            generateDataKeysListDetails(o.getGenerateDataKeysListDetails());
            apmDomainId(o.getApmDomainId());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GenerateDataKeysRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GenerateDataKeysRequest
         */
        public GenerateDataKeysRequest build() {
            GenerateDataKeysRequest request = buildWithoutInvocationCallback();
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
                java.util.List<com.oracle.bmc.apmcontrolplane.model.GenerateDataKeyDetails> body) {
            generateDataKeysListDetails(body);
            return this;
        }
    }
}
