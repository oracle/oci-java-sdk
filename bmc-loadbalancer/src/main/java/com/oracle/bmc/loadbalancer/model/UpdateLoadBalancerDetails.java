/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loadbalancer.model;

/**
 * Configuration details to update a load balancer.
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20170115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateLoadBalancerDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateLoadBalancerDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "isDeleteProtectionEnabled",
        "isRequestIdEnabled",
        "requestIdHeader",
        "freeformTags",
        "definedTags"
    })
    public UpdateLoadBalancerDetails(
            String displayName,
            Boolean isDeleteProtectionEnabled,
            Boolean isRequestIdEnabled,
            String requestIdHeader,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.isDeleteProtectionEnabled = isDeleteProtectionEnabled;
        this.isRequestIdEnabled = isRequestIdEnabled;
        this.requestIdHeader = requestIdHeader;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The user-friendly display name for the load balancer. It does not have to be unique, and
         * it is changeable. Avoid entering confidential information.
         *
         * <p>Example: {@code example_load_balancer}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The user-friendly display name for the load balancer. It does not have to be unique, and
         * it is changeable. Avoid entering confidential information.
         *
         * <p>Example: {@code example_load_balancer}
         *
         * @param displayName the value to set
         * @return this builder
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * Whether or not the load balancer has delete protection enabled.
         *
         * <p>If "true", the loadbalancer will be protected against deletion if configured to accept
         * traffic.
         *
         * <p>If "false", the loadbalancer will not be protected against deletion.
         *
         * <p>If null or unset, the value for delete protection will not be changed.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isDeleteProtectionEnabled")
        private Boolean isDeleteProtectionEnabled;

        /**
         * Whether or not the load balancer has delete protection enabled.
         *
         * <p>If "true", the loadbalancer will be protected against deletion if configured to accept
         * traffic.
         *
         * <p>If "false", the loadbalancer will not be protected against deletion.
         *
         * <p>If null or unset, the value for delete protection will not be changed.
         *
         * <p>Example: {@code true}
         *
         * @param isDeleteProtectionEnabled the value to set
         * @return this builder
         */
        public Builder isDeleteProtectionEnabled(Boolean isDeleteProtectionEnabled) {
            this.isDeleteProtectionEnabled = isDeleteProtectionEnabled;
            this.__explicitlySet__.add("isDeleteProtectionEnabled");
            return this;
        }
        /**
         * Whether or not the load balancer has the Request Id feature enabled for HTTP listeners.
         *
         * <p>If "true", the load balancer will attach a unique request id header to every request
         * passed through from the load balancer to load balancer backends. This same request id
         * header also will be added to the response the lb received from the backend handling the
         * request before the load balancer returns the response to the requestor. The name of the
         * unique request id header is set the by value of requestIdHeader.
         *
         * <p>If "false", the loadbalancer not add this unique request id header to either the
         * request passed through to the load balancer backends nor to the reponse returned to the
         * user.
         *
         * <p>New load balancers have the Request Id feature enabled unless isRequestIdEnabled is
         * set to False.
         *
         * <p>Example: {@code true}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRequestIdEnabled")
        private Boolean isRequestIdEnabled;

        /**
         * Whether or not the load balancer has the Request Id feature enabled for HTTP listeners.
         *
         * <p>If "true", the load balancer will attach a unique request id header to every request
         * passed through from the load balancer to load balancer backends. This same request id
         * header also will be added to the response the lb received from the backend handling the
         * request before the load balancer returns the response to the requestor. The name of the
         * unique request id header is set the by value of requestIdHeader.
         *
         * <p>If "false", the loadbalancer not add this unique request id header to either the
         * request passed through to the load balancer backends nor to the reponse returned to the
         * user.
         *
         * <p>New load balancers have the Request Id feature enabled unless isRequestIdEnabled is
         * set to False.
         *
         * <p>Example: {@code true}
         *
         * @param isRequestIdEnabled the value to set
         * @return this builder
         */
        public Builder isRequestIdEnabled(Boolean isRequestIdEnabled) {
            this.isRequestIdEnabled = isRequestIdEnabled;
            this.__explicitlySet__.add("isRequestIdEnabled");
            return this;
        }
        /**
         * If isRequestIdEnabled is true then this field contains the name of the header field that
         * contains the unique request id that is attached to every request from the load balancer
         * to the load balancer backends and to every response from the load balancer.
         *
         * <p>If a request to the load balancer already contains a header with same name as
         * specified in requestIdHeader then the load balancer will not change the value of that
         * field.
         *
         * <p>If isRequestIdEnabled is false then this field is ignored.
         *
         * <p>*Notes:** * Unless the header name is "" it must start with "X-" prefix. * Setting the
         * header name to "" will set it to the default: X-Request-Id.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("requestIdHeader")
        private String requestIdHeader;

        /**
         * If isRequestIdEnabled is true then this field contains the name of the header field that
         * contains the unique request id that is attached to every request from the load balancer
         * to the load balancer backends and to every response from the load balancer.
         *
         * <p>If a request to the load balancer already contains a header with same name as
         * specified in requestIdHeader then the load balancer will not change the value of that
         * field.
         *
         * <p>If isRequestIdEnabled is false then this field is ignored.
         *
         * <p>*Notes:** * Unless the header name is "" it must start with "X-" prefix. * Setting the
         * header name to "" will set it to the default: X-Request-Id.
         *
         * @param requestIdHeader the value to set
         * @return this builder
         */
        public Builder requestIdHeader(String requestIdHeader) {
            this.requestIdHeader = requestIdHeader;
            this.__explicitlySet__.add("requestIdHeader");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateLoadBalancerDetails build() {
            UpdateLoadBalancerDetails model =
                    new UpdateLoadBalancerDetails(
                            this.displayName,
                            this.isDeleteProtectionEnabled,
                            this.isRequestIdEnabled,
                            this.requestIdHeader,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateLoadBalancerDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("isDeleteProtectionEnabled")) {
                this.isDeleteProtectionEnabled(model.getIsDeleteProtectionEnabled());
            }
            if (model.wasPropertyExplicitlySet("isRequestIdEnabled")) {
                this.isRequestIdEnabled(model.getIsRequestIdEnabled());
            }
            if (model.wasPropertyExplicitlySet("requestIdHeader")) {
                this.requestIdHeader(model.getRequestIdHeader());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
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
     * The user-friendly display name for the load balancer. It does not have to be unique, and it
     * is changeable. Avoid entering confidential information.
     *
     * <p>Example: {@code example_load_balancer}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The user-friendly display name for the load balancer. It does not have to be unique, and it
     * is changeable. Avoid entering confidential information.
     *
     * <p>Example: {@code example_load_balancer}
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Whether or not the load balancer has delete protection enabled.
     *
     * <p>If "true", the loadbalancer will be protected against deletion if configured to accept
     * traffic.
     *
     * <p>If "false", the loadbalancer will not be protected against deletion.
     *
     * <p>If null or unset, the value for delete protection will not be changed.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isDeleteProtectionEnabled")
    private final Boolean isDeleteProtectionEnabled;

    /**
     * Whether or not the load balancer has delete protection enabled.
     *
     * <p>If "true", the loadbalancer will be protected against deletion if configured to accept
     * traffic.
     *
     * <p>If "false", the loadbalancer will not be protected against deletion.
     *
     * <p>If null or unset, the value for delete protection will not be changed.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getIsDeleteProtectionEnabled() {
        return isDeleteProtectionEnabled;
    }

    /**
     * Whether or not the load balancer has the Request Id feature enabled for HTTP listeners.
     *
     * <p>If "true", the load balancer will attach a unique request id header to every request
     * passed through from the load balancer to load balancer backends. This same request id header
     * also will be added to the response the lb received from the backend handling the request
     * before the load balancer returns the response to the requestor. The name of the unique
     * request id header is set the by value of requestIdHeader.
     *
     * <p>If "false", the loadbalancer not add this unique request id header to either the request
     * passed through to the load balancer backends nor to the reponse returned to the user.
     *
     * <p>New load balancers have the Request Id feature enabled unless isRequestIdEnabled is set to
     * False.
     *
     * <p>Example: {@code true}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRequestIdEnabled")
    private final Boolean isRequestIdEnabled;

    /**
     * Whether or not the load balancer has the Request Id feature enabled for HTTP listeners.
     *
     * <p>If "true", the load balancer will attach a unique request id header to every request
     * passed through from the load balancer to load balancer backends. This same request id header
     * also will be added to the response the lb received from the backend handling the request
     * before the load balancer returns the response to the requestor. The name of the unique
     * request id header is set the by value of requestIdHeader.
     *
     * <p>If "false", the loadbalancer not add this unique request id header to either the request
     * passed through to the load balancer backends nor to the reponse returned to the user.
     *
     * <p>New load balancers have the Request Id feature enabled unless isRequestIdEnabled is set to
     * False.
     *
     * <p>Example: {@code true}
     *
     * @return the value
     */
    public Boolean getIsRequestIdEnabled() {
        return isRequestIdEnabled;
    }

    /**
     * If isRequestIdEnabled is true then this field contains the name of the header field that
     * contains the unique request id that is attached to every request from the load balancer to
     * the load balancer backends and to every response from the load balancer.
     *
     * <p>If a request to the load balancer already contains a header with same name as specified in
     * requestIdHeader then the load balancer will not change the value of that field.
     *
     * <p>If isRequestIdEnabled is false then this field is ignored.
     *
     * <p>*Notes:** * Unless the header name is "" it must start with "X-" prefix. * Setting the
     * header name to "" will set it to the default: X-Request-Id.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestIdHeader")
    private final String requestIdHeader;

    /**
     * If isRequestIdEnabled is true then this field contains the name of the header field that
     * contains the unique request id that is attached to every request from the load balancer to
     * the load balancer backends and to every response from the load balancer.
     *
     * <p>If a request to the load balancer already contains a header with same name as specified in
     * requestIdHeader then the load balancer will not change the value of that field.
     *
     * <p>If isRequestIdEnabled is false then this field is ignored.
     *
     * <p>*Notes:** * Unless the header name is "" it must start with "X-" prefix. * Setting the
     * header name to "" will set it to the default: X-Request-Id.
     *
     * @return the value
     */
    public String getRequestIdHeader() {
        return requestIdHeader;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateLoadBalancerDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", isDeleteProtectionEnabled=")
                .append(String.valueOf(this.isDeleteProtectionEnabled));
        sb.append(", isRequestIdEnabled=").append(String.valueOf(this.isRequestIdEnabled));
        sb.append(", requestIdHeader=").append(String.valueOf(this.requestIdHeader));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateLoadBalancerDetails)) {
            return false;
        }

        UpdateLoadBalancerDetails other = (UpdateLoadBalancerDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(
                        this.isDeleteProtectionEnabled, other.isDeleteProtectionEnabled)
                && java.util.Objects.equals(this.isRequestIdEnabled, other.isRequestIdEnabled)
                && java.util.Objects.equals(this.requestIdHeader, other.requestIdHeader)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.isDeleteProtectionEnabled == null
                                ? 43
                                : this.isDeleteProtectionEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.isRequestIdEnabled == null
                                ? 43
                                : this.isRequestIdEnabled.hashCode());
        result =
                (result * PRIME)
                        + (this.requestIdHeader == null ? 43 : this.requestIdHeader.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
