/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * A DNS steering policy.
 * <p>
 **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
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
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
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
     * steering policy. A steering policy answer with {@code rdata} matching a monitored endpoint
     * will use the health data of that endpoint. A steering policy answer with {@code rdata} not
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
     * **Example:** The {@code FAILOVER} template determines answers by filtering the policy's answers
     * using the {@code FILTER} rule first, then the following rules in succession: {@code HEALTH}, {@code PRIORITY},
     * and {@code LIMIT}. This gives the domain dynamic failover capability.
     * <p>
     *
     * It is **strongly recommended** to use a template other than {@code CUSTOM} when creating
     * a steering policy.
     * <p>
     *
     * All templates require the rule order to begin with an unconditional {@code FILTER} rule that keeps
     * answers contingent upon {@code answer.isDisabled != true}, except for {@code CUSTOM}. A defined
     * {@code HEALTH} rule must follow the {@code FILTER} rule if the policy references a {@code healthCheckMonitorId}.
     * The last rule of a template must must be a {@code LIMIT} rule. For more information about templates
     * and code examples, see [Traffic Management API Guide](https://docs.cloud.oracle.com/iaas/Content/TrafficManagement/Concepts/trafficmanagementapi.htm).
     * <p>
     **Template Types**
     * <p>
     * {@code FAILOVER} - Uses health check information on your endpoints to determine which DNS answers
     * to serve. If an endpoint fails a health check, the answer for that endpoint will be removed
     * from the list of available answers until the endpoint is detected as healthy.
     * <p>
     *
     * * {@code LOAD_BALANCE} - Distributes web traffic to specified endpoints based on defined weights.
     * <p>
     *
     * * {@code ROUTE_BY_GEO} - Answers DNS queries based on the query's geographic location. For a list of geographic
     * locations to route by, see [Traffic Management Geographic Locations](https://docs.cloud.oracle.com/iaas/Content/TrafficManagement/Reference/trafficmanagementgeo.htm).
     * <p>
     *
     * * {@code ROUTE_BY_ASN} - Answers DNS queries based on the query's originating ASN.
     * <p>
     *
     * * {@code ROUTE_BY_IP} - Answers DNS queries based on the query's IP address.
     * <p>
     *
     * * {@code CUSTOM} - Allows a customized configuration of rules.
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
     * A set of predefined rules based on the desired purpose of the steering policy. Each
     * template utilizes Traffic Management's rules in a different order to produce the desired
     * results when answering DNS queries.
     * <p>
     *
     * **Example:** The {@code FAILOVER} template determines answers by filtering the policy's answers
     * using the {@code FILTER} rule first, then the following rules in succession: {@code HEALTH}, {@code PRIORITY},
     * and {@code LIMIT}. This gives the domain dynamic failover capability.
     * <p>
     *
     * It is **strongly recommended** to use a template other than {@code CUSTOM} when creating
     * a steering policy.
     * <p>
     *
     * All templates require the rule order to begin with an unconditional {@code FILTER} rule that keeps
     * answers contingent upon {@code answer.isDisabled != true}, except for {@code CUSTOM}. A defined
     * {@code HEALTH} rule must follow the {@code FILTER} rule if the policy references a {@code healthCheckMonitorId}.
     * The last rule of a template must must be a {@code LIMIT} rule. For more information about templates
     * and code examples, see [Traffic Management API Guide](https://docs.cloud.oracle.com/iaas/Content/TrafficManagement/Concepts/trafficmanagementapi.htm).
     * <p>
     **Template Types**
     * <p>
     * {@code FAILOVER} - Uses health check information on your endpoints to determine which DNS answers
     * to serve. If an endpoint fails a health check, the answer for that endpoint will be removed
     * from the list of available answers until the endpoint is detected as healthy.
     * <p>
     *
     * * {@code LOAD_BALANCE} - Distributes web traffic to specified endpoints based on defined weights.
     * <p>
     *
     * * {@code ROUTE_BY_GEO} - Answers DNS queries based on the query's geographic location. For a list of geographic
     * locations to route by, see [Traffic Management Geographic Locations](https://docs.cloud.oracle.com/iaas/Content/TrafficManagement/Reference/trafficmanagementgeo.htm).
     * <p>
     *
     * * {@code ROUTE_BY_ASN} - Answers DNS queries based on the query's originating ASN.
     * <p>
     *
     * * {@code ROUTE_BY_IP} - Answers DNS queries based on the query's IP address.
     * <p>
     *
     * * {@code CUSTOM} - Allows a customized configuration of rules.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("template")
    Template template;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     *
     * **Example:** {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     *
     * **Example:** {@code {"Operations": {"CostCenter": "42"}}}
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
     * The date and time the resource was created, expressed in RFC 3339 timestamp format.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:60Z}
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
