/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The details of the SSL certificate. **Warning:** Oracle recommends that you avoid using any
 * confidential information when you supply string values using the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Certificate.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Certificate extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "displayName",
        "issuedBy",
        "subjectName",
        "issuerName",
        "serialNumber",
        "version",
        "signatureAlgorithm",
        "timeNotValidBefore",
        "timeNotValidAfter",
        "publicKeyInfo",
        "extensions",
        "freeformTags",
        "definedTags",
        "lifecycleState",
        "timeCreated",
        "isTrustVerificationDisabled",
        "certificateData"
    })
    public Certificate(
            String id,
            String compartmentId,
            String displayName,
            String issuedBy,
            CertificateSubjectName subjectName,
            CertificateIssuerName issuerName,
            String serialNumber,
            Integer version,
            String signatureAlgorithm,
            java.util.Date timeNotValidBefore,
            java.util.Date timeNotValidAfter,
            Certificate_publicKeyInfo publicKeyInfo,
            java.util.List<Certificate_extensions> extensions,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            LifecycleStates lifecycleState,
            java.util.Date timeCreated,
            Boolean isTrustVerificationDisabled,
            String certificateData) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.issuedBy = issuedBy;
        this.subjectName = subjectName;
        this.issuerName = issuerName;
        this.serialNumber = serialNumber;
        this.version = version;
        this.signatureAlgorithm = signatureAlgorithm;
        this.timeNotValidBefore = timeNotValidBefore;
        this.timeNotValidAfter = timeNotValidAfter;
        this.publicKeyInfo = publicKeyInfo;
        this.extensions = extensions;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.isTrustVerificationDisabled = isTrustVerificationDisabled;
        this.certificateData = certificateData;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * certificate.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * certificate.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * certificate's compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * certificate's compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The user-friendly name of the certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly name of the certificate.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("issuedBy")
        private String issuedBy;

        public Builder issuedBy(String issuedBy) {
            this.issuedBy = issuedBy;
            this.__explicitlySet__.add("issuedBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subjectName")
        private CertificateSubjectName subjectName;

        public Builder subjectName(CertificateSubjectName subjectName) {
            this.subjectName = subjectName;
            this.__explicitlySet__.add("subjectName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("issuerName")
        private CertificateIssuerName issuerName;

        public Builder issuerName(CertificateIssuerName issuerName) {
            this.issuerName = issuerName;
            this.__explicitlySet__.add("issuerName");
            return this;
        }
        /**
         * A unique, positive integer assigned by the Certificate Authority (CA). The issuer name
         * and serial number identify a unique certificate.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
        private String serialNumber;

        /**
         * A unique, positive integer assigned by the Certificate Authority (CA). The issuer name
         * and serial number identify a unique certificate.
         *
         * @param serialNumber the value to set
         * @return this builder
         */
        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            this.__explicitlySet__.add("serialNumber");
            return this;
        }
        /** The version of the encoded certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Integer version;

        /**
         * The version of the encoded certificate.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(Integer version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * The identifier for the cryptographic algorithm used by the Certificate Authority (CA) to
         * sign this certificate.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("signatureAlgorithm")
        private String signatureAlgorithm;

        /**
         * The identifier for the cryptographic algorithm used by the Certificate Authority (CA) to
         * sign this certificate.
         *
         * @param signatureAlgorithm the value to set
         * @return this builder
         */
        public Builder signatureAlgorithm(String signatureAlgorithm) {
            this.signatureAlgorithm = signatureAlgorithm;
            this.__explicitlySet__.add("signatureAlgorithm");
            return this;
        }
        /**
         * The date and time the certificate will become valid, expressed in RFC 3339 timestamp
         * format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeNotValidBefore")
        private java.util.Date timeNotValidBefore;

        /**
         * The date and time the certificate will become valid, expressed in RFC 3339 timestamp
         * format.
         *
         * @param timeNotValidBefore the value to set
         * @return this builder
         */
        public Builder timeNotValidBefore(java.util.Date timeNotValidBefore) {
            this.timeNotValidBefore = timeNotValidBefore;
            this.__explicitlySet__.add("timeNotValidBefore");
            return this;
        }
        /**
         * The date and time the certificate will expire, expressed in RFC 3339 timestamp format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeNotValidAfter")
        private java.util.Date timeNotValidAfter;

        /**
         * The date and time the certificate will expire, expressed in RFC 3339 timestamp format.
         *
         * @param timeNotValidAfter the value to set
         * @return this builder
         */
        public Builder timeNotValidAfter(java.util.Date timeNotValidAfter) {
            this.timeNotValidAfter = timeNotValidAfter;
            this.__explicitlySet__.add("timeNotValidAfter");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("publicKeyInfo")
        private Certificate_publicKeyInfo publicKeyInfo;

        public Builder publicKeyInfo(Certificate_publicKeyInfo publicKeyInfo) {
            this.publicKeyInfo = publicKeyInfo;
            this.__explicitlySet__.add("publicKeyInfo");
            return this;
        }
        /**
         * Additional attributes associated with users or public keys for managing relationships
         * between Certificate Authorities.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("extensions")
        private java.util.List<Certificate_extensions> extensions;

        /**
         * Additional attributes associated with users or public keys for managing relationships
         * between Certificate Authorities.
         *
         * @param extensions the value to set
         * @return this builder
         */
        public Builder extensions(java.util.List<Certificate_extensions> extensions) {
            this.extensions = extensions;
            this.__explicitlySet__.add("extensions");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /** The current lifecycle state of the SSL certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        /**
         * The current lifecycle state of the SSL certificate.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time the certificate was created, expressed in RFC 3339 timestamp format.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the certificate was created, expressed in RFC 3339 timestamp format.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * This indicates whether trust verification was disabled during the creation of SSL
         * certificate. If {@code true} SSL certificate trust verification was disabled and this SSL
         * certificate is most likely self-signed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isTrustVerificationDisabled")
        private Boolean isTrustVerificationDisabled;

        /**
         * This indicates whether trust verification was disabled during the creation of SSL
         * certificate. If {@code true} SSL certificate trust verification was disabled and this SSL
         * certificate is most likely self-signed.
         *
         * @param isTrustVerificationDisabled the value to set
         * @return this builder
         */
        public Builder isTrustVerificationDisabled(Boolean isTrustVerificationDisabled) {
            this.isTrustVerificationDisabled = isTrustVerificationDisabled;
            this.__explicitlySet__.add("isTrustVerificationDisabled");
            return this;
        }
        /** The data of the SSL certificate. */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateData")
        private String certificateData;

        /**
         * The data of the SSL certificate.
         *
         * @param certificateData the value to set
         * @return this builder
         */
        public Builder certificateData(String certificateData) {
            this.certificateData = certificateData;
            this.__explicitlySet__.add("certificateData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Certificate build() {
            Certificate model =
                    new Certificate(
                            this.id,
                            this.compartmentId,
                            this.displayName,
                            this.issuedBy,
                            this.subjectName,
                            this.issuerName,
                            this.serialNumber,
                            this.version,
                            this.signatureAlgorithm,
                            this.timeNotValidBefore,
                            this.timeNotValidAfter,
                            this.publicKeyInfo,
                            this.extensions,
                            this.freeformTags,
                            this.definedTags,
                            this.lifecycleState,
                            this.timeCreated,
                            this.isTrustVerificationDisabled,
                            this.certificateData);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Certificate model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("issuedBy")) {
                this.issuedBy(model.getIssuedBy());
            }
            if (model.wasPropertyExplicitlySet("subjectName")) {
                this.subjectName(model.getSubjectName());
            }
            if (model.wasPropertyExplicitlySet("issuerName")) {
                this.issuerName(model.getIssuerName());
            }
            if (model.wasPropertyExplicitlySet("serialNumber")) {
                this.serialNumber(model.getSerialNumber());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("signatureAlgorithm")) {
                this.signatureAlgorithm(model.getSignatureAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("timeNotValidBefore")) {
                this.timeNotValidBefore(model.getTimeNotValidBefore());
            }
            if (model.wasPropertyExplicitlySet("timeNotValidAfter")) {
                this.timeNotValidAfter(model.getTimeNotValidAfter());
            }
            if (model.wasPropertyExplicitlySet("publicKeyInfo")) {
                this.publicKeyInfo(model.getPublicKeyInfo());
            }
            if (model.wasPropertyExplicitlySet("extensions")) {
                this.extensions(model.getExtensions());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("isTrustVerificationDisabled")) {
                this.isTrustVerificationDisabled(model.getIsTrustVerificationDisabled());
            }
            if (model.wasPropertyExplicitlySet("certificateData")) {
                this.certificateData(model.getCertificateData());
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

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the certificate.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the certificate.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the certificate's
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the certificate's
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The user-friendly name of the certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly name of the certificate.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("issuedBy")
    private final String issuedBy;

    public String getIssuedBy() {
        return issuedBy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("subjectName")
    private final CertificateSubjectName subjectName;

    public CertificateSubjectName getSubjectName() {
        return subjectName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("issuerName")
    private final CertificateIssuerName issuerName;

    public CertificateIssuerName getIssuerName() {
        return issuerName;
    }

    /**
     * A unique, positive integer assigned by the Certificate Authority (CA). The issuer name and
     * serial number identify a unique certificate.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    private final String serialNumber;

    /**
     * A unique, positive integer assigned by the Certificate Authority (CA). The issuer name and
     * serial number identify a unique certificate.
     *
     * @return the value
     */
    public String getSerialNumber() {
        return serialNumber;
    }

    /** The version of the encoded certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final Integer version;

    /**
     * The version of the encoded certificate.
     *
     * @return the value
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * The identifier for the cryptographic algorithm used by the Certificate Authority (CA) to sign
     * this certificate.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("signatureAlgorithm")
    private final String signatureAlgorithm;

    /**
     * The identifier for the cryptographic algorithm used by the Certificate Authority (CA) to sign
     * this certificate.
     *
     * @return the value
     */
    public String getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    /**
     * The date and time the certificate will become valid, expressed in RFC 3339 timestamp format.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeNotValidBefore")
    private final java.util.Date timeNotValidBefore;

    /**
     * The date and time the certificate will become valid, expressed in RFC 3339 timestamp format.
     *
     * @return the value
     */
    public java.util.Date getTimeNotValidBefore() {
        return timeNotValidBefore;
    }

    /** The date and time the certificate will expire, expressed in RFC 3339 timestamp format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeNotValidAfter")
    private final java.util.Date timeNotValidAfter;

    /**
     * The date and time the certificate will expire, expressed in RFC 3339 timestamp format.
     *
     * @return the value
     */
    public java.util.Date getTimeNotValidAfter() {
        return timeNotValidAfter;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("publicKeyInfo")
    private final Certificate_publicKeyInfo publicKeyInfo;

    public Certificate_publicKeyInfo getPublicKeyInfo() {
        return publicKeyInfo;
    }

    /**
     * Additional attributes associated with users or public keys for managing relationships between
     * Certificate Authorities.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extensions")
    private final java.util.List<Certificate_extensions> extensions;

    /**
     * Additional attributes associated with users or public keys for managing relationships between
     * Certificate Authorities.
     *
     * @return the value
     */
    public java.util.List<Certificate_extensions> getExtensions() {
        return extensions;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /** The current lifecycle state of the SSL certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleStates lifecycleState;

    /**
     * The current lifecycle state of the SSL certificate.
     *
     * @return the value
     */
    public LifecycleStates getLifecycleState() {
        return lifecycleState;
    }

    /** The date and time the certificate was created, expressed in RFC 3339 timestamp format. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the certificate was created, expressed in RFC 3339 timestamp format.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * This indicates whether trust verification was disabled during the creation of SSL
     * certificate. If {@code true} SSL certificate trust verification was disabled and this SSL
     * certificate is most likely self-signed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isTrustVerificationDisabled")
    private final Boolean isTrustVerificationDisabled;

    /**
     * This indicates whether trust verification was disabled during the creation of SSL
     * certificate. If {@code true} SSL certificate trust verification was disabled and this SSL
     * certificate is most likely self-signed.
     *
     * @return the value
     */
    public Boolean getIsTrustVerificationDisabled() {
        return isTrustVerificationDisabled;
    }

    /** The data of the SSL certificate. */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateData")
    private final String certificateData;

    /**
     * The data of the SSL certificate.
     *
     * @return the value
     */
    public String getCertificateData() {
        return certificateData;
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
        sb.append("Certificate(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", issuedBy=").append(String.valueOf(this.issuedBy));
        sb.append(", subjectName=").append(String.valueOf(this.subjectName));
        sb.append(", issuerName=").append(String.valueOf(this.issuerName));
        sb.append(", serialNumber=").append(String.valueOf(this.serialNumber));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", signatureAlgorithm=").append(String.valueOf(this.signatureAlgorithm));
        sb.append(", timeNotValidBefore=").append(String.valueOf(this.timeNotValidBefore));
        sb.append(", timeNotValidAfter=").append(String.valueOf(this.timeNotValidAfter));
        sb.append(", publicKeyInfo=").append(String.valueOf(this.publicKeyInfo));
        sb.append(", extensions=").append(String.valueOf(this.extensions));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", isTrustVerificationDisabled=")
                .append(String.valueOf(this.isTrustVerificationDisabled));
        sb.append(", certificateData=").append(String.valueOf(this.certificateData));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Certificate)) {
            return false;
        }

        Certificate other = (Certificate) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.issuedBy, other.issuedBy)
                && java.util.Objects.equals(this.subjectName, other.subjectName)
                && java.util.Objects.equals(this.issuerName, other.issuerName)
                && java.util.Objects.equals(this.serialNumber, other.serialNumber)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.signatureAlgorithm, other.signatureAlgorithm)
                && java.util.Objects.equals(this.timeNotValidBefore, other.timeNotValidBefore)
                && java.util.Objects.equals(this.timeNotValidAfter, other.timeNotValidAfter)
                && java.util.Objects.equals(this.publicKeyInfo, other.publicKeyInfo)
                && java.util.Objects.equals(this.extensions, other.extensions)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(
                        this.isTrustVerificationDisabled, other.isTrustVerificationDisabled)
                && java.util.Objects.equals(this.certificateData, other.certificateData)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.issuedBy == null ? 43 : this.issuedBy.hashCode());
        result = (result * PRIME) + (this.subjectName == null ? 43 : this.subjectName.hashCode());
        result = (result * PRIME) + (this.issuerName == null ? 43 : this.issuerName.hashCode());
        result = (result * PRIME) + (this.serialNumber == null ? 43 : this.serialNumber.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result =
                (result * PRIME)
                        + (this.signatureAlgorithm == null
                                ? 43
                                : this.signatureAlgorithm.hashCode());
        result =
                (result * PRIME)
                        + (this.timeNotValidBefore == null
                                ? 43
                                : this.timeNotValidBefore.hashCode());
        result =
                (result * PRIME)
                        + (this.timeNotValidAfter == null ? 43 : this.timeNotValidAfter.hashCode());
        result =
                (result * PRIME)
                        + (this.publicKeyInfo == null ? 43 : this.publicKeyInfo.hashCode());
        result = (result * PRIME) + (this.extensions == null ? 43 : this.extensions.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.isTrustVerificationDisabled == null
                                ? 43
                                : this.isTrustVerificationDisabled.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateData == null ? 43 : this.certificateData.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
