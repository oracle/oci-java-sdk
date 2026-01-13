/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * The platform configuration used when launching a virtual machine instance with the Intel
 * platform. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = IntelVmLaunchInstancePlatformConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class IntelVmLaunchInstancePlatformConfig extends LaunchInstancePlatformConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

        @com.fasterxml.jackson.annotation.JsonProperty("isMemoryEncryptionEnabled")
        private Boolean isMemoryEncryptionEnabled;

        public Builder isMemoryEncryptionEnabled(Boolean isMemoryEncryptionEnabled) {
            this.isMemoryEncryptionEnabled = isMemoryEncryptionEnabled;
            this.__explicitlySet__.add("isMemoryEncryptionEnabled");
            return this;
        }
        /**
         * Whether symmetric multithreading is enabled on the instance. Symmetric multithreading is
         * also called simultaneous multithreading (SMT) or Intel Hyper-Threading.
         *
         * <p>Intel and AMD processors have two hardware execution threads per core (OCPU). SMT
         * permits multiple independent threads of execution, to better use the resources and
         * increase the efficiency of the CPU. When multithreading is disabled, only one thread is
         * permitted to run on each core, which can provide higher or more predictable performance
         * for some workloads.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSymmetricMultiThreadingEnabled")
        private Boolean isSymmetricMultiThreadingEnabled;

        /**
         * Whether symmetric multithreading is enabled on the instance. Symmetric multithreading is
         * also called simultaneous multithreading (SMT) or Intel Hyper-Threading.
         *
         * <p>Intel and AMD processors have two hardware execution threads per core (OCPU). SMT
         * permits multiple independent threads of execution, to better use the resources and
         * increase the efficiency of the CPU. When multithreading is disabled, only one thread is
         * permitted to run on each core, which can provide higher or more predictable performance
         * for some workloads.
         *
         * @param isSymmetricMultiThreadingEnabled the value to set
         * @return this builder
         */
        public Builder isSymmetricMultiThreadingEnabled(Boolean isSymmetricMultiThreadingEnabled) {
            this.isSymmetricMultiThreadingEnabled = isSymmetricMultiThreadingEnabled;
            this.__explicitlySet__.add("isSymmetricMultiThreadingEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IntelVmLaunchInstancePlatformConfig build() {
            IntelVmLaunchInstancePlatformConfig model =
                    new IntelVmLaunchInstancePlatformConfig(
                            this.isSecureBootEnabled,
                            this.isTrustedPlatformModuleEnabled,
                            this.isMeasuredBootEnabled,
                            this.isMemoryEncryptionEnabled,
                            this.isSymmetricMultiThreadingEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IntelVmLaunchInstancePlatformConfig model) {
            if (model.wasPropertyExplicitlySet("isSecureBootEnabled")) {
                this.isSecureBootEnabled(model.getIsSecureBootEnabled());
            }
            if (model.wasPropertyExplicitlySet("isTrustedPlatformModuleEnabled")) {
                this.isTrustedPlatformModuleEnabled(model.getIsTrustedPlatformModuleEnabled());
            }
            if (model.wasPropertyExplicitlySet("isMeasuredBootEnabled")) {
                this.isMeasuredBootEnabled(model.getIsMeasuredBootEnabled());
            }
            if (model.wasPropertyExplicitlySet("isMemoryEncryptionEnabled")) {
                this.isMemoryEncryptionEnabled(model.getIsMemoryEncryptionEnabled());
            }
            if (model.wasPropertyExplicitlySet("isSymmetricMultiThreadingEnabled")) {
                this.isSymmetricMultiThreadingEnabled(model.getIsSymmetricMultiThreadingEnabled());
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

    @Deprecated
    public IntelVmLaunchInstancePlatformConfig(
            Boolean isSecureBootEnabled,
            Boolean isTrustedPlatformModuleEnabled,
            Boolean isMeasuredBootEnabled,
            Boolean isMemoryEncryptionEnabled,
            Boolean isSymmetricMultiThreadingEnabled) {
        super(
                isSecureBootEnabled,
                isTrustedPlatformModuleEnabled,
                isMeasuredBootEnabled,
                isMemoryEncryptionEnabled);
        this.isSymmetricMultiThreadingEnabled = isSymmetricMultiThreadingEnabled;
    }

    /**
     * Whether symmetric multithreading is enabled on the instance. Symmetric multithreading is also
     * called simultaneous multithreading (SMT) or Intel Hyper-Threading.
     *
     * <p>Intel and AMD processors have two hardware execution threads per core (OCPU). SMT permits
     * multiple independent threads of execution, to better use the resources and increase the
     * efficiency of the CPU. When multithreading is disabled, only one thread is permitted to run
     * on each core, which can provide higher or more predictable performance for some workloads.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSymmetricMultiThreadingEnabled")
    private final Boolean isSymmetricMultiThreadingEnabled;

    /**
     * Whether symmetric multithreading is enabled on the instance. Symmetric multithreading is also
     * called simultaneous multithreading (SMT) or Intel Hyper-Threading.
     *
     * <p>Intel and AMD processors have two hardware execution threads per core (OCPU). SMT permits
     * multiple independent threads of execution, to better use the resources and increase the
     * efficiency of the CPU. When multithreading is disabled, only one thread is permitted to run
     * on each core, which can provide higher or more predictable performance for some workloads.
     *
     * @return the value
     */
    public Boolean getIsSymmetricMultiThreadingEnabled() {
        return isSymmetricMultiThreadingEnabled;
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
        sb.append("IntelVmLaunchInstancePlatformConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", isSymmetricMultiThreadingEnabled=")
                .append(String.valueOf(this.isSymmetricMultiThreadingEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IntelVmLaunchInstancePlatformConfig)) {
            return false;
        }

        IntelVmLaunchInstancePlatformConfig other = (IntelVmLaunchInstancePlatformConfig) o;
        return java.util.Objects.equals(
                        this.isSymmetricMultiThreadingEnabled,
                        other.isSymmetricMultiThreadingEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.isSymmetricMultiThreadingEnabled == null
                                ? 43
                                : this.isSymmetricMultiThreadingEnabled.hashCode());
        return result;
    }
}
