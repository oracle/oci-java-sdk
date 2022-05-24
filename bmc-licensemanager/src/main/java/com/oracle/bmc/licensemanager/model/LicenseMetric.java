/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.licensemanager.model;

/**
 * Overview of product license and resources usage.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220430")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LicenseMetric.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class LicenseMetric {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("totalProductLicenseCount")
        private Integer totalProductLicenseCount;

        public Builder totalProductLicenseCount(Integer totalProductLicenseCount) {
            this.totalProductLicenseCount = totalProductLicenseCount;
            this.__explicitlySet__.add("totalProductLicenseCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalByolInstanceCount")
        private Integer totalByolInstanceCount;

        public Builder totalByolInstanceCount(Integer totalByolInstanceCount) {
            this.totalByolInstanceCount = totalByolInstanceCount;
            this.__explicitlySet__.add("totalByolInstanceCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("totalLicenseIncludedInstanceCount")
        private Integer totalLicenseIncludedInstanceCount;

        public Builder totalLicenseIncludedInstanceCount(
                Integer totalLicenseIncludedInstanceCount) {
            this.totalLicenseIncludedInstanceCount = totalLicenseIncludedInstanceCount;
            this.__explicitlySet__.add("totalLicenseIncludedInstanceCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("licenseRecordExpiringSoonCount")
        private Integer licenseRecordExpiringSoonCount;

        public Builder licenseRecordExpiringSoonCount(Integer licenseRecordExpiringSoonCount) {
            this.licenseRecordExpiringSoonCount = licenseRecordExpiringSoonCount;
            this.__explicitlySet__.add("licenseRecordExpiringSoonCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LicenseMetric build() {
            LicenseMetric __instance__ =
                    new LicenseMetric(
                            totalProductLicenseCount,
                            totalByolInstanceCount,
                            totalLicenseIncludedInstanceCount,
                            licenseRecordExpiringSoonCount);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LicenseMetric o) {
            Builder copiedBuilder =
                    totalProductLicenseCount(o.getTotalProductLicenseCount())
                            .totalByolInstanceCount(o.getTotalByolInstanceCount())
                            .totalLicenseIncludedInstanceCount(
                                    o.getTotalLicenseIncludedInstanceCount())
                            .licenseRecordExpiringSoonCount(o.getLicenseRecordExpiringSoonCount());

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

    /**
     * Total number of product licenses in a particular compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalProductLicenseCount")
    Integer totalProductLicenseCount;

    /**
     * Total number of BYOL instances in a particular compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalByolInstanceCount")
    Integer totalByolInstanceCount;

    /**
     * Total number of License Included (LI) instances in a particular compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalLicenseIncludedInstanceCount")
    Integer totalLicenseIncludedInstanceCount;

    /**
     * Total number of license records that will expire within 90 days in a particular compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseRecordExpiringSoonCount")
    Integer licenseRecordExpiringSoonCount;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
