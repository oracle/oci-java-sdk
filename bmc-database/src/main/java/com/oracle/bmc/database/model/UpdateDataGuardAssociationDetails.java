/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The configuration details for updating a Data Guard association for a database.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateDataGuardAssociationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class UpdateDataGuardAssociationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDataGuardAssociationDetails build() {
            UpdateDataGuardAssociationDetails __instance__ =
                    new UpdateDataGuardAssociationDetails(
                            databaseAdminPassword, protectionMode, transportType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDataGuardAssociationDetails o) {
            Builder copiedBuilder =
                    databaseAdminPassword(o.getDatabaseAdminPassword())
                            .protectionMode(o.getProtectionMode())
                            .transportType(o.getTransportType());

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

    /**
     * A strong password for the 'SYS', 'SYSTEM', and 'PDB Admin' users to apply during standby creation.
     * <p>
     * The password must contain no fewer than nine characters and include:
     * <p>
     * At least two uppercase characters.
     * <p>
     * At least two lowercase characters.
     * <p>
     * At least two numeric characters.
     * <p>
     * At least two special characters. Valid special characters include \"_\", \"#\", and \"-\" only.
     * <p>
     **The password MUST be the same as the primary admin password.**
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("databaseAdminPassword")
    String databaseAdminPassword;
    /**
     * The protection mode for the Data Guard association's primary and standby database. For more information, see
     * [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
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
     * The protection mode for the Data Guard association's primary and standby database. For more information, see
     * [Oracle Data Guard Protection Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
    ProtectionMode protectionMode;
    /**
     * The redo transport type to use for this Data Guard association.  Valid values depend on the specified 'protectionMode':
     * * MAXIMUM_AVAILABILITY - Use SYNC or FASTSYNC
     * * MAXIMUM_PERFORMANCE - Use ASYNC
     * * MAXIMUM_PROTECTION - Use SYNC
     * <p>
     * For more information, see
     * [Redo Transport Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
     * in the Oracle Data Guard documentation.
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
     * The redo transport type to use for this Data Guard association.  Valid values depend on the specified 'protectionMode':
     * * MAXIMUM_AVAILABILITY - Use SYNC or FASTSYNC
     * * MAXIMUM_PERFORMANCE - Use ASYNC
     * * MAXIMUM_PROTECTION - Use SYNC
     * <p>
     * For more information, see
     * [Redo Transport Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
     * in the Oracle Data Guard documentation.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("transportType")
    TransportType transportType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
