/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * User-principal authentication and location details for creating an OCI Object Storage Spark
 * artifact location. Provide exactly one of {@code privateKeyFile} or {@code
 * privateKeyFileSecretId}. If the private key is passphrase-protected, provide at most one of
 * {@code privateKeyPassphrase} or {@code privateKeyPassphraseSecretId}. <br>
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
        builder = CreateSparkUserPrincipalOciObjectStorageConfigDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "authenticationType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateSparkUserPrincipalOciObjectStorageConfigDetails
        extends CreateSparkOciObjectStorageConfigDetails {
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
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * related OCI tenancy.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * related OCI tenancy.
         *
         * @param tenancyId the value to set
         * @return this builder
         */
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * OCI user whose API key is used to access the artifact location. If not provided it will
         * default to the current user.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userId")
        private String userId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * OCI user whose API key is used to access the artifact location. If not provided it will
         * default to the current user.
         *
         * @param userId the value to set
         * @return this builder
         */
        public Builder userId(String userId) {
            this.userId = userId;
            this.__explicitlySet__.add("userId");
            return this;
        }
        /**
         * The base64 encoded content of the private key file (PEM file) corresponding to the API
         * key of the fingerprint. See documentation:
         * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm
         * Deprecated: This field is deprecated and replaced by "privateKeyFileSecretId". This
         * change follows the GoldenGate "Plain Text Fields in Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateKeyFile")
        private char[] privateKeyFile;

        /**
         * The base64 encoded content of the private key file (PEM file) corresponding to the API
         * key of the fingerprint. See documentation:
         * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm
         * Deprecated: This field is deprecated and replaced by "privateKeyFileSecretId". This
         * change follows the GoldenGate "Plain Text Fields in Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         *
         * @param privateKeyFile the value to set
         * @return this builder
         */
        public Builder privateKeyFile(char[] privateKeyFile) {
            this.privateKeyFile = privateKeyFile;
            this.__explicitlySet__.add("privateKeyFile");
            return this;
        }

        public Builder privateKeyFile(String privateKeyFile) {
            this.privateKeyFile = privateKeyFile != null ? privateKeyFile.toCharArray() : null;
            this.__explicitlySet__.add("privateKeyFile");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the content of the private key file (PEM file) corresponding to the
         * API key of the fingerprint. See documentation:
         * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm Note:
         * When provided, 'privateKeyFile' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateKeyFileSecretId")
        private String privateKeyFileSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the content of the private key file (PEM file) corresponding to the
         * API key of the fingerprint. See documentation:
         * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm Note:
         * When provided, 'privateKeyFile' field must not be provided.
         *
         * @param privateKeyFileSecretId the value to set
         * @return this builder
         */
        public Builder privateKeyFileSecretId(String privateKeyFileSecretId) {
            this.privateKeyFileSecretId = privateKeyFileSecretId;
            this.__explicitlySet__.add("privateKeyFileSecretId");
            return this;
        }
        /**
         * The passphrase of the private key. Deprecated: This field is deprecated and replaced by
         * "privateKeyPassphraseSecretId". This change follows the GoldenGate "Plain Text Fields in
         * Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPassphrase")
        private char[] privateKeyPassphrase;

        /**
         * The passphrase of the private key. Deprecated: This field is deprecated and replaced by
         * "privateKeyPassphraseSecretId". This change follows the GoldenGate "Plain Text Fields in
         * Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         *
         * @param privateKeyPassphrase the value to set
         * @return this builder
         */
        public Builder privateKeyPassphrase(char[] privateKeyPassphrase) {
            this.privateKeyPassphrase = privateKeyPassphrase;
            this.__explicitlySet__.add("privateKeyPassphrase");
            return this;
        }

        public Builder privateKeyPassphrase(String privateKeyPassphrase) {
            this.privateKeyPassphrase =
                    privateKeyPassphrase != null ? privateKeyPassphrase.toCharArray() : null;
            this.__explicitlySet__.add("privateKeyPassphrase");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the passphrase of the private key. Note: When provided,
         * 'privateKeyPassphrase' field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPassphraseSecretId")
        private String privateKeyPassphraseSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the passphrase of the private key. Note: When provided,
         * 'privateKeyPassphrase' field must not be provided.
         *
         * @param privateKeyPassphraseSecretId the value to set
         * @return this builder
         */
        public Builder privateKeyPassphraseSecretId(String privateKeyPassphraseSecretId) {
            this.privateKeyPassphraseSecretId = privateKeyPassphraseSecretId;
            this.__explicitlySet__.add("privateKeyPassphraseSecretId");
            return this;
        }
        /**
         * The fingerprint of the API Key of the user specified by the userId. See documentation:
         * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm
         */
        @com.fasterxml.jackson.annotation.JsonProperty("publicKeyFingerprint")
        private String publicKeyFingerprint;

        /**
         * The fingerprint of the API Key of the user specified by the userId. See documentation:
         * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm
         *
         * @param publicKeyFingerprint the value to set
         * @return this builder
         */
        public Builder publicKeyFingerprint(String publicKeyFingerprint) {
            this.publicKeyFingerprint = publicKeyFingerprint;
            this.__explicitlySet__.add("publicKeyFingerprint");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSparkUserPrincipalOciObjectStorageConfigDetails build() {
            CreateSparkUserPrincipalOciObjectStorageConfigDetails model =
                    new CreateSparkUserPrincipalOciObjectStorageConfigDetails(
                            this.region,
                            this.namespace,
                            this.bucket,
                            this.path,
                            this.tenancyId,
                            this.userId,
                            this.privateKeyFile,
                            this.privateKeyFileSecretId,
                            this.privateKeyPassphrase,
                            this.privateKeyPassphraseSecretId,
                            this.publicKeyFingerprint);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSparkUserPrincipalOciObjectStorageConfigDetails model) {
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
            if (model.wasPropertyExplicitlySet("tenancyId")) {
                this.tenancyId(model.getTenancyId());
            }
            if (model.wasPropertyExplicitlySet("userId")) {
                this.userId(model.getUserId());
            }
            if (model.wasPropertyExplicitlySet("privateKeyFile")) {
                this.privateKeyFile(model.getPrivateKeyFile());
            }
            if (model.wasPropertyExplicitlySet("privateKeyFileSecretId")) {
                this.privateKeyFileSecretId(model.getPrivateKeyFileSecretId());
            }
            if (model.wasPropertyExplicitlySet("privateKeyPassphrase")) {
                this.privateKeyPassphrase(model.getPrivateKeyPassphrase());
            }
            if (model.wasPropertyExplicitlySet("privateKeyPassphraseSecretId")) {
                this.privateKeyPassphraseSecretId(model.getPrivateKeyPassphraseSecretId());
            }
            if (model.wasPropertyExplicitlySet("publicKeyFingerprint")) {
                this.publicKeyFingerprint(model.getPublicKeyFingerprint());
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
    public CreateSparkUserPrincipalOciObjectStorageConfigDetails(
            String region,
            String namespace,
            String bucket,
            String path,
            String tenancyId,
            String userId,
            String privateKeyFile,
            String privateKeyFileSecretId,
            String privateKeyPassphrase,
            String privateKeyPassphraseSecretId,
            String publicKeyFingerprint) {
        super();
        this.region = region;
        this.namespace = namespace;
        this.bucket = bucket;
        this.path = path;
        this.tenancyId = tenancyId;
        this.userId = userId;
        this.privateKeyFile = privateKeyFile != null ? privateKeyFile.toCharArray() : null;
        this.privateKeyFileSecretId = privateKeyFileSecretId;
        this.privateKeyPassphrase =
                privateKeyPassphrase != null ? privateKeyPassphrase.toCharArray() : null;
        this.privateKeyPassphraseSecretId = privateKeyPassphraseSecretId;
        this.publicKeyFingerprint = publicKeyFingerprint;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    public CreateSparkUserPrincipalOciObjectStorageConfigDetails(
            @com.fasterxml.jackson.annotation.JsonProperty("region") String region,
            @com.fasterxml.jackson.annotation.JsonProperty("namespace") String namespace,
            @com.fasterxml.jackson.annotation.JsonProperty("bucket") String bucket,
            @com.fasterxml.jackson.annotation.JsonProperty("path") String path,
            @com.fasterxml.jackson.annotation.JsonProperty("tenancyId") String tenancyId,
            @com.fasterxml.jackson.annotation.JsonProperty("userId") String userId,
            @com.fasterxml.jackson.annotation.JsonProperty("privateKeyFile") char[] privateKeyFile,
            @com.fasterxml.jackson.annotation.JsonProperty("privateKeyFileSecretId")
                    String privateKeyFileSecretId,
            @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPassphrase")
                    char[] privateKeyPassphrase,
            @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPassphraseSecretId")
                    String privateKeyPassphraseSecretId,
            @com.fasterxml.jackson.annotation.JsonProperty("publicKeyFingerprint")
                    String publicKeyFingerprint) {
        super();
        this.region = region;
        this.namespace = namespace;
        this.bucket = bucket;
        this.path = path;
        this.tenancyId = tenancyId;
        this.userId = userId;
        this.privateKeyFile = privateKeyFile;
        this.privateKeyFileSecretId = privateKeyFileSecretId;
        this.privateKeyPassphrase = privateKeyPassphrase;
        this.privateKeyPassphraseSecretId = privateKeyPassphraseSecretId;
        this.publicKeyFingerprint = publicKeyFingerprint;
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
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * related OCI tenancy.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * related OCI tenancy.
     *
     * @return the value
     */
    public String getTenancyId() {
        return tenancyId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OCI
     * user whose API key is used to access the artifact location. If not provided it will default
     * to the current user.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userId")
    private final String userId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the OCI
     * user whose API key is used to access the artifact location. If not provided it will default
     * to the current user.
     *
     * @return the value
     */
    public String getUserId() {
        return userId;
    }

    /**
     * The base64 encoded content of the private key file (PEM file) corresponding to the API key of
     * the fingerprint. See documentation:
     * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm Deprecated:
     * This field is deprecated and replaced by "privateKeyFileSecretId". This change follows the
     * GoldenGate "Plain Text Fields in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateKeyFile")
    private final char[] privateKeyFile;

    /**
     * The base64 encoded content of the private key file (PEM file) corresponding to the API key of
     * the fingerprint. See documentation:
     * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm Deprecated:
     * This field is deprecated and replaced by &quot;privateKeyFileSecretId&quot;. This change
     * follows the GoldenGate &quot;Plain Text Fields in Connections&quot; deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     * @deprecated Use getPrivateKeyFile__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getPrivateKeyFile() {
        return privateKeyFile != null ? new String(privateKeyFile) : null;
    }

    /**
     * The base64 encoded content of the private key file (PEM file) corresponding to the API key of
     * the fingerprint. See documentation:
     * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm Deprecated:
     * This field is deprecated and replaced by "privateKeyFileSecretId". This change follows the
     * GoldenGate "Plain Text Fields in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateKeyFile")
    public char[] getPrivateKeyFile__AsCharArray() {
        return privateKeyFile;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the content of the private key file (PEM file) corresponding to the API
     * key of the fingerprint. See documentation:
     * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm Note: When
     * provided, 'privateKeyFile' field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateKeyFileSecretId")
    private final String privateKeyFileSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the content of the private key file (PEM file) corresponding to the API
     * key of the fingerprint. See documentation:
     * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm Note: When
     * provided, 'privateKeyFile' field must not be provided.
     *
     * @return the value
     */
    public String getPrivateKeyFileSecretId() {
        return privateKeyFileSecretId;
    }

    /**
     * The passphrase of the private key. Deprecated: This field is deprecated and replaced by
     * "privateKeyPassphraseSecretId". This change follows the GoldenGate "Plain Text Fields in
     * Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPassphrase")
    private final char[] privateKeyPassphrase;

    /**
     * The passphrase of the private key. Deprecated: This field is deprecated and replaced by
     * &quot;privateKeyPassphraseSecretId&quot;. This change follows the GoldenGate &quot;Plain Text
     * Fields in Connections&quot; deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     * @deprecated Use getPrivateKeyPassphrase__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getPrivateKeyPassphrase() {
        return privateKeyPassphrase != null ? new String(privateKeyPassphrase) : null;
    }

    /**
     * The passphrase of the private key. Deprecated: This field is deprecated and replaced by
     * "privateKeyPassphraseSecretId". This change follows the GoldenGate "Plain Text Fields in
     * Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPassphrase")
    public char[] getPrivateKeyPassphrase__AsCharArray() {
        return privateKeyPassphrase;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the passphrase of the private key. Note: When provided,
     * 'privateKeyPassphrase' field must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("privateKeyPassphraseSecretId")
    private final String privateKeyPassphraseSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the passphrase of the private key. Note: When provided,
     * 'privateKeyPassphrase' field must not be provided.
     *
     * @return the value
     */
    public String getPrivateKeyPassphraseSecretId() {
        return privateKeyPassphraseSecretId;
    }

    /**
     * The fingerprint of the API Key of the user specified by the userId. See documentation:
     * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm
     */
    @com.fasterxml.jackson.annotation.JsonProperty("publicKeyFingerprint")
    private final String publicKeyFingerprint;

    /**
     * The fingerprint of the API Key of the user specified by the userId. See documentation:
     * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm
     *
     * @return the value
     */
    public String getPublicKeyFingerprint() {
        return publicKeyFingerprint;
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
        sb.append("CreateSparkUserPrincipalOciObjectStorageConfigDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", bucket=").append(String.valueOf(this.bucket));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(", userId=").append(String.valueOf(this.userId));
        sb.append(", privateKeyFile=").append("<redacted>");
        sb.append(", privateKeyFileSecretId=").append(String.valueOf(this.privateKeyFileSecretId));
        sb.append(", privateKeyPassphrase=").append("<redacted>");
        sb.append(", privateKeyPassphraseSecretId=")
                .append(String.valueOf(this.privateKeyPassphraseSecretId));
        sb.append(", publicKeyFingerprint=").append(String.valueOf(this.publicKeyFingerprint));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSparkUserPrincipalOciObjectStorageConfigDetails)) {
            return false;
        }

        CreateSparkUserPrincipalOciObjectStorageConfigDetails other =
                (CreateSparkUserPrincipalOciObjectStorageConfigDetails) o;
        return java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.bucket, other.bucket)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.userId, other.userId)
                && java.util.Objects.equals(this.privateKeyFile, other.privateKeyFile)
                && java.util.Objects.equals(
                        this.privateKeyFileSecretId, other.privateKeyFileSecretId)
                && java.util.Objects.equals(this.privateKeyPassphrase, other.privateKeyPassphrase)
                && java.util.Objects.equals(
                        this.privateKeyPassphraseSecretId, other.privateKeyPassphraseSecretId)
                && java.util.Objects.equals(this.publicKeyFingerprint, other.publicKeyFingerprint)
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
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result = (result * PRIME) + (this.userId == null ? 43 : this.userId.hashCode());
        result =
                (result * PRIME)
                        + (this.privateKeyFile == null ? 43 : this.privateKeyFile.hashCode());
        result =
                (result * PRIME)
                        + (this.privateKeyFileSecretId == null
                                ? 43
                                : this.privateKeyFileSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.privateKeyPassphrase == null
                                ? 43
                                : this.privateKeyPassphrase.hashCode());
        result =
                (result * PRIME)
                        + (this.privateKeyPassphraseSecretId == null
                                ? 43
                                : this.privateKeyPassphraseSecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.publicKeyFingerprint == null
                                ? 43
                                : this.publicKeyFingerprint.hashCode());
        return result;
    }
}
