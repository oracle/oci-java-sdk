/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Compartment.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class Compartment {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("fullName")
        private String fullName;

        public Builder fullName(String fullName) {
            this.fullName = fullName;
            this.__explicitlySet__.add("fullName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("parentCompartmentId")
        private String parentCompartmentId;

        public Builder parentCompartmentId(String parentCompartmentId) {
            this.parentCompartmentId = parentCompartmentId;
            this.__explicitlySet__.add("parentCompartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private EntityStatus status;

        public Builder status(EntityStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("propertyMap")
        private java.util.Map<String, String> propertyMap;

        public Builder propertyMap(java.util.Map<String, String> propertyMap) {
            this.propertyMap = propertyMap;
            this.__explicitlySet__.add("propertyMap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Compartment build() {
            Compartment __instance__ =
                    new Compartment(
                            id,
                            name,
                            displayName,
                            fullName,
                            parentCompartmentId,
                            status,
                            propertyMap);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Compartment o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .name(o.getName())
                            .displayName(o.getDisplayName())
                            .fullName(o.getFullName())
                            .parentCompartmentId(o.getParentCompartmentId())
                            .status(o.getStatus())
                            .propertyMap(o.getPropertyMap());

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
     * The id of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The name of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The display name of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    String displayName;

    /**
     * The full name of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fullName")
    String fullName;

    /**
     * The id of the parent compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentCompartmentId")
    String parentCompartmentId;

    /**
     * The status of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    EntityStatus status;

    /**
     * The extended properties.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("propertyMap")
    java.util.Map<String, String> propertyMap;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
