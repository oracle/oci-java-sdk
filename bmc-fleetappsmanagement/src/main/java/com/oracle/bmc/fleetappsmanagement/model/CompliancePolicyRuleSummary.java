/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Summary information about a CompliancePolicyRule. <br>
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
        builder = CompliancePolicyRuleSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CompliancePolicyRuleSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "compliancePolicyId",
        "productVersion",
        "patchTypeId",
        "severity",
        "patchSelection",
        "gracePeriod",
        "compartmentId",
        "timeCreated",
        "timeUpdated",
        "lifecycleState",
        "lifecycleDetails",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public CompliancePolicyRuleSummary(
            String id,
            String displayName,
            String compliancePolicyId,
            ProductVersionDetails productVersion,
            java.util.List<String> patchTypeId,
            java.util.List<ComplianceRuleSeverity> severity,
            PatchSelectionDetails patchSelection,
            String gracePeriod,
            String compartmentId,
            java.util.Date timeCreated,
            java.util.Date timeUpdated,
            CompliancePolicyRule.LifecycleState lifecycleState,
            String lifecycleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.compliancePolicyId = compliancePolicyId;
        this.productVersion = productVersion;
        this.patchTypeId = patchTypeId;
        this.severity = severity;
        this.patchSelection = patchSelection;
        this.gracePeriod = gracePeriod;
        this.compartmentId = compartmentId;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique OCID of the CompliancePolicyRule. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Unique OCID of the CompliancePolicyRule.
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
        /** Unique OCID of the CompliancePolicy. */
        @com.fasterxml.jackson.annotation.JsonProperty("compliancePolicyId")
        private String compliancePolicyId;

        /**
         * Unique OCID of the CompliancePolicy.
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
        /** The OCID of the compartment the CompliancePolicyRule belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment the CompliancePolicyRule belongs to.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The date and time the CompliancePolicyRule was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the CompliancePolicyRule was created, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
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
         * The date and time the CompliancePolicyRule was updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the CompliancePolicyRule was updated, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }
        /** The current state of the CompliancePolicyRule. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private CompliancePolicyRule.LifecycleState lifecycleState;

        /**
         * The current state of the CompliancePolicyRule.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(CompliancePolicyRule.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * A message that describes the current state of the CompliancePolicyRule in more detail.
         * For example, can be used to provide actionable information for a resource in the Failed
         * state.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message that describes the current state of the CompliancePolicyRule in more detail.
         * For example, can be used to provide actionable information for a resource in the Failed
         * state.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
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
        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
         * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CompliancePolicyRuleSummary build() {
            CompliancePolicyRuleSummary model =
                    new CompliancePolicyRuleSummary(
                            this.id,
                            this.displayName,
                            this.compliancePolicyId,
                            this.productVersion,
                            this.patchTypeId,
                            this.severity,
                            this.patchSelection,
                            this.gracePeriod,
                            this.compartmentId,
                            this.timeCreated,
                            this.timeUpdated,
                            this.lifecycleState,
                            this.lifecycleDetails,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CompliancePolicyRuleSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
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
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** Unique OCID of the CompliancePolicyRule. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Unique OCID of the CompliancePolicyRule.
     *
     * @return the value
     */
    public String getId() {
        return id;
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

    /** Unique OCID of the CompliancePolicy. */
    @com.fasterxml.jackson.annotation.JsonProperty("compliancePolicyId")
    private final String compliancePolicyId;

    /**
     * Unique OCID of the CompliancePolicy.
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

    /** The OCID of the compartment the CompliancePolicyRule belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment the CompliancePolicyRule belongs to.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The date and time the CompliancePolicyRule was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the CompliancePolicyRule was created, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The date and time the CompliancePolicyRule was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the CompliancePolicyRule was updated, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
    }

    /** The current state of the CompliancePolicyRule. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final CompliancePolicyRule.LifecycleState lifecycleState;

    /**
     * The current state of the CompliancePolicyRule.
     *
     * @return the value
     */
    public CompliancePolicyRule.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * A message that describes the current state of the CompliancePolicyRule in more detail. For
     * example, can be used to provide actionable information for a resource in the Failed state.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message that describes the current state of the CompliancePolicyRule in more detail. For
     * example, can be used to provide actionable information for a resource in the Failed state.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
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

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * System tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("CompliancePolicyRuleSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", compliancePolicyId=").append(String.valueOf(this.compliancePolicyId));
        sb.append(", productVersion=").append(String.valueOf(this.productVersion));
        sb.append(", patchTypeId=").append(String.valueOf(this.patchTypeId));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", patchSelection=").append(String.valueOf(this.patchSelection));
        sb.append(", gracePeriod=").append(String.valueOf(this.gracePeriod));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CompliancePolicyRuleSummary)) {
            return false;
        }

        CompliancePolicyRuleSummary other = (CompliancePolicyRuleSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compliancePolicyId, other.compliancePolicyId)
                && java.util.Objects.equals(this.productVersion, other.productVersion)
                && java.util.Objects.equals(this.patchTypeId, other.patchTypeId)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.patchSelection, other.patchSelection)
                && java.util.Objects.equals(this.gracePeriod, other.gracePeriod)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
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
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
