/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.model;

/**
 * The information to be updated.
 * When updating WebAppFirewallPolicy, shallow merge is used for all top-level fields,
 * meaning that top-level fields with defined values are completely overwritten and
 * top-level fields without defined values are unchanged.
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
    builder = UpdateWebAppFirewallPolicyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateWebAppFirewallPolicyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("actions")
        private java.util.List<Action> actions;

        public Builder actions(java.util.List<Action> actions) {
            this.actions = actions;
            this.__explicitlySet__.add("actions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestAccessControl")
        private RequestAccessControl requestAccessControl;

        public Builder requestAccessControl(RequestAccessControl requestAccessControl) {
            this.requestAccessControl = requestAccessControl;
            this.__explicitlySet__.add("requestAccessControl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestRateLimiting")
        private RequestRateLimiting requestRateLimiting;

        public Builder requestRateLimiting(RequestRateLimiting requestRateLimiting) {
            this.requestRateLimiting = requestRateLimiting;
            this.__explicitlySet__.add("requestRateLimiting");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestProtection")
        private RequestProtection requestProtection;

        public Builder requestProtection(RequestProtection requestProtection) {
            this.requestProtection = requestProtection;
            this.__explicitlySet__.add("requestProtection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseAccessControl")
        private ResponseAccessControl responseAccessControl;

        public Builder responseAccessControl(ResponseAccessControl responseAccessControl) {
            this.responseAccessControl = responseAccessControl;
            this.__explicitlySet__.add("responseAccessControl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseProtection")
        private ResponseProtection responseProtection;

        public Builder responseProtection(ResponseProtection responseProtection) {
            this.responseProtection = responseProtection;
            this.__explicitlySet__.add("responseProtection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateWebAppFirewallPolicyDetails build() {
            UpdateWebAppFirewallPolicyDetails __instance__ =
                    new UpdateWebAppFirewallPolicyDetails(
                            displayName,
                            actions,
                            requestAccessControl,
                            requestRateLimiting,
                            requestProtection,
                            responseAccessControl,
                            responseProtection,
                            freeformTags,
                            definedTags,
                            systemTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateWebAppFirewallPolicyDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .actions(o.getActions())
                            .requestAccessControl(o.getRequestAccessControl())
                            .requestRateLimiting(o.getRequestRateLimiting())
                            .requestProtection(o.getRequestProtection())
                            .responseAccessControl(o.getResponseAccessControl())
                            .responseProtection(o.getResponseProtection())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .systemTags(o.getSystemTags());

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
     * WebAppFirewallPolicy display name, can be renamed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Predefined actions for use in multiple different rules. Not all actions are supported in every module.
     * Some actions terminate further execution of modules and rules in a module and some do not.
     * Actions names must be unique within this array.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actions")
    java.util.List<Action> actions;

    @com.fasterxml.jackson.annotation.JsonProperty("requestAccessControl")
    RequestAccessControl requestAccessControl;

    @com.fasterxml.jackson.annotation.JsonProperty("requestRateLimiting")
    RequestRateLimiting requestRateLimiting;

    @com.fasterxml.jackson.annotation.JsonProperty("requestProtection")
    RequestProtection requestProtection;

    @com.fasterxml.jackson.annotation.JsonProperty("responseAccessControl")
    ResponseAccessControl responseAccessControl;

    @com.fasterxml.jackson.annotation.JsonProperty("responseProtection")
    ResponseProtection responseProtection;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    java.util.Map<String, java.util.Map<String, Object>> systemTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
