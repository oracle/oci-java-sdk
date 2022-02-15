/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * The details for calculating audit data volume collected by data safe.
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
    builder = CalculateAuditVolumeCollectedDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CalculateAuditVolumeCollectedDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeFromMonth")
        private java.util.Date timeFromMonth;

        public Builder timeFromMonth(java.util.Date timeFromMonth) {
            this.timeFromMonth = timeFromMonth;
            this.__explicitlySet__.add("timeFromMonth");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeToMonth")
        private java.util.Date timeToMonth;

        public Builder timeToMonth(java.util.Date timeToMonth) {
            this.timeToMonth = timeToMonth;
            this.__explicitlySet__.add("timeToMonth");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CalculateAuditVolumeCollectedDetails build() {
            CalculateAuditVolumeCollectedDetails __instance__ =
                    new CalculateAuditVolumeCollectedDetails(timeFromMonth, timeToMonth);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CalculateAuditVolumeCollectedDetails o) {
            Builder copiedBuilder =
                    timeFromMonth(o.getTimeFromMonth()).timeToMonth(o.getTimeToMonth());

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
     * The date from which the audit volume collected by data safe has to be calculated, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFromMonth")
    java.util.Date timeFromMonth;

    /**
     * The date from which the audit volume collected by data safe has to be calculated, in the format defined by RFC3339. If not specified, this will default to the current date.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeToMonth")
    java.util.Date timeToMonth;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
