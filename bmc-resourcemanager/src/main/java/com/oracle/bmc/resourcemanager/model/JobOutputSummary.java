/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Terraform output associated with a job. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JobOutputSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JobOutputSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "outputName",
        "outputType",
        "outputValue",
        "isSensitive",
        "description"
    })
    public JobOutputSummary(
            String outputName,
            String outputType,
            String outputValue,
            Boolean isSensitive,
            String description) {
        super();
        this.outputName = outputName;
        this.outputType = outputType;
        this.outputValue = outputValue;
        this.isSensitive = isSensitive;
        this.description = description;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the output. */
        @com.fasterxml.jackson.annotation.JsonProperty("outputName")
        private String outputName;

        /**
         * Name of the output.
         *
         * @param outputName the value to set
         * @return this builder
         */
        public Builder outputName(String outputName) {
            this.outputName = outputName;
            this.__explicitlySet__.add("outputName");
            return this;
        }
        /** Output resource type. */
        @com.fasterxml.jackson.annotation.JsonProperty("outputType")
        private String outputType;

        /**
         * Output resource type.
         *
         * @param outputType the value to set
         * @return this builder
         */
        public Builder outputType(String outputType) {
            this.outputType = outputType;
            this.__explicitlySet__.add("outputType");
            return this;
        }
        /** Value of the Terraform output. */
        @com.fasterxml.jackson.annotation.JsonProperty("outputValue")
        private String outputValue;

        /**
         * Value of the Terraform output.
         *
         * @param outputValue the value to set
         * @return this builder
         */
        public Builder outputValue(String outputValue) {
            this.outputValue = outputValue;
            this.__explicitlySet__.add("outputValue");
            return this;
        }
        /** When {@code true}, output is sensitive. */
        @com.fasterxml.jackson.annotation.JsonProperty("isSensitive")
        private Boolean isSensitive;

        /**
         * When {@code true}, output is sensitive.
         *
         * @param isSensitive the value to set
         * @return this builder
         */
        public Builder isSensitive(Boolean isSensitive) {
            this.isSensitive = isSensitive;
            this.__explicitlySet__.add("isSensitive");
            return this;
        }
        /** Description of the output. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Description of the output.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobOutputSummary build() {
            JobOutputSummary model =
                    new JobOutputSummary(
                            this.outputName,
                            this.outputType,
                            this.outputValue,
                            this.isSensitive,
                            this.description);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobOutputSummary model) {
            if (model.wasPropertyExplicitlySet("outputName")) {
                this.outputName(model.getOutputName());
            }
            if (model.wasPropertyExplicitlySet("outputType")) {
                this.outputType(model.getOutputType());
            }
            if (model.wasPropertyExplicitlySet("outputValue")) {
                this.outputValue(model.getOutputValue());
            }
            if (model.wasPropertyExplicitlySet("isSensitive")) {
                this.isSensitive(model.getIsSensitive());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
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

    /** Name of the output. */
    @com.fasterxml.jackson.annotation.JsonProperty("outputName")
    private final String outputName;

    /**
     * Name of the output.
     *
     * @return the value
     */
    public String getOutputName() {
        return outputName;
    }

    /** Output resource type. */
    @com.fasterxml.jackson.annotation.JsonProperty("outputType")
    private final String outputType;

    /**
     * Output resource type.
     *
     * @return the value
     */
    public String getOutputType() {
        return outputType;
    }

    /** Value of the Terraform output. */
    @com.fasterxml.jackson.annotation.JsonProperty("outputValue")
    private final String outputValue;

    /**
     * Value of the Terraform output.
     *
     * @return the value
     */
    public String getOutputValue() {
        return outputValue;
    }

    /** When {@code true}, output is sensitive. */
    @com.fasterxml.jackson.annotation.JsonProperty("isSensitive")
    private final Boolean isSensitive;

    /**
     * When {@code true}, output is sensitive.
     *
     * @return the value
     */
    public Boolean getIsSensitive() {
        return isSensitive;
    }

    /** Description of the output. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Description of the output.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
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
        sb.append("JobOutputSummary(");
        sb.append("super=").append(super.toString());
        sb.append("outputName=").append(String.valueOf(this.outputName));
        sb.append(", outputType=").append(String.valueOf(this.outputType));
        sb.append(", outputValue=").append(String.valueOf(this.outputValue));
        sb.append(", isSensitive=").append(String.valueOf(this.isSensitive));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobOutputSummary)) {
            return false;
        }

        JobOutputSummary other = (JobOutputSummary) o;
        return java.util.Objects.equals(this.outputName, other.outputName)
                && java.util.Objects.equals(this.outputType, other.outputType)
                && java.util.Objects.equals(this.outputValue, other.outputValue)
                && java.util.Objects.equals(this.isSensitive, other.isSensitive)
                && java.util.Objects.equals(this.description, other.description)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.outputName == null ? 43 : this.outputName.hashCode());
        result = (result * PRIME) + (this.outputType == null ? 43 : this.outputType.hashCode());
        result = (result * PRIME) + (this.outputValue == null ? 43 : this.outputValue.hashCode());
        result = (result * PRIME) + (this.isSensitive == null ? 43 : this.isSensitive.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
