/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemanagement.model;

/**
 * The resource that is created or operated on by a work request. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = WorkRequestResource.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class WorkRequestResource
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "entityType",
        "actionType",
        "identifier",
        "entityUri",
        "entityName",
        "entityDependencies"
    })
    public WorkRequestResource(
            String entityType,
            WorkRequestResourceActionType actionType,
            String identifier,
            String entityUri,
            String entityName,
            java.util.List<WorkRequestSubResource> entityDependencies) {
        super();
        this.entityType = entityType;
        this.actionType = actionType;
        this.identifier = identifier;
        this.entityUri = entityUri;
        this.entityName = entityName;
        this.entityDependencies = entityDependencies;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The resource type the work request affects. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        /**
         * The resource type the work request affects.
         *
         * @param entityType the value to set
         * @return this builder
         */
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }
        /**
         * The way in which this resource is affected by the work tracked in the work request. A
         * resource being created, updated, or deleted will remain in the IN_PROGRESS state until
         * work is complete for that resource at which point it will transition to CREATED, UPDATED,
         * or DELETED, respectively.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("actionType")
        private WorkRequestResourceActionType actionType;

        /**
         * The way in which this resource is affected by the work tracked in the work request. A
         * resource being created, updated, or deleted will remain in the IN_PROGRESS state until
         * work is complete for that resource at which point it will transition to CREATED, UPDATED,
         * or DELETED, respectively.
         *
         * @param actionType the value to set
         * @return this builder
         */
        public Builder actionType(WorkRequestResourceActionType actionType) {
            this.actionType = actionType;
            this.__explicitlySet__.add("actionType");
            return this;
        }
        /** The OCID or other unique identifier of the resource the work request affects. */
        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        /**
         * The OCID or other unique identifier of the resource the work request affects.
         *
         * @param identifier the value to set
         * @return this builder
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }
        /** The URI path that is used in a GET request to access the resource metadata. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityUri")
        private String entityUri;

        /**
         * The URI path that is used in a GET request to access the resource metadata.
         *
         * @param entityUri the value to set
         * @return this builder
         */
        public Builder entityUri(String entityUri) {
            this.entityUri = entityUri;
            this.__explicitlySet__.add("entityUri");
            return this;
        }
        /** The name of the WorkRequest resource entity. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityName")
        private String entityName;

        /**
         * The name of the WorkRequest resource entity.
         *
         * @param entityName the value to set
         * @return this builder
         */
        public Builder entityName(String entityName) {
            this.entityName = entityName;
            this.__explicitlySet__.add("entityName");
            return this;
        }
        /**
         * The dependent resources of this work request resource, these can only be provisioned when
         * primary resource successfully completes.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("entityDependencies")
        private java.util.List<WorkRequestSubResource> entityDependencies;

        /**
         * The dependent resources of this work request resource, these can only be provisioned when
         * primary resource successfully completes.
         *
         * @param entityDependencies the value to set
         * @return this builder
         */
        public Builder entityDependencies(
                java.util.List<WorkRequestSubResource> entityDependencies) {
            this.entityDependencies = entityDependencies;
            this.__explicitlySet__.add("entityDependencies");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkRequestResource build() {
            WorkRequestResource model =
                    new WorkRequestResource(
                            this.entityType,
                            this.actionType,
                            this.identifier,
                            this.entityUri,
                            this.entityName,
                            this.entityDependencies);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkRequestResource model) {
            if (model.wasPropertyExplicitlySet("entityType")) {
                this.entityType(model.getEntityType());
            }
            if (model.wasPropertyExplicitlySet("actionType")) {
                this.actionType(model.getActionType());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("entityUri")) {
                this.entityUri(model.getEntityUri());
            }
            if (model.wasPropertyExplicitlySet("entityName")) {
                this.entityName(model.getEntityName());
            }
            if (model.wasPropertyExplicitlySet("entityDependencies")) {
                this.entityDependencies(model.getEntityDependencies());
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

    /** The resource type the work request affects. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final String entityType;

    /**
     * The resource type the work request affects.
     *
     * @return the value
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * The way in which this resource is affected by the work tracked in the work request. A
     * resource being created, updated, or deleted will remain in the IN_PROGRESS state until work
     * is complete for that resource at which point it will transition to CREATED, UPDATED, or
     * DELETED, respectively.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("actionType")
    private final WorkRequestResourceActionType actionType;

    /**
     * The way in which this resource is affected by the work tracked in the work request. A
     * resource being created, updated, or deleted will remain in the IN_PROGRESS state until work
     * is complete for that resource at which point it will transition to CREATED, UPDATED, or
     * DELETED, respectively.
     *
     * @return the value
     */
    public WorkRequestResourceActionType getActionType() {
        return actionType;
    }

    /** The OCID or other unique identifier of the resource the work request affects. */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * The OCID or other unique identifier of the resource the work request affects.
     *
     * @return the value
     */
    public String getIdentifier() {
        return identifier;
    }

    /** The URI path that is used in a GET request to access the resource metadata. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityUri")
    private final String entityUri;

    /**
     * The URI path that is used in a GET request to access the resource metadata.
     *
     * @return the value
     */
    public String getEntityUri() {
        return entityUri;
    }

    /** The name of the WorkRequest resource entity. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityName")
    private final String entityName;

    /**
     * The name of the WorkRequest resource entity.
     *
     * @return the value
     */
    public String getEntityName() {
        return entityName;
    }

    /**
     * The dependent resources of this work request resource, these can only be provisioned when
     * primary resource successfully completes.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("entityDependencies")
    private final java.util.List<WorkRequestSubResource> entityDependencies;

    /**
     * The dependent resources of this work request resource, these can only be provisioned when
     * primary resource successfully completes.
     *
     * @return the value
     */
    public java.util.List<WorkRequestSubResource> getEntityDependencies() {
        return entityDependencies;
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
        sb.append("WorkRequestResource(");
        sb.append("super=").append(super.toString());
        sb.append("entityType=").append(String.valueOf(this.entityType));
        sb.append(", actionType=").append(String.valueOf(this.actionType));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", entityUri=").append(String.valueOf(this.entityUri));
        sb.append(", entityName=").append(String.valueOf(this.entityName));
        sb.append(", entityDependencies=").append(String.valueOf(this.entityDependencies));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkRequestResource)) {
            return false;
        }

        WorkRequestResource other = (WorkRequestResource) o;
        return java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.actionType, other.actionType)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.entityUri, other.entityUri)
                && java.util.Objects.equals(this.entityName, other.entityName)
                && java.util.Objects.equals(this.entityDependencies, other.entityDependencies)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + (this.actionType == null ? 43 : this.actionType.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.entityUri == null ? 43 : this.entityUri.hashCode());
        result = (result * PRIME) + (this.entityName == null ? 43 : this.entityName.hashCode());
        result =
                (result * PRIME)
                        + (this.entityDependencies == null
                                ? 43
                                : this.entityDependencies.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
