/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * test
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = MinimumKeySizeSettings.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class MinimumKeySizeSettings
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"tls", "jar", "certpath"})
    public MinimumKeySizeSettings(
            java.util.List<KeySizeAlgorithm> tls,
            java.util.List<KeySizeAlgorithm> jar,
            java.util.List<KeySizeAlgorithm> certpath) {
        super();
        this.tls = tls;
        this.jar = jar;
        this.certpath = certpath;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Updates the minimum key size for the specified encryption algorithm.
         * The JDK property jdk.tls.disabledAlgorithms will be updated with the following supported actions:
         * - Changing minimum key length for Diffie-Hellman
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("tls")
        private java.util.List<KeySizeAlgorithm> tls;

        /**
         * Updates the minimum key size for the specified encryption algorithm.
         * The JDK property jdk.tls.disabledAlgorithms will be updated with the following supported actions:
         * - Changing minimum key length for Diffie-Hellman
         *
         * @param tls the value to set
         * @return this builder
         **/
        public Builder tls(java.util.List<KeySizeAlgorithm> tls) {
            this.tls = tls;
            this.__explicitlySet__.add("tls");
            return this;
        }
        /**
         * Updates the minimum key size for the specified encryption algorithm.
         * The JDK property jdk.jar.disabledAlgorithms will be updated with the following supported actions:
         * - Changing minimum key length for RSA signed jars
         * - Changing minimum key length for EC
         * - Changing minimum key length for DSA
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jar")
        private java.util.List<KeySizeAlgorithm> jar;

        /**
         * Updates the minimum key size for the specified encryption algorithm.
         * The JDK property jdk.jar.disabledAlgorithms will be updated with the following supported actions:
         * - Changing minimum key length for RSA signed jars
         * - Changing minimum key length for EC
         * - Changing minimum key length for DSA
         *
         * @param jar the value to set
         * @return this builder
         **/
        public Builder jar(java.util.List<KeySizeAlgorithm> jar) {
            this.jar = jar;
            this.__explicitlySet__.add("jar");
            return this;
        }
        /**
         * Updates the minimum key size for the specified encryption algorithm.
         * The JDK property jdk.certpath.disabledAlgorithms will be updated with the following supported actions:
         * - Changing minimum key length for RSA signed jars
         * - Changing minimum key length for EC
         * - Changing minimum key length for DSA
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("certpath")
        private java.util.List<KeySizeAlgorithm> certpath;

        /**
         * Updates the minimum key size for the specified encryption algorithm.
         * The JDK property jdk.certpath.disabledAlgorithms will be updated with the following supported actions:
         * - Changing minimum key length for RSA signed jars
         * - Changing minimum key length for EC
         * - Changing minimum key length for DSA
         *
         * @param certpath the value to set
         * @return this builder
         **/
        public Builder certpath(java.util.List<KeySizeAlgorithm> certpath) {
            this.certpath = certpath;
            this.__explicitlySet__.add("certpath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MinimumKeySizeSettings build() {
            MinimumKeySizeSettings model =
                    new MinimumKeySizeSettings(this.tls, this.jar, this.certpath);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MinimumKeySizeSettings model) {
            if (model.wasPropertyExplicitlySet("tls")) {
                this.tls(model.getTls());
            }
            if (model.wasPropertyExplicitlySet("jar")) {
                this.jar(model.getJar());
            }
            if (model.wasPropertyExplicitlySet("certpath")) {
                this.certpath(model.getCertpath());
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
     * Updates the minimum key size for the specified encryption algorithm.
     * The JDK property jdk.tls.disabledAlgorithms will be updated with the following supported actions:
     * - Changing minimum key length for Diffie-Hellman
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("tls")
    private final java.util.List<KeySizeAlgorithm> tls;

    /**
     * Updates the minimum key size for the specified encryption algorithm.
     * The JDK property jdk.tls.disabledAlgorithms will be updated with the following supported actions:
     * - Changing minimum key length for Diffie-Hellman
     *
     * @return the value
     **/
    public java.util.List<KeySizeAlgorithm> getTls() {
        return tls;
    }

    /**
     * Updates the minimum key size for the specified encryption algorithm.
     * The JDK property jdk.jar.disabledAlgorithms will be updated with the following supported actions:
     * - Changing minimum key length for RSA signed jars
     * - Changing minimum key length for EC
     * - Changing minimum key length for DSA
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jar")
    private final java.util.List<KeySizeAlgorithm> jar;

    /**
     * Updates the minimum key size for the specified encryption algorithm.
     * The JDK property jdk.jar.disabledAlgorithms will be updated with the following supported actions:
     * - Changing minimum key length for RSA signed jars
     * - Changing minimum key length for EC
     * - Changing minimum key length for DSA
     *
     * @return the value
     **/
    public java.util.List<KeySizeAlgorithm> getJar() {
        return jar;
    }

    /**
     * Updates the minimum key size for the specified encryption algorithm.
     * The JDK property jdk.certpath.disabledAlgorithms will be updated with the following supported actions:
     * - Changing minimum key length for RSA signed jars
     * - Changing minimum key length for EC
     * - Changing minimum key length for DSA
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("certpath")
    private final java.util.List<KeySizeAlgorithm> certpath;

    /**
     * Updates the minimum key size for the specified encryption algorithm.
     * The JDK property jdk.certpath.disabledAlgorithms will be updated with the following supported actions:
     * - Changing minimum key length for RSA signed jars
     * - Changing minimum key length for EC
     * - Changing minimum key length for DSA
     *
     * @return the value
     **/
    public java.util.List<KeySizeAlgorithm> getCertpath() {
        return certpath;
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
        sb.append("MinimumKeySizeSettings(");
        sb.append("super=").append(super.toString());
        sb.append("tls=").append(String.valueOf(this.tls));
        sb.append(", jar=").append(String.valueOf(this.jar));
        sb.append(", certpath=").append(String.valueOf(this.certpath));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MinimumKeySizeSettings)) {
            return false;
        }

        MinimumKeySizeSettings other = (MinimumKeySizeSettings) o;
        return java.util.Objects.equals(this.tls, other.tls)
                && java.util.Objects.equals(this.jar, other.jar)
                && java.util.Objects.equals(this.certpath, other.certpath)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.tls == null ? 43 : this.tls.hashCode());
        result = (result * PRIME) + (this.jar == null ? 43 : this.jar.hashCode());
        result = (result * PRIME) + (this.certpath == null ? 43 : this.certpath.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
