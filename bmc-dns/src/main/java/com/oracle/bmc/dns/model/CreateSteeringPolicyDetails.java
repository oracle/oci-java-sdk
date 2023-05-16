/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * The body for defining a new steering policy.
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateSteeringPolicyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateSteeringPolicyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "displayName",
        "ttl",
        "healthCheckMonitorId",
        "template",
        "freeformTags",
        "definedTags",
        "answers",
        "rules"
    })
    public CreateSteeringPolicyDetails(
            String compartmentId,
            String displayName,
            Integer ttl,
            String healthCheckMonitorId,
            Template template,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.List<SteeringPolicyAnswer> answers,
            java.util.List<SteeringPolicyRule> rules) {
        super();
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.ttl = ttl;
        this.healthCheckMonitorId = healthCheckMonitorId;
        this.template = template;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.answers = answers;
        this.rules = rules;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the compartment containing the steering policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment containing the steering policy.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A user-friendly name for the steering policy. Does not have to be unique and can be
         * changed. Avoid entering confidential information.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * A user-friendly name for the steering policy. Does not have to be unique and can be
         * changed. Avoid entering confidential information.
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The Time To Live (TTL) for responses from the steering policy, in seconds. If not
         * specified during creation, a value of 30 seconds will be used.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("ttl")
        private Integer ttl;

        /**
         * The Time To Live (TTL) for responses from the steering policy, in seconds. If not
         * specified during creation, a value of 30 seconds will be used.
         *
         * @param ttl the value to set
         * @return this builder
         */
        public Builder ttl(Integer ttl) {
            this.ttl = ttl;
            this.__explicitlySet__.add("ttl");
            return this;
        }
        /**
         * The OCID of the health check monitor providing health data about the answers of the
         * steering policy. A steering policy answer with {@code rdata} matching a monitored
         * endpoint will use the health data of that endpoint. A steering policy answer with {@code
         * rdata} not matching any monitored endpoint will be assumed healthy.
         *
         * <p>**Note:** To use the Health Check monitoring feature in a steering policy, a monitor
         * must be created using the Health Checks service first. For more information on how to
         * create a monitor, please see [Managing Health
         * Checks](https://docs.cloud.oracle.com/iaas/Content/HealthChecks/Tasks/managinghealthchecks.htm).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("healthCheckMonitorId")
        private String healthCheckMonitorId;

        /**
         * The OCID of the health check monitor providing health data about the answers of the
         * steering policy. A steering policy answer with {@code rdata} matching a monitored
         * endpoint will use the health data of that endpoint. A steering policy answer with {@code
         * rdata} not matching any monitored endpoint will be assumed healthy.
         *
         * <p>**Note:** To use the Health Check monitoring feature in a steering policy, a monitor
         * must be created using the Health Checks service first. For more information on how to
         * create a monitor, please see [Managing Health
         * Checks](https://docs.cloud.oracle.com/iaas/Content/HealthChecks/Tasks/managinghealthchecks.htm).
         *
         * @param healthCheckMonitorId the value to set
         * @return this builder
         */
        public Builder healthCheckMonitorId(String healthCheckMonitorId) {
            this.healthCheckMonitorId = healthCheckMonitorId;
            this.__explicitlySet__.add("healthCheckMonitorId");
            return this;
        }
        /**
         * A set of predefined rules based on the desired purpose of the steering policy. Each
         * template utilizes Traffic Management's rules in a different order to produce the desired
         * results when answering DNS queries.
         *
         * <p>**Example:** The {@code FAILOVER} template determines answers by filtering the
         * policy's answers using the {@code FILTER} rule first, then the following rules in
         * succession: {@code HEALTH}, {@code PRIORITY}, and {@code LIMIT}. This gives the domain
         * dynamic failover capability.
         *
         * <p>It is **strongly recommended** to use a template other than {@code CUSTOM} when
         * creating a steering policy.
         *
         * <p>All templates require the rule order to begin with an unconditional {@code FILTER}
         * rule that keeps answers contingent upon {@code answer.isDisabled != true}, except for
         * {@code CUSTOM}. A defined {@code HEALTH} rule must follow the {@code FILTER} rule if the
         * policy references a {@code healthCheckMonitorId}. The last rule of a template must must
         * be a {@code LIMIT} rule. For more information about templates and code examples, see
         * [Traffic Management API
         * Guide](https://docs.cloud.oracle.com/iaas/Content/TrafficManagement/Concepts/trafficmanagementapi.htm).
         *
         * <p>*Template Types**
         *
         * <p>{@code FAILOVER} - Uses health check information on your endpoints to determine which
         * DNS answers to serve. If an endpoint fails a health check, the answer for that endpoint
         * will be removed from the list of available answers until the endpoint is detected as
         * healthy.
         *
         * <p>* {@code LOAD_BALANCE} - Distributes web traffic to specified endpoints based on
         * defined weights.
         *
         * <p>* {@code ROUTE_BY_GEO} - Answers DNS queries based on the query's geographic location.
         * For a list of geographic locations to route by, see [Traffic Management Geographic
         * Locations](https://docs.cloud.oracle.com/iaas/Content/TrafficManagement/Reference/trafficmanagementgeo.htm).
         *
         * <p>* {@code ROUTE_BY_ASN} - Answers DNS queries based on the query's originating ASN.
         *
         * <p>* {@code ROUTE_BY_IP} - Answers DNS queries based on the query's IP address.
         *
         * <p>* {@code CUSTOM} - Allows a customized configuration of rules.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("template")
        private Template template;

        /**
         * A set of predefined rules based on the desired purpose of the steering policy. Each
         * template utilizes Traffic Management's rules in a different order to produce the desired
         * results when answering DNS queries.
         *
         * <p>**Example:** The {@code FAILOVER} template determines answers by filtering the
         * policy's answers using the {@code FILTER} rule first, then the following rules in
         * succession: {@code HEALTH}, {@code PRIORITY}, and {@code LIMIT}. This gives the domain
         * dynamic failover capability.
         *
         * <p>It is **strongly recommended** to use a template other than {@code CUSTOM} when
         * creating a steering policy.
         *
         * <p>All templates require the rule order to begin with an unconditional {@code FILTER}
         * rule that keeps answers contingent upon {@code answer.isDisabled != true}, except for
         * {@code CUSTOM}. A defined {@code HEALTH} rule must follow the {@code FILTER} rule if the
         * policy references a {@code healthCheckMonitorId}. The last rule of a template must must
         * be a {@code LIMIT} rule. For more information about templates and code examples, see
         * [Traffic Management API
         * Guide](https://docs.cloud.oracle.com/iaas/Content/TrafficManagement/Concepts/trafficmanagementapi.htm).
         *
         * <p>*Template Types**
         *
         * <p>{@code FAILOVER} - Uses health check information on your endpoints to determine which
         * DNS answers to serve. If an endpoint fails a health check, the answer for that endpoint
         * will be removed from the list of available answers until the endpoint is detected as
         * healthy.
         *
         * <p>* {@code LOAD_BALANCE} - Distributes web traffic to specified endpoints based on
         * defined weights.
         *
         * <p>* {@code ROUTE_BY_GEO} - Answers DNS queries based on the query's geographic location.
         * For a list of geographic locations to route by, see [Traffic Management Geographic
         * Locations](https://docs.cloud.oracle.com/iaas/Content/TrafficManagement/Reference/trafficmanagementgeo.htm).
         *
         * <p>* {@code ROUTE_BY_ASN} - Answers DNS queries based on the query's originating ASN.
         *
         * <p>* {@code ROUTE_BY_IP} - Answers DNS queries based on the query's IP address.
         *
         * <p>* {@code CUSTOM} - Allows a customized configuration of rules.
         *
         * @param template the value to set
         * @return this builder
         */
        public Builder template(Template template) {
            this.template = template;
            this.__explicitlySet__.add("template");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>**Example:** {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>**Example:** {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>**Example:** {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>**Example:** {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /** The set of all answers that can potentially issue from the steering policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("answers")
        private java.util.List<SteeringPolicyAnswer> answers;

        /**
         * The set of all answers that can potentially issue from the steering policy.
         *
         * @param answers the value to set
         * @return this builder
         */
        public Builder answers(java.util.List<SteeringPolicyAnswer> answers) {
            this.answers = answers;
            this.__explicitlySet__.add("answers");
            return this;
        }
        /**
         * The series of rules that will be processed in sequence to reduce the pool of answers to a
         * response for any given request.
         *
         * <p>The first rule receives a shuffled list of all answers, and every other rule receives
         * the list of answers emitted by the one preceding it. The last rule populates the
         * response.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("rules")
        private java.util.List<SteeringPolicyRule> rules;

        /**
         * The series of rules that will be processed in sequence to reduce the pool of answers to a
         * response for any given request.
         *
         * <p>The first rule receives a shuffled list of all answers, and every other rule receives
         * the list of answers emitted by the one preceding it. The last rule populates the
         * response.
         *
         * @param rules the value to set
         * @return this builder
         */
        public Builder rules(java.util.List<SteeringPolicyRule> rules) {
            this.rules = rules;
            this.__explicitlySet__.add("rules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSteeringPolicyDetails build() {
            CreateSteeringPolicyDetails model =
                    new CreateSteeringPolicyDetails(
                            this.compartmentId,
                            this.displayName,
                            this.ttl,
                            this.healthCheckMonitorId,
                            this.template,
                            this.freeformTags,
                            this.definedTags,
                            this.answers,
                            this.rules);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSteeringPolicyDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("ttl")) {
                this.ttl(model.getTtl());
            }
            if (model.wasPropertyExplicitlySet("healthCheckMonitorId")) {
                this.healthCheckMonitorId(model.getHealthCheckMonitorId());
            }
            if (model.wasPropertyExplicitlySet("template")) {
                this.template(model.getTemplate());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("answers")) {
                this.answers(model.getAnswers());
            }
            if (model.wasPropertyExplicitlySet("rules")) {
                this.rules(model.getRules());
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

    /** The OCID of the compartment containing the steering policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment containing the steering policy.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A user-friendly name for the steering policy. Does not have to be unique and can be changed.
     * Avoid entering confidential information.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * A user-friendly name for the steering policy. Does not have to be unique and can be changed.
     * Avoid entering confidential information.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The Time To Live (TTL) for responses from the steering policy, in seconds. If not specified
     * during creation, a value of 30 seconds will be used.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ttl")
    private final Integer ttl;

    /**
     * The Time To Live (TTL) for responses from the steering policy, in seconds. If not specified
     * during creation, a value of 30 seconds will be used.
     *
     * @return the value
     */
    public Integer getTtl() {
        return ttl;
    }

    /**
     * The OCID of the health check monitor providing health data about the answers of the steering
     * policy. A steering policy answer with {@code rdata} matching a monitored endpoint will use
     * the health data of that endpoint. A steering policy answer with {@code rdata} not matching
     * any monitored endpoint will be assumed healthy.
     *
     * <p>**Note:** To use the Health Check monitoring feature in a steering policy, a monitor must
     * be created using the Health Checks service first. For more information on how to create a
     * monitor, please see [Managing Health
     * Checks](https://docs.cloud.oracle.com/iaas/Content/HealthChecks/Tasks/managinghealthchecks.htm).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("healthCheckMonitorId")
    private final String healthCheckMonitorId;

    /**
     * The OCID of the health check monitor providing health data about the answers of the steering
     * policy. A steering policy answer with {@code rdata} matching a monitored endpoint will use
     * the health data of that endpoint. A steering policy answer with {@code rdata} not matching
     * any monitored endpoint will be assumed healthy.
     *
     * <p>**Note:** To use the Health Check monitoring feature in a steering policy, a monitor must
     * be created using the Health Checks service first. For more information on how to create a
     * monitor, please see [Managing Health
     * Checks](https://docs.cloud.oracle.com/iaas/Content/HealthChecks/Tasks/managinghealthchecks.htm).
     *
     * @return the value
     */
    public String getHealthCheckMonitorId() {
        return healthCheckMonitorId;
    }

    /**
     * A set of predefined rules based on the desired purpose of the steering policy. Each template
     * utilizes Traffic Management's rules in a different order to produce the desired results when
     * answering DNS queries.
     *
     * <p>**Example:** The {@code FAILOVER} template determines answers by filtering the policy's
     * answers using the {@code FILTER} rule first, then the following rules in succession: {@code
     * HEALTH}, {@code PRIORITY}, and {@code LIMIT}. This gives the domain dynamic failover
     * capability.
     *
     * <p>It is **strongly recommended** to use a template other than {@code CUSTOM} when creating a
     * steering policy.
     *
     * <p>All templates require the rule order to begin with an unconditional {@code FILTER} rule
     * that keeps answers contingent upon {@code answer.isDisabled != true}, except for {@code
     * CUSTOM}. A defined {@code HEALTH} rule must follow the {@code FILTER} rule if the policy
     * references a {@code healthCheckMonitorId}. The last rule of a template must must be a {@code
     * LIMIT} rule. For more information about templates and code examples, see [Traffic Management
     * API
     * Guide](https://docs.cloud.oracle.com/iaas/Content/TrafficManagement/Concepts/trafficmanagementapi.htm).
     *
     * <p>*Template Types**
     *
     * <p>{@code FAILOVER} - Uses health check information on your endpoints to determine which DNS
     * answers to serve. If an endpoint fails a health check, the answer for that endpoint will be
     * removed from the list of available answers until the endpoint is detected as healthy.
     *
     * <p>* {@code LOAD_BALANCE} - Distributes web traffic to specified endpoints based on defined
     * weights.
     *
     * <p>* {@code ROUTE_BY_GEO} - Answers DNS queries based on the query's geographic location. For
     * a list of geographic locations to route by, see [Traffic Management Geographic
     * Locations](https://docs.cloud.oracle.com/iaas/Content/TrafficManagement/Reference/trafficmanagementgeo.htm).
     *
     * <p>* {@code ROUTE_BY_ASN} - Answers DNS queries based on the query's originating ASN.
     *
     * <p>* {@code ROUTE_BY_IP} - Answers DNS queries based on the query's IP address.
     *
     * <p>* {@code CUSTOM} - Allows a customized configuration of rules.
     */
    public enum Template implements com.oracle.bmc.http.internal.BmcEnum {
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
     * A set of predefined rules based on the desired purpose of the steering policy. Each template
     * utilizes Traffic Management's rules in a different order to produce the desired results when
     * answering DNS queries.
     *
     * <p>**Example:** The {@code FAILOVER} template determines answers by filtering the policy's
     * answers using the {@code FILTER} rule first, then the following rules in succession: {@code
     * HEALTH}, {@code PRIORITY}, and {@code LIMIT}. This gives the domain dynamic failover
     * capability.
     *
     * <p>It is **strongly recommended** to use a template other than {@code CUSTOM} when creating a
     * steering policy.
     *
     * <p>All templates require the rule order to begin with an unconditional {@code FILTER} rule
     * that keeps answers contingent upon {@code answer.isDisabled != true}, except for {@code
     * CUSTOM}. A defined {@code HEALTH} rule must follow the {@code FILTER} rule if the policy
     * references a {@code healthCheckMonitorId}. The last rule of a template must must be a {@code
     * LIMIT} rule. For more information about templates and code examples, see [Traffic Management
     * API
     * Guide](https://docs.cloud.oracle.com/iaas/Content/TrafficManagement/Concepts/trafficmanagementapi.htm).
     *
     * <p>*Template Types**
     *
     * <p>{@code FAILOVER} - Uses health check information on your endpoints to determine which DNS
     * answers to serve. If an endpoint fails a health check, the answer for that endpoint will be
     * removed from the list of available answers until the endpoint is detected as healthy.
     *
     * <p>* {@code LOAD_BALANCE} - Distributes web traffic to specified endpoints based on defined
     * weights.
     *
     * <p>* {@code ROUTE_BY_GEO} - Answers DNS queries based on the query's geographic location. For
     * a list of geographic locations to route by, see [Traffic Management Geographic
     * Locations](https://docs.cloud.oracle.com/iaas/Content/TrafficManagement/Reference/trafficmanagementgeo.htm).
     *
     * <p>* {@code ROUTE_BY_ASN} - Answers DNS queries based on the query's originating ASN.
     *
     * <p>* {@code ROUTE_BY_IP} - Answers DNS queries based on the query's IP address.
     *
     * <p>* {@code CUSTOM} - Allows a customized configuration of rules.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("template")
    private final Template template;

    /**
     * A set of predefined rules based on the desired purpose of the steering policy. Each template
     * utilizes Traffic Management's rules in a different order to produce the desired results when
     * answering DNS queries.
     *
     * <p>**Example:** The {@code FAILOVER} template determines answers by filtering the policy's
     * answers using the {@code FILTER} rule first, then the following rules in succession: {@code
     * HEALTH}, {@code PRIORITY}, and {@code LIMIT}. This gives the domain dynamic failover
     * capability.
     *
     * <p>It is **strongly recommended** to use a template other than {@code CUSTOM} when creating a
     * steering policy.
     *
     * <p>All templates require the rule order to begin with an unconditional {@code FILTER} rule
     * that keeps answers contingent upon {@code answer.isDisabled != true}, except for {@code
     * CUSTOM}. A defined {@code HEALTH} rule must follow the {@code FILTER} rule if the policy
     * references a {@code healthCheckMonitorId}. The last rule of a template must must be a {@code
     * LIMIT} rule. For more information about templates and code examples, see [Traffic Management
     * API
     * Guide](https://docs.cloud.oracle.com/iaas/Content/TrafficManagement/Concepts/trafficmanagementapi.htm).
     *
     * <p>*Template Types**
     *
     * <p>{@code FAILOVER} - Uses health check information on your endpoints to determine which DNS
     * answers to serve. If an endpoint fails a health check, the answer for that endpoint will be
     * removed from the list of available answers until the endpoint is detected as healthy.
     *
     * <p>* {@code LOAD_BALANCE} - Distributes web traffic to specified endpoints based on defined
     * weights.
     *
     * <p>* {@code ROUTE_BY_GEO} - Answers DNS queries based on the query's geographic location. For
     * a list of geographic locations to route by, see [Traffic Management Geographic
     * Locations](https://docs.cloud.oracle.com/iaas/Content/TrafficManagement/Reference/trafficmanagementgeo.htm).
     *
     * <p>* {@code ROUTE_BY_ASN} - Answers DNS queries based on the query's originating ASN.
     *
     * <p>* {@code ROUTE_BY_IP} - Answers DNS queries based on the query's IP address.
     *
     * <p>* {@code CUSTOM} - Allows a customized configuration of rules.
     *
     * @return the value
     */
    public Template getTemplate() {
        return template;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>**Example:** {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>**Example:** {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>**Example:** {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>**Example:** {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /** The set of all answers that can potentially issue from the steering policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("answers")
    private final java.util.List<SteeringPolicyAnswer> answers;

    /**
     * The set of all answers that can potentially issue from the steering policy.
     *
     * @return the value
     */
    public java.util.List<SteeringPolicyAnswer> getAnswers() {
        return answers;
    }

    /**
     * The series of rules that will be processed in sequence to reduce the pool of answers to a
     * response for any given request.
     *
     * <p>The first rule receives a shuffled list of all answers, and every other rule receives the
     * list of answers emitted by the one preceding it. The last rule populates the response.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("rules")
    private final java.util.List<SteeringPolicyRule> rules;

    /**
     * The series of rules that will be processed in sequence to reduce the pool of answers to a
     * response for any given request.
     *
     * <p>The first rule receives a shuffled list of all answers, and every other rule receives the
     * list of answers emitted by the one preceding it. The last rule populates the response.
     *
     * @return the value
     */
    public java.util.List<SteeringPolicyRule> getRules() {
        return rules;
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
        sb.append("CreateSteeringPolicyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", ttl=").append(String.valueOf(this.ttl));
        sb.append(", healthCheckMonitorId=").append(String.valueOf(this.healthCheckMonitorId));
        sb.append(", template=").append(String.valueOf(this.template));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", answers=").append(String.valueOf(this.answers));
        sb.append(", rules=").append(String.valueOf(this.rules));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSteeringPolicyDetails)) {
            return false;
        }

        CreateSteeringPolicyDetails other = (CreateSteeringPolicyDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.ttl, other.ttl)
                && java.util.Objects.equals(this.healthCheckMonitorId, other.healthCheckMonitorId)
                && java.util.Objects.equals(this.template, other.template)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.answers, other.answers)
                && java.util.Objects.equals(this.rules, other.rules)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.ttl == null ? 43 : this.ttl.hashCode());
        result =
                (result * PRIME)
                        + (this.healthCheckMonitorId == null
                                ? 43
                                : this.healthCheckMonitorId.hashCode());
        result = (result * PRIME) + (this.template == null ? 43 : this.template.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.answers == null ? 43 : this.answers.hashCode());
        result = (result * PRIME) + (this.rules == null ? 43 : this.rules.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
