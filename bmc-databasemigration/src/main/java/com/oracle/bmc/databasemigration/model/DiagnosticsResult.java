/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Result from Database Connection Diagnostic action. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DiagnosticsResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DiagnosticsResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"resultType", "error"})
    public DiagnosticsResult(ResultType resultType, ResultError error) {
        super();
        this.resultType = resultType;
        this.error = error;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Type of the Result (i.e. Success or Failure). */
        @com.fasterxml.jackson.annotation.JsonProperty("resultType")
        private ResultType resultType;

        /**
         * Type of the Result (i.e. Success or Failure).
         *
         * @param resultType the value to set
         * @return this builder
         */
        public Builder resultType(ResultType resultType) {
            this.resultType = resultType;
            this.__explicitlySet__.add("resultType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("error")
        private ResultError error;

        public Builder error(ResultError error) {
            this.error = error;
            this.__explicitlySet__.add("error");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DiagnosticsResult build() {
            DiagnosticsResult model = new DiagnosticsResult(this.resultType, this.error);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DiagnosticsResult model) {
            if (model.wasPropertyExplicitlySet("resultType")) {
                this.resultType(model.getResultType());
            }
            if (model.wasPropertyExplicitlySet("error")) {
                this.error(model.getError());
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

    /** Type of the Result (i.e. Success or Failure). */
    @com.fasterxml.jackson.annotation.JsonProperty("resultType")
    private final ResultType resultType;

    /**
     * Type of the Result (i.e. Success or Failure).
     *
     * @return the value
     */
    public ResultType getResultType() {
        return resultType;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("error")
    private final ResultError error;

    public ResultError getError() {
        return error;
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
        sb.append("DiagnosticsResult(");
        sb.append("super=").append(super.toString());
        sb.append("resultType=").append(String.valueOf(this.resultType));
        sb.append(", error=").append(String.valueOf(this.error));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DiagnosticsResult)) {
            return false;
        }

        DiagnosticsResult other = (DiagnosticsResult) o;
        return java.util.Objects.equals(this.resultType, other.resultType)
                && java.util.Objects.equals(this.error, other.error)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.resultType == null ? 43 : this.resultType.hashCode());
        result = (result * PRIME) + (this.error == null ? 43 : this.error.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
