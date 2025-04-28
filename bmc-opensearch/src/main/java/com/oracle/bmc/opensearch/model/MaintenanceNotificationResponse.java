/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * Response for request to send customer maintenance notification. <br>
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
        builder = MaintenanceNotificationResponse.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MaintenanceNotificationResponse
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"message", "failedNotifications"})
    public MaintenanceNotificationResponse(
            String message, java.util.List<MaintenanceNotificationFailure> failedNotifications) {
        super();
        this.message = message;
        this.failedNotifications = failedNotifications;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Response message for the maintenance notification request */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * Response message for the maintenance notification request
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /** List of failed maintenance notifications */
        @com.fasterxml.jackson.annotation.JsonProperty("failedNotifications")
        private java.util.List<MaintenanceNotificationFailure> failedNotifications;

        /**
         * List of failed maintenance notifications
         *
         * @param failedNotifications the value to set
         * @return this builder
         */
        public Builder failedNotifications(
                java.util.List<MaintenanceNotificationFailure> failedNotifications) {
            this.failedNotifications = failedNotifications;
            this.__explicitlySet__.add("failedNotifications");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaintenanceNotificationResponse build() {
            MaintenanceNotificationResponse model =
                    new MaintenanceNotificationResponse(this.message, this.failedNotifications);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaintenanceNotificationResponse model) {
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("failedNotifications")) {
                this.failedNotifications(model.getFailedNotifications());
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

    /** Response message for the maintenance notification request */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * Response message for the maintenance notification request
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /** List of failed maintenance notifications */
    @com.fasterxml.jackson.annotation.JsonProperty("failedNotifications")
    private final java.util.List<MaintenanceNotificationFailure> failedNotifications;

    /**
     * List of failed maintenance notifications
     *
     * @return the value
     */
    public java.util.List<MaintenanceNotificationFailure> getFailedNotifications() {
        return failedNotifications;
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
        sb.append("MaintenanceNotificationResponse(");
        sb.append("super=").append(super.toString());
        sb.append("message=").append(String.valueOf(this.message));
        sb.append(", failedNotifications=").append(String.valueOf(this.failedNotifications));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MaintenanceNotificationResponse)) {
            return false;
        }

        MaintenanceNotificationResponse other = (MaintenanceNotificationResponse) o;
        return java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.failedNotifications, other.failedNotifications)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result =
                (result * PRIME)
                        + (this.failedNotifications == null
                                ? 43
                                : this.failedNotifications.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
