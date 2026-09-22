/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Aggregate finding counts for the specified crypto assessment. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CryptoAssessmentFindingSummaryMetrics.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CryptoAssessmentFindingSummaryMetrics
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "totalChecks",
        "totalFindings",
        "critical",
        "high",
        "med",
        "low",
        "statusCounts",
        "networkEncryptionStatus",
        "dataEncryptionStatus",
        "walletStatus",
        "backupStatus"
    })
    public CryptoAssessmentFindingSummaryMetrics(
            Integer totalChecks,
            Integer totalFindings,
            Integer critical,
            Integer high,
            Integer med,
            Integer low,
            java.util.Map<String, Integer> statusCounts,
            CryptoAssessmentFindingCategorySummary networkEncryptionStatus,
            CryptoAssessmentFindingCategorySummary dataEncryptionStatus,
            CryptoAssessmentFindingCategorySummary walletStatus,
            CryptoAssessmentFindingCategorySummary backupStatus) {
        super();
        this.totalChecks = totalChecks;
        this.totalFindings = totalFindings;
        this.critical = critical;
        this.high = high;
        this.med = med;
        this.low = low;
        this.statusCounts = statusCounts;
        this.networkEncryptionStatus = networkEncryptionStatus;
        this.dataEncryptionStatus = dataEncryptionStatus;
        this.walletStatus = walletStatus;
        this.backupStatus = backupStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Total findings across all statuses. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalChecks")
        private Integer totalChecks;

        /**
         * Total findings across all statuses.
         *
         * @param totalChecks the value to set
         * @return this builder
         */
        public Builder totalChecks(Integer totalChecks) {
            this.totalChecks = totalChecks;
            this.__explicitlySet__.add("totalChecks");
            return this;
        }
        /** Findings with FAIL or EVALUATE status. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalFindings")
        private Integer totalFindings;

        /**
         * Findings with FAIL or EVALUATE status.
         *
         * @param totalFindings the value to set
         * @return this builder
         */
        public Builder totalFindings(Integer totalFindings) {
            this.totalFindings = totalFindings;
            this.__explicitlySet__.add("totalFindings");
            return this;
        }
        /** FAIL or EVALUATE findings with priority 1. */
        @com.fasterxml.jackson.annotation.JsonProperty("critical")
        private Integer critical;

        /**
         * FAIL or EVALUATE findings with priority 1.
         *
         * @param critical the value to set
         * @return this builder
         */
        public Builder critical(Integer critical) {
            this.critical = critical;
            this.__explicitlySet__.add("critical");
            return this;
        }
        /** FAIL or EVALUATE findings with priority 2. */
        @com.fasterxml.jackson.annotation.JsonProperty("high")
        private Integer high;

        /**
         * FAIL or EVALUATE findings with priority 2.
         *
         * @param high the value to set
         * @return this builder
         */
        public Builder high(Integer high) {
            this.high = high;
            this.__explicitlySet__.add("high");
            return this;
        }
        /** FAIL or EVALUATE findings with priority 3. */
        @com.fasterxml.jackson.annotation.JsonProperty("med")
        private Integer med;

        /**
         * FAIL or EVALUATE findings with priority 3.
         *
         * @param med the value to set
         * @return this builder
         */
        public Builder med(Integer med) {
            this.med = med;
            this.__explicitlySet__.add("med");
            return this;
        }
        /** FAIL or EVALUATE findings with priority 4. */
        @com.fasterxml.jackson.annotation.JsonProperty("low")
        private Integer low;

        /**
         * FAIL or EVALUATE findings with priority 4.
         *
         * @param low the value to set
         * @return this builder
         */
        public Builder low(Integer low) {
            this.low = low;
            this.__explicitlySet__.add("low");
            return this;
        }
        /**
         * Counts keyed by finding status. All supported statuses are included with a zero count
         * when absent.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("statusCounts")
        private java.util.Map<String, Integer> statusCounts;

        /**
         * Counts keyed by finding status. All supported statuses are included with a zero count
         * when absent.
         *
         * @param statusCounts the value to set
         * @return this builder
         */
        public Builder statusCounts(java.util.Map<String, Integer> statusCounts) {
            this.statusCounts = statusCounts;
            this.__explicitlySet__.add("statusCounts");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkEncryptionStatus")
        private CryptoAssessmentFindingCategorySummary networkEncryptionStatus;

        public Builder networkEncryptionStatus(
                CryptoAssessmentFindingCategorySummary networkEncryptionStatus) {
            this.networkEncryptionStatus = networkEncryptionStatus;
            this.__explicitlySet__.add("networkEncryptionStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataEncryptionStatus")
        private CryptoAssessmentFindingCategorySummary dataEncryptionStatus;

        public Builder dataEncryptionStatus(
                CryptoAssessmentFindingCategorySummary dataEncryptionStatus) {
            this.dataEncryptionStatus = dataEncryptionStatus;
            this.__explicitlySet__.add("dataEncryptionStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("walletStatus")
        private CryptoAssessmentFindingCategorySummary walletStatus;

        public Builder walletStatus(CryptoAssessmentFindingCategorySummary walletStatus) {
            this.walletStatus = walletStatus;
            this.__explicitlySet__.add("walletStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("backupStatus")
        private CryptoAssessmentFindingCategorySummary backupStatus;

        public Builder backupStatus(CryptoAssessmentFindingCategorySummary backupStatus) {
            this.backupStatus = backupStatus;
            this.__explicitlySet__.add("backupStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CryptoAssessmentFindingSummaryMetrics build() {
            CryptoAssessmentFindingSummaryMetrics model =
                    new CryptoAssessmentFindingSummaryMetrics(
                            this.totalChecks,
                            this.totalFindings,
                            this.critical,
                            this.high,
                            this.med,
                            this.low,
                            this.statusCounts,
                            this.networkEncryptionStatus,
                            this.dataEncryptionStatus,
                            this.walletStatus,
                            this.backupStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CryptoAssessmentFindingSummaryMetrics model) {
            if (model.wasPropertyExplicitlySet("totalChecks")) {
                this.totalChecks(model.getTotalChecks());
            }
            if (model.wasPropertyExplicitlySet("totalFindings")) {
                this.totalFindings(model.getTotalFindings());
            }
            if (model.wasPropertyExplicitlySet("critical")) {
                this.critical(model.getCritical());
            }
            if (model.wasPropertyExplicitlySet("high")) {
                this.high(model.getHigh());
            }
            if (model.wasPropertyExplicitlySet("med")) {
                this.med(model.getMed());
            }
            if (model.wasPropertyExplicitlySet("low")) {
                this.low(model.getLow());
            }
            if (model.wasPropertyExplicitlySet("statusCounts")) {
                this.statusCounts(model.getStatusCounts());
            }
            if (model.wasPropertyExplicitlySet("networkEncryptionStatus")) {
                this.networkEncryptionStatus(model.getNetworkEncryptionStatus());
            }
            if (model.wasPropertyExplicitlySet("dataEncryptionStatus")) {
                this.dataEncryptionStatus(model.getDataEncryptionStatus());
            }
            if (model.wasPropertyExplicitlySet("walletStatus")) {
                this.walletStatus(model.getWalletStatus());
            }
            if (model.wasPropertyExplicitlySet("backupStatus")) {
                this.backupStatus(model.getBackupStatus());
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

    /** Total findings across all statuses. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalChecks")
    private final Integer totalChecks;

    /**
     * Total findings across all statuses.
     *
     * @return the value
     */
    public Integer getTotalChecks() {
        return totalChecks;
    }

    /** Findings with FAIL or EVALUATE status. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalFindings")
    private final Integer totalFindings;

    /**
     * Findings with FAIL or EVALUATE status.
     *
     * @return the value
     */
    public Integer getTotalFindings() {
        return totalFindings;
    }

    /** FAIL or EVALUATE findings with priority 1. */
    @com.fasterxml.jackson.annotation.JsonProperty("critical")
    private final Integer critical;

    /**
     * FAIL or EVALUATE findings with priority 1.
     *
     * @return the value
     */
    public Integer getCritical() {
        return critical;
    }

    /** FAIL or EVALUATE findings with priority 2. */
    @com.fasterxml.jackson.annotation.JsonProperty("high")
    private final Integer high;

    /**
     * FAIL or EVALUATE findings with priority 2.
     *
     * @return the value
     */
    public Integer getHigh() {
        return high;
    }

    /** FAIL or EVALUATE findings with priority 3. */
    @com.fasterxml.jackson.annotation.JsonProperty("med")
    private final Integer med;

    /**
     * FAIL or EVALUATE findings with priority 3.
     *
     * @return the value
     */
    public Integer getMed() {
        return med;
    }

    /** FAIL or EVALUATE findings with priority 4. */
    @com.fasterxml.jackson.annotation.JsonProperty("low")
    private final Integer low;

    /**
     * FAIL or EVALUATE findings with priority 4.
     *
     * @return the value
     */
    public Integer getLow() {
        return low;
    }

    /**
     * Counts keyed by finding status. All supported statuses are included with a zero count when
     * absent.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("statusCounts")
    private final java.util.Map<String, Integer> statusCounts;

    /**
     * Counts keyed by finding status. All supported statuses are included with a zero count when
     * absent.
     *
     * @return the value
     */
    public java.util.Map<String, Integer> getStatusCounts() {
        return statusCounts;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("networkEncryptionStatus")
    private final CryptoAssessmentFindingCategorySummary networkEncryptionStatus;

    public CryptoAssessmentFindingCategorySummary getNetworkEncryptionStatus() {
        return networkEncryptionStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataEncryptionStatus")
    private final CryptoAssessmentFindingCategorySummary dataEncryptionStatus;

    public CryptoAssessmentFindingCategorySummary getDataEncryptionStatus() {
        return dataEncryptionStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("walletStatus")
    private final CryptoAssessmentFindingCategorySummary walletStatus;

    public CryptoAssessmentFindingCategorySummary getWalletStatus() {
        return walletStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("backupStatus")
    private final CryptoAssessmentFindingCategorySummary backupStatus;

    public CryptoAssessmentFindingCategorySummary getBackupStatus() {
        return backupStatus;
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
        sb.append("CryptoAssessmentFindingSummaryMetrics(");
        sb.append("super=").append(super.toString());
        sb.append("totalChecks=").append(String.valueOf(this.totalChecks));
        sb.append(", totalFindings=").append(String.valueOf(this.totalFindings));
        sb.append(", critical=").append(String.valueOf(this.critical));
        sb.append(", high=").append(String.valueOf(this.high));
        sb.append(", med=").append(String.valueOf(this.med));
        sb.append(", low=").append(String.valueOf(this.low));
        sb.append(", statusCounts=").append(String.valueOf(this.statusCounts));
        sb.append(", networkEncryptionStatus=")
                .append(String.valueOf(this.networkEncryptionStatus));
        sb.append(", dataEncryptionStatus=").append(String.valueOf(this.dataEncryptionStatus));
        sb.append(", walletStatus=").append(String.valueOf(this.walletStatus));
        sb.append(", backupStatus=").append(String.valueOf(this.backupStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CryptoAssessmentFindingSummaryMetrics)) {
            return false;
        }

        CryptoAssessmentFindingSummaryMetrics other = (CryptoAssessmentFindingSummaryMetrics) o;
        return java.util.Objects.equals(this.totalChecks, other.totalChecks)
                && java.util.Objects.equals(this.totalFindings, other.totalFindings)
                && java.util.Objects.equals(this.critical, other.critical)
                && java.util.Objects.equals(this.high, other.high)
                && java.util.Objects.equals(this.med, other.med)
                && java.util.Objects.equals(this.low, other.low)
                && java.util.Objects.equals(this.statusCounts, other.statusCounts)
                && java.util.Objects.equals(
                        this.networkEncryptionStatus, other.networkEncryptionStatus)
                && java.util.Objects.equals(this.dataEncryptionStatus, other.dataEncryptionStatus)
                && java.util.Objects.equals(this.walletStatus, other.walletStatus)
                && java.util.Objects.equals(this.backupStatus, other.backupStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.totalChecks == null ? 43 : this.totalChecks.hashCode());
        result =
                (result * PRIME)
                        + (this.totalFindings == null ? 43 : this.totalFindings.hashCode());
        result = (result * PRIME) + (this.critical == null ? 43 : this.critical.hashCode());
        result = (result * PRIME) + (this.high == null ? 43 : this.high.hashCode());
        result = (result * PRIME) + (this.med == null ? 43 : this.med.hashCode());
        result = (result * PRIME) + (this.low == null ? 43 : this.low.hashCode());
        result = (result * PRIME) + (this.statusCounts == null ? 43 : this.statusCounts.hashCode());
        result =
                (result * PRIME)
                        + (this.networkEncryptionStatus == null
                                ? 43
                                : this.networkEncryptionStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.dataEncryptionStatus == null
                                ? 43
                                : this.dataEncryptionStatus.hashCode());
        result = (result * PRIME) + (this.walletStatus == null ? 43 : this.walletStatus.hashCode());
        result = (result * PRIME) + (this.backupStatus == null ? 43 : this.backupStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
