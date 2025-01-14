/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.waf.model;

/**
 * The information about new WebAppFirewallPolicy. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210930")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateWebAppFirewallPolicyDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class CreateWebAppFirewallPolicyDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "compartmentId",
        "actions",
        "requestAccessControl",
        "requestRateLimiting",
        "requestProtection",
        "responseAccessControl",
        "responseProtection",
        "freeformTags",
        "definedTags",
        "systemTags"
    })
    public CreateWebAppFirewallPolicyDetails(
            String displayName,
            String compartmentId,
            java.util.List<Action> actions,
            RequestAccessControl requestAccessControl,
            RequestRateLimiting requestRateLimiting,
            RequestProtection requestProtection,
            ResponseAccessControl responseAccessControl,
            ResponseProtection responseProtection,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            java.util.Map<String, java.util.Map<String, Object>> systemTags) {
        super();
        this.displayName = displayName;
        this.compartmentId = compartmentId;
        this.actions = actions;
        this.requestAccessControl = requestAccessControl;
        this.requestRateLimiting = requestRateLimiting;
        this.requestProtection = requestProtection;
        this.responseAccessControl = responseAccessControl;
        this.responseProtection = responseProtection;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.systemTags = systemTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** WebAppFirewallPolicy display name, can be renamed. */
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * WebAppFirewallPolicy display name, can be renamed.
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
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
         * compartment.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * Predefined actions for use in multiple different rules. Not all actions are supported in
         * every module. Some actions terminate further execution of modules and rules in a module
         * and some do not. Actions names must be unique within this array.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("actions")
        private java.util.List<Action> actions;

        /**
         * Predefined actions for use in multiple different rules. Not all actions are supported in
         * every module. Some actions terminate further execution of modules and rules in a module
         * and some do not. Actions names must be unique within this array.
         *
         * @param actions the value to set
         * @return this builder
         */
        public Builder actions(java.util.List<Action> actions) {
            this.actions = actions;
            this.__explicitlySet__.add("actions");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestAccessControl")
        private RequestAccessControl requestAccessControl;

        public Builder requestAccessControl(RequestAccessControl requestAccessControl) {
            this.requestAccessControl = requestAccessControl;
            this.__explicitlySet__.add("requestAccessControl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestRateLimiting")
        private RequestRateLimiting requestRateLimiting;

        public Builder requestRateLimiting(RequestRateLimiting requestRateLimiting) {
            this.requestRateLimiting = requestRateLimiting;
            this.__explicitlySet__.add("requestRateLimiting");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestProtection")
        private RequestProtection requestProtection;

        public Builder requestProtection(RequestProtection requestProtection) {
            this.requestProtection = requestProtection;
            this.__explicitlySet__.add("requestProtection");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseAccessControl")
        private ResponseAccessControl responseAccessControl;

        public Builder responseAccessControl(ResponseAccessControl responseAccessControl) {
            this.responseAccessControl = responseAccessControl;
            this.__explicitlySet__.add("responseAccessControl");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("responseProtection")
        private ResponseProtection responseProtection;

        public Builder responseProtection(ResponseProtection responseProtection) {
            this.responseProtection = responseProtection;
            this.__explicitlySet__.add("responseProtection");
            return this;
        }
        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Simple key-value pair that is applied without any predefined name, type or scope. Exists
         * for cross-compatibility only. Example: {@code {"bar-key": "value"}}
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
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * Example: {@code {"foo-namespace": {"bar-key": "value"}}}
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
        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
        private java.util.Map<String, java.util.Map<String, Object>> systemTags;

        /**
         * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
         * {"orcl-cloud": {"free-tier-retained": "true"}}}
         *
         * @param systemTags the value to set
         * @return this builder
         */
        public Builder systemTags(java.util.Map<String, java.util.Map<String, Object>> systemTags) {
            this.systemTags = systemTags;
            this.__explicitlySet__.add("systemTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateWebAppFirewallPolicyDetails build() {
            CreateWebAppFirewallPolicyDetails model =
                    new CreateWebAppFirewallPolicyDetails(
                            this.displayName,
                            this.compartmentId,
                            this.actions,
                            this.requestAccessControl,
                            this.requestRateLimiting,
                            this.requestProtection,
                            this.responseAccessControl,
                            this.responseProtection,
                            this.freeformTags,
                            this.definedTags,
                            this.systemTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateWebAppFirewallPolicyDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("actions")) {
                this.actions(model.getActions());
            }
            if (model.wasPropertyExplicitlySet("requestAccessControl")) {
                this.requestAccessControl(model.getRequestAccessControl());
            }
            if (model.wasPropertyExplicitlySet("requestRateLimiting")) {
                this.requestRateLimiting(model.getRequestRateLimiting());
            }
            if (model.wasPropertyExplicitlySet("requestProtection")) {
                this.requestProtection(model.getRequestProtection());
            }
            if (model.wasPropertyExplicitlySet("responseAccessControl")) {
                this.responseAccessControl(model.getResponseAccessControl());
            }
            if (model.wasPropertyExplicitlySet("responseProtection")) {
                this.responseProtection(model.getResponseProtection());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("systemTags")) {
                this.systemTags(model.getSystemTags());
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

    /** WebAppFirewallPolicy display name, can be renamed. */
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * WebAppFirewallPolicy display name, can be renamed.
     *
     * @return the value
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The [OCID](https://docs.cloud.oracle.com/Content/General/Concepts/identifiers.htm) of the
     * compartment.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * Predefined actions for use in multiple different rules. Not all actions are supported in
     * every module. Some actions terminate further execution of modules and rules in a module and
     * some do not. Actions names must be unique within this array.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("actions")
    private final java.util.List<Action> actions;

    /**
     * Predefined actions for use in multiple different rules. Not all actions are supported in
     * every module. Some actions terminate further execution of modules and rules in a module and
     * some do not. Actions names must be unique within this array.
     *
     * @return the value
     */
    public java.util.List<Action> getActions() {
        return actions;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("requestAccessControl")
    private final RequestAccessControl requestAccessControl;

    public RequestAccessControl getRequestAccessControl() {
        return requestAccessControl;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("requestRateLimiting")
    private final RequestRateLimiting requestRateLimiting;

    public RequestRateLimiting getRequestRateLimiting() {
        return requestRateLimiting;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("requestProtection")
    private final RequestProtection requestProtection;

    public RequestProtection getRequestProtection() {
        return requestProtection;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("responseAccessControl")
    private final ResponseAccessControl responseAccessControl;

    public ResponseAccessControl getResponseAccessControl() {
        return responseAccessControl;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("responseProtection")
    private final ResponseProtection responseProtection;

    public ResponseProtection getResponseProtection() {
        return responseProtection;
    }

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Simple key-value pair that is applied without any predefined name, type or scope. Exists for
     * cross-compatibility only. Example: {@code {"bar-key": "value"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. Example:
     * {@code {"foo-namespace": {"bar-key": "value"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("systemTags")
    private final java.util.Map<String, java.util.Map<String, Object>> systemTags;

    /**
     * Usage of system tag keys. These predefined keys are scoped to namespaces. Example: {@code
     * {"orcl-cloud": {"free-tier-retained": "true"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getSystemTags() {
        return systemTags;
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
        sb.append("CreateWebAppFirewallPolicyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", actions=").append(String.valueOf(this.actions));
        sb.append(", requestAccessControl=").append(String.valueOf(this.requestAccessControl));
        sb.append(", requestRateLimiting=").append(String.valueOf(this.requestRateLimiting));
        sb.append(", requestProtection=").append(String.valueOf(this.requestProtection));
        sb.append(", responseAccessControl=").append(String.valueOf(this.responseAccessControl));
        sb.append(", responseProtection=").append(String.valueOf(this.responseProtection));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", systemTags=").append(String.valueOf(this.systemTags));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateWebAppFirewallPolicyDetails)) {
            return false;
        }

        CreateWebAppFirewallPolicyDetails other = (CreateWebAppFirewallPolicyDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.actions, other.actions)
                && java.util.Objects.equals(this.requestAccessControl, other.requestAccessControl)
                && java.util.Objects.equals(this.requestRateLimiting, other.requestRateLimiting)
                && java.util.Objects.equals(this.requestProtection, other.requestProtection)
                && java.util.Objects.equals(this.responseAccessControl, other.responseAccessControl)
                && java.util.Objects.equals(this.responseProtection, other.responseProtection)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.systemTags, other.systemTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.actions == null ? 43 : this.actions.hashCode());
        result =
                (result * PRIME)
                        + (this.requestAccessControl == null
                                ? 43
                                : this.requestAccessControl.hashCode());
        result =
                (result * PRIME)
                        + (this.requestRateLimiting == null
                                ? 43
                                : this.requestRateLimiting.hashCode());
        result =
                (result * PRIME)
                        + (this.requestProtection == null ? 43 : this.requestProtection.hashCode());
        result =
                (result * PRIME)
                        + (this.responseAccessControl == null
                                ? 43
                                : this.responseAccessControl.hashCode());
        result =
                (result * PRIME)
                        + (this.responseProtection == null
                                ? 43
                                : this.responseProtection.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.systemTags == null ? 43 : this.systemTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
