/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The network validation status for a Private Endpoint - Data Asset pair. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = NetworkConnectivityStatus.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class NetworkConnectivityStatus
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "dataAssetKey",
        "privateEndPointKey",
        "errorMessage",
        "timeLastUpdated",
        "networkValidationStatusEnum"
    })
    public NetworkConnectivityStatus(
            String dataAssetKey,
            String privateEndPointKey,
            String errorMessage,
            java.util.Date timeLastUpdated,
            NetworkValidationStatusEnum networkValidationStatusEnum) {
        super();
        this.dataAssetKey = dataAssetKey;
        this.privateEndPointKey = privateEndPointKey;
        this.errorMessage = errorMessage;
        this.timeLastUpdated = timeLastUpdated;
        this.networkValidationStatusEnum = networkValidationStatusEnum;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** DataAsset key to which the NetworkValidationStatus belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
        private String dataAssetKey;

        /**
         * DataAsset key to which the NetworkValidationStatus belongs to.
         *
         * @param dataAssetKey the value to set
         * @return this builder
         */
        public Builder dataAssetKey(String dataAssetKey) {
            this.dataAssetKey = dataAssetKey;
            this.__explicitlySet__.add("dataAssetKey");
            return this;
        }
        /** PrivateEndpoint key, if any, to which the NetworkValidationStatus belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("privateEndPointKey")
        private String privateEndPointKey;

        /**
         * PrivateEndpoint key, if any, to which the NetworkValidationStatus belongs to.
         *
         * @param privateEndPointKey the value to set
         * @return this builder
         */
        public Builder privateEndPointKey(String privateEndPointKey) {
            this.privateEndPointKey = privateEndPointKey;
            this.__explicitlySet__.add("privateEndPointKey");
            return this;
        }
        /**
         * Exception or error message encountered while testing network reachability for the data
         * asset.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        /**
         * Exception or error message encountered while testing network reachability for the data
         * asset.
         *
         * @param errorMessage the value to set
         * @return this builder
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }
        /**
         * The timestamp when the network validation was last updated for the given
         * DataAsset-PrivateEndpoint pair.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeLastUpdated")
        private java.util.Date timeLastUpdated;

        /**
         * The timestamp when the network validation was last updated for the given
         * DataAsset-PrivateEndpoint pair.
         *
         * @param timeLastUpdated the value to set
         * @return this builder
         */
        public Builder timeLastUpdated(java.util.Date timeLastUpdated) {
            this.timeLastUpdated = timeLastUpdated;
            this.__explicitlySet__.add("timeLastUpdated");
            return this;
        }
        /**
         * Exception or error message encountered while testing network reachability for the data
         * asset.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("networkValidationStatusEnum")
        private NetworkValidationStatusEnum networkValidationStatusEnum;

        /**
         * Exception or error message encountered while testing network reachability for the data
         * asset.
         *
         * @param networkValidationStatusEnum the value to set
         * @return this builder
         */
        public Builder networkValidationStatusEnum(
                NetworkValidationStatusEnum networkValidationStatusEnum) {
            this.networkValidationStatusEnum = networkValidationStatusEnum;
            this.__explicitlySet__.add("networkValidationStatusEnum");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NetworkConnectivityStatus build() {
            NetworkConnectivityStatus model =
                    new NetworkConnectivityStatus(
                            this.dataAssetKey,
                            this.privateEndPointKey,
                            this.errorMessage,
                            this.timeLastUpdated,
                            this.networkValidationStatusEnum);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NetworkConnectivityStatus model) {
            if (model.wasPropertyExplicitlySet("dataAssetKey")) {
                this.dataAssetKey(model.getDataAssetKey());
            }
            if (model.wasPropertyExplicitlySet("privateEndPointKey")) {
                this.privateEndPointKey(model.getPrivateEndPointKey());
            }
            if (model.wasPropertyExplicitlySet("errorMessage")) {
                this.errorMessage(model.getErrorMessage());
            }
            if (model.wasPropertyExplicitlySet("timeLastUpdated")) {
                this.timeLastUpdated(model.getTimeLastUpdated());
            }
            if (model.wasPropertyExplicitlySet("networkValidationStatusEnum")) {
                this.networkValidationStatusEnum(model.getNetworkValidationStatusEnum());
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

    /** DataAsset key to which the NetworkValidationStatus belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
    private final String dataAssetKey;

    /**
     * DataAsset key to which the NetworkValidationStatus belongs to.
     *
     * @return the value
     */
    public String getDataAssetKey() {
        return dataAssetKey;
    }

    /** PrivateEndpoint key, if any, to which the NetworkValidationStatus belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndPointKey")
    private final String privateEndPointKey;

    /**
     * PrivateEndpoint key, if any, to which the NetworkValidationStatus belongs to.
     *
     * @return the value
     */
    public String getPrivateEndPointKey() {
        return privateEndPointKey;
    }

    /**
     * Exception or error message encountered while testing network reachability for the data asset.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    private final String errorMessage;

    /**
     * Exception or error message encountered while testing network reachability for the data asset.
     *
     * @return the value
     */
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * The timestamp when the network validation was last updated for the given
     * DataAsset-PrivateEndpoint pair.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastUpdated")
    private final java.util.Date timeLastUpdated;

    /**
     * The timestamp when the network validation was last updated for the given
     * DataAsset-PrivateEndpoint pair.
     *
     * @return the value
     */
    public java.util.Date getTimeLastUpdated() {
        return timeLastUpdated;
    }

    /**
     * Exception or error message encountered while testing network reachability for the data asset.
     */
    public enum NetworkValidationStatusEnum implements com.oracle.bmc.http.internal.BmcEnum {
        Reachable("REACHABLE"),
        NotReachable("NOT_REACHABLE"),
        Error("ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(NetworkValidationStatusEnum.class);

        private final String value;
        private static java.util.Map<String, NetworkValidationStatusEnum> map;

        static {
            map = new java.util.HashMap<>();
            for (NetworkValidationStatusEnum v : NetworkValidationStatusEnum.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        NetworkValidationStatusEnum(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static NetworkValidationStatusEnum create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'NetworkValidationStatusEnum', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Exception or error message encountered while testing network reachability for the data asset.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("networkValidationStatusEnum")
    private final NetworkValidationStatusEnum networkValidationStatusEnum;

    /**
     * Exception or error message encountered while testing network reachability for the data asset.
     *
     * @return the value
     */
    public NetworkValidationStatusEnum getNetworkValidationStatusEnum() {
        return networkValidationStatusEnum;
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
        sb.append("NetworkConnectivityStatus(");
        sb.append("super=").append(super.toString());
        sb.append("dataAssetKey=").append(String.valueOf(this.dataAssetKey));
        sb.append(", privateEndPointKey=").append(String.valueOf(this.privateEndPointKey));
        sb.append(", errorMessage=").append(String.valueOf(this.errorMessage));
        sb.append(", timeLastUpdated=").append(String.valueOf(this.timeLastUpdated));
        sb.append(", networkValidationStatusEnum=")
                .append(String.valueOf(this.networkValidationStatusEnum));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof NetworkConnectivityStatus)) {
            return false;
        }

        NetworkConnectivityStatus other = (NetworkConnectivityStatus) o;
        return java.util.Objects.equals(this.dataAssetKey, other.dataAssetKey)
                && java.util.Objects.equals(this.privateEndPointKey, other.privateEndPointKey)
                && java.util.Objects.equals(this.errorMessage, other.errorMessage)
                && java.util.Objects.equals(this.timeLastUpdated, other.timeLastUpdated)
                && java.util.Objects.equals(
                        this.networkValidationStatusEnum, other.networkValidationStatusEnum)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.dataAssetKey == null ? 43 : this.dataAssetKey.hashCode());
        result =
                (result * PRIME)
                        + (this.privateEndPointKey == null
                                ? 43
                                : this.privateEndPointKey.hashCode());
        result = (result * PRIME) + (this.errorMessage == null ? 43 : this.errorMessage.hashCode());
        result =
                (result * PRIME)
                        + (this.timeLastUpdated == null ? 43 : this.timeLastUpdated.hashCode());
        result =
                (result * PRIME)
                        + (this.networkValidationStatusEnum == null
                                ? 43
                                : this.networkValidationStatusEnum.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
