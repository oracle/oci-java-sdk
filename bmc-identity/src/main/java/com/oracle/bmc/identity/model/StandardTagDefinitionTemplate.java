/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * The template of the tag definition. This object includes necessary details to create the provided standard tag definition.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = StandardTagDefinitionTemplate.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StandardTagDefinitionTemplate
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "description",
        "tagDefinitionName",
        "type",
        "possibleValues",
        "isCostTracking",
        "enumMutability"
    })
    public StandardTagDefinitionTemplate(
            String description,
            String tagDefinitionName,
            Type type,
            java.util.List<String> possibleValues,
            Boolean isCostTracking,
            EnumMutability enumMutability) {
        super();
        this.description = description;
        this.tagDefinitionName = tagDefinitionName;
        this.type = type;
        this.possibleValues = possibleValues;
        this.isCostTracking = isCostTracking;
        this.enumMutability = enumMutability;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The default description of the tag namespace that users can use to create the tag definition
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The default description of the tag namespace that users can use to create the tag definition
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The name of this standard tag definition
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tagDefinitionName")
        private String tagDefinitionName;

        /**
         * The name of this standard tag definition
         * @param tagDefinitionName the value to set
         * @return this builder
         **/
        public Builder tagDefinitionName(String tagDefinitionName) {
            this.tagDefinitionName = tagDefinitionName;
            this.__explicitlySet__.add("tagDefinitionName");
            return this;
        }
        /**
         * The type of tag definition. Enum or string.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * The type of tag definition. Enum or string.
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * List of possible values. An optional parameter that will be present if the type of definition is enum.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("possibleValues")
        private java.util.List<String> possibleValues;

        /**
         * List of possible values. An optional parameter that will be present if the type of definition is enum.
         * @param possibleValues the value to set
         * @return this builder
         **/
        public Builder possibleValues(java.util.List<String> possibleValues) {
            this.possibleValues = possibleValues;
            this.__explicitlySet__.add("possibleValues");
            return this;
        }
        /**
         * Is the tag a cost tracking tag. Default will be false as cost tracking tags have been deprecated
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isCostTracking")
        private Boolean isCostTracking;

        /**
         * Is the tag a cost tracking tag. Default will be false as cost tracking tags have been deprecated
         * @param isCostTracking the value to set
         * @return this builder
         **/
        public Builder isCostTracking(Boolean isCostTracking) {
            this.isCostTracking = isCostTracking;
            this.__explicitlySet__.add("isCostTracking");
            return this;
        }
        /**
         * The mutability of the possible values list for enum tags. This will default to IMMUTABLE for string value tags
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enumMutability")
        private EnumMutability enumMutability;

        /**
         * The mutability of the possible values list for enum tags. This will default to IMMUTABLE for string value tags
         * @param enumMutability the value to set
         * @return this builder
         **/
        public Builder enumMutability(EnumMutability enumMutability) {
            this.enumMutability = enumMutability;
            this.__explicitlySet__.add("enumMutability");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StandardTagDefinitionTemplate build() {
            StandardTagDefinitionTemplate model =
                    new StandardTagDefinitionTemplate(
                            this.description,
                            this.tagDefinitionName,
                            this.type,
                            this.possibleValues,
                            this.isCostTracking,
                            this.enumMutability);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StandardTagDefinitionTemplate model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("tagDefinitionName")) {
                this.tagDefinitionName(model.getTagDefinitionName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("possibleValues")) {
                this.possibleValues(model.getPossibleValues());
            }
            if (model.wasPropertyExplicitlySet("isCostTracking")) {
                this.isCostTracking(model.getIsCostTracking());
            }
            if (model.wasPropertyExplicitlySet("enumMutability")) {
                this.enumMutability(model.getEnumMutability());
            }
            return this;
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

    /**
     * The default description of the tag namespace that users can use to create the tag definition
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The default description of the tag namespace that users can use to create the tag definition
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * The name of this standard tag definition
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tagDefinitionName")
    private final String tagDefinitionName;

    /**
     * The name of this standard tag definition
     * @return the value
     **/
    public String getTagDefinitionName() {
        return tagDefinitionName;
    }

    /**
     * The type of tag definition. Enum or string.
     **/
    public enum Type {
        Enum("ENUM"),
        String("STRING"),

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
    /**
     * The type of tag definition. Enum or string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * The type of tag definition. Enum or string.
     * @return the value
     **/
    public Type getType() {
        return type;
    }

    /**
     * List of possible values. An optional parameter that will be present if the type of definition is enum.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("possibleValues")
    private final java.util.List<String> possibleValues;

    /**
     * List of possible values. An optional parameter that will be present if the type of definition is enum.
     * @return the value
     **/
    public java.util.List<String> getPossibleValues() {
        return possibleValues;
    }

    /**
     * Is the tag a cost tracking tag. Default will be false as cost tracking tags have been deprecated
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCostTracking")
    private final Boolean isCostTracking;

    /**
     * Is the tag a cost tracking tag. Default will be false as cost tracking tags have been deprecated
     * @return the value
     **/
    public Boolean getIsCostTracking() {
        return isCostTracking;
    }

    /**
     * The mutability of the possible values list for enum tags. This will default to IMMUTABLE for string value tags
     **/
    public enum EnumMutability {
        Immutable("IMMUTABLE"),
        Mutable("MUTABLE"),
        Appendable("APPENDABLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EnumMutability.class);

        private final String value;
        private static java.util.Map<String, EnumMutability> map;

        static {
            map = new java.util.HashMap<>();
            for (EnumMutability v : EnumMutability.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EnumMutability(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EnumMutability create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EnumMutability', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The mutability of the possible values list for enum tags. This will default to IMMUTABLE for string value tags
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enumMutability")
    private final EnumMutability enumMutability;

    /**
     * The mutability of the possible values list for enum tags. This will default to IMMUTABLE for string value tags
     * @return the value
     **/
    public EnumMutability getEnumMutability() {
        return enumMutability;
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
        sb.append("StandardTagDefinitionTemplate(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(", tagDefinitionName=").append(String.valueOf(this.tagDefinitionName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", possibleValues=").append(String.valueOf(this.possibleValues));
        sb.append(", isCostTracking=").append(String.valueOf(this.isCostTracking));
        sb.append(", enumMutability=").append(String.valueOf(this.enumMutability));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StandardTagDefinitionTemplate)) {
            return false;
        }

        StandardTagDefinitionTemplate other = (StandardTagDefinitionTemplate) o;
        return java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.tagDefinitionName, other.tagDefinitionName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.possibleValues, other.possibleValues)
                && java.util.Objects.equals(this.isCostTracking, other.isCostTracking)
                && java.util.Objects.equals(this.enumMutability, other.enumMutability)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.tagDefinitionName == null ? 43 : this.tagDefinitionName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.possibleValues == null ? 43 : this.possibleValues.hashCode());
        result =
                (result * PRIME)
                        + (this.isCostTracking == null ? 43 : this.isCostTracking.hashCode());
        result =
                (result * PRIME)
                        + (this.enumMutability == null ? 43 : this.enumMutability.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
