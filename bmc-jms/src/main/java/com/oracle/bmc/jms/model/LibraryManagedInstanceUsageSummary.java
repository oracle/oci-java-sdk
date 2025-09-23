/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Summary of a managed instance where a given library was detected statically and/or dynamically.
 * Contains the count of applications where the library was detected. <br>
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
        builder = LibraryManagedInstanceUsageSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class LibraryManagedInstanceUsageSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "managedInstanceId",
        "hostname",
        "applicationCount",
        "lastDetectedDynamically",
        "firstSeenInClasspath",
        "lastSeenInClasspath"
    })
    public LibraryManagedInstanceUsageSummary(
            String managedInstanceId,
            String hostname,
            Integer applicationCount,
            java.util.Date lastDetectedDynamically,
            java.util.Date firstSeenInClasspath,
            java.util.Date lastSeenInClasspath) {
        super();
        this.managedInstanceId = managedInstanceId;
        this.hostname = hostname;
        this.applicationCount = applicationCount;
        this.lastDetectedDynamically = lastDetectedDynamically;
        this.firstSeenInClasspath = firstSeenInClasspath;
        this.lastSeenInClasspath = lastSeenInClasspath;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * related managed instance.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
        private String managedInstanceId;

        /**
         * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
         * related managed instance.
         *
         * @param managedInstanceId the value to set
         * @return this builder
         */
        public Builder managedInstanceId(String managedInstanceId) {
            this.managedInstanceId = managedInstanceId;
            this.__explicitlySet__.add("managedInstanceId");
            return this;
        }
        /** The hostname of the managed instance. */
        @com.fasterxml.jackson.annotation.JsonProperty("hostname")
        private String hostname;

        /**
         * The hostname of the managed instance.
         *
         * @param hostname the value to set
         * @return this builder
         */
        public Builder hostname(String hostname) {
            this.hostname = hostname;
            this.__explicitlySet__.add("hostname");
            return this;
        }
        /** The count of applications where the specified library was detected. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationCount")
        private Integer applicationCount;

        /**
         * The count of applications where the specified library was detected.
         *
         * @param applicationCount the value to set
         * @return this builder
         */
        public Builder applicationCount(Integer applicationCount) {
            this.applicationCount = applicationCount;
            this.__explicitlySet__.add("applicationCount");
            return this;
        }
        /**
         * The date and time a library or Java package was _last_ detected in a dynamic library
         * scan.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastDetectedDynamically")
        private java.util.Date lastDetectedDynamically;

        /**
         * The date and time a library or Java package was _last_ detected in a dynamic library
         * scan.
         *
         * @param lastDetectedDynamically the value to set
         * @return this builder
         */
        public Builder lastDetectedDynamically(java.util.Date lastDetectedDynamically) {
            this.lastDetectedDynamically = lastDetectedDynamically;
            this.__explicitlySet__.add("lastDetectedDynamically");
            return this;
        }
        /** The timestamp of the first time the specified library was detected in classpath. */
        @com.fasterxml.jackson.annotation.JsonProperty("firstSeenInClasspath")
        private java.util.Date firstSeenInClasspath;

        /**
         * The timestamp of the first time the specified library was detected in classpath.
         *
         * @param firstSeenInClasspath the value to set
         * @return this builder
         */
        public Builder firstSeenInClasspath(java.util.Date firstSeenInClasspath) {
            this.firstSeenInClasspath = firstSeenInClasspath;
            this.__explicitlySet__.add("firstSeenInClasspath");
            return this;
        }
        /** The timestamp of the last time the specified library was detected in classpath. */
        @com.fasterxml.jackson.annotation.JsonProperty("lastSeenInClasspath")
        private java.util.Date lastSeenInClasspath;

        /**
         * The timestamp of the last time the specified library was detected in classpath.
         *
         * @param lastSeenInClasspath the value to set
         * @return this builder
         */
        public Builder lastSeenInClasspath(java.util.Date lastSeenInClasspath) {
            this.lastSeenInClasspath = lastSeenInClasspath;
            this.__explicitlySet__.add("lastSeenInClasspath");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public LibraryManagedInstanceUsageSummary build() {
            LibraryManagedInstanceUsageSummary model =
                    new LibraryManagedInstanceUsageSummary(
                            this.managedInstanceId,
                            this.hostname,
                            this.applicationCount,
                            this.lastDetectedDynamically,
                            this.firstSeenInClasspath,
                            this.lastSeenInClasspath);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(LibraryManagedInstanceUsageSummary model) {
            if (model.wasPropertyExplicitlySet("managedInstanceId")) {
                this.managedInstanceId(model.getManagedInstanceId());
            }
            if (model.wasPropertyExplicitlySet("hostname")) {
                this.hostname(model.getHostname());
            }
            if (model.wasPropertyExplicitlySet("applicationCount")) {
                this.applicationCount(model.getApplicationCount());
            }
            if (model.wasPropertyExplicitlySet("lastDetectedDynamically")) {
                this.lastDetectedDynamically(model.getLastDetectedDynamically());
            }
            if (model.wasPropertyExplicitlySet("firstSeenInClasspath")) {
                this.firstSeenInClasspath(model.getFirstSeenInClasspath());
            }
            if (model.wasPropertyExplicitlySet("lastSeenInClasspath")) {
                this.lastSeenInClasspath(model.getLastSeenInClasspath());
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

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * related managed instance.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceId")
    private final String managedInstanceId;

    /**
     * The [OCID](https://docs.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the
     * related managed instance.
     *
     * @return the value
     */
    public String getManagedInstanceId() {
        return managedInstanceId;
    }

    /** The hostname of the managed instance. */
    @com.fasterxml.jackson.annotation.JsonProperty("hostname")
    private final String hostname;

    /**
     * The hostname of the managed instance.
     *
     * @return the value
     */
    public String getHostname() {
        return hostname;
    }

    /** The count of applications where the specified library was detected. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationCount")
    private final Integer applicationCount;

    /**
     * The count of applications where the specified library was detected.
     *
     * @return the value
     */
    public Integer getApplicationCount() {
        return applicationCount;
    }

    /**
     * The date and time a library or Java package was _last_ detected in a dynamic library scan.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastDetectedDynamically")
    private final java.util.Date lastDetectedDynamically;

    /**
     * The date and time a library or Java package was _last_ detected in a dynamic library scan.
     *
     * @return the value
     */
    public java.util.Date getLastDetectedDynamically() {
        return lastDetectedDynamically;
    }

    /** The timestamp of the first time the specified library was detected in classpath. */
    @com.fasterxml.jackson.annotation.JsonProperty("firstSeenInClasspath")
    private final java.util.Date firstSeenInClasspath;

    /**
     * The timestamp of the first time the specified library was detected in classpath.
     *
     * @return the value
     */
    public java.util.Date getFirstSeenInClasspath() {
        return firstSeenInClasspath;
    }

    /** The timestamp of the last time the specified library was detected in classpath. */
    @com.fasterxml.jackson.annotation.JsonProperty("lastSeenInClasspath")
    private final java.util.Date lastSeenInClasspath;

    /**
     * The timestamp of the last time the specified library was detected in classpath.
     *
     * @return the value
     */
    public java.util.Date getLastSeenInClasspath() {
        return lastSeenInClasspath;
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
        sb.append("LibraryManagedInstanceUsageSummary(");
        sb.append("super=").append(super.toString());
        sb.append("managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
        sb.append(", applicationCount=").append(String.valueOf(this.applicationCount));
        sb.append(", lastDetectedDynamically=")
                .append(String.valueOf(this.lastDetectedDynamically));
        sb.append(", firstSeenInClasspath=").append(String.valueOf(this.firstSeenInClasspath));
        sb.append(", lastSeenInClasspath=").append(String.valueOf(this.lastSeenInClasspath));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof LibraryManagedInstanceUsageSummary)) {
            return false;
        }

        LibraryManagedInstanceUsageSummary other = (LibraryManagedInstanceUsageSummary) o;
        return java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.applicationCount, other.applicationCount)
                && java.util.Objects.equals(
                        this.lastDetectedDynamically, other.lastDetectedDynamically)
                && java.util.Objects.equals(this.firstSeenInClasspath, other.firstSeenInClasspath)
                && java.util.Objects.equals(this.lastSeenInClasspath, other.lastSeenInClasspath)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.managedInstanceId == null ? 43 : this.managedInstanceId.hashCode());
        result = (result * PRIME) + (this.hostname == null ? 43 : this.hostname.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationCount == null ? 43 : this.applicationCount.hashCode());
        result =
                (result * PRIME)
                        + (this.lastDetectedDynamically == null
                                ? 43
                                : this.lastDetectedDynamically.hashCode());
        result =
                (result * PRIME)
                        + (this.firstSeenInClasspath == null
                                ? 43
                                : this.firstSeenInClasspath.hashCode());
        result =
                (result * PRIME)
                        + (this.lastSeenInClasspath == null
                                ? 43
                                : this.lastSeenInClasspath.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
