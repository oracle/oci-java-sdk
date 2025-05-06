/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * This is the input used to recall archived data <br>
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
        builder = RecallArchivedDataDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RecallArchivedDataDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "timeDataEnded",
        "timeDataStarted",
        "dataType",
        "logSets",
        "query",
        "purpose",
        "isRecallNewDataOnly",
        "isUseRecommendedDataSet",
        "collectionId"
    })
    public RecallArchivedDataDetails(
            String compartmentId,
            java.util.Date timeDataEnded,
            java.util.Date timeDataStarted,
            StorageDataType dataType,
            String logSets,
            String query,
            String purpose,
            Boolean isRecallNewDataOnly,
            Boolean isUseRecommendedDataSet,
            Long collectionId) {
        super();
        this.compartmentId = compartmentId;
        this.timeDataEnded = timeDataEnded;
        this.timeDataStarted = timeDataStarted;
        this.dataType = dataType;
        this.logSets = logSets;
        this.query = query;
        this.purpose = purpose;
        this.isRecallNewDataOnly = isRecallNewDataOnly;
        this.isUseRecommendedDataSet = isUseRecommendedDataSet;
        this.collectionId = collectionId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** This is the compartment OCID for permission checking */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * This is the compartment OCID for permission checking
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** This is the end of the time interval */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDataEnded")
        private java.util.Date timeDataEnded;

        /**
         * This is the end of the time interval
         *
         * @param timeDataEnded the value to set
         * @return this builder
         */
        public Builder timeDataEnded(java.util.Date timeDataEnded) {
            this.timeDataEnded = timeDataEnded;
            this.__explicitlySet__.add("timeDataEnded");
            return this;
        }
        /** This is the start of the time interval */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDataStarted")
        private java.util.Date timeDataStarted;

        /**
         * This is the start of the time interval
         *
         * @param timeDataStarted the value to set
         * @return this builder
         */
        public Builder timeDataStarted(java.util.Date timeDataStarted) {
            this.timeDataStarted = timeDataStarted;
            this.__explicitlySet__.add("timeDataStarted");
            return this;
        }
        /** This is the type of the log data to be recalled */
        @com.fasterxml.jackson.annotation.JsonProperty("dataType")
        private StorageDataType dataType;

        /**
         * This is the type of the log data to be recalled
         *
         * @param dataType the value to set
         * @return this builder
         */
        public Builder dataType(StorageDataType dataType) {
            this.dataType = dataType;
            this.__explicitlySet__.add("dataType");
            return this;
        }
        /** This is a list of comma-separated log sets that recalled data belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("logSets")
        private String logSets;

        /**
         * This is a list of comma-separated log sets that recalled data belongs to.
         *
         * @param logSets the value to set
         * @return this builder
         */
        public Builder logSets(String logSets) {
            this.logSets = logSets;
            this.__explicitlySet__.add("logSets");
            return this;
        }
        /** This is the query that identifies the recalled data. */
        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private String query;

        /**
         * This is the query that identifies the recalled data.
         *
         * @param query the value to set
         * @return this builder
         */
        public Builder query(String query) {
            this.query = query;
            this.__explicitlySet__.add("query");
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
        /** This indicates if only new data has to be recalled in this recall request */
        @com.fasterxml.jackson.annotation.JsonProperty("isRecallNewDataOnly")
        private Boolean isRecallNewDataOnly;

        /**
         * This indicates if only new data has to be recalled in this recall request
         *
         * @param isRecallNewDataOnly the value to set
         * @return this builder
         */
        public Builder isRecallNewDataOnly(Boolean isRecallNewDataOnly) {
            this.isRecallNewDataOnly = isRecallNewDataOnly;
            this.__explicitlySet__.add("isRecallNewDataOnly");
            return this;
        }
        /** This indicates if user checked system recommended time range */
        @com.fasterxml.jackson.annotation.JsonProperty("isUseRecommendedDataSet")
        private Boolean isUseRecommendedDataSet;

        /**
         * This indicates if user checked system recommended time range
         *
         * @param isUseRecommendedDataSet the value to set
         * @return this builder
         */
        public Builder isUseRecommendedDataSet(Boolean isUseRecommendedDataSet) {
            this.isUseRecommendedDataSet = isUseRecommendedDataSet;
            this.__explicitlySet__.add("isUseRecommendedDataSet");
            return this;
        }
        /**
         * This is the id for the recalled data collection to be used only for recall new data. If
         * specified, only this collection will be eligible for IsRecallNewDataOnly
         */
        @com.fasterxml.jackson.annotation.JsonProperty("collectionId")
        private Long collectionId;

        /**
         * This is the id for the recalled data collection to be used only for recall new data. If
         * specified, only this collection will be eligible for IsRecallNewDataOnly
         *
         * @param collectionId the value to set
         * @return this builder
         */
        public Builder collectionId(Long collectionId) {
            this.collectionId = collectionId;
            this.__explicitlySet__.add("collectionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecallArchivedDataDetails build() {
            RecallArchivedDataDetails model =
                    new RecallArchivedDataDetails(
                            this.compartmentId,
                            this.timeDataEnded,
                            this.timeDataStarted,
                            this.dataType,
                            this.logSets,
                            this.query,
                            this.purpose,
                            this.isRecallNewDataOnly,
                            this.isUseRecommendedDataSet,
                            this.collectionId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecallArchivedDataDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeDataEnded")) {
                this.timeDataEnded(model.getTimeDataEnded());
            }
            if (model.wasPropertyExplicitlySet("timeDataStarted")) {
                this.timeDataStarted(model.getTimeDataStarted());
            }
            if (model.wasPropertyExplicitlySet("dataType")) {
                this.dataType(model.getDataType());
            }
            if (model.wasPropertyExplicitlySet("logSets")) {
                this.logSets(model.getLogSets());
            }
            if (model.wasPropertyExplicitlySet("query")) {
                this.query(model.getQuery());
            }
            if (model.wasPropertyExplicitlySet("purpose")) {
                this.purpose(model.getPurpose());
            }
            if (model.wasPropertyExplicitlySet("isRecallNewDataOnly")) {
                this.isRecallNewDataOnly(model.getIsRecallNewDataOnly());
            }
            if (model.wasPropertyExplicitlySet("isUseRecommendedDataSet")) {
                this.isUseRecommendedDataSet(model.getIsUseRecommendedDataSet());
            }
            if (model.wasPropertyExplicitlySet("collectionId")) {
                this.collectionId(model.getCollectionId());
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

    /** This is the compartment OCID for permission checking */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * This is the compartment OCID for permission checking
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** This is the end of the time interval */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataEnded")
    private final java.util.Date timeDataEnded;

    /**
     * This is the end of the time interval
     *
     * @return the value
     */
    public java.util.Date getTimeDataEnded() {
        return timeDataEnded;
    }

    /** This is the start of the time interval */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataStarted")
    private final java.util.Date timeDataStarted;

    /**
     * This is the start of the time interval
     *
     * @return the value
     */
    public java.util.Date getTimeDataStarted() {
        return timeDataStarted;
    }

    /** This is the type of the log data to be recalled */
    @com.fasterxml.jackson.annotation.JsonProperty("dataType")
    private final StorageDataType dataType;

    /**
     * This is the type of the log data to be recalled
     *
     * @return the value
     */
    public StorageDataType getDataType() {
        return dataType;
    }

    /** This is a list of comma-separated log sets that recalled data belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("logSets")
    private final String logSets;

    /**
     * This is a list of comma-separated log sets that recalled data belongs to.
     *
     * @return the value
     */
    public String getLogSets() {
        return logSets;
    }

    /** This is the query that identifies the recalled data. */
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

    /**
     * This is the query that identifies the recalled data.
     *
     * @return the value
     */
    public String getQuery() {
        return query;
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

    /** This indicates if only new data has to be recalled in this recall request */
    @com.fasterxml.jackson.annotation.JsonProperty("isRecallNewDataOnly")
    private final Boolean isRecallNewDataOnly;

    /**
     * This indicates if only new data has to be recalled in this recall request
     *
     * @return the value
     */
    public Boolean getIsRecallNewDataOnly() {
        return isRecallNewDataOnly;
    }

    /** This indicates if user checked system recommended time range */
    @com.fasterxml.jackson.annotation.JsonProperty("isUseRecommendedDataSet")
    private final Boolean isUseRecommendedDataSet;

    /**
     * This indicates if user checked system recommended time range
     *
     * @return the value
     */
    public Boolean getIsUseRecommendedDataSet() {
        return isUseRecommendedDataSet;
    }

    /**
     * This is the id for the recalled data collection to be used only for recall new data. If
     * specified, only this collection will be eligible for IsRecallNewDataOnly
     */
    @com.fasterxml.jackson.annotation.JsonProperty("collectionId")
    private final Long collectionId;

    /**
     * This is the id for the recalled data collection to be used only for recall new data. If
     * specified, only this collection will be eligible for IsRecallNewDataOnly
     *
     * @return the value
     */
    public Long getCollectionId() {
        return collectionId;
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
        sb.append("RecallArchivedDataDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeDataEnded=").append(String.valueOf(this.timeDataEnded));
        sb.append(", timeDataStarted=").append(String.valueOf(this.timeDataStarted));
        sb.append(", dataType=").append(String.valueOf(this.dataType));
        sb.append(", logSets=").append(String.valueOf(this.logSets));
        sb.append(", query=").append(String.valueOf(this.query));
        sb.append(", purpose=").append(String.valueOf(this.purpose));
        sb.append(", isRecallNewDataOnly=").append(String.valueOf(this.isRecallNewDataOnly));
        sb.append(", isUseRecommendedDataSet=")
                .append(String.valueOf(this.isUseRecommendedDataSet));
        sb.append(", collectionId=").append(String.valueOf(this.collectionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecallArchivedDataDetails)) {
            return false;
        }

        RecallArchivedDataDetails other = (RecallArchivedDataDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeDataEnded, other.timeDataEnded)
                && java.util.Objects.equals(this.timeDataStarted, other.timeDataStarted)
                && java.util.Objects.equals(this.dataType, other.dataType)
                && java.util.Objects.equals(this.logSets, other.logSets)
                && java.util.Objects.equals(this.query, other.query)
                && java.util.Objects.equals(this.purpose, other.purpose)
                && java.util.Objects.equals(this.isRecallNewDataOnly, other.isRecallNewDataOnly)
                && java.util.Objects.equals(
                        this.isUseRecommendedDataSet, other.isUseRecommendedDataSet)
                && java.util.Objects.equals(this.collectionId, other.collectionId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDataEnded == null ? 43 : this.timeDataEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDataStarted == null ? 43 : this.timeDataStarted.hashCode());
        result = (result * PRIME) + (this.dataType == null ? 43 : this.dataType.hashCode());
        result = (result * PRIME) + (this.logSets == null ? 43 : this.logSets.hashCode());
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        result = (result * PRIME) + (this.purpose == null ? 43 : this.purpose.hashCode());
        result =
                (result * PRIME)
                        + (this.isRecallNewDataOnly == null
                                ? 43
                                : this.isRecallNewDataOnly.hashCode());
        result =
                (result * PRIME)
                        + (this.isUseRecommendedDataSet == null
                                ? 43
                                : this.isUseRecommendedDataSet.hashCode());
        result = (result * PRIME) + (this.collectionId == null ? 43 : this.collectionId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
