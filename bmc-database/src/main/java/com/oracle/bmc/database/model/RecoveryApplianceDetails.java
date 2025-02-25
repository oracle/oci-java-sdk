/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Information about the recovery appliance configuration associated with the Autonomous Container Database.
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
    builder = RecoveryApplianceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RecoveryApplianceDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "allocatedStorageSizeInGBs",
        "recoveryWindowInDays",
        "timeRecoveryApplianceDetailsUpdated"
    })
    public RecoveryApplianceDetails(
            Integer allocatedStorageSizeInGBs,
            Integer recoveryWindowInDays,
            java.util.Date timeRecoveryApplianceDetailsUpdated) {
        super();
        this.allocatedStorageSizeInGBs = allocatedStorageSizeInGBs;
        this.recoveryWindowInDays = recoveryWindowInDays;
        this.timeRecoveryApplianceDetailsUpdated = timeRecoveryApplianceDetailsUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The storage size of the backup destination allocated for an Autonomous Container Database to store backups on the recovery appliance, in GBs, rounded to the nearest integer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allocatedStorageSizeInGBs")
        private Integer allocatedStorageSizeInGBs;

        /**
         * The storage size of the backup destination allocated for an Autonomous Container Database to store backups on the recovery appliance, in GBs, rounded to the nearest integer.
         * @param allocatedStorageSizeInGBs the value to set
         * @return this builder
         **/
        public Builder allocatedStorageSizeInGBs(Integer allocatedStorageSizeInGBs) {
            this.allocatedStorageSizeInGBs = allocatedStorageSizeInGBs;
            this.__explicitlySet__.add("allocatedStorageSizeInGBs");
            return this;
        }
        /**
         * Number of days between the current and earliest point of recoverability covered by automatic backups.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recoveryWindowInDays")
        private Integer recoveryWindowInDays;

        /**
         * Number of days between the current and earliest point of recoverability covered by automatic backups.
         * @param recoveryWindowInDays the value to set
         * @return this builder
         **/
        public Builder recoveryWindowInDays(Integer recoveryWindowInDays) {
            this.recoveryWindowInDays = recoveryWindowInDays;
            this.__explicitlySet__.add("recoveryWindowInDays");
            return this;
        }
        /**
         * The time when the recovery appliance details are updated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeRecoveryApplianceDetailsUpdated")
        private java.util.Date timeRecoveryApplianceDetailsUpdated;

        /**
         * The time when the recovery appliance details are updated.
         * @param timeRecoveryApplianceDetailsUpdated the value to set
         * @return this builder
         **/
        public Builder timeRecoveryApplianceDetailsUpdated(
                java.util.Date timeRecoveryApplianceDetailsUpdated) {
            this.timeRecoveryApplianceDetailsUpdated = timeRecoveryApplianceDetailsUpdated;
            this.__explicitlySet__.add("timeRecoveryApplianceDetailsUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecoveryApplianceDetails build() {
            RecoveryApplianceDetails model =
                    new RecoveryApplianceDetails(
                            this.allocatedStorageSizeInGBs,
                            this.recoveryWindowInDays,
                            this.timeRecoveryApplianceDetailsUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecoveryApplianceDetails model) {
            if (model.wasPropertyExplicitlySet("allocatedStorageSizeInGBs")) {
                this.allocatedStorageSizeInGBs(model.getAllocatedStorageSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("recoveryWindowInDays")) {
                this.recoveryWindowInDays(model.getRecoveryWindowInDays());
            }
            if (model.wasPropertyExplicitlySet("timeRecoveryApplianceDetailsUpdated")) {
                this.timeRecoveryApplianceDetailsUpdated(
                        model.getTimeRecoveryApplianceDetailsUpdated());
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
     * The storage size of the backup destination allocated for an Autonomous Container Database to store backups on the recovery appliance, in GBs, rounded to the nearest integer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allocatedStorageSizeInGBs")
    private final Integer allocatedStorageSizeInGBs;

    /**
     * The storage size of the backup destination allocated for an Autonomous Container Database to store backups on the recovery appliance, in GBs, rounded to the nearest integer.
     * @return the value
     **/
    public Integer getAllocatedStorageSizeInGBs() {
        return allocatedStorageSizeInGBs;
    }

    /**
     * Number of days between the current and earliest point of recoverability covered by automatic backups.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recoveryWindowInDays")
    private final Integer recoveryWindowInDays;

    /**
     * Number of days between the current and earliest point of recoverability covered by automatic backups.
     * @return the value
     **/
    public Integer getRecoveryWindowInDays() {
        return recoveryWindowInDays;
    }

    /**
     * The time when the recovery appliance details are updated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRecoveryApplianceDetailsUpdated")
    private final java.util.Date timeRecoveryApplianceDetailsUpdated;

    /**
     * The time when the recovery appliance details are updated.
     * @return the value
     **/
    public java.util.Date getTimeRecoveryApplianceDetailsUpdated() {
        return timeRecoveryApplianceDetailsUpdated;
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
        sb.append("RecoveryApplianceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("allocatedStorageSizeInGBs=")
                .append(String.valueOf(this.allocatedStorageSizeInGBs));
        sb.append(", recoveryWindowInDays=").append(String.valueOf(this.recoveryWindowInDays));
        sb.append(", timeRecoveryApplianceDetailsUpdated=")
                .append(String.valueOf(this.timeRecoveryApplianceDetailsUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecoveryApplianceDetails)) {
            return false;
        }

        RecoveryApplianceDetails other = (RecoveryApplianceDetails) o;
        return java.util.Objects.equals(
                        this.allocatedStorageSizeInGBs, other.allocatedStorageSizeInGBs)
                && java.util.Objects.equals(this.recoveryWindowInDays, other.recoveryWindowInDays)
                && java.util.Objects.equals(
                        this.timeRecoveryApplianceDetailsUpdated,
                        other.timeRecoveryApplianceDetailsUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.allocatedStorageSizeInGBs == null
                                ? 43
                                : this.allocatedStorageSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.recoveryWindowInDays == null
                                ? 43
                                : this.recoveryWindowInDays.hashCode());
        result =
                (result * PRIME)
                        + (this.timeRecoveryApplianceDetailsUpdated == null
                                ? 43
                                : this.timeRecoveryApplianceDetailsUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
