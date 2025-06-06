/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Enables notification on upcoming schedule. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = UpcomingSchedule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpcomingSchedule
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"onUpcomingSchedule", "notifyBefore"})
    public UpcomingSchedule(Boolean onUpcomingSchedule, String notifyBefore) {
        super();
        this.onUpcomingSchedule = onUpcomingSchedule;
        this.notifyBefore = notifyBefore;
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
        /** Specify when the notification should be sent. */
        @com.fasterxml.jackson.annotation.JsonProperty("notifyBefore")
        private String notifyBefore;

        /**
         * Specify when the notification should be sent.
         *
         * @param notifyBefore the value to set
         * @return this builder
         */
        public Builder notifyBefore(String notifyBefore) {
            this.notifyBefore = notifyBefore;
            this.__explicitlySet__.add("notifyBefore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpcomingSchedule build() {
            UpcomingSchedule model =
                    new UpcomingSchedule(this.onUpcomingSchedule, this.notifyBefore);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpcomingSchedule model) {
            if (model.wasPropertyExplicitlySet("onUpcomingSchedule")) {
                this.onUpcomingSchedule(model.getOnUpcomingSchedule());
            }
            if (model.wasPropertyExplicitlySet("notifyBefore")) {
                this.notifyBefore(model.getNotifyBefore());
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

    /** Specify when the notification should be sent. */
    @com.fasterxml.jackson.annotation.JsonProperty("notifyBefore")
    private final String notifyBefore;

    /**
     * Specify when the notification should be sent.
     *
     * @return the value
     */
    public String getNotifyBefore() {
        return notifyBefore;
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
        sb.append("UpcomingSchedule(");
        sb.append("super=").append(super.toString());
        sb.append("onUpcomingSchedule=").append(String.valueOf(this.onUpcomingSchedule));
        sb.append(", notifyBefore=").append(String.valueOf(this.notifyBefore));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpcomingSchedule)) {
            return false;
        }

        UpcomingSchedule other = (UpcomingSchedule) o;
        return java.util.Objects.equals(this.onUpcomingSchedule, other.onUpcomingSchedule)
                && java.util.Objects.equals(this.notifyBefore, other.notifyBefore)
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
        result = (result * PRIME) + (this.notifyBefore == null ? 43 : this.notifyBefore.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
