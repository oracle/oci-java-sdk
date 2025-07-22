/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * Filter configured for a replication channel. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MySqlReplicationApplierFilter.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MySqlReplicationApplierFilter
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"filterName", "filterRule"})
    public MySqlReplicationApplierFilter(String filterName, String filterRule) {
        super();
        this.filterName = filterName;
        this.filterRule = filterRule;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The type of replication filter that has been configured for the replication channel. */
        @com.fasterxml.jackson.annotation.JsonProperty("filterName")
        private String filterName;

        /**
         * The type of replication filter that has been configured for the replication channel.
         *
         * @param filterName the value to set
         * @return this builder
         */
        public Builder filterName(String filterName) {
            this.filterName = filterName;
            this.__explicitlySet__.add("filterName");
            return this;
        }
        /** The rules configured for the replication filter type. */
        @com.fasterxml.jackson.annotation.JsonProperty("filterRule")
        private String filterRule;

        /**
         * The rules configured for the replication filter type.
         *
         * @param filterRule the value to set
         * @return this builder
         */
        public Builder filterRule(String filterRule) {
            this.filterRule = filterRule;
            this.__explicitlySet__.add("filterRule");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MySqlReplicationApplierFilter build() {
            MySqlReplicationApplierFilter model =
                    new MySqlReplicationApplierFilter(this.filterName, this.filterRule);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MySqlReplicationApplierFilter model) {
            if (model.wasPropertyExplicitlySet("filterName")) {
                this.filterName(model.getFilterName());
            }
            if (model.wasPropertyExplicitlySet("filterRule")) {
                this.filterRule(model.getFilterRule());
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

    /** The type of replication filter that has been configured for the replication channel. */
    @com.fasterxml.jackson.annotation.JsonProperty("filterName")
    private final String filterName;

    /**
     * The type of replication filter that has been configured for the replication channel.
     *
     * @return the value
     */
    public String getFilterName() {
        return filterName;
    }

    /** The rules configured for the replication filter type. */
    @com.fasterxml.jackson.annotation.JsonProperty("filterRule")
    private final String filterRule;

    /**
     * The rules configured for the replication filter type.
     *
     * @return the value
     */
    public String getFilterRule() {
        return filterRule;
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
        sb.append("MySqlReplicationApplierFilter(");
        sb.append("super=").append(super.toString());
        sb.append("filterName=").append(String.valueOf(this.filterName));
        sb.append(", filterRule=").append(String.valueOf(this.filterRule));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MySqlReplicationApplierFilter)) {
            return false;
        }

        MySqlReplicationApplierFilter other = (MySqlReplicationApplierFilter) o;
        return java.util.Objects.equals(this.filterName, other.filterName)
                && java.util.Objects.equals(this.filterRule, other.filterRule)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.filterName == null ? 43 : this.filterName.hashCode());
        result = (result * PRIME) + (this.filterRule == null ? 43 : this.filterRule.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
