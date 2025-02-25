/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TimeStatsColumn.class,
        name = "TIME_STATS_COLUMN"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TimeClusterColumn.class,
        name = "TIME_CLUSTER_COLUMN"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = Column.class, name = "COLUMN"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TimeClusterDataColumn.class,
        name = "TIME_CLUSTER_DATA_COLUMN"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TimeStatsDataColumn.class,
        name = "TIME_STATS_DATA_COLUMN"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = TableColumn.class,
        name = "TABLE_COLUMN"
    ),
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
public class AbstractColumn extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "subSystem",
        "values",
        "isListOfValues",
        "isMultiValued",
        "isCaseSensitive",
        "isGroupable",
        "isEvaluable",
        "isHidden",
        "valueType",
        "originalDisplayName",
        "internalName"
    })
    protected AbstractColumn(
            String displayName,
            SubSystemName subSystem,
            java.util.List<FieldValue> values,
            Boolean isListOfValues,
            Boolean isMultiValued,
            Boolean isCaseSensitive,
            Boolean isGroupable,
            Boolean isEvaluable,
            Boolean isHidden,
            ValueType valueType,
            String originalDisplayName,
            String internalName) {
        super();
        this.displayName = displayName;
        this.subSystem = subSystem;
        this.values = values;
        this.isListOfValues = isListOfValues;
        this.isMultiValued = isMultiValued;
        this.isCaseSensitive = isCaseSensitive;
        this.isGroupable = isGroupable;
        this.isEvaluable = isEvaluable;
        this.isHidden = isHidden;
        this.valueType = valueType;
        this.originalDisplayName = originalDisplayName;
        this.internalName = internalName;
    }

    /**
     * Column display name - will be alias if column is renamed by queryStrng.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Column display name - will be alias if column is renamed by queryStrng.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Subsystem column belongs to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subSystem")
    private final SubSystemName subSystem;

    /**
     * Subsystem column belongs to.
     *
     * @return the value
     **/
    public SubSystemName getSubSystem() {
        return subSystem;
    }

    /**
     * If the column is a 'List of Values' column, this array contains the field values that are applicable to query results or all if no filters applied.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("values")
    private final java.util.List<FieldValue> values;

    /**
     * If the column is a 'List of Values' column, this array contains the field values that are applicable to query results or all if no filters applied.
     *
     * @return the value
     **/
    public java.util.List<FieldValue> getValues() {
        return values;
    }

    /**
     * Identifies if all values in this column come from a pre-defined list of values.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isListOfValues")
    private final Boolean isListOfValues;

    /**
     * Identifies if all values in this column come from a pre-defined list of values.
     *
     * @return the value
     **/
    public Boolean getIsListOfValues() {
        return isListOfValues;
    }

    /**
     * Identifies if this column allows multiple values to exist in a single row.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMultiValued")
    private final Boolean isMultiValued;

    /**
     * Identifies if this column allows multiple values to exist in a single row.
     *
     * @return the value
     **/
    public Boolean getIsMultiValued() {
        return isMultiValued;
    }

    /**
     * A flag indicating whether or not the field is a case sensitive field.  Only applies to string fields.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCaseSensitive")
    private final Boolean isCaseSensitive;

    /**
     * A flag indicating whether or not the field is a case sensitive field.  Only applies to string fields.
     *
     * @return the value
     **/
    public Boolean getIsCaseSensitive() {
        return isCaseSensitive;
    }

    /**
     * Identifies if this column can be used as a grouping field in any grouping command.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isGroupable")
    private final Boolean isGroupable;

    /**
     * Identifies if this column can be used as a grouping field in any grouping command.
     *
     * @return the value
     **/
    public Boolean getIsGroupable() {
        return isGroupable;
    }

    /**
     * Identifies if this column can be used as an expression parameter in any command that accepts querylanguage expressions.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEvaluable")
    private final Boolean isEvaluable;

    /**
     * Identifies if this column can be used as an expression parameter in any command that accepts querylanguage expressions.
     *
     * @return the value
     **/
    public Boolean getIsEvaluable() {
        return isEvaluable;
    }

    /**
     * Identifies if this column should be hidden by default but can be displayed in the UI on demand.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHidden")
    private final Boolean isHidden;

    /**
     * Identifies if this column should be hidden by default but can be displayed in the UI on demand.
     *
     * @return the value
     **/
    public Boolean getIsHidden() {
        return isHidden;
    }

    /**
     * Field denoting column data type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("valueType")
    private final ValueType valueType;

    /**
     * Field denoting column data type.
     *
     * @return the value
     **/
    public ValueType getValueType() {
        return valueType;
    }

    /**
     * Same as displayName unless column renamed in which case this will hold the original display name for the column.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("originalDisplayName")
    private final String originalDisplayName;

    /**
     * Same as displayName unless column renamed in which case this will hold the original display name for the column.
     *
     * @return the value
     **/
    public String getOriginalDisplayName() {
        return originalDisplayName;
    }

    /**
     * Internal identifier for the column.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("internalName")
    private final String internalName;

    /**
     * Internal identifier for the column.
     *
     * @return the value
     **/
    public String getInternalName() {
        return internalName;
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
        sb.append("AbstractColumn(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", subSystem=").append(String.valueOf(this.subSystem));
        sb.append(", values=").append(String.valueOf(this.values));
        sb.append(", isListOfValues=").append(String.valueOf(this.isListOfValues));
        sb.append(", isMultiValued=").append(String.valueOf(this.isMultiValued));
        sb.append(", isCaseSensitive=").append(String.valueOf(this.isCaseSensitive));
        sb.append(", isGroupable=").append(String.valueOf(this.isGroupable));
        sb.append(", isEvaluable=").append(String.valueOf(this.isEvaluable));
        sb.append(", isHidden=").append(String.valueOf(this.isHidden));
        sb.append(", valueType=").append(String.valueOf(this.valueType));
        sb.append(", originalDisplayName=").append(String.valueOf(this.originalDisplayName));
        sb.append(", internalName=").append(String.valueOf(this.internalName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractColumn)) {
            return false;
        }

        AbstractColumn other = (AbstractColumn) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.subSystem, other.subSystem)
                && java.util.Objects.equals(this.values, other.values)
                && java.util.Objects.equals(this.isListOfValues, other.isListOfValues)
                && java.util.Objects.equals(this.isMultiValued, other.isMultiValued)
                && java.util.Objects.equals(this.isCaseSensitive, other.isCaseSensitive)
                && java.util.Objects.equals(this.isGroupable, other.isGroupable)
                && java.util.Objects.equals(this.isEvaluable, other.isEvaluable)
                && java.util.Objects.equals(this.isHidden, other.isHidden)
                && java.util.Objects.equals(this.valueType, other.valueType)
                && java.util.Objects.equals(this.originalDisplayName, other.originalDisplayName)
                && java.util.Objects.equals(this.internalName, other.internalName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.subSystem == null ? 43 : this.subSystem.hashCode());
        result = (result * PRIME) + (this.values == null ? 43 : this.values.hashCode());
        result =
                (result * PRIME)
                        + (this.isListOfValues == null ? 43 : this.isListOfValues.hashCode());
        result =
                (result * PRIME)
                        + (this.isMultiValued == null ? 43 : this.isMultiValued.hashCode());
        result =
                (result * PRIME)
                        + (this.isCaseSensitive == null ? 43 : this.isCaseSensitive.hashCode());
        result = (result * PRIME) + (this.isGroupable == null ? 43 : this.isGroupable.hashCode());
        result = (result * PRIME) + (this.isEvaluable == null ? 43 : this.isEvaluable.hashCode());
        result = (result * PRIME) + (this.isHidden == null ? 43 : this.isHidden.hashCode());
        result = (result * PRIME) + (this.valueType == null ? 43 : this.valueType.hashCode());
        result =
                (result * PRIME)
                        + (this.originalDisplayName == null
                                ? 43
                                : this.originalDisplayName.hashCode());
        result = (result * PRIME) + (this.internalName == null ? 43 : this.internalName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * Column classification when column requires special designation.
     *
     **/
    public enum Type {
        Column("COLUMN"),
        ChartColumn("CHART_COLUMN"),
        ChartDataColumn("CHART_DATA_COLUMN"),
        TimeStatsColumn("TIME_STATS_COLUMN"),
        TimeStatsDataColumn("TIME_STATS_DATA_COLUMN"),
        TimeClusterColumn("TIME_CLUSTER_COLUMN"),
        TimeClusterDataColumn("TIME_CLUSTER_DATA_COLUMN"),
        TableColumn("TABLE_COLUMN"),
        TimeColumn("TIME_COLUMN"),
        TrendColumn("TREND_COLUMN"),
        ClassifyColumn("CLASSIFY_COLUMN"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

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
