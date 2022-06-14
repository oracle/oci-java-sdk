/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Logical grouping used for Operations Insights Warehouse User operations.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = OperationsInsightsWarehouseUsers.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OperationsInsightsWarehouseUsers {
    @Deprecated
    @java.beans.ConstructorProperties({"operationsInsightsWarehouseUsers"})
    public OperationsInsightsWarehouseUsers(Object operationsInsightsWarehouseUsers) {
        super();
        this.operationsInsightsWarehouseUsers = operationsInsightsWarehouseUsers;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Operations Insights Warehouse User Object.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsWarehouseUsers")
        private Object operationsInsightsWarehouseUsers;

        /**
         * Operations Insights Warehouse User Object.
         * @param operationsInsightsWarehouseUsers the value to set
         * @return this builder
         **/
        public Builder operationsInsightsWarehouseUsers(Object operationsInsightsWarehouseUsers) {
            this.operationsInsightsWarehouseUsers = operationsInsightsWarehouseUsers;
            this.__explicitlySet__.add("operationsInsightsWarehouseUsers");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OperationsInsightsWarehouseUsers build() {
            OperationsInsightsWarehouseUsers __instance__ =
                    new OperationsInsightsWarehouseUsers(operationsInsightsWarehouseUsers);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OperationsInsightsWarehouseUsers o) {
            Builder copiedBuilder =
                    operationsInsightsWarehouseUsers(o.getOperationsInsightsWarehouseUsers());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * Operations Insights Warehouse User Object.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("operationsInsightsWarehouseUsers")
    private final Object operationsInsightsWarehouseUsers;

    /**
     * Operations Insights Warehouse User Object.
     * @return the value
     **/
    public Object getOperationsInsightsWarehouseUsers() {
        return operationsInsightsWarehouseUsers;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("OperationsInsightsWarehouseUsers(");
        sb.append("operationsInsightsWarehouseUsers=")
                .append(String.valueOf(this.operationsInsightsWarehouseUsers));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OperationsInsightsWarehouseUsers)) {
            return false;
        }

        OperationsInsightsWarehouseUsers other = (OperationsInsightsWarehouseUsers) o;
        return java.util.Objects.equals(
                        this.operationsInsightsWarehouseUsers,
                        other.operationsInsightsWarehouseUsers)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.operationsInsightsWarehouseUsers == null
                                ? 43
                                : this.operationsInsightsWarehouseUsers.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
