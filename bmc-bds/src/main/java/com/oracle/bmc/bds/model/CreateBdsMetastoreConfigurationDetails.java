/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
public final class CreateBdsMetastoreConfigurationDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
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
        /**
         * The display name of the metastore configuration
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the metastore configuration
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The OCID of the Data Catalog metastore.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("metastoreId")
        private String metastoreId;

        /**
         * The OCID of the Data Catalog metastore.
         * @param metastoreId the value to set
         * @return this builder
         **/
        public Builder metastoreId(String metastoreId) {
            this.metastoreId = metastoreId;
            this.__explicitlySet__.add("metastoreId");
            return this;
        }
        /**
         * The ID of BDS Api Key used for Data Catalog metastore integration.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bdsApiKeyId")
        private String bdsApiKeyId;

        /**
         * The ID of BDS Api Key used for Data Catalog metastore integration.
         * @param bdsApiKeyId the value to set
         * @return this builder
         **/
        public Builder bdsApiKeyId(String bdsApiKeyId) {
            this.bdsApiKeyId = bdsApiKeyId;
            this.__explicitlySet__.add("bdsApiKeyId");
            return this;
        }
        /**
         * Base-64 encoded passphrase of the BDS Api Key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("bdsApiKeyPassphrase")
        private String bdsApiKeyPassphrase;

        /**
         * Base-64 encoded passphrase of the BDS Api Key.
         * @param bdsApiKeyPassphrase the value to set
         * @return this builder
         **/
        public Builder bdsApiKeyPassphrase(String bdsApiKeyPassphrase) {
            this.bdsApiKeyPassphrase = bdsApiKeyPassphrase;
            this.__explicitlySet__.add("bdsApiKeyPassphrase");
            return this;
        }
        /**
         * Base-64 encoded password for the cluster admin user.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
        private String clusterAdminPassword;

        /**
         * Base-64 encoded password for the cluster admin user.
         * @param clusterAdminPassword the value to set
         * @return this builder
         **/
        public Builder clusterAdminPassword(String clusterAdminPassword) {
            this.clusterAdminPassword = clusterAdminPassword;
            this.__explicitlySet__.add("clusterAdminPassword");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateBdsMetastoreConfigurationDetails build() {
            CreateBdsMetastoreConfigurationDetails model =
                    new CreateBdsMetastoreConfigurationDetails(
                            this.displayName,
                            this.metastoreId,
                            this.bdsApiKeyId,
                            this.bdsApiKeyPassphrase,
                            this.clusterAdminPassword);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateBdsMetastoreConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("metastoreId")) {
                this.metastoreId(model.getMetastoreId());
            }
            if (model.wasPropertyExplicitlySet("bdsApiKeyId")) {
                this.bdsApiKeyId(model.getBdsApiKeyId());
            }
            if (model.wasPropertyExplicitlySet("bdsApiKeyPassphrase")) {
                this.bdsApiKeyPassphrase(model.getBdsApiKeyPassphrase());
            }
            if (model.wasPropertyExplicitlySet("clusterAdminPassword")) {
                this.clusterAdminPassword(model.getClusterAdminPassword());
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

    /**
     * The display name of the metastore configuration
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the metastore configuration
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The OCID of the Data Catalog metastore.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("metastoreId")
    private final String metastoreId;

    /**
     * The OCID of the Data Catalog metastore.
     * @return the value
     **/
    public String getMetastoreId() {
        return metastoreId;
    }

    /**
     * The ID of BDS Api Key used for Data Catalog metastore integration.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bdsApiKeyId")
    private final String bdsApiKeyId;

    /**
     * The ID of BDS Api Key used for Data Catalog metastore integration.
     * @return the value
     **/
    public String getBdsApiKeyId() {
        return bdsApiKeyId;
    }

    /**
     * Base-64 encoded passphrase of the BDS Api Key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("bdsApiKeyPassphrase")
    private final String bdsApiKeyPassphrase;

    /**
     * Base-64 encoded passphrase of the BDS Api Key.
     * @return the value
     **/
    public String getBdsApiKeyPassphrase() {
        return bdsApiKeyPassphrase;
    }

    /**
     * Base-64 encoded password for the cluster admin user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("clusterAdminPassword")
    private final String clusterAdminPassword;

    /**
     * Base-64 encoded password for the cluster admin user.
     * @return the value
     **/
    public String getClusterAdminPassword() {
        return clusterAdminPassword;
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
        sb.append("CreateBdsMetastoreConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", metastoreId=").append(String.valueOf(this.metastoreId));
        sb.append(", bdsApiKeyId=").append(String.valueOf(this.bdsApiKeyId));
        sb.append(", bdsApiKeyPassphrase=").append("<redacted>");
        sb.append(", clusterAdminPassword=").append("<redacted>");
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
                && super.equals(other);
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
