/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * Inbound replication information of a MySQL replica. <br>
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
        builder = ManagedMySqlDatabaseInboundReplicationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagedMySqlDatabaseInboundReplicationSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceHost",
        "sourcePort",
        "fetchStatus",
        "applyStatus",
        "desiredDelaySeconds",
        "remainingDelaySeconds",
        "channelName",
        "sourceUuid",
        "sourceServerId",
        "gtidAssignment",
        "applierFilters",
        "secondsBehindSource",
        "retrievedGtidSet",
        "relayLogStorageSpaceUsed",
        "transactionsReceived",
        "applyDelay",
        "busyWorkers",
        "fetchError",
        "applyError"
    })
    public ManagedMySqlDatabaseInboundReplicationSummary(
            String sourceHost,
            Integer sourcePort,
            String fetchStatus,
            String applyStatus,
            Long desiredDelaySeconds,
            Long remainingDelaySeconds,
            String channelName,
            String sourceUuid,
            Long sourceServerId,
            String gtidAssignment,
            java.util.List<MySqlReplicationApplierFilter> applierFilters,
            Long secondsBehindSource,
            String retrievedGtidSet,
            Long relayLogStorageSpaceUsed,
            Long transactionsReceived,
            Double applyDelay,
            Integer busyWorkers,
            MySqlFetchError fetchError,
            MySqlApplyError applyError) {
        super();
        this.sourceHost = sourceHost;
        this.sourcePort = sourcePort;
        this.fetchStatus = fetchStatus;
        this.applyStatus = applyStatus;
        this.desiredDelaySeconds = desiredDelaySeconds;
        this.remainingDelaySeconds = remainingDelaySeconds;
        this.channelName = channelName;
        this.sourceUuid = sourceUuid;
        this.sourceServerId = sourceServerId;
        this.gtidAssignment = gtidAssignment;
        this.applierFilters = applierFilters;
        this.secondsBehindSource = secondsBehindSource;
        this.retrievedGtidSet = retrievedGtidSet;
        this.relayLogStorageSpaceUsed = relayLogStorageSpaceUsed;
        this.transactionsReceived = transactionsReceived;
        this.applyDelay = applyDelay;
        this.busyWorkers = busyWorkers;
        this.fetchError = fetchError;
        this.applyError = applyError;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The host name or IP address of the source this replica is connected to. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceHost")
        private String sourceHost;

        /**
         * The host name or IP address of the source this replica is connected to.
         *
         * @param sourceHost the value to set
         * @return this builder
         */
        public Builder sourceHost(String sourceHost) {
            this.sourceHost = sourceHost;
            this.__explicitlySet__.add("sourceHost");
            return this;
        }
        /** The port used to connect to the source. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourcePort")
        private Integer sourcePort;

        /**
         * The port used to connect to the source.
         *
         * @param sourcePort the value to set
         * @return this builder
         */
        public Builder sourcePort(Integer sourcePort) {
            this.sourcePort = sourcePort;
            this.__explicitlySet__.add("sourcePort");
            return this;
        }
        /** The current status of fetch operations. */
        @com.fasterxml.jackson.annotation.JsonProperty("fetchStatus")
        private String fetchStatus;

        /**
         * The current status of fetch operations.
         *
         * @param fetchStatus the value to set
         * @return this builder
         */
        public Builder fetchStatus(String fetchStatus) {
            this.fetchStatus = fetchStatus;
            this.__explicitlySet__.add("fetchStatus");
            return this;
        }
        /** The current status of apply operations. */
        @com.fasterxml.jackson.annotation.JsonProperty("applyStatus")
        private String applyStatus;

        /**
         * The current status of apply operations.
         *
         * @param applyStatus the value to set
         * @return this builder
         */
        public Builder applyStatus(String applyStatus) {
            this.applyStatus = applyStatus;
            this.__explicitlySet__.add("applyStatus");
            return this;
        }
        /** The desired number of seconds that the replica must lag the source. */
        @com.fasterxml.jackson.annotation.JsonProperty("desiredDelaySeconds")
        private Long desiredDelaySeconds;

        /**
         * The desired number of seconds that the replica must lag the source.
         *
         * @param desiredDelaySeconds the value to set
         * @return this builder
         */
        public Builder desiredDelaySeconds(Long desiredDelaySeconds) {
            this.desiredDelaySeconds = desiredDelaySeconds;
            this.__explicitlySet__.add("desiredDelaySeconds");
            return this;
        }
        /**
         * If the replica is waiting for the desired delay seconds to pass since the source applied
         * an event, this field contains the number of delay seconds remaining.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("remainingDelaySeconds")
        private Long remainingDelaySeconds;

        /**
         * If the replica is waiting for the desired delay seconds to pass since the source applied
         * an event, this field contains the number of delay seconds remaining.
         *
         * @param remainingDelaySeconds the value to set
         * @return this builder
         */
        public Builder remainingDelaySeconds(Long remainingDelaySeconds) {
            this.remainingDelaySeconds = remainingDelaySeconds;
            this.__explicitlySet__.add("remainingDelaySeconds");
            return this;
        }
        /** The name of the replication channel. */
        @com.fasterxml.jackson.annotation.JsonProperty("channelName")
        private String channelName;

        /**
         * The name of the replication channel.
         *
         * @param channelName the value to set
         * @return this builder
         */
        public Builder channelName(String channelName) {
            this.channelName = channelName;
            this.__explicitlySet__.add("channelName");
            return this;
        }
        /** The Universally Unique Identifier (UUID) value from the source server. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceUuid")
        private String sourceUuid;

        /**
         * The Universally Unique Identifier (UUID) value from the source server.
         *
         * @param sourceUuid the value to set
         * @return this builder
         */
        public Builder sourceUuid(String sourceUuid) {
            this.sourceUuid = sourceUuid;
            this.__explicitlySet__.add("sourceUuid");
            return this;
        }
        /** The server ID value from the source server. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceServerId")
        private Long sourceServerId;

        /**
         * The server ID value from the source server.
         *
         * @param sourceServerId the value to set
         * @return this builder
         */
        public Builder sourceServerId(Long sourceServerId) {
            this.sourceServerId = sourceServerId;
            this.__explicitlySet__.add("sourceServerId");
            return this;
        }
        /**
         * Indicates whether the channel assigns global transaction identifiers (GTIDs) to anonymous
         * replicated transactions. OFF means no GTIDs are assigned. LOCAL means a GTID is assigned
         * that includes this replica's own universally unique identifier (UUID). A UUID as value
         * indicates that a GTID is assigned, which includes that manually set UUID value.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("gtidAssignment")
        private String gtidAssignment;

        /**
         * Indicates whether the channel assigns global transaction identifiers (GTIDs) to anonymous
         * replicated transactions. OFF means no GTIDs are assigned. LOCAL means a GTID is assigned
         * that includes this replica's own universally unique identifier (UUID). A UUID as value
         * indicates that a GTID is assigned, which includes that manually set UUID value.
         *
         * @param gtidAssignment the value to set
         * @return this builder
         */
        public Builder gtidAssignment(String gtidAssignment) {
            this.gtidAssignment = gtidAssignment;
            this.__explicitlySet__.add("gtidAssignment");
            return this;
        }
        /** A list of MySqlReplicationApplierFilter records. */
        @com.fasterxml.jackson.annotation.JsonProperty("applierFilters")
        private java.util.List<MySqlReplicationApplierFilter> applierFilters;

        /**
         * A list of MySqlReplicationApplierFilter records.
         *
         * @param applierFilters the value to set
         * @return this builder
         */
        public Builder applierFilters(
                java.util.List<MySqlReplicationApplierFilter> applierFilters) {
            this.applierFilters = applierFilters;
            this.__explicitlySet__.add("applierFilters");
            return this;
        }
        /** The number of seconds the replica is behind the source server. */
        @com.fasterxml.jackson.annotation.JsonProperty("secondsBehindSource")
        private Long secondsBehindSource;

        /**
         * The number of seconds the replica is behind the source server.
         *
         * @param secondsBehindSource the value to set
         * @return this builder
         */
        public Builder secondsBehindSource(Long secondsBehindSource) {
            this.secondsBehindSource = secondsBehindSource;
            this.__explicitlySet__.add("secondsBehindSource");
            return this;
        }
        /**
         * The set of global transaction IDs corresponding to all transactions received by this
         * replica from the source server. Empty if GTIDs are not in use.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("retrievedGtidSet")
        private String retrievedGtidSet;

        /**
         * The set of global transaction IDs corresponding to all transactions received by this
         * replica from the source server. Empty if GTIDs are not in use.
         *
         * @param retrievedGtidSet the value to set
         * @return this builder
         */
        public Builder retrievedGtidSet(String retrievedGtidSet) {
            this.retrievedGtidSet = retrievedGtidSet;
            this.__explicitlySet__.add("retrievedGtidSet");
            return this;
        }
        /**
         * The total size in bytes of all the existing relay log files pertaining to this channel.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("relayLogStorageSpaceUsed")
        private Long relayLogStorageSpaceUsed;

        /**
         * The total size in bytes of all the existing relay log files pertaining to this channel.
         *
         * @param relayLogStorageSpaceUsed the value to set
         * @return this builder
         */
        public Builder relayLogStorageSpaceUsed(Long relayLogStorageSpaceUsed) {
            this.relayLogStorageSpaceUsed = relayLogStorageSpaceUsed;
            this.__explicitlySet__.add("relayLogStorageSpaceUsed");
            return this;
        }
        /** The number of transactions received by this replica from the source server. */
        @com.fasterxml.jackson.annotation.JsonProperty("transactionsReceived")
        private Long transactionsReceived;

        /**
         * The number of transactions received by this replica from the source server.
         *
         * @param transactionsReceived the value to set
         * @return this builder
         */
        public Builder transactionsReceived(Long transactionsReceived) {
            this.transactionsReceived = transactionsReceived;
            this.__explicitlySet__.add("transactionsReceived");
            return this;
        }
        /**
         * The time in seconds that the current transaction took between being committed on the
         * source and being applied on the replica.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("applyDelay")
        private Double applyDelay;

        /**
         * The time in seconds that the current transaction took between being committed on the
         * source and being applied on the replica.
         *
         * @param applyDelay the value to set
         * @return this builder
         */
        public Builder applyDelay(Double applyDelay) {
            this.applyDelay = applyDelay;
            this.__explicitlySet__.add("applyDelay");
            return this;
        }
        /** The number of workers currently busy applying transactions from the source server. */
        @com.fasterxml.jackson.annotation.JsonProperty("busyWorkers")
        private Integer busyWorkers;

        /**
         * The number of workers currently busy applying transactions from the source server.
         *
         * @param busyWorkers the value to set
         * @return this builder
         */
        public Builder busyWorkers(Integer busyWorkers) {
            this.busyWorkers = busyWorkers;
            this.__explicitlySet__.add("busyWorkers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fetchError")
        private MySqlFetchError fetchError;

        public Builder fetchError(MySqlFetchError fetchError) {
            this.fetchError = fetchError;
            this.__explicitlySet__.add("fetchError");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applyError")
        private MySqlApplyError applyError;

        public Builder applyError(MySqlApplyError applyError) {
            this.applyError = applyError;
            this.__explicitlySet__.add("applyError");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedMySqlDatabaseInboundReplicationSummary build() {
            ManagedMySqlDatabaseInboundReplicationSummary model =
                    new ManagedMySqlDatabaseInboundReplicationSummary(
                            this.sourceHost,
                            this.sourcePort,
                            this.fetchStatus,
                            this.applyStatus,
                            this.desiredDelaySeconds,
                            this.remainingDelaySeconds,
                            this.channelName,
                            this.sourceUuid,
                            this.sourceServerId,
                            this.gtidAssignment,
                            this.applierFilters,
                            this.secondsBehindSource,
                            this.retrievedGtidSet,
                            this.relayLogStorageSpaceUsed,
                            this.transactionsReceived,
                            this.applyDelay,
                            this.busyWorkers,
                            this.fetchError,
                            this.applyError);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedMySqlDatabaseInboundReplicationSummary model) {
            if (model.wasPropertyExplicitlySet("sourceHost")) {
                this.sourceHost(model.getSourceHost());
            }
            if (model.wasPropertyExplicitlySet("sourcePort")) {
                this.sourcePort(model.getSourcePort());
            }
            if (model.wasPropertyExplicitlySet("fetchStatus")) {
                this.fetchStatus(model.getFetchStatus());
            }
            if (model.wasPropertyExplicitlySet("applyStatus")) {
                this.applyStatus(model.getApplyStatus());
            }
            if (model.wasPropertyExplicitlySet("desiredDelaySeconds")) {
                this.desiredDelaySeconds(model.getDesiredDelaySeconds());
            }
            if (model.wasPropertyExplicitlySet("remainingDelaySeconds")) {
                this.remainingDelaySeconds(model.getRemainingDelaySeconds());
            }
            if (model.wasPropertyExplicitlySet("channelName")) {
                this.channelName(model.getChannelName());
            }
            if (model.wasPropertyExplicitlySet("sourceUuid")) {
                this.sourceUuid(model.getSourceUuid());
            }
            if (model.wasPropertyExplicitlySet("sourceServerId")) {
                this.sourceServerId(model.getSourceServerId());
            }
            if (model.wasPropertyExplicitlySet("gtidAssignment")) {
                this.gtidAssignment(model.getGtidAssignment());
            }
            if (model.wasPropertyExplicitlySet("applierFilters")) {
                this.applierFilters(model.getApplierFilters());
            }
            if (model.wasPropertyExplicitlySet("secondsBehindSource")) {
                this.secondsBehindSource(model.getSecondsBehindSource());
            }
            if (model.wasPropertyExplicitlySet("retrievedGtidSet")) {
                this.retrievedGtidSet(model.getRetrievedGtidSet());
            }
            if (model.wasPropertyExplicitlySet("relayLogStorageSpaceUsed")) {
                this.relayLogStorageSpaceUsed(model.getRelayLogStorageSpaceUsed());
            }
            if (model.wasPropertyExplicitlySet("transactionsReceived")) {
                this.transactionsReceived(model.getTransactionsReceived());
            }
            if (model.wasPropertyExplicitlySet("applyDelay")) {
                this.applyDelay(model.getApplyDelay());
            }
            if (model.wasPropertyExplicitlySet("busyWorkers")) {
                this.busyWorkers(model.getBusyWorkers());
            }
            if (model.wasPropertyExplicitlySet("fetchError")) {
                this.fetchError(model.getFetchError());
            }
            if (model.wasPropertyExplicitlySet("applyError")) {
                this.applyError(model.getApplyError());
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

    /** The host name or IP address of the source this replica is connected to. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceHost")
    private final String sourceHost;

    /**
     * The host name or IP address of the source this replica is connected to.
     *
     * @return the value
     */
    public String getSourceHost() {
        return sourceHost;
    }

    /** The port used to connect to the source. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourcePort")
    private final Integer sourcePort;

    /**
     * The port used to connect to the source.
     *
     * @return the value
     */
    public Integer getSourcePort() {
        return sourcePort;
    }

    /** The current status of fetch operations. */
    @com.fasterxml.jackson.annotation.JsonProperty("fetchStatus")
    private final String fetchStatus;

    /**
     * The current status of fetch operations.
     *
     * @return the value
     */
    public String getFetchStatus() {
        return fetchStatus;
    }

    /** The current status of apply operations. */
    @com.fasterxml.jackson.annotation.JsonProperty("applyStatus")
    private final String applyStatus;

    /**
     * The current status of apply operations.
     *
     * @return the value
     */
    public String getApplyStatus() {
        return applyStatus;
    }

    /** The desired number of seconds that the replica must lag the source. */
    @com.fasterxml.jackson.annotation.JsonProperty("desiredDelaySeconds")
    private final Long desiredDelaySeconds;

    /**
     * The desired number of seconds that the replica must lag the source.
     *
     * @return the value
     */
    public Long getDesiredDelaySeconds() {
        return desiredDelaySeconds;
    }

    /**
     * If the replica is waiting for the desired delay seconds to pass since the source applied an
     * event, this field contains the number of delay seconds remaining.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("remainingDelaySeconds")
    private final Long remainingDelaySeconds;

    /**
     * If the replica is waiting for the desired delay seconds to pass since the source applied an
     * event, this field contains the number of delay seconds remaining.
     *
     * @return the value
     */
    public Long getRemainingDelaySeconds() {
        return remainingDelaySeconds;
    }

    /** The name of the replication channel. */
    @com.fasterxml.jackson.annotation.JsonProperty("channelName")
    private final String channelName;

    /**
     * The name of the replication channel.
     *
     * @return the value
     */
    public String getChannelName() {
        return channelName;
    }

    /** The Universally Unique Identifier (UUID) value from the source server. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceUuid")
    private final String sourceUuid;

    /**
     * The Universally Unique Identifier (UUID) value from the source server.
     *
     * @return the value
     */
    public String getSourceUuid() {
        return sourceUuid;
    }

    /** The server ID value from the source server. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceServerId")
    private final Long sourceServerId;

    /**
     * The server ID value from the source server.
     *
     * @return the value
     */
    public Long getSourceServerId() {
        return sourceServerId;
    }

    /**
     * Indicates whether the channel assigns global transaction identifiers (GTIDs) to anonymous
     * replicated transactions. OFF means no GTIDs are assigned. LOCAL means a GTID is assigned that
     * includes this replica's own universally unique identifier (UUID). A UUID as value indicates
     * that a GTID is assigned, which includes that manually set UUID value.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gtidAssignment")
    private final String gtidAssignment;

    /**
     * Indicates whether the channel assigns global transaction identifiers (GTIDs) to anonymous
     * replicated transactions. OFF means no GTIDs are assigned. LOCAL means a GTID is assigned that
     * includes this replica's own universally unique identifier (UUID). A UUID as value indicates
     * that a GTID is assigned, which includes that manually set UUID value.
     *
     * @return the value
     */
    public String getGtidAssignment() {
        return gtidAssignment;
    }

    /** A list of MySqlReplicationApplierFilter records. */
    @com.fasterxml.jackson.annotation.JsonProperty("applierFilters")
    private final java.util.List<MySqlReplicationApplierFilter> applierFilters;

    /**
     * A list of MySqlReplicationApplierFilter records.
     *
     * @return the value
     */
    public java.util.List<MySqlReplicationApplierFilter> getApplierFilters() {
        return applierFilters;
    }

    /** The number of seconds the replica is behind the source server. */
    @com.fasterxml.jackson.annotation.JsonProperty("secondsBehindSource")
    private final Long secondsBehindSource;

    /**
     * The number of seconds the replica is behind the source server.
     *
     * @return the value
     */
    public Long getSecondsBehindSource() {
        return secondsBehindSource;
    }

    /**
     * The set of global transaction IDs corresponding to all transactions received by this replica
     * from the source server. Empty if GTIDs are not in use.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("retrievedGtidSet")
    private final String retrievedGtidSet;

    /**
     * The set of global transaction IDs corresponding to all transactions received by this replica
     * from the source server. Empty if GTIDs are not in use.
     *
     * @return the value
     */
    public String getRetrievedGtidSet() {
        return retrievedGtidSet;
    }

    /** The total size in bytes of all the existing relay log files pertaining to this channel. */
    @com.fasterxml.jackson.annotation.JsonProperty("relayLogStorageSpaceUsed")
    private final Long relayLogStorageSpaceUsed;

    /**
     * The total size in bytes of all the existing relay log files pertaining to this channel.
     *
     * @return the value
     */
    public Long getRelayLogStorageSpaceUsed() {
        return relayLogStorageSpaceUsed;
    }

    /** The number of transactions received by this replica from the source server. */
    @com.fasterxml.jackson.annotation.JsonProperty("transactionsReceived")
    private final Long transactionsReceived;

    /**
     * The number of transactions received by this replica from the source server.
     *
     * @return the value
     */
    public Long getTransactionsReceived() {
        return transactionsReceived;
    }

    /**
     * The time in seconds that the current transaction took between being committed on the source
     * and being applied on the replica.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applyDelay")
    private final Double applyDelay;

    /**
     * The time in seconds that the current transaction took between being committed on the source
     * and being applied on the replica.
     *
     * @return the value
     */
    public Double getApplyDelay() {
        return applyDelay;
    }

    /** The number of workers currently busy applying transactions from the source server. */
    @com.fasterxml.jackson.annotation.JsonProperty("busyWorkers")
    private final Integer busyWorkers;

    /**
     * The number of workers currently busy applying transactions from the source server.
     *
     * @return the value
     */
    public Integer getBusyWorkers() {
        return busyWorkers;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fetchError")
    private final MySqlFetchError fetchError;

    public MySqlFetchError getFetchError() {
        return fetchError;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("applyError")
    private final MySqlApplyError applyError;

    public MySqlApplyError getApplyError() {
        return applyError;
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
        sb.append("ManagedMySqlDatabaseInboundReplicationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("sourceHost=").append(String.valueOf(this.sourceHost));
        sb.append(", sourcePort=").append(String.valueOf(this.sourcePort));
        sb.append(", fetchStatus=").append(String.valueOf(this.fetchStatus));
        sb.append(", applyStatus=").append(String.valueOf(this.applyStatus));
        sb.append(", desiredDelaySeconds=").append(String.valueOf(this.desiredDelaySeconds));
        sb.append(", remainingDelaySeconds=").append(String.valueOf(this.remainingDelaySeconds));
        sb.append(", channelName=").append(String.valueOf(this.channelName));
        sb.append(", sourceUuid=").append(String.valueOf(this.sourceUuid));
        sb.append(", sourceServerId=").append(String.valueOf(this.sourceServerId));
        sb.append(", gtidAssignment=").append(String.valueOf(this.gtidAssignment));
        sb.append(", applierFilters=").append(String.valueOf(this.applierFilters));
        sb.append(", secondsBehindSource=").append(String.valueOf(this.secondsBehindSource));
        sb.append(", retrievedGtidSet=").append(String.valueOf(this.retrievedGtidSet));
        sb.append(", relayLogStorageSpaceUsed=")
                .append(String.valueOf(this.relayLogStorageSpaceUsed));
        sb.append(", transactionsReceived=").append(String.valueOf(this.transactionsReceived));
        sb.append(", applyDelay=").append(String.valueOf(this.applyDelay));
        sb.append(", busyWorkers=").append(String.valueOf(this.busyWorkers));
        sb.append(", fetchError=").append(String.valueOf(this.fetchError));
        sb.append(", applyError=").append(String.valueOf(this.applyError));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedMySqlDatabaseInboundReplicationSummary)) {
            return false;
        }

        ManagedMySqlDatabaseInboundReplicationSummary other =
                (ManagedMySqlDatabaseInboundReplicationSummary) o;
        return java.util.Objects.equals(this.sourceHost, other.sourceHost)
                && java.util.Objects.equals(this.sourcePort, other.sourcePort)
                && java.util.Objects.equals(this.fetchStatus, other.fetchStatus)
                && java.util.Objects.equals(this.applyStatus, other.applyStatus)
                && java.util.Objects.equals(this.desiredDelaySeconds, other.desiredDelaySeconds)
                && java.util.Objects.equals(this.remainingDelaySeconds, other.remainingDelaySeconds)
                && java.util.Objects.equals(this.channelName, other.channelName)
                && java.util.Objects.equals(this.sourceUuid, other.sourceUuid)
                && java.util.Objects.equals(this.sourceServerId, other.sourceServerId)
                && java.util.Objects.equals(this.gtidAssignment, other.gtidAssignment)
                && java.util.Objects.equals(this.applierFilters, other.applierFilters)
                && java.util.Objects.equals(this.secondsBehindSource, other.secondsBehindSource)
                && java.util.Objects.equals(this.retrievedGtidSet, other.retrievedGtidSet)
                && java.util.Objects.equals(
                        this.relayLogStorageSpaceUsed, other.relayLogStorageSpaceUsed)
                && java.util.Objects.equals(this.transactionsReceived, other.transactionsReceived)
                && java.util.Objects.equals(this.applyDelay, other.applyDelay)
                && java.util.Objects.equals(this.busyWorkers, other.busyWorkers)
                && java.util.Objects.equals(this.fetchError, other.fetchError)
                && java.util.Objects.equals(this.applyError, other.applyError)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.sourceHost == null ? 43 : this.sourceHost.hashCode());
        result = (result * PRIME) + (this.sourcePort == null ? 43 : this.sourcePort.hashCode());
        result = (result * PRIME) + (this.fetchStatus == null ? 43 : this.fetchStatus.hashCode());
        result = (result * PRIME) + (this.applyStatus == null ? 43 : this.applyStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.desiredDelaySeconds == null
                                ? 43
                                : this.desiredDelaySeconds.hashCode());
        result =
                (result * PRIME)
                        + (this.remainingDelaySeconds == null
                                ? 43
                                : this.remainingDelaySeconds.hashCode());
        result = (result * PRIME) + (this.channelName == null ? 43 : this.channelName.hashCode());
        result = (result * PRIME) + (this.sourceUuid == null ? 43 : this.sourceUuid.hashCode());
        result =
                (result * PRIME)
                        + (this.sourceServerId == null ? 43 : this.sourceServerId.hashCode());
        result =
                (result * PRIME)
                        + (this.gtidAssignment == null ? 43 : this.gtidAssignment.hashCode());
        result =
                (result * PRIME)
                        + (this.applierFilters == null ? 43 : this.applierFilters.hashCode());
        result =
                (result * PRIME)
                        + (this.secondsBehindSource == null
                                ? 43
                                : this.secondsBehindSource.hashCode());
        result =
                (result * PRIME)
                        + (this.retrievedGtidSet == null ? 43 : this.retrievedGtidSet.hashCode());
        result =
                (result * PRIME)
                        + (this.relayLogStorageSpaceUsed == null
                                ? 43
                                : this.relayLogStorageSpaceUsed.hashCode());
        result =
                (result * PRIME)
                        + (this.transactionsReceived == null
                                ? 43
                                : this.transactionsReceived.hashCode());
        result = (result * PRIME) + (this.applyDelay == null ? 43 : this.applyDelay.hashCode());
        result = (result * PRIME) + (this.busyWorkers == null ? 43 : this.busyWorkers.hashCode());
        result = (result * PRIME) + (this.fetchError == null ? 43 : this.fetchError.hashCode());
        result = (result * PRIME) + (this.applyError == null ? 43 : this.applyError.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
