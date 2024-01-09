/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.governancerulescontrolplane.model;

/**
 * Request object for CreateGovernanceRule operation. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220504")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateGovernanceRuleDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateGovernanceRuleDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "description",
        "type",
        "creationOption",
        "template",
        "relatedResourceId",
        "freeformTags",
        "definedTags"
    })
    public CreateGovernanceRuleDetails(
            String compartmentId,
            String displayName,
            String description,
            GovernanceRuleType type,
            CreationOption creationOption,
            Template template,
            String relatedResourceId,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.description = description;
        this.type = type;
        this.creationOption = creationOption;
        this.template = template;
        this.relatedResourceId = relatedResourceId;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Oracle ID
         * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
         * root compartment containing the governance rule.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The Oracle ID
         * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
         * root compartment containing the governance rule.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Display name of the governance rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display name of the governance rule.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** Description of the governance rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the governance rule.
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
         * Type of the governance rule, can be one of QUOTA, TAG, ALLOWED_REGIONS.
         *
         * <p>Example: {@code QUOTA}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private GovernanceRuleType type;

        /**
         * Type of the governance rule, can be one of QUOTA, TAG, ALLOWED_REGIONS.
         *
         * <p>Example: {@code QUOTA}
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(GovernanceRuleType type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The type of option used to create the governance rule, could be one of TEMPLATE or CLONE.
         *
         * <p>Example: {@code TEMPLATE}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("creationOption")
        private CreationOption creationOption;

        /**
         * The type of option used to create the governance rule, could be one of TEMPLATE or CLONE.
         *
         * <p>Example: {@code TEMPLATE}
         *
         * @param creationOption the value to set
         * @return this builder
         */
        public Builder creationOption(CreationOption creationOption) {
            this.creationOption = creationOption;
            this.__explicitlySet__.add("creationOption");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("template")
        private Template template;

        public Builder template(Template template) {
            this.template = template;
            this.__explicitlySet__.add("template");
            return this;
        }
        /**
         * The Oracle ID
         * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
         * resource, which was used as a template to create this governance rule.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("relatedResourceId")
        private String relatedResourceId;

        /**
         * The Oracle ID
         * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
         * resource, which was used as a template to create this governance rule.
         *
         * @param relatedResourceId the value to set
         * @return this builder
         */
        public Builder relatedResourceId(String relatedResourceId) {
            this.relatedResourceId = relatedResourceId;
            this.__explicitlySet__.add("relatedResourceId");
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

        public CreateGovernanceRuleDetails build() {
            CreateGovernanceRuleDetails model =
                    new CreateGovernanceRuleDetails(
                            this.compartmentId,
                            this.displayName,
                            this.description,
                            this.type,
                            this.creationOption,
                            this.template,
                            this.relatedResourceId,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateGovernanceRuleDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("creationOption")) {
                this.creationOption(model.getCreationOption());
            }
            if (model.wasPropertyExplicitlySet("template")) {
                this.template(model.getTemplate());
            }
            if (model.wasPropertyExplicitlySet("relatedResourceId")) {
                this.relatedResourceId(model.getRelatedResourceId());
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
     * The Oracle ID
     * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the root
     * compartment containing the governance rule.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The Oracle ID
     * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the root
     * compartment containing the governance rule.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Display name of the governance rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display name of the governance rule.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Description of the governance rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the governance rule.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * Type of the governance rule, can be one of QUOTA, TAG, ALLOWED_REGIONS.
     *
     * <p>Example: {@code QUOTA}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final GovernanceRuleType type;

    /**
     * Type of the governance rule, can be one of QUOTA, TAG, ALLOWED_REGIONS.
     *
     * <p>Example: {@code QUOTA}
     *
     * @return the value
     */
    public GovernanceRuleType getType() {
        return type;
    }

    /**
     * The type of option used to create the governance rule, could be one of TEMPLATE or CLONE.
     *
     * <p>Example: {@code TEMPLATE}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("creationOption")
    private final CreationOption creationOption;

    /**
     * The type of option used to create the governance rule, could be one of TEMPLATE or CLONE.
     *
     * <p>Example: {@code TEMPLATE}
     *
     * @return the value
     */
    public CreationOption getCreationOption() {
        return creationOption;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("template")
    private final Template template;

    public Template getTemplate() {
        return template;
    }

    /**
     * The Oracle ID
     * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
     * resource, which was used as a template to create this governance rule.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("relatedResourceId")
    private final String relatedResourceId;

    /**
     * The Oracle ID
     * ([OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm)) of the
     * resource, which was used as a template to create this governance rule.
     *
     * @return the value
     */
    public String getRelatedResourceId() {
        return relatedResourceId;
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
        sb.append("CreateGovernanceRuleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", creationOption=").append(String.valueOf(this.creationOption));
        sb.append(", template=").append(String.valueOf(this.template));
        sb.append(", relatedResourceId=").append(String.valueOf(this.relatedResourceId));
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
        if (!(o instanceof CreateGovernanceRuleDetails)) {
            return false;
        }

        CreateGovernanceRuleDetails other = (CreateGovernanceRuleDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.creationOption, other.creationOption)
                && java.util.Objects.equals(this.template, other.template)
                && java.util.Objects.equals(this.relatedResourceId, other.relatedResourceId)
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
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.creationOption == null ? 43 : this.creationOption.hashCode());
        result = (result * PRIME) + (this.template == null ? 43 : this.template.hashCode());
        result =
                (result * PRIME)
                        + (this.relatedResourceId == null ? 43 : this.relatedResourceId.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
