/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Properties used for MACsec (if capable).
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MacsecProperties.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
@lombok.Builder(builderClassName = "Builder", toBuilder = true)
public class MacsecProperties {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("state")
        private MacsecState state;

        public Builder state(MacsecState state) {
            this.state = state;
            this.__explicitlySet__.add("state");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("primaryKey")
        private MacsecKey primaryKey;

        public Builder primaryKey(MacsecKey primaryKey) {
            this.primaryKey = primaryKey;
            this.__explicitlySet__.add("primaryKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("encryptionCipher")
        private MacsecEncryptionCipher encryptionCipher;

        public Builder encryptionCipher(MacsecEncryptionCipher encryptionCipher) {
            this.encryptionCipher = encryptionCipher;
            this.__explicitlySet__.add("encryptionCipher");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MacsecProperties build() {
            MacsecProperties __instance__ =
                    new MacsecProperties(state, primaryKey, encryptionCipher);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MacsecProperties o) {
            Builder copiedBuilder =
                    state(o.getState())
                            .primaryKey(o.getPrimaryKey())
                            .encryptionCipher(o.getEncryptionCipher());

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

    /**
     * Indicates whether or not MACsec is enabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("state")
    MacsecState state;

    @com.fasterxml.jackson.annotation.JsonProperty("primaryKey")
    MacsecKey primaryKey;

    /**
     * Type of encryption cipher suite to use for the MACsec connection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionCipher")
    MacsecEncryptionCipher encryptionCipher;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
