/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * The body for updating a steering policy. New rules and answers provided in the request will
 * replace the existing rules and answers in the policy.
 * <p>
 *
 * **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
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
     * A user-friendly name for the steering policy. Does not have to be unique and can be changed.
     * Avoid entering confidential information.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The Time To Live (TTL) for responses from the steering policy, in seconds.
     * If not specified during creation, a value of 30 seconds will be used.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ttl")
    Integer ttl;

    /**
     * The OCID of the health check monitor providing health data about the answers of the
     * steering policy. A steering policy answer with `rdata` matching a monitored endpoint
     * will use the health data of that endpoint. A steering policy answer with `rdata` not
     * matching any monitored endpoint will be assumed healthy.
     * <p>
     *
     * **Note:** To use the Health Check monitoring feature in a steering policy, a monitor
     * must be created using the Health Checks service first. For more information on how to
     * create a monitor, please see [Managing Health Checks](https://docs.cloud.oracle.com/iaas/Content/HealthChecks/Tasks/managinghealthchecks.htm).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("healthCheckMonitorId")
    String healthCheckMonitorId;
    /**
     * A set of predefined rules based on the desired purpose of the steering policy. Each
     * template utilizes Traffic Management's rules in a different order to produce the desired
     * results when answering DNS queries.
     * <p>
     *
     * **Example:** The `FAILOVER` template determines answers by filtering the policy's answers
     * using the `FILTER` rule first, then the following rules in succession: `HEALTH`, `PRIORITY`,
     * and `LIMIT`. This gives the domain dynamic failover capability.
     * <p>
     *
     * It is **strongly recommended** to use a template other than `CUSTOM` when creating
     * a steering policy.
     * <p>
     *
     * All templates require the rule order to begin with an unconditional `FILTER` rule that keeps
     * answers contingent upon `answer.isDisabled != true`, except for `CUSTOM`. A defined
     * `HEALTH` rule must follow the `FILTER` rule if the policy references a `healthCheckMonitorId`.
     * The last rule of a template must must be a `LIMIT` rule. For more information about templates
     * and code examples, see [Traffic Management API Guide](https://docs.cloud.oracle.com/iaas/Content/TrafficManagement/Concepts/trafficmanagementapi.htm).
     * <p>
     **Template Types**
     * <p>
     * `FAILOVER` - Uses health check information on your endpoints to determine which DNS answers
     * to serve. If an endpoint fails a health check, the answer for that endpoint will be removed
     * from the list of available answers until the endpoint is detected as healthy.
     * <p>
     *
     * * `LOAD_BALANCE` - Distributes web traffic to specified endpoints based on defined weights.
     * <p>
     *
     * * `ROUTE_BY_GEO` - Answers DNS queries based on the query's geographic location. For a list of geographic
     * locations to route by, see [Traffic Management Geographic Locations](https://docs.cloud.oracle.com/iaas/Content/TrafficManagement/Reference/trafficmanagementgeo.htm).
     * <p>
     *
     * * `ROUTE_BY_ASN` - Answers DNS queries based on the query's originating ASN.
     * <p>
     *
     * * `ROUTE_BY_IP` - Answers DNS queries based on the query's IP address.
     * <p>
     *
     * * `CUSTOM` - Allows a customized configuration of rules.
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
            throw new IllegalArgumentException("Invalid Template: " + key);
        }
    };
    /**
     * A set of predefined rules based on the desired purpose of the steering policy. Each
     * template utilizes Traffic Management's rules in a different order to produce the desired
     * results when answering DNS queries.
     * <p>
     *
     * **Example:** The `FAILOVER` template determines answers by filtering the policy's answers
     * using the `FILTER` rule first, then the following rules in succession: `HEALTH`, `PRIORITY`,
     * and `LIMIT`. This gives the domain dynamic failover capability.
     * <p>
     *
     * It is **strongly recommended** to use a template other than `CUSTOM` when creating
     * a steering policy.
     * <p>
     *
     * All templates require the rule order to begin with an unconditional `FILTER` rule that keeps
     * answers contingent upon `answer.isDisabled != true`, except for `CUSTOM`. A defined
     * `HEALTH` rule must follow the `FILTER` rule if the policy references a `healthCheckMonitorId`.
     * The last rule of a template must must be a `LIMIT` rule. For more information about templates
     * and code examples, see [Traffic Management API Guide](https://docs.cloud.oracle.com/iaas/Content/TrafficManagement/Concepts/trafficmanagementapi.htm).
     * <p>
     **Template Types**
     * <p>
     * `FAILOVER` - Uses health check information on your endpoints to determine which DNS answers
     * to serve. If an endpoint fails a health check, the answer for that endpoint will be removed
     * from the list of available answers until the endpoint is detected as healthy.
     * <p>
     *
     * * `LOAD_BALANCE` - Distributes web traffic to specified endpoints based on defined weights.
     * <p>
     *
     * * `ROUTE_BY_GEO` - Answers DNS queries based on the query's geographic location. For a list of geographic
     * locations to route by, see [Traffic Management Geographic Locations](https://docs.cloud.oracle.com/iaas/Content/TrafficManagement/Reference/trafficmanagementgeo.htm).
     * <p>
     *
     * * `ROUTE_BY_ASN` - Answers DNS queries based on the query's originating ASN.
     * <p>
     *
     * * `ROUTE_BY_IP` - Answers DNS queries based on the query's IP address.
     * <p>
     *
     * * `CUSTOM` - Allows a customized configuration of rules.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("template")
    Template template;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     *
     * **Example:** `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     *
     * **Example:** `{\"Operations\": {\"CostCenter\": \"42\"}}`
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
     * The series of rules that will be processed in sequence to reduce the pool of answers
     * to a response for any given request.
     * <p>
     *
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
