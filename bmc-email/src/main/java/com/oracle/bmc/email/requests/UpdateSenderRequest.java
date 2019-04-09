/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.email.requests;

import com.oracle.bmc.email.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170907")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class UpdateSenderRequest extends com.oracle.bmc.requests.BmcRequest {

    /**
     * The unique OCID of the sender.
     */
    private String senderId;

    /**
     * update details for sender.
     */
    private UpdateSenderDetails updateSenderDetails;

    /**
     * Used for optimistic concurrency control. In the update or delete call for a resource, set the `if-match`
     * parameter to the value of the etag from a previous get, create, or update response for that resource.  The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * The request ID for tracing from the system
     */
    private String opcRequestId;

    public static class Builder {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;

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
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(UpdateSenderRequest o) {
            senderId(o.getSenderId());
            updateSenderDetails(o.getUpdateSenderDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            return this;
        }

        /**
         * Build the instance of UpdateSenderRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateSenderRequest
         */
        public UpdateSenderRequest build() {
            UpdateSenderRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            return request;
        }
    }
}
