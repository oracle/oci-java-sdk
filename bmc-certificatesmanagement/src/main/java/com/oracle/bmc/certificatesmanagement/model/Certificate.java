/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The details of the certificate. This object does not contain the certificate contents.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Certificate.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Certificate {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "issuerCertificateAuthorityId",
        "name",
        "description",
        "certificateRules",
        "timeCreated",
        "timeOfDeletion",
        "lifecycleState",
        "lifecycleDetails",
        "compartmentId",
        "currentVersion",
        "subject",
        "certificateRevocationListDetails",
        "configType",
        "keyAlgorithm",
        "signatureAlgorithm",
        "certificateProfileType",
        "freeformTags",
        "definedTags"
    })
    public Certificate(
            String id,
            String issuerCertificateAuthorityId,
            String name,
            String description,
            java.util.List<CertificateRule> certificateRules,
            java.util.Date timeCreated,
            java.util.Date timeOfDeletion,
            CertificateLifecycleState lifecycleState,
            String lifecycleDetails,
            String compartmentId,
            CertificateVersionSummary currentVersion,
            CertificateSubject subject,
            CertificateRevocationListDetails certificateRevocationListDetails,
            CertificateConfigType configType,
            KeyAlgorithm keyAlgorithm,
            SignatureAlgorithm signatureAlgorithm,
            CertificateProfileType certificateProfileType,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.issuerCertificateAuthorityId = issuerCertificateAuthorityId;
        this.name = name;
        this.description = description;
        this.certificateRules = certificateRules;
        this.timeCreated = timeCreated;
        this.timeOfDeletion = timeOfDeletion;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.compartmentId = compartmentId;
        this.currentVersion = currentVersion;
        this.subject = subject;
        this.certificateRevocationListDetails = certificateRevocationListDetails;
        this.configType = configType;
        this.keyAlgorithm = keyAlgorithm;
        this.signatureAlgorithm = signatureAlgorithm;
        this.certificateProfileType = certificateProfileType;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the certificate.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the certificate.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the certificate authority (CA) that issued the certificate.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("issuerCertificateAuthorityId")
        private String issuerCertificateAuthorityId;

        /**
         * The OCID of the certificate authority (CA) that issued the certificate.
         * @param issuerCertificateAuthorityId the value to set
         * @return this builder
         **/
        public Builder issuerCertificateAuthorityId(String issuerCertificateAuthorityId) {
            this.issuerCertificateAuthorityId = issuerCertificateAuthorityId;
            this.__explicitlySet__.add("issuerCertificateAuthorityId");
            return this;
        }
        /**
         * A user-friendly name for the certificate. Names are unique within a compartment. Avoid entering confidential information. Valid characters are uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A user-friendly name for the certificate. Names are unique within a compartment. Avoid entering confidential information. Valid characters are uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * A brief description of the certificate. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A brief description of the certificate. Avoid entering confidential information.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * A list of rules that control how the certificate is used and managed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificateRules")
        private java.util.List<CertificateRule> certificateRules;

        /**
         * A list of rules that control how the certificate is used and managed.
         * @param certificateRules the value to set
         * @return this builder
         **/
        public Builder certificateRules(java.util.List<CertificateRule> certificateRules) {
            this.certificateRules = certificateRules;
            this.__explicitlySet__.add("certificateRules");
            return this;
        }
        /**
         * A property indicating when the certificate was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: {@code 2019-04-03T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * A property indicating when the certificate was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
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
        /**
         * The current lifecycle state of the certificate.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private CertificateLifecycleState lifecycleState;

        /**
         * The current lifecycle state of the certificate.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(CertificateLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Additional information about the current lifecycle state of the certificate.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current lifecycle state of the certificate.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The OCID of the compartment where you want to create the certificate.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment where you want to create the certificate.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currentVersion")
        private CertificateVersionSummary currentVersion;

        public Builder currentVersion(CertificateVersionSummary currentVersion) {
            this.currentVersion = currentVersion;
            this.__explicitlySet__.add("currentVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subject")
        private CertificateSubject subject;

        public Builder subject(CertificateSubject subject) {
            this.subject = subject;
            this.__explicitlySet__.add("subject");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificateRevocationListDetails")
        private CertificateRevocationListDetails certificateRevocationListDetails;

        public Builder certificateRevocationListDetails(
                CertificateRevocationListDetails certificateRevocationListDetails) {
            this.certificateRevocationListDetails = certificateRevocationListDetails;
            this.__explicitlySet__.add("certificateRevocationListDetails");
            return this;
        }
        /**
         * The origin of the certificate.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("configType")
        private CertificateConfigType configType;

        /**
         * The origin of the certificate.
         * @param configType the value to set
         * @return this builder
         **/
        public Builder configType(CertificateConfigType configType) {
            this.configType = configType;
            this.__explicitlySet__.add("configType");
            return this;
        }
        /**
         * The algorithm used to create key pairs.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyAlgorithm")
        private KeyAlgorithm keyAlgorithm;

        /**
         * The algorithm used to create key pairs.
         * @param keyAlgorithm the value to set
         * @return this builder
         **/
        public Builder keyAlgorithm(KeyAlgorithm keyAlgorithm) {
            this.keyAlgorithm = keyAlgorithm;
            this.__explicitlySet__.add("keyAlgorithm");
            return this;
        }
        /**
         * The algorithm used to sign the public key certificate.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("signatureAlgorithm")
        private SignatureAlgorithm signatureAlgorithm;

        /**
         * The algorithm used to sign the public key certificate.
         * @param signatureAlgorithm the value to set
         * @return this builder
         **/
        public Builder signatureAlgorithm(SignatureAlgorithm signatureAlgorithm) {
            this.signatureAlgorithm = signatureAlgorithm;
            this.__explicitlySet__.add("signatureAlgorithm");
            return this;
        }
        /**
         * The name of the profile used to create the certificate, which depends on the type of certificate you need.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificateProfileType")
        private CertificateProfileType certificateProfileType;

        /**
         * The name of the profile used to create the certificate, which depends on the type of certificate you need.
         * @param certificateProfileType the value to set
         * @return this builder
         **/
        public Builder certificateProfileType(CertificateProfileType certificateProfileType) {
            this.certificateProfileType = certificateProfileType;
            this.__explicitlySet__.add("certificateProfileType");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Certificate build() {
            Certificate __instance__ =
                    new Certificate(
                            id,
                            issuerCertificateAuthorityId,
                            name,
                            description,
                            certificateRules,
                            timeCreated,
                            timeOfDeletion,
                            lifecycleState,
                            lifecycleDetails,
                            compartmentId,
                            currentVersion,
                            subject,
                            certificateRevocationListDetails,
                            configType,
                            keyAlgorithm,
                            signatureAlgorithm,
                            certificateProfileType,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Certificate o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .issuerCertificateAuthorityId(o.getIssuerCertificateAuthorityId())
                            .name(o.getName())
                            .description(o.getDescription())
                            .certificateRules(o.getCertificateRules())
                            .timeCreated(o.getTimeCreated())
                            .timeOfDeletion(o.getTimeOfDeletion())
                            .lifecycleState(o.getLifecycleState())
                            .lifecycleDetails(o.getLifecycleDetails())
                            .compartmentId(o.getCompartmentId())
                            .currentVersion(o.getCurrentVersion())
                            .subject(o.getSubject())
                            .certificateRevocationListDetails(
                                    o.getCertificateRevocationListDetails())
                            .configType(o.getConfigType())
                            .keyAlgorithm(o.getKeyAlgorithm())
                            .signatureAlgorithm(o.getSignatureAlgorithm())
                            .certificateProfileType(o.getCertificateProfileType())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The OCID of the certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the certificate.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the certificate authority (CA) that issued the certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("issuerCertificateAuthorityId")
    private final String issuerCertificateAuthorityId;

    /**
     * The OCID of the certificate authority (CA) that issued the certificate.
     * @return the value
     **/
    public String getIssuerCertificateAuthorityId() {
        return issuerCertificateAuthorityId;
    }

    /**
     * A user-friendly name for the certificate. Names are unique within a compartment. Avoid entering confidential information. Valid characters are uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A user-friendly name for the certificate. Names are unique within a compartment. Avoid entering confidential information. Valid characters are uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * A brief description of the certificate. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A brief description of the certificate. Avoid entering confidential information.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * A list of rules that control how the certificate is used and managed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateRules")
    private final java.util.List<CertificateRule> certificateRules;

    /**
     * A list of rules that control how the certificate is used and managed.
     * @return the value
     **/
    public java.util.List<CertificateRule> getCertificateRules() {
        return certificateRules;
    }

    /**
     * A property indicating when the certificate was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * A property indicating when the certificate was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
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

    /**
     * The current lifecycle state of the certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final CertificateLifecycleState lifecycleState;

    /**
     * The current lifecycle state of the certificate.
     * @return the value
     **/
    public CertificateLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Additional information about the current lifecycle state of the certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current lifecycle state of the certificate.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The OCID of the compartment where you want to create the certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment where you want to create the certificate.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("currentVersion")
    private final CertificateVersionSummary currentVersion;

    public CertificateVersionSummary getCurrentVersion() {
        return currentVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    private final CertificateSubject subject;

    public CertificateSubject getSubject() {
        return subject;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("certificateRevocationListDetails")
    private final CertificateRevocationListDetails certificateRevocationListDetails;

    public CertificateRevocationListDetails getCertificateRevocationListDetails() {
        return certificateRevocationListDetails;
    }

    /**
     * The origin of the certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configType")
    private final CertificateConfigType configType;

    /**
     * The origin of the certificate.
     * @return the value
     **/
    public CertificateConfigType getConfigType() {
        return configType;
    }

    /**
     * The algorithm used to create key pairs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyAlgorithm")
    private final KeyAlgorithm keyAlgorithm;

    /**
     * The algorithm used to create key pairs.
     * @return the value
     **/
    public KeyAlgorithm getKeyAlgorithm() {
        return keyAlgorithm;
    }

    /**
     * The algorithm used to sign the public key certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signatureAlgorithm")
    private final SignatureAlgorithm signatureAlgorithm;

    /**
     * The algorithm used to sign the public key certificate.
     * @return the value
     **/
    public SignatureAlgorithm getSignatureAlgorithm() {
        return signatureAlgorithm;
    }

    /**
     * The name of the profile used to create the certificate, which depends on the type of certificate you need.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateProfileType")
    private final CertificateProfileType certificateProfileType;

    /**
     * The name of the profile used to create the certificate, which depends on the type of certificate you need.
     * @return the value
     **/
    public CertificateProfileType getCertificateProfileType() {
        return certificateProfileType;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Certificate(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", issuerCertificateAuthorityId=")
                .append(String.valueOf(this.issuerCertificateAuthorityId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", certificateRules=").append(String.valueOf(this.certificateRules));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeOfDeletion=").append(String.valueOf(this.timeOfDeletion));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", currentVersion=").append(String.valueOf(this.currentVersion));
        sb.append(", subject=").append(String.valueOf(this.subject));
        sb.append(", certificateRevocationListDetails=")
                .append(String.valueOf(this.certificateRevocationListDetails));
        sb.append(", configType=").append(String.valueOf(this.configType));
        sb.append(", keyAlgorithm=").append(String.valueOf(this.keyAlgorithm));
        sb.append(", signatureAlgorithm=").append(String.valueOf(this.signatureAlgorithm));
        sb.append(", certificateProfileType=").append(String.valueOf(this.certificateProfileType));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(
                        this.issuerCertificateAuthorityId, other.issuerCertificateAuthorityId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.certificateRules, other.certificateRules)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeOfDeletion, other.timeOfDeletion)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.currentVersion, other.currentVersion)
                && java.util.Objects.equals(this.subject, other.subject)
                && java.util.Objects.equals(
                        this.certificateRevocationListDetails,
                        other.certificateRevocationListDetails)
                && java.util.Objects.equals(this.configType, other.configType)
                && java.util.Objects.equals(this.keyAlgorithm, other.keyAlgorithm)
                && java.util.Objects.equals(this.signatureAlgorithm, other.signatureAlgorithm)
                && java.util.Objects.equals(
                        this.certificateProfileType, other.certificateProfileType)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.issuerCertificateAuthorityId == null
                                ? 43
                                : this.issuerCertificateAuthorityId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateRules == null ? 43 : this.certificateRules.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfDeletion == null ? 43 : this.timeOfDeletion.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.currentVersion == null ? 43 : this.currentVersion.hashCode());
        result = (result * PRIME) + (this.subject == null ? 43 : this.subject.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateRevocationListDetails == null
                                ? 43
                                : this.certificateRevocationListDetails.hashCode());
        result = (result * PRIME) + (this.configType == null ? 43 : this.configType.hashCode());
        result = (result * PRIME) + (this.keyAlgorithm == null ? 43 : this.keyAlgorithm.hashCode());
        result =
                (result * PRIME)
                        + (this.signatureAlgorithm == null
                                ? 43
                                : this.signatureAlgorithm.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateProfileType == null
                                ? 43
                                : this.certificateProfileType.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
