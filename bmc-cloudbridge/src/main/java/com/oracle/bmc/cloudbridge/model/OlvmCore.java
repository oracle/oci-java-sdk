/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Core of the CPU in OLVM <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OlvmCore.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OlvmCore extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"index", "socket"})
    public OlvmCore(Integer index, Integer socket) {
        super();
        this.index = index;
        this.socket = socket;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Index of this CPU core */
        @com.fasterxml.jackson.annotation.JsonProperty("index")
        private Integer index;

        /**
         * Index of this CPU core
         *
         * @param index the value to set
         * @return this builder
         */
        public Builder index(Integer index) {
            this.index = index;
            this.__explicitlySet__.add("index");
            return this;
        }
        /** Socket of this CPU core */
        @com.fasterxml.jackson.annotation.JsonProperty("socket")
        private Integer socket;

        /**
         * Socket of this CPU core
         *
         * @param socket the value to set
         * @return this builder
         */
        public Builder socket(Integer socket) {
            this.socket = socket;
            this.__explicitlySet__.add("socket");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmCore build() {
            OlvmCore model = new OlvmCore(this.index, this.socket);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmCore model) {
            if (model.wasPropertyExplicitlySet("index")) {
                this.index(model.getIndex());
            }
            if (model.wasPropertyExplicitlySet("socket")) {
                this.socket(model.getSocket());
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

    /** Index of this CPU core */
    @com.fasterxml.jackson.annotation.JsonProperty("index")
    private final Integer index;

    /**
     * Index of this CPU core
     *
     * @return the value
     */
    public Integer getIndex() {
        return index;
    }

    /** Socket of this CPU core */
    @com.fasterxml.jackson.annotation.JsonProperty("socket")
    private final Integer socket;

    /**
     * Socket of this CPU core
     *
     * @return the value
     */
    public Integer getSocket() {
        return socket;
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
        sb.append("OlvmCore(");
        sb.append("super=").append(super.toString());
        sb.append("index=").append(String.valueOf(this.index));
        sb.append(", socket=").append(String.valueOf(this.socket));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmCore)) {
            return false;
        }

        OlvmCore other = (OlvmCore) o;
        return java.util.Objects.equals(this.index, other.index)
                && java.util.Objects.equals(this.socket, other.socket)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.index == null ? 43 : this.index.hashCode());
        result = (result * PRIME) + (this.socket == null ? 43 : this.socket.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
