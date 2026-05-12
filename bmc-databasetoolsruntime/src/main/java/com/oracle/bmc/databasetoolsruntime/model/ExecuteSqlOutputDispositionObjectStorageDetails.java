/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * Describes how the result of a statement is stored in Object Storage <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExecuteSqlOutputDispositionObjectStorageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExecuteSqlOutputDispositionObjectStorageDetails
        extends ExecuteSqlOutputDispositionDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the object storage namespace */
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * The name of the object storage namespace
         *
         * @param namespace the value to set
         * @return this builder
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /** The name of the object storage bucket */
        @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
        private String bucketName;

        /**
         * The name of the object storage bucket
         *
         * @param bucketName the value to set
         * @return this builder
         */
        public Builder bucketName(String bucketName) {
            this.bucketName = bucketName;
            this.__explicitlySet__.add("bucketName");
            return this;
        }
        /**
         * The name of the object template (can contain statementId placeholder, for example;
         * query_{statementId}.csv )
         */
        @com.fasterxml.jackson.annotation.JsonProperty("objectName")
        private String objectName;

        /**
         * The name of the object template (can contain statementId placeholder, for example;
         * query_{statementId}.csv )
         *
         * @param objectName the value to set
         * @return this builder
         */
        public Builder objectName(String objectName) {
            this.objectName = objectName;
            this.__explicitlySet__.add("objectName");
            return this;
        }
        /** The content type */
        @com.fasterxml.jackson.annotation.JsonProperty("contentType")
        private String contentType;

        /**
         * The content type
         *
         * @param contentType the value to set
         * @return this builder
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            this.__explicitlySet__.add("contentType");
            return this;
        }
        /** The content disposition */
        @com.fasterxml.jackson.annotation.JsonProperty("contentDisposition")
        private String contentDisposition;

        /**
         * The content disposition
         *
         * @param contentDisposition the value to set
         * @return this builder
         */
        public Builder contentDisposition(String contentDisposition) {
            this.contentDisposition = contentDisposition;
            this.__explicitlySet__.add("contentDisposition");
            return this;
        }
        /** The content encoding */
        @com.fasterxml.jackson.annotation.JsonProperty("contentEncoding")
        private String contentEncoding;

        /**
         * The content encoding
         *
         * @param contentEncoding the value to set
         * @return this builder
         */
        public Builder contentEncoding(String contentEncoding) {
            this.contentEncoding = contentEncoding;
            this.__explicitlySet__.add("contentEncoding");
            return this;
        }
        /** The Cache-Control header */
        @com.fasterxml.jackson.annotation.JsonProperty("cacheControl")
        private String cacheControl;

        /**
         * The Cache-Control header
         *
         * @param cacheControl the value to set
         * @return this builder
         */
        public Builder cacheControl(String cacheControl) {
            this.cacheControl = cacheControl;
            this.__explicitlySet__.add("cacheControl");
            return this;
        }
        /** The content language */
        @com.fasterxml.jackson.annotation.JsonProperty("contentLanguage")
        private String contentLanguage;

        /**
         * The content language
         *
         * @param contentLanguage the value to set
         * @return this builder
         */
        public Builder contentLanguage(String contentLanguage) {
            this.contentLanguage = contentLanguage;
            this.__explicitlySet__.add("contentLanguage");
            return this;
        }
        /** The object metadata */
        @com.fasterxml.jackson.annotation.JsonProperty("opcMeta")
        private java.util.Map<String, String> opcMeta;

        /**
         * The object metadata
         *
         * @param opcMeta the value to set
         * @return this builder
         */
        public Builder opcMeta(java.util.Map<String, String> opcMeta) {
            this.opcMeta = opcMeta;
            this.__explicitlySet__.add("opcMeta");
            return this;
        }
        /** The Encryption Algorithm */
        @com.fasterxml.jackson.annotation.JsonProperty("opcSseCustomerAlgorithm")
        private String opcSseCustomerAlgorithm;

        /**
         * The Encryption Algorithm
         *
         * @param opcSseCustomerAlgorithm the value to set
         * @return this builder
         */
        public Builder opcSseCustomerAlgorithm(String opcSseCustomerAlgorithm) {
            this.opcSseCustomerAlgorithm = opcSseCustomerAlgorithm;
            this.__explicitlySet__.add("opcSseCustomerAlgorithm");
            return this;
        }
        /** The base64-encoded 256-bit encryption key to use */
        @com.fasterxml.jackson.annotation.JsonProperty("opcSseCustomerKey")
        private String opcSseCustomerKey;

        /**
         * The base64-encoded 256-bit encryption key to use
         *
         * @param opcSseCustomerKey the value to set
         * @return this builder
         */
        public Builder opcSseCustomerKey(String opcSseCustomerKey) {
            this.opcSseCustomerKey = opcSseCustomerKey;
            this.__explicitlySet__.add("opcSseCustomerKey");
            return this;
        }
        /** The base64-encoded SHA256 hash of the encryption key */
        @com.fasterxml.jackson.annotation.JsonProperty("opcSseCustomerKeySha256")
        private String opcSseCustomerKeySha256;

        /**
         * The base64-encoded SHA256 hash of the encryption key
         *
         * @param opcSseCustomerKeySha256 the value to set
         * @return this builder
         */
        public Builder opcSseCustomerKeySha256(String opcSseCustomerKeySha256) {
            this.opcSseCustomerKeySha256 = opcSseCustomerKeySha256;
            this.__explicitlySet__.add("opcSseCustomerKeySha256");
            return this;
        }
        /** The OCID of a master encryption key */
        @com.fasterxml.jackson.annotation.JsonProperty("opcSseKmsKeyId")
        private String opcSseKmsKeyId;

        /**
         * The OCID of a master encryption key
         *
         * @param opcSseKmsKeyId the value to set
         * @return this builder
         */
        public Builder opcSseKmsKeyId(String opcSseKmsKeyId) {
            this.opcSseKmsKeyId = opcSseKmsKeyId;
            this.__explicitlySet__.add("opcSseKmsKeyId");
            return this;
        }
        /** The storage tier that the object should be stored in */
        @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
        private StorageTier storageTier;

        /**
         * The storage tier that the object should be stored in
         *
         * @param storageTier the value to set
         * @return this builder
         */
        public Builder storageTier(StorageTier storageTier) {
            this.storageTier = storageTier;
            this.__explicitlySet__.add("storageTier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExecuteSqlOutputDispositionObjectStorageDetails build() {
            ExecuteSqlOutputDispositionObjectStorageDetails model =
                    new ExecuteSqlOutputDispositionObjectStorageDetails(
                            this.namespace,
                            this.bucketName,
                            this.objectName,
                            this.contentType,
                            this.contentDisposition,
                            this.contentEncoding,
                            this.cacheControl,
                            this.contentLanguage,
                            this.opcMeta,
                            this.opcSseCustomerAlgorithm,
                            this.opcSseCustomerKey,
                            this.opcSseCustomerKeySha256,
                            this.opcSseKmsKeyId,
                            this.storageTier);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExecuteSqlOutputDispositionObjectStorageDetails model) {
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("bucketName")) {
                this.bucketName(model.getBucketName());
            }
            if (model.wasPropertyExplicitlySet("objectName")) {
                this.objectName(model.getObjectName());
            }
            if (model.wasPropertyExplicitlySet("contentType")) {
                this.contentType(model.getContentType());
            }
            if (model.wasPropertyExplicitlySet("contentDisposition")) {
                this.contentDisposition(model.getContentDisposition());
            }
            if (model.wasPropertyExplicitlySet("contentEncoding")) {
                this.contentEncoding(model.getContentEncoding());
            }
            if (model.wasPropertyExplicitlySet("cacheControl")) {
                this.cacheControl(model.getCacheControl());
            }
            if (model.wasPropertyExplicitlySet("contentLanguage")) {
                this.contentLanguage(model.getContentLanguage());
            }
            if (model.wasPropertyExplicitlySet("opcMeta")) {
                this.opcMeta(model.getOpcMeta());
            }
            if (model.wasPropertyExplicitlySet("opcSseCustomerAlgorithm")) {
                this.opcSseCustomerAlgorithm(model.getOpcSseCustomerAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("opcSseCustomerKey")) {
                this.opcSseCustomerKey(model.getOpcSseCustomerKey());
            }
            if (model.wasPropertyExplicitlySet("opcSseCustomerKeySha256")) {
                this.opcSseCustomerKeySha256(model.getOpcSseCustomerKeySha256());
            }
            if (model.wasPropertyExplicitlySet("opcSseKmsKeyId")) {
                this.opcSseKmsKeyId(model.getOpcSseKmsKeyId());
            }
            if (model.wasPropertyExplicitlySet("storageTier")) {
                this.storageTier(model.getStorageTier());
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
    public ExecuteSqlOutputDispositionObjectStorageDetails(
            String namespace,
            String bucketName,
            String objectName,
            String contentType,
            String contentDisposition,
            String contentEncoding,
            String cacheControl,
            String contentLanguage,
            java.util.Map<String, String> opcMeta,
            String opcSseCustomerAlgorithm,
            String opcSseCustomerKey,
            String opcSseCustomerKeySha256,
            String opcSseKmsKeyId,
            StorageTier storageTier) {
        super();
        this.namespace = namespace;
        this.bucketName = bucketName;
        this.objectName = objectName;
        this.contentType = contentType;
        this.contentDisposition = contentDisposition;
        this.contentEncoding = contentEncoding;
        this.cacheControl = cacheControl;
        this.contentLanguage = contentLanguage;
        this.opcMeta = opcMeta;
        this.opcSseCustomerAlgorithm = opcSseCustomerAlgorithm;
        this.opcSseCustomerKey = opcSseCustomerKey;
        this.opcSseCustomerKeySha256 = opcSseCustomerKeySha256;
        this.opcSseKmsKeyId = opcSseKmsKeyId;
        this.storageTier = storageTier;
    }

    /** The name of the object storage namespace */
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * The name of the object storage namespace
     *
     * @return the value
     */
    public String getNamespace() {
        return namespace;
    }

    /** The name of the object storage bucket */
    @com.fasterxml.jackson.annotation.JsonProperty("bucketName")
    private final String bucketName;

    /**
     * The name of the object storage bucket
     *
     * @return the value
     */
    public String getBucketName() {
        return bucketName;
    }

    /**
     * The name of the object template (can contain statementId placeholder, for example;
     * query_{statementId}.csv )
     */
    @com.fasterxml.jackson.annotation.JsonProperty("objectName")
    private final String objectName;

    /**
     * The name of the object template (can contain statementId placeholder, for example;
     * query_{statementId}.csv )
     *
     * @return the value
     */
    public String getObjectName() {
        return objectName;
    }

    /** The content type */
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    private final String contentType;

    /**
     * The content type
     *
     * @return the value
     */
    public String getContentType() {
        return contentType;
    }

    /** The content disposition */
    @com.fasterxml.jackson.annotation.JsonProperty("contentDisposition")
    private final String contentDisposition;

    /**
     * The content disposition
     *
     * @return the value
     */
    public String getContentDisposition() {
        return contentDisposition;
    }

    /** The content encoding */
    @com.fasterxml.jackson.annotation.JsonProperty("contentEncoding")
    private final String contentEncoding;

    /**
     * The content encoding
     *
     * @return the value
     */
    public String getContentEncoding() {
        return contentEncoding;
    }

    /** The Cache-Control header */
    @com.fasterxml.jackson.annotation.JsonProperty("cacheControl")
    private final String cacheControl;

    /**
     * The Cache-Control header
     *
     * @return the value
     */
    public String getCacheControl() {
        return cacheControl;
    }

    /** The content language */
    @com.fasterxml.jackson.annotation.JsonProperty("contentLanguage")
    private final String contentLanguage;

    /**
     * The content language
     *
     * @return the value
     */
    public String getContentLanguage() {
        return contentLanguage;
    }

    /** The object metadata */
    @com.fasterxml.jackson.annotation.JsonProperty("opcMeta")
    private final java.util.Map<String, String> opcMeta;

    /**
     * The object metadata
     *
     * @return the value
     */
    public java.util.Map<String, String> getOpcMeta() {
        return opcMeta;
    }

    /** The Encryption Algorithm */
    @com.fasterxml.jackson.annotation.JsonProperty("opcSseCustomerAlgorithm")
    private final String opcSseCustomerAlgorithm;

    /**
     * The Encryption Algorithm
     *
     * @return the value
     */
    public String getOpcSseCustomerAlgorithm() {
        return opcSseCustomerAlgorithm;
    }

    /** The base64-encoded 256-bit encryption key to use */
    @com.fasterxml.jackson.annotation.JsonProperty("opcSseCustomerKey")
    private final String opcSseCustomerKey;

    /**
     * The base64-encoded 256-bit encryption key to use
     *
     * @return the value
     */
    public String getOpcSseCustomerKey() {
        return opcSseCustomerKey;
    }

    /** The base64-encoded SHA256 hash of the encryption key */
    @com.fasterxml.jackson.annotation.JsonProperty("opcSseCustomerKeySha256")
    private final String opcSseCustomerKeySha256;

    /**
     * The base64-encoded SHA256 hash of the encryption key
     *
     * @return the value
     */
    public String getOpcSseCustomerKeySha256() {
        return opcSseCustomerKeySha256;
    }

    /** The OCID of a master encryption key */
    @com.fasterxml.jackson.annotation.JsonProperty("opcSseKmsKeyId")
    private final String opcSseKmsKeyId;

    /**
     * The OCID of a master encryption key
     *
     * @return the value
     */
    public String getOpcSseKmsKeyId() {
        return opcSseKmsKeyId;
    }

    /** The storage tier that the object should be stored in */
    public enum StorageTier implements com.oracle.bmc.http.internal.BmcEnum {
        Standard("STANDARD"),
        InfrequentAccess("INFREQUENT_ACCESS"),
        Archive("ARCHIVE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(StorageTier.class);

        private final String value;
        private static java.util.Map<String, StorageTier> map;

        static {
            map = new java.util.HashMap<>();
            for (StorageTier v : StorageTier.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        StorageTier(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static StorageTier create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'StorageTier', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The storage tier that the object should be stored in */
    @com.fasterxml.jackson.annotation.JsonProperty("storageTier")
    private final StorageTier storageTier;

    /**
     * The storage tier that the object should be stored in
     *
     * @return the value
     */
    public StorageTier getStorageTier() {
        return storageTier;
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
        sb.append("ExecuteSqlOutputDispositionObjectStorageDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", bucketName=").append(String.valueOf(this.bucketName));
        sb.append(", objectName=").append(String.valueOf(this.objectName));
        sb.append(", contentType=").append(String.valueOf(this.contentType));
        sb.append(", contentDisposition=").append(String.valueOf(this.contentDisposition));
        sb.append(", contentEncoding=").append(String.valueOf(this.contentEncoding));
        sb.append(", cacheControl=").append(String.valueOf(this.cacheControl));
        sb.append(", contentLanguage=").append(String.valueOf(this.contentLanguage));
        sb.append(", opcMeta=").append(String.valueOf(this.opcMeta));
        sb.append(", opcSseCustomerAlgorithm=")
                .append(String.valueOf(this.opcSseCustomerAlgorithm));
        sb.append(", opcSseCustomerKey=").append(String.valueOf(this.opcSseCustomerKey));
        sb.append(", opcSseCustomerKeySha256=")
                .append(String.valueOf(this.opcSseCustomerKeySha256));
        sb.append(", opcSseKmsKeyId=").append(String.valueOf(this.opcSseKmsKeyId));
        sb.append(", storageTier=").append(String.valueOf(this.storageTier));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExecuteSqlOutputDispositionObjectStorageDetails)) {
            return false;
        }

        ExecuteSqlOutputDispositionObjectStorageDetails other =
                (ExecuteSqlOutputDispositionObjectStorageDetails) o;
        return java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.bucketName, other.bucketName)
                && java.util.Objects.equals(this.objectName, other.objectName)
                && java.util.Objects.equals(this.contentType, other.contentType)
                && java.util.Objects.equals(this.contentDisposition, other.contentDisposition)
                && java.util.Objects.equals(this.contentEncoding, other.contentEncoding)
                && java.util.Objects.equals(this.cacheControl, other.cacheControl)
                && java.util.Objects.equals(this.contentLanguage, other.contentLanguage)
                && java.util.Objects.equals(this.opcMeta, other.opcMeta)
                && java.util.Objects.equals(
                        this.opcSseCustomerAlgorithm, other.opcSseCustomerAlgorithm)
                && java.util.Objects.equals(this.opcSseCustomerKey, other.opcSseCustomerKey)
                && java.util.Objects.equals(
                        this.opcSseCustomerKeySha256, other.opcSseCustomerKeySha256)
                && java.util.Objects.equals(this.opcSseKmsKeyId, other.opcSseKmsKeyId)
                && java.util.Objects.equals(this.storageTier, other.storageTier)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.bucketName == null ? 43 : this.bucketName.hashCode());
        result = (result * PRIME) + (this.objectName == null ? 43 : this.objectName.hashCode());
        result = (result * PRIME) + (this.contentType == null ? 43 : this.contentType.hashCode());
        result =
                (result * PRIME)
                        + (this.contentDisposition == null
                                ? 43
                                : this.contentDisposition.hashCode());
        result =
                (result * PRIME)
                        + (this.contentEncoding == null ? 43 : this.contentEncoding.hashCode());
        result = (result * PRIME) + (this.cacheControl == null ? 43 : this.cacheControl.hashCode());
        result =
                (result * PRIME)
                        + (this.contentLanguage == null ? 43 : this.contentLanguage.hashCode());
        result = (result * PRIME) + (this.opcMeta == null ? 43 : this.opcMeta.hashCode());
        result =
                (result * PRIME)
                        + (this.opcSseCustomerAlgorithm == null
                                ? 43
                                : this.opcSseCustomerAlgorithm.hashCode());
        result =
                (result * PRIME)
                        + (this.opcSseCustomerKey == null ? 43 : this.opcSseCustomerKey.hashCode());
        result =
                (result * PRIME)
                        + (this.opcSseCustomerKeySha256 == null
                                ? 43
                                : this.opcSseCustomerKeySha256.hashCode());
        result =
                (result * PRIME)
                        + (this.opcSseKmsKeyId == null ? 43 : this.opcSseKmsKeyId.hashCode());
        result = (result * PRIME) + (this.storageTier == null ? 43 : this.storageTier.hashCode());
        return result;
    }
}
