/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BadUserStateAuthenticateUserResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class BadUserStateAuthenticateUserResult
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "tenantInput",
        "userInput",
        "resolvedTenantId",
        "resolvedUserId",
        "userState"
    })
    public BadUserStateAuthenticateUserResult(
            String tenantInput,
            String userInput,
            String resolvedTenantId,
            String resolvedUserId,
            UserState userState) {
        super();
        this.tenantInput = tenantInput;
        this.userInput = userInput;
        this.resolvedTenantId = resolvedTenantId;
        this.resolvedUserId = resolvedUserId;
        this.userState = userState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The tenant name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenantInput")
        private String tenantInput;

        /**
         * The tenant name.
         * @param tenantInput the value to set
         * @return this builder
         **/
        public Builder tenantInput(String tenantInput) {
            this.tenantInput = tenantInput;
            this.__explicitlySet__.add("tenantInput");
            return this;
        }
        /**
         * The user name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userInput")
        private String userInput;

        /**
         * The user name.
         * @param userInput the value to set
         * @return this builder
         **/
        public Builder userInput(String userInput) {
            this.userInput = userInput;
            this.__explicitlySet__.add("userInput");
            return this;
        }
        /**
         * The resolved tenant id.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resolvedTenantId")
        private String resolvedTenantId;

        /**
         * The resolved tenant id.
         * @param resolvedTenantId the value to set
         * @return this builder
         **/
        public Builder resolvedTenantId(String resolvedTenantId) {
            this.resolvedTenantId = resolvedTenantId;
            this.__explicitlySet__.add("resolvedTenantId");
            return this;
        }
        /**
         * The resolved user id.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("resolvedUserId")
        private String resolvedUserId;

        /**
         * The resolved user id.
         * @param resolvedUserId the value to set
         * @return this builder
         **/
        public Builder resolvedUserId(String resolvedUserId) {
            this.resolvedUserId = resolvedUserId;
            this.__explicitlySet__.add("resolvedUserId");
            return this;
        }
        /**
         * The bad user state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userState")
        private UserState userState;

        /**
         * The bad user state.
         * @param userState the value to set
         * @return this builder
         **/
        public Builder userState(UserState userState) {
            this.userState = userState;
            this.__explicitlySet__.add("userState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BadUserStateAuthenticateUserResult build() {
            BadUserStateAuthenticateUserResult model =
                    new BadUserStateAuthenticateUserResult(
                            this.tenantInput,
                            this.userInput,
                            this.resolvedTenantId,
                            this.resolvedUserId,
                            this.userState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BadUserStateAuthenticateUserResult model) {
            if (model.wasPropertyExplicitlySet("tenantInput")) {
                this.tenantInput(model.getTenantInput());
            }
            if (model.wasPropertyExplicitlySet("userInput")) {
                this.userInput(model.getUserInput());
            }
            if (model.wasPropertyExplicitlySet("resolvedTenantId")) {
                this.resolvedTenantId(model.getResolvedTenantId());
            }
            if (model.wasPropertyExplicitlySet("resolvedUserId")) {
                this.resolvedUserId(model.getResolvedUserId());
            }
            if (model.wasPropertyExplicitlySet("userState")) {
                this.userState(model.getUserState());
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
     * The tenant name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantInput")
    private final String tenantInput;

    /**
     * The tenant name.
     * @return the value
     **/
    public String getTenantInput() {
        return tenantInput;
    }

    /**
     * The user name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userInput")
    private final String userInput;

    /**
     * The user name.
     * @return the value
     **/
    public String getUserInput() {
        return userInput;
    }

    /**
     * The resolved tenant id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resolvedTenantId")
    private final String resolvedTenantId;

    /**
     * The resolved tenant id.
     * @return the value
     **/
    public String getResolvedTenantId() {
        return resolvedTenantId;
    }

    /**
     * The resolved user id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resolvedUserId")
    private final String resolvedUserId;

    /**
     * The resolved user id.
     * @return the value
     **/
    public String getResolvedUserId() {
        return resolvedUserId;
    }

    /**
     * The bad user state.
     **/
    public enum UserState {
        UserBlocked("USER_BLOCKED"),
        UserDisabled("USER_DISABLED"),
        OneTimePasswordExpired("ONE_TIME_PASSWORD_EXPIRED"),
        PasswordInvalid("PASSWORD_INVALID"),
        ;

        private final String value;
        private static java.util.Map<String, UserState> map;

        static {
            map = new java.util.HashMap<>();
            for (UserState v : UserState.values()) {
                map.put(v.getValue(), v);
            }
        }

        UserState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UserState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid UserState: " + key);
        }
    };
    /**
     * The bad user state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userState")
    private final UserState userState;

    /**
     * The bad user state.
     * @return the value
     **/
    public UserState getUserState() {
        return userState;
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
        sb.append("BadUserStateAuthenticateUserResult(");
        sb.append("super=").append(super.toString());
        sb.append("tenantInput=").append(String.valueOf(this.tenantInput));
        sb.append(", userInput=").append(String.valueOf(this.userInput));
        sb.append(", resolvedTenantId=").append(String.valueOf(this.resolvedTenantId));
        sb.append(", resolvedUserId=").append(String.valueOf(this.resolvedUserId));
        sb.append(", userState=").append(String.valueOf(this.userState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BadUserStateAuthenticateUserResult)) {
            return false;
        }

        BadUserStateAuthenticateUserResult other = (BadUserStateAuthenticateUserResult) o;
        return java.util.Objects.equals(this.tenantInput, other.tenantInput)
                && java.util.Objects.equals(this.userInput, other.userInput)
                && java.util.Objects.equals(this.resolvedTenantId, other.resolvedTenantId)
                && java.util.Objects.equals(this.resolvedUserId, other.resolvedUserId)
                && java.util.Objects.equals(this.userState, other.userState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tenantInput == null ? 43 : this.tenantInput.hashCode());
        result = (result * PRIME) + (this.userInput == null ? 43 : this.userInput.hashCode());
        result =
                (result * PRIME)
                        + (this.resolvedTenantId == null ? 43 : this.resolvedTenantId.hashCode());
        result =
                (result * PRIME)
                        + (this.resolvedUserId == null ? 43 : this.resolvedUserId.hashCode());
        result = (result * PRIME) + (this.userState == null ? 43 : this.userState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
