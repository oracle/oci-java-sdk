/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The metadata details of the certificate authority (CA). This object does not contain the CA contents.
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
    builder = CertificateAuthority.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CertificateAuthority extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "issuerCertificateAuthorityId",
        "name",
        "description",
        "timeCreated",
        "timeOfDeletion",
        "kmsKeyId",
        "lifecycleState",
        "lifecycleDetails",
        "compartmentId",
        "certificateAuthorityRules",
        "currentVersion",
        "certificateRevocationListDetails",
        "configType",
        "subject",
        "signingAlgorithm",
        "freeformTags",
        "definedTags"
    })
    public CertificateAuthority(
            String id,
            String issuerCertificateAuthorityId,
            String name,
            String description,
            java.util.Date timeCreated,
            java.util.Date timeOfDeletion,
            String kmsKeyId,
            CertificateAuthorityLifecycleState lifecycleState,
            String lifecycleDetails,
            String compartmentId,
            java.util.List<CertificateAuthorityRule> certificateAuthorityRules,
            CertificateAuthorityVersionSummary currentVersion,
            CertificateRevocationListDetails certificateRevocationListDetails,
            CertificateAuthorityConfigType configType,
            CertificateSubject subject,
            SignatureAlgorithm signingAlgorithm,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.id = id;
        this.issuerCertificateAuthorityId = issuerCertificateAuthorityId;
        this.name = name;
        this.description = description;
        this.timeCreated = timeCreated;
        this.timeOfDeletion = timeOfDeletion;
        this.kmsKeyId = kmsKeyId;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.compartmentId = compartmentId;
        this.certificateAuthorityRules = certificateAuthorityRules;
        this.currentVersion = currentVersion;
        this.certificateRevocationListDetails = certificateRevocationListDetails;
        this.configType = configType;
        this.subject = subject;
        this.signingAlgorithm = signingAlgorithm;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the CA.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the CA.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The OCID of the parent CA that issued this CA. If this is the root CA, then this value is null.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("issuerCertificateAuthorityId")
        private String issuerCertificateAuthorityId;

        /**
         * The OCID of the parent CA that issued this CA. If this is the root CA, then this value is null.
         *
         * @param issuerCertificateAuthorityId the value to set
         * @return this builder
         **/
        public Builder issuerCertificateAuthorityId(String issuerCertificateAuthorityId) {
            this.issuerCertificateAuthorityId = issuerCertificateAuthorityId;
            this.__explicitlySet__.add("issuerCertificateAuthorityId");
            return this;
        }
        /**
         * A user-friendly name for the CA. Names are unique within a compartment. Avoid entering confidential information. Valid characters include uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A user-friendly name for the CA. Names are unique within a compartment. Avoid entering confidential information. Valid characters include uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * A brief description of the CA.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A brief description of the CA.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * A property indicating when the CA was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: {@code 2019-04-03T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * A property indicating when the CA was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
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
         * An optional property indicating when to delete the CA version, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
         * Example: {@code 2019-04-03T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
        private java.util.Date timeOfDeletion;

        /**
         * An optional property indicating when to delete the CA version, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
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
         * The OCID of the Oracle Cloud Infrastructure Vault key used to encrypt the CA.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
        private String kmsKeyId;

        /**
         * The OCID of the Oracle Cloud Infrastructure Vault key used to encrypt the CA.
         * @param kmsKeyId the value to set
         * @return this builder
         **/
        public Builder kmsKeyId(String kmsKeyId) {
            this.kmsKeyId = kmsKeyId;
            this.__explicitlySet__.add("kmsKeyId");
            return this;
        }
        /**
         * The current lifecycle state of the certificate authority.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private CertificateAuthorityLifecycleState lifecycleState;

        /**
         * The current lifecycle state of the certificate authority.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(CertificateAuthorityLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Additional information about the current CA lifecycle state.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * Additional information about the current CA lifecycle state.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }
        /**
         * The OCID of the compartment under which the CA is created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment under which the CA is created.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * An optional list of rules that control how the CA is used and managed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityRules")
        private java.util.List<CertificateAuthorityRule> certificateAuthorityRules;

        /**
         * An optional list of rules that control how the CA is used and managed.
         * @param certificateAuthorityRules the value to set
         * @return this builder
         **/
        public Builder certificateAuthorityRules(
                java.util.List<CertificateAuthorityRule> certificateAuthorityRules) {
            this.certificateAuthorityRules = certificateAuthorityRules;
            this.__explicitlySet__.add("certificateAuthorityRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currentVersion")
        private CertificateAuthorityVersionSummary currentVersion;

        public Builder currentVersion(CertificateAuthorityVersionSummary currentVersion) {
            this.currentVersion = currentVersion;
            this.__explicitlySet__.add("currentVersion");
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
         * The origin of the CA.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("configType")
        private CertificateAuthorityConfigType configType;

        /**
         * The origin of the CA.
         * @param configType the value to set
         * @return this builder
         **/
        public Builder configType(CertificateAuthorityConfigType configType) {
            this.configType = configType;
            this.__explicitlySet__.add("configType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("subject")
        private CertificateSubject subject;

        public Builder subject(CertificateSubject subject) {
            this.subject = subject;
            this.__explicitlySet__.add("subject");
            return this;
        }
        /**
         * The algorithm used to sign public key certificates that the CA issues.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("signingAlgorithm")
        private SignatureAlgorithm signingAlgorithm;

        /**
         * The algorithm used to sign public key certificates that the CA issues.
         * @param signingAlgorithm the value to set
         * @return this builder
         **/
        public Builder signingAlgorithm(SignatureAlgorithm signingAlgorithm) {
            this.signingAlgorithm = signingAlgorithm;
            this.__explicitlySet__.add("signingAlgorithm");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
         * Example: {@code {"bar-key": "value"}}
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
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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

        public CertificateAuthority build() {
            CertificateAuthority model =
                    new CertificateAuthority(
                            this.id,
                            this.issuerCertificateAuthorityId,
                            this.name,
                            this.description,
                            this.timeCreated,
                            this.timeOfDeletion,
                            this.kmsKeyId,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.compartmentId,
                            this.certificateAuthorityRules,
                            this.currentVersion,
                            this.certificateRevocationListDetails,
                            this.configType,
                            this.subject,
                            this.signingAlgorithm,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CertificateAuthority model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("issuerCertificateAuthorityId")) {
                this.issuerCertificateAuthorityId(model.getIssuerCertificateAuthorityId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeOfDeletion")) {
                this.timeOfDeletion(model.getTimeOfDeletion());
            }
            if (model.wasPropertyExplicitlySet("kmsKeyId")) {
                this.kmsKeyId(model.getKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("certificateAuthorityRules")) {
                this.certificateAuthorityRules(model.getCertificateAuthorityRules());
            }
            if (model.wasPropertyExplicitlySet("currentVersion")) {
                this.currentVersion(model.getCurrentVersion());
            }
            if (model.wasPropertyExplicitlySet("certificateRevocationListDetails")) {
                this.certificateRevocationListDetails(model.getCertificateRevocationListDetails());
            }
            if (model.wasPropertyExplicitlySet("configType")) {
                this.configType(model.getConfigType());
            }
            if (model.wasPropertyExplicitlySet("subject")) {
                this.subject(model.getSubject());
            }
            if (model.wasPropertyExplicitlySet("signingAlgorithm")) {
                this.signingAlgorithm(model.getSigningAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The OCID of the CA.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the CA.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The OCID of the parent CA that issued this CA. If this is the root CA, then this value is null.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("issuerCertificateAuthorityId")
    private final String issuerCertificateAuthorityId;

    /**
     * The OCID of the parent CA that issued this CA. If this is the root CA, then this value is null.
     *
     * @return the value
     **/
    public String getIssuerCertificateAuthorityId() {
        return issuerCertificateAuthorityId;
    }

    /**
     * A user-friendly name for the CA. Names are unique within a compartment. Avoid entering confidential information. Valid characters include uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A user-friendly name for the CA. Names are unique within a compartment. Avoid entering confidential information. Valid characters include uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * A brief description of the CA.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A brief description of the CA.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * A property indicating when the CA was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * A property indicating when the CA was created, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * An optional property indicating when to delete the CA version, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfDeletion")
    private final java.util.Date timeOfDeletion;

    /**
     * An optional property indicating when to delete the CA version, expressed in [RFC 3339](https://tools.ietf.org/html/rfc3339) timestamp format.
     * Example: {@code 2019-04-03T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeOfDeletion() {
        return timeOfDeletion;
    }

    /**
     * The OCID of the Oracle Cloud Infrastructure Vault key used to encrypt the CA.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("kmsKeyId")
    private final String kmsKeyId;

    /**
     * The OCID of the Oracle Cloud Infrastructure Vault key used to encrypt the CA.
     * @return the value
     **/
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * The current lifecycle state of the certificate authority.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final CertificateAuthorityLifecycleState lifecycleState;

    /**
     * The current lifecycle state of the certificate authority.
     * @return the value
     **/
    public CertificateAuthorityLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Additional information about the current CA lifecycle state.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * Additional information about the current CA lifecycle state.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
    }

    /**
     * The OCID of the compartment under which the CA is created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment under which the CA is created.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * An optional list of rules that control how the CA is used and managed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityRules")
    private final java.util.List<CertificateAuthorityRule> certificateAuthorityRules;

    /**
     * An optional list of rules that control how the CA is used and managed.
     * @return the value
     **/
    public java.util.List<CertificateAuthorityRule> getCertificateAuthorityRules() {
        return certificateAuthorityRules;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("currentVersion")
    private final CertificateAuthorityVersionSummary currentVersion;

    public CertificateAuthorityVersionSummary getCurrentVersion() {
        return currentVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("certificateRevocationListDetails")
    private final CertificateRevocationListDetails certificateRevocationListDetails;

    public CertificateRevocationListDetails getCertificateRevocationListDetails() {
        return certificateRevocationListDetails;
    }

    /**
     * The origin of the CA.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("configType")
    private final CertificateAuthorityConfigType configType;

    /**
     * The origin of the CA.
     * @return the value
     **/
    public CertificateAuthorityConfigType getConfigType() {
        return configType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    private final CertificateSubject subject;

    public CertificateSubject getSubject() {
        return subject;
    }

    /**
     * The algorithm used to sign public key certificates that the CA issues.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signingAlgorithm")
    private final SignatureAlgorithm signingAlgorithm;

    /**
     * The algorithm used to sign public key certificates that the CA issues.
     * @return the value
     **/
    public SignatureAlgorithm getSigningAlgorithm() {
        return signingAlgorithm;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for cross-compatibility only.
     * Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CertificateAuthority(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", issuerCertificateAuthorityId=")
                .append(String.valueOf(this.issuerCertificateAuthorityId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeOfDeletion=").append(String.valueOf(this.timeOfDeletion));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", certificateAuthorityRules=")
                .append(String.valueOf(this.certificateAuthorityRules));
        sb.append(", currentVersion=").append(String.valueOf(this.currentVersion));
        sb.append(", certificateRevocationListDetails=")
                .append(String.valueOf(this.certificateRevocationListDetails));
        sb.append(", configType=").append(String.valueOf(this.configType));
        sb.append(", subject=").append(String.valueOf(this.subject));
        sb.append(", signingAlgorithm=").append(String.valueOf(this.signingAlgorithm));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CertificateAuthority)) {
            return false;
        }

        CertificateAuthority other = (CertificateAuthority) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(
                        this.issuerCertificateAuthorityId, other.issuerCertificateAuthorityId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeOfDeletion, other.timeOfDeletion)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.certificateAuthorityRules, other.certificateAuthorityRules)
                && java.util.Objects.equals(this.currentVersion, other.currentVersion)
                && java.util.Objects.equals(
                        this.certificateRevocationListDetails,
                        other.certificateRevocationListDetails)
                && java.util.Objects.equals(this.configType, other.configType)
                && java.util.Objects.equals(this.subject, other.subject)
                && java.util.Objects.equals(this.signingAlgorithm, other.signingAlgorithm)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
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
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.timeOfDeletion == null ? 43 : this.timeOfDeletion.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
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
                        + (this.certificateAuthorityRules == null
                                ? 43
                                : this.certificateAuthorityRules.hashCode());
        result =
                (result * PRIME)
                        + (this.currentVersion == null ? 43 : this.currentVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateRevocationListDetails == null
                                ? 43
                                : this.certificateRevocationListDetails.hashCode());
        result = (result * PRIME) + (this.configType == null ? 43 : this.configType.hashCode());
        result = (result * PRIME) + (this.subject == null ? 43 : this.subject.hashCode());
        result =
                (result * PRIME)
                        + (this.signingAlgorithm == null ? 43 : this.signingAlgorithm.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
