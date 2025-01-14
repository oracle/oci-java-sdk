/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The configuration details for creating a Data Guard association for a bare metal or Exadata DB
 * system database. For these types of DB system databases, the {@code creationType} should be
 * {@code ExistingDbSystem}. A standby database will be created in the DB system you specify.
 *
 * <p>To create a Data Guard association for a database in a virtual machine DB system, use the
 * {@link
 * #createDataGuardAssociationWithNewDbSystemDetails(CreateDataGuardAssociationWithNewDbSystemDetailsRequest)
 * createDataGuardAssociationWithNewDbSystemDetails} subtype instead. <br>
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
        builder = CreateDataGuardAssociationToExistingDbSystemDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "creationType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateDataGuardAssociationToExistingDbSystemDetails
        extends CreateDataGuardAssociationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageId")
        private String databaseSoftwareImageId;

        public Builder databaseSoftwareImageId(String databaseSoftwareImageId) {
            this.databaseSoftwareImageId = databaseSoftwareImageId;
            this.__explicitlySet__.add("databaseSoftwareImageId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("databaseAdminPassword")
        private String databaseAdminPassword;

        public Builder databaseAdminPassword(String databaseAdminPassword) {
            this.databaseAdminPassword = databaseAdminPassword;
            this.__explicitlySet__.add("databaseAdminPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
        private ProtectionMode protectionMode;

        public Builder protectionMode(ProtectionMode protectionMode) {
            this.protectionMode = protectionMode;
            this.__explicitlySet__.add("protectionMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("transportType")
        private TransportType transportType;

        public Builder transportType(TransportType transportType) {
            this.transportType = transportType;
            this.__explicitlySet__.add("transportType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isActiveDataGuardEnabled")
        private Boolean isActiveDataGuardEnabled;

        public Builder isActiveDataGuardEnabled(Boolean isActiveDataGuardEnabled) {
            this.isActiveDataGuardEnabled = isActiveDataGuardEnabled;
            this.__explicitlySet__.add("isActiveDataGuardEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerDbUniqueName")
        private String peerDbUniqueName;

        public Builder peerDbUniqueName(String peerDbUniqueName) {
            this.peerDbUniqueName = peerDbUniqueName;
            this.__explicitlySet__.add("peerDbUniqueName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerSidPrefix")
        private String peerSidPrefix;

        public Builder peerSidPrefix(String peerSidPrefix) {
            this.peerSidPrefix = peerSidPrefix;
            this.__explicitlySet__.add("peerSidPrefix");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * DB system in which to create the standby database. You must supply this value if
         * creationType is {@code ExistingDbSystem}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerDbSystemId")
        private String peerDbSystemId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * DB system in which to create the standby database. You must supply this value if
         * creationType is {@code ExistingDbSystem}.
         *
         * @param peerDbSystemId the value to set
         * @return this builder
         */
        public Builder peerDbSystemId(String peerDbSystemId) {
            this.peerDbSystemId = peerDbSystemId;
            this.__explicitlySet__.add("peerDbSystemId");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * DB home in which to create the standby database. You must supply this value to create
         * standby database with an existing DB home
         */
        @com.fasterxml.jackson.annotation.JsonProperty("peerDbHomeId")
        private String peerDbHomeId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * DB home in which to create the standby database. You must supply this value to create
         * standby database with an existing DB home
         *
         * @param peerDbHomeId the value to set
         * @return this builder
         */
        public Builder peerDbHomeId(String peerDbHomeId) {
            this.peerDbHomeId = peerDbHomeId;
            this.__explicitlySet__.add("peerDbHomeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDataGuardAssociationToExistingDbSystemDetails build() {
            CreateDataGuardAssociationToExistingDbSystemDetails model =
                    new CreateDataGuardAssociationToExistingDbSystemDetails(
                            this.databaseSoftwareImageId,
                            this.databaseAdminPassword,
                            this.protectionMode,
                            this.transportType,
                            this.isActiveDataGuardEnabled,
                            this.peerDbUniqueName,
                            this.peerSidPrefix,
                            this.peerDbSystemId,
                            this.peerDbHomeId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDataGuardAssociationToExistingDbSystemDetails model) {
            if (model.wasPropertyExplicitlySet("databaseSoftwareImageId")) {
                this.databaseSoftwareImageId(model.getDatabaseSoftwareImageId());
            }
            if (model.wasPropertyExplicitlySet("databaseAdminPassword")) {
                this.databaseAdminPassword(model.getDatabaseAdminPassword());
            }
            if (model.wasPropertyExplicitlySet("protectionMode")) {
                this.protectionMode(model.getProtectionMode());
            }
            if (model.wasPropertyExplicitlySet("transportType")) {
                this.transportType(model.getTransportType());
            }
            if (model.wasPropertyExplicitlySet("isActiveDataGuardEnabled")) {
                this.isActiveDataGuardEnabled(model.getIsActiveDataGuardEnabled());
            }
            if (model.wasPropertyExplicitlySet("peerDbUniqueName")) {
                this.peerDbUniqueName(model.getPeerDbUniqueName());
            }
            if (model.wasPropertyExplicitlySet("peerSidPrefix")) {
                this.peerSidPrefix(model.getPeerSidPrefix());
            }
            if (model.wasPropertyExplicitlySet("peerDbSystemId")) {
                this.peerDbSystemId(model.getPeerDbSystemId());
            }
            if (model.wasPropertyExplicitlySet("peerDbHomeId")) {
                this.peerDbHomeId(model.getPeerDbHomeId());
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
    public CreateDataGuardAssociationToExistingDbSystemDetails(
            String databaseSoftwareImageId,
            String databaseAdminPassword,
            ProtectionMode protectionMode,
            TransportType transportType,
            Boolean isActiveDataGuardEnabled,
            String peerDbUniqueName,
            String peerSidPrefix,
            String peerDbSystemId,
            String peerDbHomeId) {
        super(
                databaseSoftwareImageId,
                databaseAdminPassword,
                protectionMode,
                transportType,
                isActiveDataGuardEnabled,
                peerDbUniqueName,
                peerSidPrefix);
        this.peerDbSystemId = peerDbSystemId;
        this.peerDbHomeId = peerDbHomeId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB
     * system in which to create the standby database. You must supply this value if creationType is
     * {@code ExistingDbSystem}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerDbSystemId")
    private final String peerDbSystemId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB
     * system in which to create the standby database. You must supply this value if creationType is
     * {@code ExistingDbSystem}.
     *
     * @return the value
     */
    public String getPeerDbSystemId() {
        return peerDbSystemId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB
     * home in which to create the standby database. You must supply this value to create standby
     * database with an existing DB home
     */
    @com.fasterxml.jackson.annotation.JsonProperty("peerDbHomeId")
    private final String peerDbHomeId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB
     * home in which to create the standby database. You must supply this value to create standby
     * database with an existing DB home
     *
     * @return the value
     */
    public String getPeerDbHomeId() {
        return peerDbHomeId;
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
        sb.append("CreateDataGuardAssociationToExistingDbSystemDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", peerDbSystemId=").append(String.valueOf(this.peerDbSystemId));
        sb.append(", peerDbHomeId=").append(String.valueOf(this.peerDbHomeId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDataGuardAssociationToExistingDbSystemDetails)) {
            return false;
        }

        CreateDataGuardAssociationToExistingDbSystemDetails other =
                (CreateDataGuardAssociationToExistingDbSystemDetails) o;
        return java.util.Objects.equals(this.peerDbSystemId, other.peerDbSystemId)
                && java.util.Objects.equals(this.peerDbHomeId, other.peerDbHomeId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.peerDbSystemId == null ? 43 : this.peerDbSystemId.hashCode());
        result = (result * PRIME) + (this.peerDbHomeId == null ? 43 : this.peerDbHomeId.hashCode());
        return result;
    }
}
