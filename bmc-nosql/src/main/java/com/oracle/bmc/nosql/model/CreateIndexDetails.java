/**
 * Copyright (c) 2016, 2021, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.nosql.model;

/**
 * Specifications for the new index.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190828")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateIndexDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class CreateIndexDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("keys")
        private java.util.List<IndexKey> keys;

        public Builder keys(java.util.List<IndexKey> keys) {
            this.keys = keys;
            this.__explicitlySet__.add("keys");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isIfNotExists")
        private Boolean isIfNotExists;

        public Builder isIfNotExists(Boolean isIfNotExists) {
            this.isIfNotExists = isIfNotExists;
            this.__explicitlySet__.add("isIfNotExists");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateIndexDetails build() {
            CreateIndexDetails __instance__ =
                    new CreateIndexDetails(name, compartmentId, keys, isIfNotExists);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateIndexDetails o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .compartmentId(o.getCompartmentId())
                            .keys(o.getKeys())
                            .isIfNotExists(o.getIsIfNotExists());

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
     * Index name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The OCID of the table's compartment.  Required
     * if the tableNameOrId path parameter is a table name.
     * Optional if tableNameOrId is an OCID.  If tableNameOrId
     * is an OCID, and compartmentId is supplied, the latter
     * must match the identified table's compartmentId.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * A set of keys for a secondary index.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keys")
    java.util.List<IndexKey> keys;

    /**
     * If true, the operation completes successfully even when the
     * index exists.  Otherwise, an attempt to create an index
     * that already exists will return an error.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isIfNotExists")
    Boolean isIfNotExists;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
