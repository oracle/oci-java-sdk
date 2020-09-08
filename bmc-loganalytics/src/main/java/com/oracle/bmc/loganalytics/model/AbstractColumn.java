/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Generic column defining all attributes common to all querylanguage columns.
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
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = AbstractColumn.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TimeColumn.class,
        name = "TIME_COLUMN"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ClassifyColumn.class,
        name = "CLASSIFY_COLUMN"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TrendColumn.class,
        name = "TREND_COLUMN"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = Column.class, name = "COLUMN"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ChartColumn.class,
        name = "CHART_COLUMN"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = ChartDataColumn.class,
        name = "CHART_DATA_COLUMN"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AbstractColumn {

    /**
     * Column display name - will be alias if column is renamed by queryStrng.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Subsystem column belongs to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subSystem")
    SubSystemName subSystem;

    /**
     * If the column is a 'List of Values' column, this array contains the field values that are applicable to query results or all if no filters applied.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    java.util.List<FieldValue> values;

    /**
     * Identifies if all values in this column come from a pre-defined list of values.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isListOfValues")
    Boolean isListOfValues;

    /**
     * Identifies if this column allows multiple values to exist in a single row.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMultiValued")
    Boolean isMultiValued;

    /**
     * Identifies if this column can be used as a grouping field in any grouping command.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isGroupable")
    Boolean isGroupable;

    /**
     * Identifies if this column can be used as an expression parameter in any command that accepts querylanguage expressions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEvaluable")
    Boolean isEvaluable;

    /**
     * Field denoting column data type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("valueType")
    ValueType valueType;

    /**
     * Same as displayName unless column renamed in which case this will hold the original display name for the column.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("originalDisplayName")
    String originalDisplayName;

    /**
     * Internal identifier for the column.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("internalName")
    String internalName;

    /**
     * Column classification when column requires special designation.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Type {
        Column("COLUMN"),
        ChartColumn("CHART_COLUMN"),
        ChartDataColumn("CHART_DATA_COLUMN"),
        TimeColumn("TIME_COLUMN"),
        TrendColumn("TREND_COLUMN"),
        ClassifyColumn("CLASSIFY_COLUMN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
}
