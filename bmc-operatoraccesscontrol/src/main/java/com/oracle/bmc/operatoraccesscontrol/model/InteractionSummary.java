/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.operatoraccesscontrol.model;

/**
 * Summary of access request customer and operator conversation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InteractionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InteractionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "userId",
        "userName",
        "message",
        "userType",
        "timeOfConversation"
    })
    public InteractionSummary(
            String id,
            String userId,
            String userName,
            String message,
            String userType,
            java.util.Date timeOfConversation) {
        super();
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.message = message;
        this.userType = userType;
        this.timeOfConversation = timeOfConversation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The uniqueId of the message. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The uniqueId of the message.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** customer or operator id who is part of this conversation. */
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * customer or operator id who is part of this conversation.
         *
         * @param userId the value to set
         * @return this builder
         */
        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }
        /** customer or operator Name who is part of this conversation. */
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * customer or operator Name who is part of this conversation.
         *
         * @param userName the value to set
         * @return this builder
         */
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }
        /** contains the information exchanged between operator and customer. */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * contains the information exchanged between operator and customer.
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /** Whether the userConversation is an operator or customer. */
        @com.fasterxml.jackson.annotation.JsonProperty("userType")
        private String userType;

        /**
         * Whether the userConversation is an operator or customer.
         *
         * @param userType the value to set
         * @return this builder
         */
        public Builder userType(String userType) {
            this.userType = userType;
            this.__explicitlySet__.add("userType");
            return this;
        }
        /**
         * Time when the conversation happened in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
         * '2020-05-22T21:10:29.600Z'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfConversation")
        private java.util.Date timeOfConversation;

        /**
         * Time when the conversation happened in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
         * '2020-05-22T21:10:29.600Z'
         *
         * @param timeOfConversation the value to set
         * @return this builder
         */
        public Builder timeOfConversation(java.util.Date timeOfConversation) {
            this.timeOfConversation = timeOfConversation;
            this.__explicitlySet__.add("timeOfConversation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InteractionSummary build() {
            InteractionSummary model =
                    new InteractionSummary(
                            this.id,
                            this.userId,
                            this.userName,
                            this.message,
                            this.userType,
                            this.timeOfConversation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InteractionSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("userId")) {
                this.userId(model.getUserId());
            }
            if (model.wasPropertyExplicitlySet("userName")) {
                this.userName(model.getUserName());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("userType")) {
                this.userType(model.getUserType());
            }
            if (model.wasPropertyExplicitlySet("timeOfConversation")) {
                this.timeOfConversation(model.getTimeOfConversation());
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

    /** The uniqueId of the message. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The uniqueId of the message.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** customer or operator id who is part of this conversation. */
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * customer or operator id who is part of this conversation.
     *
     * @return the value
     */
    public String getUserId() {
        return userId;
    }

    /** customer or operator Name who is part of this conversation. */
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * customer or operator Name who is part of this conversation.
     *
     * @return the value
     */
    public String getUserName() {
        return userName;
    }

    /** contains the information exchanged between operator and customer. */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * contains the information exchanged between operator and customer.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /** Whether the userConversation is an operator or customer. */
    @com.fasterxml.jackson.annotation.JsonProperty("userType")
    private final String userType;

    /**
     * Whether the userConversation is an operator or customer.
     *
     * @return the value
     */
    public String getUserType() {
        return userType;
    }

    /**
     * Time when the conversation happened in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
     * '2020-05-22T21:10:29.600Z'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfConversation")
    private final java.util.Date timeOfConversation;

    /**
     * Time when the conversation happened in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)timestamp format. Example:
     * '2020-05-22T21:10:29.600Z'
     *
     * @return the value
     */
    public java.util.Date getTimeOfConversation() {
        return timeOfConversation;
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
        sb.append("InteractionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", userType=").append(String.valueOf(this.userType));
        sb.append(", timeOfConversation=").append(String.valueOf(this.timeOfConversation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InteractionSummary)) {
            return false;
        }

        InteractionSummary other = (InteractionSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.userType, other.userType)
                && java.util.Objects.equals(this.timeOfConversation, other.timeOfConversation)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.userType == null ? 43 : this.userType.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfConversation == null
                                ? 43
                                : this.timeOfConversation.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
