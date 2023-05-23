/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.logging.model;

/**
 * Parameters that a resource category supports.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Parameter.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Parameter extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "displayName", "type", "rqsType", "pattern"})
    public Parameter(String name, String displayName, Type type, String rqsType, String pattern) {
        super();
        this.name = name;
        this.displayName = displayName;
        this.type = type;
        this.rqsType = rqsType;
        this.pattern = pattern;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Parameter name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Parameter name.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The user-friendly display name. This must be unique within the enclosing resource,
         * and it's changeable. Avoid entering confidential information.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly display name. This must be unique within the enclosing resource,
         * and it's changeable. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Parameter type.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Parameter type.
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * Parameter rqsType if applicable.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rqsType")
        private String rqsType;

        /**
         * Parameter rqsType if applicable.
         * @param rqsType the value to set
         * @return this builder
         **/
        public Builder rqsType(String rqsType) {
            this.rqsType = rqsType;
            this.__explicitlySet__.add("rqsType");
            return this;
        }
        /**
         * Java regex pattern to validate a parameter value.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("pattern")
        private String pattern;

        /**
         * Java regex pattern to validate a parameter value.
         * @param pattern the value to set
         * @return this builder
         **/
        public Builder pattern(String pattern) {
            this.pattern = pattern;
            this.__explicitlySet__.add("pattern");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Parameter build() {
            Parameter model =
                    new Parameter(
                            this.name, this.displayName, this.type, this.rqsType, this.pattern);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Parameter model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("rqsType")) {
                this.rqsType(model.getRqsType());
            }
            if (model.wasPropertyExplicitlySet("pattern")) {
                this.pattern(model.getPattern());
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
     * Parameter name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Parameter name.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The user-friendly display name. This must be unique within the enclosing resource,
     * and it's changeable. Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly display name. This must be unique within the enclosing resource,
     * and it's changeable. Avoid entering confidential information.
     *
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Parameter type.
     **/
    public enum Type {
        Integer("integer"),
        String("string"),
        Boolean("boolean"),
        EnumString("ENUM_STRING"),
        RqsFilter("RQS_FILTER"),

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
     * Parameter type.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Parameter type.
     * @return the value
     **/
    public Type getType() {
        return type;
    }

    /**
     * Parameter rqsType if applicable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rqsType")
    private final String rqsType;

    /**
     * Parameter rqsType if applicable.
     * @return the value
     **/
    public String getRqsType() {
        return rqsType;
    }

    /**
     * Java regex pattern to validate a parameter value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("pattern")
    private final String pattern;

    /**
     * Java regex pattern to validate a parameter value.
     * @return the value
     **/
    public String getPattern() {
        return pattern;
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
        sb.append("Parameter(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", rqsType=").append(String.valueOf(this.rqsType));
        sb.append(", pattern=").append(String.valueOf(this.pattern));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Parameter)) {
            return false;
        }

        Parameter other = (Parameter) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.rqsType, other.rqsType)
                && java.util.Objects.equals(this.pattern, other.pattern)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.rqsType == null ? 43 : this.rqsType.hashCode());
        result = (result * PRIME) + (this.pattern == null ? 43 : this.pattern.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
