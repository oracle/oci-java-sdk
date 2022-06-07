/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ContainerRepositoryCollection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ContainerRepositoryCollection {
    @Deprecated
    @java.beans.ConstructorProperties({
        "layerCount",
        "layersSizeInBytes",
        "imageCount",
        "items",
        "remainingItemsCount",
        "repositoryCount"
    })
    public ContainerRepositoryCollection(
            Integer layerCount,
            Long layersSizeInBytes,
            Integer imageCount,
            java.util.List<ContainerRepositorySummary> items,
            Integer remainingItemsCount,
            Integer repositoryCount) {
        super();
        this.layerCount = layerCount;
        this.layersSizeInBytes = layersSizeInBytes;
        this.imageCount = imageCount;
        this.items = items;
        this.remainingItemsCount = remainingItemsCount;
        this.repositoryCount = repositoryCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Total number of layers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("layerCount")
    private final Integer layerCount;

    public Integer getLayerCount() {
        return layerCount;
    }

    /**
     * Total storage in bytes consumed by layers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("layersSizeInBytes")
    private final Long layersSizeInBytes;

    public Long getLayersSizeInBytes() {
        return layersSizeInBytes;
    }

    /**
     * Total number of images.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageCount")
    private final Integer imageCount;

    public Integer getImageCount() {
        return imageCount;
    }

    /**
     * Collection of container repositories.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<ContainerRepositorySummary> items;

    public java.util.List<ContainerRepositorySummary> getItems() {
        return items;
    }

    /**
     * Estimated number of remaining results.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remainingItemsCount")
    private final Integer remainingItemsCount;

    public Integer getRemainingItemsCount() {
        return remainingItemsCount;
    }

    /**
     * Total number of repositories.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryCount")
    private final Integer repositoryCount;

    public Integer getRepositoryCount() {
        return repositoryCount;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ContainerRepositoryCollection(");
        sb.append("layerCount=").append(String.valueOf(this.layerCount));
        sb.append(", layersSizeInBytes=").append(String.valueOf(this.layersSizeInBytes));
        sb.append(", imageCount=").append(String.valueOf(this.imageCount));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(", remainingItemsCount=").append(String.valueOf(this.remainingItemsCount));
        sb.append(", repositoryCount=").append(String.valueOf(this.repositoryCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ContainerRepositoryCollection)) {
            return false;
        }

        ContainerRepositoryCollection other = (ContainerRepositoryCollection) o;
        return java.util.Objects.equals(this.layerCount, other.layerCount)
                && java.util.Objects.equals(this.layersSizeInBytes, other.layersSizeInBytes)
                && java.util.Objects.equals(this.imageCount, other.imageCount)
                && java.util.Objects.equals(this.items, other.items)
                && java.util.Objects.equals(this.remainingItemsCount, other.remainingItemsCount)
                && java.util.Objects.equals(this.repositoryCount, other.repositoryCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.layerCount == null ? 43 : this.layerCount.hashCode());
        result =
                (result * PRIME)
                        + (this.layersSizeInBytes == null ? 43 : this.layersSizeInBytes.hashCode());
        result = (result * PRIME) + (this.imageCount == null ? 43 : this.imageCount.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result =
                (result * PRIME)
                        + (this.remainingItemsCount == null
                                ? 43
                                : this.remainingItemsCount.hashCode());
        result =
                (result * PRIME)
                        + (this.repositoryCount == null ? 43 : this.repositoryCount.hashCode());
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
