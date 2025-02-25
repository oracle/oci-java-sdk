/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Content types that the news report can handle.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NewsContentTypes.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NewsContentTypes extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "capacityPlanningResources",
        "sqlInsightsFleetAnalysisResources",
        "sqlInsightsPlanChangesResources",
        "sqlInsightsTopDatabasesResources",
        "sqlInsightsTopSqlByInsightsResources",
        "sqlInsightsTopSqlResources",
        "sqlInsightsPerformanceDegradationResources",
        "actionableInsightsResources"
    })
    public NewsContentTypes(
            java.util.List<NewsContentTypesResource> capacityPlanningResources,
            java.util.List<NewsSqlInsightsContentTypesResource> sqlInsightsFleetAnalysisResources,
            java.util.List<NewsSqlInsightsContentTypesResource> sqlInsightsPlanChangesResources,
            java.util.List<NewsSqlInsightsContentTypesResource> sqlInsightsTopDatabasesResources,
            java.util.List<NewsSqlInsightsContentTypesResource>
                    sqlInsightsTopSqlByInsightsResources,
            java.util.List<NewsSqlInsightsContentTypesResource> sqlInsightsTopSqlResources,
            java.util.List<NewsSqlInsightsContentTypesResource>
                    sqlInsightsPerformanceDegradationResources,
            java.util.List<ActionableInsightsContentTypesResource> actionableInsightsResources) {
        super();
        this.capacityPlanningResources = capacityPlanningResources;
        this.sqlInsightsFleetAnalysisResources = sqlInsightsFleetAnalysisResources;
        this.sqlInsightsPlanChangesResources = sqlInsightsPlanChangesResources;
        this.sqlInsightsTopDatabasesResources = sqlInsightsTopDatabasesResources;
        this.sqlInsightsTopSqlByInsightsResources = sqlInsightsTopSqlByInsightsResources;
        this.sqlInsightsTopSqlResources = sqlInsightsTopSqlResources;
        this.sqlInsightsPerformanceDegradationResources =
                sqlInsightsPerformanceDegradationResources;
        this.actionableInsightsResources = actionableInsightsResources;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Supported resources for capacity planning content type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("capacityPlanningResources")
        private java.util.List<NewsContentTypesResource> capacityPlanningResources;

        /**
         * Supported resources for capacity planning content type.
         * @param capacityPlanningResources the value to set
         * @return this builder
         **/
        public Builder capacityPlanningResources(
                java.util.List<NewsContentTypesResource> capacityPlanningResources) {
            this.capacityPlanningResources = capacityPlanningResources;
            this.__explicitlySet__.add("capacityPlanningResources");
            return this;
        }
        /**
         * Supported resources for SQL insights - fleet analysis content type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlInsightsFleetAnalysisResources")
        private java.util.List<NewsSqlInsightsContentTypesResource>
                sqlInsightsFleetAnalysisResources;

        /**
         * Supported resources for SQL insights - fleet analysis content type.
         * @param sqlInsightsFleetAnalysisResources the value to set
         * @return this builder
         **/
        public Builder sqlInsightsFleetAnalysisResources(
                java.util.List<NewsSqlInsightsContentTypesResource>
                        sqlInsightsFleetAnalysisResources) {
            this.sqlInsightsFleetAnalysisResources = sqlInsightsFleetAnalysisResources;
            this.__explicitlySet__.add("sqlInsightsFleetAnalysisResources");
            return this;
        }
        /**
         * Supported resources for SQL insights - plan changes content type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlInsightsPlanChangesResources")
        private java.util.List<NewsSqlInsightsContentTypesResource> sqlInsightsPlanChangesResources;

        /**
         * Supported resources for SQL insights - plan changes content type.
         * @param sqlInsightsPlanChangesResources the value to set
         * @return this builder
         **/
        public Builder sqlInsightsPlanChangesResources(
                java.util.List<NewsSqlInsightsContentTypesResource>
                        sqlInsightsPlanChangesResources) {
            this.sqlInsightsPlanChangesResources = sqlInsightsPlanChangesResources;
            this.__explicitlySet__.add("sqlInsightsPlanChangesResources");
            return this;
        }
        /**
         * Supported resources for SQL insights - top databases content type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlInsightsTopDatabasesResources")
        private java.util.List<NewsSqlInsightsContentTypesResource>
                sqlInsightsTopDatabasesResources;

        /**
         * Supported resources for SQL insights - top databases content type.
         * @param sqlInsightsTopDatabasesResources the value to set
         * @return this builder
         **/
        public Builder sqlInsightsTopDatabasesResources(
                java.util.List<NewsSqlInsightsContentTypesResource>
                        sqlInsightsTopDatabasesResources) {
            this.sqlInsightsTopDatabasesResources = sqlInsightsTopDatabasesResources;
            this.__explicitlySet__.add("sqlInsightsTopDatabasesResources");
            return this;
        }
        /**
         * Supported resources for SQL insights - top SQL by insights content type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlInsightsTopSqlByInsightsResources")
        private java.util.List<NewsSqlInsightsContentTypesResource>
                sqlInsightsTopSqlByInsightsResources;

        /**
         * Supported resources for SQL insights - top SQL by insights content type.
         * @param sqlInsightsTopSqlByInsightsResources the value to set
         * @return this builder
         **/
        public Builder sqlInsightsTopSqlByInsightsResources(
                java.util.List<NewsSqlInsightsContentTypesResource>
                        sqlInsightsTopSqlByInsightsResources) {
            this.sqlInsightsTopSqlByInsightsResources = sqlInsightsTopSqlByInsightsResources;
            this.__explicitlySet__.add("sqlInsightsTopSqlByInsightsResources");
            return this;
        }
        /**
         * Supported resources for SQL insights - top SQL content type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlInsightsTopSqlResources")
        private java.util.List<NewsSqlInsightsContentTypesResource> sqlInsightsTopSqlResources;

        /**
         * Supported resources for SQL insights - top SQL content type.
         * @param sqlInsightsTopSqlResources the value to set
         * @return this builder
         **/
        public Builder sqlInsightsTopSqlResources(
                java.util.List<NewsSqlInsightsContentTypesResource> sqlInsightsTopSqlResources) {
            this.sqlInsightsTopSqlResources = sqlInsightsTopSqlResources;
            this.__explicitlySet__.add("sqlInsightsTopSqlResources");
            return this;
        }
        /**
         * Supported resources for SQL insights - performance degradation content type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sqlInsightsPerformanceDegradationResources")
        private java.util.List<NewsSqlInsightsContentTypesResource>
                sqlInsightsPerformanceDegradationResources;

        /**
         * Supported resources for SQL insights - performance degradation content type.
         * @param sqlInsightsPerformanceDegradationResources the value to set
         * @return this builder
         **/
        public Builder sqlInsightsPerformanceDegradationResources(
                java.util.List<NewsSqlInsightsContentTypesResource>
                        sqlInsightsPerformanceDegradationResources) {
            this.sqlInsightsPerformanceDegradationResources =
                    sqlInsightsPerformanceDegradationResources;
            this.__explicitlySet__.add("sqlInsightsPerformanceDegradationResources");
            return this;
        }
        /**
         * Supported resources for actionable insights content type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actionableInsightsResources")
        private java.util.List<ActionableInsightsContentTypesResource> actionableInsightsResources;

        /**
         * Supported resources for actionable insights content type.
         * @param actionableInsightsResources the value to set
         * @return this builder
         **/
        public Builder actionableInsightsResources(
                java.util.List<ActionableInsightsContentTypesResource>
                        actionableInsightsResources) {
            this.actionableInsightsResources = actionableInsightsResources;
            this.__explicitlySet__.add("actionableInsightsResources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NewsContentTypes build() {
            NewsContentTypes model =
                    new NewsContentTypes(
                            this.capacityPlanningResources,
                            this.sqlInsightsFleetAnalysisResources,
                            this.sqlInsightsPlanChangesResources,
                            this.sqlInsightsTopDatabasesResources,
                            this.sqlInsightsTopSqlByInsightsResources,
                            this.sqlInsightsTopSqlResources,
                            this.sqlInsightsPerformanceDegradationResources,
                            this.actionableInsightsResources);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NewsContentTypes model) {
            if (model.wasPropertyExplicitlySet("capacityPlanningResources")) {
                this.capacityPlanningResources(model.getCapacityPlanningResources());
            }
            if (model.wasPropertyExplicitlySet("sqlInsightsFleetAnalysisResources")) {
                this.sqlInsightsFleetAnalysisResources(
                        model.getSqlInsightsFleetAnalysisResources());
            }
            if (model.wasPropertyExplicitlySet("sqlInsightsPlanChangesResources")) {
                this.sqlInsightsPlanChangesResources(model.getSqlInsightsPlanChangesResources());
            }
            if (model.wasPropertyExplicitlySet("sqlInsightsTopDatabasesResources")) {
                this.sqlInsightsTopDatabasesResources(model.getSqlInsightsTopDatabasesResources());
            }
            if (model.wasPropertyExplicitlySet("sqlInsightsTopSqlByInsightsResources")) {
                this.sqlInsightsTopSqlByInsightsResources(
                        model.getSqlInsightsTopSqlByInsightsResources());
            }
            if (model.wasPropertyExplicitlySet("sqlInsightsTopSqlResources")) {
                this.sqlInsightsTopSqlResources(model.getSqlInsightsTopSqlResources());
            }
            if (model.wasPropertyExplicitlySet("sqlInsightsPerformanceDegradationResources")) {
                this.sqlInsightsPerformanceDegradationResources(
                        model.getSqlInsightsPerformanceDegradationResources());
            }
            if (model.wasPropertyExplicitlySet("actionableInsightsResources")) {
                this.actionableInsightsResources(model.getActionableInsightsResources());
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
     * Supported resources for capacity planning content type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("capacityPlanningResources")
    private final java.util.List<NewsContentTypesResource> capacityPlanningResources;

    /**
     * Supported resources for capacity planning content type.
     * @return the value
     **/
    public java.util.List<NewsContentTypesResource> getCapacityPlanningResources() {
        return capacityPlanningResources;
    }

    /**
     * Supported resources for SQL insights - fleet analysis content type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlInsightsFleetAnalysisResources")
    private final java.util.List<NewsSqlInsightsContentTypesResource>
            sqlInsightsFleetAnalysisResources;

    /**
     * Supported resources for SQL insights - fleet analysis content type.
     * @return the value
     **/
    public java.util.List<NewsSqlInsightsContentTypesResource>
            getSqlInsightsFleetAnalysisResources() {
        return sqlInsightsFleetAnalysisResources;
    }

    /**
     * Supported resources for SQL insights - plan changes content type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlInsightsPlanChangesResources")
    private final java.util.List<NewsSqlInsightsContentTypesResource>
            sqlInsightsPlanChangesResources;

    /**
     * Supported resources for SQL insights - plan changes content type.
     * @return the value
     **/
    public java.util.List<NewsSqlInsightsContentTypesResource>
            getSqlInsightsPlanChangesResources() {
        return sqlInsightsPlanChangesResources;
    }

    /**
     * Supported resources for SQL insights - top databases content type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlInsightsTopDatabasesResources")
    private final java.util.List<NewsSqlInsightsContentTypesResource>
            sqlInsightsTopDatabasesResources;

    /**
     * Supported resources for SQL insights - top databases content type.
     * @return the value
     **/
    public java.util.List<NewsSqlInsightsContentTypesResource>
            getSqlInsightsTopDatabasesResources() {
        return sqlInsightsTopDatabasesResources;
    }

    /**
     * Supported resources for SQL insights - top SQL by insights content type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlInsightsTopSqlByInsightsResources")
    private final java.util.List<NewsSqlInsightsContentTypesResource>
            sqlInsightsTopSqlByInsightsResources;

    /**
     * Supported resources for SQL insights - top SQL by insights content type.
     * @return the value
     **/
    public java.util.List<NewsSqlInsightsContentTypesResource>
            getSqlInsightsTopSqlByInsightsResources() {
        return sqlInsightsTopSqlByInsightsResources;
    }

    /**
     * Supported resources for SQL insights - top SQL content type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlInsightsTopSqlResources")
    private final java.util.List<NewsSqlInsightsContentTypesResource> sqlInsightsTopSqlResources;

    /**
     * Supported resources for SQL insights - top SQL content type.
     * @return the value
     **/
    public java.util.List<NewsSqlInsightsContentTypesResource> getSqlInsightsTopSqlResources() {
        return sqlInsightsTopSqlResources;
    }

    /**
     * Supported resources for SQL insights - performance degradation content type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sqlInsightsPerformanceDegradationResources")
    private final java.util.List<NewsSqlInsightsContentTypesResource>
            sqlInsightsPerformanceDegradationResources;

    /**
     * Supported resources for SQL insights - performance degradation content type.
     * @return the value
     **/
    public java.util.List<NewsSqlInsightsContentTypesResource>
            getSqlInsightsPerformanceDegradationResources() {
        return sqlInsightsPerformanceDegradationResources;
    }

    /**
     * Supported resources for actionable insights content type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionableInsightsResources")
    private final java.util.List<ActionableInsightsContentTypesResource>
            actionableInsightsResources;

    /**
     * Supported resources for actionable insights content type.
     * @return the value
     **/
    public java.util.List<ActionableInsightsContentTypesResource> getActionableInsightsResources() {
        return actionableInsightsResources;
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
        sb.append("NewsContentTypes(");
        sb.append("super=").append(super.toString());
        sb.append("capacityPlanningResources=")
                .append(String.valueOf(this.capacityPlanningResources));
        sb.append(", sqlInsightsFleetAnalysisResources=")
                .append(String.valueOf(this.sqlInsightsFleetAnalysisResources));
        sb.append(", sqlInsightsPlanChangesResources=")
                .append(String.valueOf(this.sqlInsightsPlanChangesResources));
        sb.append(", sqlInsightsTopDatabasesResources=")
                .append(String.valueOf(this.sqlInsightsTopDatabasesResources));
        sb.append(", sqlInsightsTopSqlByInsightsResources=")
                .append(String.valueOf(this.sqlInsightsTopSqlByInsightsResources));
        sb.append(", sqlInsightsTopSqlResources=")
                .append(String.valueOf(this.sqlInsightsTopSqlResources));
        sb.append(", sqlInsightsPerformanceDegradationResources=")
                .append(String.valueOf(this.sqlInsightsPerformanceDegradationResources));
        sb.append(", actionableInsightsResources=")
                .append(String.valueOf(this.actionableInsightsResources));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NewsContentTypes)) {
            return false;
        }

        NewsContentTypes other = (NewsContentTypes) o;
        return java.util.Objects.equals(
                        this.capacityPlanningResources, other.capacityPlanningResources)
                && java.util.Objects.equals(
                        this.sqlInsightsFleetAnalysisResources,
                        other.sqlInsightsFleetAnalysisResources)
                && java.util.Objects.equals(
                        this.sqlInsightsPlanChangesResources, other.sqlInsightsPlanChangesResources)
                && java.util.Objects.equals(
                        this.sqlInsightsTopDatabasesResources,
                        other.sqlInsightsTopDatabasesResources)
                && java.util.Objects.equals(
                        this.sqlInsightsTopSqlByInsightsResources,
                        other.sqlInsightsTopSqlByInsightsResources)
                && java.util.Objects.equals(
                        this.sqlInsightsTopSqlResources, other.sqlInsightsTopSqlResources)
                && java.util.Objects.equals(
                        this.sqlInsightsPerformanceDegradationResources,
                        other.sqlInsightsPerformanceDegradationResources)
                && java.util.Objects.equals(
                        this.actionableInsightsResources, other.actionableInsightsResources)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.capacityPlanningResources == null
                                ? 43
                                : this.capacityPlanningResources.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlInsightsFleetAnalysisResources == null
                                ? 43
                                : this.sqlInsightsFleetAnalysisResources.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlInsightsPlanChangesResources == null
                                ? 43
                                : this.sqlInsightsPlanChangesResources.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlInsightsTopDatabasesResources == null
                                ? 43
                                : this.sqlInsightsTopDatabasesResources.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlInsightsTopSqlByInsightsResources == null
                                ? 43
                                : this.sqlInsightsTopSqlByInsightsResources.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlInsightsTopSqlResources == null
                                ? 43
                                : this.sqlInsightsTopSqlResources.hashCode());
        result =
                (result * PRIME)
                        + (this.sqlInsightsPerformanceDegradationResources == null
                                ? 43
                                : this.sqlInsightsPerformanceDegradationResources.hashCode());
        result =
                (result * PRIME)
                        + (this.actionableInsightsResources == null
                                ? 43
                                : this.actionableInsightsResources.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
