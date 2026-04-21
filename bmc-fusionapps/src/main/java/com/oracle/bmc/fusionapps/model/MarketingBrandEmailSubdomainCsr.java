/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.fusionapps.model;

/**
 * email subdomain CSR response <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = MarketingBrandEmailSubdomainCsr.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MarketingBrandEmailSubdomainCsr
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"commonName", "csr"})
    public MarketingBrandEmailSubdomainCsr(String commonName, String csr) {
        super();
        this.commonName = commonName;
        this.csr = csr;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** fully qualified host name */
        @com.fasterxml.jackson.annotation.JsonProperty("commonName")
        private String commonName;

        /**
         * fully qualified host name
         *
         * @param commonName the value to set
         * @return this builder
         */
        public Builder commonName(String commonName) {
            this.commonName = commonName;
            this.__explicitlySet__.add("commonName");
            return this;
        }
        /** Certificate signing request */
        @com.fasterxml.jackson.annotation.JsonProperty("csr")
        private String csr;

        /**
         * Certificate signing request
         *
         * @param csr the value to set
         * @return this builder
         */
        public Builder csr(String csr) {
            this.csr = csr;
            this.__explicitlySet__.add("csr");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MarketingBrandEmailSubdomainCsr build() {
            MarketingBrandEmailSubdomainCsr model =
                    new MarketingBrandEmailSubdomainCsr(this.commonName, this.csr);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MarketingBrandEmailSubdomainCsr model) {
            if (model.wasPropertyExplicitlySet("commonName")) {
                this.commonName(model.getCommonName());
            }
            if (model.wasPropertyExplicitlySet("csr")) {
                this.csr(model.getCsr());
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

    /** fully qualified host name */
    @com.fasterxml.jackson.annotation.JsonProperty("commonName")
    private final String commonName;

    /**
     * fully qualified host name
     *
     * @return the value
     */
    public String getCommonName() {
        return commonName;
    }

    /** Certificate signing request */
    @com.fasterxml.jackson.annotation.JsonProperty("csr")
    private final String csr;

    /**
     * Certificate signing request
     *
     * @return the value
     */
    public String getCsr() {
        return csr;
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
        sb.append("MarketingBrandEmailSubdomainCsr(");
        sb.append("super=").append(super.toString());
        sb.append("commonName=").append(String.valueOf(this.commonName));
        sb.append(", csr=").append(String.valueOf(this.csr));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MarketingBrandEmailSubdomainCsr)) {
            return false;
        }

        MarketingBrandEmailSubdomainCsr other = (MarketingBrandEmailSubdomainCsr) o;
        return java.util.Objects.equals(this.commonName, other.commonName)
                && java.util.Objects.equals(this.csr, other.csr)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.commonName == null ? 43 : this.commonName.hashCode());
        result = (result * PRIME) + (this.csr == null ? 43 : this.csr.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
