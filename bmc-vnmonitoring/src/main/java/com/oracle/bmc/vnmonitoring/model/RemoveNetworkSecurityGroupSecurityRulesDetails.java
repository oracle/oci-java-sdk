/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * <br>
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
        builder = RemoveNetworkSecurityGroupSecurityRulesDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RemoveNetworkSecurityGroupSecurityRulesDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"securityRuleIds"})
    public RemoveNetworkSecurityGroupSecurityRulesDetails(java.util.List<String> securityRuleIds) {
        super();
        this.securityRuleIds = securityRuleIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Oracle-assigned ID of each {@link SecurityRule} to be deleted. */
        @com.fasterxml.jackson.annotation.JsonProperty("securityRuleIds")
        private java.util.List<String> securityRuleIds;

        /**
         * The Oracle-assigned ID of each {@link SecurityRule} to be deleted.
         *
         * @param securityRuleIds the value to set
         * @return this builder
         */
        public Builder securityRuleIds(java.util.List<String> securityRuleIds) {
            this.securityRuleIds = securityRuleIds;
            this.__explicitlySet__.add("securityRuleIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RemoveNetworkSecurityGroupSecurityRulesDetails build() {
            RemoveNetworkSecurityGroupSecurityRulesDetails model =
                    new RemoveNetworkSecurityGroupSecurityRulesDetails(this.securityRuleIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RemoveNetworkSecurityGroupSecurityRulesDetails model) {
            if (model.wasPropertyExplicitlySet("securityRuleIds")) {
                this.securityRuleIds(model.getSecurityRuleIds());
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

    /** The Oracle-assigned ID of each {@link SecurityRule} to be deleted. */
    @com.fasterxml.jackson.annotation.JsonProperty("securityRuleIds")
    private final java.util.List<String> securityRuleIds;

    /**
     * The Oracle-assigned ID of each {@link SecurityRule} to be deleted.
     *
     * @return the value
     */
    public java.util.List<String> getSecurityRuleIds() {
        return securityRuleIds;
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
        sb.append("RemoveNetworkSecurityGroupSecurityRulesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("securityRuleIds=").append(String.valueOf(this.securityRuleIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoveNetworkSecurityGroupSecurityRulesDetails)) {
            return false;
        }

        RemoveNetworkSecurityGroupSecurityRulesDetails other =
                (RemoveNetworkSecurityGroupSecurityRulesDetails) o;
        return java.util.Objects.equals(this.securityRuleIds, other.securityRuleIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.securityRuleIds == null ? 43 : this.securityRuleIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
