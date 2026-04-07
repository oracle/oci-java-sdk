/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Represents an operating system installed on the virtual machine. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = OlvmGuestOperatingSystem.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OlvmGuestOperatingSystem
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "architecture",
        "codename",
        "distribution",
        "family",
        "kernel",
        "version"
    })
    public OlvmGuestOperatingSystem(
            String architecture,
            String codename,
            String distribution,
            String family,
            OlvmKernel kernel,
            OlvmVersion version) {
        super();
        this.architecture = architecture;
        this.codename = codename;
        this.distribution = distribution;
        this.family = family;
        this.kernel = kernel;
        this.version = version;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The architecture of the operating system, such as x86_64. */
        @com.fasterxml.jackson.annotation.JsonProperty("architecture")
        private String architecture;

        /**
         * The architecture of the operating system, such as x86_64.
         *
         * @param architecture the value to set
         * @return this builder
         */
        public Builder architecture(String architecture) {
            this.architecture = architecture;
            this.__explicitlySet__.add("architecture");
            return this;
        }
        /** Code name of the operating system, such as Maipo. */
        @com.fasterxml.jackson.annotation.JsonProperty("codename")
        private String codename;

        /**
         * Code name of the operating system, such as Maipo.
         *
         * @param codename the value to set
         * @return this builder
         */
        public Builder codename(String codename) {
            this.codename = codename;
            this.__explicitlySet__.add("codename");
            return this;
        }
        /** Full name of operating system distribution. */
        @com.fasterxml.jackson.annotation.JsonProperty("distribution")
        private String distribution;

        /**
         * Full name of operating system distribution.
         *
         * @param distribution the value to set
         * @return this builder
         */
        public Builder distribution(String distribution) {
            this.distribution = distribution;
            this.__explicitlySet__.add("distribution");
            return this;
        }
        /** Family of operating system, such as Linux. */
        @com.fasterxml.jackson.annotation.JsonProperty("family")
        private String family;

        /**
         * Family of operating system, such as Linux.
         *
         * @param family the value to set
         * @return this builder
         */
        public Builder family(String family) {
            this.family = family;
            this.__explicitlySet__.add("family");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("kernel")
        private OlvmKernel kernel;

        public Builder kernel(OlvmKernel kernel) {
            this.kernel = kernel;
            this.__explicitlySet__.add("kernel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private OlvmVersion version;

        public Builder version(OlvmVersion version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmGuestOperatingSystem build() {
            OlvmGuestOperatingSystem model =
                    new OlvmGuestOperatingSystem(
                            this.architecture,
                            this.codename,
                            this.distribution,
                            this.family,
                            this.kernel,
                            this.version);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmGuestOperatingSystem model) {
            if (model.wasPropertyExplicitlySet("architecture")) {
                this.architecture(model.getArchitecture());
            }
            if (model.wasPropertyExplicitlySet("codename")) {
                this.codename(model.getCodename());
            }
            if (model.wasPropertyExplicitlySet("distribution")) {
                this.distribution(model.getDistribution());
            }
            if (model.wasPropertyExplicitlySet("family")) {
                this.family(model.getFamily());
            }
            if (model.wasPropertyExplicitlySet("kernel")) {
                this.kernel(model.getKernel());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
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

    /** The architecture of the operating system, such as x86_64. */
    @com.fasterxml.jackson.annotation.JsonProperty("architecture")
    private final String architecture;

    /**
     * The architecture of the operating system, such as x86_64.
     *
     * @return the value
     */
    public String getArchitecture() {
        return architecture;
    }

    /** Code name of the operating system, such as Maipo. */
    @com.fasterxml.jackson.annotation.JsonProperty("codename")
    private final String codename;

    /**
     * Code name of the operating system, such as Maipo.
     *
     * @return the value
     */
    public String getCodename() {
        return codename;
    }

    /** Full name of operating system distribution. */
    @com.fasterxml.jackson.annotation.JsonProperty("distribution")
    private final String distribution;

    /**
     * Full name of operating system distribution.
     *
     * @return the value
     */
    public String getDistribution() {
        return distribution;
    }

    /** Family of operating system, such as Linux. */
    @com.fasterxml.jackson.annotation.JsonProperty("family")
    private final String family;

    /**
     * Family of operating system, such as Linux.
     *
     * @return the value
     */
    public String getFamily() {
        return family;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("kernel")
    private final OlvmKernel kernel;

    public OlvmKernel getKernel() {
        return kernel;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final OlvmVersion version;

    public OlvmVersion getVersion() {
        return version;
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
        sb.append("OlvmGuestOperatingSystem(");
        sb.append("super=").append(super.toString());
        sb.append("architecture=").append(String.valueOf(this.architecture));
        sb.append(", codename=").append(String.valueOf(this.codename));
        sb.append(", distribution=").append(String.valueOf(this.distribution));
        sb.append(", family=").append(String.valueOf(this.family));
        sb.append(", kernel=").append(String.valueOf(this.kernel));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmGuestOperatingSystem)) {
            return false;
        }

        OlvmGuestOperatingSystem other = (OlvmGuestOperatingSystem) o;
        return java.util.Objects.equals(this.architecture, other.architecture)
                && java.util.Objects.equals(this.codename, other.codename)
                && java.util.Objects.equals(this.distribution, other.distribution)
                && java.util.Objects.equals(this.family, other.family)
                && java.util.Objects.equals(this.kernel, other.kernel)
                && java.util.Objects.equals(this.version, other.version)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.architecture == null ? 43 : this.architecture.hashCode());
        result = (result * PRIME) + (this.codename == null ? 43 : this.codename.hashCode());
        result = (result * PRIME) + (this.distribution == null ? 43 : this.distribution.hashCode());
        result = (result * PRIME) + (this.family == null ? 43 : this.family.hashCode());
        result = (result * PRIME) + (this.kernel == null ? 43 : this.kernel.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
