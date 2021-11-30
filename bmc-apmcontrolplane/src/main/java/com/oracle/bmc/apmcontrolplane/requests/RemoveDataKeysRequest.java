/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmcontrolplane.requests;

import com.oracle.bmc.apmcontrolplane.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmcontrolplane/RemoveDataKeysExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use RemoveDataKeysRequest.
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
public class RemoveDataKeysRequest
        extends com.oracle.bmc.requests.BmcRequest<
                java.util.List<com.oracle.bmc.apmcontrolplane.model.RemoveDataKeyDetails>> {

    /**
     * The OCID of the APM domain
     */
    private String apmDomainId;

    /**
     * List of Data Keys to be removed.
     */
    private java.util.List<com.oracle.bmc.apmcontrolplane.model.RemoveDataKeyDetails>
            removeDataKeysListDetails;

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
    public java.util.List<com.oracle.bmc.apmcontrolplane.model.RemoveDataKeyDetails> getBody$() {
        return removeDataKeysListDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    RemoveDataKeysRequest,
                    java.util.List<com.oracle.bmc.apmcontrolplane.model.RemoveDataKeyDetails>> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private java.util.List<com.oracle.bmc.apmcontrolplane.model.RemoveDataKeyDetails>
                removeDataKeysListDetails = null;

        /**
         * List of Data Keys to be removed.
         * @return this builder instance
         */
        public Builder removeDataKeysListDetails(
                java.util.List<com.oracle.bmc.apmcontrolplane.model.RemoveDataKeyDetails>
                        removeDataKeysListDetails) {
            this.removeDataKeysListDetails = removeDataKeysListDetails;
            return this;
        }

        /**
         * Singular setter. List of Data Keys to be removed.
         * @return this builder instance
         */
        public Builder removeDataKeysListDetails(
                com.oracle.bmc.apmcontrolplane.model.RemoveDataKeyDetails singularValue) {
            return this.removeDataKeysListDetails(java.util.Arrays.asList(singularValue));
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
        public Builder copy(RemoveDataKeysRequest o) {
            apmDomainId(o.getApmDomainId());
            removeDataKeysListDetails(o.getRemoveDataKeysListDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of RemoveDataKeysRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of RemoveDataKeysRequest
         */
        public RemoveDataKeysRequest build() {
            RemoveDataKeysRequest request = buildWithoutInvocationCallback();
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
                java.util.List<com.oracle.bmc.apmcontrolplane.model.RemoveDataKeyDetails> body) {
            removeDataKeysListDetails(body);
            return this;
        }
    }
}
