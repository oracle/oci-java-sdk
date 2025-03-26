/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Specifies the properties necessary for cloud automation updates. This includes modifying the apply update time preference, enabling or disabling early adoption, and enabling, modifying, or disabling the update freeze period.
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
    builder = CloudAutomationUpdateDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CloudAutomationUpdateDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isEarlyAdoptionEnabled",
        "isFreezePeriodEnabled",
        "applyUpdateTimePreference",
        "freezePeriod"
    })
    public CloudAutomationUpdateDetails(
            Boolean isEarlyAdoptionEnabled,
            Boolean isFreezePeriodEnabled,
            CloudAutomationApplyUpdateTimePreference applyUpdateTimePreference,
            CloudAutomationFreezePeriod freezePeriod) {
        super();
        this.isEarlyAdoptionEnabled = isEarlyAdoptionEnabled;
        this.isFreezePeriodEnabled = isFreezePeriodEnabled;
        this.applyUpdateTimePreference = applyUpdateTimePreference;
        this.freezePeriod = freezePeriod;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Annotates whether the cluster should be part of early access to apply VM cloud automation software updates. Those clusters annotated as early access will download the software bits for cloud automation in the first week after the update is available, while other clusters will have to wait until the following week.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEarlyAdoptionEnabled")
        private Boolean isEarlyAdoptionEnabled;

        /**
         * Annotates whether the cluster should be part of early access to apply VM cloud automation software updates. Those clusters annotated as early access will download the software bits for cloud automation in the first week after the update is available, while other clusters will have to wait until the following week.
         *
         * @param isEarlyAdoptionEnabled the value to set
         * @return this builder
         **/
        public Builder isEarlyAdoptionEnabled(Boolean isEarlyAdoptionEnabled) {
            this.isEarlyAdoptionEnabled = isEarlyAdoptionEnabled;
            this.__explicitlySet__.add("isEarlyAdoptionEnabled");
            return this;
        }
        /**
         * Specifies if the freeze period is enabled for the VM cluster to prevent the VMs from receiving cloud automation software updates during critical business cycles. Freeze period starts at 12:00 AM UTC and ends at 11:59:59 PM UTC on the selected date. Ensure that the freezing period does not exceed 45 days.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isFreezePeriodEnabled")
        private Boolean isFreezePeriodEnabled;

        /**
         * Specifies if the freeze period is enabled for the VM cluster to prevent the VMs from receiving cloud automation software updates during critical business cycles. Freeze period starts at 12:00 AM UTC and ends at 11:59:59 PM UTC on the selected date. Ensure that the freezing period does not exceed 45 days.
         *
         * @param isFreezePeriodEnabled the value to set
         * @return this builder
         **/
        public Builder isFreezePeriodEnabled(Boolean isFreezePeriodEnabled) {
            this.isFreezePeriodEnabled = isFreezePeriodEnabled;
            this.__explicitlySet__.add("isFreezePeriodEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applyUpdateTimePreference")
        private CloudAutomationApplyUpdateTimePreference applyUpdateTimePreference;

        public Builder applyUpdateTimePreference(
                CloudAutomationApplyUpdateTimePreference applyUpdateTimePreference) {
            this.applyUpdateTimePreference = applyUpdateTimePreference;
            this.__explicitlySet__.add("applyUpdateTimePreference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freezePeriod")
        private CloudAutomationFreezePeriod freezePeriod;

        public Builder freezePeriod(CloudAutomationFreezePeriod freezePeriod) {
            this.freezePeriod = freezePeriod;
            this.__explicitlySet__.add("freezePeriod");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CloudAutomationUpdateDetails build() {
            CloudAutomationUpdateDetails model =
                    new CloudAutomationUpdateDetails(
                            this.isEarlyAdoptionEnabled,
                            this.isFreezePeriodEnabled,
                            this.applyUpdateTimePreference,
                            this.freezePeriod);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloudAutomationUpdateDetails model) {
            if (model.wasPropertyExplicitlySet("isEarlyAdoptionEnabled")) {
                this.isEarlyAdoptionEnabled(model.getIsEarlyAdoptionEnabled());
            }
            if (model.wasPropertyExplicitlySet("isFreezePeriodEnabled")) {
                this.isFreezePeriodEnabled(model.getIsFreezePeriodEnabled());
            }
            if (model.wasPropertyExplicitlySet("applyUpdateTimePreference")) {
                this.applyUpdateTimePreference(model.getApplyUpdateTimePreference());
            }
            if (model.wasPropertyExplicitlySet("freezePeriod")) {
                this.freezePeriod(model.getFreezePeriod());
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
     * Annotates whether the cluster should be part of early access to apply VM cloud automation software updates. Those clusters annotated as early access will download the software bits for cloud automation in the first week after the update is available, while other clusters will have to wait until the following week.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEarlyAdoptionEnabled")
    private final Boolean isEarlyAdoptionEnabled;

    /**
     * Annotates whether the cluster should be part of early access to apply VM cloud automation software updates. Those clusters annotated as early access will download the software bits for cloud automation in the first week after the update is available, while other clusters will have to wait until the following week.
     *
     * @return the value
     **/
    public Boolean getIsEarlyAdoptionEnabled() {
        return isEarlyAdoptionEnabled;
    }

    /**
     * Specifies if the freeze period is enabled for the VM cluster to prevent the VMs from receiving cloud automation software updates during critical business cycles. Freeze period starts at 12:00 AM UTC and ends at 11:59:59 PM UTC on the selected date. Ensure that the freezing period does not exceed 45 days.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isFreezePeriodEnabled")
    private final Boolean isFreezePeriodEnabled;

    /**
     * Specifies if the freeze period is enabled for the VM cluster to prevent the VMs from receiving cloud automation software updates during critical business cycles. Freeze period starts at 12:00 AM UTC and ends at 11:59:59 PM UTC on the selected date. Ensure that the freezing period does not exceed 45 days.
     *
     * @return the value
     **/
    public Boolean getIsFreezePeriodEnabled() {
        return isFreezePeriodEnabled;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("applyUpdateTimePreference")
    private final CloudAutomationApplyUpdateTimePreference applyUpdateTimePreference;

    public CloudAutomationApplyUpdateTimePreference getApplyUpdateTimePreference() {
        return applyUpdateTimePreference;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("freezePeriod")
    private final CloudAutomationFreezePeriod freezePeriod;

    public CloudAutomationFreezePeriod getFreezePeriod() {
        return freezePeriod;
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
        sb.append("CloudAutomationUpdateDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isEarlyAdoptionEnabled=").append(String.valueOf(this.isEarlyAdoptionEnabled));
        sb.append(", isFreezePeriodEnabled=").append(String.valueOf(this.isFreezePeriodEnabled));
        sb.append(", applyUpdateTimePreference=")
                .append(String.valueOf(this.applyUpdateTimePreference));
        sb.append(", freezePeriod=").append(String.valueOf(this.freezePeriod));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CloudAutomationUpdateDetails)) {
            return false;
        }

        CloudAutomationUpdateDetails other = (CloudAutomationUpdateDetails) o;
        return java.util.Objects.equals(this.isEarlyAdoptionEnabled, other.isEarlyAdoptionEnabled)
                && java.util.Objects.equals(this.isFreezePeriodEnabled, other.isFreezePeriodEnabled)
                && java.util.Objects.equals(
                        this.applyUpdateTimePreference, other.applyUpdateTimePreference)
                && java.util.Objects.equals(this.freezePeriod, other.freezePeriod)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isEarlyAdoptionEnabled == null
                                ? 43
                                : this.isEarlyAdoptionEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isFreezePeriodEnabled == null
                                ? 43
                                : this.isFreezePeriodEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.applyUpdateTimePreference == null
                                ? 43
                                : this.applyUpdateTimePreference.hashCode());
        result = (result * PRIME) + (this.freezePeriod == null ? 43 : this.freezePeriod.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
