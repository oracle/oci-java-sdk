/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The initialization parameters for an ASM instance.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExternalAsmInstanceParameters.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExternalAsmInstanceParameters
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "asmInstanceId",
        "asmInstanceDisplayName",
        "diskDiscoveryPath",
        "autoMountDiskGroups",
        "rebalancePower",
        "preferredReadFailureGroups"
    })
    public ExternalAsmInstanceParameters(
            String asmInstanceId,
            String asmInstanceDisplayName,
            String diskDiscoveryPath,
            java.util.List<String> autoMountDiskGroups,
            Integer rebalancePower,
            java.util.List<String> preferredReadFailureGroups) {
        super();
        this.asmInstanceId = asmInstanceId;
        this.asmInstanceDisplayName = asmInstanceDisplayName;
        this.diskDiscoveryPath = diskDiscoveryPath;
        this.autoMountDiskGroups = autoMountDiskGroups;
        this.rebalancePower = rebalancePower;
        this.preferredReadFailureGroups = preferredReadFailureGroups;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the external ASM instance.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("asmInstanceId")
        private String asmInstanceId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the external ASM instance.
         * @param asmInstanceId the value to set
         * @return this builder
         **/
        public Builder asmInstanceId(String asmInstanceId) {
            this.asmInstanceId = asmInstanceId;
            this.__explicitlySet__.add("asmInstanceId");
            return this;
        }
        /**
         * The user-friendly name for the ASM instance. The name does not have to be unique.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("asmInstanceDisplayName")
        private String asmInstanceDisplayName;

        /**
         * The user-friendly name for the ASM instance. The name does not have to be unique.
         * @param asmInstanceDisplayName the value to set
         * @return this builder
         **/
        public Builder asmInstanceDisplayName(String asmInstanceDisplayName) {
            this.asmInstanceDisplayName = asmInstanceDisplayName;
            this.__explicitlySet__.add("asmInstanceDisplayName");
            return this;
        }
        /**
         * An operating system-dependent value used to limit the set of disks considered for discovery.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("diskDiscoveryPath")
        private String diskDiscoveryPath;

        /**
         * An operating system-dependent value used to limit the set of disks considered for discovery.
         *
         * @param diskDiscoveryPath the value to set
         * @return this builder
         **/
        public Builder diskDiscoveryPath(String diskDiscoveryPath) {
            this.diskDiscoveryPath = diskDiscoveryPath;
            this.__explicitlySet__.add("diskDiscoveryPath");
            return this;
        }
        /**
         * The list of disk group names that an ASM instance mounts at startup or when the {@code ALTER DISKGROUP ALL MOUNT} statement is issued.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("autoMountDiskGroups")
        private java.util.List<String> autoMountDiskGroups;

        /**
         * The list of disk group names that an ASM instance mounts at startup or when the {@code ALTER DISKGROUP ALL MOUNT} statement is issued.
         *
         * @param autoMountDiskGroups the value to set
         * @return this builder
         **/
        public Builder autoMountDiskGroups(java.util.List<String> autoMountDiskGroups) {
            this.autoMountDiskGroups = autoMountDiskGroups;
            this.__explicitlySet__.add("autoMountDiskGroups");
            return this;
        }
        /**
         * The maximum power on an ASM instance for disk rebalancing.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rebalancePower")
        private Integer rebalancePower;

        /**
         * The maximum power on an ASM instance for disk rebalancing.
         *
         * @param rebalancePower the value to set
         * @return this builder
         **/
        public Builder rebalancePower(Integer rebalancePower) {
            this.rebalancePower = rebalancePower;
            this.__explicitlySet__.add("rebalancePower");
            return this;
        }
        /**
         * The list of failure groups that contain preferred read disks.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("preferredReadFailureGroups")
        private java.util.List<String> preferredReadFailureGroups;

        /**
         * The list of failure groups that contain preferred read disks.
         * @param preferredReadFailureGroups the value to set
         * @return this builder
         **/
        public Builder preferredReadFailureGroups(
                java.util.List<String> preferredReadFailureGroups) {
            this.preferredReadFailureGroups = preferredReadFailureGroups;
            this.__explicitlySet__.add("preferredReadFailureGroups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalAsmInstanceParameters build() {
            ExternalAsmInstanceParameters model =
                    new ExternalAsmInstanceParameters(
                            this.asmInstanceId,
                            this.asmInstanceDisplayName,
                            this.diskDiscoveryPath,
                            this.autoMountDiskGroups,
                            this.rebalancePower,
                            this.preferredReadFailureGroups);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalAsmInstanceParameters model) {
            if (model.wasPropertyExplicitlySet("asmInstanceId")) {
                this.asmInstanceId(model.getAsmInstanceId());
            }
            if (model.wasPropertyExplicitlySet("asmInstanceDisplayName")) {
                this.asmInstanceDisplayName(model.getAsmInstanceDisplayName());
            }
            if (model.wasPropertyExplicitlySet("diskDiscoveryPath")) {
                this.diskDiscoveryPath(model.getDiskDiscoveryPath());
            }
            if (model.wasPropertyExplicitlySet("autoMountDiskGroups")) {
                this.autoMountDiskGroups(model.getAutoMountDiskGroups());
            }
            if (model.wasPropertyExplicitlySet("rebalancePower")) {
                this.rebalancePower(model.getRebalancePower());
            }
            if (model.wasPropertyExplicitlySet("preferredReadFailureGroups")) {
                this.preferredReadFailureGroups(model.getPreferredReadFailureGroups());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the external ASM instance.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("asmInstanceId")
    private final String asmInstanceId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the external ASM instance.
     * @return the value
     **/
    public String getAsmInstanceId() {
        return asmInstanceId;
    }

    /**
     * The user-friendly name for the ASM instance. The name does not have to be unique.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("asmInstanceDisplayName")
    private final String asmInstanceDisplayName;

    /**
     * The user-friendly name for the ASM instance. The name does not have to be unique.
     * @return the value
     **/
    public String getAsmInstanceDisplayName() {
        return asmInstanceDisplayName;
    }

    /**
     * An operating system-dependent value used to limit the set of disks considered for discovery.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("diskDiscoveryPath")
    private final String diskDiscoveryPath;

    /**
     * An operating system-dependent value used to limit the set of disks considered for discovery.
     *
     * @return the value
     **/
    public String getDiskDiscoveryPath() {
        return diskDiscoveryPath;
    }

    /**
     * The list of disk group names that an ASM instance mounts at startup or when the {@code ALTER DISKGROUP ALL MOUNT} statement is issued.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("autoMountDiskGroups")
    private final java.util.List<String> autoMountDiskGroups;

    /**
     * The list of disk group names that an ASM instance mounts at startup or when the {@code ALTER DISKGROUP ALL MOUNT} statement is issued.
     *
     * @return the value
     **/
    public java.util.List<String> getAutoMountDiskGroups() {
        return autoMountDiskGroups;
    }

    /**
     * The maximum power on an ASM instance for disk rebalancing.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rebalancePower")
    private final Integer rebalancePower;

    /**
     * The maximum power on an ASM instance for disk rebalancing.
     *
     * @return the value
     **/
    public Integer getRebalancePower() {
        return rebalancePower;
    }

    /**
     * The list of failure groups that contain preferred read disks.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("preferredReadFailureGroups")
    private final java.util.List<String> preferredReadFailureGroups;

    /**
     * The list of failure groups that contain preferred read disks.
     * @return the value
     **/
    public java.util.List<String> getPreferredReadFailureGroups() {
        return preferredReadFailureGroups;
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
        sb.append("ExternalAsmInstanceParameters(");
        sb.append("super=").append(super.toString());
        sb.append("asmInstanceId=").append(String.valueOf(this.asmInstanceId));
        sb.append(", asmInstanceDisplayName=").append(String.valueOf(this.asmInstanceDisplayName));
        sb.append(", diskDiscoveryPath=").append(String.valueOf(this.diskDiscoveryPath));
        sb.append(", autoMountDiskGroups=").append(String.valueOf(this.autoMountDiskGroups));
        sb.append(", rebalancePower=").append(String.valueOf(this.rebalancePower));
        sb.append(", preferredReadFailureGroups=")
                .append(String.valueOf(this.preferredReadFailureGroups));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalAsmInstanceParameters)) {
            return false;
        }

        ExternalAsmInstanceParameters other = (ExternalAsmInstanceParameters) o;
        return java.util.Objects.equals(this.asmInstanceId, other.asmInstanceId)
                && java.util.Objects.equals(
                        this.asmInstanceDisplayName, other.asmInstanceDisplayName)
                && java.util.Objects.equals(this.diskDiscoveryPath, other.diskDiscoveryPath)
                && java.util.Objects.equals(this.autoMountDiskGroups, other.autoMountDiskGroups)
                && java.util.Objects.equals(this.rebalancePower, other.rebalancePower)
                && java.util.Objects.equals(
                        this.preferredReadFailureGroups, other.preferredReadFailureGroups)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.asmInstanceId == null ? 43 : this.asmInstanceId.hashCode());
        result =
                (result * PRIME)
                        + (this.asmInstanceDisplayName == null
                                ? 43
                                : this.asmInstanceDisplayName.hashCode());
        result =
                (result * PRIME)
                        + (this.diskDiscoveryPath == null ? 43 : this.diskDiscoveryPath.hashCode());
        result =
                (result * PRIME)
                        + (this.autoMountDiskGroups == null
                                ? 43
                                : this.autoMountDiskGroups.hashCode());
        result =
                (result * PRIME)
                        + (this.rebalancePower == null ? 43 : this.rebalancePower.hashCode());
        result =
                (result * PRIME)
                        + (this.preferredReadFailureGroups == null
                                ? 43
                                : this.preferredReadFailureGroups.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
