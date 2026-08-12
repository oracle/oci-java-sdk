/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabasev26.model;

/**
 * Globally distributed database composite raft shard space creation details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateCompositeRaftShardSpaceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateCompositeRaftShardSpaceDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "chunkCount",
        "replicationUnitCount",
        "raftClusters"
    })
    public CreateCompositeRaftShardSpaceDetails(
            String name,
            Integer chunkCount,
            Integer replicationUnitCount,
            java.util.List<CreateCompositeShardSpaceRaftClusterDetails> raftClusters) {
        super();
        this.name = name;
        this.chunkCount = chunkCount;
        this.replicationUnitCount = replicationUnitCount;
        this.raftClusters = raftClusters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of shard space.
         * It must start with a letter and contain only letters, digits, and underscores.
         * Maximum length is 40 characters.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of shard space.
         * It must start with a letter and contain only letters, digits, and underscores.
         * Maximum length is 40 characters.
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Count of chunks associated with the shard space.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("chunkCount")
        private Integer chunkCount;

        /**
         * Count of chunks associated with the shard space.
         * @param chunkCount the value to set
         * @return this builder
         **/
        public Builder chunkCount(Integer chunkCount) {
            this.chunkCount = chunkCount;
            this.__explicitlySet__.add("chunkCount");
            return this;
        }
        /**
         * Number of replication units in the shard space.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("replicationUnitCount")
        private Integer replicationUnitCount;

        /**
         * Number of replication units in the shard space.
         * @param replicationUnitCount the value to set
         * @return this builder
         **/
        public Builder replicationUnitCount(Integer replicationUnitCount) {
            this.replicationUnitCount = replicationUnitCount;
            this.__explicitlySet__.add("replicationUnitCount");
            return this;
        }
        /**
         * The details of raft clusters associated with the shard space.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("raftClusters")
        private java.util.List<CreateCompositeShardSpaceRaftClusterDetails> raftClusters;

        /**
         * The details of raft clusters associated with the shard space.
         * @param raftClusters the value to set
         * @return this builder
         **/
        public Builder raftClusters(
                java.util.List<CreateCompositeShardSpaceRaftClusterDetails> raftClusters) {
            this.raftClusters = raftClusters;
            this.__explicitlySet__.add("raftClusters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCompositeRaftShardSpaceDetails build() {
            CreateCompositeRaftShardSpaceDetails model =
                    new CreateCompositeRaftShardSpaceDetails(
                            this.name,
                            this.chunkCount,
                            this.replicationUnitCount,
                            this.raftClusters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCompositeRaftShardSpaceDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("chunkCount")) {
                this.chunkCount(model.getChunkCount());
            }
            if (model.wasPropertyExplicitlySet("replicationUnitCount")) {
                this.replicationUnitCount(model.getReplicationUnitCount());
            }
            if (model.wasPropertyExplicitlySet("raftClusters")) {
                this.raftClusters(model.getRaftClusters());
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
     * The name of shard space.
     * It must start with a letter and contain only letters, digits, and underscores.
     * Maximum length is 40 characters.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of shard space.
     * It must start with a letter and contain only letters, digits, and underscores.
     * Maximum length is 40 characters.
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Count of chunks associated with the shard space.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("chunkCount")
    private final Integer chunkCount;

    /**
     * Count of chunks associated with the shard space.
     * @return the value
     **/
    public Integer getChunkCount() {
        return chunkCount;
    }

    /**
     * Number of replication units in the shard space.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("replicationUnitCount")
    private final Integer replicationUnitCount;

    /**
     * Number of replication units in the shard space.
     * @return the value
     **/
    public Integer getReplicationUnitCount() {
        return replicationUnitCount;
    }

    /**
     * The details of raft clusters associated with the shard space.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("raftClusters")
    private final java.util.List<CreateCompositeShardSpaceRaftClusterDetails> raftClusters;

    /**
     * The details of raft clusters associated with the shard space.
     * @return the value
     **/
    public java.util.List<CreateCompositeShardSpaceRaftClusterDetails> getRaftClusters() {
        return raftClusters;
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
        sb.append("CreateCompositeRaftShardSpaceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", chunkCount=").append(String.valueOf(this.chunkCount));
        sb.append(", replicationUnitCount=").append(String.valueOf(this.replicationUnitCount));
        sb.append(", raftClusters=").append(String.valueOf(this.raftClusters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCompositeRaftShardSpaceDetails)) {
            return false;
        }

        CreateCompositeRaftShardSpaceDetails other = (CreateCompositeRaftShardSpaceDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.chunkCount, other.chunkCount)
                && java.util.Objects.equals(this.replicationUnitCount, other.replicationUnitCount)
                && java.util.Objects.equals(this.raftClusters, other.raftClusters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.chunkCount == null ? 43 : this.chunkCount.hashCode());
        result =
                (result * PRIME)
                        + (this.replicationUnitCount == null
                                ? 43
                                : this.replicationUnitCount.hashCode());
        result = (result * PRIME) + (this.raftClusters == null ? 43 : this.raftClusters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
