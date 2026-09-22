/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Transparent data encryption posture details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CryptoTdePosture.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CryptoTdePosture
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "status",
        "encryptionConfigured",
        "redoEncryptionObserved",
        "dbCredentialsEncryptionObserved",
        "integrityConfigured",
        "encryptedTablespacesCount",
        "unencryptedTablespacesCount",
        "masterKeyId",
        "walletLocation",
        "masterKeyEncryptionAlgorithm",
        "timeMasterKeyLastRotation",
        "keyStoreType",
        "keyCacheStatus",
        "fipsModeConfigured",
        "quantumReadiness"
    })
    public CryptoTdePosture(
            CryptoFeatureStatus status,
            java.util.List<String> encryptionConfigured,
            String redoEncryptionObserved,
            String dbCredentialsEncryptionObserved,
            java.util.List<String> integrityConfigured,
            Integer encryptedTablespacesCount,
            Integer unencryptedTablespacesCount,
            String masterKeyId,
            String walletLocation,
            String masterKeyEncryptionAlgorithm,
            java.util.Date timeMasterKeyLastRotation,
            CryptoKeystoreType keyStoreType,
            CryptoKeyCacheStatus keyCacheStatus,
            CryptoPosture.FipsModeConfigured fipsModeConfigured,
            CryptoQuantumReadiness quantumReadiness) {
        super();
        this.status = status;
        this.encryptionConfigured = encryptionConfigured;
        this.redoEncryptionObserved = redoEncryptionObserved;
        this.dbCredentialsEncryptionObserved = dbCredentialsEncryptionObserved;
        this.integrityConfigured = integrityConfigured;
        this.encryptedTablespacesCount = encryptedTablespacesCount;
        this.unencryptedTablespacesCount = unencryptedTablespacesCount;
        this.masterKeyId = masterKeyId;
        this.walletLocation = walletLocation;
        this.masterKeyEncryptionAlgorithm = masterKeyEncryptionAlgorithm;
        this.timeMasterKeyLastRotation = timeMasterKeyLastRotation;
        this.keyStoreType = keyStoreType;
        this.keyCacheStatus = keyCacheStatus;
        this.fipsModeConfigured = fipsModeConfigured;
        this.quantumReadiness = quantumReadiness;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** TDE enablement status. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private CryptoFeatureStatus status;

        /**
         * TDE enablement status.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(CryptoFeatureStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Configured TDE encryption algorithm. */
        @com.fasterxml.jackson.annotation.JsonProperty("encryptionConfigured")
        private java.util.List<String> encryptionConfigured;

        /**
         * Configured TDE encryption algorithm.
         *
         * @param encryptionConfigured the value to set
         * @return this builder
         */
        public Builder encryptionConfigured(java.util.List<String> encryptionConfigured) {
            this.encryptionConfigured = encryptionConfigured;
            this.__explicitlySet__.add("encryptionConfigured");
            return this;
        }
        /** Observed redo log encryption algorithm. */
        @com.fasterxml.jackson.annotation.JsonProperty("redoEncryptionObserved")
        private String redoEncryptionObserved;

        /**
         * Observed redo log encryption algorithm.
         *
         * @param redoEncryptionObserved the value to set
         * @return this builder
         */
        public Builder redoEncryptionObserved(String redoEncryptionObserved) {
            this.redoEncryptionObserved = redoEncryptionObserved;
            this.__explicitlySet__.add("redoEncryptionObserved");
            return this;
        }
        /** Observed DB credentials encryption algorithm. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbCredentialsEncryptionObserved")
        private String dbCredentialsEncryptionObserved;

        /**
         * Observed DB credentials encryption algorithm.
         *
         * @param dbCredentialsEncryptionObserved the value to set
         * @return this builder
         */
        public Builder dbCredentialsEncryptionObserved(String dbCredentialsEncryptionObserved) {
            this.dbCredentialsEncryptionObserved = dbCredentialsEncryptionObserved;
            this.__explicitlySet__.add("dbCredentialsEncryptionObserved");
            return this;
        }
        /** Configured TDE integrity-related setting. */
        @com.fasterxml.jackson.annotation.JsonProperty("integrityConfigured")
        private java.util.List<String> integrityConfigured;

        /**
         * Configured TDE integrity-related setting.
         *
         * @param integrityConfigured the value to set
         * @return this builder
         */
        public Builder integrityConfigured(java.util.List<String> integrityConfigured) {
            this.integrityConfigured = integrityConfigured;
            this.__explicitlySet__.add("integrityConfigured");
            return this;
        }
        /** Number of encrypted tablespaces detected. */
        @com.fasterxml.jackson.annotation.JsonProperty("encryptedTablespacesCount")
        private Integer encryptedTablespacesCount;

        /**
         * Number of encrypted tablespaces detected.
         *
         * @param encryptedTablespacesCount the value to set
         * @return this builder
         */
        public Builder encryptedTablespacesCount(Integer encryptedTablespacesCount) {
            this.encryptedTablespacesCount = encryptedTablespacesCount;
            this.__explicitlySet__.add("encryptedTablespacesCount");
            return this;
        }
        /** Number of unencrypted tablespaces detected. */
        @com.fasterxml.jackson.annotation.JsonProperty("unencryptedTablespacesCount")
        private Integer unencryptedTablespacesCount;

        /**
         * Number of unencrypted tablespaces detected.
         *
         * @param unencryptedTablespacesCount the value to set
         * @return this builder
         */
        public Builder unencryptedTablespacesCount(Integer unencryptedTablespacesCount) {
            this.unencryptedTablespacesCount = unencryptedTablespacesCount;
            this.__explicitlySet__.add("unencryptedTablespacesCount");
            return this;
        }
        /** The observed TDE master key identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("masterKeyId")
        private String masterKeyId;

        /**
         * The observed TDE master key identifier.
         *
         * @param masterKeyId the value to set
         * @return this builder
         */
        public Builder masterKeyId(String masterKeyId) {
            this.masterKeyId = masterKeyId;
            this.__explicitlySet__.add("masterKeyId");
            return this;
        }
        /** The observed wallet location for TDE keys. */
        @com.fasterxml.jackson.annotation.JsonProperty("walletLocation")
        private String walletLocation;

        /**
         * The observed wallet location for TDE keys.
         *
         * @param walletLocation the value to set
         * @return this builder
         */
        public Builder walletLocation(String walletLocation) {
            this.walletLocation = walletLocation;
            this.__explicitlySet__.add("walletLocation");
            return this;
        }
        /** The observed encryption algorithm used by the master key. */
        @com.fasterxml.jackson.annotation.JsonProperty("masterKeyEncryptionAlgorithm")
        private String masterKeyEncryptionAlgorithm;

        /**
         * The observed encryption algorithm used by the master key.
         *
         * @param masterKeyEncryptionAlgorithm the value to set
         * @return this builder
         */
        public Builder masterKeyEncryptionAlgorithm(String masterKeyEncryptionAlgorithm) {
            this.masterKeyEncryptionAlgorithm = masterKeyEncryptionAlgorithm;
            this.__explicitlySet__.add("masterKeyEncryptionAlgorithm");
            return this;
        }
        /** The last observed rotation time for the TDE master key, in RFC3339 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeMasterKeyLastRotation")
        private java.util.Date timeMasterKeyLastRotation;

        /**
         * The last observed rotation time for the TDE master key, in RFC3339 format.
         *
         * @param timeMasterKeyLastRotation the value to set
         * @return this builder
         */
        public Builder timeMasterKeyLastRotation(java.util.Date timeMasterKeyLastRotation) {
            this.timeMasterKeyLastRotation = timeMasterKeyLastRotation;
            this.__explicitlySet__.add("timeMasterKeyLastRotation");
            return this;
        }
        /** The observed TDE key store type. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyStoreType")
        private CryptoKeystoreType keyStoreType;

        /**
         * The observed TDE key store type.
         *
         * @param keyStoreType the value to set
         * @return this builder
         */
        public Builder keyStoreType(CryptoKeystoreType keyStoreType) {
            this.keyStoreType = keyStoreType;
            this.__explicitlySet__.add("keyStoreType");
            return this;
        }
        /** The observed TDE key cache status. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyCacheStatus")
        private CryptoKeyCacheStatus keyCacheStatus;

        /**
         * The observed TDE key cache status.
         *
         * @param keyCacheStatus the value to set
         * @return this builder
         */
        public Builder keyCacheStatus(CryptoKeyCacheStatus keyCacheStatus) {
            this.keyCacheStatus = keyCacheStatus;
            this.__explicitlySet__.add("keyCacheStatus");
            return this;
        }
        /**
         * FIPS mode configured for TDE when the target uses legacy per-feature FIPS configuration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fipsModeConfigured")
        private CryptoPosture.FipsModeConfigured fipsModeConfigured;

        /**
         * FIPS mode configured for TDE when the target uses legacy per-feature FIPS configuration.
         *
         * @param fipsModeConfigured the value to set
         * @return this builder
         */
        public Builder fipsModeConfigured(CryptoPosture.FipsModeConfigured fipsModeConfigured) {
            this.fipsModeConfigured = fipsModeConfigured;
            this.__explicitlySet__.add("fipsModeConfigured");
            return this;
        }
        /** Quantum-readiness classification for TDE posture. */
        @com.fasterxml.jackson.annotation.JsonProperty("quantumReadiness")
        private CryptoQuantumReadiness quantumReadiness;

        /**
         * Quantum-readiness classification for TDE posture.
         *
         * @param quantumReadiness the value to set
         * @return this builder
         */
        public Builder quantumReadiness(CryptoQuantumReadiness quantumReadiness) {
            this.quantumReadiness = quantumReadiness;
            this.__explicitlySet__.add("quantumReadiness");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CryptoTdePosture build() {
            CryptoTdePosture model =
                    new CryptoTdePosture(
                            this.status,
                            this.encryptionConfigured,
                            this.redoEncryptionObserved,
                            this.dbCredentialsEncryptionObserved,
                            this.integrityConfigured,
                            this.encryptedTablespacesCount,
                            this.unencryptedTablespacesCount,
                            this.masterKeyId,
                            this.walletLocation,
                            this.masterKeyEncryptionAlgorithm,
                            this.timeMasterKeyLastRotation,
                            this.keyStoreType,
                            this.keyCacheStatus,
                            this.fipsModeConfigured,
                            this.quantumReadiness);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CryptoTdePosture model) {
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("encryptionConfigured")) {
                this.encryptionConfigured(model.getEncryptionConfigured());
            }
            if (model.wasPropertyExplicitlySet("redoEncryptionObserved")) {
                this.redoEncryptionObserved(model.getRedoEncryptionObserved());
            }
            if (model.wasPropertyExplicitlySet("dbCredentialsEncryptionObserved")) {
                this.dbCredentialsEncryptionObserved(model.getDbCredentialsEncryptionObserved());
            }
            if (model.wasPropertyExplicitlySet("integrityConfigured")) {
                this.integrityConfigured(model.getIntegrityConfigured());
            }
            if (model.wasPropertyExplicitlySet("encryptedTablespacesCount")) {
                this.encryptedTablespacesCount(model.getEncryptedTablespacesCount());
            }
            if (model.wasPropertyExplicitlySet("unencryptedTablespacesCount")) {
                this.unencryptedTablespacesCount(model.getUnencryptedTablespacesCount());
            }
            if (model.wasPropertyExplicitlySet("masterKeyId")) {
                this.masterKeyId(model.getMasterKeyId());
            }
            if (model.wasPropertyExplicitlySet("walletLocation")) {
                this.walletLocation(model.getWalletLocation());
            }
            if (model.wasPropertyExplicitlySet("masterKeyEncryptionAlgorithm")) {
                this.masterKeyEncryptionAlgorithm(model.getMasterKeyEncryptionAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("timeMasterKeyLastRotation")) {
                this.timeMasterKeyLastRotation(model.getTimeMasterKeyLastRotation());
            }
            if (model.wasPropertyExplicitlySet("keyStoreType")) {
                this.keyStoreType(model.getKeyStoreType());
            }
            if (model.wasPropertyExplicitlySet("keyCacheStatus")) {
                this.keyCacheStatus(model.getKeyCacheStatus());
            }
            if (model.wasPropertyExplicitlySet("fipsModeConfigured")) {
                this.fipsModeConfigured(model.getFipsModeConfigured());
            }
            if (model.wasPropertyExplicitlySet("quantumReadiness")) {
                this.quantumReadiness(model.getQuantumReadiness());
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

    /** TDE enablement status. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final CryptoFeatureStatus status;

    /**
     * TDE enablement status.
     *
     * @return the value
     */
    public CryptoFeatureStatus getStatus() {
        return status;
    }

    /** Configured TDE encryption algorithm. */
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionConfigured")
    private final java.util.List<String> encryptionConfigured;

    /**
     * Configured TDE encryption algorithm.
     *
     * @return the value
     */
    public java.util.List<String> getEncryptionConfigured() {
        return encryptionConfigured;
    }

    /** Observed redo log encryption algorithm. */
    @com.fasterxml.jackson.annotation.JsonProperty("redoEncryptionObserved")
    private final String redoEncryptionObserved;

    /**
     * Observed redo log encryption algorithm.
     *
     * @return the value
     */
    public String getRedoEncryptionObserved() {
        return redoEncryptionObserved;
    }

    /** Observed DB credentials encryption algorithm. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbCredentialsEncryptionObserved")
    private final String dbCredentialsEncryptionObserved;

    /**
     * Observed DB credentials encryption algorithm.
     *
     * @return the value
     */
    public String getDbCredentialsEncryptionObserved() {
        return dbCredentialsEncryptionObserved;
    }

    /** Configured TDE integrity-related setting. */
    @com.fasterxml.jackson.annotation.JsonProperty("integrityConfigured")
    private final java.util.List<String> integrityConfigured;

    /**
     * Configured TDE integrity-related setting.
     *
     * @return the value
     */
    public java.util.List<String> getIntegrityConfigured() {
        return integrityConfigured;
    }

    /** Number of encrypted tablespaces detected. */
    @com.fasterxml.jackson.annotation.JsonProperty("encryptedTablespacesCount")
    private final Integer encryptedTablespacesCount;

    /**
     * Number of encrypted tablespaces detected.
     *
     * @return the value
     */
    public Integer getEncryptedTablespacesCount() {
        return encryptedTablespacesCount;
    }

    /** Number of unencrypted tablespaces detected. */
    @com.fasterxml.jackson.annotation.JsonProperty("unencryptedTablespacesCount")
    private final Integer unencryptedTablespacesCount;

    /**
     * Number of unencrypted tablespaces detected.
     *
     * @return the value
     */
    public Integer getUnencryptedTablespacesCount() {
        return unencryptedTablespacesCount;
    }

    /** The observed TDE master key identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("masterKeyId")
    private final String masterKeyId;

    /**
     * The observed TDE master key identifier.
     *
     * @return the value
     */
    public String getMasterKeyId() {
        return masterKeyId;
    }

    /** The observed wallet location for TDE keys. */
    @com.fasterxml.jackson.annotation.JsonProperty("walletLocation")
    private final String walletLocation;

    /**
     * The observed wallet location for TDE keys.
     *
     * @return the value
     */
    public String getWalletLocation() {
        return walletLocation;
    }

    /** The observed encryption algorithm used by the master key. */
    @com.fasterxml.jackson.annotation.JsonProperty("masterKeyEncryptionAlgorithm")
    private final String masterKeyEncryptionAlgorithm;

    /**
     * The observed encryption algorithm used by the master key.
     *
     * @return the value
     */
    public String getMasterKeyEncryptionAlgorithm() {
        return masterKeyEncryptionAlgorithm;
    }

    /** The last observed rotation time for the TDE master key, in RFC3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeMasterKeyLastRotation")
    private final java.util.Date timeMasterKeyLastRotation;

    /**
     * The last observed rotation time for the TDE master key, in RFC3339 format.
     *
     * @return the value
     */
    public java.util.Date getTimeMasterKeyLastRotation() {
        return timeMasterKeyLastRotation;
    }

    /** The observed TDE key store type. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyStoreType")
    private final CryptoKeystoreType keyStoreType;

    /**
     * The observed TDE key store type.
     *
     * @return the value
     */
    public CryptoKeystoreType getKeyStoreType() {
        return keyStoreType;
    }

    /** The observed TDE key cache status. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyCacheStatus")
    private final CryptoKeyCacheStatus keyCacheStatus;

    /**
     * The observed TDE key cache status.
     *
     * @return the value
     */
    public CryptoKeyCacheStatus getKeyCacheStatus() {
        return keyCacheStatus;
    }

    /** FIPS mode configured for TDE when the target uses legacy per-feature FIPS configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("fipsModeConfigured")
    private final CryptoPosture.FipsModeConfigured fipsModeConfigured;

    /**
     * FIPS mode configured for TDE when the target uses legacy per-feature FIPS configuration.
     *
     * @return the value
     */
    public CryptoPosture.FipsModeConfigured getFipsModeConfigured() {
        return fipsModeConfigured;
    }

    /** Quantum-readiness classification for TDE posture. */
    @com.fasterxml.jackson.annotation.JsonProperty("quantumReadiness")
    private final CryptoQuantumReadiness quantumReadiness;

    /**
     * Quantum-readiness classification for TDE posture.
     *
     * @return the value
     */
    public CryptoQuantumReadiness getQuantumReadiness() {
        return quantumReadiness;
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
        sb.append("CryptoTdePosture(");
        sb.append("super=").append(super.toString());
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", encryptionConfigured=").append(String.valueOf(this.encryptionConfigured));
        sb.append(", redoEncryptionObserved=").append(String.valueOf(this.redoEncryptionObserved));
        sb.append(", dbCredentialsEncryptionObserved=")
                .append(String.valueOf(this.dbCredentialsEncryptionObserved));
        sb.append(", integrityConfigured=").append(String.valueOf(this.integrityConfigured));
        sb.append(", encryptedTablespacesCount=")
                .append(String.valueOf(this.encryptedTablespacesCount));
        sb.append(", unencryptedTablespacesCount=")
                .append(String.valueOf(this.unencryptedTablespacesCount));
        sb.append(", masterKeyId=").append(String.valueOf(this.masterKeyId));
        sb.append(", walletLocation=").append(String.valueOf(this.walletLocation));
        sb.append(", masterKeyEncryptionAlgorithm=")
                .append(String.valueOf(this.masterKeyEncryptionAlgorithm));
        sb.append(", timeMasterKeyLastRotation=")
                .append(String.valueOf(this.timeMasterKeyLastRotation));
        sb.append(", keyStoreType=").append(String.valueOf(this.keyStoreType));
        sb.append(", keyCacheStatus=").append(String.valueOf(this.keyCacheStatus));
        sb.append(", fipsModeConfigured=").append(String.valueOf(this.fipsModeConfigured));
        sb.append(", quantumReadiness=").append(String.valueOf(this.quantumReadiness));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CryptoTdePosture)) {
            return false;
        }

        CryptoTdePosture other = (CryptoTdePosture) o;
        return java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.encryptionConfigured, other.encryptionConfigured)
                && java.util.Objects.equals(
                        this.redoEncryptionObserved, other.redoEncryptionObserved)
                && java.util.Objects.equals(
                        this.dbCredentialsEncryptionObserved, other.dbCredentialsEncryptionObserved)
                && java.util.Objects.equals(this.integrityConfigured, other.integrityConfigured)
                && java.util.Objects.equals(
                        this.encryptedTablespacesCount, other.encryptedTablespacesCount)
                && java.util.Objects.equals(
                        this.unencryptedTablespacesCount, other.unencryptedTablespacesCount)
                && java.util.Objects.equals(this.masterKeyId, other.masterKeyId)
                && java.util.Objects.equals(this.walletLocation, other.walletLocation)
                && java.util.Objects.equals(
                        this.masterKeyEncryptionAlgorithm, other.masterKeyEncryptionAlgorithm)
                && java.util.Objects.equals(
                        this.timeMasterKeyLastRotation, other.timeMasterKeyLastRotation)
                && java.util.Objects.equals(this.keyStoreType, other.keyStoreType)
                && java.util.Objects.equals(this.keyCacheStatus, other.keyCacheStatus)
                && java.util.Objects.equals(this.fipsModeConfigured, other.fipsModeConfigured)
                && java.util.Objects.equals(this.quantumReadiness, other.quantumReadiness)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionConfigured == null
                                ? 43
                                : this.encryptionConfigured.hashCode());
        result =
                (result * PRIME)
                        + (this.redoEncryptionObserved == null
                                ? 43
                                : this.redoEncryptionObserved.hashCode());
        result =
                (result * PRIME)
                        + (this.dbCredentialsEncryptionObserved == null
                                ? 43
                                : this.dbCredentialsEncryptionObserved.hashCode());
        result =
                (result * PRIME)
                        + (this.integrityConfigured == null
                                ? 43
                                : this.integrityConfigured.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptedTablespacesCount == null
                                ? 43
                                : this.encryptedTablespacesCount.hashCode());
        result =
                (result * PRIME)
                        + (this.unencryptedTablespacesCount == null
                                ? 43
                                : this.unencryptedTablespacesCount.hashCode());
        result = (result * PRIME) + (this.masterKeyId == null ? 43 : this.masterKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.walletLocation == null ? 43 : this.walletLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.masterKeyEncryptionAlgorithm == null
                                ? 43
                                : this.masterKeyEncryptionAlgorithm.hashCode());
        result =
                (result * PRIME)
                        + (this.timeMasterKeyLastRotation == null
                                ? 43
                                : this.timeMasterKeyLastRotation.hashCode());
        result = (result * PRIME) + (this.keyStoreType == null ? 43 : this.keyStoreType.hashCode());
        result =
                (result * PRIME)
                        + (this.keyCacheStatus == null ? 43 : this.keyCacheStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.fipsModeConfigured == null
                                ? 43
                                : this.fipsModeConfigured.hashCode());
        result =
                (result * PRIME)
                        + (this.quantumReadiness == null ? 43 : this.quantumReadiness.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
