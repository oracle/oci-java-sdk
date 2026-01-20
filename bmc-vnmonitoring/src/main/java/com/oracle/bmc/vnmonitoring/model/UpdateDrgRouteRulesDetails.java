/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Details used to update route rules in a DRG route table. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateDrgRouteRulesDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateDrgRouteRulesDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"routeRules"})
    public UpdateDrgRouteRulesDetails(java.util.List<UpdateDrgRouteRuleDetails> routeRules) {
        super();
        this.routeRules = routeRules;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The DRG rute rules to update. */
        @com.fasterxml.jackson.annotation.JsonProperty("routeRules")
        private java.util.List<UpdateDrgRouteRuleDetails> routeRules;

        /**
         * The DRG rute rules to update.
         *
         * @param routeRules the value to set
         * @return this builder
         */
        public Builder routeRules(java.util.List<UpdateDrgRouteRuleDetails> routeRules) {
            this.routeRules = routeRules;
            this.__explicitlySet__.add("routeRules");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDrgRouteRulesDetails build() {
            UpdateDrgRouteRulesDetails model = new UpdateDrgRouteRulesDetails(this.routeRules);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDrgRouteRulesDetails model) {
            if (model.wasPropertyExplicitlySet("routeRules")) {
                this.routeRules(model.getRouteRules());
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

    /** The DRG rute rules to update. */
    @com.fasterxml.jackson.annotation.JsonProperty("routeRules")
    private final java.util.List<UpdateDrgRouteRuleDetails> routeRules;

    /**
     * The DRG rute rules to update.
     *
     * @return the value
     */
    public java.util.List<UpdateDrgRouteRuleDetails> getRouteRules() {
        return routeRules;
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
        sb.append("UpdateDrgRouteRulesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("routeRules=").append(String.valueOf(this.routeRules));
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
        return java.util.Objects.equals(this.routeRules, other.routeRules) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.routeRules == null ? 43 : this.routeRules.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
