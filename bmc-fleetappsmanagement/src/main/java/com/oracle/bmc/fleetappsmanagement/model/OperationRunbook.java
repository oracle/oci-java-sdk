/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Runbook
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OperationRunbook.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OperationRunbook extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "inputParameters"})
    public OperationRunbook(String id, java.util.List<InputParameter> inputParameters) {
        super();
        this.id = id;
        this.inputParameters = inputParameters;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The ID of the Runbook
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The ID of the Runbook
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Input Parameters for the Task
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("inputParameters")
        private java.util.List<InputParameter> inputParameters;

        /**
         * Input Parameters for the Task
         * @param inputParameters the value to set
         * @return this builder
         **/
        public Builder inputParameters(java.util.List<InputParameter> inputParameters) {
            this.inputParameters = inputParameters;
            this.__explicitlySet__.add("inputParameters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OperationRunbook build() {
            OperationRunbook model = new OperationRunbook(this.id, this.inputParameters);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OperationRunbook model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("inputParameters")) {
                this.inputParameters(model.getInputParameters());
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
     * The ID of the Runbook
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The ID of the Runbook
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Input Parameters for the Task
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inputParameters")
    private final java.util.List<InputParameter> inputParameters;

    /**
     * Input Parameters for the Task
     * @return the value
     **/
    public java.util.List<InputParameter> getInputParameters() {
        return inputParameters;
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
        sb.append("OperationRunbook(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", inputParameters=").append(String.valueOf(this.inputParameters));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OperationRunbook)) {
            return false;
        }

        OperationRunbook other = (OperationRunbook) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.inputParameters, other.inputParameters)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.inputParameters == null ? 43 : this.inputParameters.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
