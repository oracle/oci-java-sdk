/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabase.model;

/**
 * Details required for creation of ExaDbXs based catalog peer.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateCatalogPeerWithExadbXsNewVaultAndClusterDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateCatalogPeerWithExadbXsNewVaultAndClusterDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "protectionMode",
        "transportType",
        "availabilityDomain",
        "dbStorageVaultDetails",
        "vmClusterDetails"
    })
    public CreateCatalogPeerWithExadbXsNewVaultAndClusterDetails(
            DistributedDbProtectionMode protectionMode,
            DistributedDbTransportType transportType,
            String availabilityDomain,
            DbStorageVaultDetails dbStorageVaultDetails,
            VmClusterDetails vmClusterDetails) {
        super();
        this.protectionMode = protectionMode;
        this.transportType = transportType;
        this.availabilityDomain = availabilityDomain;
        this.dbStorageVaultDetails = dbStorageVaultDetails;
        this.vmClusterDetails = vmClusterDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The protectionMode for the catalog peer.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
        private DistributedDbProtectionMode protectionMode;

        /**
         * The protectionMode for the catalog peer.
         * @param protectionMode the value to set
         * @return this builder
         **/
        public Builder protectionMode(DistributedDbProtectionMode protectionMode) {
            this.protectionMode = protectionMode;
            this.__explicitlySet__.add("protectionMode");
            return this;
        }
        /**
         * The redo transport type to use for this Data Guard association.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("transportType")
        private DistributedDbTransportType transportType;

        /**
         * The redo transport type to use for this Data Guard association.
         * @param transportType the value to set
         * @return this builder
         **/
        public Builder transportType(DistributedDbTransportType transportType) {
            this.transportType = transportType;
            this.__explicitlySet__.add("transportType");
            return this;
        }
        /**
         * The name of the availability domain that the distributed database shard will be located in.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
        private String availabilityDomain;

        /**
         * The name of the availability domain that the distributed database shard will be located in.
         * @param availabilityDomain the value to set
         * @return this builder
         **/
        public Builder availabilityDomain(String availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            this.__explicitlySet__.add("availabilityDomain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dbStorageVaultDetails")
        private DbStorageVaultDetails dbStorageVaultDetails;

        public Builder dbStorageVaultDetails(DbStorageVaultDetails dbStorageVaultDetails) {
            this.dbStorageVaultDetails = dbStorageVaultDetails;
            this.__explicitlySet__.add("dbStorageVaultDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("vmClusterDetails")
        private VmClusterDetails vmClusterDetails;

        public Builder vmClusterDetails(VmClusterDetails vmClusterDetails) {
            this.vmClusterDetails = vmClusterDetails;
            this.__explicitlySet__.add("vmClusterDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCatalogPeerWithExadbXsNewVaultAndClusterDetails build() {
            CreateCatalogPeerWithExadbXsNewVaultAndClusterDetails model =
                    new CreateCatalogPeerWithExadbXsNewVaultAndClusterDetails(
                            this.protectionMode,
                            this.transportType,
                            this.availabilityDomain,
                            this.dbStorageVaultDetails,
                            this.vmClusterDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCatalogPeerWithExadbXsNewVaultAndClusterDetails model) {
            if (model.wasPropertyExplicitlySet("protectionMode")) {
                this.protectionMode(model.getProtectionMode());
            }
            if (model.wasPropertyExplicitlySet("transportType")) {
                this.transportType(model.getTransportType());
            }
            if (model.wasPropertyExplicitlySet("availabilityDomain")) {
                this.availabilityDomain(model.getAvailabilityDomain());
            }
            if (model.wasPropertyExplicitlySet("dbStorageVaultDetails")) {
                this.dbStorageVaultDetails(model.getDbStorageVaultDetails());
            }
            if (model.wasPropertyExplicitlySet("vmClusterDetails")) {
                this.vmClusterDetails(model.getVmClusterDetails());
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
     * The protectionMode for the catalog peer.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
    private final DistributedDbProtectionMode protectionMode;

    /**
     * The protectionMode for the catalog peer.
     * @return the value
     **/
    public DistributedDbProtectionMode getProtectionMode() {
        return protectionMode;
    }

    /**
     * The redo transport type to use for this Data Guard association.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("transportType")
    private final DistributedDbTransportType transportType;

    /**
     * The redo transport type to use for this Data Guard association.
     * @return the value
     **/
    public DistributedDbTransportType getTransportType() {
        return transportType;
    }

    /**
     * The name of the availability domain that the distributed database shard will be located in.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("availabilityDomain")
    private final String availabilityDomain;

    /**
     * The name of the availability domain that the distributed database shard will be located in.
     * @return the value
     **/
    public String getAvailabilityDomain() {
        return availabilityDomain;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dbStorageVaultDetails")
    private final DbStorageVaultDetails dbStorageVaultDetails;

    public DbStorageVaultDetails getDbStorageVaultDetails() {
        return dbStorageVaultDetails;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("vmClusterDetails")
    private final VmClusterDetails vmClusterDetails;

    public VmClusterDetails getVmClusterDetails() {
        return vmClusterDetails;
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
        sb.append("CreateCatalogPeerWithExadbXsNewVaultAndClusterDetails(");
        sb.append("super=").append(super.toString());
        sb.append("protectionMode=").append(String.valueOf(this.protectionMode));
        sb.append(", transportType=").append(String.valueOf(this.transportType));
        sb.append(", availabilityDomain=").append(String.valueOf(this.availabilityDomain));
        sb.append(", dbStorageVaultDetails=").append(String.valueOf(this.dbStorageVaultDetails));
        sb.append(", vmClusterDetails=").append(String.valueOf(this.vmClusterDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateCatalogPeerWithExadbXsNewVaultAndClusterDetails)) {
            return false;
        }

        CreateCatalogPeerWithExadbXsNewVaultAndClusterDetails other =
                (CreateCatalogPeerWithExadbXsNewVaultAndClusterDetails) o;
        return java.util.Objects.equals(this.protectionMode, other.protectionMode)
                && java.util.Objects.equals(this.transportType, other.transportType)
                && java.util.Objects.equals(this.availabilityDomain, other.availabilityDomain)
                && java.util.Objects.equals(this.dbStorageVaultDetails, other.dbStorageVaultDetails)
                && java.util.Objects.equals(this.vmClusterDetails, other.vmClusterDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.protectionMode == null ? 43 : this.protectionMode.hashCode());
        result =
                (result * PRIME)
                        + (this.transportType == null ? 43 : this.transportType.hashCode());
        result =
                (result * PRIME)
                        + (this.availabilityDomain == null
                                ? 43
                                : this.availabilityDomain.hashCode());
        result =
                (result * PRIME)
                        + (this.dbStorageVaultDetails == null
                                ? 43
                                : this.dbStorageVaultDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.vmClusterDetails == null ? 43 : this.vmClusterDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
