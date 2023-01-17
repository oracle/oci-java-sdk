/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.optimizer.model;

/**
 * The metadata associated with the profile level summary.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200606")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ProfileLevelSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ProfileLevelSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "recommendationName",
        "metrics",
        "defaultInterval",
        "validIntervals",
        "timeCreated",
        "timeUpdated"
    })
    public ProfileLevelSummary(
            String name,
            String recommendationName,
            java.util.List<EvaluatedMetric> metrics,
            Integer defaultInterval,
            java.util.List<Integer> validIntervals,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.name = name;
        this.recommendationName = recommendationName;
        this.metrics = metrics;
        this.defaultInterval = defaultInterval;
        this.validIntervals = validIntervals;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A unique name for the profile level.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A unique name for the profile level.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The name of the recommendation this profile level applies to.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recommendationName")
        private String recommendationName;

        /**
         * The name of the recommendation this profile level applies to.
         * @param recommendationName the value to set
         * @return this builder
         **/
        public Builder recommendationName(String recommendationName) {
            this.recommendationName = recommendationName;
            this.__explicitlySet__.add("recommendationName");
            return this;
        }
        /**
         * The metrics that will be evaluated by profiles using this profile level.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metrics")
        private java.util.List<EvaluatedMetric> metrics;

        /**
         * The metrics that will be evaluated by profiles using this profile level.
         * @param metrics the value to set
         * @return this builder
         **/
        public Builder metrics(java.util.List<EvaluatedMetric> metrics) {
            this.metrics = metrics;
            this.__explicitlySet__.add("metrics");
            return this;
        }
        /**
         * The default aggregation interval (in days) for profiles using this profile level.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultInterval")
        private Integer defaultInterval;

        /**
         * The default aggregation interval (in days) for profiles using this profile level.
         *
         * @param defaultInterval the value to set
         * @return this builder
         **/
        public Builder defaultInterval(Integer defaultInterval) {
            this.defaultInterval = defaultInterval;
            this.__explicitlySet__.add("defaultInterval");
            return this;
        }
        /**
         * An array of aggregation intervals (in days) allowed for profiles using this profile level.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("validIntervals")
        private java.util.List<Integer> validIntervals;

        /**
         * An array of aggregation intervals (in days) allowed for profiles using this profile level.
         *
         * @param validIntervals the value to set
         * @return this builder
         **/
        public Builder validIntervals(java.util.List<Integer> validIntervals) {
            this.validIntervals = validIntervals;
            this.__explicitlySet__.add("validIntervals");
            return this;
        }
        /**
         * The date and time the category details were created, in the format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the category details were created, in the format defined by RFC3339.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The date and time the category details were last updated, in the format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the category details were last updated, in the format defined by RFC3339.
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProfileLevelSummary build() {
            ProfileLevelSummary model =
                    new ProfileLevelSummary(
                            this.name,
                            this.recommendationName,
                            this.metrics,
                            this.defaultInterval,
                            this.validIntervals,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProfileLevelSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("recommendationName")) {
                this.recommendationName(model.getRecommendationName());
            }
            if (model.wasPropertyExplicitlySet("metrics")) {
                this.metrics(model.getMetrics());
            }
            if (model.wasPropertyExplicitlySet("defaultInterval")) {
                this.defaultInterval(model.getDefaultInterval());
            }
            if (model.wasPropertyExplicitlySet("validIntervals")) {
                this.validIntervals(model.getValidIntervals());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
     * A unique name for the profile level.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A unique name for the profile level.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The name of the recommendation this profile level applies to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendationName")
    private final String recommendationName;

    /**
     * The name of the recommendation this profile level applies to.
     * @return the value
     **/
    public String getRecommendationName() {
        return recommendationName;
    }

    /**
     * The metrics that will be evaluated by profiles using this profile level.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metrics")
    private final java.util.List<EvaluatedMetric> metrics;

    /**
     * The metrics that will be evaluated by profiles using this profile level.
     * @return the value
     **/
    public java.util.List<EvaluatedMetric> getMetrics() {
        return metrics;
    }

    /**
     * The default aggregation interval (in days) for profiles using this profile level.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultInterval")
    private final Integer defaultInterval;

    /**
     * The default aggregation interval (in days) for profiles using this profile level.
     *
     * @return the value
     **/
    public Integer getDefaultInterval() {
        return defaultInterval;
    }

    /**
     * An array of aggregation intervals (in days) allowed for profiles using this profile level.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("validIntervals")
    private final java.util.List<Integer> validIntervals;

    /**
     * An array of aggregation intervals (in days) allowed for profiles using this profile level.
     *
     * @return the value
     **/
    public java.util.List<Integer> getValidIntervals() {
        return validIntervals;
    }

    /**
     * The date and time the category details were created, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the category details were created, in the format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the category details were last updated, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the category details were last updated, in the format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("ProfileLevelSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", recommendationName=").append(String.valueOf(this.recommendationName));
        sb.append(", metrics=").append(String.valueOf(this.metrics));
        sb.append(", defaultInterval=").append(String.valueOf(this.defaultInterval));
        sb.append(", validIntervals=").append(String.valueOf(this.validIntervals));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProfileLevelSummary)) {
            return false;
        }

        ProfileLevelSummary other = (ProfileLevelSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.recommendationName, other.recommendationName)
                && java.util.Objects.equals(this.metrics, other.metrics)
                && java.util.Objects.equals(this.defaultInterval, other.defaultInterval)
                && java.util.Objects.equals(this.validIntervals, other.validIntervals)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.recommendationName == null
                                ? 43
                                : this.recommendationName.hashCode());
        result = (result * PRIME) + (this.metrics == null ? 43 : this.metrics.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultInterval == null ? 43 : this.defaultInterval.hashCode());
        result =
                (result * PRIME)
                        + (this.validIntervals == null ? 43 : this.validIntervals.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
