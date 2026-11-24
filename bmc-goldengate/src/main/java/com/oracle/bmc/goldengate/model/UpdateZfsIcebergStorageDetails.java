/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information to update the ZFS storage used in the Iceberg connection for an Oracle AI Data
 * Catalog Iceberg catalogs. <br>
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
        builder = UpdateZfsIcebergStorageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "storageType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateZfsIcebergStorageDetails extends UpdateIcebergStorageDetails {
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
         * Secret that stores the content of the configuration file containing additional properties
         * for the REST catalog. See documentation:
         * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm
         */
        @com.fasterxml.jackson.annotation.JsonProperty("propertiesSecretId")
        private String propertiesSecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the content of the configuration file containing additional properties
         * for the REST catalog. See documentation:
         * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm
         *
         * @param propertiesSecretId the value to set
         * @return this builder
         */
        public Builder propertiesSecretId(String propertiesSecretId) {
            this.propertiesSecretId = propertiesSecretId;
            this.__explicitlySet__.add("propertiesSecretId");
            return this;
        }
        /**
         * The base64 encoded content of the configuration file containing additional properties for
         * the REST catalog.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("properties")
        private char[] properties;

        /**
         * The base64 encoded content of the configuration file containing additional properties for
         * the REST catalog.
         *
         * @param properties the value to set
         * @return this builder
         */
        public Builder properties(char[] properties) {
            this.properties = properties;
            this.__explicitlySet__.add("properties");
            return this;
        }

        public Builder properties(String properties) {
            this.properties = properties != null ? properties.toCharArray() : null;
            this.__explicitlySet__.add("properties");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateZfsIcebergStorageDetails build() {
            UpdateZfsIcebergStorageDetails model =
                    new UpdateZfsIcebergStorageDetails(
                            this.accessKeyId,
                            this.secretAccessKeySecretId,
                            this.secretAccessKey,
                            this.trustStoreSecretId,
                            this.trustStore,
                            this.propertiesSecretId,
                            this.properties);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateZfsIcebergStorageDetails model) {
            if (model.wasPropertyExplicitlySet("accessKeyId")) {
                this.accessKeyId(model.getAccessKeyId());
            }
            if (model.wasPropertyExplicitlySet("secretAccessKeySecretId")) {
                this.secretAccessKeySecretId(model.getSecretAccessKeySecretId());
            }
            if (model.wasPropertyExplicitlySet("secretAccessKey")) {
                this.secretAccessKey(model.getSecretAccessKey());
            }
            if (model.wasPropertyExplicitlySet("trustStoreSecretId")) {
                this.trustStoreSecretId(model.getTrustStoreSecretId());
            }
            if (model.wasPropertyExplicitlySet("trustStore")) {
                this.trustStore(model.getTrustStore());
            }
            if (model.wasPropertyExplicitlySet("propertiesSecretId")) {
                this.propertiesSecretId(model.getPropertiesSecretId());
            }
            if (model.wasPropertyExplicitlySet("properties")) {
                this.properties(model.getProperties());
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
    public UpdateZfsIcebergStorageDetails(
            String accessKeyId,
            String secretAccessKeySecretId,
            String secretAccessKey,
            String trustStoreSecretId,
            String trustStore,
            String propertiesSecretId,
            String properties) {
        super();
        this.accessKeyId = accessKeyId;
        this.secretAccessKeySecretId = secretAccessKeySecretId;
        this.secretAccessKey = secretAccessKey != null ? secretAccessKey.toCharArray() : null;
        this.trustStoreSecretId = trustStoreSecretId;
        this.trustStore = trustStore;
        this.propertiesSecretId = propertiesSecretId;
        this.properties = properties != null ? properties.toCharArray() : null;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    public UpdateZfsIcebergStorageDetails(
            @com.fasterxml.jackson.annotation.JsonProperty("accessKeyId") String accessKeyId,
            @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKeySecretId")
                    String secretAccessKeySecretId,
            @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKey")
                    char[] secretAccessKey,
            @com.fasterxml.jackson.annotation.JsonProperty("trustStoreSecretId")
                    String trustStoreSecretId,
            @com.fasterxml.jackson.annotation.JsonProperty("trustStore") String trustStore,
            @com.fasterxml.jackson.annotation.JsonProperty("propertiesSecretId")
                    String propertiesSecretId,
            @com.fasterxml.jackson.annotation.JsonProperty("properties") char[] properties) {
        super();
        this.accessKeyId = accessKeyId;
        this.secretAccessKeySecretId = secretAccessKeySecretId;
        this.secretAccessKey = secretAccessKey;
        this.trustStoreSecretId = trustStoreSecretId;
        this.trustStore = trustStore;
        this.propertiesSecretId = propertiesSecretId;
        this.properties = properties;
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
     * Secret that stores the content of the configuration file containing additional properties for
     * the REST catalog. See documentation:
     * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm
     */
    @com.fasterxml.jackson.annotation.JsonProperty("propertiesSecretId")
    private final String propertiesSecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the content of the configuration file containing additional properties for
     * the REST catalog. See documentation:
     * https://docs.oracle.com/en-us/iaas/Content/Identity/Tasks/managingcredentials.htm
     *
     * @return the value
     */
    public String getPropertiesSecretId() {
        return propertiesSecretId;
    }

    /**
     * The base64 encoded content of the configuration file containing additional properties for the
     * REST catalog.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    private final char[] properties;

    /**
     * The base64 encoded content of the configuration file containing additional properties for the
     * REST catalog.
     *
     * @return the value
     * @deprecated Use getProperties__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getProperties() {
        return properties != null ? new String(properties) : null;
    }

    /**
     * The base64 encoded content of the configuration file containing additional properties for the
     * REST catalog.
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("properties")
    public char[] getProperties__AsCharArray() {
        return properties;
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
        sb.append("UpdateZfsIcebergStorageDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", accessKeyId=").append(String.valueOf(this.accessKeyId));
        sb.append(", secretAccessKeySecretId=")
                .append(String.valueOf(this.secretAccessKeySecretId));
        sb.append(", secretAccessKey=").append("<redacted>");
        sb.append(", trustStoreSecretId=").append(String.valueOf(this.trustStoreSecretId));
        sb.append(", trustStore=").append(String.valueOf(this.trustStore));
        sb.append(", propertiesSecretId=").append(String.valueOf(this.propertiesSecretId));
        sb.append(", properties=").append("<redacted>");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateZfsIcebergStorageDetails)) {
            return false;
        }

        UpdateZfsIcebergStorageDetails other = (UpdateZfsIcebergStorageDetails) o;
        return java.util.Objects.equals(this.accessKeyId, other.accessKeyId)
                && java.util.Objects.equals(
                        this.secretAccessKeySecretId, other.secretAccessKeySecretId)
                && java.util.Objects.equals(this.secretAccessKey, other.secretAccessKey)
                && java.util.Objects.equals(this.trustStoreSecretId, other.trustStoreSecretId)
                && java.util.Objects.equals(this.trustStore, other.trustStore)
                && java.util.Objects.equals(this.propertiesSecretId, other.propertiesSecretId)
                && java.util.Objects.equals(this.properties, other.properties)
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
        result =
                (result * PRIME)
                        + (this.trustStoreSecretId == null
                                ? 43
                                : this.trustStoreSecretId.hashCode());
        result = (result * PRIME) + (this.trustStore == null ? 43 : this.trustStore.hashCode());
        result =
                (result * PRIME)
                        + (this.propertiesSecretId == null
                                ? 43
                                : this.propertiesSecretId.hashCode());
        result = (result * PRIME) + (this.properties == null ? 43 : this.properties.hashCode());
        return result;
    }
}
