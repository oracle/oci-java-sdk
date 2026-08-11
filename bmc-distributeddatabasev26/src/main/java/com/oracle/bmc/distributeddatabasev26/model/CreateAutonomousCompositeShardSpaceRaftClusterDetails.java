/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabasev26.model;

/**
 * Details required to create raft clusters for a composite shard space. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateAutonomousCompositeShardSpaceRaftClusterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateAutonomousCompositeShardSpaceRaftClusterDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "replicationFactor",
        "witnessCount",
        "ruMode",
        "databases"
    })
    public CreateAutonomousCompositeShardSpaceRaftClusterDetails(
            String name,
            Integer replicationFactor,
            Integer witnessCount,
            RuMode ruMode,
            java.util.List<CreateDistributedAutonomousDatabaseShardDatabaseDetails> databases) {
        super();
        this.name = name;
        this.replicationFactor = replicationFactor;
        this.witnessCount = witnessCount;
        this.ruMode = ruMode;
        this.databases = databases;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of raft cluster. It must start with a letter and contain only letters, digits,
         * and underscores. Maximum length is 40 characters.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of raft cluster. It must start with a letter and contain only letters, digits,
         * and underscores. Maximum length is 40 characters.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Replication factor associated with the raft cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("replicationFactor")
        private Integer replicationFactor;

        /**
         * Replication factor associated with the raft cluster.
         *
         * @param replicationFactor the value to set
         * @return this builder
         */
        public Builder replicationFactor(Integer replicationFactor) {
            this.replicationFactor = replicationFactor;
            this.__explicitlySet__.add("replicationFactor");
            return this;
        }
        /** Witnesses RU count associated with the raft cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("witnessCount")
        private Integer witnessCount;

        /**
         * Witnesses RU count associated with the raft cluster.
         *
         * @param witnessCount the value to set
         * @return this builder
         */
        public Builder witnessCount(Integer witnessCount) {
            this.witnessCount = witnessCount;
            this.__explicitlySet__.add("witnessCount");
            return this;
        }
        /** Replication factor associated with the raft cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("ruMode")
        private RuMode ruMode;

        /**
         * Replication factor associated with the raft cluster.
         *
         * @param ruMode the value to set
         * @return this builder
         */
        public Builder ruMode(RuMode ruMode) {
            this.ruMode = ruMode;
            this.__explicitlySet__.add("ruMode");
            return this;
        }
        /** The details of databases associated with the composite shard space raft cluster. */
        @com.fasterxml.jackson.annotation.JsonProperty("databases")
        private java.util.List<CreateDistributedAutonomousDatabaseShardDatabaseDetails> databases;

        /**
         * The details of databases associated with the composite shard space raft cluster.
         *
         * @param databases the value to set
         * @return this builder
         */
        public Builder databases(
                java.util.List<CreateDistributedAutonomousDatabaseShardDatabaseDetails> databases) {
            this.databases = databases;
            this.__explicitlySet__.add("databases");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAutonomousCompositeShardSpaceRaftClusterDetails build() {
            CreateAutonomousCompositeShardSpaceRaftClusterDetails model =
                    new CreateAutonomousCompositeShardSpaceRaftClusterDetails(
                            this.name,
                            this.replicationFactor,
                            this.witnessCount,
                            this.ruMode,
                            this.databases);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAutonomousCompositeShardSpaceRaftClusterDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("replicationFactor")) {
                this.replicationFactor(model.getReplicationFactor());
            }
            if (model.wasPropertyExplicitlySet("witnessCount")) {
                this.witnessCount(model.getWitnessCount());
            }
            if (model.wasPropertyExplicitlySet("ruMode")) {
                this.ruMode(model.getRuMode());
            }
            if (model.wasPropertyExplicitlySet("databases")) {
                this.databases(model.getDatabases());
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

    /**
     * The name of raft cluster. It must start with a letter and contain only letters, digits, and
     * underscores. Maximum length is 40 characters.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of raft cluster. It must start with a letter and contain only letters, digits, and
     * underscores. Maximum length is 40 characters.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Replication factor associated with the raft cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("replicationFactor")
    private final Integer replicationFactor;

    /**
     * Replication factor associated with the raft cluster.
     *
     * @return the value
     */
    public Integer getReplicationFactor() {
        return replicationFactor;
    }

    /** Witnesses RU count associated with the raft cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("witnessCount")
    private final Integer witnessCount;

    /**
     * Witnesses RU count associated with the raft cluster.
     *
     * @return the value
     */
    public Integer getWitnessCount() {
        return witnessCount;
    }

    /** Replication factor associated with the raft cluster. */
    public enum RuMode implements com.oracle.bmc.http.internal.BmcEnum {
        ReadOnly("READ_ONLY"),
        ReadWrite("READ_WRITE"),
        ;

        private final String value;
        private static java.util.Map<String, RuMode> map;

        static {
            map = new java.util.HashMap<>();
            for (RuMode v : RuMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        RuMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RuMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid RuMode: " + key);
        }
    };
    /** Replication factor associated with the raft cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("ruMode")
    private final RuMode ruMode;

    /**
     * Replication factor associated with the raft cluster.
     *
     * @return the value
     */
    public RuMode getRuMode() {
        return ruMode;
    }

    /** The details of databases associated with the composite shard space raft cluster. */
    @com.fasterxml.jackson.annotation.JsonProperty("databases")
    private final java.util.List<CreateDistributedAutonomousDatabaseShardDatabaseDetails> databases;

    /**
     * The details of databases associated with the composite shard space raft cluster.
     *
     * @return the value
     */
    public java.util.List<CreateDistributedAutonomousDatabaseShardDatabaseDetails> getDatabases() {
        return databases;
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
        sb.append("CreateAutonomousCompositeShardSpaceRaftClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", replicationFactor=").append(String.valueOf(this.replicationFactor));
        sb.append(", witnessCount=").append(String.valueOf(this.witnessCount));
        sb.append(", ruMode=").append(String.valueOf(this.ruMode));
        sb.append(", databases=").append(String.valueOf(this.databases));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAutonomousCompositeShardSpaceRaftClusterDetails)) {
            return false;
        }

        CreateAutonomousCompositeShardSpaceRaftClusterDetails other =
                (CreateAutonomousCompositeShardSpaceRaftClusterDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.replicationFactor, other.replicationFactor)
                && java.util.Objects.equals(this.witnessCount, other.witnessCount)
                && java.util.Objects.equals(this.ruMode, other.ruMode)
                && java.util.Objects.equals(this.databases, other.databases)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.replicationFactor == null ? 43 : this.replicationFactor.hashCode());
        result = (result * PRIME) + (this.witnessCount == null ? 43 : this.witnessCount.hashCode());
        result = (result * PRIME) + (this.ruMode == null ? 43 : this.ruMode.hashCode());
        result = (result * PRIME) + (this.databases == null ? 43 : this.databases.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
