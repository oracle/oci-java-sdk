/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * A set of public keys that is retrieved at run-time from a remote location
 * to verify the JWT signature. The set should only contain JWK-formatted
 * keys.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = RemoteJsonWebKeySet.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "type"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RemoteJsonWebKeySet extends PublicKeySet {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The uri from which to retrieve the key. It must be accessible
         * without authentication.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("uri")
        private String uri;

        /**
         * The uri from which to retrieve the key. It must be accessible
         * without authentication.
         *
         * @param uri the value to set
         * @return this builder
         **/
        public Builder uri(String uri) {
            this.uri = uri;
            this.__explicitlySet__.add("uri");
            return this;
        }
        /**
         * Defines whether or not to uphold SSL verification.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isSslVerifyDisabled")
        private Boolean isSslVerifyDisabled;

        /**
         * Defines whether or not to uphold SSL verification.
         *
         * @param isSslVerifyDisabled the value to set
         * @return this builder
         **/
        public Builder isSslVerifyDisabled(Boolean isSslVerifyDisabled) {
            this.isSslVerifyDisabled = isSslVerifyDisabled;
            this.__explicitlySet__.add("isSslVerifyDisabled");
            return this;
        }
        /**
         * The duration for which the JWKS should be cached before it is
         * fetched again.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("maxCacheDurationInHours")
        private Integer maxCacheDurationInHours;

        /**
         * The duration for which the JWKS should be cached before it is
         * fetched again.
         *
         * @param maxCacheDurationInHours the value to set
         * @return this builder
         **/
        public Builder maxCacheDurationInHours(Integer maxCacheDurationInHours) {
            this.maxCacheDurationInHours = maxCacheDurationInHours;
            this.__explicitlySet__.add("maxCacheDurationInHours");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RemoteJsonWebKeySet build() {
            RemoteJsonWebKeySet __instance__ =
                    new RemoteJsonWebKeySet(uri, isSslVerifyDisabled, maxCacheDurationInHours);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RemoteJsonWebKeySet o) {
            Builder copiedBuilder =
                    uri(o.getUri())
                            .isSslVerifyDisabled(o.getIsSslVerifyDisabled())
                            .maxCacheDurationInHours(o.getMaxCacheDurationInHours());

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

    @Deprecated
    public RemoteJsonWebKeySet(
            String uri, Boolean isSslVerifyDisabled, Integer maxCacheDurationInHours) {
        super();
        this.uri = uri;
        this.isSslVerifyDisabled = isSslVerifyDisabled;
        this.maxCacheDurationInHours = maxCacheDurationInHours;
    }

    /**
     * The uri from which to retrieve the key. It must be accessible
     * without authentication.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("uri")
    private final String uri;

    /**
     * The uri from which to retrieve the key. It must be accessible
     * without authentication.
     *
     * @return the value
     **/
    public String getUri() {
        return uri;
    }

    /**
     * Defines whether or not to uphold SSL verification.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSslVerifyDisabled")
    private final Boolean isSslVerifyDisabled;

    /**
     * Defines whether or not to uphold SSL verification.
     *
     * @return the value
     **/
    public Boolean getIsSslVerifyDisabled() {
        return isSslVerifyDisabled;
    }

    /**
     * The duration for which the JWKS should be cached before it is
     * fetched again.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxCacheDurationInHours")
    private final Integer maxCacheDurationInHours;

    /**
     * The duration for which the JWKS should be cached before it is
     * fetched again.
     *
     * @return the value
     **/
    public Integer getMaxCacheDurationInHours() {
        return maxCacheDurationInHours;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("RemoteJsonWebKeySet(");
        sb.append("super=").append(super.toString());
        sb.append(", uri=").append(String.valueOf(this.uri));
        sb.append(", isSslVerifyDisabled=").append(String.valueOf(this.isSslVerifyDisabled));
        sb.append(", maxCacheDurationInHours=")
                .append(String.valueOf(this.maxCacheDurationInHours));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoteJsonWebKeySet)) {
            return false;
        }

        RemoteJsonWebKeySet other = (RemoteJsonWebKeySet) o;
        return java.util.Objects.equals(this.uri, other.uri)
                && java.util.Objects.equals(this.isSslVerifyDisabled, other.isSslVerifyDisabled)
                && java.util.Objects.equals(
                        this.maxCacheDurationInHours, other.maxCacheDurationInHours)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__)
                && super.equals(o);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.uri == null ? 43 : this.uri.hashCode());
        result =
                (result * PRIME)
                        + (this.isSslVerifyDisabled == null
                                ? 43
                                : this.isSslVerifyDisabled.hashCode());
        result =
                (result * PRIME)
                        + (this.maxCacheDurationInHours == null
                                ? 43
                                : this.maxCacheDurationInHours.hashCode());
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
