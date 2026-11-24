/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasemigration.model;

/**
 * Azure Blob Storage details used to transfer Data Pump dump files for Oracle migrations. <br>
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
        builder = OracleAzureBlobDataTransferMediumDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OracleAzureBlobDataTransferMediumDetails
        extends OracleDataTransferMediumDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Azure Storage account name. */
        @com.fasterxml.jackson.annotation.JsonProperty("storageAccountName")
        private String storageAccountName;

        /**
         * Azure Storage account name.
         *
         * @param storageAccountName the value to set
         * @return this builder
         */
        public Builder storageAccountName(String storageAccountName) {
            this.storageAccountName = storageAccountName;
            this.__explicitlySet__.add("storageAccountName");
            return this;
        }
        /** Azure Blob container name. */
        @com.fasterxml.jackson.annotation.JsonProperty("containerName")
        private String containerName;

        /**
         * Azure Blob container name.
         *
         * @param containerName the value to set
         * @return this builder
         */
        public Builder containerName(String containerName) {
            this.containerName = containerName;
            this.__explicitlySet__.add("containerName");
            return this;
        }
        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of OCI
         * Vault secret that contains the Azure Storage Account Key.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("storageAccountKeySecretId")
        private String storageAccountKeySecretId;

        /**
         * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of OCI
         * Vault secret that contains the Azure Storage Account Key.
         *
         * @param storageAccountKeySecretId the value to set
         * @return this builder
         */
        public Builder storageAccountKeySecretId(String storageAccountKeySecretId) {
            this.storageAccountKeySecretId = storageAccountKeySecretId;
            this.__explicitlySet__.add("storageAccountKeySecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OracleAzureBlobDataTransferMediumDetails build() {
            OracleAzureBlobDataTransferMediumDetails model =
                    new OracleAzureBlobDataTransferMediumDetails(
                            this.storageAccountName,
                            this.containerName,
                            this.storageAccountKeySecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OracleAzureBlobDataTransferMediumDetails model) {
            if (model.wasPropertyExplicitlySet("storageAccountName")) {
                this.storageAccountName(model.getStorageAccountName());
            }
            if (model.wasPropertyExplicitlySet("containerName")) {
                this.containerName(model.getContainerName());
            }
            if (model.wasPropertyExplicitlySet("storageAccountKeySecretId")) {
                this.storageAccountKeySecretId(model.getStorageAccountKeySecretId());
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
    public OracleAzureBlobDataTransferMediumDetails(
            String storageAccountName, String containerName, String storageAccountKeySecretId) {
        super();
        this.storageAccountName = storageAccountName;
        this.containerName = containerName;
        this.storageAccountKeySecretId = storageAccountKeySecretId;
    }

    /** Azure Storage account name. */
    @com.fasterxml.jackson.annotation.JsonProperty("storageAccountName")
    private final String storageAccountName;

    /**
     * Azure Storage account name.
     *
     * @return the value
     */
    public String getStorageAccountName() {
        return storageAccountName;
    }

    /** Azure Blob container name. */
    @com.fasterxml.jackson.annotation.JsonProperty("containerName")
    private final String containerName;

    /**
     * Azure Blob container name.
     *
     * @return the value
     */
    public String getContainerName() {
        return containerName;
    }

    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of OCI Vault
     * secret that contains the Azure Storage Account Key.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("storageAccountKeySecretId")
    private final String storageAccountKeySecretId;

    /**
     * [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of OCI Vault
     * secret that contains the Azure Storage Account Key.
     *
     * @return the value
     */
    public String getStorageAccountKeySecretId() {
        return storageAccountKeySecretId;
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
        sb.append("OracleAzureBlobDataTransferMediumDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", storageAccountName=").append(String.valueOf(this.storageAccountName));
        sb.append(", containerName=").append(String.valueOf(this.containerName));
        sb.append(", storageAccountKeySecretId=")
                .append(String.valueOf(this.storageAccountKeySecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OracleAzureBlobDataTransferMediumDetails)) {
            return false;
        }

        OracleAzureBlobDataTransferMediumDetails other =
                (OracleAzureBlobDataTransferMediumDetails) o;
        return java.util.Objects.equals(this.storageAccountName, other.storageAccountName)
                && java.util.Objects.equals(this.containerName, other.containerName)
                && java.util.Objects.equals(
                        this.storageAccountKeySecretId, other.storageAccountKeySecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.storageAccountName == null
                                ? 43
                                : this.storageAccountName.hashCode());
        result =
                (result * PRIME)
                        + (this.containerName == null ? 43 : this.containerName.hashCode());
        result =
                (result * PRIME)
                        + (this.storageAccountKeySecretId == null
                                ? 43
                                : this.storageAccountKeySecretId.hashCode());
        return result;
    }
}
