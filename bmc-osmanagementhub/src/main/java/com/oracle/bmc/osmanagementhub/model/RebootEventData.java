/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagementhub.model;

/**
 * Provides additional information for a reboot event.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220901")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RebootEventData.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RebootEventData extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"rebootStatus", "additionalDetails"})
    public RebootEventData(
            RebootStatus rebootStatus, WorkRequestEventDataAdditionalDetails additionalDetails) {
        super();
        this.rebootStatus = rebootStatus;
        this.additionalDetails = additionalDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Reboot status for the current event
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("rebootStatus")
        private RebootStatus rebootStatus;

        /**
         * Reboot status for the current event
         * @param rebootStatus the value to set
         * @return this builder
         **/
        public Builder rebootStatus(RebootStatus rebootStatus) {
            this.rebootStatus = rebootStatus;
            this.__explicitlySet__.add("rebootStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
        private WorkRequestEventDataAdditionalDetails additionalDetails;

        public Builder additionalDetails(WorkRequestEventDataAdditionalDetails additionalDetails) {
            this.additionalDetails = additionalDetails;
            this.__explicitlySet__.add("additionalDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RebootEventData build() {
            RebootEventData model = new RebootEventData(this.rebootStatus, this.additionalDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RebootEventData model) {
            if (model.wasPropertyExplicitlySet("rebootStatus")) {
                this.rebootStatus(model.getRebootStatus());
            }
            if (model.wasPropertyExplicitlySet("additionalDetails")) {
                this.additionalDetails(model.getAdditionalDetails());
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
     * Reboot status for the current event
     **/
    public enum RebootStatus {
        RebootStarted("REBOOT_STARTED"),
        RebootSucceeded("REBOOT_SUCCEEDED"),
        RebootFailed("REBOOT_FAILED"),
        RebootSucceededAfterTimeout("REBOOT_SUCCEEDED_AFTER_TIMEOUT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(RebootStatus.class);

        private final String value;
        private static java.util.Map<String, RebootStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (RebootStatus v : RebootStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RebootStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RebootStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RebootStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Reboot status for the current event
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("rebootStatus")
    private final RebootStatus rebootStatus;

    /**
     * Reboot status for the current event
     * @return the value
     **/
    public RebootStatus getRebootStatus() {
        return rebootStatus;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("additionalDetails")
    private final WorkRequestEventDataAdditionalDetails additionalDetails;

    public WorkRequestEventDataAdditionalDetails getAdditionalDetails() {
        return additionalDetails;
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
        sb.append("RebootEventData(");
        sb.append("super=").append(super.toString());
        sb.append("rebootStatus=").append(String.valueOf(this.rebootStatus));
        sb.append(", additionalDetails=").append(String.valueOf(this.additionalDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RebootEventData)) {
            return false;
        }

        RebootEventData other = (RebootEventData) o;
        return java.util.Objects.equals(this.rebootStatus, other.rebootStatus)
                && java.util.Objects.equals(this.additionalDetails, other.additionalDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.rebootStatus == null ? 43 : this.rebootStatus.hashCode());
        result =
                (result * PRIME)
                        + (this.additionalDetails == null ? 43 : this.additionalDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
