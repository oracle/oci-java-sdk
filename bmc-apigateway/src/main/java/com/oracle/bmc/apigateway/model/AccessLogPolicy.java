/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Configures the logging policies for the access logs of an API Deployment.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = AccessLogPolicy.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AccessLogPolicy {
    @Deprecated
    @java.beans.ConstructorProperties({"isEnabled"})
    public AccessLogPolicy(Boolean isEnabled) {
        super();
        this.isEnabled = isEnabled;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Enables pushing of access logs to the legacy OCI Object Storage log archival bucket.
         * <p>
         * Oracle recommends using the OCI Logging service to enable, retrieve, and query access logs
         * for an API Deployment. If there is an active log object for the API Deployment and its
         * category is set to 'access' in OCI Logging service, the logs will not be uploaded to the
         * legacy OCI Object Storage log archival bucket.
         * <p>
         * Please note that the functionality to push to the legacy OCI Object Storage log
         * archival bucket has been deprecated and will be removed in the future.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
        private Boolean isEnabled;

        /**
         * Enables pushing of access logs to the legacy OCI Object Storage log archival bucket.
         * <p>
         * Oracle recommends using the OCI Logging service to enable, retrieve, and query access logs
         * for an API Deployment. If there is an active log object for the API Deployment and its
         * category is set to 'access' in OCI Logging service, the logs will not be uploaded to the
         * legacy OCI Object Storage log archival bucket.
         * <p>
         * Please note that the functionality to push to the legacy OCI Object Storage log
         * archival bucket has been deprecated and will be removed in the future.
         *
         * @param isEnabled the value to set
         * @return this builder
         **/
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = isEnabled;
            this.__explicitlySet__.add("isEnabled");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AccessLogPolicy build() {
            AccessLogPolicy __instance__ = new AccessLogPolicy(isEnabled);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccessLogPolicy o) {
            Builder copiedBuilder = isEnabled(o.getIsEnabled());

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
     * Enables pushing of access logs to the legacy OCI Object Storage log archival bucket.
     * <p>
     * Oracle recommends using the OCI Logging service to enable, retrieve, and query access logs
     * for an API Deployment. If there is an active log object for the API Deployment and its
     * category is set to 'access' in OCI Logging service, the logs will not be uploaded to the
     * legacy OCI Object Storage log archival bucket.
     * <p>
     * Please note that the functionality to push to the legacy OCI Object Storage log
     * archival bucket has been deprecated and will be removed in the future.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isEnabled")
    private final Boolean isEnabled;

    /**
     * Enables pushing of access logs to the legacy OCI Object Storage log archival bucket.
     * <p>
     * Oracle recommends using the OCI Logging service to enable, retrieve, and query access logs
     * for an API Deployment. If there is an active log object for the API Deployment and its
     * category is set to 'access' in OCI Logging service, the logs will not be uploaded to the
     * legacy OCI Object Storage log archival bucket.
     * <p>
     * Please note that the functionality to push to the legacy OCI Object Storage log
     * archival bucket has been deprecated and will be removed in the future.
     *
     * @return the value
     **/
    public Boolean getIsEnabled() {
        return isEnabled;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("AccessLogPolicy(");
        sb.append("isEnabled=").append(String.valueOf(this.isEnabled));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccessLogPolicy)) {
            return false;
        }

        AccessLogPolicy other = (AccessLogPolicy) o;
        return java.util.Objects.equals(this.isEnabled, other.isEnabled)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.isEnabled == null ? 43 : this.isEnabled.hashCode());
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
