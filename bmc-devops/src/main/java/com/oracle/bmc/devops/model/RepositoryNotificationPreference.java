/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The notification preference of the repository.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RepositoryNotificationPreference.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RepositoryNotificationPreference
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"repositoryId", "userId", "notificationPreference"})
    public RepositoryNotificationPreference(
            String repositoryId, String userId, NotificationPreference notificationPreference) {
        super();
        this.repositoryId = repositoryId;
        this.userId = userId;
        this.notificationPreference = notificationPreference;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The ocid of repository resource
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("repositoryId")
        private String repositoryId;

        /**
         * The ocid of repository resource
         * @param repositoryId the value to set
         * @return this builder
         **/
        public Builder repositoryId(String repositoryId) {
            this.repositoryId = repositoryId;
            this.__explicitlySet__.add("repositoryId");
            return this;
        }
        /**
         * The ocid of user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * The ocid of user.
         * @param userId the value to set
         * @return this builder
         **/
        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }
        /**
         * The override value of repository notification preference.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("notificationPreference")
        private NotificationPreference notificationPreference;

        /**
         * The override value of repository notification preference.
         * @param notificationPreference the value to set
         * @return this builder
         **/
        public Builder notificationPreference(NotificationPreference notificationPreference) {
            this.notificationPreference = notificationPreference;
            this.__explicitlySet__.add("notificationPreference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RepositoryNotificationPreference build() {
            RepositoryNotificationPreference model =
                    new RepositoryNotificationPreference(
                            this.repositoryId, this.userId, this.notificationPreference);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RepositoryNotificationPreference model) {
            if (model.wasPropertyExplicitlySet("repositoryId")) {
                this.repositoryId(model.getRepositoryId());
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
     * The ocid of repository resource
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("repositoryId")
    private final String repositoryId;

    /**
     * The ocid of repository resource
     * @return the value
     **/
    public String getRepositoryId() {
        return repositoryId;
    }

    /**
     * The ocid of user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * The ocid of user.
     * @return the value
     **/
    public String getUserId() {
        return userId;
    }

    /**
     * The override value of repository notification preference.
     **/
    public enum NotificationPreference {
        Watch("WATCH"),
        Ignore("IGNORE"),
        Mention("MENTION"),
        Inherited("INHERITED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
    /**
     * The override value of repository notification preference.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("notificationPreference")
    private final NotificationPreference notificationPreference;

    /**
     * The override value of repository notification preference.
     * @return the value
     **/
    public NotificationPreference getNotificationPreference() {
        return notificationPreference;
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
        sb.append("RepositoryNotificationPreference(");
        sb.append("super=").append(super.toString());
        sb.append("repositoryId=").append(String.valueOf(this.repositoryId));
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
        if (!(o instanceof RepositoryNotificationPreference)) {
            return false;
        }

        RepositoryNotificationPreference other = (RepositoryNotificationPreference) o;
        return java.util.Objects.equals(this.repositoryId, other.repositoryId)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(
                        this.notificationPreference, other.notificationPreference)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.repositoryId == null ? 43 : this.repositoryId.hashCode());
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
