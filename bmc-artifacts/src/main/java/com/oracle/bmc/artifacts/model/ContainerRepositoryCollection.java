/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.artifacts.model;

/**
 * List of container repository results.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ContainerRepositoryCollection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ContainerRepositoryCollection {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("layerCount")
        private Integer layerCount;

        public Builder layerCount(Integer layerCount) {
            this.layerCount = layerCount;
            this.__explicitlySet__.add("layerCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("layersSizeInBytes")
        private Long layersSizeInBytes;

        public Builder layersSizeInBytes(Long layersSizeInBytes) {
            this.layersSizeInBytes = layersSizeInBytes;
            this.__explicitlySet__.add("layersSizeInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("imageCount")
        private Integer imageCount;

        public Builder imageCount(Integer imageCount) {
            this.imageCount = imageCount;
            this.__explicitlySet__.add("imageCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<ContainerRepositorySummary> items;

        public Builder items(java.util.List<ContainerRepositorySummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("remainingItemsCount")
        private Integer remainingItemsCount;

        public Builder remainingItemsCount(Integer remainingItemsCount) {
            this.remainingItemsCount = remainingItemsCount;
            this.__explicitlySet__.add("remainingItemsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("repositoryCount")
        private Integer repositoryCount;

        public Builder repositoryCount(Integer repositoryCount) {
            this.repositoryCount = repositoryCount;
            this.__explicitlySet__.add("repositoryCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerRepositoryCollection build() {
            ContainerRepositoryCollection __instance__ =
                    new ContainerRepositoryCollection(
                            layerCount,
                            layersSizeInBytes,
                            imageCount,
                            items,
                            remainingItemsCount,
                            repositoryCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerRepositoryCollection o) {
            Builder copiedBuilder =
                    layerCount(o.getLayerCount())
                            .layersSizeInBytes(o.getLayersSizeInBytes())
                            .imageCount(o.getImageCount())
                            .items(o.getItems())
                            .remainingItemsCount(o.getRemainingItemsCount())
                            .repositoryCount(o.getRepositoryCount());

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
     * Total number of layers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("layerCount")
    Integer layerCount;

    /**
     * Total storage in bytes consumed by layers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("layersSizeInBytes")
    Long layersSizeInBytes;

    /**
     * Total number of images.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageCount")
    Integer imageCount;

    /**
     * Collection of container repositories.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    java.util.List<ContainerRepositorySummary> items;

    /**
     * Estimated number of remaining results.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remainingItemsCount")
    Integer remainingItemsCount;

    /**
     * Total number of repositories.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryCount")
    Integer repositoryCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
