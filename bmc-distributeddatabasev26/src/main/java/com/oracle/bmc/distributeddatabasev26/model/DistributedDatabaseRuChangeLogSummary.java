/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabasev26.model;

/**
 * One move RU invocation record for the Globally distributed database. <br>
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
        builder = DistributedDatabaseRuChangeLogSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DistributedDatabaseRuChangeLogSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "sourceShardName",
        "targetShardName",
        "ruId",
        "status",
        "triggeredBy",
        "timeCreated",
        "timeUpdated"
    })
    public DistributedDatabaseRuChangeLogSummary(
            String sourceShardName,
            String targetShardName,
            String ruId,
            Status status,
            String triggeredBy,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.sourceShardName = sourceShardName;
        this.targetShardName = targetShardName;
        this.ruId = ruId;
        this.status = status;
        this.triggeredBy = triggeredBy;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Source shard for move RU invocation. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceShardName")
        private String sourceShardName;

        /**
         * Source shard for move RU invocation.
         *
         * @param sourceShardName the value to set
         * @return this builder
         */
        public Builder sourceShardName(String sourceShardName) {
            this.sourceShardName = sourceShardName;
            this.__explicitlySet__.add("sourceShardName");
            return this;
        }
        /** Target shard for move RU invocation. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetShardName")
        private String targetShardName;

        /**
         * Target shard for move RU invocation.
         *
         * @param targetShardName the value to set
         * @return this builder
         */
        public Builder targetShardName(String targetShardName) {
            this.targetShardName = targetShardName;
            this.__explicitlySet__.add("targetShardName");
            return this;
        }
        /** Replication unit identifier associated with the invocation. */
        @com.fasterxml.jackson.annotation.JsonProperty("ruId")
        private String ruId;

        /**
         * Replication unit identifier associated with the invocation.
         *
         * @param ruId the value to set
         * @return this builder
         */
        public Builder ruId(String ruId) {
            this.ruId = ruId;
            this.__explicitlySet__.add("ruId");
            return this;
        }
        /** Current or terminal status of the move RU invocation. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Current or terminal status of the move RU invocation.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Actor who triggered the move RU invocation. */
        @com.fasterxml.jackson.annotation.JsonProperty("triggeredBy")
        private String triggeredBy;

        /**
         * Actor who triggered the move RU invocation.
         *
         * @param triggeredBy the value to set
         * @return this builder
         */
        public Builder triggeredBy(String triggeredBy) {
            this.triggeredBy = triggeredBy;
            this.__explicitlySet__.add("triggeredBy");
            return this;
        }
        /** Entry creation timestamp in UTC. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Entry creation timestamp in UTC.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Entry update timestamp in UTC. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * Entry update timestamp in UTC.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DistributedDatabaseRuChangeLogSummary build() {
            DistributedDatabaseRuChangeLogSummary model =
                    new DistributedDatabaseRuChangeLogSummary(
                            this.sourceShardName,
                            this.targetShardName,
                            this.ruId,
                            this.status,
                            this.triggeredBy,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DistributedDatabaseRuChangeLogSummary model) {
            if (model.wasPropertyExplicitlySet("sourceShardName")) {
                this.sourceShardName(model.getSourceShardName());
            }
            if (model.wasPropertyExplicitlySet("targetShardName")) {
                this.targetShardName(model.getTargetShardName());
            }
            if (model.wasPropertyExplicitlySet("ruId")) {
                this.ruId(model.getRuId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("triggeredBy")) {
                this.triggeredBy(model.getTriggeredBy());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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

    /** Source shard for move RU invocation. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceShardName")
    private final String sourceShardName;

    /**
     * Source shard for move RU invocation.
     *
     * @return the value
     */
    public String getSourceShardName() {
        return sourceShardName;
    }

    /** Target shard for move RU invocation. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetShardName")
    private final String targetShardName;

    /**
     * Target shard for move RU invocation.
     *
     * @return the value
     */
    public String getTargetShardName() {
        return targetShardName;
    }

    /** Replication unit identifier associated with the invocation. */
    @com.fasterxml.jackson.annotation.JsonProperty("ruId")
    private final String ruId;

    /**
     * Replication unit identifier associated with the invocation.
     *
     * @return the value
     */
    public String getRuId() {
        return ruId;
    }

    /** Current or terminal status of the move RU invocation. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Failed("FAILED"),
        Queued("QUEUED"),
        InProgress("IN_PROGRESS"),
        Completed("COMPLETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Current or terminal status of the move RU invocation. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Current or terminal status of the move RU invocation.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** Actor who triggered the move RU invocation. */
    @com.fasterxml.jackson.annotation.JsonProperty("triggeredBy")
    private final String triggeredBy;

    /**
     * Actor who triggered the move RU invocation.
     *
     * @return the value
     */
    public String getTriggeredBy() {
        return triggeredBy;
    }

    /** Entry creation timestamp in UTC. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Entry creation timestamp in UTC.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Entry update timestamp in UTC. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * Entry update timestamp in UTC.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("DistributedDatabaseRuChangeLogSummary(");
        sb.append("super=").append(super.toString());
        sb.append("sourceShardName=").append(String.valueOf(this.sourceShardName));
        sb.append(", targetShardName=").append(String.valueOf(this.targetShardName));
        sb.append(", ruId=").append(String.valueOf(this.ruId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", triggeredBy=").append(String.valueOf(this.triggeredBy));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DistributedDatabaseRuChangeLogSummary)) {
            return false;
        }

        DistributedDatabaseRuChangeLogSummary other = (DistributedDatabaseRuChangeLogSummary) o;
        return java.util.Objects.equals(this.sourceShardName, other.sourceShardName)
                && java.util.Objects.equals(this.targetShardName, other.targetShardName)
                && java.util.Objects.equals(this.ruId, other.ruId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.triggeredBy, other.triggeredBy)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
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
                        + (this.targetShardName == null ? 43 : this.targetShardName.hashCode());
        result = (result * PRIME) + (this.ruId == null ? 43 : this.ruId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.triggeredBy == null ? 43 : this.triggeredBy.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
