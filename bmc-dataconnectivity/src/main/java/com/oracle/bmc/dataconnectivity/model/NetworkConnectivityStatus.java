/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The network validation status for a Private Endpoint - Data Asset pair.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = NetworkConnectivityStatus.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class NetworkConnectivityStatus {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
        private String dataAssetKey;

        public Builder dataAssetKey(String dataAssetKey) {
            this.dataAssetKey = dataAssetKey;
            this.__explicitlySet__.add("dataAssetKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("privateEndPointKey")
        private String privateEndPointKey;

        public Builder privateEndPointKey(String privateEndPointKey) {
            this.privateEndPointKey = privateEndPointKey;
            this.__explicitlySet__.add("privateEndPointKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
        private String errorMessage;

        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            this.__explicitlySet__.add("errorMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeLastUpdated")
        private java.util.Date timeLastUpdated;

        public Builder timeLastUpdated(java.util.Date timeLastUpdated) {
            this.timeLastUpdated = timeLastUpdated;
            this.__explicitlySet__.add("timeLastUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("networkValidationStatusEnum")
        private NetworkValidationStatusEnum networkValidationStatusEnum;

        public Builder networkValidationStatusEnum(
                NetworkValidationStatusEnum networkValidationStatusEnum) {
            this.networkValidationStatusEnum = networkValidationStatusEnum;
            this.__explicitlySet__.add("networkValidationStatusEnum");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public NetworkConnectivityStatus build() {
            NetworkConnectivityStatus __instance__ =
                    new NetworkConnectivityStatus(
                            dataAssetKey,
                            privateEndPointKey,
                            errorMessage,
                            timeLastUpdated,
                            networkValidationStatusEnum);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(NetworkConnectivityStatus o) {
            Builder copiedBuilder =
                    dataAssetKey(o.getDataAssetKey())
                            .privateEndPointKey(o.getPrivateEndPointKey())
                            .errorMessage(o.getErrorMessage())
                            .timeLastUpdated(o.getTimeLastUpdated())
                            .networkValidationStatusEnum(o.getNetworkValidationStatusEnum());

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

    /**
     * DataAsset key to which the NetworkValidationStatus belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("dataAssetKey")
    String dataAssetKey;

    /**
     * PrivateEndpoint key, if any, to which the NetworkValidationStatus belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("privateEndPointKey")
    String privateEndPointKey;

    /**
     * Exception or error message encountered while testing network reachability for the data asset.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessage")
    String errorMessage;

    /**
     * Instant when the network validation was last done for the given DataAsset-PrivateEndpoint pair..
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeLastUpdated")
    java.util.Date timeLastUpdated;
    /**
     * Exception or error message encountered while testing network reachability for the data asset.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum NetworkValidationStatusEnum {
        Reachable("REACHABLE"),
        NotReachable("NOT_REACHABLE"),
        Error("ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("networkValidationStatusEnum")
    NetworkValidationStatusEnum networkValidationStatusEnum;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
