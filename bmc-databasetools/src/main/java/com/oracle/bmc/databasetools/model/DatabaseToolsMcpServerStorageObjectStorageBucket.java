/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetools.model;

/**
 * A Cloud Storage bucket for an MCP Server.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201005")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DatabaseToolsMcpServerStorageObjectStorageBucket.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DatabaseToolsMcpServerStorageObjectStorageBucket
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"namespace", "bucketName"})
    public DatabaseToolsMcpServerStorageObjectStorageBucket(String namespace, String bucketName) {
        super();
        this.namespace = namespace;
        this.bucketName = bucketName;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Object Storage namespace to use.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The Object Storage namespace to use.
         * @param namespace the value to set
         * @return this builder
         **/
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * The Object Storage bucket to use.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * The Object Storage bucket to use.
         * @param bucketName the value to set
         * @return this builder
         **/
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DatabaseToolsMcpServerStorageObjectStorageBucket build() {
            DatabaseToolsMcpServerStorageObjectStorageBucket model =
                    new DatabaseToolsMcpServerStorageObjectStorageBucket(
                            this.namespace, this.bucketName);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DatabaseToolsMcpServerStorageObjectStorageBucket model) {
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
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
     * The Object Storage namespace to use.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The Object Storage namespace to use.
     * @return the value
     **/
    public String getNamespace() {
        return namespace;
    }

    /**
     * The Object Storage bucket to use.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * The Object Storage bucket to use.
     * @return the value
     **/
    public String getBucketName() {
        return bucketName;
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
        sb.append("DatabaseToolsMcpServerStorageObjectStorageBucket(");
        sb.append("super=").append(super.toString());
        sb.append("namespace=").append(String.valueOf(this.namespace));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DatabaseToolsMcpServerStorageObjectStorageBucket)) {
            return false;
        }

        DatabaseToolsMcpServerStorageObjectStorageBucket other =
                (DatabaseToolsMcpServerStorageObjectStorageBucket) o;
        return java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
