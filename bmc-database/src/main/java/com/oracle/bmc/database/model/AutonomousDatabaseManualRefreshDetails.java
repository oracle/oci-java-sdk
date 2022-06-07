/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Details of manual refresh for an Autonomous Database refreshable clone.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AutonomousDatabaseManualRefreshDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AutonomousDatabaseManualRefreshDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"timeRefreshCutoff"})
    public AutonomousDatabaseManualRefreshDetails(java.util.Date timeRefreshCutoff) {
        super();
        this.timeRefreshCutoff = timeRefreshCutoff;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("timeRefreshCutoff")
        private java.util.Date timeRefreshCutoff;

        public Builder timeRefreshCutoff(java.util.Date timeRefreshCutoff) {
            this.timeRefreshCutoff = timeRefreshCutoff;
            this.__explicitlySet__.add("timeRefreshCutoff");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AutonomousDatabaseManualRefreshDetails build() {
            AutonomousDatabaseManualRefreshDetails __instance__ =
                    new AutonomousDatabaseManualRefreshDetails(timeRefreshCutoff);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AutonomousDatabaseManualRefreshDetails o) {
            Builder copiedBuilder = timeRefreshCutoff(o.getTimeRefreshCutoff());

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
     * The timestamp to which the Autonomous Database refreshable clone will be refreshed. Changes made in the primary database after this timestamp are not part of the data refresh.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRefreshCutoff")
    private final java.util.Date timeRefreshCutoff;

    public java.util.Date getTimeRefreshCutoff() {
        return timeRefreshCutoff;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AutonomousDatabaseManualRefreshDetails(");
        sb.append("timeRefreshCutoff=").append(String.valueOf(this.timeRefreshCutoff));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AutonomousDatabaseManualRefreshDetails)) {
            return false;
        }

        AutonomousDatabaseManualRefreshDetails other = (AutonomousDatabaseManualRefreshDetails) o;
        return java.util.Objects.equals(this.timeRefreshCutoff, other.timeRefreshCutoff)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeRefreshCutoff == null ? 43 : this.timeRefreshCutoff.hashCode());
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
