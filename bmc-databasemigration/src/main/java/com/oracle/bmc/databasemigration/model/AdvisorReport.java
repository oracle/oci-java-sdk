/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Pre-Migration advisor report details.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210929")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AdvisorReport.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AdvisorReport extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "reportLocationDetails",
        "result",
        "numberOfFatal",
        "numberOfFatalBlockers",
        "numberOfWarnings",
        "numberOfInformationalResults"
    })
    public AdvisorReport(
            AdvisorReportLocationDetails reportLocationDetails,
            AdvisorResults result,
            Integer numberOfFatal,
            Integer numberOfFatalBlockers,
            Integer numberOfWarnings,
            Integer numberOfInformationalResults) {
        super();
        this.reportLocationDetails = reportLocationDetails;
        this.result = result;
        this.numberOfFatal = numberOfFatal;
        this.numberOfFatalBlockers = numberOfFatalBlockers;
        this.numberOfWarnings = numberOfWarnings;
        this.numberOfInformationalResults = numberOfInformationalResults;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("reportLocationDetails")
        private AdvisorReportLocationDetails reportLocationDetails;

        public Builder reportLocationDetails(AdvisorReportLocationDetails reportLocationDetails) {
            this.reportLocationDetails = reportLocationDetails;
            this.__explicitlySet__.add("reportLocationDetails");
            return this;
        }
        /**
         * Pre-Migration advisor result.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("result")
        private AdvisorResults result;

        /**
         * Pre-Migration advisor result.
         *
         * @param result the value to set
         * @return this builder
         **/
        public Builder result(AdvisorResults result) {
            this.result = result;
            this.__explicitlySet__.add("result");
            return this;
        }
        /**
         * Number of Fatal results in the advisor report.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfFatal")
        private Integer numberOfFatal;

        /**
         * Number of Fatal results in the advisor report.
         *
         * @param numberOfFatal the value to set
         * @return this builder
         **/
        public Builder numberOfFatal(Integer numberOfFatal) {
            this.numberOfFatal = numberOfFatal;
            this.__explicitlySet__.add("numberOfFatal");
            return this;
        }
        /**
         * Number of Fatal Blocker results in the advisor report.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfFatalBlockers")
        private Integer numberOfFatalBlockers;

        /**
         * Number of Fatal Blocker results in the advisor report.
         *
         * @param numberOfFatalBlockers the value to set
         * @return this builder
         **/
        public Builder numberOfFatalBlockers(Integer numberOfFatalBlockers) {
            this.numberOfFatalBlockers = numberOfFatalBlockers;
            this.__explicitlySet__.add("numberOfFatalBlockers");
            return this;
        }
        /**
         * Number of Warning results in the advisor report.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfWarnings")
        private Integer numberOfWarnings;

        /**
         * Number of Warning results in the advisor report.
         *
         * @param numberOfWarnings the value to set
         * @return this builder
         **/
        public Builder numberOfWarnings(Integer numberOfWarnings) {
            this.numberOfWarnings = numberOfWarnings;
            this.__explicitlySet__.add("numberOfWarnings");
            return this;
        }
        /**
         * Number of Informational results in the advisor report.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfInformationalResults")
        private Integer numberOfInformationalResults;

        /**
         * Number of Informational results in the advisor report.
         *
         * @param numberOfInformationalResults the value to set
         * @return this builder
         **/
        public Builder numberOfInformationalResults(Integer numberOfInformationalResults) {
            this.numberOfInformationalResults = numberOfInformationalResults;
            this.__explicitlySet__.add("numberOfInformationalResults");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdvisorReport build() {
            AdvisorReport model =
                    new AdvisorReport(
                            this.reportLocationDetails,
                            this.result,
                            this.numberOfFatal,
                            this.numberOfFatalBlockers,
                            this.numberOfWarnings,
                            this.numberOfInformationalResults);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdvisorReport model) {
            if (model.wasPropertyExplicitlySet("reportLocationDetails")) {
                this.reportLocationDetails(model.getReportLocationDetails());
            }
            if (model.wasPropertyExplicitlySet("result")) {
                this.result(model.getResult());
            }
            if (model.wasPropertyExplicitlySet("numberOfFatal")) {
                this.numberOfFatal(model.getNumberOfFatal());
            }
            if (model.wasPropertyExplicitlySet("numberOfFatalBlockers")) {
                this.numberOfFatalBlockers(model.getNumberOfFatalBlockers());
            }
            if (model.wasPropertyExplicitlySet("numberOfWarnings")) {
                this.numberOfWarnings(model.getNumberOfWarnings());
            }
            if (model.wasPropertyExplicitlySet("numberOfInformationalResults")) {
                this.numberOfInformationalResults(model.getNumberOfInformationalResults());
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

    @com.fasterxml.jackson.annotation.JsonProperty("reportLocationDetails")
    private final AdvisorReportLocationDetails reportLocationDetails;

    public AdvisorReportLocationDetails getReportLocationDetails() {
        return reportLocationDetails;
    }

    /**
     * Pre-Migration advisor result.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("result")
    private final AdvisorResults result;

    /**
     * Pre-Migration advisor result.
     *
     * @return the value
     **/
    public AdvisorResults getResult() {
        return result;
    }

    /**
     * Number of Fatal results in the advisor report.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfFatal")
    private final Integer numberOfFatal;

    /**
     * Number of Fatal results in the advisor report.
     *
     * @return the value
     **/
    public Integer getNumberOfFatal() {
        return numberOfFatal;
    }

    /**
     * Number of Fatal Blocker results in the advisor report.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfFatalBlockers")
    private final Integer numberOfFatalBlockers;

    /**
     * Number of Fatal Blocker results in the advisor report.
     *
     * @return the value
     **/
    public Integer getNumberOfFatalBlockers() {
        return numberOfFatalBlockers;
    }

    /**
     * Number of Warning results in the advisor report.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfWarnings")
    private final Integer numberOfWarnings;

    /**
     * Number of Warning results in the advisor report.
     *
     * @return the value
     **/
    public Integer getNumberOfWarnings() {
        return numberOfWarnings;
    }

    /**
     * Number of Informational results in the advisor report.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfInformationalResults")
    private final Integer numberOfInformationalResults;

    /**
     * Number of Informational results in the advisor report.
     *
     * @return the value
     **/
    public Integer getNumberOfInformationalResults() {
        return numberOfInformationalResults;
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
        sb.append("AdvisorReport(");
        sb.append("super=").append(super.toString());
        sb.append("reportLocationDetails=").append(String.valueOf(this.reportLocationDetails));
        sb.append(", result=").append(String.valueOf(this.result));
        sb.append(", numberOfFatal=").append(String.valueOf(this.numberOfFatal));
        sb.append(", numberOfFatalBlockers=").append(String.valueOf(this.numberOfFatalBlockers));
        sb.append(", numberOfWarnings=").append(String.valueOf(this.numberOfWarnings));
        sb.append(", numberOfInformationalResults=")
                .append(String.valueOf(this.numberOfInformationalResults));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdvisorReport)) {
            return false;
        }

        AdvisorReport other = (AdvisorReport) o;
        return java.util.Objects.equals(this.reportLocationDetails, other.reportLocationDetails)
                && java.util.Objects.equals(this.result, other.result)
                && java.util.Objects.equals(this.numberOfFatal, other.numberOfFatal)
                && java.util.Objects.equals(this.numberOfFatalBlockers, other.numberOfFatalBlockers)
                && java.util.Objects.equals(this.numberOfWarnings, other.numberOfWarnings)
                && java.util.Objects.equals(
                        this.numberOfInformationalResults, other.numberOfInformationalResults)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.reportLocationDetails == null
                                ? 43
                                : this.reportLocationDetails.hashCode());
        result = (result * PRIME) + (this.result == null ? 43 : this.result.hashCode());
        result =
                (result * PRIME)
                        + (this.numberOfFatal == null ? 43 : this.numberOfFatal.hashCode());
        result =
                (result * PRIME)
                        + (this.numberOfFatalBlockers == null
                                ? 43
                                : this.numberOfFatalBlockers.hashCode());
        result =
                (result * PRIME)
                        + (this.numberOfWarnings == null ? 43 : this.numberOfWarnings.hashCode());
        result =
                (result * PRIME)
                        + (this.numberOfInformationalResults == null
                                ? 43
                                : this.numberOfInformationalResults.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
