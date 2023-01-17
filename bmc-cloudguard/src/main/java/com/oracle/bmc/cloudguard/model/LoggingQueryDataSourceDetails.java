/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * The information about new Logging Query of type DataSource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LoggingQueryDataSourceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "dataSourceFeedProvider"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LoggingQueryDataSourceDetails extends DataSourceDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Logging Query regions
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("regions")
        private java.util.List<String> regions;

        /**
         * Logging Query regions
         * @param regions the value to set
         * @return this builder
         **/
        public Builder regions(java.util.List<String> regions) {
            this.regions = regions;
            this.__explicitlySet__.add("regions");
            return this;
        }
        /**
         * The continuous query expression that is run periodically.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("query")
        private String query;

        /**
         * The continuous query expression that is run periodically.
         * @param query the value to set
         * @return this builder
         **/
        public Builder query(String query) {
            this.query = query;
            this.__explicitlySet__.add("query");
            return this;
        }
        /**
         * Interval in minutes that query is run periodically.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("intervalInMinutes")
        private Integer intervalInMinutes;

        /**
         * Interval in minutes that query is run periodically.
         * @param intervalInMinutes the value to set
         * @return this builder
         **/
        public Builder intervalInMinutes(Integer intervalInMinutes) {
            this.intervalInMinutes = intervalInMinutes;
            this.__explicitlySet__.add("intervalInMinutes");
            return this;
        }
        /**
         * The integer value that must be exceeded, fall below or equal to (depending on the operator), the query result to trigger an event.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("threshold")
        private Integer threshold;

        /**
         * The integer value that must be exceeded, fall below or equal to (depending on the operator), the query result to trigger an event.
         * @param threshold the value to set
         * @return this builder
         **/
        public Builder threshold(Integer threshold) {
            this.threshold = threshold;
            this.__explicitlySet__.add("threshold");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryStartTime")
        private ContinuousQueryStartPolicy queryStartTime;

        public Builder queryStartTime(ContinuousQueryStartPolicy queryStartTime) {
            this.queryStartTime = queryStartTime;
            this.__explicitlySet__.add("queryStartTime");
            return this;
        }
        /**
         * Operator used in Data Soruce
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operator")
        private LoggingQueryOperatorType operator;

        /**
         * Operator used in Data Soruce
         * @param operator the value to set
         * @return this builder
         **/
        public Builder operator(LoggingQueryOperatorType operator) {
            this.operator = operator;
            this.__explicitlySet__.add("operator");
            return this;
        }
        /**
         * Logging query type for data source (Sighting/Insight)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("loggingQueryType")
        private LoggingQueryType loggingQueryType;

        /**
         * Logging query type for data source (Sighting/Insight)
         * @param loggingQueryType the value to set
         * @return this builder
         **/
        public Builder loggingQueryType(LoggingQueryType loggingQueryType) {
            this.loggingQueryType = loggingQueryType;
            this.__explicitlySet__.add("loggingQueryType");
            return this;
        }
        /**
         * The additional entities count used for data source query.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("additionalEntitiesCount")
        private Integer additionalEntitiesCount;

        /**
         * The additional entities count used for data source query.
         * @param additionalEntitiesCount the value to set
         * @return this builder
         **/
        public Builder additionalEntitiesCount(Integer additionalEntitiesCount) {
            this.additionalEntitiesCount = additionalEntitiesCount;
            this.__explicitlySet__.add("additionalEntitiesCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("loggingQueryDetails")
        private LoggingQueryDetails loggingQueryDetails;

        public Builder loggingQueryDetails(LoggingQueryDetails loggingQueryDetails) {
            this.loggingQueryDetails = loggingQueryDetails;
            this.__explicitlySet__.add("loggingQueryDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LoggingQueryDataSourceDetails build() {
            LoggingQueryDataSourceDetails model =
                    new LoggingQueryDataSourceDetails(
                            this.regions,
                            this.query,
                            this.intervalInMinutes,
                            this.threshold,
                            this.queryStartTime,
                            this.operator,
                            this.loggingQueryType,
                            this.additionalEntitiesCount,
                            this.loggingQueryDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LoggingQueryDataSourceDetails model) {
            if (model.wasPropertyExplicitlySet("regions")) {
                this.regions(model.getRegions());
            }
            if (model.wasPropertyExplicitlySet("query")) {
                this.query(model.getQuery());
            }
            if (model.wasPropertyExplicitlySet("intervalInMinutes")) {
                this.intervalInMinutes(model.getIntervalInMinutes());
            }
            if (model.wasPropertyExplicitlySet("threshold")) {
                this.threshold(model.getThreshold());
            }
            if (model.wasPropertyExplicitlySet("queryStartTime")) {
                this.queryStartTime(model.getQueryStartTime());
            }
            if (model.wasPropertyExplicitlySet("operator")) {
                this.operator(model.getOperator());
            }
            if (model.wasPropertyExplicitlySet("loggingQueryType")) {
                this.loggingQueryType(model.getLoggingQueryType());
            }
            if (model.wasPropertyExplicitlySet("additionalEntitiesCount")) {
                this.additionalEntitiesCount(model.getAdditionalEntitiesCount());
            }
            if (model.wasPropertyExplicitlySet("loggingQueryDetails")) {
                this.loggingQueryDetails(model.getLoggingQueryDetails());
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
    public LoggingQueryDataSourceDetails(
            java.util.List<String> regions,
            String query,
            Integer intervalInMinutes,
            Integer threshold,
            ContinuousQueryStartPolicy queryStartTime,
            LoggingQueryOperatorType operator,
            LoggingQueryType loggingQueryType,
            Integer additionalEntitiesCount,
            LoggingQueryDetails loggingQueryDetails) {
        super();
        this.regions = regions;
        this.query = query;
        this.intervalInMinutes = intervalInMinutes;
        this.threshold = threshold;
        this.queryStartTime = queryStartTime;
        this.operator = operator;
        this.loggingQueryType = loggingQueryType;
        this.additionalEntitiesCount = additionalEntitiesCount;
        this.loggingQueryDetails = loggingQueryDetails;
    }

    /**
     * Logging Query regions
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regions")
    private final java.util.List<String> regions;

    /**
     * Logging Query regions
     * @return the value
     **/
    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * The continuous query expression that is run periodically.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("query")
    private final String query;

    /**
     * The continuous query expression that is run periodically.
     * @return the value
     **/
    public String getQuery() {
        return query;
    }

    /**
     * Interval in minutes that query is run periodically.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("intervalInMinutes")
    private final Integer intervalInMinutes;

    /**
     * Interval in minutes that query is run periodically.
     * @return the value
     **/
    public Integer getIntervalInMinutes() {
        return intervalInMinutes;
    }

    /**
     * The integer value that must be exceeded, fall below or equal to (depending on the operator), the query result to trigger an event.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("threshold")
    private final Integer threshold;

    /**
     * The integer value that must be exceeded, fall below or equal to (depending on the operator), the query result to trigger an event.
     * @return the value
     **/
    public Integer getThreshold() {
        return threshold;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("queryStartTime")
    private final ContinuousQueryStartPolicy queryStartTime;

    public ContinuousQueryStartPolicy getQueryStartTime() {
        return queryStartTime;
    }

    /**
     * Operator used in Data Soruce
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operator")
    private final LoggingQueryOperatorType operator;

    /**
     * Operator used in Data Soruce
     * @return the value
     **/
    public LoggingQueryOperatorType getOperator() {
        return operator;
    }

    /**
     * Logging query type for data source (Sighting/Insight)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loggingQueryType")
    private final LoggingQueryType loggingQueryType;

    /**
     * Logging query type for data source (Sighting/Insight)
     * @return the value
     **/
    public LoggingQueryType getLoggingQueryType() {
        return loggingQueryType;
    }

    /**
     * The additional entities count used for data source query.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("additionalEntitiesCount")
    private final Integer additionalEntitiesCount;

    /**
     * The additional entities count used for data source query.
     * @return the value
     **/
    public Integer getAdditionalEntitiesCount() {
        return additionalEntitiesCount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("loggingQueryDetails")
    private final LoggingQueryDetails loggingQueryDetails;

    public LoggingQueryDetails getLoggingQueryDetails() {
        return loggingQueryDetails;
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
        sb.append("LoggingQueryDataSourceDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", regions=").append(String.valueOf(this.regions));
        sb.append(", query=").append(String.valueOf(this.query));
        sb.append(", intervalInMinutes=").append(String.valueOf(this.intervalInMinutes));
        sb.append(", threshold=").append(String.valueOf(this.threshold));
        sb.append(", queryStartTime=").append(String.valueOf(this.queryStartTime));
        sb.append(", operator=").append(String.valueOf(this.operator));
        sb.append(", loggingQueryType=").append(String.valueOf(this.loggingQueryType));
        sb.append(", additionalEntitiesCount=")
                .append(String.valueOf(this.additionalEntitiesCount));
        sb.append(", loggingQueryDetails=").append(String.valueOf(this.loggingQueryDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LoggingQueryDataSourceDetails)) {
            return false;
        }

        LoggingQueryDataSourceDetails other = (LoggingQueryDataSourceDetails) o;
        return java.util.Objects.equals(this.regions, other.regions)
                && java.util.Objects.equals(this.query, other.query)
                && java.util.Objects.equals(this.intervalInMinutes, other.intervalInMinutes)
                && java.util.Objects.equals(this.threshold, other.threshold)
                && java.util.Objects.equals(this.queryStartTime, other.queryStartTime)
                && java.util.Objects.equals(this.operator, other.operator)
                && java.util.Objects.equals(this.loggingQueryType, other.loggingQueryType)
                && java.util.Objects.equals(
                        this.additionalEntitiesCount, other.additionalEntitiesCount)
                && java.util.Objects.equals(this.loggingQueryDetails, other.loggingQueryDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.regions == null ? 43 : this.regions.hashCode());
        result = (result * PRIME) + (this.query == null ? 43 : this.query.hashCode());
        result =
                (result * PRIME)
                        + (this.intervalInMinutes == null ? 43 : this.intervalInMinutes.hashCode());
        result = (result * PRIME) + (this.threshold == null ? 43 : this.threshold.hashCode());
        result =
                (result * PRIME)
                        + (this.queryStartTime == null ? 43 : this.queryStartTime.hashCode());
        result = (result * PRIME) + (this.operator == null ? 43 : this.operator.hashCode());
        result =
                (result * PRIME)
                        + (this.loggingQueryType == null ? 43 : this.loggingQueryType.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalEntitiesCount == null
                                ? 43
                                : this.additionalEntitiesCount.hashCode());
        result =
                (result * PRIME)
                        + (this.loggingQueryDetails == null
                                ? 43
                                : this.loggingQueryDetails.hashCode());
        return result;
    }
}
