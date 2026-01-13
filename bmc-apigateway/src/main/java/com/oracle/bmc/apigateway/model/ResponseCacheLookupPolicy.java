/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Base policy for Response Cache lookup. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = ResponseCacheLookupPolicy.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = SimpleLookupPolicy.class,
            name = "SIMPLE_LOOKUP_POLICY")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class ResponseCacheLookupPolicy
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isEnabled", "isPrivateCachingEnabled"})
    protected ResponseCacheLookupPolicy(Boolean isEnabled, Boolean isPrivateCachingEnabled) {
        super();
        this.isEnabled = isEnabled;
        this.isPrivateCachingEnabled = isPrivateCachingEnabled;
    }

    /** Whether this policy is currently enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Whether this policy is currently enabled.
     *
     * @return the value
     */
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * Set true to allow caching responses where the request has an Authorization header. Ensure you
     * have configured your cache key additions to get the level of isolation across authenticated
     * requests that you require.
     *
     * <p>When false, any request with an Authorization header will not be stored in the Response
     * Cache.
     *
     * <p>If using the CustomAuthenticationPolicy then the tokenHeader/tokenQueryParam are also
     * subject to this check.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isPrivateCachingEnabled")
    private final Boolean isPrivateCachingEnabled;

    /**
     * Set true to allow caching responses where the request has an Authorization header. Ensure you
     * have configured your cache key additions to get the level of isolation across authenticated
     * requests that you require.
     *
     * <p>When false, any request with an Authorization header will not be stored in the Response
     * Cache.
     *
     * <p>If using the CustomAuthenticationPolicy then the tokenHeader/tokenQueryParam are also
     * subject to this check.
     *
     * @return the value
     */
    public Boolean getIsPrivateCachingEnabled() {
        return isPrivateCachingEnabled;
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
        sb.append("ResponseCacheLookupPolicy(");
        sb.append("super=").append(super.toString());
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", isPrivateCachingEnabled=")
                .append(String.valueOf(this.isPrivateCachingEnabled));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResponseCacheLookupPolicy)) {
            return false;
        }

        ResponseCacheLookupPolicy other = (ResponseCacheLookupPolicy) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(
                        this.isPrivateCachingEnabled, other.isPrivateCachingEnabled)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isPrivateCachingEnabled == null
                                ? 43
                                : this.isPrivateCachingEnabled.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Type of the Response Cache Store Policy. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        SimpleLookupPolicy("SIMPLE_LOOKUP_POLICY"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

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
