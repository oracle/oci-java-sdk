/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Secret-key authentication and location details for updating an OCI Object Storage Spark artifact
 * location. When updating the secret key, provide exactly one of {@code secretAccessKey} or {@code
 * secretAccessKeySecretId}. <br>
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
        builder = UpdateSparkSecretKeyOciObjectStorageConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "authenticationType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateSparkSecretKeyOciObjectStorageConfigDetails
        extends UpdateSparkOciObjectStorageConfigDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The name of the region. e.g.: us-ashburn-1 If the region is not provided, backend will
         * default to the current region.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("region")
        private String region;

        /**
         * The name of the region. e.g.: us-ashburn-1 If the region is not provided, backend will
         * default to the current region.
         *
         * @param region the value to set
         * @return this builder
         */
        public Builder region(String region) {
            this.region = region;
            this.__explicitlySet__.add("region");
            return this;
        }
        /** The OCI Object Storage namespace containing the bucket. Example: "mynamespace" */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The OCI Object Storage namespace containing the bucket. Example: "mynamespace"
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /** Bucket containing Spark application artifacts. Example: "spark-artifacts" */
        @com.fasterxml.jackson.annotation.JsonProperty("bucket")
        private String bucket;

        /**
         * Bucket containing Spark application artifacts. Example: "spark-artifacts"
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
         * Object path used for Spark application artifacts. Example:
         * "spark-apps/order-analysis/1.2.0"
         */
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * Object path used for Spark application artifacts. Example:
         * "spark-apps/order-analysis/1.2.0"
         *
         * @param path the value to set
         * @return this builder
         */
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /**
         * Access key identifier used for OCI Object Storage secret-key authentication. Note:
         * Despite the "Id" suffix, this value is not an OCI OCID.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accessKeyId")
        private String accessKeyId;

        /**
         * Access key identifier used for OCI Object Storage secret-key authentication. Note:
         * Despite the "Id" suffix, this value is not an OCI OCID.
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
         * Secret access key used for OCI Object Storage secret-key authentication. Deprecated: This
         * field is deprecated and replaced by "secretAccessKeySecretId". This change follows the
         * GoldenGate "Plain Text Fields in Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKey")
        private char[] secretAccessKey;

        /**
         * Secret access key used for OCI Object Storage secret-key authentication. Deprecated: This
         * field is deprecated and replaced by "secretAccessKeySecretId". This change follows the
         * GoldenGate "Plain Text Fields in Connections" deprecation:
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the secret access key. Note: When provided, {@code secretAccessKey}
         * must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKeySecretId")
        private String secretAccessKeySecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the secret access key. Note: When provided, {@code secretAccessKey}
         * must not be provided.
         *
         * @param secretAccessKeySecretId the value to set
         * @return this builder
         */
        public Builder secretAccessKeySecretId(String secretAccessKeySecretId) {
            this.secretAccessKeySecretId = secretAccessKeySecretId;
            this.__explicitlySet__.add("secretAccessKeySecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSparkSecretKeyOciObjectStorageConfigDetails build() {
            UpdateSparkSecretKeyOciObjectStorageConfigDetails model =
                    new UpdateSparkSecretKeyOciObjectStorageConfigDetails(
                            this.region,
                            this.namespace,
                            this.bucket,
                            this.path,
                            this.accessKeyId,
                            this.secretAccessKey,
                            this.secretAccessKeySecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSparkSecretKeyOciObjectStorageConfigDetails model) {
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("bucket")) {
                this.bucket(model.getBucket());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("accessKeyId")) {
                this.accessKeyId(model.getAccessKeyId());
            }
            if (model.wasPropertyExplicitlySet("secretAccessKey")) {
                this.secretAccessKey(model.getSecretAccessKey());
            }
            if (model.wasPropertyExplicitlySet("secretAccessKeySecretId")) {
                this.secretAccessKeySecretId(model.getSecretAccessKeySecretId());
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
    public UpdateSparkSecretKeyOciObjectStorageConfigDetails(
            String region,
            String namespace,
            String bucket,
            String path,
            String accessKeyId,
            String secretAccessKey,
            String secretAccessKeySecretId) {
        super();
        this.region = region;
        this.namespace = namespace;
        this.bucket = bucket;
        this.path = path;
        this.accessKeyId = accessKeyId;
        this.secretAccessKey = secretAccessKey != null ? secretAccessKey.toCharArray() : null;
        this.secretAccessKeySecretId = secretAccessKeySecretId;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    public UpdateSparkSecretKeyOciObjectStorageConfigDetails(
            @com.fasterxml.jackson.annotation.JsonProperty("region") String region,
            @com.fasterxml.jackson.annotation.JsonProperty("namespace") String namespace,
            @com.fasterxml.jackson.annotation.JsonProperty("bucket") String bucket,
            @com.fasterxml.jackson.annotation.JsonProperty("path") String path,
            @com.fasterxml.jackson.annotation.JsonProperty("accessKeyId") String accessKeyId,
            @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKey")
                    char[] secretAccessKey,
            @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKeySecretId")
                    String secretAccessKeySecretId) {
        super();
        this.region = region;
        this.namespace = namespace;
        this.bucket = bucket;
        this.path = path;
        this.accessKeyId = accessKeyId;
        this.secretAccessKey = secretAccessKey;
        this.secretAccessKeySecretId = secretAccessKeySecretId;
    }

    /**
     * The name of the region. e.g.: us-ashburn-1 If the region is not provided, backend will
     * default to the current region.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("region")
    private final String region;

    /**
     * The name of the region. e.g.: us-ashburn-1 If the region is not provided, backend will
     * default to the current region.
     *
     * @return the value
     */
    public String getRegion() {
        return region;
    }

    /** The OCI Object Storage namespace containing the bucket. Example: "mynamespace" */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The OCI Object Storage namespace containing the bucket. Example: "mynamespace"
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /** Bucket containing Spark application artifacts. Example: "spark-artifacts" */
    @com.fasterxml.jackson.annotation.JsonProperty("bucket")
    private final String bucket;

    /**
     * Bucket containing Spark application artifacts. Example: "spark-artifacts"
     *
     * @return the value
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * Object path used for Spark application artifacts. Example: "spark-apps/order-analysis/1.2.0"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * Object path used for Spark application artifacts. Example: "spark-apps/order-analysis/1.2.0"
     *
     * @return the value
     */
    public String getPath() {
        return path;
    }

    /**
     * Access key identifier used for OCI Object Storage secret-key authentication. Note: Despite
     * the "Id" suffix, this value is not an OCI OCID.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accessKeyId")
    private final String accessKeyId;

    /**
     * Access key identifier used for OCI Object Storage secret-key authentication. Note: Despite
     * the "Id" suffix, this value is not an OCI OCID.
     *
     * @return the value
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    /**
     * Secret access key used for OCI Object Storage secret-key authentication. Deprecated: This
     * field is deprecated and replaced by "secretAccessKeySecretId". This change follows the
     * GoldenGate "Plain Text Fields in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKey")
    private final char[] secretAccessKey;

    /**
     * Secret access key used for OCI Object Storage secret-key authentication. Deprecated: This
     * field is deprecated and replaced by &quot;secretAccessKeySecretId&quot;. This change follows
     * the GoldenGate &quot;Plain Text Fields in Connections&quot; deprecation:
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
     * Secret access key used for OCI Object Storage secret-key authentication. Deprecated: This
     * field is deprecated and replaced by "secretAccessKeySecretId". This change follows the
     * GoldenGate "Plain Text Fields in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKey")
    public char[] getSecretAccessKey__AsCharArray() {
        return secretAccessKey;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the secret access key. Note: When provided, {@code secretAccessKey} must
     * not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKeySecretId")
    private final String secretAccessKeySecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the secret access key. Note: When provided, {@code secretAccessKey} must
     * not be provided.
     *
     * @return the value
     */
    public String getSecretAccessKeySecretId() {
        return secretAccessKeySecretId;
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
        sb.append("UpdateSparkSecretKeyOciObjectStorageConfigDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", bucket=").append(String.valueOf(this.bucket));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", accessKeyId=").append(String.valueOf(this.accessKeyId));
        sb.append(", secretAccessKey=").append("<redacted>");
        sb.append(", secretAccessKeySecretId=")
                .append(String.valueOf(this.secretAccessKeySecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateSparkSecretKeyOciObjectStorageConfigDetails)) {
            return false;
        }

        UpdateSparkSecretKeyOciObjectStorageConfigDetails other =
                (UpdateSparkSecretKeyOciObjectStorageConfigDetails) o;
        return java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.bucket, other.bucket)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.accessKeyId, other.accessKeyId)
                && java.util.Objects.equals(this.secretAccessKey, other.secretAccessKey)
                && java.util.Objects.equals(
                        this.secretAccessKeySecretId, other.secretAccessKeySecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.bucket == null ? 43 : this.bucket.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result = (result * PRIME) + (this.accessKeyId == null ? 43 : this.accessKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.secretAccessKey == null ? 43 : this.secretAccessKey.hashCode());
        result =
                (result * PRIME)
                        + (this.secretAccessKeySecretId == null
                                ? 43
                                : this.secretAccessKeySecretId.hashCode());
        return result;
    }
}
