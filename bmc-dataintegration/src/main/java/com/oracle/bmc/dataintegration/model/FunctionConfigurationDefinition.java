/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The configuration details of a configurable object. This contains one or more config param
 * definitions. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FunctionConfigurationDefinition.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class FunctionConfigurationDefinition
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "modelType",
        "modelVersion",
        "parentRef",
        "isContained",
        "configParamDefs"
    })
    public FunctionConfigurationDefinition(
            String key,
            ModelType modelType,
            String modelVersion,
            ParentReference parentRef,
            Boolean isContained,
            java.util.Map<String, ConfigParameterDefinition> configParamDefs) {
        super();
        this.key = key;
        this.modelType = modelType;
        this.modelVersion = modelVersion;
        this.parentRef = parentRef;
        this.isContained = isContained;
        this.configParamDefs = configParamDefs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The key of the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The key of the object.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The type of the object. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private ModelType modelType;

        /**
         * The type of the object.
         *
         * @param modelType the value to set
         * @return this builder
         */
        public Builder modelType(ModelType modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }
        /** The model version of an object. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * The model version of an object.
         *
         * @param modelVersion the value to set
         * @return this builder
         */
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
        /** Specifies whether the configuration is contained or not. */
        @com.fasterxml.jackson.annotation.JsonProperty("isContained")
        private Boolean isContained;

        /**
         * Specifies whether the configuration is contained or not.
         *
         * @param isContained the value to set
         * @return this builder
         */
        public Builder isContained(Boolean isContained) {
            this.isContained = isContained;
            this.__explicitlySet__.add("isContained");
            return this;
        }
        /** The parameter configuration details. */
        @com.fasterxml.jackson.annotation.JsonProperty("configParamDefs")
        private java.util.Map<String, ConfigParameterDefinition> configParamDefs;

        /**
         * The parameter configuration details.
         *
         * @param configParamDefs the value to set
         * @return this builder
         */
        public Builder configParamDefs(
                java.util.Map<String, ConfigParameterDefinition> configParamDefs) {
            this.configParamDefs = configParamDefs;
            this.__explicitlySet__.add("configParamDefs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FunctionConfigurationDefinition build() {
            FunctionConfigurationDefinition model =
                    new FunctionConfigurationDefinition(
                            this.key,
                            this.modelType,
                            this.modelVersion,
                            this.parentRef,
                            this.isContained,
                            this.configParamDefs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FunctionConfigurationDefinition model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("modelType")) {
                this.modelType(model.getModelType());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
            }
            if (model.wasPropertyExplicitlySet("isContained")) {
                this.isContained(model.getIsContained());
            }
            if (model.wasPropertyExplicitlySet("configParamDefs")) {
                this.configParamDefs(model.getConfigParamDefs());
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

    /** The key of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The key of the object.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The type of the object. */
    public enum ModelType implements com.oracle.bmc.http.internal.BmcEnum {
        ConfigDefinition("CONFIG_DEFINITION"),

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
    /** The type of the object. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final ModelType modelType;

    /**
     * The type of the object.
     *
     * @return the value
     */
    public ModelType getModelType() {
        return modelType;
    }

    /** The model version of an object. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * The model version of an object.
     *
     * @return the value
     */
    public String getModelVersion() {
        return modelVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    private final ParentReference parentRef;

    public ParentReference getParentRef() {
        return parentRef;
    }

    /** Specifies whether the configuration is contained or not. */
    @com.fasterxml.jackson.annotation.JsonProperty("isContained")
    private final Boolean isContained;

    /**
     * Specifies whether the configuration is contained or not.
     *
     * @return the value
     */
    public Boolean getIsContained() {
        return isContained;
    }

    /** The parameter configuration details. */
    @com.fasterxml.jackson.annotation.JsonProperty("configParamDefs")
    private final java.util.Map<String, ConfigParameterDefinition> configParamDefs;

    /**
     * The parameter configuration details.
     *
     * @return the value
     */
    public java.util.Map<String, ConfigParameterDefinition> getConfigParamDefs() {
        return configParamDefs;
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
        sb.append("FunctionConfigurationDefinition(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", modelType=").append(String.valueOf(this.modelType));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", isContained=").append(String.valueOf(this.isContained));
        sb.append(", configParamDefs=").append(String.valueOf(this.configParamDefs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FunctionConfigurationDefinition)) {
            return false;
        }

        FunctionConfigurationDefinition other = (FunctionConfigurationDefinition) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.isContained, other.isContained)
                && java.util.Objects.equals(this.configParamDefs, other.configParamDefs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.modelType == null ? 43 : this.modelType.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result = (result * PRIME) + (this.isContained == null ? 43 : this.isContained.hashCode());
        result =
                (result * PRIME)
                        + (this.configParamDefs == null ? 43 : this.configParamDefs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
