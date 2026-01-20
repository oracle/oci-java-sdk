/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiagentruntime.model;

/**
 * Model details. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ModelDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ModelDetails extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"modelName", "modelVersion", "modelParams"})
    public ModelDetails(String modelName, String modelVersion, ModelParams modelParams) {
        super();
        this.modelName = modelName;
        this.modelVersion = modelVersion;
        this.modelParams = modelParams;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the model. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelName")
        private String modelName;

        /**
         * Name of the model.
         *
         * @param modelName the value to set
         * @return this builder
         */
        public Builder modelName(String modelName) {
            this.modelName = modelName;
            this.__explicitlySet__.add("modelName");
            return this;
        }
        /** Version of the model. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
        private String modelVersion;

        /**
         * Version of the model.
         *
         * @param modelVersion the value to set
         * @return this builder
         */
        public Builder modelVersion(String modelVersion) {
            this.modelVersion = modelVersion;
            this.__explicitlySet__.add("modelVersion");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("modelParams")
        private ModelParams modelParams;

        public Builder modelParams(ModelParams modelParams) {
            this.modelParams = modelParams;
            this.__explicitlySet__.add("modelParams");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModelDetails build() {
            ModelDetails model =
                    new ModelDetails(this.modelName, this.modelVersion, this.modelParams);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelDetails model) {
            if (model.wasPropertyExplicitlySet("modelName")) {
                this.modelName(model.getModelName());
            }
            if (model.wasPropertyExplicitlySet("modelVersion")) {
                this.modelVersion(model.getModelVersion());
            }
            if (model.wasPropertyExplicitlySet("modelParams")) {
                this.modelParams(model.getModelParams());
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

    /** Name of the model. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelName")
    private final String modelName;

    /**
     * Name of the model.
     *
     * @return the value
     */
    public String getModelName() {
        return modelName;
    }

    /** Version of the model. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelVersion")
    private final String modelVersion;

    /**
     * Version of the model.
     *
     * @return the value
     */
    public String getModelVersion() {
        return modelVersion;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("modelParams")
    private final ModelParams modelParams;

    public ModelParams getModelParams() {
        return modelParams;
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
        sb.append("ModelDetails(");
        sb.append("super=").append(super.toString());
        sb.append("modelName=").append(String.valueOf(this.modelName));
        sb.append(", modelVersion=").append(String.valueOf(this.modelVersion));
        sb.append(", modelParams=").append(String.valueOf(this.modelParams));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ModelDetails)) {
            return false;
        }

        ModelDetails other = (ModelDetails) o;
        return java.util.Objects.equals(this.modelName, other.modelName)
                && java.util.Objects.equals(this.modelVersion, other.modelVersion)
                && java.util.Objects.equals(this.modelParams, other.modelParams)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.modelName == null ? 43 : this.modelName.hashCode());
        result = (result * PRIME) + (this.modelVersion == null ? 43 : this.modelVersion.hashCode());
        result = (result * PRIME) + (this.modelParams == null ? 43 : this.modelParams.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
