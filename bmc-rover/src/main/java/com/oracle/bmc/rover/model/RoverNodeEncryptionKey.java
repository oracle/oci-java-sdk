/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.rover.model;

/**
 * The response containing encryption key for a rover node. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20201210")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = RoverNodeEncryptionKey.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class RoverNodeEncryptionKey
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"encryptionKey"})
    public RoverNodeEncryptionKey(String encryptionKey) {
        super();
        this.encryptionKey = encryptionKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The encryption key key for a rover node. */
        @com.fasterxml.jackson.annotation.JsonProperty("encryptionKey")
        private String encryptionKey;

        /**
         * The encryption key key for a rover node.
         *
         * @param encryptionKey the value to set
         * @return this builder
         */
        public Builder encryptionKey(String encryptionKey) {
            this.encryptionKey = encryptionKey;
            this.__explicitlySet__.add("encryptionKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RoverNodeEncryptionKey build() {
            RoverNodeEncryptionKey model = new RoverNodeEncryptionKey(this.encryptionKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RoverNodeEncryptionKey model) {
            if (model.wasPropertyExplicitlySet("encryptionKey")) {
                this.encryptionKey(model.getEncryptionKey());
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

    /** The encryption key key for a rover node. */
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionKey")
    private final String encryptionKey;

    /**
     * The encryption key key for a rover node.
     *
     * @return the value
     */
    public String getEncryptionKey() {
        return encryptionKey;
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
        sb.append("RoverNodeEncryptionKey(");
        sb.append("super=").append(super.toString());
        sb.append("encryptionKey=").append(String.valueOf(this.encryptionKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RoverNodeEncryptionKey)) {
            return false;
        }

        RoverNodeEncryptionKey other = (RoverNodeEncryptionKey) o;
        return java.util.Objects.equals(this.encryptionKey, other.encryptionKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.encryptionKey == null ? 43 : this.encryptionKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
