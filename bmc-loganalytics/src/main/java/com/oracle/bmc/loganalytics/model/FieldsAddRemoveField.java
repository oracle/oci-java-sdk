/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Field denoting a field specified in querylanguage FIELDS command.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FieldsAddRemoveField.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "name"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class FieldsAddRemoveField extends AbstractField {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDeclared")
        private Boolean isDeclared;

        public Builder isDeclared(Boolean isDeclared) {
            this.isDeclared = isDeclared;
            this.__explicitlySet__.add("isDeclared");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("originalDisplayNames")
        private java.util.List<String> originalDisplayNames;

        public Builder originalDisplayNames(java.util.List<String> originalDisplayNames) {
            this.originalDisplayNames = originalDisplayNames;
            this.__explicitlySet__.add("originalDisplayNames");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("internalName")
        private String internalName;

        public Builder internalName(String internalName) {
            this.internalName = internalName;
            this.__explicitlySet__.add("internalName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("valueType")
        private ValueType valueType;

        public Builder valueType(ValueType valueType) {
            this.valueType = valueType;
            this.__explicitlySet__.add("valueType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isGroupable")
        private Boolean isGroupable;

        public Builder isGroupable(Boolean isGroupable) {
            this.isGroupable = isGroupable;
            this.__explicitlySet__.add("isGroupable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isDuration")
        private Boolean isDuration;

        public Builder isDuration(Boolean isDuration) {
            this.isDuration = isDuration;
            this.__explicitlySet__.add("isDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("alias")
        private String alias;

        public Builder alias(String alias) {
            this.alias = alias;
            this.__explicitlySet__.add("alias");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("filterQueryString")
        private String filterQueryString;

        public Builder filterQueryString(String filterQueryString) {
            this.filterQueryString = filterQueryString;
            this.__explicitlySet__.add("filterQueryString");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("unitType")
        private String unitType;

        public Builder unitType(String unitType) {
            this.unitType = unitType;
            this.__explicitlySet__.add("unitType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("operation")
        private Operation operation;

        public Builder operation(Operation operation) {
            this.operation = operation;
            this.__explicitlySet__.add("operation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FieldsAddRemoveField build() {
            FieldsAddRemoveField __instance__ =
                    new FieldsAddRemoveField(
                            displayName,
                            isDeclared,
                            originalDisplayNames,
                            internalName,
                            valueType,
                            isGroupable,
                            isDuration,
                            alias,
                            filterQueryString,
                            unitType,
                            operation);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FieldsAddRemoveField o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .isDeclared(o.getIsDeclared())
                            .originalDisplayNames(o.getOriginalDisplayNames())
                            .internalName(o.getInternalName())
                            .valueType(o.getValueType())
                            .isGroupable(o.getIsGroupable())
                            .isDuration(o.getIsDuration())
                            .alias(o.getAlias())
                            .filterQueryString(o.getFilterQueryString())
                            .unitType(o.getUnitType())
                            .operation(o.getOperation());

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
    public FieldsAddRemoveField(
            String displayName,
            Boolean isDeclared,
            java.util.List<String> originalDisplayNames,
            String internalName,
            ValueType valueType,
            Boolean isGroupable,
            Boolean isDuration,
            String alias,
            String filterQueryString,
            String unitType,
            Operation operation) {
        super(
                displayName,
                isDeclared,
                originalDisplayNames,
                internalName,
                valueType,
                isGroupable,
                isDuration,
                alias,
                filterQueryString,
                unitType);
        this.operation = operation;
    }

    /**
     * Denotes if field entry in FIELDS command is to show / hide field in results.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Operation {
        Add("ADD"),
        Remove("REMOVE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Operation> map;

        static {
            map = new java.util.HashMap<>();
            for (Operation v : Operation.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Operation(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Operation create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Operation', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Denotes if field entry in FIELDS command is to show / hide field in results.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    Operation operation;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
