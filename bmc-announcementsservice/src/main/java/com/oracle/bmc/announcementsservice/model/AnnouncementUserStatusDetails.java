/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.announcementsservice.model;

/**
 * An announcement status
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AnnouncementUserStatusDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AnnouncementUserStatusDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * The OCID of the announcement this status belongs to
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userStatusAnnouncementId")
    String userStatusAnnouncementId;

    /**
     * The OCID of the user this status belongs to
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    String userId;

    /**
     * The date and time the announcement was acknowledged, in the format defined by RFC3339
     * Example: `2016-07-22T17:43:01.389+0000`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAcknowledged")
    java.util.Date timeAcknowledged;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
