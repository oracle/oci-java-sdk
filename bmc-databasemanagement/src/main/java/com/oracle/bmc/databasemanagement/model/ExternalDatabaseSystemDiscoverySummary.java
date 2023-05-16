/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The summary of the database system. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExternalDatabaseSystemDiscoverySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "entityType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExternalDatabaseSystemDiscoverySummary extends EntityDiscovered {
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
        /** The Oracle home path. */
        @com.fasterxml.jackson.annotation.JsonProperty("oracleHome")
        private String oracleHome;

        /**
         * The Oracle home path.
         *
         * @param oracleHome the value to set
         * @return this builder
         */
        public Builder oracleHome(String oracleHome) {
            this.oracleHome = oracleHome;
            this.__explicitlySet__.add("oracleHome");
            return this;
        }
        /** The display name of ASM connector. */
        @com.fasterxml.jackson.annotation.JsonProperty("asmConnectorName")
        private String asmConnectorName;

        /**
         * The display name of ASM connector.
         *
         * @param asmConnectorName the value to set
         * @return this builder
         */
        public Builder asmConnectorName(String asmConnectorName) {
            this.asmConnectorName = asmConnectorName;
            this.__explicitlySet__.add("asmConnectorName");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalDatabaseSystemDiscoverySummary build() {
            ExternalDatabaseSystemDiscoverySummary model =
                    new ExternalDatabaseSystemDiscoverySummary(
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
                            this.oracleHome,
                            this.asmConnectorName,
                            this.licenseModel,
                            this.compartmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalDatabaseSystemDiscoverySummary model) {
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
            if (model.wasPropertyExplicitlySet("oracleHome")) {
                this.oracleHome(model.getOracleHome());
            }
            if (model.wasPropertyExplicitlySet("asmConnectorName")) {
                this.asmConnectorName(model.getAsmConnectorName());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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
    public ExternalDatabaseSystemDiscoverySummary(
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
            String oracleHome,
            String asmConnectorName,
            LicenseModel licenseModel,
            String compartmentId) {
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
        this.oracleHome = oracleHome;
        this.asmConnectorName = asmConnectorName;
        this.licenseModel = licenseModel;
        this.compartmentId = compartmentId;
    }

    /** The Oracle home path. */
    @com.fasterxml.jackson.annotation.JsonProperty("oracleHome")
    private final String oracleHome;

    /**
     * The Oracle home path.
     *
     * @return the value
     */
    public String getOracleHome() {
        return oracleHome;
    }

    /** The display name of ASM connector. */
    @com.fasterxml.jackson.annotation.JsonProperty("asmConnectorName")
    private final String asmConnectorName;

    /**
     * The display name of ASM connector.
     *
     * @return the value
     */
    public String getAsmConnectorName() {
        return asmConnectorName;
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
        sb.append("ExternalDatabaseSystemDiscoverySummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", oracleHome=").append(String.valueOf(this.oracleHome));
        sb.append(", asmConnectorName=").append(String.valueOf(this.asmConnectorName));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalDatabaseSystemDiscoverySummary)) {
            return false;
        }

        ExternalDatabaseSystemDiscoverySummary other = (ExternalDatabaseSystemDiscoverySummary) o;
        return java.util.Objects.equals(this.oracleHome, other.oracleHome)
                && java.util.Objects.equals(this.asmConnectorName, other.asmConnectorName)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.oracleHome == null ? 43 : this.oracleHome.hashCode());
        result =
                (result * PRIME)
                        + (this.asmConnectorName == null ? 43 : this.asmConnectorName.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        return result;
    }
}
