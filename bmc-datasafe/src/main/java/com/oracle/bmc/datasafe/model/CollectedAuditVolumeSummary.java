/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The volume data point for audit data collected by datasafe.
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
    builder = CollectedAuditVolumeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CollectedAuditVolumeSummary {
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

        @com.fasterxml.jackson.annotation.JsonProperty("monthInConsideration")
        private java.util.Date monthInConsideration;

        public Builder monthInConsideration(java.util.Date monthInConsideration) {
            this.monthInConsideration = monthInConsideration;
            this.__explicitlySet__.add("monthInConsideration");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("onlineVolume")
        private Long onlineVolume;

        public Builder onlineVolume(Long onlineVolume) {
            this.onlineVolume = onlineVolume;
            this.__explicitlySet__.add("onlineVolume");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("archivedVolume")
        private Long archivedVolume;

        public Builder archivedVolume(Long archivedVolume) {
            this.archivedVolume = archivedVolume;
            this.__explicitlySet__.add("archivedVolume");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CollectedAuditVolumeSummary build() {
            CollectedAuditVolumeSummary __instance__ =
                    new CollectedAuditVolumeSummary(
                            auditProfileId, monthInConsideration, onlineVolume, archivedVolume);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CollectedAuditVolumeSummary o) {
            Builder copiedBuilder =
                    auditProfileId(o.getAuditProfileId())
                            .monthInConsideration(o.getMonthInConsideration())
                            .onlineVolume(o.getOnlineVolume())
                            .archivedVolume(o.getArchivedVolume());

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
     * Represents the month under consideration in which the aggregated audit data volume collected by Data Safe is displayed.
     * This field will be the UTC start of the day of the first day of the month for which the aggregate count corresponds to, in the format defined by RFC3339..
     * For instance, the value of 01-01-2021T00:00:00Z represents Jan 2021.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("monthInConsideration")
    java.util.Date monthInConsideration;

    /**
     * The audit data volume collected by Data Safe and is available online in repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("onlineVolume")
    Long onlineVolume;

    /**
     * The audit data volume collected by Data Safe and is available in archive storage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("archivedVolume")
    Long archivedVolume;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
