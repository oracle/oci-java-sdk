/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lockbox.model;

/**
 * The log of the action taken by different persona on the access request, e.g. approve/deny/revoke
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220126")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ActivityLog.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ActivityLog extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"userId", "userLevel", "action", "message", "timeUpdated"})
    public ActivityLog(
            String userId,
            PersonaLevel userLevel,
            AccessRequestActionType action,
            String message,
            java.util.Date timeUpdated) {
        super();
        this.userId = userId;
        this.userLevel = userLevel;
        this.action = action;
        this.message = message;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** User OCID of the persona */
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * User OCID of the persona
         *
         * @param userId the value to set
         * @return this builder
         */
        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }
        /** Level of the persona */
        @com.fasterxml.jackson.annotation.JsonProperty("userLevel")
        private PersonaLevel userLevel;

        /**
         * Level of the persona
         *
         * @param userLevel the value to set
         * @return this builder
         */
        public Builder userLevel(PersonaLevel userLevel) {
            this.userLevel = userLevel;
            this.__explicitlySet__.add("userLevel");
            return this;
        }
        /** The action take by persona */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private AccessRequestActionType action;

        /**
         * The action take by persona
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(AccessRequestActionType action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /** The action justification or details. */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * The action justification or details.
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /**
         * The time the action was taken. Format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time the action was taken. Format is defined by
         * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ActivityLog build() {
            ActivityLog model =
                    new ActivityLog(
                            this.userId,
                            this.userLevel,
                            this.action,
                            this.message,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ActivityLog model) {
            if (model.wasPropertyExplicitlySet("userId")) {
                this.userId(model.getUserId());
            }
            if (model.wasPropertyExplicitlySet("userLevel")) {
                this.userLevel(model.getUserLevel());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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

    /** User OCID of the persona */
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * User OCID of the persona
     *
     * @return the value
     */
    public String getUserId() {
        return userId;
    }

    /** Level of the persona */
    @com.fasterxml.jackson.annotation.JsonProperty("userLevel")
    private final PersonaLevel userLevel;

    /**
     * Level of the persona
     *
     * @return the value
     */
    public PersonaLevel getUserLevel() {
        return userLevel;
    }

    /** The action take by persona */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final AccessRequestActionType action;

    /**
     * The action take by persona
     *
     * @return the value
     */
    public AccessRequestActionType getAction() {
        return action;
    }

    /** The action justification or details. */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * The action justification or details.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /**
     * The time the action was taken. Format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time the action was taken. Format is defined by
     * [RFC3339](https://tools.ietf.org/html/rfc3339). Example: {@code 2020-01-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("ActivityLog(");
        sb.append("super=").append(super.toString());
        sb.append("userId=").append(String.valueOf(this.userId));
        sb.append(", userLevel=").append(String.valueOf(this.userLevel));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ActivityLog)) {
            return false;
        }

        ActivityLog other = (ActivityLog) o;
        return java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.userLevel, other.userLevel)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result = (result * PRIME) + (this.userLevel == null ? 43 : this.userLevel.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
