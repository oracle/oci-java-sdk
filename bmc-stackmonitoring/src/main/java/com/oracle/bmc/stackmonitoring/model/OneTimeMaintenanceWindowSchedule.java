/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.stackmonitoring.model;

/**
 * Schedule information for the Maintenance Window that is executed only once. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210330")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OneTimeMaintenanceWindowSchedule.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "scheduleType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OneTimeMaintenanceWindowSchedule extends MaintenanceWindowSchedule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Start time of Maintenance window. A RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceWindowStart")
        private java.util.Date timeMaintenanceWindowStart;

        /**
         * Start time of Maintenance window. A RFC3339 formatted datetime string
         *
         * @param timeMaintenanceWindowStart the value to set
         * @return this builder
         */
        public Builder timeMaintenanceWindowStart(java.util.Date timeMaintenanceWindowStart) {
            this.timeMaintenanceWindowStart = timeMaintenanceWindowStart;
            this.__explicitlySet__.add("timeMaintenanceWindowStart");
            return this;
        }
        /** Start time of Maintenance window. A RFC3339 formatted datetime string */
        @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceWindowEnd")
        private java.util.Date timeMaintenanceWindowEnd;

        /**
         * Start time of Maintenance window. A RFC3339 formatted datetime string
         *
         * @param timeMaintenanceWindowEnd the value to set
         * @return this builder
         */
        public Builder timeMaintenanceWindowEnd(java.util.Date timeMaintenanceWindowEnd) {
            this.timeMaintenanceWindowEnd = timeMaintenanceWindowEnd;
            this.__explicitlySet__.add("timeMaintenanceWindowEnd");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OneTimeMaintenanceWindowSchedule build() {
            OneTimeMaintenanceWindowSchedule model =
                    new OneTimeMaintenanceWindowSchedule(
                            this.timeMaintenanceWindowStart, this.timeMaintenanceWindowEnd);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OneTimeMaintenanceWindowSchedule model) {
            if (model.wasPropertyExplicitlySet("timeMaintenanceWindowStart")) {
                this.timeMaintenanceWindowStart(model.getTimeMaintenanceWindowStart());
            }
            if (model.wasPropertyExplicitlySet("timeMaintenanceWindowEnd")) {
                this.timeMaintenanceWindowEnd(model.getTimeMaintenanceWindowEnd());
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

    @Deprecated
    public OneTimeMaintenanceWindowSchedule(
            java.util.Date timeMaintenanceWindowStart, java.util.Date timeMaintenanceWindowEnd) {
        super();
        this.timeMaintenanceWindowStart = timeMaintenanceWindowStart;
        this.timeMaintenanceWindowEnd = timeMaintenanceWindowEnd;
    }

    /** Start time of Maintenance window. A RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceWindowStart")
    private final java.util.Date timeMaintenanceWindowStart;

    /**
     * Start time of Maintenance window. A RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeMaintenanceWindowStart() {
        return timeMaintenanceWindowStart;
    }

    /** Start time of Maintenance window. A RFC3339 formatted datetime string */
    @com.fasterxml.jackson.annotation.JsonProperty("timeMaintenanceWindowEnd")
    private final java.util.Date timeMaintenanceWindowEnd;

    /**
     * Start time of Maintenance window. A RFC3339 formatted datetime string
     *
     * @return the value
     */
    public java.util.Date getTimeMaintenanceWindowEnd() {
        return timeMaintenanceWindowEnd;
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
        sb.append("OneTimeMaintenanceWindowSchedule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", timeMaintenanceWindowStart=")
                .append(String.valueOf(this.timeMaintenanceWindowStart));
        sb.append(", timeMaintenanceWindowEnd=")
                .append(String.valueOf(this.timeMaintenanceWindowEnd));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OneTimeMaintenanceWindowSchedule)) {
            return false;
        }

        OneTimeMaintenanceWindowSchedule other = (OneTimeMaintenanceWindowSchedule) o;
        return java.util.Objects.equals(
                        this.timeMaintenanceWindowStart, other.timeMaintenanceWindowStart)
                && java.util.Objects.equals(
                        this.timeMaintenanceWindowEnd, other.timeMaintenanceWindowEnd)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.timeMaintenanceWindowStart == null
                                ? 43
                                : this.timeMaintenanceWindowStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeMaintenanceWindowEnd == null
                                ? 43
                                : this.timeMaintenanceWindowEnd.hashCode());
        return result;
    }
}
