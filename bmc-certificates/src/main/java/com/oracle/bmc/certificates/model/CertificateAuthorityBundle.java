/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificates.model;

/**
 * The contents of the certificate, properties of the certificate (and certificate version), and
 * user-provided contextual metadata for the certificate. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CertificateAuthorityBundle.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CertificateAuthorityBundle
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "certificateAuthorityId",
        "certificateAuthorityName",
        "serialNumber",
        "certificatePem",
        "certChainPem",
        "versionName",
        "timeCreated",
        "versionNumber",
        "validity",
        "stages",
        "revocationStatus"
    })
    public CertificateAuthorityBundle(
            String certificateAuthorityId,
            String certificateAuthorityName,
            String serialNumber,
            String certificatePem,
            String certChainPem,
            String versionName,
            java.util.Date timeCreated,
            Long versionNumber,
            Validity validity,
            java.util.List<VersionStage> stages,
            RevocationStatus revocationStatus) {
        super();
        this.certificateAuthorityId = certificateAuthorityId;
        this.certificateAuthorityName = certificateAuthorityName;
        this.serialNumber = serialNumber;
        this.certificatePem = certificatePem;
        this.certChainPem = certChainPem;
        this.versionName = versionName;
        this.timeCreated = timeCreated;
        this.versionNumber = versionNumber;
        this.validity = validity;
        this.stages = stages;
        this.revocationStatus = revocationStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the certificate authority (CA). */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityId")
        private String certificateAuthorityId;

        /**
         * The OCID of the certificate authority (CA).
         *
         * @param certificateAuthorityId the value to set
         * @return this builder
         */
        public Builder certificateAuthorityId(String certificateAuthorityId) {
            this.certificateAuthorityId = certificateAuthorityId;
            this.__explicitlySet__.add("certificateAuthorityId");
            return this;
        }
        /** The name of the CA. */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityName")
        private String certificateAuthorityName;

        /**
         * The name of the CA.
         *
         * @param certificateAuthorityName the value to set
         * @return this builder
         */
        public Builder certificateAuthorityName(String certificateAuthorityName) {
            this.certificateAuthorityName = certificateAuthorityName;
            this.__explicitlySet__.add("certificateAuthorityName");
            return this;
        }
        /**
         * A unique certificate identifier used in certificate revocation tracking, formatted as
         * octets. Example: {@code 03 AC FC FA CC B3 CB 02 B8 F8 DE F5 85 E7 7B FF}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
        private String serialNumber;

        /**
         * A unique certificate identifier used in certificate revocation tracking, formatted as
         * octets. Example: {@code 03 AC FC FA CC B3 CB 02 B8 F8 DE F5 85 E7 7B FF}
         *
         * @param serialNumber the value to set
         * @return this builder
         */
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            this.__explicitlySet__.add("serialNumber");
            return this;
        }
        /** The certificate (in PEM format) for this CA version. */
        @com.fasterxml.jackson.annotation.JsonProperty("certificatePem")
        private String certificatePem;

        /**
         * The certificate (in PEM format) for this CA version.
         *
         * @param certificatePem the value to set
         * @return this builder
         */
        public Builder certificatePem(String certificatePem) {
            this.certificatePem = certificatePem;
            this.__explicitlySet__.add("certificatePem");
            return this;
        }
        /** The certificate chain (in PEM format) for this CA version. */
        @com.fasterxml.jackson.annotation.JsonProperty("certChainPem")
        private String certChainPem;

        /**
         * The certificate chain (in PEM format) for this CA version.
         *
         * @param certChainPem the value to set
         * @return this builder
         */
        public Builder certChainPem(String certChainPem) {
            this.certChainPem = certChainPem;
            this.__explicitlySet__.add("certChainPem");
            return this;
        }
        /** The name of the CA. */
        @com.fasterxml.jackson.annotation.JsonProperty("versionName")
        private String versionName;

        /**
         * The name of the CA.
         *
         * @param versionName the value to set
         * @return this builder
         */
        public Builder versionName(String versionName) {
            this.versionName = versionName;
            this.__explicitlySet__.add("versionName");
            return this;
        }
        /**
         * A property indicating when the CA was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * A property indicating when the CA was created, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /** The version number of the CA. */
        @com.fasterxml.jackson.annotation.JsonProperty("versionNumber")
        private Long versionNumber;

        /**
         * The version number of the CA.
         *
         * @param versionNumber the value to set
         * @return this builder
         */
        public Builder versionNumber(Long versionNumber) {
            this.versionNumber = versionNumber;
            this.__explicitlySet__.add("versionNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("validity")
        private Validity validity;

        public Builder validity(Validity validity) {
            this.validity = validity;
            this.__explicitlySet__.add("validity");
            return this;
        }
        /** A list of rotation states for this CA. */
        @com.fasterxml.jackson.annotation.JsonProperty("stages")
        private java.util.List<VersionStage> stages;

        /**
         * A list of rotation states for this CA.
         *
         * @param stages the value to set
         * @return this builder
         */
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CertificateAuthorityBundle build() {
            CertificateAuthorityBundle model =
                    new CertificateAuthorityBundle(
                            this.certificateAuthorityId,
                            this.certificateAuthorityName,
                            this.serialNumber,
                            this.certificatePem,
                            this.certChainPem,
                            this.versionName,
                            this.timeCreated,
                            this.versionNumber,
                            this.validity,
                            this.stages,
                            this.revocationStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CertificateAuthorityBundle model) {
            if (model.wasPropertyExplicitlySet("certificateAuthorityId")) {
                this.certificateAuthorityId(model.getCertificateAuthorityId());
            }
            if (model.wasPropertyExplicitlySet("certificateAuthorityName")) {
                this.certificateAuthorityName(model.getCertificateAuthorityName());
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
            if (model.wasPropertyExplicitlySet("versionName")) {
                this.versionName(model.getVersionName());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("versionNumber")) {
                this.versionNumber(model.getVersionNumber());
            }
            if (model.wasPropertyExplicitlySet("validity")) {
                this.validity(model.getValidity());
            }
            if (model.wasPropertyExplicitlySet("stages")) {
                this.stages(model.getStages());
            }
            if (model.wasPropertyExplicitlySet("revocationStatus")) {
                this.revocationStatus(model.getRevocationStatus());
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

    /** The OCID of the certificate authority (CA). */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityId")
    private final String certificateAuthorityId;

    /**
     * The OCID of the certificate authority (CA).
     *
     * @return the value
     */
    public String getCertificateAuthorityId() {
        return certificateAuthorityId;
    }

    /** The name of the CA. */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityName")
    private final String certificateAuthorityName;

    /**
     * The name of the CA.
     *
     * @return the value
     */
    public String getCertificateAuthorityName() {
        return certificateAuthorityName;
    }

    /**
     * A unique certificate identifier used in certificate revocation tracking, formatted as octets.
     * Example: {@code 03 AC FC FA CC B3 CB 02 B8 F8 DE F5 85 E7 7B FF}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    private final String serialNumber;

    /**
     * A unique certificate identifier used in certificate revocation tracking, formatted as octets.
     * Example: {@code 03 AC FC FA CC B3 CB 02 B8 F8 DE F5 85 E7 7B FF}
     *
     * @return the value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** The certificate (in PEM format) for this CA version. */
    @com.fasterxml.jackson.annotation.JsonProperty("certificatePem")
    private final String certificatePem;

    /**
     * The certificate (in PEM format) for this CA version.
     *
     * @return the value
     */
    public String getCertificatePem() {
        return certificatePem;
    }

    /** The certificate chain (in PEM format) for this CA version. */
    @com.fasterxml.jackson.annotation.JsonProperty("certChainPem")
    private final String certChainPem;

    /**
     * The certificate chain (in PEM format) for this CA version.
     *
     * @return the value
     */
    public String getCertChainPem() {
        return certChainPem;
    }

    /** The name of the CA. */
    @com.fasterxml.jackson.annotation.JsonProperty("versionName")
    private final String versionName;

    /**
     * The name of the CA.
     *
     * @return the value
     */
    public String getVersionName() {
        return versionName;
    }

    /**
     * A property indicating when the CA was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * A property indicating when the CA was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /** The version number of the CA. */
    @com.fasterxml.jackson.annotation.JsonProperty("versionNumber")
    private final Long versionNumber;

    /**
     * The version number of the CA.
     *
     * @return the value
     */
    public Long getVersionNumber() {
        return versionNumber;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("validity")
    private final Validity validity;

    public Validity getValidity() {
        return validity;
    }

    /** A list of rotation states for this CA. */
    @com.fasterxml.jackson.annotation.JsonProperty("stages")
    private final java.util.List<VersionStage> stages;

    /**
     * A list of rotation states for this CA.
     *
     * @return the value
     */
    public java.util.List<VersionStage> getStages() {
        return stages;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("revocationStatus")
    private final RevocationStatus revocationStatus;

    public RevocationStatus getRevocationStatus() {
        return revocationStatus;
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
        sb.append("CertificateAuthorityBundle(");
        sb.append("super=").append(super.toString());
        sb.append("certificateAuthorityId=").append(String.valueOf(this.certificateAuthorityId));
        sb.append(", certificateAuthorityName=")
                .append(String.valueOf(this.certificateAuthorityName));
        sb.append(", serialNumber=").append(String.valueOf(this.serialNumber));
        sb.append(", certificatePem=").append(String.valueOf(this.certificatePem));
        sb.append(", certChainPem=").append(String.valueOf(this.certChainPem));
        sb.append(", versionName=").append(String.valueOf(this.versionName));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", versionNumber=").append(String.valueOf(this.versionNumber));
        sb.append(", validity=").append(String.valueOf(this.validity));
        sb.append(", stages=").append(String.valueOf(this.stages));
        sb.append(", revocationStatus=").append(String.valueOf(this.revocationStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CertificateAuthorityBundle)) {
            return false;
        }

        CertificateAuthorityBundle other = (CertificateAuthorityBundle) o;
        return java.util.Objects.equals(this.certificateAuthorityId, other.certificateAuthorityId)
                && java.util.Objects.equals(
                        this.certificateAuthorityName, other.certificateAuthorityName)
                && java.util.Objects.equals(this.serialNumber, other.serialNumber)
                && java.util.Objects.equals(this.certificatePem, other.certificatePem)
                && java.util.Objects.equals(this.certChainPem, other.certChainPem)
                && java.util.Objects.equals(this.versionName, other.versionName)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.versionNumber, other.versionNumber)
                && java.util.Objects.equals(this.validity, other.validity)
                && java.util.Objects.equals(this.stages, other.stages)
                && java.util.Objects.equals(this.revocationStatus, other.revocationStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.certificateAuthorityId == null
                                ? 43
                                : this.certificateAuthorityId.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateAuthorityName == null
                                ? 43
                                : this.certificateAuthorityName.hashCode());
        result = (result * PRIME) + (this.serialNumber == null ? 43 : this.serialNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.certificatePem == null ? 43 : this.certificatePem.hashCode());
        result = (result * PRIME) + (this.certChainPem == null ? 43 : this.certChainPem.hashCode());
        result = (result * PRIME) + (this.versionName == null ? 43 : this.versionName.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.versionNumber == null ? 43 : this.versionNumber.hashCode());
        result = (result * PRIME) + (this.validity == null ? 43 : this.validity.hashCode());
        result = (result * PRIME) + (this.stages == null ? 43 : this.stages.hashCode());
        result =
                (result * PRIME)
                        + (this.revocationStatus == null ? 43 : this.revocationStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
