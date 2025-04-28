/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of the AWR wait event time series data for one event. <br>
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
        builder = AwrDbWaitEventSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AwrDbWaitEventSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "timeBegin",
        "timeEnd",
        "waitsPerSec",
        "avgWaitTimePerSec",
        "avgWaitTimePerWait",
        "snapshotId"
    })
    public AwrDbWaitEventSummary(
            String name,
            java.util.Date timeBegin,
            java.util.Date timeEnd,
            Double waitsPerSec,
            Double avgWaitTimePerSec,
            Double avgWaitTimePerWait,
            Integer snapshotId) {
        super();
        this.name = name;
        this.timeBegin = timeBegin;
        this.timeEnd = timeEnd;
        this.waitsPerSec = waitsPerSec;
        this.avgWaitTimePerSec = avgWaitTimePerSec;
        this.avgWaitTimePerWait = avgWaitTimePerWait;
        this.snapshotId = snapshotId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the event. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the event.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The begin time of the wait event. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
        private java.util.Date timeBegin;

        /**
         * The begin time of the wait event.
         *
         * @param timeBegin the value to set
         * @return this builder
         */
        public Builder timeBegin(java.util.Date timeBegin) {
            this.timeBegin = timeBegin;
            this.__explicitlySet__.add("timeBegin");
            return this;
        }
        /** The end time of the wait event. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * The end time of the wait event.
         *
         * @param timeEnd the value to set
         * @return this builder
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
            return this;
        }
        /** The wait count per second. */
        @com.fasterxml.jackson.annotation.JsonProperty("waitsPerSec")
        private Double waitsPerSec;

        /**
         * The wait count per second.
         *
         * @param waitsPerSec the value to set
         * @return this builder
         */
        public Builder waitsPerSec(Double waitsPerSec) {
            this.waitsPerSec = waitsPerSec;
            this.__explicitlySet__.add("waitsPerSec");
            return this;
        }
        /** The average wait time per second. */
        @com.fasterxml.jackson.annotation.JsonProperty("avgWaitTimePerSec")
        private Double avgWaitTimePerSec;

        /**
         * The average wait time per second.
         *
         * @param avgWaitTimePerSec the value to set
         * @return this builder
         */
        public Builder avgWaitTimePerSec(Double avgWaitTimePerSec) {
            this.avgWaitTimePerSec = avgWaitTimePerSec;
            this.__explicitlySet__.add("avgWaitTimePerSec");
            return this;
        }
        /** The average wait time in milliseconds per wait. */
        @com.fasterxml.jackson.annotation.JsonProperty("avgWaitTimePerWait")
        private Double avgWaitTimePerWait;

        /**
         * The average wait time in milliseconds per wait.
         *
         * @param avgWaitTimePerWait the value to set
         * @return this builder
         */
        public Builder avgWaitTimePerWait(Double avgWaitTimePerWait) {
            this.avgWaitTimePerWait = avgWaitTimePerWait;
            this.__explicitlySet__.add("avgWaitTimePerWait");
            return this;
        }
        /**
         * The ID of the snapshot. The snapshot ID is not the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). It can be
         * retrieved from the following endpoint:
         * /managedDatabases/{managedDatabaseId}/awrDbs/{awrDbId}/awrDbSnapshots
         */
        @com.fasterxml.jackson.annotation.JsonProperty("snapshotId")
        private Integer snapshotId;

        /**
         * The ID of the snapshot. The snapshot ID is not the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). It can be
         * retrieved from the following endpoint:
         * /managedDatabases/{managedDatabaseId}/awrDbs/{awrDbId}/awrDbSnapshots
         *
         * @param snapshotId the value to set
         * @return this builder
         */
        public Builder snapshotId(Integer snapshotId) {
            this.snapshotId = snapshotId;
            this.__explicitlySet__.add("snapshotId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrDbWaitEventSummary build() {
            AwrDbWaitEventSummary model =
                    new AwrDbWaitEventSummary(
                            this.name,
                            this.timeBegin,
                            this.timeEnd,
                            this.waitsPerSec,
                            this.avgWaitTimePerSec,
                            this.avgWaitTimePerWait,
                            this.snapshotId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrDbWaitEventSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("timeBegin")) {
                this.timeBegin(model.getTimeBegin());
            }
            if (model.wasPropertyExplicitlySet("timeEnd")) {
                this.timeEnd(model.getTimeEnd());
            }
            if (model.wasPropertyExplicitlySet("waitsPerSec")) {
                this.waitsPerSec(model.getWaitsPerSec());
            }
            if (model.wasPropertyExplicitlySet("avgWaitTimePerSec")) {
                this.avgWaitTimePerSec(model.getAvgWaitTimePerSec());
            }
            if (model.wasPropertyExplicitlySet("avgWaitTimePerWait")) {
                this.avgWaitTimePerWait(model.getAvgWaitTimePerWait());
            }
            if (model.wasPropertyExplicitlySet("snapshotId")) {
                this.snapshotId(model.getSnapshotId());
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

    /** The name of the event. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the event.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The begin time of the wait event. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
    private final java.util.Date timeBegin;

    /**
     * The begin time of the wait event.
     *
     * @return the value
     */
    public java.util.Date getTimeBegin() {
        return timeBegin;
    }

    /** The end time of the wait event. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * The end time of the wait event.
     *
     * @return the value
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
    }

    /** The wait count per second. */
    @com.fasterxml.jackson.annotation.JsonProperty("waitsPerSec")
    private final Double waitsPerSec;

    /**
     * The wait count per second.
     *
     * @return the value
     */
    public Double getWaitsPerSec() {
        return waitsPerSec;
    }

    /** The average wait time per second. */
    @com.fasterxml.jackson.annotation.JsonProperty("avgWaitTimePerSec")
    private final Double avgWaitTimePerSec;

    /**
     * The average wait time per second.
     *
     * @return the value
     */
    public Double getAvgWaitTimePerSec() {
        return avgWaitTimePerSec;
    }

    /** The average wait time in milliseconds per wait. */
    @com.fasterxml.jackson.annotation.JsonProperty("avgWaitTimePerWait")
    private final Double avgWaitTimePerWait;

    /**
     * The average wait time in milliseconds per wait.
     *
     * @return the value
     */
    public Double getAvgWaitTimePerWait() {
        return avgWaitTimePerWait;
    }

    /**
     * The ID of the snapshot. The snapshot ID is not the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). It can be
     * retrieved from the following endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbs/{awrDbId}/awrDbSnapshots
     */
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotId")
    private final Integer snapshotId;

    /**
     * The ID of the snapshot. The snapshot ID is not the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). It can be
     * retrieved from the following endpoint:
     * /managedDatabases/{managedDatabaseId}/awrDbs/{awrDbId}/awrDbSnapshots
     *
     * @return the value
     */
    public Integer getSnapshotId() {
        return snapshotId;
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
        sb.append("AwrDbWaitEventSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", timeBegin=").append(String.valueOf(this.timeBegin));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", waitsPerSec=").append(String.valueOf(this.waitsPerSec));
        sb.append(", avgWaitTimePerSec=").append(String.valueOf(this.avgWaitTimePerSec));
        sb.append(", avgWaitTimePerWait=").append(String.valueOf(this.avgWaitTimePerWait));
        sb.append(", snapshotId=").append(String.valueOf(this.snapshotId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwrDbWaitEventSummary)) {
            return false;
        }

        AwrDbWaitEventSummary other = (AwrDbWaitEventSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.timeBegin, other.timeBegin)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.waitsPerSec, other.waitsPerSec)
                && java.util.Objects.equals(this.avgWaitTimePerSec, other.avgWaitTimePerSec)
                && java.util.Objects.equals(this.avgWaitTimePerWait, other.avgWaitTimePerWait)
                && java.util.Objects.equals(this.snapshotId, other.snapshotId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.timeBegin == null ? 43 : this.timeBegin.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.waitsPerSec == null ? 43 : this.waitsPerSec.hashCode());
        result =
                (result * PRIME)
                        + (this.avgWaitTimePerSec == null ? 43 : this.avgWaitTimePerSec.hashCode());
        result =
                (result * PRIME)
                        + (this.avgWaitTimePerWait == null
                                ? 43
                                : this.avgWaitTimePerWait.hashCode());
        result = (result * PRIME) + (this.snapshotId == null ? 43 : this.snapshotId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
