/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details used to create a new alert policy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateAlertPolicyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateAlertPolicyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "alertPolicyType",
        "displayName",
        "description",
        "severity",
        "compartmentId",
        "alertPolicyRuleDetails",
        "freeformTags",
        "definedTags"
    })
    public CreateAlertPolicyDetails(
            AlertPolicyType alertPolicyType,
            String displayName,
            String description,
            AlertSeverity severity,
            String compartmentId,
            java.util.List<CreateAlertPolicyRuleDetails> alertPolicyRuleDetails,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.alertPolicyType = alertPolicyType;
        this.displayName = displayName;
        this.description = description;
        this.severity = severity;
        this.compartmentId = compartmentId;
        this.alertPolicyRuleDetails = alertPolicyRuleDetails;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Indicates the Data Safe feature the alert policy belongs to */
        @com.fasterxml.jackson.annotation.JsonProperty("alertPolicyType")
        private AlertPolicyType alertPolicyType;

        /**
         * Indicates the Data Safe feature the alert policy belongs to
         *
         * @param alertPolicyType the value to set
         * @return this builder
         */
        public Builder alertPolicyType(AlertPolicyType alertPolicyType) {
            this.alertPolicyType = alertPolicyType;
            this.__explicitlySet__.add("alertPolicyType");
            return this;
        }
        /**
         * The display name of the alert policy. The name does not have to be unique, and it's
         * changeable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the alert policy. The name does not have to be unique, and it's
         * changeable.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The description of the alert policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the alert policy.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Severity level of the alert raised by this policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private AlertSeverity severity;

        /**
         * Severity level of the alert raised by this policy.
         *
         * @param severity the value to set
         * @return this builder
         */
        public Builder severity(AlertSeverity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /** The OCID of the compartment where you want to create the alert policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment where you want to create the alert policy.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** The details of the alert policy rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("alertPolicyRuleDetails")
        private java.util.List<CreateAlertPolicyRuleDetails> alertPolicyRuleDetails;

        /**
         * The details of the alert policy rule.
         *
         * @param alertPolicyRuleDetails the value to set
         * @return this builder
         */
        public Builder alertPolicyRuleDetails(
                java.util.List<CreateAlertPolicyRuleDetails> alertPolicyRuleDetails) {
            this.alertPolicyRuleDetails = alertPolicyRuleDetails;
            this.__explicitlySet__.add("alertPolicyRuleDetails");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         *
         * <p>Example: {@code {"Department": "Finance"}}
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
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example:
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAlertPolicyDetails build() {
            CreateAlertPolicyDetails model =
                    new CreateAlertPolicyDetails(
                            this.alertPolicyType,
                            this.displayName,
                            this.description,
                            this.severity,
                            this.compartmentId,
                            this.alertPolicyRuleDetails,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAlertPolicyDetails model) {
            if (model.wasPropertyExplicitlySet("alertPolicyType")) {
                this.alertPolicyType(model.getAlertPolicyType());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("alertPolicyRuleDetails")) {
                this.alertPolicyRuleDetails(model.getAlertPolicyRuleDetails());
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

    /** Indicates the Data Safe feature the alert policy belongs to */
    @com.fasterxml.jackson.annotation.JsonProperty("alertPolicyType")
    private final AlertPolicyType alertPolicyType;

    /**
     * Indicates the Data Safe feature the alert policy belongs to
     *
     * @return the value
     */
    public AlertPolicyType getAlertPolicyType() {
        return alertPolicyType;
    }

    /**
     * The display name of the alert policy. The name does not have to be unique, and it's
     * changeable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the alert policy. The name does not have to be unique, and it's
     * changeable.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The description of the alert policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the alert policy.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Severity level of the alert raised by this policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final AlertSeverity severity;

    /**
     * Severity level of the alert raised by this policy.
     *
     * @return the value
     */
    public AlertSeverity getSeverity() {
        return severity;
    }

    /** The OCID of the compartment where you want to create the alert policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment where you want to create the alert policy.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** The details of the alert policy rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("alertPolicyRuleDetails")
    private final java.util.List<CreateAlertPolicyRuleDetails> alertPolicyRuleDetails;

    /**
     * The details of the alert policy rule.
     *
     * @return the value
     */
    public java.util.List<CreateAlertPolicyRuleDetails> getAlertPolicyRuleDetails() {
        return alertPolicyRuleDetails;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example: {@code
     * {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.oracle.com/iaas/Content/General/Concepts/resourcetags.htm) Example: {@code
     * {"Operations": {"CostCenter": "42"}}}
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
        sb.append("CreateAlertPolicyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("alertPolicyType=").append(String.valueOf(this.alertPolicyType));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", alertPolicyRuleDetails=").append(String.valueOf(this.alertPolicyRuleDetails));
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
        if (!(o instanceof CreateAlertPolicyDetails)) {
            return false;
        }

        CreateAlertPolicyDetails other = (CreateAlertPolicyDetails) o;
        return java.util.Objects.equals(this.alertPolicyType, other.alertPolicyType)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.alertPolicyRuleDetails, other.alertPolicyRuleDetails)
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
                        + (this.alertPolicyType == null ? 43 : this.alertPolicyType.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.alertPolicyRuleDetails == null
                                ? 43
                                : this.alertPolicyRuleDetails.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
