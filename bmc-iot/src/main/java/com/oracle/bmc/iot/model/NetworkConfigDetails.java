/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.iot.model;

/**
 * Network access configuration for an IoT flow runtime.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = NetworkConfigDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class NetworkConfigDetails extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"subnetId", "networkSecurityGroupIds", "fileStorageMounts"})
    public NetworkConfigDetails(
            String subnetId,
            java.util.List<String> networkSecurityGroupIds,
            java.util.List<FileStorageMountDetails> fileStorageMounts) {
        super();
        this.subnetId = subnetId;
        this.networkSecurityGroupIds = networkSecurityGroupIds;
        this.fileStorageMounts = fileStorageMounts;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the subnet used by the IoT flow runtime.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The OCID of the subnet used by the IoT flow runtime.
         * @param subnetId the value to set
         * @return this builder
         **/
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /**
         * The OCIDs of the network security groups associated with the IoT flow runtime.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
        private java.util.List<String> networkSecurityGroupIds;

        /**
         * The OCIDs of the network security groups associated with the IoT flow runtime.
         * @param networkSecurityGroupIds the value to set
         * @return this builder
         **/
        public Builder networkSecurityGroupIds(java.util.List<String> networkSecurityGroupIds) {
            this.networkSecurityGroupIds = networkSecurityGroupIds;
            this.__explicitlySet__.add("networkSecurityGroupIds");
            return this;
        }
        /**
         * The File Storage mounts to attach to the IoT flow runtime. If specified, this list must contain from 1 to 5 items.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fileStorageMounts")
        private java.util.List<FileStorageMountDetails> fileStorageMounts;

        /**
         * The File Storage mounts to attach to the IoT flow runtime. If specified, this list must contain from 1 to 5 items.
         * @param fileStorageMounts the value to set
         * @return this builder
         **/
        public Builder fileStorageMounts(
                java.util.List<FileStorageMountDetails> fileStorageMounts) {
            this.fileStorageMounts = fileStorageMounts;
            this.__explicitlySet__.add("fileStorageMounts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NetworkConfigDetails build() {
            NetworkConfigDetails model =
                    new NetworkConfigDetails(
                            this.subnetId, this.networkSecurityGroupIds, this.fileStorageMounts);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NetworkConfigDetails model) {
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("networkSecurityGroupIds")) {
                this.networkSecurityGroupIds(model.getNetworkSecurityGroupIds());
            }
            if (model.wasPropertyExplicitlySet("fileStorageMounts")) {
                this.fileStorageMounts(model.getFileStorageMounts());
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
     * The OCID of the subnet used by the IoT flow runtime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The OCID of the subnet used by the IoT flow runtime.
     * @return the value
     **/
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * The OCIDs of the network security groups associated with the IoT flow runtime.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkSecurityGroupIds")
    private final java.util.List<String> networkSecurityGroupIds;

    /**
     * The OCIDs of the network security groups associated with the IoT flow runtime.
     * @return the value
     **/
    public java.util.List<String> getNetworkSecurityGroupIds() {
        return networkSecurityGroupIds;
    }

    /**
     * The File Storage mounts to attach to the IoT flow runtime. If specified, this list must contain from 1 to 5 items.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fileStorageMounts")
    private final java.util.List<FileStorageMountDetails> fileStorageMounts;

    /**
     * The File Storage mounts to attach to the IoT flow runtime. If specified, this list must contain from 1 to 5 items.
     * @return the value
     **/
    public java.util.List<FileStorageMountDetails> getFileStorageMounts() {
        return fileStorageMounts;
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
        sb.append("NetworkConfigDetails(");
        sb.append("super=").append(super.toString());
        sb.append("subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", networkSecurityGroupIds=")
                .append(String.valueOf(this.networkSecurityGroupIds));
        sb.append(", fileStorageMounts=").append(String.valueOf(this.fileStorageMounts));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NetworkConfigDetails)) {
            return false;
        }

        NetworkConfigDetails other = (NetworkConfigDetails) o;
        return java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(
                        this.networkSecurityGroupIds, other.networkSecurityGroupIds)
                && java.util.Objects.equals(this.fileStorageMounts, other.fileStorageMounts)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result =
                (result * PRIME)
                        + (this.networkSecurityGroupIds == null
                                ? 43
                                : this.networkSecurityGroupIds.hashCode());
        result =
                (result * PRIME)
                        + (this.fileStorageMounts == null ? 43 : this.fileStorageMounts.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
