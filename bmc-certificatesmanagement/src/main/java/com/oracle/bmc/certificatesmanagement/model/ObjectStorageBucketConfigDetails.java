/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The details of the Object Storage bucket configured to store the certificate revocation list (CRL).
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ObjectStorageBucketConfigDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ObjectStorageBucketConfigDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "objectStorageNamespace",
        "objectStorageBucketName",
        "objectStorageObjectNameFormat"
    })
    public ObjectStorageBucketConfigDetails(
            String objectStorageNamespace,
            String objectStorageBucketName,
            String objectStorageObjectNameFormat) {
        super();
        this.objectStorageNamespace = objectStorageNamespace;
        this.objectStorageBucketName = objectStorageBucketName;
        this.objectStorageObjectNameFormat = objectStorageObjectNameFormat;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageNamespace")
        private String objectStorageNamespace;

        public Builder objectStorageNamespace(String objectStorageNamespace) {
            this.objectStorageNamespace = objectStorageNamespace;
            this.__explicitlySet__.add("objectStorageNamespace");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageBucketName")
        private String objectStorageBucketName;

        public Builder objectStorageBucketName(String objectStorageBucketName) {
            this.objectStorageBucketName = objectStorageBucketName;
            this.__explicitlySet__.add("objectStorageBucketName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageObjectNameFormat")
        private String objectStorageObjectNameFormat;

        public Builder objectStorageObjectNameFormat(String objectStorageObjectNameFormat) {
            this.objectStorageObjectNameFormat = objectStorageObjectNameFormat;
            this.__explicitlySet__.add("objectStorageObjectNameFormat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ObjectStorageBucketConfigDetails build() {
            ObjectStorageBucketConfigDetails __instance__ =
                    new ObjectStorageBucketConfigDetails(
                            objectStorageNamespace,
                            objectStorageBucketName,
                            objectStorageObjectNameFormat);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ObjectStorageBucketConfigDetails o) {
            Builder copiedBuilder =
                    objectStorageNamespace(o.getObjectStorageNamespace())
                            .objectStorageBucketName(o.getObjectStorageBucketName())
                            .objectStorageObjectNameFormat(o.getObjectStorageObjectNameFormat());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The tenancy of the bucket where the CRL is stored.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageNamespace")
    private final String objectStorageNamespace;

    public String getObjectStorageNamespace() {
        return objectStorageNamespace;
    }

    /**
     * The name of the bucket where the CRL is stored.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageBucketName")
    private final String objectStorageBucketName;

    public String getObjectStorageBucketName() {
        return objectStorageBucketName;
    }

    /**
     * The object name in the bucket where the CRL is stored, expressed using a format where the version number of the issuing CA is inserted as part of the Object Storage object name wherever you include a pair of curly braces. This versioning scheme helps avoid collisions when new CA versions are created. For example, myCrlFileIssuedFromCAVersion{}.crl becomes myCrlFileIssuedFromCAVersion2.crl for CA version 2.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageObjectNameFormat")
    private final String objectStorageObjectNameFormat;

    public String getObjectStorageObjectNameFormat() {
        return objectStorageObjectNameFormat;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ObjectStorageBucketConfigDetails(");
        sb.append("objectStorageNamespace=").append(String.valueOf(this.objectStorageNamespace));
        sb.append(", objectStorageBucketName=")
                .append(String.valueOf(this.objectStorageBucketName));
        sb.append(", objectStorageObjectNameFormat=")
                .append(String.valueOf(this.objectStorageObjectNameFormat));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ObjectStorageBucketConfigDetails)) {
            return false;
        }

        ObjectStorageBucketConfigDetails other = (ObjectStorageBucketConfigDetails) o;
        return java.util.Objects.equals(this.objectStorageNamespace, other.objectStorageNamespace)
                && java.util.Objects.equals(
                        this.objectStorageBucketName, other.objectStorageBucketName)
                && java.util.Objects.equals(
                        this.objectStorageObjectNameFormat, other.objectStorageObjectNameFormat)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.objectStorageNamespace == null
                                ? 43
                                : this.objectStorageNamespace.hashCode());
        result =
                (result * PRIME)
                        + (this.objectStorageBucketName == null
                                ? 43
                                : this.objectStorageBucketName.hashCode());
        result =
                (result * PRIME)
                        + (this.objectStorageObjectNameFormat == null
                                ? 43
                                : this.objectStorageObjectNameFormat.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
