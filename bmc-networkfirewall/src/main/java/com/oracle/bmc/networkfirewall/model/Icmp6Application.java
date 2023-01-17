/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * ICMP6 Application used on the firewall policy rules. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Icmp6Application.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class Icmp6Application extends Application {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The value of the ICMP6 message Type field as defined by [RFC
         * 4443](https://www.rfc-editor.org/rfc/rfc4443.html#section-2.1).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("icmpType")
        private Integer icmpType;

        /**
         * The value of the ICMP6 message Type field as defined by [RFC
         * 4443](https://www.rfc-editor.org/rfc/rfc4443.html#section-2.1).
         *
         * @param icmpType the value to set
         * @return this builder
         */
        public Builder icmpType(Integer icmpType) {
            this.icmpType = icmpType;
            this.__explicitlySet__.add("icmpType");
            return this;
        }
        /**
         * The value of the ICMP6 message Code (subtype) field as defined by [RFC
         * 4443](https://www.rfc-editor.org/rfc/rfc4443.html#section-2.1).
         */
        @com.fasterxml.jackson.annotation.JsonProperty("icmpCode")
        private Integer icmpCode;

        /**
         * The value of the ICMP6 message Code (subtype) field as defined by [RFC
         * 4443](https://www.rfc-editor.org/rfc/rfc4443.html#section-2.1).
         *
         * @param icmpCode the value to set
         * @return this builder
         */
        public Builder icmpCode(Integer icmpCode) {
            this.icmpCode = icmpCode;
            this.__explicitlySet__.add("icmpCode");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Icmp6Application build() {
            Icmp6Application model = new Icmp6Application(this.icmpType, this.icmpCode);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Icmp6Application model) {
            if (model.wasPropertyExplicitlySet("icmpType")) {
                this.icmpType(model.getIcmpType());
            }
            if (model.wasPropertyExplicitlySet("icmpCode")) {
                this.icmpCode(model.getIcmpCode());
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

    @Deprecated
    public Icmp6Application(Integer icmpType, Integer icmpCode) {
        super();
        this.icmpType = icmpType;
        this.icmpCode = icmpCode;
    }

    /**
     * The value of the ICMP6 message Type field as defined by [RFC
     * 4443](https://www.rfc-editor.org/rfc/rfc4443.html#section-2.1).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("icmpType")
    private final Integer icmpType;

    /**
     * The value of the ICMP6 message Type field as defined by [RFC
     * 4443](https://www.rfc-editor.org/rfc/rfc4443.html#section-2.1).
     *
     * @return the value
     */
    public Integer getIcmpType() {
        return icmpType;
    }

    /**
     * The value of the ICMP6 message Code (subtype) field as defined by [RFC
     * 4443](https://www.rfc-editor.org/rfc/rfc4443.html#section-2.1).
     */
    @com.fasterxml.jackson.annotation.JsonProperty("icmpCode")
    private final Integer icmpCode;

    /**
     * The value of the ICMP6 message Code (subtype) field as defined by [RFC
     * 4443](https://www.rfc-editor.org/rfc/rfc4443.html#section-2.1).
     *
     * @return the value
     */
    public Integer getIcmpCode() {
        return icmpCode;
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
        sb.append("Icmp6Application(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", icmpType=").append(String.valueOf(this.icmpType));
        sb.append(", icmpCode=").append(String.valueOf(this.icmpCode));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Icmp6Application)) {
            return false;
        }

        Icmp6Application other = (Icmp6Application) o;
        return java.util.Objects.equals(this.icmpType, other.icmpType)
                && java.util.Objects.equals(this.icmpCode, other.icmpCode)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.icmpType == null ? 43 : this.icmpType.hashCode());
        result = (result * PRIME) + (this.icmpCode == null ? 43 : this.icmpCode.hashCode());
        return result;
    }
}
