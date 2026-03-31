/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * The details used to update a Ops Insights chargeback plan report.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateChargebackPlanReportDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateChargebackPlanReportDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"reportName", "reportProperties"})
    public UpdateChargebackPlanReportDetails(
            String reportName, ReportPropertyDetails reportProperties) {
        super();
        this.reportName = reportName;
        this.reportProperties = reportProperties;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The chargeback plan report name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("reportName")
        private String reportName;

        /**
         * The chargeback plan report name.
         * @param reportName the value to set
         * @return this builder
         **/
        public Builder reportName(String reportName) {
            this.reportName = reportName;
            this.__explicitlySet__.add("reportName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("reportProperties")
        private ReportPropertyDetails reportProperties;

        public Builder reportProperties(ReportPropertyDetails reportProperties) {
            this.reportProperties = reportProperties;
            this.__explicitlySet__.add("reportProperties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateChargebackPlanReportDetails build() {
            UpdateChargebackPlanReportDetails model =
                    new UpdateChargebackPlanReportDetails(this.reportName, this.reportProperties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateChargebackPlanReportDetails model) {
            if (model.wasPropertyExplicitlySet("reportName")) {
                this.reportName(model.getReportName());
            }
            if (model.wasPropertyExplicitlySet("reportProperties")) {
                this.reportProperties(model.getReportProperties());
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
     * The chargeback plan report name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("reportName")
    private final String reportName;

    /**
     * The chargeback plan report name.
     * @return the value
     **/
    public String getReportName() {
        return reportName;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("reportProperties")
    private final ReportPropertyDetails reportProperties;

    public ReportPropertyDetails getReportProperties() {
        return reportProperties;
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
        sb.append("UpdateChargebackPlanReportDetails(");
        sb.append("super=").append(super.toString());
        sb.append("reportName=").append(String.valueOf(this.reportName));
        sb.append(", reportProperties=").append(String.valueOf(this.reportProperties));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateChargebackPlanReportDetails)) {
            return false;
        }

        UpdateChargebackPlanReportDetails other = (UpdateChargebackPlanReportDetails) o;
        return java.util.Objects.equals(this.reportName, other.reportName)
                && java.util.Objects.equals(this.reportProperties, other.reportProperties)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.reportName == null ? 43 : this.reportName.hashCode());
        result =
                (result * PRIME)
                        + (this.reportProperties == null ? 43 : this.reportProperties.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
