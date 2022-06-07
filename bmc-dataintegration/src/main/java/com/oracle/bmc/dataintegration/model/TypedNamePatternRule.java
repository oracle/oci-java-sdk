/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The typed name rule for field projection.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TypedNamePatternRule.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TypedNamePatternRule extends ProjectionRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

        @com.fasterxml.jackson.annotation.JsonProperty("types")
        private java.util.List<Object> types;

        public Builder types(java.util.List<Object> types) {
            this.types = types;
            this.__explicitlySet__.add("types");
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

        @com.fasterxml.jackson.annotation.JsonProperty("pattern")
        private String pattern;

        public Builder pattern(String pattern) {
            this.pattern = pattern;
            this.__explicitlySet__.add("pattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("names")
        private java.util.List<String> names;

        public Builder names(java.util.List<String> names) {
            this.names = names;
            this.__explicitlySet__.add("names");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TypedNamePatternRule build() {
            TypedNamePatternRule __instance__ =
                    new TypedNamePatternRule(
                            key,
                            modelVersion,
                            parentRef,
                            isJavaRegexSyntax,
                            configValues,
                            objectStatus,
                            description,
                            types,
                            isSkipRemainingRulesOnMatch,
                            scope,
                            isCascade,
                            matchingStrategy,
                            isCaseSensitive,
                            ruleType,
                            pattern,
                            names);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TypedNamePatternRule o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .isJavaRegexSyntax(o.getIsJavaRegexSyntax())
                            .configValues(o.getConfigValues())
                            .objectStatus(o.getObjectStatus())
                            .description(o.getDescription())
                            .types(o.getTypes())
                            .isSkipRemainingRulesOnMatch(o.getIsSkipRemainingRulesOnMatch())
                            .scope(o.getScope())
                            .isCascade(o.getIsCascade())
                            .matchingStrategy(o.getMatchingStrategy())
                            .isCaseSensitive(o.getIsCaseSensitive())
                            .ruleType(o.getRuleType())
                            .pattern(o.getPattern())
                            .names(o.getNames());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public TypedNamePatternRule(
            String key,
            String modelVersion,
            ParentReference parentRef,
            Boolean isJavaRegexSyntax,
            ConfigValues configValues,
            Integer objectStatus,
            String description,
            java.util.List<Object> types,
            Boolean isSkipRemainingRulesOnMatch,
            Object scope,
            Boolean isCascade,
            MatchingStrategy matchingStrategy,
            Boolean isCaseSensitive,
            RuleType ruleType,
            String pattern,
            java.util.List<String> names) {
        super(
                key,
                modelVersion,
                parentRef,
                isJavaRegexSyntax,
                configValues,
                objectStatus,
                description);
        this.types = types;
        this.isSkipRemainingRulesOnMatch = isSkipRemainingRulesOnMatch;
        this.scope = scope;
        this.isCascade = isCascade;
        this.matchingStrategy = matchingStrategy;
        this.isCaseSensitive = isCaseSensitive;
        this.ruleType = ruleType;
        this.pattern = pattern;
        this.names = names;
    }

    /**
     * An array of types.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("types")
    private final java.util.List<Object> types;

    public java.util.List<Object> getTypes() {
        return types;
    }

    /**
     * Specifies whether to skip remaining rules when a match is found.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSkipRemainingRulesOnMatch")
    private final Boolean isSkipRemainingRulesOnMatch;

    public Boolean getIsSkipRemainingRulesOnMatch() {
        return isSkipRemainingRulesOnMatch;
    }

    /**
     * Reference to a typed object. This can be either a key value to an object within the document, a shall referenced to a {@code TypedObject}, or a full {@code TypedObject} definition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    private final Object scope;

    public Object getScope() {
        return scope;
    }

    /**
     * Specifies whether to cascade or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCascade")
    private final Boolean isCascade;

    public Boolean getIsCascade() {
        return isCascade;
    }

    /**
     * The pattern matching strategy.
     **/
    public enum MatchingStrategy {
        NameOrTags("NAME_OR_TAGS"),
        TagsOnly("TAGS_ONLY"),
        NameOnly("NAME_ONLY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(MatchingStrategy.class);

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
    private final MatchingStrategy matchingStrategy;

    public MatchingStrategy getMatchingStrategy() {
        return matchingStrategy;
    }

    /**
     * Specifies if the rule is case sensitive.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCaseSensitive")
    private final Boolean isCaseSensitive;

    public Boolean getIsCaseSensitive() {
        return isCaseSensitive;
    }

    /**
     * The rule type.
     **/
    public enum RuleType {
        Include("INCLUDE"),
        Exclude("EXCLUDE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RuleType.class);

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
    private final RuleType ruleType;

    public RuleType getRuleType() {
        return ruleType;
    }

    /**
     * The rule pattern.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pattern")
    private final String pattern;

    public String getPattern() {
        return pattern;
    }

    /**
     * Free form text without any restriction on permitted characters. Name can have letters, numbers, and special characters. The value is editable and is restricted to 1000 characters.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("names")
    private final java.util.List<String> names;

    public java.util.List<String> getNames() {
        return names;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TypedNamePatternRule(");
        sb.append("super=").append(super.toString());
        sb.append(", types=").append(String.valueOf(this.types));
        sb.append(", isSkipRemainingRulesOnMatch=")
                .append(String.valueOf(this.isSkipRemainingRulesOnMatch));
        sb.append(", scope=").append(String.valueOf(this.scope));
        sb.append(", isCascade=").append(String.valueOf(this.isCascade));
        sb.append(", matchingStrategy=").append(String.valueOf(this.matchingStrategy));
        sb.append(", isCaseSensitive=").append(String.valueOf(this.isCaseSensitive));
        sb.append(", ruleType=").append(String.valueOf(this.ruleType));
        sb.append(", pattern=").append(String.valueOf(this.pattern));
        sb.append(", names=").append(String.valueOf(this.names));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TypedNamePatternRule)) {
            return false;
        }

        TypedNamePatternRule other = (TypedNamePatternRule) o;
        return java.util.Objects.equals(this.types, other.types)
                && java.util.Objects.equals(
                        this.isSkipRemainingRulesOnMatch, other.isSkipRemainingRulesOnMatch)
                && java.util.Objects.equals(this.scope, other.scope)
                && java.util.Objects.equals(this.isCascade, other.isCascade)
                && java.util.Objects.equals(this.matchingStrategy, other.matchingStrategy)
                && java.util.Objects.equals(this.isCaseSensitive, other.isCaseSensitive)
                && java.util.Objects.equals(this.ruleType, other.ruleType)
                && java.util.Objects.equals(this.pattern, other.pattern)
                && java.util.Objects.equals(this.names, other.names)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.types == null ? 43 : this.types.hashCode());
        result =
                (result * PRIME)
                        + (this.isSkipRemainingRulesOnMatch == null
                                ? 43
                                : this.isSkipRemainingRulesOnMatch.hashCode());
        result = (result * PRIME) + (this.scope == null ? 43 : this.scope.hashCode());
        result = (result * PRIME) + (this.isCascade == null ? 43 : this.isCascade.hashCode());
        result =
                (result * PRIME)
                        + (this.matchingStrategy == null ? 43 : this.matchingStrategy.hashCode());
        result =
                (result * PRIME)
                        + (this.isCaseSensitive == null ? 43 : this.isCaseSensitive.hashCode());
        result = (result * PRIME) + (this.ruleType == null ? 43 : this.ruleType.hashCode());
        result = (result * PRIME) + (this.pattern == null ? 43 : this.pattern.hashCode());
        result = (result * PRIME) + (this.names == null ? 43 : this.names.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
