/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of a maintenance run history. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MaintenanceRunHistorySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MaintenanceRunHistorySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "maintenanceRunDetails", "dbServersHistoryDetails"})
    public MaintenanceRunHistorySummary(
            String id,
            MaintenanceRunSummary maintenanceRunDetails,
            java.util.List<DbServerHistorySummary> dbServersHistoryDetails) {
        super();
        this.id = id;
        this.maintenanceRunDetails = maintenanceRunDetails;
        this.dbServersHistoryDetails = dbServersHistoryDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the maintenance run history. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the maintenance run history.
         *
         * @param id the value to set
         * @return this builder
         */
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
        /** List of database server history details. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbServersHistoryDetails")
        private java.util.List<DbServerHistorySummary> dbServersHistoryDetails;

        /**
         * List of database server history details.
         *
         * @param dbServersHistoryDetails the value to set
         * @return this builder
         */
        public Builder dbServersHistoryDetails(
                java.util.List<DbServerHistorySummary> dbServersHistoryDetails) {
            this.dbServersHistoryDetails = dbServersHistoryDetails;
            this.__explicitlySet__.add("dbServersHistoryDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MaintenanceRunHistorySummary build() {
            MaintenanceRunHistorySummary model =
                    new MaintenanceRunHistorySummary(
                            this.id, this.maintenanceRunDetails, this.dbServersHistoryDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MaintenanceRunHistorySummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("maintenanceRunDetails")) {
                this.maintenanceRunDetails(model.getMaintenanceRunDetails());
            }
            if (model.wasPropertyExplicitlySet("dbServersHistoryDetails")) {
                this.dbServersHistoryDetails(model.getDbServersHistoryDetails());
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

    /** The OCID of the maintenance run history. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the maintenance run history.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("maintenanceRunDetails")
    private final MaintenanceRunSummary maintenanceRunDetails;

    public MaintenanceRunSummary getMaintenanceRunDetails() {
        return maintenanceRunDetails;
    }

    /** List of database server history details. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbServersHistoryDetails")
    private final java.util.List<DbServerHistorySummary> dbServersHistoryDetails;

    /**
     * List of database server history details.
     *
     * @return the value
     */
    public java.util.List<DbServerHistorySummary> getDbServersHistoryDetails() {
        return dbServersHistoryDetails;
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
        sb.append("MaintenanceRunHistorySummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", maintenanceRunDetails=").append(String.valueOf(this.maintenanceRunDetails));
        sb.append(", dbServersHistoryDetails=")
                .append(String.valueOf(this.dbServersHistoryDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MaintenanceRunHistorySummary)) {
            return false;
        }

        MaintenanceRunHistorySummary other = (MaintenanceRunHistorySummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.maintenanceRunDetails, other.maintenanceRunDetails)
                && java.util.Objects.equals(
                        this.dbServersHistoryDetails, other.dbServersHistoryDetails)
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
