/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * TLS posture details.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CryptoTlsPosture.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CryptoTlsPosture extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "status",
        "versions",
        "cipherSuitesConfigured",
        "areWeakCipherSuitesAllowed",
        "isMtlsConfigured",
        "revocationMode",
        "fipsModeConfigured",
        "walletLocation",
        "quantumReadiness"
    })
    public CryptoTlsPosture(
            CryptoFeatureStatus status,
            java.util.List<String> versions,
            java.util.List<String> cipherSuitesConfigured,
            CryptoObservedBooleanValue areWeakCipherSuitesAllowed,
            CryptoObservedBooleanValue isMtlsConfigured,
            String revocationMode,
            CryptoPosture.FipsModeConfigured fipsModeConfigured,
            String walletLocation,
            CryptoQuantumReadiness quantumReadiness) {
        super();
        this.status = status;
        this.versions = versions;
        this.cipherSuitesConfigured = cipherSuitesConfigured;
        this.areWeakCipherSuitesAllowed = areWeakCipherSuitesAllowed;
        this.isMtlsConfigured = isMtlsConfigured;
        this.revocationMode = revocationMode;
        this.fipsModeConfigured = fipsModeConfigured;
        this.walletLocation = walletLocation;
        this.quantumReadiness = quantumReadiness;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * TLS enablement status.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private CryptoFeatureStatus status;

        /**
         * TLS enablement status.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(CryptoFeatureStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * TLS versions configured on target.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("versions")
        private java.util.List<String> versions;

        /**
         * TLS versions configured on target.
         * @param versions the value to set
         * @return this builder
         **/
        public Builder versions(java.util.List<String> versions) {
            this.versions = versions;
            this.__explicitlySet__.add("versions");
            return this;
        }
        /**
         * TLS cipher suites configured on target.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cipherSuitesConfigured")
        private java.util.List<String> cipherSuitesConfigured;

        /**
         * TLS cipher suites configured on target.
         * @param cipherSuitesConfigured the value to set
         * @return this builder
         **/
        public Builder cipherSuitesConfigured(java.util.List<String> cipherSuitesConfigured) {
            this.cipherSuitesConfigured = cipherSuitesConfigured;
            this.__explicitlySet__.add("cipherSuitesConfigured");
            return this;
        }
        /**
         * Indicates if weak TLS cipher suites are allowed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("areWeakCipherSuitesAllowed")
        private CryptoObservedBooleanValue areWeakCipherSuitesAllowed;

        /**
         * Indicates if weak TLS cipher suites are allowed.
         * @param areWeakCipherSuitesAllowed the value to set
         * @return this builder
         **/
        public Builder areWeakCipherSuitesAllowed(
                CryptoObservedBooleanValue areWeakCipherSuitesAllowed) {
            this.areWeakCipherSuitesAllowed = areWeakCipherSuitesAllowed;
            this.__explicitlySet__.add("areWeakCipherSuitesAllowed");
            return this;
        }
        /**
         * Whether TLS client authentication is configured.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isMtlsConfigured")
        private CryptoObservedBooleanValue isMtlsConfigured;

        /**
         * Whether TLS client authentication is configured.
         * @param isMtlsConfigured the value to set
         * @return this builder
         **/
        public Builder isMtlsConfigured(CryptoObservedBooleanValue isMtlsConfigured) {
            this.isMtlsConfigured = isMtlsConfigured;
            this.__explicitlySet__.add("isMtlsConfigured");
            return this;
        }
        /**
         * Certificate revocation checking mode.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("revocationMode")
        private String revocationMode;

        /**
         * Certificate revocation checking mode.
         * @param revocationMode the value to set
         * @return this builder
         **/
        public Builder revocationMode(String revocationMode) {
            this.revocationMode = revocationMode;
            this.__explicitlySet__.add("revocationMode");
            return this;
        }
        /**
         * FIPS mode configured for TLS when the target uses legacy per-feature FIPS configuration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fipsModeConfigured")
        private CryptoPosture.FipsModeConfigured fipsModeConfigured;

        /**
         * FIPS mode configured for TLS when the target uses legacy per-feature FIPS configuration.
         * @param fipsModeConfigured the value to set
         * @return this builder
         **/
        public Builder fipsModeConfigured(CryptoPosture.FipsModeConfigured fipsModeConfigured) {
            this.fipsModeConfigured = fipsModeConfigured;
            this.__explicitlySet__.add("fipsModeConfigured");
            return this;
        }
        /**
         * TLS wallet location observed on target.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("walletLocation")
        private String walletLocation;

        /**
         * TLS wallet location observed on target.
         * @param walletLocation the value to set
         * @return this builder
         **/
        public Builder walletLocation(String walletLocation) {
            this.walletLocation = walletLocation;
            this.__explicitlySet__.add("walletLocation");
            return this;
        }
        /**
         * Quantum-readiness classification for TLS posture.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("quantumReadiness")
        private CryptoQuantumReadiness quantumReadiness;

        /**
         * Quantum-readiness classification for TLS posture.
         * @param quantumReadiness the value to set
         * @return this builder
         **/
        public Builder quantumReadiness(CryptoQuantumReadiness quantumReadiness) {
            this.quantumReadiness = quantumReadiness;
            this.__explicitlySet__.add("quantumReadiness");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CryptoTlsPosture build() {
            CryptoTlsPosture model =
                    new CryptoTlsPosture(
                            this.status,
                            this.versions,
                            this.cipherSuitesConfigured,
                            this.areWeakCipherSuitesAllowed,
                            this.isMtlsConfigured,
                            this.revocationMode,
                            this.fipsModeConfigured,
                            this.walletLocation,
                            this.quantumReadiness);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CryptoTlsPosture model) {
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("versions")) {
                this.versions(model.getVersions());
            }
            if (model.wasPropertyExplicitlySet("cipherSuitesConfigured")) {
                this.cipherSuitesConfigured(model.getCipherSuitesConfigured());
            }
            if (model.wasPropertyExplicitlySet("areWeakCipherSuitesAllowed")) {
                this.areWeakCipherSuitesAllowed(model.getAreWeakCipherSuitesAllowed());
            }
            if (model.wasPropertyExplicitlySet("isMtlsConfigured")) {
                this.isMtlsConfigured(model.getIsMtlsConfigured());
            }
            if (model.wasPropertyExplicitlySet("revocationMode")) {
                this.revocationMode(model.getRevocationMode());
            }
            if (model.wasPropertyExplicitlySet("fipsModeConfigured")) {
                this.fipsModeConfigured(model.getFipsModeConfigured());
            }
            if (model.wasPropertyExplicitlySet("walletLocation")) {
                this.walletLocation(model.getWalletLocation());
            }
            if (model.wasPropertyExplicitlySet("quantumReadiness")) {
                this.quantumReadiness(model.getQuantumReadiness());
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

    /**
     * TLS enablement status.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final CryptoFeatureStatus status;

    /**
     * TLS enablement status.
     * @return the value
     **/
    public CryptoFeatureStatus getStatus() {
        return status;
    }

    /**
     * TLS versions configured on target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versions")
    private final java.util.List<String> versions;

    /**
     * TLS versions configured on target.
     * @return the value
     **/
    public java.util.List<String> getVersions() {
        return versions;
    }

    /**
     * TLS cipher suites configured on target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cipherSuitesConfigured")
    private final java.util.List<String> cipherSuitesConfigured;

    /**
     * TLS cipher suites configured on target.
     * @return the value
     **/
    public java.util.List<String> getCipherSuitesConfigured() {
        return cipherSuitesConfigured;
    }

    /**
     * Indicates if weak TLS cipher suites are allowed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("areWeakCipherSuitesAllowed")
    private final CryptoObservedBooleanValue areWeakCipherSuitesAllowed;

    /**
     * Indicates if weak TLS cipher suites are allowed.
     * @return the value
     **/
    public CryptoObservedBooleanValue getAreWeakCipherSuitesAllowed() {
        return areWeakCipherSuitesAllowed;
    }

    /**
     * Whether TLS client authentication is configured.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMtlsConfigured")
    private final CryptoObservedBooleanValue isMtlsConfigured;

    /**
     * Whether TLS client authentication is configured.
     * @return the value
     **/
    public CryptoObservedBooleanValue getIsMtlsConfigured() {
        return isMtlsConfigured;
    }

    /**
     * Certificate revocation checking mode.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("revocationMode")
    private final String revocationMode;

    /**
     * Certificate revocation checking mode.
     * @return the value
     **/
    public String getRevocationMode() {
        return revocationMode;
    }

    /**
     * FIPS mode configured for TLS when the target uses legacy per-feature FIPS configuration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fipsModeConfigured")
    private final CryptoPosture.FipsModeConfigured fipsModeConfigured;

    /**
     * FIPS mode configured for TLS when the target uses legacy per-feature FIPS configuration.
     * @return the value
     **/
    public CryptoPosture.FipsModeConfigured getFipsModeConfigured() {
        return fipsModeConfigured;
    }

    /**
     * TLS wallet location observed on target.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("walletLocation")
    private final String walletLocation;

    /**
     * TLS wallet location observed on target.
     * @return the value
     **/
    public String getWalletLocation() {
        return walletLocation;
    }

    /**
     * Quantum-readiness classification for TLS posture.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quantumReadiness")
    private final CryptoQuantumReadiness quantumReadiness;

    /**
     * Quantum-readiness classification for TLS posture.
     * @return the value
     **/
    public CryptoQuantumReadiness getQuantumReadiness() {
        return quantumReadiness;
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
        sb.append("CryptoTlsPosture(");
        sb.append("super=").append(super.toString());
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", versions=").append(String.valueOf(this.versions));
        sb.append(", cipherSuitesConfigured=").append(String.valueOf(this.cipherSuitesConfigured));
        sb.append(", areWeakCipherSuitesAllowed=")
                .append(String.valueOf(this.areWeakCipherSuitesAllowed));
        sb.append(", isMtlsConfigured=").append(String.valueOf(this.isMtlsConfigured));
        sb.append(", revocationMode=").append(String.valueOf(this.revocationMode));
        sb.append(", fipsModeConfigured=").append(String.valueOf(this.fipsModeConfigured));
        sb.append(", walletLocation=").append(String.valueOf(this.walletLocation));
        sb.append(", quantumReadiness=").append(String.valueOf(this.quantumReadiness));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CryptoTlsPosture)) {
            return false;
        }

        CryptoTlsPosture other = (CryptoTlsPosture) o;
        return java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.versions, other.versions)
                && java.util.Objects.equals(
                        this.cipherSuitesConfigured, other.cipherSuitesConfigured)
                && java.util.Objects.equals(
                        this.areWeakCipherSuitesAllowed, other.areWeakCipherSuitesAllowed)
                && java.util.Objects.equals(this.isMtlsConfigured, other.isMtlsConfigured)
                && java.util.Objects.equals(this.revocationMode, other.revocationMode)
                && java.util.Objects.equals(this.fipsModeConfigured, other.fipsModeConfigured)
                && java.util.Objects.equals(this.walletLocation, other.walletLocation)
                && java.util.Objects.equals(this.quantumReadiness, other.quantumReadiness)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.versions == null ? 43 : this.versions.hashCode());
        result =
                (result * PRIME)
                        + (this.cipherSuitesConfigured == null
                                ? 43
                                : this.cipherSuitesConfigured.hashCode());
        result =
                (result * PRIME)
                        + (this.areWeakCipherSuitesAllowed == null
                                ? 43
                                : this.areWeakCipherSuitesAllowed.hashCode());
        result =
                (result * PRIME)
                        + (this.isMtlsConfigured == null ? 43 : this.isMtlsConfigured.hashCode());
        result =
                (result * PRIME)
                        + (this.revocationMode == null ? 43 : this.revocationMode.hashCode());
        result =
                (result * PRIME)
                        + (this.fipsModeConfigured == null
                                ? 43
                                : this.fipsModeConfigured.hashCode());
        result =
                (result * PRIME)
                        + (this.walletLocation == null ? 43 : this.walletLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.quantumReadiness == null ? 43 : this.quantumReadiness.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
