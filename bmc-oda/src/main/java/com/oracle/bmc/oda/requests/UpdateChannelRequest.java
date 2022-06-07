/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.requests;

import com.oracle.bmc.oda.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/oda/UpdateChannelExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateChannelRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
public class UpdateChannelRequest
        extends com.oracle.bmc.requests.BmcRequest<com.oracle.bmc.oda.model.UpdateChannelDetails> {

    /**
     * Unique Digital Assistant instance identifier.
     */
    private String odaInstanceId;

    public String getOdaInstanceId() {
        return odaInstanceId;
    }
    /**
     * Unique Channel identifier.
     */
    private String channelId;

    public String getChannelId() {
        return channelId;
    }
    /**
     * Property values to update the Channel.
     */
    private com.oracle.bmc.oda.model.UpdateChannelDetails updateChannelDetails;

    public com.oracle.bmc.oda.model.UpdateChannelDetails getUpdateChannelDetails() {
        return updateChannelDetails;
    }
    /**
     * For optimistic concurrency control in a PUT or DELETE call for
     * a Digital Assistant instance, set the {@code if-match} query parameter
     * to the value of the {@code ETAG} header from a previous GET or POST
     * response for that instance. The service updates or deletes the
     * instance only if the etag that you provide matches the instance's
     * current etag value.
     *
     */
    private String ifMatch;

    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The client request ID for tracing. This value is included in the opc-request-id response header.
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
    public com.oracle.bmc.oda.model.UpdateChannelDetails getBody$() {
        return updateChannelDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateChannelRequest, com.oracle.bmc.oda.model.UpdateChannelDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        private String odaInstanceId = null;

        /**
         * Unique Digital Assistant instance identifier.
         * @return this builder instance
         */
        public Builder odaInstanceId(String odaInstanceId) {
            this.odaInstanceId = odaInstanceId;
            return this;
        }

        private String channelId = null;

        /**
         * Unique Channel identifier.
         * @return this builder instance
         */
        public Builder channelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        private com.oracle.bmc.oda.model.UpdateChannelDetails updateChannelDetails = null;

        /**
         * Property values to update the Channel.
         * @return this builder instance
         */
        public Builder updateChannelDetails(
                com.oracle.bmc.oda.model.UpdateChannelDetails updateChannelDetails) {
            this.updateChannelDetails = updateChannelDetails;
            return this;
        }

        private String ifMatch = null;

        /**
         * For optimistic concurrency control in a PUT or DELETE call for
         * a Digital Assistant instance, set the {@code if-match} query parameter
         * to the value of the {@code ETAG} header from a previous GET or POST
         * response for that instance. The service updates or deletes the
         * instance only if the etag that you provide matches the instance's
         * current etag value.
         *
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        private String opcRequestId = null;

        /**
         * The client request ID for tracing. This value is included in the opc-request-id response header.
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
        public Builder copy(UpdateChannelRequest o) {
            odaInstanceId(o.getOdaInstanceId());
            channelId(o.getChannelId());
            updateChannelDetails(o.getUpdateChannelDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateChannelRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateChannelRequest
         */
        public UpdateChannelRequest build() {
            UpdateChannelRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.oda.model.UpdateChannelDetails body) {
            updateChannelDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateChannelRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateChannelRequest
         */
        public UpdateChannelRequest buildWithoutInvocationCallback() {
            UpdateChannelRequest request = new UpdateChannelRequest();
            request.odaInstanceId = odaInstanceId;
            request.channelId = channelId;
            request.updateChannelDetails = updateChannelDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new UpdateChannelRequest(odaInstanceId, channelId, updateChannelDetails, ifMatch, opcRequestId);
        }
    }

    /**
     * @return instance of {@link Builder} that allows you to modify request properties
     */
    public Builder toBuilder() {
        return new Builder()
                .odaInstanceId(odaInstanceId)
                .channelId(channelId)
                .updateChannelDetails(updateChannelDetails)
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
        sb.append(",odaInstanceId=").append(String.valueOf(this.odaInstanceId));
        sb.append(",channelId=").append(String.valueOf(this.channelId));
        sb.append(",updateChannelDetails=").append(String.valueOf(this.updateChannelDetails));
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
        if (!(o instanceof UpdateChannelRequest)) {
            return false;
        }

        UpdateChannelRequest other = (UpdateChannelRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.odaInstanceId, other.odaInstanceId)
                && java.util.Objects.equals(this.channelId, other.channelId)
                && java.util.Objects.equals(this.updateChannelDetails, other.updateChannelDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.odaInstanceId == null ? 43 : this.odaInstanceId.hashCode());
        result = (result * PRIME) + (this.channelId == null ? 43 : this.channelId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateChannelDetails == null
                                ? 43
                                : this.updateChannelDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
