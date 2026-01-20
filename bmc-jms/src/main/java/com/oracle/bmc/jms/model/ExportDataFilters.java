/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Filters applied when exporting data <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ExportDataFilters.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExportDataFilters
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "javaVersions",
        "javaMajorVersions",
        "javaVendors",
        "applicationNameEqualTo",
        "applicationNameContains",
        "securityStatuses"
    })
    public ExportDataFilters(
            java.util.List<String> javaVersions,
            java.util.List<String> javaMajorVersions,
            java.util.List<String> javaVendors,
            java.util.List<String> applicationNameEqualTo,
            java.util.List<String> applicationNameContains,
            java.util.List<JreSecurityStatus> securityStatuses) {
        super();
        this.javaVersions = javaVersions;
        this.javaMajorVersions = javaMajorVersions;
        this.javaVendors = javaVendors;
        this.applicationNameEqualTo = applicationNameEqualTo;
        this.applicationNameContains = applicationNameContains;
        this.securityStatuses = securityStatuses;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** List of Java versions to filter by */
        @com.fasterxml.jackson.annotation.JsonProperty("javaVersions")
        private java.util.List<String> javaVersions;

        /**
         * List of Java versions to filter by
         *
         * @param javaVersions the value to set
         * @return this builder
         */
        public Builder javaVersions(java.util.List<String> javaVersions) {
            this.javaVersions = javaVersions;
            this.__explicitlySet__.add("javaVersions");
            return this;
        }
        /** List of Java major versions to filter by */
        @com.fasterxml.jackson.annotation.JsonProperty("javaMajorVersions")
        private java.util.List<String> javaMajorVersions;

        /**
         * List of Java major versions to filter by
         *
         * @param javaMajorVersions the value to set
         * @return this builder
         */
        public Builder javaMajorVersions(java.util.List<String> javaMajorVersions) {
            this.javaMajorVersions = javaMajorVersions;
            this.__explicitlySet__.add("javaMajorVersions");
            return this;
        }
        /** List of Java vendors to filter by */
        @com.fasterxml.jackson.annotation.JsonProperty("javaVendors")
        private java.util.List<String> javaVendors;

        /**
         * List of Java vendors to filter by
         *
         * @param javaVendors the value to set
         * @return this builder
         */
        public Builder javaVendors(java.util.List<String> javaVendors) {
            this.javaVendors = javaVendors;
            this.__explicitlySet__.add("javaVendors");
            return this;
        }
        /** List of application names to filter by exact match */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationNameEqualTo")
        private java.util.List<String> applicationNameEqualTo;

        /**
         * List of application names to filter by exact match
         *
         * @param applicationNameEqualTo the value to set
         * @return this builder
         */
        public Builder applicationNameEqualTo(java.util.List<String> applicationNameEqualTo) {
            this.applicationNameEqualTo = applicationNameEqualTo;
            this.__explicitlySet__.add("applicationNameEqualTo");
            return this;
        }
        /** List of application names to filter by partial match */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationNameContains")
        private java.util.List<String> applicationNameContains;

        /**
         * List of application names to filter by partial match
         *
         * @param applicationNameContains the value to set
         * @return this builder
         */
        public Builder applicationNameContains(java.util.List<String> applicationNameContains) {
            this.applicationNameContains = applicationNameContains;
            this.__explicitlySet__.add("applicationNameContains");
            return this;
        }
        /** The security statuses of the Java Runtime */
        @com.fasterxml.jackson.annotation.JsonProperty("securityStatuses")
        private java.util.List<JreSecurityStatus> securityStatuses;

        /**
         * The security statuses of the Java Runtime
         *
         * @param securityStatuses the value to set
         * @return this builder
         */
        public Builder securityStatuses(java.util.List<JreSecurityStatus> securityStatuses) {
            this.securityStatuses = securityStatuses;
            this.__explicitlySet__.add("securityStatuses");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExportDataFilters build() {
            ExportDataFilters model =
                    new ExportDataFilters(
                            this.javaVersions,
                            this.javaMajorVersions,
                            this.javaVendors,
                            this.applicationNameEqualTo,
                            this.applicationNameContains,
                            this.securityStatuses);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExportDataFilters model) {
            if (model.wasPropertyExplicitlySet("javaVersions")) {
                this.javaVersions(model.getJavaVersions());
            }
            if (model.wasPropertyExplicitlySet("javaMajorVersions")) {
                this.javaMajorVersions(model.getJavaMajorVersions());
            }
            if (model.wasPropertyExplicitlySet("javaVendors")) {
                this.javaVendors(model.getJavaVendors());
            }
            if (model.wasPropertyExplicitlySet("applicationNameEqualTo")) {
                this.applicationNameEqualTo(model.getApplicationNameEqualTo());
            }
            if (model.wasPropertyExplicitlySet("applicationNameContains")) {
                this.applicationNameContains(model.getApplicationNameContains());
            }
            if (model.wasPropertyExplicitlySet("securityStatuses")) {
                this.securityStatuses(model.getSecurityStatuses());
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

    /** List of Java versions to filter by */
    @com.fasterxml.jackson.annotation.JsonProperty("javaVersions")
    private final java.util.List<String> javaVersions;

    /**
     * List of Java versions to filter by
     *
     * @return the value
     */
    public java.util.List<String> getJavaVersions() {
        return javaVersions;
    }

    /** List of Java major versions to filter by */
    @com.fasterxml.jackson.annotation.JsonProperty("javaMajorVersions")
    private final java.util.List<String> javaMajorVersions;

    /**
     * List of Java major versions to filter by
     *
     * @return the value
     */
    public java.util.List<String> getJavaMajorVersions() {
        return javaMajorVersions;
    }

    /** List of Java vendors to filter by */
    @com.fasterxml.jackson.annotation.JsonProperty("javaVendors")
    private final java.util.List<String> javaVendors;

    /**
     * List of Java vendors to filter by
     *
     * @return the value
     */
    public java.util.List<String> getJavaVendors() {
        return javaVendors;
    }

    /** List of application names to filter by exact match */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationNameEqualTo")
    private final java.util.List<String> applicationNameEqualTo;

    /**
     * List of application names to filter by exact match
     *
     * @return the value
     */
    public java.util.List<String> getApplicationNameEqualTo() {
        return applicationNameEqualTo;
    }

    /** List of application names to filter by partial match */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationNameContains")
    private final java.util.List<String> applicationNameContains;

    /**
     * List of application names to filter by partial match
     *
     * @return the value
     */
    public java.util.List<String> getApplicationNameContains() {
        return applicationNameContains;
    }

    /** The security statuses of the Java Runtime */
    @com.fasterxml.jackson.annotation.JsonProperty("securityStatuses")
    private final java.util.List<JreSecurityStatus> securityStatuses;

    /**
     * The security statuses of the Java Runtime
     *
     * @return the value
     */
    public java.util.List<JreSecurityStatus> getSecurityStatuses() {
        return securityStatuses;
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
        sb.append("ExportDataFilters(");
        sb.append("super=").append(super.toString());
        sb.append("javaVersions=").append(String.valueOf(this.javaVersions));
        sb.append(", javaMajorVersions=").append(String.valueOf(this.javaMajorVersions));
        sb.append(", javaVendors=").append(String.valueOf(this.javaVendors));
        sb.append(", applicationNameEqualTo=").append(String.valueOf(this.applicationNameEqualTo));
        sb.append(", applicationNameContains=")
                .append(String.valueOf(this.applicationNameContains));
        sb.append(", securityStatuses=").append(String.valueOf(this.securityStatuses));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExportDataFilters)) {
            return false;
        }

        ExportDataFilters other = (ExportDataFilters) o;
        return java.util.Objects.equals(this.javaVersions, other.javaVersions)
                && java.util.Objects.equals(this.javaMajorVersions, other.javaMajorVersions)
                && java.util.Objects.equals(this.javaVendors, other.javaVendors)
                && java.util.Objects.equals(
                        this.applicationNameEqualTo, other.applicationNameEqualTo)
                && java.util.Objects.equals(
                        this.applicationNameContains, other.applicationNameContains)
                && java.util.Objects.equals(this.securityStatuses, other.securityStatuses)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.javaVersions == null ? 43 : this.javaVersions.hashCode());
        result =
                (result * PRIME)
                        + (this.javaMajorVersions == null ? 43 : this.javaMajorVersions.hashCode());
        result = (result * PRIME) + (this.javaVendors == null ? 43 : this.javaVendors.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationNameEqualTo == null
                                ? 43
                                : this.applicationNameEqualTo.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationNameContains == null
                                ? 43
                                : this.applicationNameContains.hashCode());
        result =
                (result * PRIME)
                        + (this.securityStatuses == null ? 43 : this.securityStatuses.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
