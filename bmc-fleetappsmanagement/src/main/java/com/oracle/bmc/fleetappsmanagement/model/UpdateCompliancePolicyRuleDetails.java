/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The data to update a CompliancePolicyRule.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateCompliancePolicyRuleDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateCompliancePolicyRuleDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "productVersion",
        "patchType",
        "severity",
        "patchSelection",
        "gracePeriod",
        "freeformTags",
        "definedTags"
    })
    public UpdateCompliancePolicyRuleDetails(
            ProductVersionDetails productVersion,
            java.util.List<String> patchType,
            java.util.List<ComplianceRuleSeverity> severity,
            PatchSelectionDetails patchSelection,
            String gracePeriod,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.productVersion = productVersion;
        this.patchType = patchType;
        this.severity = severity;
        this.patchSelection = patchSelection;
        this.gracePeriod = gracePeriod;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("productVersion")
        private ProductVersionDetails productVersion;

        public Builder productVersion(ProductVersionDetails productVersion) {
            this.productVersion = productVersion;
            this.__explicitlySet__.add("productVersion");
            return this;
        }
        /**
         * PlatformConfiguration OCID for the patch type to which this CompliancePolicyRule applies.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("patchType")
        private java.util.List<String> patchType;

        /**
         * PlatformConfiguration OCID for the patch type to which this CompliancePolicyRule applies.
         * @param patchType the value to set
         * @return this builder
         **/
        public Builder patchType(java.util.List<String> patchType) {
            this.patchType = patchType;
            this.__explicitlySet__.add("patchType");
            return this;
        }
        /**
         * Severity to which this CompliancePolicyRule applies.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private java.util.List<ComplianceRuleSeverity> severity;

        /**
         * Severity to which this CompliancePolicyRule applies.
         * @param severity the value to set
         * @return this builder
         **/
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
         * Grace period in days,weeks,months or years the exemption is applicable for the rule.
         * This enables a grace period when Fleet Application Management doesn't report the product as noncompliant when patch is not applied.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("gracePeriod")
        private String gracePeriod;

        /**
         * Grace period in days,weeks,months or years the exemption is applicable for the rule.
         * This enables a grace period when Fleet Application Management doesn't report the product as noncompliant when patch is not applied.
         *
         * @param gracePeriod the value to set
         * @return this builder
         **/
        public Builder gracePeriod(String gracePeriod) {
            this.gracePeriod = gracePeriod;
            this.__explicitlySet__.add("gracePeriod");
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
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

        public UpdateCompliancePolicyRuleDetails build() {
            UpdateCompliancePolicyRuleDetails model =
                    new UpdateCompliancePolicyRuleDetails(
                            this.productVersion,
                            this.patchType,
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
        public Builder copy(UpdateCompliancePolicyRuleDetails model) {
            if (model.wasPropertyExplicitlySet("productVersion")) {
                this.productVersion(model.getProductVersion());
            }
            if (model.wasPropertyExplicitlySet("patchType")) {
                this.patchType(model.getPatchType());
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

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @com.fasterxml.jackson.annotation.JsonProperty("productVersion")
    private final ProductVersionDetails productVersion;

    public ProductVersionDetails getProductVersion() {
        return productVersion;
    }

    /**
     * PlatformConfiguration OCID for the patch type to which this CompliancePolicyRule applies.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("patchType")
    private final java.util.List<String> patchType;

    /**
     * PlatformConfiguration OCID for the patch type to which this CompliancePolicyRule applies.
     * @return the value
     **/
    public java.util.List<String> getPatchType() {
        return patchType;
    }

    /**
     * Severity to which this CompliancePolicyRule applies.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final java.util.List<ComplianceRuleSeverity> severity;

    /**
     * Severity to which this CompliancePolicyRule applies.
     * @return the value
     **/
    public java.util.List<ComplianceRuleSeverity> getSeverity() {
        return severity;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("patchSelection")
    private final PatchSelectionDetails patchSelection;

    public PatchSelectionDetails getPatchSelection() {
        return patchSelection;
    }

    /**
     * Grace period in days,weeks,months or years the exemption is applicable for the rule.
     * This enables a grace period when Fleet Application Management doesn't report the product as noncompliant when patch is not applied.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("gracePeriod")
    private final String gracePeriod;

    /**
     * Grace period in days,weeks,months or years the exemption is applicable for the rule.
     * This enables a grace period when Fleet Application Management doesn't report the product as noncompliant when patch is not applied.
     *
     * @return the value
     **/
    public String getGracePeriod() {
        return gracePeriod;
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
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
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
        sb.append("UpdateCompliancePolicyRuleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("productVersion=").append(String.valueOf(this.productVersion));
        sb.append(", patchType=").append(String.valueOf(this.patchType));
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
        if (!(o instanceof UpdateCompliancePolicyRuleDetails)) {
            return false;
        }

        UpdateCompliancePolicyRuleDetails other = (UpdateCompliancePolicyRuleDetails) o;
        return java.util.Objects.equals(this.productVersion, other.productVersion)
                && java.util.Objects.equals(this.patchType, other.patchType)
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
        result =
                (result * PRIME)
                        + (this.productVersion == null ? 43 : this.productVersion.hashCode());
        result = (result * PRIME) + (this.patchType == null ? 43 : this.patchType.hashCode());
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
