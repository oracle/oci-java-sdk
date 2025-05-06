/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * The Apply job output variable <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20250228")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = JobExecutionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JobExecutionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "outputName",
        "outputType",
        "outputValue",
        "outputDescription",
        "isSensitive"
    })
    public JobExecutionDetails(
            String outputName,
            String outputType,
            String outputValue,
            String outputDescription,
            Boolean isSensitive) {
        super();
        this.outputName = outputName;
        this.outputType = outputType;
        this.outputValue = outputValue;
        this.outputDescription = outputDescription;
        this.isSensitive = isSensitive;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The output name */
        @com.fasterxml.jackson.annotation.JsonProperty("outputName")
        private String outputName;

        /**
         * The output name
         *
         * @param outputName the value to set
         * @return this builder
         */
        public Builder outputName(String outputName) {
            this.outputName = outputName;
            this.__explicitlySet__.add("outputName");
            return this;
        }
        /** The output type */
        @com.fasterxml.jackson.annotation.JsonProperty("outputType")
        private String outputType;

        /**
         * The output type
         *
         * @param outputType the value to set
         * @return this builder
         */
        public Builder outputType(String outputType) {
            this.outputType = outputType;
            this.__explicitlySet__.add("outputType");
            return this;
        }
        /** The output value */
        @com.fasterxml.jackson.annotation.JsonProperty("outputValue")
        private String outputValue;

        /**
         * The output value
         *
         * @param outputValue the value to set
         * @return this builder
         */
        public Builder outputValue(String outputValue) {
            this.outputValue = outputValue;
            this.__explicitlySet__.add("outputValue");
            return this;
        }
        /** The output description */
        @com.fasterxml.jackson.annotation.JsonProperty("outputDescription")
        private String outputDescription;

        /**
         * The output description
         *
         * @param outputDescription the value to set
         * @return this builder
         */
        public Builder outputDescription(String outputDescription) {
            this.outputDescription = outputDescription;
            this.__explicitlySet__.add("outputDescription");
            return this;
        }
        /**
         * The indicator if the data for this parameter is sensitive (e.g. should the data be hidden
         * in UI, encrypted if stored, etc.)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSensitive")
        private Boolean isSensitive;

        /**
         * The indicator if the data for this parameter is sensitive (e.g. should the data be hidden
         * in UI, encrypted if stored, etc.)
         *
         * @param isSensitive the value to set
         * @return this builder
         */
        public Builder isSensitive(Boolean isSensitive) {
            this.isSensitive = isSensitive;
            this.__explicitlySet__.add("isSensitive");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JobExecutionDetails build() {
            JobExecutionDetails model =
                    new JobExecutionDetails(
                            this.outputName,
                            this.outputType,
                            this.outputValue,
                            this.outputDescription,
                            this.isSensitive);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JobExecutionDetails model) {
            if (model.wasPropertyExplicitlySet("outputName")) {
                this.outputName(model.getOutputName());
            }
            if (model.wasPropertyExplicitlySet("outputType")) {
                this.outputType(model.getOutputType());
            }
            if (model.wasPropertyExplicitlySet("outputValue")) {
                this.outputValue(model.getOutputValue());
            }
            if (model.wasPropertyExplicitlySet("outputDescription")) {
                this.outputDescription(model.getOutputDescription());
            }
            if (model.wasPropertyExplicitlySet("isSensitive")) {
                this.isSensitive(model.getIsSensitive());
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

    /** The output name */
    @com.fasterxml.jackson.annotation.JsonProperty("outputName")
    private final String outputName;

    /**
     * The output name
     *
     * @return the value
     */
    public String getOutputName() {
        return outputName;
    }

    /** The output type */
    @com.fasterxml.jackson.annotation.JsonProperty("outputType")
    private final String outputType;

    /**
     * The output type
     *
     * @return the value
     */
    public String getOutputType() {
        return outputType;
    }

    /** The output value */
    @com.fasterxml.jackson.annotation.JsonProperty("outputValue")
    private final String outputValue;

    /**
     * The output value
     *
     * @return the value
     */
    public String getOutputValue() {
        return outputValue;
    }

    /** The output description */
    @com.fasterxml.jackson.annotation.JsonProperty("outputDescription")
    private final String outputDescription;

    /**
     * The output description
     *
     * @return the value
     */
    public String getOutputDescription() {
        return outputDescription;
    }

    /**
     * The indicator if the data for this parameter is sensitive (e.g. should the data be hidden in
     * UI, encrypted if stored, etc.)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSensitive")
    private final Boolean isSensitive;

    /**
     * The indicator if the data for this parameter is sensitive (e.g. should the data be hidden in
     * UI, encrypted if stored, etc.)
     *
     * @return the value
     */
    public Boolean getIsSensitive() {
        return isSensitive;
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
        sb.append("JobExecutionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("outputName=").append(String.valueOf(this.outputName));
        sb.append(", outputType=").append(String.valueOf(this.outputType));
        sb.append(", outputValue=").append(String.valueOf(this.outputValue));
        sb.append(", outputDescription=").append(String.valueOf(this.outputDescription));
        sb.append(", isSensitive=").append(String.valueOf(this.isSensitive));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JobExecutionDetails)) {
            return false;
        }

        JobExecutionDetails other = (JobExecutionDetails) o;
        return java.util.Objects.equals(this.outputName, other.outputName)
                && java.util.Objects.equals(this.outputType, other.outputType)
                && java.util.Objects.equals(this.outputValue, other.outputValue)
                && java.util.Objects.equals(this.outputDescription, other.outputDescription)
                && java.util.Objects.equals(this.isSensitive, other.isSensitive)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.outputName == null ? 43 : this.outputName.hashCode());
        result = (result * PRIME) + (this.outputType == null ? 43 : this.outputType.hashCode());
        result = (result * PRIME) + (this.outputValue == null ? 43 : this.outputValue.hashCode());
        result =
                (result * PRIME)
                        + (this.outputDescription == null ? 43 : this.outputDescription.hashCode());
        result = (result * PRIME) + (this.isSensitive == null ? 43 : this.isSensitive.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
