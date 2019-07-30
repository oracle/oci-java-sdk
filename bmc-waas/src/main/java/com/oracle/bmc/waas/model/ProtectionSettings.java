/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.waas.model;

/**
 * The settings used for protection rules.
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
    builder = ProtectionSettings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class ProtectionSettings {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
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

        @com.fasterxml.jackson.annotation.JsonProperty("maxArgumentCount")
        private Integer maxArgumentCount;

        public Builder maxArgumentCount(Integer maxArgumentCount) {
            this.maxArgumentCount = maxArgumentCount;
            this.__explicitlySet__.add("maxArgumentCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxNameLengthPerArgument")
        private Integer maxNameLengthPerArgument;

        public Builder maxNameLengthPerArgument(Integer maxNameLengthPerArgument) {
            this.maxNameLengthPerArgument = maxNameLengthPerArgument;
            this.__explicitlySet__.add("maxNameLengthPerArgument");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxTotalNameLengthOfArguments")
        private Integer maxTotalNameLengthOfArguments;

        public Builder maxTotalNameLengthOfArguments(Integer maxTotalNameLengthOfArguments) {
            this.maxTotalNameLengthOfArguments = maxTotalNameLengthOfArguments;
            this.__explicitlySet__.add("maxTotalNameLengthOfArguments");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("recommendationsPeriodInDays")
        private Integer recommendationsPeriodInDays;

        public Builder recommendationsPeriodInDays(Integer recommendationsPeriodInDays) {
            this.recommendationsPeriodInDays = recommendationsPeriodInDays;
            this.__explicitlySet__.add("recommendationsPeriodInDays");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isResponseInspected")
        private Boolean isResponseInspected;

        public Builder isResponseInspected(Boolean isResponseInspected) {
            this.isResponseInspected = isResponseInspected;
            this.__explicitlySet__.add("isResponseInspected");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maxResponseSizeInKiB")
        private Integer maxResponseSizeInKiB;

        public Builder maxResponseSizeInKiB(Integer maxResponseSizeInKiB) {
            this.maxResponseSizeInKiB = maxResponseSizeInKiB;
            this.__explicitlySet__.add("maxResponseSizeInKiB");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allowedHttpMethods")
        private java.util.List<AllowedHttpMethods> allowedHttpMethods;

        public Builder allowedHttpMethods(java.util.List<AllowedHttpMethods> allowedHttpMethods) {
            this.allowedHttpMethods = allowedHttpMethods;
            this.__explicitlySet__.add("allowedHttpMethods");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mediaTypes")
        private java.util.List<String> mediaTypes;

        public Builder mediaTypes(java.util.List<String> mediaTypes) {
            this.mediaTypes = mediaTypes;
            this.__explicitlySet__.add("mediaTypes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ProtectionSettings build() {
            ProtectionSettings __instance__ =
                    new ProtectionSettings(
                            blockAction,
                            blockResponseCode,
                            blockErrorPageMessage,
                            blockErrorPageCode,
                            blockErrorPageDescription,
                            maxArgumentCount,
                            maxNameLengthPerArgument,
                            maxTotalNameLengthOfArguments,
                            recommendationsPeriodInDays,
                            isResponseInspected,
                            maxResponseSizeInKiB,
                            allowedHttpMethods,
                            mediaTypes);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ProtectionSettings o) {
            Builder copiedBuilder =
                    blockAction(o.getBlockAction())
                            .blockResponseCode(o.getBlockResponseCode())
                            .blockErrorPageMessage(o.getBlockErrorPageMessage())
                            .blockErrorPageCode(o.getBlockErrorPageCode())
                            .blockErrorPageDescription(o.getBlockErrorPageDescription())
                            .maxArgumentCount(o.getMaxArgumentCount())
                            .maxNameLengthPerArgument(o.getMaxNameLengthPerArgument())
                            .maxTotalNameLengthOfArguments(o.getMaxTotalNameLengthOfArguments())
                            .recommendationsPeriodInDays(o.getRecommendationsPeriodInDays())
                            .isResponseInspected(o.getIsResponseInspected())
                            .maxResponseSizeInKiB(o.getMaxResponseSizeInKiB())
                            .allowedHttpMethods(o.getAllowedHttpMethods())
                            .mediaTypes(o.getMediaTypes());

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
     * If `action` is set to `BLOCK`, this specifies how the traffic is blocked when detected as malicious by a protection rule. If unspecified, defaults to `SET_RESPONSE_CODE`.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum BlockAction {
        ShowErrorPage("SHOW_ERROR_PAGE"),
        SetResponseCode("SET_RESPONSE_CODE"),

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
     * If `action` is set to `BLOCK`, this specifies how the traffic is blocked when detected as malicious by a protection rule. If unspecified, defaults to `SET_RESPONSE_CODE`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockAction")
    BlockAction blockAction;

    /**
     * The response code returned when `action` is set to `BLOCK`, `blockAction` is set to `SET_RESPONSE_CODE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to `403`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockResponseCode")
    Integer blockResponseCode;

    /**
     * The message to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to 'Access to the website is blocked.'
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageMessage")
    String blockErrorPageMessage;

    /**
     * The error code to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to `403`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageCode")
    String blockErrorPageCode;

    /**
     * The description text to show on the error page when `action` is set to `BLOCK`, `blockAction` is set to `SHOW_ERROR_PAGE`, and the traffic is detected as malicious by a protection rule. If unspecified, defaults to `Access blocked by website owner. Please contact support.`
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockErrorPageDescription")
    String blockErrorPageDescription;

    /**
     * The maximum number of arguments allowed to be passed to your application before an action is taken. Arguements are query parameters or body parameters in a PUT or POST request. If unspecified, defaults to `255`. This setting only applies if a corresponding protection rule is enabled, such as the \"Number of Arguments Limits\" rule (key: 960335).
     * <p>
     * Example: If `maxArgumentCount` to `2` for the Max Number of Arguments protection rule (key: 960335), the following requests would be blocked:
     * `GET /myapp/path?query=one&query=two&query=three`
     * `POST /myapp/path` with Body `{\"argument1\":\"one\",\"argument2\":\"two\",\"argument3\":\"three\"}`
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxArgumentCount")
    Integer maxArgumentCount;

    /**
     * The maximum length allowed for each argument name, in characters. Arguements are query parameters or body parameters in a PUT or POST request. If unspecified, defaults to `400`. This setting only applies if a corresponding protection rule is enabled, such as the \"Values Limits\" rule (key: 960208).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxNameLengthPerArgument")
    Integer maxNameLengthPerArgument;

    /**
     * The maximum length allowed for the sum of the argument name and value, in characters. Arguements are query parameters or body parameters in a PUT or POST request. If unspecified, defaults to `64000`. This setting only applies if a corresponding protection rule is enabled, such as the \"Total Arguments Limits\" rule (key: 960341).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxTotalNameLengthOfArguments")
    Integer maxTotalNameLengthOfArguments;

    /**
     * The length of time to analyze traffic traffic, in days. After the analysis period, `WafRecommendations` will be populated. If unspecified, defaults to `10`.
     * <p>
     * Use `GET /waasPolicies/{waasPolicyId}/wafRecommendations` to view WAF recommendations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("recommendationsPeriodInDays")
    Integer recommendationsPeriodInDays;

    /**
     * Inspects the response body of origin responses. Can be used to detect leakage of sensitive data. If unspecified, defaults to `false`.
     * <p>
     **Note:** Only origin responses with a Content-Type matching a value in `mediaTypes` will be inspected.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isResponseInspected")
    Boolean isResponseInspected;

    /**
     * The maximum response size to be fully inspected, in binary kilobytes (KiB). Anything over this limit will be partially inspected. If unspecified, defaults to `1024`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("maxResponseSizeInKiB")
    Integer maxResponseSizeInKiB;
    /**
     **/
    @lombok.extern.slf4j.Slf4j
    public enum AllowedHttpMethods {
        Options("OPTIONS"),
        Get("GET"),
        Head("HEAD"),
        Post("POST"),
        Put("PUT"),
        Delete("DELETE"),
        Trace("TRACE"),
        Connect("CONNECT"),
        Patch("PATCH"),
        Propfind("PROPFIND"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, AllowedHttpMethods> map;

        static {
            map = new java.util.HashMap<>();
            for (AllowedHttpMethods v : AllowedHttpMethods.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        AllowedHttpMethods(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static AllowedHttpMethods create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'AllowedHttpMethods', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The list of allowed HTTP methods. If unspecified, default to `[OPTIONS, GET, HEAD, POST]`. This setting only applies if a corresponding protection rule is enabled, such as the \"Restrict HTTP Request Methods\" rule (key: 911100).
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedHttpMethods")
    java.util.List<AllowedHttpMethods> allowedHttpMethods;

    /**
     * The list of media types to allow for inspection, if `isResponseInspected` is enabled. Only responses with MIME types in this list will be inspected. If unspecified, defaults to `[\"text/html\", \"text/plain\", \"text/xml\"]`.
     * <p>
     * Supported MIME types include:
     * <p>
     * - text/html
     *     - text/plain
     *     - text/asp
     *     - text/css
     *     - text/x-script
     *     - application/json
     *     - text/webviewhtml
     *     - text/x-java-source
     *     - application/x-javascript
     *     - application/javascript
     *     - application/ecmascript
     *     - text/javascript
     *     - text/ecmascript
     *     - text/x-script.perl
     *     - text/x-script.phyton
     *     - application/plain
     *     - application/xml
     *     - text/xml
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("mediaTypes")
    java.util.List<String> mediaTypes;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
