/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 * Password policy, currently set for the given compartment.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PasswordPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class PasswordPolicy {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("minimumPasswordLength")
        private Integer minimumPasswordLength;

        public Builder minimumPasswordLength(Integer minimumPasswordLength) {
            this.minimumPasswordLength = minimumPasswordLength;
            this.__explicitlySet__.add("minimumPasswordLength");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isUppercaseCharactersRequired")
        private Boolean isUppercaseCharactersRequired;

        public Builder isUppercaseCharactersRequired(Boolean isUppercaseCharactersRequired) {
            this.isUppercaseCharactersRequired = isUppercaseCharactersRequired;
            this.__explicitlySet__.add("isUppercaseCharactersRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isLowercaseCharactersRequired")
        private Boolean isLowercaseCharactersRequired;

        public Builder isLowercaseCharactersRequired(Boolean isLowercaseCharactersRequired) {
            this.isLowercaseCharactersRequired = isLowercaseCharactersRequired;
            this.__explicitlySet__.add("isLowercaseCharactersRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isNumericCharactersRequired")
        private Boolean isNumericCharactersRequired;

        public Builder isNumericCharactersRequired(Boolean isNumericCharactersRequired) {
            this.isNumericCharactersRequired = isNumericCharactersRequired;
            this.__explicitlySet__.add("isNumericCharactersRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSpecialCharactersRequired")
        private Boolean isSpecialCharactersRequired;

        public Builder isSpecialCharactersRequired(Boolean isSpecialCharactersRequired) {
            this.isSpecialCharactersRequired = isSpecialCharactersRequired;
            this.__explicitlySet__.add("isSpecialCharactersRequired");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isUsernameContainmentAllowed")
        private Boolean isUsernameContainmentAllowed;

        public Builder isUsernameContainmentAllowed(Boolean isUsernameContainmentAllowed) {
            this.isUsernameContainmentAllowed = isUsernameContainmentAllowed;
            this.__explicitlySet__.add("isUsernameContainmentAllowed");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PasswordPolicy build() {
            PasswordPolicy __instance__ =
                    new PasswordPolicy(
                            minimumPasswordLength,
                            isUppercaseCharactersRequired,
                            isLowercaseCharactersRequired,
                            isNumericCharactersRequired,
                            isSpecialCharactersRequired,
                            isUsernameContainmentAllowed);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PasswordPolicy o) {
            Builder copiedBuilder =
                    minimumPasswordLength(o.getMinimumPasswordLength())
                            .isUppercaseCharactersRequired(o.getIsUppercaseCharactersRequired())
                            .isLowercaseCharactersRequired(o.getIsLowercaseCharactersRequired())
                            .isNumericCharactersRequired(o.getIsNumericCharactersRequired())
                            .isSpecialCharactersRequired(o.getIsSpecialCharactersRequired())
                            .isUsernameContainmentAllowed(o.getIsUsernameContainmentAllowed());

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
     * Minimum password length required.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("minimumPasswordLength")
    Integer minimumPasswordLength;

    /**
     * At least one uppercase character required.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUppercaseCharactersRequired")
    Boolean isUppercaseCharactersRequired;

    /**
     * At least one lower case character required.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLowercaseCharactersRequired")
    Boolean isLowercaseCharactersRequired;

    /**
     * At least one numeric character required.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isNumericCharactersRequired")
    Boolean isNumericCharactersRequired;

    /**
     * At least one special character required.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSpecialCharactersRequired")
    Boolean isSpecialCharactersRequired;

    /**
     * User name is allowed to be part of the password.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUsernameContainmentAllowed")
    Boolean isUsernameContainmentAllowed;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
