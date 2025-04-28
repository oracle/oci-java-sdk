/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The AWR snapshot summary of one snapshot. <br>
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
        builder = AwrDbSnapshotSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AwrDbSnapshotSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "awrDbId",
        "instanceNumber",
        "timeDbStartup",
        "timeBegin",
        "timeEnd",
        "snapshotId",
        "errorCount"
    })
    public AwrDbSnapshotSummary(
            String awrDbId,
            Integer instanceNumber,
            java.util.Date timeDbStartup,
            java.util.Date timeBegin,
            java.util.Date timeEnd,
            Integer snapshotId,
            Long errorCount) {
        super();
        this.awrDbId = awrDbId;
        this.instanceNumber = instanceNumber;
        this.timeDbStartup = timeDbStartup;
        this.timeBegin = timeBegin;
        this.timeEnd = timeEnd;
        this.snapshotId = snapshotId;
        this.errorCount = errorCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Internal ID of the database. The internal ID of the database is not the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). It can be
         * retrieved from the following endpoint: /managedDatabases/{managedDatabaseId}/awrDbs
         */
        @com.fasterxml.jackson.annotation.JsonProperty("awrDbId")
        private String awrDbId;

        /**
         * Internal ID of the database. The internal ID of the database is not the
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). It can be
         * retrieved from the following endpoint: /managedDatabases/{managedDatabaseId}/awrDbs
         *
         * @param awrDbId the value to set
         * @return this builder
         */
        public Builder awrDbId(String awrDbId) {
            this.awrDbId = awrDbId;
            this.__explicitlySet__.add("awrDbId");
            return this;
        }
        /** The database instance number. */
        @com.fasterxml.jackson.annotation.JsonProperty("instanceNumber")
        private Integer instanceNumber;

        /**
         * The database instance number.
         *
         * @param instanceNumber the value to set
         * @return this builder
         */
        public Builder instanceNumber(Integer instanceNumber) {
            this.instanceNumber = instanceNumber;
            this.__explicitlySet__.add("instanceNumber");
            return this;
        }
        /** The timestamp of the database startup. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDbStartup")
        private java.util.Date timeDbStartup;

        /**
         * The timestamp of the database startup.
         *
         * @param timeDbStartup the value to set
         * @return this builder
         */
        public Builder timeDbStartup(java.util.Date timeDbStartup) {
            this.timeDbStartup = timeDbStartup;
            this.__explicitlySet__.add("timeDbStartup");
            return this;
        }
        /** The start time of the snapshot. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
        private java.util.Date timeBegin;

        /**
         * The start time of the snapshot.
         *
         * @param timeBegin the value to set
         * @return this builder
         */
        public Builder timeBegin(java.util.Date timeBegin) {
            this.timeBegin = timeBegin;
            this.__explicitlySet__.add("timeBegin");
            return this;
        }
        /** The end time of the snapshot. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
        private java.util.Date timeEnd;

        /**
         * The end time of the snapshot.
         *
         * @param timeEnd the value to set
         * @return this builder
         */
        public Builder timeEnd(java.util.Date timeEnd) {
            this.timeEnd = timeEnd;
            this.__explicitlySet__.add("timeEnd");
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
        /** The total number of errors. */
        @com.fasterxml.jackson.annotation.JsonProperty("errorCount")
        private Long errorCount;

        /**
         * The total number of errors.
         *
         * @param errorCount the value to set
         * @return this builder
         */
        public Builder errorCount(Long errorCount) {
            this.errorCount = errorCount;
            this.__explicitlySet__.add("errorCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AwrDbSnapshotSummary build() {
            AwrDbSnapshotSummary model =
                    new AwrDbSnapshotSummary(
                            this.awrDbId,
                            this.instanceNumber,
                            this.timeDbStartup,
                            this.timeBegin,
                            this.timeEnd,
                            this.snapshotId,
                            this.errorCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrDbSnapshotSummary model) {
            if (model.wasPropertyExplicitlySet("awrDbId")) {
                this.awrDbId(model.getAwrDbId());
            }
            if (model.wasPropertyExplicitlySet("instanceNumber")) {
                this.instanceNumber(model.getInstanceNumber());
            }
            if (model.wasPropertyExplicitlySet("timeDbStartup")) {
                this.timeDbStartup(model.getTimeDbStartup());
            }
            if (model.wasPropertyExplicitlySet("timeBegin")) {
                this.timeBegin(model.getTimeBegin());
            }
            if (model.wasPropertyExplicitlySet("timeEnd")) {
                this.timeEnd(model.getTimeEnd());
            }
            if (model.wasPropertyExplicitlySet("snapshotId")) {
                this.snapshotId(model.getSnapshotId());
            }
            if (model.wasPropertyExplicitlySet("errorCount")) {
                this.errorCount(model.getErrorCount());
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
     * Internal ID of the database. The internal ID of the database is not the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). It can be
     * retrieved from the following endpoint: /managedDatabases/{managedDatabaseId}/awrDbs
     */
    @com.fasterxml.jackson.annotation.JsonProperty("awrDbId")
    private final String awrDbId;

    /**
     * Internal ID of the database. The internal ID of the database is not the
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm). It can be
     * retrieved from the following endpoint: /managedDatabases/{managedDatabaseId}/awrDbs
     *
     * @return the value
     */
    public String getAwrDbId() {
        return awrDbId;
    }

    /** The database instance number. */
    @com.fasterxml.jackson.annotation.JsonProperty("instanceNumber")
    private final Integer instanceNumber;

    /**
     * The database instance number.
     *
     * @return the value
     */
    public Integer getInstanceNumber() {
        return instanceNumber;
    }

    /** The timestamp of the database startup. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDbStartup")
    private final java.util.Date timeDbStartup;

    /**
     * The timestamp of the database startup.
     *
     * @return the value
     */
    public java.util.Date getTimeDbStartup() {
        return timeDbStartup;
    }

    /** The start time of the snapshot. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeBegin")
    private final java.util.Date timeBegin;

    /**
     * The start time of the snapshot.
     *
     * @return the value
     */
    public java.util.Date getTimeBegin() {
        return timeBegin;
    }

    /** The end time of the snapshot. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnd")
    private final java.util.Date timeEnd;

    /**
     * The end time of the snapshot.
     *
     * @return the value
     */
    public java.util.Date getTimeEnd() {
        return timeEnd;
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

    /** The total number of errors. */
    @com.fasterxml.jackson.annotation.JsonProperty("errorCount")
    private final Long errorCount;

    /**
     * The total number of errors.
     *
     * @return the value
     */
    public Long getErrorCount() {
        return errorCount;
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
        sb.append("AwrDbSnapshotSummary(");
        sb.append("super=").append(super.toString());
        sb.append("awrDbId=").append(String.valueOf(this.awrDbId));
        sb.append(", instanceNumber=").append(String.valueOf(this.instanceNumber));
        sb.append(", timeDbStartup=").append(String.valueOf(this.timeDbStartup));
        sb.append(", timeBegin=").append(String.valueOf(this.timeBegin));
        sb.append(", timeEnd=").append(String.valueOf(this.timeEnd));
        sb.append(", snapshotId=").append(String.valueOf(this.snapshotId));
        sb.append(", errorCount=").append(String.valueOf(this.errorCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwrDbSnapshotSummary)) {
            return false;
        }

        AwrDbSnapshotSummary other = (AwrDbSnapshotSummary) o;
        return java.util.Objects.equals(this.awrDbId, other.awrDbId)
                && java.util.Objects.equals(this.instanceNumber, other.instanceNumber)
                && java.util.Objects.equals(this.timeDbStartup, other.timeDbStartup)
                && java.util.Objects.equals(this.timeBegin, other.timeBegin)
                && java.util.Objects.equals(this.timeEnd, other.timeEnd)
                && java.util.Objects.equals(this.snapshotId, other.snapshotId)
                && java.util.Objects.equals(this.errorCount, other.errorCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.awrDbId == null ? 43 : this.awrDbId.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceNumber == null ? 43 : this.instanceNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDbStartup == null ? 43 : this.timeDbStartup.hashCode());
        result = (result * PRIME) + (this.timeBegin == null ? 43 : this.timeBegin.hashCode());
        result = (result * PRIME) + (this.timeEnd == null ? 43 : this.timeEnd.hashCode());
        result = (result * PRIME) + (this.snapshotId == null ? 43 : this.snapshotId.hashCode());
        result = (result * PRIME) + (this.errorCount == null ? 43 : this.errorCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
