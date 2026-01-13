/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.delegateaccesscontrol.model;

/**
 * Summary of customer and operator conversation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ServiceProviderInteractionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ServiceProviderInteractionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "messageIdentifier",
        "userId",
        "userName",
        "message",
        "userType",
        "timestamp"
    })
    public ServiceProviderInteractionSummary(
            String messageIdentifier,
            String userId,
            String userName,
            String message,
            UserType userType,
            java.util.Date timestamp) {
        super();
        this.messageIdentifier = messageIdentifier;
        this.userId = userId;
        this.userName = userName;
        this.message = message;
        this.userType = userType;
        this.timestamp = timestamp;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The unique identifier of the message within the scope of the associated access request.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("messageIdentifier")
        private String messageIdentifier;

        /**
         * The unique identifier of the message within the scope of the associated access request.
         *
         * @param messageIdentifier the value to set
         * @return this builder
         */
        public Builder messageIdentifier(String messageIdentifier) {
            this.messageIdentifier = messageIdentifier;
            this.__explicitlySet__.add("messageIdentifier");
            return this;
        }
        /**
         * ID of the customer or operator who is part of this conversation. For operator, this field
         * is null.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * ID of the customer or operator who is part of this conversation. For operator, this field
         * is null.
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
         * Name of the customer or operator who is part of this conversation. For operator, the name
         * is "Operator".
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * Name of the customer or operator who is part of this conversation. For operator, the name
         * is "Operator".
         *
         * @param userName the value to set
         * @return this builder
         */
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }
        /** The information exchanged between the customer and the operator. */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * The information exchanged between the customer and the operator.
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /** Indicates whether the user is a customer or an operator. */
        @com.fasterxml.jackson.annotation.JsonProperty("userType")
        private UserType userType;

        /**
         * Indicates whether the user is a customer or an operator.
         *
         * @param userType the value to set
         * @return this builder
         */
        public Builder userType(UserType userType) {
            this.userType = userType;
            this.__explicitlySet__.add("userType");
            return this;
        }
        /**
         * Time when the conversation happened in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)timestamp format, e.g.
         * '2020-05-22T21:10:29.600Z'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * Time when the conversation happened in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339)timestamp format, e.g.
         * '2020-05-22T21:10:29.600Z'.
         *
         * @param timestamp the value to set
         * @return this builder
         */
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ServiceProviderInteractionSummary build() {
            ServiceProviderInteractionSummary model =
                    new ServiceProviderInteractionSummary(
                            this.messageIdentifier,
                            this.userId,
                            this.userName,
                            this.message,
                            this.userType,
                            this.timestamp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServiceProviderInteractionSummary model) {
            if (model.wasPropertyExplicitlySet("messageIdentifier")) {
                this.messageIdentifier(model.getMessageIdentifier());
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
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
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

    /** The unique identifier of the message within the scope of the associated access request. */
    @com.fasterxml.jackson.annotation.JsonProperty("messageIdentifier")
    private final String messageIdentifier;

    /**
     * The unique identifier of the message within the scope of the associated access request.
     *
     * @return the value
     */
    public String getMessageIdentifier() {
        return messageIdentifier;
    }

    /**
     * ID of the customer or operator who is part of this conversation. For operator, this field is
     * null.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * ID of the customer or operator who is part of this conversation. For operator, this field is
     * null.
     *
     * @return the value
     */
    public String getUserId() {
        return userId;
    }

    /**
     * Name of the customer or operator who is part of this conversation. For operator, the name is
     * "Operator".
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * Name of the customer or operator who is part of this conversation. For operator, the name is
     * "Operator".
     *
     * @return the value
     */
    public String getUserName() {
        return userName;
    }

    /** The information exchanged between the customer and the operator. */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * The information exchanged between the customer and the operator.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /** Indicates whether the user is a customer or an operator. */
    public enum UserType implements com.oracle.bmc.http.internal.BmcEnum {
        Customer("CUSTOMER"),
        Operator("OPERATOR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(UserType.class);

        private final String value;
        private static java.util.Map<String, UserType> map;

        static {
            map = new java.util.HashMap<>();
            for (UserType v : UserType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        UserType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UserType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'UserType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Indicates whether the user is a customer or an operator. */
    @com.fasterxml.jackson.annotation.JsonProperty("userType")
    private final UserType userType;

    /**
     * Indicates whether the user is a customer or an operator.
     *
     * @return the value
     */
    public UserType getUserType() {
        return userType;
    }

    /**
     * Time when the conversation happened in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)timestamp format, e.g. '2020-05-22T21:10:29.600Z'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * Time when the conversation happened in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339)timestamp format, e.g. '2020-05-22T21:10:29.600Z'.
     *
     * @return the value
     */
    public java.util.Date getTimestamp() {
        return timestamp;
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
        sb.append("ServiceProviderInteractionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("messageIdentifier=").append(String.valueOf(this.messageIdentifier));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", userType=").append(String.valueOf(this.userType));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceProviderInteractionSummary)) {
            return false;
        }

        ServiceProviderInteractionSummary other = (ServiceProviderInteractionSummary) o;
        return java.util.Objects.equals(this.messageIdentifier, other.messageIdentifier)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.userType, other.userType)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.messageIdentifier == null ? 43 : this.messageIdentifier.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.userType == null ? 43 : this.userType.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
