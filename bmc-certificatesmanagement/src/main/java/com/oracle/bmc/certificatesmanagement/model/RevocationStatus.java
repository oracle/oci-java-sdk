/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificatesmanagement.model;

/**
 * The current revocation status of the entity. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = RevocationStatus.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class RevocationStatus
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"timeOfRevocation", "revocationReason"})
    public RevocationStatus(java.util.Date timeOfRevocation, RevocationReason revocationReason) {
        super();
        this.timeOfRevocation = timeOfRevocation;
        this.revocationReason = revocationReason;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The time when the entity was revoked, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeOfRevocation")
        private java.util.Date timeOfRevocation;

        /**
         * The time when the entity was revoked, expressed in [RFC
         * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
         * 2019-04-03T21:10:29.600Z}
         *
         * @param timeOfRevocation the value to set
         * @return this builder
         */
        public Builder timeOfRevocation(java.util.Date timeOfRevocation) {
            this.timeOfRevocation = timeOfRevocation;
            this.__explicitlySet__.add("timeOfRevocation");
            return this;
        }
        /** The reason the certificate or certificate authority (CA) was revoked. */
        @com.fasterxml.jackson.annotation.JsonProperty("revocationReason")
        private RevocationReason revocationReason;

        /**
         * The reason the certificate or certificate authority (CA) was revoked.
         *
         * @param revocationReason the value to set
         * @return this builder
         */
        public Builder revocationReason(RevocationReason revocationReason) {
            this.revocationReason = revocationReason;
            this.__explicitlySet__.add("revocationReason");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public RevocationStatus build() {
            RevocationStatus model =
                    new RevocationStatus(this.timeOfRevocation, this.revocationReason);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(RevocationStatus model) {
            if (model.wasPropertyExplicitlySet("timeOfRevocation")) {
                this.timeOfRevocation(model.getTimeOfRevocation());
            }
            if (model.wasPropertyExplicitlySet("revocationReason")) {
                this.revocationReason(model.getRevocationReason());
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

    /**
     * The time when the entity was revoked, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeOfRevocation")
    private final java.util.Date timeOfRevocation;

    /**
     * The time when the entity was revoked, expressed in [RFC
     * 3339](https://tools.ietf.org/html/rfc3339) timestamp format. Example: {@code
     * 2019-04-03T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeOfRevocation() {
        return timeOfRevocation;
    }

    /** The reason the certificate or certificate authority (CA) was revoked. */
    @com.fasterxml.jackson.annotation.JsonProperty("revocationReason")
    private final RevocationReason revocationReason;

    /**
     * The reason the certificate or certificate authority (CA) was revoked.
     *
     * @return the value
     */
    public RevocationReason getRevocationReason() {
        return revocationReason;
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
        sb.append("RevocationStatus(");
        sb.append("super=").append(super.toString());
        sb.append("timeOfRevocation=").append(String.valueOf(this.timeOfRevocation));
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
        return java.util.Objects.equals(this.timeOfRevocation, other.timeOfRevocation)
                && java.util.Objects.equals(this.revocationReason, other.revocationReason)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.timeOfRevocation == null ? 43 : this.timeOfRevocation.hashCode());
        result =
                (result * PRIME)
                        + (this.revocationReason == null ? 43 : this.revocationReason.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
