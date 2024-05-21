/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details of aggregation dimensions used for summarizing audit profiles.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AuditProfileDimensions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AuditProfileDimensions
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isPaidUsageEnabled"})
    public AuditProfileDimensions(Boolean isPaidUsageEnabled) {
        super();
        this.isPaidUsageEnabled = isPaidUsageEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Indicates if you want to continue collecting audit records beyond the free limit of one million audit records per month per target database,
         * potentially incurring additional charges. The default value is inherited from the global settings.
         * You can change at the global level or at the target level.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isPaidUsageEnabled")
        private Boolean isPaidUsageEnabled;

        /**
         * Indicates if you want to continue collecting audit records beyond the free limit of one million audit records per month per target database,
         * potentially incurring additional charges. The default value is inherited from the global settings.
         * You can change at the global level or at the target level.
         *
         * @param isPaidUsageEnabled the value to set
         * @return this builder
         **/
        public Builder isPaidUsageEnabled(Boolean isPaidUsageEnabled) {
            this.isPaidUsageEnabled = isPaidUsageEnabled;
            this.__explicitlySet__.add("isPaidUsageEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AuditProfileDimensions build() {
            AuditProfileDimensions model = new AuditProfileDimensions(this.isPaidUsageEnabled);
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
     * Indicates if you want to continue collecting audit records beyond the free limit of one million audit records per month per target database,
     * potentially incurring additional charges. The default value is inherited from the global settings.
     * You can change at the global level or at the target level.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPaidUsageEnabled")
    private final Boolean isPaidUsageEnabled;

    /**
     * Indicates if you want to continue collecting audit records beyond the free limit of one million audit records per month per target database,
     * potentially incurring additional charges. The default value is inherited from the global settings.
     * You can change at the global level or at the target level.
     *
     * @return the value
     **/
    public Boolean getIsPaidUsageEnabled() {
        return isPaidUsageEnabled;
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
        sb.append("AuditProfileDimensions(");
        sb.append("super=").append(super.toString());
        sb.append("isPaidUsageEnabled=").append(String.valueOf(this.isPaidUsageEnabled));
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
