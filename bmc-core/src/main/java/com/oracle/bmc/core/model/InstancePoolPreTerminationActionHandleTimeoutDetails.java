/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Options to handle timeout for pre-termination action. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = InstancePoolPreTerminationActionHandleTimeoutDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class InstancePoolPreTerminationActionHandleTimeoutDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"preserveBlockVolumeMode", "preserveBootVolumeMode"})
    public InstancePoolPreTerminationActionHandleTimeoutDetails(
            PreserveBlockVolumeMode preserveBlockVolumeMode,
            PreserveBootVolumeMode preserveBootVolumeMode) {
        super();
        this.preserveBlockVolumeMode = preserveBlockVolumeMode;
        this.preserveBootVolumeMode = preserveBootVolumeMode;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Whether the block volume should be preserved after termination. */
        @com.fasterxml.jackson.annotation.JsonProperty("preserveBlockVolumeMode")
        private PreserveBlockVolumeMode preserveBlockVolumeMode;

        /**
         * Whether the block volume should be preserved after termination.
         *
         * @param preserveBlockVolumeMode the value to set
         * @return this builder
         */
        public Builder preserveBlockVolumeMode(PreserveBlockVolumeMode preserveBlockVolumeMode) {
            this.preserveBlockVolumeMode = preserveBlockVolumeMode;
            this.__explicitlySet__.add("preserveBlockVolumeMode");
            return this;
        }
        /** Whether the boot volume should be preserved after termination. */
        @com.fasterxml.jackson.annotation.JsonProperty("preserveBootVolumeMode")
        private PreserveBootVolumeMode preserveBootVolumeMode;

        /**
         * Whether the boot volume should be preserved after termination.
         *
         * @param preserveBootVolumeMode the value to set
         * @return this builder
         */
        public Builder preserveBootVolumeMode(PreserveBootVolumeMode preserveBootVolumeMode) {
            this.preserveBootVolumeMode = preserveBootVolumeMode;
            this.__explicitlySet__.add("preserveBootVolumeMode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public InstancePoolPreTerminationActionHandleTimeoutDetails build() {
            InstancePoolPreTerminationActionHandleTimeoutDetails model =
                    new InstancePoolPreTerminationActionHandleTimeoutDetails(
                            this.preserveBlockVolumeMode, this.preserveBootVolumeMode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(InstancePoolPreTerminationActionHandleTimeoutDetails model) {
            if (model.wasPropertyExplicitlySet("preserveBlockVolumeMode")) {
                this.preserveBlockVolumeMode(model.getPreserveBlockVolumeMode());
            }
            if (model.wasPropertyExplicitlySet("preserveBootVolumeMode")) {
                this.preserveBootVolumeMode(model.getPreserveBootVolumeMode());
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

    /** Whether the block volume should be preserved after termination. */
    public enum PreserveBlockVolumeMode implements com.oracle.bmc.http.internal.BmcEnum {
        PreserveAlways("PRESERVE_ALWAYS"),
        PreserveOnTimeout("PRESERVE_ON_TIMEOUT"),
        DeleteAlways("DELETE_ALWAYS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PreserveBlockVolumeMode.class);

        private final String value;
        private static java.util.Map<String, PreserveBlockVolumeMode> map;

        static {
            map = new java.util.HashMap<>();
            for (PreserveBlockVolumeMode v : PreserveBlockVolumeMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PreserveBlockVolumeMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PreserveBlockVolumeMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PreserveBlockVolumeMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Whether the block volume should be preserved after termination. */
    @com.fasterxml.jackson.annotation.JsonProperty("preserveBlockVolumeMode")
    private final PreserveBlockVolumeMode preserveBlockVolumeMode;

    /**
     * Whether the block volume should be preserved after termination.
     *
     * @return the value
     */
    public PreserveBlockVolumeMode getPreserveBlockVolumeMode() {
        return preserveBlockVolumeMode;
    }

    /** Whether the boot volume should be preserved after termination. */
    public enum PreserveBootVolumeMode implements com.oracle.bmc.http.internal.BmcEnum {
        PreserveAlways("PRESERVE_ALWAYS"),
        PreserveOnTimeout("PRESERVE_ON_TIMEOUT"),
        DeleteAlways("DELETE_ALWAYS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PreserveBootVolumeMode.class);

        private final String value;
        private static java.util.Map<String, PreserveBootVolumeMode> map;

        static {
            map = new java.util.HashMap<>();
            for (PreserveBootVolumeMode v : PreserveBootVolumeMode.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PreserveBootVolumeMode(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PreserveBootVolumeMode create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PreserveBootVolumeMode', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Whether the boot volume should be preserved after termination. */
    @com.fasterxml.jackson.annotation.JsonProperty("preserveBootVolumeMode")
    private final PreserveBootVolumeMode preserveBootVolumeMode;

    /**
     * Whether the boot volume should be preserved after termination.
     *
     * @return the value
     */
    public PreserveBootVolumeMode getPreserveBootVolumeMode() {
        return preserveBootVolumeMode;
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
        sb.append("InstancePoolPreTerminationActionHandleTimeoutDetails(");
        sb.append("super=").append(super.toString());
        sb.append("preserveBlockVolumeMode=").append(String.valueOf(this.preserveBlockVolumeMode));
        sb.append(", preserveBootVolumeMode=").append(String.valueOf(this.preserveBootVolumeMode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof InstancePoolPreTerminationActionHandleTimeoutDetails)) {
            return false;
        }

        InstancePoolPreTerminationActionHandleTimeoutDetails other =
                (InstancePoolPreTerminationActionHandleTimeoutDetails) o;
        return java.util.Objects.equals(this.preserveBlockVolumeMode, other.preserveBlockVolumeMode)
                && java.util.Objects.equals(
                        this.preserveBootVolumeMode, other.preserveBootVolumeMode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.preserveBlockVolumeMode == null
                                ? 43
                                : this.preserveBlockVolumeMode.hashCode());
        result =
                (result * PRIME)
                        + (this.preserveBootVolumeMode == null
                                ? 43
                                : this.preserveBootVolumeMode.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
