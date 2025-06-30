/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Details for collecting DB traces and alert logs <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230518")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CollectTracesDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CollectTracesDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"bucketName", "namespace", "objectNamePrefix"})
    public CollectTracesDetails(String bucketName, String namespace, String objectNamePrefix) {
        super();
        this.bucketName = bucketName;
        this.namespace = namespace;
        this.objectNamePrefix = objectNamePrefix;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of the bucket containing the file. */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * Name of the bucket containing the file.
         *
         * @param bucketName the value to set
         * @return this builder
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /** Object Storage namespace. */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * Object Storage namespace.
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /** Object name prefix. */
        @com.fasterxml.jackson.annotation.JsonProperty("objectNamePrefix")
        private String objectNamePrefix;

        /**
         * Object name prefix.
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

        public CollectTracesDetails build() {
            CollectTracesDetails model =
                    new CollectTracesDetails(
                            this.bucketName, this.namespace, this.objectNamePrefix);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CollectTracesDetails model) {
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
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

    /** Name of the bucket containing the file. */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * Name of the bucket containing the file.
     *
     * @return the value
     */
    public String getBucketName() {
        return bucketName;
    }

    /** Object Storage namespace. */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * Object Storage namespace.
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /** Object name prefix. */
    @com.fasterxml.jackson.annotation.JsonProperty("objectNamePrefix")
    private final String objectNamePrefix;

    /**
     * Object name prefix.
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
        sb.append("CollectTracesDetails(");
        sb.append("super=").append(super.toString());
        sb.append("bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", objectNamePrefix=").append(String.valueOf(this.objectNamePrefix));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CollectTracesDetails)) {
            return false;
        }

        CollectTracesDetails other = (CollectTracesDetails) o;
        return java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.objectNamePrefix, other.objectNamePrefix)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result =
                (result * PRIME)
                        + (this.objectNamePrefix == null ? 43 : this.objectNamePrefix.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
