/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * ADDM recommendation <br>
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
        builder = AddmDbRecommendationsTimeSeriesSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AddmDbRecommendationsTimeSeriesSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "taskId",
        "taskName",
        "timestamp",
        "timeAnalysisStarted",
        "timeAnalysisEnded",
        "type",
        "analysisDbTimeInSecs",
        "analysisAvgActiveSessions",
        "maxBenefitPercent",
        "maxBenefitDbTimeInSecs",
        "maxBenefitAvgActiveSessions",
        "relatedObject"
    })
    public AddmDbRecommendationsTimeSeriesSummary(
            String id,
            Integer taskId,
            String taskName,
            java.util.Date timestamp,
            java.util.Date timeAnalysisStarted,
            java.util.Date timeAnalysisEnded,
            String type,
            Double analysisDbTimeInSecs,
            Double analysisAvgActiveSessions,
            Double maxBenefitPercent,
            Double maxBenefitDbTimeInSecs,
            Double maxBenefitAvgActiveSessions,
            RelatedObjectTypeDetails relatedObject) {
        super();
        this.id = id;
        this.taskId = taskId;
        this.taskName = taskName;
        this.timestamp = timestamp;
        this.timeAnalysisStarted = timeAnalysisStarted;
        this.timeAnalysisEnded = timeAnalysisEnded;
        this.type = type;
        this.analysisDbTimeInSecs = analysisDbTimeInSecs;
        this.analysisAvgActiveSessions = analysisAvgActiveSessions;
        this.maxBenefitPercent = maxBenefitPercent;
        this.maxBenefitDbTimeInSecs = maxBenefitDbTimeInSecs;
        this.maxBenefitAvgActiveSessions = maxBenefitAvgActiveSessions;
        this.relatedObject = relatedObject;
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
        /** Timestamp when recommendation was generated */
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * Timestamp when recommendation was generated
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
        /** Type of recommendation */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Type of recommendation
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
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
        /** Maximum estimated benefit in terms of percentage of total activity */
        @com.fasterxml.jackson.annotation.JsonProperty("maxBenefitPercent")
        private Double maxBenefitPercent;

        /**
         * Maximum estimated benefit in terms of percentage of total activity
         *
         * @param maxBenefitPercent the value to set
         * @return this builder
         */
        public Builder maxBenefitPercent(Double maxBenefitPercent) {
            this.maxBenefitPercent = maxBenefitPercent;
            this.__explicitlySet__.add("maxBenefitPercent");
            return this;
        }
        /** Maximum estimated benefit in terms of seconds */
        @com.fasterxml.jackson.annotation.JsonProperty("maxBenefitDbTimeInSecs")
        private Double maxBenefitDbTimeInSecs;

        /**
         * Maximum estimated benefit in terms of seconds
         *
         * @param maxBenefitDbTimeInSecs the value to set
         * @return this builder
         */
        public Builder maxBenefitDbTimeInSecs(Double maxBenefitDbTimeInSecs) {
            this.maxBenefitDbTimeInSecs = maxBenefitDbTimeInSecs;
            this.__explicitlySet__.add("maxBenefitDbTimeInSecs");
            return this;
        }
        /** Maximum estimated benefit in terms of average active sessions */
        @com.fasterxml.jackson.annotation.JsonProperty("maxBenefitAvgActiveSessions")
        private Double maxBenefitAvgActiveSessions;

        /**
         * Maximum estimated benefit in terms of average active sessions
         *
         * @param maxBenefitAvgActiveSessions the value to set
         * @return this builder
         */
        public Builder maxBenefitAvgActiveSessions(Double maxBenefitAvgActiveSessions) {
            this.maxBenefitAvgActiveSessions = maxBenefitAvgActiveSessions;
            this.__explicitlySet__.add("maxBenefitAvgActiveSessions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("relatedObject")
        private RelatedObjectTypeDetails relatedObject;

        public Builder relatedObject(RelatedObjectTypeDetails relatedObject) {
            this.relatedObject = relatedObject;
            this.__explicitlySet__.add("relatedObject");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddmDbRecommendationsTimeSeriesSummary build() {
            AddmDbRecommendationsTimeSeriesSummary model =
                    new AddmDbRecommendationsTimeSeriesSummary(
                            this.id,
                            this.taskId,
                            this.taskName,
                            this.timestamp,
                            this.timeAnalysisStarted,
                            this.timeAnalysisEnded,
                            this.type,
                            this.analysisDbTimeInSecs,
                            this.analysisAvgActiveSessions,
                            this.maxBenefitPercent,
                            this.maxBenefitDbTimeInSecs,
                            this.maxBenefitAvgActiveSessions,
                            this.relatedObject);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddmDbRecommendationsTimeSeriesSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("taskId")) {
                this.taskId(model.getTaskId());
            }
            if (model.wasPropertyExplicitlySet("taskName")) {
                this.taskName(model.getTaskName());
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
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("analysisDbTimeInSecs")) {
                this.analysisDbTimeInSecs(model.getAnalysisDbTimeInSecs());
            }
            if (model.wasPropertyExplicitlySet("analysisAvgActiveSessions")) {
                this.analysisAvgActiveSessions(model.getAnalysisAvgActiveSessions());
            }
            if (model.wasPropertyExplicitlySet("maxBenefitPercent")) {
                this.maxBenefitPercent(model.getMaxBenefitPercent());
            }
            if (model.wasPropertyExplicitlySet("maxBenefitDbTimeInSecs")) {
                this.maxBenefitDbTimeInSecs(model.getMaxBenefitDbTimeInSecs());
            }
            if (model.wasPropertyExplicitlySet("maxBenefitAvgActiveSessions")) {
                this.maxBenefitAvgActiveSessions(model.getMaxBenefitAvgActiveSessions());
            }
            if (model.wasPropertyExplicitlySet("relatedObject")) {
                this.relatedObject(model.getRelatedObject());
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

    /** Timestamp when recommendation was generated */
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * Timestamp when recommendation was generated
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

    /** Type of recommendation */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Type of recommendation
     *
     * @return the value
     */
    public String getType() {
        return type;
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

    /** Maximum estimated benefit in terms of percentage of total activity */
    @com.fasterxml.jackson.annotation.JsonProperty("maxBenefitPercent")
    private final Double maxBenefitPercent;

    /**
     * Maximum estimated benefit in terms of percentage of total activity
     *
     * @return the value
     */
    public Double getMaxBenefitPercent() {
        return maxBenefitPercent;
    }

    /** Maximum estimated benefit in terms of seconds */
    @com.fasterxml.jackson.annotation.JsonProperty("maxBenefitDbTimeInSecs")
    private final Double maxBenefitDbTimeInSecs;

    /**
     * Maximum estimated benefit in terms of seconds
     *
     * @return the value
     */
    public Double getMaxBenefitDbTimeInSecs() {
        return maxBenefitDbTimeInSecs;
    }

    /** Maximum estimated benefit in terms of average active sessions */
    @com.fasterxml.jackson.annotation.JsonProperty("maxBenefitAvgActiveSessions")
    private final Double maxBenefitAvgActiveSessions;

    /**
     * Maximum estimated benefit in terms of average active sessions
     *
     * @return the value
     */
    public Double getMaxBenefitAvgActiveSessions() {
        return maxBenefitAvgActiveSessions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("relatedObject")
    private final RelatedObjectTypeDetails relatedObject;

    public RelatedObjectTypeDetails getRelatedObject() {
        return relatedObject;
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
        sb.append("AddmDbRecommendationsTimeSeriesSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", taskId=").append(String.valueOf(this.taskId));
        sb.append(", taskName=").append(String.valueOf(this.taskName));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", timeAnalysisStarted=").append(String.valueOf(this.timeAnalysisStarted));
        sb.append(", timeAnalysisEnded=").append(String.valueOf(this.timeAnalysisEnded));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", analysisDbTimeInSecs=").append(String.valueOf(this.analysisDbTimeInSecs));
        sb.append(", analysisAvgActiveSessions=")
                .append(String.valueOf(this.analysisAvgActiveSessions));
        sb.append(", maxBenefitPercent=").append(String.valueOf(this.maxBenefitPercent));
        sb.append(", maxBenefitDbTimeInSecs=").append(String.valueOf(this.maxBenefitDbTimeInSecs));
        sb.append(", maxBenefitAvgActiveSessions=")
                .append(String.valueOf(this.maxBenefitAvgActiveSessions));
        sb.append(", relatedObject=").append(String.valueOf(this.relatedObject));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddmDbRecommendationsTimeSeriesSummary)) {
            return false;
        }

        AddmDbRecommendationsTimeSeriesSummary other = (AddmDbRecommendationsTimeSeriesSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.taskId, other.taskId)
                && java.util.Objects.equals(this.taskName, other.taskName)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.timeAnalysisStarted, other.timeAnalysisStarted)
                && java.util.Objects.equals(this.timeAnalysisEnded, other.timeAnalysisEnded)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.analysisDbTimeInSecs, other.analysisDbTimeInSecs)
                && java.util.Objects.equals(
                        this.analysisAvgActiveSessions, other.analysisAvgActiveSessions)
                && java.util.Objects.equals(this.maxBenefitPercent, other.maxBenefitPercent)
                && java.util.Objects.equals(
                        this.maxBenefitDbTimeInSecs, other.maxBenefitDbTimeInSecs)
                && java.util.Objects.equals(
                        this.maxBenefitAvgActiveSessions, other.maxBenefitAvgActiveSessions)
                && java.util.Objects.equals(this.relatedObject, other.relatedObject)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.taskId == null ? 43 : this.taskId.hashCode());
        result = (result * PRIME) + (this.taskName == null ? 43 : this.taskName.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result =
                (result * PRIME)
                        + (this.timeAnalysisStarted == null
                                ? 43
                                : this.timeAnalysisStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeAnalysisEnded == null ? 43 : this.timeAnalysisEnded.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
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
                        + (this.maxBenefitPercent == null ? 43 : this.maxBenefitPercent.hashCode());
        result =
                (result * PRIME)
                        + (this.maxBenefitDbTimeInSecs == null
                                ? 43
                                : this.maxBenefitDbTimeInSecs.hashCode());
        result =
                (result * PRIME)
                        + (this.maxBenefitAvgActiveSessions == null
                                ? 43
                                : this.maxBenefitAvgActiveSessions.hashCode());
        result =
                (result * PRIME)
                        + (this.relatedObject == null ? 43 : this.relatedObject.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
