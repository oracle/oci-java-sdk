/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The required data to create a custom protection rule. For more information about custom
 * protection rules, see [Custom Protection
 * Rules](https://docs.cloud.oracle.com/iaas/Content/WAF/Tasks/customprotectionrules.htm). **Warning:** Oracle
 * recommends that you avoid using any confidential information when you supply string values using
 * the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateCustomProtectionRuleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateCustomProtectionRuleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "description",
        "template",
        "freeformTags",
        "definedTags"
    })
    public CreateCustomProtectionRuleDetails(
            String compartmentId,
            String displayName,
            String description,
            String template,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.template = template;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment in which to create the custom protection rule.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment in which to create the custom protection rule.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** A user-friendly name for the custom protection rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the custom protection rule.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** A description for the Custom Protection rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * A description for the Custom Protection rule.
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
         * The template text of the custom protection rule. All custom protection rules are
         * expressed in ModSecurity Rule Language.
         *
         * <p>Additionally, each rule must include two placeholder variables that are updated by the
         * WAF service upon publication of the rule.
         *
         * <p>{@code id: {{id_1}}} - This field is populated with a unique rule ID generated by the
         * WAF service which identifies a {@code SecRule}. More than one {@code SecRule} can be
         * defined in the {@code template} field of a CreateCustomSecurityRule call. The value of
         * the first {@code SecRule} must be {@code id: {{id_1}}} and the {@code id} field of each
         * subsequent {@code SecRule} should increase by one, as shown in the example.
         *
         * <p>{@code ctl:ruleEngine={{mode}}} - The action to be taken when the criteria of the
         * {@code SecRule} are met, either {@code OFF}, {@code DETECT} or {@code BLOCK}. This field
         * is automatically populated with the corresponding value of the {@code action} field of
         * the {@code CustomProtectionRuleSetting} schema when the {@code WafConfig} is updated.
         *
         * <p>Example:* {@code SecRule REQUEST_COOKIES "regex matching SQL injection - part 1/2" \\
         * "phase:2, \\ msg:'Detects chained SQL injection attempts 1/2.', \\ id: {{id_1}}, \\
         * ctl:ruleEngine={{mode}}, \\ deny" SecRule REQUEST_COOKIES "regex matching SQL injection -
         * part 2/2" \\ "phase:2, \\ msg:'Detects chained SQL injection attempts 2/2.', \\ id:
         * {{id_2}}, \\ ctl:ruleEngine={{mode}}, \\ deny" }
         *
         * <p>The example contains two {@code SecRules} each having distinct regex expression to
         * match the {@code Cookie} header value during the second input analysis phase.
         *
         * <p>For more information about custom protection rules, see [Custom Protection
         * Rules](https://docs.cloud.oracle.com/Content/WAF/Tasks/customprotectionrules.htm).
         *
         * <p>For more information about ModSecurity syntax, see [Making Rules: The Basic
         * Syntax](https://www.modsecurity.org/CRS/Documentation/making.html).
         *
         * <p>For more information about ModSecurity's open source WAF rules, see [Mod Security's
         * OWASP Core Rule Set
         * documentation](https://www.modsecurity.org/CRS/Documentation/index.html).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("template")
        private String template;

        /**
         * The template text of the custom protection rule. All custom protection rules are
         * expressed in ModSecurity Rule Language.
         *
         * <p>Additionally, each rule must include two placeholder variables that are updated by the
         * WAF service upon publication of the rule.
         *
         * <p>{@code id: {{id_1}}} - This field is populated with a unique rule ID generated by the
         * WAF service which identifies a {@code SecRule}. More than one {@code SecRule} can be
         * defined in the {@code template} field of a CreateCustomSecurityRule call. The value of
         * the first {@code SecRule} must be {@code id: {{id_1}}} and the {@code id} field of each
         * subsequent {@code SecRule} should increase by one, as shown in the example.
         *
         * <p>{@code ctl:ruleEngine={{mode}}} - The action to be taken when the criteria of the
         * {@code SecRule} are met, either {@code OFF}, {@code DETECT} or {@code BLOCK}. This field
         * is automatically populated with the corresponding value of the {@code action} field of
         * the {@code CustomProtectionRuleSetting} schema when the {@code WafConfig} is updated.
         *
         * <p>Example:* {@code SecRule REQUEST_COOKIES "regex matching SQL injection - part 1/2" \\
         * "phase:2, \\ msg:'Detects chained SQL injection attempts 1/2.', \\ id: {{id_1}}, \\
         * ctl:ruleEngine={{mode}}, \\ deny" SecRule REQUEST_COOKIES "regex matching SQL injection -
         * part 2/2" \\ "phase:2, \\ msg:'Detects chained SQL injection attempts 2/2.', \\ id:
         * {{id_2}}, \\ ctl:ruleEngine={{mode}}, \\ deny" }
         *
         * <p>The example contains two {@code SecRules} each having distinct regex expression to
         * match the {@code Cookie} header value during the second input analysis phase.
         *
         * <p>For more information about custom protection rules, see [Custom Protection
         * Rules](https://docs.cloud.oracle.com/Content/WAF/Tasks/customprotectionrules.htm).
         *
         * <p>For more information about ModSecurity syntax, see [Making Rules: The Basic
         * Syntax](https://www.modsecurity.org/CRS/Documentation/making.html).
         *
         * <p>For more information about ModSecurity's open source WAF rules, see [Mod Security's
         * OWASP Core Rule Set
         * documentation](https://www.modsecurity.org/CRS/Documentation/index.html).
         *
         * @param template the value to set
         * @return this builder
         */
        public Builder template(String template) {
            this.template = template;
            this.__explicitlySet__.add("template");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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

        public CreateCustomProtectionRuleDetails build() {
            CreateCustomProtectionRuleDetails model =
                    new CreateCustomProtectionRuleDetails(
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.template,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateCustomProtectionRuleDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("template")) {
                this.template(model.getTemplate());
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
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment in
     * which to create the custom protection rule.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the compartment in
     * which to create the custom protection rule.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** A user-friendly name for the custom protection rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the custom protection rule.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** A description for the Custom Protection rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A description for the Custom Protection rule.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The template text of the custom protection rule. All custom protection rules are expressed in
     * ModSecurity Rule Language.
     *
     * <p>Additionally, each rule must include two placeholder variables that are updated by the WAF
     * service upon publication of the rule.
     *
     * <p>{@code id: {{id_1}}} - This field is populated with a unique rule ID generated by the WAF
     * service which identifies a {@code SecRule}. More than one {@code SecRule} can be defined in
     * the {@code template} field of a CreateCustomSecurityRule call. The value of the first {@code
     * SecRule} must be {@code id: {{id_1}}} and the {@code id} field of each subsequent {@code
     * SecRule} should increase by one, as shown in the example.
     *
     * <p>{@code ctl:ruleEngine={{mode}}} - The action to be taken when the criteria of the {@code
     * SecRule} are met, either {@code OFF}, {@code DETECT} or {@code BLOCK}. This field is
     * automatically populated with the corresponding value of the {@code action} field of the
     * {@code CustomProtectionRuleSetting} schema when the {@code WafConfig} is updated.
     *
     * <p>Example:* {@code SecRule REQUEST_COOKIES "regex matching SQL injection - part 1/2" \\
     * "phase:2, \\ msg:'Detects chained SQL injection attempts 1/2.', \\ id: {{id_1}}, \\
     * ctl:ruleEngine={{mode}}, \\ deny" SecRule REQUEST_COOKIES "regex matching SQL injection -
     * part 2/2" \\ "phase:2, \\ msg:'Detects chained SQL injection attempts 2/2.', \\ id: {{id_2}},
     * \\ ctl:ruleEngine={{mode}}, \\ deny" }
     *
     * <p>The example contains two {@code SecRules} each having distinct regex expression to match
     * the {@code Cookie} header value during the second input analysis phase.
     *
     * <p>For more information about custom protection rules, see [Custom Protection
     * Rules](https://docs.cloud.oracle.com/Content/WAF/Tasks/customprotectionrules.htm).
     *
     * <p>For more information about ModSecurity syntax, see [Making Rules: The Basic
     * Syntax](https://www.modsecurity.org/CRS/Documentation/making.html).
     *
     * <p>For more information about ModSecurity's open source WAF rules, see [Mod Security's OWASP
     * Core Rule Set documentation](https://www.modsecurity.org/CRS/Documentation/index.html).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("template")
    private final String template;

    /**
     * The template text of the custom protection rule. All custom protection rules are expressed in
     * ModSecurity Rule Language.
     *
     * <p>Additionally, each rule must include two placeholder variables that are updated by the WAF
     * service upon publication of the rule.
     *
     * <p>{@code id: {{id_1}}} - This field is populated with a unique rule ID generated by the WAF
     * service which identifies a {@code SecRule}. More than one {@code SecRule} can be defined in
     * the {@code template} field of a CreateCustomSecurityRule call. The value of the first {@code
     * SecRule} must be {@code id: {{id_1}}} and the {@code id} field of each subsequent {@code
     * SecRule} should increase by one, as shown in the example.
     *
     * <p>{@code ctl:ruleEngine={{mode}}} - The action to be taken when the criteria of the {@code
     * SecRule} are met, either {@code OFF}, {@code DETECT} or {@code BLOCK}. This field is
     * automatically populated with the corresponding value of the {@code action} field of the
     * {@code CustomProtectionRuleSetting} schema when the {@code WafConfig} is updated.
     *
     * <p>Example:* {@code SecRule REQUEST_COOKIES "regex matching SQL injection - part 1/2" \\
     * "phase:2, \\ msg:'Detects chained SQL injection attempts 1/2.', \\ id: {{id_1}}, \\
     * ctl:ruleEngine={{mode}}, \\ deny" SecRule REQUEST_COOKIES "regex matching SQL injection -
     * part 2/2" \\ "phase:2, \\ msg:'Detects chained SQL injection attempts 2/2.', \\ id: {{id_2}},
     * \\ ctl:ruleEngine={{mode}}, \\ deny" }
     *
     * <p>The example contains two {@code SecRules} each having distinct regex expression to match
     * the {@code Cookie} header value during the second input analysis phase.
     *
     * <p>For more information about custom protection rules, see [Custom Protection
     * Rules](https://docs.cloud.oracle.com/Content/WAF/Tasks/customprotectionrules.htm).
     *
     * <p>For more information about ModSecurity syntax, see [Making Rules: The Basic
     * Syntax](https://www.modsecurity.org/CRS/Documentation/making.html).
     *
     * <p>For more information about ModSecurity's open source WAF rules, see [Mod Security's OWASP
     * Core Rule Set documentation](https://www.modsecurity.org/CRS/Documentation/index.html).
     *
     * @return the value
     */
    public String getTemplate() {
        return template;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
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
        sb.append("CreateCustomProtectionRuleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", template=").append(String.valueOf(this.template));
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
        if (!(o instanceof CreateCustomProtectionRuleDetails)) {
            return false;
        }

        CreateCustomProtectionRuleDetails other = (CreateCustomProtectionRuleDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.template, other.template)
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
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.template == null ? 43 : this.template.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
