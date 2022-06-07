/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/UpdateSecurityListExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateSecurityListRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateSecurityListRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.core.model.UpdateSecurityListDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the security list.
     */
    private String securityListId;

    public String getSecurityListId() {
        return securityListId;
    }
    /**
     * Updated details for the security list.
     */
    private com.oracle.bmc.core.model.UpdateSecurityListDetails updateSecurityListDetails;

    public com.oracle.bmc.core.model.UpdateSecurityListDetails getUpdateSecurityListDetails() {
        return updateSecurityListDetails;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
     * parameter to the value of the etag from a previous GET or POST response for that resource. The resource
     * will be updated or deleted only if the etag you provide matches the resource's current etag value.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.core.model.UpdateSecurityListDetails getBody$() {
        return updateSecurityListDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateSecurityListRequest,
                    com.oracle.bmc.core.model.UpdateSecurityListDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String securityListId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the security list.
         * @return this builder instance
         */
        public Builder securityListId(String securityListId) {
            this.securityListId = securityListId;
            return this;
        }

        private com.oracle.bmc.core.model.UpdateSecurityListDetails updateSecurityListDetails =
                null;

        /**
         * Updated details for the security list.
         * @return this builder instance
         */
        public Builder updateSecurityListDetails(
                com.oracle.bmc.core.model.UpdateSecurityListDetails updateSecurityListDetails) {
            this.updateSecurityListDetails = updateSecurityListDetails;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code if-match}
         * parameter to the value of the etag from a previous GET or POST response for that resource. The resource
         * will be updated or deleted only if the etag you provide matches the resource's current etag value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
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
        public Builder copy(UpdateSecurityListRequest o) {
            securityListId(o.getSecurityListId());
            updateSecurityListDetails(o.getUpdateSecurityListDetails());
            ifMatch(o.getIfMatch());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateSecurityListRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateSecurityListRequest
         */
        public UpdateSecurityListRequest build() {
            UpdateSecurityListRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.core.model.UpdateSecurityListDetails body) {
            updateSecurityListDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateSecurityListRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateSecurityListRequest
         */
        public UpdateSecurityListRequest buildWithoutInvocationCallback() {
            UpdateSecurityListRequest request = new UpdateSecurityListRequest();
            request.securityListId = securityListId;
            request.updateSecurityListDetails = updateSecurityListDetails;
            request.ifMatch = ifMatch;
            return request;
            // new UpdateSecurityListRequest(securityListId, updateSecurityListDetails, ifMatch);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .securityListId(securityListId)
                .updateSecurityListDetails(updateSecurityListDetails)
                .ifMatch(ifMatch);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",securityListId=").append(String.valueOf(this.securityListId));
        sb.append(",updateSecurityListDetails=")
                .append(String.valueOf(this.updateSecurityListDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSecurityListRequest)) {
            return false;
        }

        UpdateSecurityListRequest other = (UpdateSecurityListRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.securityListId, other.securityListId)
                && java.util.Objects.equals(
                        this.updateSecurityListDetails, other.updateSecurityListDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.securityListId == null ? 43 : this.securityListId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateSecurityListDetails == null
                                ? 43
                                : this.updateSecurityListDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        return result;
    }
}
