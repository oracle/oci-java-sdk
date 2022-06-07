/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * Connection strings to connect to an Oracle Database.
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
    builder = DatabaseConnectionStrings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseConnectionStrings {
    @Deprecated
    @java.beans.ConstructorProperties({"cdbDefault", "cdbIpDefault", "allConnectionStrings"})
    public DatabaseConnectionStrings(
            String cdbDefault,
            String cdbIpDefault,
            java.util.Map<String, String> allConnectionStrings) {
        super();
        this.cdbDefault = cdbDefault;
        this.cdbIpDefault = cdbIpDefault;
        this.allConnectionStrings = allConnectionStrings;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("cdbDefault")
        private String cdbDefault;

        public Builder cdbDefault(String cdbDefault) {
            this.cdbDefault = cdbDefault;
            this.__explicitlySet__.add("cdbDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("cdbIpDefault")
        private String cdbIpDefault;

        public Builder cdbIpDefault(String cdbIpDefault) {
            this.cdbIpDefault = cdbIpDefault;
            this.__explicitlySet__.add("cdbIpDefault");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allConnectionStrings")
        private java.util.Map<String, String> allConnectionStrings;

        public Builder allConnectionStrings(java.util.Map<String, String> allConnectionStrings) {
            this.allConnectionStrings = allConnectionStrings;
            this.__explicitlySet__.add("allConnectionStrings");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseConnectionStrings build() {
            DatabaseConnectionStrings __instance__ =
                    new DatabaseConnectionStrings(cdbDefault, cdbIpDefault, allConnectionStrings);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseConnectionStrings o) {
            Builder copiedBuilder =
                    cdbDefault(o.getCdbDefault())
                            .cdbIpDefault(o.getCdbIpDefault())
                            .allConnectionStrings(o.getAllConnectionStrings());

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
     * Host name based CDB Connection String.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cdbDefault")
    private final String cdbDefault;

    public String getCdbDefault() {
        return cdbDefault;
    }

    /**
     * IP based CDB Connection String.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cdbIpDefault")
    private final String cdbIpDefault;

    public String getCdbIpDefault() {
        return cdbIpDefault;
    }

    /**
     * All connection strings to use to connect to the Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allConnectionStrings")
    private final java.util.Map<String, String> allConnectionStrings;

    public java.util.Map<String, String> getAllConnectionStrings() {
        return allConnectionStrings;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DatabaseConnectionStrings(");
        sb.append("cdbDefault=").append(String.valueOf(this.cdbDefault));
        sb.append(", cdbIpDefault=").append(String.valueOf(this.cdbIpDefault));
        sb.append(", allConnectionStrings=").append(String.valueOf(this.allConnectionStrings));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseConnectionStrings)) {
            return false;
        }

        DatabaseConnectionStrings other = (DatabaseConnectionStrings) o;
        return java.util.Objects.equals(this.cdbDefault, other.cdbDefault)
                && java.util.Objects.equals(this.cdbIpDefault, other.cdbIpDefault)
                && java.util.Objects.equals(this.allConnectionStrings, other.allConnectionStrings)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.cdbDefault == null ? 43 : this.cdbDefault.hashCode());
        result = (result * PRIME) + (this.cdbIpDefault == null ? 43 : this.cdbIpDefault.hashCode());
        result =
                (result * PRIME)
                        + (this.allConnectionStrings == null
                                ? 43
                                : this.allConnectionStrings.hashCode());
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
