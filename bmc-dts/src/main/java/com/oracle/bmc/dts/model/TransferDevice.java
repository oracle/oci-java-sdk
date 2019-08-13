/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.dts.model;

/**
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0.009")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TransferDevice.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class TransferDevice {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
        private String serialNumber;

        public Builder serialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            this.__explicitlySet__.add("serialNumber");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("iscsiIQN")
        private String iscsiIQN;

        public Builder iscsiIQN(String iscsiIQN) {
            this.iscsiIQN = iscsiIQN;
            this.__explicitlySet__.add("iscsiIQN");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("label")
        private String label;

        public Builder label(String label) {
            this.label = label;
            this.__explicitlySet__.add("label");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("transferJobId")
        private String transferJobId;

        public Builder transferJobId(String transferJobId) {
            this.transferJobId = transferJobId;
            this.__explicitlySet__.add("transferJobId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("attachedTransferPackageLabel")
        private String attachedTransferPackageLabel;

        public Builder attachedTransferPackageLabel(String attachedTransferPackageLabel) {
            this.attachedTransferPackageLabel = attachedTransferPackageLabel;
            this.__explicitlySet__.add("attachedTransferPackageLabel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("creationTime")
        private java.util.Date creationTime;

        public Builder creationTime(java.util.Date creationTime) {
            this.creationTime = creationTime;
            this.__explicitlySet__.add("creationTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("uploadStatusLogUri")
        private String uploadStatusLogUri;

        public Builder uploadStatusLogUri(String uploadStatusLogUri) {
            this.uploadStatusLogUri = uploadStatusLogUri;
            this.__explicitlySet__.add("uploadStatusLogUri");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TransferDevice build() {
            TransferDevice __instance__ =
                    new TransferDevice(
                            serialNumber,
                            iscsiIQN,
                            label,
                            lifecycleState,
                            transferJobId,
                            attachedTransferPackageLabel,
                            creationTime,
                            uploadStatusLogUri);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TransferDevice o) {
            Builder copiedBuilder =
                    serialNumber(o.getSerialNumber())
                            .iscsiIQN(o.getIscsiIQN())
                            .label(o.getLabel())
                            .lifecycleState(o.getLifecycleState())
                            .transferJobId(o.getTransferJobId())
                            .attachedTransferPackageLabel(o.getAttachedTransferPackageLabel())
                            .creationTime(o.getCreationTime())
                            .uploadStatusLogUri(o.getUploadStatusLogUri());

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

    @com.fasterxml.jackson.annotation.JsonProperty("serialNumber")
    String serialNumber;

    @com.fasterxml.jackson.annotation.JsonProperty("iscsiIQN")
    String iscsiIQN;

    @com.fasterxml.jackson.annotation.JsonProperty("label")
    String label;
    /**
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Preparing("PREPARING"),
        Ready("READY"),
        Packaged("PACKAGED"),
        Active("ACTIVE"),
        Processing("PROCESSING"),
        Complete("COMPLETE"),
        Missing("MISSING"),
        Error("ERROR"),
        Deleted("DELETED"),
        Cancelled("CANCELLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };

    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    @com.fasterxml.jackson.annotation.JsonProperty("transferJobId")
    String transferJobId;

    @com.fasterxml.jackson.annotation.JsonProperty("attachedTransferPackageLabel")
    String attachedTransferPackageLabel;

    @com.fasterxml.jackson.annotation.JsonProperty("creationTime")
    java.util.Date creationTime;

    @com.fasterxml.jackson.annotation.JsonProperty("uploadStatusLogUri")
    String uploadStatusLogUri;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
