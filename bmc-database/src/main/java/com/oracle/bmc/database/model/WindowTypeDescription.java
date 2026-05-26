/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.database.model;

/**
 * A key-value pair where the key will hold the window type and value will be a list of window
 * details from all the active execution windows of that window type. <br>
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
        builder = WindowTypeDescription.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class WindowTypeDescription
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"windowType", "messages"})
    public WindowTypeDescription(WindowType windowType, java.util.List<String> messages) {
        super();
        this.windowType = windowType;
        this.messages = messages;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The execution window is of PLANNED or UNPLANNED type. */
        @com.fasterxml.jackson.annotation.JsonProperty("windowType")
        private WindowType windowType;

        /**
         * The execution window is of PLANNED or UNPLANNED type.
         *
         * @param windowType the value to set
         * @return this builder
         */
        public Builder windowType(WindowType windowType) {
            this.windowType = windowType;
            this.__explicitlySet__.add("windowType");
            return this;
        }
        /**
         * A list of window detail messages from all the active execution windows based on the
         * window type.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("messages")
        private java.util.List<String> messages;

        /**
         * A list of window detail messages from all the active execution windows based on the
         * window type.
         *
         * @param messages the value to set
         * @return this builder
         */
        public Builder messages(java.util.List<String> messages) {
            this.messages = messages;
            this.__explicitlySet__.add("messages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WindowTypeDescription build() {
            WindowTypeDescription model = new WindowTypeDescription(this.windowType, this.messages);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WindowTypeDescription model) {
            if (model.wasPropertyExplicitlySet("windowType")) {
                this.windowType(model.getWindowType());
            }
            if (model.wasPropertyExplicitlySet("messages")) {
                this.messages(model.getMessages());
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

    /** The execution window is of PLANNED or UNPLANNED type. */
    public enum WindowType implements com.oracle.bmc.http.internal.BmcEnum {
        Planned("PLANNED"),
        Unplanned("UNPLANNED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(WindowType.class);

        private final String value;
        private static java.util.Map<String, WindowType> map;

        static {
            map = new java.util.HashMap<>();
            for (WindowType v : WindowType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        WindowType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static WindowType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'WindowType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The execution window is of PLANNED or UNPLANNED type. */
    @com.fasterxml.jackson.annotation.JsonProperty("windowType")
    private final WindowType windowType;

    /**
     * The execution window is of PLANNED or UNPLANNED type.
     *
     * @return the value
     */
    public WindowType getWindowType() {
        return windowType;
    }

    /**
     * A list of window detail messages from all the active execution windows based on the window
     * type.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("messages")
    private final java.util.List<String> messages;

    /**
     * A list of window detail messages from all the active execution windows based on the window
     * type.
     *
     * @return the value
     */
    public java.util.List<String> getMessages() {
        return messages;
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
        sb.append("WindowTypeDescription(");
        sb.append("super=").append(super.toString());
        sb.append("windowType=").append(String.valueOf(this.windowType));
        sb.append(", messages=").append(String.valueOf(this.messages));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WindowTypeDescription)) {
            return false;
        }

        WindowTypeDescription other = (WindowTypeDescription) o;
        return java.util.Objects.equals(this.windowType, other.windowType)
                && java.util.Objects.equals(this.messages, other.messages)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.windowType == null ? 43 : this.windowType.hashCode());
        result = (result * PRIME) + (this.messages == null ? 43 : this.messages.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
