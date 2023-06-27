/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataflow.model;

/**
 * The access control rule for SECURE_ACCESS network type selection.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200129")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = SecureAccessControlRule.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class SecureAccessControlRule
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"ipNotation", "value", "vcnIps"})
    public SecureAccessControlRule(IpNotationType ipNotation, String value, String vcnIps) {
        super();
        this.ipNotation = ipNotation;
        this.value = value;
        this.vcnIps = vcnIps;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The type of IP notation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("ipNotation")
        private IpNotationType ipNotation;

        /**
         * The type of IP notation.
         * @param ipNotation the value to set
         * @return this builder
         **/
        public Builder ipNotation(IpNotationType ipNotation) {
            this.ipNotation = ipNotation;
            this.__explicitlySet__.add("ipNotation");
            return this;
        }
        /**
         * The associated value of the selected IP notation.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The associated value of the selected IP notation.
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * A comma-separated IP or CIDR address for VCN OCID IP notation selection.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("vcnIps")
        private String vcnIps;

        /**
         * A comma-separated IP or CIDR address for VCN OCID IP notation selection.
         * @param vcnIps the value to set
         * @return this builder
         **/
        public Builder vcnIps(String vcnIps) {
            this.vcnIps = vcnIps;
            this.__explicitlySet__.add("vcnIps");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public SecureAccessControlRule build() {
            SecureAccessControlRule model =
                    new SecureAccessControlRule(this.ipNotation, this.value, this.vcnIps);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(SecureAccessControlRule model) {
            if (model.wasPropertyExplicitlySet("ipNotation")) {
                this.ipNotation(model.getIpNotation());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("vcnIps")) {
                this.vcnIps(model.getVcnIps());
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
     * The type of IP notation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("ipNotation")
    private final IpNotationType ipNotation;

    /**
     * The type of IP notation.
     * @return the value
     **/
    public IpNotationType getIpNotation() {
        return ipNotation;
    }

    /**
     * The associated value of the selected IP notation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The associated value of the selected IP notation.
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * A comma-separated IP or CIDR address for VCN OCID IP notation selection.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("vcnIps")
    private final String vcnIps;

    /**
     * A comma-separated IP or CIDR address for VCN OCID IP notation selection.
     * @return the value
     **/
    public String getVcnIps() {
        return vcnIps;
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
        sb.append("SecureAccessControlRule(");
        sb.append("super=").append(super.toString());
        sb.append("ipNotation=").append(String.valueOf(this.ipNotation));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", vcnIps=").append(String.valueOf(this.vcnIps));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof SecureAccessControlRule)) {
            return false;
        }

        SecureAccessControlRule other = (SecureAccessControlRule) o;
        return java.util.Objects.equals(this.ipNotation, other.ipNotation)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.vcnIps, other.vcnIps)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.ipNotation == null ? 43 : this.ipNotation.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.vcnIps == null ? 43 : this.vcnIps.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
