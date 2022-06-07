/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
public final class NodePoolOptions {
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
        @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersions")
        private java.util.List<String> kubernetesVersions;

        public Builder kubernetesVersions(java.util.List<String> kubernetesVersions) {
            this.kubernetesVersions = kubernetesVersions;
            this.__explicitlySet__.add("kubernetesVersions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapes")
        private java.util.List<String> shapes;

        public Builder shapes(java.util.List<String> shapes) {
            this.shapes = shapes;
            this.__explicitlySet__.add("shapes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("images")
        private java.util.List<String> images;

        public Builder images(java.util.List<String> images) {
            this.images = images;
            this.__explicitlySet__.add("images");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sources")
        private java.util.List<NodeSourceOption> sources;

        public Builder sources(java.util.List<NodeSourceOption> sources) {
            this.sources = sources;
            this.__explicitlySet__.add("sources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NodePoolOptions build() {
            NodePoolOptions __instance__ =
                    new NodePoolOptions(kubernetesVersions, shapes, images, sources);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NodePoolOptions o) {
            Builder copiedBuilder =
                    kubernetesVersions(o.getKubernetesVersions())
                            .shapes(o.getShapes())
                            .images(o.getImages())
                            .sources(o.getSources());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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

    public java.util.List<String> getKubernetesVersions() {
        return kubernetesVersions;
    }

    /**
     * Available shapes for nodes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapes")
    private final java.util.List<String> shapes;

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

    public java.util.List<String> getImages() {
        return images;
    }

    /**
     * Available source of the node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    private final java.util.List<NodeSourceOption> sources;

    public java.util.List<NodeSourceOption> getSources() {
        return sources;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("NodePoolOptions(");
        sb.append("kubernetesVersions=").append(String.valueOf(this.kubernetesVersions));
        sb.append(", shapes=").append(String.valueOf(this.shapes));
        sb.append(", images=").append(String.valueOf(this.images));
        sb.append(", sources=").append(String.valueOf(this.sources));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
