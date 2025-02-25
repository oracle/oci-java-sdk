/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Route distribution statements to update in the route distribution.
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
    builder = UpdateDrgRouteDistributionStatementDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateDrgRouteDistributionStatementDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "matchCriteria", "priority"})
    public UpdateDrgRouteDistributionStatementDetails(
            String id,
            java.util.List<DrgRouteDistributionMatchCriteria> matchCriteria,
            Integer priority) {
        super();
        this.id = id;
        this.matchCriteria = matchCriteria;
        this.priority = priority;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Oracle-assigned ID of each route distribution statement to be updated.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The Oracle-assigned ID of each route distribution statement to be updated.
         *
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The action is applied only if all of the match criteria is met.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("matchCriteria")
        private java.util.List<DrgRouteDistributionMatchCriteria> matchCriteria;

        /**
         * The action is applied only if all of the match criteria is met.
         *
         * @param matchCriteria the value to set
         * @return this builder
         **/
        public Builder matchCriteria(
                java.util.List<DrgRouteDistributionMatchCriteria> matchCriteria) {
            this.matchCriteria = matchCriteria;
            this.__explicitlySet__.add("matchCriteria");
            return this;
        }
        /**
         * The priority of the statement you'd like to update.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("priority")
        private Integer priority;

        /**
         * The priority of the statement you'd like to update.
         *
         * @param priority the value to set
         * @return this builder
         **/
        public Builder priority(Integer priority) {
            this.priority = priority;
            this.__explicitlySet__.add("priority");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDrgRouteDistributionStatementDetails build() {
            UpdateDrgRouteDistributionStatementDetails model =
                    new UpdateDrgRouteDistributionStatementDetails(
                            this.id, this.matchCriteria, this.priority);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDrgRouteDistributionStatementDetails model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("matchCriteria")) {
                this.matchCriteria(model.getMatchCriteria());
            }
            if (model.wasPropertyExplicitlySet("priority")) {
                this.priority(model.getPriority());
            }
            return this;
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
     * The Oracle-assigned ID of each route distribution statement to be updated.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The Oracle-assigned ID of each route distribution statement to be updated.
     *
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The action is applied only if all of the match criteria is met.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("matchCriteria")
    private final java.util.List<DrgRouteDistributionMatchCriteria> matchCriteria;

    /**
     * The action is applied only if all of the match criteria is met.
     *
     * @return the value
     **/
    public java.util.List<DrgRouteDistributionMatchCriteria> getMatchCriteria() {
        return matchCriteria;
    }

    /**
     * The priority of the statement you'd like to update.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    private final Integer priority;

    /**
     * The priority of the statement you'd like to update.
     *
     * @return the value
     **/
    public Integer getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("UpdateDrgRouteDistributionStatementDetails(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", matchCriteria=").append(String.valueOf(this.matchCriteria));
        sb.append(", priority=").append(String.valueOf(this.priority));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDrgRouteDistributionStatementDetails)) {
            return false;
        }

        UpdateDrgRouteDistributionStatementDetails other =
                (UpdateDrgRouteDistributionStatementDetails) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.matchCriteria, other.matchCriteria)
                && java.util.Objects.equals(this.priority, other.priority)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.matchCriteria == null ? 43 : this.matchCriteria.hashCode());
        result = (result * PRIME) + (this.priority == null ? 43 : this.priority.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
