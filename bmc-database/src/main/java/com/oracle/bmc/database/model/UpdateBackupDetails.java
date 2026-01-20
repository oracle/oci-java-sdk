/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Describes the parameters for updating the backup details. <br>
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
        builder = UpdateBackupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateBackupDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"retentionPeriodInDays", "retentionPeriodInYears"})
    public UpdateBackupDetails(Integer retentionPeriodInDays, Integer retentionPeriodInYears) {
        super();
        this.retentionPeriodInDays = retentionPeriodInDays;
        this.retentionPeriodInYears = retentionPeriodInYears;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The retention period of the long term backup in days. */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodInDays")
        private Integer retentionPeriodInDays;

        /**
         * The retention period of the long term backup in days.
         *
         * @param retentionPeriodInDays the value to set
         * @return this builder
         */
        public Builder retentionPeriodInDays(Integer retentionPeriodInDays) {
            this.retentionPeriodInDays = retentionPeriodInDays;
            this.__explicitlySet__.add("retentionPeriodInDays");
            return this;
        }
        /** The retention period of the long term backup in years. */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodInYears")
        private Integer retentionPeriodInYears;

        /**
         * The retention period of the long term backup in years.
         *
         * @param retentionPeriodInYears the value to set
         * @return this builder
         */
        public Builder retentionPeriodInYears(Integer retentionPeriodInYears) {
            this.retentionPeriodInYears = retentionPeriodInYears;
            this.__explicitlySet__.add("retentionPeriodInYears");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateBackupDetails build() {
            UpdateBackupDetails model =
                    new UpdateBackupDetails(
                            this.retentionPeriodInDays, this.retentionPeriodInYears);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateBackupDetails model) {
            if (model.wasPropertyExplicitlySet("retentionPeriodInDays")) {
                this.retentionPeriodInDays(model.getRetentionPeriodInDays());
            }
            if (model.wasPropertyExplicitlySet("retentionPeriodInYears")) {
                this.retentionPeriodInYears(model.getRetentionPeriodInYears());
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

    /** The retention period of the long term backup in days. */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodInDays")
    private final Integer retentionPeriodInDays;

    /**
     * The retention period of the long term backup in days.
     *
     * @return the value
     */
    public Integer getRetentionPeriodInDays() {
        return retentionPeriodInDays;
    }

    /** The retention period of the long term backup in years. */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodInYears")
    private final Integer retentionPeriodInYears;

    /**
     * The retention period of the long term backup in years.
     *
     * @return the value
     */
    public Integer getRetentionPeriodInYears() {
        return retentionPeriodInYears;
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
        sb.append("UpdateBackupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("retentionPeriodInDays=").append(String.valueOf(this.retentionPeriodInDays));
        sb.append(", retentionPeriodInYears=").append(String.valueOf(this.retentionPeriodInYears));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateBackupDetails)) {
            return false;
        }

        UpdateBackupDetails other = (UpdateBackupDetails) o;
        return java.util.Objects.equals(this.retentionPeriodInDays, other.retentionPeriodInDays)
                && java.util.Objects.equals(
                        this.retentionPeriodInYears, other.retentionPeriodInYears)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.retentionPeriodInDays == null
                                ? 43
                                : this.retentionPeriodInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.retentionPeriodInYears == null
                                ? 43
                                : this.retentionPeriodInYears.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
