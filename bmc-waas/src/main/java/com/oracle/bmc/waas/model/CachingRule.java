/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waas.model;

/**
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181116")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CachingRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CachingRule extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "name",
        "action",
        "cachingDuration",
        "isClientCachingEnabled",
        "clientCachingDuration",
        "criteria"
    })
    public CachingRule(
            String key,
            String name,
            Action action,
            String cachingDuration,
            Boolean isClientCachingEnabled,
            String clientCachingDuration,
            java.util.List<CachingRuleCriteria> criteria) {
        super();
        this.key = key;
        this.name = name;
        this.action = action;
        this.cachingDuration = cachingDuration;
        this.isClientCachingEnabled = isClientCachingEnabled;
        this.clientCachingDuration = clientCachingDuration;
        this.criteria = criteria;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The unique key for the caching rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The unique key for the caching rule.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The name of the caching rule. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the caching rule.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The action to take when the criteria of a caching rule are met. - **CACHE:** Caches
         * requested content when the criteria of the rule are met.
         *
         * <p>- **BYPASS_CACHE:** Allows requests to bypass the cache and be directed to the origin
         * when the criteria of the rule is met.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        /**
         * The action to take when the criteria of a caching rule are met. - **CACHE:** Caches
         * requested content when the criteria of the rule are met.
         *
         * <p>- **BYPASS_CACHE:** Allows requests to bypass the cache and be directed to the origin
         * when the criteria of the rule is met.
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * The duration to cache content for the caching rule, specified in ISO 8601 extended
         * format. Supported units: seconds, minutes, hours, days, weeks, months. The maximum value
         * that can be set for any unit is {@code 99}. Mixing of multiple units is not supported.
         * Only applies when the {@code action} is set to {@code CACHE}. Example: {@code PT1H}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("cachingDuration")
        private String cachingDuration;

        /**
         * The duration to cache content for the caching rule, specified in ISO 8601 extended
         * format. Supported units: seconds, minutes, hours, days, weeks, months. The maximum value
         * that can be set for any unit is {@code 99}. Mixing of multiple units is not supported.
         * Only applies when the {@code action} is set to {@code CACHE}. Example: {@code PT1H}
         *
         * @param cachingDuration the value to set
         * @return this builder
         */
        public Builder cachingDuration(String cachingDuration) {
            this.cachingDuration = cachingDuration;
            this.__explicitlySet__.add("cachingDuration");
            return this;
        }
        /**
         * Enables or disables client caching. Browsers use the {@code Cache-Control} header value
         * for caching content locally in the browser. This setting overrides the addition of a
         * {@code Cache-Control} header in responses.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isClientCachingEnabled")
        private Boolean isClientCachingEnabled;

        /**
         * Enables or disables client caching. Browsers use the {@code Cache-Control} header value
         * for caching content locally in the browser. This setting overrides the addition of a
         * {@code Cache-Control} header in responses.
         *
         * @param isClientCachingEnabled the value to set
         * @return this builder
         */
        public Builder isClientCachingEnabled(Boolean isClientCachingEnabled) {
            this.isClientCachingEnabled = isClientCachingEnabled;
            this.__explicitlySet__.add("isClientCachingEnabled");
            return this;
        }
        /**
         * The duration to cache content in the user's browser, specified in ISO 8601 extended
         * format. Supported units: seconds, minutes, hours, days, weeks, months. The maximum value
         * that can be set for any unit is {@code 99}. Mixing of multiple units is not supported.
         * Only applies when the {@code action} is set to {@code CACHE}. Example: {@code PT1H}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("clientCachingDuration")
        private String clientCachingDuration;

        /**
         * The duration to cache content in the user's browser, specified in ISO 8601 extended
         * format. Supported units: seconds, minutes, hours, days, weeks, months. The maximum value
         * that can be set for any unit is {@code 99}. Mixing of multiple units is not supported.
         * Only applies when the {@code action} is set to {@code CACHE}. Example: {@code PT1H}
         *
         * @param clientCachingDuration the value to set
         * @return this builder
         */
        public Builder clientCachingDuration(String clientCachingDuration) {
            this.clientCachingDuration = clientCachingDuration;
            this.__explicitlySet__.add("clientCachingDuration");
            return this;
        }
        /**
         * The array of the rule criteria with condition and value. The caching rule would be
         * applied for the requests that matched any of the listed conditions.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("criteria")
        private java.util.List<CachingRuleCriteria> criteria;

        /**
         * The array of the rule criteria with condition and value. The caching rule would be
         * applied for the requests that matched any of the listed conditions.
         *
         * @param criteria the value to set
         * @return this builder
         */
        public Builder criteria(java.util.List<CachingRuleCriteria> criteria) {
            this.criteria = criteria;
            this.__explicitlySet__.add("criteria");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CachingRule build() {
            CachingRule model =
                    new CachingRule(
                            this.key,
                            this.name,
                            this.action,
                            this.cachingDuration,
                            this.isClientCachingEnabled,
                            this.clientCachingDuration,
                            this.criteria);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CachingRule model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("cachingDuration")) {
                this.cachingDuration(model.getCachingDuration());
            }
            if (model.wasPropertyExplicitlySet("isClientCachingEnabled")) {
                this.isClientCachingEnabled(model.getIsClientCachingEnabled());
            }
            if (model.wasPropertyExplicitlySet("clientCachingDuration")) {
                this.clientCachingDuration(model.getClientCachingDuration());
            }
            if (model.wasPropertyExplicitlySet("criteria")) {
                this.criteria(model.getCriteria());
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

    /** The unique key for the caching rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The unique key for the caching rule.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The name of the caching rule. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the caching rule.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The action to take when the criteria of a caching rule are met. - **CACHE:** Caches requested
     * content when the criteria of the rule are met.
     *
     * <p>- **BYPASS_CACHE:** Allows requests to bypass the cache and be directed to the origin when
     * the criteria of the rule is met.
     */
    public enum Action implements com.oracle.bmc.http.internal.BmcEnum {
        Cache("CACHE"),
        BypassCache("BYPASS_CACHE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Action.class);

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
     * The action to take when the criteria of a caching rule are met. - **CACHE:** Caches requested
     * content when the criteria of the rule are met.
     *
     * <p>- **BYPASS_CACHE:** Allows requests to bypass the cache and be directed to the origin when
     * the criteria of the rule is met.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * The action to take when the criteria of a caching rule are met. - **CACHE:** Caches requested
     * content when the criteria of the rule are met.
     *
     * <p>- **BYPASS_CACHE:** Allows requests to bypass the cache and be directed to the origin when
     * the criteria of the rule is met.
     *
     * @return the value
     */
    public Action getAction() {
        return action;
    }

    /**
     * The duration to cache content for the caching rule, specified in ISO 8601 extended format.
     * Supported units: seconds, minutes, hours, days, weeks, months. The maximum value that can be
     * set for any unit is {@code 99}. Mixing of multiple units is not supported. Only applies when
     * the {@code action} is set to {@code CACHE}. Example: {@code PT1H}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("cachingDuration")
    private final String cachingDuration;

    /**
     * The duration to cache content for the caching rule, specified in ISO 8601 extended format.
     * Supported units: seconds, minutes, hours, days, weeks, months. The maximum value that can be
     * set for any unit is {@code 99}. Mixing of multiple units is not supported. Only applies when
     * the {@code action} is set to {@code CACHE}. Example: {@code PT1H}
     *
     * @return the value
     */
    public String getCachingDuration() {
        return cachingDuration;
    }

    /**
     * Enables or disables client caching. Browsers use the {@code Cache-Control} header value for
     * caching content locally in the browser. This setting overrides the addition of a {@code
     * Cache-Control} header in responses.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isClientCachingEnabled")
    private final Boolean isClientCachingEnabled;

    /**
     * Enables or disables client caching. Browsers use the {@code Cache-Control} header value for
     * caching content locally in the browser. This setting overrides the addition of a {@code
     * Cache-Control} header in responses.
     *
     * @return the value
     */
    public Boolean getIsClientCachingEnabled() {
        return isClientCachingEnabled;
    }

    /**
     * The duration to cache content in the user's browser, specified in ISO 8601 extended format.
     * Supported units: seconds, minutes, hours, days, weeks, months. The maximum value that can be
     * set for any unit is {@code 99}. Mixing of multiple units is not supported. Only applies when
     * the {@code action} is set to {@code CACHE}. Example: {@code PT1H}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clientCachingDuration")
    private final String clientCachingDuration;

    /**
     * The duration to cache content in the user's browser, specified in ISO 8601 extended format.
     * Supported units: seconds, minutes, hours, days, weeks, months. The maximum value that can be
     * set for any unit is {@code 99}. Mixing of multiple units is not supported. Only applies when
     * the {@code action} is set to {@code CACHE}. Example: {@code PT1H}
     *
     * @return the value
     */
    public String getClientCachingDuration() {
        return clientCachingDuration;
    }

    /**
     * The array of the rule criteria with condition and value. The caching rule would be applied
     * for the requests that matched any of the listed conditions.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("criteria")
    private final java.util.List<CachingRuleCriteria> criteria;

    /**
     * The array of the rule criteria with condition and value. The caching rule would be applied
     * for the requests that matched any of the listed conditions.
     *
     * @return the value
     */
    public java.util.List<CachingRuleCriteria> getCriteria() {
        return criteria;
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
        sb.append("CachingRule(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", cachingDuration=").append(String.valueOf(this.cachingDuration));
        sb.append(", isClientCachingEnabled=").append(String.valueOf(this.isClientCachingEnabled));
        sb.append(", clientCachingDuration=").append(String.valueOf(this.clientCachingDuration));
        sb.append(", criteria=").append(String.valueOf(this.criteria));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CachingRule)) {
            return false;
        }

        CachingRule other = (CachingRule) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.cachingDuration, other.cachingDuration)
                && java.util.Objects.equals(
                        this.isClientCachingEnabled, other.isClientCachingEnabled)
                && java.util.Objects.equals(this.clientCachingDuration, other.clientCachingDuration)
                && java.util.Objects.equals(this.criteria, other.criteria)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result =
                (result * PRIME)
                        + (this.cachingDuration == null ? 43 : this.cachingDuration.hashCode());
        result =
                (result * PRIME)
                        + (this.isClientCachingEnabled == null
                                ? 43
                                : this.isClientCachingEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.clientCachingDuration == null
                                ? 43
                                : this.clientCachingDuration.hashCode());
        result = (result * PRIME) + (this.criteria == null ? 43 : this.criteria.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
