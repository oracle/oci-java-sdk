/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * Details for validation of customer input pipeline configuration.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OpensearchPipelineValidationResponse.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OpensearchPipelineValidationResponse
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"errors", "isValid"})
    public OpensearchPipelineValidationResponse(
            java.util.List<PipelineValidationErrorDetails> errors, Boolean isValid) {
        super();
        this.errors = errors;
        this.isValid = isValid;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * An array of errors in the pipeline configuration which is given for validation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("errors")
        private java.util.List<PipelineValidationErrorDetails> errors;

        /**
         * An array of errors in the pipeline configuration which is given for validation.
         * @param errors the value to set
         * @return this builder
         **/
        public Builder errors(java.util.List<PipelineValidationErrorDetails> errors) {
            this.errors = errors;
            this.__explicitlySet__.add("errors");
            return this;
        }
        /**
         * Boolean value which tells us if the pipeline configuration given by user is valid or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isValid")
        private Boolean isValid;

        /**
         * Boolean value which tells us if the pipeline configuration given by user is valid or not.
         * @param isValid the value to set
         * @return this builder
         **/
        public Builder isValid(Boolean isValid) {
            this.isValid = isValid;
            this.__explicitlySet__.add("isValid");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OpensearchPipelineValidationResponse build() {
            OpensearchPipelineValidationResponse model =
                    new OpensearchPipelineValidationResponse(this.errors, this.isValid);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OpensearchPipelineValidationResponse model) {
            if (model.wasPropertyExplicitlySet("errors")) {
                this.errors(model.getErrors());
            }
            if (model.wasPropertyExplicitlySet("isValid")) {
                this.isValid(model.getIsValid());
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

    /**
     * An array of errors in the pipeline configuration which is given for validation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errors")
    private final java.util.List<PipelineValidationErrorDetails> errors;

    /**
     * An array of errors in the pipeline configuration which is given for validation.
     * @return the value
     **/
    public java.util.List<PipelineValidationErrorDetails> getErrors() {
        return errors;
    }

    /**
     * Boolean value which tells us if the pipeline configuration given by user is valid or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isValid")
    private final Boolean isValid;

    /**
     * Boolean value which tells us if the pipeline configuration given by user is valid or not.
     * @return the value
     **/
    public Boolean getIsValid() {
        return isValid;
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
        sb.append("OpensearchPipelineValidationResponse(");
        sb.append("super=").append(super.toString());
        sb.append("errors=").append(String.valueOf(this.errors));
        sb.append(", isValid=").append(String.valueOf(this.isValid));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OpensearchPipelineValidationResponse)) {
            return false;
        }

        OpensearchPipelineValidationResponse other = (OpensearchPipelineValidationResponse) o;
        return java.util.Objects.equals(this.errors, other.errors)
                && java.util.Objects.equals(this.isValid, other.isValid)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.errors == null ? 43 : this.errors.hashCode());
        result = (result * PRIME) + (this.isValid == null ? 43 : this.isValid.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
