/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * An object that represents the {@code sticky-cookie} load balancing method and its properties.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = StickyCookieLoadBalancingMethod.Builder.class
)
@lombok.ToString(callSuper = true)
@lombok.EqualsAndHashCode(callSuper = true)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "method"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class StickyCookieLoadBalancingMethod extends LoadBalancingMethod {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("expirationTimeInSeconds")
        private Integer expirationTimeInSeconds;

        public Builder expirationTimeInSeconds(Integer expirationTimeInSeconds) {
            this.expirationTimeInSeconds = expirationTimeInSeconds;
            this.__explicitlySet__.add("expirationTimeInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StickyCookieLoadBalancingMethod build() {
            StickyCookieLoadBalancingMethod __instance__ =
                    new StickyCookieLoadBalancingMethod(name, domain, expirationTimeInSeconds);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StickyCookieLoadBalancingMethod o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .domain(o.getDomain())
                            .expirationTimeInSeconds(o.getExpirationTimeInSeconds());

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

    @Deprecated
    public StickyCookieLoadBalancingMethod(
            String name, String domain, Integer expirationTimeInSeconds) {
        super();
        this.name = name;
        this.domain = domain;
        this.expirationTimeInSeconds = expirationTimeInSeconds;
    }

    /**
     * The name of the cookie used to track the persistence.
     * Can contain any US-ASCII character except separator or control character.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The domain for which the cookie is set, defaults to WAAS policy domain.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    String domain;

    /**
     * The time for which a browser should keep the cookie in seconds.
     * Empty value will cause the cookie to expire at the end of a browser session.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expirationTimeInSeconds")
    Integer expirationTimeInSeconds;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
