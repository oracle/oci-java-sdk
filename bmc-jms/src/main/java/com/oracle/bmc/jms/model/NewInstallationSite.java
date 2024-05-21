/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * The properties of a new Java installation site.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = NewInstallationSite.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NewInstallationSite extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "managedInstanceId",
        "releaseVersion",
        "artifactContentType",
        "installationPath",
        "headlessMode",
        "forceInstall"
    })
    public NewInstallationSite(
            String managedInstanceId,
            String releaseVersion,
            ArtifactContentType artifactContentType,
            String installationPath,
            Boolean headlessMode,
            Boolean forceInstall) {
        super();
        this.managedInstanceId = managedInstanceId;
        this.releaseVersion = releaseVersion;
        this.artifactContentType = artifactContentType;
        this.installationPath = installationPath;
        this.headlessMode = headlessMode;
        this.forceInstall = forceInstall;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the related managed instance.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
        private String managedInstanceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the related managed instance.
         *
         * @param managedInstanceId the value to set
         * @return this builder
         **/
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            this.__explicitlySet__.add("managedInstanceId");
            return this;
        }
        /**
         * The release version of the Java Runtime.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("releaseVersion")
        private String releaseVersion;

        /**
         * The release version of the Java Runtime.
         * @param releaseVersion the value to set
         * @return this builder
         **/
        public Builder releaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            this.__explicitlySet__.add("releaseVersion");
            return this;
        }
        /**
         * Artifact content type for the Java version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("artifactContentType")
        private ArtifactContentType artifactContentType;

        /**
         * Artifact content type for the Java version.
         * @param artifactContentType the value to set
         * @return this builder
         **/
        public Builder artifactContentType(ArtifactContentType artifactContentType) {
            this.artifactContentType = artifactContentType;
            this.__explicitlySet__.add("artifactContentType");
            return this;
        }
        /**
         * Custom path to install new Java installation site.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("installationPath")
        private String installationPath;

        /**
         * Custom path to install new Java installation site.
         * @param installationPath the value to set
         * @return this builder
         **/
        public Builder installationPath(String installationPath) {
            this.installationPath = installationPath;
            this.__explicitlySet__.add("installationPath");
            return this;
        }
        /**
         * Flag to install headless or headful Java installation. Only valid for Oracle Linux in OCI.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("headlessMode")
        private Boolean headlessMode;

        /**
         * Flag to install headless or headful Java installation. Only valid for Oracle Linux in OCI.
         * @param headlessMode the value to set
         * @return this builder
         **/
        public Builder headlessMode(Boolean headlessMode) {
            this.headlessMode = headlessMode;
            this.__explicitlySet__.add("headlessMode");
            return this;
        }
        /**
         * Forces the installation request even if a more recent release is already present in the host.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("forceInstall")
        private Boolean forceInstall;

        /**
         * Forces the installation request even if a more recent release is already present in the host.
         * @param forceInstall the value to set
         * @return this builder
         **/
        public Builder forceInstall(Boolean forceInstall) {
            this.forceInstall = forceInstall;
            this.__explicitlySet__.add("forceInstall");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NewInstallationSite build() {
            NewInstallationSite model =
                    new NewInstallationSite(
                            this.managedInstanceId,
                            this.releaseVersion,
                            this.artifactContentType,
                            this.installationPath,
                            this.headlessMode,
                            this.forceInstall);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NewInstallationSite model) {
            if (model.wasPropertyExplicitlySet("managedInstanceId")) {
                this.managedInstanceId(model.getManagedInstanceId());
            }
            if (model.wasPropertyExplicitlySet("releaseVersion")) {
                this.releaseVersion(model.getReleaseVersion());
            }
            if (model.wasPropertyExplicitlySet("artifactContentType")) {
                this.artifactContentType(model.getArtifactContentType());
            }
            if (model.wasPropertyExplicitlySet("installationPath")) {
                this.installationPath(model.getInstallationPath());
            }
            if (model.wasPropertyExplicitlySet("headlessMode")) {
                this.headlessMode(model.getHeadlessMode());
            }
            if (model.wasPropertyExplicitlySet("forceInstall")) {
                this.forceInstall(model.getForceInstall());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the related managed instance.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
    private final String managedInstanceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the related managed instance.
     *
     * @return the value
     **/
    public String getManagedInstanceId() {
        return managedInstanceId;
    }

    /**
     * The release version of the Java Runtime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("releaseVersion")
    private final String releaseVersion;

    /**
     * The release version of the Java Runtime.
     * @return the value
     **/
    public String getReleaseVersion() {
        return releaseVersion;
    }

    /**
     * Artifact content type for the Java version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("artifactContentType")
    private final ArtifactContentType artifactContentType;

    /**
     * Artifact content type for the Java version.
     * @return the value
     **/
    public ArtifactContentType getArtifactContentType() {
        return artifactContentType;
    }

    /**
     * Custom path to install new Java installation site.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("installationPath")
    private final String installationPath;

    /**
     * Custom path to install new Java installation site.
     * @return the value
     **/
    public String getInstallationPath() {
        return installationPath;
    }

    /**
     * Flag to install headless or headful Java installation. Only valid for Oracle Linux in OCI.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headlessMode")
    private final Boolean headlessMode;

    /**
     * Flag to install headless or headful Java installation. Only valid for Oracle Linux in OCI.
     * @return the value
     **/
    public Boolean getHeadlessMode() {
        return headlessMode;
    }

    /**
     * Forces the installation request even if a more recent release is already present in the host.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("forceInstall")
    private final Boolean forceInstall;

    /**
     * Forces the installation request even if a more recent release is already present in the host.
     * @return the value
     **/
    public Boolean getForceInstall() {
        return forceInstall;
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
        sb.append("NewInstallationSite(");
        sb.append("super=").append(super.toString());
        sb.append("managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(", releaseVersion=").append(String.valueOf(this.releaseVersion));
        sb.append(", artifactContentType=").append(String.valueOf(this.artifactContentType));
        sb.append(", installationPath=").append(String.valueOf(this.installationPath));
        sb.append(", headlessMode=").append(String.valueOf(this.headlessMode));
        sb.append(", forceInstall=").append(String.valueOf(this.forceInstall));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NewInstallationSite)) {
            return false;
        }

        NewInstallationSite other = (NewInstallationSite) o;
        return java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.releaseVersion, other.releaseVersion)
                && java.util.Objects.equals(this.artifactContentType, other.artifactContentType)
                && java.util.Objects.equals(this.installationPath, other.installationPath)
                && java.util.Objects.equals(this.headlessMode, other.headlessMode)
                && java.util.Objects.equals(this.forceInstall, other.forceInstall)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.releaseVersion == null ? 43 : this.releaseVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.artifactContentType == null
                                ? 43
                                : this.artifactContentType.hashCode());
        result =
                (result * PRIME)
                        + (this.installationPath == null ? 43 : this.installationPath.hashCode());
        result = (result * PRIME) + (this.headlessMode == null ? 43 : this.headlessMode.hashCode());
        result = (result * PRIME) + (this.forceInstall == null ? 43 : this.forceInstall.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
