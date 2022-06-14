/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Summary of the Quick Pick query objects.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = QuickPickSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class QuickPickSummary {
    @Deprecated
    @java.beans.ConstructorProperties({"quickPickName", "quickPickQuery"})
    public QuickPickSummary(String quickPickName, String quickPickQuery) {
        super();
        this.quickPickName = quickPickName;
        this.quickPickQuery = quickPickQuery;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Quick Pick name for the query.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("quickPickName")
        private String quickPickName;

        /**
         * Quick Pick name for the query.
         *
         * @param quickPickName the value to set
         * @return this builder
         **/
        public Builder quickPickName(String quickPickName) {
            this.quickPickName = quickPickName;
            this.__explicitlySet__.add("quickPickName");
            return this;
        }
        /**
         * Query for the Quick Pick.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("quickPickQuery")
        private String quickPickQuery;

        /**
         * Query for the Quick Pick.
         *
         * @param quickPickQuery the value to set
         * @return this builder
         **/
        public Builder quickPickQuery(String quickPickQuery) {
            this.quickPickQuery = quickPickQuery;
            this.__explicitlySet__.add("quickPickQuery");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public QuickPickSummary build() {
            QuickPickSummary __instance__ = new QuickPickSummary(quickPickName, quickPickQuery);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(QuickPickSummary o) {
            Builder copiedBuilder =
                    quickPickName(o.getQuickPickName()).quickPickQuery(o.getQuickPickQuery());

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
     * Quick Pick name for the query.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quickPickName")
    private final String quickPickName;

    /**
     * Quick Pick name for the query.
     *
     * @return the value
     **/
    public String getQuickPickName() {
        return quickPickName;
    }

    /**
     * Query for the Quick Pick.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("quickPickQuery")
    private final String quickPickQuery;

    /**
     * Query for the Quick Pick.
     *
     * @return the value
     **/
    public String getQuickPickQuery() {
        return quickPickQuery;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("QuickPickSummary(");
        sb.append("quickPickName=").append(String.valueOf(this.quickPickName));
        sb.append(", quickPickQuery=").append(String.valueOf(this.quickPickQuery));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof QuickPickSummary)) {
            return false;
        }

        QuickPickSummary other = (QuickPickSummary) o;
        return java.util.Objects.equals(this.quickPickName, other.quickPickName)
                && java.util.Objects.equals(this.quickPickQuery, other.quickPickQuery)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.quickPickName == null ? 43 : this.quickPickName.hashCode());
        result =
                (result * PRIME)
                        + (this.quickPickQuery == null ? 43 : this.quickPickQuery.hashCode());
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
