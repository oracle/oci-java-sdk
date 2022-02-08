/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * The shape config to launch a fast launch capable job instance
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FastLaunchJobConfigSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class FastLaunchJobConfigSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
        private String shapeName;

        public Builder shapeName(String shapeName) {
            this.shapeName = shapeName;
            this.__explicitlySet__.add("shapeName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("coreCount")
        private Integer coreCount;

        public Builder coreCount(Integer coreCount) {
            this.coreCount = coreCount;
            this.__explicitlySet__.add("coreCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
        private Integer memoryInGBs;

        public Builder memoryInGBs(Integer memoryInGBs) {
            this.memoryInGBs = memoryInGBs;
            this.__explicitlySet__.add("memoryInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("shapeSeries")
        private ShapeSeries shapeSeries;

        public Builder shapeSeries(ShapeSeries shapeSeries) {
            this.shapeSeries = shapeSeries;
            this.__explicitlySet__.add("shapeSeries");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("managedEgressSupport")
        private ManagedEgressSupport managedEgressSupport;

        public Builder managedEgressSupport(ManagedEgressSupport managedEgressSupport) {
            this.managedEgressSupport = managedEgressSupport;
            this.__explicitlySet__.add("managedEgressSupport");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FastLaunchJobConfigSummary build() {
            FastLaunchJobConfigSummary __instance__ =
                    new FastLaunchJobConfigSummary(
                            name,
                            shapeName,
                            coreCount,
                            memoryInGBs,
                            shapeSeries,
                            managedEgressSupport);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FastLaunchJobConfigSummary o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .shapeName(o.getShapeName())
                            .coreCount(o.getCoreCount())
                            .memoryInGBs(o.getMemoryInGBs())
                            .shapeSeries(o.getShapeSeries())
                            .managedEgressSupport(o.getManagedEgressSupport());

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
     * The name of the fast launch job config
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The name of the fast launch job shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapeName")
    String shapeName;

    /**
     * The number of cores associated with this fast launch job shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("coreCount")
    Integer coreCount;

    /**
     * The number of cores associated with this fast launch job shape.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("memoryInGBs")
    Integer memoryInGBs;
    /**
     * The family that the compute shape belongs to.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ShapeSeries {
        AmdRome("AMD_ROME"),
        IntelSkylake("INTEL_SKYLAKE"),
        NvidiaGpu("NVIDIA_GPU"),
        Legacy("LEGACY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ShapeSeries> map;

        static {
            map = new java.util.HashMap<>();
            for (ShapeSeries v : ShapeSeries.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ShapeSeries(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ShapeSeries create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ShapeSeries', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The family that the compute shape belongs to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("shapeSeries")
    ShapeSeries shapeSeries;
    /**
     * The managed egress support
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ManagedEgressSupport {
        Required("REQUIRED"),
        Supported("SUPPORTED"),
        Unsupported("UNSUPPORTED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ManagedEgressSupport> map;

        static {
            map = new java.util.HashMap<>();
            for (ManagedEgressSupport v : ManagedEgressSupport.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ManagedEgressSupport(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ManagedEgressSupport create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ManagedEgressSupport', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The managed egress support
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedEgressSupport")
    ManagedEgressSupport managedEgressSupport;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
