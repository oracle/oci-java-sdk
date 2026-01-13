/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * This is the input used to estimate the size of data to be recalled <br>
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
        builder = EstimateRecallDataSizeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class EstimateRecallDataSizeDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeDataStarted",
        "timeDataEnded",
        "logSets",
        "isRecallNewDataOnly"
    })
    public EstimateRecallDataSizeDetails(
            java.util.Date timeDataStarted,
            java.util.Date timeDataEnded,
            String logSets,
            Boolean isRecallNewDataOnly) {
        super();
        this.timeDataStarted = timeDataStarted;
        this.timeDataEnded = timeDataEnded;
        this.logSets = logSets;
        this.isRecallNewDataOnly = isRecallNewDataOnly;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** This is the start of the time range for the data to be recalled */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDataStarted")
        private java.util.Date timeDataStarted;

        /**
         * This is the start of the time range for the data to be recalled
         *
         * @param timeDataStarted the value to set
         * @return this builder
         */
        public Builder timeDataStarted(java.util.Date timeDataStarted) {
            this.timeDataStarted = timeDataStarted;
            this.__explicitlySet__.add("timeDataStarted");
            return this;
        }
        /** This is the end of the time range for the data to be recalled */
        @com.fasterxml.jackson.annotation.JsonProperty("timeDataEnded")
        private java.util.Date timeDataEnded;

        /**
         * This is the end of the time range for the data to be recalled
         *
         * @param timeDataEnded the value to set
         * @return this builder
         */
        public Builder timeDataEnded(java.util.Date timeDataEnded) {
            this.timeDataEnded = timeDataEnded;
            this.__explicitlySet__.add("timeDataEnded");
            return this;
        }
        /** This is the list of logsets to be accounted for in the recalled data */
        @com.fasterxml.jackson.annotation.JsonProperty("logSets")
        private String logSets;

        /**
         * This is the list of logsets to be accounted for in the recalled data
         *
         * @param logSets the value to set
         * @return this builder
         */
        public Builder logSets(String logSets) {
            this.logSets = logSets;
            this.__explicitlySet__.add("logSets");
            return this;
        }
        /** This indicates if only new data has to be recalled in the timeframe */
        @com.fasterxml.jackson.annotation.JsonProperty("isRecallNewDataOnly")
        private Boolean isRecallNewDataOnly;

        /**
         * This indicates if only new data has to be recalled in the timeframe
         *
         * @param isRecallNewDataOnly the value to set
         * @return this builder
         */
        public Builder isRecallNewDataOnly(Boolean isRecallNewDataOnly) {
            this.isRecallNewDataOnly = isRecallNewDataOnly;
            this.__explicitlySet__.add("isRecallNewDataOnly");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EstimateRecallDataSizeDetails build() {
            EstimateRecallDataSizeDetails model =
                    new EstimateRecallDataSizeDetails(
                            this.timeDataStarted,
                            this.timeDataEnded,
                            this.logSets,
                            this.isRecallNewDataOnly);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EstimateRecallDataSizeDetails model) {
            if (model.wasPropertyExplicitlySet("timeDataStarted")) {
                this.timeDataStarted(model.getTimeDataStarted());
            }
            if (model.wasPropertyExplicitlySet("timeDataEnded")) {
                this.timeDataEnded(model.getTimeDataEnded());
            }
            if (model.wasPropertyExplicitlySet("logSets")) {
                this.logSets(model.getLogSets());
            }
            if (model.wasPropertyExplicitlySet("isRecallNewDataOnly")) {
                this.isRecallNewDataOnly(model.getIsRecallNewDataOnly());
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

    /** This is the start of the time range for the data to be recalled */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataStarted")
    private final java.util.Date timeDataStarted;

    /**
     * This is the start of the time range for the data to be recalled
     *
     * @return the value
     */
    public java.util.Date getTimeDataStarted() {
        return timeDataStarted;
    }

    /** This is the end of the time range for the data to be recalled */
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataEnded")
    private final java.util.Date timeDataEnded;

    /**
     * This is the end of the time range for the data to be recalled
     *
     * @return the value
     */
    public java.util.Date getTimeDataEnded() {
        return timeDataEnded;
    }

    /** This is the list of logsets to be accounted for in the recalled data */
    @com.fasterxml.jackson.annotation.JsonProperty("logSets")
    private final String logSets;

    /**
     * This is the list of logsets to be accounted for in the recalled data
     *
     * @return the value
     */
    public String getLogSets() {
        return logSets;
    }

    /** This indicates if only new data has to be recalled in the timeframe */
    @com.fasterxml.jackson.annotation.JsonProperty("isRecallNewDataOnly")
    private final Boolean isRecallNewDataOnly;

    /**
     * This indicates if only new data has to be recalled in the timeframe
     *
     * @return the value
     */
    public Boolean getIsRecallNewDataOnly() {
        return isRecallNewDataOnly;
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
        sb.append("EstimateRecallDataSizeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("timeDataStarted=").append(String.valueOf(this.timeDataStarted));
        sb.append(", timeDataEnded=").append(String.valueOf(this.timeDataEnded));
        sb.append(", logSets=").append(String.valueOf(this.logSets));
        sb.append(", isRecallNewDataOnly=").append(String.valueOf(this.isRecallNewDataOnly));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EstimateRecallDataSizeDetails)) {
            return false;
        }

        EstimateRecallDataSizeDetails other = (EstimateRecallDataSizeDetails) o;
        return java.util.Objects.equals(this.timeDataStarted, other.timeDataStarted)
                && java.util.Objects.equals(this.timeDataEnded, other.timeDataEnded)
                && java.util.Objects.equals(this.logSets, other.logSets)
                && java.util.Objects.equals(this.isRecallNewDataOnly, other.isRecallNewDataOnly)
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
        result = (result * PRIME) + (this.logSets == null ? 43 : this.logSets.hashCode());
        result =
                (result * PRIME)
                        + (this.isRecallNewDataOnly == null
                                ? 43
                                : this.isRecallNewDataOnly.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
