/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The information about added utility nodes. <br>
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
        builder = AddUtilityNodesDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AddUtilityNodesDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "clusterAdminPassword",
        "numberOfUtilityNodes",
        "shape",
        "blockVolumeSizeInGBs",
        "shapeConfig"
    })
    public AddUtilityNodesDetails(
            String clusterAdminPassword,
            Integer numberOfUtilityNodes,
            String shape,
            Long blockVolumeSizeInGBs,
            ShapeConfigDetails shapeConfig) {
        super();
        this.clusterAdminPassword = clusterAdminPassword;
        this.numberOfUtilityNodes = numberOfUtilityNodes;
        this.shape = shape;
        this.blockVolumeSizeInGBs = blockVolumeSizeInGBs;
        this.shapeConfig = shapeConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Base-64 encoded Cluster Admin Password for cluster admin user. */
        @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
        private String clusterAdminPassword;

        /**
         * Base-64 encoded Cluster Admin Password for cluster admin user.
         *
         * @param clusterAdminPassword the value to set
         * @return this builder
         */
        public Builder clusterAdminPassword(String clusterAdminPassword) {
            this.clusterAdminPassword = clusterAdminPassword;
            this.__explicitlySet__.add("clusterAdminPassword");
            return this;
        }
        /** Number of additional utility nodes for the cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfUtilityNodes")
        private Integer numberOfUtilityNodes;

        /**
         * Number of additional utility nodes for the cluster.
         *
         * @param numberOfUtilityNodes the value to set
         * @return this builder
         */
        public Builder numberOfUtilityNodes(Integer numberOfUtilityNodes) {
            this.numberOfUtilityNodes = numberOfUtilityNodes;
            this.__explicitlySet__.add("numberOfUtilityNodes");
            return this;
        }
        /** Shape of the node. It's a read-only property derived from existing Utility node. */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * Shape of the node. It's a read-only property derived from existing Utility node.
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
         * The size of block volume in GB to be attached to the given node. It's a read-only
         * property.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeSizeInGBs")
        private Long blockVolumeSizeInGBs;

        /**
         * The size of block volume in GB to be attached to the given node. It's a read-only
         * property.
         *
         * @param blockVolumeSizeInGBs the value to set
         * @return this builder
         */
        public Builder blockVolumeSizeInGBs(Long blockVolumeSizeInGBs) {
            this.blockVolumeSizeInGBs = blockVolumeSizeInGBs;
            this.__explicitlySet__.add("blockVolumeSizeInGBs");
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

        public AddUtilityNodesDetails build() {
            AddUtilityNodesDetails model =
                    new AddUtilityNodesDetails(
                            this.clusterAdminPassword,
                            this.numberOfUtilityNodes,
                            this.shape,
                            this.blockVolumeSizeInGBs,
                            this.shapeConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddUtilityNodesDetails model) {
            if (model.wasPropertyExplicitlySet("clusterAdminPassword")) {
                this.clusterAdminPassword(model.getClusterAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("numberOfUtilityNodes")) {
                this.numberOfUtilityNodes(model.getNumberOfUtilityNodes());
            }
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("blockVolumeSizeInGBs")) {
                this.blockVolumeSizeInGBs(model.getBlockVolumeSizeInGBs());
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

    /** Base-64 encoded Cluster Admin Password for cluster admin user. */
    @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
    private final String clusterAdminPassword;

    /**
     * Base-64 encoded Cluster Admin Password for cluster admin user.
     *
     * @return the value
     */
    public String getClusterAdminPassword() {
        return clusterAdminPassword;
    }

    /** Number of additional utility nodes for the cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfUtilityNodes")
    private final Integer numberOfUtilityNodes;

    /**
     * Number of additional utility nodes for the cluster.
     *
     * @return the value
     */
    public Integer getNumberOfUtilityNodes() {
        return numberOfUtilityNodes;
    }

    /** Shape of the node. It's a read-only property derived from existing Utility node. */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * Shape of the node. It's a read-only property derived from existing Utility node.
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /**
     * The size of block volume in GB to be attached to the given node. It's a read-only property.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeSizeInGBs")
    private final Long blockVolumeSizeInGBs;

    /**
     * The size of block volume in GB to be attached to the given node. It's a read-only property.
     *
     * @return the value
     */
    public Long getBlockVolumeSizeInGBs() {
        return blockVolumeSizeInGBs;
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
        sb.append("AddUtilityNodesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("clusterAdminPassword=").append("<redacted>");
        sb.append(", numberOfUtilityNodes=").append(String.valueOf(this.numberOfUtilityNodes));
        sb.append(", shape=").append(String.valueOf(this.shape));
        sb.append(", blockVolumeSizeInGBs=").append(String.valueOf(this.blockVolumeSizeInGBs));
        sb.append(", shapeConfig=").append(String.valueOf(this.shapeConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddUtilityNodesDetails)) {
            return false;
        }

        AddUtilityNodesDetails other = (AddUtilityNodesDetails) o;
        return java.util.Objects.equals(this.clusterAdminPassword, other.clusterAdminPassword)
                && java.util.Objects.equals(this.numberOfUtilityNodes, other.numberOfUtilityNodes)
                && java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.blockVolumeSizeInGBs, other.blockVolumeSizeInGBs)
                && java.util.Objects.equals(this.shapeConfig, other.shapeConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.clusterAdminPassword == null
                                ? 43
                                : this.clusterAdminPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.numberOfUtilityNodes == null
                                ? 43
                                : this.numberOfUtilityNodes.hashCode());
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.blockVolumeSizeInGBs == null
                                ? 43
                                : this.blockVolumeSizeInGBs.hashCode());
        result = (result * PRIME) + (this.shapeConfig == null ? 43 : this.shapeConfig.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
