/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.datasafe.model;

/**
 * Details to update the SQL Firewall policy.
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
    builder = UpdateSqlFirewallPolicyDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateSqlFirewallPolicyDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "displayName",
        "description",
        "status",
        "enforcementScope",
        "violationAction",
        "violationAudit",
        "allowedClientIps",
        "allowedClientOsUsernames",
        "allowedClientPrograms",
        "freeformTags",
        "definedTags"
    })
    public UpdateSqlFirewallPolicyDetails(
            String displayName,
            String description,
            Status status,
            EnforcementScope enforcementScope,
            ViolationAction violationAction,
            ViolationAudit violationAudit,
            java.util.List<String> allowedClientIps,
            java.util.List<String> allowedClientOsUsernames,
            java.util.List<String> allowedClientPrograms,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags) {
        super();
        this.displayName = displayName;
        this.description = description;
        this.status = status;
        this.enforcementScope = enforcementScope;
        this.violationAction = violationAction;
        this.violationAudit = violationAudit;
        this.allowedClientIps = allowedClientIps;
        this.allowedClientOsUsernames = allowedClientOsUsernames;
        this.allowedClientPrograms = allowedClientPrograms;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The display name of the SQL Firewall policy. The name does not have to be unique, and it is changeable.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("displayName")
        private String displayName;

        /**
         * The display name of the SQL Firewall policy. The name does not have to be unique, and it is changeable.
         * @param displayName the value to set
         * @return this builder
         **/
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            this.__explicitlySet__.add("displayName");
            return this;
        }
        /**
         * The description of the SQL Firewall policy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description of the SQL Firewall policy.
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * Specifies whether the SQL Firewall policy is enabled or disabled.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * Specifies whether the SQL Firewall policy is enabled or disabled.
         * @param status the value to set
         * @return this builder
         **/
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Specifies the SQL Firewall policy enforcement option.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enforcementScope")
        private EnforcementScope enforcementScope;

        /**
         * Specifies the SQL Firewall policy enforcement option.
         * @param enforcementScope the value to set
         * @return this builder
         **/
        public Builder enforcementScope(EnforcementScope enforcementScope) {
            this.enforcementScope = enforcementScope;
            this.__explicitlySet__.add("enforcementScope");
            return this;
        }
        /**
         * Specifies the SQL Firewall action based on detection of SQL Firewall violations.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("violationAction")
        private ViolationAction violationAction;

        /**
         * Specifies the SQL Firewall action based on detection of SQL Firewall violations.
         * @param violationAction the value to set
         * @return this builder
         **/
        public Builder violationAction(ViolationAction violationAction) {
            this.violationAction = violationAction;
            this.__explicitlySet__.add("violationAction");
            return this;
        }
        /**
         * Specifies whether a unified audit policy should be enabled for auditing the SQL Firewall policy violations.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("violationAudit")
        private ViolationAudit violationAudit;

        /**
         * Specifies whether a unified audit policy should be enabled for auditing the SQL Firewall policy violations.
         * @param violationAudit the value to set
         * @return this builder
         **/
        public Builder violationAudit(ViolationAudit violationAudit) {
            this.violationAudit = violationAudit;
            this.__explicitlySet__.add("violationAudit");
            return this;
        }
        /**
         * List of allowed ip addresses for the SQL Firewall policy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allowedClientIps")
        private java.util.List<String> allowedClientIps;

        /**
         * List of allowed ip addresses for the SQL Firewall policy.
         * @param allowedClientIps the value to set
         * @return this builder
         **/
        public Builder allowedClientIps(java.util.List<String> allowedClientIps) {
            this.allowedClientIps = allowedClientIps;
            this.__explicitlySet__.add("allowedClientIps");
            return this;
        }
        /**
         * List of allowed operating system user names for the SQL Firewall policy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allowedClientOsUsernames")
        private java.util.List<String> allowedClientOsUsernames;

        /**
         * List of allowed operating system user names for the SQL Firewall policy.
         * @param allowedClientOsUsernames the value to set
         * @return this builder
         **/
        public Builder allowedClientOsUsernames(java.util.List<String> allowedClientOsUsernames) {
            this.allowedClientOsUsernames = allowedClientOsUsernames;
            this.__explicitlySet__.add("allowedClientOsUsernames");
            return this;
        }
        /**
         * List of allowed client programs for the SQL Firewall policy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allowedClientPrograms")
        private java.util.List<String> allowedClientPrograms;

        /**
         * List of allowed client programs for the SQL Firewall policy.
         * @param allowedClientPrograms the value to set
         * @return this builder
         **/
        public Builder allowedClientPrograms(java.util.List<String> allowedClientPrograms) {
            this.allowedClientPrograms = allowedClientPrograms;
            this.__explicitlySet__.add("allowedClientPrograms");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
         * <p>
         * Example: {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateSqlFirewallPolicyDetails build() {
            UpdateSqlFirewallPolicyDetails model =
                    new UpdateSqlFirewallPolicyDetails(
                            this.displayName,
                            this.description,
                            this.status,
                            this.enforcementScope,
                            this.violationAction,
                            this.violationAudit,
                            this.allowedClientIps,
                            this.allowedClientOsUsernames,
                            this.allowedClientPrograms,
                            this.freeformTags,
                            this.definedTags);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateSqlFirewallPolicyDetails model) {
            if (model.wasPropertyExplicitlySet("displayName")) {
                this.displayName(model.getDisplayName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("enforcementScope")) {
                this.enforcementScope(model.getEnforcementScope());
            }
            if (model.wasPropertyExplicitlySet("violationAction")) {
                this.violationAction(model.getViolationAction());
            }
            if (model.wasPropertyExplicitlySet("violationAudit")) {
                this.violationAudit(model.getViolationAudit());
            }
            if (model.wasPropertyExplicitlySet("allowedClientIps")) {
                this.allowedClientIps(model.getAllowedClientIps());
            }
            if (model.wasPropertyExplicitlySet("allowedClientOsUsernames")) {
                this.allowedClientOsUsernames(model.getAllowedClientOsUsernames());
            }
            if (model.wasPropertyExplicitlySet("allowedClientPrograms")) {
                this.allowedClientPrograms(model.getAllowedClientPrograms());
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
     * The display name of the SQL Firewall policy. The name does not have to be unique, and it is changeable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("displayName")
    private final String displayName;

    /**
     * The display name of the SQL Firewall policy. The name does not have to be unique, and it is changeable.
     * @return the value
     **/
    public String getDisplayName() {
        return displayName;
    }

    /**
     * The description of the SQL Firewall policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description of the SQL Firewall policy.
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * Specifies whether the SQL Firewall policy is enabled or disabled.
     **/
    public enum Status {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        ;

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                map.put(v.getValue(), v);
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid Status: " + key);
        }
    };
    /**
     * Specifies whether the SQL Firewall policy is enabled or disabled.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * Specifies whether the SQL Firewall policy is enabled or disabled.
     * @return the value
     **/
    public Status getStatus() {
        return status;
    }

    /**
     * Specifies the SQL Firewall policy enforcement option.
     **/
    public enum EnforcementScope {
        EnforceContext("ENFORCE_CONTEXT"),
        EnforceSql("ENFORCE_SQL"),
        EnforceAll("ENFORCE_ALL"),
        ;

        private final String value;
        private static java.util.Map<String, EnforcementScope> map;

        static {
            map = new java.util.HashMap<>();
            for (EnforcementScope v : EnforcementScope.values()) {
                map.put(v.getValue(), v);
            }
        }

        EnforcementScope(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static EnforcementScope create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid EnforcementScope: " + key);
        }
    };
    /**
     * Specifies the SQL Firewall policy enforcement option.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enforcementScope")
    private final EnforcementScope enforcementScope;

    /**
     * Specifies the SQL Firewall policy enforcement option.
     * @return the value
     **/
    public EnforcementScope getEnforcementScope() {
        return enforcementScope;
    }

    /**
     * Specifies the SQL Firewall action based on detection of SQL Firewall violations.
     **/
    public enum ViolationAction {
        Block("BLOCK"),
        Observe("OBSERVE"),
        ;

        private final String value;
        private static java.util.Map<String, ViolationAction> map;

        static {
            map = new java.util.HashMap<>();
            for (ViolationAction v : ViolationAction.values()) {
                map.put(v.getValue(), v);
            }
        }

        ViolationAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ViolationAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ViolationAction: " + key);
        }
    };
    /**
     * Specifies the SQL Firewall action based on detection of SQL Firewall violations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("violationAction")
    private final ViolationAction violationAction;

    /**
     * Specifies the SQL Firewall action based on detection of SQL Firewall violations.
     * @return the value
     **/
    public ViolationAction getViolationAction() {
        return violationAction;
    }

    /**
     * Specifies whether a unified audit policy should be enabled for auditing the SQL Firewall policy violations.
     **/
    public enum ViolationAudit {
        Enabled("ENABLED"),
        Disabled("DISABLED"),
        ;

        private final String value;
        private static java.util.Map<String, ViolationAudit> map;

        static {
            map = new java.util.HashMap<>();
            for (ViolationAudit v : ViolationAudit.values()) {
                map.put(v.getValue(), v);
            }
        }

        ViolationAudit(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ViolationAudit create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid ViolationAudit: " + key);
        }
    };
    /**
     * Specifies whether a unified audit policy should be enabled for auditing the SQL Firewall policy violations.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("violationAudit")
    private final ViolationAudit violationAudit;

    /**
     * Specifies whether a unified audit policy should be enabled for auditing the SQL Firewall policy violations.
     * @return the value
     **/
    public ViolationAudit getViolationAudit() {
        return violationAudit;
    }

    /**
     * List of allowed ip addresses for the SQL Firewall policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedClientIps")
    private final java.util.List<String> allowedClientIps;

    /**
     * List of allowed ip addresses for the SQL Firewall policy.
     * @return the value
     **/
    public java.util.List<String> getAllowedClientIps() {
        return allowedClientIps;
    }

    /**
     * List of allowed operating system user names for the SQL Firewall policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedClientOsUsernames")
    private final java.util.List<String> allowedClientOsUsernames;

    /**
     * List of allowed operating system user names for the SQL Firewall policy.
     * @return the value
     **/
    public java.util.List<String> getAllowedClientOsUsernames() {
        return allowedClientOsUsernames;
    }

    /**
     * List of allowed client programs for the SQL Firewall policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowedClientPrograms")
    private final java.util.List<String> allowedClientPrograms;

    /**
     * List of allowed client programs for the SQL Firewall policy.
     * @return the value
     **/
    public java.util.List<String> getAllowedClientPrograms() {
        return allowedClientPrograms;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)
     * <p>
     * Example: {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
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
        sb.append("UpdateSqlFirewallPolicyDetails(");
        sb.append("super=").append(super.toString());
        sb.append("displayName=").append(String.valueOf(this.displayName));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", enforcementScope=").append(String.valueOf(this.enforcementScope));
        sb.append(", violationAction=").append(String.valueOf(this.violationAction));
        sb.append(", violationAudit=").append(String.valueOf(this.violationAudit));
        sb.append(", allowedClientIps=").append(String.valueOf(this.allowedClientIps));
        sb.append(", allowedClientOsUsernames=")
                .append(String.valueOf(this.allowedClientOsUsernames));
        sb.append(", allowedClientPrograms=").append(String.valueOf(this.allowedClientPrograms));
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
        if (!(o instanceof UpdateSqlFirewallPolicyDetails)) {
            return false;
        }

        UpdateSqlFirewallPolicyDetails other = (UpdateSqlFirewallPolicyDetails) o;
        return java.util.Objects.equals(this.displayName, other.displayName)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.enforcementScope, other.enforcementScope)
                && java.util.Objects.equals(this.violationAction, other.violationAction)
                && java.util.Objects.equals(this.violationAudit, other.violationAudit)
                && java.util.Objects.equals(this.allowedClientIps, other.allowedClientIps)
                && java.util.Objects.equals(
                        this.allowedClientOsUsernames, other.allowedClientOsUsernames)
                && java.util.Objects.equals(this.allowedClientPrograms, other.allowedClientPrograms)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.displayName == null ? 43 : this.displayName.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result =
                (result * PRIME)
                        + (this.enforcementScope == null ? 43 : this.enforcementScope.hashCode());
        result =
                (result * PRIME)
                        + (this.violationAction == null ? 43 : this.violationAction.hashCode());
        result =
                (result * PRIME)
                        + (this.violationAudit == null ? 43 : this.violationAudit.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedClientIps == null ? 43 : this.allowedClientIps.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedClientOsUsernames == null
                                ? 43
                                : this.allowedClientOsUsernames.hashCode());
        result =
                (result * PRIME)
                        + (this.allowedClientPrograms == null
                                ? 43
                                : this.allowedClientPrograms.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
