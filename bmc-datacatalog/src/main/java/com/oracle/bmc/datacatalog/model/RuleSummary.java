/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RuleSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RuleSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ruleType")
        private RuleType ruleType;

        public Builder ruleType(RuleType ruleType) {
            this.ruleType = ruleType;
            this.__explicitlySet__.add("ruleType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
        private String externalKey;

        public Builder externalKey(String externalKey) {
            this.externalKey = externalKey;
            this.__explicitlySet__.add("externalKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("attributes")
        private java.util.List<RuleAttribute> attributes;

        public Builder attributes(java.util.List<RuleAttribute> attributes) {
            this.attributes = attributes;
            this.__explicitlySet__.add("attributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referencedFolderKey")
        private String referencedFolderKey;

        public Builder referencedFolderKey(String referencedFolderKey) {
            this.referencedFolderKey = referencedFolderKey;
            this.__explicitlySet__.add("referencedFolderKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referencedFolderName")
        private String referencedFolderName;

        public Builder referencedFolderName(String referencedFolderName) {
            this.referencedFolderName = referencedFolderName;
            this.__explicitlySet__.add("referencedFolderName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referencedEntityKey")
        private String referencedEntityKey;

        public Builder referencedEntityKey(String referencedEntityKey) {
            this.referencedEntityKey = referencedEntityKey;
            this.__explicitlySet__.add("referencedEntityKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referencedEntityName")
        private String referencedEntityName;

        public Builder referencedEntityName(String referencedEntityName) {
            this.referencedEntityName = referencedEntityName;
            this.__explicitlySet__.add("referencedEntityName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referencedRuleKey")
        private String referencedRuleKey;

        public Builder referencedRuleKey(String referencedRuleKey) {
            this.referencedRuleKey = referencedRuleKey;
            this.__explicitlySet__.add("referencedRuleKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referencedRuleName")
        private String referencedRuleName;

        public Builder referencedRuleName(String referencedRuleName) {
            this.referencedRuleName = referencedRuleName;
            this.__explicitlySet__.add("referencedRuleName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("referencedAttributes")
        private java.util.List<RuleAttribute> referencedAttributes;

        public Builder referencedAttributes(java.util.List<RuleAttribute> referencedAttributes) {
            this.referencedAttributes = referencedAttributes;
            this.__explicitlySet__.add("referencedAttributes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("originType")
        private RuleOriginType originType;

        public Builder originType(RuleOriginType originType) {
            this.originType = originType;
            this.__explicitlySet__.add("originType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RuleSummary build() {
            RuleSummary __instance__ =
                    new RuleSummary(
                            key,
                            displayName,
                            description,
                            ruleType,
                            externalKey,
                            attributes,
                            referencedFolderKey,
                            referencedFolderName,
                            referencedEntityKey,
                            referencedEntityName,
                            referencedRuleKey,
                            referencedRuleName,
                            referencedAttributes,
                            originType,
                            uri,
                            timeCreated,
                            lifecycleState);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RuleSummary o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .displayName(o.getDisplayName())
                            .description(o.getDescription())
                            .ruleType(o.getRuleType())
                            .externalKey(o.getExternalKey())
                            .attributes(o.getAttributes())
                            .referencedFolderKey(o.getReferencedFolderKey())
                            .referencedFolderName(o.getReferencedFolderName())
                            .referencedEntityKey(o.getReferencedEntityKey())
                            .referencedEntityName(o.getReferencedEntityName())
                            .referencedRuleKey(o.getReferencedRuleKey())
                            .referencedRuleName(o.getReferencedRuleName())
                            .referencedAttributes(o.getReferencedAttributes())
                            .originType(o.getOriginType())
                            .uri(o.getUri())
                            .timeCreated(o.getTimeCreated())
                            .lifecycleState(o.getLifecycleState());

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

    /**
     * Immutable unique key of a rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * A user-friendly display name. Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Detailed description of a rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * Type of a rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ruleType")
    RuleType ruleType;

    /**
     * External URI that can be used to reference the object. Format will differ based on the type of object.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalKey")
    String externalKey;

    /**
     * Attributes associated with a rule.
     * A UNIQUEKEY rule would contain (at least) one attribute, for the local table column(s) on which uniqueness is defined.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("attributes")
    java.util.List<RuleAttribute> attributes;

    /**
     * Folder key that represents the referenced folder, applicable only when rule type FOREIGNKEY.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referencedFolderKey")
    String referencedFolderKey;

    /**
     * Folder name that represents the referenced folder, applicable only when rule type FOREIGNKEY.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referencedFolderName")
    String referencedFolderName;

    /**
     * Entity key that represents the referenced entity, applicable only when rule type is FOREIGNKEY.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referencedEntityKey")
    String referencedEntityKey;

    /**
     * Entity name that represents the referenced entity, applicable only when rule type is FOREIGNKEY.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referencedEntityName")
    String referencedEntityName;

    /**
     * Rule key that represents the referenced rule, applicable only when rule type is FOREIGNKEY.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referencedRuleKey")
    String referencedRuleKey;

    /**
     * Rule name that represents the referenced rule, applicable only when rule type is FOREIGNKEY.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referencedRuleName")
    String referencedRuleName;

    /**
     * Attributes associated with referenced rule, applicable only when rule type is FOREIGNKEY.
     * A FOREIGNKEY rule would contain (at least) one attribute, for the local table column(s), and (at least) one referencedAttribute for referenced table column(s).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("referencedAttributes")
    java.util.List<RuleAttribute> referencedAttributes;

    /**
     * Origin type of the rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("originType")
    RuleOriginType originType;

    /**
     * URI to the rule instance in the API.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    String uri;

    /**
     * The date and time the rule was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * Example: `2019-03-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;

    /**
     * State of the rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
