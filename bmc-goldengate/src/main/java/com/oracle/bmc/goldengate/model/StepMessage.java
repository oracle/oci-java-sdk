/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Contents of a step message. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = StepMessage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class StepMessage extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"message", "code", "timestamp", "severity"})
    public StepMessage(
            String message, String code, java.util.Date timestamp, SeverityType severity) {
        super();
        this.message = message;
        this.code = code;
        this.timestamp = timestamp;
        this.severity = severity;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The status message of the steps in a recipe during pipeline initialization.
         * https://docs.oracle.com/en/middleware/goldengate/core/23/oggra/rest-endpoints.html
         */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * The status message of the steps in a recipe during pipeline initialization.
         * https://docs.oracle.com/en/middleware/goldengate/core/23/oggra/rest-endpoints.html
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
         * The code returned when GoldenGate reports an error while running a step during pipeline
         * initialization.
         * https://docs.oracle.com/en/middleware/goldengate/core/23/error-messages/ogg-00001-ogg-40000.html#GUID-97FF7AA7-7A5C-4AA7-B29F-3CC8D26761F2
         */
        @com.fasterxml.jackson.annotation.JsonProperty("code")
        private String code;

        /**
         * The code returned when GoldenGate reports an error while running a step during pipeline
         * initialization.
         * https://docs.oracle.com/en/middleware/goldengate/core/23/error-messages/ogg-00001-ogg-40000.html#GUID-97FF7AA7-7A5C-4AA7-B29F-3CC8D26761F2
         *
         * @param code the value to set
         * @return this builder
         */
        public Builder code(String code) {
            this.code = code;
            this.__explicitlySet__.add("code");
            return this;
        }
        /**
         * Date and time of a message issued by steps in a recipe during pipeline initialization.
         * The format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code
         * 2024-07-25T21:10:29.600Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        /**
         * Date and time of a message issued by steps in a recipe during pipeline initialization.
         * The format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code
         * 2024-07-25T21:10:29.600Z}.
         *
         * @param timestamp the value to set
         * @return this builder
         */
        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }
        /**
         * The severity returned when calling GoldenGate API messages for a step in a recipe during
         * pipeline initialization.
         * https://docs.oracle.com/en/middleware/goldengate/core/23/oggra/rest-endpoints.html
         */
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private SeverityType severity;

        /**
         * The severity returned when calling GoldenGate API messages for a step in a recipe during
         * pipeline initialization.
         * https://docs.oracle.com/en/middleware/goldengate/core/23/oggra/rest-endpoints.html
         *
         * @param severity the value to set
         * @return this builder
         */
        public Builder severity(SeverityType severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StepMessage build() {
            StepMessage model =
                    new StepMessage(this.message, this.code, this.timestamp, this.severity);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StepMessage model) {
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("code")) {
                this.code(model.getCode());
            }
            if (model.wasPropertyExplicitlySet("timestamp")) {
                this.timestamp(model.getTimestamp());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
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
     * The status message of the steps in a recipe during pipeline initialization.
     * https://docs.oracle.com/en/middleware/goldengate/core/23/oggra/rest-endpoints.html
     */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * The status message of the steps in a recipe during pipeline initialization.
     * https://docs.oracle.com/en/middleware/goldengate/core/23/oggra/rest-endpoints.html
     *
     * @return the value
     */
    public String getMessage() {
        return message;
    }

    /**
     * The code returned when GoldenGate reports an error while running a step during pipeline
     * initialization.
     * https://docs.oracle.com/en/middleware/goldengate/core/23/error-messages/ogg-00001-ogg-40000.html#GUID-97FF7AA7-7A5C-4AA7-B29F-3CC8D26761F2
     */
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    private final String code;

    /**
     * The code returned when GoldenGate reports an error while running a step during pipeline
     * initialization.
     * https://docs.oracle.com/en/middleware/goldengate/core/23/error-messages/ogg-00001-ogg-40000.html#GUID-97FF7AA7-7A5C-4AA7-B29F-3CC8D26761F2
     *
     * @return the value
     */
    public String getCode() {
        return code;
    }

    /**
     * Date and time of a message issued by steps in a recipe during pipeline initialization. The
     * format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code
     * 2024-07-25T21:10:29.600Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    private final java.util.Date timestamp;

    /**
     * Date and time of a message issued by steps in a recipe during pipeline initialization. The
     * format is defined by [RFC3339](https://tools.ietf.org/html/rfc3339), such as {@code
     * 2024-07-25T21:10:29.600Z}.
     *
     * @return the value
     */
    public java.util.Date getTimestamp() {
        return timestamp;
    }

    /**
     * The severity returned when calling GoldenGate API messages for a step in a recipe during
     * pipeline initialization.
     * https://docs.oracle.com/en/middleware/goldengate/core/23/oggra/rest-endpoints.html
     */
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final SeverityType severity;

    /**
     * The severity returned when calling GoldenGate API messages for a step in a recipe during
     * pipeline initialization.
     * https://docs.oracle.com/en/middleware/goldengate/core/23/oggra/rest-endpoints.html
     *
     * @return the value
     */
    public SeverityType getSeverity() {
        return severity;
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
        sb.append("StepMessage(");
        sb.append("super=").append(super.toString());
        sb.append("message=").append(String.valueOf(this.message));
        sb.append(", code=").append(String.valueOf(this.code));
        sb.append(", timestamp=").append(String.valueOf(this.timestamp));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StepMessage)) {
            return false;
        }

        StepMessage other = (StepMessage) o;
        return java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.code, other.code)
                && java.util.Objects.equals(this.timestamp, other.timestamp)
                && java.util.Objects.equals(this.severity, other.severity)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.code == null ? 43 : this.code.hashCode());
        result = (result * PRIME) + (this.timestamp == null ? 43 : this.timestamp.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
