/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeai.model;

/**
 * Best-effort runtime observations returned by GetSandboxWarmPool. Runtime read failure does not
 * fail an otherwise successful configuration read or change the pool lifecycle. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231130")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = SandboxWarmPoolRuntimeStatus.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class SandboxWarmPoolRuntimeStatus
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"readyCapacity", "observationStatus", "timeRead", "reason"})
    public SandboxWarmPoolRuntimeStatus(
            Integer readyCapacity,
            ObservationStatus observationStatus,
            java.util.Date timeRead,
            String reason) {
        super();
        this.readyCapacity = readyCapacity;
        this.observationStatus = observationStatus;
        this.timeRead = timeRead;
        this.reason = reason;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Controller-reported ready idle Sandbox members, excluding adopted customer Sandboxes.
         * Omitted when unavailable; a known zero is returned as zero. This eventually consistent
         * count is not a reservation or a guarantee of current allocation readiness.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("readyCapacity")
        private Integer readyCapacity;

        /**
         * Controller-reported ready idle Sandbox members, excluding adopted customer Sandboxes.
         * Omitted when unavailable; a known zero is returned as zero. This eventually consistent
         * count is not a reservation or a guarantee of current allocation readiness.
         *
         * @param readyCapacity the value to set
         * @return this builder
         */
        public Builder readyCapacity(Integer readyCapacity) {
            this.readyCapacity = readyCapacity;
            this.__explicitlySet__.add("readyCapacity");
            return this;
        }
        /**
         * OBSERVED means the runtime status was read. UNAVAILABLE means no usable observation is
         * available; configuration and management lifecycle are still returned.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("observationStatus")
        private ObservationStatus observationStatus;

        /**
         * OBSERVED means the runtime status was read. UNAVAILABLE means no usable observation is
         * available; configuration and management lifecycle are still returned.
         *
         * @param observationStatus the value to set
         * @return this builder
         */
        public Builder observationStatus(ObservationStatus observationStatus) {
            this.observationStatus = observationStatus;
            this.__explicitlySet__.add("observationStatus");
            return this;
        }
        /**
         * Time the runtime status was fetched, not the controller's last reconciliation time. A
         * successful Kubernetes read can still contain an older controller observation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeRead")
        private java.util.Date timeRead;

        /**
         * Time the runtime status was fetched, not the controller's last reconciliation time. A
         * successful Kubernetes read can still contain an older controller observation.
         *
         * @param timeRead the value to set
         * @return this builder
         */
        public Builder timeRead(java.util.Date timeRead) {
            this.timeRead = timeRead;
            this.__explicitlySet__.add("timeRead");
            return this;
        }
        /** Concise explanation when runtime observations are unavailable. */
        @com.fasterxml.jackson.annotation.JsonProperty("reason")
        private String reason;

        /**
         * Concise explanation when runtime observations are unavailable.
         *
         * @param reason the value to set
         * @return this builder
         */
        public Builder reason(String reason) {
            this.reason = reason;
            this.__explicitlySet__.add("reason");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SandboxWarmPoolRuntimeStatus build() {
            SandboxWarmPoolRuntimeStatus model =
                    new SandboxWarmPoolRuntimeStatus(
                            this.readyCapacity, this.observationStatus, this.timeRead, this.reason);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SandboxWarmPoolRuntimeStatus model) {
            if (model.wasPropertyExplicitlySet("readyCapacity")) {
                this.readyCapacity(model.getReadyCapacity());
            }
            if (model.wasPropertyExplicitlySet("observationStatus")) {
                this.observationStatus(model.getObservationStatus());
            }
            if (model.wasPropertyExplicitlySet("timeRead")) {
                this.timeRead(model.getTimeRead());
            }
            if (model.wasPropertyExplicitlySet("reason")) {
                this.reason(model.getReason());
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
     * Controller-reported ready idle Sandbox members, excluding adopted customer Sandboxes. Omitted
     * when unavailable; a known zero is returned as zero. This eventually consistent count is not a
     * reservation or a guarantee of current allocation readiness.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readyCapacity")
    private final Integer readyCapacity;

    /**
     * Controller-reported ready idle Sandbox members, excluding adopted customer Sandboxes. Omitted
     * when unavailable; a known zero is returned as zero. This eventually consistent count is not a
     * reservation or a guarantee of current allocation readiness.
     *
     * @return the value
     */
    public Integer getReadyCapacity() {
        return readyCapacity;
    }

    /**
     * OBSERVED means the runtime status was read. UNAVAILABLE means no usable observation is
     * available; configuration and management lifecycle are still returned.
     */
    public enum ObservationStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Observed("OBSERVED"),
        Unavailable("UNAVAILABLE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ObservationStatus.class);

        private final String value;
        private static java.util.Map<String, ObservationStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (ObservationStatus v : ObservationStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ObservationStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ObservationStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ObservationStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * OBSERVED means the runtime status was read. UNAVAILABLE means no usable observation is
     * available; configuration and management lifecycle are still returned.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("observationStatus")
    private final ObservationStatus observationStatus;

    /**
     * OBSERVED means the runtime status was read. UNAVAILABLE means no usable observation is
     * available; configuration and management lifecycle are still returned.
     *
     * @return the value
     */
    public ObservationStatus getObservationStatus() {
        return observationStatus;
    }

    /**
     * Time the runtime status was fetched, not the controller's last reconciliation time. A
     * successful Kubernetes read can still contain an older controller observation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeRead")
    private final java.util.Date timeRead;

    /**
     * Time the runtime status was fetched, not the controller's last reconciliation time. A
     * successful Kubernetes read can still contain an older controller observation.
     *
     * @return the value
     */
    public java.util.Date getTimeRead() {
        return timeRead;
    }

    /** Concise explanation when runtime observations are unavailable. */
    @com.fasterxml.jackson.annotation.JsonProperty("reason")
    private final String reason;

    /**
     * Concise explanation when runtime observations are unavailable.
     *
     * @return the value
     */
    public String getReason() {
        return reason;
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
        sb.append("SandboxWarmPoolRuntimeStatus(");
        sb.append("super=").append(super.toString());
        sb.append("readyCapacity=").append(String.valueOf(this.readyCapacity));
        sb.append(", observationStatus=").append(String.valueOf(this.observationStatus));
        sb.append(", timeRead=").append(String.valueOf(this.timeRead));
        sb.append(", reason=").append(String.valueOf(this.reason));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SandboxWarmPoolRuntimeStatus)) {
            return false;
        }

        SandboxWarmPoolRuntimeStatus other = (SandboxWarmPoolRuntimeStatus) o;
        return java.util.Objects.equals(this.readyCapacity, other.readyCapacity)
                && java.util.Objects.equals(this.observationStatus, other.observationStatus)
                && java.util.Objects.equals(this.timeRead, other.timeRead)
                && java.util.Objects.equals(this.reason, other.reason)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.readyCapacity == null ? 43 : this.readyCapacity.hashCode());
        result =
                (result * PRIME)
                        + (this.observationStatus == null ? 43 : this.observationStatus.hashCode());
        result = (result * PRIME) + (this.timeRead == null ? 43 : this.timeRead.hashCode());
        result = (result * PRIME) + (this.reason == null ? 43 : this.reason.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
