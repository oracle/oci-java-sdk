/**
 * Copyright (c) 2016, 2017, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.loadbalancer.model;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import java.util.*;
import javax.validation.*;
import javax.validation.constraints.*;

import lombok.Value;
import lombok.*;
import lombok.experimental.*;

/**
 * An object returned in the event of a work request error.
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@Value
@JsonDeserialize(builder = WorkRequestError.Builder.class)
public class WorkRequestError {
    @JsonPOJOBuilder(withPrefix = "")
    @Accessors(fluent = true)
    @Setter
    public static class Builder {
        @JsonProperty("errorCode")
        private ErrorCode errorCode;

        @JsonProperty("message")
        private String message;

        public WorkRequestError build() {
            return new WorkRequestError(errorCode, message);
        }

        @JsonIgnore
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
        private static Map<String, ErrorCode> map;

        static {
            map = new HashMap<>();
            for (ErrorCode v : ErrorCode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ErrorCode(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @JsonCreator
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

    @JsonProperty("errorCode")
    @Valid
    @NotNull
    ErrorCode errorCode;

    /**
     * A human-readable error string.
     **/
    @JsonProperty("message")
    @Valid
    @NotNull
    String message;
}
