/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Details to access Pre-Migration Advisor report.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AdvisorReportLocationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AdvisorReportLocationDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"objectStorageDetails", "locationInSource"})
    public AdvisorReportLocationDetails(
            AdvisorReportBucketDetails objectStorageDetails, String locationInSource) {
        super();
        this.objectStorageDetails = objectStorageDetails;
        this.locationInSource = locationInSource;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageDetails")
        private AdvisorReportBucketDetails objectStorageDetails;

        public Builder objectStorageDetails(AdvisorReportBucketDetails objectStorageDetails) {
            this.objectStorageDetails = objectStorageDetails;
            this.__explicitlySet__.add("objectStorageDetails");
            return this;
        }
        /**
         * Path in the Source Registered Connection where the Pre-Migration advisor report can be accessed.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("locationInSource")
        private String locationInSource;

        /**
         * Path in the Source Registered Connection where the Pre-Migration advisor report can be accessed.
         *
         * @param locationInSource the value to set
         * @return this builder
         **/
        public Builder locationInSource(String locationInSource) {
            this.locationInSource = locationInSource;
            this.__explicitlySet__.add("locationInSource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AdvisorReportLocationDetails build() {
            AdvisorReportLocationDetails __instance__ =
                    new AdvisorReportLocationDetails(objectStorageDetails, locationInSource);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AdvisorReportLocationDetails o) {
            Builder copiedBuilder =
                    objectStorageDetails(o.getObjectStorageDetails())
                            .locationInSource(o.getLocationInSource());

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

    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageDetails")
    private final AdvisorReportBucketDetails objectStorageDetails;

    public AdvisorReportBucketDetails getObjectStorageDetails() {
        return objectStorageDetails;
    }

    /**
     * Path in the Source Registered Connection where the Pre-Migration advisor report can be accessed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("locationInSource")
    private final String locationInSource;

    /**
     * Path in the Source Registered Connection where the Pre-Migration advisor report can be accessed.
     *
     * @return the value
     **/
    public String getLocationInSource() {
        return locationInSource;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AdvisorReportLocationDetails(");
        sb.append("objectStorageDetails=").append(String.valueOf(this.objectStorageDetails));
        sb.append(", locationInSource=").append(String.valueOf(this.locationInSource));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AdvisorReportLocationDetails)) {
            return false;
        }

        AdvisorReportLocationDetails other = (AdvisorReportLocationDetails) o;
        return java.util.Objects.equals(this.objectStorageDetails, other.objectStorageDetails)
                && java.util.Objects.equals(this.locationInSource, other.locationInSource)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.objectStorageDetails == null
                                ? 43
                                : this.objectStorageDetails.hashCode());
        result =
                (result * PRIME)
                        + (this.locationInSource == null ? 43 : this.locationInSource.hashCode());
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
