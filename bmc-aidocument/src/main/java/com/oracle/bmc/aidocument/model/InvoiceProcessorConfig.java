/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aidocument.model;

/**
 * The configuration of an invoice processor. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221109")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InvoiceProcessorConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "processorType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InvoiceProcessorConfig extends ProcessorConfig {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Unique identifier custom model OCID that should be used for inference. */
        @com.fasterxml.jackson.annotation.JsonProperty("modelId")
        private String modelId;

        /**
         * Unique identifier custom model OCID that should be used for inference.
         *
         * @param modelId the value to set
         * @return this builder
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            this.__explicitlySet__.add("modelId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("normalizationFields")
        private NormalizationFields normalizationFields;

        public Builder normalizationFields(NormalizationFields normalizationFields) {
            this.normalizationFields = normalizationFields;
            this.__explicitlySet__.add("normalizationFields");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InvoiceProcessorConfig build() {
            InvoiceProcessorConfig model =
                    new InvoiceProcessorConfig(this.modelId, this.normalizationFields);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InvoiceProcessorConfig model) {
            if (model.wasPropertyExplicitlySet("modelId")) {
                this.modelId(model.getModelId());
            }
            if (model.wasPropertyExplicitlySet("normalizationFields")) {
                this.normalizationFields(model.getNormalizationFields());
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
    public InvoiceProcessorConfig(String modelId, NormalizationFields normalizationFields) {
        super();
        this.modelId = modelId;
        this.normalizationFields = normalizationFields;
    }

    /** Unique identifier custom model OCID that should be used for inference. */
    @com.fasterxml.jackson.annotation.JsonProperty("modelId")
    private final String modelId;

    /**
     * Unique identifier custom model OCID that should be used for inference.
     *
     * @return the value
     */
    public String getModelId() {
        return modelId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("normalizationFields")
    private final NormalizationFields normalizationFields;

    public NormalizationFields getNormalizationFields() {
        return normalizationFields;
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
        sb.append("InvoiceProcessorConfig(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", modelId=").append(String.valueOf(this.modelId));
        sb.append(", normalizationFields=").append(String.valueOf(this.normalizationFields));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InvoiceProcessorConfig)) {
            return false;
        }

        InvoiceProcessorConfig other = (InvoiceProcessorConfig) o;
        return java.util.Objects.equals(this.modelId, other.modelId)
                && java.util.Objects.equals(this.normalizationFields, other.normalizationFields)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.modelId == null ? 43 : this.modelId.hashCode());
        result =
                (result * PRIME)
                        + (this.normalizationFields == null
                                ? 43
                                : this.normalizationFields.hashCode());
        return result;
    }
}
