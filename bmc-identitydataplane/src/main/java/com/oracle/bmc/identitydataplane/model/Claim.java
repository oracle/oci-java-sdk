/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydataplane.model;

/**
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
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Claim.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class Claim extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"key", "value", "issuer"})
    public Claim(String key, String value, String issuer) {
        super();
        this.key = key;
        this.value = value;
        this.issuer = issuer;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The key of the claim. */
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * The key of the claim.
         *
         * @param key the value to set
         * @return this builder
         */
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /** The value of the claim. */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * The value of the claim.
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /** The issuer of the claim. */
        @com.fasterxml.jackson.annotation.JsonProperty("issuer")
        private String issuer;

        /**
         * The issuer of the claim.
         *
         * @param issuer the value to set
         * @return this builder
         */
        public Builder issuer(String issuer) {
            this.issuer = issuer;
            this.__explicitlySet__.add("issuer");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Claim build() {
            Claim model = new Claim(this.key, this.value, this.issuer);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Claim model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("issuer")) {
                this.issuer(model.getIssuer());
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

    /** The key of the claim. */
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * The key of the claim.
     *
     * @return the value
     */
    public String getKey() {
        return key;
    }

    /** The value of the claim. */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * The value of the claim.
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /** The issuer of the claim. */
    @com.fasterxml.jackson.annotation.JsonProperty("issuer")
    private final String issuer;

    /**
     * The issuer of the claim.
     *
     * @return the value
     */
    public String getIssuer() {
        return issuer;
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
        sb.append("Claim(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", value=").append(String.valueOf(this.value));
        sb.append(", issuer=").append(String.valueOf(this.issuer));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Claim)) {
            return false;
        }

        Claim other = (Claim) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.issuer, other.issuer)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.issuer == null ? 43 : this.issuer.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
