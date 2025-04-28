/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The findings of the Optimizer Statistics Advisor. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = FindingSchemaOrOperation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class FindingSchemaOrOperation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"operations", "schemas"})
    public FindingSchemaOrOperation(
            java.util.List<String> operations, java.util.List<SchemaDefinition> schemas) {
        super();
        this.operations = operations;
        this.schemas = schemas;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The list of operation details. */
        @com.fasterxml.jackson.annotation.JsonProperty("operations")
        private java.util.List<String> operations;

        /**
         * The list of operation details.
         *
         * @param operations the value to set
         * @return this builder
         */
        public Builder operations(java.util.List<String> operations) {
            this.operations = operations;
            this.__explicitlySet__.add("operations");
            return this;
        }
        /** The names of the impacted database schemas and their objects. */
        @com.fasterxml.jackson.annotation.JsonProperty("schemas")
        private java.util.List<SchemaDefinition> schemas;

        /**
         * The names of the impacted database schemas and their objects.
         *
         * @param schemas the value to set
         * @return this builder
         */
        public Builder schemas(java.util.List<SchemaDefinition> schemas) {
            this.schemas = schemas;
            this.__explicitlySet__.add("schemas");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FindingSchemaOrOperation build() {
            FindingSchemaOrOperation model =
                    new FindingSchemaOrOperation(this.operations, this.schemas);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FindingSchemaOrOperation model) {
            if (model.wasPropertyExplicitlySet("operations")) {
                this.operations(model.getOperations());
            }
            if (model.wasPropertyExplicitlySet("schemas")) {
                this.schemas(model.getSchemas());
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

    /** The list of operation details. */
    @com.fasterxml.jackson.annotation.JsonProperty("operations")
    private final java.util.List<String> operations;

    /**
     * The list of operation details.
     *
     * @return the value
     */
    public java.util.List<String> getOperations() {
        return operations;
    }

    /** The names of the impacted database schemas and their objects. */
    @com.fasterxml.jackson.annotation.JsonProperty("schemas")
    private final java.util.List<SchemaDefinition> schemas;

    /**
     * The names of the impacted database schemas and their objects.
     *
     * @return the value
     */
    public java.util.List<SchemaDefinition> getSchemas() {
        return schemas;
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
        sb.append("FindingSchemaOrOperation(");
        sb.append("super=").append(super.toString());
        sb.append("operations=").append(String.valueOf(this.operations));
        sb.append(", schemas=").append(String.valueOf(this.schemas));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FindingSchemaOrOperation)) {
            return false;
        }

        FindingSchemaOrOperation other = (FindingSchemaOrOperation) o;
        return java.util.Objects.equals(this.operations, other.operations)
                && java.util.Objects.equals(this.schemas, other.schemas)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.operations == null ? 43 : this.operations.hashCode());
        result = (result * PRIME) + (this.schemas == null ? 43 : this.schemas.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
