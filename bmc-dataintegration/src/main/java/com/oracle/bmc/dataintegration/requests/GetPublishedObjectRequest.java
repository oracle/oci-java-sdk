/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.requests;

import com.oracle.bmc.dataintegration.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetPublishedObjectExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetPublishedObjectRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
public class GetPublishedObjectRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The workspace ID. */
    private String workspaceId;

    /** The workspace ID. */
    public String getWorkspaceId() {
        return workspaceId;
    }
    /** The application key. */
    private String applicationKey;

    /** The application key. */
    public String getApplicationKey() {
        return applicationKey;
    }
    /** The published object key. */
    private String publishedObjectKey;

    /** The published object key. */
    public String getPublishedObjectKey() {
        return publishedObjectKey;
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
    /**
     * Used to expand references of the object. If value is true, then all referenced objects are
     * expanded. If value is false, then shallow objects are returned in place of references.
     * Default is false. <br>
     * <br>
     * <B>Example:</B><br>
     *
     * <ul>
     *   <li><B>?expandReferences=true</B> returns all objects of type data loader task
     * </ul>
     */
    private String expandReferences;

    /**
     * Used to expand references of the object. If value is true, then all referenced objects are
     * expanded. If value is false, then shallow objects are returned in place of references.
     * Default is false. <br>
     * <br>
     * <B>Example:</B><br>
     *
     * <ul>
     *   <li><B>?expandReferences=true</B> returns all objects of type data loader task
     * </ul>
     */
    public String getExpandReferences() {
        return expandReferences;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetPublishedObjectRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /** The workspace ID. */
        private String workspaceId = null;

        /**
         * The workspace ID.
         *
         * @param workspaceId the value to set
         * @return this builder instance
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        /** The application key. */
        private String applicationKey = null;

        /**
         * The application key.
         *
         * @param applicationKey the value to set
         * @return this builder instance
         */
        public Builder applicationKey(String applicationKey) {
            this.applicationKey = applicationKey;
            return this;
        }

        /** The published object key. */
        private String publishedObjectKey = null;

        /**
         * The published object key.
         *
         * @param publishedObjectKey the value to set
         * @return this builder instance
         */
        public Builder publishedObjectKey(String publishedObjectKey) {
            this.publishedObjectKey = publishedObjectKey;
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
         * Used to expand references of the object. If value is true, then all referenced objects
         * are expanded. If value is false, then shallow objects are returned in place of
         * references. Default is false. <br>
         * <br>
         * <B>Example:</B><br>
         *
         * <ul>
         *   <li><B>?expandReferences=true</B> returns all objects of type data loader task
         * </ul>
         */
        private String expandReferences = null;

        /**
         * Used to expand references of the object. If value is true, then all referenced objects
         * are expanded. If value is false, then shallow objects are returned in place of
         * references. Default is false. <br>
         * <br>
         * <B>Example:</B><br>
         *
         * <ul>
         *   <li><B>?expandReferences=true</B> returns all objects of type data loader task
         * </ul>
         *
         * @param expandReferences the value to set
         * @return this builder instance
         */
        public Builder expandReferences(String expandReferences) {
            this.expandReferences = expandReferences;
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
        public Builder copy(GetPublishedObjectRequest o) {
            workspaceId(o.getWorkspaceId());
            applicationKey(o.getApplicationKey());
            publishedObjectKey(o.getPublishedObjectKey());
            opcRequestId(o.getOpcRequestId());
            expandReferences(o.getExpandReferences());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetPublishedObjectRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetPublishedObjectRequest
         */
        public GetPublishedObjectRequest build() {
            GetPublishedObjectRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetPublishedObjectRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetPublishedObjectRequest
         */
        public GetPublishedObjectRequest buildWithoutInvocationCallback() {
            GetPublishedObjectRequest request = new GetPublishedObjectRequest();
            request.workspaceId = workspaceId;
            request.applicationKey = applicationKey;
            request.publishedObjectKey = publishedObjectKey;
            request.opcRequestId = opcRequestId;
            request.expandReferences = expandReferences;
            return request;
            // new GetPublishedObjectRequest(workspaceId, applicationKey, publishedObjectKey,
            // opcRequestId, expandReferences);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     *
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .workspaceId(workspaceId)
                .applicationKey(applicationKey)
                .publishedObjectKey(publishedObjectKey)
                .opcRequestId(opcRequestId)
                .expandReferences(expandReferences);
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
        sb.append(",workspaceId=").append(String.valueOf(this.workspaceId));
        sb.append(",applicationKey=").append(String.valueOf(this.applicationKey));
        sb.append(",publishedObjectKey=").append(String.valueOf(this.publishedObjectKey));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",expandReferences=").append(String.valueOf(this.expandReferences));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetPublishedObjectRequest)) {
            return false;
        }

        GetPublishedObjectRequest other = (GetPublishedObjectRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.workspaceId, other.workspaceId)
                && java.util.Objects.equals(this.applicationKey, other.applicationKey)
                && java.util.Objects.equals(this.publishedObjectKey, other.publishedObjectKey)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.expandReferences, other.expandReferences);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.workspaceId == null ? 43 : this.workspaceId.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationKey == null ? 43 : this.applicationKey.hashCode());
        result =
                (result * PRIME)
                        + (this.publishedObjectKey == null
                                ? 43
                                : this.publishedObjectKey.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.expandReferences == null ? 43 : this.expandReferences.hashCode());
        return result;
    }
}
