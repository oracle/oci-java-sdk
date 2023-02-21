/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The details required to create an external DB system. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateExternalDbSystemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateExternalDbSystemDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "dbSystemDiscoveryId",
        "databaseManagementConfig"
    })
    public CreateExternalDbSystemDetails(
            String displayName,
            String compartmentId,
            String dbSystemDiscoveryId,
            ExternalDbSystemDatabaseManagementConfigDetails databaseManagementConfig) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.dbSystemDiscoveryId = dbSystemDiscoveryId;
        this.databaseManagementConfig = databaseManagementConfig;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The user-friendly name for the DB system. The name does not have to be unique. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name for the DB system. The name does not have to be unique.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment in which the external DB system resides.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment in which the external DB system resides.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * DB system discovery.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("dbSystemDiscoveryId")
        private String dbSystemDiscoveryId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * DB system discovery.
         *
         * @param dbSystemDiscoveryId the value to set
         * @return this builder
         */
        public Builder dbSystemDiscoveryId(String dbSystemDiscoveryId) {
            this.dbSystemDiscoveryId = dbSystemDiscoveryId;
            this.__explicitlySet__.add("dbSystemDiscoveryId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseManagementConfig")
        private ExternalDbSystemDatabaseManagementConfigDetails databaseManagementConfig;

        public Builder databaseManagementConfig(
                ExternalDbSystemDatabaseManagementConfigDetails databaseManagementConfig) {
            this.databaseManagementConfig = databaseManagementConfig;
            this.__explicitlySet__.add("databaseManagementConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateExternalDbSystemDetails build() {
            CreateExternalDbSystemDetails model =
                    new CreateExternalDbSystemDetails(
                            this.displayName,
                            this.compartmentId,
                            this.dbSystemDiscoveryId,
                            this.databaseManagementConfig);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateExternalDbSystemDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("dbSystemDiscoveryId")) {
                this.dbSystemDiscoveryId(model.getDbSystemDiscoveryId());
            }
            if (model.wasPropertyExplicitlySet("databaseManagementConfig")) {
                this.databaseManagementConfig(model.getDatabaseManagementConfig());
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

    /** The user-friendly name for the DB system. The name does not have to be unique. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name for the DB system. The name does not have to be unique.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment in which the external DB system resides.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment in which the external DB system resides.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB
     * system discovery.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dbSystemDiscoveryId")
    private final String dbSystemDiscoveryId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB
     * system discovery.
     *
     * @return the value
     */
    public String getDbSystemDiscoveryId() {
        return dbSystemDiscoveryId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("databaseManagementConfig")
    private final ExternalDbSystemDatabaseManagementConfigDetails databaseManagementConfig;

    public ExternalDbSystemDatabaseManagementConfigDetails getDatabaseManagementConfig() {
        return databaseManagementConfig;
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
        sb.append("CreateExternalDbSystemDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", dbSystemDiscoveryId=").append(String.valueOf(this.dbSystemDiscoveryId));
        sb.append(", databaseManagementConfig=")
                .append(String.valueOf(this.databaseManagementConfig));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateExternalDbSystemDetails)) {
            return false;
        }

        CreateExternalDbSystemDetails other = (CreateExternalDbSystemDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.dbSystemDiscoveryId, other.dbSystemDiscoveryId)
                && java.util.Objects.equals(
                        this.databaseManagementConfig, other.databaseManagementConfig)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.dbSystemDiscoveryId == null
                                ? 43
                                : this.dbSystemDiscoveryId.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseManagementConfig == null
                                ? 43
                                : this.databaseManagementConfig.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
