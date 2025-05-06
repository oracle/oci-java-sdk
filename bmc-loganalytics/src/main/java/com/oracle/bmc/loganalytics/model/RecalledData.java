/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * This is the information about recalled data <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RecalledData.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RecalledData extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeDataEnded",
        "timeDataStarted",
        "timeStarted",
        "status",
        "recallCount",
        "storageUsageInBytes",
        "notRecalledDataInBytes",
        "purpose",
        "queryString",
        "logSets",
        "createdBy",
        "collectionId",
        "timeRecalledDataStarted",
        "timeRecalledDataEnded",
        "percentageComplete"
    })
    public RecalledData(
            java.util.Date timeDataEnded,
            java.util.Date timeDataStarted,
            java.util.Date timeStarted,
            Status status,
            Integer recallCount,
            Long storageUsageInBytes,
            Long notRecalledDataInBytes,
            String purpose,
            String queryString,
            String logSets,
            String createdBy,
            Long collectionId,
            java.util.Date timeRecalledDataStarted,
            java.util.Date timeRecalledDataEnded,
            Integer percentageComplete) {
        super();
        this.timeDataEnded = timeDataEnded;
        this.timeDataStarted = timeDataStarted;
        this.timeStarted = timeStarted;
        this.status = status;
        this.recallCount = recallCount;
        this.storageUsageInBytes = storageUsageInBytes;
        this.notRecalledDataInBytes = notRecalledDataInBytes;
        this.purpose = purpose;
        this.queryString = queryString;
        this.logSets = logSets;
        this.createdBy = createdBy;
        this.collectionId = collectionId;
        this.timeRecalledDataStarted = timeRecalledDataStarted;
        this.timeRecalledDataEnded = timeRecalledDataEnded;
        this.percentageComplete = percentageComplete;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** This is the end of the time range of the related data */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDataEnded")
        private java.util.Date timeDataEnded;

        /**
         * This is the end of the time range of the related data
         *
         * @param timeDataEnded the value to set
         * @return this builder
         */
        public Builder timeDataEnded(java.util.Date timeDataEnded) {
            this.timeDataEnded = timeDataEnded;
            this.__explicitlySet__.add("timeDataEnded");
            return this;
        }
        /** This is the start of the time range of the related data */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDataStarted")
        private java.util.Date timeDataStarted;

        /**
         * This is the start of the time range of the related data
         *
         * @param timeDataStarted the value to set
         * @return this builder
         */
        public Builder timeDataStarted(java.util.Date timeDataStarted) {
            this.timeDataStarted = timeDataStarted;
            this.__explicitlySet__.add("timeDataStarted");
            return this;
        }
        /** This is the time when the first recall operation was started for this RecalledData */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * This is the time when the first recall operation was started for this RecalledData
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
        private Status status;

        /**
         * This is the status of the recall
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * This is the number of recall operations for this recall. Note one RecalledData can be
         * merged from the results of several recall operations if the time duration of the results
         * of the recall operations overlap.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("recallCount")
        private Integer recallCount;

        /**
         * This is the number of recall operations for this recall. Note one RecalledData can be
         * merged from the results of several recall operations if the time duration of the results
         * of the recall operations overlap.
         *
         * @param recallCount the value to set
         * @return this builder
         */
        public Builder recallCount(Integer recallCount) {
            this.recallCount = recallCount;
            this.__explicitlySet__.add("recallCount");
            return this;
        }
        /** This is the size in bytes */
        @com.fasterxml.jackson.annotation.JsonProperty("storageUsageInBytes")
        private Long storageUsageInBytes;

        /**
         * This is the size in bytes
         *
         * @param storageUsageInBytes the value to set
         * @return this builder
         */
        public Builder storageUsageInBytes(Long storageUsageInBytes) {
            this.storageUsageInBytes = storageUsageInBytes;
            this.__explicitlySet__.add("storageUsageInBytes");
            return this;
        }
        /**
         * This is the size of the archival data not recalled yet within the specified time range
         */
        @com.fasterxml.jackson.annotation.JsonProperty("notRecalledDataInBytes")
        private Long notRecalledDataInBytes;

        /**
         * This is the size of the archival data not recalled yet within the specified time range
         *
         * @param notRecalledDataInBytes the value to set
         * @return this builder
         */
        public Builder notRecalledDataInBytes(Long notRecalledDataInBytes) {
            this.notRecalledDataInBytes = notRecalledDataInBytes;
            this.__explicitlySet__.add("notRecalledDataInBytes");
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
        /** This is the current progress percentage for the recalled data */
        @com.fasterxml.jackson.annotation.JsonProperty("percentageComplete")
        private Integer percentageComplete;

        /**
         * This is the current progress percentage for the recalled data
         *
         * @param percentageComplete the value to set
         * @return this builder
         */
        public Builder percentageComplete(Integer percentageComplete) {
            this.percentageComplete = percentageComplete;
            this.__explicitlySet__.add("percentageComplete");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecalledData build() {
            RecalledData model =
                    new RecalledData(
                            this.timeDataEnded,
                            this.timeDataStarted,
                            this.timeStarted,
                            this.status,
                            this.recallCount,
                            this.storageUsageInBytes,
                            this.notRecalledDataInBytes,
                            this.purpose,
                            this.queryString,
                            this.logSets,
                            this.createdBy,
                            this.collectionId,
                            this.timeRecalledDataStarted,
                            this.timeRecalledDataEnded,
                            this.percentageComplete);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecalledData model) {
            if (model.wasPropertyExplicitlySet("timeDataEnded")) {
                this.timeDataEnded(model.getTimeDataEnded());
            }
            if (model.wasPropertyExplicitlySet("timeDataStarted")) {
                this.timeDataStarted(model.getTimeDataStarted());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("recallCount")) {
                this.recallCount(model.getRecallCount());
            }
            if (model.wasPropertyExplicitlySet("storageUsageInBytes")) {
                this.storageUsageInBytes(model.getStorageUsageInBytes());
            }
            if (model.wasPropertyExplicitlySet("notRecalledDataInBytes")) {
                this.notRecalledDataInBytes(model.getNotRecalledDataInBytes());
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
            if (model.wasPropertyExplicitlySet("collectionId")) {
                this.collectionId(model.getCollectionId());
            }
            if (model.wasPropertyExplicitlySet("timeRecalledDataStarted")) {
                this.timeRecalledDataStarted(model.getTimeRecalledDataStarted());
            }
            if (model.wasPropertyExplicitlySet("timeRecalledDataEnded")) {
                this.timeRecalledDataEnded(model.getTimeRecalledDataEnded());
            }
            if (model.wasPropertyExplicitlySet("percentageComplete")) {
                this.percentageComplete(model.getPercentageComplete());
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

    /** This is the end of the time range of the related data */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataEnded")
    private final java.util.Date timeDataEnded;

    /**
     * This is the end of the time range of the related data
     *
     * @return the value
     */
    public java.util.Date getTimeDataEnded() {
        return timeDataEnded;
    }

    /** This is the start of the time range of the related data */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataStarted")
    private final java.util.Date timeDataStarted;

    /**
     * This is the start of the time range of the related data
     *
     * @return the value
     */
    public java.util.Date getTimeDataStarted() {
        return timeDataStarted;
    }

    /** This is the time when the first recall operation was started for this RecalledData */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * This is the time when the first recall operation was started for this RecalledData
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /** This is the status of the recall */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Recalled("RECALLED"),
        Pending("PENDING"),
        Failed("FAILED"),
        PartialRecalled("PARTIAL_RECALLED"),

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
    /** This is the status of the recall */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * This is the status of the recall
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /**
     * This is the number of recall operations for this recall. Note one RecalledData can be merged
     * from the results of several recall operations if the time duration of the results of the
     * recall operations overlap.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recallCount")
    private final Integer recallCount;

    /**
     * This is the number of recall operations for this recall. Note one RecalledData can be merged
     * from the results of several recall operations if the time duration of the results of the
     * recall operations overlap.
     *
     * @return the value
     */
    public Integer getRecallCount() {
        return recallCount;
    }

    /** This is the size in bytes */
    @com.fasterxml.jackson.annotation.JsonProperty("storageUsageInBytes")
    private final Long storageUsageInBytes;

    /**
     * This is the size in bytes
     *
     * @return the value
     */
    public Long getStorageUsageInBytes() {
        return storageUsageInBytes;
    }

    /** This is the size of the archival data not recalled yet within the specified time range */
    @com.fasterxml.jackson.annotation.JsonProperty("notRecalledDataInBytes")
    private final Long notRecalledDataInBytes;

    /**
     * This is the size of the archival data not recalled yet within the specified time range
     *
     * @return the value
     */
    public Long getNotRecalledDataInBytes() {
        return notRecalledDataInBytes;
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

    /** This is the current progress percentage for the recalled data */
    @com.fasterxml.jackson.annotation.JsonProperty("percentageComplete")
    private final Integer percentageComplete;

    /**
     * This is the current progress percentage for the recalled data
     *
     * @return the value
     */
    public Integer getPercentageComplete() {
        return percentageComplete;
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
        sb.append("RecalledData(");
        sb.append("super=").append(super.toString());
        sb.append("timeDataEnded=").append(String.valueOf(this.timeDataEnded));
        sb.append(", timeDataStarted=").append(String.valueOf(this.timeDataStarted));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", recallCount=").append(String.valueOf(this.recallCount));
        sb.append(", storageUsageInBytes=").append(String.valueOf(this.storageUsageInBytes));
        sb.append(", notRecalledDataInBytes=").append(String.valueOf(this.notRecalledDataInBytes));
        sb.append(", purpose=").append(String.valueOf(this.purpose));
        sb.append(", queryString=").append(String.valueOf(this.queryString));
        sb.append(", logSets=").append(String.valueOf(this.logSets));
        sb.append(", createdBy=").append(String.valueOf(this.createdBy));
        sb.append(", collectionId=").append(String.valueOf(this.collectionId));
        sb.append(", timeRecalledDataStarted=")
                .append(String.valueOf(this.timeRecalledDataStarted));
        sb.append(", timeRecalledDataEnded=").append(String.valueOf(this.timeRecalledDataEnded));
        sb.append(", percentageComplete=").append(String.valueOf(this.percentageComplete));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecalledData)) {
            return false;
        }

        RecalledData other = (RecalledData) o;
        return java.util.Objects.equals(this.timeDataEnded, other.timeDataEnded)
                && java.util.Objects.equals(this.timeDataStarted, other.timeDataStarted)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.recallCount, other.recallCount)
                && java.util.Objects.equals(this.storageUsageInBytes, other.storageUsageInBytes)
                && java.util.Objects.equals(
                        this.notRecalledDataInBytes, other.notRecalledDataInBytes)
                && java.util.Objects.equals(this.purpose, other.purpose)
                && java.util.Objects.equals(this.queryString, other.queryString)
                && java.util.Objects.equals(this.logSets, other.logSets)
                && java.util.Objects.equals(this.createdBy, other.createdBy)
                && java.util.Objects.equals(this.collectionId, other.collectionId)
                && java.util.Objects.equals(
                        this.timeRecalledDataStarted, other.timeRecalledDataStarted)
                && java.util.Objects.equals(this.timeRecalledDataEnded, other.timeRecalledDataEnded)
                && java.util.Objects.equals(this.percentageComplete, other.percentageComplete)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeDataEnded == null ? 43 : this.timeDataEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDataStarted == null ? 43 : this.timeDataStarted.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.recallCount == null ? 43 : this.recallCount.hashCode());
        result =
                (result * PRIME)
                        + (this.storageUsageInBytes == null
                                ? 43
                                : this.storageUsageInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.notRecalledDataInBytes == null
                                ? 43
                                : this.notRecalledDataInBytes.hashCode());
        result = (result * PRIME) + (this.purpose == null ? 43 : this.purpose.hashCode());
        result = (result * PRIME) + (this.queryString == null ? 43 : this.queryString.hashCode());
        result = (result * PRIME) + (this.logSets == null ? 43 : this.logSets.hashCode());
        result = (result * PRIME) + (this.createdBy == null ? 43 : this.createdBy.hashCode());
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
        result =
                (result * PRIME)
                        + (this.percentageComplete == null
                                ? 43
                                : this.percentageComplete.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
