/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Used to add a resource lock. Resource locks are used to prevent certain APIs from being called
 * for the resource. A full lock prevents both updating the resource and deleting the resource. A
 * delete lock prevents deleting the resource. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AddResourceLockDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AddResourceLockDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"type", "message"})
    public AddResourceLockDetails(Type type, String message) {
        super();
        this.type = type;
        this.message = message;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Type of the lock. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private Type type;

        /**
         * Type of the lock.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(Type type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /**
         * A message added by the creator of the lock. This is typically used to give an indication
         * of why the resource is locked.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("message")
        private String message;

        /**
         * A message added by the creator of the lock. This is typically used to give an indication
         * of why the resource is locked.
         *
         * @param message the value to set
         * @return this builder
         */
        public Builder message(String message) {
            this.message = message;
            this.__explicitlySet__.add("message");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AddResourceLockDetails build() {
            AddResourceLockDetails model = new AddResourceLockDetails(this.type, this.message);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AddResourceLockDetails model) {
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("message")) {
                this.message(model.getMessage());
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

    /** Type of the lock. */
    public enum Type implements com.oracle.bmc.http.internal.BmcEnum {
        Full("FULL"),
        Delete("DELETE"),
        ;

        private final String value;
        private static java.util.Map<String, Type> map;

        static {
            map = new java.util.HashMap<>();
            for (Type v : Type.values()) {
                map.put(v.getValue(), v);
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
            throw new IllegalArgumentException("Invalid Type: " + key);
        }
    };
    /** Type of the lock. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final Type type;

    /**
     * Type of the lock.
     *
     * @return the value
     */
    public Type getType() {
        return type;
    }

    /**
     * A message added by the creator of the lock. This is typically used to give an indication of
     * why the resource is locked.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("message")
    private final String message;

    /**
     * A message added by the creator of the lock. This is typically used to give an indication of
     * why the resource is locked.
     *
     * @return the value
     */
    public String getMessage() {
        return message;
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
        sb.append("AddResourceLockDetails(");
        sb.append("super=").append(super.toString());
        sb.append("type=").append(String.valueOf(this.type));
        sb.append(", message=").append(String.valueOf(this.message));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AddResourceLockDetails)) {
            return false;
        }

        AddResourceLockDetails other = (AddResourceLockDetails) o;
        return java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.message, other.message)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.message == null ? 43 : this.message.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
