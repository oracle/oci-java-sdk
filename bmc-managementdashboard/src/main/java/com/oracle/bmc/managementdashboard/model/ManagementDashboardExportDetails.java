/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementdashboard.model;

/**
 * Array of dashboards to export. Response from export must be directly acceptable to import
 * (compartmentIds may have to be changed). <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ManagementDashboardExportDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagementDashboardExportDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"dashboards"})
    public ManagementDashboardExportDetails(
            java.util.List<ManagementDashboardForImportExportDetails> dashboards) {
        super();
        this.dashboards = dashboards;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Array of dashboards. */
        @com.fasterxml.jackson.annotation.JsonProperty("dashboards")
        private java.util.List<ManagementDashboardForImportExportDetails> dashboards;

        /**
         * Array of dashboards.
         *
         * @param dashboards the value to set
         * @return this builder
         */
        public Builder dashboards(
                java.util.List<ManagementDashboardForImportExportDetails> dashboards) {
            this.dashboards = dashboards;
            this.__explicitlySet__.add("dashboards");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagementDashboardExportDetails build() {
            ManagementDashboardExportDetails model =
                    new ManagementDashboardExportDetails(this.dashboards);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagementDashboardExportDetails model) {
            if (model.wasPropertyExplicitlySet("dashboards")) {
                this.dashboards(model.getDashboards());
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

    /** Array of dashboards. */
    @com.fasterxml.jackson.annotation.JsonProperty("dashboards")
    private final java.util.List<ManagementDashboardForImportExportDetails> dashboards;

    /**
     * Array of dashboards.
     *
     * @return the value
     */
    public java.util.List<ManagementDashboardForImportExportDetails> getDashboards() {
        return dashboards;
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
        sb.append("ManagementDashboardExportDetails(");
        sb.append("super=").append(super.toString());
        sb.append("dashboards=").append(String.valueOf(this.dashboards));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagementDashboardExportDetails)) {
            return false;
        }

        ManagementDashboardExportDetails other = (ManagementDashboardExportDetails) o;
        return java.util.Objects.equals(this.dashboards, other.dashboards) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dashboards == null ? 43 : this.dashboards.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
