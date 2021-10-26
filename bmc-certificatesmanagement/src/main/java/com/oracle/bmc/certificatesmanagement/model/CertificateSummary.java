/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CertificateSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CertificateSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("issuerCertificateAuthorityId")
        private String issuerCertificateAuthorityId;

        public Builder issuerCertificateAuthorityId(String issuerCertificateAuthorityId) {
            this.issuerCertificateAuthorityId = issuerCertificateAuthorityId;
            this.__explicitlySet__.add("issuerCertificateAuthorityId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
        private java.util.Date timeOfDeletion;

        public Builder timeOfDeletion(java.util.Date timeOfDeletion) {
            this.timeOfDeletion = timeOfDeletion;
            this.__explicitlySet__.add("timeOfDeletion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private CertificateLifecycleState lifecycleState;

        public Builder lifecycleState(CertificateLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificateRules")
        private java.util.List<CertificateRule> certificateRules;

        public Builder certificateRules(java.util.List<CertificateRule> certificateRules) {
            this.certificateRules = certificateRules;
            this.__explicitlySet__.add("certificateRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currentVersionSummary")
        private CertificateVersionSummary currentVersionSummary;

        public Builder currentVersionSummary(CertificateVersionSummary currentVersionSummary) {
            this.currentVersionSummary = currentVersionSummary;
            this.__explicitlySet__.add("currentVersionSummary");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subject")
        private CertificateSubject subject;

        public Builder subject(CertificateSubject subject) {
            this.subject = subject;
            this.__explicitlySet__.add("subject");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configType")
        private CertificateConfigType configType;

        public Builder configType(CertificateConfigType configType) {
            this.configType = configType;
            this.__explicitlySet__.add("configType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keyAlgorithm")
        private KeyAlgorithm keyAlgorithm;

        public Builder keyAlgorithm(KeyAlgorithm keyAlgorithm) {
            this.keyAlgorithm = keyAlgorithm;
            this.__explicitlySet__.add("keyAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("signatureAlgorithm")
        private SignatureAlgorithm signatureAlgorithm;

        public Builder signatureAlgorithm(SignatureAlgorithm signatureAlgorithm) {
            this.signatureAlgorithm = signatureAlgorithm;
            this.__explicitlySet__.add("signatureAlgorithm");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificateProfileType")
        private CertificateProfileType certificateProfileType;

        public Builder certificateProfileType(CertificateProfileType certificateProfileType) {
            this.certificateProfileType = certificateProfileType;
            this.__explicitlySet__.add("certificateProfileType");
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CertificateSummary build() {
            CertificateSummary __instance__ =
                    new CertificateSummary(
                            id,
                            issuerCertificateAuthorityId,
                            name,
                            description,
                            timeCreated,
                            timeOfDeletion,
                            lifecycleState,
                            compartmentId,
                            certificateRules,
                            currentVersionSummary,
                            subject,
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
        public Builder copy(CertificateSummary o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .issuerCertificateAuthorityId(o.getIssuerCertificateAuthorityId())
                            .name(o.getName())
                            .description(o.getDescription())
                            .timeCreated(o.getTimeCreated())
                            .timeOfDeletion(o.getTimeOfDeletion())
                            .lifecycleState(o.getLifecycleState())
                            .compartmentId(o.getCompartmentId())
                            .certificateRules(o.getCertificateRules())
                            .currentVersionSummary(o.getCurrentVersionSummary())
                            .subject(o.getSubject())
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

    /**
     * The OCID of the certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the certificate authority (CA) that issued the certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("issuerCertificateAuthorityId")
    String issuerCertificateAuthorityId;

    /**
     * A user-friendly name for the certificate. Names are unique within a compartment. Avoid entering confidential information. Valid characters are uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * A brief description of the certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * A property indicating when the certificate was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * An optional property indicating when to delete the certificate version, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
    java.util.Date timeOfDeletion;

    /**
     * The current lifecycle state of the certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    CertificateLifecycleState lifecycleState;

    /**
     * The OCID of the compartment that contains the certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * An optional list of rules that control how the certificate is used and managed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateRules")
    java.util.List<CertificateRule> certificateRules;

    @com.fasterxml.jackson.annotation.JsonProperty("currentVersionSummary")
    CertificateVersionSummary currentVersionSummary;

    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    CertificateSubject subject;

    /**
     * The origin of the certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configType")
    CertificateConfigType configType;

    /**
     * The algorithm used to create key pairs.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyAlgorithm")
    KeyAlgorithm keyAlgorithm;

    /**
     * The algorithm used to sign the public key certificate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signatureAlgorithm")
    SignatureAlgorithm signatureAlgorithm;

    /**
     * The name of the profile used to create the certificate, which depends on the type of certificate you need.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateProfileType")
    CertificateProfileType certificateProfileType;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
