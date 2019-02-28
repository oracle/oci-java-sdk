/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = FailureDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class FailureDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("code")
        private Code code;

        public Builder code(Code code) {
            this.code = code;
            this.__explicitlySet__.add("code");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public FailureDetails build() {
            FailureDetails __instance__ = new FailureDetails(code, message);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(FailureDetails o) {
            Builder copiedBuilder = code(o.getCode()).message(o.getMessage());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * Job failure reason.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Code {
        InternalServiceError("INTERNAL_SERVICE_ERROR"),
        TerraformExecutionError("TERRAFORM_EXECUTION_ERROR"),
        TerraformConfigUnzipFailed("TERRAFORM_CONFIG_UNZIP_FAILED"),
        InvalidWorkingDirectory("INVALID_WORKING_DIRECTORY"),
        JobTimeout("JOB_TIMEOUT"),
        TerraformConfigVirusFound("TERRAFORM_CONFIG_VIRUS_FOUND"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Code> map;

        static {
            map = new java.util.HashMap<>();
            for (Code v : Code.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Code(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Code create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Code', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
    /**
     * Job failure reason.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("code")
    Code code;

    /**
     * A human-readable error string.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    String message;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
