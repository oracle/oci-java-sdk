/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * ADDM summary for a database <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AddmDbSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AddmDbSummary extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "databaseDetails",
        "numberOfFindings",
        "numberOfAddmTasks",
        "timeFirstSnapshotBegin",
        "timeLatestSnapshotEnd",
        "snapshotIntervalStart",
        "snapshotIntervalEnd",
        "maxOverallImpact",
        "mostFrequentCategoryName",
        "mostFrequentCategoryDisplayName"
    })
    public AddmDbSummary(
            DatabaseDetails databaseDetails,
            Integer numberOfFindings,
            Integer numberOfAddmTasks,
            java.util.Date timeFirstSnapshotBegin,
            java.util.Date timeLatestSnapshotEnd,
            String snapshotIntervalStart,
            String snapshotIntervalEnd,
            Double maxOverallImpact,
            String mostFrequentCategoryName,
            String mostFrequentCategoryDisplayName) {
        super();
        this.databaseDetails = databaseDetails;
        this.numberOfFindings = numberOfFindings;
        this.numberOfAddmTasks = numberOfAddmTasks;
        this.timeFirstSnapshotBegin = timeFirstSnapshotBegin;
        this.timeLatestSnapshotEnd = timeLatestSnapshotEnd;
        this.snapshotIntervalStart = snapshotIntervalStart;
        this.snapshotIntervalEnd = snapshotIntervalEnd;
        this.maxOverallImpact = maxOverallImpact;
        this.mostFrequentCategoryName = mostFrequentCategoryName;
        this.mostFrequentCategoryDisplayName = mostFrequentCategoryDisplayName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("databaseDetails")
        private DatabaseDetails databaseDetails;

        public Builder databaseDetails(DatabaseDetails databaseDetails) {
            this.databaseDetails = databaseDetails;
            this.__explicitlySet__.add("databaseDetails");
            return this;
        }
        /** Number of ADDM findings */
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfFindings")
        private Integer numberOfFindings;

        /**
         * Number of ADDM findings
         *
         * @param numberOfFindings the value to set
         * @return this builder
         */
        public Builder numberOfFindings(Integer numberOfFindings) {
            this.numberOfFindings = numberOfFindings;
            this.__explicitlySet__.add("numberOfFindings");
            return this;
        }
        /** Number of ADDM tasks */
        @com.fasterxml.jackson.annotation.JsonProperty("numberOfAddmTasks")
        private Integer numberOfAddmTasks;

        /**
         * Number of ADDM tasks
         *
         * @param numberOfAddmTasks the value to set
         * @return this builder
         */
        public Builder numberOfAddmTasks(Integer numberOfAddmTasks) {
            this.numberOfAddmTasks = numberOfAddmTasks;
            this.__explicitlySet__.add("numberOfAddmTasks");
            return this;
        }
        /** The start timestamp that was passed into the request. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeFirstSnapshotBegin")
        private java.util.Date timeFirstSnapshotBegin;

        /**
         * The start timestamp that was passed into the request.
         *
         * @param timeFirstSnapshotBegin the value to set
         * @return this builder
         */
        public Builder timeFirstSnapshotBegin(java.util.Date timeFirstSnapshotBegin) {
            this.timeFirstSnapshotBegin = timeFirstSnapshotBegin;
            this.__explicitlySet__.add("timeFirstSnapshotBegin");
            return this;
        }
        /** The end timestamp that was passed into the request. */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLatestSnapshotEnd")
        private java.util.Date timeLatestSnapshotEnd;

        /**
         * The end timestamp that was passed into the request.
         *
         * @param timeLatestSnapshotEnd the value to set
         * @return this builder
         */
        public Builder timeLatestSnapshotEnd(java.util.Date timeLatestSnapshotEnd) {
            this.timeLatestSnapshotEnd = timeLatestSnapshotEnd;
            this.__explicitlySet__.add("timeLatestSnapshotEnd");
            return this;
        }
        /** AWR snapshot id. */
        @com.fasterxml.jackson.annotation.JsonProperty("snapshotIntervalStart")
        private String snapshotIntervalStart;

        /**
         * AWR snapshot id.
         *
         * @param snapshotIntervalStart the value to set
         * @return this builder
         */
        public Builder snapshotIntervalStart(String snapshotIntervalStart) {
            this.snapshotIntervalStart = snapshotIntervalStart;
            this.__explicitlySet__.add("snapshotIntervalStart");
            return this;
        }
        /** AWR snapshot id. */
        @com.fasterxml.jackson.annotation.JsonProperty("snapshotIntervalEnd")
        private String snapshotIntervalEnd;

        /**
         * AWR snapshot id.
         *
         * @param snapshotIntervalEnd the value to set
         * @return this builder
         */
        public Builder snapshotIntervalEnd(String snapshotIntervalEnd) {
            this.snapshotIntervalEnd = snapshotIntervalEnd;
            this.__explicitlySet__.add("snapshotIntervalEnd");
            return this;
        }
        /** Maximum overall impact in terms of percentage of total activity */
        @com.fasterxml.jackson.annotation.JsonProperty("maxOverallImpact")
        private Double maxOverallImpact;

        /**
         * Maximum overall impact in terms of percentage of total activity
         *
         * @param maxOverallImpact the value to set
         * @return this builder
         */
        public Builder maxOverallImpact(Double maxOverallImpact) {
            this.maxOverallImpact = maxOverallImpact;
            this.__explicitlySet__.add("maxOverallImpact");
            return this;
        }
        /** Category name */
        @com.fasterxml.jackson.annotation.JsonProperty("mostFrequentCategoryName")
        private String mostFrequentCategoryName;

        /**
         * Category name
         *
         * @param mostFrequentCategoryName the value to set
         * @return this builder
         */
        public Builder mostFrequentCategoryName(String mostFrequentCategoryName) {
            this.mostFrequentCategoryName = mostFrequentCategoryName;
            this.__explicitlySet__.add("mostFrequentCategoryName");
            return this;
        }
        /** Category display name */
        @com.fasterxml.jackson.annotation.JsonProperty("mostFrequentCategoryDisplayName")
        private String mostFrequentCategoryDisplayName;

        /**
         * Category display name
         *
         * @param mostFrequentCategoryDisplayName the value to set
         * @return this builder
         */
        public Builder mostFrequentCategoryDisplayName(String mostFrequentCategoryDisplayName) {
            this.mostFrequentCategoryDisplayName = mostFrequentCategoryDisplayName;
            this.__explicitlySet__.add("mostFrequentCategoryDisplayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddmDbSummary build() {
            AddmDbSummary model =
                    new AddmDbSummary(
                            this.databaseDetails,
                            this.numberOfFindings,
                            this.numberOfAddmTasks,
                            this.timeFirstSnapshotBegin,
                            this.timeLatestSnapshotEnd,
                            this.snapshotIntervalStart,
                            this.snapshotIntervalEnd,
                            this.maxOverallImpact,
                            this.mostFrequentCategoryName,
                            this.mostFrequentCategoryDisplayName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddmDbSummary model) {
            if (model.wasPropertyExplicitlySet("databaseDetails")) {
                this.databaseDetails(model.getDatabaseDetails());
            }
            if (model.wasPropertyExplicitlySet("numberOfFindings")) {
                this.numberOfFindings(model.getNumberOfFindings());
            }
            if (model.wasPropertyExplicitlySet("numberOfAddmTasks")) {
                this.numberOfAddmTasks(model.getNumberOfAddmTasks());
            }
            if (model.wasPropertyExplicitlySet("timeFirstSnapshotBegin")) {
                this.timeFirstSnapshotBegin(model.getTimeFirstSnapshotBegin());
            }
            if (model.wasPropertyExplicitlySet("timeLatestSnapshotEnd")) {
                this.timeLatestSnapshotEnd(model.getTimeLatestSnapshotEnd());
            }
            if (model.wasPropertyExplicitlySet("snapshotIntervalStart")) {
                this.snapshotIntervalStart(model.getSnapshotIntervalStart());
            }
            if (model.wasPropertyExplicitlySet("snapshotIntervalEnd")) {
                this.snapshotIntervalEnd(model.getSnapshotIntervalEnd());
            }
            if (model.wasPropertyExplicitlySet("maxOverallImpact")) {
                this.maxOverallImpact(model.getMaxOverallImpact());
            }
            if (model.wasPropertyExplicitlySet("mostFrequentCategoryName")) {
                this.mostFrequentCategoryName(model.getMostFrequentCategoryName());
            }
            if (model.wasPropertyExplicitlySet("mostFrequentCategoryDisplayName")) {
                this.mostFrequentCategoryDisplayName(model.getMostFrequentCategoryDisplayName());
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

    @com.fasterxml.jackson.annotation.JsonProperty("databaseDetails")
    private final DatabaseDetails databaseDetails;

    public DatabaseDetails getDatabaseDetails() {
        return databaseDetails;
    }

    /** Number of ADDM findings */
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfFindings")
    private final Integer numberOfFindings;

    /**
     * Number of ADDM findings
     *
     * @return the value
     */
    public Integer getNumberOfFindings() {
        return numberOfFindings;
    }

    /** Number of ADDM tasks */
    @com.fasterxml.jackson.annotation.JsonProperty("numberOfAddmTasks")
    private final Integer numberOfAddmTasks;

    /**
     * Number of ADDM tasks
     *
     * @return the value
     */
    public Integer getNumberOfAddmTasks() {
        return numberOfAddmTasks;
    }

    /** The start timestamp that was passed into the request. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeFirstSnapshotBegin")
    private final java.util.Date timeFirstSnapshotBegin;

    /**
     * The start timestamp that was passed into the request.
     *
     * @return the value
     */
    public java.util.Date getTimeFirstSnapshotBegin() {
        return timeFirstSnapshotBegin;
    }

    /** The end timestamp that was passed into the request. */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLatestSnapshotEnd")
    private final java.util.Date timeLatestSnapshotEnd;

    /**
     * The end timestamp that was passed into the request.
     *
     * @return the value
     */
    public java.util.Date getTimeLatestSnapshotEnd() {
        return timeLatestSnapshotEnd;
    }

    /** AWR snapshot id. */
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotIntervalStart")
    private final String snapshotIntervalStart;

    /**
     * AWR snapshot id.
     *
     * @return the value
     */
    public String getSnapshotIntervalStart() {
        return snapshotIntervalStart;
    }

    /** AWR snapshot id. */
    @com.fasterxml.jackson.annotation.JsonProperty("snapshotIntervalEnd")
    private final String snapshotIntervalEnd;

    /**
     * AWR snapshot id.
     *
     * @return the value
     */
    public String getSnapshotIntervalEnd() {
        return snapshotIntervalEnd;
    }

    /** Maximum overall impact in terms of percentage of total activity */
    @com.fasterxml.jackson.annotation.JsonProperty("maxOverallImpact")
    private final Double maxOverallImpact;

    /**
     * Maximum overall impact in terms of percentage of total activity
     *
     * @return the value
     */
    public Double getMaxOverallImpact() {
        return maxOverallImpact;
    }

    /** Category name */
    @com.fasterxml.jackson.annotation.JsonProperty("mostFrequentCategoryName")
    private final String mostFrequentCategoryName;

    /**
     * Category name
     *
     * @return the value
     */
    public String getMostFrequentCategoryName() {
        return mostFrequentCategoryName;
    }

    /** Category display name */
    @com.fasterxml.jackson.annotation.JsonProperty("mostFrequentCategoryDisplayName")
    private final String mostFrequentCategoryDisplayName;

    /**
     * Category display name
     *
     * @return the value
     */
    public String getMostFrequentCategoryDisplayName() {
        return mostFrequentCategoryDisplayName;
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
        sb.append("AddmDbSummary(");
        sb.append("super=").append(super.toString());
        sb.append("databaseDetails=").append(String.valueOf(this.databaseDetails));
        sb.append(", numberOfFindings=").append(String.valueOf(this.numberOfFindings));
        sb.append(", numberOfAddmTasks=").append(String.valueOf(this.numberOfAddmTasks));
        sb.append(", timeFirstSnapshotBegin=").append(String.valueOf(this.timeFirstSnapshotBegin));
        sb.append(", timeLatestSnapshotEnd=").append(String.valueOf(this.timeLatestSnapshotEnd));
        sb.append(", snapshotIntervalStart=").append(String.valueOf(this.snapshotIntervalStart));
        sb.append(", snapshotIntervalEnd=").append(String.valueOf(this.snapshotIntervalEnd));
        sb.append(", maxOverallImpact=").append(String.valueOf(this.maxOverallImpact));
        sb.append(", mostFrequentCategoryName=")
                .append(String.valueOf(this.mostFrequentCategoryName));
        sb.append(", mostFrequentCategoryDisplayName=")
                .append(String.valueOf(this.mostFrequentCategoryDisplayName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddmDbSummary)) {
            return false;
        }

        AddmDbSummary other = (AddmDbSummary) o;
        return java.util.Objects.equals(this.databaseDetails, other.databaseDetails)
                && java.util.Objects.equals(this.numberOfFindings, other.numberOfFindings)
                && java.util.Objects.equals(this.numberOfAddmTasks, other.numberOfAddmTasks)
                && java.util.Objects.equals(
                        this.timeFirstSnapshotBegin, other.timeFirstSnapshotBegin)
                && java.util.Objects.equals(this.timeLatestSnapshotEnd, other.timeLatestSnapshotEnd)
                && java.util.Objects.equals(this.snapshotIntervalStart, other.snapshotIntervalStart)
                && java.util.Objects.equals(this.snapshotIntervalEnd, other.snapshotIntervalEnd)
                && java.util.Objects.equals(this.maxOverallImpact, other.maxOverallImpact)
                && java.util.Objects.equals(
                        this.mostFrequentCategoryName, other.mostFrequentCategoryName)
                && java.util.Objects.equals(
                        this.mostFrequentCategoryDisplayName, other.mostFrequentCategoryDisplayName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.databaseDetails == null ? 43 : this.databaseDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.numberOfFindings == null ? 43 : this.numberOfFindings.hashCode());
        result =
                (result * PRIME)
                        + (this.numberOfAddmTasks == null ? 43 : this.numberOfAddmTasks.hashCode());
        result =
                (result * PRIME)
                        + (this.timeFirstSnapshotBegin == null
                                ? 43
                                : this.timeFirstSnapshotBegin.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLatestSnapshotEnd == null
                                ? 43
                                : this.timeLatestSnapshotEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.snapshotIntervalStart == null
                                ? 43
                                : this.snapshotIntervalStart.hashCode());
        result =
                (result * PRIME)
                        + (this.snapshotIntervalEnd == null
                                ? 43
                                : this.snapshotIntervalEnd.hashCode());
        result =
                (result * PRIME)
                        + (this.maxOverallImpact == null ? 43 : this.maxOverallImpact.hashCode());
        result =
                (result * PRIME)
                        + (this.mostFrequentCategoryName == null
                                ? 43
                                : this.mostFrequentCategoryName.hashCode());
        result =
                (result * PRIME)
                        + (this.mostFrequentCategoryDisplayName == null
                                ? 43
                                : this.mostFrequentCategoryDisplayName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
