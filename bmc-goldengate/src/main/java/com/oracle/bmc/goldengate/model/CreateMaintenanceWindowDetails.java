/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Defines the maintenance window for create operation, when automatic actions can be performed.
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateMaintenanceWindowDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateMaintenanceWindowDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"day", "startHour"})
    public CreateMaintenanceWindowDetails(Day day, Integer startHour) {
        super();
        this.day = day;
        this.startHour = startHour;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Days of the week. */
        @com.fasterxml.jackson.annotation.JsonProperty("day")
        private Day day;

        /**
         * Days of the week.
         *
         * @param day the value to set
         * @return this builder
         */
        public Builder day(Day day) {
            this.day = day;
            this.__explicitlySet__.add("day");
            return this;
        }
        /** Start hour for maintenance period. Hour is in UTC. */
        @com.fasterxml.jackson.annotation.JsonProperty("startHour")
        private Integer startHour;

        /**
         * Start hour for maintenance period. Hour is in UTC.
         *
         * @param startHour the value to set
         * @return this builder
         */
        public Builder startHour(Integer startHour) {
            this.startHour = startHour;
            this.__explicitlySet__.add("startHour");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMaintenanceWindowDetails build() {
            CreateMaintenanceWindowDetails model =
                    new CreateMaintenanceWindowDetails(this.day, this.startHour);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMaintenanceWindowDetails model) {
            if (model.wasPropertyExplicitlySet("day")) {
                this.day(model.getDay());
            }
            if (model.wasPropertyExplicitlySet("startHour")) {
                this.startHour(model.getStartHour());
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

    /** Days of the week. */
    @com.fasterxml.jackson.annotation.JsonProperty("day")
    private final Day day;

    /**
     * Days of the week.
     *
     * @return the value
     */
    public Day getDay() {
        return day;
    }

    /** Start hour for maintenance period. Hour is in UTC. */
    @com.fasterxml.jackson.annotation.JsonProperty("startHour")
    private final Integer startHour;

    /**
     * Start hour for maintenance period. Hour is in UTC.
     *
     * @return the value
     */
    public Integer getStartHour() {
        return startHour;
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
        sb.append("CreateMaintenanceWindowDetails(");
        sb.append("super=").append(super.toString());
        sb.append("day=").append(String.valueOf(this.day));
        sb.append(", startHour=").append(String.valueOf(this.startHour));
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
        return java.util.Objects.equals(this.day, other.day)
                && java.util.Objects.equals(this.startHour, other.startHour)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.day == null ? 43 : this.day.hashCode());
        result = (result * PRIME) + (this.startHour == null ? 43 : this.startHour.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
