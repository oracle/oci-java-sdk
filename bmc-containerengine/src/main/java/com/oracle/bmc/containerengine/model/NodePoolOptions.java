/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerengine.model;

/**
 * Options for creating or updating node pools.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NodePoolOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NodePoolOptions extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"kubernetesVersions", "shapes", "images", "sources"})
    public NodePoolOptions(
            java.util.List<String> kubernetesVersions,
            java.util.List<String> shapes,
            java.util.List<String> images,
            java.util.List<NodeSourceOption> sources) {
        super();
        this.kubernetesVersions = kubernetesVersions;
        this.shapes = shapes;
        this.images = images;
        this.sources = sources;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Available Kubernetes versions.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersions")
        private java.util.List<String> kubernetesVersions;

        /**
         * Available Kubernetes versions.
         * @param kubernetesVersions the value to set
         * @return this builder
         **/
        public Builder kubernetesVersions(java.util.List<String> kubernetesVersions) {
            this.kubernetesVersions = kubernetesVersions;
            this.__explicitlySet__.add("kubernetesVersions");
            return this;
        }
        /**
         * Available shapes for nodes.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shapes")
        private java.util.List<String> shapes;

        /**
         * Available shapes for nodes.
         * @param shapes the value to set
         * @return this builder
         **/
        public Builder shapes(java.util.List<String> shapes) {
            this.shapes = shapes;
            this.__explicitlySet__.add("shapes");
            return this;
        }
        /**
         * Deprecated. See sources.
         * When creating a node pool using the {@code CreateNodePoolDetails} object, only image names contained in this
         * property can be passed to the {@code nodeImageName} property.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("images")
        private java.util.List<String> images;

        /**
         * Deprecated. See sources.
         * When creating a node pool using the {@code CreateNodePoolDetails} object, only image names contained in this
         * property can be passed to the {@code nodeImageName} property.
         *
         * @param images the value to set
         * @return this builder
         **/
        public Builder images(java.util.List<String> images) {
            this.images = images;
            this.__explicitlySet__.add("images");
            return this;
        }
        /**
         * Available source of the node.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sources")
        private java.util.List<NodeSourceOption> sources;

        /**
         * Available source of the node.
         * @param sources the value to set
         * @return this builder
         **/
        public Builder sources(java.util.List<NodeSourceOption> sources) {
            this.sources = sources;
            this.__explicitlySet__.add("sources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NodePoolOptions build() {
            NodePoolOptions model =
                    new NodePoolOptions(
                            this.kubernetesVersions, this.shapes, this.images, this.sources);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NodePoolOptions model) {
            if (model.wasPropertyExplicitlySet("kubernetesVersions")) {
                this.kubernetesVersions(model.getKubernetesVersions());
            }
            if (model.wasPropertyExplicitlySet("shapes")) {
                this.shapes(model.getShapes());
            }
            if (model.wasPropertyExplicitlySet("images")) {
                this.images(model.getImages());
            }
            if (model.wasPropertyExplicitlySet("sources")) {
                this.sources(model.getSources());
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
     * Available Kubernetes versions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersions")
    private final java.util.List<String> kubernetesVersions;

    /**
     * Available Kubernetes versions.
     * @return the value
     **/
    public java.util.List<String> getKubernetesVersions() {
        return kubernetesVersions;
    }

    /**
     * Available shapes for nodes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapes")
    private final java.util.List<String> shapes;

    /**
     * Available shapes for nodes.
     * @return the value
     **/
    public java.util.List<String> getShapes() {
        return shapes;
    }

    /**
     * Deprecated. See sources.
     * When creating a node pool using the {@code CreateNodePoolDetails} object, only image names contained in this
     * property can be passed to the {@code nodeImageName} property.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("images")
    private final java.util.List<String> images;

    /**
     * Deprecated. See sources.
     * When creating a node pool using the {@code CreateNodePoolDetails} object, only image names contained in this
     * property can be passed to the {@code nodeImageName} property.
     *
     * @return the value
     **/
    public java.util.List<String> getImages() {
        return images;
    }

    /**
     * Available source of the node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    private final java.util.List<NodeSourceOption> sources;

    /**
     * Available source of the node.
     * @return the value
     **/
    public java.util.List<NodeSourceOption> getSources() {
        return sources;
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
        sb.append("NodePoolOptions(");
        sb.append("super=").append(super.toString());
        sb.append("kubernetesVersions=").append(String.valueOf(this.kubernetesVersions));
        sb.append(", shapes=").append(String.valueOf(this.shapes));
        sb.append(", images=").append(String.valueOf(this.images));
        sb.append(", sources=").append(String.valueOf(this.sources));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NodePoolOptions)) {
            return false;
        }

        NodePoolOptions other = (NodePoolOptions) o;
        return java.util.Objects.equals(this.kubernetesVersions, other.kubernetesVersions)
                && java.util.Objects.equals(this.shapes, other.shapes)
                && java.util.Objects.equals(this.images, other.images)
                && java.util.Objects.equals(this.sources, other.sources)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.kubernetesVersions == null
                                ? 43
                                : this.kubernetesVersions.hashCode());
        result = (result * PRIME) + (this.shapes == null ? 43 : this.shapes.hashCode());
        result = (result * PRIME) + (this.images == null ? 43 : this.images.hashCode());
        result = (result * PRIME) + (this.sources == null ? 43 : this.sources.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
