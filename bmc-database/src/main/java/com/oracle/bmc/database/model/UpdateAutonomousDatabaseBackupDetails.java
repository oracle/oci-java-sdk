/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details for updating the Autonomous Database backup.
 *
 * <p>*Warning:** Oracle recommends avoiding using confidential information when you supply string
 * values using the API. <br>
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
        builder = UpdateAutonomousDatabaseBackupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateAutonomousDatabaseBackupDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"retentionPeriodInDays"})
    public UpdateAutonomousDatabaseBackupDetails(Integer retentionPeriodInDays) {
        super();
        this.retentionPeriodInDays = retentionPeriodInDays;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Retention period, in days, for long-term backups */
        @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodInDays")
        private Integer retentionPeriodInDays;

        /**
         * Retention period, in days, for long-term backups
         *
         * @param retentionPeriodInDays the value to set
         * @return this builder
         */
        public Builder retentionPeriodInDays(Integer retentionPeriodInDays) {
            this.retentionPeriodInDays = retentionPeriodInDays;
            this.__explicitlySet__.add("retentionPeriodInDays");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateAutonomousDatabaseBackupDetails build() {
            UpdateAutonomousDatabaseBackupDetails model =
                    new UpdateAutonomousDatabaseBackupDetails(this.retentionPeriodInDays);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAutonomousDatabaseBackupDetails model) {
            if (model.wasPropertyExplicitlySet("retentionPeriodInDays")) {
                this.retentionPeriodInDays(model.getRetentionPeriodInDays());
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

    /** Retention period, in days, for long-term backups */
    @com.fasterxml.jackson.annotation.JsonProperty("retentionPeriodInDays")
    private final Integer retentionPeriodInDays;

    /**
     * Retention period, in days, for long-term backups
     *
     * @return the value
     */
    public Integer getRetentionPeriodInDays() {
        return retentionPeriodInDays;
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
        sb.append("UpdateAutonomousDatabaseBackupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("retentionPeriodInDays=").append(String.valueOf(this.retentionPeriodInDays));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAutonomousDatabaseBackupDetails)) {
            return false;
        }

        UpdateAutonomousDatabaseBackupDetails other = (UpdateAutonomousDatabaseBackupDetails) o;
        return java.util.Objects.equals(this.retentionPeriodInDays, other.retentionPeriodInDays)
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
