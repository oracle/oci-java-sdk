/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The information about the new MaintenanceWindow.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateMaintenanceWindowDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateMaintenanceWindowDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "description",
        "isOutage",
        "maintenanceWindowType",
        "timeScheduleStart",
        "duration",
        "isRecurring",
        "recurrences",
        "taskInitiationCutoff",
        "freeformTags",
        "definedTags"
    })
    public CreateMaintenanceWindowDetails(
            String compartmentId,
            String displayName,
            String description,
            Boolean isOutage,
            MaintenanceWindowType maintenanceWindowType,
            java.util.Date timeScheduleStart,
            String duration,
            Boolean isRecurring,
            String recurrences,
            Integer taskInitiationCutoff,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.isOutage = isOutage;
        this.maintenanceWindowType = maintenanceWindowType;
        this.timeScheduleStart = timeScheduleStart;
        this.duration = duration;
        this.isRecurring = isRecurring;
        this.recurrences = recurrences;
        this.taskInitiationCutoff = taskInitiationCutoff;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Tenancy OCID
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Tenancy OCID
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My new resource}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         * <p>
         * Example: {@code My new resource}
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * A user-friendly description. To provide some insight about the resource.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A user-friendly description. To provide some insight about the resource.
         * Avoid entering confidential information.
         *
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Does the maintenenace window cause outage?
         * An outage indicates whether a maintenance window can consider operations that require downtime.
         * It means a period when the application is not accessible.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isOutage")
        private Boolean isOutage;

        /**
         * Does the maintenenace window cause outage?
         * An outage indicates whether a maintenance window can consider operations that require downtime.
         * It means a period when the application is not accessible.
         *
         * @param isOutage the value to set
         * @return this builder
         **/
        public Builder isOutage(Boolean isOutage) {
            this.isOutage = isOutage;
            this.__explicitlySet__.add("isOutage");
            return this;
        }
        /**
         * Type of maintenenace window
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowType")
        private MaintenanceWindowType maintenanceWindowType;

        /**
         * Type of maintenenace window
         * @param maintenanceWindowType the value to set
         * @return this builder
         **/
        public Builder maintenanceWindowType(MaintenanceWindowType maintenanceWindowType) {
            this.maintenanceWindowType = maintenanceWindowType;
            this.__explicitlySet__.add("maintenanceWindowType");
            return this;
        }
        /**
         * Specify the date and time of the day that the maintenance window starts.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeScheduleStart")
        private java.util.Date timeScheduleStart;

        /**
         * Specify the date and time of the day that the maintenance window starts.
         * @param timeScheduleStart the value to set
         * @return this builder
         **/
        public Builder timeScheduleStart(java.util.Date timeScheduleStart) {
            this.timeScheduleStart = timeScheduleStart;
            this.__explicitlySet__.add("timeScheduleStart");
            return this;
        }
        /**
         * Duration of the maintenance window.
         * Specify how long the maintenance window remains open.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("duration")
        private String duration;

        /**
         * Duration of the maintenance window.
         * Specify how long the maintenance window remains open.
         *
         * @param duration the value to set
         * @return this builder
         **/
        public Builder duration(String duration) {
            this.duration = duration;
            this.__explicitlySet__.add("duration");
            return this;
        }
        /**
         * Is this a recurring maintenance window?
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isRecurring")
        private Boolean isRecurring;

        /**
         * Is this a recurring maintenance window?
         * @param isRecurring the value to set
         * @return this builder
         **/
        public Builder isRecurring(Boolean isRecurring) {
            this.isRecurring = isRecurring;
            this.__explicitlySet__.add("isRecurring");
            return this;
        }
        /**
         * Recurrence rule specification if maintenance window recurring.
         * Specify the frequency of running the maintenance window.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recurrences")
        private String recurrences;

        /**
         * Recurrence rule specification if maintenance window recurring.
         * Specify the frequency of running the maintenance window.
         *
         * @param recurrences the value to set
         * @return this builder
         **/
        public Builder recurrences(String recurrences) {
            this.recurrences = recurrences;
            this.__explicitlySet__.add("recurrences");
            return this;
        }
        /**
         * Task initiation cutoff time for the maintenance window.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("taskInitiationCutoff")
        private Integer taskInitiationCutoff;

        /**
         * Task initiation cutoff time for the maintenance window.
         * @param taskInitiationCutoff the value to set
         * @return this builder
         **/
        public Builder taskInitiationCutoff(Integer taskInitiationCutoff) {
            this.taskInitiationCutoff = taskInitiationCutoff;
            this.__explicitlySet__.add("taskInitiationCutoff");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMaintenanceWindowDetails build() {
            CreateMaintenanceWindowDetails model =
                    new CreateMaintenanceWindowDetails(
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.isOutage,
                            this.maintenanceWindowType,
                            this.timeScheduleStart,
                            this.duration,
                            this.isRecurring,
                            this.recurrences,
                            this.taskInitiationCutoff,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMaintenanceWindowDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isOutage")) {
                this.isOutage(model.getIsOutage());
            }
            if (model.wasPropertyExplicitlySet("maintenanceWindowType")) {
                this.maintenanceWindowType(model.getMaintenanceWindowType());
            }
            if (model.wasPropertyExplicitlySet("timeScheduleStart")) {
                this.timeScheduleStart(model.getTimeScheduleStart());
            }
            if (model.wasPropertyExplicitlySet("duration")) {
                this.duration(model.getDuration());
            }
            if (model.wasPropertyExplicitlySet("isRecurring")) {
                this.isRecurring(model.getIsRecurring());
            }
            if (model.wasPropertyExplicitlySet("recurrences")) {
                this.recurrences(model.getRecurrences());
            }
            if (model.wasPropertyExplicitlySet("taskInitiationCutoff")) {
                this.taskInitiationCutoff(model.getTaskInitiationCutoff());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * Tenancy OCID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Tenancy OCID
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My new resource}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     * <p>
     * Example: {@code My new resource}
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * A user-friendly description. To provide some insight about the resource.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user-friendly description. To provide some insight about the resource.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Does the maintenenace window cause outage?
     * An outage indicates whether a maintenance window can consider operations that require downtime.
     * It means a period when the application is not accessible.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOutage")
    private final Boolean isOutage;

    /**
     * Does the maintenenace window cause outage?
     * An outage indicates whether a maintenance window can consider operations that require downtime.
     * It means a period when the application is not accessible.
     *
     * @return the value
     **/
    public Boolean getIsOutage() {
        return isOutage;
    }

    /**
     * Type of maintenenace window
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowType")
    private final MaintenanceWindowType maintenanceWindowType;

    /**
     * Type of maintenenace window
     * @return the value
     **/
    public MaintenanceWindowType getMaintenanceWindowType() {
        return maintenanceWindowType;
    }

    /**
     * Specify the date and time of the day that the maintenance window starts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeScheduleStart")
    private final java.util.Date timeScheduleStart;

    /**
     * Specify the date and time of the day that the maintenance window starts.
     * @return the value
     **/
    public java.util.Date getTimeScheduleStart() {
        return timeScheduleStart;
    }

    /**
     * Duration of the maintenance window.
     * Specify how long the maintenance window remains open.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    private final String duration;

    /**
     * Duration of the maintenance window.
     * Specify how long the maintenance window remains open.
     *
     * @return the value
     **/
    public String getDuration() {
        return duration;
    }

    /**
     * Is this a recurring maintenance window?
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isRecurring")
    private final Boolean isRecurring;

    /**
     * Is this a recurring maintenance window?
     * @return the value
     **/
    public Boolean getIsRecurring() {
        return isRecurring;
    }

    /**
     * Recurrence rule specification if maintenance window recurring.
     * Specify the frequency of running the maintenance window.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recurrences")
    private final String recurrences;

    /**
     * Recurrence rule specification if maintenance window recurring.
     * Specify the frequency of running the maintenance window.
     *
     * @return the value
     **/
    public String getRecurrences() {
        return recurrences;
    }

    /**
     * Task initiation cutoff time for the maintenance window.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("taskInitiationCutoff")
    private final Integer taskInitiationCutoff;

    /**
     * Task initiation cutoff time for the maintenance window.
     * @return the value
     **/
    public Integer getTaskInitiationCutoff() {
        return taskInitiationCutoff;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateMaintenanceWindowDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isOutage=").append(String.valueOf(this.isOutage));
        sb.append(", maintenanceWindowType=").append(String.valueOf(this.maintenanceWindowType));
        sb.append(", timeScheduleStart=").append(String.valueOf(this.timeScheduleStart));
        sb.append(", duration=").append(String.valueOf(this.duration));
        sb.append(", isRecurring=").append(String.valueOf(this.isRecurring));
        sb.append(", recurrences=").append(String.valueOf(this.recurrences));
        sb.append(", taskInitiationCutoff=").append(String.valueOf(this.taskInitiationCutoff));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMaintenanceWindowDetails)) {
            return false;
        }

        CreateMaintenanceWindowDetails other = (CreateMaintenanceWindowDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isOutage, other.isOutage)
                && java.util.Objects.equals(this.maintenanceWindowType, other.maintenanceWindowType)
                && java.util.Objects.equals(this.timeScheduleStart, other.timeScheduleStart)
                && java.util.Objects.equals(this.duration, other.duration)
                && java.util.Objects.equals(this.isRecurring, other.isRecurring)
                && java.util.Objects.equals(this.recurrences, other.recurrences)
                && java.util.Objects.equals(this.taskInitiationCutoff, other.taskInitiationCutoff)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.isOutage == null ? 43 : this.isOutage.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceWindowType == null
                                ? 43
                                : this.maintenanceWindowType.hashCode());
        result =
                (result * PRIME)
                        + (this.timeScheduleStart == null ? 43 : this.timeScheduleStart.hashCode());
        result = (result * PRIME) + (this.duration == null ? 43 : this.duration.hashCode());
        result = (result * PRIME) + (this.isRecurring == null ? 43 : this.isRecurring.hashCode());
        result = (result * PRIME) + (this.recurrences == null ? 43 : this.recurrences.hashCode());
        result =
                (result * PRIME)
                        + (this.taskInitiationCutoff == null
                                ? 43
                                : this.taskInitiationCutoff.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
