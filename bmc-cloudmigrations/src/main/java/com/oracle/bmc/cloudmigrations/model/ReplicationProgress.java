/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Progress of a migration asset's replication process. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ReplicationProgress.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ReplicationProgress
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "percentage",
        "status",
        "timeStarted",
        "timeOflastReplicationStart",
        "timeOfLastReplicationEnd",
        "timeOfLastReplicationSuccess",
        "lastReplicationStatus",
        "lastReplicationError"
    })
    public ReplicationProgress(
            Integer percentage,
            Status status,
            java.util.Date timeStarted,
            java.util.Date timeOflastReplicationStart,
            java.util.Date timeOfLastReplicationEnd,
            java.util.Date timeOfLastReplicationSuccess,
            LastReplicationStatus lastReplicationStatus,
            String lastReplicationError) {
        super();
        this.percentage = percentage;
        this.status = status;
        this.timeStarted = timeStarted;
        this.timeOflastReplicationStart = timeOflastReplicationStart;
        this.timeOfLastReplicationEnd = timeOfLastReplicationEnd;
        this.timeOfLastReplicationSuccess = timeOfLastReplicationSuccess;
        this.lastReplicationStatus = lastReplicationStatus;
        this.lastReplicationError = lastReplicationError;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Percentage of the current replication progress from 0 to 100. */
        @com.fasterxml.jackson.annotation.JsonProperty("percentage")
        private Integer percentage;

        /**
         * Percentage of the current replication progress from 0 to 100.
         *
         * @param percentage the value to set
         * @return this builder
         */
        public Builder percentage(Integer percentage) {
            this.percentage = percentage;
            this.__explicitlySet__.add("percentage");
            return this;
        }
        /** Status of the current replication progress. It can be None or InProgress. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Status of the current replication progress. It can be None or InProgress.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Start time of the current replication process */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * Start time of the current replication process
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /** Start time of the last replication process. It can be Completed or Failed. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOflastReplicationStart")
        private java.util.Date timeOflastReplicationStart;

        /**
         * Start time of the last replication process. It can be Completed or Failed.
         *
         * @param timeOflastReplicationStart the value to set
         * @return this builder
         */
        public Builder timeOflastReplicationStart(java.util.Date timeOflastReplicationStart) {
            this.timeOflastReplicationStart = timeOflastReplicationStart;
            this.__explicitlySet__.add("timeOflastReplicationStart");
            return this;
        }
        /** End time of the last replication process. It can be Completed or Failed. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastReplicationEnd")
        private java.util.Date timeOfLastReplicationEnd;

        /**
         * End time of the last replication process. It can be Completed or Failed.
         *
         * @param timeOfLastReplicationEnd the value to set
         * @return this builder
         */
        public Builder timeOfLastReplicationEnd(java.util.Date timeOfLastReplicationEnd) {
            this.timeOfLastReplicationEnd = timeOfLastReplicationEnd;
            this.__explicitlySet__.add("timeOfLastReplicationEnd");
            return this;
        }
        /** End time of the last successful replication process, which has been completed. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastReplicationSuccess")
        private java.util.Date timeOfLastReplicationSuccess;

        /**
         * End time of the last successful replication process, which has been completed.
         *
         * @param timeOfLastReplicationSuccess the value to set
         * @return this builder
         */
        public Builder timeOfLastReplicationSuccess(java.util.Date timeOfLastReplicationSuccess) {
            this.timeOfLastReplicationSuccess = timeOfLastReplicationSuccess;
            this.__explicitlySet__.add("timeOfLastReplicationSuccess");
            return this;
        }
        /** Status of the last replication task. It can be Completed or Failed. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastReplicationStatus")
        private LastReplicationStatus lastReplicationStatus;

        /**
         * Status of the last replication task. It can be Completed or Failed.
         *
         * @param lastReplicationStatus the value to set
         * @return this builder
         */
        public Builder lastReplicationStatus(LastReplicationStatus lastReplicationStatus) {
            this.lastReplicationStatus = lastReplicationStatus;
            this.__explicitlySet__.add("lastReplicationStatus");
            return this;
        }
        /** Error message if the last finished replication failed. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastReplicationError")
        private String lastReplicationError;

        /**
         * Error message if the last finished replication failed.
         *
         * @param lastReplicationError the value to set
         * @return this builder
         */
        public Builder lastReplicationError(String lastReplicationError) {
            this.lastReplicationError = lastReplicationError;
            this.__explicitlySet__.add("lastReplicationError");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ReplicationProgress build() {
            ReplicationProgress model =
                    new ReplicationProgress(
                            this.percentage,
                            this.status,
                            this.timeStarted,
                            this.timeOflastReplicationStart,
                            this.timeOfLastReplicationEnd,
                            this.timeOfLastReplicationSuccess,
                            this.lastReplicationStatus,
                            this.lastReplicationError);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ReplicationProgress model) {
            if (model.wasPropertyExplicitlySet("percentage")) {
                this.percentage(model.getPercentage());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeOflastReplicationStart")) {
                this.timeOflastReplicationStart(model.getTimeOflastReplicationStart());
            }
            if (model.wasPropertyExplicitlySet("timeOfLastReplicationEnd")) {
                this.timeOfLastReplicationEnd(model.getTimeOfLastReplicationEnd());
            }
            if (model.wasPropertyExplicitlySet("timeOfLastReplicationSuccess")) {
                this.timeOfLastReplicationSuccess(model.getTimeOfLastReplicationSuccess());
            }
            if (model.wasPropertyExplicitlySet("lastReplicationStatus")) {
                this.lastReplicationStatus(model.getLastReplicationStatus());
            }
            if (model.wasPropertyExplicitlySet("lastReplicationError")) {
                this.lastReplicationError(model.getLastReplicationError());
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

    /** Percentage of the current replication progress from 0 to 100. */
    @com.fasterxml.jackson.annotation.JsonProperty("percentage")
    private final Integer percentage;

    /**
     * Percentage of the current replication progress from 0 to 100.
     *
     * @return the value
     */
    public Integer getPercentage() {
        return percentage;
    }

    /** Status of the current replication progress. It can be None or InProgress. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        InProgress("IN_PROGRESS"),

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
    /** Status of the current replication progress. It can be None or InProgress. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Status of the current replication progress. It can be None or InProgress.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** Start time of the current replication process */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * Start time of the current replication process
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** Start time of the last replication process. It can be Completed or Failed. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOflastReplicationStart")
    private final java.util.Date timeOflastReplicationStart;

    /**
     * Start time of the last replication process. It can be Completed or Failed.
     *
     * @return the value
     */
    public java.util.Date getTimeOflastReplicationStart() {
        return timeOflastReplicationStart;
    }

    /** End time of the last replication process. It can be Completed or Failed. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastReplicationEnd")
    private final java.util.Date timeOfLastReplicationEnd;

    /**
     * End time of the last replication process. It can be Completed or Failed.
     *
     * @return the value
     */
    public java.util.Date getTimeOfLastReplicationEnd() {
        return timeOfLastReplicationEnd;
    }

    /** End time of the last successful replication process, which has been completed. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfLastReplicationSuccess")
    private final java.util.Date timeOfLastReplicationSuccess;

    /**
     * End time of the last successful replication process, which has been completed.
     *
     * @return the value
     */
    public java.util.Date getTimeOfLastReplicationSuccess() {
        return timeOfLastReplicationSuccess;
    }

    /** Status of the last replication task. It can be Completed or Failed. */
    public enum LastReplicationStatus implements com.oracle.bmc.http.internal.BmcEnum {
        None("NONE"),
        Completed("COMPLETED"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LastReplicationStatus.class);

        private final String value;
        private static java.util.Map<String, LastReplicationStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (LastReplicationStatus v : LastReplicationStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LastReplicationStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LastReplicationStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LastReplicationStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Status of the last replication task. It can be Completed or Failed. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastReplicationStatus")
    private final LastReplicationStatus lastReplicationStatus;

    /**
     * Status of the last replication task. It can be Completed or Failed.
     *
     * @return the value
     */
    public LastReplicationStatus getLastReplicationStatus() {
        return lastReplicationStatus;
    }

    /** Error message if the last finished replication failed. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastReplicationError")
    private final String lastReplicationError;

    /**
     * Error message if the last finished replication failed.
     *
     * @return the value
     */
    public String getLastReplicationError() {
        return lastReplicationError;
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
        sb.append("ReplicationProgress(");
        sb.append("super=").append(super.toString());
        sb.append("percentage=").append(String.valueOf(this.percentage));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeOflastReplicationStart=")
                .append(String.valueOf(this.timeOflastReplicationStart));
        sb.append(", timeOfLastReplicationEnd=")
                .append(String.valueOf(this.timeOfLastReplicationEnd));
        sb.append(", timeOfLastReplicationSuccess=")
                .append(String.valueOf(this.timeOfLastReplicationSuccess));
        sb.append(", lastReplicationStatus=").append(String.valueOf(this.lastReplicationStatus));
        sb.append(", lastReplicationError=").append(String.valueOf(this.lastReplicationError));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ReplicationProgress)) {
            return false;
        }

        ReplicationProgress other = (ReplicationProgress) o;
        return java.util.Objects.equals(this.percentage, other.percentage)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(
                        this.timeOflastReplicationStart, other.timeOflastReplicationStart)
                && java.util.Objects.equals(
                        this.timeOfLastReplicationEnd, other.timeOfLastReplicationEnd)
                && java.util.Objects.equals(
                        this.timeOfLastReplicationSuccess, other.timeOfLastReplicationSuccess)
                && java.util.Objects.equals(this.lastReplicationStatus, other.lastReplicationStatus)
                && java.util.Objects.equals(this.lastReplicationError, other.lastReplicationError)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.percentage == null ? 43 : this.percentage.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOflastReplicationStart == null
                                ? 43
                                : this.timeOflastReplicationStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfLastReplicationEnd == null
                                ? 43
                                : this.timeOfLastReplicationEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfLastReplicationSuccess == null
                                ? 43
                                : this.timeOfLastReplicationSuccess.hashCode());
        result =
                (result * PRIME)
                        + (this.lastReplicationStatus == null
                                ? 43
                                : this.lastReplicationStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.lastReplicationError == null
                                ? 43
                                : this.lastReplicationError.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
