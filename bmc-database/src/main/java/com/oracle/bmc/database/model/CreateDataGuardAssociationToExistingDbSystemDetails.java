/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The configuration details for creating a Data Guard association for a bare metal or Exadata DB system database. For these types of DB system databases, the `creationType` should be `ExistingDbSystem`. A standby database will be created in the DB system you specify.
 * <p>
 * To create a Data Guard association for a database in a virtual machine DB system, use the {@link #createDataGuardAssociationWithNewDbSystemDetails(CreateDataGuardAssociationWithNewDbSystemDetailsRequest) createDataGuardAssociationWithNewDbSystemDetails} subtype instead.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateDataGuardAssociationToExistingDbSystemDetails.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "creationType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateDataGuardAssociationToExistingDbSystemDetails
        extends CreateDataGuardAssociationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

        @com.fasterxml.jackson.annotation.JsonProperty("peerDbSystemId")
        private String peerDbSystemId;

        public Builder peerDbSystemId(String peerDbSystemId) {
            this.peerDbSystemId = peerDbSystemId;
            this.__explicitlySet__.add("peerDbSystemId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("peerDbHomeId")
        private String peerDbHomeId;

        public Builder peerDbHomeId(String peerDbHomeId) {
            this.peerDbHomeId = peerDbHomeId;
            this.__explicitlySet__.add("peerDbHomeId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateDataGuardAssociationToExistingDbSystemDetails build() {
            CreateDataGuardAssociationToExistingDbSystemDetails __instance__ =
                    new CreateDataGuardAssociationToExistingDbSystemDetails(
                            databaseSoftwareImageId,
                            databaseAdminPassword,
                            protectionMode,
                            transportType,
                            peerDbSystemId,
                            peerDbHomeId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateDataGuardAssociationToExistingDbSystemDetails o) {
            Builder copiedBuilder =
                    databaseSoftwareImageId(o.getDatabaseSoftwareImageId())
                            .databaseAdminPassword(o.getDatabaseAdminPassword())
                            .protectionMode(o.getProtectionMode())
                            .transportType(o.getTransportType())
                            .peerDbSystemId(o.getPeerDbSystemId())
                            .peerDbHomeId(o.getPeerDbHomeId());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    @Deprecated
    public CreateDataGuardAssociationToExistingDbSystemDetails(
            String databaseSoftwareImageId,
            String databaseAdminPassword,
            ProtectionMode protectionMode,
            TransportType transportType,
            String peerDbSystemId,
            String peerDbHomeId) {
        super(databaseSoftwareImageId, databaseAdminPassword, protectionMode, transportType);
        this.peerDbSystemId = peerDbSystemId;
        this.peerDbHomeId = peerDbHomeId;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB system in which to create the standby database.
     * You must supply this value if creationType is `ExistingDbSystem`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerDbSystemId")
    String peerDbSystemId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the DB home in which to create the standby database.
     * You must supply this value to create standby database with an existing DB home
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerDbHomeId")
    String peerDbHomeId;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
