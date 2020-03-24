/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waas.model;

/**
 * When defined, the parent challenge would be applied only for the requests that matched all the listed conditions.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AccessRuleCriteria.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AccessRuleCriteria {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("condition")
        private Condition condition;

        public Builder condition(Condition condition) {
            this.condition = condition;
            this.__explicitlySet__.add("condition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isCaseSensitive")
        private Boolean isCaseSensitive;

        public Builder isCaseSensitive(Boolean isCaseSensitive) {
            this.isCaseSensitive = isCaseSensitive;
            this.__explicitlySet__.add("isCaseSensitive");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AccessRuleCriteria build() {
            AccessRuleCriteria __instance__ =
                    new AccessRuleCriteria(condition, value, isCaseSensitive);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessRuleCriteria o) {
            Builder copiedBuilder =
                    condition(o.getCondition())
                            .value(o.getValue())
                            .isCaseSensitive(o.getIsCaseSensitive());

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
     * The criteria the access rule and JavaScript Challenge uses to determine if action should be taken on a request.
     * - **URL_IS:** Matches if the concatenation of request URL path and query is identical to the contents of the `value` field. URL must start with a `/`.
     * - **URL_IS_NOT:** Matches if the concatenation of request URL path and query is not identical to the contents of the `value` field. URL must start with a `/`.
     * - **URL_STARTS_WITH:** Matches if the concatenation of request URL path and query starts with the contents of the `value` field. URL must start with a `/`.
     * - **URL_PART_ENDS_WITH:** Matches if the concatenation of request URL path and query ends with the contents of the `value` field.
     * - **URL_PART_CONTAINS:** Matches if the concatenation of request URL path and query contains the contents of the `value` field.
     * - **URL_REGEX:** Matches if the concatenation of request URL path and query is described by the regular expression in the value field. The value must be a valid regular expression recognized by the PCRE library in Nginx (https://www.pcre.org).
     * - **URL_DOES_NOT_MATCH_REGEX:** Matches if the concatenation of request URL path and query is not described by the regular expression in the `value` field. The value must be a valid regular expression recognized by the PCRE library in Nginx (https://www.pcre.org).
     * - **URL_DOES_NOT_START_WITH:** Matches if the concatenation of request URL path and query does not start with the contents of the `value` field.
     * - **URL_PART_DOES_NOT_CONTAIN:** Matches if the concatenation of request URL path and query does not contain the contents of the `value` field.
     * - **URL_PART_DOES_NOT_END_WITH:** Matches if the concatenation of request URL path and query does not end with the contents of the `value` field.
     * - **IP_IS:** Matches if the request originates from one of the IP addresses contained in the defined address list. The `value` in this case is string with one or multiple IPs or CIDR notations separated by new line symbol \
     * <p>
     *Example:* \"1.1.1.1\
     * 1.1.1.2\
     * 1.2.2.1/30\"
     * - **IP_IS_NOT:** Matches if the request does not originate from any of the IP addresses contained in the defined address list. The `value` in this case is string with one or multiple IPs or CIDR notations separated by new line symbol \
     * <p>
     *Example:* \"1.1.1.1\
     * 1.1.1.2\
     * 1.2.2.1/30\"
     * - **IP_IN_LIST:** Matches if the request originates from one of the IP addresses contained in the referenced address list. The `value` in this case is OCID of the address list.
     * - **IP_NOT_IN_LIST:** Matches if the request does not originate from any IP address contained in the referenced address list. The `value` field in this case is OCID of the address list.
     * - **HTTP_HEADER_CONTAINS:** The HTTP_HEADER_CONTAINS criteria is defined using a compound value separated by a colon: a header field name and a header field value. `host:test.example.com` is an example of a criteria value where `host` is the header field name and `test.example.com` is the header field value. A request matches when the header field name is a case insensitive match and the header field value is a case insensitive, substring match.
     * *Example:* With a criteria value of `host:test.example.com`, where `host` is the name of the field and `test.example.com` is the value of the host field, a request with the header values, `Host: www.test.example.com` will match, where as a request with header values of `host: www.example.com` or `host: test.sub.example.com` will not match.
     * - **HTTP_METHOD_IS:** Matches if the request method is identical to one of the values listed in field. The `value` in this case is string with one or multiple HTTP methods separated by new line symbol \
     *  The list of available methods: `GET`, `HEAD`, `POST`, `PUT`, `DELETE`, `CONNECT`, `OPTIONS`, `TRACE`, `PATCH`
     * <p>
     *Example:* \"GET\
     * POST\"
     * <p>
     * - **HTTP_METHOD_IS_NOT:** Matches if the request is not identical to any of the contents of the `value` field. The `value` in this case is string with one or multiple HTTP methods separated by new line symbol \
     *  The list of available methods: `GET`, `HEAD`, `POST`, `PUT`, `DELETE`, `CONNECT`, `OPTIONS`, `TRACE`, `PATCH`
     * <p>
     *Example:* \"GET\
     * POST\"
     * <p>
     * - **COUNTRY_IS:** Matches if the request originates from one of countries in the `value` field. The `value` in this case is string with one or multiple countries separated by new line symbol \
     *  Country codes are in ISO 3166-1 alpha-2 format. For a list of codes, see [ISO's website](https://www.iso.org/obp/ui/#search/code/).
     * *Example:* \"AL\
     * DZ\
     * AM\"
     * - **COUNTRY_IS_NOT:** Matches if the request does not originate from any of countries in the `value` field. The `value` in this case is string with one or multiple countries separated by new line symbol \
     *  Country codes are in ISO 3166-1 alpha-2 format. For a list of codes, see [ISO's website](https://www.iso.org/obp/ui/#search/code/).
     * *Example:* \"AL\
     * DZ\
     * AM\"
     * - **USER_AGENT_IS:** Matches if the requesting user agent is identical to the contents of the `value` field.
     * *Example:* `Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:35.0) Gecko/20100101 Firefox/35.0`
     * - **USER_AGENT_IS_NOT:** Matches if the requesting user agent is not identical to the contents of the `value` field.
     * *Example:* `Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:35.0) Gecko/20100101 Firefox/35.0`
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Condition {
        UrlIs("URL_IS"),
        UrlIsNot("URL_IS_NOT"),
        UrlStartsWith("URL_STARTS_WITH"),
        UrlPartEndsWith("URL_PART_ENDS_WITH"),
        UrlPartContains("URL_PART_CONTAINS"),
        UrlRegex("URL_REGEX"),
        UrlDoesNotMatchRegex("URL_DOES_NOT_MATCH_REGEX"),
        UrlDoesNotStartWith("URL_DOES_NOT_START_WITH"),
        UrlPartDoesNotContain("URL_PART_DOES_NOT_CONTAIN"),
        UrlPartDoesNotEndWith("URL_PART_DOES_NOT_END_WITH"),
        IpIs("IP_IS"),
        IpIsNot("IP_IS_NOT"),
        IpInList("IP_IN_LIST"),
        IpNotInList("IP_NOT_IN_LIST"),
        HttpHeaderContains("HTTP_HEADER_CONTAINS"),
        HttpMethodIs("HTTP_METHOD_IS"),
        HttpMethodIsNot("HTTP_METHOD_IS_NOT"),
        CountryIs("COUNTRY_IS"),
        CountryIsNot("COUNTRY_IS_NOT"),
        UserAgentIs("USER_AGENT_IS"),
        UserAgentIsNot("USER_AGENT_IS_NOT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Condition> map;

        static {
            map = new java.util.HashMap<>();
            for (Condition v : Condition.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Condition(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Condition create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Condition', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The criteria the access rule and JavaScript Challenge uses to determine if action should be taken on a request.
     * - **URL_IS:** Matches if the concatenation of request URL path and query is identical to the contents of the `value` field. URL must start with a `/`.
     * - **URL_IS_NOT:** Matches if the concatenation of request URL path and query is not identical to the contents of the `value` field. URL must start with a `/`.
     * - **URL_STARTS_WITH:** Matches if the concatenation of request URL path and query starts with the contents of the `value` field. URL must start with a `/`.
     * - **URL_PART_ENDS_WITH:** Matches if the concatenation of request URL path and query ends with the contents of the `value` field.
     * - **URL_PART_CONTAINS:** Matches if the concatenation of request URL path and query contains the contents of the `value` field.
     * - **URL_REGEX:** Matches if the concatenation of request URL path and query is described by the regular expression in the value field. The value must be a valid regular expression recognized by the PCRE library in Nginx (https://www.pcre.org).
     * - **URL_DOES_NOT_MATCH_REGEX:** Matches if the concatenation of request URL path and query is not described by the regular expression in the `value` field. The value must be a valid regular expression recognized by the PCRE library in Nginx (https://www.pcre.org).
     * - **URL_DOES_NOT_START_WITH:** Matches if the concatenation of request URL path and query does not start with the contents of the `value` field.
     * - **URL_PART_DOES_NOT_CONTAIN:** Matches if the concatenation of request URL path and query does not contain the contents of the `value` field.
     * - **URL_PART_DOES_NOT_END_WITH:** Matches if the concatenation of request URL path and query does not end with the contents of the `value` field.
     * - **IP_IS:** Matches if the request originates from one of the IP addresses contained in the defined address list. The `value` in this case is string with one or multiple IPs or CIDR notations separated by new line symbol \
     * <p>
     *Example:* \"1.1.1.1\
     * 1.1.1.2\
     * 1.2.2.1/30\"
     * - **IP_IS_NOT:** Matches if the request does not originate from any of the IP addresses contained in the defined address list. The `value` in this case is string with one or multiple IPs or CIDR notations separated by new line symbol \
     * <p>
     *Example:* \"1.1.1.1\
     * 1.1.1.2\
     * 1.2.2.1/30\"
     * - **IP_IN_LIST:** Matches if the request originates from one of the IP addresses contained in the referenced address list. The `value` in this case is OCID of the address list.
     * - **IP_NOT_IN_LIST:** Matches if the request does not originate from any IP address contained in the referenced address list. The `value` field in this case is OCID of the address list.
     * - **HTTP_HEADER_CONTAINS:** The HTTP_HEADER_CONTAINS criteria is defined using a compound value separated by a colon: a header field name and a header field value. `host:test.example.com` is an example of a criteria value where `host` is the header field name and `test.example.com` is the header field value. A request matches when the header field name is a case insensitive match and the header field value is a case insensitive, substring match.
     * *Example:* With a criteria value of `host:test.example.com`, where `host` is the name of the field and `test.example.com` is the value of the host field, a request with the header values, `Host: www.test.example.com` will match, where as a request with header values of `host: www.example.com` or `host: test.sub.example.com` will not match.
     * - **HTTP_METHOD_IS:** Matches if the request method is identical to one of the values listed in field. The `value` in this case is string with one or multiple HTTP methods separated by new line symbol \
     *  The list of available methods: `GET`, `HEAD`, `POST`, `PUT`, `DELETE`, `CONNECT`, `OPTIONS`, `TRACE`, `PATCH`
     * <p>
     *Example:* \"GET\
     * POST\"
     * <p>
     * - **HTTP_METHOD_IS_NOT:** Matches if the request is not identical to any of the contents of the `value` field. The `value` in this case is string with one or multiple HTTP methods separated by new line symbol \
     *  The list of available methods: `GET`, `HEAD`, `POST`, `PUT`, `DELETE`, `CONNECT`, `OPTIONS`, `TRACE`, `PATCH`
     * <p>
     *Example:* \"GET\
     * POST\"
     * <p>
     * - **COUNTRY_IS:** Matches if the request originates from one of countries in the `value` field. The `value` in this case is string with one or multiple countries separated by new line symbol \
     *  Country codes are in ISO 3166-1 alpha-2 format. For a list of codes, see [ISO's website](https://www.iso.org/obp/ui/#search/code/).
     * *Example:* \"AL\
     * DZ\
     * AM\"
     * - **COUNTRY_IS_NOT:** Matches if the request does not originate from any of countries in the `value` field. The `value` in this case is string with one or multiple countries separated by new line symbol \
     *  Country codes are in ISO 3166-1 alpha-2 format. For a list of codes, see [ISO's website](https://www.iso.org/obp/ui/#search/code/).
     * *Example:* \"AL\
     * DZ\
     * AM\"
     * - **USER_AGENT_IS:** Matches if the requesting user agent is identical to the contents of the `value` field.
     * *Example:* `Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:35.0) Gecko/20100101 Firefox/35.0`
     * - **USER_AGENT_IS_NOT:** Matches if the requesting user agent is not identical to the contents of the `value` field.
     * *Example:* `Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:35.0) Gecko/20100101 Firefox/35.0`
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    Condition condition;

    /**
     * The criteria value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    String value;

    /**
     * When enabled, the condition will be matched with case-sensitive rules.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isCaseSensitive")
    Boolean isCaseSensitive;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
