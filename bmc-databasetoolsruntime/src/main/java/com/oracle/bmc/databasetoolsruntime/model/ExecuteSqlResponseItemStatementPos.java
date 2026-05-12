/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * Position of the statement. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExecuteSqlResponseItemStatementPos.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExecuteSqlResponseItemStatementPos
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"startLine", "endLine"})
    public ExecuteSqlResponseItemStatementPos(Integer startLine, Integer endLine) {
        super();
        this.startLine = startLine;
        this.endLine = endLine;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Start line of the statement. First start line is 1. */
        @com.fasterxml.jackson.annotation.JsonProperty("startLine")
        private Integer startLine;

        /**
         * Start line of the statement. First start line is 1.
         *
         * @param startLine the value to set
         * @return this builder
         */
        public Builder startLine(Integer startLine) {
            this.startLine = startLine;
            this.__explicitlySet__.add("startLine");
            return this;
        }
        /** End line of the statement. */
        @com.fasterxml.jackson.annotation.JsonProperty("endLine")
        private Integer endLine;

        /**
         * End line of the statement.
         *
         * @param endLine the value to set
         * @return this builder
         */
        public Builder endLine(Integer endLine) {
            this.endLine = endLine;
            this.__explicitlySet__.add("endLine");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExecuteSqlResponseItemStatementPos build() {
            ExecuteSqlResponseItemStatementPos model =
                    new ExecuteSqlResponseItemStatementPos(this.startLine, this.endLine);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExecuteSqlResponseItemStatementPos model) {
            if (model.wasPropertyExplicitlySet("startLine")) {
                this.startLine(model.getStartLine());
            }
            if (model.wasPropertyExplicitlySet("endLine")) {
                this.endLine(model.getEndLine());
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

    /** Start line of the statement. First start line is 1. */
    @com.fasterxml.jackson.annotation.JsonProperty("startLine")
    private final Integer startLine;

    /**
     * Start line of the statement. First start line is 1.
     *
     * @return the value
     */
    public Integer getStartLine() {
        return startLine;
    }

    /** End line of the statement. */
    @com.fasterxml.jackson.annotation.JsonProperty("endLine")
    private final Integer endLine;

    /**
     * End line of the statement.
     *
     * @return the value
     */
    public Integer getEndLine() {
        return endLine;
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
        sb.append("ExecuteSqlResponseItemStatementPos(");
        sb.append("super=").append(super.toString());
        sb.append("startLine=").append(String.valueOf(this.startLine));
        sb.append(", endLine=").append(String.valueOf(this.endLine));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExecuteSqlResponseItemStatementPos)) {
            return false;
        }

        ExecuteSqlResponseItemStatementPos other = (ExecuteSqlResponseItemStatementPos) o;
        return java.util.Objects.equals(this.startLine, other.startLine)
                && java.util.Objects.equals(this.endLine, other.endLine)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.startLine == null ? 43 : this.startLine.hashCode());
        result = (result * PRIME) + (this.endLine == null ? 43 : this.endLine.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
