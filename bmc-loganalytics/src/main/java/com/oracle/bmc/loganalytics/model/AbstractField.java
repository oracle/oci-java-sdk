/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Generic field defining all attributes common to all querylanguage fields. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "name",
        defaultImpl = AbstractField.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = FieldsAddRemoveField.class,
            name = "FIELDS"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = FunctionField.class,
            name = "FUNCTION"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = Field.class, name = "FIELD"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = SortField.class, name = "SORT")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class AbstractField extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "isDeclared",
        "originalDisplayNames",
        "internalName",
        "valueType",
        "isGroupable",
        "isDuration",
        "alias",
        "filterQueryString",
        "unitType"
    })
    protected AbstractField(
            String displayName,
            Boolean isDeclared,
            java.util.List<String> originalDisplayNames,
            String internalName,
            ValueType valueType,
            Boolean isGroupable,
            Boolean isDuration,
            String alias,
            String filterQueryString,
            String unitType) {
        super();
        this.displayName = displayName;
        this.isDeclared = isDeclared;
        this.originalDisplayNames = originalDisplayNames;
        this.internalName = internalName;
        this.valueType = valueType;
        this.isGroupable = isGroupable;
        this.isDuration = isDuration;
        this.alias = alias;
        this.filterQueryString = filterQueryString;
        this.unitType = unitType;
    }

    /** Field display name - will be alias if field is renamed by queryStrng. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Field display name - will be alias if field is renamed by queryStrng.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** Field denoting if this is a declaration of the field in the queryString. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDeclared")
    private final Boolean isDeclared;

    /**
     * Field denoting if this is a declaration of the field in the queryString.
     *
     * @return the value
     */
    public Boolean getIsDeclared() {
        return isDeclared;
    }

    /**
     * Same as displayName unless field renamed in which case this will hold the original display
     * names for the field across all renames.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("originalDisplayNames")
    private final java.util.List<String> originalDisplayNames;

    /**
     * Same as displayName unless field renamed in which case this will hold the original display
     * names for the field across all renames.
     *
     * @return the value
     */
    public java.util.List<String> getOriginalDisplayNames() {
        return originalDisplayNames;
    }

    /** Internal identifier for the field. */
    @com.fasterxml.jackson.annotation.JsonProperty("internalName")
    private final String internalName;

    /**
     * Internal identifier for the field.
     *
     * @return the value
     */
    public String getInternalName() {
        return internalName;
    }

    /** Field denoting field data type. */
    @com.fasterxml.jackson.annotation.JsonProperty("valueType")
    private final ValueType valueType;

    /**
     * Field denoting field data type.
     *
     * @return the value
     */
    public ValueType getValueType() {
        return valueType;
    }

    /** Identifies if this field can be used as a grouping field in any grouping command. */
    @com.fasterxml.jackson.annotation.JsonProperty("isGroupable")
    private final Boolean isGroupable;

    /**
     * Identifies if this field can be used as a grouping field in any grouping command.
     *
     * @return the value
     */
    public Boolean getIsGroupable() {
        return isGroupable;
    }

    /** Identifies if this field format is a duration. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDuration")
    private final Boolean isDuration;

    /**
     * Identifies if this field format is a duration.
     *
     * @return the value
     */
    public Boolean getIsDuration() {
        return isDuration;
    }

    /** Alias of field if renamed by queryStrng. */
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    private final String alias;

    /**
     * Alias of field if renamed by queryStrng.
     *
     * @return the value
     */
    public String getAlias() {
        return alias;
    }

    /** Query used to derive this field if specified. */
    @com.fasterxml.jackson.annotation.JsonProperty("filterQueryString")
    private final String filterQueryString;

    /**
     * Query used to derive this field if specified.
     *
     * @return the value
     */
    public String getFilterQueryString() {
        return filterQueryString;
    }

    /** Field denoting field unit type. */
    @com.fasterxml.jackson.annotation.JsonProperty("unitType")
    private final String unitType;

    /**
     * Field denoting field unit type.
     *
     * @return the value
     */
    public String getUnitType() {
        return unitType;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AbstractField(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", isDeclared=").append(String.valueOf(this.isDeclared));
        sb.append(", originalDisplayNames=").append(String.valueOf(this.originalDisplayNames));
        sb.append(", internalName=").append(String.valueOf(this.internalName));
        sb.append(", valueType=").append(String.valueOf(this.valueType));
        sb.append(", isGroupable=").append(String.valueOf(this.isGroupable));
        sb.append(", isDuration=").append(String.valueOf(this.isDuration));
        sb.append(", alias=").append(String.valueOf(this.alias));
        sb.append(", filterQueryString=").append(String.valueOf(this.filterQueryString));
        sb.append(", unitType=").append(String.valueOf(this.unitType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AbstractField)) {
            return false;
        }

        AbstractField other = (AbstractField) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.isDeclared, other.isDeclared)
                && java.util.Objects.equals(this.originalDisplayNames, other.originalDisplayNames)
                && java.util.Objects.equals(this.internalName, other.internalName)
                && java.util.Objects.equals(this.valueType, other.valueType)
                && java.util.Objects.equals(this.isGroupable, other.isGroupable)
                && java.util.Objects.equals(this.isDuration, other.isDuration)
                && java.util.Objects.equals(this.alias, other.alias)
                && java.util.Objects.equals(this.filterQueryString, other.filterQueryString)
                && java.util.Objects.equals(this.unitType, other.unitType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.isDeclared == null ? 43 : this.isDeclared.hashCode());
        result =
                (result * PRIME)
                        + (this.originalDisplayNames == null
                                ? 43
                                : this.originalDisplayNames.hashCode());
        result = (result * PRIME) + (this.internalName == null ? 43 : this.internalName.hashCode());
        result = (result * PRIME) + (this.valueType == null ? 43 : this.valueType.hashCode());
        result = (result * PRIME) + (this.isGroupable == null ? 43 : this.isGroupable.hashCode());
        result = (result * PRIME) + (this.isDuration == null ? 43 : this.isDuration.hashCode());
        result = (result * PRIME) + (this.alias == null ? 43 : this.alias.hashCode());
        result =
                (result * PRIME)
                        + (this.filterQueryString == null ? 43 : this.filterQueryString.hashCode());
        result = (result * PRIME) + (this.unitType == null ? 43 : this.unitType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Field type classification. */
    public enum Name implements com.oracle.bmc.http.internal.BmcEnum {
        Field("FIELD"),
        Fields("FIELDS"),
        Function("FUNCTION"),
        Sort("SORT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Name.class);

        private final String value;
        private static java.util.Map<String, Name> map;

        static {
            map = new java.util.HashMap<>();
            for (Name v : Name.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Name(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Name create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Name', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
}
