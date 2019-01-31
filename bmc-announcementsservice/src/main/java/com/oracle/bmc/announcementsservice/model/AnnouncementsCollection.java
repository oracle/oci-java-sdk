/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.announcementsservice.model;

/**
 * Results of annoucements search. Contains both announcements, and user specific status of the announcments
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
    builder = AnnouncementsCollection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AnnouncementsCollection {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<AnnouncementSummary> items;

        public Builder items(java.util.List<AnnouncementSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userStatuses")
        private java.util.List<AnnouncementUserStatusDetails> userStatuses;

        public Builder userStatuses(java.util.List<AnnouncementUserStatusDetails> userStatuses) {
            this.userStatuses = userStatuses;
            this.__explicitlySet__.add("userStatuses");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AnnouncementsCollection build() {
            AnnouncementsCollection __instance__ = new AnnouncementsCollection(items, userStatuses);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnnouncementsCollection o) {
            Builder copiedBuilder = items(o.getItems()).userStatuses(o.getUserStatuses());

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
     * collection of announcements
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    java.util.List<AnnouncementSummary> items;

    /**
     * user specific status of found announcements
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userStatuses")
    java.util.List<AnnouncementUserStatusDetails> userStatuses;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
