/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Attribute
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Attribute.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Attribute {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private Object defaultValue;

        public Builder defaultValue(Object defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dynamicValueRangeRefAttr")
        private String dynamicValueRangeRefAttr;

        public Builder dynamicValueRangeRefAttr(String dynamicValueRangeRefAttr) {
            this.dynamicValueRangeRefAttr = dynamicValueRangeRefAttr;
            this.__explicitlySet__.add("dynamicValueRangeRefAttr");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maximumLen")
        private MaximumLen maximumLen;

        public Builder maximumLen(MaximumLen maximumLen) {
            this.maximumLen = maximumLen;
            this.__explicitlySet__.add("maximumLen");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("populatedBy")
        private PopulatedBy populatedBy;

        public Builder populatedBy(PopulatedBy populatedBy) {
            this.populatedBy = populatedBy;
            this.__explicitlySet__.add("populatedBy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requiredInJSON")
        private RequiredInJSON requiredInJSON;

        public Builder requiredInJSON(RequiredInJSON requiredInJSON) {
            this.requiredInJSON = requiredInJSON;
            this.__explicitlySet__.add("requiredInJSON");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("schemaColumn")
        private String schemaColumn;

        public Builder schemaColumn(String schemaColumn) {
            this.schemaColumn = schemaColumn;
            this.__explicitlySet__.add("schemaColumn");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isStringExceedMaximumLength")
        private Boolean isStringExceedMaximumLength;

        public Builder isStringExceedMaximumLength(Boolean isStringExceedMaximumLength) {
            this.isStringExceedMaximumLength = isStringExceedMaximumLength;
            this.__explicitlySet__.add("isStringExceedMaximumLength");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("usageSenario")
        private UsageSenario usageSenario;

        public Builder usageSenario(UsageSenario usageSenario) {
            this.usageSenario = usageSenario;
            this.__explicitlySet__.add("usageSenario");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("valueDataType")
        private ValueDataType valueDataType;

        public Builder valueDataType(ValueDataType valueDataType) {
            this.valueDataType = valueDataType;
            this.__explicitlySet__.add("valueDataType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("valuePopulationPriority")
        private ValuePopulationPriority valuePopulationPriority;

        public Builder valuePopulationPriority(ValuePopulationPriority valuePopulationPriority) {
            this.valuePopulationPriority = valuePopulationPriority;
            this.__explicitlySet__.add("valuePopulationPriority");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Attribute build() {
            Attribute __instance__ =
                    new Attribute(
                            defaultValue,
                            dynamicValueRangeRefAttr,
                            maximumLen,
                            name,
                            populatedBy,
                            requiredInJSON,
                            schemaColumn,
                            isStringExceedMaximumLength,
                            usageSenario,
                            valueDataType,
                            valuePopulationPriority);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Attribute o) {
            Builder copiedBuilder =
                    defaultValue(o.getDefaultValue())
                            .dynamicValueRangeRefAttr(o.getDynamicValueRangeRefAttr())
                            .maximumLen(o.getMaximumLen())
                            .name(o.getName())
                            .populatedBy(o.getPopulatedBy())
                            .requiredInJSON(o.getRequiredInJSON())
                            .schemaColumn(o.getSchemaColumn())
                            .isStringExceedMaximumLength(o.getIsStringExceedMaximumLength())
                            .usageSenario(o.getUsageSenario())
                            .valueDataType(o.getValueDataType())
                            .valuePopulationPriority(o.getValuePopulationPriority());

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
     * default value
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    Object defaultValue;

    /**
     * dynamic value range reference attribute
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dynamicValueRangeRefAttr")
    String dynamicValueRangeRefAttr;
    /**
     * maximum length
     **/
    public enum MaximumLen {
        LengthFive("LENGTH_FIVE"),
        LengthSixteen("LENGTH_SIXTEEN"),
        LengthThirtytwo("LENGTH_THIRTYTWO"),
        LengthSixtyfour("LENGTH_SIXTYFOUR"),
        LengthOnetwoeight("LENGTH_ONETWOEIGHT"),
        LengthTwofiftysix("LENGTH_TWOFIFTYSIX"),
        LengthFivetwelve("LENGTH_FIVETWELVE"),
        LengthSevenfifty("LENGTH_SEVENFIFTY"),
        LengthOneThousand("LENGTH_ONE_THOUSAND"),
        LengthTwoThousand("LENGTH_TWO_THOUSAND"),
        LengthFourThousand("LENGTH_FOUR_THOUSAND"),
        ;

        private final String value;
        private static java.util.Map<String, MaximumLen> map;

        static {
            map = new java.util.HashMap<>();
            for (MaximumLen v : MaximumLen.values()) {
                map.put(v.getValue(), v);
            }
        }

        MaximumLen(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MaximumLen create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid MaximumLen: " + key);
        }
    };
    /**
     * maximum length
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maximumLen")
    MaximumLen maximumLen;

    /**
     * name
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;
    /**
     * populated by
     **/
    public enum PopulatedBy {
        BackendGen("BACKEND_GEN"),
        CallerGen("CALLER_GEN"),
        ;

        private final String value;
        private static java.util.Map<String, PopulatedBy> map;

        static {
            map = new java.util.HashMap<>();
            for (PopulatedBy v : PopulatedBy.values()) {
                map.put(v.getValue(), v);
            }
        }

        PopulatedBy(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PopulatedBy create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid PopulatedBy: " + key);
        }
    };
    /**
     * populated by
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("populatedBy")
    PopulatedBy populatedBy;
    /**
     * required in JSON
     **/
    public enum RequiredInJSON {
        Mandatory("MANDATORY"),
        Optional("OPTIONAL"),
        ;

        private final String value;
        private static java.util.Map<String, RequiredInJSON> map;

        static {
            map = new java.util.HashMap<>();
            for (RequiredInJSON v : RequiredInJSON.values()) {
                map.put(v.getValue(), v);
            }
        }

        RequiredInJSON(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RequiredInJSON create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid RequiredInJSON: " + key);
        }
    };
    /**
     * required in JSON
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requiredInJSON")
    RequiredInJSON requiredInJSON;

    /**
     * schema column
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("schemaColumn")
    String schemaColumn;

    /**
     * is string exceed maximum length
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isStringExceedMaximumLength")
    Boolean isStringExceedMaximumLength;
    /**
     * usage senario
     **/
    public enum UsageSenario {
        Create("CREATE"),
        Update("UPDATE"),
        CreateAndUpdate("CREATE_AND_UPDATE"),
        Delete("DELETE"),
        ReCreate("RE_CREATE"),
        Detail("DETAIL"),
        List("LIST"),
        FunctionWithLookup("FUNCTION_WITH_LOOKUP"),
        DbPattern("DB_PATTERN"),
        CreateFirsttimeT1("CREATE_FIRSTTIME_T1"),
        UpdateOobMetric("UPDATE_OOB_METRIC"),
        ;

        private final String value;
        private static java.util.Map<String, UsageSenario> map;

        static {
            map = new java.util.HashMap<>();
            for (UsageSenario v : UsageSenario.values()) {
                map.put(v.getValue(), v);
            }
        }

        UsageSenario(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static UsageSenario create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid UsageSenario: " + key);
        }
    };
    /**
     * usage senario
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("usageSenario")
    UsageSenario usageSenario;
    /**
     * value data type
     **/
    public enum ValueDataType {
        Integer("INTEGER"),
        Long("LONG"),
        Float("FLOAT"),
        String("STRING"),
        Timestamp("TIMESTAMP"),
        Date("DATE"),
        Clob("CLOB"),
        TagRef("TAG_REF"),
        ParserRef("PARSER_REF"),
        SttRef("STT_REF"),
        LookupRef("LOOKUP_REF"),
        MetaFunctionRef("META_FUNCTION_REF"),
        CommonFieldRef("COMMON_FIELD_REF"),
        ;

        private final String value;
        private static java.util.Map<String, ValueDataType> map;

        static {
            map = new java.util.HashMap<>();
            for (ValueDataType v : ValueDataType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ValueDataType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ValueDataType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ValueDataType: " + key);
        }
    };
    /**
     * value data type
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("valueDataType")
    ValueDataType valueDataType;
    /**
     * value population priority
     **/
    public enum ValuePopulationPriority {
        None("NONE"),
        Low("LOW"),
        High("HIGH"),
        ;

        private final String value;
        private static java.util.Map<String, ValuePopulationPriority> map;

        static {
            map = new java.util.HashMap<>();
            for (ValuePopulationPriority v : ValuePopulationPriority.values()) {
                map.put(v.getValue(), v);
            }
        }

        ValuePopulationPriority(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ValuePopulationPriority create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ValuePopulationPriority: " + key);
        }
    };
    /**
     * value population priority
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("valuePopulationPriority")
    ValuePopulationPriority valuePopulationPriority;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
