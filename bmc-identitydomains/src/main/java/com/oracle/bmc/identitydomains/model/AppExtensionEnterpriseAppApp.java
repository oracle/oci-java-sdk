/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * This extension defines the Enterprise App related attributes.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = AppExtensionEnterpriseAppApp.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AppExtensionEnterpriseAppApp
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "appResources",
        "denyAuthzPolicy",
        "allowAuthzPolicy",
        "allowAuthzDecisionTTL",
        "denyAuthzDecisionTTL"
    })
    public AppExtensionEnterpriseAppApp(
            java.util.List<AppAppResources> appResources,
            AppDenyAuthzPolicy denyAuthzPolicy,
            AppAllowAuthzPolicy allowAuthzPolicy,
            Integer allowAuthzDecisionTTL,
            Integer denyAuthzDecisionTTL) {
        super();
        this.appResources = appResources;
        this.denyAuthzPolicy = denyAuthzPolicy;
        this.allowAuthzPolicy = allowAuthzPolicy;
        this.allowAuthzDecisionTTL = allowAuthzDecisionTTL;
        this.denyAuthzDecisionTTL = denyAuthzDecisionTTL;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A list of AppResources of this App.
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsCompositeKey: [value]
         *  - idcsSearchable: true
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("appResources")
        private java.util.List<AppAppResources> appResources;

        /**
         * A list of AppResources of this App.
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsCompositeKey: [value]
         *  - idcsSearchable: true
         *  - multiValued: true
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: complex
         * @param appResources the value to set
         * @return this builder
         **/
        public Builder appResources(java.util.List<AppAppResources> appResources) {
            this.appResources = appResources;
            this.__explicitlySet__.add("appResources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("denyAuthzPolicy")
        private AppDenyAuthzPolicy denyAuthzPolicy;

        public Builder denyAuthzPolicy(AppDenyAuthzPolicy denyAuthzPolicy) {
            this.denyAuthzPolicy = denyAuthzPolicy;
            this.__explicitlySet__.add("denyAuthzPolicy");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("allowAuthzPolicy")
        private AppAllowAuthzPolicy allowAuthzPolicy;

        public Builder allowAuthzPolicy(AppAllowAuthzPolicy allowAuthzPolicy) {
            this.allowAuthzPolicy = allowAuthzPolicy;
            this.__explicitlySet__.add("allowAuthzPolicy");
            return this;
        }
        /**
         * Allow Authz policy decision expiry time in seconds.
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - idcsMaxValue: 3600
         *  - idcsMinValue: 0
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("allowAuthzDecisionTTL")
        private Integer allowAuthzDecisionTTL;

        /**
         * Allow Authz policy decision expiry time in seconds.
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - idcsMaxValue: 3600
         *  - idcsMinValue: 0
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         * @param allowAuthzDecisionTTL the value to set
         * @return this builder
         **/
        public Builder allowAuthzDecisionTTL(Integer allowAuthzDecisionTTL) {
            this.allowAuthzDecisionTTL = allowAuthzDecisionTTL;
            this.__explicitlySet__.add("allowAuthzDecisionTTL");
            return this;
        }
        /**
         * Deny Authz policy decision expiry time in seconds.
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - idcsMaxValue: 3600
         *  - idcsMinValue: 0
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("denyAuthzDecisionTTL")
        private Integer denyAuthzDecisionTTL;

        /**
         * Deny Authz policy decision expiry time in seconds.
         * <p>
         **Added In:** 19.2.1
         * <p>
         **SCIM++ Properties:**
         *  - idcsMaxValue: 3600
         *  - idcsMinValue: 0
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readWrite
         *  - required: false
         *  - returned: default
         *  - type: integer
         *  - uniqueness: none
         * @param denyAuthzDecisionTTL the value to set
         * @return this builder
         **/
        public Builder denyAuthzDecisionTTL(Integer denyAuthzDecisionTTL) {
            this.denyAuthzDecisionTTL = denyAuthzDecisionTTL;
            this.__explicitlySet__.add("denyAuthzDecisionTTL");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppExtensionEnterpriseAppApp build() {
            AppExtensionEnterpriseAppApp model =
                    new AppExtensionEnterpriseAppApp(
                            this.appResources,
                            this.denyAuthzPolicy,
                            this.allowAuthzPolicy,
                            this.allowAuthzDecisionTTL,
                            this.denyAuthzDecisionTTL);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppExtensionEnterpriseAppApp model) {
            if (model.wasPropertyExplicitlySet("appResources")) {
                this.appResources(model.getAppResources());
            }
            if (model.wasPropertyExplicitlySet("denyAuthzPolicy")) {
                this.denyAuthzPolicy(model.getDenyAuthzPolicy());
            }
            if (model.wasPropertyExplicitlySet("allowAuthzPolicy")) {
                this.allowAuthzPolicy(model.getAllowAuthzPolicy());
            }
            if (model.wasPropertyExplicitlySet("allowAuthzDecisionTTL")) {
                this.allowAuthzDecisionTTL(model.getAllowAuthzDecisionTTL());
            }
            if (model.wasPropertyExplicitlySet("denyAuthzDecisionTTL")) {
                this.denyAuthzDecisionTTL(model.getDenyAuthzDecisionTTL());
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
     * A list of AppResources of this App.
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsCompositeKey: [value]
     *  - idcsSearchable: true
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("appResources")
    private final java.util.List<AppAppResources> appResources;

    /**
     * A list of AppResources of this App.
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsCompositeKey: [value]
     *  - idcsSearchable: true
     *  - multiValued: true
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: complex
     * @return the value
     **/
    public java.util.List<AppAppResources> getAppResources() {
        return appResources;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("denyAuthzPolicy")
    private final AppDenyAuthzPolicy denyAuthzPolicy;

    public AppDenyAuthzPolicy getDenyAuthzPolicy() {
        return denyAuthzPolicy;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("allowAuthzPolicy")
    private final AppAllowAuthzPolicy allowAuthzPolicy;

    public AppAllowAuthzPolicy getAllowAuthzPolicy() {
        return allowAuthzPolicy;
    }

    /**
     * Allow Authz policy decision expiry time in seconds.
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - idcsMaxValue: 3600
     *  - idcsMinValue: 0
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("allowAuthzDecisionTTL")
    private final Integer allowAuthzDecisionTTL;

    /**
     * Allow Authz policy decision expiry time in seconds.
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - idcsMaxValue: 3600
     *  - idcsMinValue: 0
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     * @return the value
     **/
    public Integer getAllowAuthzDecisionTTL() {
        return allowAuthzDecisionTTL;
    }

    /**
     * Deny Authz policy decision expiry time in seconds.
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - idcsMaxValue: 3600
     *  - idcsMinValue: 0
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("denyAuthzDecisionTTL")
    private final Integer denyAuthzDecisionTTL;

    /**
     * Deny Authz policy decision expiry time in seconds.
     * <p>
     **Added In:** 19.2.1
     * <p>
     **SCIM++ Properties:**
     *  - idcsMaxValue: 3600
     *  - idcsMinValue: 0
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readWrite
     *  - required: false
     *  - returned: default
     *  - type: integer
     *  - uniqueness: none
     * @return the value
     **/
    public Integer getDenyAuthzDecisionTTL() {
        return denyAuthzDecisionTTL;
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
        sb.append("AppExtensionEnterpriseAppApp(");
        sb.append("super=").append(super.toString());
        sb.append("appResources=").append(String.valueOf(this.appResources));
        sb.append(", denyAuthzPolicy=").append(String.valueOf(this.denyAuthzPolicy));
        sb.append(", allowAuthzPolicy=").append(String.valueOf(this.allowAuthzPolicy));
        sb.append(", allowAuthzDecisionTTL=").append(String.valueOf(this.allowAuthzDecisionTTL));
        sb.append(", denyAuthzDecisionTTL=").append(String.valueOf(this.denyAuthzDecisionTTL));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppExtensionEnterpriseAppApp)) {
            return false;
        }

        AppExtensionEnterpriseAppApp other = (AppExtensionEnterpriseAppApp) o;
        return java.util.Objects.equals(this.appResources, other.appResources)
                && java.util.Objects.equals(this.denyAuthzPolicy, other.denyAuthzPolicy)
                && java.util.Objects.equals(this.allowAuthzPolicy, other.allowAuthzPolicy)
                && java.util.Objects.equals(this.allowAuthzDecisionTTL, other.allowAuthzDecisionTTL)
                && java.util.Objects.equals(this.denyAuthzDecisionTTL, other.denyAuthzDecisionTTL)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.appResources == null ? 43 : this.appResources.hashCode());
        result =
                (result * PRIME)
                        + (this.denyAuthzPolicy == null ? 43 : this.denyAuthzPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.allowAuthzPolicy == null ? 43 : this.allowAuthzPolicy.hashCode());
        result =
                (result * PRIME)
                        + (this.allowAuthzDecisionTTL == null
                                ? 43
                                : this.allowAuthzDecisionTTL.hashCode());
        result =
                (result * PRIME)
                        + (this.denyAuthzDecisionTTL == null
                                ? 43
                                : this.denyAuthzDecisionTTL.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
