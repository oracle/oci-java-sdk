/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.requests;

import com.oracle.bmc.containerengine.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/containerengine/DisableAddonExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use DisableAddonRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
public class DisableAddonRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The OCID of the cluster. */
    private String clusterId;

    /** The OCID of the cluster. */
    public String getClusterId() {
        return clusterId;
    }
    /** The name of the addon. */
    private String addonName;

    /** The name of the addon. */
    public String getAddonName() {
        return addonName;
    }
    /**
     * Whether existing addon resources should be deleted or not. True would remove the underlying
     * resources completely.
     */
    private Boolean isRemoveExistingAddOn;

    /**
     * Whether existing addon resources should be deleted or not. True would remove the underlying
     * resources completely.
     */
    public Boolean getIsRemoveExistingAddOn() {
        return isRemoveExistingAddOn;
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
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    DisableAddonRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The OCID of the cluster. */
        private String clusterId = null;

        /**
         * The OCID of the cluster.
         *
         * @param clusterId the value to set
         * @return this builder instance
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /** The name of the addon. */
        private String addonName = null;

        /**
         * The name of the addon.
         *
         * @param addonName the value to set
         * @return this builder instance
         */
        public Builder addonName(String addonName) {
            this.addonName = addonName;
            return this;
        }

        /**
         * Whether existing addon resources should be deleted or not. True would remove the
         * underlying resources completely.
         */
        private Boolean isRemoveExistingAddOn = null;

        /**
         * Whether existing addon resources should be deleted or not. True would remove the
         * underlying resources completely.
         *
         * @param isRemoveExistingAddOn the value to set
         * @return this builder instance
         */
        public Builder isRemoveExistingAddOn(Boolean isRemoveExistingAddOn) {
            this.isRemoveExistingAddOn = isRemoveExistingAddOn;
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
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
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
        public Builder copy(DisableAddonRequest o) {
            clusterId(o.getClusterId());
            addonName(o.getAddonName());
            isRemoveExistingAddOn(o.getIsRemoveExistingAddOn());
            ifMatch(o.getIfMatch());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of DisableAddonRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of DisableAddonRequest
         */
        public DisableAddonRequest build() {
            DisableAddonRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of DisableAddonRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of DisableAddonRequest
         */
        public DisableAddonRequest buildWithoutInvocationCallback() {
            DisableAddonRequest request = new DisableAddonRequest();
            request.clusterId = clusterId;
            request.addonName = addonName;
            request.isRemoveExistingAddOn = isRemoveExistingAddOn;
            request.ifMatch = ifMatch;
            request.opcRequestId = opcRequestId;
            return request;
            // new DisableAddonRequest(clusterId, addonName, isRemoveExistingAddOn, ifMatch,
            // opcRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .clusterId(clusterId)
                .addonName(addonName)
                .isRemoveExistingAddOn(isRemoveExistingAddOn)
                .ifMatch(ifMatch)
                .opcRequestId(opcRequestId);
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
        sb.append(",clusterId=").append(String.valueOf(this.clusterId));
        sb.append(",addonName=").append(String.valueOf(this.addonName));
        sb.append(",isRemoveExistingAddOn=").append(String.valueOf(this.isRemoveExistingAddOn));
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
        if (!(o instanceof DisableAddonRequest)) {
            return false;
        }

        DisableAddonRequest other = (DisableAddonRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.clusterId, other.clusterId)
                && java.util.Objects.equals(this.addonName, other.addonName)
                && java.util.Objects.equals(this.isRemoveExistingAddOn, other.isRemoveExistingAddOn)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.clusterId == null ? 43 : this.clusterId.hashCode());
        result = (result * PRIME) + (this.addonName == null ? 43 : this.addonName.hashCode());
        result =
                (result * PRIME)
                        + (this.isRemoveExistingAddOn == null
                                ? 43
                                : this.isRemoveExistingAddOn.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
