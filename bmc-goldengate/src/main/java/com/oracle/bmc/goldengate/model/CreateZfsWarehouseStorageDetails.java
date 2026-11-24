/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information about a new ZFS warehouse storage configuration for Oracle AI Data Catalog
 * Storage connection. <br>
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
        builder = CreateZfsWarehouseStorageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "storageType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateZfsWarehouseStorageDetails extends CreateWarehouseStorageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The access key ID used to access the ZFS storage. */
        @com.fasterxml.jackson.annotation.JsonProperty("accessKeyId")
        private String accessKeyId;

        /**
         * The access key ID used to access the ZFS storage.
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
         * Secret that stores the ZFS secret access key.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKeySecretId")
        private String secretAccessKeySecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the ZFS secret access key.
         *
         * @param secretAccessKeySecretId the value to set
         * @return this builder
         */
        public Builder secretAccessKeySecretId(String secretAccessKeySecretId) {
            this.secretAccessKeySecretId = secretAccessKeySecretId;
            this.__explicitlySet__.add("secretAccessKeySecretId");
            return this;
        }
        /** The secret access key used to access the warehouse storage. */
        @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKey")
        private char[] secretAccessKey;

        /**
         * The secret access key used to access the warehouse storage.
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
        /** The endpoint URL of the ZFS storage service. */
        @com.fasterxml.jackson.annotation.JsonProperty("endpointUrl")
        private String endpointUrl;

        /**
         * The endpoint URL of the ZFS storage service.
         *
         * @param endpointUrl the value to set
         * @return this builder
         */
        public Builder endpointUrl(String endpointUrl) {
            this.endpointUrl = endpointUrl;
            this.__explicitlySet__.add("endpointUrl");
            return this;
        }
        /**
         * The base64 encoded content of the ZFS storage TrustStore file. Deprecated: This field is
         * deprecated and replaced by "trustStoreSecretId". This change follows the GoldenGate
         * "Plain Text Fields in Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         */
        @com.fasterxml.jackson.annotation.JsonProperty("trustStore")
        private String trustStore;

        /**
         * The base64 encoded content of the ZFS storage TrustStore file. Deprecated: This field is
         * deprecated and replaced by "trustStoreSecretId". This change follows the GoldenGate
         * "Plain Text Fields in Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         *
         * @param trustStore the value to set
         * @return this builder
         */
        public Builder trustStore(String trustStore) {
            this.trustStore = trustStore;
            this.__explicitlySet__.add("trustStore");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the ZFS storage trust store. Note: When provided, 'trustStore' field
         * must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("trustStoreSecretId")
        private String trustStoreSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the ZFS storage trust store. Note: When provided, 'trustStore' field
         * must not be provided.
         *
         * @param trustStoreSecretId the value to set
         * @return this builder
         */
        public Builder trustStoreSecretId(String trustStoreSecretId) {
            this.trustStoreSecretId = trustStoreSecretId;
            this.__explicitlySet__.add("trustStoreSecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateZfsWarehouseStorageDetails build() {
            CreateZfsWarehouseStorageDetails model =
                    new CreateZfsWarehouseStorageDetails(
                            this.accessKeyId,
                            this.secretAccessKeySecretId,
                            this.secretAccessKey,
                            this.endpointUrl,
                            this.trustStore,
                            this.trustStoreSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateZfsWarehouseStorageDetails model) {
            if (model.wasPropertyExplicitlySet("accessKeyId")) {
                this.accessKeyId(model.getAccessKeyId());
            }
            if (model.wasPropertyExplicitlySet("secretAccessKeySecretId")) {
                this.secretAccessKeySecretId(model.getSecretAccessKeySecretId());
            }
            if (model.wasPropertyExplicitlySet("secretAccessKey")) {
                this.secretAccessKey(model.getSecretAccessKey());
            }
            if (model.wasPropertyExplicitlySet("endpointUrl")) {
                this.endpointUrl(model.getEndpointUrl());
            }
            if (model.wasPropertyExplicitlySet("trustStore")) {
                this.trustStore(model.getTrustStore());
            }
            if (model.wasPropertyExplicitlySet("trustStoreSecretId")) {
                this.trustStoreSecretId(model.getTrustStoreSecretId());
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
    public CreateZfsWarehouseStorageDetails(
            String accessKeyId,
            String secretAccessKeySecretId,
            String secretAccessKey,
            String endpointUrl,
            String trustStore,
            String trustStoreSecretId) {
        super();
        this.accessKeyId = accessKeyId;
        this.secretAccessKeySecretId = secretAccessKeySecretId;
        this.secretAccessKey = secretAccessKey != null ? secretAccessKey.toCharArray() : null;
        this.endpointUrl = endpointUrl;
        this.trustStore = trustStore;
        this.trustStoreSecretId = trustStoreSecretId;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    public CreateZfsWarehouseStorageDetails(
            @com.fasterxml.jackson.annotation.JsonProperty("accessKeyId") String accessKeyId,
            @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKeySecretId")
                    String secretAccessKeySecretId,
            @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKey")
                    char[] secretAccessKey,
            @com.fasterxml.jackson.annotation.JsonProperty("endpointUrl") String endpointUrl,
            @com.fasterxml.jackson.annotation.JsonProperty("trustStore") String trustStore,
            @com.fasterxml.jackson.annotation.JsonProperty("trustStoreSecretId")
                    String trustStoreSecretId) {
        super();
        this.accessKeyId = accessKeyId;
        this.secretAccessKeySecretId = secretAccessKeySecretId;
        this.secretAccessKey = secretAccessKey;
        this.endpointUrl = endpointUrl;
        this.trustStore = trustStore;
        this.trustStoreSecretId = trustStoreSecretId;
    }

    /** The access key ID used to access the ZFS storage. */
    @com.fasterxml.jackson.annotation.JsonProperty("accessKeyId")
    private final String accessKeyId;

    /**
     * The access key ID used to access the ZFS storage.
     *
     * @return the value
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the ZFS secret access key.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKeySecretId")
    private final String secretAccessKeySecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the ZFS secret access key.
     *
     * @return the value
     */
    public String getSecretAccessKeySecretId() {
        return secretAccessKeySecretId;
    }

    /** The secret access key used to access the warehouse storage. */
    @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKey")
    private final char[] secretAccessKey;

    /**
     * The secret access key used to access the warehouse storage.
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
     * The secret access key used to access the warehouse storage.
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKey")
    public char[] getSecretAccessKey__AsCharArray() {
        return secretAccessKey;
    }

    /** The endpoint URL of the ZFS storage service. */
    @com.fasterxml.jackson.annotation.JsonProperty("endpointUrl")
    private final String endpointUrl;

    /**
     * The endpoint URL of the ZFS storage service.
     *
     * @return the value
     */
    public String getEndpointUrl() {
        return endpointUrl;
    }

    /**
     * The base64 encoded content of the ZFS storage TrustStore file. Deprecated: This field is
     * deprecated and replaced by "trustStoreSecretId". This change follows the GoldenGate "Plain
     * Text Fields in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStore")
    private final String trustStore;

    /**
     * The base64 encoded content of the ZFS storage TrustStore file. Deprecated: This field is
     * deprecated and replaced by "trustStoreSecretId". This change follows the GoldenGate "Plain
     * Text Fields in Connections" deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     */
    public String getTrustStore() {
        return trustStore;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the ZFS storage trust store. Note: When provided, 'trustStore' field must
     * not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("trustStoreSecretId")
    private final String trustStoreSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the ZFS storage trust store. Note: When provided, 'trustStore' field must
     * not be provided.
     *
     * @return the value
     */
    public String getTrustStoreSecretId() {
        return trustStoreSecretId;
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
        sb.append("CreateZfsWarehouseStorageDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", accessKeyId=").append(String.valueOf(this.accessKeyId));
        sb.append(", secretAccessKeySecretId=")
                .append(String.valueOf(this.secretAccessKeySecretId));
        sb.append(", secretAccessKey=").append("<redacted>");
        sb.append(", endpointUrl=").append(String.valueOf(this.endpointUrl));
        sb.append(", trustStore=").append(String.valueOf(this.trustStore));
        sb.append(", trustStoreSecretId=").append(String.valueOf(this.trustStoreSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateZfsWarehouseStorageDetails)) {
            return false;
        }

        CreateZfsWarehouseStorageDetails other = (CreateZfsWarehouseStorageDetails) o;
        return java.util.Objects.equals(this.accessKeyId, other.accessKeyId)
                && java.util.Objects.equals(
                        this.secretAccessKeySecretId, other.secretAccessKeySecretId)
                && java.util.Objects.equals(this.secretAccessKey, other.secretAccessKey)
                && java.util.Objects.equals(this.endpointUrl, other.endpointUrl)
                && java.util.Objects.equals(this.trustStore, other.trustStore)
                && java.util.Objects.equals(this.trustStoreSecretId, other.trustStoreSecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.accessKeyId == null ? 43 : this.accessKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.secretAccessKeySecretId == null
                                ? 43
                                : this.secretAccessKeySecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.secretAccessKey == null ? 43 : this.secretAccessKey.hashCode());
        result = (result * PRIME) + (this.endpointUrl == null ? 43 : this.endpointUrl.hashCode());
        result = (result * PRIME) + (this.trustStore == null ? 43 : this.trustStore.hashCode());
        result =
                (result * PRIME)
                        + (this.trustStoreSecretId == null
                                ? 43
                                : this.trustStoreSecretId.hashCode());
        return result;
    }
}
