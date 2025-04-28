/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Operating System of the platform on which the Java Runtime was reported. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OperatingSystem.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OperatingSystem
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "family",
        "name",
        "distribution",
        "version",
        "architecture",
        "managedInstanceCount"
    })
    public OperatingSystem(
            OsFamily family,
            String name,
            String distribution,
            String version,
            String architecture,
            Integer managedInstanceCount) {
        super();
        this.family = family;
        this.name = name;
        this.distribution = distribution;
        this.version = version;
        this.architecture = architecture;
        this.managedInstanceCount = managedInstanceCount;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The operating system type, such as Windows, Linux or macOS */
        @com.fasterxml.jackson.annotation.JsonProperty("family")
        private OsFamily family;

        /**
         * The operating system type, such as Windows, Linux or macOS
         *
         * @param family the value to set
         * @return this builder
         */
        public Builder family(OsFamily family) {
            this.family = family;
            this.__explicitlySet__.add("family");
            return this;
        }
        /** The name of the operating system as provided by the Java system property os.name. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the operating system as provided by the Java system property os.name.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The name of the Operating System distribution, such as Oracle Linux 9, Windows 10, or
         * macOS X.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("distribution")
        private String distribution;

        /**
         * The name of the Operating System distribution, such as Oracle Linux 9, Windows 10, or
         * macOS X.
         *
         * @param distribution the value to set
         * @return this builder
         */
        public Builder distribution(String distribution) {
            this.distribution = distribution;
            this.__explicitlySet__.add("distribution");
            return this;
        }
        /**
         * The version of the operating system as provided by the Java system property os.version.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The version of the operating system as provided by the Java system property os.version.
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * The architecture of the operating system as provided by the Java system property os.arch.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("architecture")
        private String architecture;

        /**
         * The architecture of the operating system as provided by the Java system property os.arch.
         *
         * @param architecture the value to set
         * @return this builder
         */
        public Builder architecture(String architecture) {
            this.architecture = architecture;
            this.__explicitlySet__.add("architecture");
            return this;
        }
        /** Number of instances running the operating system. */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceCount")
        private Integer managedInstanceCount;

        /**
         * Number of instances running the operating system.
         *
         * @param managedInstanceCount the value to set
         * @return this builder
         */
        public Builder managedInstanceCount(Integer managedInstanceCount) {
            this.managedInstanceCount = managedInstanceCount;
            this.__explicitlySet__.add("managedInstanceCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OperatingSystem build() {
            OperatingSystem model =
                    new OperatingSystem(
                            this.family,
                            this.name,
                            this.distribution,
                            this.version,
                            this.architecture,
                            this.managedInstanceCount);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OperatingSystem model) {
            if (model.wasPropertyExplicitlySet("family")) {
                this.family(model.getFamily());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("distribution")) {
                this.distribution(model.getDistribution());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("architecture")) {
                this.architecture(model.getArchitecture());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceCount")) {
                this.managedInstanceCount(model.getManagedInstanceCount());
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

    /** The operating system type, such as Windows, Linux or macOS */
    @com.fasterxml.jackson.annotation.JsonProperty("family")
    private final OsFamily family;

    /**
     * The operating system type, such as Windows, Linux or macOS
     *
     * @return the value
     */
    public OsFamily getFamily() {
        return family;
    }

    /** The name of the operating system as provided by the Java system property os.name. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the operating system as provided by the Java system property os.name.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The name of the Operating System distribution, such as Oracle Linux 9, Windows 10, or macOS
     * X.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("distribution")
    private final String distribution;

    /**
     * The name of the Operating System distribution, such as Oracle Linux 9, Windows 10, or macOS
     * X.
     *
     * @return the value
     */
    public String getDistribution() {
        return distribution;
    }

    /** The version of the operating system as provided by the Java system property os.version. */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The version of the operating system as provided by the Java system property os.version.
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** The architecture of the operating system as provided by the Java system property os.arch. */
    @com.fasterxml.jackson.annotation.JsonProperty("architecture")
    private final String architecture;

    /**
     * The architecture of the operating system as provided by the Java system property os.arch.
     *
     * @return the value
     */
    public String getArchitecture() {
        return architecture;
    }

    /** Number of instances running the operating system. */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceCount")
    private final Integer managedInstanceCount;

    /**
     * Number of instances running the operating system.
     *
     * @return the value
     */
    public Integer getManagedInstanceCount() {
        return managedInstanceCount;
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
        sb.append("OperatingSystem(");
        sb.append("super=").append(super.toString());
        sb.append("family=").append(String.valueOf(this.family));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", distribution=").append(String.valueOf(this.distribution));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", architecture=").append(String.valueOf(this.architecture));
        sb.append(", managedInstanceCount=").append(String.valueOf(this.managedInstanceCount));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OperatingSystem)) {
            return false;
        }

        OperatingSystem other = (OperatingSystem) o;
        return java.util.Objects.equals(this.family, other.family)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.distribution, other.distribution)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.architecture, other.architecture)
                && java.util.Objects.equals(this.managedInstanceCount, other.managedInstanceCount)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.family == null ? 43 : this.family.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.distribution == null ? 43 : this.distribution.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.architecture == null ? 43 : this.architecture.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceCount == null
                                ? 43
                                : this.managedInstanceCount.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
