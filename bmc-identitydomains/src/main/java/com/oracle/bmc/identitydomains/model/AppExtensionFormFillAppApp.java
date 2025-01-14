/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * This extension provides attributes for Form-Fill facet of App <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = AppExtensionFormFillAppApp.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class AppExtensionFormFillAppApp
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "formType",
        "formCredentialSharingGroupID",
        "revealPasswordOnForm",
        "userNameFormTemplate",
        "userNameFormExpression",
        "formCredMethod",
        "configuration",
        "syncFromTemplate",
        "formFillUrlMatch"
    })
    public AppExtensionFormFillAppApp(
            FormType formType,
            String formCredentialSharingGroupID,
            Boolean revealPasswordOnForm,
            String userNameFormTemplate,
            String userNameFormExpression,
            FormCredMethod formCredMethod,
            String configuration,
            Boolean syncFromTemplate,
            java.util.List<AppFormFillUrlMatch> formFillUrlMatch) {
        super();
        this.formType = formType;
        this.formCredentialSharingGroupID = formCredentialSharingGroupID;
        this.revealPasswordOnForm = revealPasswordOnForm;
        this.userNameFormTemplate = userNameFormTemplate;
        this.userNameFormExpression = userNameFormExpression;
        this.formCredMethod = formCredMethod;
        this.configuration = configuration;
        this.syncFromTemplate = syncFromTemplate;
        this.formFillUrlMatch = formFillUrlMatch;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Type of the FormFill application like WebApplication, MainFrameApplication,
         * WindowsApplication. Initially, we will support only WebApplication.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("formType")
        private FormType formType;

        /**
         * Type of the FormFill application like WebApplication, MainFrameApplication,
         * WindowsApplication. Initially, we will support only WebApplication.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param formType the value to set
         * @return this builder
         */
        public Builder formType(FormType formType) {
            this.formType = formType;
            this.__explicitlySet__.add("formType");
            return this;
        }
        /**
         * Credential Sharing Group to which this form-fill application belongs.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("formCredentialSharingGroupID")
        private String formCredentialSharingGroupID;

        /**
         * Credential Sharing Group to which this form-fill application belongs.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param formCredentialSharingGroupID the value to set
         * @return this builder
         */
        public Builder formCredentialSharingGroupID(String formCredentialSharingGroupID) {
            this.formCredentialSharingGroupID = formCredentialSharingGroupID;
            this.__explicitlySet__.add("formCredentialSharingGroupID");
            return this;
        }
        /**
         * If true, indicates that system is allowed to show the password in plain-text for this
         * account after re-authentication.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("revealPasswordOnForm")
        private Boolean revealPasswordOnForm;

        /**
         * If true, indicates that system is allowed to show the password in plain-text for this
         * account after re-authentication.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param revealPasswordOnForm the value to set
         * @return this builder
         */
        public Builder revealPasswordOnForm(Boolean revealPasswordOnForm) {
            this.revealPasswordOnForm = revealPasswordOnForm;
            this.__explicitlySet__.add("revealPasswordOnForm");
            return this;
        }
        /**
         * Format for generating a username. This value can be Username or Email Address; any other
         * value will be treated as a custom expression. A custom expression may combine 'concat'
         * and 'substring' operations with literals and with any attribute of the Oracle Identity
         * Cloud Service user.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsPii: true - idcsSearchable: true -
         * multiValued: false - mutability: readWrite - required: false - returned: default - type:
         * string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userNameFormTemplate")
        private String userNameFormTemplate;

        /**
         * Format for generating a username. This value can be Username or Email Address; any other
         * value will be treated as a custom expression. A custom expression may combine 'concat'
         * and 'substring' operations with literals and with any attribute of the Oracle Identity
         * Cloud Service user.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsPii: true - idcsSearchable: true -
         * multiValued: false - mutability: readWrite - required: false - returned: default - type:
         * string - uniqueness: none
         *
         * @param userNameFormTemplate the value to set
         * @return this builder
         */
        public Builder userNameFormTemplate(String userNameFormTemplate) {
            this.userNameFormTemplate = userNameFormTemplate;
            this.__explicitlySet__.add("userNameFormTemplate");
            return this;
        }
        /**
         * Indicates the custom expression, which can combine concat and substring operations with
         * literals and with any attribute of the Oracle Identity Cloud Service User
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userNameFormExpression")
        private String userNameFormExpression;

        /**
         * Indicates the custom expression, which can combine concat and substring operations with
         * literals and with any attribute of the Oracle Identity Cloud Service User
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param userNameFormExpression the value to set
         * @return this builder
         */
        public Builder userNameFormExpression(String userNameFormExpression) {
            this.userNameFormExpression = userNameFormExpression;
            this.__explicitlySet__.add("userNameFormExpression");
            return this;
        }
        /**
         * Indicates how FormFill obtains the username and password of the account that FormFill
         * will use to sign into the target App.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("formCredMethod")
        private FormCredMethod formCredMethod;

        /**
         * Indicates how FormFill obtains the username and password of the account that FormFill
         * will use to sign into the target App.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param formCredMethod the value to set
         * @return this builder
         */
        public Builder formCredMethod(FormCredMethod formCredMethod) {
            this.formCredMethod = formCredMethod;
            this.__explicitlySet__.add("formCredMethod");
            return this;
        }
        /**
         * FormFill Application Configuration CLOB which has to be maintained in Form-Fill APP for
         * legacy code to do Form-Fill injection
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("configuration")
        private String configuration;

        /**
         * FormFill Application Configuration CLOB which has to be maintained in Form-Fill APP for
         * legacy code to do Form-Fill injection
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: default - type: string - uniqueness: none
         *
         * @param configuration the value to set
         * @return this builder
         */
        public Builder configuration(String configuration) {
            this.configuration = configuration;
            this.__explicitlySet__.add("configuration");
            return this;
        }
        /**
         * If true, indicates that each of the Form-Fill-related attributes that can be inherited
         * from the template actually will be inherited from the template. If false, indicates that
         * the AppTemplate on which this App is based has disabled inheritance for these
         * Form-Fill-related attributes.
         *
         * <p>*Added In:** 17.4.2
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("syncFromTemplate")
        private Boolean syncFromTemplate;

        /**
         * If true, indicates that each of the Form-Fill-related attributes that can be inherited
         * from the template actually will be inherited from the template. If false, indicates that
         * the AppTemplate on which this App is based has disabled inheritance for these
         * Form-Fill-related attributes.
         *
         * <p>*Added In:** 17.4.2
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readOnly - required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param syncFromTemplate the value to set
         * @return this builder
         */
        public Builder syncFromTemplate(Boolean syncFromTemplate) {
            this.syncFromTemplate = syncFromTemplate;
            this.__explicitlySet__.add("syncFromTemplate");
            return this;
        }
        /**
         * A list of application-formURLs that FormFill should match against any formUrl that the
         * user-specifies when signing in to the target service. Each item in the list also
         * indicates how FormFill should interpret that formUrl.
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [formUrl] - multiValued: true - mutability:
         * readWrite - required: false - returned: default - type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("formFillUrlMatch")
        private java.util.List<AppFormFillUrlMatch> formFillUrlMatch;

        /**
         * A list of application-formURLs that FormFill should match against any formUrl that the
         * user-specifies when signing in to the target service. Each item in the list also
         * indicates how FormFill should interpret that formUrl.
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [formUrl] - multiValued: true - mutability:
         * readWrite - required: false - returned: default - type: complex - uniqueness: none
         *
         * @param formFillUrlMatch the value to set
         * @return this builder
         */
        public Builder formFillUrlMatch(java.util.List<AppFormFillUrlMatch> formFillUrlMatch) {
            this.formFillUrlMatch = formFillUrlMatch;
            this.__explicitlySet__.add("formFillUrlMatch");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public AppExtensionFormFillAppApp build() {
            AppExtensionFormFillAppApp model =
                    new AppExtensionFormFillAppApp(
                            this.formType,
                            this.formCredentialSharingGroupID,
                            this.revealPasswordOnForm,
                            this.userNameFormTemplate,
                            this.userNameFormExpression,
                            this.formCredMethod,
                            this.configuration,
                            this.syncFromTemplate,
                            this.formFillUrlMatch);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(AppExtensionFormFillAppApp model) {
            if (model.wasPropertyExplicitlySet("formType")) {
                this.formType(model.getFormType());
            }
            if (model.wasPropertyExplicitlySet("formCredentialSharingGroupID")) {
                this.formCredentialSharingGroupID(model.getFormCredentialSharingGroupID());
            }
            if (model.wasPropertyExplicitlySet("revealPasswordOnForm")) {
                this.revealPasswordOnForm(model.getRevealPasswordOnForm());
            }
            if (model.wasPropertyExplicitlySet("userNameFormTemplate")) {
                this.userNameFormTemplate(model.getUserNameFormTemplate());
            }
            if (model.wasPropertyExplicitlySet("userNameFormExpression")) {
                this.userNameFormExpression(model.getUserNameFormExpression());
            }
            if (model.wasPropertyExplicitlySet("formCredMethod")) {
                this.formCredMethod(model.getFormCredMethod());
            }
            if (model.wasPropertyExplicitlySet("configuration")) {
                this.configuration(model.getConfiguration());
            }
            if (model.wasPropertyExplicitlySet("syncFromTemplate")) {
                this.syncFromTemplate(model.getSyncFromTemplate());
            }
            if (model.wasPropertyExplicitlySet("formFillUrlMatch")) {
                this.formFillUrlMatch(model.getFormFillUrlMatch());
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
     * Type of the FormFill application like WebApplication, MainFrameApplication,
     * WindowsApplication. Initially, we will support only WebApplication.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    public enum FormType implements com.oracle.bmc.http.internal.BmcEnum {
        WebApplication("WebApplication"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(FormType.class);

        private final String value;
        private static java.util.Map<String, FormType> map;

        static {
            map = new java.util.HashMap<>();
            for (FormType v : FormType.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FormType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FormType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FormType', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Type of the FormFill application like WebApplication, MainFrameApplication,
     * WindowsApplication. Initially, we will support only WebApplication.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("formType")
    private final FormType formType;

    /**
     * Type of the FormFill application like WebApplication, MainFrameApplication,
     * WindowsApplication. Initially, we will support only WebApplication.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public FormType getFormType() {
        return formType;
    }

    /**
     * Credential Sharing Group to which this form-fill application belongs.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("formCredentialSharingGroupID")
    private final String formCredentialSharingGroupID;

    /**
     * Credential Sharing Group to which this form-fill application belongs.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getFormCredentialSharingGroupID() {
        return formCredentialSharingGroupID;
    }

    /**
     * If true, indicates that system is allowed to show the password in plain-text for this account
     * after re-authentication.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("revealPasswordOnForm")
    private final Boolean revealPasswordOnForm;

    /**
     * If true, indicates that system is allowed to show the password in plain-text for this account
     * after re-authentication.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getRevealPasswordOnForm() {
        return revealPasswordOnForm;
    }

    /**
     * Format for generating a username. This value can be Username or Email Address; any other
     * value will be treated as a custom expression. A custom expression may combine 'concat' and
     * 'substring' operations with literals and with any attribute of the Oracle Identity Cloud
     * Service user.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsPii: true - idcsSearchable: true -
     * multiValued: false - mutability: readWrite - required: false - returned: default - type:
     * string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userNameFormTemplate")
    private final String userNameFormTemplate;

    /**
     * Format for generating a username. This value can be Username or Email Address; any other
     * value will be treated as a custom expression. A custom expression may combine 'concat' and
     * 'substring' operations with literals and with any attribute of the Oracle Identity Cloud
     * Service user.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsPii: true - idcsSearchable: true -
     * multiValued: false - mutability: readWrite - required: false - returned: default - type:
     * string - uniqueness: none
     *
     * @return the value
     */
    public String getUserNameFormTemplate() {
        return userNameFormTemplate;
    }

    /**
     * Indicates the custom expression, which can combine concat and substring operations with
     * literals and with any attribute of the Oracle Identity Cloud Service User
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userNameFormExpression")
    private final String userNameFormExpression;

    /**
     * Indicates the custom expression, which can combine concat and substring operations with
     * literals and with any attribute of the Oracle Identity Cloud Service User
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getUserNameFormExpression() {
        return userNameFormExpression;
    }

    /**
     * Indicates how FormFill obtains the username and password of the account that FormFill will
     * use to sign into the target App.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    public enum FormCredMethod implements com.oracle.bmc.http.internal.BmcEnum {
        AdminSetsCredentials("ADMIN_SETS_CREDENTIALS"),
        AdminSetsSharedCredentials("ADMIN_SETS_SHARED_CREDENTIALS"),
        UserSetsPasswordOnly("USER_SETS_PASSWORD_ONLY"),
        UserSetsCredentials("USER_SETS_CREDENTIALS"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(FormCredMethod.class);

        private final String value;
        private static java.util.Map<String, FormCredMethod> map;

        static {
            map = new java.util.HashMap<>();
            for (FormCredMethod v : FormCredMethod.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        FormCredMethod(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static FormCredMethod create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'FormCredMethod', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Indicates how FormFill obtains the username and password of the account that FormFill will
     * use to sign into the target App.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("formCredMethod")
    private final FormCredMethod formCredMethod;

    /**
     * Indicates how FormFill obtains the username and password of the account that FormFill will
     * use to sign into the target App.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public FormCredMethod getFormCredMethod() {
        return formCredMethod;
    }

    /**
     * FormFill Application Configuration CLOB which has to be maintained in Form-Fill APP for
     * legacy code to do Form-Fill injection
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configuration")
    private final String configuration;

    /**
     * FormFill Application Configuration CLOB which has to be maintained in Form-Fill APP for
     * legacy code to do Form-Fill injection
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getConfiguration() {
        return configuration;
    }

    /**
     * If true, indicates that each of the Form-Fill-related attributes that can be inherited from
     * the template actually will be inherited from the template. If false, indicates that the
     * AppTemplate on which this App is based has disabled inheritance for these Form-Fill-related
     * attributes.
     *
     * <p>*Added In:** 17.4.2
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("syncFromTemplate")
    private final Boolean syncFromTemplate;

    /**
     * If true, indicates that each of the Form-Fill-related attributes that can be inherited from
     * the template actually will be inherited from the template. If false, indicates that the
     * AppTemplate on which this App is based has disabled inheritance for these Form-Fill-related
     * attributes.
     *
     * <p>*Added In:** 17.4.2
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readOnly
     * - required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getSyncFromTemplate() {
        return syncFromTemplate;
    }

    /**
     * A list of application-formURLs that FormFill should match against any formUrl that the
     * user-specifies when signing in to the target service. Each item in the list also indicates
     * how FormFill should interpret that formUrl.
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [formUrl] - multiValued: true - mutability:
     * readWrite - required: false - returned: default - type: complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("formFillUrlMatch")
    private final java.util.List<AppFormFillUrlMatch> formFillUrlMatch;

    /**
     * A list of application-formURLs that FormFill should match against any formUrl that the
     * user-specifies when signing in to the target service. Each item in the list also indicates
     * how FormFill should interpret that formUrl.
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [formUrl] - multiValued: true - mutability:
     * readWrite - required: false - returned: default - type: complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<AppFormFillUrlMatch> getFormFillUrlMatch() {
        return formFillUrlMatch;
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
        sb.append("AppExtensionFormFillAppApp(");
        sb.append("super=").append(super.toString());
        sb.append("formType=").append(String.valueOf(this.formType));
        sb.append(", formCredentialSharingGroupID=")
                .append(String.valueOf(this.formCredentialSharingGroupID));
        sb.append(", revealPasswordOnForm=").append(String.valueOf(this.revealPasswordOnForm));
        sb.append(", userNameFormTemplate=").append(String.valueOf(this.userNameFormTemplate));
        sb.append(", userNameFormExpression=").append(String.valueOf(this.userNameFormExpression));
        sb.append(", formCredMethod=").append(String.valueOf(this.formCredMethod));
        sb.append(", configuration=").append(String.valueOf(this.configuration));
        sb.append(", syncFromTemplate=").append(String.valueOf(this.syncFromTemplate));
        sb.append(", formFillUrlMatch=").append(String.valueOf(this.formFillUrlMatch));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AppExtensionFormFillAppApp)) {
            return false;
        }

        AppExtensionFormFillAppApp other = (AppExtensionFormFillAppApp) o;
        return java.util.Objects.equals(this.formType, other.formType)
                && java.util.Objects.equals(
                        this.formCredentialSharingGroupID, other.formCredentialSharingGroupID)
                && java.util.Objects.equals(this.revealPasswordOnForm, other.revealPasswordOnForm)
                && java.util.Objects.equals(this.userNameFormTemplate, other.userNameFormTemplate)
                && java.util.Objects.equals(
                        this.userNameFormExpression, other.userNameFormExpression)
                && java.util.Objects.equals(this.formCredMethod, other.formCredMethod)
                && java.util.Objects.equals(this.configuration, other.configuration)
                && java.util.Objects.equals(this.syncFromTemplate, other.syncFromTemplate)
                && java.util.Objects.equals(this.formFillUrlMatch, other.formFillUrlMatch)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.formType == null ? 43 : this.formType.hashCode());
        result =
                (result * PRIME)
                        + (this.formCredentialSharingGroupID == null
                                ? 43
                                : this.formCredentialSharingGroupID.hashCode());
        result =
                (result * PRIME)
                        + (this.revealPasswordOnForm == null
                                ? 43
                                : this.revealPasswordOnForm.hashCode());
        result =
                (result * PRIME)
                        + (this.userNameFormTemplate == null
                                ? 43
                                : this.userNameFormTemplate.hashCode());
        result =
                (result * PRIME)
                        + (this.userNameFormExpression == null
                                ? 43
                                : this.userNameFormExpression.hashCode());
        result =
                (result * PRIME)
                        + (this.formCredMethod == null ? 43 : this.formCredMethod.hashCode());
        result =
                (result * PRIME)
                        + (this.configuration == null ? 43 : this.configuration.hashCode());
        result =
                (result * PRIME)
                        + (this.syncFromTemplate == null ? 43 : this.syncFromTemplate.hashCode());
        result =
                (result * PRIME)
                        + (this.formFillUrlMatch == null ? 43 : this.formFillUrlMatch.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
