/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides information about the system architecture and operating system.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = SystemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SystemDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
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
    public SystemDetails(
            ArchType architecture,
            String kspliceEffectiveKernelVersion,
            OsFamily osFamily,
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
        /**
         * Architecture type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("architecture")
        private ArchType architecture;

        /**
         * Architecture type.
         * @param architecture the value to set
         * @return this builder
         **/
        public Builder architecture(ArchType architecture) {
            this.architecture = architecture;
            this.__explicitlySet__.add("architecture");
            return this;
        }
        /**
         * Version of the Ksplice effective kernel.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kspliceEffectiveKernelVersion")
        private String kspliceEffectiveKernelVersion;

        /**
         * Version of the Ksplice effective kernel.
         * @param kspliceEffectiveKernelVersion the value to set
         * @return this builder
         **/
        public Builder kspliceEffectiveKernelVersion(String kspliceEffectiveKernelVersion) {
            this.kspliceEffectiveKernelVersion = kspliceEffectiveKernelVersion;
            this.__explicitlySet__.add("kspliceEffectiveKernelVersion");
            return this;
        }
        /**
         * Operating system type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private OsFamily osFamily;

        /**
         * Operating system type.
         * @param osFamily the value to set
         * @return this builder
         **/
        public Builder osFamily(OsFamily osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
            return this;
        }
        /**
         * Name of the operating system.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osName")
        private String osName;

        /**
         * Name of the operating system.
         * @param osName the value to set
         * @return this builder
         **/
        public Builder osName(String osName) {
            this.osName = osName;
            this.__explicitlySet__.add("osName");
            return this;
        }
        /**
         * Release of the kernel.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osKernelRelease")
        private String osKernelRelease;

        /**
         * Release of the kernel.
         * @param osKernelRelease the value to set
         * @return this builder
         **/
        public Builder osKernelRelease(String osKernelRelease) {
            this.osKernelRelease = osKernelRelease;
            this.__explicitlySet__.add("osKernelRelease");
            return this;
        }
        /**
         * Version of the kernel.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osKernelVersion")
        private String osKernelVersion;

        /**
         * Version of the kernel.
         * @param osKernelVersion the value to set
         * @return this builder
         **/
        public Builder osKernelVersion(String osKernelVersion) {
            this.osKernelVersion = osKernelVersion;
            this.__explicitlySet__.add("osKernelVersion");
            return this;
        }
        /**
         * Version of the operating system.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("osSystemVersion")
        private String osSystemVersion;

        /**
         * Version of the operating system.
         * @param osSystemVersion the value to set
         * @return this builder
         **/
        public Builder osSystemVersion(String osSystemVersion) {
            this.osSystemVersion = osSystemVersion;
            this.__explicitlySet__.add("osSystemVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SystemDetails build() {
            SystemDetails model =
                    new SystemDetails(
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
        public Builder copy(SystemDetails model) {
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

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Architecture type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("architecture")
    private final ArchType architecture;

    /**
     * Architecture type.
     * @return the value
     **/
    public ArchType getArchitecture() {
        return architecture;
    }

    /**
     * Version of the Ksplice effective kernel.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kspliceEffectiveKernelVersion")
    private final String kspliceEffectiveKernelVersion;

    /**
     * Version of the Ksplice effective kernel.
     * @return the value
     **/
    public String getKspliceEffectiveKernelVersion() {
        return kspliceEffectiveKernelVersion;
    }

    /**
     * Operating system type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    private final OsFamily osFamily;

    /**
     * Operating system type.
     * @return the value
     **/
    public OsFamily getOsFamily() {
        return osFamily;
    }

    /**
     * Name of the operating system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osName")
    private final String osName;

    /**
     * Name of the operating system.
     * @return the value
     **/
    public String getOsName() {
        return osName;
    }

    /**
     * Release of the kernel.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osKernelRelease")
    private final String osKernelRelease;

    /**
     * Release of the kernel.
     * @return the value
     **/
    public String getOsKernelRelease() {
        return osKernelRelease;
    }

    /**
     * Version of the kernel.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osKernelVersion")
    private final String osKernelVersion;

    /**
     * Version of the kernel.
     * @return the value
     **/
    public String getOsKernelVersion() {
        return osKernelVersion;
    }

    /**
     * Version of the operating system.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("osSystemVersion")
    private final String osSystemVersion;

    /**
     * Version of the operating system.
     * @return the value
     **/
    public String getOsSystemVersion() {
        return osSystemVersion;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SystemDetails(");
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
        if (!(o instanceof SystemDetails)) {
            return false;
        }

        SystemDetails other = (SystemDetails) o;
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
