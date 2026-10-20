/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.onesubscription.model;

/**
 * Commitment period for the subscription. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190111")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CommitmentPeriod.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CommitmentPeriod
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "commitmentPeriod",
        "timeCommitmentPeriodStart",
        "timeCommitmentPeriodEnd",
        "amountCommitment",
        "amountConsumed",
        "amountAvailable"
    })
    public CommitmentPeriod(
            String commitmentPeriod,
            java.util.Date timeCommitmentPeriodStart,
            java.util.Date timeCommitmentPeriodEnd,
            Double amountCommitment,
            Double amountConsumed,
            Double amountAvailable) {
        super();
        this.commitmentPeriod = commitmentPeriod;
        this.timeCommitmentPeriodStart = timeCommitmentPeriodStart;
        this.timeCommitmentPeriodEnd = timeCommitmentPeriodEnd;
        this.amountCommitment = amountCommitment;
        this.amountConsumed = amountConsumed;
        this.amountAvailable = amountAvailable;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Identifier for the commitment period. */
        @com.fasterxml.jackson.annotation.JsonProperty("commitmentPeriod")
        private String commitmentPeriod;

        /**
         * Identifier for the commitment period.
         *
         * @param commitmentPeriod the value to set
         * @return this builder
         */
        public Builder commitmentPeriod(String commitmentPeriod) {
            this.commitmentPeriod = commitmentPeriod;
            this.__explicitlySet__.add("commitmentPeriod");
            return this;
        }
        /** Start date and time of the commitment period. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCommitmentPeriodStart")
        private java.util.Date timeCommitmentPeriodStart;

        /**
         * Start date and time of the commitment period.
         *
         * @param timeCommitmentPeriodStart the value to set
         * @return this builder
         */
        public Builder timeCommitmentPeriodStart(java.util.Date timeCommitmentPeriodStart) {
            this.timeCommitmentPeriodStart = timeCommitmentPeriodStart;
            this.__explicitlySet__.add("timeCommitmentPeriodStart");
            return this;
        }
        /** End date and time of the commitment period. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCommitmentPeriodEnd")
        private java.util.Date timeCommitmentPeriodEnd;

        /**
         * End date and time of the commitment period.
         *
         * @param timeCommitmentPeriodEnd the value to set
         * @return this builder
         */
        public Builder timeCommitmentPeriodEnd(java.util.Date timeCommitmentPeriodEnd) {
            this.timeCommitmentPeriodEnd = timeCommitmentPeriodEnd;
            this.__explicitlySet__.add("timeCommitmentPeriodEnd");
            return this;
        }
        /** Total committed amount for the commitment period. */
        @com.fasterxml.jackson.annotation.JsonProperty("amountCommitment")
        private Double amountCommitment;

        /**
         * Total committed amount for the commitment period.
         *
         * @param amountCommitment the value to set
         * @return this builder
         */
        public Builder amountCommitment(Double amountCommitment) {
            this.amountCommitment = amountCommitment;
            this.__explicitlySet__.add("amountCommitment");
            return this;
        }
        /** Amount consumed during the commitment period. */
        @com.fasterxml.jackson.annotation.JsonProperty("amountConsumed")
        private Double amountConsumed;

        /**
         * Amount consumed during the commitment period.
         *
         * @param amountConsumed the value to set
         * @return this builder
         */
        public Builder amountConsumed(Double amountConsumed) {
            this.amountConsumed = amountConsumed;
            this.__explicitlySet__.add("amountConsumed");
            return this;
        }
        /** Amount remaining and available for the commitment period. */
        @com.fasterxml.jackson.annotation.JsonProperty("amountAvailable")
        private Double amountAvailable;

        /**
         * Amount remaining and available for the commitment period.
         *
         * @param amountAvailable the value to set
         * @return this builder
         */
        public Builder amountAvailable(Double amountAvailable) {
            this.amountAvailable = amountAvailable;
            this.__explicitlySet__.add("amountAvailable");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CommitmentPeriod build() {
            CommitmentPeriod model =
                    new CommitmentPeriod(
                            this.commitmentPeriod,
                            this.timeCommitmentPeriodStart,
                            this.timeCommitmentPeriodEnd,
                            this.amountCommitment,
                            this.amountConsumed,
                            this.amountAvailable);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CommitmentPeriod model) {
            if (model.wasPropertyExplicitlySet("commitmentPeriod")) {
                this.commitmentPeriod(model.getCommitmentPeriod());
            }
            if (model.wasPropertyExplicitlySet("timeCommitmentPeriodStart")) {
                this.timeCommitmentPeriodStart(model.getTimeCommitmentPeriodStart());
            }
            if (model.wasPropertyExplicitlySet("timeCommitmentPeriodEnd")) {
                this.timeCommitmentPeriodEnd(model.getTimeCommitmentPeriodEnd());
            }
            if (model.wasPropertyExplicitlySet("amountCommitment")) {
                this.amountCommitment(model.getAmountCommitment());
            }
            if (model.wasPropertyExplicitlySet("amountConsumed")) {
                this.amountConsumed(model.getAmountConsumed());
            }
            if (model.wasPropertyExplicitlySet("amountAvailable")) {
                this.amountAvailable(model.getAmountAvailable());
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

    /** Identifier for the commitment period. */
    @com.fasterxml.jackson.annotation.JsonProperty("commitmentPeriod")
    private final String commitmentPeriod;

    /**
     * Identifier for the commitment period.
     *
     * @return the value
     */
    public String getCommitmentPeriod() {
        return commitmentPeriod;
    }

    /** Start date and time of the commitment period. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCommitmentPeriodStart")
    private final java.util.Date timeCommitmentPeriodStart;

    /**
     * Start date and time of the commitment period.
     *
     * @return the value
     */
    public java.util.Date getTimeCommitmentPeriodStart() {
        return timeCommitmentPeriodStart;
    }

    /** End date and time of the commitment period. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCommitmentPeriodEnd")
    private final java.util.Date timeCommitmentPeriodEnd;

    /**
     * End date and time of the commitment period.
     *
     * @return the value
     */
    public java.util.Date getTimeCommitmentPeriodEnd() {
        return timeCommitmentPeriodEnd;
    }

    /** Total committed amount for the commitment period. */
    @com.fasterxml.jackson.annotation.JsonProperty("amountCommitment")
    private final Double amountCommitment;

    /**
     * Total committed amount for the commitment period.
     *
     * @return the value
     */
    public Double getAmountCommitment() {
        return amountCommitment;
    }

    /** Amount consumed during the commitment period. */
    @com.fasterxml.jackson.annotation.JsonProperty("amountConsumed")
    private final Double amountConsumed;

    /**
     * Amount consumed during the commitment period.
     *
     * @return the value
     */
    public Double getAmountConsumed() {
        return amountConsumed;
    }

    /** Amount remaining and available for the commitment period. */
    @com.fasterxml.jackson.annotation.JsonProperty("amountAvailable")
    private final Double amountAvailable;

    /**
     * Amount remaining and available for the commitment period.
     *
     * @return the value
     */
    public Double getAmountAvailable() {
        return amountAvailable;
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
        sb.append("CommitmentPeriod(");
        sb.append("super=").append(super.toString());
        sb.append("commitmentPeriod=").append(String.valueOf(this.commitmentPeriod));
        sb.append(", timeCommitmentPeriodStart=")
                .append(String.valueOf(this.timeCommitmentPeriodStart));
        sb.append(", timeCommitmentPeriodEnd=")
                .append(String.valueOf(this.timeCommitmentPeriodEnd));
        sb.append(", amountCommitment=").append(String.valueOf(this.amountCommitment));
        sb.append(", amountConsumed=").append(String.valueOf(this.amountConsumed));
        sb.append(", amountAvailable=").append(String.valueOf(this.amountAvailable));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CommitmentPeriod)) {
            return false;
        }

        CommitmentPeriod other = (CommitmentPeriod) o;
        return java.util.Objects.equals(this.commitmentPeriod, other.commitmentPeriod)
                && java.util.Objects.equals(
                        this.timeCommitmentPeriodStart, other.timeCommitmentPeriodStart)
                && java.util.Objects.equals(
                        this.timeCommitmentPeriodEnd, other.timeCommitmentPeriodEnd)
                && java.util.Objects.equals(this.amountCommitment, other.amountCommitment)
                && java.util.Objects.equals(this.amountConsumed, other.amountConsumed)
                && java.util.Objects.equals(this.amountAvailable, other.amountAvailable)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.commitmentPeriod == null ? 43 : this.commitmentPeriod.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCommitmentPeriodStart == null
                                ? 43
                                : this.timeCommitmentPeriodStart.hashCode());
        result =
                (result * PRIME)
                        + (this.timeCommitmentPeriodEnd == null
                                ? 43
                                : this.timeCommitmentPeriodEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.amountCommitment == null ? 43 : this.amountCommitment.hashCode());
        result =
                (result * PRIME)
                        + (this.amountConsumed == null ? 43 : this.amountConsumed.hashCode());
        result =
                (result * PRIME)
                        + (this.amountAvailable == null ? 43 : this.amountAvailable.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
