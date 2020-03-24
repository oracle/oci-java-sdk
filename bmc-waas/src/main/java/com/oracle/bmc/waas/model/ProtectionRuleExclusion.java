/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waas.model;

/**
 * Allows specified types of requests to bypass the protection rule. If a request matches any of the criteria in the `exclusions` field, the protection rule will not be executed. Rules can have more than one exclusion and exclusions are applied to requests disjunctively, meaning the specified exclusion strings are independently matched against the specified targets of a request. The first target to match a specified string will trigger an exclusion. **Example:** If the following exclusions are defined for a protection rule:
 * <p>
 * \"action\": \"BLOCK\",
 *     \"exclusions\": [
 *         {
 *             \"target\":\"REQUEST_COOKIES\",
 *             \"exclusions\":[\"example.com\", \"12345\", \"219ffwef9w0f\"]
 *         },
 *         {
 *             \"target\":\"REQUEST_COOKIE_NAMES\",
 *             \"exclusions\":[\"OAMAuthnCookie\", \"JSESSIONID\", \"HCM-PSJSESSIONID\"]
 *         }
 *     ],
 *     \"key\": \"1000000\",
 * <p>
 * A request with the cookie name `sessionid` would trigger an exclusion. A request with the cookie name `yourcompany.com` would *not* trigger and exclusion.
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
    builder = ProtectionRuleExclusion.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ProtectionRuleExclusion {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("target")
        private Target target;

        public Builder target(Target target) {
            this.target = target;
            this.__explicitlySet__.add("target");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("exclusions")
        private java.util.List<String> exclusions;

        public Builder exclusions(java.util.List<String> exclusions) {
            this.exclusions = exclusions;
            this.__explicitlySet__.add("exclusions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProtectionRuleExclusion build() {
            ProtectionRuleExclusion __instance__ = new ProtectionRuleExclusion(target, exclusions);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProtectionRuleExclusion o) {
            Builder copiedBuilder = target(o.getTarget()).exclusions(o.getExclusions());

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
     * The target of the exclusion.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Target {
        RequestCookies("REQUEST_COOKIES"),
        RequestCookieNames("REQUEST_COOKIE_NAMES"),
        Args("ARGS"),
        ArgsNames("ARGS_NAMES"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Target> map;

        static {
            map = new java.util.HashMap<>();
            for (Target v : Target.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Target(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Target create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Target', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The target of the exclusion.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("target")
    Target target;

    @com.fasterxml.jackson.annotation.JsonProperty("exclusions")
    java.util.List<String> exclusions;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
