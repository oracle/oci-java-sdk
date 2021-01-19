/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * Generic field defining all attributes common to all querylanguage fields.
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
    property = "name",
    defaultImpl = AbstractField.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = FieldsAddRemoveField.class,
        name = "FIELDS"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = FunctionField.class,
        name = "FUNCTION"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = Field.class, name = "FIELD"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = SortField.class, name = "SORT")
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AbstractField {

    /**
     * Field display name - will be alias if field is renamed by queryStrng.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * Field denoting if this is a declaration of the field in the queryString.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDeclared")
    Boolean isDeclared;

    /**
     * Same as displayName unless field renamed in which case this will hold the original display names for the field
     * across all renames.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("originalDisplayNames")
    java.util.List<String> originalDisplayNames;

    /**
     * Internal identifier for the field.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("internalName")
    String internalName;

    /**
     * Field denoting field data type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("valueType")
    ValueType valueType;

    /**
     * Identifies if this field can be used as a grouping field in any grouping command.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isGroupable")
    Boolean isGroupable;

    /**
     * Identifies if this field format is a duration.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDuration")
    Boolean isDuration;

    /**
     * Alias of field if renamed by queryStrng.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("alias")
    String alias;

    /**
     * Query used to derive this field if specified.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("filterQueryString")
    String filterQueryString;

    /**
     * Field denoting field unit type.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("unitType")
    String unitType;

    /**
     * Field type classification.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Name {
        Field("FIELD"),
        Fields("FIELDS"),
        Function("FUNCTION"),
        Sort("SORT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
