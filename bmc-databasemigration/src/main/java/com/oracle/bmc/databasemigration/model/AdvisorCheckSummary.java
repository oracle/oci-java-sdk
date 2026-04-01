/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Pre-Migration extended advisor report summary.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AdvisorCheckSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AdvisorCheckSummary extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "passResultsTotalCount",
        "informationalResultsTotalCount",
        "warningResultsTotalCount",
        "blockerResultsTotalCount",
        "fatalResultsTotalCount"
    })
    public AdvisorCheckSummary(
            Integer passResultsTotalCount,
            Integer informationalResultsTotalCount,
            Integer warningResultsTotalCount,
            Integer blockerResultsTotalCount,
            Integer fatalResultsTotalCount) {
        super();
        this.passResultsTotalCount = passResultsTotalCount;
        this.informationalResultsTotalCount = informationalResultsTotalCount;
        this.warningResultsTotalCount = warningResultsTotalCount;
        this.blockerResultsTotalCount = blockerResultsTotalCount;
        this.fatalResultsTotalCount = fatalResultsTotalCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Number of PASS results in the extended advisor report.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("passResultsTotalCount")
        private Integer passResultsTotalCount;

        /**
         * Number of PASS results in the extended advisor report.
         *
         * @param passResultsTotalCount the value to set
         * @return this builder
         **/
        public Builder passResultsTotalCount(Integer passResultsTotalCount) {
            this.passResultsTotalCount = passResultsTotalCount;
            this.__explicitlySet__.add("passResultsTotalCount");
            return this;
        }
        /**
         * Number of INFORMATIONAL results in the extended advisor report.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("informationalResultsTotalCount")
        private Integer informationalResultsTotalCount;

        /**
         * Number of INFORMATIONAL results in the extended advisor report.
         *
         * @param informationalResultsTotalCount the value to set
         * @return this builder
         **/
        public Builder informationalResultsTotalCount(Integer informationalResultsTotalCount) {
            this.informationalResultsTotalCount = informationalResultsTotalCount;
            this.__explicitlySet__.add("informationalResultsTotalCount");
            return this;
        }
        /**
         * Number of WARNING results in the extended advisor report.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("warningResultsTotalCount")
        private Integer warningResultsTotalCount;

        /**
         * Number of WARNING results in the extended advisor report.
         *
         * @param warningResultsTotalCount the value to set
         * @return this builder
         **/
        public Builder warningResultsTotalCount(Integer warningResultsTotalCount) {
            this.warningResultsTotalCount = warningResultsTotalCount;
            this.__explicitlySet__.add("warningResultsTotalCount");
            return this;
        }
        /**
         * Number of BLOCKER results in the extended advisor report.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("blockerResultsTotalCount")
        private Integer blockerResultsTotalCount;

        /**
         * Number of BLOCKER results in the extended advisor report.
         *
         * @param blockerResultsTotalCount the value to set
         * @return this builder
         **/
        public Builder blockerResultsTotalCount(Integer blockerResultsTotalCount) {
            this.blockerResultsTotalCount = blockerResultsTotalCount;
            this.__explicitlySet__.add("blockerResultsTotalCount");
            return this;
        }
        /**
         * Number of FATAL results in the extended advisor report.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fatalResultsTotalCount")
        private Integer fatalResultsTotalCount;

        /**
         * Number of FATAL results in the extended advisor report.
         *
         * @param fatalResultsTotalCount the value to set
         * @return this builder
         **/
        public Builder fatalResultsTotalCount(Integer fatalResultsTotalCount) {
            this.fatalResultsTotalCount = fatalResultsTotalCount;
            this.__explicitlySet__.add("fatalResultsTotalCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdvisorCheckSummary build() {
            AdvisorCheckSummary model =
                    new AdvisorCheckSummary(
                            this.passResultsTotalCount,
                            this.informationalResultsTotalCount,
                            this.warningResultsTotalCount,
                            this.blockerResultsTotalCount,
                            this.fatalResultsTotalCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdvisorCheckSummary model) {
            if (model.wasPropertyExplicitlySet("passResultsTotalCount")) {
                this.passResultsTotalCount(model.getPassResultsTotalCount());
            }
            if (model.wasPropertyExplicitlySet("informationalResultsTotalCount")) {
                this.informationalResultsTotalCount(model.getInformationalResultsTotalCount());
            }
            if (model.wasPropertyExplicitlySet("warningResultsTotalCount")) {
                this.warningResultsTotalCount(model.getWarningResultsTotalCount());
            }
            if (model.wasPropertyExplicitlySet("blockerResultsTotalCount")) {
                this.blockerResultsTotalCount(model.getBlockerResultsTotalCount());
            }
            if (model.wasPropertyExplicitlySet("fatalResultsTotalCount")) {
                this.fatalResultsTotalCount(model.getFatalResultsTotalCount());
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
     * Number of PASS results in the extended advisor report.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("passResultsTotalCount")
    private final Integer passResultsTotalCount;

    /**
     * Number of PASS results in the extended advisor report.
     *
     * @return the value
     **/
    public Integer getPassResultsTotalCount() {
        return passResultsTotalCount;
    }

    /**
     * Number of INFORMATIONAL results in the extended advisor report.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("informationalResultsTotalCount")
    private final Integer informationalResultsTotalCount;

    /**
     * Number of INFORMATIONAL results in the extended advisor report.
     *
     * @return the value
     **/
    public Integer getInformationalResultsTotalCount() {
        return informationalResultsTotalCount;
    }

    /**
     * Number of WARNING results in the extended advisor report.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("warningResultsTotalCount")
    private final Integer warningResultsTotalCount;

    /**
     * Number of WARNING results in the extended advisor report.
     *
     * @return the value
     **/
    public Integer getWarningResultsTotalCount() {
        return warningResultsTotalCount;
    }

    /**
     * Number of BLOCKER results in the extended advisor report.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("blockerResultsTotalCount")
    private final Integer blockerResultsTotalCount;

    /**
     * Number of BLOCKER results in the extended advisor report.
     *
     * @return the value
     **/
    public Integer getBlockerResultsTotalCount() {
        return blockerResultsTotalCount;
    }

    /**
     * Number of FATAL results in the extended advisor report.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fatalResultsTotalCount")
    private final Integer fatalResultsTotalCount;

    /**
     * Number of FATAL results in the extended advisor report.
     *
     * @return the value
     **/
    public Integer getFatalResultsTotalCount() {
        return fatalResultsTotalCount;
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
        sb.append("AdvisorCheckSummary(");
        sb.append("super=").append(super.toString());
        sb.append("passResultsTotalCount=").append(String.valueOf(this.passResultsTotalCount));
        sb.append(", informationalResultsTotalCount=")
                .append(String.valueOf(this.informationalResultsTotalCount));
        sb.append(", warningResultsTotalCount=")
                .append(String.valueOf(this.warningResultsTotalCount));
        sb.append(", blockerResultsTotalCount=")
                .append(String.valueOf(this.blockerResultsTotalCount));
        sb.append(", fatalResultsTotalCount=").append(String.valueOf(this.fatalResultsTotalCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdvisorCheckSummary)) {
            return false;
        }

        AdvisorCheckSummary other = (AdvisorCheckSummary) o;
        return java.util.Objects.equals(this.passResultsTotalCount, other.passResultsTotalCount)
                && java.util.Objects.equals(
                        this.informationalResultsTotalCount, other.informationalResultsTotalCount)
                && java.util.Objects.equals(
                        this.warningResultsTotalCount, other.warningResultsTotalCount)
                && java.util.Objects.equals(
                        this.blockerResultsTotalCount, other.blockerResultsTotalCount)
                && java.util.Objects.equals(
                        this.fatalResultsTotalCount, other.fatalResultsTotalCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.passResultsTotalCount == null
                                ? 43
                                : this.passResultsTotalCount.hashCode());
        result =
                (result * PRIME)
                        + (this.informationalResultsTotalCount == null
                                ? 43
                                : this.informationalResultsTotalCount.hashCode());
        result =
                (result * PRIME)
                        + (this.warningResultsTotalCount == null
                                ? 43
                                : this.warningResultsTotalCount.hashCode());
        result =
                (result * PRIME)
                        + (this.blockerResultsTotalCount == null
                                ? 43
                                : this.blockerResultsTotalCount.hashCode());
        result =
                (result * PRIME)
                        + (this.fatalResultsTotalCount == null
                                ? 43
                                : this.fatalResultsTotalCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
