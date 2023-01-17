/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * The policy that specifies the maintenance and upgrade preferences for an environment. For more information about the options, see [Understanding Environment Maintenance](https://docs.cloud.oracle.com/iaas/Content/fusion-applications/plan-environment-family.htm#about-env-maintenance).
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FamilyMaintenancePolicy.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FamilyMaintenancePolicy
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "quarterlyUpgradeBeginTimes",
        "isMonthlyPatchingEnabled",
        "concurrentMaintenance"
    })
    public FamilyMaintenancePolicy(
            String quarterlyUpgradeBeginTimes,
            Boolean isMonthlyPatchingEnabled,
            ConcurrentMaintenance concurrentMaintenance) {
        super();
        this.quarterlyUpgradeBeginTimes = quarterlyUpgradeBeginTimes;
        this.isMonthlyPatchingEnabled = isMonthlyPatchingEnabled;
        this.concurrentMaintenance = concurrentMaintenance;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The quarterly maintenance month group schedule of the Fusion environment family.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("quarterlyUpgradeBeginTimes")
        private String quarterlyUpgradeBeginTimes;

        /**
         * The quarterly maintenance month group schedule of the Fusion environment family.
         * @param quarterlyUpgradeBeginTimes the value to set
         * @return this builder
         **/
        public Builder quarterlyUpgradeBeginTimes(String quarterlyUpgradeBeginTimes) {
            this.quarterlyUpgradeBeginTimes = quarterlyUpgradeBeginTimes;
            this.__explicitlySet__.add("quarterlyUpgradeBeginTimes");
            return this;
        }
        /**
         * When True, monthly patching is enabled for the environment family.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isMonthlyPatchingEnabled")
        private Boolean isMonthlyPatchingEnabled;

        /**
         * When True, monthly patching is enabled for the environment family.
         * @param isMonthlyPatchingEnabled the value to set
         * @return this builder
         **/
        public Builder isMonthlyPatchingEnabled(Boolean isMonthlyPatchingEnabled) {
            this.isMonthlyPatchingEnabled = isMonthlyPatchingEnabled;
            this.__explicitlySet__.add("isMonthlyPatchingEnabled");
            return this;
        }
        /**
         * Option to upgrade both production and non-production environments at the same time. When set to PROD both types of environnments are upgraded on the production schedule. When set to NON_PROD both types of environments are upgraded on the non-production schedule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("concurrentMaintenance")
        private ConcurrentMaintenance concurrentMaintenance;

        /**
         * Option to upgrade both production and non-production environments at the same time. When set to PROD both types of environnments are upgraded on the production schedule. When set to NON_PROD both types of environments are upgraded on the non-production schedule.
         * @param concurrentMaintenance the value to set
         * @return this builder
         **/
        public Builder concurrentMaintenance(ConcurrentMaintenance concurrentMaintenance) {
            this.concurrentMaintenance = concurrentMaintenance;
            this.__explicitlySet__.add("concurrentMaintenance");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FamilyMaintenancePolicy build() {
            FamilyMaintenancePolicy model =
                    new FamilyMaintenancePolicy(
                            this.quarterlyUpgradeBeginTimes,
                            this.isMonthlyPatchingEnabled,
                            this.concurrentMaintenance);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FamilyMaintenancePolicy model) {
            if (model.wasPropertyExplicitlySet("quarterlyUpgradeBeginTimes")) {
                this.quarterlyUpgradeBeginTimes(model.getQuarterlyUpgradeBeginTimes());
            }
            if (model.wasPropertyExplicitlySet("isMonthlyPatchingEnabled")) {
                this.isMonthlyPatchingEnabled(model.getIsMonthlyPatchingEnabled());
            }
            if (model.wasPropertyExplicitlySet("concurrentMaintenance")) {
                this.concurrentMaintenance(model.getConcurrentMaintenance());
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
     * The quarterly maintenance month group schedule of the Fusion environment family.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quarterlyUpgradeBeginTimes")
    private final String quarterlyUpgradeBeginTimes;

    /**
     * The quarterly maintenance month group schedule of the Fusion environment family.
     * @return the value
     **/
    public String getQuarterlyUpgradeBeginTimes() {
        return quarterlyUpgradeBeginTimes;
    }

    /**
     * When True, monthly patching is enabled for the environment family.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMonthlyPatchingEnabled")
    private final Boolean isMonthlyPatchingEnabled;

    /**
     * When True, monthly patching is enabled for the environment family.
     * @return the value
     **/
    public Boolean getIsMonthlyPatchingEnabled() {
        return isMonthlyPatchingEnabled;
    }

    /**
     * Option to upgrade both production and non-production environments at the same time. When set to PROD both types of environnments are upgraded on the production schedule. When set to NON_PROD both types of environments are upgraded on the non-production schedule.
     **/
    public enum ConcurrentMaintenance {
        Prod("PROD"),
        NonProd("NON_PROD"),
        Disabled("DISABLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ConcurrentMaintenance.class);

        private final String value;
        private static java.util.Map<String, ConcurrentMaintenance> map;

        static {
            map = new java.util.HashMap<>();
            for (ConcurrentMaintenance v : ConcurrentMaintenance.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ConcurrentMaintenance(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ConcurrentMaintenance create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ConcurrentMaintenance', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Option to upgrade both production and non-production environments at the same time. When set to PROD both types of environnments are upgraded on the production schedule. When set to NON_PROD both types of environments are upgraded on the non-production schedule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("concurrentMaintenance")
    private final ConcurrentMaintenance concurrentMaintenance;

    /**
     * Option to upgrade both production and non-production environments at the same time. When set to PROD both types of environnments are upgraded on the production schedule. When set to NON_PROD both types of environments are upgraded on the non-production schedule.
     * @return the value
     **/
    public ConcurrentMaintenance getConcurrentMaintenance() {
        return concurrentMaintenance;
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
        sb.append("FamilyMaintenancePolicy(");
        sb.append("super=").append(super.toString());
        sb.append("quarterlyUpgradeBeginTimes=")
                .append(String.valueOf(this.quarterlyUpgradeBeginTimes));
        sb.append(", isMonthlyPatchingEnabled=")
                .append(String.valueOf(this.isMonthlyPatchingEnabled));
        sb.append(", concurrentMaintenance=").append(String.valueOf(this.concurrentMaintenance));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FamilyMaintenancePolicy)) {
            return false;
        }

        FamilyMaintenancePolicy other = (FamilyMaintenancePolicy) o;
        return java.util.Objects.equals(
                        this.quarterlyUpgradeBeginTimes, other.quarterlyUpgradeBeginTimes)
                && java.util.Objects.equals(
                        this.isMonthlyPatchingEnabled, other.isMonthlyPatchingEnabled)
                && java.util.Objects.equals(this.concurrentMaintenance, other.concurrentMaintenance)
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
                        + (this.isMonthlyPatchingEnabled == null
                                ? 43
                                : this.isMonthlyPatchingEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.concurrentMaintenance == null
                                ? 43
                                : this.concurrentMaintenance.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
