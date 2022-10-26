/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information about the OCI Function. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OciFunction.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class OciFunction extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "functionId",
        "regionId",
        "fnConfigDefinition",
        "inputShape",
        "outputShape",
        "modelType",
        "key",
        "parentRef",
        "modelVersion",
        "objectVersion",
        "payloadFormat",
        "fnConfigDef"
    })
    public OciFunction(
            String functionId,
            String regionId,
            ConfigDefinition fnConfigDefinition,
            Shape inputShape,
            Shape outputShape,
            ModelType modelType,
            String key,
            ParentReference parentRef,
            String modelVersion,
            Integer objectVersion,
            PayloadFormat payloadFormat,
            FunctionConfigurationDefinition fnConfigDef) {
        super();
        this.functionId = functionId;
        this.regionId = regionId;
        this.fnConfigDefinition = fnConfigDefinition;
        this.inputShape = inputShape;
        this.outputShape = outputShape;
        this.modelType = modelType;
        this.key = key;
        this.parentRef = parentRef;
        this.modelVersion = modelVersion;
        this.objectVersion = objectVersion;
        this.payloadFormat = payloadFormat;
        this.fnConfigDef = fnConfigDef;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Ocid of the OCI Function. */
        @com.fasterxml.jackson.annotation.JsonProperty("functionId")
        private String functionId;

        /**
         * Ocid of the OCI Function.
         *
         * @param functionId the value to set
         * @return this builder
         */
        public Builder functionId(String functionId) {
            this.functionId = functionId;
            this.__explicitlySet__.add("functionId");
            return this;
        }
        /** Region where the OCI Function is deployed. */
        @com.fasterxml.jackson.annotation.JsonProperty("regionId")
        private String regionId;

        /**
         * Region where the OCI Function is deployed.
         *
         * @param regionId the value to set
         * @return this builder
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            this.__explicitlySet__.add("regionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fnConfigDefinition")
        private ConfigDefinition fnConfigDefinition;

        public Builder fnConfigDefinition(ConfigDefinition fnConfigDefinition) {
            this.fnConfigDefinition = fnConfigDefinition;
            this.__explicitlySet__.add("fnConfigDefinition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inputShape")
        private Shape inputShape;

        public Builder inputShape(Shape inputShape) {
            this.inputShape = inputShape;
            this.__explicitlySet__.add("inputShape");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("outputShape")
        private Shape outputShape;

        public Builder outputShape(Shape outputShape) {
            this.outputShape = outputShape;
            this.__explicitlySet__.add("outputShape");
            return this;
        }
        /** The type of the OCI Function object. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelType")
        private ModelType modelType;

        /**
         * The type of the OCI Function object.
         *
         * @param modelType the value to set
         * @return this builder
         */
        public Builder modelType(ModelType modelType) {
            this.modelType = modelType;
            this.__explicitlySet__.add("modelType");
            return this;
        }
        /**
         * The key identifying the OCI Function operator object, use this to identiy this instance
         * within the dataflow.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The key identifying the OCI Function operator object, use this to identiy this instance
         * within the dataflow.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
        private ParentReference parentRef;

        public Builder parentRef(ParentReference parentRef) {
            this.parentRef = parentRef;
            this.__explicitlySet__.add("parentRef");
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
        /** The version of the object that is used to track changes in the object instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
        private Integer objectVersion;

        /**
         * The version of the object that is used to track changes in the object instance.
         *
         * @param objectVersion the value to set
         * @return this builder
         */
        public Builder objectVersion(Integer objectVersion) {
            this.objectVersion = objectVersion;
            this.__explicitlySet__.add("objectVersion");
            return this;
        }
        /** The OCI Function payload format. */
        @com.fasterxml.jackson.annotation.JsonProperty("payloadFormat")
        private PayloadFormat payloadFormat;

        /**
         * The OCI Function payload format.
         *
         * @param payloadFormat the value to set
         * @return this builder
         */
        public Builder payloadFormat(PayloadFormat payloadFormat) {
            this.payloadFormat = payloadFormat;
            this.__explicitlySet__.add("payloadFormat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fnConfigDef")
        private FunctionConfigurationDefinition fnConfigDef;

        public Builder fnConfigDef(FunctionConfigurationDefinition fnConfigDef) {
            this.fnConfigDef = fnConfigDef;
            this.__explicitlySet__.add("fnConfigDef");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OciFunction build() {
            OciFunction model =
                    new OciFunction(
                            this.functionId,
                            this.regionId,
                            this.fnConfigDefinition,
                            this.inputShape,
                            this.outputShape,
                            this.modelType,
                            this.key,
                            this.parentRef,
                            this.modelVersion,
                            this.objectVersion,
                            this.payloadFormat,
                            this.fnConfigDef);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OciFunction model) {
            if (model.wasPropertyExplicitlySet("functionId")) {
                this.functionId(model.getFunctionId());
            }
            if (model.wasPropertyExplicitlySet("regionId")) {
                this.regionId(model.getRegionId());
            }
            if (model.wasPropertyExplicitlySet("fnConfigDefinition")) {
                this.fnConfigDefinition(model.getFnConfigDefinition());
            }
            if (model.wasPropertyExplicitlySet("inputShape")) {
                this.inputShape(model.getInputShape());
            }
            if (model.wasPropertyExplicitlySet("outputShape")) {
                this.outputShape(model.getOutputShape());
            }
            if (model.wasPropertyExplicitlySet("modelType")) {
                this.modelType(model.getModelType());
            }
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("parentRef")) {
                this.parentRef(model.getParentRef());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("objectVersion")) {
                this.objectVersion(model.getObjectVersion());
            }
            if (model.wasPropertyExplicitlySet("payloadFormat")) {
                this.payloadFormat(model.getPayloadFormat());
            }
            if (model.wasPropertyExplicitlySet("fnConfigDef")) {
                this.fnConfigDef(model.getFnConfigDef());
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

    /** Ocid of the OCI Function. */
    @com.fasterxml.jackson.annotation.JsonProperty("functionId")
    private final String functionId;

    /**
     * Ocid of the OCI Function.
     *
     * @return the value
     */
    public String getFunctionId() {
        return functionId;
    }

    /** Region where the OCI Function is deployed. */
    @com.fasterxml.jackson.annotation.JsonProperty("regionId")
    private final String regionId;

    /**
     * Region where the OCI Function is deployed.
     *
     * @return the value
     */
    public String getRegionId() {
        return regionId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fnConfigDefinition")
    private final ConfigDefinition fnConfigDefinition;

    public ConfigDefinition getFnConfigDefinition() {
        return fnConfigDefinition;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("inputShape")
    private final Shape inputShape;

    public Shape getInputShape() {
        return inputShape;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("outputShape")
    private final Shape outputShape;

    public Shape getOutputShape() {
        return outputShape;
    }

    /** The type of the OCI Function object. */
    public enum ModelType implements com.oracle.bmc.http.internal.BmcEnum {
        OciFunction("OCI_FUNCTION"),

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
    /** The type of the OCI Function object. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelType")
    private final ModelType modelType;

    /**
     * The type of the OCI Function object.
     *
     * @return the value
     */
    public ModelType getModelType() {
        return modelType;
    }

    /**
     * The key identifying the OCI Function operator object, use this to identiy this instance
     * within the dataflow.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The key identifying the OCI Function operator object, use this to identiy this instance
     * within the dataflow.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("parentRef")
    private final ParentReference parentRef;

    public ParentReference getParentRef() {
        return parentRef;
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

    /** The version of the object that is used to track changes in the object instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectVersion")
    private final Integer objectVersion;

    /**
     * The version of the object that is used to track changes in the object instance.
     *
     * @return the value
     */
    public Integer getObjectVersion() {
        return objectVersion;
    }

    /** The OCI Function payload format. */
    public enum PayloadFormat implements com.oracle.bmc.http.internal.BmcEnum {
        Json("JSON"),
        Avro("AVRO"),
        Jsonbytes("JSONBYTES"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PayloadFormat.class);

        private final String value;
        private static java.util.Map<String, PayloadFormat> map;

        static {
            map = new java.util.HashMap<>();
            for (PayloadFormat v : PayloadFormat.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PayloadFormat(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PayloadFormat create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PayloadFormat', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The OCI Function payload format. */
    @com.fasterxml.jackson.annotation.JsonProperty("payloadFormat")
    private final PayloadFormat payloadFormat;

    /**
     * The OCI Function payload format.
     *
     * @return the value
     */
    public PayloadFormat getPayloadFormat() {
        return payloadFormat;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("fnConfigDef")
    private final FunctionConfigurationDefinition fnConfigDef;

    public FunctionConfigurationDefinition getFnConfigDef() {
        return fnConfigDef;
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
        sb.append("OciFunction(");
        sb.append("super=").append(super.toString());
        sb.append("functionId=").append(String.valueOf(this.functionId));
        sb.append(", regionId=").append(String.valueOf(this.regionId));
        sb.append(", fnConfigDefinition=").append(String.valueOf(this.fnConfigDefinition));
        sb.append(", inputShape=").append(String.valueOf(this.inputShape));
        sb.append(", outputShape=").append(String.valueOf(this.outputShape));
        sb.append(", modelType=").append(String.valueOf(this.modelType));
        sb.append(", key=").append(String.valueOf(this.key));
        sb.append(", parentRef=").append(String.valueOf(this.parentRef));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", objectVersion=").append(String.valueOf(this.objectVersion));
        sb.append(", payloadFormat=").append(String.valueOf(this.payloadFormat));
        sb.append(", fnConfigDef=").append(String.valueOf(this.fnConfigDef));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OciFunction)) {
            return false;
        }

        OciFunction other = (OciFunction) o;
        return java.util.Objects.equals(this.functionId, other.functionId)
                && java.util.Objects.equals(this.regionId, other.regionId)
                && java.util.Objects.equals(this.fnConfigDefinition, other.fnConfigDefinition)
                && java.util.Objects.equals(this.inputShape, other.inputShape)
                && java.util.Objects.equals(this.outputShape, other.outputShape)
                && java.util.Objects.equals(this.modelType, other.modelType)
                && java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.parentRef, other.parentRef)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.objectVersion, other.objectVersion)
                && java.util.Objects.equals(this.payloadFormat, other.payloadFormat)
                && java.util.Objects.equals(this.fnConfigDef, other.fnConfigDef)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.functionId == null ? 43 : this.functionId.hashCode());
        result = (result * PRIME) + (this.regionId == null ? 43 : this.regionId.hashCode());
        result =
                (result * PRIME)
                        + (this.fnConfigDefinition == null
                                ? 43
                                : this.fnConfigDefinition.hashCode());
        result = (result * PRIME) + (this.inputShape == null ? 43 : this.inputShape.hashCode());
        result = (result * PRIME) + (this.outputShape == null ? 43 : this.outputShape.hashCode());
        result = (result * PRIME) + (this.modelType == null ? 43 : this.modelType.hashCode());
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.parentRef == null ? 43 : this.parentRef.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.objectVersion == null ? 43 : this.objectVersion.hashCode());
        result =
                (result * PRIME)
                        + (this.payloadFormat == null ? 43 : this.payloadFormat.hashCode());
        result = (result * PRIME) + (this.fnConfigDef == null ? 43 : this.fnConfigDef.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
