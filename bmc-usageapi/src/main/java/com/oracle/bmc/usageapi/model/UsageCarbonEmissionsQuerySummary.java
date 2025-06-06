/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * The carbon emissions usage query summary in the list request. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UsageCarbonEmissionsQuerySummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UsageCarbonEmissionsQuerySummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "queryDefinition"})
    public UsageCarbonEmissionsQuerySummary(
            String id, UsageCarbonEmissionsQueryDefinition queryDefinition) {
        super();
        this.id = id;
        this.queryDefinition = queryDefinition;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The query OCID. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The query OCID.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("queryDefinition")
        private UsageCarbonEmissionsQueryDefinition queryDefinition;

        public Builder queryDefinition(UsageCarbonEmissionsQueryDefinition queryDefinition) {
            this.queryDefinition = queryDefinition;
            this.__explicitlySet__.add("queryDefinition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UsageCarbonEmissionsQuerySummary build() {
            UsageCarbonEmissionsQuerySummary model =
                    new UsageCarbonEmissionsQuerySummary(this.id, this.queryDefinition);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UsageCarbonEmissionsQuerySummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("queryDefinition")) {
                this.queryDefinition(model.getQueryDefinition());
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

    /** The query OCID. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The query OCID.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("queryDefinition")
    private final UsageCarbonEmissionsQueryDefinition queryDefinition;

    public UsageCarbonEmissionsQueryDefinition getQueryDefinition() {
        return queryDefinition;
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
        sb.append("UsageCarbonEmissionsQuerySummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", queryDefinition=").append(String.valueOf(this.queryDefinition));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UsageCarbonEmissionsQuerySummary)) {
            return false;
        }

        UsageCarbonEmissionsQuerySummary other = (UsageCarbonEmissionsQuerySummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.queryDefinition, other.queryDefinition)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.queryDefinition == null ? 43 : this.queryDefinition.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
