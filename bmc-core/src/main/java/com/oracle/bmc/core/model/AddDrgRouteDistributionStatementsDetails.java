/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Details request to add statements to a route distribution. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AddDrgRouteDistributionStatementsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AddDrgRouteDistributionStatementsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"statements"})
    public AddDrgRouteDistributionStatementsDetails(
            java.util.List<AddDrgRouteDistributionStatementDetails> statements) {
        super();
        this.statements = statements;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The collection of route distribution statements to insert into the route distribution.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("statements")
        private java.util.List<AddDrgRouteDistributionStatementDetails> statements;

        /**
         * The collection of route distribution statements to insert into the route distribution.
         *
         * @param statements the value to set
         * @return this builder
         */
        public Builder statements(
                java.util.List<AddDrgRouteDistributionStatementDetails> statements) {
            this.statements = statements;
            this.__explicitlySet__.add("statements");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddDrgRouteDistributionStatementsDetails build() {
            AddDrgRouteDistributionStatementsDetails model =
                    new AddDrgRouteDistributionStatementsDetails(this.statements);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddDrgRouteDistributionStatementsDetails model) {
            if (model.wasPropertyExplicitlySet("statements")) {
                this.statements(model.getStatements());
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

    /** The collection of route distribution statements to insert into the route distribution. */
    @com.fasterxml.jackson.annotation.JsonProperty("statements")
    private final java.util.List<AddDrgRouteDistributionStatementDetails> statements;

    /**
     * The collection of route distribution statements to insert into the route distribution.
     *
     * @return the value
     */
    public java.util.List<AddDrgRouteDistributionStatementDetails> getStatements() {
        return statements;
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
        sb.append("AddDrgRouteDistributionStatementsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("statements=").append(String.valueOf(this.statements));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddDrgRouteDistributionStatementsDetails)) {
            return false;
        }

        AddDrgRouteDistributionStatementsDetails other =
                (AddDrgRouteDistributionStatementsDetails) o;
        return java.util.Objects.equals(this.statements, other.statements) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.statements == null ? 43 : this.statements.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
