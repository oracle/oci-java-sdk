/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The type list rule that defines how fields are projected.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TypeListRule.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class TypeListRule extends ProjectionRule {
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

        @com.fasterxml.jackson.annotation.JsonProperty("isJavaRegexSyntax")
        private Boolean isJavaRegexSyntax;

        public Builder isJavaRegexSyntax(Boolean isJavaRegexSyntax) {
            this.isJavaRegexSyntax = isJavaRegexSyntax;
            this.__explicitlySet__.add("isJavaRegexSyntax");
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

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSkipRemainingRulesOnMatch")
        private Boolean isSkipRemainingRulesOnMatch;

        public Builder isSkipRemainingRulesOnMatch(Boolean isSkipRemainingRulesOnMatch) {
            this.isSkipRemainingRulesOnMatch = isSkipRemainingRulesOnMatch;
            this.__explicitlySet__.add("isSkipRemainingRulesOnMatch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("scope")
        private Object scope;

        public Builder scope(Object scope) {
            this.scope = scope;
            this.__explicitlySet__.add("scope");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCascade")
        private Boolean isCascade;

        public Builder isCascade(Boolean isCascade) {
            this.isCascade = isCascade;
            this.__explicitlySet__.add("isCascade");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("matchingStrategy")
        private MatchingStrategy matchingStrategy;

        public Builder matchingStrategy(MatchingStrategy matchingStrategy) {
            this.matchingStrategy = matchingStrategy;
            this.__explicitlySet__.add("matchingStrategy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCaseSensitive")
        private Boolean isCaseSensitive;

        public Builder isCaseSensitive(Boolean isCaseSensitive) {
            this.isCaseSensitive = isCaseSensitive;
            this.__explicitlySet__.add("isCaseSensitive");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ruleType")
        private RuleType ruleType;

        public Builder ruleType(RuleType ruleType) {
            this.ruleType = ruleType;
            this.__explicitlySet__.add("ruleType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("types")
        private java.util.List<Object> types;

        public Builder types(java.util.List<Object> types) {
            this.types = types;
            this.__explicitlySet__.add("types");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TypeListRule build() {
            TypeListRule __instance__ =
                    new TypeListRule(
                            key,
                            modelVersion,
                            parentRef,
                            isJavaRegexSyntax,
                            configValues,
                            objectStatus,
                            description,
                            isSkipRemainingRulesOnMatch,
                            scope,
                            isCascade,
                            matchingStrategy,
                            isCaseSensitive,
                            ruleType,
                            types);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TypeListRule o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .isJavaRegexSyntax(o.getIsJavaRegexSyntax())
                            .configValues(o.getConfigValues())
                            .objectStatus(o.getObjectStatus())
                            .description(o.getDescription())
                            .isSkipRemainingRulesOnMatch(o.getIsSkipRemainingRulesOnMatch())
                            .scope(o.getScope())
                            .isCascade(o.getIsCascade())
                            .matchingStrategy(o.getMatchingStrategy())
                            .isCaseSensitive(o.getIsCaseSensitive())
                            .ruleType(o.getRuleType())
                            .types(o.getTypes());

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
    public TypeListRule(
            String key,
            String modelVersion,
            ParentReference parentRef,
            Boolean isJavaRegexSyntax,
            ConfigValues configValues,
            Integer objectStatus,
            String description,
            Boolean isSkipRemainingRulesOnMatch,
            Object scope,
            Boolean isCascade,
            MatchingStrategy matchingStrategy,
            Boolean isCaseSensitive,
            RuleType ruleType,
            java.util.List<Object> types) {
        super(
                key,
                modelVersion,
                parentRef,
                isJavaRegexSyntax,
                configValues,
                objectStatus,
                description);
        this.isSkipRemainingRulesOnMatch = isSkipRemainingRulesOnMatch;
        this.scope = scope;
        this.isCascade = isCascade;
        this.matchingStrategy = matchingStrategy;
        this.isCaseSensitive = isCaseSensitive;
        this.ruleType = ruleType;
        this.types = types;
    }

    /**
     * Specifies whether to skip remaining rules when a match is found.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSkipRemainingRulesOnMatch")
    Boolean isSkipRemainingRulesOnMatch;

    /**
     * Reference to a typed object. This can be either a key value to an object within the document, a shall referenced to a {@code TypedObject}, or a full {@code TypedObject} definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    Object scope;

    /**
     * Specifies whether to cascade or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCascade")
    Boolean isCascade;
    /**
     * The pattern matching strategy.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum MatchingStrategy {
        NameOrTags("NAME_OR_TAGS"),
        TagsOnly("TAGS_ONLY"),
        NameOnly("NAME_ONLY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, MatchingStrategy> map;

        static {
            map = new java.util.HashMap<>();
            for (MatchingStrategy v : MatchingStrategy.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MatchingStrategy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MatchingStrategy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MatchingStrategy', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The pattern matching strategy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("matchingStrategy")
    MatchingStrategy matchingStrategy;

    /**
     * Specifies if the rule is case sensitive.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCaseSensitive")
    Boolean isCaseSensitive;
    /**
     * The rule type.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum RuleType {
        Include("INCLUDE"),
        Exclude("EXCLUDE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, RuleType> map;

        static {
            map = new java.util.HashMap<>();
            for (RuleType v : RuleType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RuleType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RuleType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RuleType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The rule type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ruleType")
    RuleType ruleType;

    /**
     * An arry of types.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("types")
    java.util.List<Object> types;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
