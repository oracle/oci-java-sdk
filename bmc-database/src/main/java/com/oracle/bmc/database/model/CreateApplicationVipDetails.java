/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details to create an application virtual IP (VIP) address on a cloud VM cluster. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateApplicationVipDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateApplicationVipDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "hostnameLabel",
        "dbNodeId",
        "cloudVmClusterId",
        "subnetId",
        "ipAddress",
        "ipv6Address"
    })
    public CreateApplicationVipDetails(
            String hostnameLabel,
            String dbNodeId,
            String cloudVmClusterId,
            String subnetId,
            String ipAddress,
            String ipv6Address) {
        super();
        this.hostnameLabel = hostnameLabel;
        this.dbNodeId = dbNodeId;
        this.cloudVmClusterId = cloudVmClusterId;
        this.subnetId = subnetId;
        this.ipAddress = ipAddress;
        this.ipv6Address = ipv6Address;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The hostname of the application virtual IP (VIP) address. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
        private String hostnameLabel;

        /**
         * The hostname of the application virtual IP (VIP) address.
         *
         * @param hostnameLabel the value to set
         * @return this builder
         */
        public Builder hostnameLabel(String hostnameLabel) {
            this.hostnameLabel = hostnameLabel;
            this.__explicitlySet__.add("hostnameLabel");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * DB node associated with the application virtual IP (VIP) address.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbNodeId")
        private String dbNodeId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * DB node associated with the application virtual IP (VIP) address.
         *
         * @param dbNodeId the value to set
         * @return this builder
         */
        public Builder dbNodeId(String dbNodeId) {
            this.dbNodeId = dbNodeId;
            this.__explicitlySet__.add("dbNodeId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud VM cluster associated with the application virtual IP (VIP) address.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cloudVmClusterId")
        private String cloudVmClusterId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * cloud VM cluster associated with the application virtual IP (VIP) address.
         *
         * @param cloudVmClusterId the value to set
         * @return this builder
         */
        public Builder cloudVmClusterId(String cloudVmClusterId) {
            this.cloudVmClusterId = cloudVmClusterId;
            this.__explicitlySet__.add("cloudVmClusterId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet associated with the application virtual IP (VIP) address.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
        private String subnetId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subnet associated with the application virtual IP (VIP) address.
         *
         * @param subnetId the value to set
         * @return this builder
         */
        public Builder subnetId(String subnetId) {
            this.subnetId = subnetId;
            this.__explicitlySet__.add("subnetId");
            return this;
        }
        /** The application virtual IP (VIP) IPv4 address. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
        private String ipAddress;

        /**
         * The application virtual IP (VIP) IPv4 address.
         *
         * @param ipAddress the value to set
         * @return this builder
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            this.__explicitlySet__.add("ipAddress");
            return this;
        }
        /** The application virtual IP (VIP) IPv6 address. */
        @com.fasterxml.jackson.annotation.JsonProperty("ipv6Address")
        private String ipv6Address;

        /**
         * The application virtual IP (VIP) IPv6 address.
         *
         * @param ipv6Address the value to set
         * @return this builder
         */
        public Builder ipv6Address(String ipv6Address) {
            this.ipv6Address = ipv6Address;
            this.__explicitlySet__.add("ipv6Address");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateApplicationVipDetails build() {
            CreateApplicationVipDetails model =
                    new CreateApplicationVipDetails(
                            this.hostnameLabel,
                            this.dbNodeId,
                            this.cloudVmClusterId,
                            this.subnetId,
                            this.ipAddress,
                            this.ipv6Address);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateApplicationVipDetails model) {
            if (model.wasPropertyExplicitlySet("hostnameLabel")) {
                this.hostnameLabel(model.getHostnameLabel());
            }
            if (model.wasPropertyExplicitlySet("dbNodeId")) {
                this.dbNodeId(model.getDbNodeId());
            }
            if (model.wasPropertyExplicitlySet("cloudVmClusterId")) {
                this.cloudVmClusterId(model.getCloudVmClusterId());
            }
            if (model.wasPropertyExplicitlySet("subnetId")) {
                this.subnetId(model.getSubnetId());
            }
            if (model.wasPropertyExplicitlySet("ipAddress")) {
                this.ipAddress(model.getIpAddress());
            }
            if (model.wasPropertyExplicitlySet("ipv6Address")) {
                this.ipv6Address(model.getIpv6Address());
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

    /** The hostname of the application virtual IP (VIP) address. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostnameLabel")
    private final String hostnameLabel;

    /**
     * The hostname of the application virtual IP (VIP) address.
     *
     * @return the value
     */
    public String getHostnameLabel() {
        return hostnameLabel;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DB
     * node associated with the application virtual IP (VIP) address.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbNodeId")
    private final String dbNodeId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the DB
     * node associated with the application virtual IP (VIP) address.
     *
     * @return the value
     */
    public String getDbNodeId() {
        return dbNodeId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud VM cluster associated with the application virtual IP (VIP) address.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cloudVmClusterId")
    private final String cloudVmClusterId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * cloud VM cluster associated with the application virtual IP (VIP) address.
     *
     * @return the value
     */
    public String getCloudVmClusterId() {
        return cloudVmClusterId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet associated with the application virtual IP (VIP) address.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subnetId")
    private final String subnetId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subnet associated with the application virtual IP (VIP) address.
     *
     * @return the value
     */
    public String getSubnetId() {
        return subnetId;
    }

    /** The application virtual IP (VIP) IPv4 address. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipAddress")
    private final String ipAddress;

    /**
     * The application virtual IP (VIP) IPv4 address.
     *
     * @return the value
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /** The application virtual IP (VIP) IPv6 address. */
    @com.fasterxml.jackson.annotation.JsonProperty("ipv6Address")
    private final String ipv6Address;

    /**
     * The application virtual IP (VIP) IPv6 address.
     *
     * @return the value
     */
    public String getIpv6Address() {
        return ipv6Address;
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
        sb.append("CreateApplicationVipDetails(");
        sb.append("super=").append(super.toString());
        sb.append("hostnameLabel=").append(String.valueOf(this.hostnameLabel));
        sb.append(", dbNodeId=").append(String.valueOf(this.dbNodeId));
        sb.append(", cloudVmClusterId=").append(String.valueOf(this.cloudVmClusterId));
        sb.append(", subnetId=").append(String.valueOf(this.subnetId));
        sb.append(", ipAddress=").append(String.valueOf(this.ipAddress));
        sb.append(", ipv6Address=").append(String.valueOf(this.ipv6Address));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateApplicationVipDetails)) {
            return false;
        }

        CreateApplicationVipDetails other = (CreateApplicationVipDetails) o;
        return java.util.Objects.equals(this.hostnameLabel, other.hostnameLabel)
                && java.util.Objects.equals(this.dbNodeId, other.dbNodeId)
                && java.util.Objects.equals(this.cloudVmClusterId, other.cloudVmClusterId)
                && java.util.Objects.equals(this.subnetId, other.subnetId)
                && java.util.Objects.equals(this.ipAddress, other.ipAddress)
                && java.util.Objects.equals(this.ipv6Address, other.ipv6Address)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.hostnameLabel == null ? 43 : this.hostnameLabel.hashCode());
        result = (result * PRIME) + (this.dbNodeId == null ? 43 : this.dbNodeId.hashCode());
        result =
                (result * PRIME)
                        + (this.cloudVmClusterId == null ? 43 : this.cloudVmClusterId.hashCode());
        result = (result * PRIME) + (this.subnetId == null ? 43 : this.subnetId.hashCode());
        result = (result * PRIME) + (this.ipAddress == null ? 43 : this.ipAddress.hashCode());
        result = (result * PRIME) + (this.ipv6Address == null ? 43 : this.ipv6Address.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
