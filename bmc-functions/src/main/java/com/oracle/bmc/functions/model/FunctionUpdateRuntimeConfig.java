/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.model;

/**
 * FunctionsRuntime configuration for a function with 'FUNCTION_UPDATE' Runtime Update strategy.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = FunctionUpdateRuntimeConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "runtimeConfigType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class FunctionUpdateRuntimeConfig extends RuntimeConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the FunctionsRuntime this function is to be associated with.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("functionsRuntimeName")
        private String functionsRuntimeName;

        /**
         * The name of the FunctionsRuntime this function is to be associated with.
         *
         * @param functionsRuntimeName the value to set
         * @return this builder
         **/
        public Builder functionsRuntimeName(String functionsRuntimeName) {
            this.functionsRuntimeName = functionsRuntimeName;
            this.__explicitlySet__.add("functionsRuntimeName");
            return this;
        }
        /**
         * The OCID of the FunctionsRuntimeVersion that is currently in use for the function.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("functionsRuntimeVersionId")
        private String functionsRuntimeVersionId;

        /**
         * The OCID of the FunctionsRuntimeVersion that is currently in use for the function.
         * @param functionsRuntimeVersionId the value to set
         * @return this builder
         **/
        public Builder functionsRuntimeVersionId(String functionsRuntimeVersionId) {
            this.functionsRuntimeVersionId = functionsRuntimeVersionId;
            this.__explicitlySet__.add("functionsRuntimeVersionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FunctionUpdateRuntimeConfig build() {
            FunctionUpdateRuntimeConfig model =
                    new FunctionUpdateRuntimeConfig(
                            this.functionsRuntimeName, this.functionsRuntimeVersionId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FunctionUpdateRuntimeConfig model) {
            if (model.wasPropertyExplicitlySet("functionsRuntimeName")) {
                this.functionsRuntimeName(model.getFunctionsRuntimeName());
            }
            if (model.wasPropertyExplicitlySet("functionsRuntimeVersionId")) {
                this.functionsRuntimeVersionId(model.getFunctionsRuntimeVersionId());
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

    @Deprecated
    public FunctionUpdateRuntimeConfig(
            String functionsRuntimeName, String functionsRuntimeVersionId) {
        super();
        this.functionsRuntimeName = functionsRuntimeName;
        this.functionsRuntimeVersionId = functionsRuntimeVersionId;
    }

    /**
     * The name of the FunctionsRuntime this function is to be associated with.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("functionsRuntimeName")
    private final String functionsRuntimeName;

    /**
     * The name of the FunctionsRuntime this function is to be associated with.
     *
     * @return the value
     **/
    public String getFunctionsRuntimeName() {
        return functionsRuntimeName;
    }

    /**
     * The OCID of the FunctionsRuntimeVersion that is currently in use for the function.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("functionsRuntimeVersionId")
    private final String functionsRuntimeVersionId;

    /**
     * The OCID of the FunctionsRuntimeVersion that is currently in use for the function.
     * @return the value
     **/
    public String getFunctionsRuntimeVersionId() {
        return functionsRuntimeVersionId;
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
        sb.append("FunctionUpdateRuntimeConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", functionsRuntimeName=").append(String.valueOf(this.functionsRuntimeName));
        sb.append(", functionsRuntimeVersionId=")
                .append(String.valueOf(this.functionsRuntimeVersionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FunctionUpdateRuntimeConfig)) {
            return false;
        }

        FunctionUpdateRuntimeConfig other = (FunctionUpdateRuntimeConfig) o;
        return java.util.Objects.equals(this.functionsRuntimeName, other.functionsRuntimeName)
                && java.util.Objects.equals(
                        this.functionsRuntimeVersionId, other.functionsRuntimeVersionId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.functionsRuntimeName == null
                                ? 43
                                : this.functionsRuntimeName.hashCode());
        result =
                (result * PRIME)
                        + (this.functionsRuntimeVersionId == null
                                ? 43
                                : this.functionsRuntimeVersionId.hashCode());
        return result;
    }
}
