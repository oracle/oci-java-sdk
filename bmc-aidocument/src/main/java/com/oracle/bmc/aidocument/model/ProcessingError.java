/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aidocument.model;

/**
 * The error in document processing. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221109")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ProcessingError.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ProcessingError
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"code", "message"})
    public ProcessingError(String code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The error code. */
        @com.fasterxml.jackson.annotation.JsonProperty("code")
        private String code;

        /**
         * The error code.
         *
         * @param code the value to set
         * @return this builder
         */
        public Builder code(String code) {
            this.code = code;
            this.__explicitlySet__.add("code");
            return this;
        }
        /** The error message. */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * The error message.
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProcessingError build() {
            ProcessingError model = new ProcessingError(this.code, this.message);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProcessingError model) {
            if (model.wasPropertyExplicitlySet("code")) {
                this.code(model.getCode());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
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

    /** The error code. */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    private final String code;

    /**
     * The error code.
     *
     * @return the value
     */
    public String getCode() {
        return code;
    }

    /** The error message. */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * The error message.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
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
        sb.append("ProcessingError(");
        sb.append("super=").append(super.toString());
        sb.append("code=").append(String.valueOf(this.code));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ProcessingError)) {
            return false;
        }

        ProcessingError other = (ProcessingError) o;
        return java.util.Objects.equals(this.code, other.code)
                && java.util.Objects.equals(this.message, other.message)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.code == null ? 43 : this.code.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
