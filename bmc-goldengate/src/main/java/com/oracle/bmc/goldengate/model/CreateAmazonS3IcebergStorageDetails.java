/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information about a new Amazon S3 storage used in the Iceberg connection. <br>
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
        builder = CreateAmazonS3IcebergStorageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "storageType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateAmazonS3IcebergStorageDetails extends CreateIcebergStorageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The scheme of the storage. */
        @com.fasterxml.jackson.annotation.JsonProperty("schemeType")
        private AmazonS3IcebergStorage.SchemeType schemeType;

        /**
         * The scheme of the storage.
         *
         * @param schemeType the value to set
         * @return this builder
         */
        public Builder schemeType(AmazonS3IcebergStorage.SchemeType schemeType) {
            this.schemeType = schemeType;
            this.__explicitlySet__.add("schemeType");
            return this;
        }
        /** The endpoint URL of the Amazon S3 storage service. e.g.: 'https://s3.amazonaws.com' */
        @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
        private String endpoint;

        /**
         * The endpoint URL of the Amazon S3 storage service. e.g.: 'https://s3.amazonaws.com'
         *
         * @param endpoint the value to set
         * @return this builder
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            this.__explicitlySet__.add("endpoint");
            return this;
        }
        /** Access key ID to access the Amazon S3 bucket. */
        @com.fasterxml.jackson.annotation.JsonProperty("accessKeyId")
        private String accessKeyId;

        /**
         * Access key ID to access the Amazon S3 bucket.
         *
         * @param accessKeyId the value to set
         * @return this builder
         */
        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            this.__explicitlySet__.add("accessKeyId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the Secret Access Key is stored.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKeySecretId")
        private String secretAccessKeySecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the Secret Access Key is stored.
         *
         * @param secretAccessKeySecretId the value to set
         * @return this builder
         */
        public Builder secretAccessKeySecretId(String secretAccessKeySecretId) {
            this.secretAccessKeySecretId = secretAccessKeySecretId;
            this.__explicitlySet__.add("secretAccessKeySecretId");
            return this;
        }
        /** The AMAZON region where the S3 bucket is hosted. e.g.: 'us-east-2' */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The AMAZON region where the S3 bucket is hosted. e.g.: 'us-east-2'
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /** S3 bucket where Iceberg stores metadata and data files. */
        @com.fasterxml.jackson.annotation.JsonProperty("bucket")
        private String bucket;

        /**
         * S3 bucket where Iceberg stores metadata and data files.
         *
         * @param bucket the value to set
         * @return this builder
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            this.__explicitlySet__.add("bucket");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAmazonS3IcebergStorageDetails build() {
            CreateAmazonS3IcebergStorageDetails model =
                    new CreateAmazonS3IcebergStorageDetails(
                            this.schemeType,
                            this.endpoint,
                            this.accessKeyId,
                            this.secretAccessKeySecretId,
                            this.region,
                            this.bucket);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateAmazonS3IcebergStorageDetails model) {
            if (model.wasPropertyExplicitlySet("schemeType")) {
                this.schemeType(model.getSchemeType());
            }
            if (model.wasPropertyExplicitlySet("endpoint")) {
                this.endpoint(model.getEndpoint());
            }
            if (model.wasPropertyExplicitlySet("accessKeyId")) {
                this.accessKeyId(model.getAccessKeyId());
            }
            if (model.wasPropertyExplicitlySet("secretAccessKeySecretId")) {
                this.secretAccessKeySecretId(model.getSecretAccessKeySecretId());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("bucket")) {
                this.bucket(model.getBucket());
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
    public CreateAmazonS3IcebergStorageDetails(
            AmazonS3IcebergStorage.SchemeType schemeType,
            String endpoint,
            String accessKeyId,
            String secretAccessKeySecretId,
            String region,
            String bucket) {
        super();
        this.schemeType = schemeType;
        this.endpoint = endpoint;
        this.accessKeyId = accessKeyId;
        this.secretAccessKeySecretId = secretAccessKeySecretId;
        this.region = region;
        this.bucket = bucket;
    }

    /** The scheme of the storage. */
    @com.fasterxml.jackson.annotation.JsonProperty("schemeType")
    private final AmazonS3IcebergStorage.SchemeType schemeType;

    /**
     * The scheme of the storage.
     *
     * @return the value
     */
    public AmazonS3IcebergStorage.SchemeType getSchemeType() {
        return schemeType;
    }

    /** The endpoint URL of the Amazon S3 storage service. e.g.: 'https://s3.amazonaws.com' */
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    private final String endpoint;

    /**
     * The endpoint URL of the Amazon S3 storage service. e.g.: 'https://s3.amazonaws.com'
     *
     * @return the value
     */
    public String getEndpoint() {
        return endpoint;
    }

    /** Access key ID to access the Amazon S3 bucket. */
    @com.fasterxml.jackson.annotation.JsonProperty("accessKeyId")
    private final String accessKeyId;

    /**
     * Access key ID to access the Amazon S3 bucket.
     *
     * @return the value
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the Secret Access Key is stored.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKeySecretId")
    private final String secretAccessKeySecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the Secret Access Key is stored.
     *
     * @return the value
     */
    public String getSecretAccessKeySecretId() {
        return secretAccessKeySecretId;
    }

    /** The AMAZON region where the S3 bucket is hosted. e.g.: 'us-east-2' */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The AMAZON region where the S3 bucket is hosted. e.g.: 'us-east-2'
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /** S3 bucket where Iceberg stores metadata and data files. */
    @com.fasterxml.jackson.annotation.JsonProperty("bucket")
    private final String bucket;

    /**
     * S3 bucket where Iceberg stores metadata and data files.
     *
     * @return the value
     */
    public String getBucket() {
        return bucket;
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
        sb.append("CreateAmazonS3IcebergStorageDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", schemeType=").append(String.valueOf(this.schemeType));
        sb.append(", endpoint=").append(String.valueOf(this.endpoint));
        sb.append(", accessKeyId=").append(String.valueOf(this.accessKeyId));
        sb.append(", secretAccessKeySecretId=")
                .append(String.valueOf(this.secretAccessKeySecretId));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", bucket=").append(String.valueOf(this.bucket));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAmazonS3IcebergStorageDetails)) {
            return false;
        }

        CreateAmazonS3IcebergStorageDetails other = (CreateAmazonS3IcebergStorageDetails) o;
        return java.util.Objects.equals(this.schemeType, other.schemeType)
                && java.util.Objects.equals(this.endpoint, other.endpoint)
                && java.util.Objects.equals(this.accessKeyId, other.accessKeyId)
                && java.util.Objects.equals(
                        this.secretAccessKeySecretId, other.secretAccessKeySecretId)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.bucket, other.bucket)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.schemeType == null ? 43 : this.schemeType.hashCode());
        result = (result * PRIME) + (this.endpoint == null ? 43 : this.endpoint.hashCode());
        result = (result * PRIME) + (this.accessKeyId == null ? 43 : this.accessKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.secretAccessKeySecretId == null
                                ? 43
                                : this.secretAccessKeySecretId.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.bucket == null ? 43 : this.bucket.hashCode());
        return result;
    }
}
