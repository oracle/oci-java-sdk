/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The details for updating an Invoke Oracle Function step.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateInvokeFunctionUserDefinedStepDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "stepType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateInvokeFunctionUserDefinedStepDetails
        extends UpdateDrPlanUserDefinedStepDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of function to be invoked.
         * <p>
         * Example: {@code ocid1.fnfunc.oc1.iad.exampleocid2}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("functionId")
        private String functionId;

        /**
         * The OCID of function to be invoked.
         * <p>
         * Example: {@code ocid1.fnfunc.oc1.iad.exampleocid2}
         *
         * @param functionId the value to set
         * @return this builder
         **/
        public Builder functionId(String functionId) {
            this.functionId = functionId;
            this.__explicitlySet__.add("functionId");
            return this;
        }
        /**
         * The request body for the function.
         * <p>
         * Example: {@code { "FnParam1", "FnParam2" }}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("requestBody")
        private String requestBody;

        /**
         * The request body for the function.
         * <p>
         * Example: {@code { "FnParam1", "FnParam2" }}
         *
         * @param requestBody the value to set
         * @return this builder
         **/
        public Builder requestBody(String requestBody) {
            this.requestBody = requestBody;
            this.__explicitlySet__.add("requestBody");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateInvokeFunctionUserDefinedStepDetails build() {
            UpdateInvokeFunctionUserDefinedStepDetails model =
                    new UpdateInvokeFunctionUserDefinedStepDetails(
                            this.functionId, this.requestBody);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateInvokeFunctionUserDefinedStepDetails model) {
            if (model.wasPropertyExplicitlySet("functionId")) {
                this.functionId(model.getFunctionId());
            }
            if (model.wasPropertyExplicitlySet("requestBody")) {
                this.requestBody(model.getRequestBody());
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
    public UpdateInvokeFunctionUserDefinedStepDetails(String functionId, String requestBody) {
        super();
        this.functionId = functionId;
        this.requestBody = requestBody;
    }

    /**
     * The OCID of function to be invoked.
     * <p>
     * Example: {@code ocid1.fnfunc.oc1.iad.exampleocid2}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("functionId")
    private final String functionId;

    /**
     * The OCID of function to be invoked.
     * <p>
     * Example: {@code ocid1.fnfunc.oc1.iad.exampleocid2}
     *
     * @return the value
     **/
    public String getFunctionId() {
        return functionId;
    }

    /**
     * The request body for the function.
     * <p>
     * Example: {@code { "FnParam1", "FnParam2" }}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestBody")
    private final String requestBody;

    /**
     * The request body for the function.
     * <p>
     * Example: {@code { "FnParam1", "FnParam2" }}
     *
     * @return the value
     **/
    public String getRequestBody() {
        return requestBody;
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
        sb.append("UpdateInvokeFunctionUserDefinedStepDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", functionId=").append(String.valueOf(this.functionId));
        sb.append(", requestBody=").append(String.valueOf(this.requestBody));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateInvokeFunctionUserDefinedStepDetails)) {
            return false;
        }

        UpdateInvokeFunctionUserDefinedStepDetails other =
                (UpdateInvokeFunctionUserDefinedStepDetails) o;
        return java.util.Objects.equals(this.functionId, other.functionId)
                && java.util.Objects.equals(this.requestBody, other.requestBody)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.functionId == null ? 43 : this.functionId.hashCode());
        result = (result * PRIME) + (this.requestBody == null ? 43 : this.requestBody.hashCode());
        return result;
    }
}
