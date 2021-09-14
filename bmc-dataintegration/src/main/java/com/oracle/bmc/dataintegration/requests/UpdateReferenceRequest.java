/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.requests;

import com.oracle.bmc.dataintegration.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/UpdateReferenceExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateReferenceRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.Builder(
    builderClassName = "Builder",
    buildMethodName = "buildWithoutInvocationCallback",
    toBuilder = true
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@lombok.Getter
public class UpdateReferenceRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.dataintegration.model.UpdateReferenceDetails> {

    /**
     * The workspace ID.
     */
    private String workspaceId;

    /**
     * The application key.
     */
    private String applicationKey;

    /**
     * The reference key.
     */
    private String referenceKey;

    /**
     * The details needed to update the references.
     */
    private com.oracle.bmc.dataintegration.model.UpdateReferenceDetails updateReferenceDetails;

    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match} parameter to the value of the {@code etag} from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the {@code etag} you provide matches the resource's current {@code etag} value.
     * When 'if-match' is provided and its value does not exactly match the 'etag' of the resource on the server, the request fails with the 412 response code.
     *
     */
    private String ifMatch;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or server error without risk of executing that same action again.
     *
     */
    private String opcRetryToken;

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.dataintegration.model.UpdateReferenceDetails getBody$() {
        return updateReferenceDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateReferenceRequest,
                    com.oracle.bmc.dataintegration.model.UpdateReferenceDetails> {
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
        public Builder copy(UpdateReferenceRequest o) {
            workspaceId(o.getWorkspaceId());
            applicationKey(o.getApplicationKey());
            referenceKey(o.getReferenceKey());
            updateReferenceDetails(o.getUpdateReferenceDetails());
            opcRequestId(o.getOpcRequestId());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateReferenceRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateReferenceRequest
         */
        public UpdateReferenceRequest build() {
            UpdateReferenceRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.dataintegration.model.UpdateReferenceDetails body) {
            updateReferenceDetails(body);
            return this;
        }
    }
}
