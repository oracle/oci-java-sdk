/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The details of the SSL certificate.
 * **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Certificate.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Certificate {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

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

        @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
        private String serialNumber;

        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            this.__explicitlySet__.add("serialNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Integer version;

        public Builder version(Integer version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("signatureAlgorithm")
        private String signatureAlgorithm;

        public Builder signatureAlgorithm(String signatureAlgorithm) {
            this.signatureAlgorithm = signatureAlgorithm;
            this.__explicitlySet__.add("signatureAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeNotValidBefore")
        private java.util.Date timeNotValidBefore;

        public Builder timeNotValidBefore(java.util.Date timeNotValidBefore) {
            this.timeNotValidBefore = timeNotValidBefore;
            this.__explicitlySet__.add("timeNotValidBefore");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeNotValidAfter")
        private java.util.Date timeNotValidAfter;

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

        @com.fasterxml.jackson.annotation.JsonProperty("extensions")
        private java.util.List<Certificate_extensions> extensions;

        public Builder extensions(java.util.List<Certificate_extensions> extensions) {
            this.extensions = extensions;
            this.__explicitlySet__.add("extensions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleStates lifecycleState;

        public Builder lifecycleState(LifecycleStates lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isTrustVerificationDisabled")
        private Boolean isTrustVerificationDisabled;

        public Builder isTrustVerificationDisabled(Boolean isTrustVerificationDisabled) {
            this.isTrustVerificationDisabled = isTrustVerificationDisabled;
            this.__explicitlySet__.add("isTrustVerificationDisabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificateData")
        private String certificateData;

        public Builder certificateData(String certificateData) {
            this.certificateData = certificateData;
            this.__explicitlySet__.add("certificateData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Certificate build() {
            Certificate __instance__ =
                    new Certificate(
                            id,
                            compartmentId,
                            displayName,
                            issuedBy,
                            subjectName,
                            issuerName,
                            serialNumber,
                            version,
                            signatureAlgorithm,
                            timeNotValidBefore,
                            timeNotValidAfter,
                            publicKeyInfo,
                            extensions,
                            freeformTags,
                            definedTags,
                            lifecycleState,
                            timeCreated,
                            isTrustVerificationDisabled,
                            certificateData);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Certificate o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .issuedBy(o.getIssuedBy())
                            .subjectName(o.getSubjectName())
                            .issuerName(o.getIssuerName())
                            .serialNumber(o.getSerialNumber())
                            .version(o.getVersion())
                            .signatureAlgorithm(o.getSignatureAlgorithm())
                            .timeNotValidBefore(o.getTimeNotValidBefore())
                            .timeNotValidAfter(o.getTimeNotValidAfter())
                            .publicKeyInfo(o.getPublicKeyInfo())
                            .extensions(o.getExtensions())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .lifecycleState(o.getLifecycleState())
                            .timeCreated(o.getTimeCreated())
                            .isTrustVerificationDisabled(o.getIsTrustVerificationDisabled())
                            .certificateData(o.getCertificateData());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the certificate's compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The user-friendly name of the certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    @com.fasterxml.jackson.annotation.JsonProperty("issuedBy")
    String issuedBy;

    @com.fasterxml.jackson.annotation.JsonProperty("subjectName")
    CertificateSubjectName subjectName;

    @com.fasterxml.jackson.annotation.JsonProperty("issuerName")
    CertificateIssuerName issuerName;

    /**
     * A unique, positive integer assigned by the Certificate Authority (CA). The issuer name and serial number identify a unique certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    String serialNumber;

    /**
     * The version of the encoded certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    Integer version;

    /**
     * The identifier for the cryptographic algorithm used by the Certificate Authority (CA) to sign this certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signatureAlgorithm")
    String signatureAlgorithm;

    /**
     * The date and time the certificate will become valid, expressed in RFC 3339 timestamp format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeNotValidBefore")
    java.util.Date timeNotValidBefore;

    /**
     * The date and time the certificate will expire, expressed in RFC 3339 timestamp format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeNotValidAfter")
    java.util.Date timeNotValidAfter;

    @com.fasterxml.jackson.annotation.JsonProperty("publicKeyInfo")
    Certificate_publicKeyInfo publicKeyInfo;

    /**
     * Additional attributes associated with users or public keys for managing relationships between Certificate Authorities.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("extensions")
    java.util.List<Certificate_extensions> extensions;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * The current lifecycle state of the SSL certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleStates lifecycleState;

    /**
     * The date and time the certificate was created, expressed in RFC 3339 timestamp format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * This indicates whether trust verification was disabled during the creation of SSL certificate.
     * If {@code true} SSL certificate trust verification was disabled and this SSL certificate is most likely self-signed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTrustVerificationDisabled")
    Boolean isTrustVerificationDisabled;

    /**
     * The data of the SSL certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateData")
    String certificateData;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
