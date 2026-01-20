/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.disasterrecovery.model;

/**
 * The details of an object storage log location for a DR protection group. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220125")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ObjectStorageLogLocation.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ObjectStorageLogLocation
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"namespace", "bucket", "object"})
    public ObjectStorageLogLocation(String namespace, String bucket, String object) {
        super();
        this.namespace = namespace;
        this.bucket = bucket;
        this.object = object;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The namespace in object storage (Note - this is usually the tenancy name).
         *
         * <p>Example: {@code myocitenancy}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The namespace in object storage (Note - this is usually the tenancy name).
         *
         * <p>Example: {@code myocitenancy}
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * The bucket name inside the object storage namespace.
         *
         * <p>Example: {@code operation_logs}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bucket")
        private String bucket;

        /**
         * The bucket name inside the object storage namespace.
         *
         * <p>Example: {@code operation_logs}
         *
         * @param bucket the value to set
         * @return this builder
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            this.__explicitlySet__.add("bucket");
            return this;
        }
        /**
         * The object name inside the object storage bucket.
         *
         * <p>Example: {@code switchover_plan_executions}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("object")
        private String object;

        /**
         * The object name inside the object storage bucket.
         *
         * <p>Example: {@code switchover_plan_executions}
         *
         * @param object the value to set
         * @return this builder
         */
        public Builder object(String object) {
            this.object = object;
            this.__explicitlySet__.add("object");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ObjectStorageLogLocation build() {
            ObjectStorageLogLocation model =
                    new ObjectStorageLogLocation(this.namespace, this.bucket, this.object);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectStorageLogLocation model) {
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("bucket")) {
                this.bucket(model.getBucket());
            }
            if (model.wasPropertyExplicitlySet("object")) {
                this.object(model.getObject());
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

    /**
     * The namespace in object storage (Note - this is usually the tenancy name).
     *
     * <p>Example: {@code myocitenancy}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The namespace in object storage (Note - this is usually the tenancy name).
     *
     * <p>Example: {@code myocitenancy}
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * The bucket name inside the object storage namespace.
     *
     * <p>Example: {@code operation_logs}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bucket")
    private final String bucket;

    /**
     * The bucket name inside the object storage namespace.
     *
     * <p>Example: {@code operation_logs}
     *
     * @return the value
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * The object name inside the object storage bucket.
     *
     * <p>Example: {@code switchover_plan_executions}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("object")
    private final String object;

    /**
     * The object name inside the object storage bucket.
     *
     * <p>Example: {@code switchover_plan_executions}
     *
     * @return the value
     */
    public String getObject() {
        return object;
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
        sb.append("ObjectStorageLogLocation(");
        sb.append("super=").append(super.toString());
        sb.append("namespace=").append(String.valueOf(this.namespace));
        sb.append(", bucket=").append(String.valueOf(this.bucket));
        sb.append(", object=").append(String.valueOf(this.object));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjectStorageLogLocation)) {
            return false;
        }

        ObjectStorageLogLocation other = (ObjectStorageLogLocation) o;
        return java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.bucket, other.bucket)
                && java.util.Objects.equals(this.object, other.object)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.bucket == null ? 43 : this.bucket.hashCode());
        result = (result * PRIME) + (this.object == null ? 43 : this.object.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
