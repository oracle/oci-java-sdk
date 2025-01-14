/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of bonding mode for Client and Backup and DR networks of an Exadata infrastructure. <br>
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
        builder = NetworkBondingModeDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class NetworkBondingModeDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "clientNetworkBondingMode",
        "backupNetworkBondingMode",
        "drNetworkBondingMode"
    })
    public NetworkBondingModeDetails(
            ClientNetworkBondingMode clientNetworkBondingMode,
            BackupNetworkBondingMode backupNetworkBondingMode,
            DrNetworkBondingMode drNetworkBondingMode) {
        super();
        this.clientNetworkBondingMode = clientNetworkBondingMode;
        this.backupNetworkBondingMode = backupNetworkBondingMode;
        this.drNetworkBondingMode = drNetworkBondingMode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The network bonding mode for the Exadata infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("clientNetworkBondingMode")
        private ClientNetworkBondingMode clientNetworkBondingMode;

        /**
         * The network bonding mode for the Exadata infrastructure.
         *
         * @param clientNetworkBondingMode the value to set
         * @return this builder
         */
        public Builder clientNetworkBondingMode(ClientNetworkBondingMode clientNetworkBondingMode) {
            this.clientNetworkBondingMode = clientNetworkBondingMode;
            this.__explicitlySet__.add("clientNetworkBondingMode");
            return this;
        }
        /** The network bonding mode for the Exadata infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupNetworkBondingMode")
        private BackupNetworkBondingMode backupNetworkBondingMode;

        /**
         * The network bonding mode for the Exadata infrastructure.
         *
         * @param backupNetworkBondingMode the value to set
         * @return this builder
         */
        public Builder backupNetworkBondingMode(BackupNetworkBondingMode backupNetworkBondingMode) {
            this.backupNetworkBondingMode = backupNetworkBondingMode;
            this.__explicitlySet__.add("backupNetworkBondingMode");
            return this;
        }
        /** The network bonding mode for the Exadata infrastructure. */
        @com.fasterxml.jackson.annotation.JsonProperty("drNetworkBondingMode")
        private DrNetworkBondingMode drNetworkBondingMode;

        /**
         * The network bonding mode for the Exadata infrastructure.
         *
         * @param drNetworkBondingMode the value to set
         * @return this builder
         */
        public Builder drNetworkBondingMode(DrNetworkBondingMode drNetworkBondingMode) {
            this.drNetworkBondingMode = drNetworkBondingMode;
            this.__explicitlySet__.add("drNetworkBondingMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NetworkBondingModeDetails build() {
            NetworkBondingModeDetails model =
                    new NetworkBondingModeDetails(
                            this.clientNetworkBondingMode,
                            this.backupNetworkBondingMode,
                            this.drNetworkBondingMode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NetworkBondingModeDetails model) {
            if (model.wasPropertyExplicitlySet("clientNetworkBondingMode")) {
                this.clientNetworkBondingMode(model.getClientNetworkBondingMode());
            }
            if (model.wasPropertyExplicitlySet("backupNetworkBondingMode")) {
                this.backupNetworkBondingMode(model.getBackupNetworkBondingMode());
            }
            if (model.wasPropertyExplicitlySet("drNetworkBondingMode")) {
                this.drNetworkBondingMode(model.getDrNetworkBondingMode());
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

    /** The network bonding mode for the Exadata infrastructure. */
    public enum ClientNetworkBondingMode implements com.oracle.bmc.http.internal.BmcEnum {
        ActiveBackup("ACTIVE_BACKUP"),
        Lacp("LACP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ClientNetworkBondingMode.class);

        private final String value;
        private static java.util.Map<String, ClientNetworkBondingMode> map;

        static {
            map = new java.util.HashMap<>();
            for (ClientNetworkBondingMode v : ClientNetworkBondingMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ClientNetworkBondingMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ClientNetworkBondingMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ClientNetworkBondingMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The network bonding mode for the Exadata infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("clientNetworkBondingMode")
    private final ClientNetworkBondingMode clientNetworkBondingMode;

    /**
     * The network bonding mode for the Exadata infrastructure.
     *
     * @return the value
     */
    public ClientNetworkBondingMode getClientNetworkBondingMode() {
        return clientNetworkBondingMode;
    }

    /** The network bonding mode for the Exadata infrastructure. */
    public enum BackupNetworkBondingMode implements com.oracle.bmc.http.internal.BmcEnum {
        ActiveBackup("ACTIVE_BACKUP"),
        Lacp("LACP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BackupNetworkBondingMode.class);

        private final String value;
        private static java.util.Map<String, BackupNetworkBondingMode> map;

        static {
            map = new java.util.HashMap<>();
            for (BackupNetworkBondingMode v : BackupNetworkBondingMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BackupNetworkBondingMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BackupNetworkBondingMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BackupNetworkBondingMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The network bonding mode for the Exadata infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupNetworkBondingMode")
    private final BackupNetworkBondingMode backupNetworkBondingMode;

    /**
     * The network bonding mode for the Exadata infrastructure.
     *
     * @return the value
     */
    public BackupNetworkBondingMode getBackupNetworkBondingMode() {
        return backupNetworkBondingMode;
    }

    /** The network bonding mode for the Exadata infrastructure. */
    public enum DrNetworkBondingMode implements com.oracle.bmc.http.internal.BmcEnum {
        ActiveBackup("ACTIVE_BACKUP"),
        Lacp("LACP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DrNetworkBondingMode.class);

        private final String value;
        private static java.util.Map<String, DrNetworkBondingMode> map;

        static {
            map = new java.util.HashMap<>();
            for (DrNetworkBondingMode v : DrNetworkBondingMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DrNetworkBondingMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DrNetworkBondingMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DrNetworkBondingMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The network bonding mode for the Exadata infrastructure. */
    @com.fasterxml.jackson.annotation.JsonProperty("drNetworkBondingMode")
    private final DrNetworkBondingMode drNetworkBondingMode;

    /**
     * The network bonding mode for the Exadata infrastructure.
     *
     * @return the value
     */
    public DrNetworkBondingMode getDrNetworkBondingMode() {
        return drNetworkBondingMode;
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
        sb.append("NetworkBondingModeDetails(");
        sb.append("super=").append(super.toString());
        sb.append("clientNetworkBondingMode=")
                .append(String.valueOf(this.clientNetworkBondingMode));
        sb.append(", backupNetworkBondingMode=")
                .append(String.valueOf(this.backupNetworkBondingMode));
        sb.append(", drNetworkBondingMode=").append(String.valueOf(this.drNetworkBondingMode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NetworkBondingModeDetails)) {
            return false;
        }

        NetworkBondingModeDetails other = (NetworkBondingModeDetails) o;
        return java.util.Objects.equals(
                        this.clientNetworkBondingMode, other.clientNetworkBondingMode)
                && java.util.Objects.equals(
                        this.backupNetworkBondingMode, other.backupNetworkBondingMode)
                && java.util.Objects.equals(this.drNetworkBondingMode, other.drNetworkBondingMode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.clientNetworkBondingMode == null
                                ? 43
                                : this.clientNetworkBondingMode.hashCode());
        result =
                (result * PRIME)
                        + (this.backupNetworkBondingMode == null
                                ? 43
                                : this.backupNetworkBondingMode.hashCode());
        result =
                (result * PRIME)
                        + (this.drNetworkBondingMode == null
                                ? 43
                                : this.drNetworkBondingMode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
