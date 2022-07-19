/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.managementdashboard.model;

/**
 * Array of dashboards to export.  Response from export must be directly acceptable to import (compartmentIds may have to be changed).
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ManagementDashboardExportDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ManagementDashboardExportDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"dashboards"})
    public ManagementDashboardExportDetails(
            java.util.List<ManagementDashboardForImportExportDetails> dashboards) {
        super();
        this.dashboards = dashboards;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Array of dashboards.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("dashboards")
        private java.util.List<ManagementDashboardForImportExportDetails> dashboards;

        /**
         * Array of dashboards.
         * @param dashboards the value to set
         * @return this builder
         **/
        public Builder dashboards(
                java.util.List<ManagementDashboardForImportExportDetails> dashboards) {
            this.dashboards = dashboards;
            this.__explicitlySet__.add("dashboards");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagementDashboardExportDetails build() {
            ManagementDashboardExportDetails __instance__ =
                    new ManagementDashboardExportDetails(dashboards);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagementDashboardExportDetails o) {
            Builder copiedBuilder = dashboards(o.getDashboards());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Array of dashboards.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dashboards")
    private final java.util.List<ManagementDashboardForImportExportDetails> dashboards;

    /**
     * Array of dashboards.
     * @return the value
     **/
    public java.util.List<ManagementDashboardForImportExportDetails> getDashboards() {
        return dashboards;
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
        sb.append("ManagementDashboardExportDetails(");
        sb.append("dashboards=").append(String.valueOf(this.dashboards));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
        return java.util.Objects.equals(this.dashboards, other.dashboards)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dashboards == null ? 43 : this.dashboards.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
