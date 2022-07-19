/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * This is the namespace details of a tenancy in Logan Analytics application
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Namespace.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Namespace {
    @Deprecated
    @java.beans.ConstructorProperties({
        "namespaceName",
        "compartmentId",
        "isOnboarded",
        "isLogSetEnabled",
        "isDataEverIngested"
    })
    public Namespace(
            String namespaceName,
            String compartmentId,
            Boolean isOnboarded,
            Boolean isLogSetEnabled,
            Boolean isDataEverIngested) {
        super();
        this.namespaceName = namespaceName;
        this.compartmentId = compartmentId;
        this.isOnboarded = isOnboarded;
        this.isLogSetEnabled = isLogSetEnabled;
        this.isDataEverIngested = isDataEverIngested;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * This is the namespace name of a tenancy
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
        private String namespaceName;

        /**
         * This is the namespace name of a tenancy
         * @param namespaceName the value to set
         * @return this builder
         **/
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = namespaceName;
            this.__explicitlySet__.add("namespaceName");
            return this;
        }
        /**
         * The is the tenancy ID
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The is the tenancy ID
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * This indicates if the tenancy is onboarded to Logging Analytics
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isOnboarded")
        private Boolean isOnboarded;

        /**
         * This indicates if the tenancy is onboarded to Logging Analytics
         * @param isOnboarded the value to set
         * @return this builder
         **/
        public Builder isOnboarded(Boolean isOnboarded) {
            this.isOnboarded = isOnboarded;
            this.__explicitlySet__.add("isOnboarded");
            return this;
        }
        /**
         * This indicates if the log set feature is enabled for the tenancy
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isLogSetEnabled")
        private Boolean isLogSetEnabled;

        /**
         * This indicates if the log set feature is enabled for the tenancy
         * @param isLogSetEnabled the value to set
         * @return this builder
         **/
        public Builder isLogSetEnabled(Boolean isLogSetEnabled) {
            this.isLogSetEnabled = isLogSetEnabled;
            this.__explicitlySet__.add("isLogSetEnabled");
            return this;
        }
        /**
         * This indicates if data has ever been ingested for the tenancy in Logging Analytics
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isDataEverIngested")
        private Boolean isDataEverIngested;

        /**
         * This indicates if data has ever been ingested for the tenancy in Logging Analytics
         * @param isDataEverIngested the value to set
         * @return this builder
         **/
        public Builder isDataEverIngested(Boolean isDataEverIngested) {
            this.isDataEverIngested = isDataEverIngested;
            this.__explicitlySet__.add("isDataEverIngested");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Namespace build() {
            Namespace __instance__ =
                    new Namespace(
                            namespaceName,
                            compartmentId,
                            isOnboarded,
                            isLogSetEnabled,
                            isDataEverIngested);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Namespace o) {
            Builder copiedBuilder =
                    namespaceName(o.getNamespaceName())
                            .compartmentId(o.getCompartmentId())
                            .isOnboarded(o.getIsOnboarded())
                            .isLogSetEnabled(o.getIsLogSetEnabled())
                            .isDataEverIngested(o.getIsDataEverIngested());

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
     * This is the namespace name of a tenancy
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("namespaceName")
    private final String namespaceName;

    /**
     * This is the namespace name of a tenancy
     * @return the value
     **/
    public String getNamespaceName() {
        return namespaceName;
    }

    /**
     * The is the tenancy ID
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The is the tenancy ID
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * This indicates if the tenancy is onboarded to Logging Analytics
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOnboarded")
    private final Boolean isOnboarded;

    /**
     * This indicates if the tenancy is onboarded to Logging Analytics
     * @return the value
     **/
    public Boolean getIsOnboarded() {
        return isOnboarded;
    }

    /**
     * This indicates if the log set feature is enabled for the tenancy
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLogSetEnabled")
    private final Boolean isLogSetEnabled;

    /**
     * This indicates if the log set feature is enabled for the tenancy
     * @return the value
     **/
    public Boolean getIsLogSetEnabled() {
        return isLogSetEnabled;
    }

    /**
     * This indicates if data has ever been ingested for the tenancy in Logging Analytics
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isDataEverIngested")
    private final Boolean isDataEverIngested;

    /**
     * This indicates if data has ever been ingested for the tenancy in Logging Analytics
     * @return the value
     **/
    public Boolean getIsDataEverIngested() {
        return isDataEverIngested;
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
        sb.append("Namespace(");
        sb.append("namespaceName=").append(String.valueOf(this.namespaceName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", isOnboarded=").append(String.valueOf(this.isOnboarded));
        sb.append(", isLogSetEnabled=").append(String.valueOf(this.isLogSetEnabled));
        sb.append(", isDataEverIngested=").append(String.valueOf(this.isDataEverIngested));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Namespace)) {
            return false;
        }

        Namespace other = (Namespace) o;
        return java.util.Objects.equals(this.namespaceName, other.namespaceName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.isOnboarded, other.isOnboarded)
                && java.util.Objects.equals(this.isLogSetEnabled, other.isLogSetEnabled)
                && java.util.Objects.equals(this.isDataEverIngested, other.isDataEverIngested)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.namespaceName == null ? 43 : this.namespaceName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.isOnboarded == null ? 43 : this.isOnboarded.hashCode());
        result =
                (result * PRIME)
                        + (this.isLogSetEnabled == null ? 43 : this.isLogSetEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isDataEverIngested == null
                                ? 43
                                : this.isDataEverIngested.hashCode());
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
