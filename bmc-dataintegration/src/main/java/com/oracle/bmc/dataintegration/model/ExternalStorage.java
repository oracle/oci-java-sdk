/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * BICC Connector Attribute.Object Storage as External storage where the BICC extracted files are written
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = ExternalStorage.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "modelType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExternalStorage extends ConnectorAttribute {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Id of the external stoarge configured in BICC console. Usually its numeric.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageId")
        private String storageId;

        /**
         * Id of the external stoarge configured in BICC console. Usually its numeric.
         * @param storageId the value to set
         * @return this builder
         **/
        public Builder storageId(String storageId) {
            this.storageId = storageId;
            this.__explicitlySet__.add("storageId");
            return this;
        }
        /**
         * Name of the external storage configured in BICC console
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("storageName")
        private String storageName;

        /**
         * Name of the external storage configured in BICC console
         * @param storageName the value to set
         * @return this builder
         **/
        public Builder storageName(String storageName) {
            this.storageName = storageName;
            this.__explicitlySet__.add("storageName");
            return this;
        }
        /**
         * Object Storage host Url. DO not give http/https.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("host")
        private String host;

        /**
         * Object Storage host Url. DO not give http/https.
         * @param host the value to set
         * @return this builder
         **/
        public Builder host(String host) {
            this.host = host;
            this.__explicitlySet__.add("host");
            return this;
        }
        /**
         * Tenancy OCID for the OOS bucket
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
        private String tenancyId;

        /**
         * Tenancy OCID for the OOS bucket
         * @param tenancyId the value to set
         * @return this builder
         **/
        public Builder tenancyId(String tenancyId) {
            this.tenancyId = tenancyId;
            this.__explicitlySet__.add("tenancyId");
            return this;
        }
        /**
         * Namespace for the OOS bucket
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespace")
        private String namespace;

        /**
         * Namespace for the OOS bucket
         * @param namespace the value to set
         * @return this builder
         **/
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            this.__explicitlySet__.add("namespace");
            return this;
        }
        /**
         * Bucket Name where BICC extracts stores the files
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bucket")
        private String bucket;

        /**
         * Bucket Name where BICC extracts stores the files
         * @param bucket the value to set
         * @return this builder
         **/
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            this.__explicitlySet__.add("bucket");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExternalStorage build() {
            ExternalStorage model =
                    new ExternalStorage(
                            this.storageId,
                            this.storageName,
                            this.host,
                            this.tenancyId,
                            this.namespace,
                            this.bucket);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExternalStorage model) {
            if (model.wasPropertyExplicitlySet("storageId")) {
                this.storageId(model.getStorageId());
            }
            if (model.wasPropertyExplicitlySet("storageName")) {
                this.storageName(model.getStorageName());
            }
            if (model.wasPropertyExplicitlySet("host")) {
                this.host(model.getHost());
            }
            if (model.wasPropertyExplicitlySet("tenancyId")) {
                this.tenancyId(model.getTenancyId());
            }
            if (model.wasPropertyExplicitlySet("namespace")) {
                this.namespace(model.getNamespace());
            }
            if (model.wasPropertyExplicitlySet("bucket")) {
                this.bucket(model.getBucket());
            }
            return this;
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

    @Deprecated
    public ExternalStorage(
            String storageId,
            String storageName,
            String host,
            String tenancyId,
            String namespace,
            String bucket) {
        super();
        this.storageId = storageId;
        this.storageName = storageName;
        this.host = host;
        this.tenancyId = tenancyId;
        this.namespace = namespace;
        this.bucket = bucket;
    }

    /**
     * Id of the external stoarge configured in BICC console. Usually its numeric.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageId")
    private final String storageId;

    /**
     * Id of the external stoarge configured in BICC console. Usually its numeric.
     * @return the value
     **/
    public String getStorageId() {
        return storageId;
    }

    /**
     * Name of the external storage configured in BICC console
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("storageName")
    private final String storageName;

    /**
     * Name of the external storage configured in BICC console
     * @return the value
     **/
    public String getStorageName() {
        return storageName;
    }

    /**
     * Object Storage host Url. DO not give http/https.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("host")
    private final String host;

    /**
     * Object Storage host Url. DO not give http/https.
     * @return the value
     **/
    public String getHost() {
        return host;
    }

    /**
     * Tenancy OCID for the OOS bucket
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tenancyId")
    private final String tenancyId;

    /**
     * Tenancy OCID for the OOS bucket
     * @return the value
     **/
    public String getTenancyId() {
        return tenancyId;
    }

    /**
     * Namespace for the OOS bucket
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespace")
    private final String namespace;

    /**
     * Namespace for the OOS bucket
     * @return the value
     **/
    public String getNamespace() {
        return namespace;
    }

    /**
     * Bucket Name where BICC extracts stores the files
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bucket")
    private final String bucket;

    /**
     * Bucket Name where BICC extracts stores the files
     * @return the value
     **/
    public String getBucket() {
        return bucket;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExternalStorage(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", storageId=").append(String.valueOf(this.storageId));
        sb.append(", storageName=").append(String.valueOf(this.storageName));
        sb.append(", host=").append(String.valueOf(this.host));
        sb.append(", tenancyId=").append(String.valueOf(this.tenancyId));
        sb.append(", namespace=").append(String.valueOf(this.namespace));
        sb.append(", bucket=").append(String.valueOf(this.bucket));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExternalStorage)) {
            return false;
        }

        ExternalStorage other = (ExternalStorage) o;
        return java.util.Objects.equals(this.storageId, other.storageId)
                && java.util.Objects.equals(this.storageName, other.storageName)
                && java.util.Objects.equals(this.host, other.host)
                && java.util.Objects.equals(this.tenancyId, other.tenancyId)
                && java.util.Objects.equals(this.namespace, other.namespace)
                && java.util.Objects.equals(this.bucket, other.bucket)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.storageId == null ? 43 : this.storageId.hashCode());
        result = (result * PRIME) + (this.storageName == null ? 43 : this.storageName.hashCode());
        result = (result * PRIME) + (this.host == null ? 43 : this.host.hashCode());
        result = (result * PRIME) + (this.tenancyId == null ? 43 : this.tenancyId.hashCode());
        result = (result * PRIME) + (this.namespace == null ? 43 : this.namespace.hashCode());
        result = (result * PRIME) + (this.bucket == null ? 43 : this.bucket.hashCode());
        return result;
    }
}
