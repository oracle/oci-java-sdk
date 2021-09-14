/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The platform configuration used when launching a virtual machine instance with the Intel platform.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = InstanceConfigurationIntelVmLaunchInstancePlatformConfig.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class InstanceConfigurationIntelVmLaunchInstancePlatformConfig
        extends InstanceConfigurationLaunchInstancePlatformConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("isSecureBootEnabled")
        private Boolean isSecureBootEnabled;

        public Builder isSecureBootEnabled(Boolean isSecureBootEnabled) {
            this.isSecureBootEnabled = isSecureBootEnabled;
            this.__explicitlySet__.add("isSecureBootEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isTrustedPlatformModuleEnabled")
        private Boolean isTrustedPlatformModuleEnabled;

        public Builder isTrustedPlatformModuleEnabled(Boolean isTrustedPlatformModuleEnabled) {
            this.isTrustedPlatformModuleEnabled = isTrustedPlatformModuleEnabled;
            this.__explicitlySet__.add("isTrustedPlatformModuleEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMeasuredBootEnabled")
        private Boolean isMeasuredBootEnabled;

        public Builder isMeasuredBootEnabled(Boolean isMeasuredBootEnabled) {
            this.isMeasuredBootEnabled = isMeasuredBootEnabled;
            this.__explicitlySet__.add("isMeasuredBootEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstanceConfigurationIntelVmLaunchInstancePlatformConfig build() {
            InstanceConfigurationIntelVmLaunchInstancePlatformConfig __instance__ =
                    new InstanceConfigurationIntelVmLaunchInstancePlatformConfig(
                            isSecureBootEnabled,
                            isTrustedPlatformModuleEnabled,
                            isMeasuredBootEnabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstanceConfigurationIntelVmLaunchInstancePlatformConfig o) {
            Builder copiedBuilder =
                    isSecureBootEnabled(o.getIsSecureBootEnabled())
                            .isTrustedPlatformModuleEnabled(o.getIsTrustedPlatformModuleEnabled())
                            .isMeasuredBootEnabled(o.getIsMeasuredBootEnabled());

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

    @Deprecated
    public InstanceConfigurationIntelVmLaunchInstancePlatformConfig(
            Boolean isSecureBootEnabled,
            Boolean isTrustedPlatformModuleEnabled,
            Boolean isMeasuredBootEnabled) {
        super(isSecureBootEnabled, isTrustedPlatformModuleEnabled, isMeasuredBootEnabled);
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
