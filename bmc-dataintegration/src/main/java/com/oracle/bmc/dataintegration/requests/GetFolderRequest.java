/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.requests;

import com.oracle.bmc.dataintegration.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetFolderExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetFolderRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
public class GetFolderRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /** The workspace ID. */
    private String workspaceId;

    /** The workspace ID. */
    public String getWorkspaceId() {
        return workspaceId;
    }
    /** The folder key. */
    private String folderKey;

    /** The folder key. */
    public String getFolderKey() {
        return folderKey;
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
     * This parameter allows users to specify which view of the object to return.
     * CHILD_COUNT_STATISTICS - This option is used to get statistics on immediate children of the
     * object by their type.
     */
    private java.util.List<Projection> projection;

    /**
     * This parameter allows users to specify which view of the object to return.
     * CHILD_COUNT_STATISTICS - This option is used to get statistics on immediate children of the
     * object by their type.
     */
    public enum Projection implements com.oracle.bmc.http.internal.BmcEnum {
        ChildCountStatistics("CHILD_COUNT_STATISTICS"),
        ;

        private final String value;
        private static java.util.Map<String, Projection> map;

        static {
            map = new java.util.HashMap<>();
            for (Projection v : Projection.values()) {
                map.put(v.getValue(), v);
            }
        }

        Projection(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Projection create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Projection: " + key);
        }
    };

    /**
     * This parameter allows users to specify which view of the object to return.
     * CHILD_COUNT_STATISTICS - This option is used to get statistics on immediate children of the
     * object by their type.
     */
    public java.util.List<Projection> getProjection() {
        return projection;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetFolderRequest, java.lang.Void> {
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

        /** The folder key. */
        private String folderKey = null;

        /**
         * The folder key.
         *
         * @param folderKey the value to set
         * @return this builder instance
         */
        public Builder folderKey(String folderKey) {
            this.folderKey = folderKey;
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
         * This parameter allows users to specify which view of the object to return.
         * CHILD_COUNT_STATISTICS - This option is used to get statistics on immediate children of
         * the object by their type.
         */
        private java.util.List<Projection> projection = null;

        /**
         * This parameter allows users to specify which view of the object to return.
         * CHILD_COUNT_STATISTICS - This option is used to get statistics on immediate children of
         * the object by their type.
         *
         * @param projection the value to set
         * @return this builder instance
         */
        public Builder projection(java.util.List<Projection> projection) {
            this.projection = projection;
            return this;
        }

        /**
         * Singular setter. This parameter allows users to specify which view of the object to
         * return. CHILD_COUNT_STATISTICS - This option is used to get statistics on immediate
         * children of the object by their type.
         *
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder projection(Projection singularValue) {
            return this.projection(java.util.Arrays.asList(singularValue));
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
        public Builder copy(GetFolderRequest o) {
            workspaceId(o.getWorkspaceId());
            folderKey(o.getFolderKey());
            opcRequestId(o.getOpcRequestId());
            projection(o.getProjection());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetFolderRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetFolderRequest
         */
        public GetFolderRequest build() {
            GetFolderRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetFolderRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetFolderRequest
         */
        public GetFolderRequest buildWithoutInvocationCallback() {
            GetFolderRequest request = new GetFolderRequest();
            request.workspaceId = workspaceId;
            request.folderKey = folderKey;
            request.opcRequestId = opcRequestId;
            request.projection = projection;
            return request;
            // new GetFolderRequest(workspaceId, folderKey, opcRequestId, projection);
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
                .folderKey(folderKey)
                .opcRequestId(opcRequestId)
                .projection(projection);
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
        sb.append(",folderKey=").append(String.valueOf(this.folderKey));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(",projection=").append(String.valueOf(this.projection));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetFolderRequest)) {
            return false;
        }

        GetFolderRequest other = (GetFolderRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.workspaceId, other.workspaceId)
                && java.util.Objects.equals(this.folderKey, other.folderKey)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.projection, other.projection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.workspaceId == null ? 43 : this.workspaceId.hashCode());
        result = (result * PRIME) + (this.folderKey == null ? 43 : this.folderKey.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.projection == null ? 43 : this.projection.hashCode());
        return result;
    }
}
