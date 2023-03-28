/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.devops.model;

/**
 * The result of validating the credentials of a connection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ConnectionValidationResult.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class ConnectionValidationResult
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"result", "timeValidated", "message"})
    public ConnectionValidationResult(Result result, java.util.Date timeValidated, String message) {
        super();
        this.result = result;
        this.timeValidated = timeValidated;
        this.message = message;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The latest result of whether the credentials pass the validation. */
        @com.fasterxml.jackson.annotation.JsonProperty("result")
        private Result result;

        /**
         * The latest result of whether the credentials pass the validation.
         *
         * @param result the value to set
         * @return this builder
         */
        public Builder result(Result result) {
            this.result = result;
            this.__explicitlySet__.add("result");
            return this;
        }
        /**
         * The latest timestamp when the connection was validated. Format defined by
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeValidated")
        private java.util.Date timeValidated;

        /**
         * The latest timestamp when the connection was validated. Format defined by
         * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
         *
         * @param timeValidated the value to set
         * @return this builder
         */
        public Builder timeValidated(java.util.Date timeValidated) {
            this.timeValidated = timeValidated;
            this.__explicitlySet__.add("timeValidated");
            return this;
        }
        /** A message describing the result of connection validation in more detail. */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * A message describing the result of connection validation in more detail.
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

        public ConnectionValidationResult build() {
            ConnectionValidationResult model =
                    new ConnectionValidationResult(this.result, this.timeValidated, this.message);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConnectionValidationResult model) {
            if (model.wasPropertyExplicitlySet("result")) {
                this.result(model.getResult());
            }
            if (model.wasPropertyExplicitlySet("timeValidated")) {
                this.timeValidated(model.getTimeValidated());
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

    /** The latest result of whether the credentials pass the validation. */
    public enum Result implements com.oracle.bmc.http.internal.BmcEnum {
        Pass("PASS"),
        Fail("FAIL"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Result.class);

        private final String value;
        private static java.util.Map<String, Result> map;

        static {
            map = new java.util.HashMap<>();
            for (Result v : Result.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Result(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Result create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Result', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The latest result of whether the credentials pass the validation. */
    @com.fasterxml.jackson.annotation.JsonProperty("result")
    private final Result result;

    /**
     * The latest result of whether the credentials pass the validation.
     *
     * @return the value
     */
    public Result getResult() {
        return result;
    }

    /**
     * The latest timestamp when the connection was validated. Format defined by
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeValidated")
    private final java.util.Date timeValidated;

    /**
     * The latest timestamp when the connection was validated. Format defined by
     * [RFC3339](https://datatracker.ietf.org/doc/html/rfc3339).
     *
     * @return the value
     */
    public java.util.Date getTimeValidated() {
        return timeValidated;
    }

    /** A message describing the result of connection validation in more detail. */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * A message describing the result of connection validation in more detail.
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
        sb.append("ConnectionValidationResult(");
        sb.append("super=").append(super.toString());
        sb.append("result=").append(String.valueOf(this.result));
        sb.append(", timeValidated=").append(String.valueOf(this.timeValidated));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConnectionValidationResult)) {
            return false;
        }

        ConnectionValidationResult other = (ConnectionValidationResult) o;
        return java.util.Objects.equals(this.result, other.result)
                && java.util.Objects.equals(this.timeValidated, other.timeValidated)
                && java.util.Objects.equals(this.message, other.message)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.result == null ? 43 : this.result.hashCode());
        result =
                (result * PRIME)
                        + (this.timeValidated == null ? 43 : this.timeValidated.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
