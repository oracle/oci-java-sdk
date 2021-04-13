/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Base policy for Response Cache lookup.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type",
    defaultImpl = ResponseCacheLookupPolicy.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = SimpleLookupPolicy.class,
        name = "SIMPLE_LOOKUP_POLICY"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ResponseCacheLookupPolicy {

    /**
     * Whether this policy is currently enabled.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    Boolean isEnabled;

    /**
     * Set true to allow caching responses where the request has an Authorization header. Ensure you have configured your
     * cache key additions to get the level of isolation across authenticated requests that you require.
     * <p>
     * When false, any request with an Authorization header will not be stored in the Response Cache.
     * <p>
     * If using the CustomAuthenticationPolicy then the tokenHeader/tokenQueryParam are also subject to this check.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isPrivateCachingEnabled")
    Boolean isPrivateCachingEnabled;

    /**
     * Type of the Response Cache Store Policy.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Type {
        SimpleLookupPolicy("SIMPLE_LOOKUP_POLICY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
}
