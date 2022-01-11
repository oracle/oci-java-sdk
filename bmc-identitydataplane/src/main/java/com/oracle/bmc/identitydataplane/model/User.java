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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = User.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class User {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isOTP")
        private Boolean isOTP;

        public Builder isOTP(Boolean isOTP) {
            this.isOTP = isOTP;
            this.__explicitlySet__.add("isOTP");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMfaActivated")
        private Boolean isMfaActivated;

        public Builder isMfaActivated(Boolean isMfaActivated) {
            this.isMfaActivated = isMfaActivated;
            this.__explicitlySet__.add("isMfaActivated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMfaVerified")
        private Boolean isMfaVerified;

        public Builder isMfaVerified(Boolean isMfaVerified) {
            this.isMfaVerified = isMfaVerified;
            this.__explicitlySet__.add("isMfaVerified");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public User build() {
            User __instance__ = new User(id, name, isOTP, isMfaActivated, isMfaVerified);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(User o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .name(o.getName())
                            .isOTP(o.getIsOTP())
                            .isMfaActivated(o.getIsMfaActivated())
                            .isMfaVerified(o.getIsMfaVerified());

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
     * The user's Oracle ID (OCID).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The name of the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * If the provided password is a one-time password.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOTP")
    Boolean isOTP;

    /**
     * If mfa is activated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMfaActivated")
    Boolean isMfaActivated;

    /**
     * If the user has been mfa verified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMfaVerified")
    Boolean isMfaVerified;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
