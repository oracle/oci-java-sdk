/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * The configuration details for updating a Data Guard association for a database.
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateDataGuardAssociationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateDataGuardAssociationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "databaseAdminPassword",
        "protectionMode",
        "transportType",
        "isActiveDataGuardEnabled"
    })
    public UpdateDataGuardAssociationDetails(
            String databaseAdminPassword,
            ProtectionMode protectionMode,
            TransportType transportType,
            Boolean isActiveDataGuardEnabled) {
        super();
        this.databaseAdminPassword = databaseAdminPassword;
        this.protectionMode = protectionMode;
        this.transportType = transportType;
        this.isActiveDataGuardEnabled = isActiveDataGuardEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A strong password for the 'SYS', 'SYSTEM', and 'PDB Admin' users to apply during standby
         * creation.
         *
         * <p>The password must contain no fewer than nine characters and include:
         *
         * <p>At least two uppercase characters.
         *
         * <p>At least two lowercase characters.
         *
         * <p>At least two numeric characters.
         *
         * <p>At least two special characters. Valid special characters include "_", "#", and "-"
         * only.
         *
         * <p>*The password MUST be the same as the primary admin password.**
         */
        @com.fasterxml.jackson.annotation.JsonProperty("databaseAdminPassword")
        private String databaseAdminPassword;

        /**
         * A strong password for the 'SYS', 'SYSTEM', and 'PDB Admin' users to apply during standby
         * creation.
         *
         * <p>The password must contain no fewer than nine characters and include:
         *
         * <p>At least two uppercase characters.
         *
         * <p>At least two lowercase characters.
         *
         * <p>At least two numeric characters.
         *
         * <p>At least two special characters. Valid special characters include "_", "#", and "-"
         * only.
         *
         * <p>*The password MUST be the same as the primary admin password.**
         *
         * @param databaseAdminPassword the value to set
         * @return this builder
         */
        public Builder databaseAdminPassword(String databaseAdminPassword) {
            this.databaseAdminPassword = databaseAdminPassword;
            this.__explicitlySet__.add("databaseAdminPassword");
            return this;
        }
        /**
         * The protection mode for the Data Guard association's primary and standby database. For
         * more information, see [Oracle Data Guard Protection
         * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
         * in the Oracle Data Guard documentation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
        private ProtectionMode protectionMode;

        /**
         * The protection mode for the Data Guard association's primary and standby database. For
         * more information, see [Oracle Data Guard Protection
         * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
         * in the Oracle Data Guard documentation.
         *
         * @param protectionMode the value to set
         * @return this builder
         */
        public Builder protectionMode(ProtectionMode protectionMode) {
            this.protectionMode = protectionMode;
            this.__explicitlySet__.add("protectionMode");
            return this;
        }
        /**
         * The redo transport type to use for this Data Guard association. Valid values depend on
         * the specified 'protectionMode': * MAXIMUM_AVAILABILITY - Use SYNC or FASTSYNC *
         * MAXIMUM_PERFORMANCE - Use ASYNC * MAXIMUM_PROTECTION - Use SYNC
         *
         * <p>For more information, see [Redo Transport
         * Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
         * in the Oracle Data Guard documentation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("transportType")
        private TransportType transportType;

        /**
         * The redo transport type to use for this Data Guard association. Valid values depend on
         * the specified 'protectionMode': * MAXIMUM_AVAILABILITY - Use SYNC or FASTSYNC *
         * MAXIMUM_PERFORMANCE - Use ASYNC * MAXIMUM_PROTECTION - Use SYNC
         *
         * <p>For more information, see [Redo Transport
         * Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
         * in the Oracle Data Guard documentation.
         *
         * @param transportType the value to set
         * @return this builder
         */
        public Builder transportType(TransportType transportType) {
            this.transportType = transportType;
            this.__explicitlySet__.add("transportType");
            return this;
        }
        /**
         * True if active Data Guard is enabled. Update this parameter to change the Data Guard
         * setting.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isActiveDataGuardEnabled")
        private Boolean isActiveDataGuardEnabled;

        /**
         * True if active Data Guard is enabled. Update this parameter to change the Data Guard
         * setting.
         *
         * @param isActiveDataGuardEnabled the value to set
         * @return this builder
         */
        public Builder isActiveDataGuardEnabled(Boolean isActiveDataGuardEnabled) {
            this.isActiveDataGuardEnabled = isActiveDataGuardEnabled;
            this.__explicitlySet__.add("isActiveDataGuardEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDataGuardAssociationDetails build() {
            UpdateDataGuardAssociationDetails model =
                    new UpdateDataGuardAssociationDetails(
                            this.databaseAdminPassword,
                            this.protectionMode,
                            this.transportType,
                            this.isActiveDataGuardEnabled);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDataGuardAssociationDetails model) {
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

    /**
     * A strong password for the 'SYS', 'SYSTEM', and 'PDB Admin' users to apply during standby
     * creation.
     *
     * <p>The password must contain no fewer than nine characters and include:
     *
     * <p>At least two uppercase characters.
     *
     * <p>At least two lowercase characters.
     *
     * <p>At least two numeric characters.
     *
     * <p>At least two special characters. Valid special characters include "_", "#", and "-" only.
     *
     * <p>*The password MUST be the same as the primary admin password.**
     */
    @com.fasterxml.jackson.annotation.JsonProperty("databaseAdminPassword")
    private final String databaseAdminPassword;

    /**
     * A strong password for the 'SYS', 'SYSTEM', and 'PDB Admin' users to apply during standby
     * creation.
     *
     * <p>The password must contain no fewer than nine characters and include:
     *
     * <p>At least two uppercase characters.
     *
     * <p>At least two lowercase characters.
     *
     * <p>At least two numeric characters.
     *
     * <p>At least two special characters. Valid special characters include "_", "#", and "-" only.
     *
     * <p>*The password MUST be the same as the primary admin password.**
     *
     * @return the value
     */
    public String getDatabaseAdminPassword() {
        return databaseAdminPassword;
    }

    /**
     * The protection mode for the Data Guard association's primary and standby database. For more
     * information, see [Oracle Data Guard Protection
     * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     */
    public enum ProtectionMode implements com.oracle.bmc.http.internal.BmcEnum {
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
     * The protection mode for the Data Guard association's primary and standby database. For more
     * information, see [Oracle Data Guard Protection
     * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("protectionMode")
    private final ProtectionMode protectionMode;

    /**
     * The protection mode for the Data Guard association's primary and standby database. For more
     * information, see [Oracle Data Guard Protection
     * Modes](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-protection-modes.htm#SBYDB02000)
     * in the Oracle Data Guard documentation.
     *
     * @return the value
     */
    public ProtectionMode getProtectionMode() {
        return protectionMode;
    }

    /**
     * The redo transport type to use for this Data Guard association. Valid values depend on the
     * specified 'protectionMode': * MAXIMUM_AVAILABILITY - Use SYNC or FASTSYNC *
     * MAXIMUM_PERFORMANCE - Use ASYNC * MAXIMUM_PROTECTION - Use SYNC
     *
     * <p>For more information, see [Redo Transport
     * Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
     * in the Oracle Data Guard documentation.
     */
    public enum TransportType implements com.oracle.bmc.http.internal.BmcEnum {
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
     * The redo transport type to use for this Data Guard association. Valid values depend on the
     * specified 'protectionMode': * MAXIMUM_AVAILABILITY - Use SYNC or FASTSYNC *
     * MAXIMUM_PERFORMANCE - Use ASYNC * MAXIMUM_PROTECTION - Use SYNC
     *
     * <p>For more information, see [Redo Transport
     * Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
     * in the Oracle Data Guard documentation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("transportType")
    private final TransportType transportType;

    /**
     * The redo transport type to use for this Data Guard association. Valid values depend on the
     * specified 'protectionMode': * MAXIMUM_AVAILABILITY - Use SYNC or FASTSYNC *
     * MAXIMUM_PERFORMANCE - Use ASYNC * MAXIMUM_PROTECTION - Use SYNC
     *
     * <p>For more information, see [Redo Transport
     * Services](http://docs.oracle.com/database/122/SBYDB/oracle-data-guard-redo-transport-services.htm#SBYDB00400)
     * in the Oracle Data Guard documentation.
     *
     * @return the value
     */
    public TransportType getTransportType() {
        return transportType;
    }

    /**
     * True if active Data Guard is enabled. Update this parameter to change the Data Guard setting.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isActiveDataGuardEnabled")
    private final Boolean isActiveDataGuardEnabled;

    /**
     * True if active Data Guard is enabled. Update this parameter to change the Data Guard setting.
     *
     * @return the value
     */
    public Boolean getIsActiveDataGuardEnabled() {
        return isActiveDataGuardEnabled;
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
        sb.append("UpdateDataGuardAssociationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("databaseAdminPassword=").append(String.valueOf(this.databaseAdminPassword));
        sb.append(", protectionMode=").append(String.valueOf(this.protectionMode));
        sb.append(", transportType=").append(String.valueOf(this.transportType));
        sb.append(", isActiveDataGuardEnabled=")
                .append(String.valueOf(this.isActiveDataGuardEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDataGuardAssociationDetails)) {
            return false;
        }

        UpdateDataGuardAssociationDetails other = (UpdateDataGuardAssociationDetails) o;
        return java.util.Objects.equals(this.databaseAdminPassword, other.databaseAdminPassword)
                && java.util.Objects.equals(this.protectionMode, other.protectionMode)
                && java.util.Objects.equals(this.transportType, other.transportType)
                && java.util.Objects.equals(
                        this.isActiveDataGuardEnabled, other.isActiveDataGuardEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
