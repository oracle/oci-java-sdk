/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.model;

/**
 * Module that allows inspection of HTTP request properties and to return a defined HTTP response.
 * In this module, rules with the name 'Default Action' are not allowed, since this name is reserved for default action logs.
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
    builder = RequestAccessControl.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RequestAccessControl {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("defaultActionName")
        private String defaultActionName;

        public Builder defaultActionName(String defaultActionName) {
            this.defaultActionName = defaultActionName;
            this.__explicitlySet__.add("defaultActionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rules")
        private java.util.List<AccessControlRule> rules;

        public Builder rules(java.util.List<AccessControlRule> rules) {
            this.rules = rules;
            this.__explicitlySet__.add("rules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RequestAccessControl build() {
            RequestAccessControl __instance__ = new RequestAccessControl(defaultActionName, rules);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RequestAccessControl o) {
            Builder copiedBuilder = defaultActionName(o.getDefaultActionName()).rules(o.getRules());

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
     * References an default Action to take if no AccessControlRule was matched. Allowed action types:
     * <p>
     * **ALLOW** continues execution of other modules and their rules.
     * <p>
     * **RETURN_HTTP_RESPONSE** terminates further execution of modules and rules and returns defined HTTP response.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultActionName")
    String defaultActionName;

    /**
     * Ordered list of AccessControlRules. Rules are executed in order of appearance in this array.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rules")
    java.util.List<AccessControlRule> rules;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
