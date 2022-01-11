/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * The type of matching to apply to incoming URIs.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PathMatchType.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class PathMatchType {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("matchType")
        private MatchType matchType;

        public Builder matchType(MatchType matchType) {
            this.matchType = matchType;
            this.__explicitlySet__.add("matchType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PathMatchType build() {
            PathMatchType __instance__ = new PathMatchType(matchType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PathMatchType o) {
            Builder copiedBuilder = matchType(o.getMatchType());

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
     * Specifies how the load balancing service compares a {@link #pathRoute(PathRouteRequest) pathRoute}
     * object's {@code path} string against the incoming URI.
     * <p>
     *  **EXACT_MATCH** - Looks for a {@code path} string that exactly matches the incoming URI path.
     * <p>
     *  **FORCE_LONGEST_PREFIX_MATCH** - Looks for the {@code path} string with the best, longest match of the beginning
     *    portion of the incoming URI path.
     * <p>
     *  **PREFIX_MATCH** - Looks for a {@code path} string that matches the beginning portion of the incoming URI path.
     * <p>
     *  **SUFFIX_MATCH** - Looks for a {@code path} string that matches the ending portion of the incoming URI path.
     * <p>
     * For a full description of how the system handles {@code matchType} in a path route set containing multiple rules, see
     * [Managing Request Routing](https://docs.cloud.oracle.com/Content/Balance/Tasks/managingrequest.htm).
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum MatchType {
        ExactMatch("EXACT_MATCH"),
        ForceLongestPrefixMatch("FORCE_LONGEST_PREFIX_MATCH"),
        PrefixMatch("PREFIX_MATCH"),
        SuffixMatch("SUFFIX_MATCH"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, MatchType> map;

        static {
            map = new java.util.HashMap<>();
            for (MatchType v : MatchType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        MatchType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static MatchType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'MatchType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Specifies how the load balancing service compares a {@link #pathRoute(PathRouteRequest) pathRoute}
     * object's {@code path} string against the incoming URI.
     * <p>
     *  **EXACT_MATCH** - Looks for a {@code path} string that exactly matches the incoming URI path.
     * <p>
     *  **FORCE_LONGEST_PREFIX_MATCH** - Looks for the {@code path} string with the best, longest match of the beginning
     *    portion of the incoming URI path.
     * <p>
     *  **PREFIX_MATCH** - Looks for a {@code path} string that matches the beginning portion of the incoming URI path.
     * <p>
     *  **SUFFIX_MATCH** - Looks for a {@code path} string that matches the ending portion of the incoming URI path.
     * <p>
     * For a full description of how the system handles {@code matchType} in a path route set containing multiple rules, see
     * [Managing Request Routing](https://docs.cloud.oracle.com/Content/Balance/Tasks/managingrequest.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("matchType")
    MatchType matchType;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
