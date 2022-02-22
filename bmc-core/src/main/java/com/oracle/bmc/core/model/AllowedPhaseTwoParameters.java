/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Allowed phase two parameters.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AllowedPhaseTwoParameters.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AllowedPhaseTwoParameters {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("encryptionAlgorithms")
        private java.util.List<String> encryptionAlgorithms;

        public Builder encryptionAlgorithms(java.util.List<String> encryptionAlgorithms) {
            this.encryptionAlgorithms = encryptionAlgorithms;
            this.__explicitlySet__.add("encryptionAlgorithms");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("authenticationAlgorithms")
        private java.util.List<String> authenticationAlgorithms;

        public Builder authenticationAlgorithms(java.util.List<String> authenticationAlgorithms) {
            this.authenticationAlgorithms = authenticationAlgorithms;
            this.__explicitlySet__.add("authenticationAlgorithms");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pfsDhGroups")
        private java.util.List<String> pfsDhGroups;

        public Builder pfsDhGroups(java.util.List<String> pfsDhGroups) {
            this.pfsDhGroups = pfsDhGroups;
            this.__explicitlySet__.add("pfsDhGroups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AllowedPhaseTwoParameters build() {
            AllowedPhaseTwoParameters __instance__ =
                    new AllowedPhaseTwoParameters(
                            encryptionAlgorithms, authenticationAlgorithms, pfsDhGroups);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AllowedPhaseTwoParameters o) {
            Builder copiedBuilder =
                    encryptionAlgorithms(o.getEncryptionAlgorithms())
                            .authenticationAlgorithms(o.getAuthenticationAlgorithms())
                            .pfsDhGroups(o.getPfsDhGroups());

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
     * Allowed phase two encryption algorithms.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionAlgorithms")
    java.util.List<String> encryptionAlgorithms;

    /**
     * Allowed phase two authentication algorithms.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationAlgorithms")
    java.util.List<String> authenticationAlgorithms;

    /**
     * Allowed perfect forward secrecy Diffie-Hellman groups.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pfsDhGroups")
    java.util.List<String> pfsDhGroups;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
