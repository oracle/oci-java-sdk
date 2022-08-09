/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * The configuration of the sorting and filtering behaviors in a steering policy. Rules can
 * filter and sort answers based on weight, priority, endpoint health, and other data.
 * <p>
 *
 * A rule may optionally include a sequence of cases, each with an optional {@code caseCondition}
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
public class SteeringPolicyRule extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"description"})
    protected SteeringPolicyRule(String description) {
        super();
        this.description = description;
    }

    /**
     * A user-defined description of the rule's purpose or behavior.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * A user-defined description of the rule's purpose or behavior.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SteeringPolicyRule(");
        sb.append("super=").append(super.toString());
        sb.append("description=").append(String.valueOf(this.description));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SteeringPolicyRule)) {
            return false;
        }

        SteeringPolicyRule other = (SteeringPolicyRule) o;
        return java.util.Objects.equals(this.description, other.description) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /**
     * The type of a rule determines its sorting/filtering behavior.
     * * {@code FILTER} - Filters the list of answers based on their defined boolean data. Answers remain
     *   only if their {@code shouldKeep} value is {@code true}.
     * <p>
     *
     * * {@code HEALTH} - Removes answers from the list if their {@code rdata} matches a target in the
     *   health check monitor referenced by the steering policy and the target is reported down.
     * <p>
     *
     * * {@code WEIGHTED} - Uses a number between 0 and 255 to determine how often an answer will be served
     *   in relation to other answers. Anwers with a higher weight will be served more frequently.
     * <p>
     *
     * * {@code PRIORITY} - Uses a defined rank value of answers to determine which answer to serve,
     *   moving those with the lowest values to the beginning of the list without changing the
     *   relative order of those with the same value. Answers can be given a value between {@code 0} and {@code 255}.
     * <p>
     *
     * * {@code LIMIT} - Filters answers that are too far down the list. Parameter {@code defaultCount}
     *   specifies how many answers to keep. **Example:** If {@code defaultCount} has a value of {@code 2} and
     *   there are five answers left, when the {@code LIMIT} rule is processed, only the first two answers
     *   will remain in the list.
     *
     **/
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

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RuleType.class);

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
