/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The information about the new node. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateNodeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateNodeDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "nodeType",
        "shape",
        "blockVolumeSizeInGBs",
        "subnetId",
        "shapeConfig"
    })
    public CreateNodeDetails(
            Node.NodeType nodeType,
            String shape,
            Long blockVolumeSizeInGBs,
            String subnetId,
            ShapeConfigDetails shapeConfig) {
        super();
        this.nodeType = nodeType;
        this.shape = shape;
        this.blockVolumeSizeInGBs = blockVolumeSizeInGBs;
        this.subnetId = subnetId;
        this.shapeConfig = shapeConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Big Data Service cluster node type. */
        @com.fasterxml.jackson.annotation.JsonProperty("nodeType")
        private Node.NodeType nodeType;

        /**
         * The Big Data Service cluster node type.
         *
         * @param nodeType the value to set
         * @return this builder
         */
        public Builder nodeType(Node.NodeType nodeType) {
            this.nodeType = nodeType;
            this.__explicitlySet__.add("nodeType");
            return this;
        }
        /** Shape of the node. */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * Shape of the node.
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /**
         * The size of block volume in GB to be attached to a given node. All the details needed for
         * attaching the block volume are managed by service itself.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeSizeInGBs")
        private Long blockVolumeSizeInGBs;

        /**
         * The size of block volume in GB to be attached to a given node. All the details needed for
         * attaching the block volume are managed by service itself.
         *
         * @param blockVolumeSizeInGBs the value to set
         * @return this builder
         */
        public Builder blockVolumeSizeInGBs(Long blockVolumeSizeInGBs) {
            this.blockVolumeSizeInGBs = blockVolumeSizeInGBs;
            this.__explicitlySet__.add("blockVolumeSizeInGBs");
            return this;
        }
        /** The OCID of the subnet in which the node will be created. */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of the subnet in which the node will be created.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapeConfig")
        private ShapeConfigDetails shapeConfig;

        public Builder shapeConfig(ShapeConfigDetails shapeConfig) {
            this.shapeConfig = shapeConfig;
            this.__explicitlySet__.add("shapeConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateNodeDetails build() {
            CreateNodeDetails model =
                    new CreateNodeDetails(
                            this.nodeType,
                            this.shape,
                            this.blockVolumeSizeInGBs,
                            this.subnetId,
                            this.shapeConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateNodeDetails model) {
            if (model.wasPropertyExplicitlySet("nodeType")) {
                this.nodeType(model.getNodeType());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("blockVolumeSizeInGBs")) {
                this.blockVolumeSizeInGBs(model.getBlockVolumeSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("shapeConfig")) {
                this.shapeConfig(model.getShapeConfig());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The Big Data Service cluster node type. */
    @com.fasterxml.jackson.annotation.JsonProperty("nodeType")
    private final Node.NodeType nodeType;

    /**
     * The Big Data Service cluster node type.
     *
     * @return the value
     */
    public Node.NodeType getNodeType() {
        return nodeType;
    }

    /** Shape of the node. */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * Shape of the node.
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /**
     * The size of block volume in GB to be attached to a given node. All the details needed for
     * attaching the block volume are managed by service itself.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeSizeInGBs")
    private final Long blockVolumeSizeInGBs;

    /**
     * The size of block volume in GB to be attached to a given node. All the details needed for
     * attaching the block volume are managed by service itself.
     *
     * @return the value
     */
    public Long getBlockVolumeSizeInGBs() {
        return blockVolumeSizeInGBs;
    }

    /** The OCID of the subnet in which the node will be created. */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of the subnet in which the node will be created.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("shapeConfig")
    private final ShapeConfigDetails shapeConfig;

    public ShapeConfigDetails getShapeConfig() {
        return shapeConfig;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateNodeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("nodeType=").append(String.valueOf(this.nodeType));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", blockVolumeSizeInGBs=").append(String.valueOf(this.blockVolumeSizeInGBs));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", shapeConfig=").append(String.valueOf(this.shapeConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateNodeDetails)) {
            return false;
        }

        CreateNodeDetails other = (CreateNodeDetails) o;
        return java.util.Objects.equals(this.nodeType, other.nodeType)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.blockVolumeSizeInGBs, other.blockVolumeSizeInGBs)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.shapeConfig, other.shapeConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.nodeType == null ? 43 : this.nodeType.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.blockVolumeSizeInGBs == null
                                ? 43
                                : this.blockVolumeSizeInGBs.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.shapeConfig == null ? 43 : this.shapeConfig.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
