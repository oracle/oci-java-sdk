/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
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
public final class EstimateRecallDataSizeResult
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "timeDataEnded",
        "timeDataStarted",
        "sizeInBytes",
        "isOverlappingWithExistingRecalls",
        "coreGroupCount",
        "coreGroupCountLimit",
        "sizeLimitInBytes"
    })
    public EstimateRecallDataSizeResult(
            java.util.Date timeDataEnded,
            java.util.Date timeDataStarted,
            Long sizeInBytes,
            Boolean isOverlappingWithExistingRecalls,
            Integer coreGroupCount,
            Integer coreGroupCountLimit,
            Long sizeLimitInBytes) {
        super();
        this.timeDataEnded = timeDataEnded;
        this.timeDataStarted = timeDataStarted;
        this.sizeInBytes = sizeInBytes;
        this.isOverlappingWithExistingRecalls = isOverlappingWithExistingRecalls;
        this.coreGroupCount = coreGroupCount;
        this.coreGroupCountLimit = coreGroupCountLimit;
        this.sizeLimitInBytes = sizeLimitInBytes;
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
        /**
         * This is the number of core groups estimated for this recall
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("coreGroupCount")
        private Integer coreGroupCount;

        /**
         * This is the number of core groups estimated for this recall
         * @param coreGroupCount the value to set
         * @return this builder
         **/
        public Builder coreGroupCount(Integer coreGroupCount) {
            this.coreGroupCount = coreGroupCount;
            this.__explicitlySet__.add("coreGroupCount");
            return this;
        }
        /**
         * This is the max number of core groups that is available for any recall
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("coreGroupCountLimit")
        private Integer coreGroupCountLimit;

        /**
         * This is the max number of core groups that is available for any recall
         * @param coreGroupCountLimit the value to set
         * @return this builder
         **/
        public Builder coreGroupCountLimit(Integer coreGroupCountLimit) {
            this.coreGroupCountLimit = coreGroupCountLimit;
            this.__explicitlySet__.add("coreGroupCountLimit");
            return this;
        }
        /**
         * This is the size limit in bytes
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("sizeLimitInBytes")
        private Long sizeLimitInBytes;

        /**
         * This is the size limit in bytes
         * @param sizeLimitInBytes the value to set
         * @return this builder
         **/
        public Builder sizeLimitInBytes(Long sizeLimitInBytes) {
            this.sizeLimitInBytes = sizeLimitInBytes;
            this.__explicitlySet__.add("sizeLimitInBytes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public EstimateRecallDataSizeResult build() {
            EstimateRecallDataSizeResult model =
                    new EstimateRecallDataSizeResult(
                            this.timeDataEnded,
                            this.timeDataStarted,
                            this.sizeInBytes,
                            this.isOverlappingWithExistingRecalls,
                            this.coreGroupCount,
                            this.coreGroupCountLimit,
                            this.sizeLimitInBytes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(EstimateRecallDataSizeResult model) {
            if (model.wasPropertyExplicitlySet("timeDataEnded")) {
                this.timeDataEnded(model.getTimeDataEnded());
            }
            if (model.wasPropertyExplicitlySet("timeDataStarted")) {
                this.timeDataStarted(model.getTimeDataStarted());
            }
            if (model.wasPropertyExplicitlySet("sizeInBytes")) {
                this.sizeInBytes(model.getSizeInBytes());
            }
            if (model.wasPropertyExplicitlySet("isOverlappingWithExistingRecalls")) {
                this.isOverlappingWithExistingRecalls(model.getIsOverlappingWithExistingRecalls());
            }
            if (model.wasPropertyExplicitlySet("coreGroupCount")) {
                this.coreGroupCount(model.getCoreGroupCount());
            }
            if (model.wasPropertyExplicitlySet("coreGroupCountLimit")) {
                this.coreGroupCountLimit(model.getCoreGroupCountLimit());
            }
            if (model.wasPropertyExplicitlySet("sizeLimitInBytes")) {
                this.sizeLimitInBytes(model.getSizeLimitInBytes());
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

    /**
     * This is the number of core groups estimated for this recall
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("coreGroupCount")
    private final Integer coreGroupCount;

    /**
     * This is the number of core groups estimated for this recall
     * @return the value
     **/
    public Integer getCoreGroupCount() {
        return coreGroupCount;
    }

    /**
     * This is the max number of core groups that is available for any recall
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("coreGroupCountLimit")
    private final Integer coreGroupCountLimit;

    /**
     * This is the max number of core groups that is available for any recall
     * @return the value
     **/
    public Integer getCoreGroupCountLimit() {
        return coreGroupCountLimit;
    }

    /**
     * This is the size limit in bytes
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("sizeLimitInBytes")
    private final Long sizeLimitInBytes;

    /**
     * This is the size limit in bytes
     * @return the value
     **/
    public Long getSizeLimitInBytes() {
        return sizeLimitInBytes;
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
        sb.append("EstimateRecallDataSizeResult(");
        sb.append("super=").append(super.toString());
        sb.append("timeDataEnded=").append(String.valueOf(this.timeDataEnded));
        sb.append(", timeDataStarted=").append(String.valueOf(this.timeDataStarted));
        sb.append(", sizeInBytes=").append(String.valueOf(this.sizeInBytes));
        sb.append(", isOverlappingWithExistingRecalls=")
                .append(String.valueOf(this.isOverlappingWithExistingRecalls));
        sb.append(", coreGroupCount=").append(String.valueOf(this.coreGroupCount));
        sb.append(", coreGroupCountLimit=").append(String.valueOf(this.coreGroupCountLimit));
        sb.append(", sizeLimitInBytes=").append(String.valueOf(this.sizeLimitInBytes));
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
                && java.util.Objects.equals(this.coreGroupCount, other.coreGroupCount)
                && java.util.Objects.equals(this.coreGroupCountLimit, other.coreGroupCountLimit)
                && java.util.Objects.equals(this.sizeLimitInBytes, other.sizeLimitInBytes)
                && super.equals(other);
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
                        + (this.coreGroupCount == null ? 43 : this.coreGroupCount.hashCode());
        result =
                (result * PRIME)
                        + (this.coreGroupCountLimit == null
                                ? 43
                                : this.coreGroupCountLimit.hashCode());
        result =
                (result * PRIME)
                        + (this.sizeLimitInBytes == null ? 43 : this.sizeLimitInBytes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
