/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Summary of an application where a given libary was detected. Contains the count of managed
 * instances where the package was detected with this application. <br>
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
        builder = UncorrelatedPackageApplicationUsageSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UncorrelatedPackageApplicationUsageSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "applicationKey",
        "applicationName",
        "managedInstanceCount",
        "lastDetectedDynamically"
    })
    public UncorrelatedPackageApplicationUsageSummary(
            String applicationKey,
            String applicationName,
            Integer managedInstanceCount,
            java.util.Date lastDetectedDynamically) {
        super();
        this.applicationKey = applicationKey;
        this.applicationName = applicationName;
        this.managedInstanceCount = managedInstanceCount;
        this.lastDetectedDynamically = lastDetectedDynamically;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The internal identifier of a Java application. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationKey")
        private String applicationKey;

        /**
         * The internal identifier of a Java application.
         *
         * @param applicationKey the value to set
         * @return this builder
         */
        public Builder applicationKey(String applicationKey) {
            this.applicationKey = applicationKey;
            this.__explicitlySet__.add("applicationKey");
            return this;
        }
        /** The displayed name of the Java application. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationName")
        private String applicationName;

        /**
         * The displayed name of the Java application.
         *
         * @param applicationName the value to set
         * @return this builder
         */
        public Builder applicationName(String applicationName) {
            this.applicationName = applicationName;
            this.__explicitlySet__.add("applicationName");
            return this;
        }
        /** The count of managed instances wherein the specified library was detected. */
        @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceCount")
        private Integer managedInstanceCount;

        /**
         * The count of managed instances wherein the specified library was detected.
         *
         * @param managedInstanceCount the value to set
         * @return this builder
         */
        public Builder managedInstanceCount(Integer managedInstanceCount) {
            this.managedInstanceCount = managedInstanceCount;
            this.__explicitlySet__.add("managedInstanceCount");
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

        public UncorrelatedPackageApplicationUsageSummary build() {
            UncorrelatedPackageApplicationUsageSummary model =
                    new UncorrelatedPackageApplicationUsageSummary(
                            this.applicationKey,
                            this.applicationName,
                            this.managedInstanceCount,
                            this.lastDetectedDynamically);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UncorrelatedPackageApplicationUsageSummary model) {
            if (model.wasPropertyExplicitlySet("applicationKey")) {
                this.applicationKey(model.getApplicationKey());
            }
            if (model.wasPropertyExplicitlySet("applicationName")) {
                this.applicationName(model.getApplicationName());
            }
            if (model.wasPropertyExplicitlySet("managedInstanceCount")) {
                this.managedInstanceCount(model.getManagedInstanceCount());
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

    /** The internal identifier of a Java application. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationKey")
    private final String applicationKey;

    /**
     * The internal identifier of a Java application.
     *
     * @return the value
     */
    public String getApplicationKey() {
        return applicationKey;
    }

    /** The displayed name of the Java application. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationName")
    private final String applicationName;

    /**
     * The displayed name of the Java application.
     *
     * @return the value
     */
    public String getApplicationName() {
        return applicationName;
    }

    /** The count of managed instances wherein the specified library was detected. */
    @com.fasterxml.jackson.annotation.JsonProperty("managedInstanceCount")
    private final Integer managedInstanceCount;

    /**
     * The count of managed instances wherein the specified library was detected.
     *
     * @return the value
     */
    public Integer getManagedInstanceCount() {
        return managedInstanceCount;
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
        sb.append("UncorrelatedPackageApplicationUsageSummary(");
        sb.append("super=").append(super.toString());
        sb.append("applicationKey=").append(String.valueOf(this.applicationKey));
        sb.append(", applicationName=").append(String.valueOf(this.applicationName));
        sb.append(", managedInstanceCount=").append(String.valueOf(this.managedInstanceCount));
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
        if (!(o instanceof UncorrelatedPackageApplicationUsageSummary)) {
            return false;
        }

        UncorrelatedPackageApplicationUsageSummary other =
                (UncorrelatedPackageApplicationUsageSummary) o;
        return java.util.Objects.equals(this.applicationKey, other.applicationKey)
                && java.util.Objects.equals(this.applicationName, other.applicationName)
                && java.util.Objects.equals(this.managedInstanceCount, other.managedInstanceCount)
                && java.util.Objects.equals(
                        this.lastDetectedDynamically, other.lastDetectedDynamically)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.applicationKey == null ? 43 : this.applicationKey.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationName == null ? 43 : this.applicationName.hashCode());
        result =
                (result * PRIME)
                        + (this.managedInstanceCount == null
                                ? 43
                                : this.managedInstanceCount.hashCode());
        result =
                (result * PRIME)
                        + (this.lastDetectedDynamically == null
                                ? 43
                                : this.lastDetectedDynamically.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
