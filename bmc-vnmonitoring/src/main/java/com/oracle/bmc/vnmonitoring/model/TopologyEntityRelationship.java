/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.vnmonitoring.model;

/**
 * Defines the relationship between Virtual Network topology entities. <br>
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
        defaultImpl = TopologyEntityRelationship.class)
@com.fasterxml.jackson.annotation.JsonSubTypes({
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = TopologyRoutesToEntityRelationship.class,
            name = "ROUTES_TO"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = TopologyAssociatedWithEntityRelationship.class,
            name = "ASSOCIATED_WITH"),
    @com.fasterxml.jackson.annotation.JsonSubTypes.Type(
            value = TopologyContainsEntityRelationship.class,
            name = "CONTAINS")
})
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public class TopologyEntityRelationship
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id1", "id2"})
    protected TopologyEntityRelationship(String id1, String id2) {
        super();
        this.id1 = id1;
        this.id2 = id2;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the first entity in the relationship.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id1")
    private final String id1;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the first entity in the relationship.
     *
     * @return the value
     */
    public String getId1() {
        return id1;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the second entity in the relationship.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id2")
    private final String id2;

    /**
     * The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of
     * the second entity in the relationship.
     *
     * @return the value
     */
    public String getId2() {
        return id2;
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
        sb.append("TopologyEntityRelationship(");
        sb.append("super=").append(super.toString());
        sb.append("id1=").append(String.valueOf(this.id1));
        sb.append(", id2=").append(String.valueOf(this.id2));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TopologyEntityRelationship)) {
            return false;
        }

        TopologyEntityRelationship other = (TopologyEntityRelationship) o;
        return java.util.Objects.equals(this.id1, other.id1)
                && java.util.Objects.equals(this.id2, other.id2)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id1 == null ? 43 : this.id1.hashCode());
        result = (result * PRIME) + (this.id2 == null ? 43 : this.id2.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }

    /** The type of relationship between the entities. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Contains("CONTAINS"),
        AssociatedWith("ASSOCIATED_WITH"),
        RoutesTo("ROUTES_TO"),

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
