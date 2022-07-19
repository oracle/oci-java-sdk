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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Compartment.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Compartment {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "name",
        "displayName",
        "fullName",
        "parentCompartmentId",
        "status",
        "propertyMap"
    })
    public Compartment(
            String id,
            String name,
            String displayName,
            String fullName,
            String parentCompartmentId,
            EntityStatus status,
            java.util.Map<String, String> propertyMap) {
        super();
        this.id = id;
        this.name = name;
        this.displayName = displayName;
        this.fullName = fullName;
        this.parentCompartmentId = parentCompartmentId;
        this.status = status;
        this.propertyMap = propertyMap;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The id of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The id of the compartment.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The name of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the compartment.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The display name of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the compartment.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The full name of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("fullName")
        private String fullName;

        /**
         * The full name of the compartment.
         * @param fullName the value to set
         * @return this builder
         **/
        public Builder fullName(String fullName) {
            this.fullName = fullName;
            this.__explicitlySet__.add("fullName");
            return this;
        }
        /**
         * The id of the parent compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("parentCompartmentId")
        private String parentCompartmentId;

        /**
         * The id of the parent compartment.
         * @param parentCompartmentId the value to set
         * @return this builder
         **/
        public Builder parentCompartmentId(String parentCompartmentId) {
            this.parentCompartmentId = parentCompartmentId;
            this.__explicitlySet__.add("parentCompartmentId");
            return this;
        }
        /**
         * The status of the compartment.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private EntityStatus status;

        /**
         * The status of the compartment.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(EntityStatus status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * The extended properties.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("propertyMap")
        private java.util.Map<String, String> propertyMap;

        /**
         * The extended properties.
         * @param propertyMap the value to set
         * @return this builder
         **/
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

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The id of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The id of the compartment.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The name of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the compartment.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The display name of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the compartment.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The full name of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("fullName")
    private final String fullName;

    /**
     * The full name of the compartment.
     * @return the value
     **/
    public String getFullName() {
        return fullName;
    }

    /**
     * The id of the parent compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("parentCompartmentId")
    private final String parentCompartmentId;

    /**
     * The id of the parent compartment.
     * @return the value
     **/
    public String getParentCompartmentId() {
        return parentCompartmentId;
    }

    /**
     * The status of the compartment.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final EntityStatus status;

    /**
     * The status of the compartment.
     * @return the value
     **/
    public EntityStatus getStatus() {
        return status;
    }

    /**
     * The extended properties.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("propertyMap")
    private final java.util.Map<String, String> propertyMap;

    /**
     * The extended properties.
     * @return the value
     **/
    public java.util.Map<String, String> getPropertyMap() {
        return propertyMap;
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
        sb.append("Compartment(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", fullName=").append(String.valueOf(this.fullName));
        sb.append(", parentCompartmentId=").append(String.valueOf(this.parentCompartmentId));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", propertyMap=").append(String.valueOf(this.propertyMap));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Compartment)) {
            return false;
        }

        Compartment other = (Compartment) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.fullName, other.fullName)
                && java.util.Objects.equals(this.parentCompartmentId, other.parentCompartmentId)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.propertyMap, other.propertyMap)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.fullName == null ? 43 : this.fullName.hashCode());
        result =
                (result * PRIME)
                        + (this.parentCompartmentId == null
                                ? 43
                                : this.parentCompartmentId.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.propertyMap == null ? 43 : this.propertyMap.hashCode());
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
