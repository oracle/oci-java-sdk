/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The details for updating a certificate authority (CA). <br>
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
        builder = UpdateCertificateAuthorityDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateCertificateAuthorityDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "currentVersionNumber",
        "certificateAuthorityConfig",
        "certificateRevocationListDetails",
        "freeformTags",
        "definedTags",
        "certificateAuthorityRules"
    })
    public UpdateCertificateAuthorityDetails(
            String description,
            Long currentVersionNumber,
            UpdateCertificateAuthorityConfigDetails certificateAuthorityConfig,
            CertificateRevocationListDetails certificateRevocationListDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<CertificateAuthorityRule> certificateAuthorityRules) {
        super();
        this.description = description;
        this.currentVersionNumber = currentVersionNumber;
        this.certificateAuthorityConfig = certificateAuthorityConfig;
        this.certificateRevocationListDetails = certificateRevocationListDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.certificateAuthorityRules = certificateAuthorityRules;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A brief description of the CA. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A brief description of the CA.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Makes this version the current version. This property cannot be updated in combination
         * with any other properties.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("currentVersionNumber")
        private Long currentVersionNumber;

        /**
         * Makes this version the current version. This property cannot be updated in combination
         * with any other properties.
         *
         * @param currentVersionNumber the value to set
         * @return this builder
         */
        public Builder currentVersionNumber(Long currentVersionNumber) {
            this.currentVersionNumber = currentVersionNumber;
            this.__explicitlySet__.add("currentVersionNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityConfig")
        private UpdateCertificateAuthorityConfigDetails certificateAuthorityConfig;

        public Builder certificateAuthorityConfig(
                UpdateCertificateAuthorityConfigDetails certificateAuthorityConfig) {
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
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example:
         * {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example:
         * {@code {"foo-namespace": {"bar-key": "value"}}}
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
        /** A list of rules that control how the CA is used and managed. */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityRules")
        private java.util.List<CertificateAuthorityRule> certificateAuthorityRules;

        /**
         * A list of rules that control how the CA is used and managed.
         *
         * @param certificateAuthorityRules the value to set
         * @return this builder
         */
        public Builder certificateAuthorityRules(
                java.util.List<CertificateAuthorityRule> certificateAuthorityRules) {
            this.certificateAuthorityRules = certificateAuthorityRules;
            this.__explicitlySet__.add("certificateAuthorityRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateCertificateAuthorityDetails build() {
            UpdateCertificateAuthorityDetails model =
                    new UpdateCertificateAuthorityDetails(
                            this.description,
                            this.currentVersionNumber,
                            this.certificateAuthorityConfig,
                            this.certificateRevocationListDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.certificateAuthorityRules);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateCertificateAuthorityDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("currentVersionNumber")) {
                this.currentVersionNumber(model.getCurrentVersionNumber());
            }
            if (model.wasPropertyExplicitlySet("certificateAuthorityConfig")) {
                this.certificateAuthorityConfig(model.getCertificateAuthorityConfig());
            }
            if (model.wasPropertyExplicitlySet("certificateRevocationListDetails")) {
                this.certificateRevocationListDetails(model.getCertificateRevocationListDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("certificateAuthorityRules")) {
                this.certificateAuthorityRules(model.getCertificateAuthorityRules());
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

    /** A brief description of the CA. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A brief description of the CA.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Makes this version the current version. This property cannot be updated in combination with
     * any other properties.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("currentVersionNumber")
    private final Long currentVersionNumber;

    /**
     * Makes this version the current version. This property cannot be updated in combination with
     * any other properties.
     *
     * @return the value
     */
    public Long getCurrentVersionNumber() {
        return currentVersionNumber;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityConfig")
    private final UpdateCertificateAuthorityConfigDetails certificateAuthorityConfig;

    public UpdateCertificateAuthorityConfigDetails getCertificateAuthorityConfig() {
        return certificateAuthorityConfig;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("certificateRevocationListDetails")
    private final CertificateRevocationListDetails certificateRevocationListDetails;

    public CertificateRevocationListDetails getCertificateRevocationListDetails() {
        return certificateRevocationListDetails;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /** A list of rules that control how the CA is used and managed. */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateAuthorityRules")
    private final java.util.List<CertificateAuthorityRule> certificateAuthorityRules;

    /**
     * A list of rules that control how the CA is used and managed.
     *
     * @return the value
     */
    public java.util.List<CertificateAuthorityRule> getCertificateAuthorityRules() {
        return certificateAuthorityRules;
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
        sb.append("UpdateCertificateAuthorityDetails(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", currentVersionNumber=").append(String.valueOf(this.currentVersionNumber));
        sb.append(", certificateAuthorityConfig=")
                .append(String.valueOf(this.certificateAuthorityConfig));
        sb.append(", certificateRevocationListDetails=")
                .append(String.valueOf(this.certificateRevocationListDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", certificateAuthorityRules=")
                .append(String.valueOf(this.certificateAuthorityRules));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateCertificateAuthorityDetails)) {
            return false;
        }

        UpdateCertificateAuthorityDetails other = (UpdateCertificateAuthorityDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.currentVersionNumber, other.currentVersionNumber)
                && java.util.Objects.equals(
                        this.certificateAuthorityConfig, other.certificateAuthorityConfig)
                && java.util.Objects.equals(
                        this.certificateRevocationListDetails,
                        other.certificateRevocationListDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(
                        this.certificateAuthorityRules, other.certificateAuthorityRules)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.currentVersionNumber == null
                                ? 43
                                : this.currentVersionNumber.hashCode());
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
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateAuthorityRules == null
                                ? 43
                                : this.certificateAuthorityRules.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
