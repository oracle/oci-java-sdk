/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datacatalog.model;

/**
 * Resource locks are used to prevent certain APIs from being called for the resource.
 * A full lock prevents both updating the resource and deleting the resource. A delete
 * lock prevents deleting the resource.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190325")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ResourceLock.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ResourceLock extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "relatedResourceId", "message", "timeCreated"})
    public ResourceLock(
            Type type, String relatedResourceId, String message, java.util.Date timeCreated) {
        super();
        this.type = type;
        this.relatedResourceId = relatedResourceId;
        this.message = message;
        this.timeCreated = timeCreated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Type of the lock.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Type of the lock.
         * @param type the value to set
         * @return this builder
         **/
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * The id of the resource that is locking this resource. Indicates that deleting this resource will remove the lock.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("relatedResourceId")
        private String relatedResourceId;

        /**
         * The id of the resource that is locking this resource. Indicates that deleting this resource will remove the lock.
         *
         * @param relatedResourceId the value to set
         * @return this builder
         **/
        public Builder relatedResourceId(String relatedResourceId) {
            this.relatedResourceId = relatedResourceId;
            this.__explicitlySet__.add("relatedResourceId");
            return this;
        }
        /**
         * A message added by the creator of the lock. This is typically used to give an
         * indication of why the resource is locked.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * A message added by the creator of the lock. This is typically used to give an
         * indication of why the resource is locked.
         *
         * @param message the value to set
         * @return this builder
         **/
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }
        /**
         * When the lock was created.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * When the lock was created.
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

        public ResourceLock build() {
            ResourceLock model =
                    new ResourceLock(
                            this.type, this.relatedResourceId, this.message, this.timeCreated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ResourceLock model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("relatedResourceId")) {
                this.relatedResourceId(model.getRelatedResourceId());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
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
     * Type of the lock.
     **/
    public enum Type {
        Full("FULL"),
        Delete("DELETE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
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
    /**
     * Type of the lock.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Type of the lock.
     * @return the value
     **/
    public Type getType() {
        return type;
    }

    /**
     * The id of the resource that is locking this resource. Indicates that deleting this resource will remove the lock.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("relatedResourceId")
    private final String relatedResourceId;

    /**
     * The id of the resource that is locking this resource. Indicates that deleting this resource will remove the lock.
     *
     * @return the value
     **/
    public String getRelatedResourceId() {
        return relatedResourceId;
    }

    /**
     * A message added by the creator of the lock. This is typically used to give an
     * indication of why the resource is locked.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * A message added by the creator of the lock. This is typically used to give an
     * indication of why the resource is locked.
     *
     * @return the value
     **/
    public String getMessage() {
        return message;
    }

    /**
     * When the lock was created.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * When the lock was created.
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
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
        sb.append("ResourceLock(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", relatedResourceId=").append(String.valueOf(this.relatedResourceId));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ResourceLock)) {
            return false;
        }

        ResourceLock other = (ResourceLock) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.relatedResourceId, other.relatedResourceId)
                && java.util.Objects.equals(this.message, other.message)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result =
                (result * PRIME)
                        + (this.relatedResourceId == null ? 43 : this.relatedResourceId.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
