/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The list of supported platform configuration options for this shape. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ShapePlatformConfigOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ShapePlatformConfigOptions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "type",
        "secureBootOptions",
        "measuredBootOptions",
        "trustedPlatformModuleOptions",
        "numaNodesPerSocketPlatformOptions",
        "memoryEncryptionOptions",
        "symmetricMultiThreadingOptions",
        "accessControlServiceOptions",
        "virtualInstructionsOptions",
        "inputOutputMemoryManagementUnitOptions",
        "percentageOfCoresEnabledOptions"
    })
    public ShapePlatformConfigOptions(
            Type type,
            ShapeSecureBootOptions secureBootOptions,
            ShapeMeasuredBootOptions measuredBootOptions,
            ShapeTrustedPlatformModuleOptions trustedPlatformModuleOptions,
            ShapeNumaNodesPerSocketPlatformOptions numaNodesPerSocketPlatformOptions,
            ShapeMemoryEncryptionOptions memoryEncryptionOptions,
            ShapeSymmetricMultiThreadingEnabledPlatformOptions symmetricMultiThreadingOptions,
            ShapeAccessControlServiceEnabledPlatformOptions accessControlServiceOptions,
            ShapeVirtualInstructionsEnabledPlatformOptions virtualInstructionsOptions,
            ShapeInputOutputMemoryManagementUnitEnabledPlatformOptions
                    inputOutputMemoryManagementUnitOptions,
            PercentageOfCoresEnabledOptions percentageOfCoresEnabledOptions) {
        super();
        this.type = type;
        this.secureBootOptions = secureBootOptions;
        this.measuredBootOptions = measuredBootOptions;
        this.trustedPlatformModuleOptions = trustedPlatformModuleOptions;
        this.numaNodesPerSocketPlatformOptions = numaNodesPerSocketPlatformOptions;
        this.memoryEncryptionOptions = memoryEncryptionOptions;
        this.symmetricMultiThreadingOptions = symmetricMultiThreadingOptions;
        this.accessControlServiceOptions = accessControlServiceOptions;
        this.virtualInstructionsOptions = virtualInstructionsOptions;
        this.inputOutputMemoryManagementUnitOptions = inputOutputMemoryManagementUnitOptions;
        this.percentageOfCoresEnabledOptions = percentageOfCoresEnabledOptions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The type of platform being configured. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of platform being configured.
         *
         * @param type the value to set
         * @return this builder
         */
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

        @com.fasterxml.jackson.annotation.JsonProperty("memoryEncryptionOptions")
        private ShapeMemoryEncryptionOptions memoryEncryptionOptions;

        public Builder memoryEncryptionOptions(
                ShapeMemoryEncryptionOptions memoryEncryptionOptions) {
            this.memoryEncryptionOptions = memoryEncryptionOptions;
            this.__explicitlySet__.add("memoryEncryptionOptions");
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
            ShapePlatformConfigOptions model =
                    new ShapePlatformConfigOptions(
                            this.type,
                            this.secureBootOptions,
                            this.measuredBootOptions,
                            this.trustedPlatformModuleOptions,
                            this.numaNodesPerSocketPlatformOptions,
                            this.memoryEncryptionOptions,
                            this.symmetricMultiThreadingOptions,
                            this.accessControlServiceOptions,
                            this.virtualInstructionsOptions,
                            this.inputOutputMemoryManagementUnitOptions,
                            this.percentageOfCoresEnabledOptions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ShapePlatformConfigOptions model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("secureBootOptions")) {
                this.secureBootOptions(model.getSecureBootOptions());
            }
            if (model.wasPropertyExplicitlySet("measuredBootOptions")) {
                this.measuredBootOptions(model.getMeasuredBootOptions());
            }
            if (model.wasPropertyExplicitlySet("trustedPlatformModuleOptions")) {
                this.trustedPlatformModuleOptions(model.getTrustedPlatformModuleOptions());
            }
            if (model.wasPropertyExplicitlySet("numaNodesPerSocketPlatformOptions")) {
                this.numaNodesPerSocketPlatformOptions(
                        model.getNumaNodesPerSocketPlatformOptions());
            }
            if (model.wasPropertyExplicitlySet("memoryEncryptionOptions")) {
                this.memoryEncryptionOptions(model.getMemoryEncryptionOptions());
            }
            if (model.wasPropertyExplicitlySet("symmetricMultiThreadingOptions")) {
                this.symmetricMultiThreadingOptions(model.getSymmetricMultiThreadingOptions());
            }
            if (model.wasPropertyExplicitlySet("accessControlServiceOptions")) {
                this.accessControlServiceOptions(model.getAccessControlServiceOptions());
            }
            if (model.wasPropertyExplicitlySet("virtualInstructionsOptions")) {
                this.virtualInstructionsOptions(model.getVirtualInstructionsOptions());
            }
            if (model.wasPropertyExplicitlySet("inputOutputMemoryManagementUnitOptions")) {
                this.inputOutputMemoryManagementUnitOptions(
                        model.getInputOutputMemoryManagementUnitOptions());
            }
            if (model.wasPropertyExplicitlySet("percentageOfCoresEnabledOptions")) {
                this.percentageOfCoresEnabledOptions(model.getPercentageOfCoresEnabledOptions());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The type of platform being configured. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        AmdMilanBm("AMD_MILAN_BM"),
        AmdRomeBm("AMD_ROME_BM"),
        AmdRomeBmGpu("AMD_ROME_BM_GPU"),
        IntelIcelakeBm("INTEL_ICELAKE_BM"),
        IntelSkylakeBm("INTEL_SKYLAKE_BM"),
        AmdVm("AMD_VM"),
        IntelVm("INTEL_VM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

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
    /** The type of platform being configured. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of platform being configured.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("secureBootOptions")
    private final ShapeSecureBootOptions secureBootOptions;

    public ShapeSecureBootOptions getSecureBootOptions() {
        return secureBootOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("measuredBootOptions")
    private final ShapeMeasuredBootOptions measuredBootOptions;

    public ShapeMeasuredBootOptions getMeasuredBootOptions() {
        return measuredBootOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("trustedPlatformModuleOptions")
    private final ShapeTrustedPlatformModuleOptions trustedPlatformModuleOptions;

    public ShapeTrustedPlatformModuleOptions getTrustedPlatformModuleOptions() {
        return trustedPlatformModuleOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("numaNodesPerSocketPlatformOptions")
    private final ShapeNumaNodesPerSocketPlatformOptions numaNodesPerSocketPlatformOptions;

    public ShapeNumaNodesPerSocketPlatformOptions getNumaNodesPerSocketPlatformOptions() {
        return numaNodesPerSocketPlatformOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("memoryEncryptionOptions")
    private final ShapeMemoryEncryptionOptions memoryEncryptionOptions;

    public ShapeMemoryEncryptionOptions getMemoryEncryptionOptions() {
        return memoryEncryptionOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("symmetricMultiThreadingOptions")
    private final ShapeSymmetricMultiThreadingEnabledPlatformOptions symmetricMultiThreadingOptions;

    public ShapeSymmetricMultiThreadingEnabledPlatformOptions getSymmetricMultiThreadingOptions() {
        return symmetricMultiThreadingOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("accessControlServiceOptions")
    private final ShapeAccessControlServiceEnabledPlatformOptions accessControlServiceOptions;

    public ShapeAccessControlServiceEnabledPlatformOptions getAccessControlServiceOptions() {
        return accessControlServiceOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("virtualInstructionsOptions")
    private final ShapeVirtualInstructionsEnabledPlatformOptions virtualInstructionsOptions;

    public ShapeVirtualInstructionsEnabledPlatformOptions getVirtualInstructionsOptions() {
        return virtualInstructionsOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("inputOutputMemoryManagementUnitOptions")
    private final ShapeInputOutputMemoryManagementUnitEnabledPlatformOptions
            inputOutputMemoryManagementUnitOptions;

    public ShapeInputOutputMemoryManagementUnitEnabledPlatformOptions
            getInputOutputMemoryManagementUnitOptions() {
        return inputOutputMemoryManagementUnitOptions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("percentageOfCoresEnabledOptions")
    private final PercentageOfCoresEnabledOptions percentageOfCoresEnabledOptions;

    public PercentageOfCoresEnabledOptions getPercentageOfCoresEnabledOptions() {
        return percentageOfCoresEnabledOptions;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ShapePlatformConfigOptions(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", secureBootOptions=").append(String.valueOf(this.secureBootOptions));
        sb.append(", measuredBootOptions=").append(String.valueOf(this.measuredBootOptions));
        sb.append(", trustedPlatformModuleOptions=")
                .append(String.valueOf(this.trustedPlatformModuleOptions));
        sb.append(", numaNodesPerSocketPlatformOptions=")
                .append(String.valueOf(this.numaNodesPerSocketPlatformOptions));
        sb.append(", memoryEncryptionOptions=")
                .append(String.valueOf(this.memoryEncryptionOptions));
        sb.append(", symmetricMultiThreadingOptions=")
                .append(String.valueOf(this.symmetricMultiThreadingOptions));
        sb.append(", accessControlServiceOptions=")
                .append(String.valueOf(this.accessControlServiceOptions));
        sb.append(", virtualInstructionsOptions=")
                .append(String.valueOf(this.virtualInstructionsOptions));
        sb.append(", inputOutputMemoryManagementUnitOptions=")
                .append(String.valueOf(this.inputOutputMemoryManagementUnitOptions));
        sb.append(", percentageOfCoresEnabledOptions=")
                .append(String.valueOf(this.percentageOfCoresEnabledOptions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ShapePlatformConfigOptions)) {
            return false;
        }

        ShapePlatformConfigOptions other = (ShapePlatformConfigOptions) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.secureBootOptions, other.secureBootOptions)
                && java.util.Objects.equals(this.measuredBootOptions, other.measuredBootOptions)
                && java.util.Objects.equals(
                        this.trustedPlatformModuleOptions, other.trustedPlatformModuleOptions)
                && java.util.Objects.equals(
                        this.numaNodesPerSocketPlatformOptions,
                        other.numaNodesPerSocketPlatformOptions)
                && java.util.Objects.equals(
                        this.memoryEncryptionOptions, other.memoryEncryptionOptions)
                && java.util.Objects.equals(
                        this.symmetricMultiThreadingOptions, other.symmetricMultiThreadingOptions)
                && java.util.Objects.equals(
                        this.accessControlServiceOptions, other.accessControlServiceOptions)
                && java.util.Objects.equals(
                        this.virtualInstructionsOptions, other.virtualInstructionsOptions)
                && java.util.Objects.equals(
                        this.inputOutputMemoryManagementUnitOptions,
                        other.inputOutputMemoryManagementUnitOptions)
                && java.util.Objects.equals(
                        this.percentageOfCoresEnabledOptions, other.percentageOfCoresEnabledOptions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.secureBootOptions == null ? 43 : this.secureBootOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.measuredBootOptions == null
                                ? 43
                                : this.measuredBootOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.trustedPlatformModuleOptions == null
                                ? 43
                                : this.trustedPlatformModuleOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.numaNodesPerSocketPlatformOptions == null
                                ? 43
                                : this.numaNodesPerSocketPlatformOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.memoryEncryptionOptions == null
                                ? 43
                                : this.memoryEncryptionOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.symmetricMultiThreadingOptions == null
                                ? 43
                                : this.symmetricMultiThreadingOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.accessControlServiceOptions == null
                                ? 43
                                : this.accessControlServiceOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.virtualInstructionsOptions == null
                                ? 43
                                : this.virtualInstructionsOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.inputOutputMemoryManagementUnitOptions == null
                                ? 43
                                : this.inputOutputMemoryManagementUnitOptions.hashCode());
        result =
                (result * PRIME)
                        + (this.percentageOfCoresEnabledOptions == null
                                ? 43
                                : this.percentageOfCoresEnabledOptions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
