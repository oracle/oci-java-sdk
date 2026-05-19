/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourceanalytics.model;

/**
 * Data population status for a monitored region in the tenancy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TenancyAttachmentDataPopulation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TenancyAttachmentDataPopulation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "status",
        "timeStarted",
        "timeEnded",
        "inProgressCount",
        "succeededCount",
        "totalCount"
    })
    public TenancyAttachmentDataPopulation(
            TenancyAttachment.DataPopulationStatus status,
            java.util.Date timeStarted,
            java.util.Date timeEnded,
            Integer inProgressCount,
            Integer succeededCount,
            Integer totalCount) {
        super();
        this.status = status;
        this.timeStarted = timeStarted;
        this.timeEnded = timeEnded;
        this.inProgressCount = inProgressCount;
        this.succeededCount = succeededCount;
        this.totalCount = totalCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The overall status of the data population from the monitored region of the tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private TenancyAttachment.DataPopulationStatus status;

        /**
         * The overall status of the data population from the monitored region of the tenancy.
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(TenancyAttachment.DataPopulationStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The date and time the data population task was started, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        /**
         * The date and time the data population task was started, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeStarted the value to set
         * @return this builder
         */
        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }
        /**
         * The date and time the data population task completed, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
        private java.util.Date timeEnded;

        /**
         * The date and time the data population task completed, in the format defined by [RFC
         * 3339](https://tools.ietf.org/html/rfc3339).
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeEnded the value to set
         * @return this builder
         */
        public Builder timeEnded(java.util.Date timeEnded) {
            this.timeEnded = timeEnded;
            this.__explicitlySet__.add("timeEnded");
            return this;
        }
        /** The number of data population tasks currently in progress. */
        @com.fasterxml.jackson.annotation.JsonProperty("inProgressCount")
        private Integer inProgressCount;

        /**
         * The number of data population tasks currently in progress.
         *
         * @param inProgressCount the value to set
         * @return this builder
         */
        public Builder inProgressCount(Integer inProgressCount) {
            this.inProgressCount = inProgressCount;
            this.__explicitlySet__.add("inProgressCount");
            return this;
        }
        /** The number of data population tasks that have succeeded. */
        @com.fasterxml.jackson.annotation.JsonProperty("succeededCount")
        private Integer succeededCount;

        /**
         * The number of data population tasks that have succeeded.
         *
         * @param succeededCount the value to set
         * @return this builder
         */
        public Builder succeededCount(Integer succeededCount) {
            this.succeededCount = succeededCount;
            this.__explicitlySet__.add("succeededCount");
            return this;
        }
        /** The total number of data population tasks. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
        private Integer totalCount;

        /**
         * The total number of data population tasks.
         *
         * @param totalCount the value to set
         * @return this builder
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            this.__explicitlySet__.add("totalCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TenancyAttachmentDataPopulation build() {
            TenancyAttachmentDataPopulation model =
                    new TenancyAttachmentDataPopulation(
                            this.status,
                            this.timeStarted,
                            this.timeEnded,
                            this.inProgressCount,
                            this.succeededCount,
                            this.totalCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TenancyAttachmentDataPopulation model) {
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("timeStarted")) {
                this.timeStarted(model.getTimeStarted());
            }
            if (model.wasPropertyExplicitlySet("timeEnded")) {
                this.timeEnded(model.getTimeEnded());
            }
            if (model.wasPropertyExplicitlySet("inProgressCount")) {
                this.inProgressCount(model.getInProgressCount());
            }
            if (model.wasPropertyExplicitlySet("succeededCount")) {
                this.succeededCount(model.getSucceededCount());
            }
            if (model.wasPropertyExplicitlySet("totalCount")) {
                this.totalCount(model.getTotalCount());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** The overall status of the data population from the monitored region of the tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final TenancyAttachment.DataPopulationStatus status;

    /**
     * The overall status of the data population from the monitored region of the tenancy.
     *
     * @return the value
     */
    public TenancyAttachment.DataPopulationStatus getStatus() {
        return status;
    }

    /**
     * The date and time the data population task was started, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    private final java.util.Date timeStarted;

    /**
     * The date and time the data population task was started, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeStarted() {
        return timeStarted;
    }

    /**
     * The date and time the data population task completed, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeEnded")
    private final java.util.Date timeEnded;

    /**
     * The date and time the data population task completed, in the format defined by [RFC
     * 3339](https://tools.ietf.org/html/rfc3339).
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeEnded() {
        return timeEnded;
    }

    /** The number of data population tasks currently in progress. */
    @com.fasterxml.jackson.annotation.JsonProperty("inProgressCount")
    private final Integer inProgressCount;

    /**
     * The number of data population tasks currently in progress.
     *
     * @return the value
     */
    public Integer getInProgressCount() {
        return inProgressCount;
    }

    /** The number of data population tasks that have succeeded. */
    @com.fasterxml.jackson.annotation.JsonProperty("succeededCount")
    private final Integer succeededCount;

    /**
     * The number of data population tasks that have succeeded.
     *
     * @return the value
     */
    public Integer getSucceededCount() {
        return succeededCount;
    }

    /** The total number of data population tasks. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
    private final Integer totalCount;

    /**
     * The total number of data population tasks.
     *
     * @return the value
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("TenancyAttachmentDataPopulation(");
        sb.append("super=").append(super.toString());
        sb.append("status=").append(String.valueOf(this.status));
        sb.append(", timeStarted=").append(String.valueOf(this.timeStarted));
        sb.append(", timeEnded=").append(String.valueOf(this.timeEnded));
        sb.append(", inProgressCount=").append(String.valueOf(this.inProgressCount));
        sb.append(", succeededCount=").append(String.valueOf(this.succeededCount));
        sb.append(", totalCount=").append(String.valueOf(this.totalCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TenancyAttachmentDataPopulation)) {
            return false;
        }

        TenancyAttachmentDataPopulation other = (TenancyAttachmentDataPopulation) o;
        return java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.timeStarted, other.timeStarted)
                && java.util.Objects.equals(this.timeEnded, other.timeEnded)
                && java.util.Objects.equals(this.inProgressCount, other.inProgressCount)
                && java.util.Objects.equals(this.succeededCount, other.succeededCount)
                && java.util.Objects.equals(this.totalCount, other.totalCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.timeStarted == null ? 43 : this.timeStarted.hashCode());
        result = (result * PRIME) + (this.timeEnded == null ? 43 : this.timeEnded.hashCode());
        result =
                (result * PRIME)
                        + (this.inProgressCount == null ? 43 : this.inProgressCount.hashCode());
        result =
                (result * PRIME)
                        + (this.succeededCount == null ? 43 : this.succeededCount.hashCode());
        result = (result * PRIME) + (this.totalCount == null ? 43 : this.totalCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
