/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the representation of a virtual network topology. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type",
        defaultImpl = Topology.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = VcnTopology.class, name = "VCN"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(value = PathTopology.class, name = "PATH"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = NetworkingTopology.class,
            name = "NETWORKING"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = SubnetTopology.class,
            name = "SUBNET")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class Topology extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "entities",
        "relationships",
        "limitedEntities",
        "timeCreated"
    })
    protected Topology(
            java.util.List<Object> entities,
            java.util.List<TopologyEntityRelationship> relationships,
            java.util.List<String> limitedEntities,
            java.util.Date timeCreated) {
        super();
        this.entities = entities;
        this.relationships = relationships;
        this.limitedEntities = limitedEntities;
        this.timeCreated = timeCreated;
    }

    /** Lists entities comprising the virtual network topology. */
    @com.fasterxml.jackson.annotation.JsonProperty("entities")
    private final java.util.List<Object> entities;

    /**
     * Lists entities comprising the virtual network topology.
     *
     * @return the value
     */
    public java.util.List<Object> getEntities() {
        return entities;
    }

    /** Lists relationships between entities in the virtual network topology. */
    @com.fasterxml.jackson.annotation.JsonProperty("relationships")
    private final java.util.List<TopologyEntityRelationship> relationships;

    /**
     * Lists relationships between entities in the virtual network topology.
     *
     * @return the value
     */
    public java.util.List<TopologyEntityRelationship> getRelationships() {
        return relationships;
    }

    /**
     * Lists entities that are limited during ingestion. The values for the items in the list are
     * the entity type names of the limitedEntities. Example: {@code vcn}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("limitedEntities")
    private final java.util.List<String> limitedEntities;

    /**
     * Lists entities that are limited during ingestion. The values for the items in the list are
     * the entity type names of the limitedEntities. Example: {@code vcn}
     *
     * @return the value
     */
    public java.util.List<String> getLimitedEntities() {
        return limitedEntities;
    }

    /**
     * Records when the virtual network topology was created, in
     * [RFC3339](https://tools.ietf.org/html/rfc3339) format for date and time.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Records when the virtual network topology was created, in
     * [RFC3339](https://tools.ietf.org/html/rfc3339) format for date and time.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("Topology(");
        sb.append("super=").append(super.toString());
        sb.append("entities=").append(String.valueOf(this.entities));
        sb.append(", relationships=").append(String.valueOf(this.relationships));
        sb.append(", limitedEntities=").append(String.valueOf(this.limitedEntities));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Topology)) {
            return false;
        }

        Topology other = (Topology) o;
        return java.util.Objects.equals(this.entities, other.entities)
                && java.util.Objects.equals(this.relationships, other.relationships)
                && java.util.Objects.equals(this.limitedEntities, other.limitedEntities)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.entities == null ? 43 : this.entities.hashCode());
        result =
                (result * PRIME)
                        + (this.relationships == null ? 43 : this.relationships.hashCode());
        result =
                (result * PRIME)
                        + (this.limitedEntities == null ? 43 : this.limitedEntities.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** Type of the topology object. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Networking("NETWORKING"),
        Vcn("VCN"),
        Subnet("SUBNET"),
        Path("PATH"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Type.class);

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Type(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Type create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Type', returning UnknownEnumValue", key);
            return UnknownEnumValue;
        }
    };
}
