/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * The list of managed instances to scan. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ScanLibraryUsageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ScanLibraryUsageDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "managedInstanceIds",
        "isDynamicScan",
        "dynamicScanDurationInMinutes"
    })
    public ScanLibraryUsageDetails(
            java.util.List<String> managedInstanceIds,
            Boolean isDynamicScan,
            Integer dynamicScanDurationInMinutes) {
        super();
        this.managedInstanceIds = managedInstanceIds;
        this.isDynamicScan = isDynamicScan;
        this.dynamicScanDurationInMinutes = dynamicScanDurationInMinutes;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The list of
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of managed
         * instances to scan.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceIds")
        private java.util.List<String> managedInstanceIds;

        /**
         * The list of
         * [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of managed
         * instances to scan.
         *
         * @param managedInstanceIds the value to set
         * @return this builder
         */
        public Builder managedInstanceIds(java.util.List<String> managedInstanceIds) {
            this.managedInstanceIds = managedInstanceIds;
            this.__explicitlySet__.add("managedInstanceIds");
            return this;
        }
        /** Indicates whether the scan is dynamic or static. */
        @com.fasterxml.jackson.annotation.JsonProperty("isDynamicScan")
        private Boolean isDynamicScan;

        /**
         * Indicates whether the scan is dynamic or static.
         *
         * @param isDynamicScan the value to set
         * @return this builder
         */
        public Builder isDynamicScan(Boolean isDynamicScan) {
            this.isDynamicScan = isDynamicScan;
            this.__explicitlySet__.add("isDynamicScan");
            return this;
        }
        /** The duration of the dynamic scan in minutes. */
        @com.fasterxml.jackson.annotation.JsonProperty("dynamicScanDurationInMinutes")
        private Integer dynamicScanDurationInMinutes;

        /**
         * The duration of the dynamic scan in minutes.
         *
         * @param dynamicScanDurationInMinutes the value to set
         * @return this builder
         */
        public Builder dynamicScanDurationInMinutes(Integer dynamicScanDurationInMinutes) {
            this.dynamicScanDurationInMinutes = dynamicScanDurationInMinutes;
            this.__explicitlySet__.add("dynamicScanDurationInMinutes");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ScanLibraryUsageDetails build() {
            ScanLibraryUsageDetails model =
                    new ScanLibraryUsageDetails(
                            this.managedInstanceIds,
                            this.isDynamicScan,
                            this.dynamicScanDurationInMinutes);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ScanLibraryUsageDetails model) {
            if (model.wasPropertyExplicitlySet("managedInstanceIds")) {
                this.managedInstanceIds(model.getManagedInstanceIds());
            }
            if (model.wasPropertyExplicitlySet("isDynamicScan")) {
                this.isDynamicScan(model.getIsDynamicScan());
            }
            if (model.wasPropertyExplicitlySet("dynamicScanDurationInMinutes")) {
                this.dynamicScanDurationInMinutes(model.getDynamicScanDurationInMinutes());
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
     * The list of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * managed instances to scan.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceIds")
    private final java.util.List<String> managedInstanceIds;

    /**
     * The list of [OCIDs](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * managed instances to scan.
     *
     * @return the value
     */
    public java.util.List<String> getManagedInstanceIds() {
        return managedInstanceIds;
    }

    /** Indicates whether the scan is dynamic or static. */
    @com.fasterxml.jackson.annotation.JsonProperty("isDynamicScan")
    private final Boolean isDynamicScan;

    /**
     * Indicates whether the scan is dynamic or static.
     *
     * @return the value
     */
    public Boolean getIsDynamicScan() {
        return isDynamicScan;
    }

    /** The duration of the dynamic scan in minutes. */
    @com.fasterxml.jackson.annotation.JsonProperty("dynamicScanDurationInMinutes")
    private final Integer dynamicScanDurationInMinutes;

    /**
     * The duration of the dynamic scan in minutes.
     *
     * @return the value
     */
    public Integer getDynamicScanDurationInMinutes() {
        return dynamicScanDurationInMinutes;
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
        sb.append("ScanLibraryUsageDetails(");
        sb.append("super=").append(super.toString());
        sb.append("managedInstanceIds=").append(String.valueOf(this.managedInstanceIds));
        sb.append(", isDynamicScan=").append(String.valueOf(this.isDynamicScan));
        sb.append(", dynamicScanDurationInMinutes=")
                .append(String.valueOf(this.dynamicScanDurationInMinutes));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ScanLibraryUsageDetails)) {
            return false;
        }

        ScanLibraryUsageDetails other = (ScanLibraryUsageDetails) o;
        return java.util.Objects.equals(this.managedInstanceIds, other.managedInstanceIds)
                && java.util.Objects.equals(this.isDynamicScan, other.isDynamicScan)
                && java.util.Objects.equals(
                        this.dynamicScanDurationInMinutes, other.dynamicScanDurationInMinutes)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.managedInstanceIds == null
                                ? 43
                                : this.managedInstanceIds.hashCode());
        result =
                (result * PRIME)
                        + (this.isDynamicScan == null ? 43 : this.isDynamicScan.hashCode());
        result =
                (result * PRIME)
                        + (this.dynamicScanDurationInMinutes == null
                                ? 43
                                : this.dynamicScanDurationInMinutes.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
