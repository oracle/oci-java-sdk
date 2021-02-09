/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.computeinstanceagent.model;

/**
 * Describes where the plugin is supported
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180530")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AvailablePluginSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AvailablePluginSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("summary")
        private String summary;

        public Builder summary(String summary) {
            this.summary = summary;
            this.__explicitlySet__.add("summary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSupported")
        private Boolean isSupported;

        public Builder isSupported(Boolean isSupported) {
            this.isSupported = isSupported;
            this.__explicitlySet__.add("isSupported");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isEnabledByDefault")
        private Boolean isEnabledByDefault;

        public Builder isEnabledByDefault(Boolean isEnabledByDefault) {
            this.isEnabledByDefault = isEnabledByDefault;
            this.__explicitlySet__.add("isEnabledByDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AvailablePluginSummary build() {
            AvailablePluginSummary __instance__ =
                    new AvailablePluginSummary(name, summary, isSupported, isEnabledByDefault);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AvailablePluginSummary o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .summary(o.getSummary())
                            .isSupported(o.getIsSupported())
                            .isEnabledByDefault(o.getIsEnabledByDefault());

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
     * The plugin name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * A brief description of the plugin functionality
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("summary")
    String summary;

    /**
     * Is the plugin supported or not
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSupported")
    Boolean isSupported;

    /**
     * Is the plugin enabled or disabled by default
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabledByDefault")
    Boolean isEnabledByDefault;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
