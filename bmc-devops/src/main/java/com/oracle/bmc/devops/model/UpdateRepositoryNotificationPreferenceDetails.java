/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * Information to update notification preference settings on repository resource <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateRepositoryNotificationPreferenceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateRepositoryNotificationPreferenceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"notificationPreference"})
    public UpdateRepositoryNotificationPreferenceDetails(
            RepositoryNotificationPreference.NotificationPreference notificationPreference) {
        super();
        this.notificationPreference = notificationPreference;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The override value of repository notification preference. */
        @com.fasterxml.jackson.annotation.JsonProperty("notificationPreference")
        private RepositoryNotificationPreference.NotificationPreference notificationPreference;

        /**
         * The override value of repository notification preference.
         *
         * @param notificationPreference the value to set
         * @return this builder
         */
        public Builder notificationPreference(
                RepositoryNotificationPreference.NotificationPreference notificationPreference) {
            this.notificationPreference = notificationPreference;
            this.__explicitlySet__.add("notificationPreference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateRepositoryNotificationPreferenceDetails build() {
            UpdateRepositoryNotificationPreferenceDetails model =
                    new UpdateRepositoryNotificationPreferenceDetails(this.notificationPreference);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateRepositoryNotificationPreferenceDetails model) {
            if (model.wasPropertyExplicitlySet("notificationPreference")) {
                this.notificationPreference(model.getNotificationPreference());
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

    /** The override value of repository notification preference. */
    @com.fasterxml.jackson.annotation.JsonProperty("notificationPreference")
    private final RepositoryNotificationPreference.NotificationPreference notificationPreference;

    /**
     * The override value of repository notification preference.
     *
     * @return the value
     */
    public RepositoryNotificationPreference.NotificationPreference getNotificationPreference() {
        return notificationPreference;
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
        sb.append("UpdateRepositoryNotificationPreferenceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("notificationPreference=").append(String.valueOf(this.notificationPreference));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateRepositoryNotificationPreferenceDetails)) {
            return false;
        }

        UpdateRepositoryNotificationPreferenceDetails other =
                (UpdateRepositoryNotificationPreferenceDetails) o;
        return java.util.Objects.equals(this.notificationPreference, other.notificationPreference)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.notificationPreference == null
                                ? 43
                                : this.notificationPreference.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
