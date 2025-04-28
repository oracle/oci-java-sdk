/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Details used in a request to remove static routes from a DRG route table. <br>
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
        builder = RemoveDrgRouteRulesDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RemoveDrgRouteRulesDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"routeRuleIds"})
    public RemoveDrgRouteRulesDetails(java.util.List<String> routeRuleIds) {
        super();
        this.routeRuleIds = routeRuleIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Oracle-assigned ID of each DRG route rule to be deleted. */
        @com.fasterxml.jackson.annotation.JsonProperty("routeRuleIds")
        private java.util.List<String> routeRuleIds;

        /**
         * The Oracle-assigned ID of each DRG route rule to be deleted.
         *
         * @param routeRuleIds the value to set
         * @return this builder
         */
        public Builder routeRuleIds(java.util.List<String> routeRuleIds) {
            this.routeRuleIds = routeRuleIds;
            this.__explicitlySet__.add("routeRuleIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RemoveDrgRouteRulesDetails build() {
            RemoveDrgRouteRulesDetails model = new RemoveDrgRouteRulesDetails(this.routeRuleIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RemoveDrgRouteRulesDetails model) {
            if (model.wasPropertyExplicitlySet("routeRuleIds")) {
                this.routeRuleIds(model.getRouteRuleIds());
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

    /** The Oracle-assigned ID of each DRG route rule to be deleted. */
    @com.fasterxml.jackson.annotation.JsonProperty("routeRuleIds")
    private final java.util.List<String> routeRuleIds;

    /**
     * The Oracle-assigned ID of each DRG route rule to be deleted.
     *
     * @return the value
     */
    public java.util.List<String> getRouteRuleIds() {
        return routeRuleIds;
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
        sb.append("RemoveDrgRouteRulesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("routeRuleIds=").append(String.valueOf(this.routeRuleIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoveDrgRouteRulesDetails)) {
            return false;
        }

        RemoveDrgRouteRulesDetails other = (RemoveDrgRouteRulesDetails) o;
        return java.util.Objects.equals(this.routeRuleIds, other.routeRuleIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.routeRuleIds == null ? 43 : this.routeRuleIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
