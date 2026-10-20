/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information about an Azure Data Lake Storage Gen2 location used to share Databricks
 * application artifacts. <br>
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
        builder = CreateAzureDataLakeStorageDatabricksEngineArtifactLocationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "locationType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateAzureDataLakeStorageDatabricksEngineArtifactLocationDetails
        extends CreateDatabricksEngineArtifactLocationDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("shouldOverwriteExisting")
        private Boolean shouldOverwriteExisting;

        public Builder shouldOverwriteExisting(Boolean shouldOverwriteExisting) {
            this.shouldOverwriteExisting = shouldOverwriteExisting;
            this.__explicitlySet__.add("shouldOverwriteExisting");
            return this;
        }
        /** Azure Data Lake Storage Gen2 storage-account name. */
        @com.fasterxml.jackson.annotation.JsonProperty("storageAccount")
        private String storageAccount;

        /**
         * Azure Data Lake Storage Gen2 storage-account name.
         *
         * @param storageAccount the value to set
         * @return this builder
         */
        public Builder storageAccount(String storageAccount) {
            this.storageAccount = storageAccount;
            this.__explicitlySet__.add("storageAccount");
            return this;
        }
        /**
         * Azure Data Lake Storage Gen2 filesystem containing the application artifacts. Example:
         * "ggs-artifacts"
         */
        @com.fasterxml.jackson.annotation.JsonProperty("filesystem")
        private String filesystem;

        /**
         * Azure Data Lake Storage Gen2 filesystem containing the application artifacts. Example:
         * "ggs-artifacts"
         *
         * @param filesystem the value to set
         * @return this builder
         */
        public Builder filesystem(String filesystem) {
            this.filesystem = filesystem;
            this.__explicitlySet__.add("filesystem");
            return this;
        }
        /** Artifact path. */
        @com.fasterxml.jackson.annotation.JsonProperty("path")
        private String path;

        /**
         * Artifact path.
         *
         * @param path the value to set
         * @return this builder
         */
        public Builder path(String path) {
            this.path = path;
            this.__explicitlySet__.add("path");
            return this;
        }
        /** Endpoint suffix. Defaults to dfs.core.windows.net. */
        @com.fasterxml.jackson.annotation.JsonProperty("endpointSuffix")
        private String endpointSuffix;

        /**
         * Endpoint suffix. Defaults to dfs.core.windows.net.
         *
         * @param endpointSuffix the value to set
         * @return this builder
         */
        public Builder endpointSuffix(String endpointSuffix) {
            this.endpointSuffix = endpointSuffix;
            this.__explicitlySet__.add("endpointSuffix");
            return this;
        }
        /**
         * Storage account access key. Deprecated: This field is deprecated and replaced by
         * "accountKeySecretId". This change follows the GoldenGate "Plain Text Fields in
         * Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accountKey")
        private char[] accountKey;

        /**
         * Storage account access key. Deprecated: This field is deprecated and replaced by
         * "accountKeySecretId". This change follows the GoldenGate "Plain Text Fields in
         * Connections" deprecation:
         * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
         *
         * @param accountKey the value to set
         * @return this builder
         */
        public Builder accountKey(char[] accountKey) {
            this.accountKey = accountKey;
            this.__explicitlySet__.add("accountKey");
            return this;
        }

        public Builder accountKey(String accountKey) {
            this.accountKey = accountKey != null ? accountKey.toCharArray() : null;
            this.__explicitlySet__.add("accountKey");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the storage account access key. Note: When provided, 'accountKey'
         * field must not be provided.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accountKeySecretId")
        private String accountKeySecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the storage account access key. Note: When provided, 'accountKey'
         * field must not be provided.
         *
         * @param accountKeySecretId the value to set
         * @return this builder
         */
        public Builder accountKeySecretId(String accountKeySecretId) {
            this.accountKeySecretId = accountKeySecretId;
            this.__explicitlySet__.add("accountKeySecretId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateAzureDataLakeStorageDatabricksEngineArtifactLocationDetails build() {
            CreateAzureDataLakeStorageDatabricksEngineArtifactLocationDetails model =
                    new CreateAzureDataLakeStorageDatabricksEngineArtifactLocationDetails(
                            this.shouldOverwriteExisting,
                            this.storageAccount,
                            this.filesystem,
                            this.path,
                            this.endpointSuffix,
                            this.accountKey,
                            this.accountKeySecretId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(
                CreateAzureDataLakeStorageDatabricksEngineArtifactLocationDetails model) {
            if (model.wasPropertyExplicitlySet("shouldOverwriteExisting")) {
                this.shouldOverwriteExisting(model.getShouldOverwriteExisting());
            }
            if (model.wasPropertyExplicitlySet("storageAccount")) {
                this.storageAccount(model.getStorageAccount());
            }
            if (model.wasPropertyExplicitlySet("filesystem")) {
                this.filesystem(model.getFilesystem());
            }
            if (model.wasPropertyExplicitlySet("path")) {
                this.path(model.getPath());
            }
            if (model.wasPropertyExplicitlySet("endpointSuffix")) {
                this.endpointSuffix(model.getEndpointSuffix());
            }
            if (model.wasPropertyExplicitlySet("accountKey")) {
                this.accountKey(model.getAccountKey());
            }
            if (model.wasPropertyExplicitlySet("accountKeySecretId")) {
                this.accountKeySecretId(model.getAccountKeySecretId());
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
    public CreateAzureDataLakeStorageDatabricksEngineArtifactLocationDetails(
            Boolean shouldOverwriteExisting,
            String storageAccount,
            String filesystem,
            String path,
            String endpointSuffix,
            String accountKey,
            String accountKeySecretId) {
        super(shouldOverwriteExisting);
        this.storageAccount = storageAccount;
        this.filesystem = filesystem;
        this.path = path;
        this.endpointSuffix = endpointSuffix;
        this.accountKey = accountKey != null ? accountKey.toCharArray() : null;
        this.accountKeySecretId = accountKeySecretId;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    public CreateAzureDataLakeStorageDatabricksEngineArtifactLocationDetails(
            @com.fasterxml.jackson.annotation.JsonProperty("shouldOverwriteExisting")
                    Boolean shouldOverwriteExisting,
            @com.fasterxml.jackson.annotation.JsonProperty("storageAccount") String storageAccount,
            @com.fasterxml.jackson.annotation.JsonProperty("filesystem") String filesystem,
            @com.fasterxml.jackson.annotation.JsonProperty("path") String path,
            @com.fasterxml.jackson.annotation.JsonProperty("endpointSuffix") String endpointSuffix,
            @com.fasterxml.jackson.annotation.JsonProperty("accountKey") char[] accountKey,
            @com.fasterxml.jackson.annotation.JsonProperty("accountKeySecretId")
                    String accountKeySecretId) {
        super(shouldOverwriteExisting);
        this.storageAccount = storageAccount;
        this.filesystem = filesystem;
        this.path = path;
        this.endpointSuffix = endpointSuffix;
        this.accountKey = accountKey;
        this.accountKeySecretId = accountKeySecretId;
    }

    /** Azure Data Lake Storage Gen2 storage-account name. */
    @com.fasterxml.jackson.annotation.JsonProperty("storageAccount")
    private final String storageAccount;

    /**
     * Azure Data Lake Storage Gen2 storage-account name.
     *
     * @return the value
     */
    public String getStorageAccount() {
        return storageAccount;
    }

    /**
     * Azure Data Lake Storage Gen2 filesystem containing the application artifacts. Example:
     * "ggs-artifacts"
     */
    @com.fasterxml.jackson.annotation.JsonProperty("filesystem")
    private final String filesystem;

    /**
     * Azure Data Lake Storage Gen2 filesystem containing the application artifacts. Example:
     * "ggs-artifacts"
     *
     * @return the value
     */
    public String getFilesystem() {
        return filesystem;
    }

    /** Artifact path. */
    @com.fasterxml.jackson.annotation.JsonProperty("path")
    private final String path;

    /**
     * Artifact path.
     *
     * @return the value
     */
    public String getPath() {
        return path;
    }

    /** Endpoint suffix. Defaults to dfs.core.windows.net. */
    @com.fasterxml.jackson.annotation.JsonProperty("endpointSuffix")
    private final String endpointSuffix;

    /**
     * Endpoint suffix. Defaults to dfs.core.windows.net.
     *
     * @return the value
     */
    public String getEndpointSuffix() {
        return endpointSuffix;
    }

    /**
     * Storage account access key. Deprecated: This field is deprecated and replaced by
     * "accountKeySecretId". This change follows the GoldenGate "Plain Text Fields in Connections"
     * deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accountKey")
    private final char[] accountKey;

    /**
     * Storage account access key. Deprecated: This field is deprecated and replaced by
     * &quot;accountKeySecretId&quot;. This change follows the GoldenGate &quot;Plain Text Fields in
     * Connections&quot; deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     * @deprecated Use getAccountKey__AsCharArray() instead.
     */
    @Deprecated
    @com.fasterxml.jackson.annotation.JsonIgnore
    public String getAccountKey() {
        return accountKey != null ? new String(accountKey) : null;
    }

    /**
     * Storage account access key. Deprecated: This field is deprecated and replaced by
     * "accountKeySecretId". This change follows the GoldenGate "Plain Text Fields in Connections"
     * deprecation:
     * https://docs.oracle.com/en-us/iaas/Content/servicechanges.htm#servicechanges_topic-GoldenGate
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accountKey")
    public char[] getAccountKey__AsCharArray() {
        return accountKey;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the storage account access key. Note: When provided, 'accountKey' field
     * must not be provided.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accountKeySecretId")
    private final String accountKeySecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the storage account access key. Note: When provided, 'accountKey' field
     * must not be provided.
     *
     * @return the value
     */
    public String getAccountKeySecretId() {
        return accountKeySecretId;
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
        sb.append("CreateAzureDataLakeStorageDatabricksEngineArtifactLocationDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", storageAccount=").append(String.valueOf(this.storageAccount));
        sb.append(", filesystem=").append(String.valueOf(this.filesystem));
        sb.append(", path=").append(String.valueOf(this.path));
        sb.append(", endpointSuffix=").append(String.valueOf(this.endpointSuffix));
        sb.append(", accountKey=").append("<redacted>");
        sb.append(", accountKeySecretId=").append(String.valueOf(this.accountKeySecretId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateAzureDataLakeStorageDatabricksEngineArtifactLocationDetails)) {
            return false;
        }

        CreateAzureDataLakeStorageDatabricksEngineArtifactLocationDetails other =
                (CreateAzureDataLakeStorageDatabricksEngineArtifactLocationDetails) o;
        return java.util.Objects.equals(this.storageAccount, other.storageAccount)
                && java.util.Objects.equals(this.filesystem, other.filesystem)
                && java.util.Objects.equals(this.path, other.path)
                && java.util.Objects.equals(this.endpointSuffix, other.endpointSuffix)
                && java.util.Objects.equals(this.accountKey, other.accountKey)
                && java.util.Objects.equals(this.accountKeySecretId, other.accountKeySecretId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result =
                (result * PRIME)
                        + (this.storageAccount == null ? 43 : this.storageAccount.hashCode());
        result = (result * PRIME) + (this.filesystem == null ? 43 : this.filesystem.hashCode());
        result = (result * PRIME) + (this.path == null ? 43 : this.path.hashCode());
        result =
                (result * PRIME)
                        + (this.endpointSuffix == null ? 43 : this.endpointSuffix.hashCode());
        result = (result * PRIME) + (this.accountKey == null ? 43 : this.accountKey.hashCode());
        result =
                (result * PRIME)
                        + (this.accountKeySecretId == null
                                ? 43
                                : this.accountKeySecretId.hashCode());
        return result;
    }
}
