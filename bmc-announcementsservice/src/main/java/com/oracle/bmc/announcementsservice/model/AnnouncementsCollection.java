/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice.model;

/**
 * A list of announcements that match filter criteria, if any. Results contain both the announcements and the user-specific status of the announcements.
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
    builder = AnnouncementsCollection.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AnnouncementsCollection
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"items", "userStatuses"})
    public AnnouncementsCollection(
            java.util.List<AnnouncementSummary> items,
            java.util.List<AnnouncementUserStatusDetails> userStatuses) {
        super();
        this.items = items;
        this.userStatuses = userStatuses;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A collection of announcements.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<AnnouncementSummary> items;

        /**
         * A collection of announcements.
         * @param items the value to set
         * @return this builder
         **/
        public Builder items(java.util.List<AnnouncementSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }
        /**
         * The user-specific status for found announcements.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userStatuses")
        private java.util.List<AnnouncementUserStatusDetails> userStatuses;

        /**
         * The user-specific status for found announcements.
         * @param userStatuses the value to set
         * @return this builder
         **/
        public Builder userStatuses(java.util.List<AnnouncementUserStatusDetails> userStatuses) {
            this.userStatuses = userStatuses;
            this.__explicitlySet__.add("userStatuses");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AnnouncementsCollection build() {
            AnnouncementsCollection model =
                    new AnnouncementsCollection(this.items, this.userStatuses);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnnouncementsCollection model) {
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
            }
            if (model.wasPropertyExplicitlySet("userStatuses")) {
                this.userStatuses(model.getUserStatuses());
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
     * A collection of announcements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<AnnouncementSummary> items;

    /**
     * A collection of announcements.
     * @return the value
     **/
    public java.util.List<AnnouncementSummary> getItems() {
        return items;
    }

    /**
     * The user-specific status for found announcements.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userStatuses")
    private final java.util.List<AnnouncementUserStatusDetails> userStatuses;

    /**
     * The user-specific status for found announcements.
     * @return the value
     **/
    public java.util.List<AnnouncementUserStatusDetails> getUserStatuses() {
        return userStatuses;
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
        sb.append("AnnouncementsCollection(");
        sb.append("super=").append(super.toString());
        sb.append("items=").append(String.valueOf(this.items));
        sb.append(", userStatuses=").append(String.valueOf(this.userStatuses));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AnnouncementsCollection)) {
            return false;
        }

        AnnouncementsCollection other = (AnnouncementsCollection) o;
        return java.util.Objects.equals(this.items, other.items)
                && java.util.Objects.equals(this.userStatuses, other.userStatuses)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + (this.userStatuses == null ? 43 : this.userStatuses.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
