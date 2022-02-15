/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Represents the audit data volume collected by Data Safe from the target database for the specified audit profile.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AvailableAuditVolumeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class AvailableAuditVolumeSummary {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("auditProfileId")
        private String auditProfileId;

        public Builder auditProfileId(String auditProfileId) {
            this.auditProfileId = auditProfileId;
            this.__explicitlySet__.add("auditProfileId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("trailLocation")
        private String trailLocation;

        public Builder trailLocation(String trailLocation) {
            this.trailLocation = trailLocation;
            this.__explicitlySet__.add("trailLocation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("monthInConsideration")
        private java.util.Date monthInConsideration;

        public Builder monthInConsideration(java.util.Date monthInConsideration) {
            this.monthInConsideration = monthInConsideration;
            this.__explicitlySet__.add("monthInConsideration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("volume")
        private Long volume;

        public Builder volume(Long volume) {
            this.volume = volume;
            this.__explicitlySet__.add("volume");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AvailableAuditVolumeSummary build() {
            AvailableAuditVolumeSummary __instance__ =
                    new AvailableAuditVolumeSummary(
                            auditProfileId, trailLocation, monthInConsideration, volume);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AvailableAuditVolumeSummary o) {
            Builder copiedBuilder =
                    auditProfileId(o.getAuditProfileId())
                            .trailLocation(o.getTrailLocation())
                            .monthInConsideration(o.getMonthInConsideration())
                            .volume(o.getVolume());

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
     * The OCID of the audit profile resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditProfileId")
    String auditProfileId;

    /**
     * Audit trail location on the target database from where the audit data is being collected by Data Safe.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("trailLocation")
    String trailLocation;

    /**
     * Represents the month under consideration for which aggregated audit data volume available at the target is computed.
     * This field will be the UTC start of the day of the first day of the month for which the aggregate count corresponds to, in the format defined by RFC3339..
     * For instance, the value of 01-01-2021T00:00:00Z represents Jan 2021.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("monthInConsideration")
    java.util.Date monthInConsideration;

    /**
     * Represents the aggregated audit data volume available in the audit trails on the target database which is yet to be collected by Data Safe for the specified month.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("volume")
    Long volume;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
