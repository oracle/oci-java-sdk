/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apmtraces.model;

/**
 * Definition of the object storage. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200630")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ObjectStorage.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ObjectStorage extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"bucketName", "nameSpace", "objectNamePrefix"})
    public ObjectStorage(String bucketName, String nameSpace, String objectNamePrefix) {
        super();
        this.bucketName = bucketName;
        this.nameSpace = nameSpace;
        this.objectNamePrefix = objectNamePrefix;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Bucket name in the object store. */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * Bucket name in the object store.
         *
         * @param bucketName the value to set
         * @return this builder
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /** Namespace in the object store. */
        @com.fasterxml.jackson.annotation.JsonProperty("nameSpace")
        private String nameSpace;

        /**
         * Namespace in the object store.
         *
         * @param nameSpace the value to set
         * @return this builder
         */
        public Builder nameSpace(String nameSpace) {
            this.nameSpace = nameSpace;
            this.__explicitlySet__.add("nameSpace");
            return this;
        }
        /** Object name prefix in the object store. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectNamePrefix")
        private String objectNamePrefix;

        /**
         * Object name prefix in the object store.
         *
         * @param objectNamePrefix the value to set
         * @return this builder
         */
        public Builder objectNamePrefix(String objectNamePrefix) {
            this.objectNamePrefix = objectNamePrefix;
            this.__explicitlySet__.add("objectNamePrefix");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ObjectStorage build() {
            ObjectStorage model =
                    new ObjectStorage(this.bucketName, this.nameSpace, this.objectNamePrefix);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectStorage model) {
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("nameSpace")) {
                this.nameSpace(model.getNameSpace());
            }
            if (model.wasPropertyExplicitlySet("objectNamePrefix")) {
                this.objectNamePrefix(model.getObjectNamePrefix());
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

    /** Bucket name in the object store. */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * Bucket name in the object store.
     *
     * @return the value
     */
    public String getBucketName() {
        return bucketName;
    }

    /** Namespace in the object store. */
    @com.fasterxml.jackson.annotation.JsonProperty("nameSpace")
    private final String nameSpace;

    /**
     * Namespace in the object store.
     *
     * @return the value
     */
    public String getNameSpace() {
        return nameSpace;
    }

    /** Object name prefix in the object store. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectNamePrefix")
    private final String objectNamePrefix;

    /**
     * Object name prefix in the object store.
     *
     * @return the value
     */
    public String getObjectNamePrefix() {
        return objectNamePrefix;
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
        sb.append("ObjectStorage(");
        sb.append("super=").append(super.toString());
        sb.append("bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", nameSpace=").append(String.valueOf(this.nameSpace));
        sb.append(", objectNamePrefix=").append(String.valueOf(this.objectNamePrefix));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjectStorage)) {
            return false;
        }

        ObjectStorage other = (ObjectStorage) o;
        return java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.nameSpace, other.nameSpace)
                && java.util.Objects.equals(this.objectNamePrefix, other.objectNamePrefix)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.nameSpace == null ? 43 : this.nameSpace.hashCode());
        result =
                (result * PRIME)
                        + (this.objectNamePrefix == null ? 43 : this.objectNamePrefix.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
