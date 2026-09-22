/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Native network encryption posture details. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CryptoNnePosture.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CryptoNnePosture
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "status",
        "areWeakOptionsAllowed",
        "encryptionConfigured",
        "integrity",
        "serverEncryption",
        "serverIntegrity",
        "keyExchange",
        "quantumReadiness",
        "fipsModeConfigured"
    })
    public CryptoNnePosture(
            CryptoFeatureStatus status,
            CryptoObservedBooleanValue areWeakOptionsAllowed,
            java.util.List<String> encryptionConfigured,
            java.util.List<String> integrity,
            ServerEncryption serverEncryption,
            java.util.List<String> serverIntegrity,
            String keyExchange,
            CryptoQuantumReadiness quantumReadiness,
            CryptoPosture.FipsModeConfigured fipsModeConfigured) {
        super();
        this.status = status;
        this.areWeakOptionsAllowed = areWeakOptionsAllowed;
        this.encryptionConfigured = encryptionConfigured;
        this.integrity = integrity;
        this.serverEncryption = serverEncryption;
        this.serverIntegrity = serverIntegrity;
        this.keyExchange = keyExchange;
        this.quantumReadiness = quantumReadiness;
        this.fipsModeConfigured = fipsModeConfigured;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** NNE enablement status. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private CryptoFeatureStatus status;

        /**
         * NNE enablement status.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(CryptoFeatureStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Indicates if weak NNE options are allowed. */
        @com.fasterxml.jackson.annotation.JsonProperty("areWeakOptionsAllowed")
        private CryptoObservedBooleanValue areWeakOptionsAllowed;

        /**
         * Indicates if weak NNE options are allowed.
         *
         * @param areWeakOptionsAllowed the value to set
         * @return this builder
         */
        public Builder areWeakOptionsAllowed(CryptoObservedBooleanValue areWeakOptionsAllowed) {
            this.areWeakOptionsAllowed = areWeakOptionsAllowed;
            this.__explicitlySet__.add("areWeakOptionsAllowed");
            return this;
        }
        /** Configured network encryption algorithm. */
        @com.fasterxml.jackson.annotation.JsonProperty("encryptionConfigured")
        private java.util.List<String> encryptionConfigured;

        /**
         * Configured network encryption algorithm.
         *
         * @param encryptionConfigured the value to set
         * @return this builder
         */
        public Builder encryptionConfigured(java.util.List<String> encryptionConfigured) {
            this.encryptionConfigured = encryptionConfigured;
            this.__explicitlySet__.add("encryptionConfigured");
            return this;
        }
        /** NNE integrity algorithm(s). */
        @com.fasterxml.jackson.annotation.JsonProperty("integrity")
        private java.util.List<String> integrity;

        /**
         * NNE integrity algorithm(s).
         *
         * @param integrity the value to set
         * @return this builder
         */
        public Builder integrity(java.util.List<String> integrity) {
            this.integrity = integrity;
            this.__explicitlySet__.add("integrity");
            return this;
        }
        /** Observed server-side encryption requirement. */
        @com.fasterxml.jackson.annotation.JsonProperty("serverEncryption")
        private ServerEncryption serverEncryption;

        /**
         * Observed server-side encryption requirement.
         *
         * @param serverEncryption the value to set
         * @return this builder
         */
        public Builder serverEncryption(ServerEncryption serverEncryption) {
            this.serverEncryption = serverEncryption;
            this.__explicitlySet__.add("serverEncryption");
            return this;
        }
        /** NNE server integrity algorithm(s). */
        @com.fasterxml.jackson.annotation.JsonProperty("serverIntegrity")
        private java.util.List<String> serverIntegrity;

        /**
         * NNE server integrity algorithm(s).
         *
         * @param serverIntegrity the value to set
         * @return this builder
         */
        public Builder serverIntegrity(java.util.List<String> serverIntegrity) {
            this.serverIntegrity = serverIntegrity;
            this.__explicitlySet__.add("serverIntegrity");
            return this;
        }
        /** Observed NNE key exchange setting. */
        @com.fasterxml.jackson.annotation.JsonProperty("keyExchange")
        private String keyExchange;

        /**
         * Observed NNE key exchange setting.
         *
         * @param keyExchange the value to set
         * @return this builder
         */
        public Builder keyExchange(String keyExchange) {
            this.keyExchange = keyExchange;
            this.__explicitlySet__.add("keyExchange");
            return this;
        }
        /** Quantum-readiness classification for NNE posture. */
        @com.fasterxml.jackson.annotation.JsonProperty("quantumReadiness")
        private CryptoQuantumReadiness quantumReadiness;

        /**
         * Quantum-readiness classification for NNE posture.
         *
         * @param quantumReadiness the value to set
         * @return this builder
         */
        public Builder quantumReadiness(CryptoQuantumReadiness quantumReadiness) {
            this.quantumReadiness = quantumReadiness;
            this.__explicitlySet__.add("quantumReadiness");
            return this;
        }
        /**
         * FIPS mode configured for NNE when the target uses legacy per-feature FIPS configuration.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("fipsModeConfigured")
        private CryptoPosture.FipsModeConfigured fipsModeConfigured;

        /**
         * FIPS mode configured for NNE when the target uses legacy per-feature FIPS configuration.
         *
         * @param fipsModeConfigured the value to set
         * @return this builder
         */
        public Builder fipsModeConfigured(CryptoPosture.FipsModeConfigured fipsModeConfigured) {
            this.fipsModeConfigured = fipsModeConfigured;
            this.__explicitlySet__.add("fipsModeConfigured");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CryptoNnePosture build() {
            CryptoNnePosture model =
                    new CryptoNnePosture(
                            this.status,
                            this.areWeakOptionsAllowed,
                            this.encryptionConfigured,
                            this.integrity,
                            this.serverEncryption,
                            this.serverIntegrity,
                            this.keyExchange,
                            this.quantumReadiness,
                            this.fipsModeConfigured);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CryptoNnePosture model) {
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("areWeakOptionsAllowed")) {
                this.areWeakOptionsAllowed(model.getAreWeakOptionsAllowed());
            }
            if (model.wasPropertyExplicitlySet("encryptionConfigured")) {
                this.encryptionConfigured(model.getEncryptionConfigured());
            }
            if (model.wasPropertyExplicitlySet("integrity")) {
                this.integrity(model.getIntegrity());
            }
            if (model.wasPropertyExplicitlySet("serverEncryption")) {
                this.serverEncryption(model.getServerEncryption());
            }
            if (model.wasPropertyExplicitlySet("serverIntegrity")) {
                this.serverIntegrity(model.getServerIntegrity());
            }
            if (model.wasPropertyExplicitlySet("keyExchange")) {
                this.keyExchange(model.getKeyExchange());
            }
            if (model.wasPropertyExplicitlySet("quantumReadiness")) {
                this.quantumReadiness(model.getQuantumReadiness());
            }
            if (model.wasPropertyExplicitlySet("fipsModeConfigured")) {
                this.fipsModeConfigured(model.getFipsModeConfigured());
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

    /** NNE enablement status. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final CryptoFeatureStatus status;

    /**
     * NNE enablement status.
     *
     * @return the value
     */
    public CryptoFeatureStatus getStatus() {
        return status;
    }

    /** Indicates if weak NNE options are allowed. */
    @com.fasterxml.jackson.annotation.JsonProperty("areWeakOptionsAllowed")
    private final CryptoObservedBooleanValue areWeakOptionsAllowed;

    /**
     * Indicates if weak NNE options are allowed.
     *
     * @return the value
     */
    public CryptoObservedBooleanValue getAreWeakOptionsAllowed() {
        return areWeakOptionsAllowed;
    }

    /** Configured network encryption algorithm. */
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionConfigured")
    private final java.util.List<String> encryptionConfigured;

    /**
     * Configured network encryption algorithm.
     *
     * @return the value
     */
    public java.util.List<String> getEncryptionConfigured() {
        return encryptionConfigured;
    }

    /** NNE integrity algorithm(s). */
    @com.fasterxml.jackson.annotation.JsonProperty("integrity")
    private final java.util.List<String> integrity;

    /**
     * NNE integrity algorithm(s).
     *
     * @return the value
     */
    public java.util.List<String> getIntegrity() {
        return integrity;
    }

    /** Observed server-side encryption requirement. */
    public enum ServerEncryption implements com.oracle.bmc.http.internal.BmcEnum {
        Required("REQUIRED"),
        Requested("REQUESTED"),
        Accepted("ACCEPTED"),
        Rejected("REJECTED"),
        NotSupported("NOT_SUPPORTED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ServerEncryption.class);

        private final String value;
        private static java.util.Map<String, ServerEncryption> map;

        static {
            map = new java.util.HashMap<>();
            for (ServerEncryption v : ServerEncryption.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ServerEncryption(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ServerEncryption create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ServerEncryption', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Observed server-side encryption requirement. */
    @com.fasterxml.jackson.annotation.JsonProperty("serverEncryption")
    private final ServerEncryption serverEncryption;

    /**
     * Observed server-side encryption requirement.
     *
     * @return the value
     */
    public ServerEncryption getServerEncryption() {
        return serverEncryption;
    }

    /** NNE server integrity algorithm(s). */
    @com.fasterxml.jackson.annotation.JsonProperty("serverIntegrity")
    private final java.util.List<String> serverIntegrity;

    /**
     * NNE server integrity algorithm(s).
     *
     * @return the value
     */
    public java.util.List<String> getServerIntegrity() {
        return serverIntegrity;
    }

    /** Observed NNE key exchange setting. */
    @com.fasterxml.jackson.annotation.JsonProperty("keyExchange")
    private final String keyExchange;

    /**
     * Observed NNE key exchange setting.
     *
     * @return the value
     */
    public String getKeyExchange() {
        return keyExchange;
    }

    /** Quantum-readiness classification for NNE posture. */
    @com.fasterxml.jackson.annotation.JsonProperty("quantumReadiness")
    private final CryptoQuantumReadiness quantumReadiness;

    /**
     * Quantum-readiness classification for NNE posture.
     *
     * @return the value
     */
    public CryptoQuantumReadiness getQuantumReadiness() {
        return quantumReadiness;
    }

    /** FIPS mode configured for NNE when the target uses legacy per-feature FIPS configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("fipsModeConfigured")
    private final CryptoPosture.FipsModeConfigured fipsModeConfigured;

    /**
     * FIPS mode configured for NNE when the target uses legacy per-feature FIPS configuration.
     *
     * @return the value
     */
    public CryptoPosture.FipsModeConfigured getFipsModeConfigured() {
        return fipsModeConfigured;
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
        sb.append("CryptoNnePosture(");
        sb.append("super=").append(super.toString());
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", areWeakOptionsAllowed=").append(String.valueOf(this.areWeakOptionsAllowed));
        sb.append(", encryptionConfigured=").append(String.valueOf(this.encryptionConfigured));
        sb.append(", integrity=").append(String.valueOf(this.integrity));
        sb.append(", serverEncryption=").append(String.valueOf(this.serverEncryption));
        sb.append(", serverIntegrity=").append(String.valueOf(this.serverIntegrity));
        sb.append(", keyExchange=").append(String.valueOf(this.keyExchange));
        sb.append(", quantumReadiness=").append(String.valueOf(this.quantumReadiness));
        sb.append(", fipsModeConfigured=").append(String.valueOf(this.fipsModeConfigured));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CryptoNnePosture)) {
            return false;
        }

        CryptoNnePosture other = (CryptoNnePosture) o;
        return java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.areWeakOptionsAllowed, other.areWeakOptionsAllowed)
                && java.util.Objects.equals(this.encryptionConfigured, other.encryptionConfigured)
                && java.util.Objects.equals(this.integrity, other.integrity)
                && java.util.Objects.equals(this.serverEncryption, other.serverEncryption)
                && java.util.Objects.equals(this.serverIntegrity, other.serverIntegrity)
                && java.util.Objects.equals(this.keyExchange, other.keyExchange)
                && java.util.Objects.equals(this.quantumReadiness, other.quantumReadiness)
                && java.util.Objects.equals(this.fipsModeConfigured, other.fipsModeConfigured)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.areWeakOptionsAllowed == null
                                ? 43
                                : this.areWeakOptionsAllowed.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionConfigured == null
                                ? 43
                                : this.encryptionConfigured.hashCode());
        result = (result * PRIME) + (this.integrity == null ? 43 : this.integrity.hashCode());
        result =
                (result * PRIME)
                        + (this.serverEncryption == null ? 43 : this.serverEncryption.hashCode());
        result =
                (result * PRIME)
                        + (this.serverIntegrity == null ? 43 : this.serverIntegrity.hashCode());
        result = (result * PRIME) + (this.keyExchange == null ? 43 : this.keyExchange.hashCode());
        result =
                (result * PRIME)
                        + (this.quantumReadiness == null ? 43 : this.quantumReadiness.hashCode());
        result =
                (result * PRIME)
                        + (this.fipsModeConfigured == null
                                ? 43
                                : this.fipsModeConfigured.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
