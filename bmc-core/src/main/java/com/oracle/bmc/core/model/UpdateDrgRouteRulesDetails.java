/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Details used to update route rules in a DRG route table.
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
    builder = UpdateDrgRouteRulesDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateDrgRouteRulesDetails {
    @Deprecated
    @java.beans.ConstructorProperties({"routeRules"})
    public UpdateDrgRouteRulesDetails(java.util.List<UpdateDrgRouteRuleDetails> routeRules) {
        super();
        this.routeRules = routeRules;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The DRG rute rules to update.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("routeRules")
        private java.util.List<UpdateDrgRouteRuleDetails> routeRules;

        /**
         * The DRG rute rules to update.
         * @param routeRules the value to set
         * @return this builder
         **/
        public Builder routeRules(java.util.List<UpdateDrgRouteRuleDetails> routeRules) {
            this.routeRules = routeRules;
            this.__explicitlySet__.add("routeRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDrgRouteRulesDetails build() {
            UpdateDrgRouteRulesDetails __instance__ = new UpdateDrgRouteRulesDetails(routeRules);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDrgRouteRulesDetails o) {
            Builder copiedBuilder = routeRules(o.getRouteRules());

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
     * The DRG rute rules to update.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("routeRules")
    private final java.util.List<UpdateDrgRouteRuleDetails> routeRules;

    /**
     * The DRG rute rules to update.
     * @return the value
     **/
    public java.util.List<UpdateDrgRouteRuleDetails> getRouteRules() {
        return routeRules;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateDrgRouteRulesDetails(");
        sb.append("routeRules=").append(String.valueOf(this.routeRules));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDrgRouteRulesDetails)) {
            return false;
        }

        UpdateDrgRouteRulesDetails other = (UpdateDrgRouteRulesDetails) o;
        return java.util.Objects.equals(this.routeRules, other.routeRules)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.routeRules == null ? 43 : this.routeRules.hashCode());
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
