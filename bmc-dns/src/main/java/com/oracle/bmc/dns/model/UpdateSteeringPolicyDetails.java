/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dns.model;

/**
 * The body for updating a steering policy. New rules and answers provided in the request will
 * replace the existing rules and answers in the policy.
 * <p>
 *Warning:* Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateSteeringPolicyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class UpdateSteeringPolicyDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("ttl")
        private Integer ttl;

        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            this.__explicitlySet__.add("ttl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("healthCheckMonitorId")
        private String healthCheckMonitorId;

        public Builder healthCheckMonitorId(String healthCheckMonitorId) {
            this.healthCheckMonitorId = healthCheckMonitorId;
            this.__explicitlySet__.add("healthCheckMonitorId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("template")
        private Template template;

        public Builder template(Template template) {
            this.template = template;
            this.__explicitlySet__.add("template");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("answers")
        private java.util.List<SteeringPolicyAnswer> answers;

        public Builder answers(java.util.List<SteeringPolicyAnswer> answers) {
            this.answers = answers;
            this.__explicitlySet__.add("answers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rules")
        private java.util.List<SteeringPolicyRule> rules;

        public Builder rules(java.util.List<SteeringPolicyRule> rules) {
            this.rules = rules;
            this.__explicitlySet__.add("rules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSteeringPolicyDetails build() {
            UpdateSteeringPolicyDetails __instance__ =
                    new UpdateSteeringPolicyDetails(
                            displayName,
                            ttl,
                            healthCheckMonitorId,
                            template,
                            freeformTags,
                            definedTags,
                            answers,
                            rules);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSteeringPolicyDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .ttl(o.getTtl())
                            .healthCheckMonitorId(o.getHealthCheckMonitorId())
                            .template(o.getTemplate())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .answers(o.getAnswers())
                            .rules(o.getRules());

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
     * A user-friendly name for the steering policy.
     * Does not have to be unique, and it's changeable.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The Time To Live for responses from the steering policy, in seconds.
     * If not specified during creation, a value of 30 seconds will be used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ttl")
    Integer ttl;

    /**
     * The OCID of the health check monitor providing health data about the answers of the
     * steering policy.
     * A steering policy answer with `rdata` matching a monitored endpoint will use the health
     * data of that endpoint.
     * A steering policy answer with `rdata` not matching any monitored endpoint will be assumed
     * healthy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("healthCheckMonitorId")
    String healthCheckMonitorId;
    /**
     * The common pattern (or lack thereof) to which the steering policy adheres. This
     * value restricts the possible configurations of rules, but thereby supports
     * specifically tailored interfaces. Values other than \"CUSTOM\" require the rules to
     * begin with an unconditional FILTER that keeps answers contingent upon
     * `answer.isDisabled != true`, followed
     * _if and only if the policy references a health check monitor_ by an unconditional
     * HEALTH rule, and require the last rule to be an unconditional LIMIT.
     * What must precede the LIMIT rule is determined by the template value:
     * - FAILOVER requires exactly an unconditional PRIORITY rule that ranks answers by pool.
     *   Each answer pool must have a unique priority value assigned to it. Answer data must
     *   be defined in the `defaultAnswerData` property for the rule and the `cases` property
     *   must not be defined.
     * - LOAD_BALANCE requires exactly an unconditional WEIGHTED rule that shuffles answers
     *   by name. Answer data must be defined in the `defaultAnswerData` property for the
     *   rule and the `cases` property must not be defined.
     * - ROUTE_BY_GEO requires exactly one PRIORITY rule that ranks answers by pool using the
     *   geographical location of the client as a condition. Within that rule you may only
     *   use `query.client.geoKey` in the `caseCondition` expressions for defining the cases.
     *   For each case in the PRIORITY rule each answer pool must have a unique priority
     *   value assigned to it. Answer data can only be defined within cases and
     *   `defaultAnswerData` cannot be used in the PRIORITY rule.
     * - ROUTE_BY_ASN requires exactly one PRIORITY rule that ranks answers by pool using the
     *   ASN of the client as a condition. Within that rule you may only use
     *   `query.client.asn` in the `caseCondition` expressions for defining the cases.
     *   For each case in the PRIORITY rule each answer pool must have a unique priority
     *   value assigned to it. Answer data can only be defined within cases and
     *   `defaultAnswerData` cannot be used in the PRIORITY rule.
     * - ROUTE_BY_IP requires exactly one PRIORITY rule that ranks answers by pool using the
     *   IP subnet of the client as a condition. Within that rule you may only use
     *   `query.client.address` in the `caseCondition` expressions for defining the cases.
     *   For each case in the PRIORITY rule each answer pool must have a unique priority
     *   value assigned to it. Answer data can only be defined within cases and
     *   `defaultAnswerData` cannot be used in the PRIORITY rule.
     * - CUSTOM allows an arbitrary configuration of rules.
     * <p>
     * For an existing steering policy, the template value may be changed to any of the
     * supported options but the resulting policy must conform to the requirements for the
     * new template type or else a Bad Request error will be returned.
     *
     **/
    public enum Template {
        Failover("FAILOVER"),
        LoadBalance("LOAD_BALANCE"),
        RouteByGeo("ROUTE_BY_GEO"),
        RouteByAsn("ROUTE_BY_ASN"),
        RouteByIp("ROUTE_BY_IP"),
        Custom("CUSTOM"),
        ;

        private final String value;
        private static java.util.Map<String, Template> map;

        static {
            map = new java.util.HashMap<>();
            for (Template v : Template.values()) {
                map.put(v.getValue(), v);
            }
        }

        Template(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Template create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new RuntimeException("Invalid Template: " + key);
        }
    };
    /**
     * The common pattern (or lack thereof) to which the steering policy adheres. This
     * value restricts the possible configurations of rules, but thereby supports
     * specifically tailored interfaces. Values other than \"CUSTOM\" require the rules to
     * begin with an unconditional FILTER that keeps answers contingent upon
     * `answer.isDisabled != true`, followed
     * _if and only if the policy references a health check monitor_ by an unconditional
     * HEALTH rule, and require the last rule to be an unconditional LIMIT.
     * What must precede the LIMIT rule is determined by the template value:
     * - FAILOVER requires exactly an unconditional PRIORITY rule that ranks answers by pool.
     *   Each answer pool must have a unique priority value assigned to it. Answer data must
     *   be defined in the `defaultAnswerData` property for the rule and the `cases` property
     *   must not be defined.
     * - LOAD_BALANCE requires exactly an unconditional WEIGHTED rule that shuffles answers
     *   by name. Answer data must be defined in the `defaultAnswerData` property for the
     *   rule and the `cases` property must not be defined.
     * - ROUTE_BY_GEO requires exactly one PRIORITY rule that ranks answers by pool using the
     *   geographical location of the client as a condition. Within that rule you may only
     *   use `query.client.geoKey` in the `caseCondition` expressions for defining the cases.
     *   For each case in the PRIORITY rule each answer pool must have a unique priority
     *   value assigned to it. Answer data can only be defined within cases and
     *   `defaultAnswerData` cannot be used in the PRIORITY rule.
     * - ROUTE_BY_ASN requires exactly one PRIORITY rule that ranks answers by pool using the
     *   ASN of the client as a condition. Within that rule you may only use
     *   `query.client.asn` in the `caseCondition` expressions for defining the cases.
     *   For each case in the PRIORITY rule each answer pool must have a unique priority
     *   value assigned to it. Answer data can only be defined within cases and
     *   `defaultAnswerData` cannot be used in the PRIORITY rule.
     * - ROUTE_BY_IP requires exactly one PRIORITY rule that ranks answers by pool using the
     *   IP subnet of the client as a condition. Within that rule you may only use
     *   `query.client.address` in the `caseCondition` expressions for defining the cases.
     *   For each case in the PRIORITY rule each answer pool must have a unique priority
     *   value assigned to it. Answer data can only be defined within cases and
     *   `defaultAnswerData` cannot be used in the PRIORITY rule.
     * - CUSTOM allows an arbitrary configuration of rules.
     * <p>
     * For an existing steering policy, the template value may be changed to any of the
     * supported options but the resulting policy must conform to the requirements for the
     * new template type or else a Bad Request error will be returned.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("template")
    Template template;

    /**
     * Simple key-value pair that is applied without any predefined name, type, or scope.
     * For more information, see [Resource Tags](https://docs.us-phoenix-1.oraclecloud.com/Content/General/Concepts/resourcetags.htm).
     * Example: `{\"bar-key\": \"value\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Usage of predefined tag keys. These predefined keys are scoped to a namespace.
     * Example: `{\"foo-namespace\": {\"bar-key\": \"value\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * The set of all answers that can potentially issue from the steering policy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("answers")
    java.util.List<SteeringPolicyAnswer> answers;

    /**
     * The pipeline of rules that will be processed in sequence to reduce the pool of answers
     * to a response for any given request.
     * <p>
     * The first rule receives a shuffled list of all answers, and every other rule receives
     * the list of answers emitted by the one preceding it. The last rule populates the
     * response.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rules")
    java.util.List<SteeringPolicyRule> rules;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
