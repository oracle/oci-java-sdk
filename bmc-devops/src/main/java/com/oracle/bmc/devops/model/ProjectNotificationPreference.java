/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The notification preference of the project. <br>
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
        builder = ProjectNotificationPreference.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProjectNotificationPreference
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"projectId", "userId", "notificationPreference"})
    public ProjectNotificationPreference(
            String projectId, String userId, NotificationPreference notificationPreference) {
        super();
        this.projectId = projectId;
        this.userId = userId;
        this.notificationPreference = notificationPreference;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The ocid of project resource */
        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        /**
         * The ocid of project resource
         *
         * @param projectId the value to set
         * @return this builder
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }
        /** The ocid of user. */
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * The ocid of user.
         *
         * @param userId the value to set
         * @return this builder
         */
        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }
        /** The override value of project notification preference. */
        @com.fasterxml.jackson.annotation.JsonProperty("notificationPreference")
        private NotificationPreference notificationPreference;

        /**
         * The override value of project notification preference.
         *
         * @param notificationPreference the value to set
         * @return this builder
         */
        public Builder notificationPreference(NotificationPreference notificationPreference) {
            this.notificationPreference = notificationPreference;
            this.__explicitlySet__.add("notificationPreference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProjectNotificationPreference build() {
            ProjectNotificationPreference model =
                    new ProjectNotificationPreference(
                            this.projectId, this.userId, this.notificationPreference);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProjectNotificationPreference model) {
            if (model.wasPropertyExplicitlySet("projectId")) {
                this.projectId(model.getProjectId());
            }
            if (model.wasPropertyExplicitlySet("userId")) {
                this.userId(model.getUserId());
            }
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

    /** The ocid of project resource */
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

    /**
     * The ocid of project resource
     *
     * @return the value
     */
    public String getProjectId() {
        return projectId;
    }

    /** The ocid of user. */
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * The ocid of user.
     *
     * @return the value
     */
    public String getUserId() {
        return userId;
    }

    /** The override value of project notification preference. */
    public enum NotificationPreference implements com.oracle.bmc.http.internal.BmcEnum {
        Watch("WATCH"),
        Ignore("IGNORE"),
        Mention("MENTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(NotificationPreference.class);

        private final String value;
        private static java.util.Map<String, NotificationPreference> map;

        static {
            map = new java.util.HashMap<>();
            for (NotificationPreference v : NotificationPreference.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        NotificationPreference(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NotificationPreference create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'NotificationPreference', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The override value of project notification preference. */
    @com.fasterxml.jackson.annotation.JsonProperty("notificationPreference")
    private final NotificationPreference notificationPreference;

    /**
     * The override value of project notification preference.
     *
     * @return the value
     */
    public NotificationPreference getNotificationPreference() {
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
        sb.append("ProjectNotificationPreference(");
        sb.append("super=").append(super.toString());
        sb.append("projectId=").append(String.valueOf(this.projectId));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", notificationPreference=").append(String.valueOf(this.notificationPreference));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProjectNotificationPreference)) {
            return false;
        }

        ProjectNotificationPreference other = (ProjectNotificationPreference) o;
        return java.util.Objects.equals(this.projectId, other.projectId)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(
                        this.notificationPreference, other.notificationPreference)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result =
                (result * PRIME)
                        + (this.notificationPreference == null
                                ? 43
                                : this.notificationPreference.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
