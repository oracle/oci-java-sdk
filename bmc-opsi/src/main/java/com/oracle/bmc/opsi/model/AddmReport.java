/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * ADDM Tasks. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AddmReport.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AddmReport extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeIntervalStart",
        "timeIntervalEnd",
        "taskIdentifier",
        "databaseIdentifier",
        "snapshotIntervalStart",
        "snapshotIntervalEnd",
        "addmReport"
    })
    public AddmReport(
            java.util.Date timeIntervalStart,
            java.util.Date timeIntervalEnd,
            String taskIdentifier,
            String databaseIdentifier,
            String snapshotIntervalStart,
            String snapshotIntervalEnd,
            String addmReport) {
        super();
        this.timeIntervalStart = timeIntervalStart;
        this.timeIntervalEnd = timeIntervalEnd;
        this.taskIdentifier = taskIdentifier;
        this.databaseIdentifier = databaseIdentifier;
        this.snapshotIntervalStart = snapshotIntervalStart;
        this.snapshotIntervalEnd = snapshotIntervalEnd;
        this.addmReport = addmReport;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The start timestamp that was passed into the request. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalStart")
        private java.util.Date timeIntervalStart;

        /**
         * The start timestamp that was passed into the request.
         *
         * @param timeIntervalStart the value to set
         * @return this builder
         */
        public Builder timeIntervalStart(java.util.Date timeIntervalStart) {
            this.timeIntervalStart = timeIntervalStart;
            this.__explicitlySet__.add("timeIntervalStart");
            return this;
        }
        /** The end timestamp that was passed into the request. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalEnd")
        private java.util.Date timeIntervalEnd;

        /**
         * The end timestamp that was passed into the request.
         *
         * @param timeIntervalEnd the value to set
         * @return this builder
         */
        public Builder timeIntervalEnd(java.util.Date timeIntervalEnd) {
            this.timeIntervalEnd = timeIntervalEnd;
            this.__explicitlySet__.add("timeIntervalEnd");
            return this;
        }
        /** TASK_ID in the oracle database view DBA_ADDM_TASKS */
        @com.fasterxml.jackson.annotation.JsonProperty("taskIdentifier")
        private String taskIdentifier;

        /**
         * TASK_ID in the oracle database view DBA_ADDM_TASKS
         *
         * @param taskIdentifier the value to set
         * @return this builder
         */
        public Builder taskIdentifier(String taskIdentifier) {
            this.taskIdentifier = taskIdentifier;
            this.__explicitlySet__.add("taskIdentifier");
            return this;
        }
        /** Internal id of the database. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseIdentifier")
        private String databaseIdentifier;

        /**
         * Internal id of the database.
         *
         * @param databaseIdentifier the value to set
         * @return this builder
         */
        public Builder databaseIdentifier(String databaseIdentifier) {
            this.databaseIdentifier = databaseIdentifier;
            this.__explicitlySet__.add("databaseIdentifier");
            return this;
        }
        /** AWR snapshot id. */
        @com.fasterxml.jackson.annotation.JsonProperty("snapshotIntervalStart")
        private String snapshotIntervalStart;

        /**
         * AWR snapshot id.
         *
         * @param snapshotIntervalStart the value to set
         * @return this builder
         */
        public Builder snapshotIntervalStart(String snapshotIntervalStart) {
            this.snapshotIntervalStart = snapshotIntervalStart;
            this.__explicitlySet__.add("snapshotIntervalStart");
            return this;
        }
        /** AWR snapshot id. */
        @com.fasterxml.jackson.annotation.JsonProperty("snapshotIntervalEnd")
        private String snapshotIntervalEnd;

        /**
         * AWR snapshot id.
         *
         * @param snapshotIntervalEnd the value to set
         * @return this builder
         */
        public Builder snapshotIntervalEnd(String snapshotIntervalEnd) {
            this.snapshotIntervalEnd = snapshotIntervalEnd;
            this.__explicitlySet__.add("snapshotIntervalEnd");
            return this;
        }
        /** The complete ADDM report */
        @com.fasterxml.jackson.annotation.JsonProperty("addmReport")
        private String addmReport;

        /**
         * The complete ADDM report
         *
         * @param addmReport the value to set
         * @return this builder
         */
        public Builder addmReport(String addmReport) {
            this.addmReport = addmReport;
            this.__explicitlySet__.add("addmReport");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddmReport build() {
            AddmReport model =
                    new AddmReport(
                            this.timeIntervalStart,
                            this.timeIntervalEnd,
                            this.taskIdentifier,
                            this.databaseIdentifier,
                            this.snapshotIntervalStart,
                            this.snapshotIntervalEnd,
                            this.addmReport);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddmReport model) {
            if (model.wasPropertyExplicitlySet("timeIntervalStart")) {
                this.timeIntervalStart(model.getTimeIntervalStart());
            }
            if (model.wasPropertyExplicitlySet("timeIntervalEnd")) {
                this.timeIntervalEnd(model.getTimeIntervalEnd());
            }
            if (model.wasPropertyExplicitlySet("taskIdentifier")) {
                this.taskIdentifier(model.getTaskIdentifier());
            }
            if (model.wasPropertyExplicitlySet("databaseIdentifier")) {
                this.databaseIdentifier(model.getDatabaseIdentifier());
            }
            if (model.wasPropertyExplicitlySet("snapshotIntervalStart")) {
                this.snapshotIntervalStart(model.getSnapshotIntervalStart());
            }
            if (model.wasPropertyExplicitlySet("snapshotIntervalEnd")) {
                this.snapshotIntervalEnd(model.getSnapshotIntervalEnd());
            }
            if (model.wasPropertyExplicitlySet("addmReport")) {
                this.addmReport(model.getAddmReport());
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

    /** The start timestamp that was passed into the request. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalStart")
    private final java.util.Date timeIntervalStart;

    /**
     * The start timestamp that was passed into the request.
     *
     * @return the value
     */
    public java.util.Date getTimeIntervalStart() {
        return timeIntervalStart;
    }

    /** The end timestamp that was passed into the request. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeIntervalEnd")
    private final java.util.Date timeIntervalEnd;

    /**
     * The end timestamp that was passed into the request.
     *
     * @return the value
     */
    public java.util.Date getTimeIntervalEnd() {
        return timeIntervalEnd;
    }

    /** TASK_ID in the oracle database view DBA_ADDM_TASKS */
    @com.fasterxml.jackson.annotation.JsonProperty("taskIdentifier")
    private final String taskIdentifier;

    /**
     * TASK_ID in the oracle database view DBA_ADDM_TASKS
     *
     * @return the value
     */
    public String getTaskIdentifier() {
        return taskIdentifier;
    }

    /** Internal id of the database. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseIdentifier")
    private final String databaseIdentifier;

    /**
     * Internal id of the database.
     *
     * @return the value
     */
    public String getDatabaseIdentifier() {
        return databaseIdentifier;
    }

    /** AWR snapshot id. */
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotIntervalStart")
    private final String snapshotIntervalStart;

    /**
     * AWR snapshot id.
     *
     * @return the value
     */
    public String getSnapshotIntervalStart() {
        return snapshotIntervalStart;
    }

    /** AWR snapshot id. */
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotIntervalEnd")
    private final String snapshotIntervalEnd;

    /**
     * AWR snapshot id.
     *
     * @return the value
     */
    public String getSnapshotIntervalEnd() {
        return snapshotIntervalEnd;
    }

    /** The complete ADDM report */
    @com.fasterxml.jackson.annotation.JsonProperty("addmReport")
    private final String addmReport;

    /**
     * The complete ADDM report
     *
     * @return the value
     */
    public String getAddmReport() {
        return addmReport;
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
        sb.append("AddmReport(");
        sb.append("super=").append(super.toString());
        sb.append("timeIntervalStart=").append(String.valueOf(this.timeIntervalStart));
        sb.append(", timeIntervalEnd=").append(String.valueOf(this.timeIntervalEnd));
        sb.append(", taskIdentifier=").append(String.valueOf(this.taskIdentifier));
        sb.append(", databaseIdentifier=").append(String.valueOf(this.databaseIdentifier));
        sb.append(", snapshotIntervalStart=").append(String.valueOf(this.snapshotIntervalStart));
        sb.append(", snapshotIntervalEnd=").append(String.valueOf(this.snapshotIntervalEnd));
        sb.append(", addmReport=").append(String.valueOf(this.addmReport));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddmReport)) {
            return false;
        }

        AddmReport other = (AddmReport) o;
        return java.util.Objects.equals(this.timeIntervalStart, other.timeIntervalStart)
                && java.util.Objects.equals(this.timeIntervalEnd, other.timeIntervalEnd)
                && java.util.Objects.equals(this.taskIdentifier, other.taskIdentifier)
                && java.util.Objects.equals(this.databaseIdentifier, other.databaseIdentifier)
                && java.util.Objects.equals(this.snapshotIntervalStart, other.snapshotIntervalStart)
                && java.util.Objects.equals(this.snapshotIntervalEnd, other.snapshotIntervalEnd)
                && java.util.Objects.equals(this.addmReport, other.addmReport)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeIntervalStart == null ? 43 : this.timeIntervalStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeIntervalEnd == null ? 43 : this.timeIntervalEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.taskIdentifier == null ? 43 : this.taskIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseIdentifier == null
                                ? 43
                                : this.databaseIdentifier.hashCode());
        result =
                (result * PRIME)
                        + (this.snapshotIntervalStart == null
                                ? 43
                                : this.snapshotIntervalStart.hashCode());
        result =
                (result * PRIME)
                        + (this.snapshotIntervalEnd == null
                                ? 43
                                : this.snapshotIntervalEnd.hashCode());
        result = (result * PRIME) + (this.addmReport == null ? 43 : this.addmReport.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
