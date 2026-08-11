/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.distributeddatabasev26.model;

/**
 * Details of the request to create exascale db vault storage for shard or catalog of the
 * distributed database. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20260101")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DbStorageVaultDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DbStorageVaultDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "compartmentId",
        "highCapacityDatabaseStorage",
        "additionalFlashCacheInPercent",
        "subscriptionId",
        "isAutoscaleEnabled",
        "autoscaleLimitInGBs"
    })
    public DbStorageVaultDetails(
            String compartmentId,
            Integer highCapacityDatabaseStorage,
            Integer additionalFlashCacheInPercent,
            String subscriptionId,
            Boolean isAutoscaleEnabled,
            Integer autoscaleLimitInGBs) {
        super();
        this.compartmentId = compartmentId;
        this.highCapacityDatabaseStorage = highCapacityDatabaseStorage;
        this.additionalFlashCacheInPercent = additionalFlashCacheInPercent;
        this.subscriptionId = subscriptionId;
        this.isAutoscaleEnabled = isAutoscaleEnabled;
        this.autoscaleLimitInGBs = autoscaleLimitInGBs;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment for Db Storage Vault.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * compartment for Db Storage Vault.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /** Total storage capacity in GB for vault storage. */
        @com.fasterxml.jackson.annotation.JsonProperty("highCapacityDatabaseStorage")
        private Integer highCapacityDatabaseStorage;

        /**
         * Total storage capacity in GB for vault storage.
         *
         * @param highCapacityDatabaseStorage the value to set
         * @return this builder
         */
        public Builder highCapacityDatabaseStorage(Integer highCapacityDatabaseStorage) {
            this.highCapacityDatabaseStorage = highCapacityDatabaseStorage;
            this.__explicitlySet__.add("highCapacityDatabaseStorage");
            return this;
        }
        /** The size of additional Flash Cache in percentage of High Capacity database storage. */
        @com.fasterxml.jackson.annotation.JsonProperty("additionalFlashCacheInPercent")
        private Integer additionalFlashCacheInPercent;

        /**
         * The size of additional Flash Cache in percentage of High Capacity database storage.
         *
         * @param additionalFlashCacheInPercent the value to set
         * @return this builder
         */
        public Builder additionalFlashCacheInPercent(Integer additionalFlashCacheInPercent) {
            this.additionalFlashCacheInPercent = additionalFlashCacheInPercent;
            this.__explicitlySet__.add("additionalFlashCacheInPercent");
            return this;
        }
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subscription with which resource needs to be associated with.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
        private String subscriptionId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * subscription with which resource needs to be associated with.
         *
         * @param subscriptionId the value to set
         * @return this builder
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            this.__explicitlySet__.add("subscriptionId");
            return this;
        }
        /**
         * Indicates if autoscale feature is enabled for the Database Storage Vault. The default
         * value is {@code FALSE}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAutoscaleEnabled")
        private Boolean isAutoscaleEnabled;

        /**
         * Indicates if autoscale feature is enabled for the Database Storage Vault. The default
         * value is {@code FALSE}.
         *
         * @param isAutoscaleEnabled the value to set
         * @return this builder
         */
        public Builder isAutoscaleEnabled(Boolean isAutoscaleEnabled) {
            this.isAutoscaleEnabled = isAutoscaleEnabled;
            this.__explicitlySet__.add("isAutoscaleEnabled");
            return this;
        }
        /**
         * The maximum limit, in gigabytes, to which the Vault storage size can automatically scale
         * when auto scaling is enabled for the Database Storage Vault.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("autoscaleLimitInGBs")
        private Integer autoscaleLimitInGBs;

        /**
         * The maximum limit, in gigabytes, to which the Vault storage size can automatically scale
         * when auto scaling is enabled for the Database Storage Vault.
         *
         * @param autoscaleLimitInGBs the value to set
         * @return this builder
         */
        public Builder autoscaleLimitInGBs(Integer autoscaleLimitInGBs) {
            this.autoscaleLimitInGBs = autoscaleLimitInGBs;
            this.__explicitlySet__.add("autoscaleLimitInGBs");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DbStorageVaultDetails build() {
            DbStorageVaultDetails model =
                    new DbStorageVaultDetails(
                            this.compartmentId,
                            this.highCapacityDatabaseStorage,
                            this.additionalFlashCacheInPercent,
                            this.subscriptionId,
                            this.isAutoscaleEnabled,
                            this.autoscaleLimitInGBs);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DbStorageVaultDetails model) {
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("highCapacityDatabaseStorage")) {
                this.highCapacityDatabaseStorage(model.getHighCapacityDatabaseStorage());
            }
            if (model.wasPropertyExplicitlySet("additionalFlashCacheInPercent")) {
                this.additionalFlashCacheInPercent(model.getAdditionalFlashCacheInPercent());
            }
            if (model.wasPropertyExplicitlySet("subscriptionId")) {
                this.subscriptionId(model.getSubscriptionId());
            }
            if (model.wasPropertyExplicitlySet("isAutoscaleEnabled")) {
                this.isAutoscaleEnabled(model.getIsAutoscaleEnabled());
            }
            if (model.wasPropertyExplicitlySet("autoscaleLimitInGBs")) {
                this.autoscaleLimitInGBs(model.getAutoscaleLimitInGBs());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment for Db Storage Vault.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * compartment for Db Storage Vault.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /** Total storage capacity in GB for vault storage. */
    @com.fasterxml.jackson.annotation.JsonProperty("highCapacityDatabaseStorage")
    private final Integer highCapacityDatabaseStorage;

    /**
     * Total storage capacity in GB for vault storage.
     *
     * @return the value
     */
    public Integer getHighCapacityDatabaseStorage() {
        return highCapacityDatabaseStorage;
    }

    /** The size of additional Flash Cache in percentage of High Capacity database storage. */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalFlashCacheInPercent")
    private final Integer additionalFlashCacheInPercent;

    /**
     * The size of additional Flash Cache in percentage of High Capacity database storage.
     *
     * @return the value
     */
    public Integer getAdditionalFlashCacheInPercent() {
        return additionalFlashCacheInPercent;
    }

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subscription with which resource needs to be associated with.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subscriptionId")
    private final String subscriptionId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * subscription with which resource needs to be associated with.
     *
     * @return the value
     */
    public String getSubscriptionId() {
        return subscriptionId;
    }

    /**
     * Indicates if autoscale feature is enabled for the Database Storage Vault. The default value
     * is {@code FALSE}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAutoscaleEnabled")
    private final Boolean isAutoscaleEnabled;

    /**
     * Indicates if autoscale feature is enabled for the Database Storage Vault. The default value
     * is {@code FALSE}.
     *
     * @return the value
     */
    public Boolean getIsAutoscaleEnabled() {
        return isAutoscaleEnabled;
    }

    /**
     * The maximum limit, in gigabytes, to which the Vault storage size can automatically scale when
     * auto scaling is enabled for the Database Storage Vault.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("autoscaleLimitInGBs")
    private final Integer autoscaleLimitInGBs;

    /**
     * The maximum limit, in gigabytes, to which the Vault storage size can automatically scale when
     * auto scaling is enabled for the Database Storage Vault.
     *
     * @return the value
     */
    public Integer getAutoscaleLimitInGBs() {
        return autoscaleLimitInGBs;
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
        sb.append("DbStorageVaultDetails(");
        sb.append("super=").append(super.toString());
        sb.append("compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", highCapacityDatabaseStorage=")
                .append(String.valueOf(this.highCapacityDatabaseStorage));
        sb.append(", additionalFlashCacheInPercent=")
                .append(String.valueOf(this.additionalFlashCacheInPercent));
        sb.append(", subscriptionId=").append(String.valueOf(this.subscriptionId));
        sb.append(", isAutoscaleEnabled=").append(String.valueOf(this.isAutoscaleEnabled));
        sb.append(", autoscaleLimitInGBs=").append(String.valueOf(this.autoscaleLimitInGBs));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DbStorageVaultDetails)) {
            return false;
        }

        DbStorageVaultDetails other = (DbStorageVaultDetails) o;
        return java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(
                        this.highCapacityDatabaseStorage, other.highCapacityDatabaseStorage)
                && java.util.Objects.equals(
                        this.additionalFlashCacheInPercent, other.additionalFlashCacheInPercent)
                && java.util.Objects.equals(this.subscriptionId, other.subscriptionId)
                && java.util.Objects.equals(this.isAutoscaleEnabled, other.isAutoscaleEnabled)
                && java.util.Objects.equals(this.autoscaleLimitInGBs, other.autoscaleLimitInGBs)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result =
                (result * PRIME)
                        + (this.highCapacityDatabaseStorage == null
                                ? 43
                                : this.highCapacityDatabaseStorage.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalFlashCacheInPercent == null
                                ? 43
                                : this.additionalFlashCacheInPercent.hashCode());
        result =
                (result * PRIME)
                        + (this.subscriptionId == null ? 43 : this.subscriptionId.hashCode());
        result =
                (result * PRIME)
                        + (this.isAutoscaleEnabled == null
                                ? 43
                                : this.isAutoscaleEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.autoscaleLimitInGBs == null
                                ? 43
                                : this.autoscaleLimitInGBs.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
