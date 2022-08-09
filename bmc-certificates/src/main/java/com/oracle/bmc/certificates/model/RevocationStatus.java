/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificates.model;

/**
 * The current revocation status of the certificate or certificate authority (CA).
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RevocationStatus.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class RevocationStatus extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeRevoked", "revocationReason"})
    public RevocationStatus(java.util.Date timeRevoked, RevocationReason revocationReason) {
        super();
        this.timeRevoked = timeRevoked;
        this.revocationReason = revocationReason;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The time when the certificate or CA was revoked.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeRevoked")
        private java.util.Date timeRevoked;

        /**
         * The time when the certificate or CA was revoked.
         * @param timeRevoked the value to set
         * @return this builder
         **/
        public Builder timeRevoked(java.util.Date timeRevoked) {
            this.timeRevoked = timeRevoked;
            this.__explicitlySet__.add("timeRevoked");
            return this;
        }
        /**
         * The reason that the certificate or CA was revoked.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("revocationReason")
        private RevocationReason revocationReason;

        /**
         * The reason that the certificate or CA was revoked.
         * @param revocationReason the value to set
         * @return this builder
         **/
        public Builder revocationReason(RevocationReason revocationReason) {
            this.revocationReason = revocationReason;
            this.__explicitlySet__.add("revocationReason");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RevocationStatus build() {
            RevocationStatus model = new RevocationStatus(this.timeRevoked, this.revocationReason);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RevocationStatus model) {
            if (model.wasPropertyExplicitlySet("timeRevoked")) {
                this.timeRevoked(model.getTimeRevoked());
            }
            if (model.wasPropertyExplicitlySet("revocationReason")) {
                this.revocationReason(model.getRevocationReason());
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
     * The time when the certificate or CA was revoked.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeRevoked")
    private final java.util.Date timeRevoked;

    /**
     * The time when the certificate or CA was revoked.
     * @return the value
     **/
    public java.util.Date getTimeRevoked() {
        return timeRevoked;
    }

    /**
     * The reason that the certificate or CA was revoked.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("revocationReason")
    private final RevocationReason revocationReason;

    /**
     * The reason that the certificate or CA was revoked.
     * @return the value
     **/
    public RevocationReason getRevocationReason() {
        return revocationReason;
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
        sb.append("RevocationStatus(");
        sb.append("super=").append(super.toString());
        sb.append("timeRevoked=").append(String.valueOf(this.timeRevoked));
        sb.append(", revocationReason=").append(String.valueOf(this.revocationReason));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof RevocationStatus)) {
            return false;
        }

        RevocationStatus other = (RevocationStatus) o;
        return java.util.Objects.equals(this.timeRevoked, other.timeRevoked)
                && java.util.Objects.equals(this.revocationReason, other.revocationReason)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.timeRevoked == null ? 43 : this.timeRevoked.hashCode());
        result =
                (result * PRIME)
                        + (this.revocationReason == null ? 43 : this.revocationReason.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
