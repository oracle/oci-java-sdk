/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaiinference.model;

/**
 * Details for applying guardrails to the input text. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ApplyGuardrailsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ApplyGuardrailsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"input", "guardrailConfigs", "compartmentId"})
    public ApplyGuardrailsDetails(
            GuardrailsInput input, GuardrailConfigs guardrailConfigs, String compartmentId) {
        super();
        this.input = input;
        this.guardrailConfigs = guardrailConfigs;
        this.compartmentId = compartmentId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("input")
        private GuardrailsInput input;

        public Builder input(GuardrailsInput input) {
            this.input = input;
            this.__explicitlySet__.add("input");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("guardrailConfigs")
        private GuardrailConfigs guardrailConfigs;

        public Builder guardrailConfigs(GuardrailConfigs guardrailConfigs) {
            this.guardrailConfigs = guardrailConfigs;
            this.__explicitlySet__.add("guardrailConfigs");
            return this;
        }
        /** The OCID of the compartment to apply guardrails. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment to apply guardrails.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApplyGuardrailsDetails build() {
            ApplyGuardrailsDetails model =
                    new ApplyGuardrailsDetails(
                            this.input, this.guardrailConfigs, this.compartmentId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApplyGuardrailsDetails model) {
            if (model.wasPropertyExplicitlySet("input")) {
                this.input(model.getInput());
            }
            if (model.wasPropertyExplicitlySet("guardrailConfigs")) {
                this.guardrailConfigs(model.getGuardrailConfigs());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
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

    @com.fasterxml.jackson.annotation.JsonProperty("input")
    private final GuardrailsInput input;

    public GuardrailsInput getInput() {
        return input;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("guardrailConfigs")
    private final GuardrailConfigs guardrailConfigs;

    public GuardrailConfigs getGuardrailConfigs() {
        return guardrailConfigs;
    }

    /** The OCID of the compartment to apply guardrails. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment to apply guardrails.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
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
        sb.append("ApplyGuardrailsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("input=").append(String.valueOf(this.input));
        sb.append(", guardrailConfigs=").append(String.valueOf(this.guardrailConfigs));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApplyGuardrailsDetails)) {
            return false;
        }

        ApplyGuardrailsDetails other = (ApplyGuardrailsDetails) o;
        return java.util.Objects.equals(this.input, other.input)
                && java.util.Objects.equals(this.guardrailConfigs, other.guardrailConfigs)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.input == null ? 43 : this.input.hashCode());
        result =
                (result * PRIME)
                        + (this.guardrailConfigs == null ? 43 : this.guardrailConfigs.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
