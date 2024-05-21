/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Application on which the account is based
 * <p>
 **SCIM++ Properties:**
 *  - idcsSearchable: true
 *  - multiValued: false
 *  - mutability: immutable
 *  - required: true
 *  - returned: default
 *  - type: complex
 *  - uniqueness: none
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
    builder = AccountMgmtInfoApp.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class AccountMgmtInfoApp extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "value",
        "ref",
        "display",
        "description",
        "isLoginTarget",
        "showInMyApps",
        "active",
        "loginMechanism",
        "appIcon",
        "appThumbnail",
        "isUnmanagedApp",
        "isManagedApp",
        "isAliasApp",
        "isOPCService",
        "serviceTypeURN",
        "isAuthoritative",
        "meterAsOPCService",
        "isOAuthResource",
        "audience"
    })
    public AccountMgmtInfoApp(
            String value,
            String ref,
            String display,
            String description,
            Boolean isLoginTarget,
            Boolean showInMyApps,
            Boolean active,
            String loginMechanism,
            String appIcon,
            String appThumbnail,
            Boolean isUnmanagedApp,
            Boolean isManagedApp,
            Boolean isAliasApp,
            Boolean isOPCService,
            String serviceTypeURN,
            Boolean isAuthoritative,
            Boolean meterAsOPCService,
            Boolean isOAuthResource,
            String audience) {
        super();
        this.value = value;
        this.ref = ref;
        this.display = display;
        this.description = description;
        this.isLoginTarget = isLoginTarget;
        this.showInMyApps = showInMyApps;
        this.active = active;
        this.loginMechanism = loginMechanism;
        this.appIcon = appIcon;
        this.appThumbnail = appThumbnail;
        this.isUnmanagedApp = isUnmanagedApp;
        this.isManagedApp = isManagedApp;
        this.isAliasApp = isAliasApp;
        this.isOPCService = isOPCService;
        this.serviceTypeURN = serviceTypeURN;
        this.isAuthoritative = isAuthoritative;
        this.meterAsOPCService = meterAsOPCService;
        this.isOAuthResource = isOAuthResource;
        this.audience = audience;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Application identifier
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: true
         *  - returned: always
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Application identifier
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: true
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: immutable
         *  - required: true
         *  - returned: always
         *  - type: string
         *  - uniqueness: none
         * @param value the value to set
         * @return this builder
         **/
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * Application URI
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: reference
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("$ref")
        private String ref;

        /**
         * Application URI
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: default
         *  - type: reference
         *  - uniqueness: none
         * @param ref the value to set
         * @return this builder
         **/
        public Builder ref(String ref) {
            this.ref = ref;
            this.__explicitlySet__.add("ref");
            return this;
        }
        /**
         * Application display name
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("display")
        private String display;

        /**
         * Application display name
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         * @param display the value to set
         * @return this builder
         **/
        public Builder display(String display) {
            this.display = display;
            this.__explicitlySet__.add("display");
            return this;
        }
        /**
         * Application description
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Application description
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         * @param description the value to set
         * @return this builder
         **/
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * If true, this App allows runtime services to log end users in to this App automatically
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isLoginTarget")
        private Boolean isLoginTarget;

        /**
         * If true, this App allows runtime services to log end users in to this App automatically
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         * @param isLoginTarget the value to set
         * @return this builder
         **/
        public Builder isLoginTarget(Boolean isLoginTarget) {
            this.isLoginTarget = isLoginTarget;
            this.__explicitlySet__.add("isLoginTarget");
            return this;
        }
        /**
         * If true, this App will be displayed in the MyApps page of each end-user who has access to the App.
         * <p>
         **Added In:** 18.1.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("showInMyApps")
        private Boolean showInMyApps;

        /**
         * If true, this App will be displayed in the MyApps page of each end-user who has access to the App.
         * <p>
         **Added In:** 18.1.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         * @param showInMyApps the value to set
         * @return this builder
         **/
        public Builder showInMyApps(Boolean showInMyApps) {
            this.showInMyApps = showInMyApps;
            this.__explicitlySet__.add("showInMyApps");
            return this;
        }
        /**
         * If true, this App is able to participate in runtime services, such as automatic-login, OAuth, and SAML. If false, all runtime services are disabled for this App and only administrative operations can be performed.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("active")
        private Boolean active;

        /**
         * If true, this App is able to participate in runtime services, such as automatic-login, OAuth, and SAML. If false, all runtime services are disabled for this App and only administrative operations can be performed.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         * @param active the value to set
         * @return this builder
         **/
        public Builder active(Boolean active) {
            this.active = active;
            this.__explicitlySet__.add("active");
            return this;
        }
        /**
         * The protocol that runtime services will use to log end users in to this App automatically. If 'OIDC', then runtime services use the OpenID Connect protocol. If 'SAML', then runtime services use the Security Assertion Markup Language protocol.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("loginMechanism")
        private String loginMechanism;

        /**
         * The protocol that runtime services will use to log end users in to this App automatically. If 'OIDC', then runtime services use the OpenID Connect protocol. If 'SAML', then runtime services use the Security Assertion Markup Language protocol.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         * @param loginMechanism the value to set
         * @return this builder
         **/
        public Builder loginMechanism(String loginMechanism) {
            this.loginMechanism = loginMechanism;
            this.__explicitlySet__.add("loginMechanism");
            return this;
        }
        /**
         * Application icon.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("appIcon")
        private String appIcon;

        /**
         * Application icon.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         * @param appIcon the value to set
         * @return this builder
         **/
        public Builder appIcon(String appIcon) {
            this.appIcon = appIcon;
            this.__explicitlySet__.add("appIcon");
            return this;
        }
        /**
         * Application thumbnail.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("appThumbnail")
        private String appThumbnail;

        /**
         * Application thumbnail.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         * @param appThumbnail the value to set
         * @return this builder
         **/
        public Builder appThumbnail(String appThumbnail) {
            this.appThumbnail = appThumbnail;
            this.__explicitlySet__.add("appThumbnail");
            return this;
        }
        /**
         * If true, indicates that this application accepts an Oracle Identity Cloud Service user as a login-identity (does not require an account) and relies on authorization of the user's memberships in AppRoles
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isUnmanagedApp")
        private Boolean isUnmanagedApp;

        /**
         * If true, indicates that this application accepts an Oracle Identity Cloud Service user as a login-identity (does not require an account) and relies on authorization of the user's memberships in AppRoles
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         * @param isUnmanagedApp the value to set
         * @return this builder
         **/
        public Builder isUnmanagedApp(Boolean isUnmanagedApp) {
            this.isUnmanagedApp = isUnmanagedApp;
            this.__explicitlySet__.add("isUnmanagedApp");
            return this;
        }
        /**
         * If true, indicates that access to this App requires an account. That is, in order to log in to the App, a User must use an application-specific identity that is maintained in the remote identity-repository of that App.
         * <p>
         **Added In:** 17.4.6
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isManagedApp")
        private Boolean isManagedApp;

        /**
         * If true, indicates that access to this App requires an account. That is, in order to log in to the App, a User must use an application-specific identity that is maintained in the remote identity-repository of that App.
         * <p>
         **Added In:** 17.4.6
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         * @param isManagedApp the value to set
         * @return this builder
         **/
        public Builder isManagedApp(Boolean isManagedApp) {
            this.isManagedApp = isManagedApp;
            this.__explicitlySet__.add("isManagedApp");
            return this;
        }
        /**
         * If true, this App is an AliasApp and it cannot be granted to an end user directly
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAliasApp")
        private Boolean isAliasApp;

        /**
         * If true, this App is an AliasApp and it cannot be granted to an end user directly
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         * @param isAliasApp the value to set
         * @return this builder
         **/
        public Builder isAliasApp(Boolean isAliasApp) {
            this.isAliasApp = isAliasApp;
            this.__explicitlySet__.add("isAliasApp");
            return this;
        }
        /**
         * If true, this application is an Oracle Public Cloud service-instance.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isOPCService")
        private Boolean isOPCService;

        /**
         * If true, this application is an Oracle Public Cloud service-instance.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         * @param isOPCService the value to set
         * @return this builder
         **/
        public Builder isOPCService(Boolean isOPCService) {
            this.isOPCService = isOPCService;
            this.__explicitlySet__.add("isOPCService");
            return this;
        }
        /**
         * This Uniform Resource Name (URN) value identifies the type of Oracle Public Cloud service of which this app is an instance.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("serviceTypeURN")
        private String serviceTypeURN;

        /**
         * This Uniform Resource Name (URN) value identifies the type of Oracle Public Cloud service of which this app is an instance.
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         * @param serviceTypeURN the value to set
         * @return this builder
         **/
        public Builder serviceTypeURN(String serviceTypeURN) {
            this.serviceTypeURN = serviceTypeURN;
            this.__explicitlySet__.add("serviceTypeURN");
            return this;
        }
        /**
         * If true, sync from the managed app will be performed as authoritative sync.
         * <p>
         **Added In:** 17.4.6
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isAuthoritative")
        private Boolean isAuthoritative;

        /**
         * If true, sync from the managed app will be performed as authoritative sync.
         * <p>
         **Added In:** 17.4.6
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         * @param isAuthoritative the value to set
         * @return this builder
         **/
        public Builder isAuthoritative(Boolean isAuthoritative) {
            this.isAuthoritative = isAuthoritative;
            this.__explicitlySet__.add("isAuthoritative");
            return this;
        }
        /**
         * If true, customer is not billed for runtime operations of the app.
         * <p>
         **Added In:** 18.4.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("meterAsOPCService")
        private Boolean meterAsOPCService;

        /**
         * If true, customer is not billed for runtime operations of the app.
         * <p>
         **Added In:** 18.4.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         * @param meterAsOPCService the value to set
         * @return this builder
         **/
        public Builder meterAsOPCService(Boolean meterAsOPCService) {
            this.meterAsOPCService = meterAsOPCService;
            this.__explicitlySet__.add("meterAsOPCService");
            return this;
        }
        /**
         * If true, indicates that this application acts as an OAuth Resource.
         * <p>
         **Added In:** 18.4.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("isOAuthResource")
        private Boolean isOAuthResource;

        /**
         * If true, indicates that this application acts as an OAuth Resource.
         * <p>
         **Added In:** 18.4.2
         * <p>
         **SCIM++ Properties:**
         *  - idcsSearchable: true
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: boolean
         *  - uniqueness: none
         * @param isOAuthResource the value to set
         * @return this builder
         **/
        public Builder isOAuthResource(Boolean isOAuthResource) {
            this.isOAuthResource = isOAuthResource;
            this.__explicitlySet__.add("isOAuthResource");
            return this;
        }
        /**
         * The base URI for all of the scopes defined in this App. The value of 'audience' is combined with the 'value' of each scope to form an 'fqs' or fully qualified scope.
         * <p>
         **Added In:** 18.4.2
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("audience")
        private String audience;

        /**
         * The base URI for all of the scopes defined in this App. The value of 'audience' is combined with the 'value' of each scope to form an 'fqs' or fully qualified scope.
         * <p>
         **Added In:** 18.4.2
         * <p>
         **SCIM++ Properties:**
         *  - caseExact: false
         *  - idcsSearchable: false
         *  - multiValued: false
         *  - mutability: readOnly
         *  - required: false
         *  - returned: request
         *  - type: string
         *  - uniqueness: none
         * @param audience the value to set
         * @return this builder
         **/
        public Builder audience(String audience) {
            this.audience = audience;
            this.__explicitlySet__.add("audience");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AccountMgmtInfoApp build() {
            AccountMgmtInfoApp model =
                    new AccountMgmtInfoApp(
                            this.value,
                            this.ref,
                            this.display,
                            this.description,
                            this.isLoginTarget,
                            this.showInMyApps,
                            this.active,
                            this.loginMechanism,
                            this.appIcon,
                            this.appThumbnail,
                            this.isUnmanagedApp,
                            this.isManagedApp,
                            this.isAliasApp,
                            this.isOPCService,
                            this.serviceTypeURN,
                            this.isAuthoritative,
                            this.meterAsOPCService,
                            this.isOAuthResource,
                            this.audience);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AccountMgmtInfoApp model) {
            if (model.wasPropertyExplicitlySet("value")) {
                this.value(model.getValue());
            }
            if (model.wasPropertyExplicitlySet("ref")) {
                this.ref(model.getRef());
            }
            if (model.wasPropertyExplicitlySet("display")) {
                this.display(model.getDisplay());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isLoginTarget")) {
                this.isLoginTarget(model.getIsLoginTarget());
            }
            if (model.wasPropertyExplicitlySet("showInMyApps")) {
                this.showInMyApps(model.getShowInMyApps());
            }
            if (model.wasPropertyExplicitlySet("active")) {
                this.active(model.getActive());
            }
            if (model.wasPropertyExplicitlySet("loginMechanism")) {
                this.loginMechanism(model.getLoginMechanism());
            }
            if (model.wasPropertyExplicitlySet("appIcon")) {
                this.appIcon(model.getAppIcon());
            }
            if (model.wasPropertyExplicitlySet("appThumbnail")) {
                this.appThumbnail(model.getAppThumbnail());
            }
            if (model.wasPropertyExplicitlySet("isUnmanagedApp")) {
                this.isUnmanagedApp(model.getIsUnmanagedApp());
            }
            if (model.wasPropertyExplicitlySet("isManagedApp")) {
                this.isManagedApp(model.getIsManagedApp());
            }
            if (model.wasPropertyExplicitlySet("isAliasApp")) {
                this.isAliasApp(model.getIsAliasApp());
            }
            if (model.wasPropertyExplicitlySet("isOPCService")) {
                this.isOPCService(model.getIsOPCService());
            }
            if (model.wasPropertyExplicitlySet("serviceTypeURN")) {
                this.serviceTypeURN(model.getServiceTypeURN());
            }
            if (model.wasPropertyExplicitlySet("isAuthoritative")) {
                this.isAuthoritative(model.getIsAuthoritative());
            }
            if (model.wasPropertyExplicitlySet("meterAsOPCService")) {
                this.meterAsOPCService(model.getMeterAsOPCService());
            }
            if (model.wasPropertyExplicitlySet("isOAuthResource")) {
                this.isOAuthResource(model.getIsOAuthResource());
            }
            if (model.wasPropertyExplicitlySet("audience")) {
                this.audience(model.getAudience());
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
     * Application identifier
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: true
     *  - returned: always
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Application identifier
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: true
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: immutable
     *  - required: true
     *  - returned: always
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getValue() {
        return value;
    }

    /**
     * Application URI
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: reference
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("$ref")
    private final String ref;

    /**
     * Application URI
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: default
     *  - type: reference
     *  - uniqueness: none
     * @return the value
     **/
    public String getRef() {
        return ref;
    }

    /**
     * Application display name
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("display")
    private final String display;

    /**
     * Application display name
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getDisplay() {
        return display;
    }

    /**
     * Application description
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Application description
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getDescription() {
        return description;
    }

    /**
     * If true, this App allows runtime services to log end users in to this App automatically
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isLoginTarget")
    private final Boolean isLoginTarget;

    /**
     * If true, this App allows runtime services to log end users in to this App automatically
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getIsLoginTarget() {
        return isLoginTarget;
    }

    /**
     * If true, this App will be displayed in the MyApps page of each end-user who has access to the App.
     * <p>
     **Added In:** 18.1.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("showInMyApps")
    private final Boolean showInMyApps;

    /**
     * If true, this App will be displayed in the MyApps page of each end-user who has access to the App.
     * <p>
     **Added In:** 18.1.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getShowInMyApps() {
        return showInMyApps;
    }

    /**
     * If true, this App is able to participate in runtime services, such as automatic-login, OAuth, and SAML. If false, all runtime services are disabled for this App and only administrative operations can be performed.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    private final Boolean active;

    /**
     * If true, this App is able to participate in runtime services, such as automatic-login, OAuth, and SAML. If false, all runtime services are disabled for this App and only administrative operations can be performed.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getActive() {
        return active;
    }

    /**
     * The protocol that runtime services will use to log end users in to this App automatically. If 'OIDC', then runtime services use the OpenID Connect protocol. If 'SAML', then runtime services use the Security Assertion Markup Language protocol.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("loginMechanism")
    private final String loginMechanism;

    /**
     * The protocol that runtime services will use to log end users in to this App automatically. If 'OIDC', then runtime services use the OpenID Connect protocol. If 'SAML', then runtime services use the Security Assertion Markup Language protocol.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getLoginMechanism() {
        return loginMechanism;
    }

    /**
     * Application icon.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("appIcon")
    private final String appIcon;

    /**
     * Application icon.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getAppIcon() {
        return appIcon;
    }

    /**
     * Application thumbnail.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("appThumbnail")
    private final String appThumbnail;

    /**
     * Application thumbnail.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getAppThumbnail() {
        return appThumbnail;
    }

    /**
     * If true, indicates that this application accepts an Oracle Identity Cloud Service user as a login-identity (does not require an account) and relies on authorization of the user's memberships in AppRoles
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isUnmanagedApp")
    private final Boolean isUnmanagedApp;

    /**
     * If true, indicates that this application accepts an Oracle Identity Cloud Service user as a login-identity (does not require an account) and relies on authorization of the user's memberships in AppRoles
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getIsUnmanagedApp() {
        return isUnmanagedApp;
    }

    /**
     * If true, indicates that access to this App requires an account. That is, in order to log in to the App, a User must use an application-specific identity that is maintained in the remote identity-repository of that App.
     * <p>
     **Added In:** 17.4.6
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isManagedApp")
    private final Boolean isManagedApp;

    /**
     * If true, indicates that access to this App requires an account. That is, in order to log in to the App, a User must use an application-specific identity that is maintained in the remote identity-repository of that App.
     * <p>
     **Added In:** 17.4.6
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getIsManagedApp() {
        return isManagedApp;
    }

    /**
     * If true, this App is an AliasApp and it cannot be granted to an end user directly
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAliasApp")
    private final Boolean isAliasApp;

    /**
     * If true, this App is an AliasApp and it cannot be granted to an end user directly
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getIsAliasApp() {
        return isAliasApp;
    }

    /**
     * If true, this application is an Oracle Public Cloud service-instance.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOPCService")
    private final Boolean isOPCService;

    /**
     * If true, this application is an Oracle Public Cloud service-instance.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getIsOPCService() {
        return isOPCService;
    }

    /**
     * This Uniform Resource Name (URN) value identifies the type of Oracle Public Cloud service of which this app is an instance.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("serviceTypeURN")
    private final String serviceTypeURN;

    /**
     * This Uniform Resource Name (URN) value identifies the type of Oracle Public Cloud service of which this app is an instance.
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getServiceTypeURN() {
        return serviceTypeURN;
    }

    /**
     * If true, sync from the managed app will be performed as authoritative sync.
     * <p>
     **Added In:** 17.4.6
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isAuthoritative")
    private final Boolean isAuthoritative;

    /**
     * If true, sync from the managed app will be performed as authoritative sync.
     * <p>
     **Added In:** 17.4.6
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getIsAuthoritative() {
        return isAuthoritative;
    }

    /**
     * If true, customer is not billed for runtime operations of the app.
     * <p>
     **Added In:** 18.4.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("meterAsOPCService")
    private final Boolean meterAsOPCService;

    /**
     * If true, customer is not billed for runtime operations of the app.
     * <p>
     **Added In:** 18.4.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getMeterAsOPCService() {
        return meterAsOPCService;
    }

    /**
     * If true, indicates that this application acts as an OAuth Resource.
     * <p>
     **Added In:** 18.4.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isOAuthResource")
    private final Boolean isOAuthResource;

    /**
     * If true, indicates that this application acts as an OAuth Resource.
     * <p>
     **Added In:** 18.4.2
     * <p>
     **SCIM++ Properties:**
     *  - idcsSearchable: true
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: boolean
     *  - uniqueness: none
     * @return the value
     **/
    public Boolean getIsOAuthResource() {
        return isOAuthResource;
    }

    /**
     * The base URI for all of the scopes defined in this App. The value of 'audience' is combined with the 'value' of each scope to form an 'fqs' or fully qualified scope.
     * <p>
     **Added In:** 18.4.2
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("audience")
    private final String audience;

    /**
     * The base URI for all of the scopes defined in this App. The value of 'audience' is combined with the 'value' of each scope to form an 'fqs' or fully qualified scope.
     * <p>
     **Added In:** 18.4.2
     * <p>
     **SCIM++ Properties:**
     *  - caseExact: false
     *  - idcsSearchable: false
     *  - multiValued: false
     *  - mutability: readOnly
     *  - required: false
     *  - returned: request
     *  - type: string
     *  - uniqueness: none
     * @return the value
     **/
    public String getAudience() {
        return audience;
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
        sb.append("AccountMgmtInfoApp(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", ref=").append(String.valueOf(this.ref));
        sb.append(", display=").append(String.valueOf(this.display));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isLoginTarget=").append(String.valueOf(this.isLoginTarget));
        sb.append(", showInMyApps=").append(String.valueOf(this.showInMyApps));
        sb.append(", active=").append(String.valueOf(this.active));
        sb.append(", loginMechanism=").append(String.valueOf(this.loginMechanism));
        sb.append(", appIcon=").append(String.valueOf(this.appIcon));
        sb.append(", appThumbnail=").append(String.valueOf(this.appThumbnail));
        sb.append(", isUnmanagedApp=").append(String.valueOf(this.isUnmanagedApp));
        sb.append(", isManagedApp=").append(String.valueOf(this.isManagedApp));
        sb.append(", isAliasApp=").append(String.valueOf(this.isAliasApp));
        sb.append(", isOPCService=").append(String.valueOf(this.isOPCService));
        sb.append(", serviceTypeURN=").append(String.valueOf(this.serviceTypeURN));
        sb.append(", isAuthoritative=").append(String.valueOf(this.isAuthoritative));
        sb.append(", meterAsOPCService=").append(String.valueOf(this.meterAsOPCService));
        sb.append(", isOAuthResource=").append(String.valueOf(this.isOAuthResource));
        sb.append(", audience=").append(String.valueOf(this.audience));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccountMgmtInfoApp)) {
            return false;
        }

        AccountMgmtInfoApp other = (AccountMgmtInfoApp) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.ref, other.ref)
                && java.util.Objects.equals(this.display, other.display)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isLoginTarget, other.isLoginTarget)
                && java.util.Objects.equals(this.showInMyApps, other.showInMyApps)
                && java.util.Objects.equals(this.active, other.active)
                && java.util.Objects.equals(this.loginMechanism, other.loginMechanism)
                && java.util.Objects.equals(this.appIcon, other.appIcon)
                && java.util.Objects.equals(this.appThumbnail, other.appThumbnail)
                && java.util.Objects.equals(this.isUnmanagedApp, other.isUnmanagedApp)
                && java.util.Objects.equals(this.isManagedApp, other.isManagedApp)
                && java.util.Objects.equals(this.isAliasApp, other.isAliasApp)
                && java.util.Objects.equals(this.isOPCService, other.isOPCService)
                && java.util.Objects.equals(this.serviceTypeURN, other.serviceTypeURN)
                && java.util.Objects.equals(this.isAuthoritative, other.isAuthoritative)
                && java.util.Objects.equals(this.meterAsOPCService, other.meterAsOPCService)
                && java.util.Objects.equals(this.isOAuthResource, other.isOAuthResource)
                && java.util.Objects.equals(this.audience, other.audience)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.value == null ? 43 : this.value.hashCode());
        result = (result * PRIME) + (this.ref == null ? 43 : this.ref.hashCode());
        result = (result * PRIME) + (this.display == null ? 43 : this.display.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.isLoginTarget == null ? 43 : this.isLoginTarget.hashCode());
        result = (result * PRIME) + (this.showInMyApps == null ? 43 : this.showInMyApps.hashCode());
        result = (result * PRIME) + (this.active == null ? 43 : this.active.hashCode());
        result =
                (result * PRIME)
                        + (this.loginMechanism == null ? 43 : this.loginMechanism.hashCode());
        result = (result * PRIME) + (this.appIcon == null ? 43 : this.appIcon.hashCode());
        result = (result * PRIME) + (this.appThumbnail == null ? 43 : this.appThumbnail.hashCode());
        result =
                (result * PRIME)
                        + (this.isUnmanagedApp == null ? 43 : this.isUnmanagedApp.hashCode());
        result = (result * PRIME) + (this.isManagedApp == null ? 43 : this.isManagedApp.hashCode());
        result = (result * PRIME) + (this.isAliasApp == null ? 43 : this.isAliasApp.hashCode());
        result = (result * PRIME) + (this.isOPCService == null ? 43 : this.isOPCService.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceTypeURN == null ? 43 : this.serviceTypeURN.hashCode());
        result =
                (result * PRIME)
                        + (this.isAuthoritative == null ? 43 : this.isAuthoritative.hashCode());
        result =
                (result * PRIME)
                        + (this.meterAsOPCService == null ? 43 : this.meterAsOPCService.hashCode());
        result =
                (result * PRIME)
                        + (this.isOAuthResource == null ? 43 : this.isOAuthResource.hashCode());
        result = (result * PRIME) + (this.audience == null ? 43 : this.audience.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
