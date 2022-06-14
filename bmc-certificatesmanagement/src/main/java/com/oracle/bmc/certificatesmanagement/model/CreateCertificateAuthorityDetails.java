/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The details for creating a certificate authority (CA).
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
    builder = CreateCertificateAuthorityDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateCertificateAuthorityDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "description",
        "compartmentId",
        "certificateAuthorityRules",
        "certificateAuthorityConfig",
        "certificateRevocationListDetails",
        "kmsKeyId",
        "freeformTags",
        "definedTags"
    })
    public CreateCertificateAuthorityDetails(
            String name,
            String description,
            String compartmentId,
            java.util.List<CertificateAuthorityRule> certificateAuthorityRules,
            CreateCertificateAuthorityConfigDetails certificateAuthorityConfig,
            CertificateRevocationListDetails certificateRevocationListDetails,
            String kmsKeyId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.name = name;
        this.description = description;
        this.compartmentId = compartmentId;
        this.certificateAuthorityRules = certificateAuthorityRules;
        this.certificateAuthorityConfig = certificateAuthorityConfig;
        this.certificateRevocationListDetails = certificateRevocationListDetails;
        this.kmsKeyId = kmsKeyId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
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
         * The compartment in which you want to create the CA.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The compartment in which you want to create the CA.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A list of rules that control how the CA is used and managed.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityRules")
        private java.util.List<CertificateAuthorityRule> certificateAuthorityRules;

        /**
         * A list of rules that control how the CA is used and managed.
         * @param certificateAuthorityRules the value to set
         * @return this builder
         **/
        public Builder certificateAuthorityRules(
                java.util.List<CertificateAuthorityRule> certificateAuthorityRules) {
            this.certificateAuthorityRules = certificateAuthorityRules;
            this.__explicitlySet__.add("certificateAuthorityRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityConfig")
        private CreateCertificateAuthorityConfigDetails certificateAuthorityConfig;

        public Builder certificateAuthorityConfig(
                CreateCertificateAuthorityConfigDetails certificateAuthorityConfig) {
            this.certificateAuthorityConfig = certificateAuthorityConfig;
            this.__explicitlySet__.add("certificateAuthorityConfig");
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

        public CreateCertificateAuthorityDetails build() {
            CreateCertificateAuthorityDetails __instance__ =
                    new CreateCertificateAuthorityDetails(
                            name,
                            description,
                            compartmentId,
                            certificateAuthorityRules,
                            certificateAuthorityConfig,
                            certificateRevocationListDetails,
                            kmsKeyId,
                            freeformTags,
                            definedTags);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCertificateAuthorityDetails o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .description(o.getDescription())
                            .compartmentId(o.getCompartmentId())
                            .certificateAuthorityRules(o.getCertificateAuthorityRules())
                            .certificateAuthorityConfig(o.getCertificateAuthorityConfig())
                            .certificateRevocationListDetails(
                                    o.getCertificateRevocationListDetails())
                            .kmsKeyId(o.getKmsKeyId())
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
     * The compartment in which you want to create the CA.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The compartment in which you want to create the CA.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A list of rules that control how the CA is used and managed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityRules")
    private final java.util.List<CertificateAuthorityRule> certificateAuthorityRules;

    /**
     * A list of rules that control how the CA is used and managed.
     * @return the value
     **/
    public java.util.List<CertificateAuthorityRule> getCertificateAuthorityRules() {
        return certificateAuthorityRules;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityConfig")
    private final CreateCertificateAuthorityConfigDetails certificateAuthorityConfig;

    public CreateCertificateAuthorityConfigDetails getCertificateAuthorityConfig() {
        return certificateAuthorityConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("certificateRevocationListDetails")
    private final CertificateRevocationListDetails certificateRevocationListDetails;

    public CertificateRevocationListDetails getCertificateRevocationListDetails() {
        return certificateRevocationListDetails;
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
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateCertificateAuthorityDetails(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", certificateAuthorityRules=")
                .append(String.valueOf(this.certificateAuthorityRules));
        sb.append(", certificateAuthorityConfig=")
                .append(String.valueOf(this.certificateAuthorityConfig));
        sb.append(", certificateRevocationListDetails=")
                .append(String.valueOf(this.certificateRevocationListDetails));
        sb.append(", kmsKeyId=").append(String.valueOf(this.kmsKeyId));
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
        if (!(o instanceof CreateCertificateAuthorityDetails)) {
            return false;
        }

        CreateCertificateAuthorityDetails other = (CreateCertificateAuthorityDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.certificateAuthorityRules, other.certificateAuthorityRules)
                && java.util.Objects.equals(
                        this.certificateAuthorityConfig, other.certificateAuthorityConfig)
                && java.util.Objects.equals(
                        this.certificateRevocationListDetails,
                        other.certificateRevocationListDetails)
                && java.util.Objects.equals(this.kmsKeyId, other.kmsKeyId)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
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
                        + (this.certificateAuthorityConfig == null
                                ? 43
                                : this.certificateAuthorityConfig.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateRevocationListDetails == null
                                ? 43
                                : this.certificateRevocationListDetails.hashCode());
        result = (result * PRIME) + (this.kmsKeyId == null ? 43 : this.kmsKeyId.hashCode());
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
