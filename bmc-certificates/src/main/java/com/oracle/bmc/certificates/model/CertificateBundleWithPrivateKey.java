/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificates.model;

/**
 * A certificate bundle, including the private key. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CertificateBundleWithPrivateKey.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "certificateBundleType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CertificateBundleWithPrivateKey extends CertificateBundle {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
        private String certificateId;

        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            this.__explicitlySet__.add("certificateId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificateName")
        private String certificateName;

        public Builder certificateName(String certificateName) {
            this.certificateName = certificateName;
            this.__explicitlySet__.add("certificateName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("versionNumber")
        private Long versionNumber;

        public Builder versionNumber(Long versionNumber) {
            this.versionNumber = versionNumber;
            this.__explicitlySet__.add("versionNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
        private String serialNumber;

        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            this.__explicitlySet__.add("serialNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificatePem")
        private String certificatePem;

        public Builder certificatePem(String certificatePem) {
            this.certificatePem = certificatePem;
            this.__explicitlySet__.add("certificatePem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certChainPem")
        private String certChainPem;

        public Builder certChainPem(String certChainPem) {
            this.certChainPem = certChainPem;
            this.__explicitlySet__.add("certChainPem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("validity")
        private Validity validity;

        public Builder validity(Validity validity) {
            this.validity = validity;
            this.__explicitlySet__.add("validity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("versionName")
        private String versionName;

        public Builder versionName(String versionName) {
            this.versionName = versionName;
            this.__explicitlySet__.add("versionName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("stages")
        private java.util.List<VersionStage> stages;

        public Builder stages(java.util.List<VersionStage> stages) {
            this.stages = stages;
            this.__explicitlySet__.add("stages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("revocationStatus")
        private RevocationStatus revocationStatus;

        public Builder revocationStatus(RevocationStatus revocationStatus) {
            this.revocationStatus = revocationStatus;
            this.__explicitlySet__.add("revocationStatus");
            return this;
        }
        /** The private key (in PEM format) for the certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPem")
        private String privateKeyPem;

        /**
         * The private key (in PEM format) for the certificate.
         *
         * @param privateKeyPem the value to set
         * @return this builder
         */
        public Builder privateKeyPem(String privateKeyPem) {
            this.privateKeyPem = privateKeyPem;
            this.__explicitlySet__.add("privateKeyPem");
            return this;
        }
        /** An optional passphrase for the private key. */
        @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPemPassphrase")
        private String privateKeyPemPassphrase;

        /**
         * An optional passphrase for the private key.
         *
         * @param privateKeyPemPassphrase the value to set
         * @return this builder
         */
        public Builder privateKeyPemPassphrase(String privateKeyPemPassphrase) {
            this.privateKeyPemPassphrase = privateKeyPemPassphrase;
            this.__explicitlySet__.add("privateKeyPemPassphrase");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CertificateBundleWithPrivateKey build() {
            CertificateBundleWithPrivateKey model =
                    new CertificateBundleWithPrivateKey(
                            this.certificateId,
                            this.certificateName,
                            this.versionNumber,
                            this.serialNumber,
                            this.certificatePem,
                            this.certChainPem,
                            this.timeCreated,
                            this.validity,
                            this.versionName,
                            this.stages,
                            this.revocationStatus,
                            this.privateKeyPem,
                            this.privateKeyPemPassphrase);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CertificateBundleWithPrivateKey model) {
            if (model.wasPropertyExplicitlySet("certificateId")) {
                this.certificateId(model.getCertificateId());
            }
            if (model.wasPropertyExplicitlySet("certificateName")) {
                this.certificateName(model.getCertificateName());
            }
            if (model.wasPropertyExplicitlySet("versionNumber")) {
                this.versionNumber(model.getVersionNumber());
            }
            if (model.wasPropertyExplicitlySet("serialNumber")) {
                this.serialNumber(model.getSerialNumber());
            }
            if (model.wasPropertyExplicitlySet("certificatePem")) {
                this.certificatePem(model.getCertificatePem());
            }
            if (model.wasPropertyExplicitlySet("certChainPem")) {
                this.certChainPem(model.getCertChainPem());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("validity")) {
                this.validity(model.getValidity());
            }
            if (model.wasPropertyExplicitlySet("versionName")) {
                this.versionName(model.getVersionName());
            }
            if (model.wasPropertyExplicitlySet("stages")) {
                this.stages(model.getStages());
            }
            if (model.wasPropertyExplicitlySet("revocationStatus")) {
                this.revocationStatus(model.getRevocationStatus());
            }
            if (model.wasPropertyExplicitlySet("privateKeyPem")) {
                this.privateKeyPem(model.getPrivateKeyPem());
            }
            if (model.wasPropertyExplicitlySet("privateKeyPemPassphrase")) {
                this.privateKeyPemPassphrase(model.getPrivateKeyPemPassphrase());
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

    @Deprecated
    public CertificateBundleWithPrivateKey(
            String certificateId,
            String certificateName,
            Long versionNumber,
            String serialNumber,
            String certificatePem,
            String certChainPem,
            java.util.Date timeCreated,
            Validity validity,
            String versionName,
            java.util.List<VersionStage> stages,
            RevocationStatus revocationStatus,
            String privateKeyPem,
            String privateKeyPemPassphrase) {
        super(
                certificateId,
                certificateName,
                versionNumber,
                serialNumber,
                certificatePem,
                certChainPem,
                timeCreated,
                validity,
                versionName,
                stages,
                revocationStatus);
        this.privateKeyPem = privateKeyPem;
        this.privateKeyPemPassphrase = privateKeyPemPassphrase;
    }

    /** The private key (in PEM format) for the certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPem")
    private final String privateKeyPem;

    /**
     * The private key (in PEM format) for the certificate.
     *
     * @return the value
     */
    public String getPrivateKeyPem() {
        return privateKeyPem;
    }

    /** An optional passphrase for the private key. */
    @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPemPassphrase")
    private final String privateKeyPemPassphrase;

    /**
     * An optional passphrase for the private key.
     *
     * @return the value
     */
    public String getPrivateKeyPemPassphrase() {
        return privateKeyPemPassphrase;
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
        sb.append("CertificateBundleWithPrivateKey(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", privateKeyPem=").append(String.valueOf(this.privateKeyPem));
        sb.append(", privateKeyPemPassphrase=")
                .append(String.valueOf(this.privateKeyPemPassphrase));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CertificateBundleWithPrivateKey)) {
            return false;
        }

        CertificateBundleWithPrivateKey other = (CertificateBundleWithPrivateKey) o;
        return java.util.Objects.equals(this.privateKeyPem, other.privateKeyPem)
                && java.util.Objects.equals(
                        this.privateKeyPemPassphrase, other.privateKeyPemPassphrase)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.privateKeyPem == null ? 43 : this.privateKeyPem.hashCode());
        result =
                (result * PRIME)
                        + (this.privateKeyPemPassphrase == null
                                ? 43
                                : this.privateKeyPemPassphrase.hashCode());
        return result;
    }
}
