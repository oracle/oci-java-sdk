/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * (For tenancies that support identity domains) A IAM work request resource entry.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = IamWorkRequestResource.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class IamWorkRequestResource
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"actionType", "entityType", "identifier", "entityUri"})
    public IamWorkRequestResource(
            ActionType actionType, String entityType, String identifier, String entityUri) {
        super();
        this.actionType = actionType;
        this.entityType = entityType;
        this.identifier = identifier;
        this.entityUri = entityUri;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The way in which this resource is affected by the work tracked in the work request.
         * A resource being created, updated, or deleted will remain in the IN_PROGRESS state until
         * work is complete for that resource at which point it will transition to CREATED, UPDATED,
         * or DELETED, respectively.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("actionType")
        private ActionType actionType;

        /**
         * The way in which this resource is affected by the work tracked in the work request.
         * A resource being created, updated, or deleted will remain in the IN_PROGRESS state until
         * work is complete for that resource at which point it will transition to CREATED, UPDATED,
         * or DELETED, respectively.
         *
         * @param actionType the value to set
         * @return this builder
         **/
        public Builder actionType(ActionType actionType) {
            this.actionType = actionType;
            this.__explicitlySet__.add("actionType");
            return this;
        }
        /**
         * The resource type the work request is affects.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityType")
        private String entityType;

        /**
         * The resource type the work request is affects.
         * @param entityType the value to set
         * @return this builder
         **/
        public Builder entityType(String entityType) {
            this.entityType = entityType;
            this.__explicitlySet__.add("entityType");
            return this;
        }
        /**
         * An OCID of the resource that the work request affects.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("identifier")
        private String identifier;

        /**
         * An OCID of the resource that the work request affects.
         * @param identifier the value to set
         * @return this builder
         **/
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            this.__explicitlySet__.add("identifier");
            return this;
        }
        /**
         * The URI path that the user can do a GET on to access the resource metadata.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("entityUri")
        private String entityUri;

        /**
         * The URI path that the user can do a GET on to access the resource metadata.
         * @param entityUri the value to set
         * @return this builder
         **/
        public Builder entityUri(String entityUri) {
            this.entityUri = entityUri;
            this.__explicitlySet__.add("entityUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IamWorkRequestResource build() {
            IamWorkRequestResource model =
                    new IamWorkRequestResource(
                            this.actionType, this.entityType, this.identifier, this.entityUri);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IamWorkRequestResource model) {
            if (model.wasPropertyExplicitlySet("actionType")) {
                this.actionType(model.getActionType());
            }
            if (model.wasPropertyExplicitlySet("entityType")) {
                this.entityType(model.getEntityType());
            }
            if (model.wasPropertyExplicitlySet("identifier")) {
                this.identifier(model.getIdentifier());
            }
            if (model.wasPropertyExplicitlySet("entityUri")) {
                this.entityUri(model.getEntityUri());
            }
            return this;
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
     * The way in which this resource is affected by the work tracked in the work request.
     * A resource being created, updated, or deleted will remain in the IN_PROGRESS state until
     * work is complete for that resource at which point it will transition to CREATED, UPDATED,
     * or DELETED, respectively.
     *
     **/
    public enum ActionType {
        Created("CREATED"),
        Updated("UPDATED"),
        Deleted("DELETED"),
        Related("RELATED"),
        InProgress("IN_PROGRESS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ActionType.class);

        private final String value;
        private static java.util.Map<String, ActionType> map;

        static {
            map = new java.util.HashMap<>();
            for (ActionType v : ActionType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ActionType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ActionType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ActionType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The way in which this resource is affected by the work tracked in the work request.
     * A resource being created, updated, or deleted will remain in the IN_PROGRESS state until
     * work is complete for that resource at which point it will transition to CREATED, UPDATED,
     * or DELETED, respectively.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("actionType")
    private final ActionType actionType;

    /**
     * The way in which this resource is affected by the work tracked in the work request.
     * A resource being created, updated, or deleted will remain in the IN_PROGRESS state until
     * work is complete for that resource at which point it will transition to CREATED, UPDATED,
     * or DELETED, respectively.
     *
     * @return the value
     **/
    public ActionType getActionType() {
        return actionType;
    }

    /**
     * The resource type the work request is affects.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityType")
    private final String entityType;

    /**
     * The resource type the work request is affects.
     * @return the value
     **/
    public String getEntityType() {
        return entityType;
    }

    /**
     * An OCID of the resource that the work request affects.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    private final String identifier;

    /**
     * An OCID of the resource that the work request affects.
     * @return the value
     **/
    public String getIdentifier() {
        return identifier;
    }

    /**
     * The URI path that the user can do a GET on to access the resource metadata.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("entityUri")
    private final String entityUri;

    /**
     * The URI path that the user can do a GET on to access the resource metadata.
     * @return the value
     **/
    public String getEntityUri() {
        return entityUri;
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
        sb.append("IamWorkRequestResource(");
        sb.append("super=").append(super.toString());
        sb.append("actionType=").append(String.valueOf(this.actionType));
        sb.append(", entityType=").append(String.valueOf(this.entityType));
        sb.append(", identifier=").append(String.valueOf(this.identifier));
        sb.append(", entityUri=").append(String.valueOf(this.entityUri));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof IamWorkRequestResource)) {
            return false;
        }

        IamWorkRequestResource other = (IamWorkRequestResource) o;
        return java.util.Objects.equals(this.actionType, other.actionType)
                && java.util.Objects.equals(this.entityType, other.entityType)
                && java.util.Objects.equals(this.identifier, other.identifier)
                && java.util.Objects.equals(this.entityUri, other.entityUri)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.actionType == null ? 43 : this.actionType.hashCode());
        result = (result * PRIME) + (this.entityType == null ? 43 : this.entityType.hashCode());
        result = (result * PRIME) + (this.identifier == null ? 43 : this.identifier.hashCode());
        result = (result * PRIME) + (this.entityUri == null ? 43 : this.entityUri.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
