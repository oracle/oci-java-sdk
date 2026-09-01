/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Autonomous AI Database maintenance window. The maintenance window can be configured during
 * database creation. To change the maintenance window of an existing Autonomous AI Database
 * Serverless instance, clone the database and specify the maintenance window for the new cloned
 * instance. <br>
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
        builder = AutonomousDatabaseMaintenanceWindowSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AutonomousDatabaseMaintenanceWindowSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dayOfWeek",
        "maintenanceStartTime",
        "maintenanceEndTime",
        "availabilityDomain",
        "isMaintenanceWindowChangeScheduled"
    })
    public AutonomousDatabaseMaintenanceWindowSummary(
            DayOfWeek dayOfWeek,
            String maintenanceStartTime,
            String maintenanceEndTime,
            String availabilityDomain,
            Boolean isMaintenanceWindowChangeScheduled) {
        super();
        this.dayOfWeek = dayOfWeek;
        this.maintenanceStartTime = maintenanceStartTime;
        this.maintenanceEndTime = maintenanceEndTime;
        this.availabilityDomain = availabilityDomain;
        this.isMaintenanceWindowChangeScheduled = isMaintenanceWindowChangeScheduled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
        private DayOfWeek dayOfWeek;

        public Builder dayOfWeek(DayOfWeek dayOfWeek) {
            this.dayOfWeek = dayOfWeek;
            this.__explicitlySet__.add("dayOfWeek");
            return this;
        }
        /** The maintenance start time. The value must use the ISO-8601 format "hh:mm". */
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceStartTime")
        private String maintenanceStartTime;

        /**
         * The maintenance start time. The value must use the ISO-8601 format "hh:mm".
         *
         * @param maintenanceStartTime the value to set
         * @return this builder
         */
        public Builder maintenanceStartTime(String maintenanceStartTime) {
            this.maintenanceStartTime = maintenanceStartTime;
            this.__explicitlySet__.add("maintenanceStartTime");
            return this;
        }
        /** The maintenance end time. The value must use the ISO-8601 format "hh:mm". */
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceEndTime")
        private String maintenanceEndTime;

        /**
         * The maintenance end time. The value must use the ISO-8601 format "hh:mm".
         *
         * @param maintenanceEndTime the value to set
         * @return this builder
         */
        public Builder maintenanceEndTime(String maintenanceEndTime) {
            this.maintenanceEndTime = maintenanceEndTime;
            this.__explicitlySet__.add("maintenanceEndTime");
            return this;
        }
        /** The AD in which the maintenance will occur. */
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The AD in which the maintenance will occur.
         *
         * @param availabilityDomain the value to set
         * @return this builder
         */
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }
        /**
         * Indicates if the maintenance window change is scheduled or not for the Autonomous AI
         * Database.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isMaintenanceWindowChangeScheduled")
        private Boolean isMaintenanceWindowChangeScheduled;

        /**
         * Indicates if the maintenance window change is scheduled or not for the Autonomous AI
         * Database.
         *
         * @param isMaintenanceWindowChangeScheduled the value to set
         * @return this builder
         */
        public Builder isMaintenanceWindowChangeScheduled(
                Boolean isMaintenanceWindowChangeScheduled) {
            this.isMaintenanceWindowChangeScheduled = isMaintenanceWindowChangeScheduled;
            this.__explicitlySet__.add("isMaintenanceWindowChangeScheduled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousDatabaseMaintenanceWindowSummary build() {
            AutonomousDatabaseMaintenanceWindowSummary model =
                    new AutonomousDatabaseMaintenanceWindowSummary(
                            this.dayOfWeek,
                            this.maintenanceStartTime,
                            this.maintenanceEndTime,
                            this.availabilityDomain,
                            this.isMaintenanceWindowChangeScheduled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousDatabaseMaintenanceWindowSummary model) {
            if (model.wasPropertyExplicitlySet("dayOfWeek")) {
                this.dayOfWeek(model.getDayOfWeek());
            }
            if (model.wasPropertyExplicitlySet("maintenanceStartTime")) {
                this.maintenanceStartTime(model.getMaintenanceStartTime());
            }
            if (model.wasPropertyExplicitlySet("maintenanceEndTime")) {
                this.maintenanceEndTime(model.getMaintenanceEndTime());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("isMaintenanceWindowChangeScheduled")) {
                this.isMaintenanceWindowChangeScheduled(
                        model.getIsMaintenanceWindowChangeScheduled());
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

    @com.fasterxml.jackson.annotation.JsonProperty("dayOfWeek")
    private final DayOfWeek dayOfWeek;

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    /** The maintenance start time. The value must use the ISO-8601 format "hh:mm". */
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceStartTime")
    private final String maintenanceStartTime;

    /**
     * The maintenance start time. The value must use the ISO-8601 format "hh:mm".
     *
     * @return the value
     */
    public String getMaintenanceStartTime() {
        return maintenanceStartTime;
    }

    /** The maintenance end time. The value must use the ISO-8601 format "hh:mm". */
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceEndTime")
    private final String maintenanceEndTime;

    /**
     * The maintenance end time. The value must use the ISO-8601 format "hh:mm".
     *
     * @return the value
     */
    public String getMaintenanceEndTime() {
        return maintenanceEndTime;
    }

    /** The AD in which the maintenance will occur. */
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The AD in which the maintenance will occur.
     *
     * @return the value
     */
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    /**
     * Indicates if the maintenance window change is scheduled or not for the Autonomous AI
     * Database.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isMaintenanceWindowChangeScheduled")
    private final Boolean isMaintenanceWindowChangeScheduled;

    /**
     * Indicates if the maintenance window change is scheduled or not for the Autonomous AI
     * Database.
     *
     * @return the value
     */
    public Boolean getIsMaintenanceWindowChangeScheduled() {
        return isMaintenanceWindowChangeScheduled;
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
        sb.append("AutonomousDatabaseMaintenanceWindowSummary(");
        sb.append("super=").append(super.toString());
        sb.append("dayOfWeek=").append(String.valueOf(this.dayOfWeek));
        sb.append(", maintenanceStartTime=").append(String.valueOf(this.maintenanceStartTime));
        sb.append(", maintenanceEndTime=").append(String.valueOf(this.maintenanceEndTime));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", isMaintenanceWindowChangeScheduled=")
                .append(String.valueOf(this.isMaintenanceWindowChangeScheduled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousDatabaseMaintenanceWindowSummary)) {
            return false;
        }

        AutonomousDatabaseMaintenanceWindowSummary other =
                (AutonomousDatabaseMaintenanceWindowSummary) o;
        return java.util.Objects.equals(this.dayOfWeek, other.dayOfWeek)
                && java.util.Objects.equals(this.maintenanceStartTime, other.maintenanceStartTime)
                && java.util.Objects.equals(this.maintenanceEndTime, other.maintenanceEndTime)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(
                        this.isMaintenanceWindowChangeScheduled,
                        other.isMaintenanceWindowChangeScheduled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dayOfWeek == null ? 43 : this.dayOfWeek.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceStartTime == null
                                ? 43
                                : this.maintenanceStartTime.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceEndTime == null
                                ? 43
                                : this.maintenanceEndTime.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.isMaintenanceWindowChangeScheduled == null
                                ? 43
                                : this.isMaintenanceWindowChangeScheduled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
