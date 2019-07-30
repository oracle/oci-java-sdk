/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waas.model;

/**
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AccessRuleCriteria build() {
            AccessRuleCriteria __instance__ = new AccessRuleCriteria(condition, value);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessRuleCriteria o) {
            Builder copiedBuilder = condition(o.getCondition()).value(o.getValue());

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
     * The criteria the access rule uses to determine if action should be taken on a request.
     * - **URL_IS:** Matches if the concatenation of request URL path and query is identical to the contents of the `value` field.
     * <p>
     * - **URL_IS_NOT:** Matches if the concatenation of request URL path and query is not identical to the contents of the `value` field.
     * <p>
     * - **URL_STARTS_WITH:** Matches if the concatenation of request URL path and query starts with the contents of the `value` field.
     * <p>
     * - **URL_PART_ENDS_WITH:** Matches if the concatenation of request URL path and query ends with the contents of the `value` field.
     * <p>
     * - **URL_PART_CONTAINS:** Matches if the concatenation of request URL path and query contains the contents of the `value` field.
     * <p>
     * - **URL_REGEX:** Matches if the request is described by the regular expression in the `value` field.
     * <p>
     * - **IP_IS:** Matches if the request originates from an IP address in the `value` field.
     * <p>
     * - **IP_IS_NOT:** Matches if the request does not originate from an IP address in the `value` field.
     * <p>
     * - **HTTP_HEADER_CONTAINS:** The HTTP_HEADER_CONTAINS criteria is defined using a compound value separated by a colon: a header field name and a header field value. `host:test.example.com` is an example of a criteria value where `host` is the header field name and `test.example.com` is the header field value. A request matches when the header field name is a case insensitive match and the header field value is a case insensitive, substring match.
     * *Example:* With a criteria value of `host:test.example.com`, where `host` is the name of the field and `test.example.com` is the value of the host field, a request with the header values, `Host: www.test.example.com` will match, where as a request with header values of `host: www.example.com` or `host: test.sub.example.com` will not match.
     * <p>
     * - **COUNTRY_IS:** Matches if the request originates from a country in the `value` field. Country codes are in ISO 3166-1 alpha-2 format. For a list of codes, see [ISO's website](https://www.iso.org/obp/ui/#search/code/).
     * <p>
     * - **COUNTRY_IS_NOT:** Matches if the request does not originate from a country in the `value` field. Country codes are in ISO 3166-1 alpha-2 format. For a list of codes, see [ISO's website](https://www.iso.org/obp/ui/#search/code/).
     * <p>
     * - **USER_AGENT_IS:** Matches if the requesting user agent is identical to the contents of the `value` field. Example: `Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:35.0) Gecko/20100101 Firefox/35.0`
     * <p>
     * - **USER_AGENT_IS_NOT:** Matches if the requesting user agent is not identical to the contents of the `value` field. Example: `Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:35.0) Gecko/20100101 Firefox/35.0`
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Condition {
        UrlIs("URL_IS"),
        UrlIsNot("URL_IS_NOT"),
        UrlStartsWith("URL_STARTS_WITH"),
        UrlPartEndsWith("URL_PART_ENDS_WITH"),
        UrlPartContains("URL_PART_CONTAINS"),
        UrlRegex("URL_REGEX"),
        IpIs("IP_IS"),
        IpIsNot("IP_IS_NOT"),
        HttpHeaderContains("HTTP_HEADER_CONTAINS"),
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
     * The criteria the access rule uses to determine if action should be taken on a request.
     * - **URL_IS:** Matches if the concatenation of request URL path and query is identical to the contents of the `value` field.
     * <p>
     * - **URL_IS_NOT:** Matches if the concatenation of request URL path and query is not identical to the contents of the `value` field.
     * <p>
     * - **URL_STARTS_WITH:** Matches if the concatenation of request URL path and query starts with the contents of the `value` field.
     * <p>
     * - **URL_PART_ENDS_WITH:** Matches if the concatenation of request URL path and query ends with the contents of the `value` field.
     * <p>
     * - **URL_PART_CONTAINS:** Matches if the concatenation of request URL path and query contains the contents of the `value` field.
     * <p>
     * - **URL_REGEX:** Matches if the request is described by the regular expression in the `value` field.
     * <p>
     * - **IP_IS:** Matches if the request originates from an IP address in the `value` field.
     * <p>
     * - **IP_IS_NOT:** Matches if the request does not originate from an IP address in the `value` field.
     * <p>
     * - **HTTP_HEADER_CONTAINS:** The HTTP_HEADER_CONTAINS criteria is defined using a compound value separated by a colon: a header field name and a header field value. `host:test.example.com` is an example of a criteria value where `host` is the header field name and `test.example.com` is the header field value. A request matches when the header field name is a case insensitive match and the header field value is a case insensitive, substring match.
     * *Example:* With a criteria value of `host:test.example.com`, where `host` is the name of the field and `test.example.com` is the value of the host field, a request with the header values, `Host: www.test.example.com` will match, where as a request with header values of `host: www.example.com` or `host: test.sub.example.com` will not match.
     * <p>
     * - **COUNTRY_IS:** Matches if the request originates from a country in the `value` field. Country codes are in ISO 3166-1 alpha-2 format. For a list of codes, see [ISO's website](https://www.iso.org/obp/ui/#search/code/).
     * <p>
     * - **COUNTRY_IS_NOT:** Matches if the request does not originate from a country in the `value` field. Country codes are in ISO 3166-1 alpha-2 format. For a list of codes, see [ISO's website](https://www.iso.org/obp/ui/#search/code/).
     * <p>
     * - **USER_AGENT_IS:** Matches if the requesting user agent is identical to the contents of the `value` field. Example: `Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:35.0) Gecko/20100101 Firefox/35.0`
     * <p>
     * - **USER_AGENT_IS_NOT:** Matches if the requesting user agent is not identical to the contents of the `value` field. Example: `Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:35.0) Gecko/20100101 Firefox/35.0`
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    Condition condition;

    /**
     * The criteria value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    String value;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
