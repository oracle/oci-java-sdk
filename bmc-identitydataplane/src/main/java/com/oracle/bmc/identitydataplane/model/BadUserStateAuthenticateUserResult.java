/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = BadUserStateAuthenticateUserResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class BadUserStateAuthenticateUserResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("tenantInput")
        private String tenantInput;

        public Builder tenantInput(String tenantInput) {
            this.tenantInput = tenantInput;
            this.__explicitlySet__.add("tenantInput");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userInput")
        private String userInput;

        public Builder userInput(String userInput) {
            this.userInput = userInput;
            this.__explicitlySet__.add("userInput");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resolvedTenantId")
        private String resolvedTenantId;

        public Builder resolvedTenantId(String resolvedTenantId) {
            this.resolvedTenantId = resolvedTenantId;
            this.__explicitlySet__.add("resolvedTenantId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resolvedUserId")
        private String resolvedUserId;

        public Builder resolvedUserId(String resolvedUserId) {
            this.resolvedUserId = resolvedUserId;
            this.__explicitlySet__.add("resolvedUserId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userState")
        private UserState userState;

        public Builder userState(UserState userState) {
            this.userState = userState;
            this.__explicitlySet__.add("userState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BadUserStateAuthenticateUserResult build() {
            BadUserStateAuthenticateUserResult __instance__ =
                    new BadUserStateAuthenticateUserResult(
                            tenantInput, userInput, resolvedTenantId, resolvedUserId, userState);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BadUserStateAuthenticateUserResult o) {
            Builder copiedBuilder =
                    tenantInput(o.getTenantInput())
                            .userInput(o.getUserInput())
                            .resolvedTenantId(o.getResolvedTenantId())
                            .resolvedUserId(o.getResolvedUserId())
                            .userState(o.getUserState());

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
     * The tenant name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenantInput")
    String tenantInput;

    /**
     * The user name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userInput")
    String userInput;

    /**
     * The resolved tenant id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resolvedTenantId")
    String resolvedTenantId;

    /**
     * The resolved user id.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resolvedUserId")
    String resolvedUserId;
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
    UserState userState;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
