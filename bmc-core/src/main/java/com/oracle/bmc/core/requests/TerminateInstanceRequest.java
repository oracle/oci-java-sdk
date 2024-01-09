/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/core/TerminateInstanceExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use TerminateInstanceRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class TerminateInstanceRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the instance.
     */
    private String instanceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    private String ifMatch;

    /**
     * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the {@code
     * if-match} parameter to the value of the etag from a previous GET or POST response for that
     * resource. The resource will be updated or deleted only if the etag you provide matches the
     * resource's current etag value.
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * Specifies whether to delete or preserve the boot volume when terminating an instance. When
     * set to {@code true}, the boot volume is preserved. The default value is {@code false}.
     */
    private Boolean preserveBootVolume;

    /**
     * Specifies whether to delete or preserve the boot volume when terminating an instance. When
     * set to {@code true}, the boot volume is preserved. The default value is {@code false}.
     */
    public Boolean getPreserveBootVolume() {
        return preserveBootVolume;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    TerminateInstanceRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the instance.
         */
        private String instanceId = null;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the instance.
         *
         * @param instanceId the value to set
         * @return this builder instance
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         */
        private String ifMatch = null;

        /**
         * For optimistic concurrency control. In the PUT or DELETE call for a resource, set the
         * {@code if-match} parameter to the value of the etag from a previous GET or POST response
         * for that resource. The resource will be updated or deleted only if the etag you provide
         * matches the resource's current etag value.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * Specifies whether to delete or preserve the boot volume when terminating an instance.
         * When set to {@code true}, the boot volume is preserved. The default value is {@code
         * false}.
         */
        private Boolean preserveBootVolume = null;

        /**
         * Specifies whether to delete or preserve the boot volume when terminating an instance.
         * When set to {@code true}, the boot volume is preserved. The default value is {@code
         * false}.
         *
         * @param preserveBootVolume the value to set
         * @return this builder instance
         */
        public Builder preserveBootVolume(Boolean preserveBootVolume) {
            this.preserveBootVolume = preserveBootVolume;
            return this;
        }

        /**
         * Set the invocation callback for the request to be built.
         *
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.http.client.RequestInterceptor invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         *
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
         *
         * @return this builder instance
         */
        public Builder copy(TerminateInstanceRequest o) {
            instanceId(o.getInstanceId());
            ifMatch(o.getIfMatch());
            preserveBootVolume(o.getPreserveBootVolume());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of TerminateInstanceRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of TerminateInstanceRequest
         */
        public TerminateInstanceRequest build() {
            TerminateInstanceRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of TerminateInstanceRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of TerminateInstanceRequest
         */
        public TerminateInstanceRequest buildWithoutInvocationCallback() {
            TerminateInstanceRequest request = new TerminateInstanceRequest();
            request.instanceId = instanceId;
            request.ifMatch = ifMatch;
            request.preserveBootVolume = preserveBootVolume;
            return request;
            // new TerminateInstanceRequest(instanceId, ifMatch, preserveBootVolume);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .instanceId(instanceId)
                .ifMatch(ifMatch)
                .preserveBootVolume(preserveBootVolume);
    }

    /**
     * Return a new builder for this request object.
     *
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
        sb.append(",instanceId=").append(String.valueOf(this.instanceId));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",preserveBootVolume=").append(String.valueOf(this.preserveBootVolume));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TerminateInstanceRequest)) {
            return false;
        }

        TerminateInstanceRequest other = (TerminateInstanceRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.instanceId, other.instanceId)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.preserveBootVolume, other.preserveBootVolume);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.instanceId == null ? 43 : this.instanceId.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.preserveBootVolume == null
                                ? 43
                                : this.preserveBootVolume.hashCode());
        return result;
    }
}
