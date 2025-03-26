/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.requests;

import com.oracle.bmc.objectstorage.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/objectstorage/UpdateRetentionRuleExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use UpdateRetentionRuleRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
public class UpdateRetentionRuleRequest
        extends com.oracle.bmc.requests.BmcRequest<
                com.oracle.bmc.objectstorage.model.UpdateRetentionRuleDetails> {

    /**
     * The Object Storage namespace used for the request.
     */
    private String namespaceName;

    /**
     * The Object Storage namespace used for the request.
     */
    public String getNamespaceName() {
        return namespaceName;
    }
    /**
     * The name of the bucket. Avoid entering confidential information.
     * Example: {@code my-new-bucket1}
     *
     */
    private String bucketName;

    /**
     * The name of the bucket. Avoid entering confidential information.
     * Example: {@code my-new-bucket1}
     *
     */
    public String getBucketName() {
        return bucketName;
    }
    /**
     * The ID of the retention rule.
     */
    private String retentionRuleId;

    /**
     * The ID of the retention rule.
     */
    public String getRetentionRuleId() {
        return retentionRuleId;
    }
    /**
     * Request object for updating the retention rule.
     */
    private com.oracle.bmc.objectstorage.model.UpdateRetentionRuleDetails
            updateRetentionRuleDetails;

    /**
     * Request object for updating the retention rule.
     */
    public com.oracle.bmc.objectstorage.model.UpdateRetentionRuleDetails
            getUpdateRetentionRuleDetails() {
        return updateRetentionRuleDetails;
    }
    /**
     * The entity tag (ETag) to match with the ETag of an existing resource. If the specified ETag matches the ETag of
     * the existing resource, GET and HEAD requests will return the resource and PUT and POST requests will upload
     * the resource.
     *
     */
    private String ifMatch;

    /**
     * The entity tag (ETag) to match with the ETag of an existing resource. If the specified ETag matches the ETag of
     * the existing resource, GET and HEAD requests will return the resource and PUT and POST requests will upload
     * the resource.
     *
     */
    public String getIfMatch() {
        return ifMatch;
    }
    /**
     * The client request ID for tracing.
     */
    private String opcClientRequestId;

    /**
     * The client request ID for tracing.
     */
    public String getOpcClientRequestId() {
        return opcClientRequestId;
    }

    /**
     * Alternative accessor for the body parameter.
     * @return body parameter
     */
    @Override
    @com.oracle.bmc.InternalSdk
    public com.oracle.bmc.objectstorage.model.UpdateRetentionRuleDetails getBody$() {
        return updateRetentionRuleDetails;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    UpdateRetentionRuleRequest,
                    com.oracle.bmc.objectstorage.model.UpdateRetentionRuleDetails> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The Object Storage namespace used for the request.
         */
        private String namespaceName = null;

        /**
         * The Object Storage namespace used for the request.
         * @param namespaceName the value to set
         * @return this builder instance
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            return this;
        }

        /**
         * The name of the bucket. Avoid entering confidential information.
         * Example: {@code my-new-bucket1}
         *
         */
        private String bucketName = null;

        /**
         * The name of the bucket. Avoid entering confidential information.
         * Example: {@code my-new-bucket1}
         *
         * @param bucketName the value to set
         * @return this builder instance
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }

        /**
         * The ID of the retention rule.
         */
        private String retentionRuleId = null;

        /**
         * The ID of the retention rule.
         * @param retentionRuleId the value to set
         * @return this builder instance
         */
        public Builder retentionRuleId(String retentionRuleId) {
            this.retentionRuleId = retentionRuleId;
            return this;
        }

        /**
         * Request object for updating the retention rule.
         */
        private com.oracle.bmc.objectstorage.model.UpdateRetentionRuleDetails
                updateRetentionRuleDetails = null;

        /**
         * Request object for updating the retention rule.
         * @param updateRetentionRuleDetails the value to set
         * @return this builder instance
         */
        public Builder updateRetentionRuleDetails(
                com.oracle.bmc.objectstorage.model.UpdateRetentionRuleDetails
                        updateRetentionRuleDetails) {
            this.updateRetentionRuleDetails = updateRetentionRuleDetails;
            return this;
        }

        /**
         * The entity tag (ETag) to match with the ETag of an existing resource. If the specified ETag matches the ETag of
         * the existing resource, GET and HEAD requests will return the resource and PUT and POST requests will upload
         * the resource.
         *
         */
        private String ifMatch = null;

        /**
         * The entity tag (ETag) to match with the ETag of an existing resource. If the specified ETag matches the ETag of
         * the existing resource, GET and HEAD requests will return the resource and PUT and POST requests will upload
         * the resource.
         *
         * @param ifMatch the value to set
         * @return this builder instance
         */
        public Builder ifMatch(String ifMatch) {
            this.ifMatch = ifMatch;
            return this;
        }

        /**
         * The client request ID for tracing.
         */
        private String opcClientRequestId = null;

        /**
         * The client request ID for tracing.
         * @param opcClientRequestId the value to set
         * @return this builder instance
         */
        public Builder opcClientRequestId(String opcClientRequestId) {
            this.opcClientRequestId = opcClientRequestId;
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
        public Builder copy(UpdateRetentionRuleRequest o) {
            namespaceName(o.getNamespaceName());
            bucketName(o.getBucketName());
            retentionRuleId(o.getRetentionRuleId());
            updateRetentionRuleDetails(o.getUpdateRetentionRuleDetails());
            ifMatch(o.getIfMatch());
            opcClientRequestId(o.getOpcClientRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of UpdateRetentionRuleRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of UpdateRetentionRuleRequest
         */
        public UpdateRetentionRuleRequest build() {
            UpdateRetentionRuleRequest request = buildWithoutInvocationCallback();
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
        public Builder body$(com.oracle.bmc.objectstorage.model.UpdateRetentionRuleDetails body) {
            updateRetentionRuleDetails(body);
            return this;
        }

        /**
         * Build the instance of UpdateRetentionRuleRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of UpdateRetentionRuleRequest
         */
        public UpdateRetentionRuleRequest buildWithoutInvocationCallback() {
            UpdateRetentionRuleRequest request = new UpdateRetentionRuleRequest();
            request.namespaceName = namespaceName;
            request.bucketName = bucketName;
            request.retentionRuleId = retentionRuleId;
            request.updateRetentionRuleDetails = updateRetentionRuleDetails;
            request.ifMatch = ifMatch;
            request.opcClientRequestId = opcClientRequestId;
            return request;
            // new UpdateRetentionRuleRequest(namespaceName, bucketName, retentionRuleId, updateRetentionRuleDetails, ifMatch, opcClientRequestId);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .namespaceName(namespaceName)
                .bucketName(bucketName)
                .retentionRuleId(retentionRuleId)
                .updateRetentionRuleDetails(updateRetentionRuleDetails)
                .ifMatch(ifMatch)
                .opcClientRequestId(opcClientRequestId);
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
        sb.append(",namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(",bucketName=").append(String.valueOf(this.bucketName));
        sb.append(",retentionRuleId=").append(String.valueOf(this.retentionRuleId));
        sb.append(",updateRetentionRuleDetails=")
                .append(String.valueOf(this.updateRetentionRuleDetails));
        sb.append(",ifMatch=").append(String.valueOf(this.ifMatch));
        sb.append(",opcClientRequestId=").append(String.valueOf(this.opcClientRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateRetentionRuleRequest)) {
            return false;
        }

        UpdateRetentionRuleRequest other = (UpdateRetentionRuleRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.retentionRuleId, other.retentionRuleId)
                && java.util.Objects.equals(
                        this.updateRetentionRuleDetails, other.updateRetentionRuleDetails)
                && java.util.Objects.equals(this.ifMatch, other.ifMatch)
                && java.util.Objects.equals(this.opcClientRequestId, other.opcClientRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionRuleId == null ? 43 : this.retentionRuleId.hashCode());
        result =
                (result * PRIME)
                        + (this.updateRetentionRuleDetails == null
                                ? 43
                                : this.updateRetentionRuleDetails.hashCode());
        result = (result * PRIME) + (this.ifMatch == null ? 43 : this.ifMatch.hashCode());
        result =
                (result * PRIME)
                        + (this.opcClientRequestId == null
                                ? 43
                                : this.opcClientRequestId.hashCode());
        return result;
    }
}
