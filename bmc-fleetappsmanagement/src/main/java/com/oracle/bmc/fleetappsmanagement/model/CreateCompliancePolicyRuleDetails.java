/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The data to create a CompliancePolicyRule. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateCompliancePolicyRuleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateCompliancePolicyRuleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compliancePolicyId",
        "productVersion",
        "patchTypeId",
        "severity",
        "patchSelection",
        "gracePeriod",
        "freeformTags",
        "definedTags"
    })
    public CreateCompliancePolicyRuleDetails(
            String displayName,
            String compliancePolicyId,
            ProductVersionDetails productVersion,
            java.util.List<String> patchTypeId,
            java.util.List<ComplianceRuleSeverity> severity,
            PatchSelectionDetails patchSelection,
            String gracePeriod,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.compliancePolicyId = compliancePolicyId;
        this.productVersion = productVersion;
        this.patchTypeId = patchTypeId;
        this.severity = severity;
        this.patchSelection = patchSelection;
        this.gracePeriod = gracePeriod;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My new resource}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
         * confidential information.
         *
         * <p>Example: {@code My new resource}
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Unique OCID of the CompliancePolicy this CompliancePolicyRule belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("compliancePolicyId")
        private String compliancePolicyId;

        /**
         * Unique OCID of the CompliancePolicy this CompliancePolicyRule belongs to.
         *
         * @param compliancePolicyId the value to set
         * @return this builder
         */
        public Builder compliancePolicyId(String compliancePolicyId) {
            this.compliancePolicyId = compliancePolicyId;
            this.__explicitlySet__.add("compliancePolicyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("productVersion")
        private ProductVersionDetails productVersion;

        public Builder productVersion(ProductVersionDetails productVersion) {
            this.productVersion = productVersion;
            this.__explicitlySet__.add("productVersion");
            return this;
        }
        /**
         * PlatformConfiguration OCID for the patch type to which this CompliancePolicyRule applies.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("patchTypeId")
        private java.util.List<String> patchTypeId;

        /**
         * PlatformConfiguration OCID for the patch type to which this CompliancePolicyRule applies.
         *
         * @param patchTypeId the value to set
         * @return this builder
         */
        public Builder patchTypeId(java.util.List<String> patchTypeId) {
            this.patchTypeId = patchTypeId;
            this.__explicitlySet__.add("patchTypeId");
            return this;
        }
        /** Severity to which this CompliancePolicyRule applies. */
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private java.util.List<ComplianceRuleSeverity> severity;

        /**
         * Severity to which this CompliancePolicyRule applies.
         *
         * @param severity the value to set
         * @return this builder
         */
        public Builder severity(java.util.List<ComplianceRuleSeverity> severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("patchSelection")
        private PatchSelectionDetails patchSelection;

        public Builder patchSelection(PatchSelectionDetails patchSelection) {
            this.patchSelection = patchSelection;
            this.__explicitlySet__.add("patchSelection");
            return this;
        }
        /**
         * Grace period in days,weeks,months or years the exemption is applicable for the rule. This
         * enables a grace period when Fleet Application Management doesn't report the product as
         * noncompliant when patch is not applied.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("gracePeriod")
        private String gracePeriod;

        /**
         * Grace period in days,weeks,months or years the exemption is applicable for the rule. This
         * enables a grace period when Fleet Application Management doesn't report the product as
         * noncompliant when patch is not applied.
         *
         * @param gracePeriod the value to set
         * @return this builder
         */
        public Builder gracePeriod(String gracePeriod) {
            this.gracePeriod = gracePeriod;
            this.__explicitlySet__.add("gracePeriod");
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateCompliancePolicyRuleDetails build() {
            CreateCompliancePolicyRuleDetails model =
                    new CreateCompliancePolicyRuleDetails(
                            this.displayName,
                            this.compliancePolicyId,
                            this.productVersion,
                            this.patchTypeId,
                            this.severity,
                            this.patchSelection,
                            this.gracePeriod,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCompliancePolicyRuleDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compliancePolicyId")) {
                this.compliancePolicyId(model.getCompliancePolicyId());
            }
            if (model.wasPropertyExplicitlySet("productVersion")) {
                this.productVersion(model.getProductVersion());
            }
            if (model.wasPropertyExplicitlySet("patchTypeId")) {
                this.patchTypeId(model.getPatchTypeId());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("patchSelection")) {
                this.patchSelection(model.getPatchSelection());
            }
            if (model.wasPropertyExplicitlySet("gracePeriod")) {
                this.gracePeriod(model.getGracePeriod());
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

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My new resource}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name. Does not have to be unique, and it's changeable. Avoid entering
     * confidential information.
     *
     * <p>Example: {@code My new resource}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Unique OCID of the CompliancePolicy this CompliancePolicyRule belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("compliancePolicyId")
    private final String compliancePolicyId;

    /**
     * Unique OCID of the CompliancePolicy this CompliancePolicyRule belongs to.
     *
     * @return the value
     */
    public String getCompliancePolicyId() {
        return compliancePolicyId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("productVersion")
    private final ProductVersionDetails productVersion;

    public ProductVersionDetails getProductVersion() {
        return productVersion;
    }

    /** PlatformConfiguration OCID for the patch type to which this CompliancePolicyRule applies. */
    @com.fasterxml.jackson.annotation.JsonProperty("patchTypeId")
    private final java.util.List<String> patchTypeId;

    /**
     * PlatformConfiguration OCID for the patch type to which this CompliancePolicyRule applies.
     *
     * @return the value
     */
    public java.util.List<String> getPatchTypeId() {
        return patchTypeId;
    }

    /** Severity to which this CompliancePolicyRule applies. */
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final java.util.List<ComplianceRuleSeverity> severity;

    /**
     * Severity to which this CompliancePolicyRule applies.
     *
     * @return the value
     */
    public java.util.List<ComplianceRuleSeverity> getSeverity() {
        return severity;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("patchSelection")
    private final PatchSelectionDetails patchSelection;

    public PatchSelectionDetails getPatchSelection() {
        return patchSelection;
    }

    /**
     * Grace period in days,weeks,months or years the exemption is applicable for the rule. This
     * enables a grace period when Fleet Application Management doesn't report the product as
     * noncompliant when patch is not applied.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gracePeriod")
    private final String gracePeriod;

    /**
     * Grace period in days,weeks,months or years the exemption is applicable for the rule. This
     * enables a grace period when Fleet Application Management doesn't report the product as
     * noncompliant when patch is not applied.
     *
     * @return the value
     */
    public String getGracePeriod() {
        return gracePeriod;
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
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("CreateCompliancePolicyRuleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compliancePolicyId=").append(String.valueOf(this.compliancePolicyId));
        sb.append(", productVersion=").append(String.valueOf(this.productVersion));
        sb.append(", patchTypeId=").append(String.valueOf(this.patchTypeId));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", patchSelection=").append(String.valueOf(this.patchSelection));
        sb.append(", gracePeriod=").append(String.valueOf(this.gracePeriod));
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
        if (!(o instanceof CreateCompliancePolicyRuleDetails)) {
            return false;
        }

        CreateCompliancePolicyRuleDetails other = (CreateCompliancePolicyRuleDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compliancePolicyId, other.compliancePolicyId)
                && java.util.Objects.equals(this.productVersion, other.productVersion)
                && java.util.Objects.equals(this.patchTypeId, other.patchTypeId)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.patchSelection, other.patchSelection)
                && java.util.Objects.equals(this.gracePeriod, other.gracePeriod)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compliancePolicyId == null
                                ? 43
                                : this.compliancePolicyId.hashCode());
        result =
                (result * PRIME)
                        + (this.productVersion == null ? 43 : this.productVersion.hashCode());
        result = (result * PRIME) + (this.patchTypeId == null ? 43 : this.patchTypeId.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result =
                (result * PRIME)
                        + (this.patchSelection == null ? 43 : this.patchSelection.hashCode());
        result = (result * PRIME) + (this.gracePeriod == null ? 43 : this.gracePeriod.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
