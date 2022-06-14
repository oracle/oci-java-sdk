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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = LicenseMetric.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class LicenseMetric {
    @Deprecated
    @java.beans.ConstructorProperties({
        "totalProductLicenseCount",
        "totalByolInstanceCount",
        "totalLicenseIncludedInstanceCount",
        "licenseRecordExpiringSoonCount"
    })
    public LicenseMetric(
            Integer totalProductLicenseCount,
            Integer totalByolInstanceCount,
            Integer totalLicenseIncludedInstanceCount,
            Integer licenseRecordExpiringSoonCount) {
        super();
        this.totalProductLicenseCount = totalProductLicenseCount;
        this.totalByolInstanceCount = totalByolInstanceCount;
        this.totalLicenseIncludedInstanceCount = totalLicenseIncludedInstanceCount;
        this.licenseRecordExpiringSoonCount = licenseRecordExpiringSoonCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Total number of product licenses in a particular compartment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalProductLicenseCount")
        private Integer totalProductLicenseCount;

        /**
         * Total number of product licenses in a particular compartment.
         *
         * @param totalProductLicenseCount the value to set
         * @return this builder
         **/
        public Builder totalProductLicenseCount(Integer totalProductLicenseCount) {
            this.totalProductLicenseCount = totalProductLicenseCount;
            this.__explicitlySet__.add("totalProductLicenseCount");
            return this;
        }
        /**
         * Total number of BYOL instances in a particular compartment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalByolInstanceCount")
        private Integer totalByolInstanceCount;

        /**
         * Total number of BYOL instances in a particular compartment.
         *
         * @param totalByolInstanceCount the value to set
         * @return this builder
         **/
        public Builder totalByolInstanceCount(Integer totalByolInstanceCount) {
            this.totalByolInstanceCount = totalByolInstanceCount;
            this.__explicitlySet__.add("totalByolInstanceCount");
            return this;
        }
        /**
         * Total number of License Included (LI) instances in a particular compartment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("totalLicenseIncludedInstanceCount")
        private Integer totalLicenseIncludedInstanceCount;

        /**
         * Total number of License Included (LI) instances in a particular compartment.
         *
         * @param totalLicenseIncludedInstanceCount the value to set
         * @return this builder
         **/
        public Builder totalLicenseIncludedInstanceCount(
                Integer totalLicenseIncludedInstanceCount) {
            this.totalLicenseIncludedInstanceCount = totalLicenseIncludedInstanceCount;
            this.__explicitlySet__.add("totalLicenseIncludedInstanceCount");
            return this;
        }
        /**
         * Total number of license records that will expire within 90 days in a particular compartment.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("licenseRecordExpiringSoonCount")
        private Integer licenseRecordExpiringSoonCount;

        /**
         * Total number of license records that will expire within 90 days in a particular compartment.
         *
         * @param licenseRecordExpiringSoonCount the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * Total number of product licenses in a particular compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalProductLicenseCount")
    private final Integer totalProductLicenseCount;

    /**
     * Total number of product licenses in a particular compartment.
     *
     * @return the value
     **/
    public Integer getTotalProductLicenseCount() {
        return totalProductLicenseCount;
    }

    /**
     * Total number of BYOL instances in a particular compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalByolInstanceCount")
    private final Integer totalByolInstanceCount;

    /**
     * Total number of BYOL instances in a particular compartment.
     *
     * @return the value
     **/
    public Integer getTotalByolInstanceCount() {
        return totalByolInstanceCount;
    }

    /**
     * Total number of License Included (LI) instances in a particular compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalLicenseIncludedInstanceCount")
    private final Integer totalLicenseIncludedInstanceCount;

    /**
     * Total number of License Included (LI) instances in a particular compartment.
     *
     * @return the value
     **/
    public Integer getTotalLicenseIncludedInstanceCount() {
        return totalLicenseIncludedInstanceCount;
    }

    /**
     * Total number of license records that will expire within 90 days in a particular compartment.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("licenseRecordExpiringSoonCount")
    private final Integer licenseRecordExpiringSoonCount;

    /**
     * Total number of license records that will expire within 90 days in a particular compartment.
     *
     * @return the value
     **/
    public Integer getLicenseRecordExpiringSoonCount() {
        return licenseRecordExpiringSoonCount;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("LicenseMetric(");
        sb.append("totalProductLicenseCount=")
                .append(String.valueOf(this.totalProductLicenseCount));
        sb.append(", totalByolInstanceCount=").append(String.valueOf(this.totalByolInstanceCount));
        sb.append(", totalLicenseIncludedInstanceCount=")
                .append(String.valueOf(this.totalLicenseIncludedInstanceCount));
        sb.append(", licenseRecordExpiringSoonCount=")
                .append(String.valueOf(this.licenseRecordExpiringSoonCount));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LicenseMetric)) {
            return false;
        }

        LicenseMetric other = (LicenseMetric) o;
        return java.util.Objects.equals(
                        this.totalProductLicenseCount, other.totalProductLicenseCount)
                && java.util.Objects.equals(
                        this.totalByolInstanceCount, other.totalByolInstanceCount)
                && java.util.Objects.equals(
                        this.totalLicenseIncludedInstanceCount,
                        other.totalLicenseIncludedInstanceCount)
                && java.util.Objects.equals(
                        this.licenseRecordExpiringSoonCount, other.licenseRecordExpiringSoonCount)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.totalProductLicenseCount == null
                                ? 43
                                : this.totalProductLicenseCount.hashCode());
        result =
                (result * PRIME)
                        + (this.totalByolInstanceCount == null
                                ? 43
                                : this.totalByolInstanceCount.hashCode());
        result =
                (result * PRIME)
                        + (this.totalLicenseIncludedInstanceCount == null
                                ? 43
                                : this.totalLicenseIncludedInstanceCount.hashCode());
        result =
                (result * PRIME)
                        + (this.licenseRecordExpiringSoonCount == null
                                ? 43
                                : this.licenseRecordExpiringSoonCount.hashCode());
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
