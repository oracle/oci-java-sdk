/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Backup destination for the TDE wallet backups. <br>
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
        builder = TdeWalletBackupDestination.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TdeWalletBackupDestination
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"backupDestinationType", "backupDestinationId"})
    public TdeWalletBackupDestination(
            BackupDestinationType backupDestinationType, String backupDestinationId) {
        super();
        this.backupDestinationType = backupDestinationType;
        this.backupDestinationId = backupDestinationId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Destination where TDE Wallet backups are to be placed. */
        @com.fasterxml.jackson.annotation.JsonProperty("backupDestinationType")
        private BackupDestinationType backupDestinationType;

        /**
         * Destination where TDE Wallet backups are to be placed.
         *
         * @param backupDestinationType the value to set
         * @return this builder
         */
        public Builder backupDestinationType(BackupDestinationType backupDestinationType) {
            this.backupDestinationType = backupDestinationType;
            this.__explicitlySet__.add("backupDestinationType");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * backup destination.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("backupDestinationId")
        private String backupDestinationId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * backup destination.
         *
         * @param backupDestinationId the value to set
         * @return this builder
         */
        public Builder backupDestinationId(String backupDestinationId) {
            this.backupDestinationId = backupDestinationId;
            this.__explicitlySet__.add("backupDestinationId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TdeWalletBackupDestination build() {
            TdeWalletBackupDestination model =
                    new TdeWalletBackupDestination(
                            this.backupDestinationType, this.backupDestinationId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TdeWalletBackupDestination model) {
            if (model.wasPropertyExplicitlySet("backupDestinationType")) {
                this.backupDestinationType(model.getBackupDestinationType());
            }
            if (model.wasPropertyExplicitlySet("backupDestinationId")) {
                this.backupDestinationId(model.getBackupDestinationId());
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

    /** Destination where TDE Wallet backups are to be placed. */
    public enum BackupDestinationType implements com.oracle.bmc.http.internal.BmcEnum {
        Oss("OSS"),
        Nfs("NFS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(BackupDestinationType.class);

        private final String value;
        private static java.util.Map<String, BackupDestinationType> map;

        static {
            map = new java.util.HashMap<>();
            for (BackupDestinationType v : BackupDestinationType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BackupDestinationType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BackupDestinationType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BackupDestinationType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Destination where TDE Wallet backups are to be placed. */
    @com.fasterxml.jackson.annotation.JsonProperty("backupDestinationType")
    private final BackupDestinationType backupDestinationType;

    /**
     * Destination where TDE Wallet backups are to be placed.
     *
     * @return the value
     */
    public BackupDestinationType getBackupDestinationType() {
        return backupDestinationType;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * backup destination.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("backupDestinationId")
    private final String backupDestinationId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * backup destination.
     *
     * @return the value
     */
    public String getBackupDestinationId() {
        return backupDestinationId;
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
        sb.append("TdeWalletBackupDestination(");
        sb.append("super=").append(super.toString());
        sb.append("backupDestinationType=").append(String.valueOf(this.backupDestinationType));
        sb.append(", backupDestinationId=").append(String.valueOf(this.backupDestinationId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TdeWalletBackupDestination)) {
            return false;
        }

        TdeWalletBackupDestination other = (TdeWalletBackupDestination) o;
        return java.util.Objects.equals(this.backupDestinationType, other.backupDestinationType)
                && java.util.Objects.equals(this.backupDestinationId, other.backupDestinationId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.backupDestinationType == null
                                ? 43
                                : this.backupDestinationType.hashCode());
        result =
                (result * PRIME)
                        + (this.backupDestinationId == null
                                ? 43
                                : this.backupDestinationId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
