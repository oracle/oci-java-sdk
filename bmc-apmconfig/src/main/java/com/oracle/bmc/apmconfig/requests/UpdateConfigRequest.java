/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmconfig.requests;

import com.oracle.bmc.apmconfig.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/apmconfig/UpdateConfigExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateConfigRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210201")
public class UpdateConfigRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.apmconfig.model.UpdateConfigDetails> {

    /**
     * The APM Domain ID the request is intended for.
     *
     */
    private String apmDomainId;

    /**
     * The APM Domain ID the request is intended for.
     *
     */
    public String getApmDomainId() {
        return apmDomainId;
    }
    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the configuration item.
     *
     */
    private String configId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the configuration item.
     *
     */
    public String getConfigId() {
        return configId;
    }
    /**
     * The configuration details to be updated.
     */
    private com.oracle.bmc.apmconfig.model.UpdateConfigDetails updateConfigDetails;

    /**
     * The configuration details to be updated.
     */
    public com.oracle.bmc.apmconfig.model.UpdateConfigDetails getUpdateConfigDetails() {
        return updateConfigDetails;
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
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique identifier for the request.
     * If you need to contact Oracle about a particular request, please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * Indicates that the request is a dry run, if set to "true". A dry run request does not modify the
     * configuration item details and is used only to perform validation on the submitted data.
     *
     */
    private String opcDryRun;

    /**
     * Indicates that the request is a dry run, if set to "true". A dry run request does not modify the
     * configuration item details and is used only to perform validation on the submitted data.
     *
     */
    public String getOpcDryRun() {
        return opcDryRun;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.apmconfig.model.UpdateConfigDetails getBody$() {
        return updateConfigDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateConfigRequest, com.oracle.bmc.apmconfig.model.UpdateConfigDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The APM Domain ID the request is intended for.
         *
         */
        private String apmDomainId = null;

        /**
         * The APM Domain ID the request is intended for.
         *
         * @param apmDomainId the value to set
         * @return this builder instance
         */
        public Builder apmDomainId(String apmDomainId) {
            this.apmDomainId = apmDomainId;
            return this;
        }

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the configuration item.
         *
         */
        private String configId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the configuration item.
         *
         * @param configId the value to set
         * @return this builder instance
         */
        public Builder configId(String configId) {
            this.configId = configId;
            return this;
        }

        /**
         * The configuration details to be updated.
         */
        private com.oracle.bmc.apmconfig.model.UpdateConfigDetails updateConfigDetails = null;

        /**
         * The configuration details to be updated.
         * @param updateConfigDetails the value to set
         * @return this builder instance
         */
        public Builder updateConfigDetails(
                com.oracle.bmc.apmconfig.model.UpdateConfigDetails updateConfigDetails) {
            this.updateConfigDetails = updateConfigDetails;
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
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique identifier for the request.
         * If you need to contact Oracle about a particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * Indicates that the request is a dry run, if set to "true". A dry run request does not modify the
         * configuration item details and is used only to perform validation on the submitted data.
         *
         */
        private String opcDryRun = null;

        /**
         * Indicates that the request is a dry run, if set to "true". A dry run request does not modify the
         * configuration item details and is used only to perform validation on the submitted data.
         *
         * @param opcDryRun the value to set
         * @return this builder instance
         */
        public Builder opcDryRun(String opcDryRun) {
            this.opcDryRun = opcDryRun;
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
        public Builder copy(UpdateConfigRequest o) {
            apmDomainId(o.getApmDomainId());
            configId(o.getConfigId());
            updateConfigDetails(o.getUpdateConfigDetails());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            opcDryRun(o.getOpcDryRun());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateConfigRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateConfigRequest
         */
        public UpdateConfigRequest build() {
            UpdateConfigRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.apmconfig.model.UpdateConfigDetails body) {
            updateConfigDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateConfigRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateConfigRequest
         */
        public UpdateConfigRequest buildWithoutInvocationCallback() {
            UpdateConfigRequest request = new UpdateConfigRequest();
            request.apmDomainId = apmDomainId;
            request.configId = configId;
            request.updateConfigDetails = updateConfigDetails;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            request.opcDryRun = opcDryRun;
            return request;
            // new UpdateConfigRequest(apmDomainId, configId, updateConfigDetails, ifMatch, opcRequestId, opcDryRun);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .apmDomainId(apmDomainId)
                .configId(configId)
                .updateConfigDetails(updateConfigDetails)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId)
                .opcDryRun(opcDryRun);
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
        sb.append(",apmDomainId=").append(String.valueOf(this.apmDomainId));
        sb.append(",configId=").append(String.valueOf(this.configId));
        sb.append(",updateConfigDetails=").append(String.valueOf(this.updateConfigDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",opcDryRun=").append(String.valueOf(this.opcDryRun));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateConfigRequest)) {
            return false;
        }

        UpdateConfigRequest other = (UpdateConfigRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.apmDomainId, other.apmDomainId)
                && java.util.Objects.equals(this.configId, other.configId)
                && java.util.Objects.equals(this.updateConfigDetails, other.updateConfigDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcDryRun, other.opcDryRun);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.apmDomainId == null ? 43 : this.apmDomainId.hashCode());
        result = (result * PRIME) + (this.configId == null ? 43 : this.configId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateConfigDetails == null
                                ? 43
                                : this.updateConfigDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.opcDryRun == null ? 43 : this.opcDryRun.hashCode());
        return result;
    }
}
