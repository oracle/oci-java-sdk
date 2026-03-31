/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lustrefilestorage.model;

/**
 * Information about the list of available start times on a particular date.
 * User can choose their preferred date and start time for creating request/input for Override operation.
 *
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
    builder = AvailableOverrideMaintenanceStartTimeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AvailableOverrideMaintenanceStartTimeSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeDateAvailable", "startTimes"})
    public AvailableOverrideMaintenanceStartTimeSummary(
            java.util.Date timeDateAvailable, java.util.List<String> startTimes) {
        super();
        this.timeDateAvailable = timeDateAvailable;
        this.startTimes = startTimes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The date corresponding to the list of start times available.
         * <p>
         * Example: {@code 2024-04-25T00:00:00.000Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeDateAvailable")
        private java.util.Date timeDateAvailable;

        /**
         * The date corresponding to the list of start times available.
         * <p>
         * Example: {@code 2024-04-25T00:00:00.000Z}
         *
         * @param timeDateAvailable the value to set
         * @return this builder
         **/
        public Builder timeDateAvailable(java.util.Date timeDateAvailable) {
            this.timeDateAvailable = timeDateAvailable;
            this.__explicitlySet__.add("timeDateAvailable");
            return this;
        }
        /**
         * List of available start times. Each array item is of the format {@code HH:mm}
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("startTimes")
        private java.util.List<String> startTimes;

        /**
         * List of available start times. Each array item is of the format {@code HH:mm}
         * @param startTimes the value to set
         * @return this builder
         **/
        public Builder startTimes(java.util.List<String> startTimes) {
            this.startTimes = startTimes;
            this.__explicitlySet__.add("startTimes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AvailableOverrideMaintenanceStartTimeSummary build() {
            AvailableOverrideMaintenanceStartTimeSummary model =
                    new AvailableOverrideMaintenanceStartTimeSummary(
                            this.timeDateAvailable, this.startTimes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AvailableOverrideMaintenanceStartTimeSummary model) {
            if (model.wasPropertyExplicitlySet("timeDateAvailable")) {
                this.timeDateAvailable(model.getTimeDateAvailable());
            }
            if (model.wasPropertyExplicitlySet("startTimes")) {
                this.startTimes(model.getStartTimes());
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
     * The date corresponding to the list of start times available.
     * <p>
     * Example: {@code 2024-04-25T00:00:00.000Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDateAvailable")
    private final java.util.Date timeDateAvailable;

    /**
     * The date corresponding to the list of start times available.
     * <p>
     * Example: {@code 2024-04-25T00:00:00.000Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeDateAvailable() {
        return timeDateAvailable;
    }

    /**
     * List of available start times. Each array item is of the format {@code HH:mm}
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("startTimes")
    private final java.util.List<String> startTimes;

    /**
     * List of available start times. Each array item is of the format {@code HH:mm}
     * @return the value
     **/
    public java.util.List<String> getStartTimes() {
        return startTimes;
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
        sb.append("AvailableOverrideMaintenanceStartTimeSummary(");
        sb.append("super=").append(super.toString());
        sb.append("timeDateAvailable=").append(String.valueOf(this.timeDateAvailable));
        sb.append(", startTimes=").append(String.valueOf(this.startTimes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AvailableOverrideMaintenanceStartTimeSummary)) {
            return false;
        }

        AvailableOverrideMaintenanceStartTimeSummary other =
                (AvailableOverrideMaintenanceStartTimeSummary) o;
        return java.util.Objects.equals(this.timeDateAvailable, other.timeDateAvailable)
                && java.util.Objects.equals(this.startTimes, other.startTimes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeDateAvailable == null ? 43 : this.timeDateAvailable.hashCode());
        result = (result * PRIME) + (this.startTimes == null ? 43 : this.startTimes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
