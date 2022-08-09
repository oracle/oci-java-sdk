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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = StickyCookieLoadBalancingMethod.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "method"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class StickyCookieLoadBalancingMethod extends LoadBalancingMethod {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the cookie used to track the persistence.
         * Can contain any US-ASCII character except separator or control character.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the cookie used to track the persistence.
         * Can contain any US-ASCII character except separator or control character.
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The domain for which the cookie is set, defaults to WAAS policy domain.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        /**
         * The domain for which the cookie is set, defaults to WAAS policy domain.
         *
         * @param domain the value to set
         * @return this builder
         **/
        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }
        /**
         * The time for which a browser should keep the cookie in seconds.
         * Empty value will cause the cookie to expire at the end of a browser session.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("expirationTimeInSeconds")
        private Integer expirationTimeInSeconds;

        /**
         * The time for which a browser should keep the cookie in seconds.
         * Empty value will cause the cookie to expire at the end of a browser session.
         *
         * @param expirationTimeInSeconds the value to set
         * @return this builder
         **/
        public Builder expirationTimeInSeconds(Integer expirationTimeInSeconds) {
            this.expirationTimeInSeconds = expirationTimeInSeconds;
            this.__explicitlySet__.add("expirationTimeInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public StickyCookieLoadBalancingMethod build() {
            StickyCookieLoadBalancingMethod model =
                    new StickyCookieLoadBalancingMethod(
                            this.name, this.domain, this.expirationTimeInSeconds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(StickyCookieLoadBalancingMethod model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("domain")) {
                this.domain(model.getDomain());
            }
            if (model.wasPropertyExplicitlySet("expirationTimeInSeconds")) {
                this.expirationTimeInSeconds(model.getExpirationTimeInSeconds());
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
    private final String name;

    /**
     * The name of the cookie used to track the persistence.
     * Can contain any US-ASCII character except separator or control character.
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The domain for which the cookie is set, defaults to WAAS policy domain.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final String domain;

    /**
     * The domain for which the cookie is set, defaults to WAAS policy domain.
     *
     * @return the value
     **/
    public String getDomain() {
        return domain;
    }

    /**
     * The time for which a browser should keep the cookie in seconds.
     * Empty value will cause the cookie to expire at the end of a browser session.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("expirationTimeInSeconds")
    private final Integer expirationTimeInSeconds;

    /**
     * The time for which a browser should keep the cookie in seconds.
     * Empty value will cause the cookie to expire at the end of a browser session.
     *
     * @return the value
     **/
    public Integer getExpirationTimeInSeconds() {
        return expirationTimeInSeconds;
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
        sb.append("StickyCookieLoadBalancingMethod(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", domain=").append(String.valueOf(this.domain));
        sb.append(", expirationTimeInSeconds=")
                .append(String.valueOf(this.expirationTimeInSeconds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof StickyCookieLoadBalancingMethod)) {
            return false;
        }

        StickyCookieLoadBalancingMethod other = (StickyCookieLoadBalancingMethod) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(
                        this.expirationTimeInSeconds, other.expirationTimeInSeconds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result =
                (result * PRIME)
                        + (this.expirationTimeInSeconds == null
                                ? 43
                                : this.expirationTimeInSeconds.hashCode());
        return result;
    }
}
