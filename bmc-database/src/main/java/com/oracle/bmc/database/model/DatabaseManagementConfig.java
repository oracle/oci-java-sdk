/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The configuration of the Database Management service. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DatabaseManagementConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class DatabaseManagementConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "databaseManagementStatus",
        "databaseManagementConnectionId",
        "licenseModel"
    })
    public DatabaseManagementConfig(
            DatabaseManagementStatus databaseManagementStatus,
            String databaseManagementConnectionId,
            LicenseModel licenseModel) {
        super();
        this.databaseManagementStatus = databaseManagementStatus;
        this.databaseManagementConnectionId = databaseManagementConnectionId;
        this.licenseModel = licenseModel;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The status of the Database Management service. */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseManagementStatus")
        private DatabaseManagementStatus databaseManagementStatus;

        /**
         * The status of the Database Management service.
         *
         * @param databaseManagementStatus the value to set
         * @return this builder
         */
        public Builder databaseManagementStatus(DatabaseManagementStatus databaseManagementStatus) {
            this.databaseManagementStatus = databaseManagementStatus;
            this.__explicitlySet__.add("databaseManagementStatus");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * {@link
         * #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest)
         * createExternalDatabaseConnectorDetails}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseManagementConnectionId")
        private String databaseManagementConnectionId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * {@link
         * #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest)
         * createExternalDatabaseConnectorDetails}.
         *
         * @param databaseManagementConnectionId the value to set
         * @return this builder
         */
        public Builder databaseManagementConnectionId(String databaseManagementConnectionId) {
            this.databaseManagementConnectionId = databaseManagementConnectionId;
            this.__explicitlySet__.add("databaseManagementConnectionId");
            return this;
        }
        /** The Oracle license model that applies to the external database. */
        @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
        private LicenseModel licenseModel;

        /**
         * The Oracle license model that applies to the external database.
         *
         * @param licenseModel the value to set
         * @return this builder
         */
        public Builder licenseModel(LicenseModel licenseModel) {
            this.licenseModel = licenseModel;
            this.__explicitlySet__.add("licenseModel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseManagementConfig build() {
            DatabaseManagementConfig model =
                    new DatabaseManagementConfig(
                            this.databaseManagementStatus,
                            this.databaseManagementConnectionId,
                            this.licenseModel);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseManagementConfig model) {
            if (model.wasPropertyExplicitlySet("databaseManagementStatus")) {
                this.databaseManagementStatus(model.getDatabaseManagementStatus());
            }
            if (model.wasPropertyExplicitlySet("databaseManagementConnectionId")) {
                this.databaseManagementConnectionId(model.getDatabaseManagementConnectionId());
            }
            if (model.wasPropertyExplicitlySet("licenseModel")) {
                this.licenseModel(model.getLicenseModel());
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

    /** The status of the Database Management service. */
    public enum DatabaseManagementStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Enabling("ENABLING"),
        Enabled("ENABLED"),
        Disabling("DISABLING"),
        NotEnabled("NOT_ENABLED"),
        FailedEnabling("FAILED_ENABLING"),
        FailedDisabling("FAILED_DISABLING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DatabaseManagementStatus.class);

        private final String value;
        private static java.util.Map<String, DatabaseManagementStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (DatabaseManagementStatus v : DatabaseManagementStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DatabaseManagementStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DatabaseManagementStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DatabaseManagementStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The status of the Database Management service. */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseManagementStatus")
    private final DatabaseManagementStatus databaseManagementStatus;

    /**
     * The status of the Database Management service.
     *
     * @return the value
     */
    public DatabaseManagementStatus getDatabaseManagementStatus() {
        return databaseManagementStatus;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * {@link #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest)
     * createExternalDatabaseConnectorDetails}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseManagementConnectionId")
    private final String databaseManagementConnectionId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * {@link #createExternalDatabaseConnectorDetails(CreateExternalDatabaseConnectorDetailsRequest)
     * createExternalDatabaseConnectorDetails}.
     *
     * @return the value
     */
    public String getDatabaseManagementConnectionId() {
        return databaseManagementConnectionId;
    }

    /** The Oracle license model that applies to the external database. */
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
    /** The Oracle license model that applies to the external database. */
    @com.fasterxml.jackson.annotation.JsonProperty("licenseModel")
    private final LicenseModel licenseModel;

    /**
     * The Oracle license model that applies to the external database.
     *
     * @return the value
     */
    public LicenseModel getLicenseModel() {
        return licenseModel;
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
        sb.append("DatabaseManagementConfig(");
        sb.append("super=").append(super.toString());
        sb.append("databaseManagementStatus=")
                .append(String.valueOf(this.databaseManagementStatus));
        sb.append(", databaseManagementConnectionId=")
                .append(String.valueOf(this.databaseManagementConnectionId));
        sb.append(", licenseModel=").append(String.valueOf(this.licenseModel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseManagementConfig)) {
            return false;
        }

        DatabaseManagementConfig other = (DatabaseManagementConfig) o;
        return java.util.Objects.equals(
                        this.databaseManagementStatus, other.databaseManagementStatus)
                && java.util.Objects.equals(
                        this.databaseManagementConnectionId, other.databaseManagementConnectionId)
                && java.util.Objects.equals(this.licenseModel, other.licenseModel)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.databaseManagementStatus == null
                                ? 43
                                : this.databaseManagementStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseManagementConnectionId == null
                                ? 43
                                : this.databaseManagementConnectionId.hashCode());
        result = (result * PRIME) + (this.licenseModel == null ? 43 : this.licenseModel.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
