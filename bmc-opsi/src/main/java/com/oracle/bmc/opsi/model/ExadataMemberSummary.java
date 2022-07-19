/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opsi.model;

/**
 * Lists name, display name and type of exadata member.
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
    builder = ExadataMemberSummary.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExadataMemberSummary {
    @Deprecated
    @java.beans.ConstructorProperties({"name", "displayName", "entityType"})
    public ExadataMemberSummary(String name, String displayName, EntityType entityType) {
        super();
        this.name = name;
        this.displayName = displayName;
        this.entityType = entityType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of exadata member target
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name of exadata member target
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Display Name of exadata member target
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * Display Name of exadata member target
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Entity type of exadata member target
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private EntityType entityType;

        /**
         * Entity type of exadata member target
         * @param entityType the value to set
         * @return this builder
         **/
        public Builder entityType(EntityType entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExadataMemberSummary build() {
            ExadataMemberSummary __instance__ =
                    new ExadataMemberSummary(name, displayName, entityType);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExadataMemberSummary o) {
            Builder copiedBuilder =
                    name(o.getName()).displayName(o.getDisplayName()).entityType(o.getEntityType());

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
     * Name of exadata member target
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name of exadata member target
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Display Name of exadata member target
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * Display Name of exadata member target
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Entity type of exadata member target
     **/
    public enum EntityType {
        Database("DATABASE"),
        IlomServer("ILOM_SERVER"),
        Pdu("PDU"),
        StorageServer("STORAGE_SERVER"),
        ClusterAsm("CLUSTER_ASM"),
        InfinibandSwitch("INFINIBAND_SWITCH"),
        EthernetSwitch("ETHERNET_SWITCH"),
        Host("HOST"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(EntityType.class);

        private final String value;
        private static java.util.Map<String, EntityType> map;

        static {
            map = new java.util.HashMap<>();
            for (EntityType v : EntityType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        EntityType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EntityType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'EntityType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Entity type of exadata member target
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final EntityType entityType;

    /**
     * Entity type of exadata member target
     * @return the value
     **/
    public EntityType getEntityType() {
        return entityType;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExadataMemberSummary(");
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExadataMemberSummary)) {
            return false;
        }

        ExadataMemberSummary other = (ExadataMemberSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
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
