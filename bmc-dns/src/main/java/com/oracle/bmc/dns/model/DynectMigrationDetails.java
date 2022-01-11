/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * Details specific to performing a DynECT zone migration.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DynectMigrationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class DynectMigrationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("customerName")
        private String customerName;

        public Builder customerName(String customerName) {
            this.customerName = customerName;
            this.__explicitlySet__.add("customerName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("password")
        private String password;

        public Builder password(String password) {
            this.password = password;
            this.__explicitlySet__.add("password");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("httpRedirectReplacements")
        private java.util.Map<String, java.util.List<MigrationReplacement>>
                httpRedirectReplacements;

        public Builder httpRedirectReplacements(
                java.util.Map<String, java.util.List<MigrationReplacement>>
                        httpRedirectReplacements) {
            this.httpRedirectReplacements = httpRedirectReplacements;
            this.__explicitlySet__.add("httpRedirectReplacements");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DynectMigrationDetails build() {
            DynectMigrationDetails __instance__ =
                    new DynectMigrationDetails(
                            customerName, username, password, httpRedirectReplacements);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DynectMigrationDetails o) {
            Builder copiedBuilder =
                    customerName(o.getCustomerName())
                            .username(o.getUsername())
                            .password(o.getPassword())
                            .httpRedirectReplacements(o.getHttpRedirectReplacements());

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
     * DynECT customer name the zone belongs to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("customerName")
    String customerName;

    /**
     * DynECT API username to perform the migration with.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    String username;

    /**
     * DynECT API password for the provided username.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("password")
    String password;

    /**
     * A map of fully-qualified domain names (FQDNs) to an array of {@code MigrationReplacement} objects.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("httpRedirectReplacements")
    java.util.Map<String, java.util.List<MigrationReplacement>> httpRedirectReplacements;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
