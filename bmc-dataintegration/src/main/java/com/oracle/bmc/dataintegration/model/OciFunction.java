/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information about the OCI Function.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OciFunction.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OciFunction {
    @Deprecated
    @java.beans.ConstructorProperties({
        "functionId",
        "regionId",
        "fnConfigDefinition",
        "inputShape",
        "outputShape"
    })
    public OciFunction(
            String functionId,
            String regionId,
            ConfigDefinition fnConfigDefinition,
            Shape inputShape,
            Shape outputShape) {
        super();
        this.functionId = functionId;
        this.regionId = regionId;
        this.fnConfigDefinition = fnConfigDefinition;
        this.inputShape = inputShape;
        this.outputShape = outputShape;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("functionId")
        private String functionId;

        public Builder functionId(String functionId) {
            this.functionId = functionId;
            this.__explicitlySet__.add("functionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("regionId")
        private String regionId;

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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OciFunction build() {
            OciFunction __instance__ =
                    new OciFunction(
                            functionId, regionId, fnConfigDefinition, inputShape, outputShape);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OciFunction o) {
            Builder copiedBuilder =
                    functionId(o.getFunctionId())
                            .regionId(o.getRegionId())
                            .fnConfigDefinition(o.getFnConfigDefinition())
                            .inputShape(o.getInputShape())
                            .outputShape(o.getOutputShape());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Ocid of the OCI Function.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("functionId")
    private final String functionId;

    public String getFunctionId() {
        return functionId;
    }

    /**
     * Region where the OCI Function is deployed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("regionId")
    private final String regionId;

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

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OciFunction(");
        sb.append("functionId=").append(String.valueOf(this.functionId));
        sb.append(", regionId=").append(String.valueOf(this.regionId));
        sb.append(", fnConfigDefinition=").append(String.valueOf(this.fnConfigDefinition));
        sb.append(", inputShape=").append(String.valueOf(this.inputShape));
        sb.append(", outputShape=").append(String.valueOf(this.outputShape));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
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
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
