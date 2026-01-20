/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.emaildataplane.model;

/**
 * The destination for the email, composed of To, CC, and BCC fields. NOTE: At least one of To, CC,
 * and BCC must be provided. And max 50 recipients are allowed across the To:, CC: and BCC: fields.
 * <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220926")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Recipients.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Recipients extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"to", "cc", "bcc"})
    public Recipients(
            java.util.List<EmailAddress> to,
            java.util.List<EmailAddress> cc,
            java.util.List<EmailAddress> bcc) {
        super();
        this.to = to;
        this.cc = cc;
        this.bcc = bcc;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Array of To address. */
        @com.fasterxml.jackson.annotation.JsonProperty("to")
        private java.util.List<EmailAddress> to;

        /**
         * Array of To address.
         *
         * @param to the value to set
         * @return this builder
         */
        public Builder to(java.util.List<EmailAddress> to) {
            this.to = to;
            this.__explicitlySet__.add("to");
            return this;
        }
        /** Array of CC address. */
        @com.fasterxml.jackson.annotation.JsonProperty("cc")
        private java.util.List<EmailAddress> cc;

        /**
         * Array of CC address.
         *
         * @param cc the value to set
         * @return this builder
         */
        public Builder cc(java.util.List<EmailAddress> cc) {
            this.cc = cc;
            this.__explicitlySet__.add("cc");
            return this;
        }
        /** Array of BCC address. Bcc headers can only be viewed by non bcc recipients. */
        @com.fasterxml.jackson.annotation.JsonProperty("bcc")
        private java.util.List<EmailAddress> bcc;

        /**
         * Array of BCC address. Bcc headers can only be viewed by non bcc recipients.
         *
         * @param bcc the value to set
         * @return this builder
         */
        public Builder bcc(java.util.List<EmailAddress> bcc) {
            this.bcc = bcc;
            this.__explicitlySet__.add("bcc");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Recipients build() {
            Recipients model = new Recipients(this.to, this.cc, this.bcc);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Recipients model) {
            if (model.wasPropertyExplicitlySet("to")) {
                this.to(model.getTo());
            }
            if (model.wasPropertyExplicitlySet("cc")) {
                this.cc(model.getCc());
            }
            if (model.wasPropertyExplicitlySet("bcc")) {
                this.bcc(model.getBcc());
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

    /** Array of To address. */
    @com.fasterxml.jackson.annotation.JsonProperty("to")
    private final java.util.List<EmailAddress> to;

    /**
     * Array of To address.
     *
     * @return the value
     */
    public java.util.List<EmailAddress> getTo() {
        return to;
    }

    /** Array of CC address. */
    @com.fasterxml.jackson.annotation.JsonProperty("cc")
    private final java.util.List<EmailAddress> cc;

    /**
     * Array of CC address.
     *
     * @return the value
     */
    public java.util.List<EmailAddress> getCc() {
        return cc;
    }

    /** Array of BCC address. Bcc headers can only be viewed by non bcc recipients. */
    @com.fasterxml.jackson.annotation.JsonProperty("bcc")
    private final java.util.List<EmailAddress> bcc;

    /**
     * Array of BCC address. Bcc headers can only be viewed by non bcc recipients.
     *
     * @return the value
     */
    public java.util.List<EmailAddress> getBcc() {
        return bcc;
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
        sb.append("Recipients(");
        sb.append("super=").append(super.toString());
        sb.append("to=").append(String.valueOf(this.to));
        sb.append(", cc=").append(String.valueOf(this.cc));
        sb.append(", bcc=").append(String.valueOf(this.bcc));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Recipients)) {
            return false;
        }

        Recipients other = (Recipients) o;
        return java.util.Objects.equals(this.to, other.to)
                && java.util.Objects.equals(this.cc, other.cc)
                && java.util.Objects.equals(this.bcc, other.bcc)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.to == null ? 43 : this.to.hashCode());
        result = (result * PRIME) + (this.cc == null ? 43 : this.cc.hashCode());
        result = (result * PRIME) + (this.bcc == null ? 43 : this.bcc.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
