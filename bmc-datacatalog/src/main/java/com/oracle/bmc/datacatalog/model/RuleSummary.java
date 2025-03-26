/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * A list of rule resources. One or more rules can be defined for a data entity.
 * Each rule can be defined on one or more attributes of the data entity.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RuleSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RuleSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "displayName",
        "description",
        "ruleType",
        "externalKey",
        "attributes",
        "referencedFolderKey",
        "referencedFolderName",
        "referencedEntityKey",
        "referencedEntityName",
        "referencedRuleKey",
        "referencedRuleName",
        "referencedAttributes",
        "originType",
        "uri",
        "timeCreated",
        "lifecycleState"
    })
    public RuleSummary(
            String key,
            String displayName,
            String description,
            RuleType ruleType,
            String externalKey,
            java.util.List<RuleAttribute> attributes,
            String referencedFolderKey,
            String referencedFolderName,
            String referencedEntityKey,
            String referencedEntityName,
            String referencedRuleKey,
            String referencedRuleName,
            java.util.List<RuleAttribute> referencedAttributes,
            RuleOriginType originType,
            String uri,
            java.util.Date timeCreated,
            LifecycleState lifecycleState) {
        super();
        this.key = key;
        this.displayName = displayName;
        this.description = description;
        this.ruleType = ruleType;
        this.externalKey = externalKey;
        this.attributes = attributes;
        this.referencedFolderKey = referencedFolderKey;
        this.referencedFolderName = referencedFolderName;
        this.referencedEntityKey = referencedEntityKey;
        this.referencedEntityName = referencedEntityName;
        this.referencedRuleKey = referencedRuleKey;
        this.referencedRuleName = referencedRuleName;
        this.referencedAttributes = referencedAttributes;
        this.originType = originType;
        this.uri = uri;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Immutable unique key of a rule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Immutable unique key of a rule.
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly display name. Does not have to be unique, and it's changeable.
         * Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Detailed description of a rule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Detailed description of a rule.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Type of a rule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ruleType")
        private RuleType ruleType;

        /**
         * Type of a rule.
         * @param ruleType the value to set
         * @return this builder
         **/
        public Builder ruleType(RuleType ruleType) {
            this.ruleType = ruleType;
            this.__explicitlySet__.add("ruleType");
            return this;
        }
        /**
         * External URI that can be used to reference the object. Format will differ based on the type of object.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
        private String externalKey;

        /**
         * External URI that can be used to reference the object. Format will differ based on the type of object.
         *
         * @param externalKey the value to set
         * @return this builder
         **/
        public Builder externalKey(String externalKey) {
            this.externalKey = externalKey;
            this.__explicitlySet__.add("externalKey");
            return this;
        }
        /**
         * Attributes associated with a rule.
         * A UNIQUEKEY rule would contain (at least) one attribute, for the local table column(s) on which uniqueness is defined.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("attributes")
        private java.util.List<RuleAttribute> attributes;

        /**
         * Attributes associated with a rule.
         * A UNIQUEKEY rule would contain (at least) one attribute, for the local table column(s) on which uniqueness is defined.
         *
         * @param attributes the value to set
         * @return this builder
         **/
        public Builder attributes(java.util.List<RuleAttribute> attributes) {
            this.attributes = attributes;
            this.__explicitlySet__.add("attributes");
            return this;
        }
        /**
         * Folder key that represents the referenced folder, applicable only when rule type FOREIGNKEY.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("referencedFolderKey")
        private String referencedFolderKey;

        /**
         * Folder key that represents the referenced folder, applicable only when rule type FOREIGNKEY.
         * @param referencedFolderKey the value to set
         * @return this builder
         **/
        public Builder referencedFolderKey(String referencedFolderKey) {
            this.referencedFolderKey = referencedFolderKey;
            this.__explicitlySet__.add("referencedFolderKey");
            return this;
        }
        /**
         * Folder name that represents the referenced folder, applicable only when rule type FOREIGNKEY.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("referencedFolderName")
        private String referencedFolderName;

        /**
         * Folder name that represents the referenced folder, applicable only when rule type FOREIGNKEY.
         * @param referencedFolderName the value to set
         * @return this builder
         **/
        public Builder referencedFolderName(String referencedFolderName) {
            this.referencedFolderName = referencedFolderName;
            this.__explicitlySet__.add("referencedFolderName");
            return this;
        }
        /**
         * Entity key that represents the referenced entity, applicable only when rule type is FOREIGNKEY.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("referencedEntityKey")
        private String referencedEntityKey;

        /**
         * Entity key that represents the referenced entity, applicable only when rule type is FOREIGNKEY.
         * @param referencedEntityKey the value to set
         * @return this builder
         **/
        public Builder referencedEntityKey(String referencedEntityKey) {
            this.referencedEntityKey = referencedEntityKey;
            this.__explicitlySet__.add("referencedEntityKey");
            return this;
        }
        /**
         * Entity name that represents the referenced entity, applicable only when rule type is FOREIGNKEY.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("referencedEntityName")
        private String referencedEntityName;

        /**
         * Entity name that represents the referenced entity, applicable only when rule type is FOREIGNKEY.
         * @param referencedEntityName the value to set
         * @return this builder
         **/
        public Builder referencedEntityName(String referencedEntityName) {
            this.referencedEntityName = referencedEntityName;
            this.__explicitlySet__.add("referencedEntityName");
            return this;
        }
        /**
         * Rule key that represents the referenced rule, applicable only when rule type is FOREIGNKEY.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("referencedRuleKey")
        private String referencedRuleKey;

        /**
         * Rule key that represents the referenced rule, applicable only when rule type is FOREIGNKEY.
         * @param referencedRuleKey the value to set
         * @return this builder
         **/
        public Builder referencedRuleKey(String referencedRuleKey) {
            this.referencedRuleKey = referencedRuleKey;
            this.__explicitlySet__.add("referencedRuleKey");
            return this;
        }
        /**
         * Rule name that represents the referenced rule, applicable only when rule type is FOREIGNKEY.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("referencedRuleName")
        private String referencedRuleName;

        /**
         * Rule name that represents the referenced rule, applicable only when rule type is FOREIGNKEY.
         * @param referencedRuleName the value to set
         * @return this builder
         **/
        public Builder referencedRuleName(String referencedRuleName) {
            this.referencedRuleName = referencedRuleName;
            this.__explicitlySet__.add("referencedRuleName");
            return this;
        }
        /**
         * Attributes associated with referenced rule, applicable only when rule type is FOREIGNKEY.
         * A FOREIGNKEY rule would contain (at least) one attribute, for the local table column(s), and (at least) one referencedAttribute for referenced table column(s).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("referencedAttributes")
        private java.util.List<RuleAttribute> referencedAttributes;

        /**
         * Attributes associated with referenced rule, applicable only when rule type is FOREIGNKEY.
         * A FOREIGNKEY rule would contain (at least) one attribute, for the local table column(s), and (at least) one referencedAttribute for referenced table column(s).
         *
         * @param referencedAttributes the value to set
         * @return this builder
         **/
        public Builder referencedAttributes(java.util.List<RuleAttribute> referencedAttributes) {
            this.referencedAttributes = referencedAttributes;
            this.__explicitlySet__.add("referencedAttributes");
            return this;
        }
        /**
         * Origin type of the rule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("originType")
        private RuleOriginType originType;

        /**
         * Origin type of the rule.
         * @param originType the value to set
         * @return this builder
         **/
        public Builder originType(RuleOriginType originType) {
            this.originType = originType;
            this.__explicitlySet__.add("originType");
            return this;
        }
        /**
         * URI to the rule instance in the API.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        /**
         * URI to the rule instance in the API.
         * @param uri the value to set
         * @return this builder
         **/
        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }
        /**
         * The date and time the rule was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the rule was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
         * Example: {@code 2019-03-25T21:10:29.600Z}
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
         * State of the rule.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * State of the rule.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RuleSummary build() {
            RuleSummary model =
                    new RuleSummary(
                            this.key,
                            this.displayName,
                            this.description,
                            this.ruleType,
                            this.externalKey,
                            this.attributes,
                            this.referencedFolderKey,
                            this.referencedFolderName,
                            this.referencedEntityKey,
                            this.referencedEntityName,
                            this.referencedRuleKey,
                            this.referencedRuleName,
                            this.referencedAttributes,
                            this.originType,
                            this.uri,
                            this.timeCreated,
                            this.lifecycleState);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RuleSummary model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("ruleType")) {
                this.ruleType(model.getRuleType());
            }
            if (model.wasPropertyExplicitlySet("externalKey")) {
                this.externalKey(model.getExternalKey());
            }
            if (model.wasPropertyExplicitlySet("attributes")) {
                this.attributes(model.getAttributes());
            }
            if (model.wasPropertyExplicitlySet("referencedFolderKey")) {
                this.referencedFolderKey(model.getReferencedFolderKey());
            }
            if (model.wasPropertyExplicitlySet("referencedFolderName")) {
                this.referencedFolderName(model.getReferencedFolderName());
            }
            if (model.wasPropertyExplicitlySet("referencedEntityKey")) {
                this.referencedEntityKey(model.getReferencedEntityKey());
            }
            if (model.wasPropertyExplicitlySet("referencedEntityName")) {
                this.referencedEntityName(model.getReferencedEntityName());
            }
            if (model.wasPropertyExplicitlySet("referencedRuleKey")) {
                this.referencedRuleKey(model.getReferencedRuleKey());
            }
            if (model.wasPropertyExplicitlySet("referencedRuleName")) {
                this.referencedRuleName(model.getReferencedRuleName());
            }
            if (model.wasPropertyExplicitlySet("referencedAttributes")) {
                this.referencedAttributes(model.getReferencedAttributes());
            }
            if (model.wasPropertyExplicitlySet("originType")) {
                this.originType(model.getOriginType());
            }
            if (model.wasPropertyExplicitlySet("uri")) {
                this.uri(model.getUri());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
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
     * Immutable unique key of a rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Immutable unique key of a rule.
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Detailed description of a rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description of a rule.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Type of a rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ruleType")
    private final RuleType ruleType;

    /**
     * Type of a rule.
     * @return the value
     **/
    public RuleType getRuleType() {
        return ruleType;
    }

    /**
     * External URI that can be used to reference the object. Format will differ based on the type of object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
    private final String externalKey;

    /**
     * External URI that can be used to reference the object. Format will differ based on the type of object.
     *
     * @return the value
     **/
    public String getExternalKey() {
        return externalKey;
    }

    /**
     * Attributes associated with a rule.
     * A UNIQUEKEY rule would contain (at least) one attribute, for the local table column(s) on which uniqueness is defined.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributes")
    private final java.util.List<RuleAttribute> attributes;

    /**
     * Attributes associated with a rule.
     * A UNIQUEKEY rule would contain (at least) one attribute, for the local table column(s) on which uniqueness is defined.
     *
     * @return the value
     **/
    public java.util.List<RuleAttribute> getAttributes() {
        return attributes;
    }

    /**
     * Folder key that represents the referenced folder, applicable only when rule type FOREIGNKEY.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referencedFolderKey")
    private final String referencedFolderKey;

    /**
     * Folder key that represents the referenced folder, applicable only when rule type FOREIGNKEY.
     * @return the value
     **/
    public String getReferencedFolderKey() {
        return referencedFolderKey;
    }

    /**
     * Folder name that represents the referenced folder, applicable only when rule type FOREIGNKEY.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referencedFolderName")
    private final String referencedFolderName;

    /**
     * Folder name that represents the referenced folder, applicable only when rule type FOREIGNKEY.
     * @return the value
     **/
    public String getReferencedFolderName() {
        return referencedFolderName;
    }

    /**
     * Entity key that represents the referenced entity, applicable only when rule type is FOREIGNKEY.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referencedEntityKey")
    private final String referencedEntityKey;

    /**
     * Entity key that represents the referenced entity, applicable only when rule type is FOREIGNKEY.
     * @return the value
     **/
    public String getReferencedEntityKey() {
        return referencedEntityKey;
    }

    /**
     * Entity name that represents the referenced entity, applicable only when rule type is FOREIGNKEY.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referencedEntityName")
    private final String referencedEntityName;

    /**
     * Entity name that represents the referenced entity, applicable only when rule type is FOREIGNKEY.
     * @return the value
     **/
    public String getReferencedEntityName() {
        return referencedEntityName;
    }

    /**
     * Rule key that represents the referenced rule, applicable only when rule type is FOREIGNKEY.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referencedRuleKey")
    private final String referencedRuleKey;

    /**
     * Rule key that represents the referenced rule, applicable only when rule type is FOREIGNKEY.
     * @return the value
     **/
    public String getReferencedRuleKey() {
        return referencedRuleKey;
    }

    /**
     * Rule name that represents the referenced rule, applicable only when rule type is FOREIGNKEY.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referencedRuleName")
    private final String referencedRuleName;

    /**
     * Rule name that represents the referenced rule, applicable only when rule type is FOREIGNKEY.
     * @return the value
     **/
    public String getReferencedRuleName() {
        return referencedRuleName;
    }

    /**
     * Attributes associated with referenced rule, applicable only when rule type is FOREIGNKEY.
     * A FOREIGNKEY rule would contain (at least) one attribute, for the local table column(s), and (at least) one referencedAttribute for referenced table column(s).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referencedAttributes")
    private final java.util.List<RuleAttribute> referencedAttributes;

    /**
     * Attributes associated with referenced rule, applicable only when rule type is FOREIGNKEY.
     * A FOREIGNKEY rule would contain (at least) one attribute, for the local table column(s), and (at least) one referencedAttribute for referenced table column(s).
     *
     * @return the value
     **/
    public java.util.List<RuleAttribute> getReferencedAttributes() {
        return referencedAttributes;
    }

    /**
     * Origin type of the rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("originType")
    private final RuleOriginType originType;

    /**
     * Origin type of the rule.
     * @return the value
     **/
    public RuleOriginType getOriginType() {
        return originType;
    }

    /**
     * URI to the rule instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    /**
     * URI to the rule instance in the API.
     * @return the value
     **/
    public String getUri() {
        return uri;
    }

    /**
     * The date and time the rule was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the rule was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: {@code 2019-03-25T21:10:29.600Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * State of the rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * State of the rule.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
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
        sb.append("RuleSummary(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", ruleType=").append(String.valueOf(this.ruleType));
        sb.append(", externalKey=").append(String.valueOf(this.externalKey));
        sb.append(", attributes=").append(String.valueOf(this.attributes));
        sb.append(", referencedFolderKey=").append(String.valueOf(this.referencedFolderKey));
        sb.append(", referencedFolderName=").append(String.valueOf(this.referencedFolderName));
        sb.append(", referencedEntityKey=").append(String.valueOf(this.referencedEntityKey));
        sb.append(", referencedEntityName=").append(String.valueOf(this.referencedEntityName));
        sb.append(", referencedRuleKey=").append(String.valueOf(this.referencedRuleKey));
        sb.append(", referencedRuleName=").append(String.valueOf(this.referencedRuleName));
        sb.append(", referencedAttributes=").append(String.valueOf(this.referencedAttributes));
        sb.append(", originType=").append(String.valueOf(this.originType));
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RuleSummary)) {
            return false;
        }

        RuleSummary other = (RuleSummary) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.ruleType, other.ruleType)
                && java.util.Objects.equals(this.externalKey, other.externalKey)
                && java.util.Objects.equals(this.attributes, other.attributes)
                && java.util.Objects.equals(this.referencedFolderKey, other.referencedFolderKey)
                && java.util.Objects.equals(this.referencedFolderName, other.referencedFolderName)
                && java.util.Objects.equals(this.referencedEntityKey, other.referencedEntityKey)
                && java.util.Objects.equals(this.referencedEntityName, other.referencedEntityName)
                && java.util.Objects.equals(this.referencedRuleKey, other.referencedRuleKey)
                && java.util.Objects.equals(this.referencedRuleName, other.referencedRuleName)
                && java.util.Objects.equals(this.referencedAttributes, other.referencedAttributes)
                && java.util.Objects.equals(this.originType, other.originType)
                && java.util.Objects.equals(this.uri, other.uri)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.ruleType == null ? 43 : this.ruleType.hashCode());
        result = (result * PRIME) + (this.externalKey == null ? 43 : this.externalKey.hashCode());
        result = (result * PRIME) + (this.attributes == null ? 43 : this.attributes.hashCode());
        result =
                (result * PRIME)
                        + (this.referencedFolderKey == null
                                ? 43
                                : this.referencedFolderKey.hashCode());
        result =
                (result * PRIME)
                        + (this.referencedFolderName == null
                                ? 43
                                : this.referencedFolderName.hashCode());
        result =
                (result * PRIME)
                        + (this.referencedEntityKey == null
                                ? 43
                                : this.referencedEntityKey.hashCode());
        result =
                (result * PRIME)
                        + (this.referencedEntityName == null
                                ? 43
                                : this.referencedEntityName.hashCode());
        result =
                (result * PRIME)
                        + (this.referencedRuleKey == null ? 43 : this.referencedRuleKey.hashCode());
        result =
                (result * PRIME)
                        + (this.referencedRuleName == null
                                ? 43
                                : this.referencedRuleName.hashCode());
        result =
                (result * PRIME)
                        + (this.referencedAttributes == null
                                ? 43
                                : this.referencedAttributes.hashCode());
        result = (result * PRIME) + (this.originType == null ? 43 : this.originType.hashCode());
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
