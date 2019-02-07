/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dns.model;

/**
 * Configuration for sorting and/or filtering the list of remaining candidate answers, subject to
 * rule type and the values of type-specific parameters and/or data associated with answers.
 * <p>
 * A rule may optionally include a sequence of cases, each with an optional `caseCondition`
 * expression.  If it does, the first case with a matching `caseCondition` or with no
 * `caseCondition` at all is used to set rule parameter values and/or answer-associated data,
 * and the rule will be ignored during processing of any request that does not match any case.
 * Rules without a sequence of cases are processed unconditionally, and rules with an _empty_
 * sequence of cases are **ignored** unconditionally.
 * <p>
 * Data is associated with answers one-by-one in a similar fashion\u2014for each answer, the first
 * answerData item with a matching `answerCondition` or with no `answerCondition` at all is used
 * to associate data with the answer, and the absence of any such item associates with the answer
 * a default value.  Rule-level default answer data is always processed, but case-level answer
 * data will override it on a per-answer basis.
 * <p>
 * To prevent empty responses, any attempt to filter away all answers is suppressed at runtime.
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
     * Your description of the rule's purpose and/or behavior.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;
}
