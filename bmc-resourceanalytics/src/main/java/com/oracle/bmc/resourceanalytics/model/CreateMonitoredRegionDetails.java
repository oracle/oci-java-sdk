/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourceanalytics.model;

/**
 * The data to create a MonitoredRegion. <br>
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
        builder = CreateMonitoredRegionDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateMonitoredRegionDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"resourceAnalyticsInstanceId", "regionId"})
    public CreateMonitoredRegionDetails(String resourceAnalyticsInstanceId, String regionId) {
        super();
        this.resourceAnalyticsInstanceId = resourceAnalyticsInstanceId;
        this.regionId = regionId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ResourceAnalyticsInstance associated with this MonitoredRegion.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceAnalyticsInstanceId")
        private String resourceAnalyticsInstanceId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * ResourceAnalyticsInstance associated with this MonitoredRegion.
         *
         * @param resourceAnalyticsInstanceId the value to set
         * @return this builder
         */
        public Builder resourceAnalyticsInstanceId(String resourceAnalyticsInstanceId) {
            this.resourceAnalyticsInstanceId = resourceAnalyticsInstanceId;
            this.__explicitlySet__.add("resourceAnalyticsInstanceId");
            return this;
        }
        /**
         * The [Region
         * Identifier](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm) of this
         * MonitoredRegion.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("regionId")
        private String regionId;

        /**
         * The [Region
         * Identifier](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm) of this
         * MonitoredRegion.
         *
         * @param regionId the value to set
         * @return this builder
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            this.__explicitlySet__.add("regionId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMonitoredRegionDetails build() {
            CreateMonitoredRegionDetails model =
                    new CreateMonitoredRegionDetails(
                            this.resourceAnalyticsInstanceId, this.regionId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMonitoredRegionDetails model) {
            if (model.wasPropertyExplicitlySet("resourceAnalyticsInstanceId")) {
                this.resourceAnalyticsInstanceId(model.getResourceAnalyticsInstanceId());
            }
            if (model.wasPropertyExplicitlySet("regionId")) {
                this.regionId(model.getRegionId());
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * ResourceAnalyticsInstance associated with this MonitoredRegion.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceAnalyticsInstanceId")
    private final String resourceAnalyticsInstanceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * ResourceAnalyticsInstance associated with this MonitoredRegion.
     *
     * @return the value
     */
    public String getResourceAnalyticsInstanceId() {
        return resourceAnalyticsInstanceId;
    }

    /**
     * The [Region Identifier](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm) of
     * this MonitoredRegion.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("regionId")
    private final String regionId;

    /**
     * The [Region Identifier](https://docs.oracle.com/iaas/Content/General/Concepts/regions.htm) of
     * this MonitoredRegion.
     *
     * @return the value
     */
    public String getRegionId() {
        return regionId;
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
        sb.append("CreateMonitoredRegionDetails(");
        sb.append("super=").append(super.toString());
        sb.append("resourceAnalyticsInstanceId=")
                .append(String.valueOf(this.resourceAnalyticsInstanceId));
        sb.append(", regionId=").append(String.valueOf(this.regionId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMonitoredRegionDetails)) {
            return false;
        }

        CreateMonitoredRegionDetails other = (CreateMonitoredRegionDetails) o;
        return java.util.Objects.equals(
                        this.resourceAnalyticsInstanceId, other.resourceAnalyticsInstanceId)
                && java.util.Objects.equals(this.regionId, other.regionId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.resourceAnalyticsInstanceId == null
                                ? 43
                                : this.resourceAnalyticsInstanceId.hashCode());
        result = (result * PRIME) + (this.regionId == null ? 43 : this.regionId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
