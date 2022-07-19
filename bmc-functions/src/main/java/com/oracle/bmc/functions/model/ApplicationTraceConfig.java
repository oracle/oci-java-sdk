/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.model;

/**
 * Define the tracing configuration for an application.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ApplicationTraceConfig.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ApplicationTraceConfig {
    @Deprecated
    @java.beans.ConstructorProperties({"isEnabled", "domainId"})
    public ApplicationTraceConfig(Boolean isEnabled, String domainId) {
        super();
        this.isEnabled = isEnabled;
        this.domainId = domainId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Define if tracing is enabled for the resource.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Define if tracing is enabled for the resource.
         *
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }
        /**
         * The OCID of the collector (e.g. an APM Domain) trace events will be sent to.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("domainId")
        private String domainId;

        /**
         * The OCID of the collector (e.g. an APM Domain) trace events will be sent to.
         *
         * @param domainId the value to set
         * @return this builder
         **/
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            this.__explicitlySet__.add("domainId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApplicationTraceConfig build() {
            ApplicationTraceConfig __instance__ = new ApplicationTraceConfig(isEnabled, domainId);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApplicationTraceConfig o) {
            Builder copiedBuilder = isEnabled(o.getIsEnabled()).domainId(o.getDomainId());

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
     * Define if tracing is enabled for the resource.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Define if tracing is enabled for the resource.
     *
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    /**
     * The OCID of the collector (e.g. an APM Domain) trace events will be sent to.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("domainId")
    private final String domainId;

    /**
     * The OCID of the collector (e.g. an APM Domain) trace events will be sent to.
     *
     * @return the value
     **/
    public String getDomainId() {
        return domainId;
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
        sb.append("ApplicationTraceConfig(");
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append(", domainId=").append(String.valueOf(this.domainId));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApplicationTraceConfig)) {
            return false;
        }

        ApplicationTraceConfig other = (ApplicationTraceConfig) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.domainId, other.domainId)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
        result = (result * PRIME) + (this.domainId == null ? 43 : this.domainId.hashCode());
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
