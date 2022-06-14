/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = EstimateRecallDataSizeResult.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class EstimateRecallDataSizeResult {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeDataEnded",
        "timeDataStarted",
        "sizeInBytes",
        "isOverlappingWithExistingRecalls"
    })
    public EstimateRecallDataSizeResult(
            java.util.Date timeDataEnded,
            java.util.Date timeDataStarted,
            Long sizeInBytes,
            Boolean isOverlappingWithExistingRecalls) {
        super();
        this.timeDataEnded = timeDataEnded;
        this.timeDataStarted = timeDataStarted;
        this.sizeInBytes = sizeInBytes;
        this.isOverlappingWithExistingRecalls = isOverlappingWithExistingRecalls;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This is the end of the time range of data to be recalled.  timeDataStarted and timeDataEnded delineate
         * the time range of the archived data to be recalled.  They may not be exact the same as the
         * parameters in the request input (EstimateRecallDataSizeDetails).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeDataEnded")
        private java.util.Date timeDataEnded;

        /**
         * This is the end of the time range of data to be recalled.  timeDataStarted and timeDataEnded delineate
         * the time range of the archived data to be recalled.  They may not be exact the same as the
         * parameters in the request input (EstimateRecallDataSizeDetails).
         *
         * @param timeDataEnded the value to set
         * @return this builder
         **/
        public Builder timeDataEnded(java.util.Date timeDataEnded) {
            this.timeDataEnded = timeDataEnded;
            this.__explicitlySet__.add("timeDataEnded");
            return this;
        }
        /**
         * This is the start of the time range of data to be recalled
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeDataStarted")
        private java.util.Date timeDataStarted;

        /**
         * This is the start of the time range of data to be recalled
         * @param timeDataStarted the value to set
         * @return this builder
         **/
        public Builder timeDataStarted(java.util.Date timeDataStarted) {
            this.timeDataStarted = timeDataStarted;
            this.__explicitlySet__.add("timeDataStarted");
            return this;
        }
        /**
         * This is the size in bytes
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
        private Long sizeInBytes;

        /**
         * This is the size in bytes
         * @param sizeInBytes the value to set
         * @return this builder
         **/
        public Builder sizeInBytes(Long sizeInBytes) {
            this.sizeInBytes = sizeInBytes;
            this.__explicitlySet__.add("sizeInBytes");
            return this;
        }
        /**
         * This indicates if the time range of data to be recalled overlaps with existing recalled data
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isOverlappingWithExistingRecalls")
        private Boolean isOverlappingWithExistingRecalls;

        /**
         * This indicates if the time range of data to be recalled overlaps with existing recalled data
         * @param isOverlappingWithExistingRecalls the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * This is the end of the time range of data to be recalled.  timeDataStarted and timeDataEnded delineate
     * the time range of the archived data to be recalled.  They may not be exact the same as the
     * parameters in the request input (EstimateRecallDataSizeDetails).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataEnded")
    private final java.util.Date timeDataEnded;

    /**
     * This is the end of the time range of data to be recalled.  timeDataStarted and timeDataEnded delineate
     * the time range of the archived data to be recalled.  They may not be exact the same as the
     * parameters in the request input (EstimateRecallDataSizeDetails).
     *
     * @return the value
     **/
    public java.util.Date getTimeDataEnded() {
        return timeDataEnded;
    }

    /**
     * This is the start of the time range of data to be recalled
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeDataStarted")
    private final java.util.Date timeDataStarted;

    /**
     * This is the start of the time range of data to be recalled
     * @return the value
     **/
    public java.util.Date getTimeDataStarted() {
        return timeDataStarted;
    }

    /**
     * This is the size in bytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeInBytes")
    private final Long sizeInBytes;

    /**
     * This is the size in bytes
     * @return the value
     **/
    public Long getSizeInBytes() {
        return sizeInBytes;
    }

    /**
     * This indicates if the time range of data to be recalled overlaps with existing recalled data
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOverlappingWithExistingRecalls")
    private final Boolean isOverlappingWithExistingRecalls;

    /**
     * This indicates if the time range of data to be recalled overlaps with existing recalled data
     * @return the value
     **/
    public Boolean getIsOverlappingWithExistingRecalls() {
        return isOverlappingWithExistingRecalls;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("EstimateRecallDataSizeResult(");
        sb.append("timeDataEnded=").append(String.valueOf(this.timeDataEnded));
        sb.append(", timeDataStarted=").append(String.valueOf(this.timeDataStarted));
        sb.append(", sizeInBytes=").append(String.valueOf(this.sizeInBytes));
        sb.append(", isOverlappingWithExistingRecalls=")
                .append(String.valueOf(this.isOverlappingWithExistingRecalls));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof EstimateRecallDataSizeResult)) {
            return false;
        }

        EstimateRecallDataSizeResult other = (EstimateRecallDataSizeResult) o;
        return java.util.Objects.equals(this.timeDataEnded, other.timeDataEnded)
                && java.util.Objects.equals(this.timeDataStarted, other.timeDataStarted)
                && java.util.Objects.equals(this.sizeInBytes, other.sizeInBytes)
                && java.util.Objects.equals(
                        this.isOverlappingWithExistingRecalls,
                        other.isOverlappingWithExistingRecalls)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeDataEnded == null ? 43 : this.timeDataEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.timeDataStarted == null ? 43 : this.timeDataStarted.hashCode());
        result = (result * PRIME) + (this.sizeInBytes == null ? 43 : this.sizeInBytes.hashCode());
        result =
                (result * PRIME)
                        + (this.isOverlappingWithExistingRecalls == null
                                ? 43
                                : this.isOverlappingWithExistingRecalls.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
