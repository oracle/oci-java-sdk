/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Describes the modification parameters for the maintenance run. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateMaintenanceRunDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateMaintenanceRunDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        "isResumePatching",
        "targetDbServerVersion",
        "targetStorageServerVersion"
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
            Boolean isResumePatching,
            String targetDbServerVersion,
            String targetStorageServerVersion) {
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
        this.targetDbServerVersion = targetDbServerVersion;
        this.targetStorageServerVersion = targetStorageServerVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** If {@code FALSE}, skips the maintenance run. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * If {@code FALSE}, skips the maintenance run.
         *
         * @param isEnabled the value to set
         * @return this builder
         */
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /** The scheduled date and time of the maintenance run to update. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
        private java.util.Date timeScheduled;

        /**
         * The scheduled date and time of the maintenance run to update.
         *
         * @param timeScheduled the value to set
         * @return this builder
         */
        public Builder timeScheduled(java.util.Date timeScheduled) {
            this.timeScheduled = timeScheduled;
            this.__explicitlySet__.add("timeScheduled");
            return this;
        }
        /** If set to {@code TRUE}, starts patching immediately. */
        @com.fasterxml.jackson.annotation.JsonProperty("isPatchNowEnabled")
        private Boolean isPatchNowEnabled;

        /**
         * If set to {@code TRUE}, starts patching immediately.
         *
         * @param isPatchNowEnabled the value to set
         * @return this builder
         */
        public Builder isPatchNowEnabled(Boolean isPatchNowEnabled) {
            this.isPatchNowEnabled = isPatchNowEnabled;
            this.__explicitlySet__.add("isPatchNowEnabled");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * patch to be applied in the maintenance run.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("patchId")
        private String patchId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * patch to be applied in the maintenance run.
         *
         * @param patchId the value to set
         * @return this builder
         */
        public Builder patchId(String patchId) {
            this.patchId = patchId;
            this.__explicitlySet__.add("patchId");
            return this;
        }
        /**
         * Cloud Exadata infrastructure node patching method, either "ROLLING" or "NONROLLING".
         * Default value is ROLLING.
         *
         * <p>IMPORTANT*: Non-rolling infrastructure patching involves system down time. See
         * [Oracle-Managed Infrastructure Maintenance
         * Updates](https://docs.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle)
         * for more information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("patchingMode")
        private PatchingMode patchingMode;

        /**
         * Cloud Exadata infrastructure node patching method, either "ROLLING" or "NONROLLING".
         * Default value is ROLLING.
         *
         * <p>IMPORTANT*: Non-rolling infrastructure patching involves system down time. See
         * [Oracle-Managed Infrastructure Maintenance
         * Updates](https://docs.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle)
         * for more information.
         *
         * @param patchingMode the value to set
         * @return this builder
         */
        public Builder patchingMode(PatchingMode patchingMode) {
            this.patchingMode = patchingMode;
            this.__explicitlySet__.add("patchingMode");
            return this;
        }
        /**
         * If true, enables the configuration of a custom action timeout (waiting period) between
         * database servers patching operations.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isCustomActionTimeoutEnabled")
        private Boolean isCustomActionTimeoutEnabled;

        /**
         * If true, enables the configuration of a custom action timeout (waiting period) between
         * database servers patching operations.
         *
         * @param isCustomActionTimeoutEnabled the value to set
         * @return this builder
         */
        public Builder isCustomActionTimeoutEnabled(Boolean isCustomActionTimeoutEnabled) {
            this.isCustomActionTimeoutEnabled = isCustomActionTimeoutEnabled;
            this.__explicitlySet__.add("isCustomActionTimeoutEnabled");
            return this;
        }
        /**
         * Determines the amount of time the system will wait before the start of each database
         * server patching operation. Specify a number of minutes from 15 to 120.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("customActionTimeoutInMins")
        private Integer customActionTimeoutInMins;

        /**
         * Determines the amount of time the system will wait before the start of each database
         * server patching operation. Specify a number of minutes from 15 to 120.
         *
         * @param customActionTimeoutInMins the value to set
         * @return this builder
         */
        public Builder customActionTimeoutInMins(Integer customActionTimeoutInMins) {
            this.customActionTimeoutInMins = customActionTimeoutInMins;
            this.__explicitlySet__.add("customActionTimeoutInMins");
            return this;
        }
        /**
         * The current custom action timeout between the current database servers during waiting
         * state in addition to custom action timeout, from 0 (zero) to 30 minutes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("currentCustomActionTimeoutInMins")
        private Integer currentCustomActionTimeoutInMins;

        /**
         * The current custom action timeout between the current database servers during waiting
         * state in addition to custom action timeout, from 0 (zero) to 30 minutes.
         *
         * @param currentCustomActionTimeoutInMins the value to set
         * @return this builder
         */
        public Builder currentCustomActionTimeoutInMins(Integer currentCustomActionTimeoutInMins) {
            this.currentCustomActionTimeoutInMins = currentCustomActionTimeoutInMins;
            this.__explicitlySet__.add("currentCustomActionTimeoutInMins");
            return this;
        }
        /**
         * If true, then the patching is resumed and the next component will be patched immediately.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isResumePatching")
        private Boolean isResumePatching;

        /**
         * If true, then the patching is resumed and the next component will be patched immediately.
         *
         * @param isResumePatching the value to set
         * @return this builder
         */
        public Builder isResumePatching(Boolean isResumePatching) {
            this.isResumePatching = isResumePatching;
            this.__explicitlySet__.add("isResumePatching");
            return this;
        }
        /** The target database server system software version for the patching operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetDbServerVersion")
        private String targetDbServerVersion;

        /**
         * The target database server system software version for the patching operation.
         *
         * @param targetDbServerVersion the value to set
         * @return this builder
         */
        public Builder targetDbServerVersion(String targetDbServerVersion) {
            this.targetDbServerVersion = targetDbServerVersion;
            this.__explicitlySet__.add("targetDbServerVersion");
            return this;
        }
        /** The target storage cell system software version for the patching operation. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetStorageServerVersion")
        private String targetStorageServerVersion;

        /**
         * The target storage cell system software version for the patching operation.
         *
         * @param targetStorageServerVersion the value to set
         * @return this builder
         */
        public Builder targetStorageServerVersion(String targetStorageServerVersion) {
            this.targetStorageServerVersion = targetStorageServerVersion;
            this.__explicitlySet__.add("targetStorageServerVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateMaintenanceRunDetails build() {
            UpdateMaintenanceRunDetails model =
                    new UpdateMaintenanceRunDetails(
                            this.isEnabled,
                            this.timeScheduled,
                            this.isPatchNowEnabled,
                            this.patchId,
                            this.patchingMode,
                            this.isCustomActionTimeoutEnabled,
                            this.customActionTimeoutInMins,
                            this.currentCustomActionTimeoutInMins,
                            this.isResumePatching,
                            this.targetDbServerVersion,
                            this.targetStorageServerVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateMaintenanceRunDetails model) {
            if (model.wasPropertyExplicitlySet("isEnabled")) {
                this.isEnabled(model.getIsEnabled());
            }
            if (model.wasPropertyExplicitlySet("timeScheduled")) {
                this.timeScheduled(model.getTimeScheduled());
            }
            if (model.wasPropertyExplicitlySet("isPatchNowEnabled")) {
                this.isPatchNowEnabled(model.getIsPatchNowEnabled());
            }
            if (model.wasPropertyExplicitlySet("patchId")) {
                this.patchId(model.getPatchId());
            }
            if (model.wasPropertyExplicitlySet("patchingMode")) {
                this.patchingMode(model.getPatchingMode());
            }
            if (model.wasPropertyExplicitlySet("isCustomActionTimeoutEnabled")) {
                this.isCustomActionTimeoutEnabled(model.getIsCustomActionTimeoutEnabled());
            }
            if (model.wasPropertyExplicitlySet("customActionTimeoutInMins")) {
                this.customActionTimeoutInMins(model.getCustomActionTimeoutInMins());
            }
            if (model.wasPropertyExplicitlySet("currentCustomActionTimeoutInMins")) {
                this.currentCustomActionTimeoutInMins(model.getCurrentCustomActionTimeoutInMins());
            }
            if (model.wasPropertyExplicitlySet("isResumePatching")) {
                this.isResumePatching(model.getIsResumePatching());
            }
            if (model.wasPropertyExplicitlySet("targetDbServerVersion")) {
                this.targetDbServerVersion(model.getTargetDbServerVersion());
            }
            if (model.wasPropertyExplicitlySet("targetStorageServerVersion")) {
                this.targetStorageServerVersion(model.getTargetStorageServerVersion());
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

    /** If {@code FALSE}, skips the maintenance run. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * If {@code FALSE}, skips the maintenance run.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /** The scheduled date and time of the maintenance run to update. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduled")
    private final java.util.Date timeScheduled;

    /**
     * The scheduled date and time of the maintenance run to update.
     *
     * @return the value
     */
    public java.util.Date getTimeScheduled() {
        return timeScheduled;
    }

    /** If set to {@code TRUE}, starts patching immediately. */
    @com.fasterxml.jackson.annotation.JsonProperty("isPatchNowEnabled")
    private final Boolean isPatchNowEnabled;

    /**
     * If set to {@code TRUE}, starts patching immediately.
     *
     * @return the value
     */
    public Boolean getIsPatchNowEnabled() {
        return isPatchNowEnabled;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * patch to be applied in the maintenance run.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patchId")
    private final String patchId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * patch to be applied in the maintenance run.
     *
     * @return the value
     */
    public String getPatchId() {
        return patchId;
    }

    /**
     * Cloud Exadata infrastructure node patching method, either "ROLLING" or "NONROLLING". Default
     * value is ROLLING.
     *
     * <p>IMPORTANT*: Non-rolling infrastructure patching involves system down time. See
     * [Oracle-Managed Infrastructure Maintenance
     * Updates](https://docs.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle)
     * for more information.
     */
    public enum PatchingMode implements com.oracle.bmc.http.internal.BmcEnum {
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
     * Cloud Exadata infrastructure node patching method, either "ROLLING" or "NONROLLING". Default
     * value is ROLLING.
     *
     * <p>IMPORTANT*: Non-rolling infrastructure patching involves system down time. See
     * [Oracle-Managed Infrastructure Maintenance
     * Updates](https://docs.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle)
     * for more information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patchingMode")
    private final PatchingMode patchingMode;

    /**
     * Cloud Exadata infrastructure node patching method, either "ROLLING" or "NONROLLING". Default
     * value is ROLLING.
     *
     * <p>IMPORTANT*: Non-rolling infrastructure patching involves system down time. See
     * [Oracle-Managed Infrastructure Maintenance
     * Updates](https://docs.oracle.com/iaas/Content/Database/Concepts/examaintenance.htm#Oracle)
     * for more information.
     *
     * @return the value
     */
    public PatchingMode getPatchingMode() {
        return patchingMode;
    }

    /**
     * If true, enables the configuration of a custom action timeout (waiting period) between
     * database servers patching operations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isCustomActionTimeoutEnabled")
    private final Boolean isCustomActionTimeoutEnabled;

    /**
     * If true, enables the configuration of a custom action timeout (waiting period) between
     * database servers patching operations.
     *
     * @return the value
     */
    public Boolean getIsCustomActionTimeoutEnabled() {
        return isCustomActionTimeoutEnabled;
    }

    /**
     * Determines the amount of time the system will wait before the start of each database server
     * patching operation. Specify a number of minutes from 15 to 120.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("customActionTimeoutInMins")
    private final Integer customActionTimeoutInMins;

    /**
     * Determines the amount of time the system will wait before the start of each database server
     * patching operation. Specify a number of minutes from 15 to 120.
     *
     * @return the value
     */
    public Integer getCustomActionTimeoutInMins() {
        return customActionTimeoutInMins;
    }

    /**
     * The current custom action timeout between the current database servers during waiting state
     * in addition to custom action timeout, from 0 (zero) to 30 minutes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("currentCustomActionTimeoutInMins")
    private final Integer currentCustomActionTimeoutInMins;

    /**
     * The current custom action timeout between the current database servers during waiting state
     * in addition to custom action timeout, from 0 (zero) to 30 minutes.
     *
     * @return the value
     */
    public Integer getCurrentCustomActionTimeoutInMins() {
        return currentCustomActionTimeoutInMins;
    }

    /** If true, then the patching is resumed and the next component will be patched immediately. */
    @com.fasterxml.jackson.annotation.JsonProperty("isResumePatching")
    private final Boolean isResumePatching;

    /**
     * If true, then the patching is resumed and the next component will be patched immediately.
     *
     * @return the value
     */
    public Boolean getIsResumePatching() {
        return isResumePatching;
    }

    /** The target database server system software version for the patching operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetDbServerVersion")
    private final String targetDbServerVersion;

    /**
     * The target database server system software version for the patching operation.
     *
     * @return the value
     */
    public String getTargetDbServerVersion() {
        return targetDbServerVersion;
    }

    /** The target storage cell system software version for the patching operation. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetStorageServerVersion")
    private final String targetStorageServerVersion;

    /**
     * The target storage cell system software version for the patching operation.
     *
     * @return the value
     */
    public String getTargetStorageServerVersion() {
        return targetStorageServerVersion;
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
        sb.append("UpdateMaintenanceRunDetails(");
        sb.append("super=").append(super.toString());
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
        sb.append(", targetDbServerVersion=").append(String.valueOf(this.targetDbServerVersion));
        sb.append(", targetStorageServerVersion=")
                .append(String.valueOf(this.targetStorageServerVersion));
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
                && java.util.Objects.equals(this.targetDbServerVersion, other.targetDbServerVersion)
                && java.util.Objects.equals(
                        this.targetStorageServerVersion, other.targetStorageServerVersion)
                && super.equals(other);
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
                        + (this.targetDbServerVersion == null
                                ? 43
                                : this.targetDbServerVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.targetStorageServerVersion == null
                                ? 43
                                : this.targetStorageServerVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
