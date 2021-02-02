/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Configuration options for the Oracle Cloud Agent software running on the instance.
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
    builder = LaunchInstanceAgentConfigDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LaunchInstanceAgentConfigDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isMonitoringDisabled")
        private Boolean isMonitoringDisabled;

        public Builder isMonitoringDisabled(Boolean isMonitoringDisabled) {
            this.isMonitoringDisabled = isMonitoringDisabled;
            this.__explicitlySet__.add("isMonitoringDisabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isManagementDisabled")
        private Boolean isManagementDisabled;

        public Builder isManagementDisabled(Boolean isManagementDisabled) {
            this.isManagementDisabled = isManagementDisabled;
            this.__explicitlySet__.add("isManagementDisabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LaunchInstanceAgentConfigDetails build() {
            LaunchInstanceAgentConfigDetails __instance__ =
                    new LaunchInstanceAgentConfigDetails(
                            isMonitoringDisabled, isManagementDisabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LaunchInstanceAgentConfigDetails o) {
            Builder copiedBuilder =
                    isMonitoringDisabled(o.getIsMonitoringDisabled())
                            .isManagementDisabled(o.getIsManagementDisabled());

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
     * Whether Oracle Cloud Agent can gather performance metrics and monitor the instance using the
     * monitoring plugins. Default value is false (monitoring plugins are enabled).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMonitoringDisabled")
    Boolean isMonitoringDisabled;

    /**
     * Whether Oracle Cloud Agent can run all the available management plugins.
     * Default value is false (management plugins are enabled).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isManagementDisabled")
    Boolean isManagementDisabled;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
