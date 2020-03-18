/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dns.requests;

import com.oracle.bmc.dns.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class ChangeSteeringPolicyCompartmentRequest
        extends com.oracle.bmc.requests.BmcRequest<ChangeSteeringPolicyCompartmentDetails> {

    /**
     * The OCID of the target steering policy.
     */
    private String steeringPolicyId;

    /**
     * Details for moving a steering policy into a different compartment.
     */
    private ChangeSteeringPolicyCompartmentDetails changeSteeringPolicyCompartmentDetails;

    /**
     * The `If-Match` header field makes the request method conditional on the
     * existence of at least one current representation of the target resource,
     * when the field-value is `*`, or having a current representation of the
     * target resource that has an entity-tag matching a member of the list of
     * entity-tags provided in the field-value.
     *
     */
    private String ifMatch;

    /**
     * A token that uniquely identifies a request so it can be retried in case
     * of a timeout or server error without risk of executing that same action
     * again. Retry tokens expire after 24 hours, but can be invalidated before
     * then due to conflicting operations (for example, if a resource has been
     * deleted and purged from the system, then a retry of the original creation
     * request may be rejected).
     *
     */
    private String opcRetryToken;

    /**
     * Unique Oracle-assigned identifier for the request. If you need
     * to contact Oracle about a particular request, please provide
     * the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public ChangeSteeringPolicyCompartmentDetails getBody$() {
        return changeSteeringPolicyCompartmentDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    ChangeSteeringPolicyCompartmentRequest,
                    ChangeSteeringPolicyCompartmentDetails> {
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
        public Builder copy(ChangeSteeringPolicyCompartmentRequest o) {
            steeringPolicyId(o.getSteeringPolicyId());
            changeSteeringPolicyCompartmentDetails(o.getChangeSteeringPolicyCompartmentDetails());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ChangeSteeringPolicyCompartmentRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ChangeSteeringPolicyCompartmentRequest
         */
        public ChangeSteeringPolicyCompartmentRequest build() {
            ChangeSteeringPolicyCompartmentRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(ChangeSteeringPolicyCompartmentDetails body) {
            changeSteeringPolicyCompartmentDetails(body);
            return this;
        }
    }
}
