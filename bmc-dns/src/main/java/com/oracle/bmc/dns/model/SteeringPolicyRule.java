/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
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

    /**
     * The type of a rule determines its sorting/filtering behavior.
     * * `FILTER` - Filters the list of answers based on their defined boolean data. Answers remain
     *   only if their `shouldKeep` value is `true`.
     * <p>
     *
     * * `HEALTH` - Removes answers from the list if their `rdata` matches a target in the
     *   health check monitor referenced by the steering policy and the target is reported down.
     * <p>
     *
     * * `WEIGHTED` - Uses a number between 0 and 255 to determine how often an answer will be served
     *   in relation to other answers. Anwers with a higher weight will be served more frequently.
     * <p>
     *
     * * `PRIORITY` - Uses a defined rank value of answers to determine which answer to serve,
     *   moving those with the lowest values to the beginning of the list without changing the
     *   relative order of those with the same value. Answers can be given a value between `0` and `255`.
     * <p>
     *
     * * `LIMIT` - Filters answers that are too far down the list. Parameter `defaultCount`
     *   specifies how many answers to keep. **Example:** If `defaultCount` has a value of `2` and
     *   there are five answers left, when the `LIMIT` rule is processed, only the first two answers
     *   will remain in the list.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum RuleType {
        Filter("FILTER"),
        Health("HEALTH"),
        Weighted("WEIGHTED"),
        Priority("PRIORITY"),
        Limit("LIMIT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, RuleType> map;

        static {
            map = new java.util.HashMap<>();
            for (RuleType v : RuleType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RuleType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RuleType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RuleType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
}
