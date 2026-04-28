/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.keymanagement.model;

/**
 * Details to create the dynamic group. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: release")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = HsmClusterPendingCreateDynamicGroup.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class HsmClusterPendingCreateDynamicGroup
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "matchingRule"})
    public HsmClusterPendingCreateDynamicGroup(String name, String matchingRule) {
        super();
        this.name = name;
        this.matchingRule = matchingRule;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the dynamic group. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of the dynamic group.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** Matching rule for dynamic group membership. */
        @com.fasterxml.jackson.annotation.JsonProperty("matchingRule")
        private String matchingRule;

        /**
         * Matching rule for dynamic group membership.
         *
         * @param matchingRule the value to set
         * @return this builder
         */
        public Builder matchingRule(String matchingRule) {
            this.matchingRule = matchingRule;
            this.__explicitlySet__.add("matchingRule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public HsmClusterPendingCreateDynamicGroup build() {
            HsmClusterPendingCreateDynamicGroup model =
                    new HsmClusterPendingCreateDynamicGroup(this.name, this.matchingRule);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(HsmClusterPendingCreateDynamicGroup model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("matchingRule")) {
                this.matchingRule(model.getMatchingRule());
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

    /** Name of the dynamic group. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of the dynamic group.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** Matching rule for dynamic group membership. */
    @com.fasterxml.jackson.annotation.JsonProperty("matchingRule")
    private final String matchingRule;

    /**
     * Matching rule for dynamic group membership.
     *
     * @return the value
     */
    public String getMatchingRule() {
        return matchingRule;
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
        sb.append("HsmClusterPendingCreateDynamicGroup(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", matchingRule=").append(String.valueOf(this.matchingRule));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof HsmClusterPendingCreateDynamicGroup)) {
            return false;
        }

        HsmClusterPendingCreateDynamicGroup other = (HsmClusterPendingCreateDynamicGroup) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.matchingRule, other.matchingRule)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.matchingRule == null ? 43 : this.matchingRule.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
