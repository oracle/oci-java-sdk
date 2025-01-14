/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The platform configuration for the instance. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = PlatformConfig.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AmdMilanBmPlatformConfig.class,
            name = "AMD_MILAN_BM"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AmdRomeBmPlatformConfig.class,
            name = "AMD_ROME_BM"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = IntelSkylakeBmPlatformConfig.class,
            name = "INTEL_SKYLAKE_BM"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AmdRomeBmGpuPlatformConfig.class,
            name = "AMD_ROME_BM_GPU"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = IntelIcelakeBmPlatformConfig.class,
            name = "INTEL_ICELAKE_BM"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AmdVmPlatformConfig.class,
            name = "AMD_VM"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = IntelVmPlatformConfig.class,
            name = "INTEL_VM"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = GenericBmPlatformConfig.class,
            name = "GENERIC_BM"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = AmdMilanBmGpuPlatformConfig.class,
            name = "AMD_MILAN_BM_GPU")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class PlatformConfig extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isSecureBootEnabled",
        "isTrustedPlatformModuleEnabled",
        "isMeasuredBootEnabled",
        "isMemoryEncryptionEnabled"
    })
    protected PlatformConfig(
            Boolean isSecureBootEnabled,
            Boolean isTrustedPlatformModuleEnabled,
            Boolean isMeasuredBootEnabled,
            Boolean isMemoryEncryptionEnabled) {
        super();
        this.isSecureBootEnabled = isSecureBootEnabled;
        this.isTrustedPlatformModuleEnabled = isTrustedPlatformModuleEnabled;
        this.isMeasuredBootEnabled = isMeasuredBootEnabled;
        this.isMemoryEncryptionEnabled = isMemoryEncryptionEnabled;
    }

    /** Whether Secure Boot is enabled on the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSecureBootEnabled")
    private final Boolean isSecureBootEnabled;

    /**
     * Whether Secure Boot is enabled on the instance.
     *
     * @return the value
     */
    public Boolean getIsSecureBootEnabled() {
        return isSecureBootEnabled;
    }

    /** Whether the Trusted Platform Module (TPM) is enabled on the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("isTrustedPlatformModuleEnabled")
    private final Boolean isTrustedPlatformModuleEnabled;

    /**
     * Whether the Trusted Platform Module (TPM) is enabled on the instance.
     *
     * @return the value
     */
    public Boolean getIsTrustedPlatformModuleEnabled() {
        return isTrustedPlatformModuleEnabled;
    }

    /** Whether the Measured Boot feature is enabled on the instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("isMeasuredBootEnabled")
    private final Boolean isMeasuredBootEnabled;

    /**
     * Whether the Measured Boot feature is enabled on the instance.
     *
     * @return the value
     */
    public Boolean getIsMeasuredBootEnabled() {
        return isMeasuredBootEnabled;
    }

    /**
     * Whether the instance is a confidential instance. If this value is {@code true}, the instance
     * is a confidential instance. The default value is {@code false}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isMemoryEncryptionEnabled")
    private final Boolean isMemoryEncryptionEnabled;

    /**
     * Whether the instance is a confidential instance. If this value is {@code true}, the instance
     * is a confidential instance. The default value is {@code false}.
     *
     * @return the value
     */
    public Boolean getIsMemoryEncryptionEnabled() {
        return isMemoryEncryptionEnabled;
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
        sb.append("PlatformConfig(");
        sb.append("super=").append(super.toString());
        sb.append("isSecureBootEnabled=").append(String.valueOf(this.isSecureBootEnabled));
        sb.append(", isTrustedPlatformModuleEnabled=")
                .append(String.valueOf(this.isTrustedPlatformModuleEnabled));
        sb.append(", isMeasuredBootEnabled=").append(String.valueOf(this.isMeasuredBootEnabled));
        sb.append(", isMemoryEncryptionEnabled=")
                .append(String.valueOf(this.isMemoryEncryptionEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PlatformConfig)) {
            return false;
        }

        PlatformConfig other = (PlatformConfig) o;
        return java.util.Objects.equals(this.isSecureBootEnabled, other.isSecureBootEnabled)
                && java.util.Objects.equals(
                        this.isTrustedPlatformModuleEnabled, other.isTrustedPlatformModuleEnabled)
                && java.util.Objects.equals(this.isMeasuredBootEnabled, other.isMeasuredBootEnabled)
                && java.util.Objects.equals(
                        this.isMemoryEncryptionEnabled, other.isMemoryEncryptionEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isSecureBootEnabled == null
                                ? 43
                                : this.isSecureBootEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isTrustedPlatformModuleEnabled == null
                                ? 43
                                : this.isTrustedPlatformModuleEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isMeasuredBootEnabled == null
                                ? 43
                                : this.isMeasuredBootEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isMemoryEncryptionEnabled == null
                                ? 43
                                : this.isMemoryEncryptionEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of platform being configured. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        AmdMilanBm("AMD_MILAN_BM"),
        AmdMilanBmGpu("AMD_MILAN_BM_GPU"),
        AmdRomeBm("AMD_ROME_BM"),
        AmdRomeBmGpu("AMD_ROME_BM_GPU"),
        GenericBm("GENERIC_BM"),
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
}
