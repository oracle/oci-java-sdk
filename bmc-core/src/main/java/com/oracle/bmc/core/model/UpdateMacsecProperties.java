/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Properties used to update MACsec settings. <br>
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
        builder = UpdateMacsecProperties.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateMacsecProperties
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"state", "primaryKey", "encryptionCipher"})
    public UpdateMacsecProperties(
            MacsecState state,
            UpdateMacsecKey primaryKey,
            MacsecEncryptionCipher encryptionCipher) {
        super();
        this.state = state;
        this.primaryKey = primaryKey;
        this.encryptionCipher = encryptionCipher;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Indicates whether or not MACsec is enabled. */
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private MacsecState state;

        /**
         * Indicates whether or not MACsec is enabled.
         *
         * @param state the value to set
         * @return this builder
         */
        public Builder state(MacsecState state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("primaryKey")
        private UpdateMacsecKey primaryKey;

        public Builder primaryKey(UpdateMacsecKey primaryKey) {
            this.primaryKey = primaryKey;
            this.__explicitlySet__.add("primaryKey");
            return this;
        }
        /** Type of encryption cipher suite to use for the MACsec connection. */
        @com.fasterxml.jackson.annotation.JsonProperty("encryptionCipher")
        private MacsecEncryptionCipher encryptionCipher;

        /**
         * Type of encryption cipher suite to use for the MACsec connection.
         *
         * @param encryptionCipher the value to set
         * @return this builder
         */
        public Builder encryptionCipher(MacsecEncryptionCipher encryptionCipher) {
            this.encryptionCipher = encryptionCipher;
            this.__explicitlySet__.add("encryptionCipher");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateMacsecProperties build() {
            UpdateMacsecProperties model =
                    new UpdateMacsecProperties(this.state, this.primaryKey, this.encryptionCipher);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateMacsecProperties model) {
            if (model.wasPropertyExplicitlySet("state")) {
                this.state(model.getState());
            }
            if (model.wasPropertyExplicitlySet("primaryKey")) {
                this.primaryKey(model.getPrimaryKey());
            }
            if (model.wasPropertyExplicitlySet("encryptionCipher")) {
                this.encryptionCipher(model.getEncryptionCipher());
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

    /** Indicates whether or not MACsec is enabled. */
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    private final MacsecState state;

    /**
     * Indicates whether or not MACsec is enabled.
     *
     * @return the value
     */
    public MacsecState getState() {
        return state;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("primaryKey")
    private final UpdateMacsecKey primaryKey;

    public UpdateMacsecKey getPrimaryKey() {
        return primaryKey;
    }

    /** Type of encryption cipher suite to use for the MACsec connection. */
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionCipher")
    private final MacsecEncryptionCipher encryptionCipher;

    /**
     * Type of encryption cipher suite to use for the MACsec connection.
     *
     * @return the value
     */
    public MacsecEncryptionCipher getEncryptionCipher() {
        return encryptionCipher;
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
        sb.append("UpdateMacsecProperties(");
        sb.append("super=").append(super.toString());
        sb.append("state=").append(String.valueOf(this.state));
        sb.append(", primaryKey=").append(String.valueOf(this.primaryKey));
        sb.append(", encryptionCipher=").append(String.valueOf(this.encryptionCipher));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateMacsecProperties)) {
            return false;
        }

        UpdateMacsecProperties other = (UpdateMacsecProperties) o;
        return java.util.Objects.equals(this.state, other.state)
                && java.util.Objects.equals(this.primaryKey, other.primaryKey)
                && java.util.Objects.equals(this.encryptionCipher, other.encryptionCipher)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.state == null ? 43 : this.state.hashCode());
        result = (result * PRIME) + (this.primaryKey == null ? 43 : this.primaryKey.hashCode());
        result =
                (result * PRIME)
                        + (this.encryptionCipher == null ? 43 : this.encryptionCipher.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
