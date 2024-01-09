/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * Descriptor of a connection to an asset source. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AssetSourceConnection.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AssetSourceConnection
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "connectionType",
        "connectorId",
        "assetSourceKey",
        "lifecycleState",
        "lifecycleDetails"
    })
    public AssetSourceConnection(
            AssetSourceConnectionType connectionType,
            String connectorId,
            String assetSourceKey,
            AssetSourceConnectionLifecycleState lifecycleState,
            String lifecycleDetails) {
        super();
        this.connectionType = connectionType;
        this.connectorId = connectorId;
        this.assetSourceKey = assetSourceKey;
        this.lifecycleState = lifecycleState;
        this.lifecycleDetails = lifecycleDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The type of connection for an asset source. */
        @com.fasterxml.jackson.annotation.JsonProperty("connectionType")
        private AssetSourceConnectionType connectionType;

        /**
         * The type of connection for an asset source.
         *
         * @param connectionType the value to set
         * @return this builder
         */
        public Builder connectionType(AssetSourceConnectionType connectionType) {
            this.connectionType = connectionType;
            this.__explicitlySet__.add("connectionType");
            return this;
        }
        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * cloud bridge connector used for migration operations.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("connectorId")
        private String connectorId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * cloud bridge connector used for migration operations.
         *
         * @param connectorId the value to set
         * @return this builder
         */
        public Builder connectorId(String connectorId) {
            this.connectorId = connectorId;
            this.__explicitlySet__.add("connectorId");
            return this;
        }
        /** Type-specific identifier for an asset source. */
        @com.fasterxml.jackson.annotation.JsonProperty("assetSourceKey")
        private String assetSourceKey;

        /**
         * Type-specific identifier for an asset source.
         *
         * @param assetSourceKey the value to set
         * @return this builder
         */
        public Builder assetSourceKey(String assetSourceKey) {
            this.assetSourceKey = assetSourceKey;
            this.__explicitlySet__.add("assetSourceKey");
            return this;
        }
        /** The current state of the connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private AssetSourceConnectionLifecycleState lifecycleState;

        /**
         * The current state of the connection.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(AssetSourceConnectionLifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /** The detailed sub-state of the connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * The detailed sub-state of the connection.
         *
         * @param lifecycleDetails the value to set
         * @return this builder
         */
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AssetSourceConnection build() {
            AssetSourceConnection model =
                    new AssetSourceConnection(
                            this.connectionType,
                            this.connectorId,
                            this.assetSourceKey,
                            this.lifecycleState,
                            this.lifecycleDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AssetSourceConnection model) {
            if (model.wasPropertyExplicitlySet("connectionType")) {
                this.connectionType(model.getConnectionType());
            }
            if (model.wasPropertyExplicitlySet("connectorId")) {
                this.connectorId(model.getConnectorId());
            }
            if (model.wasPropertyExplicitlySet("assetSourceKey")) {
                this.assetSourceKey(model.getAssetSourceKey());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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

    /** The type of connection for an asset source. */
    @com.fasterxml.jackson.annotation.JsonProperty("connectionType")
    private final AssetSourceConnectionType connectionType;

    /**
     * The type of connection for an asset source.
     *
     * @return the value
     */
    public AssetSourceConnectionType getConnectionType() {
        return connectionType;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * cloud bridge connector used for migration operations.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("connectorId")
    private final String connectorId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * cloud bridge connector used for migration operations.
     *
     * @return the value
     */
    public String getConnectorId() {
        return connectorId;
    }

    /** Type-specific identifier for an asset source. */
    @com.fasterxml.jackson.annotation.JsonProperty("assetSourceKey")
    private final String assetSourceKey;

    /**
     * Type-specific identifier for an asset source.
     *
     * @return the value
     */
    public String getAssetSourceKey() {
        return assetSourceKey;
    }

    /** The current state of the connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final AssetSourceConnectionLifecycleState lifecycleState;

    /**
     * The current state of the connection.
     *
     * @return the value
     */
    public AssetSourceConnectionLifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /** The detailed sub-state of the connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * The detailed sub-state of the connection.
     *
     * @return the value
     */
    public String getLifecycleDetails() {
        return lifecycleDetails;
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
        sb.append("AssetSourceConnection(");
        sb.append("super=").append(super.toString());
        sb.append("connectionType=").append(String.valueOf(this.connectionType));
        sb.append(", connectorId=").append(String.valueOf(this.connectorId));
        sb.append(", assetSourceKey=").append(String.valueOf(this.assetSourceKey));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AssetSourceConnection)) {
            return false;
        }

        AssetSourceConnection other = (AssetSourceConnection) o;
        return java.util.Objects.equals(this.connectionType, other.connectionType)
                && java.util.Objects.equals(this.connectorId, other.connectorId)
                && java.util.Objects.equals(this.assetSourceKey, other.assetSourceKey)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.connectionType == null ? 43 : this.connectionType.hashCode());
        result = (result * PRIME) + (this.connectorId == null ? 43 : this.connectorId.hashCode());
        result =
                (result * PRIME)
                        + (this.assetSourceKey == null ? 43 : this.assetSourceKey.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
