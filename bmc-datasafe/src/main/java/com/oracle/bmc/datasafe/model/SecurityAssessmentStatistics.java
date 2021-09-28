/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Statistics showing the number of findings for each category grouped by risk levels for all
 * the targets in the specified security assessment.
 * <p>
 * The categories include Auditing, Authorization Control, Data Encryption, Database Configuration,
 * Fine-Grained Access Control, Privileges and Roles, and User Accounts.
 * The risk levels include High Risk, Medium Risk, Low Risk, Advisory, Evaluate, and Pass.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SecurityAssessmentStatistics.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class SecurityAssessmentStatistics {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("targetsCount")
        private Integer targetsCount;

        public Builder targetsCount(Integer targetsCount) {
            this.targetsCount = targetsCount;
            this.__explicitlySet__.add("targetsCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("highRisk")
        private SectionStatistics highRisk;

        public Builder highRisk(SectionStatistics highRisk) {
            this.highRisk = highRisk;
            this.__explicitlySet__.add("highRisk");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("mediumRisk")
        private SectionStatistics mediumRisk;

        public Builder mediumRisk(SectionStatistics mediumRisk) {
            this.mediumRisk = mediumRisk;
            this.__explicitlySet__.add("mediumRisk");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lowRisk")
        private SectionStatistics lowRisk;

        public Builder lowRisk(SectionStatistics lowRisk) {
            this.lowRisk = lowRisk;
            this.__explicitlySet__.add("lowRisk");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("advisory")
        private SectionStatistics advisory;

        public Builder advisory(SectionStatistics advisory) {
            this.advisory = advisory;
            this.__explicitlySet__.add("advisory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("evaluate")
        private SectionStatistics evaluate;

        public Builder evaluate(SectionStatistics evaluate) {
            this.evaluate = evaluate;
            this.__explicitlySet__.add("evaluate");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("pass")
        private SectionStatistics pass;

        public Builder pass(SectionStatistics pass) {
            this.pass = pass;
            this.__explicitlySet__.add("pass");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecurityAssessmentStatistics build() {
            SecurityAssessmentStatistics __instance__ =
                    new SecurityAssessmentStatistics(
                            targetsCount, highRisk, mediumRisk, lowRisk, advisory, evaluate, pass);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecurityAssessmentStatistics o) {
            Builder copiedBuilder =
                    targetsCount(o.getTargetsCount())
                            .highRisk(o.getHighRisk())
                            .mediumRisk(o.getMediumRisk())
                            .lowRisk(o.getLowRisk())
                            .advisory(o.getAdvisory())
                            .evaluate(o.getEvaluate())
                            .pass(o.getPass());

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
     * The total number of targets in this security assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetsCount")
    Integer targetsCount;

    @com.fasterxml.jackson.annotation.JsonProperty("highRisk")
    SectionStatistics highRisk;

    @com.fasterxml.jackson.annotation.JsonProperty("mediumRisk")
    SectionStatistics mediumRisk;

    @com.fasterxml.jackson.annotation.JsonProperty("lowRisk")
    SectionStatistics lowRisk;

    @com.fasterxml.jackson.annotation.JsonProperty("advisory")
    SectionStatistics advisory;

    @com.fasterxml.jackson.annotation.JsonProperty("evaluate")
    SectionStatistics evaluate;

    @com.fasterxml.jackson.annotation.JsonProperty("pass")
    SectionStatistics pass;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
