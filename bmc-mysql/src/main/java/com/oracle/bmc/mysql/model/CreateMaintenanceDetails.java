/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * The Maintenance Policy for the DB System or Read Replica that this model is included in.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateMaintenanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateMaintenanceDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"windowStartTime"})
    public CreateMaintenanceDetails(String windowStartTime) {
        super();
        this.windowStartTime = windowStartTime;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The start of the 2 hour maintenance window.
         * <p>
         * This string is of the format: "{day-of-week} {time-of-day}".
         * <p>
         * "{day-of-week}" is a case-insensitive string like "mon", "tue", &c.
         * <p>
         * "{time-of-day}" is the "Time" portion of an RFC3339-formatted timestamp. Any second or sub-second time data will be truncated to zero.
         * <p>
         * If you set the read replica maintenance window to "" or if not specified, the read replica is set same as the DB system maintenance window.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("windowStartTime")
        private String windowStartTime;

        /**
         * The start of the 2 hour maintenance window.
         * <p>
         * This string is of the format: "{day-of-week} {time-of-day}".
         * <p>
         * "{day-of-week}" is a case-insensitive string like "mon", "tue", &c.
         * <p>
         * "{time-of-day}" is the "Time" portion of an RFC3339-formatted timestamp. Any second or sub-second time data will be truncated to zero.
         * <p>
         * If you set the read replica maintenance window to "" or if not specified, the read replica is set same as the DB system maintenance window.
         *
         * @param windowStartTime the value to set
         * @return this builder
         **/
        public Builder windowStartTime(String windowStartTime) {
            this.windowStartTime = windowStartTime;
            this.__explicitlySet__.add("windowStartTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMaintenanceDetails build() {
            CreateMaintenanceDetails model = new CreateMaintenanceDetails(this.windowStartTime);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMaintenanceDetails model) {
            if (model.wasPropertyExplicitlySet("windowStartTime")) {
                this.windowStartTime(model.getWindowStartTime());
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
     * The start of the 2 hour maintenance window.
     * <p>
     * This string is of the format: "{day-of-week} {time-of-day}".
     * <p>
     * "{day-of-week}" is a case-insensitive string like "mon", "tue", &c.
     * <p>
     * "{time-of-day}" is the "Time" portion of an RFC3339-formatted timestamp. Any second or sub-second time data will be truncated to zero.
     * <p>
     * If you set the read replica maintenance window to "" or if not specified, the read replica is set same as the DB system maintenance window.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("windowStartTime")
    private final String windowStartTime;

    /**
     * The start of the 2 hour maintenance window.
     * <p>
     * This string is of the format: "{day-of-week} {time-of-day}".
     * <p>
     * "{day-of-week}" is a case-insensitive string like "mon", "tue", &c.
     * <p>
     * "{time-of-day}" is the "Time" portion of an RFC3339-formatted timestamp. Any second or sub-second time data will be truncated to zero.
     * <p>
     * If you set the read replica maintenance window to "" or if not specified, the read replica is set same as the DB system maintenance window.
     *
     * @return the value
     **/
    public String getWindowStartTime() {
        return windowStartTime;
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
        sb.append("CreateMaintenanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("windowStartTime=").append(String.valueOf(this.windowStartTime));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMaintenanceDetails)) {
            return false;
        }

        CreateMaintenanceDetails other = (CreateMaintenanceDetails) o;
        return java.util.Objects.equals(this.windowStartTime, other.windowStartTime)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.windowStartTime == null ? 43 : this.windowStartTime.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
