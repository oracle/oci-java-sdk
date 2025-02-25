/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Used for creating NFS backup destinations.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateNFSBackupDestinationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateNFSBackupDestinationDetails extends CreateBackupDestinationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * **Deprecated.** The local directory path on each VM cluster node where the NFS server location is mounted. The local directory path and the NFS server location must each be the same across all of the VM cluster nodes. Ensure that the NFS mount is maintained continuously on all of the VM cluster nodes.
         * This field is deprecated. Use the mountTypeDetails field instead to specify the mount type for NFS.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("localMountPointPath")
        private String localMountPointPath;

        /**
         * **Deprecated.** The local directory path on each VM cluster node where the NFS server location is mounted. The local directory path and the NFS server location must each be the same across all of the VM cluster nodes. Ensure that the NFS mount is maintained continuously on all of the VM cluster nodes.
         * This field is deprecated. Use the mountTypeDetails field instead to specify the mount type for NFS.
         *
         * @param localMountPointPath the value to set
         * @return this builder
         **/
        public Builder localMountPointPath(String localMountPointPath) {
            this.localMountPointPath = localMountPointPath;
            this.__explicitlySet__.add("localMountPointPath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mountTypeDetails")
        private MountTypeDetails mountTypeDetails;

        public Builder mountTypeDetails(MountTypeDetails mountTypeDetails) {
            this.mountTypeDetails = mountTypeDetails;
            this.__explicitlySet__.add("mountTypeDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateNFSBackupDestinationDetails build() {
            CreateNFSBackupDestinationDetails model =
                    new CreateNFSBackupDestinationDetails(
                            this.displayName,
                            this.compartmentId,
                            this.freeformTags,
                            this.definedTags,
                            this.localMountPointPath,
                            this.mountTypeDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateNFSBackupDestinationDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("localMountPointPath")) {
                this.localMountPointPath(model.getLocalMountPointPath());
            }
            if (model.wasPropertyExplicitlySet("mountTypeDetails")) {
                this.mountTypeDetails(model.getMountTypeDetails());
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

    @Deprecated
    public CreateNFSBackupDestinationDetails(
            String displayName,
            String compartmentId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String localMountPointPath,
            MountTypeDetails mountTypeDetails) {
        super(displayName, compartmentId, freeformTags, definedTags);
        this.localMountPointPath = localMountPointPath;
        this.mountTypeDetails = mountTypeDetails;
    }

    /**
     * **Deprecated.** The local directory path on each VM cluster node where the NFS server location is mounted. The local directory path and the NFS server location must each be the same across all of the VM cluster nodes. Ensure that the NFS mount is maintained continuously on all of the VM cluster nodes.
     * This field is deprecated. Use the mountTypeDetails field instead to specify the mount type for NFS.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("localMountPointPath")
    private final String localMountPointPath;

    /**
     * **Deprecated.** The local directory path on each VM cluster node where the NFS server location is mounted. The local directory path and the NFS server location must each be the same across all of the VM cluster nodes. Ensure that the NFS mount is maintained continuously on all of the VM cluster nodes.
     * This field is deprecated. Use the mountTypeDetails field instead to specify the mount type for NFS.
     *
     * @return the value
     **/
    public String getLocalMountPointPath() {
        return localMountPointPath;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("mountTypeDetails")
    private final MountTypeDetails mountTypeDetails;

    public MountTypeDetails getMountTypeDetails() {
        return mountTypeDetails;
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
        sb.append("CreateNFSBackupDestinationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", localMountPointPath=").append(String.valueOf(this.localMountPointPath));
        sb.append(", mountTypeDetails=").append(String.valueOf(this.mountTypeDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateNFSBackupDestinationDetails)) {
            return false;
        }

        CreateNFSBackupDestinationDetails other = (CreateNFSBackupDestinationDetails) o;
        return java.util.Objects.equals(this.localMountPointPath, other.localMountPointPath)
                && java.util.Objects.equals(this.mountTypeDetails, other.mountTypeDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.localMountPointPath == null
                                ? 43
                                : this.localMountPointPath.hashCode());
        result =
                (result * PRIME)
                        + (this.mountTypeDetails == null ? 43 : this.mountTypeDetails.hashCode());
        return result;
    }
}
