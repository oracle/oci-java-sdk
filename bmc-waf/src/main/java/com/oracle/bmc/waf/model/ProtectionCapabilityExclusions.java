/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.model;

/**
 * Identifies specific HTTP message parameters to exclude from inspection by a protection capability.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ProtectionCapabilityExclusions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ProtectionCapabilityExclusions {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("requestCookies")
        private java.util.List<String> requestCookies;

        public Builder requestCookies(java.util.List<String> requestCookies) {
            this.requestCookies = requestCookies;
            this.__explicitlySet__.add("requestCookies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("args")
        private java.util.List<String> args;

        public Builder args(java.util.List<String> args) {
            this.args = args;
            this.__explicitlySet__.add("args");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProtectionCapabilityExclusions build() {
            ProtectionCapabilityExclusions __instance__ =
                    new ProtectionCapabilityExclusions(requestCookies, args);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProtectionCapabilityExclusions o) {
            Builder copiedBuilder = requestCookies(o.getRequestCookies()).args(o.getArgs());

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
     * List of HTTP request cookie values (by cookie name) to exclude from inspecting.
     * Example: If we have cookie 'cookieName=cookieValue' and requestCookies=['cookieName'], both 'cookieName' and 'cookieValue' will not be inspected.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestCookies")
    java.util.List<String> requestCookies;

    /**
     * List of URL query parameter values from form-urlencoded XML, JSON, AMP, or POST payloads to exclude from inspecting.
     * Example: If we have query parameter 'argumentName=argumentValue' and args=['argumentName'], both 'argumentName' and 'argumentValue' will not be inspected.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("args")
    java.util.List<String> args;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
