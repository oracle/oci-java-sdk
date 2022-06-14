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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CalculateAuditVolumeCollectedDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CalculateAuditVolumeCollectedDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"timeFromMonth", "timeToMonth"})
    public CalculateAuditVolumeCollectedDetails(
            java.util.Date timeFromMonth, java.util.Date timeToMonth) {
        super();
        this.timeFromMonth = timeFromMonth;
        this.timeToMonth = timeToMonth;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The date from which the audit volume collected by data safe has to be calculated, in the format defined by RFC3339.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeFromMonth")
        private java.util.Date timeFromMonth;

        /**
         * The date from which the audit volume collected by data safe has to be calculated, in the format defined by RFC3339.
         * @param timeFromMonth the value to set
         * @return this builder
         **/
        public Builder timeFromMonth(java.util.Date timeFromMonth) {
            this.timeFromMonth = timeFromMonth;
            this.__explicitlySet__.add("timeFromMonth");
            return this;
        }
        /**
         * The date from which the audit volume collected by data safe has to be calculated, in the format defined by RFC3339. If not specified, this will default to the current date.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeToMonth")
        private java.util.Date timeToMonth;

        /**
         * The date from which the audit volume collected by data safe has to be calculated, in the format defined by RFC3339. If not specified, this will default to the current date.
         * @param timeToMonth the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The date from which the audit volume collected by data safe has to be calculated, in the format defined by RFC3339.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFromMonth")
    private final java.util.Date timeFromMonth;

    /**
     * The date from which the audit volume collected by data safe has to be calculated, in the format defined by RFC3339.
     * @return the value
     **/
    public java.util.Date getTimeFromMonth() {
        return timeFromMonth;
    }

    /**
     * The date from which the audit volume collected by data safe has to be calculated, in the format defined by RFC3339. If not specified, this will default to the current date.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeToMonth")
    private final java.util.Date timeToMonth;

    /**
     * The date from which the audit volume collected by data safe has to be calculated, in the format defined by RFC3339. If not specified, this will default to the current date.
     * @return the value
     **/
    public java.util.Date getTimeToMonth() {
        return timeToMonth;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CalculateAuditVolumeCollectedDetails(");
        sb.append("timeFromMonth=").append(String.valueOf(this.timeFromMonth));
        sb.append(", timeToMonth=").append(String.valueOf(this.timeToMonth));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CalculateAuditVolumeCollectedDetails)) {
            return false;
        }

        CalculateAuditVolumeCollectedDetails other = (CalculateAuditVolumeCollectedDetails) o;
        return java.util.Objects.equals(this.timeFromMonth, other.timeFromMonth)
                && java.util.Objects.equals(this.timeToMonth, other.timeToMonth)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeFromMonth == null ? 43 : this.timeFromMonth.hashCode());
        result = (result * PRIME) + (this.timeToMonth == null ? 43 : this.timeToMonth.hashCode());
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
