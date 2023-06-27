/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The configuration details of SQL plan baselines. The details include:
 * <p>
 * - whether automatic initial plan capture is enabled or disabled
 * - whether use of SQL plan baselines is enabled or disabled
 * - whether Automatic SPM Evolve Advisor task is enabled or disabled
 * - whether high-frequency Automatic SPM Evolve Advisor task is enabled or disabled
 * - filters for the automatic initial plan capture
 * - parameters for the Automatic SPM Evolve Advisor task
 * - plan retention and allocated space for the plan baselines
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
    builder = SqlPlanBaselineConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SqlPlanBaselineConfiguration
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isAutomaticInitialPlanCaptureEnabled",
        "isSqlPlanBaselinesUsageEnabled",
        "isAutoSpmEvolveTaskEnabled",
        "isHighFrequencyAutoSpmEvolveTaskEnabled",
        "planRetentionWeeks",
        "spaceBudgetPercent",
        "spaceBudgetMB",
        "spaceUsedMB",
        "autoCaptureFilters",
        "autoSpmEvolveTaskParameters"
    })
    public SqlPlanBaselineConfiguration(
            Boolean isAutomaticInitialPlanCaptureEnabled,
            Boolean isSqlPlanBaselinesUsageEnabled,
            Boolean isAutoSpmEvolveTaskEnabled,
            Boolean isHighFrequencyAutoSpmEvolveTaskEnabled,
            Integer planRetentionWeeks,
            Float spaceBudgetPercent,
            Float spaceBudgetMB,
            Float spaceUsedMB,
            java.util.List<AutomaticCaptureFilter> autoCaptureFilters,
            SpmEvolveTaskParameters autoSpmEvolveTaskParameters) {
        super();
        this.isAutomaticInitialPlanCaptureEnabled = isAutomaticInitialPlanCaptureEnabled;
        this.isSqlPlanBaselinesUsageEnabled = isSqlPlanBaselinesUsageEnabled;
        this.isAutoSpmEvolveTaskEnabled = isAutoSpmEvolveTaskEnabled;
        this.isHighFrequencyAutoSpmEvolveTaskEnabled = isHighFrequencyAutoSpmEvolveTaskEnabled;
        this.planRetentionWeeks = planRetentionWeeks;
        this.spaceBudgetPercent = spaceBudgetPercent;
        this.spaceBudgetMB = spaceBudgetMB;
        this.spaceUsedMB = spaceUsedMB;
        this.autoCaptureFilters = autoCaptureFilters;
        this.autoSpmEvolveTaskParameters = autoSpmEvolveTaskParameters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates whether the automatic capture of SQL plan baselines is enabled ({@code true}) or not ({@code false}).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutomaticInitialPlanCaptureEnabled")
        private Boolean isAutomaticInitialPlanCaptureEnabled;

        /**
         * Indicates whether the automatic capture of SQL plan baselines is enabled ({@code true}) or not ({@code false}).
         * @param isAutomaticInitialPlanCaptureEnabled the value to set
         * @return this builder
         **/
        public Builder isAutomaticInitialPlanCaptureEnabled(
                Boolean isAutomaticInitialPlanCaptureEnabled) {
            this.isAutomaticInitialPlanCaptureEnabled = isAutomaticInitialPlanCaptureEnabled;
            this.__explicitlySet__.add("isAutomaticInitialPlanCaptureEnabled");
            return this;
        }
        /**
         * Indicates whether the database uses SQL plan baselines ({@code true}) or not ({@code false}).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSqlPlanBaselinesUsageEnabled")
        private Boolean isSqlPlanBaselinesUsageEnabled;

        /**
         * Indicates whether the database uses SQL plan baselines ({@code true}) or not ({@code false}).
         * @param isSqlPlanBaselinesUsageEnabled the value to set
         * @return this builder
         **/
        public Builder isSqlPlanBaselinesUsageEnabled(Boolean isSqlPlanBaselinesUsageEnabled) {
            this.isSqlPlanBaselinesUsageEnabled = isSqlPlanBaselinesUsageEnabled;
            this.__explicitlySet__.add("isSqlPlanBaselinesUsageEnabled");
            return this;
        }
        /**
         * Indicates whether the Automatic SPM Evolve Advisor task is enabled ({@code true}) or not ({@code false}).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoSpmEvolveTaskEnabled")
        private Boolean isAutoSpmEvolveTaskEnabled;

        /**
         * Indicates whether the Automatic SPM Evolve Advisor task is enabled ({@code true}) or not ({@code false}).
         * @param isAutoSpmEvolveTaskEnabled the value to set
         * @return this builder
         **/
        public Builder isAutoSpmEvolveTaskEnabled(Boolean isAutoSpmEvolveTaskEnabled) {
            this.isAutoSpmEvolveTaskEnabled = isAutoSpmEvolveTaskEnabled;
            this.__explicitlySet__.add("isAutoSpmEvolveTaskEnabled");
            return this;
        }
        /**
         * Indicates whether the high frequency Automatic SPM Evolve Advisor task is enabled ({@code true}) or not ({@code false}).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isHighFrequencyAutoSpmEvolveTaskEnabled")
        private Boolean isHighFrequencyAutoSpmEvolveTaskEnabled;

        /**
         * Indicates whether the high frequency Automatic SPM Evolve Advisor task is enabled ({@code true}) or not ({@code false}).
         * @param isHighFrequencyAutoSpmEvolveTaskEnabled the value to set
         * @return this builder
         **/
        public Builder isHighFrequencyAutoSpmEvolveTaskEnabled(
                Boolean isHighFrequencyAutoSpmEvolveTaskEnabled) {
            this.isHighFrequencyAutoSpmEvolveTaskEnabled = isHighFrequencyAutoSpmEvolveTaskEnabled;
            this.__explicitlySet__.add("isHighFrequencyAutoSpmEvolveTaskEnabled");
            return this;
        }
        /**
         * The number of weeks to retain unused plans before they are purged.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("planRetentionWeeks")
        private Integer planRetentionWeeks;

        /**
         * The number of weeks to retain unused plans before they are purged.
         * @param planRetentionWeeks the value to set
         * @return this builder
         **/
        public Builder planRetentionWeeks(Integer planRetentionWeeks) {
            this.planRetentionWeeks = planRetentionWeeks;
            this.__explicitlySet__.add("planRetentionWeeks");
            return this;
        }
        /**
         * The maximum percent of {@code SYSAUX} space that can be used for SQL Management Base.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("spaceBudgetPercent")
        private Float spaceBudgetPercent;

        /**
         * The maximum percent of {@code SYSAUX} space that can be used for SQL Management Base.
         * @param spaceBudgetPercent the value to set
         * @return this builder
         **/
        public Builder spaceBudgetPercent(Float spaceBudgetPercent) {
            this.spaceBudgetPercent = spaceBudgetPercent;
            this.__explicitlySet__.add("spaceBudgetPercent");
            return this;
        }
        /**
         * The maximum {@code SYSAUX} space that can be used for SQL Management Base in MB.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("spaceBudgetMB")
        private Float spaceBudgetMB;

        /**
         * The maximum {@code SYSAUX} space that can be used for SQL Management Base in MB.
         * @param spaceBudgetMB the value to set
         * @return this builder
         **/
        public Builder spaceBudgetMB(Float spaceBudgetMB) {
            this.spaceBudgetMB = spaceBudgetMB;
            this.__explicitlySet__.add("spaceBudgetMB");
            return this;
        }
        /**
         * The space used by SQL Management Base in MB.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("spaceUsedMB")
        private Float spaceUsedMB;

        /**
         * The space used by SQL Management Base in MB.
         * @param spaceUsedMB the value to set
         * @return this builder
         **/
        public Builder spaceUsedMB(Float spaceUsedMB) {
            this.spaceUsedMB = spaceUsedMB;
            this.__explicitlySet__.add("spaceUsedMB");
            return this;
        }
        /**
         * The capture filters used in automatic initial plan capture.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("autoCaptureFilters")
        private java.util.List<AutomaticCaptureFilter> autoCaptureFilters;

        /**
         * The capture filters used in automatic initial plan capture.
         * @param autoCaptureFilters the value to set
         * @return this builder
         **/
        public Builder autoCaptureFilters(
                java.util.List<AutomaticCaptureFilter> autoCaptureFilters) {
            this.autoCaptureFilters = autoCaptureFilters;
            this.__explicitlySet__.add("autoCaptureFilters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("autoSpmEvolveTaskParameters")
        private SpmEvolveTaskParameters autoSpmEvolveTaskParameters;

        public Builder autoSpmEvolveTaskParameters(
                SpmEvolveTaskParameters autoSpmEvolveTaskParameters) {
            this.autoSpmEvolveTaskParameters = autoSpmEvolveTaskParameters;
            this.__explicitlySet__.add("autoSpmEvolveTaskParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SqlPlanBaselineConfiguration build() {
            SqlPlanBaselineConfiguration model =
                    new SqlPlanBaselineConfiguration(
                            this.isAutomaticInitialPlanCaptureEnabled,
                            this.isSqlPlanBaselinesUsageEnabled,
                            this.isAutoSpmEvolveTaskEnabled,
                            this.isHighFrequencyAutoSpmEvolveTaskEnabled,
                            this.planRetentionWeeks,
                            this.spaceBudgetPercent,
                            this.spaceBudgetMB,
                            this.spaceUsedMB,
                            this.autoCaptureFilters,
                            this.autoSpmEvolveTaskParameters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SqlPlanBaselineConfiguration model) {
            if (model.wasPropertyExplicitlySet("isAutomaticInitialPlanCaptureEnabled")) {
                this.isAutomaticInitialPlanCaptureEnabled(
                        model.getIsAutomaticInitialPlanCaptureEnabled());
            }
            if (model.wasPropertyExplicitlySet("isSqlPlanBaselinesUsageEnabled")) {
                this.isSqlPlanBaselinesUsageEnabled(model.getIsSqlPlanBaselinesUsageEnabled());
            }
            if (model.wasPropertyExplicitlySet("isAutoSpmEvolveTaskEnabled")) {
                this.isAutoSpmEvolveTaskEnabled(model.getIsAutoSpmEvolveTaskEnabled());
            }
            if (model.wasPropertyExplicitlySet("isHighFrequencyAutoSpmEvolveTaskEnabled")) {
                this.isHighFrequencyAutoSpmEvolveTaskEnabled(
                        model.getIsHighFrequencyAutoSpmEvolveTaskEnabled());
            }
            if (model.wasPropertyExplicitlySet("planRetentionWeeks")) {
                this.planRetentionWeeks(model.getPlanRetentionWeeks());
            }
            if (model.wasPropertyExplicitlySet("spaceBudgetPercent")) {
                this.spaceBudgetPercent(model.getSpaceBudgetPercent());
            }
            if (model.wasPropertyExplicitlySet("spaceBudgetMB")) {
                this.spaceBudgetMB(model.getSpaceBudgetMB());
            }
            if (model.wasPropertyExplicitlySet("spaceUsedMB")) {
                this.spaceUsedMB(model.getSpaceUsedMB());
            }
            if (model.wasPropertyExplicitlySet("autoCaptureFilters")) {
                this.autoCaptureFilters(model.getAutoCaptureFilters());
            }
            if (model.wasPropertyExplicitlySet("autoSpmEvolveTaskParameters")) {
                this.autoSpmEvolveTaskParameters(model.getAutoSpmEvolveTaskParameters());
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
     * Indicates whether the automatic capture of SQL plan baselines is enabled ({@code true}) or not ({@code false}).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutomaticInitialPlanCaptureEnabled")
    private final Boolean isAutomaticInitialPlanCaptureEnabled;

    /**
     * Indicates whether the automatic capture of SQL plan baselines is enabled ({@code true}) or not ({@code false}).
     * @return the value
     **/
    public Boolean getIsAutomaticInitialPlanCaptureEnabled() {
        return isAutomaticInitialPlanCaptureEnabled;
    }

    /**
     * Indicates whether the database uses SQL plan baselines ({@code true}) or not ({@code false}).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSqlPlanBaselinesUsageEnabled")
    private final Boolean isSqlPlanBaselinesUsageEnabled;

    /**
     * Indicates whether the database uses SQL plan baselines ({@code true}) or not ({@code false}).
     * @return the value
     **/
    public Boolean getIsSqlPlanBaselinesUsageEnabled() {
        return isSqlPlanBaselinesUsageEnabled;
    }

    /**
     * Indicates whether the Automatic SPM Evolve Advisor task is enabled ({@code true}) or not ({@code false}).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoSpmEvolveTaskEnabled")
    private final Boolean isAutoSpmEvolveTaskEnabled;

    /**
     * Indicates whether the Automatic SPM Evolve Advisor task is enabled ({@code true}) or not ({@code false}).
     * @return the value
     **/
    public Boolean getIsAutoSpmEvolveTaskEnabled() {
        return isAutoSpmEvolveTaskEnabled;
    }

    /**
     * Indicates whether the high frequency Automatic SPM Evolve Advisor task is enabled ({@code true}) or not ({@code false}).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHighFrequencyAutoSpmEvolveTaskEnabled")
    private final Boolean isHighFrequencyAutoSpmEvolveTaskEnabled;

    /**
     * Indicates whether the high frequency Automatic SPM Evolve Advisor task is enabled ({@code true}) or not ({@code false}).
     * @return the value
     **/
    public Boolean getIsHighFrequencyAutoSpmEvolveTaskEnabled() {
        return isHighFrequencyAutoSpmEvolveTaskEnabled;
    }

    /**
     * The number of weeks to retain unused plans before they are purged.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("planRetentionWeeks")
    private final Integer planRetentionWeeks;

    /**
     * The number of weeks to retain unused plans before they are purged.
     * @return the value
     **/
    public Integer getPlanRetentionWeeks() {
        return planRetentionWeeks;
    }

    /**
     * The maximum percent of {@code SYSAUX} space that can be used for SQL Management Base.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("spaceBudgetPercent")
    private final Float spaceBudgetPercent;

    /**
     * The maximum percent of {@code SYSAUX} space that can be used for SQL Management Base.
     * @return the value
     **/
    public Float getSpaceBudgetPercent() {
        return spaceBudgetPercent;
    }

    /**
     * The maximum {@code SYSAUX} space that can be used for SQL Management Base in MB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("spaceBudgetMB")
    private final Float spaceBudgetMB;

    /**
     * The maximum {@code SYSAUX} space that can be used for SQL Management Base in MB.
     * @return the value
     **/
    public Float getSpaceBudgetMB() {
        return spaceBudgetMB;
    }

    /**
     * The space used by SQL Management Base in MB.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("spaceUsedMB")
    private final Float spaceUsedMB;

    /**
     * The space used by SQL Management Base in MB.
     * @return the value
     **/
    public Float getSpaceUsedMB() {
        return spaceUsedMB;
    }

    /**
     * The capture filters used in automatic initial plan capture.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autoCaptureFilters")
    private final java.util.List<AutomaticCaptureFilter> autoCaptureFilters;

    /**
     * The capture filters used in automatic initial plan capture.
     * @return the value
     **/
    public java.util.List<AutomaticCaptureFilter> getAutoCaptureFilters() {
        return autoCaptureFilters;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("autoSpmEvolveTaskParameters")
    private final SpmEvolveTaskParameters autoSpmEvolveTaskParameters;

    public SpmEvolveTaskParameters getAutoSpmEvolveTaskParameters() {
        return autoSpmEvolveTaskParameters;
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
        sb.append("SqlPlanBaselineConfiguration(");
        sb.append("super=").append(super.toString());
        sb.append("isAutomaticInitialPlanCaptureEnabled=")
                .append(String.valueOf(this.isAutomaticInitialPlanCaptureEnabled));
        sb.append(", isSqlPlanBaselinesUsageEnabled=")
                .append(String.valueOf(this.isSqlPlanBaselinesUsageEnabled));
        sb.append(", isAutoSpmEvolveTaskEnabled=")
                .append(String.valueOf(this.isAutoSpmEvolveTaskEnabled));
        sb.append(", isHighFrequencyAutoSpmEvolveTaskEnabled=")
                .append(String.valueOf(this.isHighFrequencyAutoSpmEvolveTaskEnabled));
        sb.append(", planRetentionWeeks=").append(String.valueOf(this.planRetentionWeeks));
        sb.append(", spaceBudgetPercent=").append(String.valueOf(this.spaceBudgetPercent));
        sb.append(", spaceBudgetMB=").append(String.valueOf(this.spaceBudgetMB));
        sb.append(", spaceUsedMB=").append(String.valueOf(this.spaceUsedMB));
        sb.append(", autoCaptureFilters=").append(String.valueOf(this.autoCaptureFilters));
        sb.append(", autoSpmEvolveTaskParameters=")
                .append(String.valueOf(this.autoSpmEvolveTaskParameters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SqlPlanBaselineConfiguration)) {
            return false;
        }

        SqlPlanBaselineConfiguration other = (SqlPlanBaselineConfiguration) o;
        return java.util.Objects.equals(
                        this.isAutomaticInitialPlanCaptureEnabled,
                        other.isAutomaticInitialPlanCaptureEnabled)
                && java.util.Objects.equals(
                        this.isSqlPlanBaselinesUsageEnabled, other.isSqlPlanBaselinesUsageEnabled)
                && java.util.Objects.equals(
                        this.isAutoSpmEvolveTaskEnabled, other.isAutoSpmEvolveTaskEnabled)
                && java.util.Objects.equals(
                        this.isHighFrequencyAutoSpmEvolveTaskEnabled,
                        other.isHighFrequencyAutoSpmEvolveTaskEnabled)
                && java.util.Objects.equals(this.planRetentionWeeks, other.planRetentionWeeks)
                && java.util.Objects.equals(this.spaceBudgetPercent, other.spaceBudgetPercent)
                && java.util.Objects.equals(this.spaceBudgetMB, other.spaceBudgetMB)
                && java.util.Objects.equals(this.spaceUsedMB, other.spaceUsedMB)
                && java.util.Objects.equals(this.autoCaptureFilters, other.autoCaptureFilters)
                && java.util.Objects.equals(
                        this.autoSpmEvolveTaskParameters, other.autoSpmEvolveTaskParameters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isAutomaticInitialPlanCaptureEnabled == null
                                ? 43
                                : this.isAutomaticInitialPlanCaptureEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isSqlPlanBaselinesUsageEnabled == null
                                ? 43
                                : this.isSqlPlanBaselinesUsageEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoSpmEvolveTaskEnabled == null
                                ? 43
                                : this.isAutoSpmEvolveTaskEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isHighFrequencyAutoSpmEvolveTaskEnabled == null
                                ? 43
                                : this.isHighFrequencyAutoSpmEvolveTaskEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.planRetentionWeeks == null
                                ? 43
                                : this.planRetentionWeeks.hashCode());
        result =
                (result * PRIME)
                        + (this.spaceBudgetPercent == null
                                ? 43
                                : this.spaceBudgetPercent.hashCode());
        result =
                (result * PRIME)
                        + (this.spaceBudgetMB == null ? 43 : this.spaceBudgetMB.hashCode());
        result = (result * PRIME) + (this.spaceUsedMB == null ? 43 : this.spaceUsedMB.hashCode());
        result =
                (result * PRIME)
                        + (this.autoCaptureFilters == null
                                ? 43
                                : this.autoCaptureFilters.hashCode());
        result =
                (result * PRIME)
                        + (this.autoSpmEvolveTaskParameters == null
                                ? 43
                                : this.autoSpmEvolveTaskParameters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
