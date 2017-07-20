/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * An object returned in the event of a work request error.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WorkRequestError.Builder.class)
public class WorkRequestError {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    @lombok.Setter
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
        private ErrorCode errorCode;

        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        public WorkRequestError build() {
            return new WorkRequestError(errorCode, message);
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkRequestError o) {
            return errorCode(o.getErrorCode()).message(o.getMessage());
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     **/
    @lombok.extern.slf4j.Slf4j
    public enum ErrorCode {
        BadInput("BAD_INPUT"),
        InternalError("INTERNAL_ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, ErrorCode> map;

        static {
            map = new java.util.HashMap<>();
            for (ErrorCode v : ErrorCode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ErrorCode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ErrorCode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ErrorCode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };

    @com.fasterxml.jackson.annotation.JsonProperty("errorCode")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    ErrorCode errorCode;

    /**
     * A human-readable error string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    @javax.validation.Valid
    @javax.validation.constraints.NotNull
    String message;
}
