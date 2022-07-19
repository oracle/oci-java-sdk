/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Detail of an error or warning.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ApiValidationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ApiValidationDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"details", "name", "result"})
    public ApiValidationDetails(
            java.util.List<ApiValidationDetail> details, String name, Result result) {
        super();
        this.details = details;
        this.name = name;
        this.result = result;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Details of validation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("details")
        private java.util.List<ApiValidationDetail> details;

        /**
         * Details of validation.
         * @param details the value to set
         * @return this builder
         **/
        public Builder details(java.util.List<ApiValidationDetail> details) {
            this.details = details;
            this.__explicitlySet__.add("details");
            return this;
        }
        /**
         * Name of the validation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the validation.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Result of the validation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("result")
        private Result result;

        /**
         * Result of the validation.
         * @param result the value to set
         * @return this builder
         **/
        public Builder result(Result result) {
            this.result = result;
            this.__explicitlySet__.add("result");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApiValidationDetails build() {
            ApiValidationDetails __instance__ = new ApiValidationDetails(details, name, result);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApiValidationDetails o) {
            Builder copiedBuilder = details(o.getDetails()).name(o.getName()).result(o.getResult());

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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Details of validation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("details")
    private final java.util.List<ApiValidationDetail> details;

    /**
     * Details of validation.
     * @return the value
     **/
    public java.util.List<ApiValidationDetail> getDetails() {
        return details;
    }

    /**
     * Name of the validation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the validation.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Result of the validation.
     **/
    public enum Result {
        Error("ERROR"),
        Warning("WARNING"),
        Ok("OK"),
        Failed("FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
    /**
     * Result of the validation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("result")
    private final Result result;

    /**
     * Result of the validation.
     * @return the value
     **/
    public Result getResult() {
        return result;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ApiValidationDetails(");
        sb.append("details=").append(String.valueOf(this.details));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", result=").append(String.valueOf(this.result));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApiValidationDetails)) {
            return false;
        }

        ApiValidationDetails other = (ApiValidationDetails) o;
        return java.util.Objects.equals(this.details, other.details)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.result, other.result)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.details == null ? 43 : this.details.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.result == null ? 43 : this.result.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
