/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fleetappsmanagement.model;

/**
 * Rule for DYNAMIC selection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230831")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Rule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Rule extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "basis",
        "compartmentId",
        "resourceCompartmentId",
        "conditions"
    })
    public Rule(
            String basis,
            String compartmentId,
            String resourceCompartmentId,
            java.util.List<Condition> conditions) {
        super();
        this.basis = basis;
        this.compartmentId = compartmentId;
        this.resourceCompartmentId = resourceCompartmentId;
        this.conditions = conditions;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Based on what the rule is created. It can be based on a resourceProperty or a tag. If
         * based on a tag, basis will be 'definedTagEquals' If based on a resource property, basis
         * will be 'inventoryProperties'
         */
        @com.fasterxml.jackson.annotation.JsonProperty("basis")
        private String basis;

        /**
         * Based on what the rule is created. It can be based on a resourceProperty or a tag. If
         * based on a tag, basis will be 'definedTagEquals' If based on a resource property, basis
         * will be 'inventoryProperties'
         *
         * @param basis the value to set
         * @return this builder
         */
        public Builder basis(String basis) {
            this.basis = basis;
            this.__explicitlySet__.add("basis");
            return this;
        }
        /** Tenancy Id (Root Compartment Id)for which the rule is created. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * Tenancy Id (Root Compartment Id)for which the rule is created.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The Compartment ID to dynamically search resources. Provide the compartment ID to which
         * the rule is applicable.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceCompartmentId")
        private String resourceCompartmentId;

        /**
         * The Compartment ID to dynamically search resources. Provide the compartment ID to which
         * the rule is applicable.
         *
         * @param resourceCompartmentId the value to set
         * @return this builder
         */
        public Builder resourceCompartmentId(String resourceCompartmentId) {
            this.resourceCompartmentId = resourceCompartmentId;
            this.__explicitlySet__.add("resourceCompartmentId");
            return this;
        }
        /** Rule Conditions */
        @com.fasterxml.jackson.annotation.JsonProperty("conditions")
        private java.util.List<Condition> conditions;

        /**
         * Rule Conditions
         *
         * @param conditions the value to set
         * @return this builder
         */
        public Builder conditions(java.util.List<Condition> conditions) {
            this.conditions = conditions;
            this.__explicitlySet__.add("conditions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Rule build() {
            Rule model =
                    new Rule(
                            this.basis,
                            this.compartmentId,
                            this.resourceCompartmentId,
                            this.conditions);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Rule model) {
            if (model.wasPropertyExplicitlySet("basis")) {
                this.basis(model.getBasis());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("resourceCompartmentId")) {
                this.resourceCompartmentId(model.getResourceCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("conditions")) {
                this.conditions(model.getConditions());
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

    /**
     * Based on what the rule is created. It can be based on a resourceProperty or a tag. If based
     * on a tag, basis will be 'definedTagEquals' If based on a resource property, basis will be
     * 'inventoryProperties'
     */
    @com.fasterxml.jackson.annotation.JsonProperty("basis")
    private final String basis;

    /**
     * Based on what the rule is created. It can be based on a resourceProperty or a tag. If based
     * on a tag, basis will be 'definedTagEquals' If based on a resource property, basis will be
     * 'inventoryProperties'
     *
     * @return the value
     */
    public String getBasis() {
        return basis;
    }

    /** Tenancy Id (Root Compartment Id)for which the rule is created. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * Tenancy Id (Root Compartment Id)for which the rule is created.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The Compartment ID to dynamically search resources. Provide the compartment ID to which the
     * rule is applicable.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceCompartmentId")
    private final String resourceCompartmentId;

    /**
     * The Compartment ID to dynamically search resources. Provide the compartment ID to which the
     * rule is applicable.
     *
     * @return the value
     */
    public String getResourceCompartmentId() {
        return resourceCompartmentId;
    }

    /** Rule Conditions */
    @com.fasterxml.jackson.annotation.JsonProperty("conditions")
    private final java.util.List<Condition> conditions;

    /**
     * Rule Conditions
     *
     * @return the value
     */
    public java.util.List<Condition> getConditions() {
        return conditions;
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
        sb.append("Rule(");
        sb.append("super=").append(super.toString());
        sb.append("basis=").append(String.valueOf(this.basis));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", resourceCompartmentId=").append(String.valueOf(this.resourceCompartmentId));
        sb.append(", conditions=").append(String.valueOf(this.conditions));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Rule)) {
            return false;
        }

        Rule other = (Rule) o;
        return java.util.Objects.equals(this.basis, other.basis)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.resourceCompartmentId, other.resourceCompartmentId)
                && java.util.Objects.equals(this.conditions, other.conditions)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.basis == null ? 43 : this.basis.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceCompartmentId == null
                                ? 43
                                : this.resourceCompartmentId.hashCode());
        result = (result * PRIME) + (this.conditions == null ? 43 : this.conditions.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
