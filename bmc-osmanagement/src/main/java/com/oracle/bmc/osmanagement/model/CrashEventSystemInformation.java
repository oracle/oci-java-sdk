/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Detailed information about system at the time of the crash. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CrashEventSystemInformation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CrashEventSystemInformation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "architecture",
        "kspliceEffectiveKernelVersion",
        "osFamily",
        "osName",
        "osKernelRelease",
        "osKernelVersion",
        "osSystemVersion"
    })
    public CrashEventSystemInformation(
            ArchTypes architecture,
            String kspliceEffectiveKernelVersion,
            OsFamilies osFamily,
            String osName,
            String osKernelRelease,
            String osKernelVersion,
            String osSystemVersion) {
        super();
        this.architecture = architecture;
        this.kspliceEffectiveKernelVersion = kspliceEffectiveKernelVersion;
        this.osFamily = osFamily;
        this.osName = osName;
        this.osKernelRelease = osKernelRelease;
        this.osKernelVersion = osKernelVersion;
        this.osSystemVersion = osSystemVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** system architecture */
        @com.fasterxml.jackson.annotation.JsonProperty("architecture")
        private ArchTypes architecture;

        /**
         * system architecture
         *
         * @param architecture the value to set
         * @return this builder
         */
        public Builder architecture(ArchTypes architecture) {
            this.architecture = architecture;
            this.__explicitlySet__.add("architecture");
            return this;
        }
        /** Active ksplice kernel version (uptrack-uname -r) */
        @com.fasterxml.jackson.annotation.JsonProperty("kspliceEffectiveKernelVersion")
        private String kspliceEffectiveKernelVersion;

        /**
         * Active ksplice kernel version (uptrack-uname -r)
         *
         * @param kspliceEffectiveKernelVersion the value to set
         * @return this builder
         */
        public Builder kspliceEffectiveKernelVersion(String kspliceEffectiveKernelVersion) {
            this.kspliceEffectiveKernelVersion = kspliceEffectiveKernelVersion;
            this.__explicitlySet__.add("kspliceEffectiveKernelVersion");
            return this;
        }
        /** The Operating System type of the managed instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private OsFamilies osFamily;

        /**
         * The Operating System type of the managed instance.
         *
         * @param osFamily the value to set
         * @return this builder
         */
        public Builder osFamily(OsFamilies osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
            return this;
        }
        /** Operating System Name (OCA value) */
        @com.fasterxml.jackson.annotation.JsonProperty("osName")
        private String osName;

        /**
         * Operating System Name (OCA value)
         *
         * @param osName the value to set
         * @return this builder
         */
        public Builder osName(String osName) {
            this.osName = osName;
            this.__explicitlySet__.add("osName");
            return this;
        }
        /** Operating System Kernel Release (uname -v) */
        @com.fasterxml.jackson.annotation.JsonProperty("osKernelRelease")
        private String osKernelRelease;

        /**
         * Operating System Kernel Release (uname -v)
         *
         * @param osKernelRelease the value to set
         * @return this builder
         */
        public Builder osKernelRelease(String osKernelRelease) {
            this.osKernelRelease = osKernelRelease;
            this.__explicitlySet__.add("osKernelRelease");
            return this;
        }
        /** Operating System Kernel Version (uname -r) */
        @com.fasterxml.jackson.annotation.JsonProperty("osKernelVersion")
        private String osKernelVersion;

        /**
         * Operating System Kernel Version (uname -r)
         *
         * @param osKernelVersion the value to set
         * @return this builder
         */
        public Builder osKernelVersion(String osKernelVersion) {
            this.osKernelVersion = osKernelVersion;
            this.__explicitlySet__.add("osKernelVersion");
            return this;
        }
        /** Version of the OS (VERSION from /etc/os-release) */
        @com.fasterxml.jackson.annotation.JsonProperty("osSystemVersion")
        private String osSystemVersion;

        /**
         * Version of the OS (VERSION from /etc/os-release)
         *
         * @param osSystemVersion the value to set
         * @return this builder
         */
        public Builder osSystemVersion(String osSystemVersion) {
            this.osSystemVersion = osSystemVersion;
            this.__explicitlySet__.add("osSystemVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CrashEventSystemInformation build() {
            CrashEventSystemInformation model =
                    new CrashEventSystemInformation(
                            this.architecture,
                            this.kspliceEffectiveKernelVersion,
                            this.osFamily,
                            this.osName,
                            this.osKernelRelease,
                            this.osKernelVersion,
                            this.osSystemVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CrashEventSystemInformation model) {
            if (model.wasPropertyExplicitlySet("architecture")) {
                this.architecture(model.getArchitecture());
            }
            if (model.wasPropertyExplicitlySet("kspliceEffectiveKernelVersion")) {
                this.kspliceEffectiveKernelVersion(model.getKspliceEffectiveKernelVersion());
            }
            if (model.wasPropertyExplicitlySet("osFamily")) {
                this.osFamily(model.getOsFamily());
            }
            if (model.wasPropertyExplicitlySet("osName")) {
                this.osName(model.getOsName());
            }
            if (model.wasPropertyExplicitlySet("osKernelRelease")) {
                this.osKernelRelease(model.getOsKernelRelease());
            }
            if (model.wasPropertyExplicitlySet("osKernelVersion")) {
                this.osKernelVersion(model.getOsKernelVersion());
            }
            if (model.wasPropertyExplicitlySet("osSystemVersion")) {
                this.osSystemVersion(model.getOsSystemVersion());
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

    /** system architecture */
    @com.fasterxml.jackson.annotation.JsonProperty("architecture")
    private final ArchTypes architecture;

    /**
     * system architecture
     *
     * @return the value
     */
    public ArchTypes getArchitecture() {
        return architecture;
    }

    /** Active ksplice kernel version (uptrack-uname -r) */
    @com.fasterxml.jackson.annotation.JsonProperty("kspliceEffectiveKernelVersion")
    private final String kspliceEffectiveKernelVersion;

    /**
     * Active ksplice kernel version (uptrack-uname -r)
     *
     * @return the value
     */
    public String getKspliceEffectiveKernelVersion() {
        return kspliceEffectiveKernelVersion;
    }

    /** The Operating System type of the managed instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    private final OsFamilies osFamily;

    /**
     * The Operating System type of the managed instance.
     *
     * @return the value
     */
    public OsFamilies getOsFamily() {
        return osFamily;
    }

    /** Operating System Name (OCA value) */
    @com.fasterxml.jackson.annotation.JsonProperty("osName")
    private final String osName;

    /**
     * Operating System Name (OCA value)
     *
     * @return the value
     */
    public String getOsName() {
        return osName;
    }

    /** Operating System Kernel Release (uname -v) */
    @com.fasterxml.jackson.annotation.JsonProperty("osKernelRelease")
    private final String osKernelRelease;

    /**
     * Operating System Kernel Release (uname -v)
     *
     * @return the value
     */
    public String getOsKernelRelease() {
        return osKernelRelease;
    }

    /** Operating System Kernel Version (uname -r) */
    @com.fasterxml.jackson.annotation.JsonProperty("osKernelVersion")
    private final String osKernelVersion;

    /**
     * Operating System Kernel Version (uname -r)
     *
     * @return the value
     */
    public String getOsKernelVersion() {
        return osKernelVersion;
    }

    /** Version of the OS (VERSION from /etc/os-release) */
    @com.fasterxml.jackson.annotation.JsonProperty("osSystemVersion")
    private final String osSystemVersion;

    /**
     * Version of the OS (VERSION from /etc/os-release)
     *
     * @return the value
     */
    public String getOsSystemVersion() {
        return osSystemVersion;
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
        sb.append("CrashEventSystemInformation(");
        sb.append("super=").append(super.toString());
        sb.append("architecture=").append(String.valueOf(this.architecture));
        sb.append(", kspliceEffectiveKernelVersion=")
                .append(String.valueOf(this.kspliceEffectiveKernelVersion));
        sb.append(", osFamily=").append(String.valueOf(this.osFamily));
        sb.append(", osName=").append(String.valueOf(this.osName));
        sb.append(", osKernelRelease=").append(String.valueOf(this.osKernelRelease));
        sb.append(", osKernelVersion=").append(String.valueOf(this.osKernelVersion));
        sb.append(", osSystemVersion=").append(String.valueOf(this.osSystemVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CrashEventSystemInformation)) {
            return false;
        }

        CrashEventSystemInformation other = (CrashEventSystemInformation) o;
        return java.util.Objects.equals(this.architecture, other.architecture)
                && java.util.Objects.equals(
                        this.kspliceEffectiveKernelVersion, other.kspliceEffectiveKernelVersion)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.osName, other.osName)
                && java.util.Objects.equals(this.osKernelRelease, other.osKernelRelease)
                && java.util.Objects.equals(this.osKernelVersion, other.osKernelVersion)
                && java.util.Objects.equals(this.osSystemVersion, other.osSystemVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.architecture == null ? 43 : this.architecture.hashCode());
        result =
                (result * PRIME)
                        + (this.kspliceEffectiveKernelVersion == null
                                ? 43
                                : this.kspliceEffectiveKernelVersion.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result = (result * PRIME) + (this.osName == null ? 43 : this.osName.hashCode());
        result =
                (result * PRIME)
                        + (this.osKernelRelease == null ? 43 : this.osKernelRelease.hashCode());
        result =
                (result * PRIME)
                        + (this.osKernelVersion == null ? 43 : this.osKernelVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.osSystemVersion == null ? 43 : this.osSystemVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
