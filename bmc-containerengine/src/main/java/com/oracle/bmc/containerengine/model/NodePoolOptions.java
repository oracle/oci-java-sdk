/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NodePoolOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class NodePoolOptions {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * Available Kubernetes versions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kubernetesVersions")
    java.util.List<String> kubernetesVersions;

    /**
     * Available shapes for nodes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapes")
    java.util.List<String> shapes;

    /**
     * Deprecated. See sources.
     * When creating a node pool using the `CreateNodePoolDetails` object, only image names contained in this
     * property can be passed to the `nodeImageName` property.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("images")
    java.util.List<String> images;

    /**
     * Available source of the node.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sources")
    java.util.List<NodeSourceOption> sources;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
