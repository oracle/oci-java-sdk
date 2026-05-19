/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourceanalytics.model;

/**
 * Information about a monitored region in a tenancy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20241031")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TenancyAttachmentMonitoredRegionSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TenancyAttachmentMonitoredRegionSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"regionId", "dataPopulation"})
    public TenancyAttachmentMonitoredRegionSummary(
            String regionId, TenancyAttachmentDataPopulation dataPopulation) {
        super();
        this.regionId = regionId;
        this.dataPopulation = dataPopulation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [Region
         * Identifier](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm) of the
         * monitored region. E.g. us-ashburn-1
         */
        @com.fasterxml.jackson.annotation.JsonProperty("regionId")
        private String regionId;

        /**
         * The [Region
         * Identifier](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm) of the
         * monitored region. E.g. us-ashburn-1
         *
         * @param regionId the value to set
         * @return this builder
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            this.__explicitlySet__.add("regionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("dataPopulation")
        private TenancyAttachmentDataPopulation dataPopulation;

        public Builder dataPopulation(TenancyAttachmentDataPopulation dataPopulation) {
            this.dataPopulation = dataPopulation;
            this.__explicitlySet__.add("dataPopulation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TenancyAttachmentMonitoredRegionSummary build() {
            TenancyAttachmentMonitoredRegionSummary model =
                    new TenancyAttachmentMonitoredRegionSummary(this.regionId, this.dataPopulation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TenancyAttachmentMonitoredRegionSummary model) {
            if (model.wasPropertyExplicitlySet("regionId")) {
                this.regionId(model.getRegionId());
            }
            if (model.wasPropertyExplicitlySet("dataPopulation")) {
                this.dataPopulation(model.getDataPopulation());
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

    /**
     * The [Region Identifier](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm) of
     * the monitored region. E.g. us-ashburn-1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("regionId")
    private final String regionId;

    /**
     * The [Region Identifier](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm) of
     * the monitored region. E.g. us-ashburn-1
     *
     * @return the value
     */
    public String getRegionId() {
        return regionId;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("dataPopulation")
    private final TenancyAttachmentDataPopulation dataPopulation;

    public TenancyAttachmentDataPopulation getDataPopulation() {
        return dataPopulation;
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
        sb.append("TenancyAttachmentMonitoredRegionSummary(");
        sb.append("super=").append(super.toString());
        sb.append("regionId=").append(String.valueOf(this.regionId));
        sb.append(", dataPopulation=").append(String.valueOf(this.dataPopulation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TenancyAttachmentMonitoredRegionSummary)) {
            return false;
        }

        TenancyAttachmentMonitoredRegionSummary other = (TenancyAttachmentMonitoredRegionSummary) o;
        return java.util.Objects.equals(this.regionId, other.regionId)
                && java.util.Objects.equals(this.dataPopulation, other.dataPopulation)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.regionId == null ? 43 : this.regionId.hashCode());
        result =
                (result * PRIME)
                        + (this.dataPopulation == null ? 43 : this.dataPopulation.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
