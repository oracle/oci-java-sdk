/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SecurityAssessmentStatistics.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SecurityAssessmentStatistics
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "targetsCount",
        "highRisk",
        "mediumRisk",
        "lowRisk",
        "advisory",
        "evaluate",
        "pass",
        "deferred"
    })
    public SecurityAssessmentStatistics(
            Integer targetsCount,
            SectionStatistics highRisk,
            SectionStatistics mediumRisk,
            SectionStatistics lowRisk,
            SectionStatistics advisory,
            SectionStatistics evaluate,
            SectionStatistics pass,
            SectionStatistics deferred) {
        super();
        this.targetsCount = targetsCount;
        this.highRisk = highRisk;
        this.mediumRisk = mediumRisk;
        this.lowRisk = lowRisk;
        this.advisory = advisory;
        this.evaluate = evaluate;
        this.pass = pass;
        this.deferred = deferred;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The total number of targets in this security assessment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("targetsCount")
        private Integer targetsCount;

        /**
         * The total number of targets in this security assessment.
         * @param targetsCount the value to set
         * @return this builder
         **/
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

        @com.fasterxml.jackson.annotation.JsonProperty("deferred")
        private SectionStatistics deferred;

        public Builder deferred(SectionStatistics deferred) {
            this.deferred = deferred;
            this.__explicitlySet__.add("deferred");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecurityAssessmentStatistics build() {
            SecurityAssessmentStatistics model =
                    new SecurityAssessmentStatistics(
                            this.targetsCount,
                            this.highRisk,
                            this.mediumRisk,
                            this.lowRisk,
                            this.advisory,
                            this.evaluate,
                            this.pass,
                            this.deferred);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecurityAssessmentStatistics model) {
            if (model.wasPropertyExplicitlySet("targetsCount")) {
                this.targetsCount(model.getTargetsCount());
            }
            if (model.wasPropertyExplicitlySet("highRisk")) {
                this.highRisk(model.getHighRisk());
            }
            if (model.wasPropertyExplicitlySet("mediumRisk")) {
                this.mediumRisk(model.getMediumRisk());
            }
            if (model.wasPropertyExplicitlySet("lowRisk")) {
                this.lowRisk(model.getLowRisk());
            }
            if (model.wasPropertyExplicitlySet("advisory")) {
                this.advisory(model.getAdvisory());
            }
            if (model.wasPropertyExplicitlySet("evaluate")) {
                this.evaluate(model.getEvaluate());
            }
            if (model.wasPropertyExplicitlySet("pass")) {
                this.pass(model.getPass());
            }
            if (model.wasPropertyExplicitlySet("deferred")) {
                this.deferred(model.getDeferred());
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

    /**
     * The total number of targets in this security assessment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("targetsCount")
    private final Integer targetsCount;

    /**
     * The total number of targets in this security assessment.
     * @return the value
     **/
    public Integer getTargetsCount() {
        return targetsCount;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("highRisk")
    private final SectionStatistics highRisk;

    public SectionStatistics getHighRisk() {
        return highRisk;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("mediumRisk")
    private final SectionStatistics mediumRisk;

    public SectionStatistics getMediumRisk() {
        return mediumRisk;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("lowRisk")
    private final SectionStatistics lowRisk;

    public SectionStatistics getLowRisk() {
        return lowRisk;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("advisory")
    private final SectionStatistics advisory;

    public SectionStatistics getAdvisory() {
        return advisory;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("evaluate")
    private final SectionStatistics evaluate;

    public SectionStatistics getEvaluate() {
        return evaluate;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("pass")
    private final SectionStatistics pass;

    public SectionStatistics getPass() {
        return pass;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("deferred")
    private final SectionStatistics deferred;

    public SectionStatistics getDeferred() {
        return deferred;
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
        sb.append("SecurityAssessmentStatistics(");
        sb.append("super=").append(super.toString());
        sb.append("targetsCount=").append(String.valueOf(this.targetsCount));
        sb.append(", highRisk=").append(String.valueOf(this.highRisk));
        sb.append(", mediumRisk=").append(String.valueOf(this.mediumRisk));
        sb.append(", lowRisk=").append(String.valueOf(this.lowRisk));
        sb.append(", advisory=").append(String.valueOf(this.advisory));
        sb.append(", evaluate=").append(String.valueOf(this.evaluate));
        sb.append(", pass=").append(String.valueOf(this.pass));
        sb.append(", deferred=").append(String.valueOf(this.deferred));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecurityAssessmentStatistics)) {
            return false;
        }

        SecurityAssessmentStatistics other = (SecurityAssessmentStatistics) o;
        return java.util.Objects.equals(this.targetsCount, other.targetsCount)
                && java.util.Objects.equals(this.highRisk, other.highRisk)
                && java.util.Objects.equals(this.mediumRisk, other.mediumRisk)
                && java.util.Objects.equals(this.lowRisk, other.lowRisk)
                && java.util.Objects.equals(this.advisory, other.advisory)
                && java.util.Objects.equals(this.evaluate, other.evaluate)
                && java.util.Objects.equals(this.pass, other.pass)
                && java.util.Objects.equals(this.deferred, other.deferred)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.targetsCount == null ? 43 : this.targetsCount.hashCode());
        result = (result * PRIME) + (this.highRisk == null ? 43 : this.highRisk.hashCode());
        result = (result * PRIME) + (this.mediumRisk == null ? 43 : this.mediumRisk.hashCode());
        result = (result * PRIME) + (this.lowRisk == null ? 43 : this.lowRisk.hashCode());
        result = (result * PRIME) + (this.advisory == null ? 43 : this.advisory.hashCode());
        result = (result * PRIME) + (this.evaluate == null ? 43 : this.evaluate.hashCode());
        result = (result * PRIME) + (this.pass == null ? 43 : this.pass.hashCode());
        result = (result * PRIME) + (this.deferred == null ? 43 : this.deferred.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
