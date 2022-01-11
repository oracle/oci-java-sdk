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
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
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

    /**
     * The database software image [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseSoftwareImageId")
    String databaseSoftwareImageId;

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
    String databaseAdminPassword;
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
    ProtectionMode protectionMode;
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
    TransportType transportType;

    /**
     * True if active Data Guard is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isActiveDataGuardEnabled")
    Boolean isActiveDataGuardEnabled;

    /**
     * Specifies the {@code DB_UNIQUE_NAME} of the peer database to be created.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerDbUniqueName")
    String peerDbUniqueName;

    /**
     * Specifies a prefix for the {@code Oracle SID} of the database to be created.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("peerSidPrefix")
    String peerSidPrefix;
}
