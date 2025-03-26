/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Schedule Information.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Schedule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Schedule extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "type",
        "executionStartdate",
        "maintenanceWindowId",
        "recurrences",
        "duration"
    })
    public Schedule(
            Type type,
            java.util.Date executionStartdate,
            String maintenanceWindowId,
            String recurrences,
            String duration) {
        super();
        this.type = type;
        this.executionStartdate = executionStartdate;
        this.maintenanceWindowId = maintenanceWindowId;
        this.recurrences = recurrences;
        this.duration = duration;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Schedule Type
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Schedule Type
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Start Date for the schedule. An RFC3339 formatted datetime string
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("executionStartdate")
        private java.util.Date executionStartdate;

        /**
         * Start Date for the schedule. An RFC3339 formatted datetime string
         * @param executionStartdate the value to set
         * @return this builder
         **/
        public Builder executionStartdate(java.util.Date executionStartdate) {
            this.executionStartdate = executionStartdate;
            this.__explicitlySet__.add("executionStartdate");
            return this;
        }
        /**
         * Provide MaintenanceWindowId if Schedule Type is Maintenance Window
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowId")
        private String maintenanceWindowId;

        /**
         * Provide MaintenanceWindowId if Schedule Type is Maintenance Window
         * @param maintenanceWindowId the value to set
         * @return this builder
         **/
        public Builder maintenanceWindowId(String maintenanceWindowId) {
            this.maintenanceWindowId = maintenanceWindowId;
            this.__explicitlySet__.add("maintenanceWindowId");
            return this;
        }
        /**
         * Recurrence rule specification if Schedule Type is Custom and Recurring
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("recurrences")
        private String recurrences;

        /**
         * Recurrence rule specification if Schedule Type is Custom and Recurring
         * @param recurrences the value to set
         * @return this builder
         **/
        public Builder recurrences(String recurrences) {
            this.recurrences = recurrences;
            this.__explicitlySet__.add("recurrences");
            return this;
        }
        /**
         * Duration if schedule type is Custom
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("duration")
        private String duration;

        /**
         * Duration if schedule type is Custom
         * @param duration the value to set
         * @return this builder
         **/
        public Builder duration(String duration) {
            this.duration = duration;
            this.__explicitlySet__.add("duration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Schedule build() {
            Schedule model =
                    new Schedule(
                            this.type,
                            this.executionStartdate,
                            this.maintenanceWindowId,
                            this.recurrences,
                            this.duration);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Schedule model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("executionStartdate")) {
                this.executionStartdate(model.getExecutionStartdate());
            }
            if (model.wasPropertyExplicitlySet("maintenanceWindowId")) {
                this.maintenanceWindowId(model.getMaintenanceWindowId());
            }
            if (model.wasPropertyExplicitlySet("recurrences")) {
                this.recurrences(model.getRecurrences());
            }
            if (model.wasPropertyExplicitlySet("duration")) {
                this.duration(model.getDuration());
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
     * Schedule Type
     **/
    public enum Type {
        Custom("CUSTOM"),
        MaintenanceWindow("MAINTENANCE_WINDOW"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * Schedule Type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Schedule Type
     * @return the value
     **/
    public Type getType() {
        return type;
    }

    /**
     * Start Date for the schedule. An RFC3339 formatted datetime string
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("executionStartdate")
    private final java.util.Date executionStartdate;

    /**
     * Start Date for the schedule. An RFC3339 formatted datetime string
     * @return the value
     **/
    public java.util.Date getExecutionStartdate() {
        return executionStartdate;
    }

    /**
     * Provide MaintenanceWindowId if Schedule Type is Maintenance Window
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceWindowId")
    private final String maintenanceWindowId;

    /**
     * Provide MaintenanceWindowId if Schedule Type is Maintenance Window
     * @return the value
     **/
    public String getMaintenanceWindowId() {
        return maintenanceWindowId;
    }

    /**
     * Recurrence rule specification if Schedule Type is Custom and Recurring
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recurrences")
    private final String recurrences;

    /**
     * Recurrence rule specification if Schedule Type is Custom and Recurring
     * @return the value
     **/
    public String getRecurrences() {
        return recurrences;
    }

    /**
     * Duration if schedule type is Custom
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("duration")
    private final String duration;

    /**
     * Duration if schedule type is Custom
     * @return the value
     **/
    public String getDuration() {
        return duration;
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
        sb.append("Schedule(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", executionStartdate=").append(String.valueOf(this.executionStartdate));
        sb.append(", maintenanceWindowId=").append(String.valueOf(this.maintenanceWindowId));
        sb.append(", recurrences=").append(String.valueOf(this.recurrences));
        sb.append(", duration=").append(String.valueOf(this.duration));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Schedule)) {
            return false;
        }

        Schedule other = (Schedule) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.executionStartdate, other.executionStartdate)
                && java.util.Objects.equals(this.maintenanceWindowId, other.maintenanceWindowId)
                && java.util.Objects.equals(this.recurrences, other.recurrences)
                && java.util.Objects.equals(this.duration, other.duration)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.executionStartdate == null
                                ? 43
                                : this.executionStartdate.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceWindowId == null
                                ? 43
                                : this.maintenanceWindowId.hashCode());
        result = (result * PRIME) + (this.recurrences == null ? 43 : this.recurrences.hashCode());
        result = (result * PRIME) + (this.duration == null ? 43 : this.duration.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
