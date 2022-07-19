/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Operating System of the platform on which the Java Runtime was reported.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210610")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OperatingSystem.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class OperatingSystem {
    @Deprecated
    @java.beans.ConstructorProperties({"family", "name", "version", "architecture"})
    public OperatingSystem(OsFamily family, String name, String version, String architecture) {
        super();
        this.family = family;
        this.name = name;
        this.version = version;
        this.architecture = architecture;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The operating system type, such as Windows or Linux
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("family")
        private OsFamily family;

        /**
         * The operating system type, such as Windows or Linux
         * @param family the value to set
         * @return this builder
         **/
        public Builder family(OsFamily family) {
            this.family = family;
            this.__explicitlySet__.add("family");
            return this;
        }
        /**
         * The name of the operating system as provided by the Java system property os.name.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name of the operating system as provided by the Java system property os.name.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The version of the operating system as provided by the Java system property os.version.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * The version of the operating system as provided by the Java system property os.version.
         * @param version the value to set
         * @return this builder
         **/
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /**
         * The architecture of the operating system as provided by the Java system property os.arch.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("architecture")
        private String architecture;

        /**
         * The architecture of the operating system as provided by the Java system property os.arch.
         * @param architecture the value to set
         * @return this builder
         **/
        public Builder architecture(String architecture) {
            this.architecture = architecture;
            this.__explicitlySet__.add("architecture");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OperatingSystem build() {
            OperatingSystem __instance__ = new OperatingSystem(family, name, version, architecture);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OperatingSystem o) {
            Builder copiedBuilder =
                    family(o.getFamily())
                            .name(o.getName())
                            .version(o.getVersion())
                            .architecture(o.getArchitecture());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
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
     * The operating system type, such as Windows or Linux
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("family")
    private final OsFamily family;

    /**
     * The operating system type, such as Windows or Linux
     * @return the value
     **/
    public OsFamily getFamily() {
        return family;
    }

    /**
     * The name of the operating system as provided by the Java system property os.name.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name of the operating system as provided by the Java system property os.name.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The version of the operating system as provided by the Java system property os.version.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * The version of the operating system as provided by the Java system property os.version.
     * @return the value
     **/
    public String getVersion() {
        return version;
    }

    /**
     * The architecture of the operating system as provided by the Java system property os.arch.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("architecture")
    private final String architecture;

    /**
     * The architecture of the operating system as provided by the Java system property os.arch.
     * @return the value
     **/
    public String getArchitecture() {
        return architecture;
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
        sb.append("OperatingSystem(");
        sb.append("family=").append(String.valueOf(this.family));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", architecture=").append(String.valueOf(this.architecture));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
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
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.architecture, other.architecture)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.family == null ? 43 : this.family.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.architecture == null ? 43 : this.architecture.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
