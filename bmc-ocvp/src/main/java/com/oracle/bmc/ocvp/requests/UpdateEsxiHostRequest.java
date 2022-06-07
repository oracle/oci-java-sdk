/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ocvp.requests;

import com.oracle.bmc.ocvp.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/ocvp/UpdateEsxiHostExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateEsxiHostRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200501")
public class UpdateEsxiHostRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.ocvp.model.UpdateEsxiHostDetails> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the ESXi host.
     *
     */
    private String esxiHostId;

    public String getEsxiHostId() {
        return esxiHostId;
    }
    /**
     * The information to be updated.
     */
    private com.oracle.bmc.ocvp.model.UpdateEsxiHostDetails updateEsxiHostDetails;

    public com.oracle.bmc.ocvp.model.UpdateEsxiHostDetails getUpdateEsxiHostDetails() {
        return updateEsxiHostDetails;
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

    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Unique identifier for the request. If you need to contact Oracle about a particular
     * request, please provide the request ID.
     *
     */
    private String opcRequestId;

    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.ocvp.model.UpdateEsxiHostDetails getBody$() {
        return updateEsxiHostDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateEsxiHostRequest, com.oracle.bmc.ocvp.model.UpdateEsxiHostDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String esxiHostId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the ESXi host.
         *
         * @return this builder instance
         */
        public Builder esxiHostId(String esxiHostId) {
            this.esxiHostId = esxiHostId;
            return this;
        }

        private com.oracle.bmc.ocvp.model.UpdateEsxiHostDetails updateEsxiHostDetails = null;

        /**
         * The information to be updated.
         * @return this builder instance
         */
        public Builder updateEsxiHostDetails(
                com.oracle.bmc.ocvp.model.UpdateEsxiHostDetails updateEsxiHostDetails) {
            this.updateEsxiHostDetails = updateEsxiHostDetails;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call
         * for a resource, set the {@code if-match} parameter to the value of the
         * etag from a previous GET or POST response for that resource.
         * The resource will be updated or deleted only if the etag you
         * provide matches the resource's current etag value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        private String opcRequestId = null;

        /**
         * Unique identifier for the request. If you need to contact Oracle about a particular
         * request, please provide the request ID.
         *
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
        public Builder copy(UpdateEsxiHostRequest o) {
            esxiHostId(o.getEsxiHostId());
            updateEsxiHostDetails(o.getUpdateEsxiHostDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateEsxiHostRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateEsxiHostRequest
         */
        public UpdateEsxiHostRequest build() {
            UpdateEsxiHostRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.ocvp.model.UpdateEsxiHostDetails body) {
            updateEsxiHostDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateEsxiHostRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateEsxiHostRequest
         */
        public UpdateEsxiHostRequest buildWithoutInvocationCallback() {
            UpdateEsxiHostRequest request = new UpdateEsxiHostRequest();
            request.esxiHostId = esxiHostId;
            request.updateEsxiHostDetails = updateEsxiHostDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateEsxiHostRequest(esxiHostId, updateEsxiHostDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .esxiHostId(esxiHostId)
                .updateEsxiHostDetails(updateEsxiHostDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",esxiHostId=").append(String.valueOf(this.esxiHostId));
        sb.append(",updateEsxiHostDetails=").append(String.valueOf(this.updateEsxiHostDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateEsxiHostRequest)) {
            return false;
        }

        UpdateEsxiHostRequest other = (UpdateEsxiHostRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.esxiHostId, other.esxiHostId)
                && java.util.Objects.equals(this.updateEsxiHostDetails, other.updateEsxiHostDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.esxiHostId == null ? 43 : this.esxiHostId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateEsxiHostDetails == null
                                ? 43
                                : this.updateEsxiHostDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
