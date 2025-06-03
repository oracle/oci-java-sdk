/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The collection of inbound replication records for a specific MySQL server. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ManagedMySqlDatabaseInboundReplicationCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagedMySqlDatabaseInboundReplicationCollection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "inboundReplicationsCount",
        "replicaUuid",
        "replicaServerId",
        "parallelWorkers",
        "preserveCommitOrder",
        "items"
    })
    public ManagedMySqlDatabaseInboundReplicationCollection(
            Integer inboundReplicationsCount,
            String replicaUuid,
            Long replicaServerId,
            Integer parallelWorkers,
            String preserveCommitOrder,
            java.util.List<ManagedMySqlDatabaseInboundReplicationSummary> items) {
        super();
        this.inboundReplicationsCount = inboundReplicationsCount;
        this.replicaUuid = replicaUuid;
        this.replicaServerId = replicaServerId;
        this.parallelWorkers = parallelWorkers;
        this.preserveCommitOrder = preserveCommitOrder;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The number of sources this server is replicating from. */
        @com.fasterxml.jackson.annotation.JsonProperty("inboundReplicationsCount")
        private Integer inboundReplicationsCount;

        /**
         * The number of sources this server is replicating from.
         *
         * @param inboundReplicationsCount the value to set
         * @return this builder
         */
        public Builder inboundReplicationsCount(Integer inboundReplicationsCount) {
            this.inboundReplicationsCount = inboundReplicationsCount;
            this.__explicitlySet__.add("inboundReplicationsCount");
            return this;
        }
        /** The Universally Unique Identifier (UUID) value of this replica server. */
        @com.fasterxml.jackson.annotation.JsonProperty("replicaUuid")
        private String replicaUuid;

        /**
         * The Universally Unique Identifier (UUID) value of this replica server.
         *
         * @param replicaUuid the value to set
         * @return this builder
         */
        public Builder replicaUuid(String replicaUuid) {
            this.replicaUuid = replicaUuid;
            this.__explicitlySet__.add("replicaUuid");
            return this;
        }
        /** The server ID value of this replica. */
        @com.fasterxml.jackson.annotation.JsonProperty("replicaServerId")
        private Long replicaServerId;

        /**
         * The server ID value of this replica.
         *
         * @param replicaServerId the value to set
         * @return this builder
         */
        public Builder replicaServerId(Long replicaServerId) {
            this.replicaServerId = replicaServerId;
            this.__explicitlySet__.add("replicaServerId");
            return this;
        }
        /** The number of applier threads for executing replication transactions in parallel. */
        @com.fasterxml.jackson.annotation.JsonProperty("parallelWorkers")
        private Integer parallelWorkers;

        /**
         * The number of applier threads for executing replication transactions in parallel.
         *
         * @param parallelWorkers the value to set
         * @return this builder
         */
        public Builder parallelWorkers(Integer parallelWorkers) {
            this.parallelWorkers = parallelWorkers;
            this.__explicitlySet__.add("parallelWorkers");
            return this;
        }
        /**
         * For multi-threaded replicas, indicates if transactions are executed and committed on the
         * replica in the same order as they appear in the relay log.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("preserveCommitOrder")
        private String preserveCommitOrder;

        /**
         * For multi-threaded replicas, indicates if transactions are executed and committed on the
         * replica in the same order as they appear in the relay log.
         *
         * @param preserveCommitOrder the value to set
         * @return this builder
         */
        public Builder preserveCommitOrder(String preserveCommitOrder) {
            this.preserveCommitOrder = preserveCommitOrder;
            this.__explicitlySet__.add("preserveCommitOrder");
            return this;
        }
        /** A list of ManagedMySqlDatabaseInboundReplicationSummary records. */
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<ManagedMySqlDatabaseInboundReplicationSummary> items;

        /**
         * A list of ManagedMySqlDatabaseInboundReplicationSummary records.
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(java.util.List<ManagedMySqlDatabaseInboundReplicationSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedMySqlDatabaseInboundReplicationCollection build() {
            ManagedMySqlDatabaseInboundReplicationCollection model =
                    new ManagedMySqlDatabaseInboundReplicationCollection(
                            this.inboundReplicationsCount,
                            this.replicaUuid,
                            this.replicaServerId,
                            this.parallelWorkers,
                            this.preserveCommitOrder,
                            this.items);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedMySqlDatabaseInboundReplicationCollection model) {
            if (model.wasPropertyExplicitlySet("inboundReplicationsCount")) {
                this.inboundReplicationsCount(model.getInboundReplicationsCount());
            }
            if (model.wasPropertyExplicitlySet("replicaUuid")) {
                this.replicaUuid(model.getReplicaUuid());
            }
            if (model.wasPropertyExplicitlySet("replicaServerId")) {
                this.replicaServerId(model.getReplicaServerId());
            }
            if (model.wasPropertyExplicitlySet("parallelWorkers")) {
                this.parallelWorkers(model.getParallelWorkers());
            }
            if (model.wasPropertyExplicitlySet("preserveCommitOrder")) {
                this.preserveCommitOrder(model.getPreserveCommitOrder());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
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

    /** The number of sources this server is replicating from. */
    @com.fasterxml.jackson.annotation.JsonProperty("inboundReplicationsCount")
    private final Integer inboundReplicationsCount;

    /**
     * The number of sources this server is replicating from.
     *
     * @return the value
     */
    public Integer getInboundReplicationsCount() {
        return inboundReplicationsCount;
    }

    /** The Universally Unique Identifier (UUID) value of this replica server. */
    @com.fasterxml.jackson.annotation.JsonProperty("replicaUuid")
    private final String replicaUuid;

    /**
     * The Universally Unique Identifier (UUID) value of this replica server.
     *
     * @return the value
     */
    public String getReplicaUuid() {
        return replicaUuid;
    }

    /** The server ID value of this replica. */
    @com.fasterxml.jackson.annotation.JsonProperty("replicaServerId")
    private final Long replicaServerId;

    /**
     * The server ID value of this replica.
     *
     * @return the value
     */
    public Long getReplicaServerId() {
        return replicaServerId;
    }

    /** The number of applier threads for executing replication transactions in parallel. */
    @com.fasterxml.jackson.annotation.JsonProperty("parallelWorkers")
    private final Integer parallelWorkers;

    /**
     * The number of applier threads for executing replication transactions in parallel.
     *
     * @return the value
     */
    public Integer getParallelWorkers() {
        return parallelWorkers;
    }

    /**
     * For multi-threaded replicas, indicates if transactions are executed and committed on the
     * replica in the same order as they appear in the relay log.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preserveCommitOrder")
    private final String preserveCommitOrder;

    /**
     * For multi-threaded replicas, indicates if transactions are executed and committed on the
     * replica in the same order as they appear in the relay log.
     *
     * @return the value
     */
    public String getPreserveCommitOrder() {
        return preserveCommitOrder;
    }

    /** A list of ManagedMySqlDatabaseInboundReplicationSummary records. */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<ManagedMySqlDatabaseInboundReplicationSummary> items;

    /**
     * A list of ManagedMySqlDatabaseInboundReplicationSummary records.
     *
     * @return the value
     */
    public java.util.List<ManagedMySqlDatabaseInboundReplicationSummary> getItems() {
        return items;
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
        sb.append("ManagedMySqlDatabaseInboundReplicationCollection(");
        sb.append("super=").append(super.toString());
        sb.append("inboundReplicationsCount=")
                .append(String.valueOf(this.inboundReplicationsCount));
        sb.append(", replicaUuid=").append(String.valueOf(this.replicaUuid));
        sb.append(", replicaServerId=").append(String.valueOf(this.replicaServerId));
        sb.append(", parallelWorkers=").append(String.valueOf(this.parallelWorkers));
        sb.append(", preserveCommitOrder=").append(String.valueOf(this.preserveCommitOrder));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedMySqlDatabaseInboundReplicationCollection)) {
            return false;
        }

        ManagedMySqlDatabaseInboundReplicationCollection other =
                (ManagedMySqlDatabaseInboundReplicationCollection) o;
        return java.util.Objects.equals(
                        this.inboundReplicationsCount, other.inboundReplicationsCount)
                && java.util.Objects.equals(this.replicaUuid, other.replicaUuid)
                && java.util.Objects.equals(this.replicaServerId, other.replicaServerId)
                && java.util.Objects.equals(this.parallelWorkers, other.parallelWorkers)
                && java.util.Objects.equals(this.preserveCommitOrder, other.preserveCommitOrder)
                && java.util.Objects.equals(this.items, other.items)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.inboundReplicationsCount == null
                                ? 43
                                : this.inboundReplicationsCount.hashCode());
        result = (result * PRIME) + (this.replicaUuid == null ? 43 : this.replicaUuid.hashCode());
        result =
                (result * PRIME)
                        + (this.replicaServerId == null ? 43 : this.replicaServerId.hashCode());
        result =
                (result * PRIME)
                        + (this.parallelWorkers == null ? 43 : this.parallelWorkers.hashCode());
        result =
                (result * PRIME)
                        + (this.preserveCommitOrder == null
                                ? 43
                                : this.preserveCommitOrder.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
