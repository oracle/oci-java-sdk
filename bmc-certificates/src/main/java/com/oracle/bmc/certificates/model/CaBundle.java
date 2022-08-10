/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.certificates.model;

/**
 * The contents of the CA bundle (root and intermediate certificates), properties of the CA bundle, and user-provided contextual metadata for the CA bundle.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210224")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = CaBundle.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CaBundle extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "name", "caBundlePem"})
    public CaBundle(String id, String name, String caBundlePem) {
        super();
        this.id = id;
        this.name = name;
        this.caBundlePem = caBundlePem;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the CA bundle.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the CA bundle.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * A user-friendly name for the CA bundle. Names are unique within a compartment. Valid characters include uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A user-friendly name for the CA bundle. Names are unique within a compartment. Valid characters include uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
         *
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Certificates (in PEM format) in the CA bundle. Can be of arbitrary length.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("caBundlePem")
        private String caBundlePem;

        /**
         * Certificates (in PEM format) in the CA bundle. Can be of arbitrary length.
         * @param caBundlePem the value to set
         * @return this builder
         **/
        public Builder caBundlePem(String caBundlePem) {
            this.caBundlePem = caBundlePem;
            this.__explicitlySet__.add("caBundlePem");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CaBundle build() {
            CaBundle model = new CaBundle(this.id, this.name, this.caBundlePem);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CaBundle model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("caBundlePem")) {
                this.caBundlePem(model.getCaBundlePem());
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
     * The OCID of the CA bundle.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the CA bundle.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * A user-friendly name for the CA bundle. Names are unique within a compartment. Valid characters include uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A user-friendly name for the CA bundle. Names are unique within a compartment. Valid characters include uppercase or lowercase letters, numbers, hyphens, underscores, and periods.
     *
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * Certificates (in PEM format) in the CA bundle. Can be of arbitrary length.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("caBundlePem")
    private final String caBundlePem;

    /**
     * Certificates (in PEM format) in the CA bundle. Can be of arbitrary length.
     * @return the value
     **/
    public String getCaBundlePem() {
        return caBundlePem;
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
        sb.append("CaBundle(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", caBundlePem=").append(String.valueOf(this.caBundlePem));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CaBundle)) {
            return false;
        }

        CaBundle other = (CaBundle) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.caBundlePem, other.caBundlePem)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.caBundlePem == null ? 43 : this.caBundlePem.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
