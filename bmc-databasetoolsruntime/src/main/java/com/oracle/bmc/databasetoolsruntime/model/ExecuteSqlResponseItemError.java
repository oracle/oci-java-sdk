/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * Error details. <br>
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
        builder = ExecuteSqlResponseItemError.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExecuteSqlResponseItemError
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "errorCode",
        "errorLine",
        "errorColumn",
        "errorMessage",
        "errorDetails"
    })
    public ExecuteSqlResponseItemError(
            Integer errorCode,
            Integer errorLine,
            Integer errorColumn,
            String errorMessage,
            String errorDetails) {
        super();
        this.errorCode = errorCode;
        this.errorLine = errorLine;
        this.errorColumn = errorColumn;
        this.errorMessage = errorMessage;
        this.errorDetails = errorDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Error code. */
        @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
        private Integer errorCode;

        /**
         * Error code.
         *
         * @param errorCode the value to set
         * @return this builder
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
            this.__explicitlySet__.add("errorCode");
            return this;
        }
        /** Error line number. */
        @com.fasterxml.jackson.annotation.JsonProperty("errorLine")
        private Integer errorLine;

        /**
         * Error line number.
         *
         * @param errorLine the value to set
         * @return this builder
         */
        public Builder errorLine(Integer errorLine) {
            this.errorLine = errorLine;
            this.__explicitlySet__.add("errorLine");
            return this;
        }
        /** Error column number. */
        @com.fasterxml.jackson.annotation.JsonProperty("errorColumn")
        private Integer errorColumn;

        /**
         * Error column number.
         *
         * @param errorColumn the value to set
         * @return this builder
         */
        public Builder errorColumn(Integer errorColumn) {
            this.errorColumn = errorColumn;
            this.__explicitlySet__.add("errorColumn");
            return this;
        }
        /** Error message. */
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        /**
         * Error message.
         *
         * @param errorMessage the value to set
         * @return this builder
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }
        /** Error details. */
        @com.fasterxml.jackson.annotation.JsonProperty("errorDetails")
        private String errorDetails;

        /**
         * Error details.
         *
         * @param errorDetails the value to set
         * @return this builder
         */
        public Builder errorDetails(String errorDetails) {
            this.errorDetails = errorDetails;
            this.__explicitlySet__.add("errorDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExecuteSqlResponseItemError build() {
            ExecuteSqlResponseItemError model =
                    new ExecuteSqlResponseItemError(
                            this.errorCode,
                            this.errorLine,
                            this.errorColumn,
                            this.errorMessage,
                            this.errorDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExecuteSqlResponseItemError model) {
            if (model.wasPropertyExplicitlySet("errorCode")) {
                this.errorCode(model.getErrorCode());
            }
            if (model.wasPropertyExplicitlySet("errorLine")) {
                this.errorLine(model.getErrorLine());
            }
            if (model.wasPropertyExplicitlySet("errorColumn")) {
                this.errorColumn(model.getErrorColumn());
            }
            if (model.wasPropertyExplicitlySet("errorMessage")) {
                this.errorMessage(model.getErrorMessage());
            }
            if (model.wasPropertyExplicitlySet("errorDetails")) {
                this.errorDetails(model.getErrorDetails());
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

    /** Error code. */
    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    private final Integer errorCode;

    /**
     * Error code.
     *
     * @return the value
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /** Error line number. */
    @com.fasterxml.jackson.annotation.JsonProperty("errorLine")
    private final Integer errorLine;

    /**
     * Error line number.
     *
     * @return the value
     */
    public Integer getErrorLine() {
        return errorLine;
    }

    /** Error column number. */
    @com.fasterxml.jackson.annotation.JsonProperty("errorColumn")
    private final Integer errorColumn;

    /**
     * Error column number.
     *
     * @return the value
     */
    public Integer getErrorColumn() {
        return errorColumn;
    }

    /** Error message. */
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    /**
     * Error message.
     *
     * @return the value
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /** Error details. */
    @com.fasterxml.jackson.annotation.JsonProperty("errorDetails")
    private final String errorDetails;

    /**
     * Error details.
     *
     * @return the value
     */
    public String getErrorDetails() {
        return errorDetails;
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
        sb.append("ExecuteSqlResponseItemError(");
        sb.append("super=").append(super.toString());
        sb.append("errorCode=").append(String.valueOf(this.errorCode));
        sb.append(", errorLine=").append(String.valueOf(this.errorLine));
        sb.append(", errorColumn=").append(String.valueOf(this.errorColumn));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", errorDetails=").append(String.valueOf(this.errorDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExecuteSqlResponseItemError)) {
            return false;
        }

        ExecuteSqlResponseItemError other = (ExecuteSqlResponseItemError) o;
        return java.util.Objects.equals(this.errorCode, other.errorCode)
                && java.util.Objects.equals(this.errorLine, other.errorLine)
                && java.util.Objects.equals(this.errorColumn, other.errorColumn)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && java.util.Objects.equals(this.errorDetails, other.errorDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.errorCode == null ? 43 : this.errorCode.hashCode());
        result = (result * PRIME) + (this.errorLine == null ? 43 : this.errorLine.hashCode());
        result = (result * PRIME) + (this.errorColumn == null ? 43 : this.errorColumn.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result = (result * PRIME) + (this.errorDetails == null ? 43 : this.errorDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
