/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Fleet credential details. <br>
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
        builder = FleetCredentialEntitySpecificDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "credentialLevel")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FleetCredentialEntitySpecificDetails extends CredentialEntitySpecificDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of fleet credential variables. */
        @com.fasterxml.jackson.annotation.JsonProperty("variables")
        private java.util.List<Variable> variables;

        /**
         * List of fleet credential variables.
         *
         * @param variables the value to set
         * @return this builder
         */
        public Builder variables(java.util.List<Variable> variables) {
            this.variables = variables;
            this.__explicitlySet__.add("variables");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FleetCredentialEntitySpecificDetails build() {
            FleetCredentialEntitySpecificDetails model =
                    new FleetCredentialEntitySpecificDetails(this.variables);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FleetCredentialEntitySpecificDetails model) {
            if (model.wasPropertyExplicitlySet("variables")) {
                this.variables(model.getVariables());
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
    public FleetCredentialEntitySpecificDetails(java.util.List<Variable> variables) {
        super();
        this.variables = variables;
    }

    /** List of fleet credential variables. */
    @com.fasterxml.jackson.annotation.JsonProperty("variables")
    private final java.util.List<Variable> variables;

    /**
     * List of fleet credential variables.
     *
     * @return the value
     */
    public java.util.List<Variable> getVariables() {
        return variables;
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
        sb.append("FleetCredentialEntitySpecificDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", variables=").append(String.valueOf(this.variables));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FleetCredentialEntitySpecificDetails)) {
            return false;
        }

        FleetCredentialEntitySpecificDetails other = (FleetCredentialEntitySpecificDetails) o;
        return java.util.Objects.equals(this.variables, other.variables) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.variables == null ? 43 : this.variables.hashCode());
        return result;
    }
}
