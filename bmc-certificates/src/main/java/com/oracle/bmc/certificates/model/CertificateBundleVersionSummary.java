/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificates.model;

/**
 * The properties of the certificate bundle. Certificate bundle version summary objects do not
 * include the actual contents of the certificate. <br>
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
        builder = CertificateBundleVersionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CertificateBundleVersionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "certificateId",
        "serialNumber",
        "versionName",
        "certificateName",
        "versionNumber",
        "timeCreated",
        "validity",
        "timeOfDeletion",
        "stages",
        "revocationStatus"
    })
    public CertificateBundleVersionSummary(
            String certificateId,
            String serialNumber,
            String versionName,
            String certificateName,
            Long versionNumber,
            java.util.Date timeCreated,
            Validity validity,
            java.util.Date timeOfDeletion,
            java.util.List<VersionStage> stages,
            RevocationStatus revocationStatus) {
        super();
        this.certificateId = certificateId;
        this.serialNumber = serialNumber;
        this.versionName = versionName;
        this.certificateName = certificateName;
        this.versionNumber = versionNumber;
        this.timeCreated = timeCreated;
        this.validity = validity;
        this.timeOfDeletion = timeOfDeletion;
        this.stages = stages;
        this.revocationStatus = revocationStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
        private String certificateId;

        /**
         * The OCID of the certificate.
         *
         * @param certificateId the value to set
         * @return this builder
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            this.__explicitlySet__.add("certificateId");
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
        /** The name of the certificate version. */
        @com.fasterxml.jackson.annotation.JsonProperty("versionName")
        private String versionName;

        /**
         * The name of the certificate version.
         *
         * @param versionName the value to set
         * @return this builder
         */
        public Builder versionName(String versionName) {
            this.versionName = versionName;
            this.__explicitlySet__.add("versionName");
            return this;
        }
        /** The name of the certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateName")
        private String certificateName;

        /**
         * The name of the certificate.
         *
         * @param certificateName the value to set
         * @return this builder
         */
        public Builder certificateName(String certificateName) {
            this.certificateName = certificateName;
            this.__explicitlySet__.add("certificateName");
            return this;
        }
        /** The version number of the certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("versionNumber")
        private Long versionNumber;

        /**
         * The version number of the certificate.
         *
         * @param versionNumber the value to set
         * @return this builder
         */
        public Builder versionNumber(Long versionNumber) {
            this.versionNumber = versionNumber;
            this.__explicitlySet__.add("versionNumber");
            return this;
        }
        /**
         * An optional property indicating when the certificate version was created, expressed in
         * [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * An optional property indicating when the certificate version was created, expressed in
         * [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
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

        @com.fasterxml.jackson.annotation.JsonProperty("validity")
        private Validity validity;

        public Builder validity(Validity validity) {
            this.validity = validity;
            this.__explicitlySet__.add("validity");
            return this;
        }
        /**
         * An optional property indicating when to delete the certificate version, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
        private java.util.Date timeOfDeletion;

        /**
         * An optional property indicating when to delete the certificate version, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         *
         * @param timeOfDeletion the value to set
         * @return this builder
         */
        public Builder timeOfDeletion(java.util.Date timeOfDeletion) {
            this.timeOfDeletion = timeOfDeletion;
            this.__explicitlySet__.add("timeOfDeletion");
            return this;
        }
        /** A list of rotation states for this certificate bundle version. */
        @com.fasterxml.jackson.annotation.JsonProperty("stages")
        private java.util.List<VersionStage> stages;

        /**
         * A list of rotation states for this certificate bundle version.
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

        public CertificateBundleVersionSummary build() {
            CertificateBundleVersionSummary model =
                    new CertificateBundleVersionSummary(
                            this.certificateId,
                            this.serialNumber,
                            this.versionName,
                            this.certificateName,
                            this.versionNumber,
                            this.timeCreated,
                            this.validity,
                            this.timeOfDeletion,
                            this.stages,
                            this.revocationStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CertificateBundleVersionSummary model) {
            if (model.wasPropertyExplicitlySet("certificateId")) {
                this.certificateId(model.getCertificateId());
            }
            if (model.wasPropertyExplicitlySet("serialNumber")) {
                this.serialNumber(model.getSerialNumber());
            }
            if (model.wasPropertyExplicitlySet("versionName")) {
                this.versionName(model.getVersionName());
            }
            if (model.wasPropertyExplicitlySet("certificateName")) {
                this.certificateName(model.getCertificateName());
            }
            if (model.wasPropertyExplicitlySet("versionNumber")) {
                this.versionNumber(model.getVersionNumber());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("validity")) {
                this.validity(model.getValidity());
            }
            if (model.wasPropertyExplicitlySet("timeOfDeletion")) {
                this.timeOfDeletion(model.getTimeOfDeletion());
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

    /** The OCID of the certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateId")
    private final String certificateId;

    /**
     * The OCID of the certificate.
     *
     * @return the value
     */
    public String getCertificateId() {
        return certificateId;
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

    /** The name of the certificate version. */
    @com.fasterxml.jackson.annotation.JsonProperty("versionName")
    private final String versionName;

    /**
     * The name of the certificate version.
     *
     * @return the value
     */
    public String getVersionName() {
        return versionName;
    }

    /** The name of the certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateName")
    private final String certificateName;

    /**
     * The name of the certificate.
     *
     * @return the value
     */
    public String getCertificateName() {
        return certificateName;
    }

    /** The version number of the certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("versionNumber")
    private final Long versionNumber;

    /**
     * The version number of the certificate.
     *
     * @return the value
     */
    public Long getVersionNumber() {
        return versionNumber;
    }

    /**
     * An optional property indicating when the certificate version was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * An optional property indicating when the certificate version was created, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("validity")
    private final Validity validity;

    public Validity getValidity() {
        return validity;
    }

    /**
     * An optional property indicating when to delete the certificate version, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
    private final java.util.Date timeOfDeletion;

    /**
     * An optional property indicating when to delete the certificate version, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeOfDeletion() {
        return timeOfDeletion;
    }

    /** A list of rotation states for this certificate bundle version. */
    @com.fasterxml.jackson.annotation.JsonProperty("stages")
    private final java.util.List<VersionStage> stages;

    /**
     * A list of rotation states for this certificate bundle version.
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
        sb.append("CertificateBundleVersionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("certificateId=").append(String.valueOf(this.certificateId));
        sb.append(", serialNumber=").append(String.valueOf(this.serialNumber));
        sb.append(", versionName=").append(String.valueOf(this.versionName));
        sb.append(", certificateName=").append(String.valueOf(this.certificateName));
        sb.append(", versionNumber=").append(String.valueOf(this.versionNumber));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", validity=").append(String.valueOf(this.validity));
        sb.append(", timeOfDeletion=").append(String.valueOf(this.timeOfDeletion));
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
        if (!(o instanceof CertificateBundleVersionSummary)) {
            return false;
        }

        CertificateBundleVersionSummary other = (CertificateBundleVersionSummary) o;
        return java.util.Objects.equals(this.certificateId, other.certificateId)
                && java.util.Objects.equals(this.serialNumber, other.serialNumber)
                && java.util.Objects.equals(this.versionName, other.versionName)
                && java.util.Objects.equals(this.certificateName, other.certificateName)
                && java.util.Objects.equals(this.versionNumber, other.versionNumber)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.validity, other.validity)
                && java.util.Objects.equals(this.timeOfDeletion, other.timeOfDeletion)
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
        result = (result * PRIME) + (this.versionName == null ? 43 : this.versionName.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateName == null ? 43 : this.certificateName.hashCode());
        result =
                (result * PRIME)
                        + (this.versionNumber == null ? 43 : this.versionNumber.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.validity == null ? 43 : this.validity.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfDeletion == null ? 43 : this.timeOfDeletion.hashCode());
        result = (result * PRIME) + (this.stages == null ? 43 : this.stages.hashCode());
        result =
                (result * PRIME)
                        + (this.revocationStatus == null ? 43 : this.revocationStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
