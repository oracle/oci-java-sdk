/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabasev26.model;

/**
 * Details of a distributed database catalog running on ExaDB-XS.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DistributedDatabaseCatalogDatabaseWithExadbXs.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "source"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DistributedDatabaseCatalogDatabaseWithExadbXs
        extends DistributedDatabaseCatalogDatabase {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private DistributedDbMetadata metadata;

        public Builder metadata(DistributedDbMetadata metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database Home.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbHomeId")
        private String dbHomeId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database Home.
         * @param dbHomeId the value to set
         * @return this builder
         **/
        public Builder dbHomeId(String dbHomeId) {
            this.dbHomeId = dbHomeId;
            this.__explicitlySet__.add("dbHomeId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VmCluster.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vmClusterId")
        private String vmClusterId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VmCluster.
         * @param vmClusterId the value to set
         * @return this builder
         **/
        public Builder vmClusterId(String vmClusterId) {
            this.vmClusterId = vmClusterId;
            this.__explicitlySet__.add("vmClusterId");
            return this;
        }
        /**
         * Status of the distributed database catalog.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Status of the distributed database catalog.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * the identifier of the underlying supporting resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("supportingResourceId")
        private String supportingResourceId;

        /**
         * the identifier of the underlying supporting resource.
         * @param supportingResourceId the value to set
         * @return this builder
         **/
        public Builder supportingResourceId(String supportingResourceId) {
            this.supportingResourceId = supportingResourceId;
            this.__explicitlySet__.add("supportingResourceId");
            return this;
        }
        /**
         * the identifier of the container database for underlying supporting resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("containerDatabaseId")
        private String containerDatabaseId;

        /**
         * the identifier of the container database for underlying supporting resource.
         * @param containerDatabaseId the value to set
         * @return this builder
         **/
        public Builder containerDatabaseId(String containerDatabaseId) {
            this.containerDatabaseId = containerDatabaseId;
            this.__explicitlySet__.add("containerDatabaseId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         * This parameter and {@code kmsKeyId} are required for Customer Managed Keys.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
        private String vaultId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
         * This parameter and {@code kmsKeyId} are required for Customer Managed Keys.
         *
         * @param vaultId the value to set
         * @return this builder
         **/
        public Builder vaultId(String vaultId) {
            this.vaultId = vaultId;
            this.__explicitlySet__.add("vaultId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
         *
         * @param kmsKeyId the value to set
         * @return this builder
         **/
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
        private String kmsKeyVersionId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions.
         *
         * @param kmsKeyVersionId the value to set
         * @return this builder
         **/
        public Builder kmsKeyVersionId(String kmsKeyVersionId) {
            this.kmsKeyVersionId = kmsKeyVersionId;
            this.__explicitlySet__.add("kmsKeyVersionId");
            return this;
        }
        /**
         * The protection mode used for the Data Guard association.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
        private DistributedDbProtectionMode protectionMode;

        /**
         * The protection mode used for the Data Guard association.
         * @param protectionMode the value to set
         * @return this builder
         **/
        public Builder protectionMode(DistributedDbProtectionMode protectionMode) {
            this.protectionMode = protectionMode;
            this.__explicitlySet__.add("protectionMode");
            return this;
        }
        /**
         * The transport type used for the Data Guard association.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("transportType")
        private DistributedDbTransportType transportType;

        /**
         * The transport type used for the Data Guard association.
         * @param transportType the value to set
         * @return this builder
         **/
        public Builder transportType(DistributedDbTransportType transportType) {
            this.transportType = transportType;
            this.__explicitlySet__.add("transportType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DistributedDatabaseCatalogDatabaseWithExadbXs build() {
            DistributedDatabaseCatalogDatabaseWithExadbXs model =
                    new DistributedDatabaseCatalogDatabaseWithExadbXs(
                            this.name,
                            this.timeCreated,
                            this.timeUpdated,
                            this.metadata,
                            this.dbHomeId,
                            this.vmClusterId,
                            this.status,
                            this.supportingResourceId,
                            this.containerDatabaseId,
                            this.vaultId,
                            this.kmsKeyId,
                            this.kmsKeyVersionId,
                            this.protectionMode,
                            this.transportType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DistributedDatabaseCatalogDatabaseWithExadbXs model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
            }
            if (model.wasPropertyExplicitlySet("dbHomeId")) {
                this.dbHomeId(model.getDbHomeId());
            }
            if (model.wasPropertyExplicitlySet("vmClusterId")) {
                this.vmClusterId(model.getVmClusterId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("supportingResourceId")) {
                this.supportingResourceId(model.getSupportingResourceId());
            }
            if (model.wasPropertyExplicitlySet("containerDatabaseId")) {
                this.containerDatabaseId(model.getContainerDatabaseId());
            }
            if (model.wasPropertyExplicitlySet("vaultId")) {
                this.vaultId(model.getVaultId());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyVersionId")) {
                this.kmsKeyVersionId(model.getKmsKeyVersionId());
            }
            if (model.wasPropertyExplicitlySet("protectionMode")) {
                this.protectionMode(model.getProtectionMode());
            }
            if (model.wasPropertyExplicitlySet("transportType")) {
                this.transportType(model.getTransportType());
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
    public DistributedDatabaseCatalogDatabaseWithExadbXs(
            String name,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            DistributedDbMetadata metadata,
            String dbHomeId,
            String vmClusterId,
            Status status,
            String supportingResourceId,
            String containerDatabaseId,
            String vaultId,
            String kmsKeyId,
            String kmsKeyVersionId,
            DistributedDbProtectionMode protectionMode,
            DistributedDbTransportType transportType) {
        super(name, timeCreated, timeUpdated, metadata);
        this.dbHomeId = dbHomeId;
        this.vmClusterId = vmClusterId;
        this.status = status;
        this.supportingResourceId = supportingResourceId;
        this.containerDatabaseId = containerDatabaseId;
        this.vaultId = vaultId;
        this.kmsKeyId = kmsKeyId;
        this.kmsKeyVersionId = kmsKeyVersionId;
        this.protectionMode = protectionMode;
        this.transportType = transportType;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database Home.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbHomeId")
    private final String dbHomeId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Database Home.
     * @return the value
     **/
    public String getDbHomeId() {
        return dbHomeId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VmCluster.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vmClusterId")
    private final String vmClusterId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the VmCluster.
     * @return the value
     **/
    public String getVmClusterId() {
        return vmClusterId;
    }

    /**
     * Status of the distributed database catalog.
     **/
    public enum Status {
        Failed("FAILED"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        Updating("UPDATING"),
        Creating("CREATING"),
        Created("CREATED"),
        ReadyForConfiguration("READY_FOR_CONFIGURATION"),
        Configured("CONFIGURED"),
        NeedsAttention("NEEDS_ATTENTION"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Status of the distributed database catalog.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Status of the distributed database catalog.
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * the identifier of the underlying supporting resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("supportingResourceId")
    private final String supportingResourceId;

    /**
     * the identifier of the underlying supporting resource.
     * @return the value
     **/
    public String getSupportingResourceId() {
        return supportingResourceId;
    }

    /**
     * the identifier of the container database for underlying supporting resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("containerDatabaseId")
    private final String containerDatabaseId;

    /**
     * the identifier of the container database for underlying supporting resource.
     * @return the value
     **/
    public String getContainerDatabaseId() {
        return containerDatabaseId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * This parameter and {@code kmsKeyId} are required for Customer Managed Keys.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vaultId")
    private final String vaultId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Oracle Cloud Infrastructure [vault](https://docs.oracle.com/iaas/Content/KeyManagement/Concepts/keyoverview.htm#concepts).
     * This parameter and {@code kmsKeyId} are required for Customer Managed Keys.
     *
     * @return the value
     **/
    public String getVaultId() {
        return vaultId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key container that is used as the master encryption key in database transparent data encryption (TDE) operations.
     *
     * @return the value
     **/
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyVersionId")
    private final String kmsKeyVersionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the key container version that is used in database transparent data encryption (TDE) operations KMS Key can have multiple key versions.
     *
     * @return the value
     **/
    public String getKmsKeyVersionId() {
        return kmsKeyVersionId;
    }

    /**
     * The protection mode used for the Data Guard association.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
    private final DistributedDbProtectionMode protectionMode;

    /**
     * The protection mode used for the Data Guard association.
     * @return the value
     **/
    public DistributedDbProtectionMode getProtectionMode() {
        return protectionMode;
    }

    /**
     * The transport type used for the Data Guard association.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("transportType")
    private final DistributedDbTransportType transportType;

    /**
     * The transport type used for the Data Guard association.
     * @return the value
     **/
    public DistributedDbTransportType getTransportType() {
        return transportType;
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
        sb.append("DistributedDatabaseCatalogDatabaseWithExadbXs(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", dbHomeId=").append(String.valueOf(this.dbHomeId));
        sb.append(", vmClusterId=").append(String.valueOf(this.vmClusterId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", supportingResourceId=").append(String.valueOf(this.supportingResourceId));
        sb.append(", containerDatabaseId=").append(String.valueOf(this.containerDatabaseId));
        sb.append(", vaultId=").append(String.valueOf(this.vaultId));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", kmsKeyVersionId=").append(String.valueOf(this.kmsKeyVersionId));
        sb.append(", protectionMode=").append(String.valueOf(this.protectionMode));
        sb.append(", transportType=").append(String.valueOf(this.transportType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DistributedDatabaseCatalogDatabaseWithExadbXs)) {
            return false;
        }

        DistributedDatabaseCatalogDatabaseWithExadbXs other =
                (DistributedDatabaseCatalogDatabaseWithExadbXs) o;
        return java.util.Objects.equals(this.dbHomeId, other.dbHomeId)
                && java.util.Objects.equals(this.vmClusterId, other.vmClusterId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.supportingResourceId, other.supportingResourceId)
                && java.util.Objects.equals(this.containerDatabaseId, other.containerDatabaseId)
                && java.util.Objects.equals(this.vaultId, other.vaultId)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.kmsKeyVersionId, other.kmsKeyVersionId)
                && java.util.Objects.equals(this.protectionMode, other.protectionMode)
                && java.util.Objects.equals(this.transportType, other.transportType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.dbHomeId == null ? 43 : this.dbHomeId.hashCode());
        result = (result * PRIME) + (this.vmClusterId == null ? 43 : this.vmClusterId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.supportingResourceId == null
                                ? 43
                                : this.supportingResourceId.hashCode());
        result =
                (result * PRIME)
                        + (this.containerDatabaseId == null
                                ? 43
                                : this.containerDatabaseId.hashCode());
        result = (result * PRIME) + (this.vaultId == null ? 43 : this.vaultId.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.kmsKeyVersionId == null ? 43 : this.kmsKeyVersionId.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionMode == null ? 43 : this.protectionMode.hashCode());
        result =
                (result * PRIME)
                        + (this.transportType == null ? 43 : this.transportType.hashCode());
        return result;
    }
}
