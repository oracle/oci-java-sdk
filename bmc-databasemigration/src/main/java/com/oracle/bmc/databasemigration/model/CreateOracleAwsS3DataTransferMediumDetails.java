/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * AWS S3 bucket details used for source Connection resources with RDS_ORACLE type. Only supported
 * for source Connection resources with RDS_ORACLE type. <br>
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
        builder = CreateOracleAwsS3DataTransferMediumDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateOracleAwsS3DataTransferMediumDetails
        extends CreateOracleDataTransferMediumDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** S3 bucket name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * S3 bucket name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * AWS region code where the S3 bucket is located. Region code should match the documented
         * available regions:
         * https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions
         */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * AWS region code where the S3 bucket is located. Region code should match the documented
         * available regions:
         * https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /**
         * AWS access key credentials identifier Details:
         * https://docs.aws.amazon.com/general/latest/gr/aws-sec-cred-types.html#access-keys-and-secret-access-keys
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accessKeyId")
        private String accessKeyId;

        /**
         * AWS access key credentials identifier Details:
         * https://docs.aws.amazon.com/general/latest/gr/aws-sec-cred-types.html#access-keys-and-secret-access-keys
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
         * AWS secret access key credentials Details:
         * https://docs.aws.amazon.com/general/latest/gr/aws-sec-cred-types.html#access-keys-and-secret-access-keys
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKey")
        private String secretAccessKey;

        /**
         * AWS secret access key credentials Details:
         * https://docs.aws.amazon.com/general/latest/gr/aws-sec-cred-types.html#access-keys-and-secret-access-keys
         *
         * @param secretAccessKey the value to set
         * @return this builder
         */
        public Builder secretAccessKey(String secretAccessKey) {
            this.secretAccessKey = secretAccessKey;
            this.__explicitlySet__.add("secretAccessKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("objectStorageBucket")
        private ObjectStoreBucket objectStorageBucket;

        public Builder objectStorageBucket(ObjectStoreBucket objectStorageBucket) {
            this.objectStorageBucket = objectStorageBucket;
            this.__explicitlySet__.add("objectStorageBucket");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateOracleAwsS3DataTransferMediumDetails build() {
            CreateOracleAwsS3DataTransferMediumDetails model =
                    new CreateOracleAwsS3DataTransferMediumDetails(
                            this.name,
                            this.region,
                            this.accessKeyId,
                            this.secretAccessKey,
                            this.objectStorageBucket);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateOracleAwsS3DataTransferMediumDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("accessKeyId")) {
                this.accessKeyId(model.getAccessKeyId());
            }
            if (model.wasPropertyExplicitlySet("secretAccessKey")) {
                this.secretAccessKey(model.getSecretAccessKey());
            }
            if (model.wasPropertyExplicitlySet("objectStorageBucket")) {
                this.objectStorageBucket(model.getObjectStorageBucket());
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
    public CreateOracleAwsS3DataTransferMediumDetails(
            String name,
            String region,
            String accessKeyId,
            String secretAccessKey,
            ObjectStoreBucket objectStorageBucket) {
        super();
        this.name = name;
        this.region = region;
        this.accessKeyId = accessKeyId;
        this.secretAccessKey = secretAccessKey;
        this.objectStorageBucket = objectStorageBucket;
    }

    /** S3 bucket name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * S3 bucket name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * AWS region code where the S3 bucket is located. Region code should match the documented
     * available regions:
     * https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions
     */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * AWS region code where the S3 bucket is located. Region code should match the documented
     * available regions:
     * https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/using-regions-availability-zones.html#concepts-available-regions
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /**
     * AWS access key credentials identifier Details:
     * https://docs.aws.amazon.com/general/latest/gr/aws-sec-cred-types.html#access-keys-and-secret-access-keys
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessKeyId")
    private final String accessKeyId;

    /**
     * AWS access key credentials identifier Details:
     * https://docs.aws.amazon.com/general/latest/gr/aws-sec-cred-types.html#access-keys-and-secret-access-keys
     *
     * @return the value
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    /**
     * AWS secret access key credentials Details:
     * https://docs.aws.amazon.com/general/latest/gr/aws-sec-cred-types.html#access-keys-and-secret-access-keys
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKey")
    private final String secretAccessKey;

    /**
     * AWS secret access key credentials Details:
     * https://docs.aws.amazon.com/general/latest/gr/aws-sec-cred-types.html#access-keys-and-secret-access-keys
     *
     * @return the value
     */
    public String getSecretAccessKey() {
        return secretAccessKey;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("objectStorageBucket")
    private final ObjectStoreBucket objectStorageBucket;

    public ObjectStoreBucket getObjectStorageBucket() {
        return objectStorageBucket;
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
        sb.append("CreateOracleAwsS3DataTransferMediumDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", accessKeyId=").append("<redacted>");
        sb.append(", secretAccessKey=").append("<redacted>");
        sb.append(", objectStorageBucket=").append(String.valueOf(this.objectStorageBucket));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateOracleAwsS3DataTransferMediumDetails)) {
            return false;
        }

        CreateOracleAwsS3DataTransferMediumDetails other =
                (CreateOracleAwsS3DataTransferMediumDetails) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.accessKeyId, other.accessKeyId)
                && java.util.Objects.equals(this.secretAccessKey, other.secretAccessKey)
                && java.util.Objects.equals(this.objectStorageBucket, other.objectStorageBucket)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.accessKeyId == null ? 43 : this.accessKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.secretAccessKey == null ? 43 : this.secretAccessKey.hashCode());
        result =
                (result * PRIME)
                        + (this.objectStorageBucket == null
                                ? 43
                                : this.objectStorageBucket.hashCode());
        return result;
    }
}
