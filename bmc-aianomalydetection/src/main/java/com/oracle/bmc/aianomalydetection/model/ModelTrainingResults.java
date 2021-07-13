/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.aianomalydetection.model;

/**
 * Specifies the details for an Anomaly Detection model trained with MSET.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210101")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ModelTrainingResults.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ModelTrainingResults {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("fap")
        private Float fap;

        public Builder fap(Float fap) {
            this.fap = fap;
            this.__explicitlySet__.add("fap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("multivariateFap")
        private Float multivariateFap;

        public Builder multivariateFap(Float multivariateFap) {
            this.multivariateFap = multivariateFap;
            this.__explicitlySet__.add("multivariateFap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isTrainingGoalAchieved")
        private Boolean isTrainingGoalAchieved;

        public Builder isTrainingGoalAchieved(Boolean isTrainingGoalAchieved) {
            this.isTrainingGoalAchieved = isTrainingGoalAchieved;
            this.__explicitlySet__.add("isTrainingGoalAchieved");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("warning")
        private String warning;

        public Builder warning(String warning) {
            this.warning = warning;
            this.__explicitlySet__.add("warning");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("signalDetails")
        private java.util.List<PerSignalDetails> signalDetails;

        public Builder signalDetails(java.util.List<PerSignalDetails> signalDetails) {
            this.signalDetails = signalDetails;
            this.__explicitlySet__.add("signalDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("rowReductionDetails")
        private RowReductionDetails rowReductionDetails;

        public Builder rowReductionDetails(RowReductionDetails rowReductionDetails) {
            this.rowReductionDetails = rowReductionDetails;
            this.__explicitlySet__.add("rowReductionDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ModelTrainingResults build() {
            ModelTrainingResults __instance__ =
                    new ModelTrainingResults(
                            fap,
                            multivariateFap,
                            isTrainingGoalAchieved,
                            warning,
                            signalDetails,
                            rowReductionDetails);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ModelTrainingResults o) {
            Builder copiedBuilder =
                    fap(o.getFap())
                            .multivariateFap(o.getMultivariateFap())
                            .isTrainingGoalAchieved(o.getIsTrainingGoalAchieved())
                            .warning(o.getWarning())
                            .signalDetails(o.getSignalDetails())
                            .rowReductionDetails(o.getRowReductionDetails());

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
     * The final-achieved model accuracy metric on individual value level
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fap")
    Float fap;

    /**
     * The model accuracy metric on timestamp level.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("multivariateFap")
    Float multivariateFap;

    /**
     * A boolean value to indicate if train goal/targetFap is achieved for trained model
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isTrainingGoalAchieved")
    Boolean isTrainingGoalAchieved;

    /**
     * A warning message to explain the reason when targetFap cannot be achieved for trained model
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("warning")
    String warning;

    /**
     * The list of signal details.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("signalDetails")
    java.util.List<PerSignalDetails> signalDetails;

    @com.fasterxml.jackson.annotation.JsonProperty("rowReductionDetails")
    RowReductionDetails rowReductionDetails;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
