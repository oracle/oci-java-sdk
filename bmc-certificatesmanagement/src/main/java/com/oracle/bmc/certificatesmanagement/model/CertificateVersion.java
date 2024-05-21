/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The details of the certificate version. This object does not contain the certificate contents.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CertificateVersion.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CertificateVersion extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "certificateId",
        "serialNumber",
        "timeCreated",
        "versionNumber",
        "issuerCaVersionNumber",
        "versionName",
        "subjectAlternativeNames",
        "timeOfDeletion",
        "validity",
        "stages",
        "revocationStatus"
    })
    public CertificateVersion(
            String certificateId,
            String serialNumber,
            java.util.Date timeCreated,
            Long versionNumber,
            Long issuerCaVersionNumber,
            String versionName,
            java.util.List<CertificateSubjectAlternativeName> subjectAlternativeNames,
            java.util.Date timeOfDeletion,
            Validity validity,
            java.util.List<VersionStage> stages,
            RevocationStatus revocationStatus) {
        super();
        this.certificateId = certificateId;
        this.serialNumber = serialNumber;
        this.timeCreated = timeCreated;
        this.versionNumber = versionNumber;
        this.issuerCaVersionNumber = issuerCaVersionNumber;
        this.versionName = versionName;
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.timeOfDeletion = timeOfDeletion;
        this.validity = validity;
        this.stages = stages;
        this.revocationStatus = revocationStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the certificate.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
        private String certificateId;

        /**
         * The OCID of the certificate.
         * @param certificateId the value to set
         * @return this builder
         **/
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            this.__explicitlySet__.add("certificateId");
            return this;
        }
        /**
         * A unique certificate identifier used in certificate revocation tracking, formatted as octets.
         * Example: {@code 03 AC FC FA CC B3 CB 02 B8 F8 DE F5 85 E7 7B FF}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
        private String serialNumber;

        /**
         * A unique certificate identifier used in certificate revocation tracking, formatted as octets.
         * Example: {@code 03 AC FC FA CC B3 CB 02 B8 F8 DE F5 85 E7 7B FF}
         *
         * @param serialNumber the value to set
         * @return this builder
         **/
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            this.__explicitlySet__.add("serialNumber");
            return this;
        }
        /**
         * A optional property indicating when the certificate version was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: {@code 2019-04-03T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * A optional property indicating when the certificate version was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: {@code 2019-04-03T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The version number of the certificate.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("versionNumber")
        private Long versionNumber;

        /**
         * The version number of the certificate.
         * @param versionNumber the value to set
         * @return this builder
         **/
        public Builder versionNumber(Long versionNumber) {
            this.versionNumber = versionNumber;
            this.__explicitlySet__.add("versionNumber");
            return this;
        }
        /**
         * The version number of the issuing certificate authority (CA).
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("issuerCaVersionNumber")
        private Long issuerCaVersionNumber;

        /**
         * The version number of the issuing certificate authority (CA).
         * @param issuerCaVersionNumber the value to set
         * @return this builder
         **/
        public Builder issuerCaVersionNumber(Long issuerCaVersionNumber) {
            this.issuerCaVersionNumber = issuerCaVersionNumber;
            this.__explicitlySet__.add("issuerCaVersionNumber");
            return this;
        }
        /**
         * The name of the certificate version. When the value is not null, a name is unique across versions of a given certificate.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("versionName")
        private String versionName;

        /**
         * The name of the certificate version. When the value is not null, a name is unique across versions of a given certificate.
         *
         * @param versionName the value to set
         * @return this builder
         **/
        public Builder versionName(String versionName) {
            this.versionName = versionName;
            this.__explicitlySet__.add("versionName");
            return this;
        }
        /**
         * A list of subject alternative names.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subjectAlternativeNames")
        private java.util.List<CertificateSubjectAlternativeName> subjectAlternativeNames;

        /**
         * A list of subject alternative names.
         * @param subjectAlternativeNames the value to set
         * @return this builder
         **/
        public Builder subjectAlternativeNames(
                java.util.List<CertificateSubjectAlternativeName> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            this.__explicitlySet__.add("subjectAlternativeNames");
            return this;
        }
        /**
         * An optional property indicating when to delete the certificate version, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: {@code 2019-04-03T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
        private java.util.Date timeOfDeletion;

        /**
         * An optional property indicating when to delete the certificate version, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: {@code 2019-04-03T21:10:29.600Z}
         *
         * @param timeOfDeletion the value to set
         * @return this builder
         **/
        public Builder timeOfDeletion(java.util.Date timeOfDeletion) {
            this.timeOfDeletion = timeOfDeletion;
            this.__explicitlySet__.add("timeOfDeletion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("validity")
        private Validity validity;

        public Builder validity(Validity validity) {
            this.validity = validity;
            this.__explicitlySet__.add("validity");
            return this;
        }
        /**
         * A list of stages of this entity.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("stages")
        private java.util.List<VersionStage> stages;

        /**
         * A list of stages of this entity.
         * @param stages the value to set
         * @return this builder
         **/
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

        public CertificateVersion build() {
            CertificateVersion model =
                    new CertificateVersion(
                            this.certificateId,
                            this.serialNumber,
                            this.timeCreated,
                            this.versionNumber,
                            this.issuerCaVersionNumber,
                            this.versionName,
                            this.subjectAlternativeNames,
                            this.timeOfDeletion,
                            this.validity,
                            this.stages,
                            this.revocationStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CertificateVersion model) {
            if (model.wasPropertyExplicitlySet("certificateId")) {
                this.certificateId(model.getCertificateId());
            }
            if (model.wasPropertyExplicitlySet("serialNumber")) {
                this.serialNumber(model.getSerialNumber());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("versionNumber")) {
                this.versionNumber(model.getVersionNumber());
            }
            if (model.wasPropertyExplicitlySet("issuerCaVersionNumber")) {
                this.issuerCaVersionNumber(model.getIssuerCaVersionNumber());
            }
            if (model.wasPropertyExplicitlySet("versionName")) {
                this.versionName(model.getVersionName());
            }
            if (model.wasPropertyExplicitlySet("subjectAlternativeNames")) {
                this.subjectAlternativeNames(model.getSubjectAlternativeNames());
            }
            if (model.wasPropertyExplicitlySet("timeOfDeletion")) {
                this.timeOfDeletion(model.getTimeOfDeletion());
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
     * The OCID of the certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
    private final String certificateId;

    /**
     * The OCID of the certificate.
     * @return the value
     **/
    public String getCertificateId() {
        return certificateId;
    }

    /**
     * A unique certificate identifier used in certificate revocation tracking, formatted as octets.
     * Example: {@code 03 AC FC FA CC B3 CB 02 B8 F8 DE F5 85 E7 7B FF}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    private final String serialNumber;

    /**
     * A unique certificate identifier used in certificate revocation tracking, formatted as octets.
     * Example: {@code 03 AC FC FA CC B3 CB 02 B8 F8 DE F5 85 E7 7B FF}
     *
     * @return the value
     **/
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * A optional property indicating when the certificate version was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * A optional property indicating when the certificate version was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The version number of the certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versionNumber")
    private final Long versionNumber;

    /**
     * The version number of the certificate.
     * @return the value
     **/
    public Long getVersionNumber() {
        return versionNumber;
    }

    /**
     * The version number of the issuing certificate authority (CA).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("issuerCaVersionNumber")
    private final Long issuerCaVersionNumber;

    /**
     * The version number of the issuing certificate authority (CA).
     * @return the value
     **/
    public Long getIssuerCaVersionNumber() {
        return issuerCaVersionNumber;
    }

    /**
     * The name of the certificate version. When the value is not null, a name is unique across versions of a given certificate.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("versionName")
    private final String versionName;

    /**
     * The name of the certificate version. When the value is not null, a name is unique across versions of a given certificate.
     *
     * @return the value
     **/
    public String getVersionName() {
        return versionName;
    }

    /**
     * A list of subject alternative names.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subjectAlternativeNames")
    private final java.util.List<CertificateSubjectAlternativeName> subjectAlternativeNames;

    /**
     * A list of subject alternative names.
     * @return the value
     **/
    public java.util.List<CertificateSubjectAlternativeName> getSubjectAlternativeNames() {
        return subjectAlternativeNames;
    }

    /**
     * An optional property indicating when to delete the certificate version, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
    private final java.util.Date timeOfDeletion;

    /**
     * An optional property indicating when to delete the certificate version, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeOfDeletion() {
        return timeOfDeletion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("validity")
    private final Validity validity;

    public Validity getValidity() {
        return validity;
    }

    /**
     * A list of stages of this entity.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stages")
    private final java.util.List<VersionStage> stages;

    /**
     * A list of stages of this entity.
     * @return the value
     **/
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
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CertificateVersion(");
        sb.append("super=").append(super.toString());
        sb.append("certificateId=").append(String.valueOf(this.certificateId));
        sb.append(", serialNumber=").append(String.valueOf(this.serialNumber));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", versionNumber=").append(String.valueOf(this.versionNumber));
        sb.append(", issuerCaVersionNumber=").append(String.valueOf(this.issuerCaVersionNumber));
        sb.append(", versionName=").append(String.valueOf(this.versionName));
        sb.append(", subjectAlternativeNames=")
                .append(String.valueOf(this.subjectAlternativeNames));
        sb.append(", timeOfDeletion=").append(String.valueOf(this.timeOfDeletion));
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
        if (!(o instanceof CertificateVersion)) {
            return false;
        }

        CertificateVersion other = (CertificateVersion) o;
        return java.util.Objects.equals(this.certificateId, other.certificateId)
                && java.util.Objects.equals(this.serialNumber, other.serialNumber)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.versionNumber, other.versionNumber)
                && java.util.Objects.equals(this.issuerCaVersionNumber, other.issuerCaVersionNumber)
                && java.util.Objects.equals(this.versionName, other.versionName)
                && java.util.Objects.equals(
                        this.subjectAlternativeNames, other.subjectAlternativeNames)
                && java.util.Objects.equals(this.timeOfDeletion, other.timeOfDeletion)
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
                        + (this.certificateId == null ? 43 : this.certificateId.hashCode());
        result = (result * PRIME) + (this.serialNumber == null ? 43 : this.serialNumber.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.versionNumber == null ? 43 : this.versionNumber.hashCode());
        result =
                (result * PRIME)
                        + (this.issuerCaVersionNumber == null
                                ? 43
                                : this.issuerCaVersionNumber.hashCode());
        result = (result * PRIME) + (this.versionName == null ? 43 : this.versionName.hashCode());
        result =
                (result * PRIME)
                        + (this.subjectAlternativeNames == null
                                ? 43
                                : this.subjectAlternativeNames.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfDeletion == null ? 43 : this.timeOfDeletion.hashCode());
        result = (result * PRIME) + (this.validity == null ? 43 : this.validity.hashCode());
        result = (result * PRIME) + (this.stages == null ? 43 : this.stages.hashCode());
        result =
                (result * PRIME)
                        + (this.revocationStatus == null ? 43 : this.revocationStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
