/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Summary of one certificate discovered across targets in a compartment. <br>
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
        builder = CryptoAssessmentCertificateSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CryptoAssessmentCertificateSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "assessmentId",
        "timeLastAssessed",
        "assessmentType",
        "compartmentId",
        "targetId",
        "walletLocation",
        "certificateType",
        "subject",
        "issuer",
        "status",
        "serialNumber",
        "age",
        "timeValidFrom",
        "timeValidUntil",
        "expiryBucket",
        "daysToExpiry",
        "publicKeyType",
        "signatureAlgorithm"
    })
    public CryptoAssessmentCertificateSummary(
            String assessmentId,
            java.util.Date timeLastAssessed,
            CryptoAssessment.Type assessmentType,
            String compartmentId,
            String targetId,
            String walletLocation,
            CertificateType certificateType,
            String subject,
            String issuer,
            Status status,
            String serialNumber,
            Long age,
            java.util.Date timeValidFrom,
            java.util.Date timeValidUntil,
            String expiryBucket,
            Integer daysToExpiry,
            String publicKeyType,
            String signatureAlgorithm) {
        super();
        this.assessmentId = assessmentId;
        this.timeLastAssessed = timeLastAssessed;
        this.assessmentType = assessmentType;
        this.compartmentId = compartmentId;
        this.targetId = targetId;
        this.walletLocation = walletLocation;
        this.certificateType = certificateType;
        this.subject = subject;
        this.issuer = issuer;
        this.status = status;
        this.serialNumber = serialNumber;
        this.age = age;
        this.timeValidFrom = timeValidFrom;
        this.timeValidUntil = timeValidUntil;
        this.expiryBucket = expiryBucket;
        this.daysToExpiry = daysToExpiry;
        this.publicKeyType = publicKeyType;
        this.signatureAlgorithm = signatureAlgorithm;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of the crypto assessment that discovered the certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("assessmentId")
        private String assessmentId;

        /**
         * OCID of the crypto assessment that discovered the certificate.
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
        /** Type of the crypto assessment that discovered the certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("assessmentType")
        private CryptoAssessment.Type assessmentType;

        /**
         * Type of the crypto assessment that discovered the certificate.
         *
         * @param assessmentType the value to set
         * @return this builder
         */
        public Builder assessmentType(CryptoAssessment.Type assessmentType) {
            this.assessmentType = assessmentType;
            this.__explicitlySet__.add("assessmentType");
            return this;
        }
        /** OCID of the compartment that contains the certificate row. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * OCID of the compartment that contains the certificate row.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** OCID of the target database associated with the certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetId")
        private String targetId;

        /**
         * OCID of the target database associated with the certificate.
         *
         * @param targetId the value to set
         * @return this builder
         */
        public Builder targetId(String targetId) {
            this.targetId = targetId;
            this.__explicitlySet__.add("targetId");
            return this;
        }
        /** Wallet location where the certificate was discovered, if available. */
        @com.fasterxml.jackson.annotation.JsonProperty("walletLocation")
        private String walletLocation;

        /**
         * Wallet location where the certificate was discovered, if available.
         *
         * @param walletLocation the value to set
         * @return this builder
         */
        public Builder walletLocation(String walletLocation) {
            this.walletLocation = walletLocation;
            this.__explicitlySet__.add("walletLocation");
            return this;
        }
        /** Type of certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateType")
        private CertificateType certificateType;

        /**
         * Type of certificate.
         *
         * @param certificateType the value to set
         * @return this builder
         */
        public Builder certificateType(CertificateType certificateType) {
            this.certificateType = certificateType;
            this.__explicitlySet__.add("certificateType");
            return this;
        }
        /** Subject of the certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("subject")
        private String subject;

        /**
         * Subject of the certificate.
         *
         * @param subject the value to set
         * @return this builder
         */
        public Builder subject(String subject) {
            this.subject = subject;
            this.__explicitlySet__.add("subject");
            return this;
        }
        /** Issuer of the certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("issuer")
        private String issuer;

        /**
         * Issuer of the certificate.
         *
         * @param issuer the value to set
         * @return this builder
         */
        public Builder issuer(String issuer) {
            this.issuer = issuer;
            this.__explicitlySet__.add("issuer");
            return this;
        }
        /** Certificate validity status. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Certificate validity status.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /** Certificate serial number. */
        @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
        private String serialNumber;

        /**
         * Certificate serial number.
         *
         * @param serialNumber the value to set
         * @return this builder
         */
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            this.__explicitlySet__.add("serialNumber");
            return this;
        }
        /**
         * Age of the certificate in whole days, calculated from timeValidFrom using the current UTC
         * date.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("age")
        private Long age;

        /**
         * Age of the certificate in whole days, calculated from timeValidFrom using the current UTC
         * date.
         *
         * @param age the value to set
         * @return this builder
         */
        public Builder age(Long age) {
            this.age = age;
            this.__explicitlySet__.add("age");
            return this;
        }
        /** Certificate validity start time in RFC3339 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeValidFrom")
        private java.util.Date timeValidFrom;

        /**
         * Certificate validity start time in RFC3339 format.
         *
         * @param timeValidFrom the value to set
         * @return this builder
         */
        public Builder timeValidFrom(java.util.Date timeValidFrom) {
            this.timeValidFrom = timeValidFrom;
            this.__explicitlySet__.add("timeValidFrom");
            return this;
        }
        /** Certificate validity end time in RFC3339 format. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeValidUntil")
        private java.util.Date timeValidUntil;

        /**
         * Certificate validity end time in RFC3339 format.
         *
         * @param timeValidUntil the value to set
         * @return this builder
         */
        public Builder timeValidUntil(java.util.Date timeValidUntil) {
            this.timeValidUntil = timeValidUntil;
            this.__explicitlySet__.add("timeValidUntil");
            return this;
        }
        /**
         * Expiry bucket populated for the certificate when the assessment runs. Supported values
         * are 0_15, 15_30, 30_60, 60_90, and 90_PLUS.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("expiryBucket")
        private String expiryBucket;

        /**
         * Expiry bucket populated for the certificate when the assessment runs. Supported values
         * are 0_15, 15_30, 30_60, 60_90, and 90_PLUS.
         *
         * @param expiryBucket the value to set
         * @return this builder
         */
        public Builder expiryBucket(String expiryBucket) {
            this.expiryBucket = expiryBucket;
            this.__explicitlySet__.add("expiryBucket");
            return this;
        }
        /**
         * Number of whole days until certificate expiration, calculated from timeValidUntil.
         * Negative values indicate already expired certificates.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("daysToExpiry")
        private Integer daysToExpiry;

        /**
         * Number of whole days until certificate expiration, calculated from timeValidUntil.
         * Negative values indicate already expired certificates.
         *
         * @param daysToExpiry the value to set
         * @return this builder
         */
        public Builder daysToExpiry(Integer daysToExpiry) {
            this.daysToExpiry = daysToExpiry;
            this.__explicitlySet__.add("daysToExpiry");
            return this;
        }
        /** Public key type and size. */
        @com.fasterxml.jackson.annotation.JsonProperty("publicKeyType")
        private String publicKeyType;

        /**
         * Public key type and size.
         *
         * @param publicKeyType the value to set
         * @return this builder
         */
        public Builder publicKeyType(String publicKeyType) {
            this.publicKeyType = publicKeyType;
            this.__explicitlySet__.add("publicKeyType");
            return this;
        }
        /** Signature algorithm used by the certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("signatureAlgorithm")
        private String signatureAlgorithm;

        /**
         * Signature algorithm used by the certificate.
         *
         * @param signatureAlgorithm the value to set
         * @return this builder
         */
        public Builder signatureAlgorithm(String signatureAlgorithm) {
            this.signatureAlgorithm = signatureAlgorithm;
            this.__explicitlySet__.add("signatureAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CryptoAssessmentCertificateSummary build() {
            CryptoAssessmentCertificateSummary model =
                    new CryptoAssessmentCertificateSummary(
                            this.assessmentId,
                            this.timeLastAssessed,
                            this.assessmentType,
                            this.compartmentId,
                            this.targetId,
                            this.walletLocation,
                            this.certificateType,
                            this.subject,
                            this.issuer,
                            this.status,
                            this.serialNumber,
                            this.age,
                            this.timeValidFrom,
                            this.timeValidUntil,
                            this.expiryBucket,
                            this.daysToExpiry,
                            this.publicKeyType,
                            this.signatureAlgorithm);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CryptoAssessmentCertificateSummary model) {
            if (model.wasPropertyExplicitlySet("assessmentId")) {
                this.assessmentId(model.getAssessmentId());
            }
            if (model.wasPropertyExplicitlySet("timeLastAssessed")) {
                this.timeLastAssessed(model.getTimeLastAssessed());
            }
            if (model.wasPropertyExplicitlySet("assessmentType")) {
                this.assessmentType(model.getAssessmentType());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("targetId")) {
                this.targetId(model.getTargetId());
            }
            if (model.wasPropertyExplicitlySet("walletLocation")) {
                this.walletLocation(model.getWalletLocation());
            }
            if (model.wasPropertyExplicitlySet("certificateType")) {
                this.certificateType(model.getCertificateType());
            }
            if (model.wasPropertyExplicitlySet("subject")) {
                this.subject(model.getSubject());
            }
            if (model.wasPropertyExplicitlySet("issuer")) {
                this.issuer(model.getIssuer());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("serialNumber")) {
                this.serialNumber(model.getSerialNumber());
            }
            if (model.wasPropertyExplicitlySet("age")) {
                this.age(model.getAge());
            }
            if (model.wasPropertyExplicitlySet("timeValidFrom")) {
                this.timeValidFrom(model.getTimeValidFrom());
            }
            if (model.wasPropertyExplicitlySet("timeValidUntil")) {
                this.timeValidUntil(model.getTimeValidUntil());
            }
            if (model.wasPropertyExplicitlySet("expiryBucket")) {
                this.expiryBucket(model.getExpiryBucket());
            }
            if (model.wasPropertyExplicitlySet("daysToExpiry")) {
                this.daysToExpiry(model.getDaysToExpiry());
            }
            if (model.wasPropertyExplicitlySet("publicKeyType")) {
                this.publicKeyType(model.getPublicKeyType());
            }
            if (model.wasPropertyExplicitlySet("signatureAlgorithm")) {
                this.signatureAlgorithm(model.getSignatureAlgorithm());
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

    /** OCID of the crypto assessment that discovered the certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("assessmentId")
    private final String assessmentId;

    /**
     * OCID of the crypto assessment that discovered the certificate.
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

    /** Type of the crypto assessment that discovered the certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("assessmentType")
    private final CryptoAssessment.Type assessmentType;

    /**
     * Type of the crypto assessment that discovered the certificate.
     *
     * @return the value
     */
    public CryptoAssessment.Type getAssessmentType() {
        return assessmentType;
    }

    /** OCID of the compartment that contains the certificate row. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * OCID of the compartment that contains the certificate row.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** OCID of the target database associated with the certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    private final String targetId;

    /**
     * OCID of the target database associated with the certificate.
     *
     * @return the value
     */
    public String getTargetId() {
        return targetId;
    }

    /** Wallet location where the certificate was discovered, if available. */
    @com.fasterxml.jackson.annotation.JsonProperty("walletLocation")
    private final String walletLocation;

    /**
     * Wallet location where the certificate was discovered, if available.
     *
     * @return the value
     */
    public String getWalletLocation() {
        return walletLocation;
    }

    /** Type of certificate. */
    public enum CertificateType implements com.oracle.bmc.http.internal.BmcEnum {
        Server("SERVER"),
        User("USER"),
        Trusted("TRUSTED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CertificateType.class);

        private final String value;
        private static java.util.Map<String, CertificateType> map;

        static {
            map = new java.util.HashMap<>();
            for (CertificateType v : CertificateType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CertificateType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CertificateType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CertificateType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Type of certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateType")
    private final CertificateType certificateType;

    /**
     * Type of certificate.
     *
     * @return the value
     */
    public CertificateType getCertificateType() {
        return certificateType;
    }

    /** Subject of the certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    private final String subject;

    /**
     * Subject of the certificate.
     *
     * @return the value
     */
    public String getSubject() {
        return subject;
    }

    /** Issuer of the certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("issuer")
    private final String issuer;

    /**
     * Issuer of the certificate.
     *
     * @return the value
     */
    public String getIssuer() {
        return issuer;
    }

    /** Certificate validity status. */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        Valid("VALID"),
        ExpiringSoon("EXPIRING_SOON"),
        Expired("EXPIRED"),
        Invalid("INVALID"),
        InUse("IN_USE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Certificate validity status. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Certificate validity status.
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /** Certificate serial number. */
    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    private final String serialNumber;

    /**
     * Certificate serial number.
     *
     * @return the value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /**
     * Age of the certificate in whole days, calculated from timeValidFrom using the current UTC
     * date.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("age")
    private final Long age;

    /**
     * Age of the certificate in whole days, calculated from timeValidFrom using the current UTC
     * date.
     *
     * @return the value
     */
    public Long getAge() {
        return age;
    }

    /** Certificate validity start time in RFC3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeValidFrom")
    private final java.util.Date timeValidFrom;

    /**
     * Certificate validity start time in RFC3339 format.
     *
     * @return the value
     */
    public java.util.Date getTimeValidFrom() {
        return timeValidFrom;
    }

    /** Certificate validity end time in RFC3339 format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeValidUntil")
    private final java.util.Date timeValidUntil;

    /**
     * Certificate validity end time in RFC3339 format.
     *
     * @return the value
     */
    public java.util.Date getTimeValidUntil() {
        return timeValidUntil;
    }

    /**
     * Expiry bucket populated for the certificate when the assessment runs. Supported values are
     * 0_15, 15_30, 30_60, 60_90, and 90_PLUS.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("expiryBucket")
    private final String expiryBucket;

    /**
     * Expiry bucket populated for the certificate when the assessment runs. Supported values are
     * 0_15, 15_30, 30_60, 60_90, and 90_PLUS.
     *
     * @return the value
     */
    public String getExpiryBucket() {
        return expiryBucket;
    }

    /**
     * Number of whole days until certificate expiration, calculated from timeValidUntil. Negative
     * values indicate already expired certificates.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("daysToExpiry")
    private final Integer daysToExpiry;

    /**
     * Number of whole days until certificate expiration, calculated from timeValidUntil. Negative
     * values indicate already expired certificates.
     *
     * @return the value
     */
    public Integer getDaysToExpiry() {
        return daysToExpiry;
    }

    /** Public key type and size. */
    @com.fasterxml.jackson.annotation.JsonProperty("publicKeyType")
    private final String publicKeyType;

    /**
     * Public key type and size.
     *
     * @return the value
     */
    public String getPublicKeyType() {
        return publicKeyType;
    }

    /** Signature algorithm used by the certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("signatureAlgorithm")
    private final String signatureAlgorithm;

    /**
     * Signature algorithm used by the certificate.
     *
     * @return the value
     */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
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
        sb.append("CryptoAssessmentCertificateSummary(");
        sb.append("super=").append(super.toString());
        sb.append("assessmentId=").append(String.valueOf(this.assessmentId));
        sb.append(", timeLastAssessed=").append(String.valueOf(this.timeLastAssessed));
        sb.append(", assessmentType=").append(String.valueOf(this.assessmentType));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", targetId=").append(String.valueOf(this.targetId));
        sb.append(", walletLocation=").append(String.valueOf(this.walletLocation));
        sb.append(", certificateType=").append(String.valueOf(this.certificateType));
        sb.append(", subject=").append(String.valueOf(this.subject));
        sb.append(", issuer=").append(String.valueOf(this.issuer));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", serialNumber=").append(String.valueOf(this.serialNumber));
        sb.append(", age=").append(String.valueOf(this.age));
        sb.append(", timeValidFrom=").append(String.valueOf(this.timeValidFrom));
        sb.append(", timeValidUntil=").append(String.valueOf(this.timeValidUntil));
        sb.append(", expiryBucket=").append(String.valueOf(this.expiryBucket));
        sb.append(", daysToExpiry=").append(String.valueOf(this.daysToExpiry));
        sb.append(", publicKeyType=").append(String.valueOf(this.publicKeyType));
        sb.append(", signatureAlgorithm=").append(String.valueOf(this.signatureAlgorithm));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CryptoAssessmentCertificateSummary)) {
            return false;
        }

        CryptoAssessmentCertificateSummary other = (CryptoAssessmentCertificateSummary) o;
        return java.util.Objects.equals(this.assessmentId, other.assessmentId)
                && java.util.Objects.equals(this.timeLastAssessed, other.timeLastAssessed)
                && java.util.Objects.equals(this.assessmentType, other.assessmentType)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.targetId, other.targetId)
                && java.util.Objects.equals(this.walletLocation, other.walletLocation)
                && java.util.Objects.equals(this.certificateType, other.certificateType)
                && java.util.Objects.equals(this.subject, other.subject)
                && java.util.Objects.equals(this.issuer, other.issuer)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.serialNumber, other.serialNumber)
                && java.util.Objects.equals(this.age, other.age)
                && java.util.Objects.equals(this.timeValidFrom, other.timeValidFrom)
                && java.util.Objects.equals(this.timeValidUntil, other.timeValidUntil)
                && java.util.Objects.equals(this.expiryBucket, other.expiryBucket)
                && java.util.Objects.equals(this.daysToExpiry, other.daysToExpiry)
                && java.util.Objects.equals(this.publicKeyType, other.publicKeyType)
                && java.util.Objects.equals(this.signatureAlgorithm, other.signatureAlgorithm)
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
        result =
                (result * PRIME)
                        + (this.assessmentType == null ? 43 : this.assessmentType.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.targetId == null ? 43 : this.targetId.hashCode());
        result =
                (result * PRIME)
                        + (this.walletLocation == null ? 43 : this.walletLocation.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateType == null ? 43 : this.certificateType.hashCode());
        result = (result * PRIME) + (this.subject == null ? 43 : this.subject.hashCode());
        result = (result * PRIME) + (this.issuer == null ? 43 : this.issuer.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.serialNumber == null ? 43 : this.serialNumber.hashCode());
        result = (result * PRIME) + (this.age == null ? 43 : this.age.hashCode());
        result =
                (result * PRIME)
                        + (this.timeValidFrom == null ? 43 : this.timeValidFrom.hashCode());
        result =
                (result * PRIME)
                        + (this.timeValidUntil == null ? 43 : this.timeValidUntil.hashCode());
        result = (result * PRIME) + (this.expiryBucket == null ? 43 : this.expiryBucket.hashCode());
        result = (result * PRIME) + (this.daysToExpiry == null ? 43 : this.daysToExpiry.hashCode());
        result =
                (result * PRIME)
                        + (this.publicKeyType == null ? 43 : this.publicKeyType.hashCode());
        result =
                (result * PRIME)
                        + (this.signatureAlgorithm == null
                                ? 43
                                : this.signatureAlgorithm.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
