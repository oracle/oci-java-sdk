/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementagent.model;

/**
 * The Aggregation of Management Agent Dimensions
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200202")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ManagementAgentAggregationDimensions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ManagementAgentAggregationDimensions {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityStatus")
        private AvailabilityStatus availabilityStatus;

        public Builder availabilityStatus(AvailabilityStatus availabilityStatus) {
            this.availabilityStatus = availabilityStatus;
            this.__explicitlySet__.add("availabilityStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("platformType")
        private PlatformTypes platformType;

        public Builder platformType(PlatformTypes platformType) {
            this.platformType = platformType;
            this.__explicitlySet__.add("platformType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("hasPlugins")
        private Boolean hasPlugins;

        public Builder hasPlugins(Boolean hasPlugins) {
            this.hasPlugins = hasPlugins;
            this.__explicitlySet__.add("hasPlugins");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("installType")
        private InstallTypes installType;

        public Builder installType(InstallTypes installType) {
            this.installType = installType;
            this.__explicitlySet__.add("installType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagementAgentAggregationDimensions build() {
            ManagementAgentAggregationDimensions __instance__ =
                    new ManagementAgentAggregationDimensions(
                            availabilityStatus, platformType, version, hasPlugins, installType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagementAgentAggregationDimensions o) {
            Builder copiedBuilder =
                    availabilityStatus(o.getAvailabilityStatus())
                            .platformType(o.getPlatformType())
                            .version(o.getVersion())
                            .hasPlugins(o.getHasPlugins())
                            .installType(o.getInstallType());

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
     * The availability status of managementAgent
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityStatus")
    AvailabilityStatus availabilityStatus;

    /**
     * Platform Type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("platformType")
    PlatformTypes platformType;

    /**
     * Agent image version
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    String version;

    /**
     * Whether or not a managementAgent has at least one plugin
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("hasPlugins")
    Boolean hasPlugins;

    /**
     * The install type, either AGENT or GATEWAY
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("installType")
    InstallTypes installType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
