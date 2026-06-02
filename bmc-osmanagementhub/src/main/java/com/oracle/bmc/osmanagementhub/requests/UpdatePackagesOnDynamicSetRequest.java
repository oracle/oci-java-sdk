/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.requests;

import com.oracle.bmc.osmanagementhub.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/osmanagementhub/UpdatePackagesOnDynamicSetExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdatePackagesOnDynamicSetRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
public class UpdatePackagesOnDynamicSetRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.osmanagementhub.model.UpdatePackagesOnDynamicSetDetails> {

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the dynamic set. This filter returns resources associated with this dynamic set.
     */
    private String dynamicSetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the dynamic set. This filter returns resources associated with this dynamic set.
     */
    public String getDynamicSetId() {
        return dynamicSetId;
    }
    /**
     * Details about packages to be updated on a dynamic set.
     */
    private com.oracle.bmc.osmanagementhub.model.UpdatePackagesOnDynamicSetDetails
            updatePackagesOnDynamicSetDetails;

    /**
     * Details about packages to be updated on a dynamic set.
     */
    public com.oracle.bmc.osmanagementhub.model.UpdatePackagesOnDynamicSetDetails
            getUpdatePackagesOnDynamicSetDetails() {
        return updatePackagesOnDynamicSetDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call
     * for a resource, set the {@code if-match} parameter to the value of the
     * etag from a previous GET or POST response for that resource.
     * The resource will be updated or deleted only if the etag you
     * provide matches the resource's current etag value.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    private String opcRetryToken;

    /**
     * A token that uniquely identifies a request so it can be retried in case of a timeout or
     * server error without risk of executing that same action again. Retry tokens expire after 24
     * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
     * has been deleted and purged from the system, then a retry of the original creation request
     * might be rejected.
     *
     */
    public String getOpcRetryToken() {
        return opcRetryToken;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.osmanagementhub.model.UpdatePackagesOnDynamicSetDetails getBody$() {
        return updatePackagesOnDynamicSetDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdatePackagesOnDynamicSetRequest,
                    com.oracle.bmc.osmanagementhub.model.UpdatePackagesOnDynamicSetDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the dynamic set. This filter returns resources associated with this dynamic set.
         */
        private String dynamicSetId = null;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the dynamic set. This filter returns resources associated with this dynamic set.
         * @param dynamicSetId the value to set
         * @return this builder instance
         */
        public Builder dynamicSetId(String dynamicSetId) {
            this.dynamicSetId = dynamicSetId;
            return this;
        }

        /**
         * Details about packages to be updated on a dynamic set.
         */
        private com.oracle.bmc.osmanagementhub.model.UpdatePackagesOnDynamicSetDetails
                updatePackagesOnDynamicSetDetails = null;

        /**
         * Details about packages to be updated on a dynamic set.
         * @param updatePackagesOnDynamicSetDetails the value to set
         * @return this builder instance
         */
        public Builder updatePackagesOnDynamicSetDetails(
                com.oracle.bmc.osmanagementhub.model.UpdatePackagesOnDynamicSetDetails
                        updatePackagesOnDynamicSetDetails) {
            this.updatePackagesOnDynamicSetDetails = updatePackagesOnDynamicSetDetails;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         */
        private String opcRetryToken = null;

        /**
         * A token that uniquely identifies a request so it can be retried in case of a timeout or
         * server error without risk of executing that same action again. Retry tokens expire after 24
         * hours, but can be invalidated before then due to conflicting operations. For example, if a resource
         * has been deleted and purged from the system, then a retry of the original creation request
         * might be rejected.
         *
         * @param opcRetryToken the value to set
         * @return this builder instance
         */
        public Builder opcRetryToken(String opcRetryToken) {
            this.opcRetryToken = opcRetryToken;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular request, please provide the request ID.
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
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
        public Builder copy(UpdatePackagesOnDynamicSetRequest o) {
            dynamicSetId(o.getDynamicSetId());
            updatePackagesOnDynamicSetDetails(o.getUpdatePackagesOnDynamicSetDetails());
            ifMatch(o.getIfMatch());
            opcRetryToken(o.getOpcRetryToken());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdatePackagesOnDynamicSetRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdatePackagesOnDynamicSetRequest
         */
        public UpdatePackagesOnDynamicSetRequest build() {
            UpdatePackagesOnDynamicSetRequest request = buildWithoutInvocationCallback();
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
                com.oracle.bmc.osmanagementhub.model.UpdatePackagesOnDynamicSetDetails body) {
            updatePackagesOnDynamicSetDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdatePackagesOnDynamicSetRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdatePackagesOnDynamicSetRequest
         */
        public UpdatePackagesOnDynamicSetRequest buildWithoutInvocationCallback() {
            UpdatePackagesOnDynamicSetRequest request = new UpdatePackagesOnDynamicSetRequest();
            request.dynamicSetId = dynamicSetId;
            request.updatePackagesOnDynamicSetDetails = updatePackagesOnDynamicSetDetails;
            request.ifMatch = ifMatch;
            request.opcRetryToken = opcRetryToken;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdatePackagesOnDynamicSetRequest(dynamicSetId, updatePackagesOnDynamicSetDetails, ifMatch, opcRetryToken, opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .dynamicSetId(dynamicSetId)
                .updatePackagesOnDynamicSetDetails(updatePackagesOnDynamicSetDetails)
                .ifMatch(ifMatch)
                .opcRetryToken(opcRetryToken)
                .opcRequestId(opcRequestId);
    }

    /**
     * Return a new builder for this request object.
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
        sb.append(",dynamicSetId=").append(String.valueOf(this.dynamicSetId));
        sb.append(",updatePackagesOnDynamicSetDetails=")
                .append(String.valueOf(this.updatePackagesOnDynamicSetDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRetryToken=").append(String.valueOf(this.opcRetryToken));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdatePackagesOnDynamicSetRequest)) {
            return false;
        }

        UpdatePackagesOnDynamicSetRequest other = (UpdatePackagesOnDynamicSetRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.dynamicSetId, other.dynamicSetId)
                && java.util.Objects.equals(
                        this.updatePackagesOnDynamicSetDetails,
                        other.updatePackagesOnDynamicSetDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRetryToken, other.opcRetryToken)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dynamicSetId == null ? 43 : this.dynamicSetId.hashCode());
        result =
                (result * PRIME)
                        + (this.updatePackagesOnDynamicSetDetails == null
                                ? 43
                                : this.updatePackagesOnDynamicSetDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcRetryToken == null ? 43 : this.opcRetryToken.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
