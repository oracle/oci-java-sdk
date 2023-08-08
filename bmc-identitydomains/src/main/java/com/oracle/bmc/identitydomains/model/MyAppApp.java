/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Application on which the account is based
 *
 * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readOnly -
 * required: true - returned: default - type: complex - uniqueness: none <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: v1")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = MyAppApp.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class MyAppApp extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "value",
        "ref",
        "display",
        "description",
        "isLoginTarget",
        "showInMyApps",
        "isAliasApp",
        "active",
        "loginMechanism",
        "appIcon",
        "appThumbnail",
        "isOPCService",
        "serviceTypeURN"
    })
    public MyAppApp(
            String value,
            String ref,
            String display,
            String description,
            Boolean isLoginTarget,
            Boolean showInMyApps,
            Boolean isAliasApp,
            Boolean active,
            String loginMechanism,
            String appIcon,
            String appThumbnail,
            Boolean isOPCService,
            String serviceTypeURN) {
        super();
        this.value = value;
        this.ref = ref;
        this.display = display;
        this.description = description;
        this.isLoginTarget = isLoginTarget;
        this.showInMyApps = showInMyApps;
        this.isAliasApp = isAliasApp;
        this.active = active;
        this.loginMechanism = loginMechanism;
        this.appIcon = appIcon;
        this.appThumbnail = appThumbnail;
        this.isOPCService = isOPCService;
        this.serviceTypeURN = serviceTypeURN;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Application identifier
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: true - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private String value;

        /**
         * Application identifier
         *
         * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: true - returned: default - type: string - uniqueness:
         * none
         *
         * @param value the value to set
         * @return this builder
         */
        public Builder value(String value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }
        /**
         * Application URI
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: reference - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("$ref")
        private String ref;

        /**
         * Application URI
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: reference - uniqueness: none
         *
         * @param ref the value to set
         * @return this builder
         */
        public Builder ref(String ref) {
            this.ref = ref;
            this.__explicitlySet__.add("ref");
            return this;
        }
        /**
         * Application display name
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("display")
        private String display;

        /**
         * Application display name
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param display the value to set
         * @return this builder
         */
        public Builder display(String display) {
            this.display = display;
            this.__explicitlySet__.add("display");
            return this;
        }
        /**
         * Application description
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Application description
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * If true, this App allows runtime services to log end users into this App automatically.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isLoginTarget")
        private Boolean isLoginTarget;

        /**
         * If true, this App allows runtime services to log end users into this App automatically.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param isLoginTarget the value to set
         * @return this builder
         */
        public Builder isLoginTarget(Boolean isLoginTarget) {
            this.isLoginTarget = isLoginTarget;
            this.__explicitlySet__.add("isLoginTarget");
            return this;
        }
        /**
         * If true, this App will be displayed in the MyApps page of each end-user who has access to
         * this App.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("showInMyApps")
        private Boolean showInMyApps;

        /**
         * If true, this App will be displayed in the MyApps page of each end-user who has access to
         * this App.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param showInMyApps the value to set
         * @return this builder
         */
        public Builder showInMyApps(Boolean showInMyApps) {
            this.showInMyApps = showInMyApps;
            this.__explicitlySet__.add("showInMyApps");
            return this;
        }
        /**
         * If true, this App is an AliasApp and it cannot be granted to an end user directly
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * writeOnly - required: false - returned: never - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAliasApp")
        private Boolean isAliasApp;

        /**
         * If true, this App is an AliasApp and it cannot be granted to an end user directly
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * writeOnly - required: false - returned: never - type: boolean - uniqueness: none
         *
         * @param isAliasApp the value to set
         * @return this builder
         */
        public Builder isAliasApp(Boolean isAliasApp) {
            this.isAliasApp = isAliasApp;
            this.__explicitlySet__.add("isAliasApp");
            return this;
        }
        /**
         * If true, this App is able to participate in runtime services, such as automatic-login,
         * OAuth, and SAML. If false, all runtime services are disabled for this App, and only
         * administrative operations can be performed.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("active")
        private Boolean active;

        /**
         * If true, this App is able to participate in runtime services, such as automatic-login,
         * OAuth, and SAML. If false, all runtime services are disabled for this App, and only
         * administrative operations can be performed.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param active the value to set
         * @return this builder
         */
        public Builder active(Boolean active) {
            this.active = active;
            this.__explicitlySet__.add("active");
            return this;
        }
        /**
         * The protocol that runtime services will use to log end users in to this App
         * automatically. If 'OIDC', then runtime services use the OpenID Connect protocol. If
         * 'SAML', then runtime services use Security Assertion Markup Language protocol.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("loginMechanism")
        private String loginMechanism;

        /**
         * The protocol that runtime services will use to log end users in to this App
         * automatically. If 'OIDC', then runtime services use the OpenID Connect protocol. If
         * 'SAML', then runtime services use Security Assertion Markup Language protocol.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: string - uniqueness: none
         *
         * @param loginMechanism the value to set
         * @return this builder
         */
        public Builder loginMechanism(String loginMechanism) {
            this.loginMechanism = loginMechanism;
            this.__explicitlySet__.add("loginMechanism");
            return this;
        }
        /**
         * Application icon.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("appIcon")
        private String appIcon;

        /**
         * Application icon.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: string - uniqueness: none
         *
         * @param appIcon the value to set
         * @return this builder
         */
        public Builder appIcon(String appIcon) {
            this.appIcon = appIcon;
            this.__explicitlySet__.add("appIcon");
            return this;
        }
        /**
         * Application thumbnail.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: request - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("appThumbnail")
        private String appThumbnail;

        /**
         * Application thumbnail.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: request - type: string - uniqueness: none
         *
         * @param appThumbnail the value to set
         * @return this builder
         */
        public Builder appThumbnail(String appThumbnail) {
            this.appThumbnail = appThumbnail;
            this.__explicitlySet__.add("appThumbnail");
            return this;
        }
        /**
         * If true, this application is an Oracle Public Cloud service-instance.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isOPCService")
        private Boolean isOPCService;

        /**
         * If true, this application is an Oracle Public Cloud service-instance.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param isOPCService the value to set
         * @return this builder
         */
        public Builder isOPCService(Boolean isOPCService) {
            this.isOPCService = isOPCService;
            this.__explicitlySet__.add("isOPCService");
            return this;
        }
        /**
         * This Uniform Resource Name (URN) value identifies the type of Oracle Public Cloud service
         * of which this app is an instance.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceTypeURN")
        private String serviceTypeURN;

        /**
         * This Uniform Resource Name (URN) value identifies the type of Oracle Public Cloud service
         * of which this app is an instance.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: string - uniqueness: none
         *
         * @param serviceTypeURN the value to set
         * @return this builder
         */
        public Builder serviceTypeURN(String serviceTypeURN) {
            this.serviceTypeURN = serviceTypeURN;
            this.__explicitlySet__.add("serviceTypeURN");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public MyAppApp build() {
            MyAppApp model =
                    new MyAppApp(
                            this.value,
                            this.ref,
                            this.display,
                            this.description,
                            this.isLoginTarget,
                            this.showInMyApps,
                            this.isAliasApp,
                            this.active,
                            this.loginMechanism,
                            this.appIcon,
                            this.appThumbnail,
                            this.isOPCService,
                            this.serviceTypeURN);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(MyAppApp model) {
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
            if (model.wasPropertyExplicitlySet("isAliasApp")) {
                this.isAliasApp(model.getIsAliasApp());
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
            if (model.wasPropertyExplicitlySet("isOPCService")) {
                this.isOPCService(model.getIsOPCService());
            }
            if (model.wasPropertyExplicitlySet("serviceTypeURN")) {
                this.serviceTypeURN(model.getServiceTypeURN());
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
     * Application identifier
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: true - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    private final String value;

    /**
     * Application identifier
     *
     * <p>*SCIM++ Properties:** - caseExact: true - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: true - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getValue() {
        return value;
    }

    /**
     * Application URI
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: reference - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("$ref")
    private final String ref;

    /**
     * Application URI
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: reference - uniqueness: none
     *
     * @return the value
     */
    public String getRef() {
        return ref;
    }

    /**
     * Application display name
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("display")
    private final String display;

    /**
     * Application display name
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getDisplay() {
        return display;
    }

    /**
     * Application description
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Application description
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * If true, this App allows runtime services to log end users into this App automatically.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isLoginTarget")
    private final Boolean isLoginTarget;

    /**
     * If true, this App allows runtime services to log end users into this App automatically.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsLoginTarget() {
        return isLoginTarget;
    }

    /**
     * If true, this App will be displayed in the MyApps page of each end-user who has access to
     * this App.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("showInMyApps")
    private final Boolean showInMyApps;

    /**
     * If true, this App will be displayed in the MyApps page of each end-user who has access to
     * this App.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getShowInMyApps() {
        return showInMyApps;
    }

    /**
     * If true, this App is an AliasApp and it cannot be granted to an end user directly
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: writeOnly
     * - required: false - returned: never - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAliasApp")
    private final Boolean isAliasApp;

    /**
     * If true, this App is an AliasApp and it cannot be granted to an end user directly
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: writeOnly
     * - required: false - returned: never - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsAliasApp() {
        return isAliasApp;
    }

    /**
     * If true, this App is able to participate in runtime services, such as automatic-login, OAuth,
     * and SAML. If false, all runtime services are disabled for this App, and only administrative
     * operations can be performed.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("active")
    private final Boolean active;

    /**
     * If true, this App is able to participate in runtime services, such as automatic-login, OAuth,
     * and SAML. If false, all runtime services are disabled for this App, and only administrative
     * operations can be performed.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * The protocol that runtime services will use to log end users in to this App automatically. If
     * 'OIDC', then runtime services use the OpenID Connect protocol. If 'SAML', then runtime
     * services use Security Assertion Markup Language protocol.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("loginMechanism")
    private final String loginMechanism;

    /**
     * The protocol that runtime services will use to log end users in to this App automatically. If
     * 'OIDC', then runtime services use the OpenID Connect protocol. If 'SAML', then runtime
     * services use Security Assertion Markup Language protocol.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getLoginMechanism() {
        return loginMechanism;
    }

    /**
     * Application icon.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("appIcon")
    private final String appIcon;

    /**
     * Application icon.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getAppIcon() {
        return appIcon;
    }

    /**
     * Application thumbnail.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: request - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("appThumbnail")
    private final String appThumbnail;

    /**
     * Application thumbnail.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: request - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getAppThumbnail() {
        return appThumbnail;
    }

    /**
     * If true, this application is an Oracle Public Cloud service-instance.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isOPCService")
    private final Boolean isOPCService;

    /**
     * If true, this application is an Oracle Public Cloud service-instance.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsOPCService() {
        return isOPCService;
    }

    /**
     * This Uniform Resource Name (URN) value identifies the type of Oracle Public Cloud service of
     * which this app is an instance.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceTypeURN")
    private final String serviceTypeURN;

    /**
     * This Uniform Resource Name (URN) value identifies the type of Oracle Public Cloud service of
     * which this app is an instance.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getServiceTypeURN() {
        return serviceTypeURN;
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
        sb.append("MyAppApp(");
        sb.append("super=").append(super.toString());
        sb.append("value=").append(String.valueOf(this.value));
        sb.append(", ref=").append(String.valueOf(this.ref));
        sb.append(", display=").append(String.valueOf(this.display));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isLoginTarget=").append(String.valueOf(this.isLoginTarget));
        sb.append(", showInMyApps=").append(String.valueOf(this.showInMyApps));
        sb.append(", isAliasApp=").append(String.valueOf(this.isAliasApp));
        sb.append(", active=").append(String.valueOf(this.active));
        sb.append(", loginMechanism=").append(String.valueOf(this.loginMechanism));
        sb.append(", appIcon=").append(String.valueOf(this.appIcon));
        sb.append(", appThumbnail=").append(String.valueOf(this.appThumbnail));
        sb.append(", isOPCService=").append(String.valueOf(this.isOPCService));
        sb.append(", serviceTypeURN=").append(String.valueOf(this.serviceTypeURN));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof MyAppApp)) {
            return false;
        }

        MyAppApp other = (MyAppApp) o;
        return java.util.Objects.equals(this.value, other.value)
                && java.util.Objects.equals(this.ref, other.ref)
                && java.util.Objects.equals(this.display, other.display)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isLoginTarget, other.isLoginTarget)
                && java.util.Objects.equals(this.showInMyApps, other.showInMyApps)
                && java.util.Objects.equals(this.isAliasApp, other.isAliasApp)
                && java.util.Objects.equals(this.active, other.active)
                && java.util.Objects.equals(this.loginMechanism, other.loginMechanism)
                && java.util.Objects.equals(this.appIcon, other.appIcon)
                && java.util.Objects.equals(this.appThumbnail, other.appThumbnail)
                && java.util.Objects.equals(this.isOPCService, other.isOPCService)
                && java.util.Objects.equals(this.serviceTypeURN, other.serviceTypeURN)
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
        result = (result * PRIME) + (this.isAliasApp == null ? 43 : this.isAliasApp.hashCode());
        result = (result * PRIME) + (this.active == null ? 43 : this.active.hashCode());
        result =
                (result * PRIME)
                        + (this.loginMechanism == null ? 43 : this.loginMechanism.hashCode());
        result = (result * PRIME) + (this.appIcon == null ? 43 : this.appIcon.hashCode());
        result = (result * PRIME) + (this.appThumbnail == null ? 43 : this.appThumbnail.hashCode());
        result = (result * PRIME) + (this.isOPCService == null ? 43 : this.isOPCService.hashCode());
        result =
                (result * PRIME)
                        + (this.serviceTypeURN == null ? 43 : this.serviceTypeURN.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
