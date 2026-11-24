/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.goldengate.model;

/**
 * The information to update the Azure Storage warehouse storage configuration for Oracle AI Data
 * Catalog Storage connection. <br>
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
        builder = UpdateAzureStorageWarehouseStorageDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "storageType")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateAzureStorageWarehouseStorageDetails extends UpdateWarehouseStorageDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The Azure Storage account name. */
        @com.fasterxml.jackson.annotation.JsonProperty("accountName")
        private String accountName;

        /**
         * The Azure Storage account name.
         *
         * @param accountName the value to set
         * @return this builder
         */
        public Builder accountName(String accountName) {
            this.accountName = accountName;
            this.__explicitlySet__.add("accountName");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the Azure Storage account key.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accountKeySecretId")
        private String accountKeySecretId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * Secret that stores the Azure Storage account key.
         *
         * @param accountKeySecretId the value to set
         * @return this builder
         */
        public Builder accountKeySecretId(String accountKeySecretId) {
            this.accountKeySecretId = accountKeySecretId;
            this.__explicitlySet__.add("accountKeySecretId");
            return this;
        }
        /** The Azure Storage account key. */
        @com.fasterxml.jackson.annotation.JsonProperty("accountKey")
        private char[] accountKey;

        /**
         * The Azure Storage account key.
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateAzureStorageWarehouseStorageDetails build() {
            UpdateAzureStorageWarehouseStorageDetails model =
                    new UpdateAzureStorageWarehouseStorageDetails(
                            this.accountName, this.accountKeySecretId, this.accountKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateAzureStorageWarehouseStorageDetails model) {
            if (model.wasPropertyExplicitlySet("accountName")) {
                this.accountName(model.getAccountName());
            }
            if (model.wasPropertyExplicitlySet("accountKeySecretId")) {
                this.accountKeySecretId(model.getAccountKeySecretId());
            }
            if (model.wasPropertyExplicitlySet("accountKey")) {
                this.accountKey(model.getAccountKey());
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
    public UpdateAzureStorageWarehouseStorageDetails(
            String accountName, String accountKeySecretId, String accountKey) {
        super();
        this.accountName = accountName;
        this.accountKeySecretId = accountKeySecretId;
        this.accountKey = accountKey != null ? accountKey.toCharArray() : null;
    }

    @com.fasterxml.jackson.annotation.JsonCreator
    @Deprecated
    public UpdateAzureStorageWarehouseStorageDetails(
            @com.fasterxml.jackson.annotation.JsonProperty("accountName") String accountName,
            @com.fasterxml.jackson.annotation.JsonProperty("accountKeySecretId")
                    String accountKeySecretId,
            @com.fasterxml.jackson.annotation.JsonProperty("accountKey") char[] accountKey) {
        super();
        this.accountName = accountName;
        this.accountKeySecretId = accountKeySecretId;
        this.accountKey = accountKey;
    }

    /** The Azure Storage account name. */
    @com.fasterxml.jackson.annotation.JsonProperty("accountName")
    private final String accountName;

    /**
     * The Azure Storage account name.
     *
     * @return the value
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the Azure Storage account key.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accountKeySecretId")
    private final String accountKeySecretId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * Secret that stores the Azure Storage account key.
     *
     * @return the value
     */
    public String getAccountKeySecretId() {
        return accountKeySecretId;
    }

    /** The Azure Storage account key. */
    @com.fasterxml.jackson.annotation.JsonProperty("accountKey")
    private final char[] accountKey;

    /**
     * The Azure Storage account key.
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
     * The Azure Storage account key.
     *
     * @return the value
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accountKey")
    public char[] getAccountKey__AsCharArray() {
        return accountKey;
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
        sb.append("UpdateAzureStorageWarehouseStorageDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", accountName=").append(String.valueOf(this.accountName));
        sb.append(", accountKeySecretId=").append(String.valueOf(this.accountKeySecretId));
        sb.append(", accountKey=").append("<redacted>");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateAzureStorageWarehouseStorageDetails)) {
            return false;
        }

        UpdateAzureStorageWarehouseStorageDetails other =
                (UpdateAzureStorageWarehouseStorageDetails) o;
        return java.util.Objects.equals(this.accountName, other.accountName)
                && java.util.Objects.equals(this.accountKeySecretId, other.accountKeySecretId)
                && java.util.Objects.equals(this.accountKey, other.accountKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.accountName == null ? 43 : this.accountName.hashCode());
        result =
                (result * PRIME)
                        + (this.accountKeySecretId == null
                                ? 43
                                : this.accountKeySecretId.hashCode());
        result = (result * PRIME) + (this.accountKey == null ? 43 : this.accountKey.hashCode());
        return result;
    }
}
