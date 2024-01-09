/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * This is the information about overlapping recall requests <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OverlappingRecallSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OverlappingRecallSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeDataStarted",
        "timeDataEnded",
        "timeStarted",
        "status",
        "purpose",
        "queryString",
        "logSets",
        "createdBy"
    })
    public OverlappingRecallSummary(
            java.util.Date timeDataStarted,
            java.util.Date timeDataEnded,
            java.util.Date timeStarted,
            RecallStatus status,
            String purpose,
            String queryString,
            String logSets,
            String createdBy) {
        super();
        this.timeDataStarted = timeDataStarted;
        this.timeDataEnded = timeDataEnded;
        this.timeStarted = timeStarted;
        this.status = status;
        this.purpose = purpose;
        this.queryString = queryString;
        this.logSets = logSets;
        this.createdBy = createdBy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** This is the start of the time range of the archival data */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDataStarted")
        private java.util.Date timeDataStarted;

        /**
         * This is the start of the time range of the archival data
         *
         * @param timeDataStarted the value to set
         * @return this builder
         */
        public Builder timeDataStarted(java.util.Date timeDataStarted) {
            this.timeDataStarted = timeDataStarted;
            this.__explicitlySet__.add("timeDataStarted");
            return this;
        }
        /** This is the end of the time range of the archival data */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDataEnded")
        private java.util.Date timeDataEnded;

        /**
         * This is the end of the time range of the archival data
         *
         * @param timeDataEnded the value to set
         * @return this builder
         */
        public Builder timeDataEnded(java.util.Date timeDataEnded) {
            this.timeDataEnded = timeDataEnded;
            this.__explicitlySet__.add("timeDataEnded");
            return this;
        }
        /** This is the time when the recall operation was started for this recall request */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * This is the time when the recall operation was started for this recall request
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /** This is the status of the recall */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private RecallStatus status;

        /**
         * This is the status of the recall
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(RecallStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** This is the purpose of the recall */
        @com.fasterxml.jackson.annotation.JsonProperty("purpose")
        private String purpose;

        /**
         * This is the purpose of the recall
         *
         * @param purpose the value to set
         * @return this builder
         */
        public Builder purpose(String purpose) {
            this.purpose = purpose;
            this.__explicitlySet__.add("purpose");
            return this;
        }
        /** This is the query associated with the recall */
        @com.fasterxml.jackson.annotation.JsonProperty("queryString")
        private String queryString;

        /**
         * This is the query associated with the recall
         *
         * @param queryString the value to set
         * @return this builder
         */
        public Builder queryString(String queryString) {
            this.queryString = queryString;
            this.__explicitlySet__.add("queryString");
            return this;
        }
        /** This is the list of logsets associated with this recall */
        @com.fasterxml.jackson.annotation.JsonProperty("logSets")
        private String logSets;

        /**
         * This is the list of logsets associated with this recall
         *
         * @param logSets the value to set
         * @return this builder
         */
        public Builder logSets(String logSets) {
            this.logSets = logSets;
            this.__explicitlySet__.add("logSets");
            return this;
        }
        /** This is the user who initiated the recall request */
        @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
        private String createdBy;

        /**
         * This is the user who initiated the recall request
         *
         * @param createdBy the value to set
         * @return this builder
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            this.__explicitlySet__.add("createdBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OverlappingRecallSummary build() {
            OverlappingRecallSummary model =
                    new OverlappingRecallSummary(
                            this.timeDataStarted,
                            this.timeDataEnded,
                            this.timeStarted,
                            this.status,
                            this.purpose,
                            this.queryString,
                            this.logSets,
                            this.createdBy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OverlappingRecallSummary model) {
            if (model.wasPropertyExplicitlySet("timeDataStarted")) {
                this.timeDataStarted(model.getTimeDataStarted());
            }
            if (model.wasPropertyExplicitlySet("timeDataEnded")) {
                this.timeDataEnded(model.getTimeDataEnded());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("purpose")) {
                this.purpose(model.getPurpose());
            }
            if (model.wasPropertyExplicitlySet("queryString")) {
                this.queryString(model.getQueryString());
            }
            if (model.wasPropertyExplicitlySet("logSets")) {
                this.logSets(model.getLogSets());
            }
            if (model.wasPropertyExplicitlySet("createdBy")) {
                this.createdBy(model.getCreatedBy());
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

    /** This is the start of the time range of the archival data */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataStarted")
    private final java.util.Date timeDataStarted;

    /**
     * This is the start of the time range of the archival data
     *
     * @return the value
     */
    public java.util.Date getTimeDataStarted() {
        return timeDataStarted;
    }

    /** This is the end of the time range of the archival data */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataEnded")
    private final java.util.Date timeDataEnded;

    /**
     * This is the end of the time range of the archival data
     *
     * @return the value
     */
    public java.util.Date getTimeDataEnded() {
        return timeDataEnded;
    }

    /** This is the time when the recall operation was started for this recall request */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * This is the time when the recall operation was started for this recall request
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** This is the status of the recall */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final RecallStatus status;

    /**
     * This is the status of the recall
     *
     * @return the value
     */
    public RecallStatus getStatus() {
        return status;
    }

    /** This is the purpose of the recall */
    @com.fasterxml.jackson.annotation.JsonProperty("purpose")
    private final String purpose;

    /**
     * This is the purpose of the recall
     *
     * @return the value
     */
    public String getPurpose() {
        return purpose;
    }

    /** This is the query associated with the recall */
    @com.fasterxml.jackson.annotation.JsonProperty("queryString")
    private final String queryString;

    /**
     * This is the query associated with the recall
     *
     * @return the value
     */
    public String getQueryString() {
        return queryString;
    }

    /** This is the list of logsets associated with this recall */
    @com.fasterxml.jackson.annotation.JsonProperty("logSets")
    private final String logSets;

    /**
     * This is the list of logsets associated with this recall
     *
     * @return the value
     */
    public String getLogSets() {
        return logSets;
    }

    /** This is the user who initiated the recall request */
    @com.fasterxml.jackson.annotation.JsonProperty("createdBy")
    private final String createdBy;

    /**
     * This is the user who initiated the recall request
     *
     * @return the value
     */
    public String getCreatedBy() {
        return createdBy;
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
        sb.append("OverlappingRecallSummary(");
        sb.append("super=").append(super.toString());
        sb.append("timeDataStarted=").append(String.valueOf(this.timeDataStarted));
        sb.append(", timeDataEnded=").append(String.valueOf(this.timeDataEnded));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", purpose=").append(String.valueOf(this.purpose));
        sb.append(", queryString=").append(String.valueOf(this.queryString));
        sb.append(", logSets=").append(String.valueOf(this.logSets));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OverlappingRecallSummary)) {
            return false;
        }

        OverlappingRecallSummary other = (OverlappingRecallSummary) o;
        return java.util.Objects.equals(this.timeDataStarted, other.timeDataStarted)
                && java.util.Objects.equals(this.timeDataEnded, other.timeDataEnded)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.purpose, other.purpose)
                && java.util.Objects.equals(this.queryString, other.queryString)
                && java.util.Objects.equals(this.logSets, other.logSets)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeDataStarted == null ? 43 : this.timeDataStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDataEnded == null ? 43 : this.timeDataEnded.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.purpose == null ? 43 : this.purpose.hashCode());
        result = (result * PRIME) + (this.queryString == null ? 43 : this.queryString.hashCode());
        result = (result * PRIME) + (this.logSets == null ? 43 : this.logSets.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
