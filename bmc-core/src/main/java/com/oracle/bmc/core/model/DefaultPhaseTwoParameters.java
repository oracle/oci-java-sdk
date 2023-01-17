/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Default phase two parameters.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = DefaultPhaseTwoParameters.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DefaultPhaseTwoParameters
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "defaultEncryptionAlgorithms",
        "defaultAuthenticationAlgorithms",
        "defaultPfsDhGroup"
    })
    public DefaultPhaseTwoParameters(
            java.util.List<String> defaultEncryptionAlgorithms,
            java.util.List<String> defaultAuthenticationAlgorithms,
            String defaultPfsDhGroup) {
        super();
        this.defaultEncryptionAlgorithms = defaultEncryptionAlgorithms;
        this.defaultAuthenticationAlgorithms = defaultAuthenticationAlgorithms;
        this.defaultPfsDhGroup = defaultPfsDhGroup;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Default phase two encryption algorithms.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultEncryptionAlgorithms")
        private java.util.List<String> defaultEncryptionAlgorithms;

        /**
         * Default phase two encryption algorithms.
         * @param defaultEncryptionAlgorithms the value to set
         * @return this builder
         **/
        public Builder defaultEncryptionAlgorithms(
                java.util.List<String> defaultEncryptionAlgorithms) {
            this.defaultEncryptionAlgorithms = defaultEncryptionAlgorithms;
            this.__explicitlySet__.add("defaultEncryptionAlgorithms");
            return this;
        }
        /**
         * Default phase two authentication algorithms.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultAuthenticationAlgorithms")
        private java.util.List<String> defaultAuthenticationAlgorithms;

        /**
         * Default phase two authentication algorithms.
         * @param defaultAuthenticationAlgorithms the value to set
         * @return this builder
         **/
        public Builder defaultAuthenticationAlgorithms(
                java.util.List<String> defaultAuthenticationAlgorithms) {
            this.defaultAuthenticationAlgorithms = defaultAuthenticationAlgorithms;
            this.__explicitlySet__.add("defaultAuthenticationAlgorithms");
            return this;
        }
        /**
         * Default perfect forward secrecy Diffie-Hellman groups.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("defaultPfsDhGroup")
        private String defaultPfsDhGroup;

        /**
         * Default perfect forward secrecy Diffie-Hellman groups.
         * @param defaultPfsDhGroup the value to set
         * @return this builder
         **/
        public Builder defaultPfsDhGroup(String defaultPfsDhGroup) {
            this.defaultPfsDhGroup = defaultPfsDhGroup;
            this.__explicitlySet__.add("defaultPfsDhGroup");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DefaultPhaseTwoParameters build() {
            DefaultPhaseTwoParameters model =
                    new DefaultPhaseTwoParameters(
                            this.defaultEncryptionAlgorithms,
                            this.defaultAuthenticationAlgorithms,
                            this.defaultPfsDhGroup);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DefaultPhaseTwoParameters model) {
            if (model.wasPropertyExplicitlySet("defaultEncryptionAlgorithms")) {
                this.defaultEncryptionAlgorithms(model.getDefaultEncryptionAlgorithms());
            }
            if (model.wasPropertyExplicitlySet("defaultAuthenticationAlgorithms")) {
                this.defaultAuthenticationAlgorithms(model.getDefaultAuthenticationAlgorithms());
            }
            if (model.wasPropertyExplicitlySet("defaultPfsDhGroup")) {
                this.defaultPfsDhGroup(model.getDefaultPfsDhGroup());
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
     * Default phase two encryption algorithms.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultEncryptionAlgorithms")
    private final java.util.List<String> defaultEncryptionAlgorithms;

    /**
     * Default phase two encryption algorithms.
     * @return the value
     **/
    public java.util.List<String> getDefaultEncryptionAlgorithms() {
        return defaultEncryptionAlgorithms;
    }

    /**
     * Default phase two authentication algorithms.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultAuthenticationAlgorithms")
    private final java.util.List<String> defaultAuthenticationAlgorithms;

    /**
     * Default phase two authentication algorithms.
     * @return the value
     **/
    public java.util.List<String> getDefaultAuthenticationAlgorithms() {
        return defaultAuthenticationAlgorithms;
    }

    /**
     * Default perfect forward secrecy Diffie-Hellman groups.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("defaultPfsDhGroup")
    private final String defaultPfsDhGroup;

    /**
     * Default perfect forward secrecy Diffie-Hellman groups.
     * @return the value
     **/
    public String getDefaultPfsDhGroup() {
        return defaultPfsDhGroup;
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
        sb.append("DefaultPhaseTwoParameters(");
        sb.append("super=").append(super.toString());
        sb.append("defaultEncryptionAlgorithms=")
                .append(String.valueOf(this.defaultEncryptionAlgorithms));
        sb.append(", defaultAuthenticationAlgorithms=")
                .append(String.valueOf(this.defaultAuthenticationAlgorithms));
        sb.append(", defaultPfsDhGroup=").append(String.valueOf(this.defaultPfsDhGroup));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DefaultPhaseTwoParameters)) {
            return false;
        }

        DefaultPhaseTwoParameters other = (DefaultPhaseTwoParameters) o;
        return java.util.Objects.equals(
                        this.defaultEncryptionAlgorithms, other.defaultEncryptionAlgorithms)
                && java.util.Objects.equals(
                        this.defaultAuthenticationAlgorithms, other.defaultAuthenticationAlgorithms)
                && java.util.Objects.equals(this.defaultPfsDhGroup, other.defaultPfsDhGroup)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.defaultEncryptionAlgorithms == null
                                ? 43
                                : this.defaultEncryptionAlgorithms.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultAuthenticationAlgorithms == null
                                ? 43
                                : this.defaultAuthenticationAlgorithms.hashCode());
        result =
                (result * PRIME)
                        + (this.defaultPfsDhGroup == null ? 43 : this.defaultPfsDhGroup.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
