/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.lustrefilestorage.model;

/**
 * An error encountered while performing an operation that is tracked by a work request. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WorkRequestError.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class WorkRequestError
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"code", "message", "timestamp"})
    public WorkRequestError(String code, String message, java.util.Date timestamp) {
        super();
        this.code = code;
        this.message = message;
        this.timestamp = timestamp;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A machine-usable code for the error that occurred. For a list of error codes, see [API
         * Errors](https://docs.oracle.com/iaas/Content/API/References/apierrors.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("code")
        private String code;

        /**
         * A machine-usable code for the error that occurred. For a list of error codes, see [API
         * Errors](https://docs.oracle.com/iaas/Content/API/References/apierrors.htm).
         *
         * @param code the value to set
         * @return this builder
         */
        public Builder code(String code) {
            this.code = code;
            this.__explicitlySet__.add("code");
            return this;
        }
        /** A human-readable error message. */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * A human-readable error message.
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /**
         * The date and time the error occurred, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * The date and time the error occurred, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * @param timestamp the value to set
         * @return this builder
         */
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkRequestError build() {
            WorkRequestError model = new WorkRequestError(this.code, this.message, this.timestamp);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkRequestError model) {
            if (model.wasPropertyExplicitlySet("code")) {
                this.code(model.getCode());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
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

    /**
     * A machine-usable code for the error that occurred. For a list of error codes, see [API
     * Errors](https://docs.oracle.com/iaas/Content/API/References/apierrors.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    private final String code;

    /**
     * A machine-usable code for the error that occurred. For a list of error codes, see [API
     * Errors](https://docs.oracle.com/iaas/Content/API/References/apierrors.htm).
     *
     * @return the value
     */
    public String getCode() {
        return code;
    }

    /** A human-readable error message. */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * A human-readable error message.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /**
     * The date and time the error occurred, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * The date and time the error occurred, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimestamp() {
        return timestamp;
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
        sb.append("WorkRequestError(");
        sb.append("super=").append(super.toString());
        sb.append("code=").append(String.valueOf(this.code));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkRequestError)) {
            return false;
        }

        WorkRequestError other = (WorkRequestError) o;
        return java.util.Objects.equals(this.code, other.code)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.code == null ? 43 : this.code.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
