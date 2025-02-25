/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * A report that includes the rules, findings, recommendations, and actions discovered during the
 * execution of the Optimizer Statistics Advisor.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OptimizerStatisticsAdvisorExecutionReport.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OptimizerStatisticsAdvisorExecutionReport
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"summary", "rules"})
    public OptimizerStatisticsAdvisorExecutionReport(
            String summary, java.util.List<AdvisorRule> rules) {
        super();
        this.summary = summary;
        this.rules = rules;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A summary of the Optimizer Statistics Advisor execution.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private String summary;

        /**
         * A summary of the Optimizer Statistics Advisor execution.
         * @param summary the value to set
         * @return this builder
         **/
        public Builder summary(String summary) {
            this.summary = summary;
            this.__explicitlySet__.add("summary");
            return this;
        }
        /**
         * The list of rules that were not adhered to by the Optimizer Statistics Collection.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rules")
        private java.util.List<AdvisorRule> rules;

        /**
         * The list of rules that were not adhered to by the Optimizer Statistics Collection.
         * @param rules the value to set
         * @return this builder
         **/
        public Builder rules(java.util.List<AdvisorRule> rules) {
            this.rules = rules;
            this.__explicitlySet__.add("rules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OptimizerStatisticsAdvisorExecutionReport build() {
            OptimizerStatisticsAdvisorExecutionReport model =
                    new OptimizerStatisticsAdvisorExecutionReport(this.summary, this.rules);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OptimizerStatisticsAdvisorExecutionReport model) {
            if (model.wasPropertyExplicitlySet("summary")) {
                this.summary(model.getSummary());
            }
            if (model.wasPropertyExplicitlySet("rules")) {
                this.rules(model.getRules());
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
     * A summary of the Optimizer Statistics Advisor execution.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    private final String summary;

    /**
     * A summary of the Optimizer Statistics Advisor execution.
     * @return the value
     **/
    public String getSummary() {
        return summary;
    }

    /**
     * The list of rules that were not adhered to by the Optimizer Statistics Collection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rules")
    private final java.util.List<AdvisorRule> rules;

    /**
     * The list of rules that were not adhered to by the Optimizer Statistics Collection.
     * @return the value
     **/
    public java.util.List<AdvisorRule> getRules() {
        return rules;
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
        sb.append("OptimizerStatisticsAdvisorExecutionReport(");
        sb.append("super=").append(super.toString());
        sb.append("summary=").append(String.valueOf(this.summary));
        sb.append(", rules=").append(String.valueOf(this.rules));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OptimizerStatisticsAdvisorExecutionReport)) {
            return false;
        }

        OptimizerStatisticsAdvisorExecutionReport other =
                (OptimizerStatisticsAdvisorExecutionReport) o;
        return java.util.Objects.equals(this.summary, other.summary)
                && java.util.Objects.equals(this.rules, other.rules)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.summary == null ? 43 : this.summary.hashCode());
        result = (result * PRIME) + (this.rules == null ? 43 : this.rules.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
