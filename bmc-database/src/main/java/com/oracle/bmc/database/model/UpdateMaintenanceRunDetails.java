/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Describes the modification parameters for the maintenance run.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateMaintenanceRunDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateMaintenanceRunDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isEnabled",
        "timeScheduled",
        "isPatchNowEnabled",
        "patchId",
        "patchingMode",
        "isCustomActionTimeoutEnabled",
        "customActionTimeoutInMins",
        "currentCustomActionTimeoutInMins",
        "isResumePatching"
    })
    public UpdateMaintenanceRunDetails(
            Boolean isEnabled,
            java.util.Date timeScheduled,
            Boolean isPatchNowEnabled,
            String patchId,
            PatchingMode patchingMode,
            Boolean isCustomActionTimeoutEnabled,
            Integer customActionTimeoutInMins,
            Integer currentCustomActionTimeoutInMins,
            Boolean isResumePatching) {
        super();
        this.isEnabled = isEnabled;
        this.timeScheduled = timeScheduled;
        this.isPatchNowEnabled = isPatchNowEnabled;
        this.patchId = patchId;
        this.patchingMode = patchingMode;
        this.isCustomActionTimeoutEnabled = isCustomActionTimeoutEnabled;
        this.customActionTimeoutInMins = customActionTimeoutInMins;
        this.currentCustomActionTimeoutInMins = currentCustomActionTimeoutInMins;
        this.isResumePatching = isResumePatching;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
        private java.util.Date timeScheduled;

        public Builder timeScheduled(java.util.Date timeScheduled) {
            this.timeScheduled = timeScheduled;
            this.__explicitlySet__.add("timeScheduled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isPatchNowEnabled")
        private Boolean isPatchNowEnabled;

        public Builder isPatchNowEnabled(Boolean isPatchNowEnabled) {
            this.isPatchNowEnabled = isPatchNowEnabled;
            this.__explicitlySet__.add("isPatchNowEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patchId")
        private String patchId;

        public Builder patchId(String patchId) {
            this.patchId = patchId;
            this.__explicitlySet__.add("patchId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patchingMode")
        private PatchingMode patchingMode;

        public Builder patchingMode(PatchingMode patchingMode) {
            this.patchingMode = patchingMode;
            this.__explicitlySet__.add("patchingMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCustomActionTimeoutEnabled")
        private Boolean isCustomActionTimeoutEnabled;

        public Builder isCustomActionTimeoutEnabled(Boolean isCustomActionTimeoutEnabled) {
            this.isCustomActionTimeoutEnabled = isCustomActionTimeoutEnabled;
            this.__explicitlySet__.add("isCustomActionTimeoutEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("customActionTimeoutInMins")
        private Integer customActionTimeoutInMins;

        public Builder customActionTimeoutInMins(Integer customActionTimeoutInMins) {
            this.customActionTimeoutInMins = customActionTimeoutInMins;
            this.__explicitlySet__.add("customActionTimeoutInMins");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currentCustomActionTimeoutInMins")
        private Integer currentCustomActionTimeoutInMins;

        public Builder currentCustomActionTimeoutInMins(Integer currentCustomActionTimeoutInMins) {
            this.currentCustomActionTimeoutInMins = currentCustomActionTimeoutInMins;
            this.__explicitlySet__.add("currentCustomActionTimeoutInMins");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isResumePatching")
        private Boolean isResumePatching;

        public Builder isResumePatching(Boolean isResumePatching) {
            this.isResumePatching = isResumePatching;
            this.__explicitlySet__.add("isResumePatching");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateMaintenanceRunDetails build() {
            UpdateMaintenanceRunDetails __instance__ =
                    new UpdateMaintenanceRunDetails(
                            isEnabled,
                            timeScheduled,
                            isPatchNowEnabled,
                            patchId,
                            patchingMode,
                            isCustomActionTimeoutEnabled,
                            customActionTimeoutInMins,
                            currentCustomActionTimeoutInMins,
                            isResumePatching);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateMaintenanceRunDetails o) {
            Builder copiedBuilder =
                    isEnabled(o.getIsEnabled())
                            .timeScheduled(o.getTimeScheduled())
                            .isPatchNowEnabled(o.getIsPatchNowEnabled())
                            .patchId(o.getPatchId())
                            .patchingMode(o.getPatchingMode())
                            .isCustomActionTimeoutEnabled(o.getIsCustomActionTimeoutEnabled())
                            .customActionTimeoutInMins(o.getCustomActionTimeoutInMins())
                            .currentCustomActionTimeoutInMins(
                                    o.getCurrentCustomActionTimeoutInMins())
                            .isResumePatching(o.getIsResumePatching());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * If {@code FALSE}, skips the maintenance run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * The scheduled date and time of the maintenance run to update.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
    private final java.util.Date timeScheduled;

    public java.util.Date getTimeScheduled() {
        return timeScheduled;
    }

    /**
     * If set to {@code TRUE}, starts patching immediately.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPatchNowEnabled")
    private final Boolean isPatchNowEnabled;

    public Boolean getIsPatchNowEnabled() {
        return isPatchNowEnabled;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the patch to be applied in the maintenance run.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchId")
    private final String patchId;

    public String getPatchId() {
        return patchId;
    }

    /**
     * Cloud Exadata infrastructure node patching method, either "ROLLING" or "NONROLLING". Default value is ROLLING.
     * <p>
     *IMPORTANT*: Non-rolling infrastructure patching involves system down time. See [Oracle-Managed Infrastructure Maintenance Updates](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle) for more information.
     *
     **/
    public enum PatchingMode {
        Rolling("ROLLING"),
        Nonrolling("NONROLLING"),
        ;

        private final String value;
        private static java.util.Map<String, PatchingMode> map;

        static {
            map = new java.util.HashMap<>();
            for (PatchingMode v : PatchingMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        PatchingMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PatchingMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PatchingMode: " + key);
        }
    };
    /**
     * Cloud Exadata infrastructure node patching method, either "ROLLING" or "NONROLLING". Default value is ROLLING.
     * <p>
     *IMPORTANT*: Non-rolling infrastructure patching involves system down time. See [Oracle-Managed Infrastructure Maintenance Updates](https://docs.cloud.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle) for more information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchingMode")
    private final PatchingMode patchingMode;

    public PatchingMode getPatchingMode() {
        return patchingMode;
    }

    /**
     * If true, enables the configuration of a custom action timeout (waiting period) between database servers patching operations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCustomActionTimeoutEnabled")
    private final Boolean isCustomActionTimeoutEnabled;

    public Boolean getIsCustomActionTimeoutEnabled() {
        return isCustomActionTimeoutEnabled;
    }

    /**
     * Determines the amount of time the system will wait before the start of each database server patching operation.
     * Specify a number of minutes from 15 to 120.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customActionTimeoutInMins")
    private final Integer customActionTimeoutInMins;

    public Integer getCustomActionTimeoutInMins() {
        return customActionTimeoutInMins;
    }

    /**
     * The current custom action timeout between the current database servers during waiting state in addition to custom action timeout, from 0 (zero) to 30 minutes.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentCustomActionTimeoutInMins")
    private final Integer currentCustomActionTimeoutInMins;

    public Integer getCurrentCustomActionTimeoutInMins() {
        return currentCustomActionTimeoutInMins;
    }

    /**
     * If true, then the patching is resumed and the next component will be patched immediately.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isResumePatching")
    private final Boolean isResumePatching;

    public Boolean getIsResumePatching() {
        return isResumePatching;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateMaintenanceRunDetails(");
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", timeScheduled=").append(String.valueOf(this.timeScheduled));
        sb.append(", isPatchNowEnabled=").append(String.valueOf(this.isPatchNowEnabled));
        sb.append(", patchId=").append(String.valueOf(this.patchId));
        sb.append(", patchingMode=").append(String.valueOf(this.patchingMode));
        sb.append(", isCustomActionTimeoutEnabled=")
                .append(String.valueOf(this.isCustomActionTimeoutEnabled));
        sb.append(", customActionTimeoutInMins=")
                .append(String.valueOf(this.customActionTimeoutInMins));
        sb.append(", currentCustomActionTimeoutInMins=")
                .append(String.valueOf(this.currentCustomActionTimeoutInMins));
        sb.append(", isResumePatching=").append(String.valueOf(this.isResumePatching));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateMaintenanceRunDetails)) {
            return false;
        }

        UpdateMaintenanceRunDetails other = (UpdateMaintenanceRunDetails) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.timeScheduled, other.timeScheduled)
                && java.util.Objects.equals(this.isPatchNowEnabled, other.isPatchNowEnabled)
                && java.util.Objects.equals(this.patchId, other.patchId)
                && java.util.Objects.equals(this.patchingMode, other.patchingMode)
                && java.util.Objects.equals(
                        this.isCustomActionTimeoutEnabled, other.isCustomActionTimeoutEnabled)
                && java.util.Objects.equals(
                        this.customActionTimeoutInMins, other.customActionTimeoutInMins)
                && java.util.Objects.equals(
                        this.currentCustomActionTimeoutInMins,
                        other.currentCustomActionTimeoutInMins)
                && java.util.Objects.equals(this.isResumePatching, other.isResumePatching)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScheduled == null ? 43 : this.timeScheduled.hashCode());
        result =
                (result * PRIME)
                        + (this.isPatchNowEnabled == null ? 43 : this.isPatchNowEnabled.hashCode());
        result = (result * PRIME) + (this.patchId == null ? 43 : this.patchId.hashCode());
        result = (result * PRIME) + (this.patchingMode == null ? 43 : this.patchingMode.hashCode());
        result =
                (result * PRIME)
                        + (this.isCustomActionTimeoutEnabled == null
                                ? 43
                                : this.isCustomActionTimeoutEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.customActionTimeoutInMins == null
                                ? 43
                                : this.customActionTimeoutInMins.hashCode());
        result =
                (result * PRIME)
                        + (this.currentCustomActionTimeoutInMins == null
                                ? 43
                                : this.currentCustomActionTimeoutInMins.hashCode());
        result =
                (result * PRIME)
                        + (this.isResumePatching == null ? 43 : this.isResumePatching.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
