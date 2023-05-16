/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The configuration details for implementing load balancer cookie session persistence (LB cookie
 * stickiness).
 *
 * <p>Session persistence enables the Load Balancing service to direct all requests that originate
 * from a single logical client to a single backend web server. For more information, see [Session
 * Persistence](https://docs.cloud.oracle.com/Content/Balance/Reference/sessionpersistence.htm).
 *
 * <p>When you configure LB cookie stickiness, the load balancer inserts a cookie into the response.
 * The parameters configured in the cookie enable session stickiness. This method is useful when you
 * have applications and Web backend services that cannot generate their own cookies.
 *
 * <p>Path route rules take precedence to determine the target backend server. The load balancer
 * verifies that session stickiness is enabled for the backend server and that the cookie
 * configuration (domain, path, and cookie hash) is valid for the target. The system ignores invalid
 * cookies.
 *
 * <p>To disable LB cookie stickiness on a running load balancer, use the {@link
 * #updateBackendSet(UpdateBackendSetRequest) updateBackendSet} operation and specify {@code null}
 * for the {@code LBCookieSessionPersistenceConfigurationDetails} object.
 *
 * <p>Example: {@code LBCookieSessionPersistenceConfigurationDetails: null}
 *
 * <p>*Note:** {@code SessionPersistenceConfigurationDetails} (application cookie stickiness) and
 * {@code LBCookieSessionPersistenceConfigurationDetails} (LB cookie stickiness) are mutually
 * exclusive. An error results if you try to enable both types of session persistence.
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = LBCookieSessionPersistenceConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LBCookieSessionPersistenceConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "cookieName",
        "disableFallback",
        "domain",
        "path",
        "maxAgeInSeconds",
        "isSecure",
        "isHttpOnly"
    })
    public LBCookieSessionPersistenceConfigurationDetails(
            String cookieName,
            Boolean disableFallback,
            String domain,
            String path,
            Integer maxAgeInSeconds,
            Boolean isSecure,
            Boolean isHttpOnly) {
        super();
        this.cookieName = cookieName;
        this.disableFallback = disableFallback;
        this.domain = domain;
        this.path = path;
        this.maxAgeInSeconds = maxAgeInSeconds;
        this.isSecure = isSecure;
        this.isHttpOnly = isHttpOnly;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the cookie inserted by the load balancer. If this field is not configured,
         * the cookie name defaults to "X-Oracle-BMC-LBS-Route".
         *
         * <p>Example: {@code example_cookie}
         *
         * <p>*Notes:**
         *
         * <p>Ensure that the cookie name used at the backend application servers is different from
         * the cookie name used at the load balancer. To minimize the chance of name collision,
         * Oracle recommends that you use a prefix such as "X-Oracle-OCI-" for this field.
         *
         * <p>If a backend server and the load balancer both insert cookies with the same name, the
         * client or browser behavior can vary depending on the domain and path values associated
         * with the cookie. If the name, domain, and path values of the {@code Set-cookie} generated
         * by a backend server and the {@code Set-cookie} generated by the load balancer are all the
         * same, the client or browser treats them as one cookie and returns only one of the cookie
         * values in subsequent requests. If both {@code Set-cookie} names are the same, but the
         * domain and path names are different, the client or browser treats them as two different
         * cookies.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cookieName")
        private String cookieName;

        /**
         * The name of the cookie inserted by the load balancer. If this field is not configured,
         * the cookie name defaults to "X-Oracle-BMC-LBS-Route".
         *
         * <p>Example: {@code example_cookie}
         *
         * <p>*Notes:**
         *
         * <p>Ensure that the cookie name used at the backend application servers is different from
         * the cookie name used at the load balancer. To minimize the chance of name collision,
         * Oracle recommends that you use a prefix such as "X-Oracle-OCI-" for this field.
         *
         * <p>If a backend server and the load balancer both insert cookies with the same name, the
         * client or browser behavior can vary depending on the domain and path values associated
         * with the cookie. If the name, domain, and path values of the {@code Set-cookie} generated
         * by a backend server and the {@code Set-cookie} generated by the load balancer are all the
         * same, the client or browser treats them as one cookie and returns only one of the cookie
         * values in subsequent requests. If both {@code Set-cookie} names are the same, but the
         * domain and path names are different, the client or browser treats them as two different
         * cookies.
         *
         * @param cookieName the value to set
         * @return this builder
         */
        public Builder cookieName(String cookieName) {
            this.cookieName = cookieName;
            this.__explicitlySet__.add("cookieName");
            return this;
        }
        /**
         * Whether the load balancer is prevented from directing traffic from a persistent session
         * client to a different backend server if the original server is unavailable. Defaults to
         * false.
         *
         * <p>Example: {@code false}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("disableFallback")
        private Boolean disableFallback;

        /**
         * Whether the load balancer is prevented from directing traffic from a persistent session
         * client to a different backend server if the original server is unavailable. Defaults to
         * false.
         *
         * <p>Example: {@code false}
         *
         * @param disableFallback the value to set
         * @return this builder
         */
        public Builder disableFallback(Boolean disableFallback) {
            this.disableFallback = disableFallback;
            this.__explicitlySet__.add("disableFallback");
            return this;
        }
        /**
         * The domain in which the cookie is valid. The {@code Set-cookie} header inserted by the
         * load balancer contains a domain attribute with the specified value.
         *
         * <p>This attribute has no default value. If you do not specify a value, the load balancer
         * does not insert the domain attribute into the {@code Set-cookie} header.
         *
         * <p>*Notes:**
         *
         * <p>[RFC 6265 - HTTP State Management Mechanism](https://www.ietf.org/rfc/rfc6265.txt)
         * describes client and browser behavior when the domain attribute is present or not present
         * in the {@code Set-cookie} header.
         *
         * <p>If the value of the {@code Domain} attribute is {@code example.com} in the {@code
         * Set-cookie} header, the client includes the same cookie in the {@code Cookie} header when
         * making HTTP requests to {@code example.com}, {@code www.example.com}, and {@code
         * www.abc.example.com}. If the {@code Domain} attribute is not present, the client returns
         * the cookie only for the domain to which the original request was made.
         *
         * <p>Ensure that this attribute specifies the correct domain value. If the {@code Domain}
         * attribute in the {@code Set-cookie} header does not include the domain to which the
         * original request was made, the client or browser might reject the cookie. As specified in
         * RFC 6265, the client accepts a cookie with the {@code Domain} attribute value {@code
         * example.com} or {@code www.example.com} sent from {@code www.example.com}. It does not
         * accept a cookie with the {@code Domain} attribute {@code abc.example.com} or {@code
         * www.abc.example.com} sent from {@code www.example.com}.
         *
         * <p>Example: {@code example.com}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("domain")
        private String domain;

        /**
         * The domain in which the cookie is valid. The {@code Set-cookie} header inserted by the
         * load balancer contains a domain attribute with the specified value.
         *
         * <p>This attribute has no default value. If you do not specify a value, the load balancer
         * does not insert the domain attribute into the {@code Set-cookie} header.
         *
         * <p>*Notes:**
         *
         * <p>[RFC 6265 - HTTP State Management Mechanism](https://www.ietf.org/rfc/rfc6265.txt)
         * describes client and browser behavior when the domain attribute is present or not present
         * in the {@code Set-cookie} header.
         *
         * <p>If the value of the {@code Domain} attribute is {@code example.com} in the {@code
         * Set-cookie} header, the client includes the same cookie in the {@code Cookie} header when
         * making HTTP requests to {@code example.com}, {@code www.example.com}, and {@code
         * www.abc.example.com}. If the {@code Domain} attribute is not present, the client returns
         * the cookie only for the domain to which the original request was made.
         *
         * <p>Ensure that this attribute specifies the correct domain value. If the {@code Domain}
         * attribute in the {@code Set-cookie} header does not include the domain to which the
         * original request was made, the client or browser might reject the cookie. As specified in
         * RFC 6265, the client accepts a cookie with the {@code Domain} attribute value {@code
         * example.com} or {@code www.example.com} sent from {@code www.example.com}. It does not
         * accept a cookie with the {@code Domain} attribute {@code abc.example.com} or {@code
         * www.abc.example.com} sent from {@code www.example.com}.
         *
         * <p>Example: {@code example.com}
         *
         * @param domain the value to set
         * @return this builder
         */
        public Builder domain(String domain) {
            this.domain = domain;
            this.__explicitlySet__.add("domain");
            return this;
        }
        /**
         * The path in which the cookie is valid. The {@code Set-cookie header} inserted by the load
         * balancer contains a {@code Path} attribute with the specified value.
         *
         * <p>Clients include the cookie in an HTTP request only if the path portion of the
         * request-uri matches, or is a subdirectory of, the cookie's {@code Path} attribute.
         *
         * <p>The default value is {@code /}.
         *
         * <p>Example: {@code /example}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * The path in which the cookie is valid. The {@code Set-cookie header} inserted by the load
         * balancer contains a {@code Path} attribute with the specified value.
         *
         * <p>Clients include the cookie in an HTTP request only if the path portion of the
         * request-uri matches, or is a subdirectory of, the cookie's {@code Path} attribute.
         *
         * <p>The default value is {@code /}.
         *
         * <p>Example: {@code /example}
         *
         * @param path the value to set
         * @return this builder
         */
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /**
         * The amount of time the cookie remains valid. The {@code Set-cookie} header inserted by
         * the load balancer contains a {@code Max-Age} attribute with the specified value.
         *
         * <p>The specified value must be at least one second. There is no default value for this
         * attribute. If you do not specify a value, the load balancer does not include the {@code
         * Max-Age} attribute in the {@code Set-cookie} header. In most cases, the client or browser
         * retains the cookie until the current session ends, as defined by the client.
         *
         * <p>Example: {@code 3600}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("maxAgeInSeconds")
        private Integer maxAgeInSeconds;

        /**
         * The amount of time the cookie remains valid. The {@code Set-cookie} header inserted by
         * the load balancer contains a {@code Max-Age} attribute with the specified value.
         *
         * <p>The specified value must be at least one second. There is no default value for this
         * attribute. If you do not specify a value, the load balancer does not include the {@code
         * Max-Age} attribute in the {@code Set-cookie} header. In most cases, the client or browser
         * retains the cookie until the current session ends, as defined by the client.
         *
         * <p>Example: {@code 3600}
         *
         * @param maxAgeInSeconds the value to set
         * @return this builder
         */
        public Builder maxAgeInSeconds(Integer maxAgeInSeconds) {
            this.maxAgeInSeconds = maxAgeInSeconds;
            this.__explicitlySet__.add("maxAgeInSeconds");
            return this;
        }
        /**
         * Whether the {@code Set-cookie} header should contain the {@code Secure} attribute. If
         * {@code true}, the {@code Set-cookie} header inserted by the load balancer contains the
         * {@code Secure} attribute, which directs the client or browser to send the cookie only
         * using a secure protocol.
         *
         * <p>*Note:** If you set this field to {@code true}, you cannot associate the corresponding
         * backend set with an HTTP listener.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isSecure")
        private Boolean isSecure;

        /**
         * Whether the {@code Set-cookie} header should contain the {@code Secure} attribute. If
         * {@code true}, the {@code Set-cookie} header inserted by the load balancer contains the
         * {@code Secure} attribute, which directs the client or browser to send the cookie only
         * using a secure protocol.
         *
         * <p>*Note:** If you set this field to {@code true}, you cannot associate the corresponding
         * backend set with an HTTP listener.
         *
         * <p>Example: {@code true}
         *
         * @param isSecure the value to set
         * @return this builder
         */
        public Builder isSecure(Boolean isSecure) {
            this.isSecure = isSecure;
            this.__explicitlySet__.add("isSecure");
            return this;
        }
        /**
         * Whether the {@code Set-cookie} header should contain the {@code HttpOnly} attribute. If
         * {@code true}, the {@code Set-cookie} header inserted by the load balancer contains the
         * {@code HttpOnly} attribute, which limits the scope of the cookie to HTTP requests. This
         * attribute directs the client or browser to omit the cookie when providing access to
         * cookies through non-HTTP APIs. For example, it restricts the cookie from JavaScript
         * channels.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isHttpOnly")
        private Boolean isHttpOnly;

        /**
         * Whether the {@code Set-cookie} header should contain the {@code HttpOnly} attribute. If
         * {@code true}, the {@code Set-cookie} header inserted by the load balancer contains the
         * {@code HttpOnly} attribute, which limits the scope of the cookie to HTTP requests. This
         * attribute directs the client or browser to omit the cookie when providing access to
         * cookies through non-HTTP APIs. For example, it restricts the cookie from JavaScript
         * channels.
         *
         * <p>Example: {@code true}
         *
         * @param isHttpOnly the value to set
         * @return this builder
         */
        public Builder isHttpOnly(Boolean isHttpOnly) {
            this.isHttpOnly = isHttpOnly;
            this.__explicitlySet__.add("isHttpOnly");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LBCookieSessionPersistenceConfigurationDetails build() {
            LBCookieSessionPersistenceConfigurationDetails model =
                    new LBCookieSessionPersistenceConfigurationDetails(
                            this.cookieName,
                            this.disableFallback,
                            this.domain,
                            this.path,
                            this.maxAgeInSeconds,
                            this.isSecure,
                            this.isHttpOnly);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LBCookieSessionPersistenceConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("cookieName")) {
                this.cookieName(model.getCookieName());
            }
            if (model.wasPropertyExplicitlySet("disableFallback")) {
                this.disableFallback(model.getDisableFallback());
            }
            if (model.wasPropertyExplicitlySet("domain")) {
                this.domain(model.getDomain());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("maxAgeInSeconds")) {
                this.maxAgeInSeconds(model.getMaxAgeInSeconds());
            }
            if (model.wasPropertyExplicitlySet("isSecure")) {
                this.isSecure(model.getIsSecure());
            }
            if (model.wasPropertyExplicitlySet("isHttpOnly")) {
                this.isHttpOnly(model.getIsHttpOnly());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The name of the cookie inserted by the load balancer. If this field is not configured, the
     * cookie name defaults to "X-Oracle-BMC-LBS-Route".
     *
     * <p>Example: {@code example_cookie}
     *
     * <p>*Notes:**
     *
     * <p>Ensure that the cookie name used at the backend application servers is different from the
     * cookie name used at the load balancer. To minimize the chance of name collision, Oracle
     * recommends that you use a prefix such as "X-Oracle-OCI-" for this field.
     *
     * <p>If a backend server and the load balancer both insert cookies with the same name, the
     * client or browser behavior can vary depending on the domain and path values associated with
     * the cookie. If the name, domain, and path values of the {@code Set-cookie} generated by a
     * backend server and the {@code Set-cookie} generated by the load balancer are all the same,
     * the client or browser treats them as one cookie and returns only one of the cookie values in
     * subsequent requests. If both {@code Set-cookie} names are the same, but the domain and path
     * names are different, the client or browser treats them as two different cookies.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cookieName")
    private final String cookieName;

    /**
     * The name of the cookie inserted by the load balancer. If this field is not configured, the
     * cookie name defaults to "X-Oracle-BMC-LBS-Route".
     *
     * <p>Example: {@code example_cookie}
     *
     * <p>*Notes:**
     *
     * <p>Ensure that the cookie name used at the backend application servers is different from the
     * cookie name used at the load balancer. To minimize the chance of name collision, Oracle
     * recommends that you use a prefix such as "X-Oracle-OCI-" for this field.
     *
     * <p>If a backend server and the load balancer both insert cookies with the same name, the
     * client or browser behavior can vary depending on the domain and path values associated with
     * the cookie. If the name, domain, and path values of the {@code Set-cookie} generated by a
     * backend server and the {@code Set-cookie} generated by the load balancer are all the same,
     * the client or browser treats them as one cookie and returns only one of the cookie values in
     * subsequent requests. If both {@code Set-cookie} names are the same, but the domain and path
     * names are different, the client or browser treats them as two different cookies.
     *
     * @return the value
     */
    public String getCookieName() {
        return cookieName;
    }

    /**
     * Whether the load balancer is prevented from directing traffic from a persistent session
     * client to a different backend server if the original server is unavailable. Defaults to
     * false.
     *
     * <p>Example: {@code false}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("disableFallback")
    private final Boolean disableFallback;

    /**
     * Whether the load balancer is prevented from directing traffic from a persistent session
     * client to a different backend server if the original server is unavailable. Defaults to
     * false.
     *
     * <p>Example: {@code false}
     *
     * @return the value
     */
    public Boolean getDisableFallback() {
        return disableFallback;
    }

    /**
     * The domain in which the cookie is valid. The {@code Set-cookie} header inserted by the load
     * balancer contains a domain attribute with the specified value.
     *
     * <p>This attribute has no default value. If you do not specify a value, the load balancer does
     * not insert the domain attribute into the {@code Set-cookie} header.
     *
     * <p>*Notes:**
     *
     * <p>[RFC 6265 - HTTP State Management Mechanism](https://www.ietf.org/rfc/rfc6265.txt)
     * describes client and browser behavior when the domain attribute is present or not present in
     * the {@code Set-cookie} header.
     *
     * <p>If the value of the {@code Domain} attribute is {@code example.com} in the {@code
     * Set-cookie} header, the client includes the same cookie in the {@code Cookie} header when
     * making HTTP requests to {@code example.com}, {@code www.example.com}, and {@code
     * www.abc.example.com}. If the {@code Domain} attribute is not present, the client returns the
     * cookie only for the domain to which the original request was made.
     *
     * <p>Ensure that this attribute specifies the correct domain value. If the {@code Domain}
     * attribute in the {@code Set-cookie} header does not include the domain to which the original
     * request was made, the client or browser might reject the cookie. As specified in RFC 6265,
     * the client accepts a cookie with the {@code Domain} attribute value {@code example.com} or
     * {@code www.example.com} sent from {@code www.example.com}. It does not accept a cookie with
     * the {@code Domain} attribute {@code abc.example.com} or {@code www.abc.example.com} sent from
     * {@code www.example.com}.
     *
     * <p>Example: {@code example.com}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    private final String domain;

    /**
     * The domain in which the cookie is valid. The {@code Set-cookie} header inserted by the load
     * balancer contains a domain attribute with the specified value.
     *
     * <p>This attribute has no default value. If you do not specify a value, the load balancer does
     * not insert the domain attribute into the {@code Set-cookie} header.
     *
     * <p>*Notes:**
     *
     * <p>[RFC 6265 - HTTP State Management Mechanism](https://www.ietf.org/rfc/rfc6265.txt)
     * describes client and browser behavior when the domain attribute is present or not present in
     * the {@code Set-cookie} header.
     *
     * <p>If the value of the {@code Domain} attribute is {@code example.com} in the {@code
     * Set-cookie} header, the client includes the same cookie in the {@code Cookie} header when
     * making HTTP requests to {@code example.com}, {@code www.example.com}, and {@code
     * www.abc.example.com}. If the {@code Domain} attribute is not present, the client returns the
     * cookie only for the domain to which the original request was made.
     *
     * <p>Ensure that this attribute specifies the correct domain value. If the {@code Domain}
     * attribute in the {@code Set-cookie} header does not include the domain to which the original
     * request was made, the client or browser might reject the cookie. As specified in RFC 6265,
     * the client accepts a cookie with the {@code Domain} attribute value {@code example.com} or
     * {@code www.example.com} sent from {@code www.example.com}. It does not accept a cookie with
     * the {@code Domain} attribute {@code abc.example.com} or {@code www.abc.example.com} sent from
     * {@code www.example.com}.
     *
     * <p>Example: {@code example.com}
     *
     * @return the value
     */
    public String getDomain() {
        return domain;
    }

    /**
     * The path in which the cookie is valid. The {@code Set-cookie header} inserted by the load
     * balancer contains a {@code Path} attribute with the specified value.
     *
     * <p>Clients include the cookie in an HTTP request only if the path portion of the request-uri
     * matches, or is a subdirectory of, the cookie's {@code Path} attribute.
     *
     * <p>The default value is {@code /}.
     *
     * <p>Example: {@code /example}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * The path in which the cookie is valid. The {@code Set-cookie header} inserted by the load
     * balancer contains a {@code Path} attribute with the specified value.
     *
     * <p>Clients include the cookie in an HTTP request only if the path portion of the request-uri
     * matches, or is a subdirectory of, the cookie's {@code Path} attribute.
     *
     * <p>The default value is {@code /}.
     *
     * <p>Example: {@code /example}
     *
     * @return the value
     */
    public String getPath() {
        return path;
    }

    /**
     * The amount of time the cookie remains valid. The {@code Set-cookie} header inserted by the
     * load balancer contains a {@code Max-Age} attribute with the specified value.
     *
     * <p>The specified value must be at least one second. There is no default value for this
     * attribute. If you do not specify a value, the load balancer does not include the {@code
     * Max-Age} attribute in the {@code Set-cookie} header. In most cases, the client or browser
     * retains the cookie until the current session ends, as defined by the client.
     *
     * <p>Example: {@code 3600}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxAgeInSeconds")
    private final Integer maxAgeInSeconds;

    /**
     * The amount of time the cookie remains valid. The {@code Set-cookie} header inserted by the
     * load balancer contains a {@code Max-Age} attribute with the specified value.
     *
     * <p>The specified value must be at least one second. There is no default value for this
     * attribute. If you do not specify a value, the load balancer does not include the {@code
     * Max-Age} attribute in the {@code Set-cookie} header. In most cases, the client or browser
     * retains the cookie until the current session ends, as defined by the client.
     *
     * <p>Example: {@code 3600}
     *
     * @return the value
     */
    public Integer getMaxAgeInSeconds() {
        return maxAgeInSeconds;
    }

    /**
     * Whether the {@code Set-cookie} header should contain the {@code Secure} attribute. If {@code
     * true}, the {@code Set-cookie} header inserted by the load balancer contains the {@code
     * Secure} attribute, which directs the client or browser to send the cookie only using a secure
     * protocol.
     *
     * <p>*Note:** If you set this field to {@code true}, you cannot associate the corresponding
     * backend set with an HTTP listener.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isSecure")
    private final Boolean isSecure;

    /**
     * Whether the {@code Set-cookie} header should contain the {@code Secure} attribute. If {@code
     * true}, the {@code Set-cookie} header inserted by the load balancer contains the {@code
     * Secure} attribute, which directs the client or browser to send the cookie only using a secure
     * protocol.
     *
     * <p>*Note:** If you set this field to {@code true}, you cannot associate the corresponding
     * backend set with an HTTP listener.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getIsSecure() {
        return isSecure;
    }

    /**
     * Whether the {@code Set-cookie} header should contain the {@code HttpOnly} attribute. If
     * {@code true}, the {@code Set-cookie} header inserted by the load balancer contains the {@code
     * HttpOnly} attribute, which limits the scope of the cookie to HTTP requests. This attribute
     * directs the client or browser to omit the cookie when providing access to cookies through
     * non-HTTP APIs. For example, it restricts the cookie from JavaScript channels.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isHttpOnly")
    private final Boolean isHttpOnly;

    /**
     * Whether the {@code Set-cookie} header should contain the {@code HttpOnly} attribute. If
     * {@code true}, the {@code Set-cookie} header inserted by the load balancer contains the {@code
     * HttpOnly} attribute, which limits the scope of the cookie to HTTP requests. This attribute
     * directs the client or browser to omit the cookie when providing access to cookies through
     * non-HTTP APIs. For example, it restricts the cookie from JavaScript channels.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getIsHttpOnly() {
        return isHttpOnly;
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
        sb.append("LBCookieSessionPersistenceConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("cookieName=").append(String.valueOf(this.cookieName));
        sb.append(", disableFallback=").append(String.valueOf(this.disableFallback));
        sb.append(", domain=").append(String.valueOf(this.domain));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", maxAgeInSeconds=").append(String.valueOf(this.maxAgeInSeconds));
        sb.append(", isSecure=").append(String.valueOf(this.isSecure));
        sb.append(", isHttpOnly=").append(String.valueOf(this.isHttpOnly));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LBCookieSessionPersistenceConfigurationDetails)) {
            return false;
        }

        LBCookieSessionPersistenceConfigurationDetails other =
                (LBCookieSessionPersistenceConfigurationDetails) o;
        return java.util.Objects.equals(this.cookieName, other.cookieName)
                && java.util.Objects.equals(this.disableFallback, other.disableFallback)
                && java.util.Objects.equals(this.domain, other.domain)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.maxAgeInSeconds, other.maxAgeInSeconds)
                && java.util.Objects.equals(this.isSecure, other.isSecure)
                && java.util.Objects.equals(this.isHttpOnly, other.isHttpOnly)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cookieName == null ? 43 : this.cookieName.hashCode());
        result =
                (result * PRIME)
                        + (this.disableFallback == null ? 43 : this.disableFallback.hashCode());
        result = (result * PRIME) + (this.domain == null ? 43 : this.domain.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result =
                (result * PRIME)
                        + (this.maxAgeInSeconds == null ? 43 : this.maxAgeInSeconds.hashCode());
        result = (result * PRIME) + (this.isSecure == null ? 43 : this.isSecure.hashCode());
        result = (result * PRIME) + (this.isHttpOnly == null ? 43 : this.isHttpOnly.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
