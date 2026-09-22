/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Wallet details for one crypto feature. <br>
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
        builder = CryptoAssessmentWalletSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CryptoAssessmentWalletSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "assessmentId",
        "timeLastAssessed",
        "targetId",
        "feature",
        "walletLocation",
        "autoLogin",
        "timeCreated",
        "walletEncryptionAlgorithm"
    })
    public CryptoAssessmentWalletSummary(
            String assessmentId,
            java.util.Date timeLastAssessed,
            String targetId,
            Feature feature,
            String walletLocation,
            AutoLogin autoLogin,
            java.util.Date timeCreated,
            String walletEncryptionAlgorithm) {
        super();
        this.assessmentId = assessmentId;
        this.timeLastAssessed = timeLastAssessed;
        this.targetId = targetId;
        this.feature = feature;
        this.walletLocation = walletLocation;
        this.autoLogin = autoLogin;
        this.timeCreated = timeCreated;
        this.walletEncryptionAlgorithm = walletEncryptionAlgorithm;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of the crypto assessment that discovered the wallet. */
        @com.fasterxml.jackson.annotation.JsonProperty("assessmentId")
        private String assessmentId;

        /**
         * OCID of the crypto assessment that discovered the wallet.
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
        /** OCID of the target database associated with the wallet. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * OCID of the target database associated with the wallet.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** Crypto feature for which wallet details are reported. */
        @com.fasterxml.jackson.annotation.JsonProperty("feature")
        private Feature feature;

        /**
         * Crypto feature for which wallet details are reported.
         *
         * @param feature the value to set
         * @return this builder
         */
        public Builder feature(Feature feature) {
            this.feature = feature;
            this.__explicitlySet__.add("feature");
            return this;
        }
        /** Wallet path for the feature. */
        @com.fasterxml.jackson.annotation.JsonProperty("walletLocation")
        private String walletLocation;

        /**
         * Wallet path for the feature.
         *
         * @param walletLocation the value to set
         * @return this builder
         */
        public Builder walletLocation(String walletLocation) {
            this.walletLocation = walletLocation;
            this.__explicitlySet__.add("walletLocation");
            return this;
        }
        /** Whether wallet auto-login is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("autoLogin")
        private AutoLogin autoLogin;

        /**
         * Whether wallet auto-login is enabled.
         *
         * @param autoLogin the value to set
         * @return this builder
         */
        public Builder autoLogin(AutoLogin autoLogin) {
            this.autoLogin = autoLogin;
            this.__explicitlySet__.add("autoLogin");
            return this;
        }
        /** Wallet creation time in RFC3339 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Wallet creation time in RFC3339 format.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** Wallet encryption algorithm. */
        @com.fasterxml.jackson.annotation.JsonProperty("walletEncryptionAlgorithm")
        private String walletEncryptionAlgorithm;

        /**
         * Wallet encryption algorithm.
         *
         * @param walletEncryptionAlgorithm the value to set
         * @return this builder
         */
        public Builder walletEncryptionAlgorithm(String walletEncryptionAlgorithm) {
            this.walletEncryptionAlgorithm = walletEncryptionAlgorithm;
            this.__explicitlySet__.add("walletEncryptionAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CryptoAssessmentWalletSummary build() {
            CryptoAssessmentWalletSummary model =
                    new CryptoAssessmentWalletSummary(
                            this.assessmentId,
                            this.timeLastAssessed,
                            this.targetId,
                            this.feature,
                            this.walletLocation,
                            this.autoLogin,
                            this.timeCreated,
                            this.walletEncryptionAlgorithm);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CryptoAssessmentWalletSummary model) {
            if (model.wasPropertyExplicitlySet("assessmentId")) {
                this.assessmentId(model.getAssessmentId());
            }
            if (model.wasPropertyExplicitlySet("timeLastAssessed")) {
                this.timeLastAssessed(model.getTimeLastAssessed());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("feature")) {
                this.feature(model.getFeature());
            }
            if (model.wasPropertyExplicitlySet("walletLocation")) {
                this.walletLocation(model.getWalletLocation());
            }
            if (model.wasPropertyExplicitlySet("autoLogin")) {
                this.autoLogin(model.getAutoLogin());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("walletEncryptionAlgorithm")) {
                this.walletEncryptionAlgorithm(model.getWalletEncryptionAlgorithm());
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

    /** OCID of the crypto assessment that discovered the wallet. */
    @com.fasterxml.jackson.annotation.JsonProperty("assessmentId")
    private final String assessmentId;

    /**
     * OCID of the crypto assessment that discovered the wallet.
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

    /** OCID of the target database associated with the wallet. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * OCID of the target database associated with the wallet.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /** Crypto feature for which wallet details are reported. */
    public enum Feature implements com.oracle.bmc.http.internal.BmcEnum {
        Tde("TDE"),
        Tls("TLS"),
        Nne("NNE"),
        Zdlra("ZDLRA"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Feature.class);

        private final String value;
        private static java.util.Map<String, Feature> map;

        static {
            map = new java.util.HashMap<>();
            for (Feature v : Feature.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Feature(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Feature create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Feature', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Crypto feature for which wallet details are reported. */
    @com.fasterxml.jackson.annotation.JsonProperty("feature")
    private final Feature feature;

    /**
     * Crypto feature for which wallet details are reported.
     *
     * @return the value
     */
    public Feature getFeature() {
        return feature;
    }

    /** Wallet path for the feature. */
    @com.fasterxml.jackson.annotation.JsonProperty("walletLocation")
    private final String walletLocation;

    /**
     * Wallet path for the feature.
     *
     * @return the value
     */
    public String getWalletLocation() {
        return walletLocation;
    }

    /** Whether wallet auto-login is enabled. */
    public enum AutoLogin implements com.oracle.bmc.http.internal.BmcEnum {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        NotApplicable("NOT_APPLICABLE"),
        NotSupported("NOT_SUPPORTED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(AutoLogin.class);

        private final String value;
        private static java.util.Map<String, AutoLogin> map;

        static {
            map = new java.util.HashMap<>();
            for (AutoLogin v : AutoLogin.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AutoLogin(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AutoLogin create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AutoLogin', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Whether wallet auto-login is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("autoLogin")
    private final AutoLogin autoLogin;

    /**
     * Whether wallet auto-login is enabled.
     *
     * @return the value
     */
    public AutoLogin getAutoLogin() {
        return autoLogin;
    }

    /** Wallet creation time in RFC3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Wallet creation time in RFC3339 format.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** Wallet encryption algorithm. */
    @com.fasterxml.jackson.annotation.JsonProperty("walletEncryptionAlgorithm")
    private final String walletEncryptionAlgorithm;

    /**
     * Wallet encryption algorithm.
     *
     * @return the value
     */
    public String getWalletEncryptionAlgorithm() {
        return walletEncryptionAlgorithm;
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
        sb.append("CryptoAssessmentWalletSummary(");
        sb.append("super=").append(super.toString());
        sb.append("assessmentId=").append(String.valueOf(this.assessmentId));
        sb.append(", timeLastAssessed=").append(String.valueOf(this.timeLastAssessed));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", feature=").append(String.valueOf(this.feature));
        sb.append(", walletLocation=").append(String.valueOf(this.walletLocation));
        sb.append(", autoLogin=").append(String.valueOf(this.autoLogin));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", walletEncryptionAlgorithm=")
                .append(String.valueOf(this.walletEncryptionAlgorithm));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CryptoAssessmentWalletSummary)) {
            return false;
        }

        CryptoAssessmentWalletSummary other = (CryptoAssessmentWalletSummary) o;
        return java.util.Objects.equals(this.assessmentId, other.assessmentId)
                && java.util.Objects.equals(this.timeLastAssessed, other.timeLastAssessed)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.feature, other.feature)
                && java.util.Objects.equals(this.walletLocation, other.walletLocation)
                && java.util.Objects.equals(this.autoLogin, other.autoLogin)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(
                        this.walletEncryptionAlgorithm, other.walletEncryptionAlgorithm)
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
        result = (result * PRIME) + (this.feature == null ? 43 : this.feature.hashCode());
        result =
                (result * PRIME)
                        + (this.walletLocation == null ? 43 : this.walletLocation.hashCode());
        result = (result * PRIME) + (this.autoLogin == null ? 43 : this.autoLogin.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.walletEncryptionAlgorithm == null
                                ? 43
                                : this.walletEncryptionAlgorithm.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
