/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JWK.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class JWK extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"n", "e", "kid", "use", "alg", "kty"})
    public JWK(String n, String e, String kid, String use, String alg, String kty) {
        super();
        this.n = n;
        this.e = e;
        this.kid = kid;
        this.use = use;
        this.alg = alg;
        this.kty = kty;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The modulus. */
        @com.fasterxml.jackson.annotation.JsonProperty("n")
        private String n;

        /**
         * The modulus.
         *
         * @param n the value to set
         * @return this builder
         */
        public Builder n(String n) {
            this.n = n;
            this.__explicitlySet__.add("n");
            return this;
        }
        /** The exponent. */
        @com.fasterxml.jackson.annotation.JsonProperty("e")
        private String e;

        /**
         * The exponent.
         *
         * @param e the value to set
         * @return this builder
         */
        public Builder e(String e) {
            this.e = e;
            this.__explicitlySet__.add("e");
            return this;
        }
        /** The key id. */
        @com.fasterxml.jackson.annotation.JsonProperty("kid")
        private String kid;

        /**
         * The key id.
         *
         * @param kid the value to set
         * @return this builder
         */
        public Builder kid(String kid) {
            this.kid = kid;
            this.__explicitlySet__.add("kid");
            return this;
        }
        /** The key use. */
        @com.fasterxml.jackson.annotation.JsonProperty("use")
        private String use;

        /**
         * The key use.
         *
         * @param use the value to set
         * @return this builder
         */
        public Builder use(String use) {
            this.use = use;
            this.__explicitlySet__.add("use");
            return this;
        }
        /** The algorithm. */
        @com.fasterxml.jackson.annotation.JsonProperty("alg")
        private String alg;

        /**
         * The algorithm.
         *
         * @param alg the value to set
         * @return this builder
         */
        public Builder alg(String alg) {
            this.alg = alg;
            this.__explicitlySet__.add("alg");
            return this;
        }
        /** The key type. */
        @com.fasterxml.jackson.annotation.JsonProperty("kty")
        private String kty;

        /**
         * The key type.
         *
         * @param kty the value to set
         * @return this builder
         */
        public Builder kty(String kty) {
            this.kty = kty;
            this.__explicitlySet__.add("kty");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JWK build() {
            JWK model = new JWK(this.n, this.e, this.kid, this.use, this.alg, this.kty);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JWK model) {
            if (model.wasPropertyExplicitlySet("n")) {
                this.n(model.getN());
            }
            if (model.wasPropertyExplicitlySet("e")) {
                this.e(model.getE());
            }
            if (model.wasPropertyExplicitlySet("kid")) {
                this.kid(model.getKid());
            }
            if (model.wasPropertyExplicitlySet("use")) {
                this.use(model.getUse());
            }
            if (model.wasPropertyExplicitlySet("alg")) {
                this.alg(model.getAlg());
            }
            if (model.wasPropertyExplicitlySet("kty")) {
                this.kty(model.getKty());
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

    /** The modulus. */
    @com.fasterxml.jackson.annotation.JsonProperty("n")
    private final String n;

    /**
     * The modulus.
     *
     * @return the value
     */
    public String getN() {
        return n;
    }

    /** The exponent. */
    @com.fasterxml.jackson.annotation.JsonProperty("e")
    private final String e;

    /**
     * The exponent.
     *
     * @return the value
     */
    public String getE() {
        return e;
    }

    /** The key id. */
    @com.fasterxml.jackson.annotation.JsonProperty("kid")
    private final String kid;

    /**
     * The key id.
     *
     * @return the value
     */
    public String getKid() {
        return kid;
    }

    /** The key use. */
    @com.fasterxml.jackson.annotation.JsonProperty("use")
    private final String use;

    /**
     * The key use.
     *
     * @return the value
     */
    public String getUse() {
        return use;
    }

    /** The algorithm. */
    @com.fasterxml.jackson.annotation.JsonProperty("alg")
    private final String alg;

    /**
     * The algorithm.
     *
     * @return the value
     */
    public String getAlg() {
        return alg;
    }

    /** The key type. */
    @com.fasterxml.jackson.annotation.JsonProperty("kty")
    private final String kty;

    /**
     * The key type.
     *
     * @return the value
     */
    public String getKty() {
        return kty;
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
        sb.append("JWK(");
        sb.append("super=").append(super.toString());
        sb.append("n=").append(String.valueOf(this.n));
        sb.append(", e=").append(String.valueOf(this.e));
        sb.append(", kid=").append(String.valueOf(this.kid));
        sb.append(", use=").append(String.valueOf(this.use));
        sb.append(", alg=").append(String.valueOf(this.alg));
        sb.append(", kty=").append(String.valueOf(this.kty));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JWK)) {
            return false;
        }

        JWK other = (JWK) o;
        return java.util.Objects.equals(this.n, other.n)
                && java.util.Objects.equals(this.e, other.e)
                && java.util.Objects.equals(this.kid, other.kid)
                && java.util.Objects.equals(this.use, other.use)
                && java.util.Objects.equals(this.alg, other.alg)
                && java.util.Objects.equals(this.kty, other.kty)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.n == null ? 43 : this.n.hashCode());
        result = (result * PRIME) + (this.e == null ? 43 : this.e.hashCode());
        result = (result * PRIME) + (this.kid == null ? 43 : this.kid.hashCode());
        result = (result * PRIME) + (this.use == null ? 43 : this.use.hashCode());
        result = (result * PRIME) + (this.alg == null ? 43 : this.alg.hashCode());
        result = (result * PRIME) + (this.kty == null ? 43 : this.kty.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
