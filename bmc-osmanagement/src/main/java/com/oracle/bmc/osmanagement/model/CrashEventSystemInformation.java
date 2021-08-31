/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Detailed information about system at the time of the crash.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CrashEventSystemInformation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CrashEventSystemInformation {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("architecture")
        private ArchTypes architecture;

        public Builder architecture(ArchTypes architecture) {
            this.architecture = architecture;
            this.__explicitlySet__.add("architecture");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kspliceEffectiveKernelVersion")
        private String kspliceEffectiveKernelVersion;

        public Builder kspliceEffectiveKernelVersion(String kspliceEffectiveKernelVersion) {
            this.kspliceEffectiveKernelVersion = kspliceEffectiveKernelVersion;
            this.__explicitlySet__.add("kspliceEffectiveKernelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private OsFamilies osFamily;

        public Builder osFamily(OsFamilies osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("osName")
        private String osName;

        public Builder osName(String osName) {
            this.osName = osName;
            this.__explicitlySet__.add("osName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("osKernelRelease")
        private String osKernelRelease;

        public Builder osKernelRelease(String osKernelRelease) {
            this.osKernelRelease = osKernelRelease;
            this.__explicitlySet__.add("osKernelRelease");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("osKernelVersion")
        private String osKernelVersion;

        public Builder osKernelVersion(String osKernelVersion) {
            this.osKernelVersion = osKernelVersion;
            this.__explicitlySet__.add("osKernelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("osSystemVersion")
        private String osSystemVersion;

        public Builder osSystemVersion(String osSystemVersion) {
            this.osSystemVersion = osSystemVersion;
            this.__explicitlySet__.add("osSystemVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CrashEventSystemInformation build() {
            CrashEventSystemInformation __instance__ =
                    new CrashEventSystemInformation(
                            architecture,
                            kspliceEffectiveKernelVersion,
                            osFamily,
                            osName,
                            osKernelRelease,
                            osKernelVersion,
                            osSystemVersion);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CrashEventSystemInformation o) {
            Builder copiedBuilder =
                    architecture(o.getArchitecture())
                            .kspliceEffectiveKernelVersion(o.getKspliceEffectiveKernelVersion())
                            .osFamily(o.getOsFamily())
                            .osName(o.getOsName())
                            .osKernelRelease(o.getOsKernelRelease())
                            .osKernelVersion(o.getOsKernelVersion())
                            .osSystemVersion(o.getOsSystemVersion());

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
     * system architecture
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("architecture")
    ArchTypes architecture;

    /**
     * Active ksplice kernel version (uptrack-uname -r)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kspliceEffectiveKernelVersion")
    String kspliceEffectiveKernelVersion;

    /**
     * The Operating System type of the managed instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    OsFamilies osFamily;

    /**
     * Operating System Name (OCA value)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osName")
    String osName;

    /**
     * Operating System Kernel Release (uname -v)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osKernelRelease")
    String osKernelRelease;

    /**
     * Operating System Kernel Version (uname -r)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osKernelVersion")
    String osKernelVersion;

    /**
     * Version of the OS (VERSION from /etc/os-release)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osSystemVersion")
    String osSystemVersion;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
