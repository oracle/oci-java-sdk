/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * Details for the maintenance activity. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MaintenanceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MaintenanceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"state", "startTime", "endTime", "notificationEmailIds"})
    public MaintenanceDetails(
            MaintenanceState state,
            java.util.Date startTime,
            java.util.Date endTime,
            java.util.List<String> notificationEmailIds) {
        super();
        this.state = state;
        this.startTime = startTime;
        this.endTime = endTime;
        this.notificationEmailIds = notificationEmailIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** State of the maintenance activity */
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private MaintenanceState state;

        /**
         * State of the maintenance activity
         *
         * @param state the value to set
         * @return this builder
         */
        public Builder state(MaintenanceState state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }
        /** Start time of the maintenance activity */
        @com.fasterxml.jackson.annotation.JsonProperty("startTime")
        private java.util.Date startTime;

        /**
         * Start time of the maintenance activity
         *
         * @param startTime the value to set
         * @return this builder
         */
        public Builder startTime(java.util.Date startTime) {
            this.startTime = startTime;
            this.__explicitlySet__.add("startTime");
            return this;
        }
        /** End time of the maintenance activity */
        @com.fasterxml.jackson.annotation.JsonProperty("endTime")
        private java.util.Date endTime;

        /**
         * End time of the maintenance activity
         *
         * @param endTime the value to set
         * @return this builder
         */
        public Builder endTime(java.util.Date endTime) {
            this.endTime = endTime;
            this.__explicitlySet__.add("endTime");
            return this;
        }
        /** The Email Ids given the by customer to get notified about maintenance activities */
        @com.fasterxml.jackson.annotation.JsonProperty("notificationEmailIds")
        private java.util.List<String> notificationEmailIds;

        /**
         * The Email Ids given the by customer to get notified about maintenance activities
         *
         * @param notificationEmailIds the value to set
         * @return this builder
         */
        public Builder notificationEmailIds(java.util.List<String> notificationEmailIds) {
            this.notificationEmailIds = notificationEmailIds;
            this.__explicitlySet__.add("notificationEmailIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaintenanceDetails build() {
            MaintenanceDetails model =
                    new MaintenanceDetails(
                            this.state, this.startTime, this.endTime, this.notificationEmailIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaintenanceDetails model) {
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("startTime")) {
                this.startTime(model.getStartTime());
            }
            if (model.wasPropertyExplicitlySet("endTime")) {
                this.endTime(model.getEndTime());
            }
            if (model.wasPropertyExplicitlySet("notificationEmailIds")) {
                this.notificationEmailIds(model.getNotificationEmailIds());
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

    /** State of the maintenance activity */
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final MaintenanceState state;

    /**
     * State of the maintenance activity
     *
     * @return the value
     */
    public MaintenanceState getState() {
        return state;
    }

    /** Start time of the maintenance activity */
    @com.fasterxml.jackson.annotation.JsonProperty("startTime")
    private final java.util.Date startTime;

    /**
     * Start time of the maintenance activity
     *
     * @return the value
     */
    public java.util.Date getStartTime() {
        return startTime;
    }

    /** End time of the maintenance activity */
    @com.fasterxml.jackson.annotation.JsonProperty("endTime")
    private final java.util.Date endTime;

    /**
     * End time of the maintenance activity
     *
     * @return the value
     */
    public java.util.Date getEndTime() {
        return endTime;
    }

    /** The Email Ids given the by customer to get notified about maintenance activities */
    @com.fasterxml.jackson.annotation.JsonProperty("notificationEmailIds")
    private final java.util.List<String> notificationEmailIds;

    /**
     * The Email Ids given the by customer to get notified about maintenance activities
     *
     * @return the value
     */
    public java.util.List<String> getNotificationEmailIds() {
        return notificationEmailIds;
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
        sb.append("MaintenanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("state=").append(String.valueOf(this.state));
        sb.append(", startTime=").append(String.valueOf(this.startTime));
        sb.append(", endTime=").append(String.valueOf(this.endTime));
        sb.append(", notificationEmailIds=").append(String.valueOf(this.notificationEmailIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MaintenanceDetails)) {
            return false;
        }

        MaintenanceDetails other = (MaintenanceDetails) o;
        return java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.startTime, other.startTime)
                && java.util.Objects.equals(this.endTime, other.endTime)
                && java.util.Objects.equals(this.notificationEmailIds, other.notificationEmailIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.startTime == null ? 43 : this.startTime.hashCode());
        result = (result * PRIME) + (this.endTime == null ? 43 : this.endTime.hashCode());
        result =
                (result * PRIME)
                        + (this.notificationEmailIds == null
                                ? 43
                                : this.notificationEmailIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
