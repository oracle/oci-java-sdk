/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * A field map is a way to map a source row shape to a target row shape that may be different. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType",
        defaultImpl = FieldMap.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RuleBasedFieldMap.class,
            name = "RULE_BASED_FIELD_MAP"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = RuleBasedEntityMap.class,
            name = "RULE_BASED_ENTITY_MAP"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = NamedEntityMap.class,
            name = "NAMED_ENTITY_MAP"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DirectFieldMap.class,
            name = "DIRECT_FIELD_MAP"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = CompositeFieldMap.class,
            name = "COMPOSITE_FIELD_MAP"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = ConditionalCompositeFieldMap.class,
            name = "CONDITIONAL_COMPOSITE_FIELD_MAP"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = DirectNamedFieldMap.class,
            name = "DIRECT_NAMED_FIELD_MAP")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class FieldMap extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"description"})
    protected FieldMap(String description) {
        super();
        this.description = description;
    }

    /** Detailed description for the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Detailed description for the object.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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
        sb.append("FieldMap(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FieldMap)) {
            return false;
        }

        FieldMap other = (FieldMap) o;
        return java.util.Objects.equals(this.description, other.description) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The model type for the field map. */
    public enum ModelType implements com.oracle.bmc.http.internal.BmcEnum {
        DirectNamedFieldMap("DIRECT_NAMED_FIELD_MAP"),
        CompositeFieldMap("COMPOSITE_FIELD_MAP"),
        DirectFieldMap("DIRECT_FIELD_MAP"),
        RuleBasedFieldMap("RULE_BASED_FIELD_MAP"),
        ConditionalCompositeFieldMap("CONDITIONAL_COMPOSITE_FIELD_MAP"),
        NamedEntityMap("NAMED_ENTITY_MAP"),
        RuleBasedEntityMap("RULE_BASED_ENTITY_MAP"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ModelType.class);

        private final String value;
        private static java.util.Map<String, ModelType> map;

        static {
            map = new java.util.HashMap<>();
            for (ModelType v : ModelType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ModelType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ModelType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ModelType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
