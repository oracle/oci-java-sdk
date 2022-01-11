/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The platform configuration used when launching a bare metal instance with an E4 shape
 * (the AMD Milan platform).
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
    builder = AmdMilanBmLaunchInstancePlatformConfig.Builder.class
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
public class AmdMilanBmLaunchInstancePlatformConfig extends LaunchInstancePlatformConfig {
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

        @com.fasterxml.jackson.annotation.JsonProperty("numaNodesPerSocket")
        private NumaNodesPerSocket numaNodesPerSocket;

        public Builder numaNodesPerSocket(NumaNodesPerSocket numaNodesPerSocket) {
            this.numaNodesPerSocket = numaNodesPerSocket;
            this.__explicitlySet__.add("numaNodesPerSocket");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AmdMilanBmLaunchInstancePlatformConfig build() {
            AmdMilanBmLaunchInstancePlatformConfig __instance__ =
                    new AmdMilanBmLaunchInstancePlatformConfig(
                            isSecureBootEnabled,
                            isTrustedPlatformModuleEnabled,
                            isMeasuredBootEnabled,
                            numaNodesPerSocket);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AmdMilanBmLaunchInstancePlatformConfig o) {
            Builder copiedBuilder =
                    isSecureBootEnabled(o.getIsSecureBootEnabled())
                            .isTrustedPlatformModuleEnabled(o.getIsTrustedPlatformModuleEnabled())
                            .isMeasuredBootEnabled(o.getIsMeasuredBootEnabled())
                            .numaNodesPerSocket(o.getNumaNodesPerSocket());

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
    public AmdMilanBmLaunchInstancePlatformConfig(
            Boolean isSecureBootEnabled,
            Boolean isTrustedPlatformModuleEnabled,
            Boolean isMeasuredBootEnabled,
            NumaNodesPerSocket numaNodesPerSocket) {
        super(isSecureBootEnabled, isTrustedPlatformModuleEnabled, isMeasuredBootEnabled);
        this.numaNodesPerSocket = numaNodesPerSocket;
    }

    /**
     * The number of NUMA nodes per socket (NPS).
     *
     **/
    public enum NumaNodesPerSocket {
        Nps0("NPS0"),
        Nps1("NPS1"),
        Nps2("NPS2"),
        Nps4("NPS4"),
        ;

        private final String value;
        private static java.util.Map<String, NumaNodesPerSocket> map;

        static {
            map = new java.util.HashMap<>();
            for (NumaNodesPerSocket v : NumaNodesPerSocket.values()) {
                map.put(v.getValue(), v);
            }
        }

        NumaNodesPerSocket(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NumaNodesPerSocket create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid NumaNodesPerSocket: " + key);
        }
    };
    /**
     * The number of NUMA nodes per socket (NPS).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numaNodesPerSocket")
    NumaNodesPerSocket numaNodesPerSocket;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
