/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The rule type config.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RuleTypeConfig.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RuleTypeConfig extends DynamicTypeHandler {
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

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private Object scope;

        public Builder scope(Object scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scopeReference")
        private ScopeReference scopeReference;

        public Builder scopeReference(ScopeReference scopeReference) {
            this.scopeReference = scopeReference;
            this.__explicitlySet__.add("scopeReference");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isOrderByRule")
        private Boolean isOrderByRule;

        public Builder isOrderByRule(Boolean isOrderByRule) {
            this.isOrderByRule = isOrderByRule;
            this.__explicitlySet__.add("isOrderByRule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("projectionRules")
        private java.util.List<ProjectionRule> projectionRules;

        public Builder projectionRules(java.util.List<ProjectionRule> projectionRules) {
            this.projectionRules = projectionRules;
            this.__explicitlySet__.add("projectionRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configValues")
        private ConfigValues configValues;

        public Builder configValues(ConfigValues configValues) {
            this.configValues = configValues;
            this.__explicitlySet__.add("configValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RuleTypeConfig build() {
            RuleTypeConfig __instance__ =
                    new RuleTypeConfig(
                            key,
                            modelVersion,
                            parentRef,
                            scope,
                            scopeReference,
                            isOrderByRule,
                            projectionRules,
                            configValues,
                            objectStatus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RuleTypeConfig o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .scope(o.getScope())
                            .scopeReference(o.getScopeReference())
                            .isOrderByRule(o.getIsOrderByRule())
                            .projectionRules(o.getProjectionRules())
                            .configValues(o.getConfigValues())
                            .objectStatus(o.getObjectStatus());

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

    @Deprecated
    public RuleTypeConfig(
            String key,
            String modelVersion,
            ParentReference parentRef,
            Object scope,
            ScopeReference scopeReference,
            Boolean isOrderByRule,
            java.util.List<ProjectionRule> projectionRules,
            ConfigValues configValues,
            Integer objectStatus) {
        super();
        this.key = key;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.scope = scope;
        this.scopeReference = scopeReference;
        this.isOrderByRule = isOrderByRule;
        this.projectionRules = projectionRules;
        this.configValues = configValues;
        this.objectStatus = objectStatus;
    }

    /**
     * The key of the object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The model version of an object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    String modelVersion;

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    ParentReference parentRef;

    /**
     * Deprecated - Reference to a typed object, this can be either a key value to an object within the document, a shall referenced to a {@code TypedObject} or a full {@code TypedObject} definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    Object scope;

    @com.fasterxml.jackson.annotation.JsonProperty("scopeReference")
    ScopeReference scopeReference;

    /**
     * Specifies whether it is ordered by rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOrderByRule")
    Boolean isOrderByRule;

    /**
     * The projection rules.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("projectionRules")
    java.util.List<ProjectionRule> projectionRules;

    @com.fasterxml.jackson.annotation.JsonProperty("configValues")
    ConfigValues configValues;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    Integer objectStatus;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
