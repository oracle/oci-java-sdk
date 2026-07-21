/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.analytics.responses;

import com.oracle.bmc.analytics.model.*;

@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190331")
public class CreateResourceGroupResponse extends com.oracle.bmc.responses.BmcResponse {
    /** For optimistic concurrency control. See {@code if-match}. */
    private String etag;

    /**
     * For optimistic concurrency control. See {@code if-match}.
     *
     * @return the value
     */
    public String getEtag() {
        return etag;
    }

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     */
    private String opcRequestId;

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
     * particular request, please provide the request ID.
     *
     * @return the value
     */
    public String getOpcRequestId() {
        return opcRequestId;
    }

    /**
     * The OCID of the work request. Use {@link #getWorkRequest(GetWorkRequestRequest)
     * getWorkRequest} with this ID to track the status of the request.
     */
    private String opcWorkRequestId;

    /**
     * The OCID of the work request. Use {@link #getWorkRequest(GetWorkRequestRequest)
     * getWorkRequest} with this ID to track the status of the request.
     *
     * @return the value
     */
    public String getOpcWorkRequestId() {
        return opcWorkRequestId;
    }

    /**
     * The id of the child object being created. Child objects are not top level objects, but exist
     * as part of a larger object (usually instance).
     */
    private String childResourceId;

    /**
     * The id of the child object being created. Child objects are not top level objects, but exist
     * as part of a larger object (usually instance).
     *
     * @return the value
     */
    public String getChildResourceId() {
        return childResourceId;
    }

    /** The full URI of the resource. */
    private String location;

    /**
     * The full URI of the resource.
     *
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /** The returned {@code InstanceResourceGroup} instance. */
    private com.oracle.bmc.analytics.model.InstanceResourceGroup instanceResourceGroup;

    /**
     * The returned {@code InstanceResourceGroup} instance.
     *
     * @return the value
     */
    public com.oracle.bmc.analytics.model.InstanceResourceGroup getInstanceResourceGroup() {
        return instanceResourceGroup;
    }

    @java.beans.ConstructorProperties({
        "__httpStatusCode__",
        "headers",
        "etag",
        "opcRequestId",
        "opcWorkRequestId",
        "childResourceId",
        "location",
        "instanceResourceGroup"
    })
    private CreateResourceGroupResponse(
            int __httpStatusCode__,
            java.util.Map<String, java.util.List<String>> headers,
            String etag,
            String opcRequestId,
            String opcWorkRequestId,
            String childResourceId,
            String location,
            com.oracle.bmc.analytics.model.InstanceResourceGroup instanceResourceGroup) {
        super(__httpStatusCode__, headers);
        this.etag = etag;
        this.opcRequestId = opcRequestId;
        this.opcWorkRequestId = opcWorkRequestId;
        this.childResourceId = childResourceId;
        this.location = location;
        this.instanceResourceGroup = instanceResourceGroup;
    }

    public static class Builder
            implements com.oracle.bmc.responses.BmcResponse.Builder<CreateResourceGroupResponse> {
        private int __httpStatusCode__;

        @Override
        public Builder __httpStatusCode__(int __httpStatusCode__) {
            this.__httpStatusCode__ = __httpStatusCode__;
            return this;
        }

        private java.util.Map<String, java.util.List<String>> headers;

        @Override
        public Builder headers(java.util.Map<String, java.util.List<String>> headers) {
            this.headers = headers;
            return this;
        }

        /** For optimistic concurrency control. See {@code if-match}. */
        private String etag;

        /**
         * For optimistic concurrency control. See {@code if-match}.
         *
         * @param etag the value to set
         * @return this builder
         */
        public Builder etag(String etag) {
            this.etag = etag;
            return this;
        }

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         */
        private String opcRequestId;

        /**
         * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a
         * particular request, please provide the request ID.
         *
         * @param opcRequestId the value to set
         * @return this builder
         */
        public Builder opcRequestId(String opcRequestId) {
            this.opcRequestId = opcRequestId;
            return this;
        }

        /**
         * The OCID of the work request. Use {@link #getWorkRequest(GetWorkRequestRequest)
         * getWorkRequest} with this ID to track the status of the request.
         */
        private String opcWorkRequestId;

        /**
         * The OCID of the work request. Use {@link #getWorkRequest(GetWorkRequestRequest)
         * getWorkRequest} with this ID to track the status of the request.
         *
         * @param opcWorkRequestId the value to set
         * @return this builder
         */
        public Builder opcWorkRequestId(String opcWorkRequestId) {
            this.opcWorkRequestId = opcWorkRequestId;
            return this;
        }

        /**
         * The id of the child object being created. Child objects are not top level objects, but
         * exist as part of a larger object (usually instance).
         */
        private String childResourceId;

        /**
         * The id of the child object being created. Child objects are not top level objects, but
         * exist as part of a larger object (usually instance).
         *
         * @param childResourceId the value to set
         * @return this builder
         */
        public Builder childResourceId(String childResourceId) {
            this.childResourceId = childResourceId;
            return this;
        }

        /** The full URI of the resource. */
        private String location;

        /**
         * The full URI of the resource.
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /** The returned {@code InstanceResourceGroup} instance. */
        private com.oracle.bmc.analytics.model.InstanceResourceGroup instanceResourceGroup;

        /**
         * The returned {@code InstanceResourceGroup} instance.
         *
         * @param instanceResourceGroup the value to set
         * @return this builder
         */
        public Builder instanceResourceGroup(
                com.oracle.bmc.analytics.model.InstanceResourceGroup instanceResourceGroup) {
            this.instanceResourceGroup = instanceResourceGroup;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         *
         * @return this builder instance
         */
        @Override
        public Builder copy(CreateResourceGroupResponse o) {
            __httpStatusCode__(o.get__httpStatusCode__());
            headers(o.getHeaders());
            etag(o.getEtag());
            opcRequestId(o.getOpcRequestId());
            opcWorkRequestId(o.getOpcWorkRequestId());
            childResourceId(o.getChildResourceId());
            location(o.getLocation());
            instanceResourceGroup(o.getInstanceResourceGroup());

            return this;
        }

        /**
         * Build the response object.
         *
         * @return the response object
         */
        @Override
        public CreateResourceGroupResponse build() {
            return new CreateResourceGroupResponse(
                    __httpStatusCode__,
                    headers,
                    etag,
                    opcRequestId,
                    opcWorkRequestId,
                    childResourceId,
                    location,
                    instanceResourceGroup);
        }
    }

    /**
     * Return a new builder for this response object.
     *
     * @return builder for the response object
     */
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("(");
        sb.append("super=").append(super.toString());
        sb.append(",etag=").append(String.valueOf(etag));
        sb.append(",opcRequestId=").append(String.valueOf(opcRequestId));
        sb.append(",opcWorkRequestId=").append(String.valueOf(opcWorkRequestId));
        sb.append(",childResourceId=").append(String.valueOf(childResourceId));
        sb.append(",location=").append(String.valueOf(location));
        sb.append(",instanceResourceGroup=").append(String.valueOf(instanceResourceGroup));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateResourceGroupResponse)) {
            return false;
        }

        CreateResourceGroupResponse other = (CreateResourceGroupResponse) o;
        return super.equals(o)
                && java.util.Objects.equals(this.etag, other.etag)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId)
                && java.util.Objects.equals(this.opcWorkRequestId, other.opcWorkRequestId)
                && java.util.Objects.equals(this.childResourceId, other.childResourceId)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(
                        this.instanceResourceGroup, other.instanceResourceGroup);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.etag == null ? 43 : this.etag.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.opcWorkRequestId == null ? 43 : this.opcWorkRequestId.hashCode());
        result =
                (result * PRIME)
                        + (this.childResourceId == null ? 43 : this.childResourceId.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceResourceGroup == null
                                ? 43
                                : this.instanceResourceGroup.hashCode());
        return result;
    }
}
