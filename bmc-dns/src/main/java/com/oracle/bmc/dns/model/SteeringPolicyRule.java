/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dns.model;

/**
 * The configuration of the sorting and filtering behaviors in a steering policy. Rules can
 * filter and sort answers based on weight, priority, endpoint health, and other data.
 * <p>
 *
 * A rule may optionally include a sequence of cases, each with an optional `caseCondition`
 * expression. Cases allow a sequence of conditions to be defined that will apply different
 * parameters to the rule when the conditions are met. For more information about cases,
 * see [Traffic Management API Guide](https://docs.cloud.oracle.com/iaas/Content/TrafficManagement/Concepts/trafficmanagementapi.htm).
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
@lombok.AllArgsConstructor(
    onConstructor = @__({@Deprecated}),
    access = lombok.AccessLevel.PROTECTED
)
@lombok.Value
@lombok.experimental.NonFinal
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "ruleType",
    defaultImpl = SteeringPolicyRule.class
)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = SteeringPolicyFilterRule.class,
        name = "FILTER"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = SteeringPolicyWeightedRule.class,
        name = "WEIGHTED"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = SteeringPolicyLimitRule.class,
        name = "LIMIT"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = SteeringPolicyHealthRule.class,
        name = "HEALTH"
    ),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
        value = SteeringPolicyPriorityRule.class,
        name = "PRIORITY"
    )
})
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class SteeringPolicyRule {

    /**
     * A user-defined description of the rule's purpose or behavior.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;
}
