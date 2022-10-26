/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Details request to remove statements from a route distribution. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RemoveDrgRouteDistributionStatementsDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class RemoveDrgRouteDistributionStatementsDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"statementIds"})
    public RemoveDrgRouteDistributionStatementsDetails(java.util.List<String> statementIds) {
        super();
        this.statementIds = statementIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Oracle-assigned ID of each route distribution to remove. */
        @com.fasterxml.jackson.annotation.JsonProperty("statementIds")
        private java.util.List<String> statementIds;

        /**
         * The Oracle-assigned ID of each route distribution to remove.
         *
         * @param statementIds the value to set
         * @return this builder
         */
        public Builder statementIds(java.util.List<String> statementIds) {
            this.statementIds = statementIds;
            this.__explicitlySet__.add("statementIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RemoveDrgRouteDistributionStatementsDetails build() {
            RemoveDrgRouteDistributionStatementsDetails model =
                    new RemoveDrgRouteDistributionStatementsDetails(this.statementIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RemoveDrgRouteDistributionStatementsDetails model) {
            if (model.wasPropertyExplicitlySet("statementIds")) {
                this.statementIds(model.getStatementIds());
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

    /** The Oracle-assigned ID of each route distribution to remove. */
    @com.fasterxml.jackson.annotation.JsonProperty("statementIds")
    private final java.util.List<String> statementIds;

    /**
     * The Oracle-assigned ID of each route distribution to remove.
     *
     * @return the value
     */
    public java.util.List<String> getStatementIds() {
        return statementIds;
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
        sb.append("RemoveDrgRouteDistributionStatementsDetails(");
        sb.append("super=").append(super.toString());
        sb.append("statementIds=").append(String.valueOf(this.statementIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RemoveDrgRouteDistributionStatementsDetails)) {
            return false;
        }

        RemoveDrgRouteDistributionStatementsDetails other =
                (RemoveDrgRouteDistributionStatementsDetails) o;
        return java.util.Objects.equals(this.statementIds, other.statementIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.statementIds == null ? 43 : this.statementIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
