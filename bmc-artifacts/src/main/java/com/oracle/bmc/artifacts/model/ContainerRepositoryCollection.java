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
public final class ContainerRepositoryCollection
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
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
        /**
         * Total number of layers.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("layerCount")
        private Integer layerCount;

        /**
         * Total number of layers.
         * @param layerCount the value to set
         * @return this builder
         **/
        public Builder layerCount(Integer layerCount) {
            this.layerCount = layerCount;
            this.__explicitlySet__.add("layerCount");
            return this;
        }
        /**
         * Total storage in bytes consumed by layers.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("layersSizeInBytes")
        private Long layersSizeInBytes;

        /**
         * Total storage in bytes consumed by layers.
         * @param layersSizeInBytes the value to set
         * @return this builder
         **/
        public Builder layersSizeInBytes(Long layersSizeInBytes) {
            this.layersSizeInBytes = layersSizeInBytes;
            this.__explicitlySet__.add("layersSizeInBytes");
            return this;
        }
        /**
         * Total number of images.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("imageCount")
        private Integer imageCount;

        /**
         * Total number of images.
         * @param imageCount the value to set
         * @return this builder
         **/
        public Builder imageCount(Integer imageCount) {
            this.imageCount = imageCount;
            this.__explicitlySet__.add("imageCount");
            return this;
        }
        /**
         * Collection of container repositories.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<ContainerRepositorySummary> items;

        /**
         * Collection of container repositories.
         * @param items the value to set
         * @return this builder
         **/
        public Builder items(java.util.List<ContainerRepositorySummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }
        /**
         * Estimated number of remaining results.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("remainingItemsCount")
        private Integer remainingItemsCount;

        /**
         * Estimated number of remaining results.
         * @param remainingItemsCount the value to set
         * @return this builder
         **/
        public Builder remainingItemsCount(Integer remainingItemsCount) {
            this.remainingItemsCount = remainingItemsCount;
            this.__explicitlySet__.add("remainingItemsCount");
            return this;
        }
        /**
         * Total number of repositories.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryCount")
        private Integer repositoryCount;

        /**
         * Total number of repositories.
         * @param repositoryCount the value to set
         * @return this builder
         **/
        public Builder repositoryCount(Integer repositoryCount) {
            this.repositoryCount = repositoryCount;
            this.__explicitlySet__.add("repositoryCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ContainerRepositoryCollection build() {
            ContainerRepositoryCollection model =
                    new ContainerRepositoryCollection(
                            this.layerCount,
                            this.layersSizeInBytes,
                            this.imageCount,
                            this.items,
                            this.remainingItemsCount,
                            this.repositoryCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ContainerRepositoryCollection model) {
            if (model.wasPropertyExplicitlySet("layerCount")) {
                this.layerCount(model.getLayerCount());
            }
            if (model.wasPropertyExplicitlySet("layersSizeInBytes")) {
                this.layersSizeInBytes(model.getLayersSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("imageCount")) {
                this.imageCount(model.getImageCount());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
            }
            if (model.wasPropertyExplicitlySet("remainingItemsCount")) {
                this.remainingItemsCount(model.getRemainingItemsCount());
            }
            if (model.wasPropertyExplicitlySet("repositoryCount")) {
                this.repositoryCount(model.getRepositoryCount());
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
     * Total number of layers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("layerCount")
    private final Integer layerCount;

    /**
     * Total number of layers.
     * @return the value
     **/
    public Integer getLayerCount() {
        return layerCount;
    }

    /**
     * Total storage in bytes consumed by layers.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("layersSizeInBytes")
    private final Long layersSizeInBytes;

    /**
     * Total storage in bytes consumed by layers.
     * @return the value
     **/
    public Long getLayersSizeInBytes() {
        return layersSizeInBytes;
    }

    /**
     * Total number of images.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("imageCount")
    private final Integer imageCount;

    /**
     * Total number of images.
     * @return the value
     **/
    public Integer getImageCount() {
        return imageCount;
    }

    /**
     * Collection of container repositories.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<ContainerRepositorySummary> items;

    /**
     * Collection of container repositories.
     * @return the value
     **/
    public java.util.List<ContainerRepositorySummary> getItems() {
        return items;
    }

    /**
     * Estimated number of remaining results.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("remainingItemsCount")
    private final Integer remainingItemsCount;

    /**
     * Estimated number of remaining results.
     * @return the value
     **/
    public Integer getRemainingItemsCount() {
        return remainingItemsCount;
    }

    /**
     * Total number of repositories.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryCount")
    private final Integer repositoryCount;

    /**
     * Total number of repositories.
     * @return the value
     **/
    public Integer getRepositoryCount() {
        return repositoryCount;
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
        sb.append("ContainerRepositoryCollection(");
        sb.append("super=").append(super.toString());
        sb.append("layerCount=").append(String.valueOf(this.layerCount));
        sb.append(", layersSizeInBytes=").append(String.valueOf(this.layersSizeInBytes));
        sb.append(", imageCount=").append(String.valueOf(this.imageCount));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(", remainingItemsCount=").append(String.valueOf(this.remainingItemsCount));
        sb.append(", repositoryCount=").append(String.valueOf(this.repositoryCount));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
