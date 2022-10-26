/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * The policy that specifies the maintenance and upgrade preferences for an environment. For more
 * information about the options, see [Understanding Environment
 * Maintenance](https://docs.cloud.oracle.com/iaas/Content/fusion-applications/plan-environment-family.htm#about-env-maintenance).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GetMaintenancePolicyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class GetMaintenancePolicyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "quarterlyUpgradeBeginTimes",
        "monthlyPatchingOverride",
        "environmentMaintenanceOverride"
    })
    public GetMaintenancePolicyDetails(
            QuarterlyUpgradeBeginTimes quarterlyUpgradeBeginTimes,
            MaintenancePolicy.MonthlyPatchingOverride monthlyPatchingOverride,
            MaintenancePolicy.EnvironmentMaintenanceOverride environmentMaintenanceOverride) {
        super();
        this.quarterlyUpgradeBeginTimes = quarterlyUpgradeBeginTimes;
        this.monthlyPatchingOverride = monthlyPatchingOverride;
        this.environmentMaintenanceOverride = environmentMaintenanceOverride;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("quarterlyUpgradeBeginTimes")
        private QuarterlyUpgradeBeginTimes quarterlyUpgradeBeginTimes;

        public Builder quarterlyUpgradeBeginTimes(
                QuarterlyUpgradeBeginTimes quarterlyUpgradeBeginTimes) {
            this.quarterlyUpgradeBeginTimes = quarterlyUpgradeBeginTimes;
            this.__explicitlySet__.add("quarterlyUpgradeBeginTimes");
            return this;
        }
        /**
         * Whether the Fusion environment will be updated monthly or updated on the quarterly cycle.
         * This setting overrides the monthly patching setting of its Fusion environment family.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("monthlyPatchingOverride")
        private MaintenancePolicy.MonthlyPatchingOverride monthlyPatchingOverride;

        /**
         * Whether the Fusion environment will be updated monthly or updated on the quarterly cycle.
         * This setting overrides the monthly patching setting of its Fusion environment family.
         *
         * @param monthlyPatchingOverride the value to set
         * @return this builder
         */
        public Builder monthlyPatchingOverride(
                MaintenancePolicy.MonthlyPatchingOverride monthlyPatchingOverride) {
            this.monthlyPatchingOverride = monthlyPatchingOverride;
            this.__explicitlySet__.add("monthlyPatchingOverride");
            return this;
        }
        /**
         * User choice to upgrade both production and non-production environments at the same time.
         * Overrides the Fusion environment family setting.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("environmentMaintenanceOverride")
        private MaintenancePolicy.EnvironmentMaintenanceOverride environmentMaintenanceOverride;

        /**
         * User choice to upgrade both production and non-production environments at the same time.
         * Overrides the Fusion environment family setting.
         *
         * @param environmentMaintenanceOverride the value to set
         * @return this builder
         */
        public Builder environmentMaintenanceOverride(
                MaintenancePolicy.EnvironmentMaintenanceOverride environmentMaintenanceOverride) {
            this.environmentMaintenanceOverride = environmentMaintenanceOverride;
            this.__explicitlySet__.add("environmentMaintenanceOverride");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GetMaintenancePolicyDetails build() {
            GetMaintenancePolicyDetails model =
                    new GetMaintenancePolicyDetails(
                            this.quarterlyUpgradeBeginTimes,
                            this.monthlyPatchingOverride,
                            this.environmentMaintenanceOverride);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GetMaintenancePolicyDetails model) {
            if (model.wasPropertyExplicitlySet("quarterlyUpgradeBeginTimes")) {
                this.quarterlyUpgradeBeginTimes(model.getQuarterlyUpgradeBeginTimes());
            }
            if (model.wasPropertyExplicitlySet("monthlyPatchingOverride")) {
                this.monthlyPatchingOverride(model.getMonthlyPatchingOverride());
            }
            if (model.wasPropertyExplicitlySet("environmentMaintenanceOverride")) {
                this.environmentMaintenanceOverride(model.getEnvironmentMaintenanceOverride());
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

    @com.fasterxml.jackson.annotation.JsonProperty("quarterlyUpgradeBeginTimes")
    private final QuarterlyUpgradeBeginTimes quarterlyUpgradeBeginTimes;

    public QuarterlyUpgradeBeginTimes getQuarterlyUpgradeBeginTimes() {
        return quarterlyUpgradeBeginTimes;
    }

    /**
     * Whether the Fusion environment will be updated monthly or updated on the quarterly cycle.
     * This setting overrides the monthly patching setting of its Fusion environment family.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("monthlyPatchingOverride")
    private final MaintenancePolicy.MonthlyPatchingOverride monthlyPatchingOverride;

    /**
     * Whether the Fusion environment will be updated monthly or updated on the quarterly cycle.
     * This setting overrides the monthly patching setting of its Fusion environment family.
     *
     * @return the value
     */
    public MaintenancePolicy.MonthlyPatchingOverride getMonthlyPatchingOverride() {
        return monthlyPatchingOverride;
    }

    /**
     * User choice to upgrade both production and non-production environments at the same time.
     * Overrides the Fusion environment family setting.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("environmentMaintenanceOverride")
    private final MaintenancePolicy.EnvironmentMaintenanceOverride environmentMaintenanceOverride;

    /**
     * User choice to upgrade both production and non-production environments at the same time.
     * Overrides the Fusion environment family setting.
     *
     * @return the value
     */
    public MaintenancePolicy.EnvironmentMaintenanceOverride getEnvironmentMaintenanceOverride() {
        return environmentMaintenanceOverride;
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
        sb.append("GetMaintenancePolicyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("quarterlyUpgradeBeginTimes=")
                .append(String.valueOf(this.quarterlyUpgradeBeginTimes));
        sb.append(", monthlyPatchingOverride=")
                .append(String.valueOf(this.monthlyPatchingOverride));
        sb.append(", environmentMaintenanceOverride=")
                .append(String.valueOf(this.environmentMaintenanceOverride));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GetMaintenancePolicyDetails)) {
            return false;
        }

        GetMaintenancePolicyDetails other = (GetMaintenancePolicyDetails) o;
        return java.util.Objects.equals(
                        this.quarterlyUpgradeBeginTimes, other.quarterlyUpgradeBeginTimes)
                && java.util.Objects.equals(
                        this.monthlyPatchingOverride, other.monthlyPatchingOverride)
                && java.util.Objects.equals(
                        this.environmentMaintenanceOverride, other.environmentMaintenanceOverride)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.quarterlyUpgradeBeginTimes == null
                                ? 43
                                : this.quarterlyUpgradeBeginTimes.hashCode());
        result =
                (result * PRIME)
                        + (this.monthlyPatchingOverride == null
                                ? 43
                                : this.monthlyPatchingOverride.hashCode());
        result =
                (result * PRIME)
                        + (this.environmentMaintenanceOverride == null
                                ? 43
                                : this.environmentMaintenanceOverride.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
