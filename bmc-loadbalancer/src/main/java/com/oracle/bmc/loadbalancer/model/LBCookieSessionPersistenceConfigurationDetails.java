/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The configuration details for implementing load balancer cookie session persistence (LB cookie stickiness).
 * <p>
 * Session persistence enables the Load Balancing service to direct all requests that originate from a single logical
 * client to a single backend web server. For more information, see
 * [Session Persistence](https://docs.cloud.oracle.com/Content/Balance/Reference/sessionpersistence.htm).
 * <p>
 * When you configure LB cookie stickiness, the load balancer inserts a cookie into the response. The parameters configured
 * in the cookie enable session stickiness. This method is useful when you have applications and Web backend services
 * that cannot generate their own cookies.
 * <p>
 * Path route rules take precedence to determine the target backend server. The load balancer verifies that session stickiness
 * is enabled for the backend server and that the cookie configuration (domain, path, and cookie hash) is valid for the
 * target. The system ignores invalid cookies.
 * <p>
 * To disable LB cookie stickiness on a running load balancer, use the
 * {@link #updateBackendSet(UpdateBackendSetRequest) updateBackendSet} operation and specify `null` for the
 * `LBCookieSessionPersistenceConfigurationDetails` object.
 * <p>
 * Example: `LBCookieSessionPersistenceConfigurationDetails: null`
 * <p>
 **Note:** `SessionPersistenceConfigurationDetails` (application cookie stickiness) and `LBCookieSessionPersistenceConfigurationDetails`
 * (LB cookie stickiness) are mutually exclusive. An error results if you try to enable both types of session persistence.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = LBCookieSessionPersistenceConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class LBCookieSessionPersistenceConfigurationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("cookieName")
        private String cookieName;

        public Builder cookieName(String cookieName) {
            this.cookieName = cookieName;
            this.__explicitlySet__.add("cookieName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("disableFallback")
        private Boolean disableFallback;

        public Builder disableFallback(Boolean disableFallback) {
            this.disableFallback = disableFallback;
            this.__explicitlySet__.add("disableFallback");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxAgeInSeconds")
        private Integer maxAgeInSeconds;

        public Builder maxAgeInSeconds(Integer maxAgeInSeconds) {
            this.maxAgeInSeconds = maxAgeInSeconds;
            this.__explicitlySet__.add("maxAgeInSeconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isSecure")
        private Boolean isSecure;

        public Builder isSecure(Boolean isSecure) {
            this.isSecure = isSecure;
            this.__explicitlySet__.add("isSecure");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isHttpOnly")
        private Boolean isHttpOnly;

        public Builder isHttpOnly(Boolean isHttpOnly) {
            this.isHttpOnly = isHttpOnly;
            this.__explicitlySet__.add("isHttpOnly");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LBCookieSessionPersistenceConfigurationDetails build() {
            LBCookieSessionPersistenceConfigurationDetails __instance__ =
                    new LBCookieSessionPersistenceConfigurationDetails(
                            cookieName,
                            disableFallback,
                            domain,
                            path,
                            maxAgeInSeconds,
                            isSecure,
                            isHttpOnly);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LBCookieSessionPersistenceConfigurationDetails o) {
            Builder copiedBuilder =
                    cookieName(o.getCookieName())
                            .disableFallback(o.getDisableFallback())
                            .domain(o.getDomain())
                            .path(o.getPath())
                            .maxAgeInSeconds(o.getMaxAgeInSeconds())
                            .isSecure(o.getIsSecure())
                            .isHttpOnly(o.getIsHttpOnly());

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
     * The name of the cookie inserted by the load balancer. If this field is not configured, the cookie name defaults
     * to \"X-Oracle-BMC-LBS-Route\".
     * <p>
     * Example: `example_cookie`
     * <p>
     **Notes:**
     * <p>
     *  Ensure that the cookie name used at the backend application servers is different from the cookie name used
     *    at the load balancer. To minimize the chance of name collision, Oracle recommends that you use a prefix
     *    such as \"X-Oracle-OCI-\" for this field.
     * <p>
     *  If a backend server and the load balancer both insert cookies with the same name, the client or browser
     *    behavior can vary depending on the domain and path values associated with the cookie. If the name, domain,
     *    and path values of the `Set-cookie` generated by a backend server and the `Set-cookie` generated by the
     *    load balancer are all the same, the client or browser treats them as one cookie and returns only one of
     *    the cookie values in subsequent requests. If both `Set-cookie` names are the same, but the domain and path
     *    names are different, the client or browser treats them as two different cookies.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cookieName")
    String cookieName;

    /**
     * Whether the load balancer is prevented from directing traffic from a persistent session client to
     * a different backend server if the original server is unavailable. Defaults to false.
     * <p>
     * Example: `false`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("disableFallback")
    Boolean disableFallback;

    /**
     * The domain in which the cookie is valid. The `Set-cookie` header inserted by the load balancer contains a
     * domain attribute with the specified value.
     * <p>
     * This attribute has no default value. If you do not specify a value, the load balancer does not insert the domain
     * attribute into the `Set-cookie` header.
     * <p>
     **Notes:**
     * <p>
     *  [RFC 6265 - HTTP State Management Mechanism](https://www.ietf.org/rfc/rfc6265.txt) describes client and
     *    browser behavior when the domain attribute is present or not present in the `Set-cookie` header.
     * <p>
     * If the value of the `Domain` attribute is `example.com` in the `Set-cookie` header, the client includes
     *    the same cookie in the `Cookie` header when making HTTP requests to `example.com`, `www.example.com`, and
     *    `www.abc.example.com`. If the `Domain` attribute is not present, the client returns the cookie only for
     *    the domain to which the original request was made.
     * <p>
     *  Ensure that this attribute specifies the correct domain value. If the `Domain` attribute in the `Set-cookie`
     *    header does not include the domain to which the original request was made, the client or browser might reject
     *    the cookie. As specified in RFC 6265, the client accepts a cookie with the `Domain` attribute value `example.com`
     *    or `www.example.com` sent from `www.example.com`. It does not accept a cookie with the `Domain` attribute
     *    `abc.example.com` or `www.abc.example.com` sent from `www.example.com`.
     * <p>
     * Example: `example.com`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    String domain;

    /**
     * The path in which the cookie is valid. The `Set-cookie header` inserted by the load balancer contains a `Path`
     * attribute with the specified value.
     * <p>
     * Clients include the cookie in an HTTP request only if the path portion of the request-uri matches, or is a
     * subdirectory of, the cookie's `Path` attribute.
     * <p>
     * The default value is `/`.
     * <p>
     * Example: `/example`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    String path;

    /**
     * The amount of time the cookie remains valid. The `Set-cookie` header inserted by the load balancer contains
     * a `Max-Age` attribute with the specified value.
     * <p>
     * The specified value must be at least one second. There is no default value for this attribute. If you do not
     * specify a value, the load balancer does not include the `Max-Age` attribute in the `Set-cookie` header. In
     * most cases, the client or browser retains the cookie until the current session ends, as defined by the client.
     * <p>
     * Example: `3600`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxAgeInSeconds")
    Integer maxAgeInSeconds;

    /**
     * Whether the `Set-cookie` header should contain the `Secure` attribute. If `true`, the `Set-cookie` header
     * inserted by the load balancer contains the `Secure` attribute, which directs the client or browser to send the
     * cookie only using a secure protocol.
     * <p>
     **Note:** If you set this field to `true`, you cannot associate the corresponding backend set with an HTTP
     * listener.
     * <p>
     * Example: `true`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isSecure")
    Boolean isSecure;

    /**
     * Whether the `Set-cookie` header should contain the `HttpOnly` attribute. If `true`, the `Set-cookie` header
     * inserted by the load balancer contains the `HttpOnly` attribute, which limits the scope of the cookie to HTTP
     * requests. This attribute directs the client or browser to omit the cookie when providing access to cookies
     * through non-HTTP APIs. For example, it restricts the cookie from JavaScript channels.
     * <p>
     * Example: `true`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isHttpOnly")
    Boolean isHttpOnly;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
