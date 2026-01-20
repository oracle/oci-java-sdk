/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details of aggregation dimensions used for summarizing audit profiles. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AuditProfileDimensions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AuditProfileDimensions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isPaidUsageEnabled",
        "targetType",
        "onlineMonthsSource",
        "offlineMonthsSource",
        "paidUsageSource"
    })
    public AuditProfileDimensions(
            Boolean isPaidUsageEnabled,
            String targetType,
            String onlineMonthsSource,
            String offlineMonthsSource,
            String paidUsageSource) {
        super();
        this.isPaidUsageEnabled = isPaidUsageEnabled;
        this.targetType = targetType;
        this.onlineMonthsSource = onlineMonthsSource;
        this.offlineMonthsSource = offlineMonthsSource;
        this.paidUsageSource = paidUsageSource;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates if you want to continue collecting audit records beyond the free limit of one
         * million audit records per month per target database, potentially incurring additional
         * charges. The default value is inherited from the global settings. You can change at the
         * global level or at the target level.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isPaidUsageEnabled")
        private Boolean isPaidUsageEnabled;

        /**
         * Indicates if you want to continue collecting audit records beyond the free limit of one
         * million audit records per month per target database, potentially incurring additional
         * charges. The default value is inherited from the global settings. You can change at the
         * global level or at the target level.
         *
         * @param isPaidUsageEnabled the value to set
         * @return this builder
         */
        public Builder isPaidUsageEnabled(Boolean isPaidUsageEnabled) {
            this.isPaidUsageEnabled = isPaidUsageEnabled;
            this.__explicitlySet__.add("isPaidUsageEnabled");
            return this;
        }
        /** The resource type that is represented by the audit profile. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetType")
        private String targetType;

        /**
         * The resource type that is represented by the audit profile.
         *
         * @param targetType the value to set
         * @return this builder
         */
        public Builder targetType(String targetType) {
            this.targetType = targetType;
            this.__explicitlySet__.add("targetType");
            return this;
        }
        /**
         * The name or the OCID of the resource from which the online month retention setting is
         * sourced. For example a target database group OCID or global.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("onlineMonthsSource")
        private String onlineMonthsSource;

        /**
         * The name or the OCID of the resource from which the online month retention setting is
         * sourced. For example a target database group OCID or global.
         *
         * @param onlineMonthsSource the value to set
         * @return this builder
         */
        public Builder onlineMonthsSource(String onlineMonthsSource) {
            this.onlineMonthsSource = onlineMonthsSource;
            this.__explicitlySet__.add("onlineMonthsSource");
            return this;
        }
        /**
         * The name or the OCID of the resource from which the offline month retention setting is
         * sourced. For example a target database group OCID or global.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("offlineMonthsSource")
        private String offlineMonthsSource;

        /**
         * The name or the OCID of the resource from which the offline month retention setting is
         * sourced. For example a target database group OCID or global.
         *
         * @param offlineMonthsSource the value to set
         * @return this builder
         */
        public Builder offlineMonthsSource(String offlineMonthsSource) {
            this.offlineMonthsSource = offlineMonthsSource;
            this.__explicitlySet__.add("offlineMonthsSource");
            return this;
        }
        /**
         * The name or the OCID of the resource from which the paid usage setting is sourced. For
         * example a target database group OCID or global.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("paidUsageSource")
        private String paidUsageSource;

        /**
         * The name or the OCID of the resource from which the paid usage setting is sourced. For
         * example a target database group OCID or global.
         *
         * @param paidUsageSource the value to set
         * @return this builder
         */
        public Builder paidUsageSource(String paidUsageSource) {
            this.paidUsageSource = paidUsageSource;
            this.__explicitlySet__.add("paidUsageSource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuditProfileDimensions build() {
            AuditProfileDimensions model =
                    new AuditProfileDimensions(
                            this.isPaidUsageEnabled,
                            this.targetType,
                            this.onlineMonthsSource,
                            this.offlineMonthsSource,
                            this.paidUsageSource);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AuditProfileDimensions model) {
            if (model.wasPropertyExplicitlySet("isPaidUsageEnabled")) {
                this.isPaidUsageEnabled(model.getIsPaidUsageEnabled());
            }
            if (model.wasPropertyExplicitlySet("targetType")) {
                this.targetType(model.getTargetType());
            }
            if (model.wasPropertyExplicitlySet("onlineMonthsSource")) {
                this.onlineMonthsSource(model.getOnlineMonthsSource());
            }
            if (model.wasPropertyExplicitlySet("offlineMonthsSource")) {
                this.offlineMonthsSource(model.getOfflineMonthsSource());
            }
            if (model.wasPropertyExplicitlySet("paidUsageSource")) {
                this.paidUsageSource(model.getPaidUsageSource());
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
     * Indicates if you want to continue collecting audit records beyond the free limit of one
     * million audit records per month per target database, potentially incurring additional
     * charges. The default value is inherited from the global settings. You can change at the
     * global level or at the target level.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPaidUsageEnabled")
    private final Boolean isPaidUsageEnabled;

    /**
     * Indicates if you want to continue collecting audit records beyond the free limit of one
     * million audit records per month per target database, potentially incurring additional
     * charges. The default value is inherited from the global settings. You can change at the
     * global level or at the target level.
     *
     * @return the value
     */
    public Boolean getIsPaidUsageEnabled() {
        return isPaidUsageEnabled;
    }

    /** The resource type that is represented by the audit profile. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetType")
    private final String targetType;

    /**
     * The resource type that is represented by the audit profile.
     *
     * @return the value
     */
    public String getTargetType() {
        return targetType;
    }

    /**
     * The name or the OCID of the resource from which the online month retention setting is
     * sourced. For example a target database group OCID or global.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("onlineMonthsSource")
    private final String onlineMonthsSource;

    /**
     * The name or the OCID of the resource from which the online month retention setting is
     * sourced. For example a target database group OCID or global.
     *
     * @return the value
     */
    public String getOnlineMonthsSource() {
        return onlineMonthsSource;
    }

    /**
     * The name or the OCID of the resource from which the offline month retention setting is
     * sourced. For example a target database group OCID or global.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("offlineMonthsSource")
    private final String offlineMonthsSource;

    /**
     * The name or the OCID of the resource from which the offline month retention setting is
     * sourced. For example a target database group OCID or global.
     *
     * @return the value
     */
    public String getOfflineMonthsSource() {
        return offlineMonthsSource;
    }

    /**
     * The name or the OCID of the resource from which the paid usage setting is sourced. For
     * example a target database group OCID or global.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("paidUsageSource")
    private final String paidUsageSource;

    /**
     * The name or the OCID of the resource from which the paid usage setting is sourced. For
     * example a target database group OCID or global.
     *
     * @return the value
     */
    public String getPaidUsageSource() {
        return paidUsageSource;
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
        sb.append("AuditProfileDimensions(");
        sb.append("super=").append(super.toString());
        sb.append("isPaidUsageEnabled=").append(String.valueOf(this.isPaidUsageEnabled));
        sb.append(", targetType=").append(String.valueOf(this.targetType));
        sb.append(", onlineMonthsSource=").append(String.valueOf(this.onlineMonthsSource));
        sb.append(", offlineMonthsSource=").append(String.valueOf(this.offlineMonthsSource));
        sb.append(", paidUsageSource=").append(String.valueOf(this.paidUsageSource));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AuditProfileDimensions)) {
            return false;
        }

        AuditProfileDimensions other = (AuditProfileDimensions) o;
        return java.util.Objects.equals(this.isPaidUsageEnabled, other.isPaidUsageEnabled)
                && java.util.Objects.equals(this.targetType, other.targetType)
                && java.util.Objects.equals(this.onlineMonthsSource, other.onlineMonthsSource)
                && java.util.Objects.equals(this.offlineMonthsSource, other.offlineMonthsSource)
                && java.util.Objects.equals(this.paidUsageSource, other.paidUsageSource)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isPaidUsageEnabled == null
                                ? 43
                                : this.isPaidUsageEnabled.hashCode());
        result = (result * PRIME) + (this.targetType == null ? 43 : this.targetType.hashCode());
        result =
                (result * PRIME)
                        + (this.onlineMonthsSource == null
                                ? 43
                                : this.onlineMonthsSource.hashCode());
        result =
                (result * PRIME)
                        + (this.offlineMonthsSource == null
                                ? 43
                                : this.offlineMonthsSource.hashCode());
        result =
                (result * PRIME)
                        + (this.paidUsageSource == null ? 43 : this.paidUsageSource.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
