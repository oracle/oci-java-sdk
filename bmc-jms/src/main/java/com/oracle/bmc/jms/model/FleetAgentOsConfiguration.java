/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Management Agent Configuration for list of include/exclude file system paths (specific to operating system).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FleetAgentOsConfiguration.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class FleetAgentOsConfiguration {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("includePaths")
        private java.util.List<String> includePaths;

        public Builder includePaths(java.util.List<String> includePaths) {
            this.includePaths = includePaths;
            this.__explicitlySet__.add("includePaths");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("excludePaths")
        private java.util.List<String> excludePaths;

        public Builder excludePaths(java.util.List<String> excludePaths) {
            this.excludePaths = excludePaths;
            this.__explicitlySet__.add("excludePaths");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FleetAgentOsConfiguration build() {
            FleetAgentOsConfiguration __instance__ =
                    new FleetAgentOsConfiguration(includePaths, excludePaths);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FleetAgentOsConfiguration o) {
            Builder copiedBuilder =
                    includePaths(o.getIncludePaths()).excludePaths(o.getExcludePaths());

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
     * An array of file system paths (environment variables supported).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("includePaths")
    java.util.List<String> includePaths;

    /**
     * An array of file system paths (environment variables supported).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("excludePaths")
    java.util.List<String> excludePaths;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
