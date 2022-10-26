/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The summary of the AWR wait event time series data for one event. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AwrDatabaseWaitEventSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class AwrDatabaseWaitEventSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "timeBegin",
        "timeEnd",
        "waitsPerSec",
        "avgWaitTimePerSec",
        "snapshotIdentifier"
    })
    public AwrDatabaseWaitEventSummary(
            String name,
            java.util.Date timeBegin,
            java.util.Date timeEnd,
            Double waitsPerSec,
            Double avgWaitTimePerSec,
            Integer snapshotIdentifier) {
        super();
        this.name = name;
        this.timeBegin = timeBegin;
        this.timeEnd = timeEnd;
        this.waitsPerSec = waitsPerSec;
        this.avgWaitTimePerSec = avgWaitTimePerSec;
        this.snapshotIdentifier = snapshotIdentifier;
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
        /**
         * The ID of the snapshot. The snapshot identifier is not the
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm). It can be
         * retrieved from the following endpoint: /awrHubs/{awrHubId}/awrDatabaseSnapshots
         */
        @com.fasterxml.jackson.annotation.JsonProperty("snapshotIdentifier")
        private Integer snapshotIdentifier;

        /**
         * The ID of the snapshot. The snapshot identifier is not the
         * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm). It can be
         * retrieved from the following endpoint: /awrHubs/{awrHubId}/awrDatabaseSnapshots
         *
         * @param snapshotIdentifier the value to set
         * @return this builder
         */
        public Builder snapshotIdentifier(Integer snapshotIdentifier) {
            this.snapshotIdentifier = snapshotIdentifier;
            this.__explicitlySet__.add("snapshotIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrDatabaseWaitEventSummary build() {
            AwrDatabaseWaitEventSummary model =
                    new AwrDatabaseWaitEventSummary(
                            this.name,
                            this.timeBegin,
                            this.timeEnd,
                            this.waitsPerSec,
                            this.avgWaitTimePerSec,
                            this.snapshotIdentifier);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrDatabaseWaitEventSummary model) {
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
            if (model.wasPropertyExplicitlySet("snapshotIdentifier")) {
                this.snapshotIdentifier(model.getSnapshotIdentifier());
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

    /**
     * The ID of the snapshot. The snapshot identifier is not the
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm). It can be
     * retrieved from the following endpoint: /awrHubs/{awrHubId}/awrDatabaseSnapshots
     */
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotIdentifier")
    private final Integer snapshotIdentifier;

    /**
     * The ID of the snapshot. The snapshot identifier is not the
     * [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm). It can be
     * retrieved from the following endpoint: /awrHubs/{awrHubId}/awrDatabaseSnapshots
     *
     * @return the value
     */
    public Integer getSnapshotIdentifier() {
        return snapshotIdentifier;
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
        sb.append("AwrDatabaseWaitEventSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", timeBegin=").append(String.valueOf(this.timeBegin));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", waitsPerSec=").append(String.valueOf(this.waitsPerSec));
        sb.append(", avgWaitTimePerSec=").append(String.valueOf(this.avgWaitTimePerSec));
        sb.append(", snapshotIdentifier=").append(String.valueOf(this.snapshotIdentifier));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwrDatabaseWaitEventSummary)) {
            return false;
        }

        AwrDatabaseWaitEventSummary other = (AwrDatabaseWaitEventSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.timeBegin, other.timeBegin)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.waitsPerSec, other.waitsPerSec)
                && java.util.Objects.equals(this.avgWaitTimePerSec, other.avgWaitTimePerSec)
                && java.util.Objects.equals(this.snapshotIdentifier, other.snapshotIdentifier)
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
                        + (this.snapshotIdentifier == null
                                ? 43
                                : this.snapshotIdentifier.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
