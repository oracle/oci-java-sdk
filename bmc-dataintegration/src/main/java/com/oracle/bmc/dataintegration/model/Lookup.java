/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information about the lookup operator. The lookup operator has two input links, a primary input, and a lookup source input. It has an output link, fields of the lookup input are appended to the primary input and projected as the output fields.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Lookup.Builder.class)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Lookup extends Operator {
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

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inputPorts")
        private java.util.List<InputPort> inputPorts;

        public Builder inputPorts(java.util.List<InputPort> inputPorts) {
            this.inputPorts = inputPorts;
            this.__explicitlySet__.add("inputPorts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputPorts")
        private java.util.List<TypedObject> outputPorts;

        public Builder outputPorts(java.util.List<TypedObject> outputPorts) {
            this.outputPorts = outputPorts;
            this.__explicitlySet__.add("outputPorts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parameters")
        private java.util.List<Parameter> parameters;

        public Builder parameters(java.util.List<Parameter> parameters) {
            this.parameters = parameters;
            this.__explicitlySet__.add("parameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("opConfigValues")
        private ConfigValues opConfigValues;

        public Builder opConfigValues(ConfigValues opConfigValues) {
            this.opConfigValues = opConfigValues;
            this.__explicitlySet__.add("opConfigValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lookupCondition")
        private Expression lookupCondition;

        public Builder lookupCondition(Expression lookupCondition) {
            this.lookupCondition = lookupCondition;
            this.__explicitlySet__.add("lookupCondition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSkipNoMatch")
        private Boolean isSkipNoMatch;

        public Builder isSkipNoMatch(Boolean isSkipNoMatch) {
            this.isSkipNoMatch = isSkipNoMatch;
            this.__explicitlySet__.add("isSkipNoMatch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("multiMatchStrategy")
        private MultiMatchStrategy multiMatchStrategy;

        public Builder multiMatchStrategy(MultiMatchStrategy multiMatchStrategy) {
            this.multiMatchStrategy = multiMatchStrategy;
            this.__explicitlySet__.add("multiMatchStrategy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("nullFillValues")
        private java.util.Map<String, Object> nullFillValues;

        public Builder nullFillValues(java.util.Map<String, Object> nullFillValues) {
            this.nullFillValues = nullFillValues;
            this.__explicitlySet__.add("nullFillValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Lookup build() {
            Lookup __instance__ =
                    new Lookup(
                            key,
                            modelVersion,
                            parentRef,
                            name,
                            description,
                            objectVersion,
                            inputPorts,
                            outputPorts,
                            objectStatus,
                            identifier,
                            parameters,
                            opConfigValues,
                            lookupCondition,
                            isSkipNoMatch,
                            multiMatchStrategy,
                            nullFillValues);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Lookup o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .modelVersion(o.getModelVersion())
                            .parentRef(o.getParentRef())
                            .name(o.getName())
                            .description(o.getDescription())
                            .objectVersion(o.getObjectVersion())
                            .inputPorts(o.getInputPorts())
                            .outputPorts(o.getOutputPorts())
                            .objectStatus(o.getObjectStatus())
                            .identifier(o.getIdentifier())
                            .parameters(o.getParameters())
                            .opConfigValues(o.getOpConfigValues())
                            .lookupCondition(o.getLookupCondition())
                            .isSkipNoMatch(o.getIsSkipNoMatch())
                            .multiMatchStrategy(o.getMultiMatchStrategy())
                            .nullFillValues(o.getNullFillValues());

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
    public Lookup(
            String key,
            String modelVersion,
            ParentReference parentRef,
            String name,
            String description,
            Integer objectVersion,
            java.util.List<InputPort> inputPorts,
            java.util.List<TypedObject> outputPorts,
            Integer objectStatus,
            String identifier,
            java.util.List<Parameter> parameters,
            ConfigValues opConfigValues,
            Expression lookupCondition,
            Boolean isSkipNoMatch,
            MultiMatchStrategy multiMatchStrategy,
            java.util.Map<String, Object> nullFillValues) {
        super(
                key,
                modelVersion,
                parentRef,
                name,
                description,
                objectVersion,
                inputPorts,
                outputPorts,
                objectStatus,
                identifier,
                parameters,
                opConfigValues);
        this.lookupCondition = lookupCondition;
        this.isSkipNoMatch = isSkipNoMatch;
        this.multiMatchStrategy = multiMatchStrategy;
        this.nullFillValues = nullFillValues;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("lookupCondition")
    Expression lookupCondition;

    /**
     * For the rows for which lookup condition does not satisfy, if set to true - do not return those rows of primary Input source and if set to false - create a row with primary input fields values and lookup field values as NULL.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSkipNoMatch")
    Boolean isSkipNoMatch;
    /**
     * if there are multiple records found in the lookup input what action should be performed. The default value for this field is RETURN_ANY.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum MultiMatchStrategy {
        ReturnAny("RETURN_ANY"),
        ReturnFirst("RETURN_FIRST"),
        ReturnLast("RETURN_LAST"),
        ReturnAll("RETURN_ALL"),
        ReturnError("RETURN_ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, MultiMatchStrategy> map;

        static {
            map = new java.util.HashMap<>();
            for (MultiMatchStrategy v : MultiMatchStrategy.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MultiMatchStrategy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MultiMatchStrategy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MultiMatchStrategy', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * if there are multiple records found in the lookup input what action should be performed. The default value for this field is RETURN_ANY.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("multiMatchStrategy")
    MultiMatchStrategy multiMatchStrategy;

    /**
     * this map is used for replacing NULL values in the record. Key is the column name and value is the NULL replacement.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("nullFillValues")
    java.util.Map<String, Object> nullFillValues;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
