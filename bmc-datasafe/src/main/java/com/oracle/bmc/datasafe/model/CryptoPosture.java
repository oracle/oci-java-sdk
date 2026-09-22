/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Cryptographic posture details captured by the assessment.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CryptoPosture.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CryptoPosture extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "tls",
        "nne",
        "tde",
        "networkEncryption",
        "fipsStatus",
        "fipsModeConfigured",
        "backupStatus",
        "encryptedBackupPiecesCount",
        "unencryptedBackupPiecesCount"
    })
    public CryptoPosture(
            CryptoTlsPosture tls,
            CryptoNnePosture nne,
            CryptoTdePosture tde,
            java.util.List<String> networkEncryption,
            CryptoFeatureStatus fipsStatus,
            FipsModeConfigured fipsModeConfigured,
            String backupStatus,
            Integer encryptedBackupPiecesCount,
            Integer unencryptedBackupPiecesCount) {
        super();
        this.tls = tls;
        this.nne = nne;
        this.tde = tde;
        this.networkEncryption = networkEncryption;
        this.fipsStatus = fipsStatus;
        this.fipsModeConfigured = fipsModeConfigured;
        this.backupStatus = backupStatus;
        this.encryptedBackupPiecesCount = encryptedBackupPiecesCount;
        this.unencryptedBackupPiecesCount = unencryptedBackupPiecesCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("tls")
        private CryptoTlsPosture tls;

        public Builder tls(CryptoTlsPosture tls) {
            this.tls = tls;
            this.__explicitlySet__.add("tls");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nne")
        private CryptoNnePosture nne;

        public Builder nne(CryptoNnePosture nne) {
            this.nne = nne;
            this.__explicitlySet__.add("nne");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("tde")
        private CryptoTdePosture tde;

        public Builder tde(CryptoTdePosture tde) {
            this.tde = tde;
            this.__explicitlySet__.add("tde");
            return this;
        }
        /**
         * Network encryption details.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("networkEncryption")
        private java.util.List<String> networkEncryption;

        /**
         * Network encryption details.
         * @param networkEncryption the value to set
         * @return this builder
         **/
        public Builder networkEncryption(java.util.List<String> networkEncryption) {
            this.networkEncryption = networkEncryption;
            this.__explicitlySet__.add("networkEncryption");
            return this;
        }
        /**
         * Overall FIPS status for the assessment when the target uses common FIPS configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fipsStatus")
        private CryptoFeatureStatus fipsStatus;

        /**
         * Overall FIPS status for the assessment when the target uses common FIPS configuration.
         * @param fipsStatus the value to set
         * @return this builder
         **/
        public Builder fipsStatus(CryptoFeatureStatus fipsStatus) {
            this.fipsStatus = fipsStatus;
            this.__explicitlySet__.add("fipsStatus");
            return this;
        }
        /**
         * Common FIPS mode configured for the assessment when the target uses common FIPS configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fipsModeConfigured")
        private FipsModeConfigured fipsModeConfigured;

        /**
         * Common FIPS mode configured for the assessment when the target uses common FIPS configuration.
         * @param fipsModeConfigured the value to set
         * @return this builder
         **/
        public Builder fipsModeConfigured(FipsModeConfigured fipsModeConfigured) {
            this.fipsModeConfigured = fipsModeConfigured;
            this.__explicitlySet__.add("fipsModeConfigured");
            return this;
        }
        /**
         * Backup encryption status observed for the assessment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("backupStatus")
        private String backupStatus;

        /**
         * Backup encryption status observed for the assessment.
         * @param backupStatus the value to set
         * @return this builder
         **/
        public Builder backupStatus(String backupStatus) {
            this.backupStatus = backupStatus;
            this.__explicitlySet__.add("backupStatus");
            return this;
        }
        /**
         * Number of encrypted backup pieces.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("encryptedBackupPiecesCount")
        private Integer encryptedBackupPiecesCount;

        /**
         * Number of encrypted backup pieces.
         * @param encryptedBackupPiecesCount the value to set
         * @return this builder
         **/
        public Builder encryptedBackupPiecesCount(Integer encryptedBackupPiecesCount) {
            this.encryptedBackupPiecesCount = encryptedBackupPiecesCount;
            this.__explicitlySet__.add("encryptedBackupPiecesCount");
            return this;
        }
        /**
         * Number of unencrypted backup pieces.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("unencryptedBackupPiecesCount")
        private Integer unencryptedBackupPiecesCount;

        /**
         * Number of unencrypted backup pieces.
         * @param unencryptedBackupPiecesCount the value to set
         * @return this builder
         **/
        public Builder unencryptedBackupPiecesCount(Integer unencryptedBackupPiecesCount) {
            this.unencryptedBackupPiecesCount = unencryptedBackupPiecesCount;
            this.__explicitlySet__.add("unencryptedBackupPiecesCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CryptoPosture build() {
            CryptoPosture model =
                    new CryptoPosture(
                            this.tls,
                            this.nne,
                            this.tde,
                            this.networkEncryption,
                            this.fipsStatus,
                            this.fipsModeConfigured,
                            this.backupStatus,
                            this.encryptedBackupPiecesCount,
                            this.unencryptedBackupPiecesCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CryptoPosture model) {
            if (model.wasPropertyExplicitlySet("tls")) {
                this.tls(model.getTls());
            }
            if (model.wasPropertyExplicitlySet("nne")) {
                this.nne(model.getNne());
            }
            if (model.wasPropertyExplicitlySet("tde")) {
                this.tde(model.getTde());
            }
            if (model.wasPropertyExplicitlySet("networkEncryption")) {
                this.networkEncryption(model.getNetworkEncryption());
            }
            if (model.wasPropertyExplicitlySet("fipsStatus")) {
                this.fipsStatus(model.getFipsStatus());
            }
            if (model.wasPropertyExplicitlySet("fipsModeConfigured")) {
                this.fipsModeConfigured(model.getFipsModeConfigured());
            }
            if (model.wasPropertyExplicitlySet("backupStatus")) {
                this.backupStatus(model.getBackupStatus());
            }
            if (model.wasPropertyExplicitlySet("encryptedBackupPiecesCount")) {
                this.encryptedBackupPiecesCount(model.getEncryptedBackupPiecesCount());
            }
            if (model.wasPropertyExplicitlySet("unencryptedBackupPiecesCount")) {
                this.unencryptedBackupPiecesCount(model.getUnencryptedBackupPiecesCount());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tls")
    private final CryptoTlsPosture tls;

    public CryptoTlsPosture getTls() {
        return tls;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("nne")
    private final CryptoNnePosture nne;

    public CryptoNnePosture getNne() {
        return nne;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("tde")
    private final CryptoTdePosture tde;

    public CryptoTdePosture getTde() {
        return tde;
    }

    /**
     * Network encryption details.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkEncryption")
    private final java.util.List<String> networkEncryption;

    /**
     * Network encryption details.
     * @return the value
     **/
    public java.util.List<String> getNetworkEncryption() {
        return networkEncryption;
    }

    /**
     * Overall FIPS status for the assessment when the target uses common FIPS configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fipsStatus")
    private final CryptoFeatureStatus fipsStatus;

    /**
     * Overall FIPS status for the assessment when the target uses common FIPS configuration.
     * @return the value
     **/
    public CryptoFeatureStatus getFipsStatus() {
        return fipsStatus;
    }

    /**
     * Common FIPS mode configured for the assessment when the target uses common FIPS configuration.
     **/
    public enum FipsModeConfigured {
        Fips1402("FIPS_140_2"),
        Fips1403("FIPS_140_3"),
        NotConfigured("NOT_CONFIGURED"),
        NotApplicable("NOT_APPLICABLE"),
        NotSupported("NOT_SUPPORTED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(FipsModeConfigured.class);

        private final String value;
        private static java.util.Map<String, FipsModeConfigured> map;

        static {
            map = new java.util.HashMap<>();
            for (FipsModeConfigured v : FipsModeConfigured.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FipsModeConfigured(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FipsModeConfigured create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FipsModeConfigured', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Common FIPS mode configured for the assessment when the target uses common FIPS configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fipsModeConfigured")
    private final FipsModeConfigured fipsModeConfigured;

    /**
     * Common FIPS mode configured for the assessment when the target uses common FIPS configuration.
     * @return the value
     **/
    public FipsModeConfigured getFipsModeConfigured() {
        return fipsModeConfigured;
    }

    /**
     * Backup encryption status observed for the assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("backupStatus")
    private final String backupStatus;

    /**
     * Backup encryption status observed for the assessment.
     * @return the value
     **/
    public String getBackupStatus() {
        return backupStatus;
    }

    /**
     * Number of encrypted backup pieces.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encryptedBackupPiecesCount")
    private final Integer encryptedBackupPiecesCount;

    /**
     * Number of encrypted backup pieces.
     * @return the value
     **/
    public Integer getEncryptedBackupPiecesCount() {
        return encryptedBackupPiecesCount;
    }

    /**
     * Number of unencrypted backup pieces.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unencryptedBackupPiecesCount")
    private final Integer unencryptedBackupPiecesCount;

    /**
     * Number of unencrypted backup pieces.
     * @return the value
     **/
    public Integer getUnencryptedBackupPiecesCount() {
        return unencryptedBackupPiecesCount;
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
        sb.append("CryptoPosture(");
        sb.append("super=").append(super.toString());
        sb.append("tls=").append(String.valueOf(this.tls));
        sb.append(", nne=").append(String.valueOf(this.nne));
        sb.append(", tde=").append(String.valueOf(this.tde));
        sb.append(", networkEncryption=").append(String.valueOf(this.networkEncryption));
        sb.append(", fipsStatus=").append(String.valueOf(this.fipsStatus));
        sb.append(", fipsModeConfigured=").append(String.valueOf(this.fipsModeConfigured));
        sb.append(", backupStatus=").append(String.valueOf(this.backupStatus));
        sb.append(", encryptedBackupPiecesCount=")
                .append(String.valueOf(this.encryptedBackupPiecesCount));
        sb.append(", unencryptedBackupPiecesCount=")
                .append(String.valueOf(this.unencryptedBackupPiecesCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CryptoPosture)) {
            return false;
        }

        CryptoPosture other = (CryptoPosture) o;
        return java.util.Objects.equals(this.tls, other.tls)
                && java.util.Objects.equals(this.nne, other.nne)
                && java.util.Objects.equals(this.tde, other.tde)
                && java.util.Objects.equals(this.networkEncryption, other.networkEncryption)
                && java.util.Objects.equals(this.fipsStatus, other.fipsStatus)
                && java.util.Objects.equals(this.fipsModeConfigured, other.fipsModeConfigured)
                && java.util.Objects.equals(this.backupStatus, other.backupStatus)
                && java.util.Objects.equals(
                        this.encryptedBackupPiecesCount, other.encryptedBackupPiecesCount)
                && java.util.Objects.equals(
                        this.unencryptedBackupPiecesCount, other.unencryptedBackupPiecesCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tls == null ? 43 : this.tls.hashCode());
        result = (result * PRIME) + (this.nne == null ? 43 : this.nne.hashCode());
        result = (result * PRIME) + (this.tde == null ? 43 : this.tde.hashCode());
        result =
                (result * PRIME)
                        + (this.networkEncryption == null ? 43 : this.networkEncryption.hashCode());
        result = (result * PRIME) + (this.fipsStatus == null ? 43 : this.fipsStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.fipsModeConfigured == null
                                ? 43
                                : this.fipsModeConfigured.hashCode());
        result = (result * PRIME) + (this.backupStatus == null ? 43 : this.backupStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptedBackupPiecesCount == null
                                ? 43
                                : this.encryptedBackupPiecesCount.hashCode());
        result =
                (result * PRIME)
                        + (this.unencryptedBackupPiecesCount == null
                                ? 43
                                : this.unencryptedBackupPiecesCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
