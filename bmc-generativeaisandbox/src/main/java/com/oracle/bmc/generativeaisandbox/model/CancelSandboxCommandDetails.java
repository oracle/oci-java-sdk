/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.generativeaisandbox.model;

/**
 * Request body used to cancel a sandbox command. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 1.0")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CancelSandboxCommandDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CancelSandboxCommandDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"signal"})
    public CancelSandboxCommandDetails(Signal signal) {
        super();
        this.signal = signal;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Signal to send to the running command. */
        @com.fasterxml.jackson.annotation.JsonProperty("signal")
        private Signal signal;

        /**
         * Signal to send to the running command.
         *
         * @param signal the value to set
         * @return this builder
         */
        public Builder signal(Signal signal) {
            this.signal = signal;
            this.__explicitlySet__.add("signal");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CancelSandboxCommandDetails build() {
            CancelSandboxCommandDetails model = new CancelSandboxCommandDetails(this.signal);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CancelSandboxCommandDetails model) {
            if (model.wasPropertyExplicitlySet("signal")) {
                this.signal(model.getSignal());
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

    /** Signal to send to the running command. */
    public enum Signal implements com.oracle.bmc.http.internal.BmcEnum {
        Sigterm("SIGTERM"),
        Sigkill("SIGKILL"),
        ;

        private final String value;
        private static java.util.Map<String, Signal> map;

        static {
            map = new java.util.HashMap<>();
            for (Signal v : Signal.values()) {
                map.put(v.getValue(), v);
            }
        }

        Signal(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Signal create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Signal: " + key);
        }
    };
    /** Signal to send to the running command. */
    @com.fasterxml.jackson.annotation.JsonProperty("signal")
    private final Signal signal;

    /**
     * Signal to send to the running command.
     *
     * @return the value
     */
    public Signal getSignal() {
        return signal;
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
        sb.append("CancelSandboxCommandDetails(");
        sb.append("super=").append(super.toString());
        sb.append("signal=").append(String.valueOf(this.signal));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CancelSandboxCommandDetails)) {
            return false;
        }

        CancelSandboxCommandDetails other = (CancelSandboxCommandDetails) o;
        return java.util.Objects.equals(this.signal, other.signal) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.signal == null ? 43 : this.signal.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
