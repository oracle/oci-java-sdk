/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The configuration details for creating a Data Guard association between databases.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
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
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "creationType",
    defaultImpl = CreateDataGuardAssociationDetails.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateDataGuardAssociationWithNewDbSystemDetails.class,
        name = "NewDbSystem"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateDataGuardAssociationToExistingVmClusterDetails.class,
        name = "ExistingVmCluster"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = CreateDataGuardAssociationToExistingDbSystemDetails.class,
        name = "ExistingDbSystem"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateDataGuardAssociationDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "databaseSoftwareImageId",
        "databaseAdminPassword",
        "protectionMode",
        "transportType",
        "isActiveDataGuardEnabled",
        "peerDbUniqueName",
        "peerSidPrefix"
    })
    protected CreateDataGuardAssociationDetails(
            String databaseSoftwareImageId,
            String databaseAdminPassword,
            ProtectionMode protectionMode,
            TransportType transportType,
            Boolean isActiveDataGuardEnabled,
            String peerDbUniqueName,
            String peerSidPrefix) {
        super();
        this.databaseSoftwareImageId = databaseSoftwareImageId;
        this.databaseAdminPassword = databaseAdminPassword;
        this.protectionMode = protectionMode;
        this.transportType = transportType;
        this.isActiveDataGuardEnabled = isActiveDataGuardEnabled;
        this.peerDbUniqueName = peerDbUniqueName;
        this.peerSidPrefix = peerSidPrefix;
    }

    /**
     * The database software image [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageId")
    private final String databaseSoftwareImageId;

    /**
     * The database software image [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     * @return the value
     **/
    public String getDatabaseSoftwareImageId() {
        return databaseSoftwareImageId;
    }

    /**
     * A strong password for the {@code SYS}, {@code SYSTEM}, and {@code PDB Admin} users to apply during standby creation.
     * <p>
     * The password must contain no fewer than nine characters and include:
     * <p>
     * At least two uppercase characters.
     * <p>
     * At least two lowercase characters.
     * <p>
     * At least two numeric characters.
     * <p>
     * At least two special characters. Valid special characters include "_", "#", and "-" only.
     * <p>
     **The password MUST be the same as the primary admin password.**
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseAdminPassword")
    private final String databaseAdminPassword;

    /**
     * A strong password for the {@code SYS}, {@code SYSTEM}, and {@code PDB Admin} users to apply during standby creation.
     * <p>
     * The password must contain no fewer than nine characters and include:
     * <p>
     * At least two uppercase characters.
     * <p>
     * At least two lowercase characters.
     * <p>
     * At least two numeric characters.
     * <p>
     * At least two special characters. Valid special characters include "_", "#", and "-" only.
     * <p>
     **The password MUST be the same as the primary admin password.**
     *
     * @return the value
     **/
    public String getDatabaseAdminPassword() {
        return databaseAdminPassword;
    }

    /**
     * The protection mode to set up between the primary and standby databases. For more information, see
     * [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     * <p>
     **IMPORTANT** - The only protection mode currently supported by the Database service is MAXIMUM_PERFORMANCE.
     *
     **/
    public enum ProtectionMode {
        MaximumAvailability("MAXIMUM_AVAILABILITY"),
        MaximumPerformance("MAXIMUM_PERFORMANCE"),
        MaximumProtection("MAXIMUM_PROTECTION"),
        ;

        private final String value;
        private static java.util.Map<String, ProtectionMode> map;

        static {
            map = new java.util.HashMap<>();
            for (ProtectionMode v : ProtectionMode.values()) {
                map.put(v.getValue(), v);
            }
        }

        ProtectionMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ProtectionMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ProtectionMode: " + key);
        }
    };
    /**
     * The protection mode to set up between the primary and standby databases. For more information, see
     * [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     * <p>
     **IMPORTANT** - The only protection mode currently supported by the Database service is MAXIMUM_PERFORMANCE.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
    private final ProtectionMode protectionMode;

    /**
     * The protection mode to set up between the primary and standby databases. For more information, see
     * [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     * <p>
     **IMPORTANT** - The only protection mode currently supported by the Database service is MAXIMUM_PERFORMANCE.
     *
     * @return the value
     **/
    public ProtectionMode getProtectionMode() {
        return protectionMode;
    }

    /**
     * The redo transport type to use for this Data Guard association.  Valid values depend on the specified {@code protectionMode}:
     * <p>
     * MAXIMUM_AVAILABILITY - SYNC or FASTSYNC
     * * MAXIMUM_PERFORMANCE - ASYNC
     * * MAXIMUM_PROTECTION - SYNC
     * <p>
     * For more information, see
     * [Redo Transport Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
     * in the Oracle Data Guard documentation.
     * <p>
     **IMPORTANT** - The only transport type currently supported by the Database service is ASYNC.
     *
     **/
    public enum TransportType {
        Sync("SYNC"),
        Async("ASYNC"),
        Fastsync("FASTSYNC"),
        ;

        private final String value;
        private static java.util.Map<String, TransportType> map;

        static {
            map = new java.util.HashMap<>();
            for (TransportType v : TransportType.values()) {
                map.put(v.getValue(), v);
            }
        }

        TransportType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static TransportType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid TransportType: " + key);
        }
    };
    /**
     * The redo transport type to use for this Data Guard association.  Valid values depend on the specified {@code protectionMode}:
     * <p>
     * MAXIMUM_AVAILABILITY - SYNC or FASTSYNC
     * * MAXIMUM_PERFORMANCE - ASYNC
     * * MAXIMUM_PROTECTION - SYNC
     * <p>
     * For more information, see
     * [Redo Transport Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
     * in the Oracle Data Guard documentation.
     * <p>
     **IMPORTANT** - The only transport type currently supported by the Database service is ASYNC.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("transportType")
    private final TransportType transportType;

    /**
     * The redo transport type to use for this Data Guard association.  Valid values depend on the specified {@code protectionMode}:
     * <p>
     * MAXIMUM_AVAILABILITY - SYNC or FASTSYNC
     * * MAXIMUM_PERFORMANCE - ASYNC
     * * MAXIMUM_PROTECTION - SYNC
     * <p>
     * For more information, see
     * [Redo Transport Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
     * in the Oracle Data Guard documentation.
     * <p>
     **IMPORTANT** - The only transport type currently supported by the Database service is ASYNC.
     *
     * @return the value
     **/
    public TransportType getTransportType() {
        return transportType;
    }

    /**
     * True if active Data Guard is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isActiveDataGuardEnabled")
    private final Boolean isActiveDataGuardEnabled;

    /**
     * True if active Data Guard is enabled.
     * @return the value
     **/
    public Boolean getIsActiveDataGuardEnabled() {
        return isActiveDataGuardEnabled;
    }

    /**
     * Specifies the {@code DB_UNIQUE_NAME} of the peer database to be created.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerDbUniqueName")
    private final String peerDbUniqueName;

    /**
     * Specifies the {@code DB_UNIQUE_NAME} of the peer database to be created.
     *
     * @return the value
     **/
    public String getPeerDbUniqueName() {
        return peerDbUniqueName;
    }

    /**
     * Specifies a prefix for the {@code Oracle SID} of the database to be created.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerSidPrefix")
    private final String peerSidPrefix;

    /**
     * Specifies a prefix for the {@code Oracle SID} of the database to be created.
     *
     * @return the value
     **/
    public String getPeerSidPrefix() {
        return peerSidPrefix;
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
        sb.append("CreateDataGuardAssociationDetails(");
        sb.append("databaseSoftwareImageId=").append(String.valueOf(this.databaseSoftwareImageId));
        sb.append(", databaseAdminPassword=").append(String.valueOf(this.databaseAdminPassword));
        sb.append(", protectionMode=").append(String.valueOf(this.protectionMode));
        sb.append(", transportType=").append(String.valueOf(this.transportType));
        sb.append(", isActiveDataGuardEnabled=")
                .append(String.valueOf(this.isActiveDataGuardEnabled));
        sb.append(", peerDbUniqueName=").append(String.valueOf(this.peerDbUniqueName));
        sb.append(", peerSidPrefix=").append(String.valueOf(this.peerSidPrefix));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateDataGuardAssociationDetails)) {
            return false;
        }

        CreateDataGuardAssociationDetails other = (CreateDataGuardAssociationDetails) o;
        return java.util.Objects.equals(this.databaseSoftwareImageId, other.databaseSoftwareImageId)
                && java.util.Objects.equals(this.databaseAdminPassword, other.databaseAdminPassword)
                && java.util.Objects.equals(this.protectionMode, other.protectionMode)
                && java.util.Objects.equals(this.transportType, other.transportType)
                && java.util.Objects.equals(
                        this.isActiveDataGuardEnabled, other.isActiveDataGuardEnabled)
                && java.util.Objects.equals(this.peerDbUniqueName, other.peerDbUniqueName)
                && java.util.Objects.equals(this.peerSidPrefix, other.peerSidPrefix);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.databaseSoftwareImageId == null
                                ? 43
                                : this.databaseSoftwareImageId.hashCode());
        result =
                (result * PRIME)
                        + (this.databaseAdminPassword == null
                                ? 43
                                : this.databaseAdminPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.protectionMode == null ? 43 : this.protectionMode.hashCode());
        result =
                (result * PRIME)
                        + (this.transportType == null ? 43 : this.transportType.hashCode());
        result =
                (result * PRIME)
                        + (this.isActiveDataGuardEnabled == null
                                ? 43
                                : this.isActiveDataGuardEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.peerDbUniqueName == null ? 43 : this.peerDbUniqueName.hashCode());
        result =
                (result * PRIME)
                        + (this.peerSidPrefix == null ? 43 : this.peerSidPrefix.hashCode());
        return result;
    }
}
