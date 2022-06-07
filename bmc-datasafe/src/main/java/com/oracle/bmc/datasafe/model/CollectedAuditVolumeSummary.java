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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CollectedAuditVolumeSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CollectedAuditVolumeSummary {
    @Deprecated
    @java.beans.ConstructorProperties({
        "auditProfileId",
        "monthInConsideration",
        "onlineVolume",
        "archivedVolume"
    })
    public CollectedAuditVolumeSummary(
            String auditProfileId,
            java.util.Date monthInConsideration,
            Long onlineVolume,
            Long archivedVolume) {
        super();
        this.auditProfileId = auditProfileId;
        this.monthInConsideration = monthInConsideration;
        this.onlineVolume = onlineVolume;
        this.archivedVolume = archivedVolume;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The OCID of the audit profile resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("auditProfileId")
    private final String auditProfileId;

    public String getAuditProfileId() {
        return auditProfileId;
    }

    /**
     * Represents the month under consideration in which the aggregated audit data volume collected by Data Safe is displayed.
     * This field will be the UTC start of the day of the first day of the month for which the aggregate count corresponds to, in the format defined by RFC3339..
     * For instance, the value of 01-01-2021T00:00:00Z represents Jan 2021.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("monthInConsideration")
    private final java.util.Date monthInConsideration;

    public java.util.Date getMonthInConsideration() {
        return monthInConsideration;
    }

    /**
     * The audit data volume collected by Data Safe and is available online in repository.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("onlineVolume")
    private final Long onlineVolume;

    public Long getOnlineVolume() {
        return onlineVolume;
    }

    /**
     * The audit data volume collected by Data Safe and is available in archive storage.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("archivedVolume")
    private final Long archivedVolume;

    public Long getArchivedVolume() {
        return archivedVolume;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CollectedAuditVolumeSummary(");
        sb.append("auditProfileId=").append(String.valueOf(this.auditProfileId));
        sb.append(", monthInConsideration=").append(String.valueOf(this.monthInConsideration));
        sb.append(", onlineVolume=").append(String.valueOf(this.onlineVolume));
        sb.append(", archivedVolume=").append(String.valueOf(this.archivedVolume));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CollectedAuditVolumeSummary)) {
            return false;
        }

        CollectedAuditVolumeSummary other = (CollectedAuditVolumeSummary) o;
        return java.util.Objects.equals(this.auditProfileId, other.auditProfileId)
                && java.util.Objects.equals(this.monthInConsideration, other.monthInConsideration)
                && java.util.Objects.equals(this.onlineVolume, other.onlineVolume)
                && java.util.Objects.equals(this.archivedVolume, other.archivedVolume)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.auditProfileId == null ? 43 : this.auditProfileId.hashCode());
        result =
                (result * PRIME)
                        + (this.monthInConsideration == null
                                ? 43
                                : this.monthInConsideration.hashCode());
        result = (result * PRIME) + (this.onlineVolume == null ? 43 : this.onlineVolume.hashCode());
        result =
                (result * PRIME)
                        + (this.archivedVolume == null ? 43 : this.archivedVolume.hashCode());
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
