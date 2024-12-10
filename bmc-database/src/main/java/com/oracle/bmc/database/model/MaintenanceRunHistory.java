/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of a maintenance run history.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MaintenanceRunHistory.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MaintenanceRunHistory
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "maintenanceRunDetails",
        "dbServersHistoryDetails",
        "currentExecutionWindow",
        "granularMaintenanceHistory"
    })
    public MaintenanceRunHistory(
            String id,
            MaintenanceRunSummary maintenanceRunDetails,
            java.util.List<DbServerHistorySummary> dbServersHistoryDetails,
            String currentExecutionWindow,
            java.util.List<GranularMaintenanceHistoryDetails> granularMaintenanceHistory) {
        super();
        this.id = id;
        this.maintenanceRunDetails = maintenanceRunDetails;
        this.dbServersHistoryDetails = dbServersHistoryDetails;
        this.currentExecutionWindow = currentExecutionWindow;
        this.granularMaintenanceHistory = granularMaintenanceHistory;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the maintenance run history.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the maintenance run history.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("maintenanceRunDetails")
        private MaintenanceRunSummary maintenanceRunDetails;

        public Builder maintenanceRunDetails(MaintenanceRunSummary maintenanceRunDetails) {
            this.maintenanceRunDetails = maintenanceRunDetails;
            this.__explicitlySet__.add("maintenanceRunDetails");
            return this;
        }
        /**
         * List of database server history details.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dbServersHistoryDetails")
        private java.util.List<DbServerHistorySummary> dbServersHistoryDetails;

        /**
         * List of database server history details.
         * @param dbServersHistoryDetails the value to set
         * @return this builder
         **/
        public Builder dbServersHistoryDetails(
                java.util.List<DbServerHistorySummary> dbServersHistoryDetails) {
            this.dbServersHistoryDetails = dbServersHistoryDetails;
            this.__explicitlySet__.add("dbServersHistoryDetails");
            return this;
        }
        /**
         * The OCID of the current execution window.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("currentExecutionWindow")
        private String currentExecutionWindow;

        /**
         * The OCID of the current execution window.
         * @param currentExecutionWindow the value to set
         * @return this builder
         **/
        public Builder currentExecutionWindow(String currentExecutionWindow) {
            this.currentExecutionWindow = currentExecutionWindow;
            this.__explicitlySet__.add("currentExecutionWindow");
            return this;
        }
        /**
         * The list of granular maintenance history details.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("granularMaintenanceHistory")
        private java.util.List<GranularMaintenanceHistoryDetails> granularMaintenanceHistory;

        /**
         * The list of granular maintenance history details.
         * @param granularMaintenanceHistory the value to set
         * @return this builder
         **/
        public Builder granularMaintenanceHistory(
                java.util.List<GranularMaintenanceHistoryDetails> granularMaintenanceHistory) {
            this.granularMaintenanceHistory = granularMaintenanceHistory;
            this.__explicitlySet__.add("granularMaintenanceHistory");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaintenanceRunHistory build() {
            MaintenanceRunHistory model =
                    new MaintenanceRunHistory(
                            this.id,
                            this.maintenanceRunDetails,
                            this.dbServersHistoryDetails,
                            this.currentExecutionWindow,
                            this.granularMaintenanceHistory);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaintenanceRunHistory model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("maintenanceRunDetails")) {
                this.maintenanceRunDetails(model.getMaintenanceRunDetails());
            }
            if (model.wasPropertyExplicitlySet("dbServersHistoryDetails")) {
                this.dbServersHistoryDetails(model.getDbServersHistoryDetails());
            }
            if (model.wasPropertyExplicitlySet("currentExecutionWindow")) {
                this.currentExecutionWindow(model.getCurrentExecutionWindow());
            }
            if (model.wasPropertyExplicitlySet("granularMaintenanceHistory")) {
                this.granularMaintenanceHistory(model.getGranularMaintenanceHistory());
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
     * The OCID of the maintenance run history.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the maintenance run history.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceRunDetails")
    private final MaintenanceRunSummary maintenanceRunDetails;

    public MaintenanceRunSummary getMaintenanceRunDetails() {
        return maintenanceRunDetails;
    }

    /**
     * List of database server history details.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dbServersHistoryDetails")
    private final java.util.List<DbServerHistorySummary> dbServersHistoryDetails;

    /**
     * List of database server history details.
     * @return the value
     **/
    public java.util.List<DbServerHistorySummary> getDbServersHistoryDetails() {
        return dbServersHistoryDetails;
    }

    /**
     * The OCID of the current execution window.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("currentExecutionWindow")
    private final String currentExecutionWindow;

    /**
     * The OCID of the current execution window.
     * @return the value
     **/
    public String getCurrentExecutionWindow() {
        return currentExecutionWindow;
    }

    /**
     * The list of granular maintenance history details.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("granularMaintenanceHistory")
    private final java.util.List<GranularMaintenanceHistoryDetails> granularMaintenanceHistory;

    /**
     * The list of granular maintenance history details.
     * @return the value
     **/
    public java.util.List<GranularMaintenanceHistoryDetails> getGranularMaintenanceHistory() {
        return granularMaintenanceHistory;
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
        sb.append("MaintenanceRunHistory(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", maintenanceRunDetails=").append(String.valueOf(this.maintenanceRunDetails));
        sb.append(", dbServersHistoryDetails=")
                .append(String.valueOf(this.dbServersHistoryDetails));
        sb.append(", currentExecutionWindow=").append(String.valueOf(this.currentExecutionWindow));
        sb.append(", granularMaintenanceHistory=")
                .append(String.valueOf(this.granularMaintenanceHistory));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MaintenanceRunHistory)) {
            return false;
        }

        MaintenanceRunHistory other = (MaintenanceRunHistory) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.maintenanceRunDetails, other.maintenanceRunDetails)
                && java.util.Objects.equals(
                        this.dbServersHistoryDetails, other.dbServersHistoryDetails)
                && java.util.Objects.equals(
                        this.currentExecutionWindow, other.currentExecutionWindow)
                && java.util.Objects.equals(
                        this.granularMaintenanceHistory, other.granularMaintenanceHistory)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.maintenanceRunDetails == null
                                ? 43
                                : this.maintenanceRunDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.dbServersHistoryDetails == null
                                ? 43
                                : this.dbServersHistoryDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.currentExecutionWindow == null
                                ? 43
                                : this.currentExecutionWindow.hashCode());
        result =
                (result * PRIME)
                        + (this.granularMaintenanceHistory == null
                                ? 43
                                : this.granularMaintenanceHistory.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
