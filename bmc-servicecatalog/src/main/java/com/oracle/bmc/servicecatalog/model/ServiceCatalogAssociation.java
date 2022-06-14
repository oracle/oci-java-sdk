/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicecatalog.model;

/**
 * The detailed model for service catalog association.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210527")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ServiceCatalogAssociation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ServiceCatalogAssociation {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "serviceCatalogId",
        "entityId",
        "entityType",
        "timeCreated"
    })
    public ServiceCatalogAssociation(
            String id,
            String serviceCatalogId,
            String entityId,
            String entityType,
            java.util.Date timeCreated) {
        super();
        this.id = id;
        this.serviceCatalogId = serviceCatalogId;
        this.entityId = entityId;
        this.entityType = entityType;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Identifier of the association.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * Identifier of the association.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * Identifier of the service catalog.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceCatalogId")
        private String serviceCatalogId;

        /**
         * Identifier of the service catalog.
         * @param serviceCatalogId the value to set
         * @return this builder
         **/
        public Builder serviceCatalogId(String serviceCatalogId) {
            this.serviceCatalogId = serviceCatalogId;
            this.__explicitlySet__.add("serviceCatalogId");
            return this;
        }
        /**
         * Identifier of the entity being associated with service catalog.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityId")
        private String entityId;

        /**
         * Identifier of the entity being associated with service catalog.
         * @param entityId the value to set
         * @return this builder
         **/
        public Builder entityId(String entityId) {
            this.entityId = entityId;
            this.__explicitlySet__.add("entityId");
            return this;
        }
        /**
         * The type of the entity that is associated with the service catalog.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        /**
         * The type of the entity that is associated with the service catalog.
         * @param entityType the value to set
         * @return this builder
         **/
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }
        /**
         * Timestamp of when the resource was associated with service catalog.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Timestamp of when the resource was associated with service catalog.
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ServiceCatalogAssociation build() {
            ServiceCatalogAssociation __instance__ =
                    new ServiceCatalogAssociation(
                            id, serviceCatalogId, entityId, entityType, timeCreated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ServiceCatalogAssociation o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .serviceCatalogId(o.getServiceCatalogId())
                            .entityId(o.getEntityId())
                            .entityType(o.getEntityType())
                            .timeCreated(o.getTimeCreated());

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
     * Identifier of the association.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * Identifier of the association.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * Identifier of the service catalog.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceCatalogId")
    private final String serviceCatalogId;

    /**
     * Identifier of the service catalog.
     * @return the value
     **/
    public String getServiceCatalogId() {
        return serviceCatalogId;
    }

    /**
     * Identifier of the entity being associated with service catalog.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityId")
    private final String entityId;

    /**
     * Identifier of the entity being associated with service catalog.
     * @return the value
     **/
    public String getEntityId() {
        return entityId;
    }

    /**
     * The type of the entity that is associated with the service catalog.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final String entityType;

    /**
     * The type of the entity that is associated with the service catalog.
     * @return the value
     **/
    public String getEntityType() {
        return entityType;
    }

    /**
     * Timestamp of when the resource was associated with service catalog.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Timestamp of when the resource was associated with service catalog.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ServiceCatalogAssociation(");
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", serviceCatalogId=").append(String.valueOf(this.serviceCatalogId));
        sb.append(", entityId=").append(String.valueOf(this.entityId));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ServiceCatalogAssociation)) {
            return false;
        }

        ServiceCatalogAssociation other = (ServiceCatalogAssociation) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.serviceCatalogId, other.serviceCatalogId)
                && java.util.Objects.equals(this.entityId, other.entityId)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceCatalogId == null ? 43 : this.serviceCatalogId.hashCode());
        result = (result * PRIME) + (this.entityId == null ? 43 : this.entityId.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
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
