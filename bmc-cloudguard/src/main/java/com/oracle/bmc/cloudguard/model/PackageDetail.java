/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudguard.model;

/**
 * details of package causing vulnerabilities <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200131")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = PackageDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class PackageDetail extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "packageType",
        "version",
        "cause",
        "location",
        "remediation"
    })
    public PackageDetail(
            String name,
            String packageType,
            String version,
            String cause,
            String location,
            String remediation) {
        super();
        this.name = name;
        this.packageType = packageType;
        this.version = version;
        this.cause = cause;
        this.location = location;
        this.remediation = remediation;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** name of the package */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * name of the package
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** type of the package */
        @com.fasterxml.jackson.annotation.JsonProperty("packageType")
        private String packageType;

        /**
         * type of the package
         *
         * @param packageType the value to set
         * @return this builder
         */
        public Builder packageType(String packageType) {
            this.packageType = packageType;
            this.__explicitlySet__.add("packageType");
            return this;
        }
        /** version of the package */
        @com.fasterxml.jackson.annotation.JsonProperty("version")
        private String version;

        /**
         * version of the package
         *
         * @param version the value to set
         * @return this builder
         */
        public Builder version(String version) {
            this.version = version;
            this.__explicitlySet__.add("version");
            return this;
        }
        /** cause of the vulnerability in the package */
        @com.fasterxml.jackson.annotation.JsonProperty("cause")
        private String cause;

        /**
         * cause of the vulnerability in the package
         *
         * @param cause the value to set
         * @return this builder
         */
        public Builder cause(String cause) {
            this.cause = cause;
            this.__explicitlySet__.add("cause");
            return this;
        }
        /** location of the package */
        @com.fasterxml.jackson.annotation.JsonProperty("location")
        private String location;

        /**
         * location of the package
         *
         * @param location the value to set
         * @return this builder
         */
        public Builder location(String location) {
            this.location = location;
            this.__explicitlySet__.add("location");
            return this;
        }
        /** remediation for vulnerability */
        @com.fasterxml.jackson.annotation.JsonProperty("remediation")
        private String remediation;

        /**
         * remediation for vulnerability
         *
         * @param remediation the value to set
         * @return this builder
         */
        public Builder remediation(String remediation) {
            this.remediation = remediation;
            this.__explicitlySet__.add("remediation");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public PackageDetail build() {
            PackageDetail model =
                    new PackageDetail(
                            this.name,
                            this.packageType,
                            this.version,
                            this.cause,
                            this.location,
                            this.remediation);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(PackageDetail model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("packageType")) {
                this.packageType(model.getPackageType());
            }
            if (model.wasPropertyExplicitlySet("version")) {
                this.version(model.getVersion());
            }
            if (model.wasPropertyExplicitlySet("cause")) {
                this.cause(model.getCause());
            }
            if (model.wasPropertyExplicitlySet("location")) {
                this.location(model.getLocation());
            }
            if (model.wasPropertyExplicitlySet("remediation")) {
                this.remediation(model.getRemediation());
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

    /** name of the package */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * name of the package
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** type of the package */
    @com.fasterxml.jackson.annotation.JsonProperty("packageType")
    private final String packageType;

    /**
     * type of the package
     *
     * @return the value
     */
    public String getPackageType() {
        return packageType;
    }

    /** version of the package */
    @com.fasterxml.jackson.annotation.JsonProperty("version")
    private final String version;

    /**
     * version of the package
     *
     * @return the value
     */
    public String getVersion() {
        return version;
    }

    /** cause of the vulnerability in the package */
    @com.fasterxml.jackson.annotation.JsonProperty("cause")
    private final String cause;

    /**
     * cause of the vulnerability in the package
     *
     * @return the value
     */
    public String getCause() {
        return cause;
    }

    /** location of the package */
    @com.fasterxml.jackson.annotation.JsonProperty("location")
    private final String location;

    /**
     * location of the package
     *
     * @return the value
     */
    public String getLocation() {
        return location;
    }

    /** remediation for vulnerability */
    @com.fasterxml.jackson.annotation.JsonProperty("remediation")
    private final String remediation;

    /**
     * remediation for vulnerability
     *
     * @return the value
     */
    public String getRemediation() {
        return remediation;
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
        sb.append("PackageDetail(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", packageType=").append(String.valueOf(this.packageType));
        sb.append(", version=").append(String.valueOf(this.version));
        sb.append(", cause=").append(String.valueOf(this.cause));
        sb.append(", location=").append(String.valueOf(this.location));
        sb.append(", remediation=").append(String.valueOf(this.remediation));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof PackageDetail)) {
            return false;
        }

        PackageDetail other = (PackageDetail) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.packageType, other.packageType)
                && java.util.Objects.equals(this.version, other.version)
                && java.util.Objects.equals(this.cause, other.cause)
                && java.util.Objects.equals(this.location, other.location)
                && java.util.Objects.equals(this.remediation, other.remediation)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.packageType == null ? 43 : this.packageType.hashCode());
        result = (result * PRIME) + (this.version == null ? 43 : this.version.hashCode());
        result = (result * PRIME) + (this.cause == null ? 43 : this.cause.hashCode());
        result = (result * PRIME) + (this.location == null ? 43 : this.location.hashCode());
        result = (result * PRIME) + (this.remediation == null ? 43 : this.remediation.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
