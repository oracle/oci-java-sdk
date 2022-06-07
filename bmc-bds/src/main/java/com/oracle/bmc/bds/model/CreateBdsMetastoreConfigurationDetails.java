/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The request body when creating BDS metastore configuration.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateBdsMetastoreConfigurationDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateBdsMetastoreConfigurationDetails {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "metastoreId",
        "bdsApiKeyId",
        "bdsApiKeyPassphrase",
        "clusterAdminPassword"
    })
    public CreateBdsMetastoreConfigurationDetails(
            String displayName,
            String metastoreId,
            String bdsApiKeyId,
            String bdsApiKeyPassphrase,
            String clusterAdminPassword) {
        super();
        this.displayName = displayName;
        this.metastoreId = metastoreId;
        this.bdsApiKeyId = bdsApiKeyId;
        this.bdsApiKeyPassphrase = bdsApiKeyPassphrase;
        this.clusterAdminPassword = clusterAdminPassword;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("metastoreId")
        private String metastoreId;

        public Builder metastoreId(String metastoreId) {
            this.metastoreId = metastoreId;
            this.__explicitlySet__.add("metastoreId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bdsApiKeyId")
        private String bdsApiKeyId;

        public Builder bdsApiKeyId(String bdsApiKeyId) {
            this.bdsApiKeyId = bdsApiKeyId;
            this.__explicitlySet__.add("bdsApiKeyId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("bdsApiKeyPassphrase")
        private String bdsApiKeyPassphrase;

        public Builder bdsApiKeyPassphrase(String bdsApiKeyPassphrase) {
            this.bdsApiKeyPassphrase = bdsApiKeyPassphrase;
            this.__explicitlySet__.add("bdsApiKeyPassphrase");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
        private String clusterAdminPassword;

        public Builder clusterAdminPassword(String clusterAdminPassword) {
            this.clusterAdminPassword = clusterAdminPassword;
            this.__explicitlySet__.add("clusterAdminPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateBdsMetastoreConfigurationDetails build() {
            CreateBdsMetastoreConfigurationDetails __instance__ =
                    new CreateBdsMetastoreConfigurationDetails(
                            displayName,
                            metastoreId,
                            bdsApiKeyId,
                            bdsApiKeyPassphrase,
                            clusterAdminPassword);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateBdsMetastoreConfigurationDetails o) {
            Builder copiedBuilder =
                    displayName(o.getDisplayName())
                            .metastoreId(o.getMetastoreId())
                            .bdsApiKeyId(o.getBdsApiKeyId())
                            .bdsApiKeyPassphrase(o.getBdsApiKeyPassphrase())
                            .clusterAdminPassword(o.getClusterAdminPassword());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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

    /**
     * The display name of the metastore configuration
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of the Data Catalog metastore.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metastoreId")
    private final String metastoreId;

    public String getMetastoreId() {
        return metastoreId;
    }

    /**
     * The ID of BDS Api Key used for Data Catalog metastore integration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bdsApiKeyId")
    private final String bdsApiKeyId;

    public String getBdsApiKeyId() {
        return bdsApiKeyId;
    }

    /**
     * Base-64 encoded passphrase of the BDS Api Key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bdsApiKeyPassphrase")
    private final String bdsApiKeyPassphrase;

    public String getBdsApiKeyPassphrase() {
        return bdsApiKeyPassphrase;
    }

    /**
     * Base-64 encoded password for the cluster admin user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
    private final String clusterAdminPassword;

    public String getClusterAdminPassword() {
        return clusterAdminPassword;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("CreateBdsMetastoreConfigurationDetails(");
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", metastoreId=").append(String.valueOf(this.metastoreId));
        sb.append(", bdsApiKeyId=").append(String.valueOf(this.bdsApiKeyId));
        sb.append(", bdsApiKeyPassphrase=").append(String.valueOf(this.bdsApiKeyPassphrase));
        sb.append(", clusterAdminPassword=").append(String.valueOf(this.clusterAdminPassword));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateBdsMetastoreConfigurationDetails)) {
            return false;
        }

        CreateBdsMetastoreConfigurationDetails other = (CreateBdsMetastoreConfigurationDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.metastoreId, other.metastoreId)
                && java.util.Objects.equals(this.bdsApiKeyId, other.bdsApiKeyId)
                && java.util.Objects.equals(this.bdsApiKeyPassphrase, other.bdsApiKeyPassphrase)
                && java.util.Objects.equals(this.clusterAdminPassword, other.clusterAdminPassword)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.metastoreId == null ? 43 : this.metastoreId.hashCode());
        result = (result * PRIME) + (this.bdsApiKeyId == null ? 43 : this.bdsApiKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.bdsApiKeyPassphrase == null
                                ? 43
                                : this.bdsApiKeyPassphrase.hashCode());
        result =
                (result * PRIME)
                        + (this.clusterAdminPassword == null
                                ? 43
                                : this.clusterAdminPassword.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
