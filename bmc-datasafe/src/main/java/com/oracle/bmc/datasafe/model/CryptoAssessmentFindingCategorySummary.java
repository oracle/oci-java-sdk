/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Aggregate finding counts for one crypto finding category. <br>
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
        builder = CryptoAssessmentFindingCategorySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CryptoAssessmentFindingCategorySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"passChecks", "findings", "totalChecks"})
    public CryptoAssessmentFindingCategorySummary(
            Integer passChecks, Integer findings, Integer totalChecks) {
        super();
        this.passChecks = passChecks;
        this.findings = findings;
        this.totalChecks = totalChecks;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Findings with PASS status. */
        @com.fasterxml.jackson.annotation.JsonProperty("passChecks")
        private Integer passChecks;

        /**
         * Findings with PASS status.
         *
         * @param passChecks the value to set
         * @return this builder
         */
        public Builder passChecks(Integer passChecks) {
            this.passChecks = passChecks;
            this.__explicitlySet__.add("passChecks");
            return this;
        }
        /** Findings with FAIL or EVALUATE status. */
        @com.fasterxml.jackson.annotation.JsonProperty("findings")
        private Integer findings;

        /**
         * Findings with FAIL or EVALUATE status.
         *
         * @param findings the value to set
         * @return this builder
         */
        public Builder findings(Integer findings) {
            this.findings = findings;
            this.__explicitlySet__.add("findings");
            return this;
        }
        /** Total findings across all statuses in this category. */
        @com.fasterxml.jackson.annotation.JsonProperty("totalChecks")
        private Integer totalChecks;

        /**
         * Total findings across all statuses in this category.
         *
         * @param totalChecks the value to set
         * @return this builder
         */
        public Builder totalChecks(Integer totalChecks) {
            this.totalChecks = totalChecks;
            this.__explicitlySet__.add("totalChecks");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CryptoAssessmentFindingCategorySummary build() {
            CryptoAssessmentFindingCategorySummary model =
                    new CryptoAssessmentFindingCategorySummary(
                            this.passChecks, this.findings, this.totalChecks);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CryptoAssessmentFindingCategorySummary model) {
            if (model.wasPropertyExplicitlySet("passChecks")) {
                this.passChecks(model.getPassChecks());
            }
            if (model.wasPropertyExplicitlySet("findings")) {
                this.findings(model.getFindings());
            }
            if (model.wasPropertyExplicitlySet("totalChecks")) {
                this.totalChecks(model.getTotalChecks());
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

    /** Findings with PASS status. */
    @com.fasterxml.jackson.annotation.JsonProperty("passChecks")
    private final Integer passChecks;

    /**
     * Findings with PASS status.
     *
     * @return the value
     */
    public Integer getPassChecks() {
        return passChecks;
    }

    /** Findings with FAIL or EVALUATE status. */
    @com.fasterxml.jackson.annotation.JsonProperty("findings")
    private final Integer findings;

    /**
     * Findings with FAIL or EVALUATE status.
     *
     * @return the value
     */
    public Integer getFindings() {
        return findings;
    }

    /** Total findings across all statuses in this category. */
    @com.fasterxml.jackson.annotation.JsonProperty("totalChecks")
    private final Integer totalChecks;

    /**
     * Total findings across all statuses in this category.
     *
     * @return the value
     */
    public Integer getTotalChecks() {
        return totalChecks;
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
        sb.append("CryptoAssessmentFindingCategorySummary(");
        sb.append("super=").append(super.toString());
        sb.append("passChecks=").append(String.valueOf(this.passChecks));
        sb.append(", findings=").append(String.valueOf(this.findings));
        sb.append(", totalChecks=").append(String.valueOf(this.totalChecks));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CryptoAssessmentFindingCategorySummary)) {
            return false;
        }

        CryptoAssessmentFindingCategorySummary other = (CryptoAssessmentFindingCategorySummary) o;
        return java.util.Objects.equals(this.passChecks, other.passChecks)
                && java.util.Objects.equals(this.findings, other.findings)
                && java.util.Objects.equals(this.totalChecks, other.totalChecks)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.passChecks == null ? 43 : this.passChecks.hashCode());
        result = (result * PRIME) + (this.findings == null ? 43 : this.findings.hashCode());
        result = (result * PRIME) + (this.totalChecks == null ? 43 : this.totalChecks.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
