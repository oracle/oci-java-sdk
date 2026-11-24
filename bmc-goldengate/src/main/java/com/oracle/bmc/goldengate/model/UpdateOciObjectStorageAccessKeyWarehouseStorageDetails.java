/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information to update the OCI Object Storage warehouse storage configuration for Oracle AI
 * Data Catalog Storage Connection using access-key/secret-key credentials. <br>
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
        builder = UpdateOciObjectStorageAccessKeyWarehouseStorageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "storageType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateOciObjectStorageAccessKeyWarehouseStorageDetails
        extends UpdateWarehouseStorageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name of namespace that serves as a container for all of your buckets */
        @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
        private String namespaceName;

        /**
         * Name of namespace that serves as a container for all of your buckets
         *
         * @param namespaceName the value to set
         * @return this builder
         */
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            this.__explicitlySet__.add("namespaceName");
            return this;
        }
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
        /** The access key ID used to access the OCI Object Storage bucket. */
        @com.fasterxml.jackson.annotation.JsonProperty("accessKeyId")
        private String accessKeyId;

        /**
         * The access key ID used to access the OCI Object Storage bucket.
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
         * Secret that stores the OCI Object Storage secret access key.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKeySecretId")
        private String secretAccessKeySecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the OCI Object Storage secret access key.
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateOciObjectStorageAccessKeyWarehouseStorageDetails build() {
            UpdateOciObjectStorageAccessKeyWarehouseStorageDetails model =
                    new UpdateOciObjectStorageAccessKeyWarehouseStorageDetails(
                            this.namespaceName,
                            this.region,
                            this.accessKeyId,
                            this.secretAccessKeySecretId,
                            this.secretAccessKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateOciObjectStorageAccessKeyWarehouseStorageDetails model) {
            if (model.wasPropertyExplicitlySet("namespaceName")) {
                this.namespaceName(model.getNamespaceName());
            }
            if (model.wasPropertyExplicitlySet("region")) {
                this.region(model.getRegion());
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
    public UpdateOciObjectStorageAccessKeyWarehouseStorageDetails(
            String namespaceName,
            String region,
            String accessKeyId,
            String secretAccessKeySecretId,
            String secretAccessKey) {
        super();
        this.namespaceName = namespaceName;
        this.region = region;
        this.accessKeyId = accessKeyId;
        this.secretAccessKeySecretId = secretAccessKeySecretId;
        this.secretAccessKey = secretAccessKey != null ? secretAccessKey.toCharArray() : null;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    public UpdateOciObjectStorageAccessKeyWarehouseStorageDetails(
            @com.fasterxml.jackson.annotation.JsonProperty("namespaceName") String namespaceName,
            @com.fasterxml.jackson.annotation.JsonProperty("region") String region,
            @com.fasterxml.jackson.annotation.JsonProperty("accessKeyId") String accessKeyId,
            @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKeySecretId")
                    String secretAccessKeySecretId,
            @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKey")
                    char[] secretAccessKey) {
        super();
        this.namespaceName = namespaceName;
        this.region = region;
        this.accessKeyId = accessKeyId;
        this.secretAccessKeySecretId = secretAccessKeySecretId;
        this.secretAccessKey = secretAccessKey;
    }

    /** Name of namespace that serves as a container for all of your buckets */
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
    private final String namespaceName;

    /**
     * Name of namespace that serves as a container for all of your buckets
     *
     * @return the value
     */
    public String getNamespaceName() {
        return namespaceName;
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

    /** The access key ID used to access the OCI Object Storage bucket. */
    @com.fasterxml.jackson.annotation.JsonProperty("accessKeyId")
    private final String accessKeyId;

    /**
     * The access key ID used to access the OCI Object Storage bucket.
     *
     * @return the value
     */
    public String getAccessKeyId() {
        return accessKeyId;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the OCI Object Storage secret access key.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secretAccessKeySecretId")
    private final String secretAccessKeySecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the OCI Object Storage secret access key.
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
        sb.append("UpdateOciObjectStorageAccessKeyWarehouseStorageDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(", region=").append(String.valueOf(this.region));
        sb.append(", accessKeyId=").append(String.valueOf(this.accessKeyId));
        sb.append(", secretAccessKeySecretId=")
                .append(String.valueOf(this.secretAccessKeySecretId));
        sb.append(", secretAccessKey=").append("<redacted>");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateOciObjectStorageAccessKeyWarehouseStorageDetails)) {
            return false;
        }

        UpdateOciObjectStorageAccessKeyWarehouseStorageDetails other =
                (UpdateOciObjectStorageAccessKeyWarehouseStorageDetails) o;
        return java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.region, other.region)
                && java.util.Objects.equals(this.accessKeyId, other.accessKeyId)
                && java.util.Objects.equals(
                        this.secretAccessKeySecretId, other.secretAccessKeySecretId)
                && java.util.Objects.equals(this.secretAccessKey, other.secretAccessKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result = (result * PRIME) + (this.region == null ? 43 : this.region.hashCode());
        result = (result * PRIME) + (this.accessKeyId == null ? 43 : this.accessKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.secretAccessKeySecretId == null
                                ? 43
                                : this.secretAccessKeySecretId.hashCode());
        result =
                (result * PRIME)
                        + (this.secretAccessKey == null ? 43 : this.secretAccessKey.hashCode());
        return result;
    }
}
