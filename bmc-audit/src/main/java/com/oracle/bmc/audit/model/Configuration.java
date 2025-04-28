/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.audit.model;

/**
 * The retention period setting, specified in days. For more information, see [Setting Audit Log
 * Retention Period](https://docs.oracle.com/iaas/Content/Audit/Tasks/settingretentionperiod.htm).
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Configuration.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Configuration extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"retentionPeriodDays"})
    public Configuration(Integer retentionPeriodDays) {
        super();
        this.retentionPeriodDays = retentionPeriodDays;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The retention period setting, specified in days. The minimum is 90, the maximum 365.
         *
         * <p>Example: {@code 90}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodDays")
        private Integer retentionPeriodDays;

        /**
         * The retention period setting, specified in days. The minimum is 90, the maximum 365.
         *
         * <p>Example: {@code 90}
         *
         * @param retentionPeriodDays the value to set
         * @return this builder
         */
        public Builder retentionPeriodDays(Integer retentionPeriodDays) {
            this.retentionPeriodDays = retentionPeriodDays;
            this.__explicitlySet__.add("retentionPeriodDays");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Configuration build() {
            Configuration model = new Configuration(this.retentionPeriodDays);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Configuration model) {
            if (model.wasPropertyExplicitlySet("retentionPeriodDays")) {
                this.retentionPeriodDays(model.getRetentionPeriodDays());
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
     * The retention period setting, specified in days. The minimum is 90, the maximum 365.
     *
     * <p>Example: {@code 90}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodDays")
    private final Integer retentionPeriodDays;

    /**
     * The retention period setting, specified in days. The minimum is 90, the maximum 365.
     *
     * <p>Example: {@code 90}
     *
     * @return the value
     */
    public Integer getRetentionPeriodDays() {
        return retentionPeriodDays;
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
        sb.append("Configuration(");
        sb.append("super=").append(super.toString());
        sb.append("retentionPeriodDays=").append(String.valueOf(this.retentionPeriodDays));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Configuration)) {
            return false;
        }

        Configuration other = (Configuration) o;
        return java.util.Objects.equals(this.retentionPeriodDays, other.retentionPeriodDays)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.retentionPeriodDays == null
                                ? 43
                                : this.retentionPeriodDays.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
