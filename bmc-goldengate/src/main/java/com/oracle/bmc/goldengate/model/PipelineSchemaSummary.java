/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * List of source and target schemas of a pipeline's assigned connection. 1. If there is no explicit
 * mapping defined for the pipeline then only matched source and target schema names will be
 * returned. 2. If there are explicit mappings defined for the pipeline then along with the mapped
 * source and target schema names, the matched source and target schema names also will be returned.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = PipelineSchemaSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PipelineSchemaSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"sourceSchemaName", "targetSchemaName"})
    public PipelineSchemaSummary(String sourceSchemaName, String targetSchemaName) {
        super();
        this.sourceSchemaName = sourceSchemaName;
        this.targetSchemaName = targetSchemaName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The schema name from the database connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("sourceSchemaName")
        private String sourceSchemaName;

        /**
         * The schema name from the database connection.
         *
         * @param sourceSchemaName the value to set
         * @return this builder
         */
        public Builder sourceSchemaName(String sourceSchemaName) {
            this.sourceSchemaName = sourceSchemaName;
            this.__explicitlySet__.add("sourceSchemaName");
            return this;
        }
        /** The schema name from the database connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("targetSchemaName")
        private String targetSchemaName;

        /**
         * The schema name from the database connection.
         *
         * @param targetSchemaName the value to set
         * @return this builder
         */
        public Builder targetSchemaName(String targetSchemaName) {
            this.targetSchemaName = targetSchemaName;
            this.__explicitlySet__.add("targetSchemaName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PipelineSchemaSummary build() {
            PipelineSchemaSummary model =
                    new PipelineSchemaSummary(this.sourceSchemaName, this.targetSchemaName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PipelineSchemaSummary model) {
            if (model.wasPropertyExplicitlySet("sourceSchemaName")) {
                this.sourceSchemaName(model.getSourceSchemaName());
            }
            if (model.wasPropertyExplicitlySet("targetSchemaName")) {
                this.targetSchemaName(model.getTargetSchemaName());
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

    /** The schema name from the database connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceSchemaName")
    private final String sourceSchemaName;

    /**
     * The schema name from the database connection.
     *
     * @return the value
     */
    public String getSourceSchemaName() {
        return sourceSchemaName;
    }

    /** The schema name from the database connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("targetSchemaName")
    private final String targetSchemaName;

    /**
     * The schema name from the database connection.
     *
     * @return the value
     */
    public String getTargetSchemaName() {
        return targetSchemaName;
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
        sb.append("PipelineSchemaSummary(");
        sb.append("super=").append(super.toString());
        sb.append("sourceSchemaName=").append(String.valueOf(this.sourceSchemaName));
        sb.append(", targetSchemaName=").append(String.valueOf(this.targetSchemaName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PipelineSchemaSummary)) {
            return false;
        }

        PipelineSchemaSummary other = (PipelineSchemaSummary) o;
        return java.util.Objects.equals(this.sourceSchemaName, other.sourceSchemaName)
                && java.util.Objects.equals(this.targetSchemaName, other.targetSchemaName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.sourceSchemaName == null ? 43 : this.sourceSchemaName.hashCode());
        result =
                (result * PRIME)
                        + (this.targetSchemaName == null ? 43 : this.targetSchemaName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
