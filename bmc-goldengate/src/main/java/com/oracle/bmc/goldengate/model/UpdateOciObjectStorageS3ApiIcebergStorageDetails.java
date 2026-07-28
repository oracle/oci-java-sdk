/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information to update the OCI Object Storage (S3 Compatibility API) configuration used by the
 * Iceberg connection. <br>
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
        builder = UpdateOciObjectStorageS3ApiIcebergStorageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "storageType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateOciObjectStorageS3ApiIcebergStorageDetails
        extends UpdateIcebergStorageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * OCI Object Storage S3 Compatibility API endpoint URL. Format:
         * "https://<namespace>.compat.objectstorage.<region>.<domain>" Example:
         * "https://mynamespace.compat.objectstorage.us-ashburn-1.oraclecloud.com"
         */
        @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
        private String endpoint;

        /**
         * OCI Object Storage S3 Compatibility API endpoint URL. Format:
         * "https://<namespace>.compat.objectstorage.<region>.<domain>" Example:
         * "https://mynamespace.compat.objectstorage.us-ashburn-1.oraclecloud.com"
         *
         * @param endpoint the value to set
         * @return this builder
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            this.__explicitlySet__.add("endpoint");
            return this;
        }
        /**
         * Access Key ID from the OCI IAM user's Customer Secret Key pair used to authenticate to
         * OCI Object Storage via the S3 Compatibility API.
         *
         * <p>Note: Despite the "Id" suffix, this value is not an OCI OCID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accessKeyId")
        private String accessKeyId;

        /**
         * Access Key ID from the OCI IAM user's Customer Secret Key pair used to authenticate to
         * OCI Object Storage via the S3 Compatibility API.
         *
         * <p>Note: Despite the "Id" suffix, this value is not an OCI OCID.
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
         * Secret where the Secret Access Key used for OCI Object Storage S3 Compatibility
         * authentication.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKeySecretId")
        private String secretAccessKeySecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret where the Secret Access Key used for OCI Object Storage S3 Compatibility
         * authentication.
         *
         * @param secretAccessKeySecretId the value to set
         * @return this builder
         */
        public Builder secretAccessKeySecretId(String secretAccessKeySecretId) {
            this.secretAccessKeySecretId = secretAccessKeySecretId;
            this.__explicitlySet__.add("secretAccessKeySecretId");
            return this;
        }
        /**
         * Secret Access Key from the OCI IAM user's Customer Secret Key pair used to authenticate
         * to OCI Object Storage via the S3 Compatibility API. Deprecated: This field is deprecated
         * and replaced by "secretAccessKeySecretId". This change follows the GoldenGate "Plain Text
         * Fields in Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKey")
        private char[] secretAccessKey;

        /**
         * Secret Access Key from the OCI IAM user's Customer Secret Key pair used to authenticate
         * to OCI Object Storage via the S3 Compatibility API. Deprecated: This field is deprecated
         * and replaced by "secretAccessKeySecretId". This change follows the GoldenGate "Plain Text
         * Fields in Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         *
         * @param secretAccessKey the value to set
         * @return this builder
         */
        public Builder secretAccessKey(char[] secretAccessKey) {
            this.secretAccessKey = secretAccessKey;
            this.__explicitlySet__.add("secretAccessKey");
            return this;
        }

        public Builder secretAccessKey(String secretAccessKey) {
            this.secretAccessKey = secretAccessKey != null ? secretAccessKey.toCharArray() : null;
            this.__explicitlySet__.add("secretAccessKey");
            return this;
        }
        /**
         * Target OCI Object Storage bucket name where Iceberg stores table metadata and data files.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bucket")
        private String bucket;

        /**
         * Target OCI Object Storage bucket name where Iceberg stores table metadata and data files.
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

        public UpdateOciObjectStorageS3ApiIcebergStorageDetails build() {
            UpdateOciObjectStorageS3ApiIcebergStorageDetails model =
                    new UpdateOciObjectStorageS3ApiIcebergStorageDetails(
                            this.endpoint,
                            this.accessKeyId,
                            this.secretAccessKeySecretId,
                            this.secretAccessKey,
                            this.bucket);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOciObjectStorageS3ApiIcebergStorageDetails model) {
            if (model.wasPropertyExplicitlySet("endpoint")) {
                this.endpoint(model.getEndpoint());
            }
            if (model.wasPropertyExplicitlySet("accessKeyId")) {
                this.accessKeyId(model.getAccessKeyId());
            }
            if (model.wasPropertyExplicitlySet("secretAccessKeySecretId")) {
                this.secretAccessKeySecretId(model.getSecretAccessKeySecretId());
            }
            if (model.wasPropertyExplicitlySet("secretAccessKey")) {
                this.secretAccessKey(model.getSecretAccessKey());
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
    public UpdateOciObjectStorageS3ApiIcebergStorageDetails(
            String endpoint,
            String accessKeyId,
            String secretAccessKeySecretId,
            String secretAccessKey,
            String bucket) {
        super();
        this.endpoint = endpoint;
        this.accessKeyId = accessKeyId;
        this.secretAccessKeySecretId = secretAccessKeySecretId;
        this.secretAccessKey = secretAccessKey != null ? secretAccessKey.toCharArray() : null;
        this.bucket = bucket;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    public UpdateOciObjectStorageS3ApiIcebergStorageDetails(
            @com.fasterxml.jackson.annotation.JsonProperty("endpoint") String endpoint,
            @com.fasterxml.jackson.annotation.JsonProperty("accessKeyId") String accessKeyId,
            @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKeySecretId")
                    String secretAccessKeySecretId,
            @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKey")
                    char[] secretAccessKey,
            @com.fasterxml.jackson.annotation.JsonProperty("bucket") String bucket) {
        super();
        this.endpoint = endpoint;
        this.accessKeyId = accessKeyId;
        this.secretAccessKeySecretId = secretAccessKeySecretId;
        this.secretAccessKey = secretAccessKey;
        this.bucket = bucket;
    }

    /**
     * OCI Object Storage S3 Compatibility API endpoint URL. Format:
     * "https://<namespace>.compat.objectstorage.<region>.<domain>" Example:
     * "https://mynamespace.compat.objectstorage.us-ashburn-1.oraclecloud.com"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("endpoint")
    private final String endpoint;

    /**
     * OCI Object Storage S3 Compatibility API endpoint URL. Format:
     * "https://<namespace>.compat.objectstorage.<region>.<domain>" Example:
     * "https://mynamespace.compat.objectstorage.us-ashburn-1.oraclecloud.com"
     *
     * @return the value
     */
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * Access Key ID from the OCI IAM user's Customer Secret Key pair used to authenticate to OCI
     * Object Storage via the S3 Compatibility API.
     *
     * <p>Note: Despite the "Id" suffix, this value is not an OCI OCID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessKeyId")
    private final String accessKeyId;

    /**
     * Access Key ID from the OCI IAM user's Customer Secret Key pair used to authenticate to OCI
     * Object Storage via the S3 Compatibility API.
     *
     * <p>Note: Despite the "Id" suffix, this value is not an OCI OCID.
     *
     * @return the value
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the Secret Access Key used for OCI Object Storage S3 Compatibility
     * authentication.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKeySecretId")
    private final String secretAccessKeySecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret where the Secret Access Key used for OCI Object Storage S3 Compatibility
     * authentication.
     *
     * @return the value
     */
    public String getSecretAccessKeySecretId() {
        return secretAccessKeySecretId;
    }

    /**
     * Secret Access Key from the OCI IAM user's Customer Secret Key pair used to authenticate to
     * OCI Object Storage via the S3 Compatibility API. Deprecated: This field is deprecated and
     * replaced by "secretAccessKeySecretId". This change follows the GoldenGate "Plain Text Fields
     * in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKey")
    private final char[] secretAccessKey;

    /**
     * Secret Access Key from the OCI IAM user&#39;s Customer Secret Key pair used to authenticate
     * to OCI Object Storage via the S3 Compatibility API. Deprecated: This field is deprecated and
     * replaced by &quot;secretAccessKeySecretId&quot;. This change follows the GoldenGate
     * &quot;Plain Text Fields in Connections&quot; deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     * @deprecated Use getSecretAccessKey__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getSecretAccessKey() {
        return secretAccessKey != null ? new String(secretAccessKey) : null;
    }

    /**
     * Secret Access Key from the OCI IAM user's Customer Secret Key pair used to authenticate to
     * OCI Object Storage via the S3 Compatibility API. Deprecated: This field is deprecated and
     * replaced by "secretAccessKeySecretId". This change follows the GoldenGate "Plain Text Fields
     * in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKey")
    public char[] getSecretAccessKey__AsCharArray() {
        return secretAccessKey;
    }

    /** Target OCI Object Storage bucket name where Iceberg stores table metadata and data files. */
    @com.fasterxml.jackson.annotation.JsonProperty("bucket")
    private final String bucket;

    /**
     * Target OCI Object Storage bucket name where Iceberg stores table metadata and data files.
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
        sb.append("UpdateOciObjectStorageS3ApiIcebergStorageDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", endpoint=").append(String.valueOf(this.endpoint));
        sb.append(", accessKeyId=").append(String.valueOf(this.accessKeyId));
        sb.append(", secretAccessKeySecretId=")
                .append(String.valueOf(this.secretAccessKeySecretId));
        sb.append(", secretAccessKey=").append("<redacted>");
        sb.append(", bucket=").append(String.valueOf(this.bucket));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOciObjectStorageS3ApiIcebergStorageDetails)) {
            return false;
        }

        UpdateOciObjectStorageS3ApiIcebergStorageDetails other =
                (UpdateOciObjectStorageS3ApiIcebergStorageDetails) o;
        return java.util.Objects.equals(this.endpoint, other.endpoint)
                && java.util.Objects.equals(this.accessKeyId, other.accessKeyId)
                && java.util.Objects.equals(
                        this.secretAccessKeySecretId, other.secretAccessKeySecretId)
                && java.util.Objects.equals(this.secretAccessKey, other.secretAccessKey)
                && java.util.Objects.equals(this.bucket, other.bucket)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.endpoint == null ? 43 : this.endpoint.hashCode());
        result = (result * PRIME) + (this.accessKeyId == null ? 43 : this.accessKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.secretAccessKeySecretId == null
                                ? 43
                                : this.secretAccessKeySecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.secretAccessKey == null ? 43 : this.secretAccessKey.hashCode());
        result = (result * PRIME) + (this.bucket == null ? 43 : this.bucket.hashCode());
        return result;
    }
}
