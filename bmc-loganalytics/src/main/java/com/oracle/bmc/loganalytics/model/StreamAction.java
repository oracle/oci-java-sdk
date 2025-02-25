/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Stream action for scheduled task.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = StreamAction.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StreamAction extends Action {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The ManagementSavedSearch id [OCID] utilized in the action.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("savedSearchId")
        private String savedSearchId;

        /**
         * The ManagementSavedSearch id [OCID] utilized in the action.
         * @param savedSearchId the value to set
         * @return this builder
         **/
        public Builder savedSearchId(String savedSearchId) {
            this.savedSearchId = savedSearchId;
            this.__explicitlySet__.add("savedSearchId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metricExtraction")
        private MetricExtraction metricExtraction;

        public Builder metricExtraction(MetricExtraction metricExtraction) {
            this.metricExtraction = metricExtraction;
            this.__explicitlySet__.add("metricExtraction");
            return this;
        }
        /**
         * The duration of data to be searched for SAVED_SEARCH tasks,
         * used when the task fires to calculate the query time range.
         * <p>
         * Duration in ISO 8601 extended format as described in
         * https://en.wikipedia.org/wiki/ISO_8601#Durations.
         * The value should be positive.
         * The largest supported unit (as opposed to value) is D, e.g.  P14D (not P2W).
         * <p>
         * There are restrictions on the maximum duration value relative to the task schedule
         * value as specified in the following table.
         *    Schedule Interval Range          | Maximum Duration
         * ----------------------------------- | -----------------
         *   5 Minutes     to 30 Minutes       |   1 hour  "PT60M"
         *  31 Minutes     to  1 Hour          |  12 hours "PT720M"
         *  1 Hour+1Minute to  1 Day           |   1 day   "P1D"
         *  1 Day+1Minute  to  1 Week-1Minute  |   7 days  "P7D"
         *  1 Week         to  2 Weeks         |  14 days  "P14D"
         *  greater than 2 Weeks               |  30 days  "P30D"
         * <p>
         * If not specified, the duration will be based on the schedule. For example,
         * if the schedule is every 5 minutes then the savedSearchDuration will be "PT5M";
         * if the schedule is every 3 weeks then the savedSearchDuration will be "P21D".
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("savedSearchDuration")
        private String savedSearchDuration;

        /**
         * The duration of data to be searched for SAVED_SEARCH tasks,
         * used when the task fires to calculate the query time range.
         * <p>
         * Duration in ISO 8601 extended format as described in
         * https://en.wikipedia.org/wiki/ISO_8601#Durations.
         * The value should be positive.
         * The largest supported unit (as opposed to value) is D, e.g.  P14D (not P2W).
         * <p>
         * There are restrictions on the maximum duration value relative to the task schedule
         * value as specified in the following table.
         *    Schedule Interval Range          | Maximum Duration
         * ----------------------------------- | -----------------
         *   5 Minutes     to 30 Minutes       |   1 hour  "PT60M"
         *  31 Minutes     to  1 Hour          |  12 hours "PT720M"
         *  1 Hour+1Minute to  1 Day           |   1 day   "P1D"
         *  1 Day+1Minute  to  1 Week-1Minute  |   7 days  "P7D"
         *  1 Week         to  2 Weeks         |  14 days  "P14D"
         *  greater than 2 Weeks               |  30 days  "P30D"
         * <p>
         * If not specified, the duration will be based on the schedule. For example,
         * if the schedule is every 5 minutes then the savedSearchDuration will be "PT5M";
         * if the schedule is every 3 weeks then the savedSearchDuration will be "P21D".
         *
         * @param savedSearchDuration the value to set
         * @return this builder
         **/
        public Builder savedSearchDuration(String savedSearchDuration) {
            this.savedSearchDuration = savedSearchDuration;
            this.__explicitlySet__.add("savedSearchDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StreamAction build() {
            StreamAction model =
                    new StreamAction(
                            this.savedSearchId, this.metricExtraction, this.savedSearchDuration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StreamAction model) {
            if (model.wasPropertyExplicitlySet("savedSearchId")) {
                this.savedSearchId(model.getSavedSearchId());
            }
            if (model.wasPropertyExplicitlySet("metricExtraction")) {
                this.metricExtraction(model.getMetricExtraction());
            }
            if (model.wasPropertyExplicitlySet("savedSearchDuration")) {
                this.savedSearchDuration(model.getSavedSearchDuration());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public StreamAction(
            String savedSearchId, MetricExtraction metricExtraction, String savedSearchDuration) {
        super();
        this.savedSearchId = savedSearchId;
        this.metricExtraction = metricExtraction;
        this.savedSearchDuration = savedSearchDuration;
    }

    /**
     * The ManagementSavedSearch id [OCID] utilized in the action.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("savedSearchId")
    private final String savedSearchId;

    /**
     * The ManagementSavedSearch id [OCID] utilized in the action.
     * @return the value
     **/
    public String getSavedSearchId() {
        return savedSearchId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("metricExtraction")
    private final MetricExtraction metricExtraction;

    public MetricExtraction getMetricExtraction() {
        return metricExtraction;
    }

    /**
     * The duration of data to be searched for SAVED_SEARCH tasks,
     * used when the task fires to calculate the query time range.
     * <p>
     * Duration in ISO 8601 extended format as described in
     * https://en.wikipedia.org/wiki/ISO_8601#Durations.
     * The value should be positive.
     * The largest supported unit (as opposed to value) is D, e.g.  P14D (not P2W).
     * <p>
     * There are restrictions on the maximum duration value relative to the task schedule
     * value as specified in the following table.
     *    Schedule Interval Range          | Maximum Duration
     * ----------------------------------- | -----------------
     *   5 Minutes     to 30 Minutes       |   1 hour  "PT60M"
     *  31 Minutes     to  1 Hour          |  12 hours "PT720M"
     *  1 Hour+1Minute to  1 Day           |   1 day   "P1D"
     *  1 Day+1Minute  to  1 Week-1Minute  |   7 days  "P7D"
     *  1 Week         to  2 Weeks         |  14 days  "P14D"
     *  greater than 2 Weeks               |  30 days  "P30D"
     * <p>
     * If not specified, the duration will be based on the schedule. For example,
     * if the schedule is every 5 minutes then the savedSearchDuration will be "PT5M";
     * if the schedule is every 3 weeks then the savedSearchDuration will be "P21D".
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("savedSearchDuration")
    private final String savedSearchDuration;

    /**
     * The duration of data to be searched for SAVED_SEARCH tasks,
     * used when the task fires to calculate the query time range.
     * <p>
     * Duration in ISO 8601 extended format as described in
     * https://en.wikipedia.org/wiki/ISO_8601#Durations.
     * The value should be positive.
     * The largest supported unit (as opposed to value) is D, e.g.  P14D (not P2W).
     * <p>
     * There are restrictions on the maximum duration value relative to the task schedule
     * value as specified in the following table.
     *    Schedule Interval Range          | Maximum Duration
     * ----------------------------------- | -----------------
     *   5 Minutes     to 30 Minutes       |   1 hour  "PT60M"
     *  31 Minutes     to  1 Hour          |  12 hours "PT720M"
     *  1 Hour+1Minute to  1 Day           |   1 day   "P1D"
     *  1 Day+1Minute  to  1 Week-1Minute  |   7 days  "P7D"
     *  1 Week         to  2 Weeks         |  14 days  "P14D"
     *  greater than 2 Weeks               |  30 days  "P30D"
     * <p>
     * If not specified, the duration will be based on the schedule. For example,
     * if the schedule is every 5 minutes then the savedSearchDuration will be "PT5M";
     * if the schedule is every 3 weeks then the savedSearchDuration will be "P21D".
     *
     * @return the value
     **/
    public String getSavedSearchDuration() {
        return savedSearchDuration;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("StreamAction(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", savedSearchId=").append(String.valueOf(this.savedSearchId));
        sb.append(", metricExtraction=").append(String.valueOf(this.metricExtraction));
        sb.append(", savedSearchDuration=").append(String.valueOf(this.savedSearchDuration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StreamAction)) {
            return false;
        }

        StreamAction other = (StreamAction) o;
        return java.util.Objects.equals(this.savedSearchId, other.savedSearchId)
                && java.util.Objects.equals(this.metricExtraction, other.metricExtraction)
                && java.util.Objects.equals(this.savedSearchDuration, other.savedSearchDuration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.savedSearchId == null ? 43 : this.savedSearchId.hashCode());
        result =
                (result * PRIME)
                        + (this.metricExtraction == null ? 43 : this.metricExtraction.hashCode());
        result =
                (result * PRIME)
                        + (this.savedSearchDuration == null
                                ? 43
                                : this.savedSearchDuration.hashCode());
        return result;
    }
}
