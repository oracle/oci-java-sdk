/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.jms.model;

/**
 * Summary of a managed instance where a given uncorrelated package was detected. Contains the count
 * of application where the package was detected with this application. <br>
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
        builder = UncorrelatedPackageManagedInstanceUsageSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UncorrelatedPackageManagedInstanceUsageSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "managedInstanceId",
        "hostname",
        "applicationCount",
        "lastDetectedDynamically"
    })
    public UncorrelatedPackageManagedInstanceUsageSummary(
            String managedInstanceId,
            String hostname,
            Integer applicationCount,
            java.util.Date lastDetectedDynamically) {
        super();
        this.managedInstanceId = managedInstanceId;
        this.hostname = hostname;
        this.applicationCount = applicationCount;
        this.lastDetectedDynamically = lastDetectedDynamically;
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
        /** The count of applications wherein the specified library was detected. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationCount")
        private Integer applicationCount;

        /**
         * The count of applications wherein the specified library was detected.
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

        public UncorrelatedPackageManagedInstanceUsageSummary build() {
            UncorrelatedPackageManagedInstanceUsageSummary model =
                    new UncorrelatedPackageManagedInstanceUsageSummary(
                            this.managedInstanceId,
                            this.hostname,
                            this.applicationCount,
                            this.lastDetectedDynamically);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UncorrelatedPackageManagedInstanceUsageSummary model) {
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

    /** The count of applications wherein the specified library was detected. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationCount")
    private final Integer applicationCount;

    /**
     * The count of applications wherein the specified library was detected.
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
        sb.append("UncorrelatedPackageManagedInstanceUsageSummary(");
        sb.append("super=").append(super.toString());
        sb.append("managedInstanceId=").append(String.valueOf(this.managedInstanceId));
        sb.append(", hostname=").append(String.valueOf(this.hostname));
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
        if (!(o instanceof UncorrelatedPackageManagedInstanceUsageSummary)) {
            return false;
        }

        UncorrelatedPackageManagedInstanceUsageSummary other =
                (UncorrelatedPackageManagedInstanceUsageSummary) o;
        return java.util.Objects.equals(this.managedInstanceId, other.managedInstanceId)
                && java.util.Objects.equals(this.hostname, other.hostname)
                && java.util.Objects.equals(this.applicationCount, other.applicationCount)
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
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
