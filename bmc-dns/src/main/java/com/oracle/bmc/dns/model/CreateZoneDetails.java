/**
 * Copyright (c) 2016, 2018, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dns.model;

/**
 * The body for defining a new zone.
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
    builder = CreateZoneDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class CreateZoneDetails {
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

        @com.fasterxml.jackson.annotation.JsonProperty("zoneType")
        private ZoneType zoneType;

        public Builder zoneType(ZoneType zoneType) {
            this.zoneType = zoneType;
            this.__explicitlySet__.add("zoneType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalMasters")
        private java.util.List<ExternalMaster> externalMasters;

        public Builder externalMasters(java.util.List<ExternalMaster> externalMasters) {
            this.externalMasters = externalMasters;
            this.__explicitlySet__.add("externalMasters");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateZoneDetails build() {
            CreateZoneDetails __instance__ =
                    new CreateZoneDetails(name, zoneType, compartmentId, externalMasters);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateZoneDetails o) {
            Builder copiedBuilder =
                    name(o.getName())
                            .zoneType(o.getZoneType())
                            .compartmentId(o.getCompartmentId())
                            .externalMasters(o.getExternalMasters());

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
     * The name of the zone.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;
    /**
     * The type of the zone. Must be either `PRIMARY` or `SECONDARY`.
     *
     **/
    public enum ZoneType {
        Primary("PRIMARY"),
        Secondary("SECONDARY"),
        ;

        private final String value;
        private static java.util.Map<String, ZoneType> map;

        static {
            map = new java.util.HashMap<>();
            for (ZoneType v : ZoneType.values()) {
                map.put(v.getValue(), v);
            }
        }

        ZoneType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ZoneType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new RuntimeException("Invalid ZoneType: " + key);
        }
    };
    /**
     * The type of the zone. Must be either `PRIMARY` or `SECONDARY`.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("zoneType")
    ZoneType zoneType;

    /**
     * The OCID of the compartment containing the zone.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * External master servers for the zone.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalMasters")
    java.util.List<ExternalMaster> externalMasters;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
