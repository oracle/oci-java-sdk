/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * Shape configuration at node type level. Start cluster will start all nodes as is if no config is specified.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = NodeTypeShapeConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NodeTypeShapeConfig extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"nodeType", "shape"})
    public NodeTypeShapeConfig(Node.NodeType nodeType, String shape) {
        super();
        this.nodeType = nodeType;
        this.shape = shape;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Big Data Service cluster node type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("nodeType")
        private Node.NodeType nodeType;

        /**
         * The Big Data Service cluster node type.
         * @param nodeType the value to set
         * @return this builder
         **/
        public Builder nodeType(Node.NodeType nodeType) {
            this.nodeType = nodeType;
            this.__explicitlySet__.add("nodeType");
            return this;
        }
        /**
         * Shape of the node. This has to be specified when starting the cluster. Defaults to wn0 for homogeneous clusters and remains empty for heterogeneous clusters.
         * If provided, all nodes in the node type will adopt the specified shape; otherwise, nodes retain their original shapes.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * Shape of the node. This has to be specified when starting the cluster. Defaults to wn0 for homogeneous clusters and remains empty for heterogeneous clusters.
         * If provided, all nodes in the node type will adopt the specified shape; otherwise, nodes retain their original shapes.
         *
         * @param shape the value to set
         * @return this builder
         **/
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NodeTypeShapeConfig build() {
            NodeTypeShapeConfig model = new NodeTypeShapeConfig(this.nodeType, this.shape);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NodeTypeShapeConfig model) {
            if (model.wasPropertyExplicitlySet("nodeType")) {
                this.nodeType(model.getNodeType());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The Big Data Service cluster node type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nodeType")
    private final Node.NodeType nodeType;

    /**
     * The Big Data Service cluster node type.
     * @return the value
     **/
    public Node.NodeType getNodeType() {
        return nodeType;
    }

    /**
     * Shape of the node. This has to be specified when starting the cluster. Defaults to wn0 for homogeneous clusters and remains empty for heterogeneous clusters.
     * If provided, all nodes in the node type will adopt the specified shape; otherwise, nodes retain their original shapes.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * Shape of the node. This has to be specified when starting the cluster. Defaults to wn0 for homogeneous clusters and remains empty for heterogeneous clusters.
     * If provided, all nodes in the node type will adopt the specified shape; otherwise, nodes retain their original shapes.
     *
     * @return the value
     **/
    public String getShape() {
        return shape;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("NodeTypeShapeConfig(");
        sb.append("super=").append(super.toString());
        sb.append("nodeType=").append(String.valueOf(this.nodeType));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NodeTypeShapeConfig)) {
            return false;
        }

        NodeTypeShapeConfig other = (NodeTypeShapeConfig) o;
        return java.util.Objects.equals(this.nodeType, other.nodeType)
                && java.util.Objects.equals(this.shape, other.shape)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.nodeType == null ? 43 : this.nodeType.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
