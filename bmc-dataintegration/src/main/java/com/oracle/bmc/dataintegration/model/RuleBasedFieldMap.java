/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * A map of rule patterns.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RuleBasedFieldMap.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class RuleBasedFieldMap extends FieldMap {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("configValues")
        private ConfigValues configValues;

        public Builder configValues(ConfigValues configValues) {
            this.configValues = configValues;
            this.__explicitlySet__.add("configValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mapType")
        private MapType mapType;

        public Builder mapType(MapType mapType) {
            this.mapType = mapType;
            this.__explicitlySet__.add("mapType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fromPattern")
        private String fromPattern;

        public Builder fromPattern(String fromPattern) {
            this.fromPattern = fromPattern;
            this.__explicitlySet__.add("fromPattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("toPattern")
        private String toPattern;

        public Builder toPattern(String toPattern) {
            this.toPattern = toPattern;
            this.__explicitlySet__.add("toPattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isJavaRegexSyntax")
        private Boolean isJavaRegexSyntax;

        public Builder isJavaRegexSyntax(Boolean isJavaRegexSyntax) {
            this.isJavaRegexSyntax = isJavaRegexSyntax;
            this.__explicitlySet__.add("isJavaRegexSyntax");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fromRuleConfig")
        private RuleTypeConfig fromRuleConfig;

        public Builder fromRuleConfig(RuleTypeConfig fromRuleConfig) {
            this.fromRuleConfig = fromRuleConfig;
            this.__explicitlySet__.add("fromRuleConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("toRuleConfig")
        private RuleTypeConfig toRuleConfig;

        public Builder toRuleConfig(RuleTypeConfig toRuleConfig) {
            this.toRuleConfig = toRuleConfig;
            this.__explicitlySet__.add("toRuleConfig");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RuleBasedFieldMap build() {
            RuleBasedFieldMap __instance__ =
                    new RuleBasedFieldMap(
                            description,
                            key,
                            modelVersion,
                            parentRef,
                            configValues,
                            mapType,
                            fromPattern,
                            toPattern,
                            isJavaRegexSyntax,
                            objectStatus,
                            fromRuleConfig,
                            toRuleConfig);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RuleBasedFieldMap o) {
            Builder copiedBuilder =
                    description(o.getDescription())
                            .key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .configValues(o.getConfigValues())
                            .mapType(o.getMapType())
                            .fromPattern(o.getFromPattern())
                            .toPattern(o.getToPattern())
                            .isJavaRegexSyntax(o.getIsJavaRegexSyntax())
                            .objectStatus(o.getObjectStatus())
                            .fromRuleConfig(o.getFromRuleConfig())
                            .toRuleConfig(o.getToRuleConfig());

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
    public RuleBasedFieldMap(
            String description,
            String key,
            String modelVersion,
            ParentReference parentRef,
            ConfigValues configValues,
            MapType mapType,
            String fromPattern,
            String toPattern,
            Boolean isJavaRegexSyntax,
            Integer objectStatus,
            RuleTypeConfig fromRuleConfig,
            RuleTypeConfig toRuleConfig) {
        super(description);
        this.key = key;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.configValues = configValues;
        this.mapType = mapType;
        this.fromPattern = fromPattern;
        this.toPattern = toPattern;
        this.isJavaRegexSyntax = isJavaRegexSyntax;
        this.objectStatus = objectStatus;
        this.fromRuleConfig = fromRuleConfig;
        this.toRuleConfig = toRuleConfig;
    }

    /**
     * The object key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The object's model version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    String modelVersion;

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    ParentReference parentRef;

    @com.fasterxml.jackson.annotation.JsonProperty("configValues")
    ConfigValues configValues;
    /**
     * mapType
     **/
    @lombok.extern.slf4j.Slf4j
    public enum MapType {
        Mapbyname("MAPBYNAME"),
        Mapbyposition("MAPBYPOSITION"),
        Mapbypattern("MAPBYPATTERN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, MapType> map;

        static {
            map = new java.util.HashMap<>();
            for (MapType v : MapType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MapType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MapType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MapType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * mapType
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mapType")
    MapType mapType;

    /**
     * The pattern to map from.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fromPattern")
    String fromPattern;

    /**
     * The pattern to map to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("toPattern")
    String toPattern;

    /**
     * Specifies whether the rule uses a java regex syntax.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isJavaRegexSyntax")
    Boolean isJavaRegexSyntax;

    /**
     * The status of an object that can be set to value 1 for shallow references across objects, other values reserved.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
    Integer objectStatus;

    @com.fasterxml.jackson.annotation.JsonProperty("fromRuleConfig")
    RuleTypeConfig fromRuleConfig;

    @com.fasterxml.jackson.annotation.JsonProperty("toRuleConfig")
    RuleTypeConfig toRuleConfig;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
