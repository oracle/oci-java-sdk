/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Object containing current utilization, projected utilization, id and daysToReach high and low utilization value.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExadataInsightResourceInsightUtilizationItem.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class ExadataInsightResourceInsightUtilizationItem {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("exadataInsightId")
        private String exadataInsightId;

        public Builder exadataInsightId(String exadataInsightId) {
            this.exadataInsightId = exadataInsightId;
            this.__explicitlySet__.add("exadataInsightId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("currentUtilization")
        private Double currentUtilization;

        public Builder currentUtilization(Double currentUtilization) {
            this.currentUtilization = currentUtilization;
            this.__explicitlySet__.add("currentUtilization");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("projectedUtilization")
        private Double projectedUtilization;

        public Builder projectedUtilization(Double projectedUtilization) {
            this.projectedUtilization = projectedUtilization;
            this.__explicitlySet__.add("projectedUtilization");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("daysToReachHighUtilization")
        private Integer daysToReachHighUtilization;

        public Builder daysToReachHighUtilization(Integer daysToReachHighUtilization) {
            this.daysToReachHighUtilization = daysToReachHighUtilization;
            this.__explicitlySet__.add("daysToReachHighUtilization");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("daysToReachLowUtilization")
        private Integer daysToReachLowUtilization;

        public Builder daysToReachLowUtilization(Integer daysToReachLowUtilization) {
            this.daysToReachLowUtilization = daysToReachLowUtilization;
            this.__explicitlySet__.add("daysToReachLowUtilization");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadataInsightResourceInsightUtilizationItem build() {
            ExadataInsightResourceInsightUtilizationItem __instance__ =
                    new ExadataInsightResourceInsightUtilizationItem(
                            exadataInsightId,
                            currentUtilization,
                            projectedUtilization,
                            daysToReachHighUtilization,
                            daysToReachLowUtilization);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataInsightResourceInsightUtilizationItem o) {
            Builder copiedBuilder =
                    exadataInsightId(o.getExadataInsightId())
                            .currentUtilization(o.getCurrentUtilization())
                            .projectedUtilization(o.getProjectedUtilization())
                            .daysToReachHighUtilization(o.getDaysToReachHighUtilization())
                            .daysToReachLowUtilization(o.getDaysToReachLowUtilization());

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
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the Exadata insight.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("exadataInsightId")
    String exadataInsightId;

    /**
     * Current utilization
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentUtilization")
    Double currentUtilization;

    /**
     * Projected utilization
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("projectedUtilization")
    Double projectedUtilization;

    /**
     * Days to reach projected high utilization
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("daysToReachHighUtilization")
    Integer daysToReachHighUtilization;

    /**
     * Days to reach projected low utilization
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("daysToReachLowUtilization")
    Integer daysToReachLowUtilization;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
