/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice.model;

/**
 * An announcement's status regarding whether it has been acknowledged by a user.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AnnouncementUserStatusDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AnnouncementUserStatusDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"userStatusAnnouncementId", "userId", "timeAcknowledged"})
    public AnnouncementUserStatusDetails(
            String userStatusAnnouncementId, String userId, java.util.Date timeAcknowledged) {
        super();
        this.userStatusAnnouncementId = userStatusAnnouncementId;
        this.userId = userId;
        this.timeAcknowledged = timeAcknowledged;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("userStatusAnnouncementId")
        private String userStatusAnnouncementId;

        public Builder userStatusAnnouncementId(String userStatusAnnouncementId) {
            this.userStatusAnnouncementId = userStatusAnnouncementId;
            this.__explicitlySet__.add("userStatusAnnouncementId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeAcknowledged")
        private java.util.Date timeAcknowledged;

        public Builder timeAcknowledged(java.util.Date timeAcknowledged) {
            this.timeAcknowledged = timeAcknowledged;
            this.__explicitlySet__.add("timeAcknowledged");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AnnouncementUserStatusDetails build() {
            AnnouncementUserStatusDetails __instance__ =
                    new AnnouncementUserStatusDetails(
                            userStatusAnnouncementId, userId, timeAcknowledged);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnnouncementUserStatusDetails o) {
            Builder copiedBuilder =
                    userStatusAnnouncementId(o.getUserStatusAnnouncementId())
                            .userId(o.getUserId())
                            .timeAcknowledged(o.getTimeAcknowledged());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The OCID of the announcement that this status is associated with.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userStatusAnnouncementId")
    private final String userStatusAnnouncementId;

    public String getUserStatusAnnouncementId() {
        return userStatusAnnouncementId;
    }

    /**
     * The OCID of the user that this status is associated with.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    public String getUserId() {
        return userId;
    }

    /**
     * The date and time the announcement was acknowledged, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-01-01T17:43:01.389+0000}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAcknowledged")
    private final java.util.Date timeAcknowledged;

    public java.util.Date getTimeAcknowledged() {
        return timeAcknowledged;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AnnouncementUserStatusDetails(");
        sb.append("userStatusAnnouncementId=")
                .append(String.valueOf(this.userStatusAnnouncementId));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", timeAcknowledged=").append(String.valueOf(this.timeAcknowledged));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnnouncementUserStatusDetails)) {
            return false;
        }

        AnnouncementUserStatusDetails other = (AnnouncementUserStatusDetails) o;
        return java.util.Objects.equals(
                        this.userStatusAnnouncementId, other.userStatusAnnouncementId)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.timeAcknowledged, other.timeAcknowledged)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.userStatusAnnouncementId == null
                                ? 43
                                : this.userStatusAnnouncementId.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeAcknowledged == null ? 43 : this.timeAcknowledged.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
