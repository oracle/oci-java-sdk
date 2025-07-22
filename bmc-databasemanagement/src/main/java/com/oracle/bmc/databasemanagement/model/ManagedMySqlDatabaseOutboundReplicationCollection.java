/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The collection of outbound replication records of a MySQL server. <br>
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
        builder = ManagedMySqlDatabaseOutboundReplicationCollection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ManagedMySqlDatabaseOutboundReplicationCollection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"outboundReplicationsCount", "items"})
    public ManagedMySqlDatabaseOutboundReplicationCollection(
            Integer outboundReplicationsCount,
            java.util.List<ManagedMySqlDatabaseOutboundReplicationSummary> items) {
        super();
        this.outboundReplicationsCount = outboundReplicationsCount;
        this.items = items;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The number of outbound replications from the MySQL server. */
        @com.fasterxml.jackson.annotation.JsonProperty("outboundReplicationsCount")
        private Integer outboundReplicationsCount;

        /**
         * The number of outbound replications from the MySQL server.
         *
         * @param outboundReplicationsCount the value to set
         * @return this builder
         */
        public Builder outboundReplicationsCount(Integer outboundReplicationsCount) {
            this.outboundReplicationsCount = outboundReplicationsCount;
            this.__explicitlySet__.add("outboundReplicationsCount");
            return this;
        }
        /** The list of ManagedMySqlDatabaseOutboundReplicationSummary records. */
        @com.fasterxml.jackson.annotation.JsonProperty("items")
        private java.util.List<ManagedMySqlDatabaseOutboundReplicationSummary> items;

        /**
         * The list of ManagedMySqlDatabaseOutboundReplicationSummary records.
         *
         * @param items the value to set
         * @return this builder
         */
        public Builder items(java.util.List<ManagedMySqlDatabaseOutboundReplicationSummary> items) {
            this.items = items;
            this.__explicitlySet__.add("items");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ManagedMySqlDatabaseOutboundReplicationCollection build() {
            ManagedMySqlDatabaseOutboundReplicationCollection model =
                    new ManagedMySqlDatabaseOutboundReplicationCollection(
                            this.outboundReplicationsCount, this.items);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ManagedMySqlDatabaseOutboundReplicationCollection model) {
            if (model.wasPropertyExplicitlySet("outboundReplicationsCount")) {
                this.outboundReplicationsCount(model.getOutboundReplicationsCount());
            }
            if (model.wasPropertyExplicitlySet("items")) {
                this.items(model.getItems());
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

    /** The number of outbound replications from the MySQL server. */
    @com.fasterxml.jackson.annotation.JsonProperty("outboundReplicationsCount")
    private final Integer outboundReplicationsCount;

    /**
     * The number of outbound replications from the MySQL server.
     *
     * @return the value
     */
    public Integer getOutboundReplicationsCount() {
        return outboundReplicationsCount;
    }

    /** The list of ManagedMySqlDatabaseOutboundReplicationSummary records. */
    @com.fasterxml.jackson.annotation.JsonProperty("items")
    private final java.util.List<ManagedMySqlDatabaseOutboundReplicationSummary> items;

    /**
     * The list of ManagedMySqlDatabaseOutboundReplicationSummary records.
     *
     * @return the value
     */
    public java.util.List<ManagedMySqlDatabaseOutboundReplicationSummary> getItems() {
        return items;
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
        sb.append("ManagedMySqlDatabaseOutboundReplicationCollection(");
        sb.append("super=").append(super.toString());
        sb.append("outboundReplicationsCount=")
                .append(String.valueOf(this.outboundReplicationsCount));
        sb.append(", items=").append(String.valueOf(this.items));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ManagedMySqlDatabaseOutboundReplicationCollection)) {
            return false;
        }

        ManagedMySqlDatabaseOutboundReplicationCollection other =
                (ManagedMySqlDatabaseOutboundReplicationCollection) o;
        return java.util.Objects.equals(
                        this.outboundReplicationsCount, other.outboundReplicationsCount)
                && java.util.Objects.equals(this.items, other.items)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.outboundReplicationsCount == null
                                ? 43
                                : this.outboundReplicationsCount.hashCode());
        result = (result * PRIME) + (this.items == null ? 43 : this.items.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
