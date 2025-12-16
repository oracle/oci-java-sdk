/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.batch.model;

/**
 * A description of a NFS type of batch task environment volume. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20251031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = NfsVolume.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NfsVolume extends BatchTaskEnvironmentVolume {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the NfsVolume. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the NfsVolume.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The FQDN of the NFS server to connect to. */
        @com.fasterxml.jackson.annotation.JsonProperty("mountTargetFqdn")
        private String mountTargetFqdn;

        /**
         * The FQDN of the NFS server to connect to.
         *
         * @param mountTargetFqdn the value to set
         * @return this builder
         */
        public Builder mountTargetFqdn(String mountTargetFqdn) {
            this.mountTargetFqdn = mountTargetFqdn;
            this.__explicitlySet__.add("mountTargetFqdn");
            return this;
        }
        /** The path to the directory on the NFS server to be mounted. */
        @com.fasterxml.jackson.annotation.JsonProperty("mountTargetExportPath")
        private String mountTargetExportPath;

        /**
         * The path to the directory on the NFS server to be mounted.
         *
         * @param mountTargetExportPath the value to set
         * @return this builder
         */
        public Builder mountTargetExportPath(String mountTargetExportPath) {
            this.mountTargetExportPath = mountTargetExportPath;
            this.__explicitlySet__.add("mountTargetExportPath");
            return this;
        }
        /** The local path to mount the NFS share to. */
        @com.fasterxml.jackson.annotation.JsonProperty("localMountDirectoryPath")
        private String localMountDirectoryPath;

        /**
         * The local path to mount the NFS share to.
         *
         * @param localMountDirectoryPath the value to set
         * @return this builder
         */
        public Builder localMountDirectoryPath(String localMountDirectoryPath) {
            this.localMountDirectoryPath = localMountDirectoryPath;
            this.__explicitlySet__.add("localMountDirectoryPath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NfsVolume build() {
            NfsVolume model =
                    new NfsVolume(
                            this.name,
                            this.mountTargetFqdn,
                            this.mountTargetExportPath,
                            this.localMountDirectoryPath);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NfsVolume model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("mountTargetFqdn")) {
                this.mountTargetFqdn(model.getMountTargetFqdn());
            }
            if (model.wasPropertyExplicitlySet("mountTargetExportPath")) {
                this.mountTargetExportPath(model.getMountTargetExportPath());
            }
            if (model.wasPropertyExplicitlySet("localMountDirectoryPath")) {
                this.localMountDirectoryPath(model.getLocalMountDirectoryPath());
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
    public NfsVolume(
            String name,
            String mountTargetFqdn,
            String mountTargetExportPath,
            String localMountDirectoryPath) {
        super();
        this.name = name;
        this.mountTargetFqdn = mountTargetFqdn;
        this.mountTargetExportPath = mountTargetExportPath;
        this.localMountDirectoryPath = localMountDirectoryPath;
    }

    /** The name of the NfsVolume. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the NfsVolume.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The FQDN of the NFS server to connect to. */
    @com.fasterxml.jackson.annotation.JsonProperty("mountTargetFqdn")
    private final String mountTargetFqdn;

    /**
     * The FQDN of the NFS server to connect to.
     *
     * @return the value
     */
    public String getMountTargetFqdn() {
        return mountTargetFqdn;
    }

    /** The path to the directory on the NFS server to be mounted. */
    @com.fasterxml.jackson.annotation.JsonProperty("mountTargetExportPath")
    private final String mountTargetExportPath;

    /**
     * The path to the directory on the NFS server to be mounted.
     *
     * @return the value
     */
    public String getMountTargetExportPath() {
        return mountTargetExportPath;
    }

    /** The local path to mount the NFS share to. */
    @com.fasterxml.jackson.annotation.JsonProperty("localMountDirectoryPath")
    private final String localMountDirectoryPath;

    /**
     * The local path to mount the NFS share to.
     *
     * @return the value
     */
    public String getLocalMountDirectoryPath() {
        return localMountDirectoryPath;
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
        sb.append("NfsVolume(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", mountTargetFqdn=").append(String.valueOf(this.mountTargetFqdn));
        sb.append(", mountTargetExportPath=").append(String.valueOf(this.mountTargetExportPath));
        sb.append(", localMountDirectoryPath=")
                .append(String.valueOf(this.localMountDirectoryPath));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NfsVolume)) {
            return false;
        }

        NfsVolume other = (NfsVolume) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.mountTargetFqdn, other.mountTargetFqdn)
                && java.util.Objects.equals(this.mountTargetExportPath, other.mountTargetExportPath)
                && java.util.Objects.equals(
                        this.localMountDirectoryPath, other.localMountDirectoryPath)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.mountTargetFqdn == null ? 43 : this.mountTargetFqdn.hashCode());
        result =
                (result * PRIME)
                        + (this.mountTargetExportPath == null
                                ? 43
                                : this.mountTargetExportPath.hashCode());
        result =
                (result * PRIME)
                        + (this.localMountDirectoryPath == null
                                ? 43
                                : this.localMountDirectoryPath.hashCode());
        return result;
    }
}
