/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * ADDM findings time series data <br>
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
        builder = AddmDbFindingsTimeSeriesSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AddmDbFindingsTimeSeriesSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "taskId",
        "taskName",
        "findingId",
        "timestamp",
        "timeAnalysisStarted",
        "timeAnalysisEnded",
        "categoryName",
        "categoryDisplayName",
        "name",
        "message",
        "analysisDbTimeInSecs",
        "analysisAvgActiveSessions",
        "impactDbTimeInSecs",
        "impactPercent",
        "impactAvgActiveSessions"
    })
    public AddmDbFindingsTimeSeriesSummary(
            String id,
            Integer taskId,
            String taskName,
            String findingId,
            java.util.Date timestamp,
            java.util.Date timeAnalysisStarted,
            java.util.Date timeAnalysisEnded,
            String categoryName,
            String categoryDisplayName,
            String name,
            String message,
            Double analysisDbTimeInSecs,
            Double analysisAvgActiveSessions,
            Double impactDbTimeInSecs,
            Double impactPercent,
            Double impactAvgActiveSessions) {
        super();
        this.id = id;
        this.taskId = taskId;
        this.taskName = taskName;
        this.findingId = findingId;
        this.timestamp = timestamp;
        this.timeAnalysisStarted = timeAnalysisStarted;
        this.timeAnalysisEnded = timeAnalysisEnded;
        this.categoryName = categoryName;
        this.categoryDisplayName = categoryDisplayName;
        this.name = name;
        this.message = message;
        this.analysisDbTimeInSecs = analysisDbTimeInSecs;
        this.analysisAvgActiveSessions = analysisAvgActiveSessions;
        this.impactDbTimeInSecs = impactDbTimeInSecs;
        this.impactPercent = impactPercent;
        this.impactAvgActiveSessions = impactAvgActiveSessions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the Database insight.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm)
         * of the Database insight.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** Unique ADDM task id */
        @com.fasterxml.jackson.annotation.JsonProperty("taskId")
        private Integer taskId;

        /**
         * Unique ADDM task id
         *
         * @param taskId the value to set
         * @return this builder
         */
        public Builder taskId(Integer taskId) {
            this.taskId = taskId;
            this.__explicitlySet__.add("taskId");
            return this;
        }
        /** ADDM task name */
        @com.fasterxml.jackson.annotation.JsonProperty("taskName")
        private String taskName;

        /**
         * ADDM task name
         *
         * @param taskName the value to set
         * @return this builder
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            this.__explicitlySet__.add("taskName");
            return this;
        }
        /** Unique finding id */
        @com.fasterxml.jackson.annotation.JsonProperty("findingId")
        private String findingId;

        /**
         * Unique finding id
         *
         * @param findingId the value to set
         * @return this builder
         */
        public Builder findingId(String findingId) {
            this.findingId = findingId;
            this.__explicitlySet__.add("findingId");
            return this;
        }
        /** Timestamp when finding was generated */
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * Timestamp when finding was generated
         *
         * @param timestamp the value to set
         * @return this builder
         */
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }
        /** Start Timestamp of snapshot */
        @com.fasterxml.jackson.annotation.JsonProperty("timeAnalysisStarted")
        private java.util.Date timeAnalysisStarted;

        /**
         * Start Timestamp of snapshot
         *
         * @param timeAnalysisStarted the value to set
         * @return this builder
         */
        public Builder timeAnalysisStarted(java.util.Date timeAnalysisStarted) {
            this.timeAnalysisStarted = timeAnalysisStarted;
            this.__explicitlySet__.add("timeAnalysisStarted");
            return this;
        }
        /** End Timestamp of snapshot */
        @com.fasterxml.jackson.annotation.JsonProperty("timeAnalysisEnded")
        private java.util.Date timeAnalysisEnded;

        /**
         * End Timestamp of snapshot
         *
         * @param timeAnalysisEnded the value to set
         * @return this builder
         */
        public Builder timeAnalysisEnded(java.util.Date timeAnalysisEnded) {
            this.timeAnalysisEnded = timeAnalysisEnded;
            this.__explicitlySet__.add("timeAnalysisEnded");
            return this;
        }
        /** Category name */
        @com.fasterxml.jackson.annotation.JsonProperty("categoryName")
        private String categoryName;

        /**
         * Category name
         *
         * @param categoryName the value to set
         * @return this builder
         */
        public Builder categoryName(String categoryName) {
            this.categoryName = categoryName;
            this.__explicitlySet__.add("categoryName");
            return this;
        }
        /** Category display name */
        @com.fasterxml.jackson.annotation.JsonProperty("categoryDisplayName")
        private String categoryDisplayName;

        /**
         * Category display name
         *
         * @param categoryDisplayName the value to set
         * @return this builder
         */
        public Builder categoryDisplayName(String categoryDisplayName) {
            this.categoryDisplayName = categoryDisplayName;
            this.__explicitlySet__.add("categoryDisplayName");
            return this;
        }
        /** Finding name */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Finding name
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Finding message */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * Finding message
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /** DB time in seconds for the snapshot */
        @com.fasterxml.jackson.annotation.JsonProperty("analysisDbTimeInSecs")
        private Double analysisDbTimeInSecs;

        /**
         * DB time in seconds for the snapshot
         *
         * @param analysisDbTimeInSecs the value to set
         * @return this builder
         */
        public Builder analysisDbTimeInSecs(Double analysisDbTimeInSecs) {
            this.analysisDbTimeInSecs = analysisDbTimeInSecs;
            this.__explicitlySet__.add("analysisDbTimeInSecs");
            return this;
        }
        /** DB avg active sessions for the snapshot */
        @com.fasterxml.jackson.annotation.JsonProperty("analysisAvgActiveSessions")
        private Double analysisAvgActiveSessions;

        /**
         * DB avg active sessions for the snapshot
         *
         * @param analysisAvgActiveSessions the value to set
         * @return this builder
         */
        public Builder analysisAvgActiveSessions(Double analysisAvgActiveSessions) {
            this.analysisAvgActiveSessions = analysisAvgActiveSessions;
            this.__explicitlySet__.add("analysisAvgActiveSessions");
            return this;
        }
        /** Impact in seconds */
        @com.fasterxml.jackson.annotation.JsonProperty("impactDbTimeInSecs")
        private Double impactDbTimeInSecs;

        /**
         * Impact in seconds
         *
         * @param impactDbTimeInSecs the value to set
         * @return this builder
         */
        public Builder impactDbTimeInSecs(Double impactDbTimeInSecs) {
            this.impactDbTimeInSecs = impactDbTimeInSecs;
            this.__explicitlySet__.add("impactDbTimeInSecs");
            return this;
        }
        /** Impact in terms of percentage of total activity */
        @com.fasterxml.jackson.annotation.JsonProperty("impactPercent")
        private Double impactPercent;

        /**
         * Impact in terms of percentage of total activity
         *
         * @param impactPercent the value to set
         * @return this builder
         */
        public Builder impactPercent(Double impactPercent) {
            this.impactPercent = impactPercent;
            this.__explicitlySet__.add("impactPercent");
            return this;
        }
        /** Impact in terms of average active sessions */
        @com.fasterxml.jackson.annotation.JsonProperty("impactAvgActiveSessions")
        private Double impactAvgActiveSessions;

        /**
         * Impact in terms of average active sessions
         *
         * @param impactAvgActiveSessions the value to set
         * @return this builder
         */
        public Builder impactAvgActiveSessions(Double impactAvgActiveSessions) {
            this.impactAvgActiveSessions = impactAvgActiveSessions;
            this.__explicitlySet__.add("impactAvgActiveSessions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddmDbFindingsTimeSeriesSummary build() {
            AddmDbFindingsTimeSeriesSummary model =
                    new AddmDbFindingsTimeSeriesSummary(
                            this.id,
                            this.taskId,
                            this.taskName,
                            this.findingId,
                            this.timestamp,
                            this.timeAnalysisStarted,
                            this.timeAnalysisEnded,
                            this.categoryName,
                            this.categoryDisplayName,
                            this.name,
                            this.message,
                            this.analysisDbTimeInSecs,
                            this.analysisAvgActiveSessions,
                            this.impactDbTimeInSecs,
                            this.impactPercent,
                            this.impactAvgActiveSessions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddmDbFindingsTimeSeriesSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("taskId")) {
                this.taskId(model.getTaskId());
            }
            if (model.wasPropertyExplicitlySet("taskName")) {
                this.taskName(model.getTaskName());
            }
            if (model.wasPropertyExplicitlySet("findingId")) {
                this.findingId(model.getFindingId());
            }
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
            }
            if (model.wasPropertyExplicitlySet("timeAnalysisStarted")) {
                this.timeAnalysisStarted(model.getTimeAnalysisStarted());
            }
            if (model.wasPropertyExplicitlySet("timeAnalysisEnded")) {
                this.timeAnalysisEnded(model.getTimeAnalysisEnded());
            }
            if (model.wasPropertyExplicitlySet("categoryName")) {
                this.categoryName(model.getCategoryName());
            }
            if (model.wasPropertyExplicitlySet("categoryDisplayName")) {
                this.categoryDisplayName(model.getCategoryDisplayName());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("analysisDbTimeInSecs")) {
                this.analysisDbTimeInSecs(model.getAnalysisDbTimeInSecs());
            }
            if (model.wasPropertyExplicitlySet("analysisAvgActiveSessions")) {
                this.analysisAvgActiveSessions(model.getAnalysisAvgActiveSessions());
            }
            if (model.wasPropertyExplicitlySet("impactDbTimeInSecs")) {
                this.impactDbTimeInSecs(model.getImpactDbTimeInSecs());
            }
            if (model.wasPropertyExplicitlySet("impactPercent")) {
                this.impactPercent(model.getImpactPercent());
            }
            if (model.wasPropertyExplicitlySet("impactAvgActiveSessions")) {
                this.impactAvgActiveSessions(model.getImpactAvgActiveSessions());
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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the Database insight.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the Database insight.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** Unique ADDM task id */
    @com.fasterxml.jackson.annotation.JsonProperty("taskId")
    private final Integer taskId;

    /**
     * Unique ADDM task id
     *
     * @return the value
     */
    public Integer getTaskId() {
        return taskId;
    }

    /** ADDM task name */
    @com.fasterxml.jackson.annotation.JsonProperty("taskName")
    private final String taskName;

    /**
     * ADDM task name
     *
     * @return the value
     */
    public String getTaskName() {
        return taskName;
    }

    /** Unique finding id */
    @com.fasterxml.jackson.annotation.JsonProperty("findingId")
    private final String findingId;

    /**
     * Unique finding id
     *
     * @return the value
     */
    public String getFindingId() {
        return findingId;
    }

    /** Timestamp when finding was generated */
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * Timestamp when finding was generated
     *
     * @return the value
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /** Start Timestamp of snapshot */
    @com.fasterxml.jackson.annotation.JsonProperty("timeAnalysisStarted")
    private final java.util.Date timeAnalysisStarted;

    /**
     * Start Timestamp of snapshot
     *
     * @return the value
     */
    public java.util.Date getTimeAnalysisStarted() {
        return timeAnalysisStarted;
    }

    /** End Timestamp of snapshot */
    @com.fasterxml.jackson.annotation.JsonProperty("timeAnalysisEnded")
    private final java.util.Date timeAnalysisEnded;

    /**
     * End Timestamp of snapshot
     *
     * @return the value
     */
    public java.util.Date getTimeAnalysisEnded() {
        return timeAnalysisEnded;
    }

    /** Category name */
    @com.fasterxml.jackson.annotation.JsonProperty("categoryName")
    private final String categoryName;

    /**
     * Category name
     *
     * @return the value
     */
    public String getCategoryName() {
        return categoryName;
    }

    /** Category display name */
    @com.fasterxml.jackson.annotation.JsonProperty("categoryDisplayName")
    private final String categoryDisplayName;

    /**
     * Category display name
     *
     * @return the value
     */
    public String getCategoryDisplayName() {
        return categoryDisplayName;
    }

    /** Finding name */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Finding name
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Finding message */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * Finding message
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /** DB time in seconds for the snapshot */
    @com.fasterxml.jackson.annotation.JsonProperty("analysisDbTimeInSecs")
    private final Double analysisDbTimeInSecs;

    /**
     * DB time in seconds for the snapshot
     *
     * @return the value
     */
    public Double getAnalysisDbTimeInSecs() {
        return analysisDbTimeInSecs;
    }

    /** DB avg active sessions for the snapshot */
    @com.fasterxml.jackson.annotation.JsonProperty("analysisAvgActiveSessions")
    private final Double analysisAvgActiveSessions;

    /**
     * DB avg active sessions for the snapshot
     *
     * @return the value
     */
    public Double getAnalysisAvgActiveSessions() {
        return analysisAvgActiveSessions;
    }

    /** Impact in seconds */
    @com.fasterxml.jackson.annotation.JsonProperty("impactDbTimeInSecs")
    private final Double impactDbTimeInSecs;

    /**
     * Impact in seconds
     *
     * @return the value
     */
    public Double getImpactDbTimeInSecs() {
        return impactDbTimeInSecs;
    }

    /** Impact in terms of percentage of total activity */
    @com.fasterxml.jackson.annotation.JsonProperty("impactPercent")
    private final Double impactPercent;

    /**
     * Impact in terms of percentage of total activity
     *
     * @return the value
     */
    public Double getImpactPercent() {
        return impactPercent;
    }

    /** Impact in terms of average active sessions */
    @com.fasterxml.jackson.annotation.JsonProperty("impactAvgActiveSessions")
    private final Double impactAvgActiveSessions;

    /**
     * Impact in terms of average active sessions
     *
     * @return the value
     */
    public Double getImpactAvgActiveSessions() {
        return impactAvgActiveSessions;
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
        sb.append("AddmDbFindingsTimeSeriesSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", taskId=").append(String.valueOf(this.taskId));
        sb.append(", taskName=").append(String.valueOf(this.taskName));
        sb.append(", findingId=").append(String.valueOf(this.findingId));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", timeAnalysisStarted=").append(String.valueOf(this.timeAnalysisStarted));
        sb.append(", timeAnalysisEnded=").append(String.valueOf(this.timeAnalysisEnded));
        sb.append(", categoryName=").append(String.valueOf(this.categoryName));
        sb.append(", categoryDisplayName=").append(String.valueOf(this.categoryDisplayName));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", analysisDbTimeInSecs=").append(String.valueOf(this.analysisDbTimeInSecs));
        sb.append(", analysisAvgActiveSessions=")
                .append(String.valueOf(this.analysisAvgActiveSessions));
        sb.append(", impactDbTimeInSecs=").append(String.valueOf(this.impactDbTimeInSecs));
        sb.append(", impactPercent=").append(String.valueOf(this.impactPercent));
        sb.append(", impactAvgActiveSessions=")
                .append(String.valueOf(this.impactAvgActiveSessions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddmDbFindingsTimeSeriesSummary)) {
            return false;
        }

        AddmDbFindingsTimeSeriesSummary other = (AddmDbFindingsTimeSeriesSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.taskId, other.taskId)
                && java.util.Objects.equals(this.taskName, other.taskName)
                && java.util.Objects.equals(this.findingId, other.findingId)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.timeAnalysisStarted, other.timeAnalysisStarted)
                && java.util.Objects.equals(this.timeAnalysisEnded, other.timeAnalysisEnded)
                && java.util.Objects.equals(this.categoryName, other.categoryName)
                && java.util.Objects.equals(this.categoryDisplayName, other.categoryDisplayName)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.analysisDbTimeInSecs, other.analysisDbTimeInSecs)
                && java.util.Objects.equals(
                        this.analysisAvgActiveSessions, other.analysisAvgActiveSessions)
                && java.util.Objects.equals(this.impactDbTimeInSecs, other.impactDbTimeInSecs)
                && java.util.Objects.equals(this.impactPercent, other.impactPercent)
                && java.util.Objects.equals(
                        this.impactAvgActiveSessions, other.impactAvgActiveSessions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.taskId == null ? 43 : this.taskId.hashCode());
        result = (result * PRIME) + (this.taskName == null ? 43 : this.taskName.hashCode());
        result = (result * PRIME) + (this.findingId == null ? 43 : this.findingId.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result =
                (result * PRIME)
                        + (this.timeAnalysisStarted == null
                                ? 43
                                : this.timeAnalysisStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeAnalysisEnded == null ? 43 : this.timeAnalysisEnded.hashCode());
        result = (result * PRIME) + (this.categoryName == null ? 43 : this.categoryName.hashCode());
        result =
                (result * PRIME)
                        + (this.categoryDisplayName == null
                                ? 43
                                : this.categoryDisplayName.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result =
                (result * PRIME)
                        + (this.analysisDbTimeInSecs == null
                                ? 43
                                : this.analysisDbTimeInSecs.hashCode());
        result =
                (result * PRIME)
                        + (this.analysisAvgActiveSessions == null
                                ? 43
                                : this.analysisAvgActiveSessions.hashCode());
        result =
                (result * PRIME)
                        + (this.impactDbTimeInSecs == null
                                ? 43
                                : this.impactDbTimeInSecs.hashCode());
        result =
                (result * PRIME)
                        + (this.impactPercent == null ? 43 : this.impactPercent.hashCode());
        result =
                (result * PRIME)
                        + (this.impactAvgActiveSessions == null
                                ? 43
                                : this.impactAvgActiveSessions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
