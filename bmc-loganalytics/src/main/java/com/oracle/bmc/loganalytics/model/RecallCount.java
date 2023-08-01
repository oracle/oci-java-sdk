/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * This is the recall count statistics for a given tenant <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RecallCount.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RecallCount extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "recallCount",
        "recallSucceeded",
        "recallFailed",
        "recallPending",
        "recallLimit"
    })
    public RecallCount(
            Integer recallCount,
            Integer recallSucceeded,
            Integer recallFailed,
            Integer recallPending,
            Integer recallLimit) {
        super();
        this.recallCount = recallCount;
        this.recallSucceeded = recallSucceeded;
        this.recallFailed = recallFailed;
        this.recallPending = recallPending;
        this.recallLimit = recallLimit;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** This is the total number of recalls made so far */
        @com.fasterxml.jackson.annotation.JsonProperty("recallCount")
        private Integer recallCount;

        /**
         * This is the total number of recalls made so far
         *
         * @param recallCount the value to set
         * @return this builder
         */
        public Builder recallCount(Integer recallCount) {
            this.recallCount = recallCount;
            this.__explicitlySet__.add("recallCount");
            return this;
        }
        /** This is the number of recalls that succeeded */
        @com.fasterxml.jackson.annotation.JsonProperty("recallSucceeded")
        private Integer recallSucceeded;

        /**
         * This is the number of recalls that succeeded
         *
         * @param recallSucceeded the value to set
         * @return this builder
         */
        public Builder recallSucceeded(Integer recallSucceeded) {
            this.recallSucceeded = recallSucceeded;
            this.__explicitlySet__.add("recallSucceeded");
            return this;
        }
        /** This is the number of recalls that failed */
        @com.fasterxml.jackson.annotation.JsonProperty("recallFailed")
        private Integer recallFailed;

        /**
         * This is the number of recalls that failed
         *
         * @param recallFailed the value to set
         * @return this builder
         */
        public Builder recallFailed(Integer recallFailed) {
            this.recallFailed = recallFailed;
            this.__explicitlySet__.add("recallFailed");
            return this;
        }
        /** This is the number of recalls in pending state */
        @com.fasterxml.jackson.annotation.JsonProperty("recallPending")
        private Integer recallPending;

        /**
         * This is the number of recalls in pending state
         *
         * @param recallPending the value to set
         * @return this builder
         */
        public Builder recallPending(Integer recallPending) {
            this.recallPending = recallPending;
            this.__explicitlySet__.add("recallPending");
            return this;
        }
        /**
         * This is the maximum number of recalls (including successful and pending recalls) allowed
         */
        @com.fasterxml.jackson.annotation.JsonProperty("recallLimit")
        private Integer recallLimit;

        /**
         * This is the maximum number of recalls (including successful and pending recalls) allowed
         *
         * @param recallLimit the value to set
         * @return this builder
         */
        public Builder recallLimit(Integer recallLimit) {
            this.recallLimit = recallLimit;
            this.__explicitlySet__.add("recallLimit");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RecallCount build() {
            RecallCount model =
                    new RecallCount(
                            this.recallCount,
                            this.recallSucceeded,
                            this.recallFailed,
                            this.recallPending,
                            this.recallLimit);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RecallCount model) {
            if (model.wasPropertyExplicitlySet("recallCount")) {
                this.recallCount(model.getRecallCount());
            }
            if (model.wasPropertyExplicitlySet("recallSucceeded")) {
                this.recallSucceeded(model.getRecallSucceeded());
            }
            if (model.wasPropertyExplicitlySet("recallFailed")) {
                this.recallFailed(model.getRecallFailed());
            }
            if (model.wasPropertyExplicitlySet("recallPending")) {
                this.recallPending(model.getRecallPending());
            }
            if (model.wasPropertyExplicitlySet("recallLimit")) {
                this.recallLimit(model.getRecallLimit());
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

    /** This is the total number of recalls made so far */
    @com.fasterxml.jackson.annotation.JsonProperty("recallCount")
    private final Integer recallCount;

    /**
     * This is the total number of recalls made so far
     *
     * @return the value
     */
    public Integer getRecallCount() {
        return recallCount;
    }

    /** This is the number of recalls that succeeded */
    @com.fasterxml.jackson.annotation.JsonProperty("recallSucceeded")
    private final Integer recallSucceeded;

    /**
     * This is the number of recalls that succeeded
     *
     * @return the value
     */
    public Integer getRecallSucceeded() {
        return recallSucceeded;
    }

    /** This is the number of recalls that failed */
    @com.fasterxml.jackson.annotation.JsonProperty("recallFailed")
    private final Integer recallFailed;

    /**
     * This is the number of recalls that failed
     *
     * @return the value
     */
    public Integer getRecallFailed() {
        return recallFailed;
    }

    /** This is the number of recalls in pending state */
    @com.fasterxml.jackson.annotation.JsonProperty("recallPending")
    private final Integer recallPending;

    /**
     * This is the number of recalls in pending state
     *
     * @return the value
     */
    public Integer getRecallPending() {
        return recallPending;
    }

    /** This is the maximum number of recalls (including successful and pending recalls) allowed */
    @com.fasterxml.jackson.annotation.JsonProperty("recallLimit")
    private final Integer recallLimit;

    /**
     * This is the maximum number of recalls (including successful and pending recalls) allowed
     *
     * @return the value
     */
    public Integer getRecallLimit() {
        return recallLimit;
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
        sb.append("RecallCount(");
        sb.append("super=").append(super.toString());
        sb.append("recallCount=").append(String.valueOf(this.recallCount));
        sb.append(", recallSucceeded=").append(String.valueOf(this.recallSucceeded));
        sb.append(", recallFailed=").append(String.valueOf(this.recallFailed));
        sb.append(", recallPending=").append(String.valueOf(this.recallPending));
        sb.append(", recallLimit=").append(String.valueOf(this.recallLimit));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RecallCount)) {
            return false;
        }

        RecallCount other = (RecallCount) o;
        return java.util.Objects.equals(this.recallCount, other.recallCount)
                && java.util.Objects.equals(this.recallSucceeded, other.recallSucceeded)
                && java.util.Objects.equals(this.recallFailed, other.recallFailed)
                && java.util.Objects.equals(this.recallPending, other.recallPending)
                && java.util.Objects.equals(this.recallLimit, other.recallLimit)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.recallCount == null ? 43 : this.recallCount.hashCode());
        result =
                (result * PRIME)
                        + (this.recallSucceeded == null ? 43 : this.recallSucceeded.hashCode());
        result = (result * PRIME) + (this.recallFailed == null ? 43 : this.recallFailed.hashCode());
        result =
                (result * PRIME)
                        + (this.recallPending == null ? 43 : this.recallPending.hashCode());
        result = (result * PRIME) + (this.recallLimit == null ? 43 : this.recallLimit.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
