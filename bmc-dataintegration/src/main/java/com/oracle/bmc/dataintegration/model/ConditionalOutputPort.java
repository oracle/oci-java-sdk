/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The conditional output port details, used in operators such as split. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ConditionalOutputPort.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "modelType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ConditionalOutputPort extends TypedObject {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configValues")
        private ConfigValues configValues;

        public Builder configValues(ConfigValues configValues) {
            this.configValues = configValues;
            this.__explicitlySet__.add("configValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStatus")
        private Integer objectStatus;

        public Builder objectStatus(Integer objectStatus) {
            this.objectStatus = objectStatus;
            this.__explicitlySet__.add("objectStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** The port details for the data asset.Type. */
        @com.fasterxml.jackson.annotation.JsonProperty("portType")
        private PortType portType;

        /**
         * The port details for the data asset.Type.
         *
         * @param portType the value to set
         * @return this builder
         */
        public Builder portType(PortType portType) {
            this.portType = portType;
            this.__explicitlySet__.add("portType");
            return this;
        }
        /** An array of fields. */
        @com.fasterxml.jackson.annotation.JsonProperty("fields")
        private java.util.List<TypedObject> fields;

        /**
         * An array of fields.
         *
         * @param fields the value to set
         * @return this builder
         */
        public Builder fields(java.util.List<TypedObject> fields) {
            this.fields = fields;
            this.__explicitlySet__.add("fields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("splitCondition")
        private Expression splitCondition;

        public Builder splitCondition(Expression splitCondition) {
            this.splitCondition = splitCondition;
            this.__explicitlySet__.add("splitCondition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConditionalOutputPort build() {
            ConditionalOutputPort model =
                    new ConditionalOutputPort(
                            this.key,
                            this.modelVersion,
                            this.parentRef,
                            this.configValues,
                            this.objectStatus,
                            this.name,
                            this.description,
                            this.portType,
                            this.fields,
                            this.splitCondition);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConditionalOutputPort model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
            }
            if (model.wasPropertyExplicitlySet("configValues")) {
                this.configValues(model.getConfigValues());
            }
            if (model.wasPropertyExplicitlySet("objectStatus")) {
                this.objectStatus(model.getObjectStatus());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("portType")) {
                this.portType(model.getPortType());
            }
            if (model.wasPropertyExplicitlySet("fields")) {
                this.fields(model.getFields());
            }
            if (model.wasPropertyExplicitlySet("splitCondition")) {
                this.splitCondition(model.getSplitCondition());
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

    @Deprecated
    public ConditionalOutputPort(
            String key,
            String modelVersion,
            ParentReference parentRef,
            ConfigValues configValues,
            Integer objectStatus,
            String name,
            String description,
            PortType portType,
            java.util.List<TypedObject> fields,
            Expression splitCondition) {
        super(key, modelVersion, parentRef, configValues, objectStatus, name, description);
        this.portType = portType;
        this.fields = fields;
        this.splitCondition = splitCondition;
    }

    /** The port details for the data asset.Type. */
    public enum PortType implements com.oracle.bmc.http.internal.BmcEnum {
        Data("DATA"),
        Control("CONTROL"),
        Model("MODEL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PortType.class);

        private final String value;
        private static java.util.Map<String, PortType> map;

        static {
            map = new java.util.HashMap<>();
            for (PortType v : PortType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PortType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PortType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PortType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The port details for the data asset.Type. */
    @com.fasterxml.jackson.annotation.JsonProperty("portType")
    private final PortType portType;

    /**
     * The port details for the data asset.Type.
     *
     * @return the value
     */
    public PortType getPortType() {
        return portType;
    }

    /** An array of fields. */
    @com.fasterxml.jackson.annotation.JsonProperty("fields")
    private final java.util.List<TypedObject> fields;

    /**
     * An array of fields.
     *
     * @return the value
     */
    public java.util.List<TypedObject> getFields() {
        return fields;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("splitCondition")
    private final Expression splitCondition;

    public Expression getSplitCondition() {
        return splitCondition;
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
        sb.append("ConditionalOutputPort(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", portType=").append(String.valueOf(this.portType));
        sb.append(", fields=").append(String.valueOf(this.fields));
        sb.append(", splitCondition=").append(String.valueOf(this.splitCondition));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConditionalOutputPort)) {
            return false;
        }

        ConditionalOutputPort other = (ConditionalOutputPort) o;
        return java.util.Objects.equals(this.portType, other.portType)
                && java.util.Objects.equals(this.fields, other.fields)
                && java.util.Objects.equals(this.splitCondition, other.splitCondition)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.portType == null ? 43 : this.portType.hashCode());
        result = (result * PRIME) + (this.fields == null ? 43 : this.fields.hashCode());
        result =
                (result * PRIME)
                        + (this.splitCondition == null ? 43 : this.splitCondition.hashCode());
        return result;
    }
}
