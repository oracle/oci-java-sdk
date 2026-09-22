/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of one cryptographic key observed for a crypto assessment. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CryptoAssessmentKeySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CryptoAssessmentKeySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "assessmentId",
        "timeLastAssessed",
        "targetId",
        "keyId",
        "feature",
        "keyType",
        "status",
        "algorithm",
        "timeCreated",
        "keystoreType",
        "secondaryKeystoreType",
        "keyCache",
        "walletLocation",
        "timeLastRotation",
        "age"
    })
    public CryptoAssessmentKeySummary(
            String assessmentId,
            java.util.Date timeLastAssessed,
            String targetId,
            String keyId,
            CryptoFeature feature,
            KeyType keyType,
            String status,
            String algorithm,
            java.util.Date timeCreated,
            CryptoKeystoreType keystoreType,
            CryptoKeystoreType secondaryKeystoreType,
            CryptoKeyCacheStatus keyCache,
            String walletLocation,
            java.util.Date timeLastRotation,
            Long age) {
        super();
        this.assessmentId = assessmentId;
        this.timeLastAssessed = timeLastAssessed;
        this.targetId = targetId;
        this.keyId = keyId;
        this.feature = feature;
        this.keyType = keyType;
        this.status = status;
        this.algorithm = algorithm;
        this.timeCreated = timeCreated;
        this.keystoreType = keystoreType;
        this.secondaryKeystoreType = secondaryKeystoreType;
        this.keyCache = keyCache;
        this.walletLocation = walletLocation;
        this.timeLastRotation = timeLastRotation;
        this.age = age;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of the crypto assessment that discovered the key. */
        @com.fasterxml.jackson.annotation.JsonProperty("assessmentId")
        private String assessmentId;

        /**
         * OCID of the crypto assessment that discovered the key.
         *
         * @param assessmentId the value to set
         * @return this builder
         */
        public Builder assessmentId(String assessmentId) {
            this.assessmentId = assessmentId;
            this.__explicitlySet__.add("assessmentId");
            return this;
        }
        /**
         * The date and time the associated crypto assessment was last assessed, in RFC3339 format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastAssessed")
        private java.util.Date timeLastAssessed;

        /**
         * The date and time the associated crypto assessment was last assessed, in RFC3339 format.
         *
         * @param timeLastAssessed the value to set
         * @return this builder
         */
        public Builder timeLastAssessed(java.util.Date timeLastAssessed) {
            this.timeLastAssessed = timeLastAssessed;
            this.__explicitlySet__.add("timeLastAssessed");
            return this;
        }
        /** OCID of the target database associated with the key. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * OCID of the target database associated with the key.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** Identifier of the cryptographic key. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyId")
        private String keyId;

        /**
         * Identifier of the cryptographic key.
         *
         * @param keyId the value to set
         * @return this builder
         */
        public Builder keyId(String keyId) {
            this.keyId = keyId;
            this.__explicitlySet__.add("keyId");
            return this;
        }
        /** Crypto feature for which the key is observed. */
        @com.fasterxml.jackson.annotation.JsonProperty("feature")
        private CryptoFeature feature;

        /**
         * Crypto feature for which the key is observed.
         *
         * @param feature the value to set
         * @return this builder
         */
        public Builder feature(CryptoFeature feature) {
            this.feature = feature;
            this.__explicitlySet__.add("feature");
            return this;
        }
        /** Type of cryptographic key observed for the assessment. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyType")
        private KeyType keyType;

        /**
         * Type of cryptographic key observed for the assessment.
         *
         * @param keyType the value to set
         * @return this builder
         */
        public Builder keyType(KeyType keyType) {
            this.keyType = keyType;
            this.__explicitlySet__.add("keyType");
            return this;
        }
        /** Current status of the cryptographic key as observed on the target. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private String status;

        /**
         * Current status of the cryptographic key as observed on the target.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(String status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Cryptographic algorithm used by the key. */
        @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
        private String algorithm;

        /**
         * Cryptographic algorithm used by the key.
         *
         * @param algorithm the value to set
         * @return this builder
         */
        public Builder algorithm(String algorithm) {
            this.algorithm = algorithm;
            this.__explicitlySet__.add("algorithm");
            return this;
        }
        /** Key creation time in RFC3339 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Key creation time in RFC3339 format.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Primary keystore type observed for the key. */
        @com.fasterxml.jackson.annotation.JsonProperty("keystoreType")
        private CryptoKeystoreType keystoreType;

        /**
         * Primary keystore type observed for the key.
         *
         * @param keystoreType the value to set
         * @return this builder
         */
        public Builder keystoreType(CryptoKeystoreType keystoreType) {
            this.keystoreType = keystoreType;
            this.__explicitlySet__.add("keystoreType");
            return this;
        }
        /** Secondary keystore type observed for the key, if configured. */
        @com.fasterxml.jackson.annotation.JsonProperty("secondaryKeystoreType")
        private CryptoKeystoreType secondaryKeystoreType;

        /**
         * Secondary keystore type observed for the key, if configured.
         *
         * @param secondaryKeystoreType the value to set
         * @return this builder
         */
        public Builder secondaryKeystoreType(CryptoKeystoreType secondaryKeystoreType) {
            this.secondaryKeystoreType = secondaryKeystoreType;
            this.__explicitlySet__.add("secondaryKeystoreType");
            return this;
        }
        /** Key cache setting observed for the key. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyCache")
        private CryptoKeyCacheStatus keyCache;

        /**
         * Key cache setting observed for the key.
         *
         * @param keyCache the value to set
         * @return this builder
         */
        public Builder keyCache(CryptoKeyCacheStatus keyCache) {
            this.keyCache = keyCache;
            this.__explicitlySet__.add("keyCache");
            return this;
        }
        /** Wallet location observed for the key. */
        @com.fasterxml.jackson.annotation.JsonProperty("walletLocation")
        private String walletLocation;

        /**
         * Wallet location observed for the key.
         *
         * @param walletLocation the value to set
         * @return this builder
         */
        public Builder walletLocation(String walletLocation) {
            this.walletLocation = walletLocation;
            this.__explicitlySet__.add("walletLocation");
            return this;
        }
        /** Most recent key rotation time in RFC3339 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastRotation")
        private java.util.Date timeLastRotation;

        /**
         * Most recent key rotation time in RFC3339 format.
         *
         * @param timeLastRotation the value to set
         * @return this builder
         */
        public Builder timeLastRotation(java.util.Date timeLastRotation) {
            this.timeLastRotation = timeLastRotation;
            this.__explicitlySet__.add("timeLastRotation");
            return this;
        }
        /** Age of the key in whole days, calculated from timeCreated using the current UTC date. */
        @com.fasterxml.jackson.annotation.JsonProperty("age")
        private Long age;

        /**
         * Age of the key in whole days, calculated from timeCreated using the current UTC date.
         *
         * @param age the value to set
         * @return this builder
         */
        public Builder age(Long age) {
            this.age = age;
            this.__explicitlySet__.add("age");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CryptoAssessmentKeySummary build() {
            CryptoAssessmentKeySummary model =
                    new CryptoAssessmentKeySummary(
                            this.assessmentId,
                            this.timeLastAssessed,
                            this.targetId,
                            this.keyId,
                            this.feature,
                            this.keyType,
                            this.status,
                            this.algorithm,
                            this.timeCreated,
                            this.keystoreType,
                            this.secondaryKeystoreType,
                            this.keyCache,
                            this.walletLocation,
                            this.timeLastRotation,
                            this.age);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CryptoAssessmentKeySummary model) {
            if (model.wasPropertyExplicitlySet("assessmentId")) {
                this.assessmentId(model.getAssessmentId());
            }
            if (model.wasPropertyExplicitlySet("timeLastAssessed")) {
                this.timeLastAssessed(model.getTimeLastAssessed());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("keyId")) {
                this.keyId(model.getKeyId());
            }
            if (model.wasPropertyExplicitlySet("feature")) {
                this.feature(model.getFeature());
            }
            if (model.wasPropertyExplicitlySet("keyType")) {
                this.keyType(model.getKeyType());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("algorithm")) {
                this.algorithm(model.getAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("keystoreType")) {
                this.keystoreType(model.getKeystoreType());
            }
            if (model.wasPropertyExplicitlySet("secondaryKeystoreType")) {
                this.secondaryKeystoreType(model.getSecondaryKeystoreType());
            }
            if (model.wasPropertyExplicitlySet("keyCache")) {
                this.keyCache(model.getKeyCache());
            }
            if (model.wasPropertyExplicitlySet("walletLocation")) {
                this.walletLocation(model.getWalletLocation());
            }
            if (model.wasPropertyExplicitlySet("timeLastRotation")) {
                this.timeLastRotation(model.getTimeLastRotation());
            }
            if (model.wasPropertyExplicitlySet("age")) {
                this.age(model.getAge());
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

    /** OCID of the crypto assessment that discovered the key. */
    @com.fasterxml.jackson.annotation.JsonProperty("assessmentId")
    private final String assessmentId;

    /**
     * OCID of the crypto assessment that discovered the key.
     *
     * @return the value
     */
    public String getAssessmentId() {
        return assessmentId;
    }

    /** The date and time the associated crypto assessment was last assessed, in RFC3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastAssessed")
    private final java.util.Date timeLastAssessed;

    /**
     * The date and time the associated crypto assessment was last assessed, in RFC3339 format.
     *
     * @return the value
     */
    public java.util.Date getTimeLastAssessed() {
        return timeLastAssessed;
    }

    /** OCID of the target database associated with the key. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * OCID of the target database associated with the key.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /** Identifier of the cryptographic key. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyId")
    private final String keyId;

    /**
     * Identifier of the cryptographic key.
     *
     * @return the value
     */
    public String getKeyId() {
        return keyId;
    }

    /** Crypto feature for which the key is observed. */
    @com.fasterxml.jackson.annotation.JsonProperty("feature")
    private final CryptoFeature feature;

    /**
     * Crypto feature for which the key is observed.
     *
     * @return the value
     */
    public CryptoFeature getFeature() {
        return feature;
    }

    /** Type of cryptographic key observed for the assessment. */
    public enum KeyType implements com.oracle.bmc.http.internal.BmcEnum {
        MasterKey("MASTER_KEY"),
        EncryptionKey("ENCRYPTION_KEY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(KeyType.class);

        private final String value;
        private static java.util.Map<String, KeyType> map;

        static {
            map = new java.util.HashMap<>();
            for (KeyType v : KeyType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        KeyType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static KeyType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'KeyType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Type of cryptographic key observed for the assessment. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyType")
    private final KeyType keyType;

    /**
     * Type of cryptographic key observed for the assessment.
     *
     * @return the value
     */
    public KeyType getKeyType() {
        return keyType;
    }

    /** Current status of the cryptographic key as observed on the target. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final String status;

    /**
     * Current status of the cryptographic key as observed on the target.
     *
     * @return the value
     */
    public String getStatus() {
        return status;
    }

    /** Cryptographic algorithm used by the key. */
    @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
    private final String algorithm;

    /**
     * Cryptographic algorithm used by the key.
     *
     * @return the value
     */
    public String getAlgorithm() {
        return algorithm;
    }

    /** Key creation time in RFC3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Key creation time in RFC3339 format.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Primary keystore type observed for the key. */
    @com.fasterxml.jackson.annotation.JsonProperty("keystoreType")
    private final CryptoKeystoreType keystoreType;

    /**
     * Primary keystore type observed for the key.
     *
     * @return the value
     */
    public CryptoKeystoreType getKeystoreType() {
        return keystoreType;
    }

    /** Secondary keystore type observed for the key, if configured. */
    @com.fasterxml.jackson.annotation.JsonProperty("secondaryKeystoreType")
    private final CryptoKeystoreType secondaryKeystoreType;

    /**
     * Secondary keystore type observed for the key, if configured.
     *
     * @return the value
     */
    public CryptoKeystoreType getSecondaryKeystoreType() {
        return secondaryKeystoreType;
    }

    /** Key cache setting observed for the key. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyCache")
    private final CryptoKeyCacheStatus keyCache;

    /**
     * Key cache setting observed for the key.
     *
     * @return the value
     */
    public CryptoKeyCacheStatus getKeyCache() {
        return keyCache;
    }

    /** Wallet location observed for the key. */
    @com.fasterxml.jackson.annotation.JsonProperty("walletLocation")
    private final String walletLocation;

    /**
     * Wallet location observed for the key.
     *
     * @return the value
     */
    public String getWalletLocation() {
        return walletLocation;
    }

    /** Most recent key rotation time in RFC3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastRotation")
    private final java.util.Date timeLastRotation;

    /**
     * Most recent key rotation time in RFC3339 format.
     *
     * @return the value
     */
    public java.util.Date getTimeLastRotation() {
        return timeLastRotation;
    }

    /** Age of the key in whole days, calculated from timeCreated using the current UTC date. */
    @com.fasterxml.jackson.annotation.JsonProperty("age")
    private final Long age;

    /**
     * Age of the key in whole days, calculated from timeCreated using the current UTC date.
     *
     * @return the value
     */
    public Long getAge() {
        return age;
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
        sb.append("CryptoAssessmentKeySummary(");
        sb.append("super=").append(super.toString());
        sb.append("assessmentId=").append(String.valueOf(this.assessmentId));
        sb.append(", timeLastAssessed=").append(String.valueOf(this.timeLastAssessed));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", keyId=").append(String.valueOf(this.keyId));
        sb.append(", feature=").append(String.valueOf(this.feature));
        sb.append(", keyType=").append(String.valueOf(this.keyType));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", algorithm=").append(String.valueOf(this.algorithm));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", keystoreType=").append(String.valueOf(this.keystoreType));
        sb.append(", secondaryKeystoreType=").append(String.valueOf(this.secondaryKeystoreType));
        sb.append(", keyCache=").append(String.valueOf(this.keyCache));
        sb.append(", walletLocation=").append(String.valueOf(this.walletLocation));
        sb.append(", timeLastRotation=").append(String.valueOf(this.timeLastRotation));
        sb.append(", age=").append(String.valueOf(this.age));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CryptoAssessmentKeySummary)) {
            return false;
        }

        CryptoAssessmentKeySummary other = (CryptoAssessmentKeySummary) o;
        return java.util.Objects.equals(this.assessmentId, other.assessmentId)
                && java.util.Objects.equals(this.timeLastAssessed, other.timeLastAssessed)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.keyId, other.keyId)
                && java.util.Objects.equals(this.feature, other.feature)
                && java.util.Objects.equals(this.keyType, other.keyType)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.algorithm, other.algorithm)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.keystoreType, other.keystoreType)
                && java.util.Objects.equals(this.secondaryKeystoreType, other.secondaryKeystoreType)
                && java.util.Objects.equals(this.keyCache, other.keyCache)
                && java.util.Objects.equals(this.walletLocation, other.walletLocation)
                && java.util.Objects.equals(this.timeLastRotation, other.timeLastRotation)
                && java.util.Objects.equals(this.age, other.age)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.assessmentId == null ? 43 : this.assessmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastAssessed == null ? 43 : this.timeLastAssessed.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result = (result * PRIME) + (this.keyId == null ? 43 : this.keyId.hashCode());
        result = (result * PRIME) + (this.feature == null ? 43 : this.feature.hashCode());
        result = (result * PRIME) + (this.keyType == null ? 43 : this.keyType.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.algorithm == null ? 43 : this.algorithm.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.keystoreType == null ? 43 : this.keystoreType.hashCode());
        result =
                (result * PRIME)
                        + (this.secondaryKeystoreType == null
                                ? 43
                                : this.secondaryKeystoreType.hashCode());
        result = (result * PRIME) + (this.keyCache == null ? 43 : this.keyCache.hashCode());
        result =
                (result * PRIME)
                        + (this.walletLocation == null ? 43 : this.walletLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastRotation == null ? 43 : this.timeLastRotation.hashCode());
        result = (result * PRIME) + (this.age == null ? 43 : this.age.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
