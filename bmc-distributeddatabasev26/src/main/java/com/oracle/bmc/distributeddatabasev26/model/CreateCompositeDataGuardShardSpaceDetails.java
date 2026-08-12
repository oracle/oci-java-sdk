/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabasev26.model;

/**
 * Globally distributed database composite data guard shard space creation details.
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
    builder = CreateCompositeDataGuardShardSpaceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateCompositeDataGuardShardSpaceDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "chunkCount",
        "originalReplica",
        "dataGuardReplicas"
    })
    public CreateCompositeDataGuardShardSpaceDetails(
            String name,
            Integer chunkCount,
            CreateCompositeDataGuardShardSpaceReplicaDetails originalReplica,
            java.util.List<CreateCompositeDataGuardShardSpaceReplicaDetails> dataGuardReplicas) {
        super();
        this.name = name;
        this.chunkCount = chunkCount;
        this.originalReplica = originalReplica;
        this.dataGuardReplicas = dataGuardReplicas;
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

        @com.fasterxml.jackson.annotation.JsonProperty("originalReplica")
        private CreateCompositeDataGuardShardSpaceReplicaDetails originalReplica;

        public Builder originalReplica(
                CreateCompositeDataGuardShardSpaceReplicaDetails originalReplica) {
            this.originalReplica = originalReplica;
            this.__explicitlySet__.add("originalReplica");
            return this;
        }
        /**
         * The details of data guard replica for the shard being created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dataGuardReplicas")
        private java.util.List<CreateCompositeDataGuardShardSpaceReplicaDetails> dataGuardReplicas;

        /**
         * The details of data guard replica for the shard being created.
         * @param dataGuardReplicas the value to set
         * @return this builder
         **/
        public Builder dataGuardReplicas(
                java.util.List<CreateCompositeDataGuardShardSpaceReplicaDetails>
                        dataGuardReplicas) {
            this.dataGuardReplicas = dataGuardReplicas;
            this.__explicitlySet__.add("dataGuardReplicas");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCompositeDataGuardShardSpaceDetails build() {
            CreateCompositeDataGuardShardSpaceDetails model =
                    new CreateCompositeDataGuardShardSpaceDetails(
                            this.name,
                            this.chunkCount,
                            this.originalReplica,
                            this.dataGuardReplicas);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCompositeDataGuardShardSpaceDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("chunkCount")) {
                this.chunkCount(model.getChunkCount());
            }
            if (model.wasPropertyExplicitlySet("originalReplica")) {
                this.originalReplica(model.getOriginalReplica());
            }
            if (model.wasPropertyExplicitlySet("dataGuardReplicas")) {
                this.dataGuardReplicas(model.getDataGuardReplicas());
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

    @com.fasterxml.jackson.annotation.JsonProperty("originalReplica")
    private final CreateCompositeDataGuardShardSpaceReplicaDetails originalReplica;

    public CreateCompositeDataGuardShardSpaceReplicaDetails getOriginalReplica() {
        return originalReplica;
    }

    /**
     * The details of data guard replica for the shard being created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataGuardReplicas")
    private final java.util.List<CreateCompositeDataGuardShardSpaceReplicaDetails>
            dataGuardReplicas;

    /**
     * The details of data guard replica for the shard being created.
     * @return the value
     **/
    public java.util.List<CreateCompositeDataGuardShardSpaceReplicaDetails> getDataGuardReplicas() {
        return dataGuardReplicas;
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
        sb.append("CreateCompositeDataGuardShardSpaceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", chunkCount=").append(String.valueOf(this.chunkCount));
        sb.append(", originalReplica=").append(String.valueOf(this.originalReplica));
        sb.append(", dataGuardReplicas=").append(String.valueOf(this.dataGuardReplicas));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCompositeDataGuardShardSpaceDetails)) {
            return false;
        }

        CreateCompositeDataGuardShardSpaceDetails other =
                (CreateCompositeDataGuardShardSpaceDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.chunkCount, other.chunkCount)
                && java.util.Objects.equals(this.originalReplica, other.originalReplica)
                && java.util.Objects.equals(this.dataGuardReplicas, other.dataGuardReplicas)
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
                        + (this.originalReplica == null ? 43 : this.originalReplica.hashCode());
        result =
                (result * PRIME)
                        + (this.dataGuardReplicas == null ? 43 : this.dataGuardReplicas.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
