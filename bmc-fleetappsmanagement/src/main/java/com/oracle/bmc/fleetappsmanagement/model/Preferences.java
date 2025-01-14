/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Preferences to send notifications on the fleet activities. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Preferences.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Preferences extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "onUpcomingSchedule",
        "onJobFailure",
        "onTopologyModification"
    })
    public Preferences(
            Boolean onUpcomingSchedule, Boolean onJobFailure, Boolean onTopologyModification) {
        super();
        this.onUpcomingSchedule = onUpcomingSchedule;
        this.onJobFailure = onJobFailure;
        this.onTopologyModification = onTopologyModification;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Enables notification on upcoming schedule. */
        @com.fasterxml.jackson.annotation.JsonProperty("onUpcomingSchedule")
        private Boolean onUpcomingSchedule;

        /**
         * Enables notification on upcoming schedule.
         *
         * @param onUpcomingSchedule the value to set
         * @return this builder
         */
        public Builder onUpcomingSchedule(Boolean onUpcomingSchedule) {
            this.onUpcomingSchedule = onUpcomingSchedule;
            this.__explicitlySet__.add("onUpcomingSchedule");
            return this;
        }
        /** Enables or disables notification on Job Failures. */
        @com.fasterxml.jackson.annotation.JsonProperty("onJobFailure")
        private Boolean onJobFailure;

        /**
         * Enables or disables notification on Job Failures.
         *
         * @param onJobFailure the value to set
         * @return this builder
         */
        public Builder onJobFailure(Boolean onJobFailure) {
            this.onJobFailure = onJobFailure;
            this.__explicitlySet__.add("onJobFailure");
            return this;
        }
        /** Enables or disables notification on Environment Fleet Topology Modification. */
        @com.fasterxml.jackson.annotation.JsonProperty("onTopologyModification")
        private Boolean onTopologyModification;

        /**
         * Enables or disables notification on Environment Fleet Topology Modification.
         *
         * @param onTopologyModification the value to set
         * @return this builder
         */
        public Builder onTopologyModification(Boolean onTopologyModification) {
            this.onTopologyModification = onTopologyModification;
            this.__explicitlySet__.add("onTopologyModification");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Preferences build() {
            Preferences model =
                    new Preferences(
                            this.onUpcomingSchedule,
                            this.onJobFailure,
                            this.onTopologyModification);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Preferences model) {
            if (model.wasPropertyExplicitlySet("onUpcomingSchedule")) {
                this.onUpcomingSchedule(model.getOnUpcomingSchedule());
            }
            if (model.wasPropertyExplicitlySet("onJobFailure")) {
                this.onJobFailure(model.getOnJobFailure());
            }
            if (model.wasPropertyExplicitlySet("onTopologyModification")) {
                this.onTopologyModification(model.getOnTopologyModification());
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

    /** Enables notification on upcoming schedule. */
    @com.fasterxml.jackson.annotation.JsonProperty("onUpcomingSchedule")
    private final Boolean onUpcomingSchedule;

    /**
     * Enables notification on upcoming schedule.
     *
     * @return the value
     */
    public Boolean getOnUpcomingSchedule() {
        return onUpcomingSchedule;
    }

    /** Enables or disables notification on Job Failures. */
    @com.fasterxml.jackson.annotation.JsonProperty("onJobFailure")
    private final Boolean onJobFailure;

    /**
     * Enables or disables notification on Job Failures.
     *
     * @return the value
     */
    public Boolean getOnJobFailure() {
        return onJobFailure;
    }

    /** Enables or disables notification on Environment Fleet Topology Modification. */
    @com.fasterxml.jackson.annotation.JsonProperty("onTopologyModification")
    private final Boolean onTopologyModification;

    /**
     * Enables or disables notification on Environment Fleet Topology Modification.
     *
     * @return the value
     */
    public Boolean getOnTopologyModification() {
        return onTopologyModification;
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
        sb.append("Preferences(");
        sb.append("super=").append(super.toString());
        sb.append("onUpcomingSchedule=").append(String.valueOf(this.onUpcomingSchedule));
        sb.append(", onJobFailure=").append(String.valueOf(this.onJobFailure));
        sb.append(", onTopologyModification=").append(String.valueOf(this.onTopologyModification));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Preferences)) {
            return false;
        }

        Preferences other = (Preferences) o;
        return java.util.Objects.equals(this.onUpcomingSchedule, other.onUpcomingSchedule)
                && java.util.Objects.equals(this.onJobFailure, other.onJobFailure)
                && java.util.Objects.equals(
                        this.onTopologyModification, other.onTopologyModification)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.onUpcomingSchedule == null
                                ? 43
                                : this.onUpcomingSchedule.hashCode());
        result = (result * PRIME) + (this.onJobFailure == null ? 43 : this.onJobFailure.hashCode());
        result =
                (result * PRIME)
                        + (this.onTopologyModification == null
                                ? 43
                                : this.onTopologyModification.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
