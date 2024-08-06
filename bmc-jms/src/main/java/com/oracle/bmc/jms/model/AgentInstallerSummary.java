/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Supported agent installer downloads. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AgentInstallerSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AgentInstallerSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "agentInstallerId",
        "agentInstallerDescription",
        "approximateFileSizeInBytes",
        "sha256",
        "osFamily",
        "platformArchitecture",
        "packageType",
        "agentVersion",
        "javaVersion",
        "agentInstallerVersion"
    })
    public AgentInstallerSummary(
            Long agentInstallerId,
            String agentInstallerDescription,
            Long approximateFileSizeInBytes,
            String sha256,
            OsFamily osFamily,
            PlatformArchitectureType platformArchitecture,
            PackageType packageType,
            String agentVersion,
            String javaVersion,
            String agentInstallerVersion) {
        super();
        this.agentInstallerId = agentInstallerId;
        this.agentInstallerDescription = agentInstallerDescription;
        this.approximateFileSizeInBytes = approximateFileSizeInBytes;
        this.sha256 = sha256;
        this.osFamily = osFamily;
        this.platformArchitecture = platformArchitecture;
        this.packageType = packageType;
        this.agentVersion = agentVersion;
        this.javaVersion = javaVersion;
        this.agentInstallerVersion = agentInstallerVersion;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier for the agent installer. */
        @com.fasterxml.jackson.annotation.JsonProperty("agentInstallerId")
        private Long agentInstallerId;

        /**
         * Unique identifier for the agent installer.
         *
         * @param agentInstallerId the value to set
         * @return this builder
         */
        public Builder agentInstallerId(Long agentInstallerId) {
            this.agentInstallerId = agentInstallerId;
            this.__explicitlySet__.add("agentInstallerId");
            return this;
        }
        /**
         * Description of the agent installer artifact. The description typically includes the OS,
         * architecture, and agent installer type.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("agentInstallerDescription")
        private String agentInstallerDescription;

        /**
         * Description of the agent installer artifact. The description typically includes the OS,
         * architecture, and agent installer type.
         *
         * @param agentInstallerDescription the value to set
         * @return this builder
         */
        public Builder agentInstallerDescription(String agentInstallerDescription) {
            this.agentInstallerDescription = agentInstallerDescription;
            this.__explicitlySet__.add("agentInstallerDescription");
            return this;
        }
        /** Approximate compressed file size in bytes. */
        @com.fasterxml.jackson.annotation.JsonProperty("approximateFileSizeInBytes")
        private Long approximateFileSizeInBytes;

        /**
         * Approximate compressed file size in bytes.
         *
         * @param approximateFileSizeInBytes the value to set
         * @return this builder
         */
        public Builder approximateFileSizeInBytes(Long approximateFileSizeInBytes) {
            this.approximateFileSizeInBytes = approximateFileSizeInBytes;
            this.__explicitlySet__.add("approximateFileSizeInBytes");
            return this;
        }
        /** SHA256 checksum of the agent installer. */
        @com.fasterxml.jackson.annotation.JsonProperty("sha256")
        private String sha256;

        /**
         * SHA256 checksum of the agent installer.
         *
         * @param sha256 the value to set
         * @return this builder
         */
        public Builder sha256(String sha256) {
            this.sha256 = sha256;
            this.__explicitlySet__.add("sha256");
            return this;
        }
        /** The target operating system family for the agent installer. */
        @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
        private OsFamily osFamily;

        /**
         * The target operating system family for the agent installer.
         *
         * @param osFamily the value to set
         * @return this builder
         */
        public Builder osFamily(OsFamily osFamily) {
            this.osFamily = osFamily;
            this.__explicitlySet__.add("osFamily");
            return this;
        }
        /** The target operating system architecture for the installer. */
        @com.fasterxml.jackson.annotation.JsonProperty("platformArchitecture")
        private PlatformArchitectureType platformArchitecture;

        /**
         * The target operating system architecture for the installer.
         *
         * @param platformArchitecture the value to set
         * @return this builder
         */
        public Builder platformArchitecture(PlatformArchitectureType platformArchitecture) {
            this.platformArchitecture = platformArchitecture;
            this.__explicitlySet__.add("platformArchitecture");
            return this;
        }
        /**
         * The package type (typically the file extension) of the agent software included in the
         * installer.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("packageType")
        private PackageType packageType;

        /**
         * The package type (typically the file extension) of the agent software included in the
         * installer.
         *
         * @param packageType the value to set
         * @return this builder
         */
        public Builder packageType(PackageType packageType) {
            this.packageType = packageType;
            this.__explicitlySet__.add("packageType");
            return this;
        }
        /** Agent image version. */
        @com.fasterxml.jackson.annotation.JsonProperty("agentVersion")
        private String agentVersion;

        /**
         * Agent image version.
         *
         * @param agentVersion the value to set
         * @return this builder
         */
        public Builder agentVersion(String agentVersion) {
            this.agentVersion = agentVersion;
            this.__explicitlySet__.add("agentVersion");
            return this;
        }
        /** Java version. */
        @com.fasterxml.jackson.annotation.JsonProperty("javaVersion")
        private String javaVersion;

        /**
         * Java version.
         *
         * @param javaVersion the value to set
         * @return this builder
         */
        public Builder javaVersion(String javaVersion) {
            this.javaVersion = javaVersion;
            this.__explicitlySet__.add("javaVersion");
            return this;
        }
        /** Agent installer version. */
        @com.fasterxml.jackson.annotation.JsonProperty("agentInstallerVersion")
        private String agentInstallerVersion;

        /**
         * Agent installer version.
         *
         * @param agentInstallerVersion the value to set
         * @return this builder
         */
        public Builder agentInstallerVersion(String agentInstallerVersion) {
            this.agentInstallerVersion = agentInstallerVersion;
            this.__explicitlySet__.add("agentInstallerVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AgentInstallerSummary build() {
            AgentInstallerSummary model =
                    new AgentInstallerSummary(
                            this.agentInstallerId,
                            this.agentInstallerDescription,
                            this.approximateFileSizeInBytes,
                            this.sha256,
                            this.osFamily,
                            this.platformArchitecture,
                            this.packageType,
                            this.agentVersion,
                            this.javaVersion,
                            this.agentInstallerVersion);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AgentInstallerSummary model) {
            if (model.wasPropertyExplicitlySet("agentInstallerId")) {
                this.agentInstallerId(model.getAgentInstallerId());
            }
            if (model.wasPropertyExplicitlySet("agentInstallerDescription")) {
                this.agentInstallerDescription(model.getAgentInstallerDescription());
            }
            if (model.wasPropertyExplicitlySet("approximateFileSizeInBytes")) {
                this.approximateFileSizeInBytes(model.getApproximateFileSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("sha256")) {
                this.sha256(model.getSha256());
            }
            if (model.wasPropertyExplicitlySet("osFamily")) {
                this.osFamily(model.getOsFamily());
            }
            if (model.wasPropertyExplicitlySet("platformArchitecture")) {
                this.platformArchitecture(model.getPlatformArchitecture());
            }
            if (model.wasPropertyExplicitlySet("packageType")) {
                this.packageType(model.getPackageType());
            }
            if (model.wasPropertyExplicitlySet("agentVersion")) {
                this.agentVersion(model.getAgentVersion());
            }
            if (model.wasPropertyExplicitlySet("javaVersion")) {
                this.javaVersion(model.getJavaVersion());
            }
            if (model.wasPropertyExplicitlySet("agentInstallerVersion")) {
                this.agentInstallerVersion(model.getAgentInstallerVersion());
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

    /** Unique identifier for the agent installer. */
    @com.fasterxml.jackson.annotation.JsonProperty("agentInstallerId")
    private final Long agentInstallerId;

    /**
     * Unique identifier for the agent installer.
     *
     * @return the value
     */
    public Long getAgentInstallerId() {
        return agentInstallerId;
    }

    /**
     * Description of the agent installer artifact. The description typically includes the OS,
     * architecture, and agent installer type.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("agentInstallerDescription")
    private final String agentInstallerDescription;

    /**
     * Description of the agent installer artifact. The description typically includes the OS,
     * architecture, and agent installer type.
     *
     * @return the value
     */
    public String getAgentInstallerDescription() {
        return agentInstallerDescription;
    }

    /** Approximate compressed file size in bytes. */
    @com.fasterxml.jackson.annotation.JsonProperty("approximateFileSizeInBytes")
    private final Long approximateFileSizeInBytes;

    /**
     * Approximate compressed file size in bytes.
     *
     * @return the value
     */
    public Long getApproximateFileSizeInBytes() {
        return approximateFileSizeInBytes;
    }

    /** SHA256 checksum of the agent installer. */
    @com.fasterxml.jackson.annotation.JsonProperty("sha256")
    private final String sha256;

    /**
     * SHA256 checksum of the agent installer.
     *
     * @return the value
     */
    public String getSha256() {
        return sha256;
    }

    /** The target operating system family for the agent installer. */
    @com.fasterxml.jackson.annotation.JsonProperty("osFamily")
    private final OsFamily osFamily;

    /**
     * The target operating system family for the agent installer.
     *
     * @return the value
     */
    public OsFamily getOsFamily() {
        return osFamily;
    }

    /** The target operating system architecture for the installer. */
    @com.fasterxml.jackson.annotation.JsonProperty("platformArchitecture")
    private final PlatformArchitectureType platformArchitecture;

    /**
     * The target operating system architecture for the installer.
     *
     * @return the value
     */
    public PlatformArchitectureType getPlatformArchitecture() {
        return platformArchitecture;
    }

    /**
     * The package type (typically the file extension) of the agent software included in the
     * installer.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("packageType")
    private final PackageType packageType;

    /**
     * The package type (typically the file extension) of the agent software included in the
     * installer.
     *
     * @return the value
     */
    public PackageType getPackageType() {
        return packageType;
    }

    /** Agent image version. */
    @com.fasterxml.jackson.annotation.JsonProperty("agentVersion")
    private final String agentVersion;

    /**
     * Agent image version.
     *
     * @return the value
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    /** Java version. */
    @com.fasterxml.jackson.annotation.JsonProperty("javaVersion")
    private final String javaVersion;

    /**
     * Java version.
     *
     * @return the value
     */
    public String getJavaVersion() {
        return javaVersion;
    }

    /** Agent installer version. */
    @com.fasterxml.jackson.annotation.JsonProperty("agentInstallerVersion")
    private final String agentInstallerVersion;

    /**
     * Agent installer version.
     *
     * @return the value
     */
    public String getAgentInstallerVersion() {
        return agentInstallerVersion;
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
        sb.append("AgentInstallerSummary(");
        sb.append("super=").append(super.toString());
        sb.append("agentInstallerId=").append(String.valueOf(this.agentInstallerId));
        sb.append(", agentInstallerDescription=")
                .append(String.valueOf(this.agentInstallerDescription));
        sb.append(", approximateFileSizeInBytes=")
                .append(String.valueOf(this.approximateFileSizeInBytes));
        sb.append(", sha256=").append(String.valueOf(this.sha256));
        sb.append(", osFamily=").append(String.valueOf(this.osFamily));
        sb.append(", platformArchitecture=").append(String.valueOf(this.platformArchitecture));
        sb.append(", packageType=").append(String.valueOf(this.packageType));
        sb.append(", agentVersion=").append(String.valueOf(this.agentVersion));
        sb.append(", javaVersion=").append(String.valueOf(this.javaVersion));
        sb.append(", agentInstallerVersion=").append(String.valueOf(this.agentInstallerVersion));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AgentInstallerSummary)) {
            return false;
        }

        AgentInstallerSummary other = (AgentInstallerSummary) o;
        return java.util.Objects.equals(this.agentInstallerId, other.agentInstallerId)
                && java.util.Objects.equals(
                        this.agentInstallerDescription, other.agentInstallerDescription)
                && java.util.Objects.equals(
                        this.approximateFileSizeInBytes, other.approximateFileSizeInBytes)
                && java.util.Objects.equals(this.sha256, other.sha256)
                && java.util.Objects.equals(this.osFamily, other.osFamily)
                && java.util.Objects.equals(this.platformArchitecture, other.platformArchitecture)
                && java.util.Objects.equals(this.packageType, other.packageType)
                && java.util.Objects.equals(this.agentVersion, other.agentVersion)
                && java.util.Objects.equals(this.javaVersion, other.javaVersion)
                && java.util.Objects.equals(this.agentInstallerVersion, other.agentInstallerVersion)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.agentInstallerId == null ? 43 : this.agentInstallerId.hashCode());
        result =
                (result * PRIME)
                        + (this.agentInstallerDescription == null
                                ? 43
                                : this.agentInstallerDescription.hashCode());
        result =
                (result * PRIME)
                        + (this.approximateFileSizeInBytes == null
                                ? 43
                                : this.approximateFileSizeInBytes.hashCode());
        result = (result * PRIME) + (this.sha256 == null ? 43 : this.sha256.hashCode());
        result = (result * PRIME) + (this.osFamily == null ? 43 : this.osFamily.hashCode());
        result =
                (result * PRIME)
                        + (this.platformArchitecture == null
                                ? 43
                                : this.platformArchitecture.hashCode());
        result = (result * PRIME) + (this.packageType == null ? 43 : this.packageType.hashCode());
        result = (result * PRIME) + (this.agentVersion == null ? 43 : this.agentVersion.hashCode());
        result = (result * PRIME) + (this.javaVersion == null ? 43 : this.javaVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.agentInstallerVersion == null
                                ? 43
                                : this.agentInstallerVersion.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
