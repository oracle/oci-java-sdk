/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Represents a Google Cloud Storage storage used in the Iceberg connection. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200407")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = GoogleCloudStorageIcebergStorage.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "storageType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class GoogleCloudStorageIcebergStorage extends IcebergStorage {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Google Cloud Storage bucket where Iceberg stores metadata and data files. */
        @com.fasterxml.jackson.annotation.JsonProperty("bucket")
        private String bucket;

        /**
         * Google Cloud Storage bucket where Iceberg stores metadata and data files.
         *
         * @param bucket the value to set
         * @return this builder
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            this.__explicitlySet__.add("bucket");
            return this;
        }
        /** The Google Cloud Project where the bucket exists. */
        @com.fasterxml.jackson.annotation.JsonProperty("projectId")
        private String projectId;

        /**
         * The Google Cloud Project where the bucket exists.
         *
         * @param projectId the value to set
         * @return this builder
         */
        public Builder projectId(String projectId) {
            this.projectId = projectId;
            this.__explicitlySet__.add("projectId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the content of the service account key file is stored, which contains the
         * credentials required to use Google Cloud Storage.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceAccountKeyFileSecretId")
        private String serviceAccountKeyFileSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the content of the service account key file is stored, which contains the
         * credentials required to use Google Cloud Storage.
         *
         * @param serviceAccountKeyFileSecretId the value to set
         * @return this builder
         */
        public Builder serviceAccountKeyFileSecretId(String serviceAccountKeyFileSecretId) {
            this.serviceAccountKeyFileSecretId = serviceAccountKeyFileSecretId;
            this.__explicitlySet__.add("serviceAccountKeyFileSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public GoogleCloudStorageIcebergStorage build() {
            GoogleCloudStorageIcebergStorage model =
                    new GoogleCloudStorageIcebergStorage(
                            this.bucket, this.projectId, this.serviceAccountKeyFileSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(GoogleCloudStorageIcebergStorage model) {
            if (model.wasPropertyExplicitlySet("bucket")) {
                this.bucket(model.getBucket());
            }
            if (model.wasPropertyExplicitlySet("projectId")) {
                this.projectId(model.getProjectId());
            }
            if (model.wasPropertyExplicitlySet("serviceAccountKeyFileSecretId")) {
                this.serviceAccountKeyFileSecretId(model.getServiceAccountKeyFileSecretId());
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

    @Deprecated
    public GoogleCloudStorageIcebergStorage(
            String bucket, String projectId, String serviceAccountKeyFileSecretId) {
        super();
        this.bucket = bucket;
        this.projectId = projectId;
        this.serviceAccountKeyFileSecretId = serviceAccountKeyFileSecretId;
    }

    /** Google Cloud Storage bucket where Iceberg stores metadata and data files. */
    @com.fasterxml.jackson.annotation.JsonProperty("bucket")
    private final String bucket;

    /**
     * Google Cloud Storage bucket where Iceberg stores metadata and data files.
     *
     * @return the value
     */
    public String getBucket() {
        return bucket;
    }

    /** The Google Cloud Project where the bucket exists. */
    @com.fasterxml.jackson.annotation.JsonProperty("projectId")
    private final String projectId;

    /**
     * The Google Cloud Project where the bucket exists.
     *
     * @return the value
     */
    public String getProjectId() {
        return projectId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the content of the service account key file is stored, which contains the
     * credentials required to use Google Cloud Storage.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceAccountKeyFileSecretId")
    private final String serviceAccountKeyFileSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the content of the service account key file is stored, which contains the
     * credentials required to use Google Cloud Storage.
     *
     * @return the value
     */
    public String getServiceAccountKeyFileSecretId() {
        return serviceAccountKeyFileSecretId;
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
        sb.append("GoogleCloudStorageIcebergStorage(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", bucket=").append(String.valueOf(this.bucket));
        sb.append(", projectId=").append(String.valueOf(this.projectId));
        sb.append(", serviceAccountKeyFileSecretId=")
                .append(String.valueOf(this.serviceAccountKeyFileSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof GoogleCloudStorageIcebergStorage)) {
            return false;
        }

        GoogleCloudStorageIcebergStorage other = (GoogleCloudStorageIcebergStorage) o;
        return java.util.Objects.equals(this.bucket, other.bucket)
                && java.util.Objects.equals(this.projectId, other.projectId)
                && java.util.Objects.equals(
                        this.serviceAccountKeyFileSecretId, other.serviceAccountKeyFileSecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.bucket == null ? 43 : this.bucket.hashCode());
        result = (result * PRIME) + (this.projectId == null ? 43 : this.projectId.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceAccountKeyFileSecretId == null
                                ? 43
                                : this.serviceAccountKeyFileSecretId.hashCode());
        return result;
    }
}
