/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details for calculating audit data volume on target.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CalculateAuditVolumeAvailableDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CalculateAuditVolumeAvailableDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"auditCollectionStartTime", "trailLocations"})
    public CalculateAuditVolumeAvailableDetails(
            java.util.Date auditCollectionStartTime, java.util.List<String> trailLocations) {
        super();
        this.auditCollectionStartTime = auditCollectionStartTime;
        this.trailLocations = trailLocations;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The date from which the audit trail must start collecting data in UTC, in the format defined by RFC3339. If not specified, this will default to the date based on the retention period.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("auditCollectionStartTime")
        private java.util.Date auditCollectionStartTime;

        /**
         * The date from which the audit trail must start collecting data in UTC, in the format defined by RFC3339. If not specified, this will default to the date based on the retention period.
         * @param auditCollectionStartTime the value to set
         * @return this builder
         **/
        public Builder auditCollectionStartTime(java.util.Date auditCollectionStartTime) {
            this.auditCollectionStartTime = auditCollectionStartTime;
            this.__explicitlySet__.add("auditCollectionStartTime");
            return this;
        }
        /**
         * The trail locations for which the audit data volume has to be calculated.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("trailLocations")
        private java.util.List<String> trailLocations;

        /**
         * The trail locations for which the audit data volume has to be calculated.
         * @param trailLocations the value to set
         * @return this builder
         **/
        public Builder trailLocations(java.util.List<String> trailLocations) {
            this.trailLocations = trailLocations;
            this.__explicitlySet__.add("trailLocations");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CalculateAuditVolumeAvailableDetails build() {
            CalculateAuditVolumeAvailableDetails __instance__ =
                    new CalculateAuditVolumeAvailableDetails(
                            auditCollectionStartTime, trailLocations);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CalculateAuditVolumeAvailableDetails o) {
            Builder copiedBuilder =
                    auditCollectionStartTime(o.getAuditCollectionStartTime())
                            .trailLocations(o.getTrailLocations());

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
     * The date from which the audit trail must start collecting data in UTC, in the format defined by RFC3339. If not specified, this will default to the date based on the retention period.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditCollectionStartTime")
    private final java.util.Date auditCollectionStartTime;

    /**
     * The date from which the audit trail must start collecting data in UTC, in the format defined by RFC3339. If not specified, this will default to the date based on the retention period.
     * @return the value
     **/
    public java.util.Date getAuditCollectionStartTime() {
        return auditCollectionStartTime;
    }

    /**
     * The trail locations for which the audit data volume has to be calculated.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trailLocations")
    private final java.util.List<String> trailLocations;

    /**
     * The trail locations for which the audit data volume has to be calculated.
     * @return the value
     **/
    public java.util.List<String> getTrailLocations() {
        return trailLocations;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CalculateAuditVolumeAvailableDetails(");
        sb.append("auditCollectionStartTime=")
                .append(String.valueOf(this.auditCollectionStartTime));
        sb.append(", trailLocations=").append(String.valueOf(this.trailLocations));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CalculateAuditVolumeAvailableDetails)) {
            return false;
        }

        CalculateAuditVolumeAvailableDetails other = (CalculateAuditVolumeAvailableDetails) o;
        return java.util.Objects.equals(
                        this.auditCollectionStartTime, other.auditCollectionStartTime)
                && java.util.Objects.equals(this.trailLocations, other.trailLocations)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.auditCollectionStartTime == null
                                ? 43
                                : this.auditCollectionStartTime.hashCode());
        result =
                (result * PRIME)
                        + (this.trailLocations == null ? 43 : this.trailLocations.hashCode());
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
