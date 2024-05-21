/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SteeringPolicyWeightedRule.Builder.class
)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "ruleType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SteeringPolicyWeightedRule extends SteeringPolicyRule {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * An array of {@code caseConditions}. A rule may optionally include a sequence of cases defining alternate
         * configurations for how it should behave during processing for any given DNS query. When a rule has
         * no sequence of {@code cases}, it is always evaluated with the same configuration during processing. When
         * a rule has an empty sequence of {@code cases}, it is always ignored during processing. When a rule has a
         * non-empty sequence of {@code cases}, its behavior during processing is configured by the first matching
         * {@code case} in the sequence. When a rule has no matching cases the rule is ignored. A rule case with no
         * {@code caseCondition} always matches. A rule case with a {@code caseCondition} matches only when that expression
         * evaluates to true for the given query.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("cases")
        private java.util.List<SteeringPolicyWeightedRuleCase> cases;

        /**
         * An array of {@code caseConditions}. A rule may optionally include a sequence of cases defining alternate
         * configurations for how it should behave during processing for any given DNS query. When a rule has
         * no sequence of {@code cases}, it is always evaluated with the same configuration during processing. When
         * a rule has an empty sequence of {@code cases}, it is always ignored during processing. When a rule has a
         * non-empty sequence of {@code cases}, its behavior during processing is configured by the first matching
         * {@code case} in the sequence. When a rule has no matching cases the rule is ignored. A rule case with no
         * {@code caseCondition} always matches. A rule case with a {@code caseCondition} matches only when that expression
         * evaluates to true for the given query.
         *
         * @param cases the value to set
         * @return this builder
         **/
        public Builder cases(java.util.List<SteeringPolicyWeightedRuleCase> cases) {
            this.cases = cases;
            this.__explicitlySet__.add("cases");
            return this;
        }
        /**
         * Defines a default set of answer conditions and values that are applied to an answer when
         * {@code cases} is not defined for the rule or a matching case does not have any matching
         * {@code answerCondition}s in its {@code answerData}. {@code defaultAnswerData} is not applied if {@code cases} is
         * defined and there are no matching cases. In this scenario, the next rule will be processed.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultAnswerData")
        private java.util.List<SteeringPolicyWeightedAnswerData> defaultAnswerData;

        /**
         * Defines a default set of answer conditions and values that are applied to an answer when
         * {@code cases} is not defined for the rule or a matching case does not have any matching
         * {@code answerCondition}s in its {@code answerData}. {@code defaultAnswerData} is not applied if {@code cases} is
         * defined and there are no matching cases. In this scenario, the next rule will be processed.
         *
         * @param defaultAnswerData the value to set
         * @return this builder
         **/
        public Builder defaultAnswerData(
                java.util.List<SteeringPolicyWeightedAnswerData> defaultAnswerData) {
            this.defaultAnswerData = defaultAnswerData;
            this.__explicitlySet__.add("defaultAnswerData");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SteeringPolicyWeightedRule build() {
            SteeringPolicyWeightedRule model =
                    new SteeringPolicyWeightedRule(
                            this.description, this.cases, this.defaultAnswerData);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SteeringPolicyWeightedRule model) {
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("cases")) {
                this.cases(model.getCases());
            }
            if (model.wasPropertyExplicitlySet("defaultAnswerData")) {
                this.defaultAnswerData(model.getDefaultAnswerData());
            }
            return this;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    @Deprecated
    public SteeringPolicyWeightedRule(
            String description,
            java.util.List<SteeringPolicyWeightedRuleCase> cases,
            java.util.List<SteeringPolicyWeightedAnswerData> defaultAnswerData) {
        super(description);
        this.cases = cases;
        this.defaultAnswerData = defaultAnswerData;
    }

    /**
     * An array of {@code caseConditions}. A rule may optionally include a sequence of cases defining alternate
     * configurations for how it should behave during processing for any given DNS query. When a rule has
     * no sequence of {@code cases}, it is always evaluated with the same configuration during processing. When
     * a rule has an empty sequence of {@code cases}, it is always ignored during processing. When a rule has a
     * non-empty sequence of {@code cases}, its behavior during processing is configured by the first matching
     * {@code case} in the sequence. When a rule has no matching cases the rule is ignored. A rule case with no
     * {@code caseCondition} always matches. A rule case with a {@code caseCondition} matches only when that expression
     * evaluates to true for the given query.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cases")
    private final java.util.List<SteeringPolicyWeightedRuleCase> cases;

    /**
     * An array of {@code caseConditions}. A rule may optionally include a sequence of cases defining alternate
     * configurations for how it should behave during processing for any given DNS query. When a rule has
     * no sequence of {@code cases}, it is always evaluated with the same configuration during processing. When
     * a rule has an empty sequence of {@code cases}, it is always ignored during processing. When a rule has a
     * non-empty sequence of {@code cases}, its behavior during processing is configured by the first matching
     * {@code case} in the sequence. When a rule has no matching cases the rule is ignored. A rule case with no
     * {@code caseCondition} always matches. A rule case with a {@code caseCondition} matches only when that expression
     * evaluates to true for the given query.
     *
     * @return the value
     **/
    public java.util.List<SteeringPolicyWeightedRuleCase> getCases() {
        return cases;
    }

    /**
     * Defines a default set of answer conditions and values that are applied to an answer when
     * {@code cases} is not defined for the rule or a matching case does not have any matching
     * {@code answerCondition}s in its {@code answerData}. {@code defaultAnswerData} is not applied if {@code cases} is
     * defined and there are no matching cases. In this scenario, the next rule will be processed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultAnswerData")
    private final java.util.List<SteeringPolicyWeightedAnswerData> defaultAnswerData;

    /**
     * Defines a default set of answer conditions and values that are applied to an answer when
     * {@code cases} is not defined for the rule or a matching case does not have any matching
     * {@code answerCondition}s in its {@code answerData}. {@code defaultAnswerData} is not applied if {@code cases} is
     * defined and there are no matching cases. In this scenario, the next rule will be processed.
     *
     * @return the value
     **/
    public java.util.List<SteeringPolicyWeightedAnswerData> getDefaultAnswerData() {
        return defaultAnswerData;
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
        sb.append("SteeringPolicyWeightedRule(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", cases=").append(String.valueOf(this.cases));
        sb.append(", defaultAnswerData=").append(String.valueOf(this.defaultAnswerData));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SteeringPolicyWeightedRule)) {
            return false;
        }

        SteeringPolicyWeightedRule other = (SteeringPolicyWeightedRule) o;
        return java.util.Objects.equals(this.cases, other.cases)
                && java.util.Objects.equals(this.defaultAnswerData, other.defaultAnswerData)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.cases == null ? 43 : this.cases.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultAnswerData == null ? 43 : this.defaultAnswerData.hashCode());
        return result;
    }
}
