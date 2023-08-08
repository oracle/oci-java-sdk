/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Defines the maintenance configuration for create operation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateMaintenanceConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateMaintenanceConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isInterimReleaseAutoUpgradeEnabled",
        "interimReleaseUpgradePeriodInDays",
        "bundleReleaseUpgradePeriodInDays",
        "majorReleaseUpgradePeriodInDays",
        "securityPatchUpgradePeriodInDays"
    })
    public CreateMaintenanceConfigurationDetails(
            Boolean isInterimReleaseAutoUpgradeEnabled,
            Integer interimReleaseUpgradePeriodInDays,
            Integer bundleReleaseUpgradePeriodInDays,
            Integer majorReleaseUpgradePeriodInDays,
            Integer securityPatchUpgradePeriodInDays) {
        super();
        this.isInterimReleaseAutoUpgradeEnabled = isInterimReleaseAutoUpgradeEnabled;
        this.interimReleaseUpgradePeriodInDays = interimReleaseUpgradePeriodInDays;
        this.bundleReleaseUpgradePeriodInDays = bundleReleaseUpgradePeriodInDays;
        this.majorReleaseUpgradePeriodInDays = majorReleaseUpgradePeriodInDays;
        this.securityPatchUpgradePeriodInDays = securityPatchUpgradePeriodInDays;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * By default auto upgrade for interim releases are not enabled. If auto-upgrade is enabled
         * for interim release, you have to specify interimReleaseUpgradePeriodInDays too.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isInterimReleaseAutoUpgradeEnabled")
        private Boolean isInterimReleaseAutoUpgradeEnabled;

        /**
         * By default auto upgrade for interim releases are not enabled. If auto-upgrade is enabled
         * for interim release, you have to specify interimReleaseUpgradePeriodInDays too.
         *
         * @param isInterimReleaseAutoUpgradeEnabled the value to set
         * @return this builder
         */
        public Builder isInterimReleaseAutoUpgradeEnabled(
                Boolean isInterimReleaseAutoUpgradeEnabled) {
            this.isInterimReleaseAutoUpgradeEnabled = isInterimReleaseAutoUpgradeEnabled;
            this.__explicitlySet__.add("isInterimReleaseAutoUpgradeEnabled");
            return this;
        }
        /**
         * Defines auto upgrade period for interim releases. This period must be shorter or equal to
         * bundle release upgrade period.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("interimReleaseUpgradePeriodInDays")
        private Integer interimReleaseUpgradePeriodInDays;

        /**
         * Defines auto upgrade period for interim releases. This period must be shorter or equal to
         * bundle release upgrade period.
         *
         * @param interimReleaseUpgradePeriodInDays the value to set
         * @return this builder
         */
        public Builder interimReleaseUpgradePeriodInDays(
                Integer interimReleaseUpgradePeriodInDays) {
            this.interimReleaseUpgradePeriodInDays = interimReleaseUpgradePeriodInDays;
            this.__explicitlySet__.add("interimReleaseUpgradePeriodInDays");
            return this;
        }
        /**
         * Defines auto upgrade period for bundle releases. Manually configured period cannot be
         * longer than service defined period for bundle releases. This period must be shorter or
         * equal to major release upgrade period. Not passing this field during create will equate
         * to using the service default.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bundleReleaseUpgradePeriodInDays")
        private Integer bundleReleaseUpgradePeriodInDays;

        /**
         * Defines auto upgrade period for bundle releases. Manually configured period cannot be
         * longer than service defined period for bundle releases. This period must be shorter or
         * equal to major release upgrade period. Not passing this field during create will equate
         * to using the service default.
         *
         * @param bundleReleaseUpgradePeriodInDays the value to set
         * @return this builder
         */
        public Builder bundleReleaseUpgradePeriodInDays(Integer bundleReleaseUpgradePeriodInDays) {
            this.bundleReleaseUpgradePeriodInDays = bundleReleaseUpgradePeriodInDays;
            this.__explicitlySet__.add("bundleReleaseUpgradePeriodInDays");
            return this;
        }
        /**
         * Defines auto upgrade period for major releases. Manually configured period cannot be
         * longer than service defined period for major releases. Not passing this field during
         * create will equate to using the service default.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("majorReleaseUpgradePeriodInDays")
        private Integer majorReleaseUpgradePeriodInDays;

        /**
         * Defines auto upgrade period for major releases. Manually configured period cannot be
         * longer than service defined period for major releases. Not passing this field during
         * create will equate to using the service default.
         *
         * @param majorReleaseUpgradePeriodInDays the value to set
         * @return this builder
         */
        public Builder majorReleaseUpgradePeriodInDays(Integer majorReleaseUpgradePeriodInDays) {
            this.majorReleaseUpgradePeriodInDays = majorReleaseUpgradePeriodInDays;
            this.__explicitlySet__.add("majorReleaseUpgradePeriodInDays");
            return this;
        }
        /**
         * Defines auto upgrade period for releases with security fix. Manually configured period
         * cannot be longer than service defined period for security releases. Not passing this
         * field during create will equate to using the service default.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("securityPatchUpgradePeriodInDays")
        private Integer securityPatchUpgradePeriodInDays;

        /**
         * Defines auto upgrade period for releases with security fix. Manually configured period
         * cannot be longer than service defined period for security releases. Not passing this
         * field during create will equate to using the service default.
         *
         * @param securityPatchUpgradePeriodInDays the value to set
         * @return this builder
         */
        public Builder securityPatchUpgradePeriodInDays(Integer securityPatchUpgradePeriodInDays) {
            this.securityPatchUpgradePeriodInDays = securityPatchUpgradePeriodInDays;
            this.__explicitlySet__.add("securityPatchUpgradePeriodInDays");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMaintenanceConfigurationDetails build() {
            CreateMaintenanceConfigurationDetails model =
                    new CreateMaintenanceConfigurationDetails(
                            this.isInterimReleaseAutoUpgradeEnabled,
                            this.interimReleaseUpgradePeriodInDays,
                            this.bundleReleaseUpgradePeriodInDays,
                            this.majorReleaseUpgradePeriodInDays,
                            this.securityPatchUpgradePeriodInDays);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMaintenanceConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("isInterimReleaseAutoUpgradeEnabled")) {
                this.isInterimReleaseAutoUpgradeEnabled(
                        model.getIsInterimReleaseAutoUpgradeEnabled());
            }
            if (model.wasPropertyExplicitlySet("interimReleaseUpgradePeriodInDays")) {
                this.interimReleaseUpgradePeriodInDays(
                        model.getInterimReleaseUpgradePeriodInDays());
            }
            if (model.wasPropertyExplicitlySet("bundleReleaseUpgradePeriodInDays")) {
                this.bundleReleaseUpgradePeriodInDays(model.getBundleReleaseUpgradePeriodInDays());
            }
            if (model.wasPropertyExplicitlySet("majorReleaseUpgradePeriodInDays")) {
                this.majorReleaseUpgradePeriodInDays(model.getMajorReleaseUpgradePeriodInDays());
            }
            if (model.wasPropertyExplicitlySet("securityPatchUpgradePeriodInDays")) {
                this.securityPatchUpgradePeriodInDays(model.getSecurityPatchUpgradePeriodInDays());
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
     * By default auto upgrade for interim releases are not enabled. If auto-upgrade is enabled for
     * interim release, you have to specify interimReleaseUpgradePeriodInDays too.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isInterimReleaseAutoUpgradeEnabled")
    private final Boolean isInterimReleaseAutoUpgradeEnabled;

    /**
     * By default auto upgrade for interim releases are not enabled. If auto-upgrade is enabled for
     * interim release, you have to specify interimReleaseUpgradePeriodInDays too.
     *
     * @return the value
     */
    public Boolean getIsInterimReleaseAutoUpgradeEnabled() {
        return isInterimReleaseAutoUpgradeEnabled;
    }

    /**
     * Defines auto upgrade period for interim releases. This period must be shorter or equal to
     * bundle release upgrade period.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("interimReleaseUpgradePeriodInDays")
    private final Integer interimReleaseUpgradePeriodInDays;

    /**
     * Defines auto upgrade period for interim releases. This period must be shorter or equal to
     * bundle release upgrade period.
     *
     * @return the value
     */
    public Integer getInterimReleaseUpgradePeriodInDays() {
        return interimReleaseUpgradePeriodInDays;
    }

    /**
     * Defines auto upgrade period for bundle releases. Manually configured period cannot be longer
     * than service defined period for bundle releases. This period must be shorter or equal to
     * major release upgrade period. Not passing this field during create will equate to using the
     * service default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bundleReleaseUpgradePeriodInDays")
    private final Integer bundleReleaseUpgradePeriodInDays;

    /**
     * Defines auto upgrade period for bundle releases. Manually configured period cannot be longer
     * than service defined period for bundle releases. This period must be shorter or equal to
     * major release upgrade period. Not passing this field during create will equate to using the
     * service default.
     *
     * @return the value
     */
    public Integer getBundleReleaseUpgradePeriodInDays() {
        return bundleReleaseUpgradePeriodInDays;
    }

    /**
     * Defines auto upgrade period for major releases. Manually configured period cannot be longer
     * than service defined period for major releases. Not passing this field during create will
     * equate to using the service default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("majorReleaseUpgradePeriodInDays")
    private final Integer majorReleaseUpgradePeriodInDays;

    /**
     * Defines auto upgrade period for major releases. Manually configured period cannot be longer
     * than service defined period for major releases. Not passing this field during create will
     * equate to using the service default.
     *
     * @return the value
     */
    public Integer getMajorReleaseUpgradePeriodInDays() {
        return majorReleaseUpgradePeriodInDays;
    }

    /**
     * Defines auto upgrade period for releases with security fix. Manually configured period cannot
     * be longer than service defined period for security releases. Not passing this field during
     * create will equate to using the service default.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityPatchUpgradePeriodInDays")
    private final Integer securityPatchUpgradePeriodInDays;

    /**
     * Defines auto upgrade period for releases with security fix. Manually configured period cannot
     * be longer than service defined period for security releases. Not passing this field during
     * create will equate to using the service default.
     *
     * @return the value
     */
    public Integer getSecurityPatchUpgradePeriodInDays() {
        return securityPatchUpgradePeriodInDays;
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
        sb.append("CreateMaintenanceConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("isInterimReleaseAutoUpgradeEnabled=")
                .append(String.valueOf(this.isInterimReleaseAutoUpgradeEnabled));
        sb.append(", interimReleaseUpgradePeriodInDays=")
                .append(String.valueOf(this.interimReleaseUpgradePeriodInDays));
        sb.append(", bundleReleaseUpgradePeriodInDays=")
                .append(String.valueOf(this.bundleReleaseUpgradePeriodInDays));
        sb.append(", majorReleaseUpgradePeriodInDays=")
                .append(String.valueOf(this.majorReleaseUpgradePeriodInDays));
        sb.append(", securityPatchUpgradePeriodInDays=")
                .append(String.valueOf(this.securityPatchUpgradePeriodInDays));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMaintenanceConfigurationDetails)) {
            return false;
        }

        CreateMaintenanceConfigurationDetails other = (CreateMaintenanceConfigurationDetails) o;
        return java.util.Objects.equals(
                        this.isInterimReleaseAutoUpgradeEnabled,
                        other.isInterimReleaseAutoUpgradeEnabled)
                && java.util.Objects.equals(
                        this.interimReleaseUpgradePeriodInDays,
                        other.interimReleaseUpgradePeriodInDays)
                && java.util.Objects.equals(
                        this.bundleReleaseUpgradePeriodInDays,
                        other.bundleReleaseUpgradePeriodInDays)
                && java.util.Objects.equals(
                        this.majorReleaseUpgradePeriodInDays, other.majorReleaseUpgradePeriodInDays)
                && java.util.Objects.equals(
                        this.securityPatchUpgradePeriodInDays,
                        other.securityPatchUpgradePeriodInDays)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isInterimReleaseAutoUpgradeEnabled == null
                                ? 43
                                : this.isInterimReleaseAutoUpgradeEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.interimReleaseUpgradePeriodInDays == null
                                ? 43
                                : this.interimReleaseUpgradePeriodInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.bundleReleaseUpgradePeriodInDays == null
                                ? 43
                                : this.bundleReleaseUpgradePeriodInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.majorReleaseUpgradePeriodInDays == null
                                ? 43
                                : this.majorReleaseUpgradePeriodInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.securityPatchUpgradePeriodInDays == null
                                ? 43
                                : this.securityPatchUpgradePeriodInDays.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
