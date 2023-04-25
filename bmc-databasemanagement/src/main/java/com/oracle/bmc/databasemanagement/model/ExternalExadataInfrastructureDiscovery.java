/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The discovery result of the Exadata infrastructure. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExternalExadataInfrastructureDiscovery.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entityType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ExternalExadataInfrastructureDiscovery extends EntityDiscovered {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("agentId")
        private String agentId;

        public Builder agentId(String agentId) {
            this.agentId = agentId;
            this.__explicitlySet__.add("agentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("connectorId")
        private String connectorId;

        public Builder connectorId(String connectorId) {
            this.connectorId = connectorId;
            this.__explicitlySet__.add("connectorId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("internalId")
        private String internalId;

        public Builder internalId(String internalId) {
            this.internalId = internalId;
            this.__explicitlySet__.add("internalId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("discoverStatus")
        private DiscoverStatus discoverStatus;

        public Builder discoverStatus(DiscoverStatus discoverStatus) {
            this.discoverStatus = discoverStatus;
            this.__explicitlySet__.add("discoverStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("discoverErrorCode")
        private String discoverErrorCode;

        public Builder discoverErrorCode(String discoverErrorCode) {
            this.discoverErrorCode = discoverErrorCode;
            this.__explicitlySet__.add("discoverErrorCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("discoverErrorMsg")
        private String discoverErrorMsg;

        public Builder discoverErrorMsg(String discoverErrorMsg) {
            this.discoverErrorMsg = discoverErrorMsg;
            this.__explicitlySet__.add("discoverErrorMsg");
            return this;
        }
        /** The unique key of the discovery request. */
        @com.fasterxml.jackson.annotation.JsonProperty("discoveryKey")
        private String discoveryKey;

        /**
         * The unique key of the discovery request.
         *
         * @param discoveryKey the value to set
         * @return this builder
         */
        public Builder discoveryKey(String discoveryKey) {
            this.discoveryKey = discoveryKey;
            this.__explicitlySet__.add("discoveryKey");
            return this;
        }
        /** The Oracle license model that applies to the database management resources. */
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to the database management resources.
         *
         * @param licenseModel the value to set
         * @return this builder
         */
        public Builder licenseModel(LicenseModel licenseModel) {
            this.licenseModel = licenseModel;
            this.__explicitlySet__.add("licenseModel");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The size of the Exadata infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("rackSize")
        private RackSize rackSize;

        /**
         * The size of the Exadata infrastructure.
         *
         * @param rackSize the value to set
         * @return this builder
         */
        public Builder rackSize(RackSize rackSize) {
            this.rackSize = rackSize;
            this.__explicitlySet__.add("rackSize");
            return this;
        }
        /** The Oracle home path of the infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("gridHomePath")
        private String gridHomePath;

        /**
         * The Oracle home path of the infrastructure.
         *
         * @param gridHomePath the value to set
         * @return this builder
         */
        public Builder gridHomePath(String gridHomePath) {
            this.gridHomePath = gridHomePath;
            this.__explicitlySet__.add("gridHomePath");
            return this;
        }
        /** The list of all the rac database systems. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystems")
        private java.util.List<ExternalDatabaseSystemDiscoverySummary> dbSystems;

        /**
         * The list of all the rac database systems.
         *
         * @param dbSystems the value to set
         * @return this builder
         */
        public Builder dbSystems(java.util.List<ExternalDatabaseSystemDiscoverySummary> dbSystems) {
            this.dbSystems = dbSystems;
            this.__explicitlySet__.add("dbSystems");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("storageGrid")
        private ExternalStorageGridDiscoverySummary storageGrid;

        public Builder storageGrid(ExternalStorageGridDiscoverySummary storageGrid) {
            this.storageGrid = storageGrid;
            this.__explicitlySet__.add("storageGrid");
            return this;
        }
        /** The list of all the storage servers. */
        @com.fasterxml.jackson.annotation.JsonProperty("storageServers")
        private java.util.List<ExternalStorageServerDiscoverySummary> storageServers;

        /**
         * The list of all the storage servers.
         *
         * @param storageServers the value to set
         * @return this builder
         */
        public Builder storageServers(
                java.util.List<ExternalStorageServerDiscoverySummary> storageServers) {
            this.storageServers = storageServers;
            this.__explicitlySet__.add("storageServers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalExadataInfrastructureDiscovery build() {
            ExternalExadataInfrastructureDiscovery model =
                    new ExternalExadataInfrastructureDiscovery(
                            this.id,
                            this.agentId,
                            this.connectorId,
                            this.displayName,
                            this.version,
                            this.internalId,
                            this.status,
                            this.discoverStatus,
                            this.discoverErrorCode,
                            this.discoverErrorMsg,
                            this.discoveryKey,
                            this.licenseModel,
                            this.compartmentId,
                            this.rackSize,
                            this.gridHomePath,
                            this.dbSystems,
                            this.storageGrid,
                            this.storageServers);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalExadataInfrastructureDiscovery model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("agentId")) {
                this.agentId(model.getAgentId());
            }
            if (model.wasPropertyExplicitlySet("connectorId")) {
                this.connectorId(model.getConnectorId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("internalId")) {
                this.internalId(model.getInternalId());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("discoverStatus")) {
                this.discoverStatus(model.getDiscoverStatus());
            }
            if (model.wasPropertyExplicitlySet("discoverErrorCode")) {
                this.discoverErrorCode(model.getDiscoverErrorCode());
            }
            if (model.wasPropertyExplicitlySet("discoverErrorMsg")) {
                this.discoverErrorMsg(model.getDiscoverErrorMsg());
            }
            if (model.wasPropertyExplicitlySet("discoveryKey")) {
                this.discoveryKey(model.getDiscoveryKey());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("rackSize")) {
                this.rackSize(model.getRackSize());
            }
            if (model.wasPropertyExplicitlySet("gridHomePath")) {
                this.gridHomePath(model.getGridHomePath());
            }
            if (model.wasPropertyExplicitlySet("dbSystems")) {
                this.dbSystems(model.getDbSystems());
            }
            if (model.wasPropertyExplicitlySet("storageGrid")) {
                this.storageGrid(model.getStorageGrid());
            }
            if (model.wasPropertyExplicitlySet("storageServers")) {
                this.storageServers(model.getStorageServers());
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
    public ExternalExadataInfrastructureDiscovery(
            String id,
            String agentId,
            String connectorId,
            String displayName,
            String version,
            String internalId,
            String status,
            DiscoverStatus discoverStatus,
            String discoverErrorCode,
            String discoverErrorMsg,
            String discoveryKey,
            LicenseModel licenseModel,
            String compartmentId,
            RackSize rackSize,
            String gridHomePath,
            java.util.List<ExternalDatabaseSystemDiscoverySummary> dbSystems,
            ExternalStorageGridDiscoverySummary storageGrid,
            java.util.List<ExternalStorageServerDiscoverySummary> storageServers) {
        super(
                id,
                agentId,
                connectorId,
                displayName,
                version,
                internalId,
                status,
                discoverStatus,
                discoverErrorCode,
                discoverErrorMsg);
        this.discoveryKey = discoveryKey;
        this.licenseModel = licenseModel;
        this.compartmentId = compartmentId;
        this.rackSize = rackSize;
        this.gridHomePath = gridHomePath;
        this.dbSystems = dbSystems;
        this.storageGrid = storageGrid;
        this.storageServers = storageServers;
    }

    /** The unique key of the discovery request. */
    @com.fasterxml.jackson.annotation.JsonProperty("discoveryKey")
    private final String discoveryKey;

    /**
     * The unique key of the discovery request.
     *
     * @return the value
     */
    public String getDiscoveryKey() {
        return discoveryKey;
    }

    /** The Oracle license model that applies to the database management resources. */
    public enum LicenseModel implements com.oracle.bmc.http.internal.BmcEnum {
        LicenseIncluded("LICENSE_INCLUDED"),
        BringYourOwnLicense("BRING_YOUR_OWN_LICENSE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LicenseModel.class);

        private final String value;
        private static java.util.Map<String, LicenseModel> map;

        static {
            map = new java.util.HashMap<>();
            for (LicenseModel v : LicenseModel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LicenseModel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LicenseModel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LicenseModel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The Oracle license model that applies to the database management resources. */
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the database management resources.
     *
     * @return the value
     */
    public LicenseModel getLicenseModel() {
        return licenseModel;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The size of the Exadata infrastructure. */
    public enum RackSize implements com.oracle.bmc.http.internal.BmcEnum {
        Full("FULL"),
        Half("HALF"),
        Quarter("QUARTER"),
        Eighth("EIGHTH"),
        Unknown("UNKNOWN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RackSize.class);

        private final String value;
        private static java.util.Map<String, RackSize> map;

        static {
            map = new java.util.HashMap<>();
            for (RackSize v : RackSize.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RackSize(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RackSize create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RackSize', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The size of the Exadata infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("rackSize")
    private final RackSize rackSize;

    /**
     * The size of the Exadata infrastructure.
     *
     * @return the value
     */
    public RackSize getRackSize() {
        return rackSize;
    }

    /** The Oracle home path of the infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("gridHomePath")
    private final String gridHomePath;

    /**
     * The Oracle home path of the infrastructure.
     *
     * @return the value
     */
    public String getGridHomePath() {
        return gridHomePath;
    }

    /** The list of all the rac database systems. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystems")
    private final java.util.List<ExternalDatabaseSystemDiscoverySummary> dbSystems;

    /**
     * The list of all the rac database systems.
     *
     * @return the value
     */
    public java.util.List<ExternalDatabaseSystemDiscoverySummary> getDbSystems() {
        return dbSystems;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("storageGrid")
    private final ExternalStorageGridDiscoverySummary storageGrid;

    public ExternalStorageGridDiscoverySummary getStorageGrid() {
        return storageGrid;
    }

    /** The list of all the storage servers. */
    @com.fasterxml.jackson.annotation.JsonProperty("storageServers")
    private final java.util.List<ExternalStorageServerDiscoverySummary> storageServers;

    /**
     * The list of all the storage servers.
     *
     * @return the value
     */
    public java.util.List<ExternalStorageServerDiscoverySummary> getStorageServers() {
        return storageServers;
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
        sb.append("ExternalExadataInfrastructureDiscovery(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", discoveryKey=").append(String.valueOf(this.discoveryKey));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", rackSize=").append(String.valueOf(this.rackSize));
        sb.append(", gridHomePath=").append(String.valueOf(this.gridHomePath));
        sb.append(", dbSystems=").append(String.valueOf(this.dbSystems));
        sb.append(", storageGrid=").append(String.valueOf(this.storageGrid));
        sb.append(", storageServers=").append(String.valueOf(this.storageServers));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalExadataInfrastructureDiscovery)) {
            return false;
        }

        ExternalExadataInfrastructureDiscovery other = (ExternalExadataInfrastructureDiscovery) o;
        return java.util.Objects.equals(this.discoveryKey, other.discoveryKey)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.rackSize, other.rackSize)
                && java.util.Objects.equals(this.gridHomePath, other.gridHomePath)
                && java.util.Objects.equals(this.dbSystems, other.dbSystems)
                && java.util.Objects.equals(this.storageGrid, other.storageGrid)
                && java.util.Objects.equals(this.storageServers, other.storageServers)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.discoveryKey == null ? 43 : this.discoveryKey.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.rackSize == null ? 43 : this.rackSize.hashCode());
        result = (result * PRIME) + (this.gridHomePath == null ? 43 : this.gridHomePath.hashCode());
        result = (result * PRIME) + (this.dbSystems == null ? 43 : this.dbSystems.hashCode());
        result = (result * PRIME) + (this.storageGrid == null ? 43 : this.storageGrid.hashCode());
        result =
                (result * PRIME)
                        + (this.storageServers == null ? 43 : this.storageServers.hashCode());
        return result;
    }
}
