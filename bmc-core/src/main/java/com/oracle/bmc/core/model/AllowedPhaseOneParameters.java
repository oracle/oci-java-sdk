/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Allowed phase one parameters. <br>
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
        builder = AllowedPhaseOneParameters.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AllowedPhaseOneParameters
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "encryptionAlgorithms",
        "authenticationAlgorithms",
        "dhGroups"
    })
    public AllowedPhaseOneParameters(
            java.util.List<String> encryptionAlgorithms,
            java.util.List<String> authenticationAlgorithms,
            java.util.List<String> dhGroups) {
        super();
        this.encryptionAlgorithms = encryptionAlgorithms;
        this.authenticationAlgorithms = authenticationAlgorithms;
        this.dhGroups = dhGroups;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Allowed phase one encryption algorithms. */
        @com.fasterxml.jackson.annotation.JsonProperty("encryptionAlgorithms")
        private java.util.List<String> encryptionAlgorithms;

        /**
         * Allowed phase one encryption algorithms.
         *
         * @param encryptionAlgorithms the value to set
         * @return this builder
         */
        public Builder encryptionAlgorithms(java.util.List<String> encryptionAlgorithms) {
            this.encryptionAlgorithms = encryptionAlgorithms;
            this.__explicitlySet__.add("encryptionAlgorithms");
            return this;
        }
        /** Allowed phase one authentication algorithms. */
        @com.fasterxml.jackson.annotation.JsonProperty("authenticationAlgorithms")
        private java.util.List<String> authenticationAlgorithms;

        /**
         * Allowed phase one authentication algorithms.
         *
         * @param authenticationAlgorithms the value to set
         * @return this builder
         */
        public Builder authenticationAlgorithms(java.util.List<String> authenticationAlgorithms) {
            this.authenticationAlgorithms = authenticationAlgorithms;
            this.__explicitlySet__.add("authenticationAlgorithms");
            return this;
        }
        /** Allowed phase one Diffie-Hellman groups. */
        @com.fasterxml.jackson.annotation.JsonProperty("dhGroups")
        private java.util.List<String> dhGroups;

        /**
         * Allowed phase one Diffie-Hellman groups.
         *
         * @param dhGroups the value to set
         * @return this builder
         */
        public Builder dhGroups(java.util.List<String> dhGroups) {
            this.dhGroups = dhGroups;
            this.__explicitlySet__.add("dhGroups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AllowedPhaseOneParameters build() {
            AllowedPhaseOneParameters model =
                    new AllowedPhaseOneParameters(
                            this.encryptionAlgorithms,
                            this.authenticationAlgorithms,
                            this.dhGroups);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AllowedPhaseOneParameters model) {
            if (model.wasPropertyExplicitlySet("encryptionAlgorithms")) {
                this.encryptionAlgorithms(model.getEncryptionAlgorithms());
            }
            if (model.wasPropertyExplicitlySet("authenticationAlgorithms")) {
                this.authenticationAlgorithms(model.getAuthenticationAlgorithms());
            }
            if (model.wasPropertyExplicitlySet("dhGroups")) {
                this.dhGroups(model.getDhGroups());
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

    /** Allowed phase one encryption algorithms. */
    @com.fasterxml.jackson.annotation.JsonProperty("encryptionAlgorithms")
    private final java.util.List<String> encryptionAlgorithms;

    /**
     * Allowed phase one encryption algorithms.
     *
     * @return the value
     */
    public java.util.List<String> getEncryptionAlgorithms() {
        return encryptionAlgorithms;
    }

    /** Allowed phase one authentication algorithms. */
    @com.fasterxml.jackson.annotation.JsonProperty("authenticationAlgorithms")
    private final java.util.List<String> authenticationAlgorithms;

    /**
     * Allowed phase one authentication algorithms.
     *
     * @return the value
     */
    public java.util.List<String> getAuthenticationAlgorithms() {
        return authenticationAlgorithms;
    }

    /** Allowed phase one Diffie-Hellman groups. */
    @com.fasterxml.jackson.annotation.JsonProperty("dhGroups")
    private final java.util.List<String> dhGroups;

    /**
     * Allowed phase one Diffie-Hellman groups.
     *
     * @return the value
     */
    public java.util.List<String> getDhGroups() {
        return dhGroups;
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
        sb.append("AllowedPhaseOneParameters(");
        sb.append("super=").append(super.toString());
        sb.append("encryptionAlgorithms=").append(String.valueOf(this.encryptionAlgorithms));
        sb.append(", authenticationAlgorithms=")
                .append(String.valueOf(this.authenticationAlgorithms));
        sb.append(", dhGroups=").append(String.valueOf(this.dhGroups));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AllowedPhaseOneParameters)) {
            return false;
        }

        AllowedPhaseOneParameters other = (AllowedPhaseOneParameters) o;
        return java.util.Objects.equals(this.encryptionAlgorithms, other.encryptionAlgorithms)
                && java.util.Objects.equals(
                        this.authenticationAlgorithms, other.authenticationAlgorithms)
                && java.util.Objects.equals(this.dhGroups, other.dhGroups)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.encryptionAlgorithms == null
                                ? 43
                                : this.encryptionAlgorithms.hashCode());
        result =
                (result * PRIME)
                        + (this.authenticationAlgorithms == null
                                ? 43
                                : this.authenticationAlgorithms.hashCode());
        result = (result * PRIME) + (this.dhGroups == null ? 43 : this.dhGroups.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
