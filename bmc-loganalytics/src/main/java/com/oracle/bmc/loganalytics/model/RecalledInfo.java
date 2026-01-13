/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * This is the information about data recalled <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RecalledInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RecalledInfo extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "status",
        "purpose",
        "queryString",
        "logSets",
        "collectionId",
        "timeRecalledDataStarted",
        "timeRecalledDataEnded"
    })
    public RecalledInfo(
            RecallStatus status,
            String purpose,
            String queryString,
            String logSets,
            Long collectionId,
            java.util.Date timeRecalledDataStarted,
            java.util.Date timeRecalledDataEnded) {
        super();
        this.status = status;
        this.purpose = purpose;
        this.queryString = queryString;
        this.logSets = logSets;
        this.collectionId = collectionId;
        this.timeRecalledDataStarted = timeRecalledDataStarted;
        this.timeRecalledDataEnded = timeRecalledDataEnded;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
        /** This is the list of logsets associated with the recall */
        @com.fasterxml.jackson.annotation.JsonProperty("logSets")
        private String logSets;

        /**
         * This is the list of logsets associated with the recall
         *
         * @param logSets the value to set
         * @return this builder
         */
        public Builder logSets(String logSets) {
            this.logSets = logSets;
            this.__explicitlySet__.add("logSets");
            return this;
        }
        /** This is the id for the recalled data collection */
        @com.fasterxml.jackson.annotation.JsonProperty("collectionId")
        private Long collectionId;

        /**
         * This is the id for the recalled data collection
         *
         * @param collectionId the value to set
         * @return this builder
         */
        public Builder collectionId(Long collectionId) {
            this.collectionId = collectionId;
            this.__explicitlySet__.add("collectionId");
            return this;
        }
        /** This is the recalled date start time */
        @com.fasterxml.jackson.annotation.JsonProperty("timeRecalledDataStarted")
        private java.util.Date timeRecalledDataStarted;

        /**
         * This is the recalled date start time
         *
         * @param timeRecalledDataStarted the value to set
         * @return this builder
         */
        public Builder timeRecalledDataStarted(java.util.Date timeRecalledDataStarted) {
            this.timeRecalledDataStarted = timeRecalledDataStarted;
            this.__explicitlySet__.add("timeRecalledDataStarted");
            return this;
        }
        /** This is the recalled data end time */
        @com.fasterxml.jackson.annotation.JsonProperty("timeRecalledDataEnded")
        private java.util.Date timeRecalledDataEnded;

        /**
         * This is the recalled data end time
         *
         * @param timeRecalledDataEnded the value to set
         * @return this builder
         */
        public Builder timeRecalledDataEnded(java.util.Date timeRecalledDataEnded) {
            this.timeRecalledDataEnded = timeRecalledDataEnded;
            this.__explicitlySet__.add("timeRecalledDataEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecalledInfo build() {
            RecalledInfo model =
                    new RecalledInfo(
                            this.status,
                            this.purpose,
                            this.queryString,
                            this.logSets,
                            this.collectionId,
                            this.timeRecalledDataStarted,
                            this.timeRecalledDataEnded);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecalledInfo model) {
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
            if (model.wasPropertyExplicitlySet("collectionId")) {
                this.collectionId(model.getCollectionId());
            }
            if (model.wasPropertyExplicitlySet("timeRecalledDataStarted")) {
                this.timeRecalledDataStarted(model.getTimeRecalledDataStarted());
            }
            if (model.wasPropertyExplicitlySet("timeRecalledDataEnded")) {
                this.timeRecalledDataEnded(model.getTimeRecalledDataEnded());
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

    /** This is the list of logsets associated with the recall */
    @com.fasterxml.jackson.annotation.JsonProperty("logSets")
    private final String logSets;

    /**
     * This is the list of logsets associated with the recall
     *
     * @return the value
     */
    public String getLogSets() {
        return logSets;
    }

    /** This is the id for the recalled data collection */
    @com.fasterxml.jackson.annotation.JsonProperty("collectionId")
    private final Long collectionId;

    /**
     * This is the id for the recalled data collection
     *
     * @return the value
     */
    public Long getCollectionId() {
        return collectionId;
    }

    /** This is the recalled date start time */
    @com.fasterxml.jackson.annotation.JsonProperty("timeRecalledDataStarted")
    private final java.util.Date timeRecalledDataStarted;

    /**
     * This is the recalled date start time
     *
     * @return the value
     */
    public java.util.Date getTimeRecalledDataStarted() {
        return timeRecalledDataStarted;
    }

    /** This is the recalled data end time */
    @com.fasterxml.jackson.annotation.JsonProperty("timeRecalledDataEnded")
    private final java.util.Date timeRecalledDataEnded;

    /**
     * This is the recalled data end time
     *
     * @return the value
     */
    public java.util.Date getTimeRecalledDataEnded() {
        return timeRecalledDataEnded;
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
        sb.append("RecalledInfo(");
        sb.append("super=").append(super.toString());
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", purpose=").append(String.valueOf(this.purpose));
        sb.append(", queryString=").append(String.valueOf(this.queryString));
        sb.append(", logSets=").append(String.valueOf(this.logSets));
        sb.append(", collectionId=").append(String.valueOf(this.collectionId));
        sb.append(", timeRecalledDataStarted=")
                .append(String.valueOf(this.timeRecalledDataStarted));
        sb.append(", timeRecalledDataEnded=").append(String.valueOf(this.timeRecalledDataEnded));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecalledInfo)) {
            return false;
        }

        RecalledInfo other = (RecalledInfo) o;
        return java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.purpose, other.purpose)
                && java.util.Objects.equals(this.queryString, other.queryString)
                && java.util.Objects.equals(this.logSets, other.logSets)
                && java.util.Objects.equals(this.collectionId, other.collectionId)
                && java.util.Objects.equals(
                        this.timeRecalledDataStarted, other.timeRecalledDataStarted)
                && java.util.Objects.equals(this.timeRecalledDataEnded, other.timeRecalledDataEnded)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.purpose == null ? 43 : this.purpose.hashCode());
        result = (result * PRIME) + (this.queryString == null ? 43 : this.queryString.hashCode());
        result = (result * PRIME) + (this.logSets == null ? 43 : this.logSets.hashCode());
        result = (result * PRIME) + (this.collectionId == null ? 43 : this.collectionId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRecalledDataStarted == null
                                ? 43
                                : this.timeRecalledDataStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRecalledDataEnded == null
                                ? 43
                                : this.timeRecalledDataEnded.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
