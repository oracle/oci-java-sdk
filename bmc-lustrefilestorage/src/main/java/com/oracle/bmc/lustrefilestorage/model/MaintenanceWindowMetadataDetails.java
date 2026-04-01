/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lustrefilestorage.model;

/**
 * The meta-data for maintenance window.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MaintenanceWindowMetadataDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MaintenanceWindowMetadataDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "activeOrNextPlannedMaintenance",
        "finishedMaintenance",
        "isMaintenanceInProgress"
    })
    public MaintenanceWindowMetadataDetails(
            DateAndTime activeOrNextPlannedMaintenance,
            DateAndTime finishedMaintenance,
            Boolean isMaintenanceInProgress) {
        super();
        this.activeOrNextPlannedMaintenance = activeOrNextPlannedMaintenance;
        this.finishedMaintenance = finishedMaintenance;
        this.isMaintenanceInProgress = isMaintenanceInProgress;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("activeOrNextPlannedMaintenance")
        private DateAndTime activeOrNextPlannedMaintenance;

        public Builder activeOrNextPlannedMaintenance(DateAndTime activeOrNextPlannedMaintenance) {
            this.activeOrNextPlannedMaintenance = activeOrNextPlannedMaintenance;
            this.__explicitlySet__.add("activeOrNextPlannedMaintenance");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("finishedMaintenance")
        private DateAndTime finishedMaintenance;

        public Builder finishedMaintenance(DateAndTime finishedMaintenance) {
            this.finishedMaintenance = finishedMaintenance;
            this.__explicitlySet__.add("finishedMaintenance");
            return this;
        }
        /**
         * whether or not an active maintenance is going on for the LustreFileSystem
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isMaintenanceInProgress")
        private Boolean isMaintenanceInProgress;

        /**
         * whether or not an active maintenance is going on for the LustreFileSystem
         * @param isMaintenanceInProgress the value to set
         * @return this builder
         **/
        public Builder isMaintenanceInProgress(Boolean isMaintenanceInProgress) {
            this.isMaintenanceInProgress = isMaintenanceInProgress;
            this.__explicitlySet__.add("isMaintenanceInProgress");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaintenanceWindowMetadataDetails build() {
            MaintenanceWindowMetadataDetails model =
                    new MaintenanceWindowMetadataDetails(
                            this.activeOrNextPlannedMaintenance,
                            this.finishedMaintenance,
                            this.isMaintenanceInProgress);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaintenanceWindowMetadataDetails model) {
            if (model.wasPropertyExplicitlySet("activeOrNextPlannedMaintenance")) {
                this.activeOrNextPlannedMaintenance(model.getActiveOrNextPlannedMaintenance());
            }
            if (model.wasPropertyExplicitlySet("finishedMaintenance")) {
                this.finishedMaintenance(model.getFinishedMaintenance());
            }
            if (model.wasPropertyExplicitlySet("isMaintenanceInProgress")) {
                this.isMaintenanceInProgress(model.getIsMaintenanceInProgress());
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

    @com.fasterxml.jackson.annotation.JsonProperty("activeOrNextPlannedMaintenance")
    private final DateAndTime activeOrNextPlannedMaintenance;

    public DateAndTime getActiveOrNextPlannedMaintenance() {
        return activeOrNextPlannedMaintenance;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("finishedMaintenance")
    private final DateAndTime finishedMaintenance;

    public DateAndTime getFinishedMaintenance() {
        return finishedMaintenance;
    }

    /**
     * whether or not an active maintenance is going on for the LustreFileSystem
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMaintenanceInProgress")
    private final Boolean isMaintenanceInProgress;

    /**
     * whether or not an active maintenance is going on for the LustreFileSystem
     * @return the value
     **/
    public Boolean getIsMaintenanceInProgress() {
        return isMaintenanceInProgress;
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
        sb.append("MaintenanceWindowMetadataDetails(");
        sb.append("super=").append(super.toString());
        sb.append("activeOrNextPlannedMaintenance=")
                .append(String.valueOf(this.activeOrNextPlannedMaintenance));
        sb.append(", finishedMaintenance=").append(String.valueOf(this.finishedMaintenance));
        sb.append(", isMaintenanceInProgress=")
                .append(String.valueOf(this.isMaintenanceInProgress));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MaintenanceWindowMetadataDetails)) {
            return false;
        }

        MaintenanceWindowMetadataDetails other = (MaintenanceWindowMetadataDetails) o;
        return java.util.Objects.equals(
                        this.activeOrNextPlannedMaintenance, other.activeOrNextPlannedMaintenance)
                && java.util.Objects.equals(this.finishedMaintenance, other.finishedMaintenance)
                && java.util.Objects.equals(
                        this.isMaintenanceInProgress, other.isMaintenanceInProgress)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.activeOrNextPlannedMaintenance == null
                                ? 43
                                : this.activeOrNextPlannedMaintenance.hashCode());
        result =
                (result * PRIME)
                        + (this.finishedMaintenance == null
                                ? 43
                                : this.finishedMaintenance.hashCode());
        result =
                (result * PRIME)
                        + (this.isMaintenanceInProgress == null
                                ? 43
                                : this.isMaintenanceInProgress.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
