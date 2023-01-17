/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * The essential properties to identify a Java Runtime. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = JavaRuntimeId.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class JavaRuntimeId extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"version", "vendor", "distribution", "jreKey"})
    public JavaRuntimeId(String version, String vendor, String distribution, String jreKey) {
        super();
        this.version = version;
        this.vendor = vendor;
        this.distribution = distribution;
        this.jreKey = jreKey;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The version of the Java Runtime. */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The version of the Java Runtime.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** The vendor of the Java Runtime. */
        @com.fasterxml.jackson.annotation.JsonProperty("vendor")
        private String vendor;

        /**
         * The vendor of the Java Runtime.
         *
         * @param vendor the value to set
         * @return this builder
         */
        public Builder vendor(String vendor) {
            this.vendor = vendor;
            this.__explicitlySet__.add("vendor");
            return this;
        }
        /**
         * The distribution of a Java Runtime is the name of the lineage of product to which it
         * belongs, for example _Java(TM) SE Runtime Environment_.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("distribution")
        private String distribution;

        /**
         * The distribution of a Java Runtime is the name of the lineage of product to which it
         * belongs, for example _Java(TM) SE Runtime Environment_.
         *
         * @param distribution the value to set
         * @return this builder
         */
        public Builder distribution(String distribution) {
            this.distribution = distribution;
            this.__explicitlySet__.add("distribution");
            return this;
        }
        /** The unique identifier for a Java Runtime. */
        @com.fasterxml.jackson.annotation.JsonProperty("jreKey")
        private String jreKey;

        /**
         * The unique identifier for a Java Runtime.
         *
         * @param jreKey the value to set
         * @return this builder
         */
        public Builder jreKey(String jreKey) {
            this.jreKey = jreKey;
            this.__explicitlySet__.add("jreKey");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public JavaRuntimeId build() {
            JavaRuntimeId model =
                    new JavaRuntimeId(this.version, this.vendor, this.distribution, this.jreKey);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(JavaRuntimeId model) {
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("vendor")) {
                this.vendor(model.getVendor());
            }
            if (model.wasPropertyExplicitlySet("distribution")) {
                this.distribution(model.getDistribution());
            }
            if (model.wasPropertyExplicitlySet("jreKey")) {
                this.jreKey(model.getJreKey());
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

    /** The version of the Java Runtime. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The version of the Java Runtime.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** The vendor of the Java Runtime. */
    @com.fasterxml.jackson.annotation.JsonProperty("vendor")
    private final String vendor;

    /**
     * The vendor of the Java Runtime.
     *
     * @return the value
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * The distribution of a Java Runtime is the name of the lineage of product to which it belongs,
     * for example _Java(TM) SE Runtime Environment_.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("distribution")
    private final String distribution;

    /**
     * The distribution of a Java Runtime is the name of the lineage of product to which it belongs,
     * for example _Java(TM) SE Runtime Environment_.
     *
     * @return the value
     */
    public String getDistribution() {
        return distribution;
    }

    /** The unique identifier for a Java Runtime. */
    @com.fasterxml.jackson.annotation.JsonProperty("jreKey")
    private final String jreKey;

    /**
     * The unique identifier for a Java Runtime.
     *
     * @return the value
     */
    public String getJreKey() {
        return jreKey;
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
        sb.append("JavaRuntimeId(");
        sb.append("super=").append(super.toString());
        sb.append("version=").append(String.valueOf(this.version));
        sb.append(", vendor=").append(String.valueOf(this.vendor));
        sb.append(", distribution=").append(String.valueOf(this.distribution));
        sb.append(", jreKey=").append(String.valueOf(this.jreKey));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof JavaRuntimeId)) {
            return false;
        }

        JavaRuntimeId other = (JavaRuntimeId) o;
        return java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.vendor, other.vendor)
                && java.util.Objects.equals(this.distribution, other.distribution)
                && java.util.Objects.equals(this.jreKey, other.jreKey)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.vendor == null ? 43 : this.vendor.hashCode());
        result = (result * PRIME) + (this.distribution == null ? 43 : this.distribution.hashCode());
        result = (result * PRIME) + (this.jreKey == null ? 43 : this.jreKey.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
