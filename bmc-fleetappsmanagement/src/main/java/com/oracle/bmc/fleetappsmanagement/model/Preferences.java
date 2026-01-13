/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Preferences.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Preferences extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "upcomingSchedule",
        "onJobFailure",
        "onTopologyModification",
        "onTaskPause",
        "onTaskFailure",
        "onTaskSuccess",
        "onResourceNonCompliance",
        "onRunbookNewerVersion",
        "onJobSuccess",
        "onJobStart",
        "onJobCanceled",
        "onJobScheduleChange"
    })
    public Preferences(
            UpcomingSchedule upcomingSchedule,
            Boolean onJobFailure,
            Boolean onTopologyModification,
            Boolean onTaskPause,
            Boolean onTaskFailure,
            Boolean onTaskSuccess,
            Boolean onResourceNonCompliance,
            Boolean onRunbookNewerVersion,
            Boolean onJobSuccess,
            Boolean onJobStart,
            Boolean onJobCanceled,
            Boolean onJobScheduleChange) {
        super();
        this.upcomingSchedule = upcomingSchedule;
        this.onJobFailure = onJobFailure;
        this.onTopologyModification = onTopologyModification;
        this.onTaskPause = onTaskPause;
        this.onTaskFailure = onTaskFailure;
        this.onTaskSuccess = onTaskSuccess;
        this.onResourceNonCompliance = onResourceNonCompliance;
        this.onRunbookNewerVersion = onRunbookNewerVersion;
        this.onJobSuccess = onJobSuccess;
        this.onJobStart = onJobStart;
        this.onJobCanceled = onJobCanceled;
        this.onJobScheduleChange = onJobScheduleChange;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("upcomingSchedule")
        private UpcomingSchedule upcomingSchedule;

        public Builder upcomingSchedule(UpcomingSchedule upcomingSchedule) {
            this.upcomingSchedule = upcomingSchedule;
            this.__explicitlySet__.add("upcomingSchedule");
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
        /** Enables or disables notification when a task is paused. */
        @com.fasterxml.jackson.annotation.JsonProperty("onTaskPause")
        private Boolean onTaskPause;

        /**
         * Enables or disables notification when a task is paused.
         *
         * @param onTaskPause the value to set
         * @return this builder
         */
        public Builder onTaskPause(Boolean onTaskPause) {
            this.onTaskPause = onTaskPause;
            this.__explicitlySet__.add("onTaskPause");
            return this;
        }
        /** Enables or disables notification on task failure. */
        @com.fasterxml.jackson.annotation.JsonProperty("onTaskFailure")
        private Boolean onTaskFailure;

        /**
         * Enables or disables notification on task failure.
         *
         * @param onTaskFailure the value to set
         * @return this builder
         */
        public Builder onTaskFailure(Boolean onTaskFailure) {
            this.onTaskFailure = onTaskFailure;
            this.__explicitlySet__.add("onTaskFailure");
            return this;
        }
        /** Enables or disables notification on task success. */
        @com.fasterxml.jackson.annotation.JsonProperty("onTaskSuccess")
        private Boolean onTaskSuccess;

        /**
         * Enables or disables notification on task success.
         *
         * @param onTaskSuccess the value to set
         * @return this builder
         */
        public Builder onTaskSuccess(Boolean onTaskSuccess) {
            this.onTaskSuccess = onTaskSuccess;
            this.__explicitlySet__.add("onTaskSuccess");
            return this;
        }
        /** Enables or disables notification when fleet resource becomes non compliant. */
        @com.fasterxml.jackson.annotation.JsonProperty("onResourceNonCompliance")
        private Boolean onResourceNonCompliance;

        /**
         * Enables or disables notification when fleet resource becomes non compliant.
         *
         * @param onResourceNonCompliance the value to set
         * @return this builder
         */
        public Builder onResourceNonCompliance(Boolean onResourceNonCompliance) {
            this.onResourceNonCompliance = onResourceNonCompliance;
            this.__explicitlySet__.add("onResourceNonCompliance");
            return this;
        }
        /**
         * Enables or disables notification when a newer version of runbook associated with a fleet
         * is available
         */
        @com.fasterxml.jackson.annotation.JsonProperty("onRunbookNewerVersion")
        private Boolean onRunbookNewerVersion;

        /**
         * Enables or disables notification when a newer version of runbook associated with a fleet
         * is available
         *
         * @param onRunbookNewerVersion the value to set
         * @return this builder
         */
        public Builder onRunbookNewerVersion(Boolean onRunbookNewerVersion) {
            this.onRunbookNewerVersion = onRunbookNewerVersion;
            this.__explicitlySet__.add("onRunbookNewerVersion");
            return this;
        }
        /** Enables or disables notification on job success. */
        @com.fasterxml.jackson.annotation.JsonProperty("onJobSuccess")
        private Boolean onJobSuccess;

        /**
         * Enables or disables notification on job success.
         *
         * @param onJobSuccess the value to set
         * @return this builder
         */
        public Builder onJobSuccess(Boolean onJobSuccess) {
            this.onJobSuccess = onJobSuccess;
            this.__explicitlySet__.add("onJobSuccess");
            return this;
        }
        /** Enables or disables notification on job start. */
        @com.fasterxml.jackson.annotation.JsonProperty("onJobStart")
        private Boolean onJobStart;

        /**
         * Enables or disables notification on job start.
         *
         * @param onJobStart the value to set
         * @return this builder
         */
        public Builder onJobStart(Boolean onJobStart) {
            this.onJobStart = onJobStart;
            this.__explicitlySet__.add("onJobStart");
            return this;
        }
        /** Enables or disables notification on job canceled. */
        @com.fasterxml.jackson.annotation.JsonProperty("onJobCanceled")
        private Boolean onJobCanceled;

        /**
         * Enables or disables notification on job canceled.
         *
         * @param onJobCanceled the value to set
         * @return this builder
         */
        public Builder onJobCanceled(Boolean onJobCanceled) {
            this.onJobCanceled = onJobCanceled;
            this.__explicitlySet__.add("onJobCanceled");
            return this;
        }
        /** Enables or disables notification on job schedule change. */
        @com.fasterxml.jackson.annotation.JsonProperty("onJobScheduleChange")
        private Boolean onJobScheduleChange;

        /**
         * Enables or disables notification on job schedule change.
         *
         * @param onJobScheduleChange the value to set
         * @return this builder
         */
        public Builder onJobScheduleChange(Boolean onJobScheduleChange) {
            this.onJobScheduleChange = onJobScheduleChange;
            this.__explicitlySet__.add("onJobScheduleChange");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Preferences build() {
            Preferences model =
                    new Preferences(
                            this.upcomingSchedule,
                            this.onJobFailure,
                            this.onTopologyModification,
                            this.onTaskPause,
                            this.onTaskFailure,
                            this.onTaskSuccess,
                            this.onResourceNonCompliance,
                            this.onRunbookNewerVersion,
                            this.onJobSuccess,
                            this.onJobStart,
                            this.onJobCanceled,
                            this.onJobScheduleChange);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Preferences model) {
            if (model.wasPropertyExplicitlySet("upcomingSchedule")) {
                this.upcomingSchedule(model.getUpcomingSchedule());
            }
            if (model.wasPropertyExplicitlySet("onJobFailure")) {
                this.onJobFailure(model.getOnJobFailure());
            }
            if (model.wasPropertyExplicitlySet("onTopologyModification")) {
                this.onTopologyModification(model.getOnTopologyModification());
            }
            if (model.wasPropertyExplicitlySet("onTaskPause")) {
                this.onTaskPause(model.getOnTaskPause());
            }
            if (model.wasPropertyExplicitlySet("onTaskFailure")) {
                this.onTaskFailure(model.getOnTaskFailure());
            }
            if (model.wasPropertyExplicitlySet("onTaskSuccess")) {
                this.onTaskSuccess(model.getOnTaskSuccess());
            }
            if (model.wasPropertyExplicitlySet("onResourceNonCompliance")) {
                this.onResourceNonCompliance(model.getOnResourceNonCompliance());
            }
            if (model.wasPropertyExplicitlySet("onRunbookNewerVersion")) {
                this.onRunbookNewerVersion(model.getOnRunbookNewerVersion());
            }
            if (model.wasPropertyExplicitlySet("onJobSuccess")) {
                this.onJobSuccess(model.getOnJobSuccess());
            }
            if (model.wasPropertyExplicitlySet("onJobStart")) {
                this.onJobStart(model.getOnJobStart());
            }
            if (model.wasPropertyExplicitlySet("onJobCanceled")) {
                this.onJobCanceled(model.getOnJobCanceled());
            }
            if (model.wasPropertyExplicitlySet("onJobScheduleChange")) {
                this.onJobScheduleChange(model.getOnJobScheduleChange());
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

    @com.fasterxml.jackson.annotation.JsonProperty("upcomingSchedule")
    private final UpcomingSchedule upcomingSchedule;

    public UpcomingSchedule getUpcomingSchedule() {
        return upcomingSchedule;
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

    /** Enables or disables notification when a task is paused. */
    @com.fasterxml.jackson.annotation.JsonProperty("onTaskPause")
    private final Boolean onTaskPause;

    /**
     * Enables or disables notification when a task is paused.
     *
     * @return the value
     */
    public Boolean getOnTaskPause() {
        return onTaskPause;
    }

    /** Enables or disables notification on task failure. */
    @com.fasterxml.jackson.annotation.JsonProperty("onTaskFailure")
    private final Boolean onTaskFailure;

    /**
     * Enables or disables notification on task failure.
     *
     * @return the value
     */
    public Boolean getOnTaskFailure() {
        return onTaskFailure;
    }

    /** Enables or disables notification on task success. */
    @com.fasterxml.jackson.annotation.JsonProperty("onTaskSuccess")
    private final Boolean onTaskSuccess;

    /**
     * Enables or disables notification on task success.
     *
     * @return the value
     */
    public Boolean getOnTaskSuccess() {
        return onTaskSuccess;
    }

    /** Enables or disables notification when fleet resource becomes non compliant. */
    @com.fasterxml.jackson.annotation.JsonProperty("onResourceNonCompliance")
    private final Boolean onResourceNonCompliance;

    /**
     * Enables or disables notification when fleet resource becomes non compliant.
     *
     * @return the value
     */
    public Boolean getOnResourceNonCompliance() {
        return onResourceNonCompliance;
    }

    /**
     * Enables or disables notification when a newer version of runbook associated with a fleet is
     * available
     */
    @com.fasterxml.jackson.annotation.JsonProperty("onRunbookNewerVersion")
    private final Boolean onRunbookNewerVersion;

    /**
     * Enables or disables notification when a newer version of runbook associated with a fleet is
     * available
     *
     * @return the value
     */
    public Boolean getOnRunbookNewerVersion() {
        return onRunbookNewerVersion;
    }

    /** Enables or disables notification on job success. */
    @com.fasterxml.jackson.annotation.JsonProperty("onJobSuccess")
    private final Boolean onJobSuccess;

    /**
     * Enables or disables notification on job success.
     *
     * @return the value
     */
    public Boolean getOnJobSuccess() {
        return onJobSuccess;
    }

    /** Enables or disables notification on job start. */
    @com.fasterxml.jackson.annotation.JsonProperty("onJobStart")
    private final Boolean onJobStart;

    /**
     * Enables or disables notification on job start.
     *
     * @return the value
     */
    public Boolean getOnJobStart() {
        return onJobStart;
    }

    /** Enables or disables notification on job canceled. */
    @com.fasterxml.jackson.annotation.JsonProperty("onJobCanceled")
    private final Boolean onJobCanceled;

    /**
     * Enables or disables notification on job canceled.
     *
     * @return the value
     */
    public Boolean getOnJobCanceled() {
        return onJobCanceled;
    }

    /** Enables or disables notification on job schedule change. */
    @com.fasterxml.jackson.annotation.JsonProperty("onJobScheduleChange")
    private final Boolean onJobScheduleChange;

    /**
     * Enables or disables notification on job schedule change.
     *
     * @return the value
     */
    public Boolean getOnJobScheduleChange() {
        return onJobScheduleChange;
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
        sb.append("upcomingSchedule=").append(String.valueOf(this.upcomingSchedule));
        sb.append(", onJobFailure=").append(String.valueOf(this.onJobFailure));
        sb.append(", onTopologyModification=").append(String.valueOf(this.onTopologyModification));
        sb.append(", onTaskPause=").append(String.valueOf(this.onTaskPause));
        sb.append(", onTaskFailure=").append(String.valueOf(this.onTaskFailure));
        sb.append(", onTaskSuccess=").append(String.valueOf(this.onTaskSuccess));
        sb.append(", onResourceNonCompliance=")
                .append(String.valueOf(this.onResourceNonCompliance));
        sb.append(", onRunbookNewerVersion=").append(String.valueOf(this.onRunbookNewerVersion));
        sb.append(", onJobSuccess=").append(String.valueOf(this.onJobSuccess));
        sb.append(", onJobStart=").append(String.valueOf(this.onJobStart));
        sb.append(", onJobCanceled=").append(String.valueOf(this.onJobCanceled));
        sb.append(", onJobScheduleChange=").append(String.valueOf(this.onJobScheduleChange));
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
        return java.util.Objects.equals(this.upcomingSchedule, other.upcomingSchedule)
                && java.util.Objects.equals(this.onJobFailure, other.onJobFailure)
                && java.util.Objects.equals(
                        this.onTopologyModification, other.onTopologyModification)
                && java.util.Objects.equals(this.onTaskPause, other.onTaskPause)
                && java.util.Objects.equals(this.onTaskFailure, other.onTaskFailure)
                && java.util.Objects.equals(this.onTaskSuccess, other.onTaskSuccess)
                && java.util.Objects.equals(
                        this.onResourceNonCompliance, other.onResourceNonCompliance)
                && java.util.Objects.equals(this.onRunbookNewerVersion, other.onRunbookNewerVersion)
                && java.util.Objects.equals(this.onJobSuccess, other.onJobSuccess)
                && java.util.Objects.equals(this.onJobStart, other.onJobStart)
                && java.util.Objects.equals(this.onJobCanceled, other.onJobCanceled)
                && java.util.Objects.equals(this.onJobScheduleChange, other.onJobScheduleChange)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.upcomingSchedule == null ? 43 : this.upcomingSchedule.hashCode());
        result = (result * PRIME) + (this.onJobFailure == null ? 43 : this.onJobFailure.hashCode());
        result =
                (result * PRIME)
                        + (this.onTopologyModification == null
                                ? 43
                                : this.onTopologyModification.hashCode());
        result = (result * PRIME) + (this.onTaskPause == null ? 43 : this.onTaskPause.hashCode());
        result =
                (result * PRIME)
                        + (this.onTaskFailure == null ? 43 : this.onTaskFailure.hashCode());
        result =
                (result * PRIME)
                        + (this.onTaskSuccess == null ? 43 : this.onTaskSuccess.hashCode());
        result =
                (result * PRIME)
                        + (this.onResourceNonCompliance == null
                                ? 43
                                : this.onResourceNonCompliance.hashCode());
        result =
                (result * PRIME)
                        + (this.onRunbookNewerVersion == null
                                ? 43
                                : this.onRunbookNewerVersion.hashCode());
        result = (result * PRIME) + (this.onJobSuccess == null ? 43 : this.onJobSuccess.hashCode());
        result = (result * PRIME) + (this.onJobStart == null ? 43 : this.onJobStart.hashCode());
        result =
                (result * PRIME)
                        + (this.onJobCanceled == null ? 43 : this.onJobCanceled.hashCode());
        result =
                (result * PRIME)
                        + (this.onJobScheduleChange == null
                                ? 43
                                : this.onJobScheduleChange.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
