/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
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
        builder = MaintenancePolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class MaintenancePolicy
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"monthlyPatchingOverride", "environmentMaintenanceOverride"})
    public MaintenancePolicy(
            MonthlyPatchingOverride monthlyPatchingOverride,
            EnvironmentMaintenanceOverride environmentMaintenanceOverride) {
        super();
        this.monthlyPatchingOverride = monthlyPatchingOverride;
        this.environmentMaintenanceOverride = environmentMaintenanceOverride;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * When "ENABLED", the Fusion environment is patched monthly. When "DISABLED", the Fusion
         * environment is not patched monthly. This setting overrides the environment family
         * setting. When not set, the environment follows the environment family policy.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("monthlyPatchingOverride")
        private MonthlyPatchingOverride monthlyPatchingOverride;

        /**
         * When "ENABLED", the Fusion environment is patched monthly. When "DISABLED", the Fusion
         * environment is not patched monthly. This setting overrides the environment family
         * setting. When not set, the environment follows the environment family policy.
         *
         * @param monthlyPatchingOverride the value to set
         * @return this builder
         */
        public Builder monthlyPatchingOverride(MonthlyPatchingOverride monthlyPatchingOverride) {
            this.monthlyPatchingOverride = monthlyPatchingOverride;
            this.__explicitlySet__.add("monthlyPatchingOverride");
            return this;
        }
        /**
         * User choice to upgrade both test and prod pods at the same time. Overrides fusion
         * environment families'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("environmentMaintenanceOverride")
        private EnvironmentMaintenanceOverride environmentMaintenanceOverride;

        /**
         * User choice to upgrade both test and prod pods at the same time. Overrides fusion
         * environment families'.
         *
         * @param environmentMaintenanceOverride the value to set
         * @return this builder
         */
        public Builder environmentMaintenanceOverride(
                EnvironmentMaintenanceOverride environmentMaintenanceOverride) {
            this.environmentMaintenanceOverride = environmentMaintenanceOverride;
            this.__explicitlySet__.add("environmentMaintenanceOverride");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaintenancePolicy build() {
            MaintenancePolicy model =
                    new MaintenancePolicy(
                            this.monthlyPatchingOverride, this.environmentMaintenanceOverride);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaintenancePolicy model) {
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

    /**
     * When "ENABLED", the Fusion environment is patched monthly. When "DISABLED", the Fusion
     * environment is not patched monthly. This setting overrides the environment family setting.
     * When not set, the environment follows the environment family policy.
     */
    public enum MonthlyPatchingOverride implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        None("NONE"),
        ;

        private final String value;
        private static java.util.Map<String, MonthlyPatchingOverride> map;

        static {
            map = new java.util.HashMap<>();
            for (MonthlyPatchingOverride v : MonthlyPatchingOverride.values()) {
                map.put(v.getValue(), v);
            }
        }

        MonthlyPatchingOverride(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MonthlyPatchingOverride create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid MonthlyPatchingOverride: " + key);
        }
    };
    /**
     * When "ENABLED", the Fusion environment is patched monthly. When "DISABLED", the Fusion
     * environment is not patched monthly. This setting overrides the environment family setting.
     * When not set, the environment follows the environment family policy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("monthlyPatchingOverride")
    private final MonthlyPatchingOverride monthlyPatchingOverride;

    /**
     * When "ENABLED", the Fusion environment is patched monthly. When "DISABLED", the Fusion
     * environment is not patched monthly. This setting overrides the environment family setting.
     * When not set, the environment follows the environment family policy.
     *
     * @return the value
     */
    public MonthlyPatchingOverride getMonthlyPatchingOverride() {
        return monthlyPatchingOverride;
    }

    /**
     * User choice to upgrade both test and prod pods at the same time. Overrides fusion environment
     * families'.
     */
    public enum EnvironmentMaintenanceOverride implements com.oracle.bmc.http.internal.BmcEnum {
        Prod("PROD"),
        NonProd("NON_PROD"),
        None("NONE"),
        ;

        private final String value;
        private static java.util.Map<String, EnvironmentMaintenanceOverride> map;

        static {
            map = new java.util.HashMap<>();
            for (EnvironmentMaintenanceOverride v : EnvironmentMaintenanceOverride.values()) {
                map.put(v.getValue(), v);
            }
        }

        EnvironmentMaintenanceOverride(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EnvironmentMaintenanceOverride create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid EnvironmentMaintenanceOverride: " + key);
        }
    };
    /**
     * User choice to upgrade both test and prod pods at the same time. Overrides fusion environment
     * families'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("environmentMaintenanceOverride")
    private final EnvironmentMaintenanceOverride environmentMaintenanceOverride;

    /**
     * User choice to upgrade both test and prod pods at the same time. Overrides fusion environment
     * families'.
     *
     * @return the value
     */
    public EnvironmentMaintenanceOverride getEnvironmentMaintenanceOverride() {
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
        sb.append("MaintenancePolicy(");
        sb.append("super=").append(super.toString());
        sb.append("monthlyPatchingOverride=").append(String.valueOf(this.monthlyPatchingOverride));
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
        if (!(o instanceof MaintenancePolicy)) {
            return false;
        }

        MaintenancePolicy other = (MaintenancePolicy) o;
        return java.util.Objects.equals(this.monthlyPatchingOverride, other.monthlyPatchingOverride)
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
