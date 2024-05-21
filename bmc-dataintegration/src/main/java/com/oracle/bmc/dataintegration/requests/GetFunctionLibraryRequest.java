/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.requests;

import com.oracle.bmc.dataintegration.model.*;
/**
 * <b>Example: </b>Click <a href="https://docs.cloud.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/dataintegration/GetFunctionLibraryExample.java.html" target="_blank" rel="noopener noreferrer">here</a> to see how to use GetFunctionLibraryRequest.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
public class GetFunctionLibraryRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The workspace ID.
     */
    private String workspaceId;

    /**
     * The workspace ID.
     */
    public String getWorkspaceId() {
        return workspaceId;
    }
    /**
     * The functionLibrary key.
     */
    private String functionLibraryKey;

    /**
     * The functionLibrary key.
     */
    public String getFunctionLibraryKey() {
        return functionLibraryKey;
    }
    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If
     * you need to contact Oracle about a particular request,
     * please provide the request ID.
     *
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }
    /**
     * This parameter allows users to specify which view of the object to return. CHILD_COUNT_STATISTICS - This option is used to get statistics on immediate children of the object by their type.
     */
    private java.util.List<Projection> projection;

    /**
     * This parameter allows users to specify which view of the object to return. CHILD_COUNT_STATISTICS - This option is used to get statistics on immediate children of the object by their type.
     **/
    public enum Projection {
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
     * This parameter allows users to specify which view of the object to return. CHILD_COUNT_STATISTICS - This option is used to get statistics on immediate children of the object by their type.
     */
    public java.util.List<Projection> getProjection() {
        return projection;
    }

    public static class Builder
            implements com.oracle.bmc.requests.BmcRequest.Builder<
                    GetFunctionLibraryRequest, java.lang.Void> {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The workspace ID.
         */
        private String workspaceId = null;

        /**
         * The workspace ID.
         * @param workspaceId the value to set
         * @return this builder instance
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * The functionLibrary key.
         */
        private String functionLibraryKey = null;

        /**
         * The functionLibrary key.
         * @param functionLibraryKey the value to set
         * @return this builder instance
         */
        public Builder functionLibraryKey(String functionLibraryKey) {
            this.functionLibraryKey = functionLibraryKey;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If
         * you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         */
        private String opcRequestId = null;

        /**
         * Unique Oracle-assigned identifier for the request. If
         * you need to contact Oracle about a particular request,
         * please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder instance
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * This parameter allows users to specify which view of the object to return. CHILD_COUNT_STATISTICS - This option is used to get statistics on immediate children of the object by their type.
         */
        private java.util.List<Projection> projection = null;

        /**
         * This parameter allows users to specify which view of the object to return. CHILD_COUNT_STATISTICS - This option is used to get statistics on immediate children of the object by their type.
         * @param projection the value to set
         * @return this builder instance
         */
        public Builder projection(java.util.List<Projection> projection) {
            this.projection = projection;
            return this;
        }

        /**
         * Singular setter. This parameter allows users to specify which view of the object to return. CHILD_COUNT_STATISTICS - This option is used to get statistics on immediate children of the object by their type.
         * @param singularValue the singular value to set
         * @return this builder instance
         */
        public Builder projection(Projection singularValue) {
            return this.projection(java.util.Arrays.asList(singularValue));
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
        public Builder copy(GetFunctionLibraryRequest o) {
            workspaceId(o.getWorkspaceId());
            functionLibraryKey(o.getFunctionLibraryKey());
            opcRequestId(o.getOpcRequestId());
            projection(o.getProjection());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetFunctionLibraryRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of GetFunctionLibraryRequest
         */
        public GetFunctionLibraryRequest build() {
            GetFunctionLibraryRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetFunctionLibraryRequest as configured by this builder
         *
         * Note that this method does not take calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetFunctionLibraryRequest
         */
        public GetFunctionLibraryRequest buildWithoutInvocationCallback() {
            GetFunctionLibraryRequest request = new GetFunctionLibraryRequest();
            request.workspaceId = workspaceId;
            request.functionLibraryKey = functionLibraryKey;
            request.opcRequestId = opcRequestId;
            request.projection = projection;
            return request;
            // new GetFunctionLibraryRequest(workspaceId, functionLibraryKey, opcRequestId, projection);
        }
    }

    /**
     * Return an instance of {@link Builder} that allows you to modify request properties.
     * @return instance of {@link Builder} that allows you to modify request properties.
     */
    public Builder toBuilder() {
        return new Builder()
                .workspaceId(workspaceId)
                .functionLibraryKey(functionLibraryKey)
                .opcRequestId(opcRequestId)
                .projection(projection);
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
        sb.append(",workspaceId=").append(String.valueOf(this.workspaceId));
        sb.append(",functionLibraryKey=").append(String.valueOf(this.functionLibraryKey));
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
        if (!(o instanceof GetFunctionLibraryRequest)) {
            return false;
        }

        GetFunctionLibraryRequest other = (GetFunctionLibraryRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.workspaceId, other.workspaceId)
                && java.util.Objects.equals(this.functionLibraryKey, other.functionLibraryKey)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.projection, other.projection);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.workspaceId == null ? 43 : this.workspaceId.hashCode());
        result =
                (result * PRIME)
                        + (this.functionLibraryKey == null
                                ? 43
                                : this.functionLibraryKey.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result = (result * PRIME) + (this.projection == null ? 43 : this.projection.hashCode());
        return result;
    }
}
