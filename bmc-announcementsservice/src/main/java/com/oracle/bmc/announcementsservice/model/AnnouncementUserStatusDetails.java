/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.announcementsservice.model;

/**
 * An announcement's status regarding whether it has been acknowledged by a user. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 0.0.1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AnnouncementUserStatusDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AnnouncementUserStatusDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
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
        /** The OCID of the announcement that this status is associated with. */
        @com.fasterxml.jackson.annotation.JsonProperty("userStatusAnnouncementId")
        private String userStatusAnnouncementId;

        /**
         * The OCID of the announcement that this status is associated with.
         *
         * @param userStatusAnnouncementId the value to set
         * @return this builder
         */
        public Builder userStatusAnnouncementId(String userStatusAnnouncementId) {
            this.userStatusAnnouncementId = userStatusAnnouncementId;
            this.__explicitlySet__.add("userStatusAnnouncementId");
            return this;
        }
        /** The OCID of the user that this status is associated with. */
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * The OCID of the user that this status is associated with.
         *
         * @param userId the value to set
         * @return this builder
         */
        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }
        /**
         * The date and time the announcement was acknowledged, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-01-01T17:43:01.389+0000}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeAcknowledged")
        private java.util.Date timeAcknowledged;

        /**
         * The date and time the announcement was acknowledged, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-01-01T17:43:01.389+0000}
         *
         * @param timeAcknowledged the value to set
         * @return this builder
         */
        public Builder timeAcknowledged(java.util.Date timeAcknowledged) {
            this.timeAcknowledged = timeAcknowledged;
            this.__explicitlySet__.add("timeAcknowledged");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AnnouncementUserStatusDetails build() {
            AnnouncementUserStatusDetails model =
                    new AnnouncementUserStatusDetails(
                            this.userStatusAnnouncementId, this.userId, this.timeAcknowledged);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AnnouncementUserStatusDetails model) {
            if (model.wasPropertyExplicitlySet("userStatusAnnouncementId")) {
                this.userStatusAnnouncementId(model.getUserStatusAnnouncementId());
            }
            if (model.wasPropertyExplicitlySet("userId")) {
                this.userId(model.getUserId());
            }
            if (model.wasPropertyExplicitlySet("timeAcknowledged")) {
                this.timeAcknowledged(model.getTimeAcknowledged());
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

    /** The OCID of the announcement that this status is associated with. */
    @com.fasterxml.jackson.annotation.JsonProperty("userStatusAnnouncementId")
    private final String userStatusAnnouncementId;

    /**
     * The OCID of the announcement that this status is associated with.
     *
     * @return the value
     */
    public String getUserStatusAnnouncementId() {
        return userStatusAnnouncementId;
    }

    /** The OCID of the user that this status is associated with. */
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * The OCID of the user that this status is associated with.
     *
     * @return the value
     */
    public String getUserId() {
        return userId;
    }

    /**
     * The date and time the announcement was acknowledged, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-01-01T17:43:01.389+0000}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeAcknowledged")
    private final java.util.Date timeAcknowledged;

    /**
     * The date and time the announcement was acknowledged, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-01-01T17:43:01.389+0000}
     *
     * @return the value
     */
    public java.util.Date getTimeAcknowledged() {
        return timeAcknowledged;
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
        sb.append("AnnouncementUserStatusDetails(");
        sb.append("super=").append(super.toString());
        sb.append("userStatusAnnouncementId=")
                .append(String.valueOf(this.userStatusAnnouncementId));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", timeAcknowledged=").append(String.valueOf(this.timeAcknowledged));
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
