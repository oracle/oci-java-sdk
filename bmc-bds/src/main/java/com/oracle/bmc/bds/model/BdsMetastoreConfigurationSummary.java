/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.bds.model;

/**
 * The summary of metastore configuration information. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190531")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = BdsMetastoreConfigurationSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class BdsMetastoreConfigurationSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "displayName",
        "metastoreType",
        "metastoreId",
        "bdsApiKeyId",
        "lifecycleState",
        "timeCreated",
        "timeUpdated"
    })
    public BdsMetastoreConfigurationSummary(
            String id,
            String displayName,
            BdsMetastoreConfiguration.MetastoreType metastoreType,
            String metastoreId,
            String bdsApiKeyId,
            BdsMetastoreConfiguration.LifecycleState lifecycleState,
            java.util.Date timeCreated,
            java.util.Date timeUpdated) {
        super();
        this.id = id;
        this.displayName = displayName;
        this.metastoreType = metastoreType;
        this.metastoreId = metastoreId;
        this.bdsApiKeyId = bdsApiKeyId;
        this.lifecycleState = lifecycleState;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The ID of the metastore configuration */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The ID of the metastore configuration
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The display name of metastore configuration */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of metastore configuration
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /** The type of the metastore in the metastore configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("metastoreType")
        private BdsMetastoreConfiguration.MetastoreType metastoreType;

        /**
         * The type of the metastore in the metastore configuration.
         *
         * @param metastoreType the value to set
         * @return this builder
         */
        public Builder metastoreType(BdsMetastoreConfiguration.MetastoreType metastoreType) {
            this.metastoreType = metastoreType;
            this.__explicitlySet__.add("metastoreType");
            return this;
        }
        /** The OCID of the Data Catalog metastore. Set only if metastore's type is EXTERNAL. */
        @com.fasterxml.jackson.annotation.JsonProperty("metastoreId")
        private String metastoreId;

        /**
         * The OCID of the Data Catalog metastore. Set only if metastore's type is EXTERNAL.
         *
         * @param metastoreId the value to set
         * @return this builder
         */
        public Builder metastoreId(String metastoreId) {
            this.metastoreId = metastoreId;
            this.__explicitlySet__.add("metastoreId");
            return this;
        }
        /**
         * The ID of BDS API Key used for metastore configuration. Set only if metastore's type is
         * EXTERNAL.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bdsApiKeyId")
        private String bdsApiKeyId;

        /**
         * The ID of BDS API Key used for metastore configuration. Set only if metastore's type is
         * EXTERNAL.
         *
         * @param bdsApiKeyId the value to set
         * @return this builder
         */
        public Builder bdsApiKeyId(String bdsApiKeyId) {
            this.bdsApiKeyId = bdsApiKeyId;
            this.__explicitlySet__.add("bdsApiKeyId");
            return this;
        }
        /** the lifecycle state of the metastore configuration. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private BdsMetastoreConfiguration.LifecycleState lifecycleState;

        /**
         * the lifecycle state of the metastore configuration.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(BdsMetastoreConfiguration.LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The time when the configuration was created, shown as an RFC 3339 formatted datetime
         * string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The time when the configuration was created, shown as an RFC 3339 formatted datetime
         * string.
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The time when the configuration was updated, shown as an RFC 3339 formatted datetime
         * string.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The time when the configuration was updated, shown as an RFC 3339 formatted datetime
         * string.
         *
         * @param timeUpdated the value to set
         * @return this builder
         */
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public BdsMetastoreConfigurationSummary build() {
            BdsMetastoreConfigurationSummary model =
                    new BdsMetastoreConfigurationSummary(
                            this.id,
                            this.displayName,
                            this.metastoreType,
                            this.metastoreId,
                            this.bdsApiKeyId,
                            this.lifecycleState,
                            this.timeCreated,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(BdsMetastoreConfigurationSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("metastoreType")) {
                this.metastoreType(model.getMetastoreType());
            }
            if (model.wasPropertyExplicitlySet("metastoreId")) {
                this.metastoreId(model.getMetastoreId());
            }
            if (model.wasPropertyExplicitlySet("bdsApiKeyId")) {
                this.bdsApiKeyId(model.getBdsApiKeyId());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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

    /** The ID of the metastore configuration */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The ID of the metastore configuration
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The display name of metastore configuration */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of metastore configuration
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /** The type of the metastore in the metastore configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("metastoreType")
    private final BdsMetastoreConfiguration.MetastoreType metastoreType;

    /**
     * The type of the metastore in the metastore configuration.
     *
     * @return the value
     */
    public BdsMetastoreConfiguration.MetastoreType getMetastoreType() {
        return metastoreType;
    }

    /** The OCID of the Data Catalog metastore. Set only if metastore's type is EXTERNAL. */
    @com.fasterxml.jackson.annotation.JsonProperty("metastoreId")
    private final String metastoreId;

    /**
     * The OCID of the Data Catalog metastore. Set only if metastore's type is EXTERNAL.
     *
     * @return the value
     */
    public String getMetastoreId() {
        return metastoreId;
    }

    /**
     * The ID of BDS API Key used for metastore configuration. Set only if metastore's type is
     * EXTERNAL.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bdsApiKeyId")
    private final String bdsApiKeyId;

    /**
     * The ID of BDS API Key used for metastore configuration. Set only if metastore's type is
     * EXTERNAL.
     *
     * @return the value
     */
    public String getBdsApiKeyId() {
        return bdsApiKeyId;
    }

    /** the lifecycle state of the metastore configuration. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final BdsMetastoreConfiguration.LifecycleState lifecycleState;

    /**
     * the lifecycle state of the metastore configuration.
     *
     * @return the value
     */
    public BdsMetastoreConfiguration.LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The time when the configuration was created, shown as an RFC 3339 formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The time when the configuration was created, shown as an RFC 3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The time when the configuration was updated, shown as an RFC 3339 formatted datetime string.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The time when the configuration was updated, shown as an RFC 3339 formatted datetime string.
     *
     * @return the value
     */
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("BdsMetastoreConfigurationSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", displayName=").append(String.valueOf(this.displayName));
        sb.append(", metastoreType=").append(String.valueOf(this.metastoreType));
        sb.append(", metastoreId=").append(String.valueOf(this.metastoreId));
        sb.append(", bdsApiKeyId=").append(String.valueOf(this.bdsApiKeyId));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BdsMetastoreConfigurationSummary)) {
            return false;
        }

        BdsMetastoreConfigurationSummary other = (BdsMetastoreConfigurationSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.metastoreType, other.metastoreType)
                && java.util.Objects.equals(this.metastoreId, other.metastoreId)
                && java.util.Objects.equals(this.bdsApiKeyId, other.bdsApiKeyId)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.metastoreType == null ? 43 : this.metastoreType.hashCode());
        result = (result * PRIME) + (this.metastoreId == null ? 43 : this.metastoreId.hashCode());
        result = (result * PRIME) + (this.bdsApiKeyId == null ? 43 : this.bdsApiKeyId.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
