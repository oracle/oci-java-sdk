/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * A summary count of detection rules.
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
    builder = RuleSummaryReport.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RuleSummaryReport extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "totalCount",
        "ingestTimeRulesCount",
        "savedSearchRulesCount"
    })
    public RuleSummaryReport(
            Integer totalCount, Integer ingestTimeRulesCount, Integer savedSearchRulesCount) {
        super();
        this.totalCount = totalCount;
        this.ingestTimeRulesCount = ingestTimeRulesCount;
        this.savedSearchRulesCount = savedSearchRulesCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The total count of detection rules.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
        private Integer totalCount;

        /**
         * The total count of detection rules.
         * @param totalCount the value to set
         * @return this builder
         **/
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            this.__explicitlySet__.add("totalCount");
            return this;
        }
        /**
         * The count of ingest time rules.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ingestTimeRulesCount")
        private Integer ingestTimeRulesCount;

        /**
         * The count of ingest time rules.
         * @param ingestTimeRulesCount the value to set
         * @return this builder
         **/
        public Builder ingestTimeRulesCount(Integer ingestTimeRulesCount) {
            this.ingestTimeRulesCount = ingestTimeRulesCount;
            this.__explicitlySet__.add("ingestTimeRulesCount");
            return this;
        }
        /**
         * The count of saved search rules.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("savedSearchRulesCount")
        private Integer savedSearchRulesCount;

        /**
         * The count of saved search rules.
         * @param savedSearchRulesCount the value to set
         * @return this builder
         **/
        public Builder savedSearchRulesCount(Integer savedSearchRulesCount) {
            this.savedSearchRulesCount = savedSearchRulesCount;
            this.__explicitlySet__.add("savedSearchRulesCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RuleSummaryReport build() {
            RuleSummaryReport model =
                    new RuleSummaryReport(
                            this.totalCount, this.ingestTimeRulesCount, this.savedSearchRulesCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RuleSummaryReport model) {
            if (model.wasPropertyExplicitlySet("totalCount")) {
                this.totalCount(model.getTotalCount());
            }
            if (model.wasPropertyExplicitlySet("ingestTimeRulesCount")) {
                this.ingestTimeRulesCount(model.getIngestTimeRulesCount());
            }
            if (model.wasPropertyExplicitlySet("savedSearchRulesCount")) {
                this.savedSearchRulesCount(model.getSavedSearchRulesCount());
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
     * The total count of detection rules.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalCount")
    private final Integer totalCount;

    /**
     * The total count of detection rules.
     * @return the value
     **/
    public Integer getTotalCount() {
        return totalCount;
    }

    /**
     * The count of ingest time rules.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ingestTimeRulesCount")
    private final Integer ingestTimeRulesCount;

    /**
     * The count of ingest time rules.
     * @return the value
     **/
    public Integer getIngestTimeRulesCount() {
        return ingestTimeRulesCount;
    }

    /**
     * The count of saved search rules.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("savedSearchRulesCount")
    private final Integer savedSearchRulesCount;

    /**
     * The count of saved search rules.
     * @return the value
     **/
    public Integer getSavedSearchRulesCount() {
        return savedSearchRulesCount;
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
        sb.append("RuleSummaryReport(");
        sb.append("super=").append(super.toString());
        sb.append("totalCount=").append(String.valueOf(this.totalCount));
        sb.append(", ingestTimeRulesCount=").append(String.valueOf(this.ingestTimeRulesCount));
        sb.append(", savedSearchRulesCount=").append(String.valueOf(this.savedSearchRulesCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RuleSummaryReport)) {
            return false;
        }

        RuleSummaryReport other = (RuleSummaryReport) o;
        return java.util.Objects.equals(this.totalCount, other.totalCount)
                && java.util.Objects.equals(this.ingestTimeRulesCount, other.ingestTimeRulesCount)
                && java.util.Objects.equals(this.savedSearchRulesCount, other.savedSearchRulesCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.totalCount == null ? 43 : this.totalCount.hashCode());
        result =
                (result * PRIME)
                        + (this.ingestTimeRulesCount == null
                                ? 43
                                : this.ingestTimeRulesCount.hashCode());
        result =
                (result * PRIME)
                        + (this.savedSearchRulesCount == null
                                ? 43
                                : this.savedSearchRulesCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
