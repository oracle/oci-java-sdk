/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Preferences to send notifications on the task activities.
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
    builder = TaskNotificationPreferences.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TaskNotificationPreferences
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "shouldNotifyOnPause",
        "shouldNotifyOnTaskFailure",
        "shouldNotifyOnTaskSuccess"
    })
    public TaskNotificationPreferences(
            Boolean shouldNotifyOnPause,
            Boolean shouldNotifyOnTaskFailure,
            Boolean shouldNotifyOnTaskSuccess) {
        super();
        this.shouldNotifyOnPause = shouldNotifyOnPause;
        this.shouldNotifyOnTaskFailure = shouldNotifyOnTaskFailure;
        this.shouldNotifyOnTaskSuccess = shouldNotifyOnTaskSuccess;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Enables notification on pause.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shouldNotifyOnPause")
        private Boolean shouldNotifyOnPause;

        /**
         * Enables notification on pause.
         * @param shouldNotifyOnPause the value to set
         * @return this builder
         **/
        public Builder shouldNotifyOnPause(Boolean shouldNotifyOnPause) {
            this.shouldNotifyOnPause = shouldNotifyOnPause;
            this.__explicitlySet__.add("shouldNotifyOnPause");
            return this;
        }
        /**
         * Enables or disables notification on Task Failures.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shouldNotifyOnTaskFailure")
        private Boolean shouldNotifyOnTaskFailure;

        /**
         * Enables or disables notification on Task Failures.
         * @param shouldNotifyOnTaskFailure the value to set
         * @return this builder
         **/
        public Builder shouldNotifyOnTaskFailure(Boolean shouldNotifyOnTaskFailure) {
            this.shouldNotifyOnTaskFailure = shouldNotifyOnTaskFailure;
            this.__explicitlySet__.add("shouldNotifyOnTaskFailure");
            return this;
        }
        /**
         * Enables or disables notification on Task Success.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("shouldNotifyOnTaskSuccess")
        private Boolean shouldNotifyOnTaskSuccess;

        /**
         * Enables or disables notification on Task Success.
         * @param shouldNotifyOnTaskSuccess the value to set
         * @return this builder
         **/
        public Builder shouldNotifyOnTaskSuccess(Boolean shouldNotifyOnTaskSuccess) {
            this.shouldNotifyOnTaskSuccess = shouldNotifyOnTaskSuccess;
            this.__explicitlySet__.add("shouldNotifyOnTaskSuccess");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TaskNotificationPreferences build() {
            TaskNotificationPreferences model =
                    new TaskNotificationPreferences(
                            this.shouldNotifyOnPause,
                            this.shouldNotifyOnTaskFailure,
                            this.shouldNotifyOnTaskSuccess);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TaskNotificationPreferences model) {
            if (model.wasPropertyExplicitlySet("shouldNotifyOnPause")) {
                this.shouldNotifyOnPause(model.getShouldNotifyOnPause());
            }
            if (model.wasPropertyExplicitlySet("shouldNotifyOnTaskFailure")) {
                this.shouldNotifyOnTaskFailure(model.getShouldNotifyOnTaskFailure());
            }
            if (model.wasPropertyExplicitlySet("shouldNotifyOnTaskSuccess")) {
                this.shouldNotifyOnTaskSuccess(model.getShouldNotifyOnTaskSuccess());
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
     * Enables notification on pause.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldNotifyOnPause")
    private final Boolean shouldNotifyOnPause;

    /**
     * Enables notification on pause.
     * @return the value
     **/
    public Boolean getShouldNotifyOnPause() {
        return shouldNotifyOnPause;
    }

    /**
     * Enables or disables notification on Task Failures.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldNotifyOnTaskFailure")
    private final Boolean shouldNotifyOnTaskFailure;

    /**
     * Enables or disables notification on Task Failures.
     * @return the value
     **/
    public Boolean getShouldNotifyOnTaskFailure() {
        return shouldNotifyOnTaskFailure;
    }

    /**
     * Enables or disables notification on Task Success.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shouldNotifyOnTaskSuccess")
    private final Boolean shouldNotifyOnTaskSuccess;

    /**
     * Enables or disables notification on Task Success.
     * @return the value
     **/
    public Boolean getShouldNotifyOnTaskSuccess() {
        return shouldNotifyOnTaskSuccess;
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
        sb.append("TaskNotificationPreferences(");
        sb.append("super=").append(super.toString());
        sb.append("shouldNotifyOnPause=").append(String.valueOf(this.shouldNotifyOnPause));
        sb.append(", shouldNotifyOnTaskFailure=")
                .append(String.valueOf(this.shouldNotifyOnTaskFailure));
        sb.append(", shouldNotifyOnTaskSuccess=")
                .append(String.valueOf(this.shouldNotifyOnTaskSuccess));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TaskNotificationPreferences)) {
            return false;
        }

        TaskNotificationPreferences other = (TaskNotificationPreferences) o;
        return java.util.Objects.equals(this.shouldNotifyOnPause, other.shouldNotifyOnPause)
                && java.util.Objects.equals(
                        this.shouldNotifyOnTaskFailure, other.shouldNotifyOnTaskFailure)
                && java.util.Objects.equals(
                        this.shouldNotifyOnTaskSuccess, other.shouldNotifyOnTaskSuccess)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.shouldNotifyOnPause == null
                                ? 43
                                : this.shouldNotifyOnPause.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldNotifyOnTaskFailure == null
                                ? 43
                                : this.shouldNotifyOnTaskFailure.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldNotifyOnTaskSuccess == null
                                ? 43
                                : this.shouldNotifyOnTaskSuccess.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
