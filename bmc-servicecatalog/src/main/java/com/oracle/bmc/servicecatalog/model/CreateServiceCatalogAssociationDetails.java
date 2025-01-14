/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.servicecatalog.model;

/**
 * The model to create a single association between a service catalog and a resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210527")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateServiceCatalogAssociationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateServiceCatalogAssociationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"serviceCatalogId", "entityId", "entityType"})
    public CreateServiceCatalogAssociationDetails(
            String serviceCatalogId, String entityId, String entityType) {
        super();
        this.serviceCatalogId = serviceCatalogId;
        this.entityId = entityId;
        this.entityType = entityType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Identifier of the service catalog. */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceCatalogId")
        private String serviceCatalogId;

        /**
         * Identifier of the service catalog.
         *
         * @param serviceCatalogId the value to set
         * @return this builder
         */
        public Builder serviceCatalogId(String serviceCatalogId) {
            this.serviceCatalogId = serviceCatalogId;
            this.__explicitlySet__.add("serviceCatalogId");
            return this;
        }
        /** Identifier of the entity being associated with service catalog. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityId")
        private String entityId;

        /**
         * Identifier of the entity being associated with service catalog.
         *
         * @param entityId the value to set
         * @return this builder
         */
        public Builder entityId(String entityId) {
            this.entityId = entityId;
            this.__explicitlySet__.add("entityId");
            return this;
        }
        /** The type of the entity that is associated with the service catalog. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        /**
         * The type of the entity that is associated with the service catalog.
         *
         * @param entityType the value to set
         * @return this builder
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateServiceCatalogAssociationDetails build() {
            CreateServiceCatalogAssociationDetails model =
                    new CreateServiceCatalogAssociationDetails(
                            this.serviceCatalogId, this.entityId, this.entityType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateServiceCatalogAssociationDetails model) {
            if (model.wasPropertyExplicitlySet("serviceCatalogId")) {
                this.serviceCatalogId(model.getServiceCatalogId());
            }
            if (model.wasPropertyExplicitlySet("entityId")) {
                this.entityId(model.getEntityId());
            }
            if (model.wasPropertyExplicitlySet("entityType")) {
                this.entityType(model.getEntityType());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /** Identifier of the service catalog. */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceCatalogId")
    private final String serviceCatalogId;

    /**
     * Identifier of the service catalog.
     *
     * @return the value
     */
    public String getServiceCatalogId() {
        return serviceCatalogId;
    }

    /** Identifier of the entity being associated with service catalog. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityId")
    private final String entityId;

    /**
     * Identifier of the entity being associated with service catalog.
     *
     * @return the value
     */
    public String getEntityId() {
        return entityId;
    }

    /** The type of the entity that is associated with the service catalog. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final String entityType;

    /**
     * The type of the entity that is associated with the service catalog.
     *
     * @return the value
     */
    public String getEntityType() {
        return entityType;
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
        sb.append("CreateServiceCatalogAssociationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("serviceCatalogId=").append(String.valueOf(this.serviceCatalogId));
        sb.append(", entityId=").append(String.valueOf(this.entityId));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateServiceCatalogAssociationDetails)) {
            return false;
        }

        CreateServiceCatalogAssociationDetails other = (CreateServiceCatalogAssociationDetails) o;
        return java.util.Objects.equals(this.serviceCatalogId, other.serviceCatalogId)
                && java.util.Objects.equals(this.entityId, other.entityId)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.serviceCatalogId == null ? 43 : this.serviceCatalogId.hashCode());
        result = (result * PRIME) + (this.entityId == null ? 43 : this.entityId.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
