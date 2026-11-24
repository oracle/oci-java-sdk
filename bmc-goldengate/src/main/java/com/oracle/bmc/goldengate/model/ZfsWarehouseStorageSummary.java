/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * Summary of the ZFS warehouse storage configuration for Oracle AI Data Catalog Storage connection.
 * <br>
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
        builder = ZfsWarehouseStorageSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "storageType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ZfsWarehouseStorageSummary extends WarehouseStorageSummary {
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

        public ZfsWarehouseStorageSummary build() {
            ZfsWarehouseStorageSummary model =
                    new ZfsWarehouseStorageSummary(
                            this.accessKeyId,
                            this.secretAccessKeySecretId,
                            this.endpointUrl,
                            this.trustStoreSecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ZfsWarehouseStorageSummary model) {
            if (model.wasPropertyExplicitlySet("accessKeyId")) {
                this.accessKeyId(model.getAccessKeyId());
            }
            if (model.wasPropertyExplicitlySet("secretAccessKeySecretId")) {
                this.secretAccessKeySecretId(model.getSecretAccessKeySecretId());
            }
            if (model.wasPropertyExplicitlySet("endpointUrl")) {
                this.endpointUrl(model.getEndpointUrl());
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
    public ZfsWarehouseStorageSummary(
            String accessKeyId,
            String secretAccessKeySecretId,
            String endpointUrl,
            String trustStoreSecretId) {
        super();
        this.accessKeyId = accessKeyId;
        this.secretAccessKeySecretId = secretAccessKeySecretId;
        this.endpointUrl = endpointUrl;
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
        sb.append("ZfsWarehouseStorageSummary(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", accessKeyId=").append(String.valueOf(this.accessKeyId));
        sb.append(", secretAccessKeySecretId=")
                .append(String.valueOf(this.secretAccessKeySecretId));
        sb.append(", endpointUrl=").append(String.valueOf(this.endpointUrl));
        sb.append(", trustStoreSecretId=").append(String.valueOf(this.trustStoreSecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ZfsWarehouseStorageSummary)) {
            return false;
        }

        ZfsWarehouseStorageSummary other = (ZfsWarehouseStorageSummary) o;
        return java.util.Objects.equals(this.accessKeyId, other.accessKeyId)
                && java.util.Objects.equals(
                        this.secretAccessKeySecretId, other.secretAccessKeySecretId)
                && java.util.Objects.equals(this.endpointUrl, other.endpointUrl)
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
        result = (result * PRIME) + (this.endpointUrl == null ? 43 : this.endpointUrl.hashCode());
        result =
                (result * PRIME)
                        + (this.trustStoreSecretId == null
                                ? 43
                                : this.trustStoreSecretId.hashCode());
        return result;
    }
}
