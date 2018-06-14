/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.containerengine.model;

/**
 * Options for creating or updating node pools.
 * <br/>
 * Note: This model distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a set of all
 * explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods
 * are implemented to take {@link #__explicitlySet__} into account. The constructor, on the other hand, does not
 * set {@link #__explicitlySet__} (since the constructor cannot distinguish explicit {@code null} from unset
 * {@code null}). As a consequence, objects should always be created or deserialized using the {@link Builder}.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180222")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NodePoolOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
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

        @com.fasterxml.jackson.annotation.JsonProperty("images")
        private java.util.List<String> images;

        public Builder images(java.util.List<String> images) {
            this.images = images;
            this.__explicitlySet__.add("images");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapes")
        private java.util.List<String> shapes;

        public Builder shapes(java.util.List<String> shapes) {
            this.shapes = shapes;
            this.__explicitlySet__.add("shapes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NodePoolOptions build() {
            NodePoolOptions __instance__ = new NodePoolOptions(kubernetesVersions, images, shapes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NodePoolOptions o) {
            Builder copiedBuilder =
                    kubernetesVersions(o.getKubernetesVersions())
                            .images(o.getImages())
                            .shapes(o.getShapes());

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
     * Available Kubernetes versions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("images")
    java.util.List<String> images;

    /**
     * Available shapes for nodes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapes")
    java.util.List<String> shapes;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
