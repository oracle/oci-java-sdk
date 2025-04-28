/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The details of the certificate to update. <br>
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
        builder = UpdateCertificateDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateCertificateDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "currentVersionNumber",
        "certificateConfig",
        "freeformTags",
        "definedTags",
        "certificateRules"
    })
    public UpdateCertificateDetails(
            String description,
            Long currentVersionNumber,
            UpdateCertificateConfigDetails certificateConfig,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<CertificateRule> certificateRules) {
        super();
        this.description = description;
        this.currentVersionNumber = currentVersionNumber;
        this.certificateConfig = certificateConfig;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.certificateRules = certificateRules;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** A brief description of the certificate. Avoid entering confidential information. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A brief description of the certificate. Avoid entering confidential information.
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

        @com.fasterxml.jackson.annotation.JsonProperty("certificateConfig")
        private UpdateCertificateConfigDetails certificateConfig;

        public Builder certificateConfig(UpdateCertificateConfigDetails certificateConfig) {
            this.certificateConfig = certificateConfig;
            this.__explicitlySet__.add("certificateConfig");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Department": "Finance"}}
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
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
        /** An optional list of rules that control how the certificate is used and managed. */
        @com.fasterxml.jackson.annotation.JsonProperty("certificateRules")
        private java.util.List<CertificateRule> certificateRules;

        /**
         * An optional list of rules that control how the certificate is used and managed.
         *
         * @param certificateRules the value to set
         * @return this builder
         */
        public Builder certificateRules(java.util.List<CertificateRule> certificateRules) {
            this.certificateRules = certificateRules;
            this.__explicitlySet__.add("certificateRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateCertificateDetails build() {
            UpdateCertificateDetails model =
                    new UpdateCertificateDetails(
                            this.description,
                            this.currentVersionNumber,
                            this.certificateConfig,
                            this.freeformTags,
                            this.definedTags,
                            this.certificateRules);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateCertificateDetails model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("currentVersionNumber")) {
                this.currentVersionNumber(model.getCurrentVersionNumber());
            }
            if (model.wasPropertyExplicitlySet("certificateConfig")) {
                this.certificateConfig(model.getCertificateConfig());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("certificateRules")) {
                this.certificateRules(model.getCertificateRules());
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

    /** A brief description of the certificate. Avoid entering confidential information. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A brief description of the certificate. Avoid entering confidential information.
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

    @com.fasterxml.jackson.annotation.JsonProperty("certificateConfig")
    private final UpdateCertificateConfigDetails certificateConfig;

    public UpdateCertificateConfigDetails getCertificateConfig() {
        return certificateConfig;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /** An optional list of rules that control how the certificate is used and managed. */
    @com.fasterxml.jackson.annotation.JsonProperty("certificateRules")
    private final java.util.List<CertificateRule> certificateRules;

    /**
     * An optional list of rules that control how the certificate is used and managed.
     *
     * @return the value
     */
    public java.util.List<CertificateRule> getCertificateRules() {
        return certificateRules;
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
        sb.append("UpdateCertificateDetails(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", currentVersionNumber=").append(String.valueOf(this.currentVersionNumber));
        sb.append(", certificateConfig=").append(String.valueOf(this.certificateConfig));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", certificateRules=").append(String.valueOf(this.certificateRules));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateCertificateDetails)) {
            return false;
        }

        UpdateCertificateDetails other = (UpdateCertificateDetails) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.currentVersionNumber, other.currentVersionNumber)
                && java.util.Objects.equals(this.certificateConfig, other.certificateConfig)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.certificateRules, other.certificateRules)
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
                        + (this.certificateConfig == null ? 43 : this.certificateConfig.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result =
                (result * PRIME)
                        + (this.certificateRules == null ? 43 : this.certificateRules.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
