/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.containerinstances.model;

/**
 * Define the mapping from volume to a mount path in container.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = VolumeMount.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class VolumeMount extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "mountPath",
        "volumeName",
        "subPath",
        "isReadOnly",
        "partition"
    })
    public VolumeMount(
            String mountPath,
            String volumeName,
            String subPath,
            Boolean isReadOnly,
            Integer partition) {
        super();
        this.mountPath = mountPath;
        this.volumeName = volumeName;
        this.subPath = subPath;
        this.isReadOnly = isReadOnly;
        this.partition = partition;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * mountPath describes the volume access path.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("mountPath")
        private String mountPath;

        /**
         * mountPath describes the volume access path.
         * @param mountPath the value to set
         * @return this builder
         **/
        public Builder mountPath(String mountPath) {
            this.mountPath = mountPath;
            this.__explicitlySet__.add("mountPath");
            return this;
        }
        /**
         * The name of the volume.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("volumeName")
        private String volumeName;

        /**
         * The name of the volume.
         * @param volumeName the value to set
         * @return this builder
         **/
        public Builder volumeName(String volumeName) {
            this.volumeName = volumeName;
            this.__explicitlySet__.add("volumeName");
            return this;
        }
        /**
         * specifies a sub-path inside the referenced volume instead of its root
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subPath")
        private String subPath;

        /**
         * specifies a sub-path inside the referenced volume instead of its root
         * @param subPath the value to set
         * @return this builder
         **/
        public Builder subPath(String subPath) {
            this.subPath = subPath;
            this.__explicitlySet__.add("subPath");
            return this;
        }
        /**
         * Whether the volume was mounted in read-only mode. Defaults to false if not specified.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isReadOnly")
        private Boolean isReadOnly;

        /**
         * Whether the volume was mounted in read-only mode. Defaults to false if not specified.
         * @param isReadOnly the value to set
         * @return this builder
         **/
        public Builder isReadOnly(Boolean isReadOnly) {
            this.isReadOnly = isReadOnly;
            this.__explicitlySet__.add("isReadOnly");
            return this;
        }
        /**
         * If there is more than 1 partitions in the volume, this is the number of partition which be referenced.
         * Here is a example:
         * Number  Start   End     Size    File system  Name                  Flags
         *  1      1049kB  106MB   105MB   fat16        EFI System Partition  boot, esp
         *  2      106MB   1180MB  1074MB  xfs
         *  3      1180MB  50.0GB  48.8GB                                     lvm
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("partition")
        private Integer partition;

        /**
         * If there is more than 1 partitions in the volume, this is the number of partition which be referenced.
         * Here is a example:
         * Number  Start   End     Size    File system  Name                  Flags
         *  1      1049kB  106MB   105MB   fat16        EFI System Partition  boot, esp
         *  2      106MB   1180MB  1074MB  xfs
         *  3      1180MB  50.0GB  48.8GB                                     lvm
         *
         * @param partition the value to set
         * @return this builder
         **/
        public Builder partition(Integer partition) {
            this.partition = partition;
            this.__explicitlySet__.add("partition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public VolumeMount build() {
            VolumeMount model =
                    new VolumeMount(
                            this.mountPath,
                            this.volumeName,
                            this.subPath,
                            this.isReadOnly,
                            this.partition);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(VolumeMount model) {
            if (model.wasPropertyExplicitlySet("mountPath")) {
                this.mountPath(model.getMountPath());
            }
            if (model.wasPropertyExplicitlySet("volumeName")) {
                this.volumeName(model.getVolumeName());
            }
            if (model.wasPropertyExplicitlySet("subPath")) {
                this.subPath(model.getSubPath());
            }
            if (model.wasPropertyExplicitlySet("isReadOnly")) {
                this.isReadOnly(model.getIsReadOnly());
            }
            if (model.wasPropertyExplicitlySet("partition")) {
                this.partition(model.getPartition());
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
     * mountPath describes the volume access path.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mountPath")
    private final String mountPath;

    /**
     * mountPath describes the volume access path.
     * @return the value
     **/
    public String getMountPath() {
        return mountPath;
    }

    /**
     * The name of the volume.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volumeName")
    private final String volumeName;

    /**
     * The name of the volume.
     * @return the value
     **/
    public String getVolumeName() {
        return volumeName;
    }

    /**
     * specifies a sub-path inside the referenced volume instead of its root
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subPath")
    private final String subPath;

    /**
     * specifies a sub-path inside the referenced volume instead of its root
     * @return the value
     **/
    public String getSubPath() {
        return subPath;
    }

    /**
     * Whether the volume was mounted in read-only mode. Defaults to false if not specified.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isReadOnly")
    private final Boolean isReadOnly;

    /**
     * Whether the volume was mounted in read-only mode. Defaults to false if not specified.
     * @return the value
     **/
    public Boolean getIsReadOnly() {
        return isReadOnly;
    }

    /**
     * If there is more than 1 partitions in the volume, this is the number of partition which be referenced.
     * Here is a example:
     * Number  Start   End     Size    File system  Name                  Flags
     *  1      1049kB  106MB   105MB   fat16        EFI System Partition  boot, esp
     *  2      106MB   1180MB  1074MB  xfs
     *  3      1180MB  50.0GB  48.8GB                                     lvm
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partition")
    private final Integer partition;

    /**
     * If there is more than 1 partitions in the volume, this is the number of partition which be referenced.
     * Here is a example:
     * Number  Start   End     Size    File system  Name                  Flags
     *  1      1049kB  106MB   105MB   fat16        EFI System Partition  boot, esp
     *  2      106MB   1180MB  1074MB  xfs
     *  3      1180MB  50.0GB  48.8GB                                     lvm
     *
     * @return the value
     **/
    public Integer getPartition() {
        return partition;
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
        sb.append("VolumeMount(");
        sb.append("super=").append(super.toString());
        sb.append("mountPath=").append(String.valueOf(this.mountPath));
        sb.append(", volumeName=").append(String.valueOf(this.volumeName));
        sb.append(", subPath=").append(String.valueOf(this.subPath));
        sb.append(", isReadOnly=").append(String.valueOf(this.isReadOnly));
        sb.append(", partition=").append(String.valueOf(this.partition));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof VolumeMount)) {
            return false;
        }

        VolumeMount other = (VolumeMount) o;
        return java.util.Objects.equals(this.mountPath, other.mountPath)
                && java.util.Objects.equals(this.volumeName, other.volumeName)
                && java.util.Objects.equals(this.subPath, other.subPath)
                && java.util.Objects.equals(this.isReadOnly, other.isReadOnly)
                && java.util.Objects.equals(this.partition, other.partition)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.mountPath == null ? 43 : this.mountPath.hashCode());
        result = (result * PRIME) + (this.volumeName == null ? 43 : this.volumeName.hashCode());
        result = (result * PRIME) + (this.subPath == null ? 43 : this.subPath.hashCode());
        result = (result * PRIME) + (this.isReadOnly == null ? 43 : this.isReadOnly.hashCode());
        result = (result * PRIME) + (this.partition == null ? 43 : this.partition.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
