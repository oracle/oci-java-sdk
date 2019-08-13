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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = TransferApplianceEntitlement.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class TransferApplianceEntitlement {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
        private String tenantId;

        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            this.__explicitlySet__.add("tenantId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestorName")
        private String requestorName;

        public Builder requestorName(String requestorName) {
            this.requestorName = requestorName;
            this.__explicitlySet__.add("requestorName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestorEmail")
        private String requestorEmail;

        public Builder requestorEmail(String requestorEmail) {
            this.requestorEmail = requestorEmail;
            this.__explicitlySet__.add("requestorEmail");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("creationTime")
        private java.util.Date creationTime;

        public Builder creationTime(java.util.Date creationTime) {
            this.creationTime = creationTime;
            this.__explicitlySet__.add("creationTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("updateTime")
        private java.util.Date updateTime;

        public Builder updateTime(java.util.Date updateTime) {
            this.updateTime = updateTime;
            this.__explicitlySet__.add("updateTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TransferApplianceEntitlement build() {
            TransferApplianceEntitlement __instance__ =
                    new TransferApplianceEntitlement(
                            tenantId,
                            requestorName,
                            requestorEmail,
                            status,
                            creationTime,
                            updateTime);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TransferApplianceEntitlement o) {
            Builder copiedBuilder =
                    tenantId(o.getTenantId())
                            .requestorName(o.getRequestorName())
                            .requestorEmail(o.getRequestorEmail())
                            .status(o.getStatus())
                            .creationTime(o.getCreationTime())
                            .updateTime(o.getUpdateTime());

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

    @com.fasterxml.jackson.annotation.JsonProperty("tenantId")
    String tenantId;

    @com.fasterxml.jackson.annotation.JsonProperty("requestorName")
    String requestorName;

    @com.fasterxml.jackson.annotation.JsonProperty("requestorEmail")
    String requestorEmail;
    /**
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Status {
        Requested("REQUESTED"),
        PendingSigning("PENDING_SIGNING"),
        PendingApproval("PENDING_APPROVAL"),
        TermsExpired("TERMS_EXPIRED"),
        Approved("APPROVED"),
        Rejected("REJECTED"),
        Cancelled("CANCELLED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };

    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;

    @com.fasterxml.jackson.annotation.JsonProperty("creationTime")
    java.util.Date creationTime;

    @com.fasterxml.jackson.annotation.JsonProperty("updateTime")
    java.util.Date updateTime;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
