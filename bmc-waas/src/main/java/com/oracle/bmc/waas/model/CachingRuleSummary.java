/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * The caching rule settings.
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
    builder = CachingRuleSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CachingRuleSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cachingDuration")
        private String cachingDuration;

        public Builder cachingDuration(String cachingDuration) {
            this.cachingDuration = cachingDuration;
            this.__explicitlySet__.add("cachingDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isClientCachingEnabled")
        private Boolean isClientCachingEnabled;

        public Builder isClientCachingEnabled(Boolean isClientCachingEnabled) {
            this.isClientCachingEnabled = isClientCachingEnabled;
            this.__explicitlySet__.add("isClientCachingEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clientCachingDuration")
        private String clientCachingDuration;

        public Builder clientCachingDuration(String clientCachingDuration) {
            this.clientCachingDuration = clientCachingDuration;
            this.__explicitlySet__.add("clientCachingDuration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("criteria")
        private java.util.List<CachingRuleCriteria> criteria;

        public Builder criteria(java.util.List<CachingRuleCriteria> criteria) {
            this.criteria = criteria;
            this.__explicitlySet__.add("criteria");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CachingRuleSummary build() {
            CachingRuleSummary __instance__ =
                    new CachingRuleSummary(
                            key,
                            name,
                            action,
                            cachingDuration,
                            isClientCachingEnabled,
                            clientCachingDuration,
                            criteria);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CachingRuleSummary o) {
            Builder copiedBuilder =
                    key(o.getKey())
                            .name(o.getName())
                            .action(o.getAction())
                            .cachingDuration(o.getCachingDuration())
                            .isClientCachingEnabled(o.getIsClientCachingEnabled())
                            .clientCachingDuration(o.getClientCachingDuration())
                            .criteria(o.getCriteria());

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
     * The unique key for the caching rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    String key;

    /**
     * The name of the caching rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;
    /**
     * The action to take when the criteria of a caching rule are met.
     * - **CACHE:** Caches requested content when the criteria of the rule are met.
     * <p>
     * - **BYPASS_CACHE:** Allows requests to bypass the cache and be directed to the origin when the criteria of the rule is met.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Action {
        Cache("CACHE"),
        BypassCache("BYPASS_CACHE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Action', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The action to take when the criteria of a caching rule are met.
     * - **CACHE:** Caches requested content when the criteria of the rule are met.
     * <p>
     * - **BYPASS_CACHE:** Allows requests to bypass the cache and be directed to the origin when the criteria of the rule is met.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    Action action;

    /**
     * The duration to cache content for the caching rule, specified in ISO 8601 extended format. Supported units: seconds, minutes, hours, days, weeks, months. The maximum value that can be set for any unit is `99`. Mixing of multiple units is not supported. Only applies when the `action` is set to `CACHE`.
     * Example: `PT1H`
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cachingDuration")
    String cachingDuration;

    /**
     * Enables or disables client caching.
     * Browsers use the `Cache-Control` header value for caching content locally in the browser. This setting overrides the addition of a `Cache-Control` header in responses.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isClientCachingEnabled")
    Boolean isClientCachingEnabled;

    /**
     * The duration to cache content in the user's browser, specified in ISO 8601 extended format. Supported units: seconds, minutes, hours, days, weeks, months. The maximum value that can be set for any unit is `99`. Mixing of multiple units is not supported. Only applies when the `action` is set to `CACHE`.
     * Example: `PT1H`
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clientCachingDuration")
    String clientCachingDuration;

    /**
     * The array of the rule criteria with condition and value. The caching rule would be applied for the requests that matched any of the listed conditions.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("criteria")
    java.util.List<CachingRuleCriteria> criteria;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
