/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AwrSnapshotSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AwrSnapshotSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "awrSourceDatabaseId",
        "instanceNumber",
        "timeDbStartup",
        "timeSnapshotBegin",
        "timeSnapshotEnd",
        "snapshotIdentifier",
        "errorCount"
    })
    public AwrSnapshotSummary(
            String awrSourceDatabaseId,
            Integer instanceNumber,
            java.util.Date timeDbStartup,
            java.util.Date timeSnapshotBegin,
            java.util.Date timeSnapshotEnd,
            Integer snapshotIdentifier,
            Long errorCount) {
        super();
        this.awrSourceDatabaseId = awrSourceDatabaseId;
        this.instanceNumber = instanceNumber;
        this.timeDbStartup = timeDbStartup;
        this.timeSnapshotBegin = timeSnapshotBegin;
        this.timeSnapshotEnd = timeSnapshotEnd;
        this.snapshotIdentifier = snapshotIdentifier;
        this.errorCount = errorCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** DatabaseId of the Source database for which AWR Data will be uploaded to AWR Hub. */
        @com.fasterxml.jackson.annotation.JsonProperty("awrSourceDatabaseId")
        private String awrSourceDatabaseId;

        /**
         * DatabaseId of the Source database for which AWR Data will be uploaded to AWR Hub.
         *
         * @param awrSourceDatabaseId the value to set
         * @return this builder
         */
        public Builder awrSourceDatabaseId(String awrSourceDatabaseId) {
            this.awrSourceDatabaseId = awrSourceDatabaseId;
            this.__explicitlySet__.add("awrSourceDatabaseId");
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
        @com.fasterxml.jackson.annotation.JsonProperty("timeSnapshotBegin")
        private java.util.Date timeSnapshotBegin;

        /**
         * The start time of the snapshot.
         *
         * @param timeSnapshotBegin the value to set
         * @return this builder
         */
        public Builder timeSnapshotBegin(java.util.Date timeSnapshotBegin) {
            this.timeSnapshotBegin = timeSnapshotBegin;
            this.__explicitlySet__.add("timeSnapshotBegin");
            return this;
        }
        /** The end time of the snapshot. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeSnapshotEnd")
        private java.util.Date timeSnapshotEnd;

        /**
         * The end time of the snapshot.
         *
         * @param timeSnapshotEnd the value to set
         * @return this builder
         */
        public Builder timeSnapshotEnd(java.util.Date timeSnapshotEnd) {
            this.timeSnapshotEnd = timeSnapshotEnd;
            this.__explicitlySet__.add("timeSnapshotEnd");
            return this;
        }
        /** The identifier of the snapshot. */
        @com.fasterxml.jackson.annotation.JsonProperty("snapshotIdentifier")
        private Integer snapshotIdentifier;

        /**
         * The identifier of the snapshot.
         *
         * @param snapshotIdentifier the value to set
         * @return this builder
         */
        public Builder snapshotIdentifier(Integer snapshotIdentifier) {
            this.snapshotIdentifier = snapshotIdentifier;
            this.__explicitlySet__.add("snapshotIdentifier");
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

        public AwrSnapshotSummary build() {
            AwrSnapshotSummary model =
                    new AwrSnapshotSummary(
                            this.awrSourceDatabaseId,
                            this.instanceNumber,
                            this.timeDbStartup,
                            this.timeSnapshotBegin,
                            this.timeSnapshotEnd,
                            this.snapshotIdentifier,
                            this.errorCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AwrSnapshotSummary model) {
            if (model.wasPropertyExplicitlySet("awrSourceDatabaseId")) {
                this.awrSourceDatabaseId(model.getAwrSourceDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("instanceNumber")) {
                this.instanceNumber(model.getInstanceNumber());
            }
            if (model.wasPropertyExplicitlySet("timeDbStartup")) {
                this.timeDbStartup(model.getTimeDbStartup());
            }
            if (model.wasPropertyExplicitlySet("timeSnapshotBegin")) {
                this.timeSnapshotBegin(model.getTimeSnapshotBegin());
            }
            if (model.wasPropertyExplicitlySet("timeSnapshotEnd")) {
                this.timeSnapshotEnd(model.getTimeSnapshotEnd());
            }
            if (model.wasPropertyExplicitlySet("snapshotIdentifier")) {
                this.snapshotIdentifier(model.getSnapshotIdentifier());
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

    /** DatabaseId of the Source database for which AWR Data will be uploaded to AWR Hub. */
    @com.fasterxml.jackson.annotation.JsonProperty("awrSourceDatabaseId")
    private final String awrSourceDatabaseId;

    /**
     * DatabaseId of the Source database for which AWR Data will be uploaded to AWR Hub.
     *
     * @return the value
     */
    public String getAwrSourceDatabaseId() {
        return awrSourceDatabaseId;
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
    @com.fasterxml.jackson.annotation.JsonProperty("timeSnapshotBegin")
    private final java.util.Date timeSnapshotBegin;

    /**
     * The start time of the snapshot.
     *
     * @return the value
     */
    public java.util.Date getTimeSnapshotBegin() {
        return timeSnapshotBegin;
    }

    /** The end time of the snapshot. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeSnapshotEnd")
    private final java.util.Date timeSnapshotEnd;

    /**
     * The end time of the snapshot.
     *
     * @return the value
     */
    public java.util.Date getTimeSnapshotEnd() {
        return timeSnapshotEnd;
    }

    /** The identifier of the snapshot. */
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotIdentifier")
    private final Integer snapshotIdentifier;

    /**
     * The identifier of the snapshot.
     *
     * @return the value
     */
    public Integer getSnapshotIdentifier() {
        return snapshotIdentifier;
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
        sb.append("AwrSnapshotSummary(");
        sb.append("super=").append(super.toString());
        sb.append("awrSourceDatabaseId=").append(String.valueOf(this.awrSourceDatabaseId));
        sb.append(", instanceNumber=").append(String.valueOf(this.instanceNumber));
        sb.append(", timeDbStartup=").append(String.valueOf(this.timeDbStartup));
        sb.append(", timeSnapshotBegin=").append(String.valueOf(this.timeSnapshotBegin));
        sb.append(", timeSnapshotEnd=").append(String.valueOf(this.timeSnapshotEnd));
        sb.append(", snapshotIdentifier=").append(String.valueOf(this.snapshotIdentifier));
        sb.append(", errorCount=").append(String.valueOf(this.errorCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AwrSnapshotSummary)) {
            return false;
        }

        AwrSnapshotSummary other = (AwrSnapshotSummary) o;
        return java.util.Objects.equals(this.awrSourceDatabaseId, other.awrSourceDatabaseId)
                && java.util.Objects.equals(this.instanceNumber, other.instanceNumber)
                && java.util.Objects.equals(this.timeDbStartup, other.timeDbStartup)
                && java.util.Objects.equals(this.timeSnapshotBegin, other.timeSnapshotBegin)
                && java.util.Objects.equals(this.timeSnapshotEnd, other.timeSnapshotEnd)
                && java.util.Objects.equals(this.snapshotIdentifier, other.snapshotIdentifier)
                && java.util.Objects.equals(this.errorCount, other.errorCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.awrSourceDatabaseId == null
                                ? 43
                                : this.awrSourceDatabaseId.hashCode());
        result =
                (result * PRIME)
                        + (this.instanceNumber == null ? 43 : this.instanceNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDbStartup == null ? 43 : this.timeDbStartup.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSnapshotBegin == null ? 43 : this.timeSnapshotBegin.hashCode());
        result =
                (result * PRIME)
                        + (this.timeSnapshotEnd == null ? 43 : this.timeSnapshotEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.snapshotIdentifier == null
                                ? 43
                                : this.snapshotIdentifier.hashCode());
        result = (result * PRIME) + (this.errorCount == null ? 43 : this.errorCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
