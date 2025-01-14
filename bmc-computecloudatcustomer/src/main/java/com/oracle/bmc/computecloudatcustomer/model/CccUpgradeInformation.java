/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computecloudatcustomer.model;

/**
 * Upgrade information that relates to a Compute Cloud@Customer infrastructure. This information
 * cannot be updated. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221208")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CccUpgradeInformation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CccUpgradeInformation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "currentVersion",
        "timeOfScheduledUpgrade",
        "scheduledUpgradeDuration",
        "isActive"
    })
    public CccUpgradeInformation(
            String currentVersion,
            java.util.Date timeOfScheduledUpgrade,
            String scheduledUpgradeDuration,
            Boolean isActive) {
        super();
        this.currentVersion = currentVersion;
        this.timeOfScheduledUpgrade = timeOfScheduledUpgrade;
        this.scheduledUpgradeDuration = scheduledUpgradeDuration;
        this.isActive = isActive;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The current version of software installed on the Compute Cloud@Customer infrastructure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("currentVersion")
        private String currentVersion;

        /**
         * The current version of software installed on the Compute Cloud@Customer infrastructure.
         *
         * @param currentVersion the value to set
         * @return this builder
         */
        public Builder currentVersion(String currentVersion) {
            this.currentVersion = currentVersion;
            this.__explicitlySet__.add("currentVersion");
            return this;
        }
        /**
         * Compute Cloud@Customer infrastructure next upgrade time. The rack might have performance
         * impacts during this time.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfScheduledUpgrade")
        private java.util.Date timeOfScheduledUpgrade;

        /**
         * Compute Cloud@Customer infrastructure next upgrade time. The rack might have performance
         * impacts during this time.
         *
         * @param timeOfScheduledUpgrade the value to set
         * @return this builder
         */
        public Builder timeOfScheduledUpgrade(java.util.Date timeOfScheduledUpgrade) {
            this.timeOfScheduledUpgrade = timeOfScheduledUpgrade;
            this.__explicitlySet__.add("timeOfScheduledUpgrade");
            return this;
        }
        /**
         * Expected duration of Compute Cloud@Customer infrastructure scheduled upgrade. The actual
         * upgrade time might be longer or shorter than this duration depending on rack activity,
         * this is only an estimate.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("scheduledUpgradeDuration")
        private String scheduledUpgradeDuration;

        /**
         * Expected duration of Compute Cloud@Customer infrastructure scheduled upgrade. The actual
         * upgrade time might be longer or shorter than this duration depending on rack activity,
         * this is only an estimate.
         *
         * @param scheduledUpgradeDuration the value to set
         * @return this builder
         */
        public Builder scheduledUpgradeDuration(String scheduledUpgradeDuration) {
            this.scheduledUpgradeDuration = scheduledUpgradeDuration;
            this.__explicitlySet__.add("scheduledUpgradeDuration");
            return this;
        }
        /**
         * Indication that the Compute Cloud@Customer infrastructure is in the process of an upgrade
         * or an upgrade activity (such as preloading upgrade images).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isActive")
        private Boolean isActive;

        /**
         * Indication that the Compute Cloud@Customer infrastructure is in the process of an upgrade
         * or an upgrade activity (such as preloading upgrade images).
         *
         * @param isActive the value to set
         * @return this builder
         */
        public Builder isActive(Boolean isActive) {
            this.isActive = isActive;
            this.__explicitlySet__.add("isActive");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CccUpgradeInformation build() {
            CccUpgradeInformation model =
                    new CccUpgradeInformation(
                            this.currentVersion,
                            this.timeOfScheduledUpgrade,
                            this.scheduledUpgradeDuration,
                            this.isActive);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CccUpgradeInformation model) {
            if (model.wasPropertyExplicitlySet("currentVersion")) {
                this.currentVersion(model.getCurrentVersion());
            }
            if (model.wasPropertyExplicitlySet("timeOfScheduledUpgrade")) {
                this.timeOfScheduledUpgrade(model.getTimeOfScheduledUpgrade());
            }
            if (model.wasPropertyExplicitlySet("scheduledUpgradeDuration")) {
                this.scheduledUpgradeDuration(model.getScheduledUpgradeDuration());
            }
            if (model.wasPropertyExplicitlySet("isActive")) {
                this.isActive(model.getIsActive());
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

    /** The current version of software installed on the Compute Cloud@Customer infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("currentVersion")
    private final String currentVersion;

    /**
     * The current version of software installed on the Compute Cloud@Customer infrastructure.
     *
     * @return the value
     */
    public String getCurrentVersion() {
        return currentVersion;
    }

    /**
     * Compute Cloud@Customer infrastructure next upgrade time. The rack might have performance
     * impacts during this time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfScheduledUpgrade")
    private final java.util.Date timeOfScheduledUpgrade;

    /**
     * Compute Cloud@Customer infrastructure next upgrade time. The rack might have performance
     * impacts during this time.
     *
     * @return the value
     */
    public java.util.Date getTimeOfScheduledUpgrade() {
        return timeOfScheduledUpgrade;
    }

    /**
     * Expected duration of Compute Cloud@Customer infrastructure scheduled upgrade. The actual
     * upgrade time might be longer or shorter than this duration depending on rack activity, this
     * is only an estimate.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scheduledUpgradeDuration")
    private final String scheduledUpgradeDuration;

    /**
     * Expected duration of Compute Cloud@Customer infrastructure scheduled upgrade. The actual
     * upgrade time might be longer or shorter than this duration depending on rack activity, this
     * is only an estimate.
     *
     * @return the value
     */
    public String getScheduledUpgradeDuration() {
        return scheduledUpgradeDuration;
    }

    /**
     * Indication that the Compute Cloud@Customer infrastructure is in the process of an upgrade or
     * an upgrade activity (such as preloading upgrade images).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isActive")
    private final Boolean isActive;

    /**
     * Indication that the Compute Cloud@Customer infrastructure is in the process of an upgrade or
     * an upgrade activity (such as preloading upgrade images).
     *
     * @return the value
     */
    public Boolean getIsActive() {
        return isActive;
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
        sb.append("CccUpgradeInformation(");
        sb.append("super=").append(super.toString());
        sb.append("currentVersion=").append(String.valueOf(this.currentVersion));
        sb.append(", timeOfScheduledUpgrade=").append(String.valueOf(this.timeOfScheduledUpgrade));
        sb.append(", scheduledUpgradeDuration=")
                .append(String.valueOf(this.scheduledUpgradeDuration));
        sb.append(", isActive=").append(String.valueOf(this.isActive));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CccUpgradeInformation)) {
            return false;
        }

        CccUpgradeInformation other = (CccUpgradeInformation) o;
        return java.util.Objects.equals(this.currentVersion, other.currentVersion)
                && java.util.Objects.equals(
                        this.timeOfScheduledUpgrade, other.timeOfScheduledUpgrade)
                && java.util.Objects.equals(
                        this.scheduledUpgradeDuration, other.scheduledUpgradeDuration)
                && java.util.Objects.equals(this.isActive, other.isActive)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.currentVersion == null ? 43 : this.currentVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfScheduledUpgrade == null
                                ? 43
                                : this.timeOfScheduledUpgrade.hashCode());
        result =
                (result * PRIME)
                        + (this.scheduledUpgradeDuration == null
                                ? 43
                                : this.scheduledUpgradeDuration.hashCode());
        result = (result * PRIME) + (this.isActive == null ? 43 : this.isActive.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
