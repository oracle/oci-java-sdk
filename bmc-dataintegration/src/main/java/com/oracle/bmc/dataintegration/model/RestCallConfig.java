/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The REST API configuration.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RestCallConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RestCallConfig extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"methodType", "requestHeaders", "configValues"})
    public RestCallConfig(
            MethodType methodType,
            java.util.Map<String, String> requestHeaders,
            ConfigValues configValues) {
        super();
        this.methodType = methodType;
        this.requestHeaders = requestHeaders;
        this.configValues = configValues;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The REST method to use.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("methodType")
        private MethodType methodType;

        /**
         * The REST method to use.
         * @param methodType the value to set
         * @return this builder
         **/
        public Builder methodType(MethodType methodType) {
            this.methodType = methodType;
            this.__explicitlySet__.add("methodType");
            return this;
        }
        /**
         * The headers for the REST call.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("requestHeaders")
        private java.util.Map<String, String> requestHeaders;

        /**
         * The headers for the REST call.
         * @param requestHeaders the value to set
         * @return this builder
         **/
        public Builder requestHeaders(java.util.Map<String, String> requestHeaders) {
            this.requestHeaders = requestHeaders;
            this.__explicitlySet__.add("requestHeaders");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("configValues")
        private ConfigValues configValues;

        public Builder configValues(ConfigValues configValues) {
            this.configValues = configValues;
            this.__explicitlySet__.add("configValues");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RestCallConfig build() {
            RestCallConfig model =
                    new RestCallConfig(this.methodType, this.requestHeaders, this.configValues);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RestCallConfig model) {
            if (model.wasPropertyExplicitlySet("methodType")) {
                this.methodType(model.getMethodType());
            }
            if (model.wasPropertyExplicitlySet("requestHeaders")) {
                this.requestHeaders(model.getRequestHeaders());
            }
            if (model.wasPropertyExplicitlySet("configValues")) {
                this.configValues(model.getConfigValues());
            }
            return this;
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
     * The REST method to use.
     **/
    public enum MethodType {
        Get("GET"),
        Post("POST"),
        Patch("PATCH"),
        Delete("DELETE"),
        Put("PUT"),
        ;

        private final String value;
        private static java.util.Map<String, MethodType> map;

        static {
            map = new java.util.HashMap<>();
            for (MethodType v : MethodType.values()) {
                map.put(v.getValue(), v);
            }
        }

        MethodType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MethodType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid MethodType: " + key);
        }
    };
    /**
     * The REST method to use.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("methodType")
    private final MethodType methodType;

    /**
     * The REST method to use.
     * @return the value
     **/
    public MethodType getMethodType() {
        return methodType;
    }

    /**
     * The headers for the REST call.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestHeaders")
    private final java.util.Map<String, String> requestHeaders;

    /**
     * The headers for the REST call.
     * @return the value
     **/
    public java.util.Map<String, String> getRequestHeaders() {
        return requestHeaders;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("configValues")
    private final ConfigValues configValues;

    public ConfigValues getConfigValues() {
        return configValues;
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
        sb.append("RestCallConfig(");
        sb.append("super=").append(super.toString());
        sb.append("methodType=").append(String.valueOf(this.methodType));
        sb.append(", requestHeaders=").append(String.valueOf(this.requestHeaders));
        sb.append(", configValues=").append(String.valueOf(this.configValues));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RestCallConfig)) {
            return false;
        }

        RestCallConfig other = (RestCallConfig) o;
        return java.util.Objects.equals(this.methodType, other.methodType)
                && java.util.Objects.equals(this.requestHeaders, other.requestHeaders)
                && java.util.Objects.equals(this.configValues, other.configValues)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.methodType == null ? 43 : this.methodType.hashCode());
        result =
                (result * PRIME)
                        + (this.requestHeaders == null ? 43 : this.requestHeaders.hashCode());
        result = (result * PRIME) + (this.configValues == null ? 43 : this.configValues.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
