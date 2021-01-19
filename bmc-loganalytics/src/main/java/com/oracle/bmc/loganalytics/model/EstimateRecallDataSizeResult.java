/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * This is the size and time range of data to be recalled
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = EstimateRecallDataSizeResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class EstimateRecallDataSizeResult {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeDataEnded")
        private java.util.Date timeDataEnded;

        public Builder timeDataEnded(java.util.Date timeDataEnded) {
            this.timeDataEnded = timeDataEnded;
            this.__explicitlySet__.add("timeDataEnded");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeDataStarted")
        private java.util.Date timeDataStarted;

        public Builder timeDataStarted(java.util.Date timeDataStarted) {
            this.timeDataStarted = timeDataStarted;
            this.__explicitlySet__.add("timeDataStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
        private Long sizeInBytes;

        public Builder sizeInBytes(Long sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            this.__explicitlySet__.add("sizeInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isOverlappingWithExistingRecalls")
        private Boolean isOverlappingWithExistingRecalls;

        public Builder isOverlappingWithExistingRecalls(Boolean isOverlappingWithExistingRecalls) {
            this.isOverlappingWithExistingRecalls = isOverlappingWithExistingRecalls;
            this.__explicitlySet__.add("isOverlappingWithExistingRecalls");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EstimateRecallDataSizeResult build() {
            EstimateRecallDataSizeResult __instance__ =
                    new EstimateRecallDataSizeResult(
                            timeDataEnded,
                            timeDataStarted,
                            sizeInBytes,
                            isOverlappingWithExistingRecalls);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EstimateRecallDataSizeResult o) {
            Builder copiedBuilder =
                    timeDataEnded(o.getTimeDataEnded())
                            .timeDataStarted(o.getTimeDataStarted())
                            .sizeInBytes(o.getSizeInBytes())
                            .isOverlappingWithExistingRecalls(
                                    o.getIsOverlappingWithExistingRecalls());

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
     * This is the end of the time range of data to be recalled.  timeDataStarted and timeDataEnded delineate
     * the time range of the archived data to be recalled.  They may not be exact the same as the
     * parameters in the request input (EstimateRecallDataSizeDetails).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataEnded")
    java.util.Date timeDataEnded;

    /**
     * This is the start of the time range of data to be recalled
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataStarted")
    java.util.Date timeDataStarted;

    /**
     * This is the size in bytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
    Long sizeInBytes;

    /**
     * This indicates if the time range of data to be recalled overlaps with existing recalled data
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOverlappingWithExistingRecalls")
    Boolean isOverlappingWithExistingRecalls;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
