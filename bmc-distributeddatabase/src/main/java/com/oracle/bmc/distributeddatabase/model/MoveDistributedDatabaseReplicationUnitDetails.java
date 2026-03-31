/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase.model;

/**
 * The details for moving replication units from source shard to destination shard for the Globally distributed database.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MoveDistributedDatabaseReplicationUnitDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MoveDistributedDatabaseReplicationUnitDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceShardName",
        "destinationShardName",
        "replicationUnits"
    })
    public MoveDistributedDatabaseReplicationUnitDetails(
            String sourceShardName,
            String destinationShardName,
            java.util.List<Integer> replicationUnits) {
        super();
        this.sourceShardName = sourceShardName;
        this.destinationShardName = destinationShardName;
        this.replicationUnits = replicationUnits;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the source shard from which to move the chunks out to other shards.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceShardName")
        private String sourceShardName;

        /**
         * The name of the source shard from which to move the chunks out to other shards.
         * @param sourceShardName the value to set
         * @return this builder
         **/
        public Builder sourceShardName(String sourceShardName) {
            this.sourceShardName = sourceShardName;
            this.__explicitlySet__.add("sourceShardName");
            return this;
        }
        /**
         * The name of the destination shard to which the chunks moved out from source shard should be relocate to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("destinationShardName")
        private String destinationShardName;

        /**
         * The name of the destination shard to which the chunks moved out from source shard should be relocate to.
         * @param destinationShardName the value to set
         * @return this builder
         **/
        public Builder destinationShardName(String destinationShardName) {
            this.destinationShardName = destinationShardName;
            this.__explicitlySet__.add("destinationShardName");
            return this;
        }
        /**
         * For RAFT databases please provide replication unit numbers to be moved from source shard to destination shard.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("replicationUnits")
        private java.util.List<Integer> replicationUnits;

        /**
         * For RAFT databases please provide replication unit numbers to be moved from source shard to destination shard.
         * @param replicationUnits the value to set
         * @return this builder
         **/
        public Builder replicationUnits(java.util.List<Integer> replicationUnits) {
            this.replicationUnits = replicationUnits;
            this.__explicitlySet__.add("replicationUnits");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MoveDistributedDatabaseReplicationUnitDetails build() {
            MoveDistributedDatabaseReplicationUnitDetails model =
                    new MoveDistributedDatabaseReplicationUnitDetails(
                            this.sourceShardName, this.destinationShardName, this.replicationUnits);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MoveDistributedDatabaseReplicationUnitDetails model) {
            if (model.wasPropertyExplicitlySet("sourceShardName")) {
                this.sourceShardName(model.getSourceShardName());
            }
            if (model.wasPropertyExplicitlySet("destinationShardName")) {
                this.destinationShardName(model.getDestinationShardName());
            }
            if (model.wasPropertyExplicitlySet("replicationUnits")) {
                this.replicationUnits(model.getReplicationUnits());
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
     * The name of the source shard from which to move the chunks out to other shards.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceShardName")
    private final String sourceShardName;

    /**
     * The name of the source shard from which to move the chunks out to other shards.
     * @return the value
     **/
    public String getSourceShardName() {
        return sourceShardName;
    }

    /**
     * The name of the destination shard to which the chunks moved out from source shard should be relocate to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("destinationShardName")
    private final String destinationShardName;

    /**
     * The name of the destination shard to which the chunks moved out from source shard should be relocate to.
     * @return the value
     **/
    public String getDestinationShardName() {
        return destinationShardName;
    }

    /**
     * For RAFT databases please provide replication unit numbers to be moved from source shard to destination shard.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("replicationUnits")
    private final java.util.List<Integer> replicationUnits;

    /**
     * For RAFT databases please provide replication unit numbers to be moved from source shard to destination shard.
     * @return the value
     **/
    public java.util.List<Integer> getReplicationUnits() {
        return replicationUnits;
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
        sb.append("MoveDistributedDatabaseReplicationUnitDetails(");
        sb.append("super=").append(super.toString());
        sb.append("sourceShardName=").append(String.valueOf(this.sourceShardName));
        sb.append(", destinationShardName=").append(String.valueOf(this.destinationShardName));
        sb.append(", replicationUnits=").append(String.valueOf(this.replicationUnits));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MoveDistributedDatabaseReplicationUnitDetails)) {
            return false;
        }

        MoveDistributedDatabaseReplicationUnitDetails other =
                (MoveDistributedDatabaseReplicationUnitDetails) o;
        return java.util.Objects.equals(this.sourceShardName, other.sourceShardName)
                && java.util.Objects.equals(this.destinationShardName, other.destinationShardName)
                && java.util.Objects.equals(this.replicationUnits, other.replicationUnits)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceShardName == null ? 43 : this.sourceShardName.hashCode());
        result =
                (result * PRIME)
                        + (this.destinationShardName == null
                                ? 43
                                : this.destinationShardName.hashCode());
        result =
                (result * PRIME)
                        + (this.replicationUnits == null ? 43 : this.replicationUnits.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
