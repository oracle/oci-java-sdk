/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waas.model;

/**
 * A content access rule. An access rule specifies an action to take if a set of criteria is matched by a request.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AccessRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class AccessRule {
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

        @com.fasterxml.jackson.annotation.JsonProperty("criteria")
        private java.util.List<AccessRuleCriteria> criteria;

        public Builder criteria(java.util.List<AccessRuleCriteria> criteria) {
            this.criteria = criteria;
            this.__explicitlySet__.add("criteria");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private Action action;

        public Builder action(Action action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockAction")
        private BlockAction blockAction;

        public Builder blockAction(BlockAction blockAction) {
            this.blockAction = blockAction;
            this.__explicitlySet__.add("blockAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockResponseCode")
        private Integer blockResponseCode;

        public Builder blockResponseCode(Integer blockResponseCode) {
            this.blockResponseCode = blockResponseCode;
            this.__explicitlySet__.add("blockResponseCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageMessage")
        private String blockErrorPageMessage;

        public Builder blockErrorPageMessage(String blockErrorPageMessage) {
            this.blockErrorPageMessage = blockErrorPageMessage;
            this.__explicitlySet__.add("blockErrorPageMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageCode")
        private String blockErrorPageCode;

        public Builder blockErrorPageCode(String blockErrorPageCode) {
            this.blockErrorPageCode = blockErrorPageCode;
            this.__explicitlySet__.add("blockErrorPageCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageDescription")
        private String blockErrorPageDescription;

        public Builder blockErrorPageDescription(String blockErrorPageDescription) {
            this.blockErrorPageDescription = blockErrorPageDescription;
            this.__explicitlySet__.add("blockErrorPageDescription");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AccessRule build() {
            AccessRule __instance__ =
                    new AccessRule(
                            name,
                            criteria,
                            action,
                            blockAction,
                            blockResponseCode,
                            blockErrorPageMessage,
                            blockErrorPageCode,
                            blockErrorPageDescription);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessRule o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .criteria(o.getCriteria())
                            .action(o.getAction())
                            .blockAction(o.getBlockAction())
                            .blockResponseCode(o.getBlockResponseCode())
                            .blockErrorPageMessage(o.getBlockErrorPageMessage())
                            .blockErrorPageCode(o.getBlockErrorPageCode())
                            .blockErrorPageDescription(o.getBlockErrorPageDescription());

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
     * The unique name of the access rule.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The list of access rule criteria.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("criteria")
    java.util.List<AccessRuleCriteria> criteria;
    /**
     * The action to take when the access criteria are met for a rule. If unspecified, defaults to `ALLOW`.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Action {
        Allow("ALLOW"),
        Detect("DETECT"),
        Block("BLOCK"),

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
     * The action to take when the access criteria are met for a rule. If unspecified, defaults to `ALLOW`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    Action action;
    /**
     * The method used to block requests if `action` is set to `BLOCK` and the access criteria are met. If unspecified, defaults to `SET_RESPONSE_CODE`.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum BlockAction {
        SetResponseCode("SET_RESPONSE_CODE"),
        ShowErrorPage("SHOW_ERROR_PAGE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, BlockAction> map;

        static {
            map = new java.util.HashMap<>();
            for (BlockAction v : BlockAction.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        BlockAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static BlockAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'BlockAction', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The method used to block requests if `action` is set to `BLOCK` and the access criteria are met. If unspecified, defaults to `SET_RESPONSE_CODE`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockAction")
    BlockAction blockAction;

    /**
     * The response status code to return when `action` is set to `BLOCK`, `blockAction` is set to `SET_RESPONSE_CODE`, and the access criteria are met. If unspecified, defaults to `403`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockResponseCode")
    Integer blockResponseCode;

    /**
     * The message to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the access criteria are met. If unspecified, defaults to 'Access to the website is blocked.'
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageMessage")
    String blockErrorPageMessage;

    /**
     * The error code to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the access criteria are met. If unspecified, defaults to 'Access rules'.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageCode")
    String blockErrorPageCode;

    /**
     * The description text to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the access criteria are met. If unspecified, defaults to 'Access blocked by website owner. Please contact support.'
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageDescription")
    String blockErrorPageDescription;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
