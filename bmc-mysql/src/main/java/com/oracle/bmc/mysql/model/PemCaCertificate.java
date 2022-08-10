/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.mysql.model;

/**
 * The CA certificate in PEM format.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190415")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PemCaCertificate.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
    use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
    include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
    property = "certificateType"
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class PemCaCertificate extends CaCertificate {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The string containing the CA certificate in PEM format.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("contents")
        private String contents;

        /**
         * The string containing the CA certificate in PEM format.
         * @param contents the value to set
         * @return this builder
         **/
        public Builder contents(String contents) {
            this.contents = contents;
            this.__explicitlySet__.add("contents");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PemCaCertificate build() {
            PemCaCertificate model = new PemCaCertificate(this.contents);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PemCaCertificate model) {
            if (model.wasPropertyExplicitlySet("contents")) {
                this.contents(model.getContents());
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

    @Deprecated
    public PemCaCertificate(String contents) {
        super();
        this.contents = contents;
    }

    /**
     * The string containing the CA certificate in PEM format.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("contents")
    private final String contents;

    /**
     * The string containing the CA certificate in PEM format.
     * @return the value
     **/
    public String getContents() {
        return contents;
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
        sb.append("PemCaCertificate(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", contents=").append(String.valueOf(this.contents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PemCaCertificate)) {
            return false;
        }

        PemCaCertificate other = (PemCaCertificate) o;
        return java.util.Objects.equals(this.contents, other.contents) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.contents == null ? 43 : this.contents.hashCode());
        return result;
    }
}
