/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * The common fields for queries.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UsageCarbonEmissionsQueryDefinition.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UsageCarbonEmissionsQueryDefinition
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"displayName", "reportQuery", "costAnalysisUI", "version"})
    public UsageCarbonEmissionsQueryDefinition(
            String displayName,
            UsageCarbonEmissionsReportQuery reportQuery,
            CostAnalysisUI costAnalysisUI,
            Integer version) {
        super();
        this.displayName = displayName;
        this.reportQuery = reportQuery;
        this.costAnalysisUI = costAnalysisUI;
        this.version = version;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The query display name. Avoid entering confidential information.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The query display name. Avoid entering confidential information.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("reportQuery")
        private UsageCarbonEmissionsReportQuery reportQuery;

        public Builder reportQuery(UsageCarbonEmissionsReportQuery reportQuery) {
            this.reportQuery = reportQuery;
            this.__explicitlySet__.add("reportQuery");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("costAnalysisUI")
        private CostAnalysisUI costAnalysisUI;

        public Builder costAnalysisUI(CostAnalysisUI costAnalysisUI) {
            this.costAnalysisUI = costAnalysisUI;
            this.__explicitlySet__.add("costAnalysisUI");
            return this;
        }
        /**
         * The saved query version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private Integer version;

        /**
         * The saved query version.
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(Integer version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UsageCarbonEmissionsQueryDefinition build() {
            UsageCarbonEmissionsQueryDefinition model =
                    new UsageCarbonEmissionsQueryDefinition(
                            this.displayName, this.reportQuery, this.costAnalysisUI, this.version);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UsageCarbonEmissionsQueryDefinition model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("reportQuery")) {
                this.reportQuery(model.getReportQuery());
            }
            if (model.wasPropertyExplicitlySet("costAnalysisUI")) {
                this.costAnalysisUI(model.getCostAnalysisUI());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
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
     * The query display name. Avoid entering confidential information.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The query display name. Avoid entering confidential information.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("reportQuery")
    private final UsageCarbonEmissionsReportQuery reportQuery;

    public UsageCarbonEmissionsReportQuery getReportQuery() {
        return reportQuery;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("costAnalysisUI")
    private final CostAnalysisUI costAnalysisUI;

    public CostAnalysisUI getCostAnalysisUI() {
        return costAnalysisUI;
    }

    /**
     * The saved query version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final Integer version;

    /**
     * The saved query version.
     * @return the value
     **/
    public Integer getVersion() {
        return version;
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
        sb.append("UsageCarbonEmissionsQueryDefinition(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", reportQuery=").append(String.valueOf(this.reportQuery));
        sb.append(", costAnalysisUI=").append(String.valueOf(this.costAnalysisUI));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UsageCarbonEmissionsQueryDefinition)) {
            return false;
        }

        UsageCarbonEmissionsQueryDefinition other = (UsageCarbonEmissionsQueryDefinition) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.reportQuery, other.reportQuery)
                && java.util.Objects.equals(this.costAnalysisUI, other.costAnalysisUI)
                && java.util.Objects.equals(this.version, other.version)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.reportQuery == null ? 43 : this.reportQuery.hashCode());
        result =
                (result * PRIME)
                        + (this.costAnalysisUI == null ? 43 : this.costAnalysisUI.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
