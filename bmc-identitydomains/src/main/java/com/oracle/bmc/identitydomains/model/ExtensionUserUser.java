/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identitydomains.model;

/**
 * Oracle Identity Cloud Service User <br>
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
        builder = ExtensionUserUser.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ExtensionUserUser
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "isFederatedUser",
        "isAuthenticationDelegated",
        "status",
        "provider",
        "preferredUiLandingPage",
        "creationMechanism",
        "groupMembershipLastModified",
        "doNotShowGettingStarted",
        "bypassNotification",
        "isAccountRecoveryEnrolled",
        "accountRecoveryRequired",
        "userFlowControlledByExternalClient",
        "isGroupMembershipNormalized",
        "isGroupMembershipSyncedToUsersGroups",
        "notificationEmailTemplateId",
        "serviceUser",
        "supportAccounts",
        "idcsAppRolesLimitedToGroups",
        "userToken",
        "syncedFromApp",
        "applicableAuthenticationTargetApp",
        "delegatedAuthenticationTargetApp",
        "accounts",
        "grants",
        "appRoles"
    })
    public ExtensionUserUser(
            Boolean isFederatedUser,
            Boolean isAuthenticationDelegated,
            Status status,
            Provider provider,
            PreferredUiLandingPage preferredUiLandingPage,
            CreationMechanism creationMechanism,
            String groupMembershipLastModified,
            Boolean doNotShowGettingStarted,
            Boolean bypassNotification,
            Boolean isAccountRecoveryEnrolled,
            Boolean accountRecoveryRequired,
            Boolean userFlowControlledByExternalClient,
            Boolean isGroupMembershipNormalized,
            Boolean isGroupMembershipSyncedToUsersGroups,
            String notificationEmailTemplateId,
            Boolean serviceUser,
            java.util.List<UserExtSupportAccounts> supportAccounts,
            java.util.List<UserExtIdcsAppRolesLimitedToGroups> idcsAppRolesLimitedToGroups,
            UserExtUserToken userToken,
            UserExtSyncedFromApp syncedFromApp,
            UserExtApplicableAuthenticationTargetApp applicableAuthenticationTargetApp,
            UserExtDelegatedAuthenticationTargetApp delegatedAuthenticationTargetApp,
            java.util.List<UserExtAccounts> accounts,
            java.util.List<UserExtGrants> grants,
            java.util.List<UserExtAppRoles> appRoles) {
        super();
        this.isFederatedUser = isFederatedUser;
        this.isAuthenticationDelegated = isAuthenticationDelegated;
        this.status = status;
        this.provider = provider;
        this.preferredUiLandingPage = preferredUiLandingPage;
        this.creationMechanism = creationMechanism;
        this.groupMembershipLastModified = groupMembershipLastModified;
        this.doNotShowGettingStarted = doNotShowGettingStarted;
        this.bypassNotification = bypassNotification;
        this.isAccountRecoveryEnrolled = isAccountRecoveryEnrolled;
        this.accountRecoveryRequired = accountRecoveryRequired;
        this.userFlowControlledByExternalClient = userFlowControlledByExternalClient;
        this.isGroupMembershipNormalized = isGroupMembershipNormalized;
        this.isGroupMembershipSyncedToUsersGroups = isGroupMembershipSyncedToUsersGroups;
        this.notificationEmailTemplateId = notificationEmailTemplateId;
        this.serviceUser = serviceUser;
        this.supportAccounts = supportAccounts;
        this.idcsAppRolesLimitedToGroups = idcsAppRolesLimitedToGroups;
        this.userToken = userToken;
        this.syncedFromApp = syncedFromApp;
        this.applicableAuthenticationTargetApp = applicableAuthenticationTargetApp;
        this.delegatedAuthenticationTargetApp = delegatedAuthenticationTargetApp;
        this.accounts = accounts;
        this.grants = grants;
        this.appRoles = appRoles;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A Boolean value indicating whether or not the user is federated.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Federated -
         * idcsCsvAttributeNameMappings: [[columnHeaderName:Federated]] - idcsSearchable: true -
         * multiValued: false - mutability: readWrite - idcsRequiresWriteForAccessFlows: true -
         * required: false - returned: default - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isFederatedUser")
        private Boolean isFederatedUser;

        /**
         * A Boolean value indicating whether or not the user is federated.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Federated -
         * idcsCsvAttributeNameMappings: [[columnHeaderName:Federated]] - idcsSearchable: true -
         * multiValued: false - mutability: readWrite - idcsRequiresWriteForAccessFlows: true -
         * required: false - returned: default - type: boolean - uniqueness: none
         *
         * @param isFederatedUser the value to set
         * @return this builder
         */
        public Builder isFederatedUser(Boolean isFederatedUser) {
            this.isFederatedUser = isFederatedUser;
            this.__explicitlySet__.add("isFederatedUser");
            return this;
        }
        /**
         * A Boolean value indicating whether or not authentication request by this user should be
         * delegated to a remote app. This value should be true only when the User was originally
         * synced from an app which is enabled for delegated authentication
         *
         * <p>*Added In:** 17.4.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: immutable - required: false - returned: never - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAuthenticationDelegated")
        private Boolean isAuthenticationDelegated;

        /**
         * A Boolean value indicating whether or not authentication request by this user should be
         * delegated to a remote app. This value should be true only when the User was originally
         * synced from an app which is enabled for delegated authentication
         *
         * <p>*Added In:** 17.4.6
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: immutable - required: false - returned: never - type: boolean - uniqueness:
         * none
         *
         * @param isAuthenticationDelegated the value to set
         * @return this builder
         */
        public Builder isAuthenticationDelegated(Boolean isAuthenticationDelegated) {
            this.isAuthenticationDelegated = isAuthenticationDelegated;
            this.__explicitlySet__.add("isAuthenticationDelegated");
            return this;
        }
        /**
         * A supplemental status indicating the reason why a user is disabled
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: request - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        /**
         * A supplemental status indicating the reason why a user is disabled
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readOnly - required: false - returned: request - type: string - uniqueness:
         * none
         *
         * @param status the value to set
         * @return this builder
         */
        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }
        /**
         * Registration provider
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: false - returned: default - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("provider")
        private Provider provider;

        /**
         * Registration provider
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: immutable - required: false - returned: default - type: string - uniqueness:
         * none
         *
         * @param provider the value to set
         * @return this builder
         */
        public Builder provider(Provider provider) {
            this.provider = provider;
            this.__explicitlySet__.add("provider");
            return this;
        }
        /**
         * User's preferred landing page following login, logout and reset password.
         *
         * <p>*Added In:** 2302092332
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("preferredUiLandingPage")
        private PreferredUiLandingPage preferredUiLandingPage;

        /**
         * User's preferred landing page following login, logout and reset password.
         *
         * <p>*Added In:** 2302092332
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readWrite - required: false - returned: default - type: string -
         * uniqueness: none
         *
         * @param preferredUiLandingPage the value to set
         * @return this builder
         */
        public Builder preferredUiLandingPage(PreferredUiLandingPage preferredUiLandingPage) {
            this.preferredUiLandingPage = preferredUiLandingPage;
            this.__explicitlySet__.add("preferredUiLandingPage");
            return this;
        }
        /**
         * User creation mechanism
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeNameMappings:
         * [[defaultValue:import]] - idcsSearchable: true - multiValued: false - mutability:
         * immutable - idcsRequiresWriteForAccessFlows: true - required: false - returned: request -
         * type: string - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("creationMechanism")
        private CreationMechanism creationMechanism;

        /**
         * User creation mechanism
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeNameMappings:
         * [[defaultValue:import]] - idcsSearchable: true - multiValued: false - mutability:
         * immutable - idcsRequiresWriteForAccessFlows: true - required: false - returned: request -
         * type: string - uniqueness: none
         *
         * @param creationMechanism the value to set
         * @return this builder
         */
        public Builder creationMechanism(CreationMechanism creationMechanism) {
            this.creationMechanism = creationMechanism;
            this.__explicitlySet__.add("creationMechanism");
            return this;
        }
        /**
         * Specifies date time when a User's group membership was last modified.
         *
         * <p>*Added In:** 2304270343
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - returned: request - type: dateTime - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("groupMembershipLastModified")
        private String groupMembershipLastModified;

        /**
         * Specifies date time when a User's group membership was last modified.
         *
         * <p>*Added In:** 2304270343
         *
         * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
         * required: false - returned: request - type: dateTime - uniqueness: none
         *
         * @param groupMembershipLastModified the value to set
         * @return this builder
         */
        public Builder groupMembershipLastModified(String groupMembershipLastModified) {
            this.groupMembershipLastModified = groupMembershipLastModified;
            this.__explicitlySet__.add("groupMembershipLastModified");
            return this;
        }
        /**
         * A Boolean value indicating whether or not to hide the getting started page
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("doNotShowGettingStarted")
        private Boolean doNotShowGettingStarted;

        /**
         * A Boolean value indicating whether or not to hide the getting started page
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
         * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
         * none
         *
         * @param doNotShowGettingStarted the value to set
         * @return this builder
         */
        public Builder doNotShowGettingStarted(Boolean doNotShowGettingStarted) {
            this.doNotShowGettingStarted = doNotShowGettingStarted;
            this.__explicitlySet__.add("doNotShowGettingStarted");
            return this;
        }
        /**
         * A Boolean value indicating whether or not to send email notification after creating the
         * user. This attribute is not used in update/replace operations.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeNameMappings:
         * [[columnHeaderName:ByPass Notification]] - idcsSearchable: false - multiValued: false -
         * mutability: immutable - idcsRequiresWriteForAccessFlows: true - required: false -
         * returned: never - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("bypassNotification")
        private Boolean bypassNotification;

        /**
         * A Boolean value indicating whether or not to send email notification after creating the
         * user. This attribute is not used in update/replace operations.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeNameMappings:
         * [[columnHeaderName:ByPass Notification]] - idcsSearchable: false - multiValued: false -
         * mutability: immutable - idcsRequiresWriteForAccessFlows: true - required: false -
         * returned: never - type: boolean - uniqueness: none
         *
         * @param bypassNotification the value to set
         * @return this builder
         */
        public Builder bypassNotification(Boolean bypassNotification) {
            this.bypassNotification = bypassNotification;
            this.__explicitlySet__.add("bypassNotification");
            return this;
        }
        /**
         * A Boolean value indicating whether or not a user is enrolled for account recovery
         *
         * <p>*Added In:** 19.1.4
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: request - type: boolean -
         * uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isAccountRecoveryEnrolled")
        private Boolean isAccountRecoveryEnrolled;

        /**
         * A Boolean value indicating whether or not a user is enrolled for account recovery
         *
         * <p>*Added In:** 19.1.4
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: readOnly - required: false - returned: request - type: boolean -
         * uniqueness: none
         *
         * @param isAccountRecoveryEnrolled the value to set
         * @return this builder
         */
        public Builder isAccountRecoveryEnrolled(Boolean isAccountRecoveryEnrolled) {
            this.isAccountRecoveryEnrolled = isAccountRecoveryEnrolled;
            this.__explicitlySet__.add("isAccountRecoveryEnrolled");
            return this;
        }
        /**
         * Boolean value to prompt user to setup account recovery during login.
         *
         * <p>*Added In:** 19.1.4
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accountRecoveryRequired")
        private Boolean accountRecoveryRequired;

        /**
         * Boolean value to prompt user to setup account recovery during login.
         *
         * <p>*Added In:** 19.1.4
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability:
         * readWrite - required: false - returned: request - type: boolean - uniqueness: none
         *
         * @param accountRecoveryRequired the value to set
         * @return this builder
         */
        public Builder accountRecoveryRequired(Boolean accountRecoveryRequired) {
            this.accountRecoveryRequired = accountRecoveryRequired;
            this.__explicitlySet__.add("accountRecoveryRequired");
            return this;
        }
        /**
         * A Boolean value indicating whether to bypass notification and return user token to be
         * used by an external client to control the user flow.
         *
         * <p>*Added In:** 18.4.2
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: immutable - required: false - returned: never - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("userFlowControlledByExternalClient")
        private Boolean userFlowControlledByExternalClient;

        /**
         * A Boolean value indicating whether to bypass notification and return user token to be
         * used by an external client to control the user flow.
         *
         * <p>*Added In:** 18.4.2
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: immutable - required: false - returned: never - type: boolean - uniqueness:
         * none
         *
         * @param userFlowControlledByExternalClient the value to set
         * @return this builder
         */
        public Builder userFlowControlledByExternalClient(
                Boolean userFlowControlledByExternalClient) {
            this.userFlowControlledByExternalClient = userFlowControlledByExternalClient;
            this.__explicitlySet__.add("userFlowControlledByExternalClient");
            return this;
        }
        /**
         * A Boolean value indicating whether or not group membership is normalized for this user.
         *
         * <p>*Deprecated Since: 19.3.3**
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: immutable - required: false - returned: never - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isGroupMembershipNormalized")
        private Boolean isGroupMembershipNormalized;

        /**
         * A Boolean value indicating whether or not group membership is normalized for this user.
         *
         * <p>*Deprecated Since: 19.3.3**
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: immutable - required: false - returned: never - type: boolean - uniqueness:
         * none
         *
         * @param isGroupMembershipNormalized the value to set
         * @return this builder
         */
        public Builder isGroupMembershipNormalized(Boolean isGroupMembershipNormalized) {
            this.isGroupMembershipNormalized = isGroupMembershipNormalized;
            this.__explicitlySet__.add("isGroupMembershipNormalized");
            return this;
        }
        /**
         * A Boolean value Indicates whether this User's group membership has been sync'ed from
         * Group.members to UsersGroups.
         *
         * <p>*Added In:** 19.3.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: immutable - required: false - returned: never - type: boolean - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isGroupMembershipSyncedToUsersGroups")
        private Boolean isGroupMembershipSyncedToUsersGroups;

        /**
         * A Boolean value Indicates whether this User's group membership has been sync'ed from
         * Group.members to UsersGroups.
         *
         * <p>*Added In:** 19.3.3
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: immutable - required: false - returned: never - type: boolean - uniqueness:
         * none
         *
         * @param isGroupMembershipSyncedToUsersGroups the value to set
         * @return this builder
         */
        public Builder isGroupMembershipSyncedToUsersGroups(
                Boolean isGroupMembershipSyncedToUsersGroups) {
            this.isGroupMembershipSyncedToUsersGroups = isGroupMembershipSyncedToUsersGroups;
            this.__explicitlySet__.add("isGroupMembershipSyncedToUsersGroups");
            return this;
        }
        /**
         * Specifies the EmailTemplate to be used when sending notification to the user this request
         * is for. If specified, it overrides the default EmailTemplate for this event.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: writeOnly - required: false - returned: never - type: string - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("notificationEmailTemplateId")
        private String notificationEmailTemplateId;

        /**
         * Specifies the EmailTemplate to be used when sending notification to the user this request
         * is for. If specified, it overrides the default EmailTemplate for this event.
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false
         * - mutability: writeOnly - required: false - returned: never - type: string - uniqueness:
         * none
         *
         * @param notificationEmailTemplateId the value to set
         * @return this builder
         */
        public Builder notificationEmailTemplateId(String notificationEmailTemplateId) {
            this.notificationEmailTemplateId = notificationEmailTemplateId;
            this.__explicitlySet__.add("notificationEmailTemplateId");
            return this;
        }
        /**
         * Indicates if User is a Service User
         *
         * <p>*Added In:** 2306131901
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Service User -
         * idcsCsvAttributeNameMappings: [[columnHeaderName:Service User]] - idcsSearchable: true -
         * multiValued: false - mutability: immutable - required: false - returned: default - type:
         * boolean - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("serviceUser")
        private Boolean serviceUser;

        /**
         * Indicates if User is a Service User
         *
         * <p>*Added In:** 2306131901
         *
         * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Service User -
         * idcsCsvAttributeNameMappings: [[columnHeaderName:Service User]] - idcsSearchable: true -
         * multiValued: false - mutability: immutable - required: false - returned: default - type:
         * boolean - uniqueness: none
         *
         * @param serviceUser the value to set
         * @return this builder
         */
        public Builder serviceUser(Boolean serviceUser) {
            this.serviceUser = serviceUser;
            this.__explicitlySet__.add("serviceUser");
            return this;
        }
        /**
         * A list of Support Accounts corresponding to user.
         *
         * <p>*Added In:** 2103141444
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readOnly - required: false - returned: request - type:
         * complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("supportAccounts")
        private java.util.List<UserExtSupportAccounts> supportAccounts;

        /**
         * A list of Support Accounts corresponding to user.
         *
         * <p>*Added In:** 2103141444
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true -
         * multiValued: true - mutability: readOnly - required: false - returned: request - type:
         * complex - uniqueness: none
         *
         * @param supportAccounts the value to set
         * @return this builder
         */
        public Builder supportAccounts(java.util.List<UserExtSupportAccounts> supportAccounts) {
            this.supportAccounts = supportAccounts;
            this.__explicitlySet__.add("supportAccounts");
            return this;
        }
        /**
         * Description:
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value, idcsAppRoleId] - idcsSearchable:
         * true - multiValued: true - mutability: readOnly - required: false - returned: request -
         * type: complex
         */
        @com.fasterxml.jackson.annotation.JsonProperty("idcsAppRolesLimitedToGroups")
        private java.util.List<UserExtIdcsAppRolesLimitedToGroups> idcsAppRolesLimitedToGroups;

        /**
         * Description:
         *
         * <p>*Added In:** 19.2.1
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value, idcsAppRoleId] - idcsSearchable:
         * true - multiValued: true - mutability: readOnly - required: false - returned: request -
         * type: complex
         *
         * @param idcsAppRolesLimitedToGroups the value to set
         * @return this builder
         */
        public Builder idcsAppRolesLimitedToGroups(
                java.util.List<UserExtIdcsAppRolesLimitedToGroups> idcsAppRolesLimitedToGroups) {
            this.idcsAppRolesLimitedToGroups = idcsAppRolesLimitedToGroups;
            this.__explicitlySet__.add("idcsAppRolesLimitedToGroups");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("userToken")
        private UserExtUserToken userToken;

        public Builder userToken(UserExtUserToken userToken) {
            this.userToken = userToken;
            this.__explicitlySet__.add("userToken");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("syncedFromApp")
        private UserExtSyncedFromApp syncedFromApp;

        public Builder syncedFromApp(UserExtSyncedFromApp syncedFromApp) {
            this.syncedFromApp = syncedFromApp;
            this.__explicitlySet__.add("syncedFromApp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("applicableAuthenticationTargetApp")
        private UserExtApplicableAuthenticationTargetApp applicableAuthenticationTargetApp;

        public Builder applicableAuthenticationTargetApp(
                UserExtApplicableAuthenticationTargetApp applicableAuthenticationTargetApp) {
            this.applicableAuthenticationTargetApp = applicableAuthenticationTargetApp;
            this.__explicitlySet__.add("applicableAuthenticationTargetApp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("delegatedAuthenticationTargetApp")
        private UserExtDelegatedAuthenticationTargetApp delegatedAuthenticationTargetApp;

        public Builder delegatedAuthenticationTargetApp(
                UserExtDelegatedAuthenticationTargetApp delegatedAuthenticationTargetApp) {
            this.delegatedAuthenticationTargetApp = delegatedAuthenticationTargetApp;
            this.__explicitlySet__.add("delegatedAuthenticationTargetApp");
            return this;
        }
        /**
         * Accounts assigned to this User. Each value of this attribute refers to an app-specific
         * identity that is owned by this User. Therefore, this attribute is a convenience that
         * allows one to see on each User the Apps to which that User has access.
         *
         * <p>*SCIM++ Properties:** - idcsPii: true - idcsSearchable: true - multiValued: true -
         * mutability: readOnly - required: false - returned: request - type: complex - uniqueness:
         * none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("accounts")
        private java.util.List<UserExtAccounts> accounts;

        /**
         * Accounts assigned to this User. Each value of this attribute refers to an app-specific
         * identity that is owned by this User. Therefore, this attribute is a convenience that
         * allows one to see on each User the Apps to which that User has access.
         *
         * <p>*SCIM++ Properties:** - idcsPii: true - idcsSearchable: true - multiValued: true -
         * mutability: readOnly - required: false - returned: request - type: complex - uniqueness:
         * none
         *
         * @param accounts the value to set
         * @return this builder
         */
        public Builder accounts(java.util.List<UserExtAccounts> accounts) {
            this.accounts = accounts;
            this.__explicitlySet__.add("accounts");
            return this;
        }
        /**
         * Grants to this User. Each value of this attribute refers to a Grant to this User of some
         * App (and optionally of some entitlement). Therefore, this attribute is a convenience that
         * allows one to see on each User all of the Grants to that User.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: true - mutability:
         * readOnly - required: false - returned: request - type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("grants")
        private java.util.List<UserExtGrants> grants;

        /**
         * Grants to this User. Each value of this attribute refers to a Grant to this User of some
         * App (and optionally of some entitlement). Therefore, this attribute is a convenience that
         * allows one to see on each User all of the Grants to that User.
         *
         * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: true - mutability:
         * readOnly - required: false - returned: request - type: complex - uniqueness: none
         *
         * @param grants the value to set
         * @return this builder
         */
        public Builder grants(java.util.List<UserExtGrants> grants) {
            this.grants = grants;
            this.__explicitlySet__.add("grants");
            return this;
        }
        /**
         * A list of all AppRoles to which this User belongs directly, indirectly or implicitly. The
         * User could belong directly because the User is a member of the AppRole, could belong
         * indirectly because the User is a member of a Group that is a member of the AppRole, or
         * could belong implicitly because the AppRole is public.
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - multiValued: true - mutability:
         * readOnly - required: false - returned: request - type: complex - uniqueness: none
         */
        @com.fasterxml.jackson.annotation.JsonProperty("appRoles")
        private java.util.List<UserExtAppRoles> appRoles;

        /**
         * A list of all AppRoles to which this User belongs directly, indirectly or implicitly. The
         * User could belong directly because the User is a member of the AppRole, could belong
         * indirectly because the User is a member of a Group that is a member of the AppRole, or
         * could belong implicitly because the AppRole is public.
         *
         * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - multiValued: true - mutability:
         * readOnly - required: false - returned: request - type: complex - uniqueness: none
         *
         * @param appRoles the value to set
         * @return this builder
         */
        public Builder appRoles(java.util.List<UserExtAppRoles> appRoles) {
            this.appRoles = appRoles;
            this.__explicitlySet__.add("appRoles");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtensionUserUser build() {
            ExtensionUserUser model =
                    new ExtensionUserUser(
                            this.isFederatedUser,
                            this.isAuthenticationDelegated,
                            this.status,
                            this.provider,
                            this.preferredUiLandingPage,
                            this.creationMechanism,
                            this.groupMembershipLastModified,
                            this.doNotShowGettingStarted,
                            this.bypassNotification,
                            this.isAccountRecoveryEnrolled,
                            this.accountRecoveryRequired,
                            this.userFlowControlledByExternalClient,
                            this.isGroupMembershipNormalized,
                            this.isGroupMembershipSyncedToUsersGroups,
                            this.notificationEmailTemplateId,
                            this.serviceUser,
                            this.supportAccounts,
                            this.idcsAppRolesLimitedToGroups,
                            this.userToken,
                            this.syncedFromApp,
                            this.applicableAuthenticationTargetApp,
                            this.delegatedAuthenticationTargetApp,
                            this.accounts,
                            this.grants,
                            this.appRoles);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtensionUserUser model) {
            if (model.wasPropertyExplicitlySet("isFederatedUser")) {
                this.isFederatedUser(model.getIsFederatedUser());
            }
            if (model.wasPropertyExplicitlySet("isAuthenticationDelegated")) {
                this.isAuthenticationDelegated(model.getIsAuthenticationDelegated());
            }
            if (model.wasPropertyExplicitlySet("status")) {
                this.status(model.getStatus());
            }
            if (model.wasPropertyExplicitlySet("provider")) {
                this.provider(model.getProvider());
            }
            if (model.wasPropertyExplicitlySet("preferredUiLandingPage")) {
                this.preferredUiLandingPage(model.getPreferredUiLandingPage());
            }
            if (model.wasPropertyExplicitlySet("creationMechanism")) {
                this.creationMechanism(model.getCreationMechanism());
            }
            if (model.wasPropertyExplicitlySet("groupMembershipLastModified")) {
                this.groupMembershipLastModified(model.getGroupMembershipLastModified());
            }
            if (model.wasPropertyExplicitlySet("doNotShowGettingStarted")) {
                this.doNotShowGettingStarted(model.getDoNotShowGettingStarted());
            }
            if (model.wasPropertyExplicitlySet("bypassNotification")) {
                this.bypassNotification(model.getBypassNotification());
            }
            if (model.wasPropertyExplicitlySet("isAccountRecoveryEnrolled")) {
                this.isAccountRecoveryEnrolled(model.getIsAccountRecoveryEnrolled());
            }
            if (model.wasPropertyExplicitlySet("accountRecoveryRequired")) {
                this.accountRecoveryRequired(model.getAccountRecoveryRequired());
            }
            if (model.wasPropertyExplicitlySet("userFlowControlledByExternalClient")) {
                this.userFlowControlledByExternalClient(
                        model.getUserFlowControlledByExternalClient());
            }
            if (model.wasPropertyExplicitlySet("isGroupMembershipNormalized")) {
                this.isGroupMembershipNormalized(model.getIsGroupMembershipNormalized());
            }
            if (model.wasPropertyExplicitlySet("isGroupMembershipSyncedToUsersGroups")) {
                this.isGroupMembershipSyncedToUsersGroups(
                        model.getIsGroupMembershipSyncedToUsersGroups());
            }
            if (model.wasPropertyExplicitlySet("notificationEmailTemplateId")) {
                this.notificationEmailTemplateId(model.getNotificationEmailTemplateId());
            }
            if (model.wasPropertyExplicitlySet("serviceUser")) {
                this.serviceUser(model.getServiceUser());
            }
            if (model.wasPropertyExplicitlySet("supportAccounts")) {
                this.supportAccounts(model.getSupportAccounts());
            }
            if (model.wasPropertyExplicitlySet("idcsAppRolesLimitedToGroups")) {
                this.idcsAppRolesLimitedToGroups(model.getIdcsAppRolesLimitedToGroups());
            }
            if (model.wasPropertyExplicitlySet("userToken")) {
                this.userToken(model.getUserToken());
            }
            if (model.wasPropertyExplicitlySet("syncedFromApp")) {
                this.syncedFromApp(model.getSyncedFromApp());
            }
            if (model.wasPropertyExplicitlySet("applicableAuthenticationTargetApp")) {
                this.applicableAuthenticationTargetApp(
                        model.getApplicableAuthenticationTargetApp());
            }
            if (model.wasPropertyExplicitlySet("delegatedAuthenticationTargetApp")) {
                this.delegatedAuthenticationTargetApp(model.getDelegatedAuthenticationTargetApp());
            }
            if (model.wasPropertyExplicitlySet("accounts")) {
                this.accounts(model.getAccounts());
            }
            if (model.wasPropertyExplicitlySet("grants")) {
                this.grants(model.getGrants());
            }
            if (model.wasPropertyExplicitlySet("appRoles")) {
                this.appRoles(model.getAppRoles());
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
     * A Boolean value indicating whether or not the user is federated.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Federated -
     * idcsCsvAttributeNameMappings: [[columnHeaderName:Federated]] - idcsSearchable: true -
     * multiValued: false - mutability: readWrite - idcsRequiresWriteForAccessFlows: true -
     * required: false - returned: default - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isFederatedUser")
    private final Boolean isFederatedUser;

    /**
     * A Boolean value indicating whether or not the user is federated.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Federated -
     * idcsCsvAttributeNameMappings: [[columnHeaderName:Federated]] - idcsSearchable: true -
     * multiValued: false - mutability: readWrite - idcsRequiresWriteForAccessFlows: true -
     * required: false - returned: default - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsFederatedUser() {
        return isFederatedUser;
    }

    /**
     * A Boolean value indicating whether or not authentication request by this user should be
     * delegated to a remote app. This value should be true only when the User was originally synced
     * from an app which is enabled for delegated authentication
     *
     * <p>*Added In:** 17.4.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: immutable - required: false - returned: never - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAuthenticationDelegated")
    private final Boolean isAuthenticationDelegated;

    /**
     * A Boolean value indicating whether or not authentication request by this user should be
     * delegated to a remote app. This value should be true only when the User was originally synced
     * from an app which is enabled for delegated authentication
     *
     * <p>*Added In:** 17.4.6
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: immutable - required: false - returned: never - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsAuthenticationDelegated() {
        return isAuthenticationDelegated;
    }

    /**
     * A supplemental status indicating the reason why a user is disabled
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: string - uniqueness: none
     */
    public enum Status implements com.oracle.bmc.http.internal.BmcEnum {
        PendingVerification("pendingVerification"),
        Verified("verified"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Status.class);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
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
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * A supplemental status indicating the reason why a user is disabled
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    private final Status status;

    /**
     * A supplemental status indicating the reason why a user is disabled
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: string - uniqueness: none
     *
     * @return the value
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Registration provider
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: false - returned: default - type: string - uniqueness: none
     */
    public enum Provider implements com.oracle.bmc.http.internal.BmcEnum {
        Facebook("facebook"),
        Google("google"),
        Idcs("IDCS"),
        Twitter("twitter"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Provider.class);

        private final String value;
        private static java.util.Map<String, Provider> map;

        static {
            map = new java.util.HashMap<>();
            for (Provider v : Provider.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Provider(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Provider create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Provider', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Registration provider
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("provider")
    private final Provider provider;

    /**
     * Registration provider
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: immutable - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public Provider getProvider() {
        return provider;
    }

    /**
     * User's preferred landing page following login, logout and reset password.
     *
     * <p>*Added In:** 2302092332
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    public enum PreferredUiLandingPage implements com.oracle.bmc.http.internal.BmcEnum {
        MyApps("MyApps"),
        MyProfile("MyProfile"),
        OciConsole("OciConsole"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(PreferredUiLandingPage.class);

        private final String value;
        private static java.util.Map<String, PreferredUiLandingPage> map;

        static {
            map = new java.util.HashMap<>();
            for (PreferredUiLandingPage v : PreferredUiLandingPage.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        PreferredUiLandingPage(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static PreferredUiLandingPage create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'PreferredUiLandingPage', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * User's preferred landing page following login, logout and reset password.
     *
     * <p>*Added In:** 2302092332
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("preferredUiLandingPage")
    private final PreferredUiLandingPage preferredUiLandingPage;

    /**
     * User's preferred landing page following login, logout and reset password.
     *
     * <p>*Added In:** 2302092332
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: string - uniqueness: none
     *
     * @return the value
     */
    public PreferredUiLandingPage getPreferredUiLandingPage() {
        return preferredUiLandingPage;
    }

    /**
     * User creation mechanism
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeNameMappings:
     * [[defaultValue:import]] - idcsSearchable: true - multiValued: false - mutability: immutable -
     * idcsRequiresWriteForAccessFlows: true - required: false - returned: request - type: string -
     * uniqueness: none
     */
    public enum CreationMechanism implements com.oracle.bmc.http.internal.BmcEnum {
        Bulk("bulk"),
        Api("api"),
        Adsync("adsync"),
        Idcsui("idcsui"),
        Import("import"),
        Authsync("authsync"),
        Selfreg("selfreg"),
        Samljit("samljit"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(CreationMechanism.class);

        private final String value;
        private static java.util.Map<String, CreationMechanism> map;

        static {
            map = new java.util.HashMap<>();
            for (CreationMechanism v : CreationMechanism.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        CreationMechanism(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CreationMechanism create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'CreationMechanism', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * User creation mechanism
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeNameMappings:
     * [[defaultValue:import]] - idcsSearchable: true - multiValued: false - mutability: immutable -
     * idcsRequiresWriteForAccessFlows: true - required: false - returned: request - type: string -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("creationMechanism")
    private final CreationMechanism creationMechanism;

    /**
     * User creation mechanism
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeNameMappings:
     * [[defaultValue:import]] - idcsSearchable: true - multiValued: false - mutability: immutable -
     * idcsRequiresWriteForAccessFlows: true - required: false - returned: request - type: string -
     * uniqueness: none
     *
     * @return the value
     */
    public CreationMechanism getCreationMechanism() {
        return creationMechanism;
    }

    /**
     * Specifies date time when a User's group membership was last modified.
     *
     * <p>*Added In:** 2304270343
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - returned: request - type: dateTime - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("groupMembershipLastModified")
    private final String groupMembershipLastModified;

    /**
     * Specifies date time when a User's group membership was last modified.
     *
     * <p>*Added In:** 2304270343
     *
     * <p>*SCIM++ Properties:** - caseExact: false - multiValued: false - mutability: readOnly -
     * required: false - returned: request - type: dateTime - uniqueness: none
     *
     * @return the value
     */
    public String getGroupMembershipLastModified() {
        return groupMembershipLastModified;
    }

    /**
     * A Boolean value indicating whether or not to hide the getting started page
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("doNotShowGettingStarted")
    private final Boolean doNotShowGettingStarted;

    /**
     * A Boolean value indicating whether or not to hide the getting started page
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: true - multiValued: false -
     * mutability: readWrite - required: false - returned: default - type: boolean - uniqueness:
     * none
     *
     * @return the value
     */
    public Boolean getDoNotShowGettingStarted() {
        return doNotShowGettingStarted;
    }

    /**
     * A Boolean value indicating whether or not to send email notification after creating the user.
     * This attribute is not used in update/replace operations.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeNameMappings:
     * [[columnHeaderName:ByPass Notification]] - idcsSearchable: false - multiValued: false -
     * mutability: immutable - idcsRequiresWriteForAccessFlows: true - required: false - returned:
     * never - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("bypassNotification")
    private final Boolean bypassNotification;

    /**
     * A Boolean value indicating whether or not to send email notification after creating the user.
     * This attribute is not used in update/replace operations.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeNameMappings:
     * [[columnHeaderName:ByPass Notification]] - idcsSearchable: false - multiValued: false -
     * mutability: immutable - idcsRequiresWriteForAccessFlows: true - required: false - returned:
     * never - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getBypassNotification() {
        return bypassNotification;
    }

    /**
     * A Boolean value indicating whether or not a user is enrolled for account recovery
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isAccountRecoveryEnrolled")
    private final Boolean isAccountRecoveryEnrolled;

    /**
     * A Boolean value indicating whether or not a user is enrolled for account recovery
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: readOnly - required: false - returned: request - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsAccountRecoveryEnrolled() {
        return isAccountRecoveryEnrolled;
    }

    /**
     * Boolean value to prompt user to setup account recovery during login.
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accountRecoveryRequired")
    private final Boolean accountRecoveryRequired;

    /**
     * Boolean value to prompt user to setup account recovery during login.
     *
     * <p>*Added In:** 19.1.4
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: false - multiValued: false - mutability: readWrite
     * - required: false - returned: request - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getAccountRecoveryRequired() {
        return accountRecoveryRequired;
    }

    /**
     * A Boolean value indicating whether to bypass notification and return user token to be used by
     * an external client to control the user flow.
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: immutable - required: false - returned: never - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("userFlowControlledByExternalClient")
    private final Boolean userFlowControlledByExternalClient;

    /**
     * A Boolean value indicating whether to bypass notification and return user token to be used by
     * an external client to control the user flow.
     *
     * <p>*Added In:** 18.4.2
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: immutable - required: false - returned: never - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getUserFlowControlledByExternalClient() {
        return userFlowControlledByExternalClient;
    }

    /**
     * A Boolean value indicating whether or not group membership is normalized for this user.
     *
     * <p>*Deprecated Since: 19.3.3**
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: immutable - required: false - returned: never - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isGroupMembershipNormalized")
    private final Boolean isGroupMembershipNormalized;

    /**
     * A Boolean value indicating whether or not group membership is normalized for this user.
     *
     * <p>*Deprecated Since: 19.3.3**
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: immutable - required: false - returned: never - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsGroupMembershipNormalized() {
        return isGroupMembershipNormalized;
    }

    /**
     * A Boolean value Indicates whether this User's group membership has been sync'ed from
     * Group.members to UsersGroups.
     *
     * <p>*Added In:** 19.3.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: immutable - required: false - returned: never - type: boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isGroupMembershipSyncedToUsersGroups")
    private final Boolean isGroupMembershipSyncedToUsersGroups;

    /**
     * A Boolean value Indicates whether this User's group membership has been sync'ed from
     * Group.members to UsersGroups.
     *
     * <p>*Added In:** 19.3.3
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: immutable - required: false - returned: never - type: boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getIsGroupMembershipSyncedToUsersGroups() {
        return isGroupMembershipSyncedToUsersGroups;
    }

    /**
     * Specifies the EmailTemplate to be used when sending notification to the user this request is
     * for. If specified, it overrides the default EmailTemplate for this event.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: writeOnly - required: false - returned: never - type: string - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("notificationEmailTemplateId")
    private final String notificationEmailTemplateId;

    /**
     * Specifies the EmailTemplate to be used when sending notification to the user this request is
     * for. If specified, it overrides the default EmailTemplate for this event.
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsSearchable: false - multiValued: false -
     * mutability: writeOnly - required: false - returned: never - type: string - uniqueness: none
     *
     * @return the value
     */
    public String getNotificationEmailTemplateId() {
        return notificationEmailTemplateId;
    }

    /**
     * Indicates if User is a Service User
     *
     * <p>*Added In:** 2306131901
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Service User -
     * idcsCsvAttributeNameMappings: [[columnHeaderName:Service User]] - idcsSearchable: true -
     * multiValued: false - mutability: immutable - required: false - returned: default - type:
     * boolean - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("serviceUser")
    private final Boolean serviceUser;

    /**
     * Indicates if User is a Service User
     *
     * <p>*Added In:** 2306131901
     *
     * <p>*SCIM++ Properties:** - caseExact: false - idcsCsvAttributeName: Service User -
     * idcsCsvAttributeNameMappings: [[columnHeaderName:Service User]] - idcsSearchable: true -
     * multiValued: false - mutability: immutable - required: false - returned: default - type:
     * boolean - uniqueness: none
     *
     * @return the value
     */
    public Boolean getServiceUser() {
        return serviceUser;
    }

    /**
     * A list of Support Accounts corresponding to user.
     *
     * <p>*Added In:** 2103141444
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readOnly - required: false - returned: request - type: complex -
     * uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supportAccounts")
    private final java.util.List<UserExtSupportAccounts> supportAccounts;

    /**
     * A list of Support Accounts corresponding to user.
     *
     * <p>*Added In:** 2103141444
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - idcsSearchable: true - multiValued:
     * true - mutability: readOnly - required: false - returned: request - type: complex -
     * uniqueness: none
     *
     * @return the value
     */
    public java.util.List<UserExtSupportAccounts> getSupportAccounts() {
        return supportAccounts;
    }

    /**
     * Description:
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value, idcsAppRoleId] - idcsSearchable: true -
     * multiValued: true - mutability: readOnly - required: false - returned: request - type:
     * complex
     */
    @com.fasterxml.jackson.annotation.JsonProperty("idcsAppRolesLimitedToGroups")
    private final java.util.List<UserExtIdcsAppRolesLimitedToGroups> idcsAppRolesLimitedToGroups;

    /**
     * Description:
     *
     * <p>*Added In:** 19.2.1
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value, idcsAppRoleId] - idcsSearchable: true -
     * multiValued: true - mutability: readOnly - required: false - returned: request - type:
     * complex
     *
     * @return the value
     */
    public java.util.List<UserExtIdcsAppRolesLimitedToGroups> getIdcsAppRolesLimitedToGroups() {
        return idcsAppRolesLimitedToGroups;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("userToken")
    private final UserExtUserToken userToken;

    public UserExtUserToken getUserToken() {
        return userToken;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("syncedFromApp")
    private final UserExtSyncedFromApp syncedFromApp;

    public UserExtSyncedFromApp getSyncedFromApp() {
        return syncedFromApp;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("applicableAuthenticationTargetApp")
    private final UserExtApplicableAuthenticationTargetApp applicableAuthenticationTargetApp;

    public UserExtApplicableAuthenticationTargetApp getApplicableAuthenticationTargetApp() {
        return applicableAuthenticationTargetApp;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("delegatedAuthenticationTargetApp")
    private final UserExtDelegatedAuthenticationTargetApp delegatedAuthenticationTargetApp;

    public UserExtDelegatedAuthenticationTargetApp getDelegatedAuthenticationTargetApp() {
        return delegatedAuthenticationTargetApp;
    }

    /**
     * Accounts assigned to this User. Each value of this attribute refers to an app-specific
     * identity that is owned by this User. Therefore, this attribute is a convenience that allows
     * one to see on each User the Apps to which that User has access.
     *
     * <p>*SCIM++ Properties:** - idcsPii: true - idcsSearchable: true - multiValued: true -
     * mutability: readOnly - required: false - returned: request - type: complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accounts")
    private final java.util.List<UserExtAccounts> accounts;

    /**
     * Accounts assigned to this User. Each value of this attribute refers to an app-specific
     * identity that is owned by this User. Therefore, this attribute is a convenience that allows
     * one to see on each User the Apps to which that User has access.
     *
     * <p>*SCIM++ Properties:** - idcsPii: true - idcsSearchable: true - multiValued: true -
     * mutability: readOnly - required: false - returned: request - type: complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<UserExtAccounts> getAccounts() {
        return accounts;
    }

    /**
     * Grants to this User. Each value of this attribute refers to a Grant to this User of some App
     * (and optionally of some entitlement). Therefore, this attribute is a convenience that allows
     * one to see on each User all of the Grants to that User.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: true - mutability: readOnly -
     * required: false - returned: request - type: complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("grants")
    private final java.util.List<UserExtGrants> grants;

    /**
     * Grants to this User. Each value of this attribute refers to a Grant to this User of some App
     * (and optionally of some entitlement). Therefore, this attribute is a convenience that allows
     * one to see on each User all of the Grants to that User.
     *
     * <p>*SCIM++ Properties:** - idcsSearchable: true - multiValued: true - mutability: readOnly -
     * required: false - returned: request - type: complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<UserExtGrants> getGrants() {
        return grants;
    }

    /**
     * A list of all AppRoles to which this User belongs directly, indirectly or implicitly. The
     * User could belong directly because the User is a member of the AppRole, could belong
     * indirectly because the User is a member of a Group that is a member of the AppRole, or could
     * belong implicitly because the AppRole is public.
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - multiValued: true - mutability:
     * readOnly - required: false - returned: request - type: complex - uniqueness: none
     */
    @com.fasterxml.jackson.annotation.JsonProperty("appRoles")
    private final java.util.List<UserExtAppRoles> appRoles;

    /**
     * A list of all AppRoles to which this User belongs directly, indirectly or implicitly. The
     * User could belong directly because the User is a member of the AppRole, could belong
     * indirectly because the User is a member of a Group that is a member of the AppRole, or could
     * belong implicitly because the AppRole is public.
     *
     * <p>*SCIM++ Properties:** - idcsCompositeKey: [value] - multiValued: true - mutability:
     * readOnly - required: false - returned: request - type: complex - uniqueness: none
     *
     * @return the value
     */
    public java.util.List<UserExtAppRoles> getAppRoles() {
        return appRoles;
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
        sb.append("ExtensionUserUser(");
        sb.append("super=").append(super.toString());
        sb.append("isFederatedUser=").append(String.valueOf(this.isFederatedUser));
        sb.append(", isAuthenticationDelegated=")
                .append(String.valueOf(this.isAuthenticationDelegated));
        sb.append(", status=").append(String.valueOf(this.status));
        sb.append(", provider=").append(String.valueOf(this.provider));
        sb.append(", preferredUiLandingPage=").append(String.valueOf(this.preferredUiLandingPage));
        sb.append(", creationMechanism=").append(String.valueOf(this.creationMechanism));
        sb.append(", groupMembershipLastModified=")
                .append(String.valueOf(this.groupMembershipLastModified));
        sb.append(", doNotShowGettingStarted=")
                .append(String.valueOf(this.doNotShowGettingStarted));
        sb.append(", bypassNotification=").append(String.valueOf(this.bypassNotification));
        sb.append(", isAccountRecoveryEnrolled=")
                .append(String.valueOf(this.isAccountRecoveryEnrolled));
        sb.append(", accountRecoveryRequired=")
                .append(String.valueOf(this.accountRecoveryRequired));
        sb.append(", userFlowControlledByExternalClient=")
                .append(String.valueOf(this.userFlowControlledByExternalClient));
        sb.append(", isGroupMembershipNormalized=")
                .append(String.valueOf(this.isGroupMembershipNormalized));
        sb.append(", isGroupMembershipSyncedToUsersGroups=")
                .append(String.valueOf(this.isGroupMembershipSyncedToUsersGroups));
        sb.append(", notificationEmailTemplateId=")
                .append(String.valueOf(this.notificationEmailTemplateId));
        sb.append(", serviceUser=").append(String.valueOf(this.serviceUser));
        sb.append(", supportAccounts=").append(String.valueOf(this.supportAccounts));
        sb.append(", idcsAppRolesLimitedToGroups=")
                .append(String.valueOf(this.idcsAppRolesLimitedToGroups));
        sb.append(", userToken=").append(String.valueOf(this.userToken));
        sb.append(", syncedFromApp=").append(String.valueOf(this.syncedFromApp));
        sb.append(", applicableAuthenticationTargetApp=")
                .append(String.valueOf(this.applicableAuthenticationTargetApp));
        sb.append(", delegatedAuthenticationTargetApp=")
                .append(String.valueOf(this.delegatedAuthenticationTargetApp));
        sb.append(", accounts=").append(String.valueOf(this.accounts));
        sb.append(", grants=").append(String.valueOf(this.grants));
        sb.append(", appRoles=").append(String.valueOf(this.appRoles));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtensionUserUser)) {
            return false;
        }

        ExtensionUserUser other = (ExtensionUserUser) o;
        return java.util.Objects.equals(this.isFederatedUser, other.isFederatedUser)
                && java.util.Objects.equals(
                        this.isAuthenticationDelegated, other.isAuthenticationDelegated)
                && java.util.Objects.equals(this.status, other.status)
                && java.util.Objects.equals(this.provider, other.provider)
                && java.util.Objects.equals(
                        this.preferredUiLandingPage, other.preferredUiLandingPage)
                && java.util.Objects.equals(this.creationMechanism, other.creationMechanism)
                && java.util.Objects.equals(
                        this.groupMembershipLastModified, other.groupMembershipLastModified)
                && java.util.Objects.equals(
                        this.doNotShowGettingStarted, other.doNotShowGettingStarted)
                && java.util.Objects.equals(this.bypassNotification, other.bypassNotification)
                && java.util.Objects.equals(
                        this.isAccountRecoveryEnrolled, other.isAccountRecoveryEnrolled)
                && java.util.Objects.equals(
                        this.accountRecoveryRequired, other.accountRecoveryRequired)
                && java.util.Objects.equals(
                        this.userFlowControlledByExternalClient,
                        other.userFlowControlledByExternalClient)
                && java.util.Objects.equals(
                        this.isGroupMembershipNormalized, other.isGroupMembershipNormalized)
                && java.util.Objects.equals(
                        this.isGroupMembershipSyncedToUsersGroups,
                        other.isGroupMembershipSyncedToUsersGroups)
                && java.util.Objects.equals(
                        this.notificationEmailTemplateId, other.notificationEmailTemplateId)
                && java.util.Objects.equals(this.serviceUser, other.serviceUser)
                && java.util.Objects.equals(this.supportAccounts, other.supportAccounts)
                && java.util.Objects.equals(
                        this.idcsAppRolesLimitedToGroups, other.idcsAppRolesLimitedToGroups)
                && java.util.Objects.equals(this.userToken, other.userToken)
                && java.util.Objects.equals(this.syncedFromApp, other.syncedFromApp)
                && java.util.Objects.equals(
                        this.applicableAuthenticationTargetApp,
                        other.applicableAuthenticationTargetApp)
                && java.util.Objects.equals(
                        this.delegatedAuthenticationTargetApp,
                        other.delegatedAuthenticationTargetApp)
                && java.util.Objects.equals(this.accounts, other.accounts)
                && java.util.Objects.equals(this.grants, other.grants)
                && java.util.Objects.equals(this.appRoles, other.appRoles)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isFederatedUser == null ? 43 : this.isFederatedUser.hashCode());
        result =
                (result * PRIME)
                        + (this.isAuthenticationDelegated == null
                                ? 43
                                : this.isAuthenticationDelegated.hashCode());
        result = (result * PRIME) + (this.status == null ? 43 : this.status.hashCode());
        result = (result * PRIME) + (this.provider == null ? 43 : this.provider.hashCode());
        result =
                (result * PRIME)
                        + (this.preferredUiLandingPage == null
                                ? 43
                                : this.preferredUiLandingPage.hashCode());
        result =
                (result * PRIME)
                        + (this.creationMechanism == null ? 43 : this.creationMechanism.hashCode());
        result =
                (result * PRIME)
                        + (this.groupMembershipLastModified == null
                                ? 43
                                : this.groupMembershipLastModified.hashCode());
        result =
                (result * PRIME)
                        + (this.doNotShowGettingStarted == null
                                ? 43
                                : this.doNotShowGettingStarted.hashCode());
        result =
                (result * PRIME)
                        + (this.bypassNotification == null
                                ? 43
                                : this.bypassNotification.hashCode());
        result =
                (result * PRIME)
                        + (this.isAccountRecoveryEnrolled == null
                                ? 43
                                : this.isAccountRecoveryEnrolled.hashCode());
        result =
                (result * PRIME)
                        + (this.accountRecoveryRequired == null
                                ? 43
                                : this.accountRecoveryRequired.hashCode());
        result =
                (result * PRIME)
                        + (this.userFlowControlledByExternalClient == null
                                ? 43
                                : this.userFlowControlledByExternalClient.hashCode());
        result =
                (result * PRIME)
                        + (this.isGroupMembershipNormalized == null
                                ? 43
                                : this.isGroupMembershipNormalized.hashCode());
        result =
                (result * PRIME)
                        + (this.isGroupMembershipSyncedToUsersGroups == null
                                ? 43
                                : this.isGroupMembershipSyncedToUsersGroups.hashCode());
        result =
                (result * PRIME)
                        + (this.notificationEmailTemplateId == null
                                ? 43
                                : this.notificationEmailTemplateId.hashCode());
        result = (result * PRIME) + (this.serviceUser == null ? 43 : this.serviceUser.hashCode());
        result =
                (result * PRIME)
                        + (this.supportAccounts == null ? 43 : this.supportAccounts.hashCode());
        result =
                (result * PRIME)
                        + (this.idcsAppRolesLimitedToGroups == null
                                ? 43
                                : this.idcsAppRolesLimitedToGroups.hashCode());
        result = (result * PRIME) + (this.userToken == null ? 43 : this.userToken.hashCode());
        result =
                (result * PRIME)
                        + (this.syncedFromApp == null ? 43 : this.syncedFromApp.hashCode());
        result =
                (result * PRIME)
                        + (this.applicableAuthenticationTargetApp == null
                                ? 43
                                : this.applicableAuthenticationTargetApp.hashCode());
        result =
                (result * PRIME)
                        + (this.delegatedAuthenticationTargetApp == null
                                ? 43
                                : this.delegatedAuthenticationTargetApp.hashCode());
        result = (result * PRIME) + (this.accounts == null ? 43 : this.accounts.hashCode());
        result = (result * PRIME) + (this.grants == null ? 43 : this.grants.hashCode());
        result = (result * PRIME) + (this.appRoles == null ? 43 : this.appRoles.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
