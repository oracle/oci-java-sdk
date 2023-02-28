/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The information about added Cloud SQL capability <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CloudSqlDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CloudSqlDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "shape",
        "blockVolumeSizeInGBs",
        "isKerberosMappedToDatabaseUsers",
        "ipAddress",
        "kerberosDetails"
    })
    public CloudSqlDetails(
            String shape,
            Long blockVolumeSizeInGBs,
            Boolean isKerberosMappedToDatabaseUsers,
            String ipAddress,
            java.util.List<KerberosDetails> kerberosDetails) {
        super();
        this.shape = shape;
        this.blockVolumeSizeInGBs = blockVolumeSizeInGBs;
        this.isKerberosMappedToDatabaseUsers = isKerberosMappedToDatabaseUsers;
        this.ipAddress = ipAddress;
        this.kerberosDetails = kerberosDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Shape of the node */
        @com.fasterxml.jackson.annotation.JsonProperty("shape")
        private String shape;

        /**
         * Shape of the node
         *
         * @param shape the value to set
         * @return this builder
         */
        public Builder shape(String shape) {
            this.shape = shape;
            this.__explicitlySet__.add("shape");
            return this;
        }
        /**
         * The size of block volume in GB that needs to be attached to a given node. All the
         * necessary details needed for attachment are managed by service itself.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeSizeInGBs")
        private Long blockVolumeSizeInGBs;

        /**
         * The size of block volume in GB that needs to be attached to a given node. All the
         * necessary details needed for attachment are managed by service itself.
         *
         * @param blockVolumeSizeInGBs the value to set
         * @return this builder
         */
        public Builder blockVolumeSizeInGBs(Long blockVolumeSizeInGBs) {
            this.blockVolumeSizeInGBs = blockVolumeSizeInGBs;
            this.__explicitlySet__.add("blockVolumeSizeInGBs");
            return this;
        }
        /**
         * Boolean flag specifying whether or not Kerberos principals are mapped to database users.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isKerberosMappedToDatabaseUsers")
        private Boolean isKerberosMappedToDatabaseUsers;

        /**
         * Boolean flag specifying whether or not Kerberos principals are mapped to database users.
         *
         * @param isKerberosMappedToDatabaseUsers the value to set
         * @return this builder
         */
        public Builder isKerberosMappedToDatabaseUsers(Boolean isKerberosMappedToDatabaseUsers) {
            this.isKerberosMappedToDatabaseUsers = isKerberosMappedToDatabaseUsers;
            this.__explicitlySet__.add("isKerberosMappedToDatabaseUsers");
            return this;
        }
        /** IP address of the Cloud SQL node. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * IP address of the Cloud SQL node.
         *
         * @param ipAddress the value to set
         * @return this builder
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /** Details about the Kerberos principals. */
        @com.fasterxml.jackson.annotation.JsonProperty("kerberosDetails")
        private java.util.List<KerberosDetails> kerberosDetails;

        /**
         * Details about the Kerberos principals.
         *
         * @param kerberosDetails the value to set
         * @return this builder
         */
        public Builder kerberosDetails(java.util.List<KerberosDetails> kerberosDetails) {
            this.kerberosDetails = kerberosDetails;
            this.__explicitlySet__.add("kerberosDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CloudSqlDetails build() {
            CloudSqlDetails model =
                    new CloudSqlDetails(
                            this.shape,
                            this.blockVolumeSizeInGBs,
                            this.isKerberosMappedToDatabaseUsers,
                            this.ipAddress,
                            this.kerberosDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CloudSqlDetails model) {
            if (model.wasPropertyExplicitlySet("shape")) {
                this.shape(model.getShape());
            }
            if (model.wasPropertyExplicitlySet("blockVolumeSizeInGBs")) {
                this.blockVolumeSizeInGBs(model.getBlockVolumeSizeInGBs());
            }
            if (model.wasPropertyExplicitlySet("isKerberosMappedToDatabaseUsers")) {
                this.isKerberosMappedToDatabaseUsers(model.getIsKerberosMappedToDatabaseUsers());
            }
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("kerberosDetails")) {
                this.kerberosDetails(model.getKerberosDetails());
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

    /** Shape of the node */
    @com.fasterxml.jackson.annotation.JsonProperty("shape")
    private final String shape;

    /**
     * Shape of the node
     *
     * @return the value
     */
    public String getShape() {
        return shape;
    }

    /**
     * The size of block volume in GB that needs to be attached to a given node. All the necessary
     * details needed for attachment are managed by service itself.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("blockVolumeSizeInGBs")
    private final Long blockVolumeSizeInGBs;

    /**
     * The size of block volume in GB that needs to be attached to a given node. All the necessary
     * details needed for attachment are managed by service itself.
     *
     * @return the value
     */
    public Long getBlockVolumeSizeInGBs() {
        return blockVolumeSizeInGBs;
    }

    /** Boolean flag specifying whether or not Kerberos principals are mapped to database users. */
    @com.fasterxml.jackson.annotation.JsonProperty("isKerberosMappedToDatabaseUsers")
    private final Boolean isKerberosMappedToDatabaseUsers;

    /**
     * Boolean flag specifying whether or not Kerberos principals are mapped to database users.
     *
     * @return the value
     */
    public Boolean getIsKerberosMappedToDatabaseUsers() {
        return isKerberosMappedToDatabaseUsers;
    }

    /** IP address of the Cloud SQL node. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * IP address of the Cloud SQL node.
     *
     * @return the value
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /** Details about the Kerberos principals. */
    @com.fasterxml.jackson.annotation.JsonProperty("kerberosDetails")
    private final java.util.List<KerberosDetails> kerberosDetails;

    /**
     * Details about the Kerberos principals.
     *
     * @return the value
     */
    public java.util.List<KerberosDetails> getKerberosDetails() {
        return kerberosDetails;
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
        sb.append("CloudSqlDetails(");
        sb.append("super=").append(super.toString());
        sb.append("shape=").append(String.valueOf(this.shape));
        sb.append(", blockVolumeSizeInGBs=").append(String.valueOf(this.blockVolumeSizeInGBs));
        sb.append(", isKerberosMappedToDatabaseUsers=")
                .append(String.valueOf(this.isKerberosMappedToDatabaseUsers));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", kerberosDetails=").append(String.valueOf(this.kerberosDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CloudSqlDetails)) {
            return false;
        }

        CloudSqlDetails other = (CloudSqlDetails) o;
        return java.util.Objects.equals(this.shape, other.shape)
                && java.util.Objects.equals(this.blockVolumeSizeInGBs, other.blockVolumeSizeInGBs)
                && java.util.Objects.equals(
                        this.isKerberosMappedToDatabaseUsers, other.isKerberosMappedToDatabaseUsers)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.kerberosDetails, other.kerberosDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.shape == null ? 43 : this.shape.hashCode());
        result =
                (result * PRIME)
                        + (this.blockVolumeSizeInGBs == null
                                ? 43
                                : this.blockVolumeSizeInGBs.hashCode());
        result =
                (result * PRIME)
                        + (this.isKerberosMappedToDatabaseUsers == null
                                ? 43
                                : this.isKerberosMappedToDatabaseUsers.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result =
                (result * PRIME)
                        + (this.kerberosDetails == null ? 43 : this.kerberosDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
