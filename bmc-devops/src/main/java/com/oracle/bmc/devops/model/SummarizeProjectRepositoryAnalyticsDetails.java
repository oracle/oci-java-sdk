/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Details of the user configured settings for viewing the metrics at project level.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SummarizeProjectRepositoryAnalyticsDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SummarizeProjectRepositoryAnalyticsDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "authorEmail",
        "repositoryMetrics",
        "aggregationDuration",
        "startTime",
        "endTime",
        "groupBy"
    })
    public SummarizeProjectRepositoryAnalyticsDetails(
            String authorEmail,
            java.util.List<MetricName> repositoryMetrics,
            AggregationDuration aggregationDuration,
            java.util.Date startTime,
            java.util.Date endTime,
            GroupBy groupBy) {
        super();
        this.authorEmail = authorEmail;
        this.repositoryMetrics = repositoryMetrics;
        this.aggregationDuration = aggregationDuration;
        this.startTime = startTime;
        this.endTime = endTime;
        this.groupBy = groupBy;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Email address of the author.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("authorEmail")
        private String authorEmail;

        /**
         * Email address of the author.
         * @param authorEmail the value to set
         * @return this builder
         **/
        public Builder authorEmail(String authorEmail) {
            this.authorEmail = authorEmail;
            this.__explicitlySet__.add("authorEmail");
            return this;
        }
        /**
         * The name of the metric to be filtered.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryMetrics")
        private java.util.List<MetricName> repositoryMetrics;

        /**
         * The name of the metric to be filtered.
         * @param repositoryMetrics the value to set
         * @return this builder
         **/
        public Builder repositoryMetrics(java.util.List<MetricName> repositoryMetrics) {
            this.repositoryMetrics = repositoryMetrics;
            this.__explicitlySet__.add("repositoryMetrics");
            return this;
        }
        /**
         * Metrics aggregated for the defined period.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("aggregationDuration")
        private AggregationDuration aggregationDuration;

        /**
         * Metrics aggregated for the defined period.
         * @param aggregationDuration the value to set
         * @return this builder
         **/
        public Builder aggregationDuration(AggregationDuration aggregationDuration) {
            this.aggregationDuration = aggregationDuration;
            this.__explicitlySet__.add("aggregationDuration");
            return this;
        }
        /**
         * The beginning of the metric data query time range.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("startTime")
        private java.util.Date startTime;

        /**
         * The beginning of the metric data query time range.
         * @param startTime the value to set
         * @return this builder
         **/
        public Builder startTime(java.util.Date startTime) {
            this.startTime = startTime;
            this.__explicitlySet__.add("startTime");
            return this;
        }
        /**
         * The end of the metric data query time range.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("endTime")
        private java.util.Date endTime;

        /**
         * The end of the metric data query time range.
         * @param endTime the value to set
         * @return this builder
         **/
        public Builder endTime(java.util.Date endTime) {
            this.endTime = endTime;
            this.__explicitlySet__.add("endTime");
            return this;
        }
        /**
         * Attribute by which metric data has to be grouped
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("groupBy")
        private GroupBy groupBy;

        /**
         * Attribute by which metric data has to be grouped
         * @param groupBy the value to set
         * @return this builder
         **/
        public Builder groupBy(GroupBy groupBy) {
            this.groupBy = groupBy;
            this.__explicitlySet__.add("groupBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SummarizeProjectRepositoryAnalyticsDetails build() {
            SummarizeProjectRepositoryAnalyticsDetails model =
                    new SummarizeProjectRepositoryAnalyticsDetails(
                            this.authorEmail,
                            this.repositoryMetrics,
                            this.aggregationDuration,
                            this.startTime,
                            this.endTime,
                            this.groupBy);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SummarizeProjectRepositoryAnalyticsDetails model) {
            if (model.wasPropertyExplicitlySet("authorEmail")) {
                this.authorEmail(model.getAuthorEmail());
            }
            if (model.wasPropertyExplicitlySet("repositoryMetrics")) {
                this.repositoryMetrics(model.getRepositoryMetrics());
            }
            if (model.wasPropertyExplicitlySet("aggregationDuration")) {
                this.aggregationDuration(model.getAggregationDuration());
            }
            if (model.wasPropertyExplicitlySet("startTime")) {
                this.startTime(model.getStartTime());
            }
            if (model.wasPropertyExplicitlySet("endTime")) {
                this.endTime(model.getEndTime());
            }
            if (model.wasPropertyExplicitlySet("groupBy")) {
                this.groupBy(model.getGroupBy());
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

    /**
     * Email address of the author.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authorEmail")
    private final String authorEmail;

    /**
     * Email address of the author.
     * @return the value
     **/
    public String getAuthorEmail() {
        return authorEmail;
    }

    /**
     * The name of the metric to be filtered.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryMetrics")
    private final java.util.List<MetricName> repositoryMetrics;

    /**
     * The name of the metric to be filtered.
     * @return the value
     **/
    public java.util.List<MetricName> getRepositoryMetrics() {
        return repositoryMetrics;
    }

    /**
     * Metrics aggregated for the defined period.
     **/
    public enum AggregationDuration {
        Daily("DAILY"),
        Weekly("WEEKLY"),
        Monthly("MONTHLY"),
        Yearly("YEARLY"),
        ;

        private final String value;
        private static java.util.Map<String, AggregationDuration> map;

        static {
            map = new java.util.HashMap<>();
            for (AggregationDuration v : AggregationDuration.values()) {
                map.put(v.getValue(), v);
            }
        }

        AggregationDuration(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AggregationDuration create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid AggregationDuration: " + key);
        }
    };
    /**
     * Metrics aggregated for the defined period.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("aggregationDuration")
    private final AggregationDuration aggregationDuration;

    /**
     * Metrics aggregated for the defined period.
     * @return the value
     **/
    public AggregationDuration getAggregationDuration() {
        return aggregationDuration;
    }

    /**
     * The beginning of the metric data query time range.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startTime")
    private final java.util.Date startTime;

    /**
     * The beginning of the metric data query time range.
     * @return the value
     **/
    public java.util.Date getStartTime() {
        return startTime;
    }

    /**
     * The end of the metric data query time range.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("endTime")
    private final java.util.Date endTime;

    /**
     * The end of the metric data query time range.
     * @return the value
     **/
    public java.util.Date getEndTime() {
        return endTime;
    }

    /**
     * Attribute by which metric data has to be grouped
     **/
    public enum GroupBy {
        Author("AUTHOR"),
        ;

        private final String value;
        private static java.util.Map<String, GroupBy> map;

        static {
            map = new java.util.HashMap<>();
            for (GroupBy v : GroupBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        GroupBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static GroupBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid GroupBy: " + key);
        }
    };
    /**
     * Attribute by which metric data has to be grouped
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupBy")
    private final GroupBy groupBy;

    /**
     * Attribute by which metric data has to be grouped
     * @return the value
     **/
    public GroupBy getGroupBy() {
        return groupBy;
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
        sb.append("SummarizeProjectRepositoryAnalyticsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("authorEmail=").append(String.valueOf(this.authorEmail));
        sb.append(", repositoryMetrics=").append(String.valueOf(this.repositoryMetrics));
        sb.append(", aggregationDuration=").append(String.valueOf(this.aggregationDuration));
        sb.append(", startTime=").append(String.valueOf(this.startTime));
        sb.append(", endTime=").append(String.valueOf(this.endTime));
        sb.append(", groupBy=").append(String.valueOf(this.groupBy));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SummarizeProjectRepositoryAnalyticsDetails)) {
            return false;
        }

        SummarizeProjectRepositoryAnalyticsDetails other =
                (SummarizeProjectRepositoryAnalyticsDetails) o;
        return java.util.Objects.equals(this.authorEmail, other.authorEmail)
                && java.util.Objects.equals(this.repositoryMetrics, other.repositoryMetrics)
                && java.util.Objects.equals(this.aggregationDuration, other.aggregationDuration)
                && java.util.Objects.equals(this.startTime, other.startTime)
                && java.util.Objects.equals(this.endTime, other.endTime)
                && java.util.Objects.equals(this.groupBy, other.groupBy)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.authorEmail == null ? 43 : this.authorEmail.hashCode());
        result =
                (result * PRIME)
                        + (this.repositoryMetrics == null ? 43 : this.repositoryMetrics.hashCode());
        result =
                (result * PRIME)
                        + (this.aggregationDuration == null
                                ? 43
                                : this.aggregationDuration.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result = (result * PRIME) + (this.groupBy == null ? 43 : this.groupBy.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
