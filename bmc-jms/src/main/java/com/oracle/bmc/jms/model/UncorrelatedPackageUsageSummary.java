/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Summary of an uncorrelated package. <br>
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
        builder = UncorrelatedPackageUsageSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UncorrelatedPackageUsageSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "packageName",
        "managedInstanceCount",
        "applicationCount",
        "lastDetectedDynamically"
    })
    public UncorrelatedPackageUsageSummary(
            String packageName,
            Integer managedInstanceCount,
            Integer applicationCount,
            java.util.Date lastDetectedDynamically) {
        super();
        this.packageName = packageName;
        this.managedInstanceCount = managedInstanceCount;
        this.applicationCount = applicationCount;
        this.lastDetectedDynamically = lastDetectedDynamically;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The name of the package. */
        @com.fasterxml.jackson.annotation.JsonProperty("packageName")
        private String packageName;

        /**
         * The name of the package.
         *
         * @param packageName the value to set
         * @return this builder
         */
        public Builder packageName(String packageName) {
            this.packageName = packageName;
            this.__explicitlySet__.add("packageName");
            return this;
        }
        /** The count of managed instances wherein the specified package was detected. */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceCount")
        private Integer managedInstanceCount;

        /**
         * The count of managed instances wherein the specified package was detected.
         *
         * @param managedInstanceCount the value to set
         * @return this builder
         */
        public Builder managedInstanceCount(Integer managedInstanceCount) {
            this.managedInstanceCount = managedInstanceCount;
            this.__explicitlySet__.add("managedInstanceCount");
            return this;
        }
        /** The count of applications wherein the specified package was detected. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationCount")
        private Integer applicationCount;

        /**
         * The count of applications wherein the specified package was detected.
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UncorrelatedPackageUsageSummary build() {
            UncorrelatedPackageUsageSummary model =
                    new UncorrelatedPackageUsageSummary(
                            this.packageName,
                            this.managedInstanceCount,
                            this.applicationCount,
                            this.lastDetectedDynamically);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UncorrelatedPackageUsageSummary model) {
            if (model.wasPropertyExplicitlySet("packageName")) {
                this.packageName(model.getPackageName());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceCount")) {
                this.managedInstanceCount(model.getManagedInstanceCount());
            }
            if (model.wasPropertyExplicitlySet("applicationCount")) {
                this.applicationCount(model.getApplicationCount());
            }
            if (model.wasPropertyExplicitlySet("lastDetectedDynamically")) {
                this.lastDetectedDynamically(model.getLastDetectedDynamically());
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

    /** The name of the package. */
    @com.fasterxml.jackson.annotation.JsonProperty("packageName")
    private final String packageName;

    /**
     * The name of the package.
     *
     * @return the value
     */
    public String getPackageName() {
        return packageName;
    }

    /** The count of managed instances wherein the specified package was detected. */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceCount")
    private final Integer managedInstanceCount;

    /**
     * The count of managed instances wherein the specified package was detected.
     *
     * @return the value
     */
    public Integer getManagedInstanceCount() {
        return managedInstanceCount;
    }

    /** The count of applications wherein the specified package was detected. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationCount")
    private final Integer applicationCount;

    /**
     * The count of applications wherein the specified package was detected.
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
        sb.append("UncorrelatedPackageUsageSummary(");
        sb.append("super=").append(super.toString());
        sb.append("packageName=").append(String.valueOf(this.packageName));
        sb.append(", managedInstanceCount=").append(String.valueOf(this.managedInstanceCount));
        sb.append(", applicationCount=").append(String.valueOf(this.applicationCount));
        sb.append(", lastDetectedDynamically=")
                .append(String.valueOf(this.lastDetectedDynamically));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UncorrelatedPackageUsageSummary)) {
            return false;
        }

        UncorrelatedPackageUsageSummary other = (UncorrelatedPackageUsageSummary) o;
        return java.util.Objects.equals(this.packageName, other.packageName)
                && java.util.Objects.equals(this.managedInstanceCount, other.managedInstanceCount)
                && java.util.Objects.equals(this.applicationCount, other.applicationCount)
                && java.util.Objects.equals(
                        this.lastDetectedDynamically, other.lastDetectedDynamically)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.packageName == null ? 43 : this.packageName.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceCount == null
                                ? 43
                                : this.managedInstanceCount.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationCount == null ? 43 : this.applicationCount.hashCode());
        result =
                (result * PRIME)
                        + (this.lastDetectedDynamically == null
                                ? 43
                                : this.lastDetectedDynamically.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
