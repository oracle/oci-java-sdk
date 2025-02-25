/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Summary of source or target schema tables of a pipeline's assigned connection.
 * 1. If there is no explicit mapping defined for the pipeline then only matched source and target schema's table names will be returned
 * 2. If there are explicit mappings defined for the pipeline then along with the mapped source and target schema's table names, the matched source and target schema's table names also will be returned.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = PipelineSchemaTableSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PipelineSchemaTableSummary
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sourceTableName", "targetTableName"})
    public PipelineSchemaTableSummary(String sourceTableName, String targetTableName) {
        super();
        this.sourceTableName = sourceTableName;
        this.targetTableName = targetTableName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The table name from the schema of database connection.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sourceTableName")
        private String sourceTableName;

        /**
         * The table name from the schema of database connection.
         *
         * @param sourceTableName the value to set
         * @return this builder
         **/
        public Builder sourceTableName(String sourceTableName) {
            this.sourceTableName = sourceTableName;
            this.__explicitlySet__.add("sourceTableName");
            return this;
        }
        /**
         * The table name from the schema of database connection.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetTableName")
        private String targetTableName;

        /**
         * The table name from the schema of database connection.
         *
         * @param targetTableName the value to set
         * @return this builder
         **/
        public Builder targetTableName(String targetTableName) {
            this.targetTableName = targetTableName;
            this.__explicitlySet__.add("targetTableName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PipelineSchemaTableSummary build() {
            PipelineSchemaTableSummary model =
                    new PipelineSchemaTableSummary(this.sourceTableName, this.targetTableName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PipelineSchemaTableSummary model) {
            if (model.wasPropertyExplicitlySet("sourceTableName")) {
                this.sourceTableName(model.getSourceTableName());
            }
            if (model.wasPropertyExplicitlySet("targetTableName")) {
                this.targetTableName(model.getTargetTableName());
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
     * The table name from the schema of database connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sourceTableName")
    private final String sourceTableName;

    /**
     * The table name from the schema of database connection.
     *
     * @return the value
     **/
    public String getSourceTableName() {
        return sourceTableName;
    }

    /**
     * The table name from the schema of database connection.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetTableName")
    private final String targetTableName;

    /**
     * The table name from the schema of database connection.
     *
     * @return the value
     **/
    public String getTargetTableName() {
        return targetTableName;
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
        sb.append("PipelineSchemaTableSummary(");
        sb.append("super=").append(super.toString());
        sb.append("sourceTableName=").append(String.valueOf(this.sourceTableName));
        sb.append(", targetTableName=").append(String.valueOf(this.targetTableName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PipelineSchemaTableSummary)) {
            return false;
        }

        PipelineSchemaTableSummary other = (PipelineSchemaTableSummary) o;
        return java.util.Objects.equals(this.sourceTableName, other.sourceTableName)
                && java.util.Objects.equals(this.targetTableName, other.targetTableName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceTableName == null ? 43 : this.sourceTableName.hashCode());
        result =
                (result * PRIME)
                        + (this.targetTableName == null ? 43 : this.targetTableName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
