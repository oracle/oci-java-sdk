/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.requests;

import com.oracle.bmc.containerengine.model.*;
/**
 * <b>Example: </b>Click <a
 * href="https://docs.oracle.com/en-us/iaas/tools/java-sdk-examples/latest/containerengine/GetNodePoolOptionsExample.java.html"
 * target="_blank" rel="noopener noreferrer">here</a> to see how to use GetNodePoolOptionsRequest.
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
public class GetNodePoolOptionsRequest extends com.oracle.bmc.requests.BmcRequest<java.lang.Void> {

    /**
     * The id of the option set to retrieve. Use "all" get all options, or use a cluster ID to get
     * options specific to the provided cluster.
     */
    private String nodePoolOptionId;

    /**
     * The id of the option set to retrieve. Use "all" get all options, or use a cluster ID to get
     * options specific to the provided cluster.
     */
    public String getNodePoolOptionId() {
        return nodePoolOptionId;
    }
    /** The OCID of the compartment. */
    private String compartmentId;

    /** The OCID of the compartment. */
    public String getCompartmentId() {
        return compartmentId;
    }
    /** Option to show all kubernetes patch versions */
    private Boolean shouldListAllPatchVersions;

    /** Option to show all kubernetes patch versions */
    public Boolean getShouldListAllPatchVersions() {
        return shouldListAllPatchVersions;
    }
    /** Filter node pool options by OS type. */
    private NodePoolOsType nodePoolOsType;

    /** Filter node pool options by OS type. */
    public enum NodePoolOsType implements com.oracle.bmc.http.internal.BmcEnum {
        Ol7("OL7"),
        Ol8("OL8"),
        Ubuntu("UBUNTU"),
        ;

        private final String value;
        private static java.util.Map<String, NodePoolOsType> map;

        static {
            map = new java.util.HashMap<>();
            for (NodePoolOsType v : NodePoolOsType.values()) {
                map.put(v.getValue(), v);
            }
        }

        NodePoolOsType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NodePoolOsType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid NodePoolOsType: " + key);
        }
    };

    /** Filter node pool options by OS type. */
    public NodePoolOsType getNodePoolOsType() {
        return nodePoolOsType;
    }
    /** Filter node pool options by OS architecture. */
    private NodePoolOsArch nodePoolOsArch;

    /** Filter node pool options by OS architecture. */
    public enum NodePoolOsArch implements com.oracle.bmc.http.internal.BmcEnum {
        X8664("X86_64"),
        Aarch64("AARCH64"),
        ;

        private final String value;
        private static java.util.Map<String, NodePoolOsArch> map;

        static {
            map = new java.util.HashMap<>();
            for (NodePoolOsArch v : NodePoolOsArch.values()) {
                map.put(v.getValue(), v);
            }
        }

        NodePoolOsArch(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NodePoolOsArch create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid NodePoolOsArch: " + key);
        }
    };

    /** Filter node pool options by OS architecture. */
    public NodePoolOsArch getNodePoolOsArch() {
        return nodePoolOsArch;
    }
    /** Filter node pool options by Kubernetes version. */
    private String nodePoolK8sVersion;

    /** Filter node pool options by Kubernetes version. */
    public String getNodePoolK8sVersion() {
        return nodePoolK8sVersion;
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
                    GetNodePoolOptionsRequest, java.lang.Void> {
        private com.oracle.bmc.http.client.RequestInterceptor invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * The id of the option set to retrieve. Use "all" get all options, or use a cluster ID to
         * get options specific to the provided cluster.
         */
        private String nodePoolOptionId = null;

        /**
         * The id of the option set to retrieve. Use "all" get all options, or use a cluster ID to
         * get options specific to the provided cluster.
         *
         * @param nodePoolOptionId the value to set
         * @return this builder instance
         */
        public Builder nodePoolOptionId(String nodePoolOptionId) {
            this.nodePoolOptionId = nodePoolOptionId;
            return this;
        }

        /** The OCID of the compartment. */
        private String compartmentId = null;

        /**
         * The OCID of the compartment.
         *
         * @param compartmentId the value to set
         * @return this builder instance
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }

        /** Option to show all kubernetes patch versions */
        private Boolean shouldListAllPatchVersions = null;

        /**
         * Option to show all kubernetes patch versions
         *
         * @param shouldListAllPatchVersions the value to set
         * @return this builder instance
         */
        public Builder shouldListAllPatchVersions(Boolean shouldListAllPatchVersions) {
            this.shouldListAllPatchVersions = shouldListAllPatchVersions;
            return this;
        }

        /** Filter node pool options by OS type. */
        private NodePoolOsType nodePoolOsType = null;

        /**
         * Filter node pool options by OS type.
         *
         * @param nodePoolOsType the value to set
         * @return this builder instance
         */
        public Builder nodePoolOsType(NodePoolOsType nodePoolOsType) {
            this.nodePoolOsType = nodePoolOsType;
            return this;
        }

        /** Filter node pool options by OS architecture. */
        private NodePoolOsArch nodePoolOsArch = null;

        /**
         * Filter node pool options by OS architecture.
         *
         * @param nodePoolOsArch the value to set
         * @return this builder instance
         */
        public Builder nodePoolOsArch(NodePoolOsArch nodePoolOsArch) {
            this.nodePoolOsArch = nodePoolOsArch;
            return this;
        }

        /** Filter node pool options by Kubernetes version. */
        private String nodePoolK8sVersion = null;

        /**
         * Filter node pool options by Kubernetes version.
         *
         * @param nodePoolK8sVersion the value to set
         * @return this builder instance
         */
        public Builder nodePoolK8sVersion(String nodePoolK8sVersion) {
            this.nodePoolK8sVersion = nodePoolK8sVersion;
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
        public Builder copy(GetNodePoolOptionsRequest o) {
            nodePoolOptionId(o.getNodePoolOptionId());
            compartmentId(o.getCompartmentId());
            shouldListAllPatchVersions(o.getShouldListAllPatchVersions());
            nodePoolOsType(o.getNodePoolOsType());
            nodePoolOsArch(o.getNodePoolOsArch());
            nodePoolK8sVersion(o.getNodePoolK8sVersion());
            opcRequestId(o.getOpcRequestId());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of GetNodePoolOptionsRequest as configured by this builder
         *
         * <p>Note that this method takes calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * <p>This is the preferred method to build an instance.
         *
         * @return instance of GetNodePoolOptionsRequest
         */
        public GetNodePoolOptionsRequest build() {
            GetNodePoolOptionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }

        /**
         * Build the instance of GetNodePoolOptionsRequest as configured by this builder
         *
         * <p>Note that this method does not take calls to {@link
         * Builder#invocationCallback(com.oracle.bmc.http.client.RequestInterceptor)} into account,
         * while the method {@link Builder#build} does
         *
         * @return instance of GetNodePoolOptionsRequest
         */
        public GetNodePoolOptionsRequest buildWithoutInvocationCallback() {
            GetNodePoolOptionsRequest request = new GetNodePoolOptionsRequest();
            request.nodePoolOptionId = nodePoolOptionId;
            request.compartmentId = compartmentId;
            request.shouldListAllPatchVersions = shouldListAllPatchVersions;
            request.nodePoolOsType = nodePoolOsType;
            request.nodePoolOsArch = nodePoolOsArch;
            request.nodePoolK8sVersion = nodePoolK8sVersion;
            request.opcRequestId = opcRequestId;
            return request;
            // new GetNodePoolOptionsRequest(nodePoolOptionId, compartmentId,
            // shouldListAllPatchVersions, nodePoolOsType, nodePoolOsArch, nodePoolK8sVersion,
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
                .nodePoolOptionId(nodePoolOptionId)
                .compartmentId(compartmentId)
                .shouldListAllPatchVersions(shouldListAllPatchVersions)
                .nodePoolOsType(nodePoolOsType)
                .nodePoolOsArch(nodePoolOsArch)
                .nodePoolK8sVersion(nodePoolK8sVersion)
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
        sb.append(",nodePoolOptionId=").append(String.valueOf(this.nodePoolOptionId));
        sb.append(",compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(",shouldListAllPatchVersions=")
                .append(String.valueOf(this.shouldListAllPatchVersions));
        sb.append(",nodePoolOsType=").append(String.valueOf(this.nodePoolOsType));
        sb.append(",nodePoolOsArch=").append(String.valueOf(this.nodePoolOsArch));
        sb.append(",nodePoolK8sVersion=").append(String.valueOf(this.nodePoolK8sVersion));
        sb.append(",opcRequestId=").append(String.valueOf(this.opcRequestId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetNodePoolOptionsRequest)) {
            return false;
        }

        GetNodePoolOptionsRequest other = (GetNodePoolOptionsRequest) o;
        return super.equals(o)
                && java.util.Objects.equals(this.nodePoolOptionId, other.nodePoolOptionId)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.shouldListAllPatchVersions, other.shouldListAllPatchVersions)
                && java.util.Objects.equals(this.nodePoolOsType, other.nodePoolOsType)
                && java.util.Objects.equals(this.nodePoolOsArch, other.nodePoolOsArch)
                && java.util.Objects.equals(this.nodePoolK8sVersion, other.nodePoolK8sVersion)
                && java.util.Objects.equals(this.opcRequestId, other.opcRequestId);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.nodePoolOptionId == null ? 43 : this.nodePoolOptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldListAllPatchVersions == null
                                ? 43
                                : this.shouldListAllPatchVersions.hashCode());
        result =
                (result * PRIME)
                        + (this.nodePoolOsType == null ? 43 : this.nodePoolOsType.hashCode());
        result =
                (result * PRIME)
                        + (this.nodePoolOsArch == null ? 43 : this.nodePoolOsArch.hashCode());
        result =
                (result * PRIME)
                        + (this.nodePoolK8sVersion == null
                                ? 43
                                : this.nodePoolK8sVersion.hashCode());
        result = (result * PRIME) + (this.opcRequestId == null ? 43 : this.opcRequestId.hashCode());
        return result;
    }
}
