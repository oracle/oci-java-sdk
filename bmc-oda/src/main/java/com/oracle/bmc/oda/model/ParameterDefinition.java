/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * A parameter to a resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ParameterDefinition.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ParameterDefinition
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "type",
        "description",
        "isRequired",
        "isSensitive",
        "defaultValue",
        "minLength",
        "maxLength",
        "pattern",
        "direction",
        "uiPlacementHint",
        "resourceTypeMetadata"
    })
    public ParameterDefinition(
            String name,
            Type type,
            String description,
            Boolean isRequired,
            Boolean isSensitive,
            String defaultValue,
            Integer minLength,
            Integer maxLength,
            String pattern,
            Direction direction,
            String uiPlacementHint,
            Object resourceTypeMetadata) {
        super();
        this.name = name;
        this.type = type;
        this.description = description;
        this.isRequired = isRequired;
        this.isSensitive = isSensitive;
        this.defaultValue = defaultValue;
        this.minLength = minLength;
        this.maxLength = maxLength;
        this.pattern = pattern;
        this.direction = direction;
        this.uiPlacementHint = uiPlacementHint;
        this.resourceTypeMetadata = resourceTypeMetadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the parameter */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the parameter
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Enumerated parameter type. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Enumerated parameter type.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** Description of the parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the parameter.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Is this parameter required. Ignored for parameters with direction = OUTPUT. */
        @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
        private Boolean isRequired;

        /**
         * Is this parameter required. Ignored for parameters with direction = OUTPUT.
         *
         * @param isRequired the value to set
         * @return this builder
         */
        public Builder isRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            this.__explicitlySet__.add("isRequired");
            return this;
        }
        /**
         * Is the data for this parameter sensitive (e.g. should the data be hidden in UI, encrypted
         * if stored, etc.)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSensitive")
        private Boolean isSensitive;

        /**
         * Is the data for this parameter sensitive (e.g. should the data be hidden in UI, encrypted
         * if stored, etc.)
         *
         * @param isSensitive the value to set
         * @return this builder
         */
        public Builder isSensitive(Boolean isSensitive) {
            this.isSensitive = isSensitive;
            this.__explicitlySet__.add("isSensitive");
            return this;
        }
        /** Default value for the parameter. */
        @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
        private String defaultValue;

        /**
         * Default value for the parameter.
         *
         * @param defaultValue the value to set
         * @return this builder
         */
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            this.__explicitlySet__.add("defaultValue");
            return this;
        }
        /** Used for character string types such as STRING to constrain the length of the value */
        @com.fasterxml.jackson.annotation.JsonProperty("minLength")
        private Integer minLength;

        /**
         * Used for character string types such as STRING to constrain the length of the value
         *
         * @param minLength the value to set
         * @return this builder
         */
        public Builder minLength(Integer minLength) {
            this.minLength = minLength;
            this.__explicitlySet__.add("minLength");
            return this;
        }
        /** Used for character string types such as STRING to constrain the length of the value */
        @com.fasterxml.jackson.annotation.JsonProperty("maxLength")
        private Integer maxLength;

        /**
         * Used for character string types such as STRING to constrain the length of the value
         *
         * @param maxLength the value to set
         * @return this builder
         */
        public Builder maxLength(Integer maxLength) {
            this.maxLength = maxLength;
            this.__explicitlySet__.add("maxLength");
            return this;
        }
        /** Regular expression used to validate the value of a string type such as STRING */
        @com.fasterxml.jackson.annotation.JsonProperty("pattern")
        private String pattern;

        /**
         * Regular expression used to validate the value of a string type such as STRING
         *
         * @param pattern the value to set
         * @return this builder
         */
        public Builder pattern(String pattern) {
            this.pattern = pattern;
            this.__explicitlySet__.add("pattern");
            return this;
        }
        /** Is this parameter an input parameter, output parameter, or both? */
        @com.fasterxml.jackson.annotation.JsonProperty("direction")
        private Direction direction;

        /**
         * Is this parameter an input parameter, output parameter, or both?
         *
         * @param direction the value to set
         * @return this builder
         */
        public Builder direction(Direction direction) {
            this.direction = direction;
            this.__explicitlySet__.add("direction");
            return this;
        }
        /**
         * A forward-slash-delimited 'path' in an imaginary hierarchy, at which this parameter's UI
         * widgets should be placed
         */
        @com.fasterxml.jackson.annotation.JsonProperty("uiPlacementHint")
        private String uiPlacementHint;

        /**
         * A forward-slash-delimited 'path' in an imaginary hierarchy, at which this parameter's UI
         * widgets should be placed
         *
         * @param uiPlacementHint the value to set
         * @return this builder
         */
        public Builder uiPlacementHint(String uiPlacementHint) {
            this.uiPlacementHint = uiPlacementHint;
            this.__explicitlySet__.add("uiPlacementHint");
            return this;
        }
        /**
         * Any configuration needed to help the resource type process this parameter (e.g. link to
         * manifest, etc.).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceTypeMetadata")
        private Object resourceTypeMetadata;

        /**
         * Any configuration needed to help the resource type process this parameter (e.g. link to
         * manifest, etc.).
         *
         * @param resourceTypeMetadata the value to set
         * @return this builder
         */
        public Builder resourceTypeMetadata(Object resourceTypeMetadata) {
            this.resourceTypeMetadata = resourceTypeMetadata;
            this.__explicitlySet__.add("resourceTypeMetadata");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ParameterDefinition build() {
            ParameterDefinition model =
                    new ParameterDefinition(
                            this.name,
                            this.type,
                            this.description,
                            this.isRequired,
                            this.isSensitive,
                            this.defaultValue,
                            this.minLength,
                            this.maxLength,
                            this.pattern,
                            this.direction,
                            this.uiPlacementHint,
                            this.resourceTypeMetadata);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ParameterDefinition model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isRequired")) {
                this.isRequired(model.getIsRequired());
            }
            if (model.wasPropertyExplicitlySet("isSensitive")) {
                this.isSensitive(model.getIsSensitive());
            }
            if (model.wasPropertyExplicitlySet("defaultValue")) {
                this.defaultValue(model.getDefaultValue());
            }
            if (model.wasPropertyExplicitlySet("minLength")) {
                this.minLength(model.getMinLength());
            }
            if (model.wasPropertyExplicitlySet("maxLength")) {
                this.maxLength(model.getMaxLength());
            }
            if (model.wasPropertyExplicitlySet("pattern")) {
                this.pattern(model.getPattern());
            }
            if (model.wasPropertyExplicitlySet("direction")) {
                this.direction(model.getDirection());
            }
            if (model.wasPropertyExplicitlySet("uiPlacementHint")) {
                this.uiPlacementHint(model.getUiPlacementHint());
            }
            if (model.wasPropertyExplicitlySet("resourceTypeMetadata")) {
                this.resourceTypeMetadata(model.getResourceTypeMetadata());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The name of the parameter */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the parameter
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Enumerated parameter type. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        String("STRING"),
        Uri("URI"),
        Url("URL"),
        Number("NUMBER"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
    /** Enumerated parameter type. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Enumerated parameter type.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /** Description of the parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the parameter.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Is this parameter required. Ignored for parameters with direction = OUTPUT. */
    @com.fasterxml.jackson.annotation.JsonProperty("isRequired")
    private final Boolean isRequired;

    /**
     * Is this parameter required. Ignored for parameters with direction = OUTPUT.
     *
     * @return the value
     */
    public Boolean getIsRequired() {
        return isRequired;
    }

    /**
     * Is the data for this parameter sensitive (e.g. should the data be hidden in UI, encrypted if
     * stored, etc.)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSensitive")
    private final Boolean isSensitive;

    /**
     * Is the data for this parameter sensitive (e.g. should the data be hidden in UI, encrypted if
     * stored, etc.)
     *
     * @return the value
     */
    public Boolean getIsSensitive() {
        return isSensitive;
    }

    /** Default value for the parameter. */
    @com.fasterxml.jackson.annotation.JsonProperty("defaultValue")
    private final String defaultValue;

    /**
     * Default value for the parameter.
     *
     * @return the value
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    /** Used for character string types such as STRING to constrain the length of the value */
    @com.fasterxml.jackson.annotation.JsonProperty("minLength")
    private final Integer minLength;

    /**
     * Used for character string types such as STRING to constrain the length of the value
     *
     * @return the value
     */
    public Integer getMinLength() {
        return minLength;
    }

    /** Used for character string types such as STRING to constrain the length of the value */
    @com.fasterxml.jackson.annotation.JsonProperty("maxLength")
    private final Integer maxLength;

    /**
     * Used for character string types such as STRING to constrain the length of the value
     *
     * @return the value
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    /** Regular expression used to validate the value of a string type such as STRING */
    @com.fasterxml.jackson.annotation.JsonProperty("pattern")
    private final String pattern;

    /**
     * Regular expression used to validate the value of a string type such as STRING
     *
     * @return the value
     */
    public String getPattern() {
        return pattern;
    }

    /** Is this parameter an input parameter, output parameter, or both? */
    public enum Direction implements com.oracle.bmc.http.internal.BmcEnum {
        Input("INPUT"),
        Output("OUTPUT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Direction.class);

        private final String value;
        private static java.util.Map<String, Direction> map;

        static {
            map = new java.util.HashMap<>();
            for (Direction v : Direction.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Direction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Direction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Direction', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Is this parameter an input parameter, output parameter, or both? */
    @com.fasterxml.jackson.annotation.JsonProperty("direction")
    private final Direction direction;

    /**
     * Is this parameter an input parameter, output parameter, or both?
     *
     * @return the value
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * A forward-slash-delimited 'path' in an imaginary hierarchy, at which this parameter's UI
     * widgets should be placed
     */
    @com.fasterxml.jackson.annotation.JsonProperty("uiPlacementHint")
    private final String uiPlacementHint;

    /**
     * A forward-slash-delimited 'path' in an imaginary hierarchy, at which this parameter's UI
     * widgets should be placed
     *
     * @return the value
     */
    public String getUiPlacementHint() {
        return uiPlacementHint;
    }

    /**
     * Any configuration needed to help the resource type process this parameter (e.g. link to
     * manifest, etc.).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceTypeMetadata")
    private final Object resourceTypeMetadata;

    /**
     * Any configuration needed to help the resource type process this parameter (e.g. link to
     * manifest, etc.).
     *
     * @return the value
     */
    public Object getResourceTypeMetadata() {
        return resourceTypeMetadata;
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
        sb.append("ParameterDefinition(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isRequired=").append(String.valueOf(this.isRequired));
        sb.append(", isSensitive=").append(String.valueOf(this.isSensitive));
        sb.append(", defaultValue=").append(String.valueOf(this.defaultValue));
        sb.append(", minLength=").append(String.valueOf(this.minLength));
        sb.append(", maxLength=").append(String.valueOf(this.maxLength));
        sb.append(", pattern=").append(String.valueOf(this.pattern));
        sb.append(", direction=").append(String.valueOf(this.direction));
        sb.append(", uiPlacementHint=").append(String.valueOf(this.uiPlacementHint));
        sb.append(", resourceTypeMetadata=").append(String.valueOf(this.resourceTypeMetadata));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ParameterDefinition)) {
            return false;
        }

        ParameterDefinition other = (ParameterDefinition) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isRequired, other.isRequired)
                && java.util.Objects.equals(this.isSensitive, other.isSensitive)
                && java.util.Objects.equals(this.defaultValue, other.defaultValue)
                && java.util.Objects.equals(this.minLength, other.minLength)
                && java.util.Objects.equals(this.maxLength, other.maxLength)
                && java.util.Objects.equals(this.pattern, other.pattern)
                && java.util.Objects.equals(this.direction, other.direction)
                && java.util.Objects.equals(this.uiPlacementHint, other.uiPlacementHint)
                && java.util.Objects.equals(this.resourceTypeMetadata, other.resourceTypeMetadata)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.isRequired == null ? 43 : this.isRequired.hashCode());
        result = (result * PRIME) + (this.isSensitive == null ? 43 : this.isSensitive.hashCode());
        result = (result * PRIME) + (this.defaultValue == null ? 43 : this.defaultValue.hashCode());
        result = (result * PRIME) + (this.minLength == null ? 43 : this.minLength.hashCode());
        result = (result * PRIME) + (this.maxLength == null ? 43 : this.maxLength.hashCode());
        result = (result * PRIME) + (this.pattern == null ? 43 : this.pattern.hashCode());
        result = (result * PRIME) + (this.direction == null ? 43 : this.direction.hashCode());
        result =
                (result * PRIME)
                        + (this.uiPlacementHint == null ? 43 : this.uiPlacementHint.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceTypeMetadata == null
                                ? 43
                                : this.resourceTypeMetadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
