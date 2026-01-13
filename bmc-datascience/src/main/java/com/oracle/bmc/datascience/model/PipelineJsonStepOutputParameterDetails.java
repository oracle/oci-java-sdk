/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datascience.model;

/**
 * Pipeline JSON output parameter details <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PipelineJsonStepOutputParameterDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "outputParameterType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PipelineJsonStepOutputParameterDetails
        extends PipelineStepOutputParameterDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The list of parameter names that will be output by this step */
        @com.fasterxml.jackson.annotation.JsonProperty("parameterNames")
        private java.util.List<String> parameterNames;

        /**
         * The list of parameter names that will be output by this step
         *
         * @param parameterNames the value to set
         * @return this builder
         */
        public Builder parameterNames(java.util.List<String> parameterNames) {
            this.parameterNames = parameterNames;
            this.__explicitlySet__.add("parameterNames");
            return this;
        }
        /** Output file name */
        @com.fasterxml.jackson.annotation.JsonProperty("outputFile")
        private String outputFile;

        /**
         * Output file name
         *
         * @param outputFile the value to set
         * @return this builder
         */
        public Builder outputFile(String outputFile) {
            this.outputFile = outputFile;
            this.__explicitlySet__.add("outputFile");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PipelineJsonStepOutputParameterDetails build() {
            PipelineJsonStepOutputParameterDetails model =
                    new PipelineJsonStepOutputParameterDetails(
                            this.parameterNames, this.outputFile);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PipelineJsonStepOutputParameterDetails model) {
            if (model.wasPropertyExplicitlySet("parameterNames")) {
                this.parameterNames(model.getParameterNames());
            }
            if (model.wasPropertyExplicitlySet("outputFile")) {
                this.outputFile(model.getOutputFile());
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
    public PipelineJsonStepOutputParameterDetails(
            java.util.List<String> parameterNames, String outputFile) {
        super();
        this.parameterNames = parameterNames;
        this.outputFile = outputFile;
    }

    /** The list of parameter names that will be output by this step */
    @com.fasterxml.jackson.annotation.JsonProperty("parameterNames")
    private final java.util.List<String> parameterNames;

    /**
     * The list of parameter names that will be output by this step
     *
     * @return the value
     */
    public java.util.List<String> getParameterNames() {
        return parameterNames;
    }

    /** Output file name */
    @com.fasterxml.jackson.annotation.JsonProperty("outputFile")
    private final String outputFile;

    /**
     * Output file name
     *
     * @return the value
     */
    public String getOutputFile() {
        return outputFile;
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
        sb.append("PipelineJsonStepOutputParameterDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", parameterNames=").append(String.valueOf(this.parameterNames));
        sb.append(", outputFile=").append(String.valueOf(this.outputFile));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PipelineJsonStepOutputParameterDetails)) {
            return false;
        }

        PipelineJsonStepOutputParameterDetails other = (PipelineJsonStepOutputParameterDetails) o;
        return java.util.Objects.equals(this.parameterNames, other.parameterNames)
                && java.util.Objects.equals(this.outputFile, other.outputFile)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.parameterNames == null ? 43 : this.parameterNames.hashCode());
        result = (result * PRIME) + (this.outputFile == null ? 43 : this.outputFile.hashCode());
        return result;
    }
}
