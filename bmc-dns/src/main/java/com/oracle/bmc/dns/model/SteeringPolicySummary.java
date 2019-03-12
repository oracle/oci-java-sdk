/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dns.model;

/**
 * A DNS steering policy.
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
    builder = SteeringPolicySummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class SteeringPolicySummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("self")
        private String self;

        public Builder self(String self) {
            this.self = self;
            this.__explicitlySet__.add("self");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SteeringPolicySummary build() {
            SteeringPolicySummary __instance__ =
                    new SteeringPolicySummary(
                            compartmentId,
                            displayName,
                            ttl,
                            healthCheckMonitorId,
                            template,
                            freeformTags,
                            definedTags,
                            self,
                            id,
                            timeCreated,
                            lifecycleState);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SteeringPolicySummary o) {
            Builder copiedBuilder =
                    compartmentId(o.getCompartmentId())
                            .displayName(o.getDisplayName())
                            .ttl(o.getTtl())
                            .healthCheckMonitorId(o.getHealthCheckMonitorId())
                            .template(o.getTemplate())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .self(o.getSelf())
                            .id(o.getId())
                            .timeCreated(o.getTimeCreated())
                            .lifecycleState(o.getLifecycleState());

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
     * The OCID of the compartment containing the steering policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

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
    @lombok.extern.slf4j.Slf4j
    public enum Template {
        Failover("FAILOVER"),
        LoadBalance("LOAD_BALANCE"),
        RouteByGeo("ROUTE_BY_GEO"),
        RouteByAsn("ROUTE_BY_ASN"),
        RouteByIp("ROUTE_BY_IP"),
        Custom("CUSTOM"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Template> map;

        static {
            map = new java.util.HashMap<>();
            for (Template v : Template.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'Template', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
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
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
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
     * The canonical absolute URL of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("self")
    String self;

    /**
     * The OCID of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The date and time the resource was created in \"YYYY-MM-ddThh:mmZ\" format
     * with a Z offset, as defined by RFC 3339.
     * <p>
     **Example:** `2016-07-22T17:23:59:60Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;
    /**
     * The current state of the resource.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Active("ACTIVE"),
        Creating("CREATING"),
        Deleted("DELETED"),
        Deleting("DELETING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
