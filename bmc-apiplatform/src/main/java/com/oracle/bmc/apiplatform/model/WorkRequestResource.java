/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apiplatform.model;

/**
 * A resource created or operated on by a work request. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20240829")
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
        "metadata"
    })
    public WorkRequestResource(
            String entityType,
            ActionType actionType,
            String identifier,
            String entityUri,
            java.util.Map<String, String> metadata) {
        super();
        this.entityType = entityType;
        this.actionType = actionType;
        this.identifier = identifier;
        this.entityUri = entityUri;
        this.metadata = metadata;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The resource type that the work request affects. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        /**
         * The resource type that the work request affects.
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
         * The way in which this resource is affected by the operation tracked in the work request.
         * A resource being created, updated, or deleted remains in the IN_PROGRESS state until work
         * is complete for that resource, at which point it transitions to CREATED, UPDATED, or
         * DELETED, respectively.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("actionType")
        private ActionType actionType;

        /**
         * The way in which this resource is affected by the operation tracked in the work request.
         * A resource being created, updated, or deleted remains in the IN_PROGRESS state until work
         * is complete for that resource, at which point it transitions to CREATED, UPDATED, or
         * DELETED, respectively.
         *
         * @param actionType the value to set
         * @return this builder
         */
        public Builder actionType(ActionType actionType) {
            this.actionType = actionType;
            this.__explicitlySet__.add("actionType");
            return this;
        }
        /**
         * An [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) or other
         * unique identifier for the resource.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        /**
         * An [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) or other
         * unique identifier for the resource.
         *
         * @param identifier the value to set
         * @return this builder
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }
        /** The URI path that you can use for a GET request to access the resource metadata. */
        @com.fasterxml.jackson.annotation.JsonProperty("entityUri")
        private String entityUri;

        /**
         * The URI path that you can use for a GET request to access the resource metadata.
         *
         * @param entityUri the value to set
         * @return this builder
         */
        public Builder entityUri(String entityUri) {
            this.entityUri = entityUri;
            this.__explicitlySet__.add("entityUri");
            return this;
        }
        /** Additional information that helps to explain the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("metadata")
        private java.util.Map<String, String> metadata;

        /**
         * Additional information that helps to explain the resource.
         *
         * @param metadata the value to set
         * @return this builder
         */
        public Builder metadata(java.util.Map<String, String> metadata) {
            this.metadata = metadata;
            this.__explicitlySet__.add("metadata");
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
                            this.metadata);
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
            if (model.wasPropertyExplicitlySet("metadata")) {
                this.metadata(model.getMetadata());
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

    /** The resource type that the work request affects. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final String entityType;

    /**
     * The resource type that the work request affects.
     *
     * @return the value
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * The way in which this resource is affected by the operation tracked in the work request. A
     * resource being created, updated, or deleted remains in the IN_PROGRESS state until work is
     * complete for that resource, at which point it transitions to CREATED, UPDATED, or DELETED,
     * respectively.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("actionType")
    private final ActionType actionType;

    /**
     * The way in which this resource is affected by the operation tracked in the work request. A
     * resource being created, updated, or deleted remains in the IN_PROGRESS state until work is
     * complete for that resource, at which point it transitions to CREATED, UPDATED, or DELETED,
     * respectively.
     *
     * @return the value
     */
    public ActionType getActionType() {
        return actionType;
    }

    /**
     * An [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) or other
     * unique identifier for the resource.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * An [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) or other
     * unique identifier for the resource.
     *
     * @return the value
     */
    public String getIdentifier() {
        return identifier;
    }

    /** The URI path that you can use for a GET request to access the resource metadata. */
    @com.fasterxml.jackson.annotation.JsonProperty("entityUri")
    private final String entityUri;

    /**
     * The URI path that you can use for a GET request to access the resource metadata.
     *
     * @return the value
     */
    public String getEntityUri() {
        return entityUri;
    }

    /** Additional information that helps to explain the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("metadata")
    private final java.util.Map<String, String> metadata;

    /**
     * Additional information that helps to explain the resource.
     *
     * @return the value
     */
    public java.util.Map<String, String> getMetadata() {
        return metadata;
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
        sb.append(", metadata=").append(String.valueOf(this.metadata));
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
                && java.util.Objects.equals(this.metadata, other.metadata)
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
        result = (result * PRIME) + (this.metadata == null ? 43 : this.metadata.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
