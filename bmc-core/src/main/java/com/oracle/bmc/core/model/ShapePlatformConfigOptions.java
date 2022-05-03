/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The list of supported platform configuration options for this shape.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ShapePlatformConfigOptions.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ShapePlatformConfigOptions {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("secureBootOptions")
        private ShapeSecureBootOptions secureBootOptions;

        public Builder secureBootOptions(ShapeSecureBootOptions secureBootOptions) {
            this.secureBootOptions = secureBootOptions;
            this.__explicitlySet__.add("secureBootOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("measuredBootOptions")
        private ShapeMeasuredBootOptions measuredBootOptions;

        public Builder measuredBootOptions(ShapeMeasuredBootOptions measuredBootOptions) {
            this.measuredBootOptions = measuredBootOptions;
            this.__explicitlySet__.add("measuredBootOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("trustedPlatformModuleOptions")
        private ShapeTrustedPlatformModuleOptions trustedPlatformModuleOptions;

        public Builder trustedPlatformModuleOptions(
                ShapeTrustedPlatformModuleOptions trustedPlatformModuleOptions) {
            this.trustedPlatformModuleOptions = trustedPlatformModuleOptions;
            this.__explicitlySet__.add("trustedPlatformModuleOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("numaNodesPerSocketPlatformOptions")
        private ShapeNumaNodesPerSocketPlatformOptions numaNodesPerSocketPlatformOptions;

        public Builder numaNodesPerSocketPlatformOptions(
                ShapeNumaNodesPerSocketPlatformOptions numaNodesPerSocketPlatformOptions) {
            this.numaNodesPerSocketPlatformOptions = numaNodesPerSocketPlatformOptions;
            this.__explicitlySet__.add("numaNodesPerSocketPlatformOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("symmetricMultiThreadingOptions")
        private ShapeSymmetricMultiThreadingEnabledPlatformOptions symmetricMultiThreadingOptions;

        public Builder symmetricMultiThreadingOptions(
                ShapeSymmetricMultiThreadingEnabledPlatformOptions symmetricMultiThreadingOptions) {
            this.symmetricMultiThreadingOptions = symmetricMultiThreadingOptions;
            this.__explicitlySet__.add("symmetricMultiThreadingOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("accessControlServiceOptions")
        private ShapeAccessControlServiceEnabledPlatformOptions accessControlServiceOptions;

        public Builder accessControlServiceOptions(
                ShapeAccessControlServiceEnabledPlatformOptions accessControlServiceOptions) {
            this.accessControlServiceOptions = accessControlServiceOptions;
            this.__explicitlySet__.add("accessControlServiceOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("virtualInstructionsOptions")
        private ShapeVirtualInstructionsEnabledPlatformOptions virtualInstructionsOptions;

        public Builder virtualInstructionsOptions(
                ShapeVirtualInstructionsEnabledPlatformOptions virtualInstructionsOptions) {
            this.virtualInstructionsOptions = virtualInstructionsOptions;
            this.__explicitlySet__.add("virtualInstructionsOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inputOutputMemoryManagementUnitOptions")
        private ShapeInputOutputMemoryManagementUnitEnabledPlatformOptions
                inputOutputMemoryManagementUnitOptions;

        public Builder inputOutputMemoryManagementUnitOptions(
                ShapeInputOutputMemoryManagementUnitEnabledPlatformOptions
                        inputOutputMemoryManagementUnitOptions) {
            this.inputOutputMemoryManagementUnitOptions = inputOutputMemoryManagementUnitOptions;
            this.__explicitlySet__.add("inputOutputMemoryManagementUnitOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("percentageOfCoresEnabledOptions")
        private PercentageOfCoresEnabledOptions percentageOfCoresEnabledOptions;

        public Builder percentageOfCoresEnabledOptions(
                PercentageOfCoresEnabledOptions percentageOfCoresEnabledOptions) {
            this.percentageOfCoresEnabledOptions = percentageOfCoresEnabledOptions;
            this.__explicitlySet__.add("percentageOfCoresEnabledOptions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ShapePlatformConfigOptions build() {
            ShapePlatformConfigOptions __instance__ =
                    new ShapePlatformConfigOptions(
                            type,
                            secureBootOptions,
                            measuredBootOptions,
                            trustedPlatformModuleOptions,
                            numaNodesPerSocketPlatformOptions,
                            symmetricMultiThreadingOptions,
                            accessControlServiceOptions,
                            virtualInstructionsOptions,
                            inputOutputMemoryManagementUnitOptions,
                            percentageOfCoresEnabledOptions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShapePlatformConfigOptions o) {
            Builder copiedBuilder =
                    type(o.getType())
                            .secureBootOptions(o.getSecureBootOptions())
                            .measuredBootOptions(o.getMeasuredBootOptions())
                            .trustedPlatformModuleOptions(o.getTrustedPlatformModuleOptions())
                            .numaNodesPerSocketPlatformOptions(
                                    o.getNumaNodesPerSocketPlatformOptions())
                            .symmetricMultiThreadingOptions(o.getSymmetricMultiThreadingOptions())
                            .accessControlServiceOptions(o.getAccessControlServiceOptions())
                            .virtualInstructionsOptions(o.getVirtualInstructionsOptions())
                            .inputOutputMemoryManagementUnitOptions(
                                    o.getInputOutputMemoryManagementUnitOptions())
                            .percentageOfCoresEnabledOptions(
                                    o.getPercentageOfCoresEnabledOptions());

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
     * The type of platform being configured.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Type {
        AmdMilanBm("AMD_MILAN_BM"),
        AmdRomeBm("AMD_ROME_BM"),
        AmdRomeBmGpu("AMD_ROME_BM_GPU"),
        IntelIcelakeBm("INTEL_ICELAKE_BM"),
        IntelSkylakeBm("INTEL_SKYLAKE_BM"),
        AmdVm("AMD_VM"),
        IntelVm("INTEL_VM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of platform being configured.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    Type type;

    @com.fasterxml.jackson.annotation.JsonProperty("secureBootOptions")
    ShapeSecureBootOptions secureBootOptions;

    @com.fasterxml.jackson.annotation.JsonProperty("measuredBootOptions")
    ShapeMeasuredBootOptions measuredBootOptions;

    @com.fasterxml.jackson.annotation.JsonProperty("trustedPlatformModuleOptions")
    ShapeTrustedPlatformModuleOptions trustedPlatformModuleOptions;

    @com.fasterxml.jackson.annotation.JsonProperty("numaNodesPerSocketPlatformOptions")
    ShapeNumaNodesPerSocketPlatformOptions numaNodesPerSocketPlatformOptions;

    @com.fasterxml.jackson.annotation.JsonProperty("symmetricMultiThreadingOptions")
    ShapeSymmetricMultiThreadingEnabledPlatformOptions symmetricMultiThreadingOptions;

    @com.fasterxml.jackson.annotation.JsonProperty("accessControlServiceOptions")
    ShapeAccessControlServiceEnabledPlatformOptions accessControlServiceOptions;

    @com.fasterxml.jackson.annotation.JsonProperty("virtualInstructionsOptions")
    ShapeVirtualInstructionsEnabledPlatformOptions virtualInstructionsOptions;

    @com.fasterxml.jackson.annotation.JsonProperty("inputOutputMemoryManagementUnitOptions")
    ShapeInputOutputMemoryManagementUnitEnabledPlatformOptions
            inputOutputMemoryManagementUnitOptions;

    @com.fasterxml.jackson.annotation.JsonProperty("percentageOfCoresEnabledOptions")
    PercentageOfCoresEnabledOptions percentageOfCoresEnabledOptions;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
