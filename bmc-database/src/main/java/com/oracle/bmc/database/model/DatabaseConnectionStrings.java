/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
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
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DatabaseConnectionStrings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DatabaseConnectionStrings {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
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

    /**
     * Host name based CDB Connection String.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cdbDefault")
    String cdbDefault;

    /**
     * IP based CDB Connection String.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("cdbIpDefault")
    String cdbIpDefault;

    /**
     * All connection strings to use to connect to the Database.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allConnectionStrings")
    java.util.Map<String, String> allConnectionStrings;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
